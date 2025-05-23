/*
 * Copyright 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.ui.platform.a11y

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.node.Nodes
import androidx.compose.ui.node.requireCoordinator
import androidx.compose.ui.semantics.AccessibilityAction
import androidx.compose.ui.semantics.ProgressBarRangeInfo
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.semantics.SemanticsConfiguration
import androidx.compose.ui.semantics.SemanticsNode
import androidx.compose.ui.semantics.SemanticsProperties
import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.getOrNull
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import java.awt.Color
import java.awt.Cursor
import java.awt.Dimension
import java.awt.Font
import java.awt.FontMetrics
import java.awt.Point
import java.awt.Rectangle
import java.awt.event.FocusListener
import java.util.Locale
import javax.accessibility.Accessible
import javax.accessibility.AccessibleAction
import javax.accessibility.AccessibleComponent
import javax.accessibility.AccessibleContext
import javax.accessibility.AccessibleEditableText
import javax.accessibility.AccessibleExtendedText
import javax.accessibility.AccessibleRelation
import javax.accessibility.AccessibleRole
import javax.accessibility.AccessibleState
import javax.accessibility.AccessibleStateSet
import javax.accessibility.AccessibleText
import javax.accessibility.AccessibleTextSequence
import javax.accessibility.AccessibleValue
import javax.swing.text.AttributeSet
import kotlin.math.roundToInt
import org.jetbrains.skia.BreakIterator
import javax.swing.text.SimpleAttributeSet
import kotlinx.atomicfu.atomic
import org.jetbrains.skiko.nativeInitializeAccessible

private fun <T> SemanticsConfiguration.getFirstOrNull(key: SemanticsPropertyKey<List<T>>): T? {
    return getOrNull(key)?.firstOrNull()
}

private typealias ActionKey = SemanticsPropertyKey<AccessibilityAction<() -> Boolean>>

/**
 * An adapter for SemanticNode for AWT accessibility
 */
internal class ComposeAccessible(
    semanticsNode: SemanticsNode,
    private val controller: AccessibilityController
) : Accessible,
    // Must be a subclass of java.awt.Component because CAccessible only registers property
    // listeners with the accessible context if the Accessible is an instance of java.awt.Component
    // (see constructor of sun.lwawt.macosx.CAccessible), even though there's no reason for it.
    // The property change listener is what allows us to update CAccessible when some value changes.
    java.awt.Component()
{

    /**
     * The semantics node this [ComposeAccessible] represents.
     */
    var semanticsNode: SemanticsNode = semanticsNode
        set(value) {
            field = value
            cachedSemanticsConfig = null  // Clear the cache
        }

    /**
     * The cached [SemanticsNode.config] of [semanticsNode]; `null` if it hasn't been retrieved yet.
     */
    private var cachedSemanticsConfig: SemanticsConfiguration? = null

    /**
     * The [SemanticsNode.config] of [semanticsNode].
     */
    private val semanticsConfig: SemanticsConfiguration
        get() {
            return cachedSemanticsConfig ?: semanticsNode.config.also {
                cachedSemanticsConfig = it
            }
        }

    private val isNativelyInitialized = atomic(false)

    val composeAccessibleContext: ComposeAccessibleComponent by lazy { ComposeAccessibleComponent() }

    var removed = false

    override fun getAccessibleContext(): AccessibleContext? {
        if (removed) {
            // The accessibility system keeps calling functions on the context even after the node
            // has been removed. We return null so it doesn't do that.
            return null
        }

        // see doc for [nativeInitializeAccessible] for details, why this initialization is needed
        if (isNativelyInitialized.compareAndSet(expect = false, update = true)) {
            nativeInitializeAccessible(this)
        }
        return composeAccessibleContext
    }

    open inner class ComposeAccessibleComponent : AccessibleContext(), AccessibleComponent, AccessibleAction {
        val textSelectionRange
            get() = semanticsConfig.getOrNull(SemanticsProperties.TextSelectionRange)
        val setText
            get() = semanticsConfig.getOrNull(SemanticsActions.SetText)
        val setSelection
            get() = semanticsConfig.getOrNull(SemanticsActions.SetSelection)
        val text
            // TODO should we concatenate the texts instead of getting only the first one
            // Concatenation seems to be reasonable eg, for button with two text nodes inside
            // but conflicts with setText action
            get() = semanticsConfig.getOrNull(SemanticsProperties.EditableText)
                ?: semanticsConfig.getFirstOrNull(SemanticsProperties.Text)

        val textLayoutResult: TextLayoutResult?
            get() {
                val textLayoutResults = mutableListOf<TextLayoutResult>()
                val getLayoutResult = semanticsConfig
                    .getOrNull(SemanticsActions.GetTextLayoutResult)
                    ?.action?.invoke(textLayoutResults)
                return if (getLayoutResult == true) {
                    textLayoutResults[0]
                } else {
                    null
                }
            }

        val focused
            get() = semanticsConfig.getOrNull(SemanticsProperties.Focused)

        val selected
            get() = semanticsConfig.getOrNull(SemanticsProperties.Selected)

        private val density: Density
            get() = controller.desktopComponent.density

        val horizontalScroll
            get() = semanticsConfig.getOrNull(SemanticsProperties.HorizontalScrollAxisRange)

        val verticalScroll
            get() = semanticsConfig.getOrNull(SemanticsProperties.VerticalScrollAxisRange)

        val scrollBy
            get() = semanticsConfig.getOrNull(SemanticsActions.ScrollBy)

        val isPassword
            get() = semanticsConfig.getOrNull(SemanticsProperties.Password) != null

        val toggleableState
            get() = semanticsConfig.getOrNull(SemanticsProperties.ToggleableState)

        val auxiliaryChildren
            get() = buildList {
                horizontalScroll?.let {
                    add(makeScrollbarChild(false))
                }
                verticalScroll?.let {
                    add(makeScrollbarChild(true))
                }
            }

        val progressBarRangeInfo
            get() = semanticsConfig.getOrNull(SemanticsProperties.ProgressBarRangeInfo)

        val isContainer
            @Suppress("DEPRECATION")
            get() = semanticsConfig.getOrNull(SemanticsProperties.IsContainer)

        val isTraversalGroup
            get() = semanticsConfig.getOrNull(SemanticsProperties.IsTraversalGroup)

        private fun makeScrollbarChild(
            vertical: Boolean
        ): Accessible {
            val bar = ScrollBarAccessible(vertical)

            val controlledBy = AccessibleRelation(
                AccessibleRelation.CONTROLLED_BY,
                bar
            )
            val controllerFor = AccessibleRelation(
                AccessibleRelation.CONTROLLER_FOR,
                this@ComposeAccessible
            )
            bar.context.accessibleRelationSet.add(controllerFor)
            accessibleRelationSet.add(controlledBy)
            return bar
        }

        private fun Point.toComposeOffset() = with(density) {
            Offset(x.dp.toPx(), y.dp.toPx())
        }

        private fun Dp.toAwtPx() =
            if (value.isInfinite()) Constraints.Infinity else value.roundToInt()

        private fun Rect.toAwtRectangle() = with(density) {
            Rectangle(
                left.toDp().toAwtPx(),
                top.toDp().toAwtPx(),
                width.toDp().toAwtPx(),
                height.toDp().toAwtPx(),
            )
        }

        private fun Offset.toAwtPoint() = with(density) {
            Point(
                x.toDp().toAwtPx(),
                y.toDp().toAwtPx(),
            )
        }

        private fun IntSize.toAwtDimension() = with(density) {
            Dimension(
                width.toDp().toAwtPx(),
                height.toDp().toAwtPx(),
            )
        }

        override fun getAccessibleName(): String? {
            return text?.toString()
        }

        override fun getAccessibleDescription(): String? {
            // TODO concatenate values?
            return semanticsConfig
                .getFirstOrNull(SemanticsProperties.ContentDescription)
        }

        override fun getAccessibleParent(): Accessible? {
            return semanticsNode.parent?.id?.let { id ->
                controller.accessibleByNodeId(id)!!
            } ?: accessibleParent
        }

        override fun getAccessibleComponent(): AccessibleComponent? {
            return this
        }

        // we have to store a reference to AccessibleAction, because AWT itself uses weak
        // references and GC could delete an object which is, in fact, in use
        private var accessibleAction: AccessibleAction? = null

        override fun getAccessibleAction(): AccessibleAction? {
            val actions = mutableListOf<Pair<String?, ActionKey>>()

            fun addActionIfExist(key: SemanticsPropertyKey<AccessibilityAction<() -> Boolean>>) {
                semanticsConfig.getOrNull(key)?.let {
                    actions.add(Pair(it.label, key))
                }
            }
            semanticsConfig.getOrNull(SemanticsActions.OnClick)?.let {
                // AWT expects "click" label for click actions, at least on macOS...
                actions.add(Pair("click", SemanticsActions.OnClick))
            }

            addActionIfExist(SemanticsActions.OnLongClick)
            addActionIfExist(SemanticsActions.Expand)
            addActionIfExist(SemanticsActions.Collapse)
            addActionIfExist(SemanticsActions.Dismiss)

            if (actions.isEmpty()) {
                return null
            }
            accessibleAction = object : AccessibleAction {
                override fun getAccessibleActionCount(): Int = actions.size

                override fun getAccessibleActionDescription(i: Int): String? {
                    val (label, _) = actions[i]
                    return label
                }

                override fun doAccessibleAction(i: Int): Boolean {
                    val (_, actionKey) = actions[i]
                    return semanticsConfig.getOrNull(actionKey)?.let {
                        it.action?.invoke()
                    } ?: false
                }
            }
            return accessibleAction
        }

        override fun getAccessibleValue(): AccessibleValue? {
            return when {
                toggleableState != null -> ToggleableAccessibleValue(this)
                progressBarRangeInfo != null -> ProgressBarAccessibleValue(this)
                else -> null
            }
        }

        override fun getAccessibleIndexInParent(): Int {
            val parentChildren = semanticsNode.parent?.replacedChildren
            return parentChildren?.indexOfFirst { it.id == semanticsNode.id } ?: -1
        }

        override fun getAccessibleChildrenCount(): Int {
            return semanticsNode.replacedChildren.size + auxiliaryChildren.size
        }

        override fun getAccessibleChild(i: Int): Accessible? {
            val replacedChildren = semanticsNode.replacedChildren
            val replacedChildrenSize = replacedChildren.size
            return if (i < replacedChildrenSize) {
                controller.accessibleByNodeId(replacedChildren[i].id)
            } else {
                auxiliaryChildren[i - replacedChildrenSize]
            }
        }

        override fun getLocale(): Locale = Locale.getDefault()

        override fun getLocationOnScreen(): Point {
            return semanticsNode.positionOnScreen.toAwtPoint()
        }

        override fun getLocation(): Point {
            return semanticsNode.positionInRoot.toAwtPoint()
        }

        override fun getBounds(): Rectangle {
            return semanticsNode.boundsInRoot.toAwtRectangle()
        }

        override fun getSize(): Dimension {
            return semanticsNode.size.toAwtDimension()
        }

        @OptIn(ExperimentalComposeUiApi::class)
        override fun isVisible(): Boolean =
            !semanticsConfig.contains(SemanticsProperties.InvisibleToUser) &&
            !semanticsNode.outerSemanticsNode.requireCoordinator(Nodes.Semantics).isTransparent()

        override fun isEnabled(): Boolean =
            semanticsConfig.getOrNull(SemanticsProperties.Disabled) == null

        // TODO check actual visibility
        override fun isShowing(): Boolean = true

        override fun contains(p: Point): Boolean {
            return bounds.contains(p)
        }

        override fun getAccessibleAt(p: Point): Accessible? {
            for (i in 0 until accessibleChildrenCount) {
                val child = (getAccessibleChild(i)?.accessibleContext as? AccessibleComponent)
                child?.getAccessibleAt(p)?.let {
                    return it
                }
            }
            if (contains(p)) {
                return this@ComposeAccessible
            }

            return null
        }

        override fun isFocusTraversable(): Boolean {
            return focused != null
        }

        override fun requestFocus() {
            if (focused == false) {
                semanticsNode.unmergedConfig.getOrNull(SemanticsActions.RequestFocus)
                    ?.action?.invoke()
            }
        }

        override fun addFocusListener(l: FocusListener?) {
            println("Not implemented: addFocusListener")
            TODO("Not yet implemented")
        }

        override fun removeFocusListener(l: FocusListener?) {
            println("Not implemented: removeFocusListener")
            TODO("Not yet implemented")
        }

        // -----------------------------------

        override fun getAccessibleRole(): AccessibleRole {
            AccessibilityController.AccessibilityUsage.notifyInUse()
            val fromSemanticRole = when (semanticsConfig.getOrNull(SemanticsProperties.Role)) {
                Role.Button -> AccessibleRole.PUSH_BUTTON
                Role.Checkbox -> AccessibleRole.CHECK_BOX
                Role.RadioButton -> AccessibleRole.RADIO_BUTTON
                Role.Tab -> AccessibleRole.PAGE_TAB
                Role.DropdownList -> AccessibleRole.COMBO_BOX
                else -> null
                // ?
                //  Role.Switch ->
                //  Role.Image ->
            }

            return when {
                fromSemanticRole != null -> fromSemanticRole
                isPassword -> AccessibleRole.PASSWORD_TEXT
                scrollBy != null -> AccessibleRole.SCROLL_PANE
                setText != null -> AccessibleRole.TEXT
                text != null -> AccessibleRole.LABEL
                progressBarRangeInfo != null -> AccessibleRole.PROGRESS_BAR
                isContainer != null -> AccessibleRole.GROUP_BOX
                isTraversalGroup != null -> AccessibleRole.GROUP_BOX
                else -> AccessibleRole.UNKNOWN
            }
        }

        override fun getAccessibleStateSet(): AccessibleStateSet {
            return AccessibleStateSet().apply {
                // can we support these
                // AccessibleState.SINGLE_LINE
                // AccessibleState.MULTI_LINE

                if (isEnabled)
                    add(AccessibleState.ENABLED)
                if (isShowing)
                    add(AccessibleState.SHOWING)
                if (isVisible)
                    add(AccessibleState.VISIBLE)
                if (isFocusTraversable)
                    add(AccessibleState.FOCUSABLE)
                if (focused == true)
                    add(AccessibleState.FOCUSED)

                when (toggleableState) {
                    ToggleableState.On ->
                        add(AccessibleState.CHECKED)
                    ToggleableState.Indeterminate ->
                        add(AccessibleState.INDETERMINATE)
                    ToggleableState.Off, null -> {
                    }
                }

                val canExpand = semanticsConfig.getOrNull(SemanticsActions.Expand) != null
                val canCollapse = semanticsConfig.getOrNull(SemanticsActions.Collapse) != null

                if (canExpand || canCollapse)
                    add(AccessibleState.EXPANDABLE)

                if (canExpand)
                    add(AccessibleState.COLLAPSED)

                if (canCollapse)
                    add(AccessibleState.EXPANDED)

                if (canCollapse)
                    add(AccessibleState.EXPANDED)

                if (selected != null)
                    add(AccessibleState.SELECTABLE)

                if (selected == true)
                    add(AccessibleState.SELECTED)
            }
        }

        open inner class ComposeAccessibleText : AccessibleText,
            AccessibleExtendedText {
            override fun getIndexAtPoint(p: Point): Int {
                return textLayoutResult!!.getOffsetForPosition(p.toComposeOffset())
            }

            override fun getCharacterBounds(i: Int): Rectangle {
                if (i < 0 || i >= text!!.length) {
                    return Rectangle(
                        (location.x / density.density).toInt(),
                        (location.y / density.density).toInt(),
                        0,
                        0
                    )
                }
                return textLayoutResult!!.getBoundingBox(i).toAwtRectangle()
            }

            override fun getCharCount(): Int {
                return text!!.length
            }

            override fun getCaretPosition(): Int {
                return textSelectionRange?.start ?: -1
            }

            private fun partToBreakIterator(part: Int): BreakIterator {
                val iter = when (part) {
                    AccessibleText.SENTENCE -> BreakIterator.makeSentenceInstance()
                    AccessibleText.WORD -> BreakIterator.makeWordInstance()
                    AccessibleText.CHARACTER -> BreakIterator.makeCharacterInstance()
                    else -> throw IllegalArgumentException()
                }
                iter.setText(text!!.toString())
                return iter
            }

            override fun getAtIndex(part: Int, index: Int): String {
                return when (val end = partToBreakIterator(part).following(index)) {
                    BreakIterator.DONE -> ""
                    else -> text!!.subSequence(index, end).toString()
                }
            }

            override fun getAfterIndex(part: Int, index: Int): String {
                val iterator = partToBreakIterator(part)
                var start = index
                do {
                    start = iterator.following(start)
                    if (start == BreakIterator.DONE) return ""
                } while (text!![start] == ' ' || text!![start] == '\n')
                val end = when (val end = iterator.next()) {
                    BreakIterator.DONE -> iterator.last()
                    else -> end
                }
                return text!!.subSequence(start, end).toString()
            }

            override fun getBeforeIndex(part: Int, index: Int): String {
                return when (val start = partToBreakIterator(part).preceding(index)) {
                    BreakIterator.DONE -> ""
                    else -> text!!.subSequence(start, index).toString()
                }
            }

            override fun getCharacterAttribute(i: Int): AttributeSet {
                println("Not implemented: getCharacterAttribute")
                // TODO("Not yet implemented")
                return SimpleAttributeSet()
            }

            override fun getSelectionStart(): Int {
                return textSelectionRange?.start ?: 0
            }

            override fun getSelectionEnd(): Int {
                return textSelectionRange?.end ?: 0
            }

            override fun getSelectedText(): String {
                return textSelectionRange?.let { selection ->
                    // could be end less than start here?
                    text!!.subSequence(selection.start, selection.end).toString()
                } ?: ""
            }

            override fun getTextRange(startIndex: Int, endIndex: Int): String {
                return text!!.subSequence(startIndex, endIndex).toString()
            }

            override fun getTextSequenceAt(part: Int, index: Int): AccessibleTextSequence {
                println("Not implemented: getBeforeIndex")
                TODO("Not yet implemented")
            }

            override fun getTextSequenceAfter(part: Int, index: Int): AccessibleTextSequence {
                println("Not implemented: getTextSequenceAfter")
                TODO("Not yet implemented")
            }

            override fun getTextSequenceBefore(part: Int, index: Int): AccessibleTextSequence {
                println("Not implemented: getTextSequenceBefore")
                TODO("Not yet implemented")
            }

            override fun getTextBounds(startIndex: Int, endIndex: Int): Rectangle {
                println("Not implemented: getTextBounds")
                TODO("Not yet implemented")
            }
        }

        inner class ScrollBarAccessible(
            val vertical: Boolean
        ) : Accessible {
            val context: AccessibleContext = object : AccessibleContext(),
                AccessibleValue {
                private val range = if (vertical) {
                    verticalScroll!!
                } else {
                    horizontalScroll!!
                }

                override fun getAccessibleValue(): AccessibleValue = this

                override fun getAccessibleRole(): AccessibleRole =
                    AccessibleRole.SCROLL_BAR

                override fun getAccessibleStateSet(): AccessibleStateSet {
                    return AccessibleStateSet().apply {
                        add(AccessibleState.ENABLED)
                        if (vertical) {
                            add(AccessibleState.VERTICAL)
                        } else {
                            add(AccessibleState.HORIZONTAL)
                        }
                    }
                }

                override fun getAccessibleParent(): Accessible {
                    return this@ComposeAccessible
                }

                override fun getAccessibleIndexInParent(): Int {
                    return auxiliaryChildren.indexOf(this@ScrollBarAccessible)
                }

                override fun getAccessibleChildrenCount(): Int = 0

                override fun getAccessibleChild(i: Int): Accessible? = null
                override fun getLocale(): Locale {
                    return Locale.getDefault()
                }

                override fun getCurrentAccessibleValue(): Number = range.value()

                override fun setCurrentAccessibleValue(n: Number?): Boolean {
                    return if (vertical) {
                        scrollBy!!.action!!.invoke(0f, n!!.toFloat() - range.value())
                    } else {
                        scrollBy!!.action!!.invoke(n!!.toFloat() - range.value(), 0f)
                    }
                }

                override fun getMinimumAccessibleValue(): Number = 0

                override fun getMaximumAccessibleValue(): Number = range.maxValue()
            }

            override fun getAccessibleContext(): AccessibleContext = context
        }

        private val accessibleText by lazy {
            when {
                setText != null -> {
                    ComposeAccessibleEditableText()
                }
                text != null -> {
                    ComposeAccessibleText()
                }
                else -> {
                    null
                }
            }
        }

        override fun getAccessibleText(): AccessibleText? {
            return accessibleText
        }

        inner class ComposeAccessibleEditableText :
            ComposeAccessibleText(), AccessibleEditableText {
            override fun setTextContents(s: String) {
                setText!!.action!!.invoke(AnnotatedString(s))
            }

            override fun insertTextAtIndex(index: Int, s: String) {
                val text = text!!
                setText!!.action!!.invoke(
                    buildAnnotatedString {
                        append(text.subSequence(0, index))
                        append(s)
                        append(text.subSequence(index, text.length - 1))
                    }
                )
            }

            override fun getTextRange(startIndex: Int, endIndex: Int): String {
                return text!!.substring(startIndex, endIndex)
            }

            override fun delete(startIndex: Int, endIndex: Int) {
                val text = text!!
                setText!!.action!!.invoke(
                    buildAnnotatedString {
                        append(text.subSequence(0, startIndex))
                        append(text.subSequence(endIndex, text.length - 1))
                    }
                )
            }

            override fun cut(startIndex: Int, endIndex: Int) {
                TODO("Not yet implemented")
            }

            override fun paste(startIndex: Int) {
                TODO("Not yet implemented")
            }

            override fun replaceText(startIndex: Int, endIndex: Int, s: String) {
                val text = text!!
                setText!!.action!!.invoke(
                    buildAnnotatedString {
                        append(text.subSequence(0, startIndex))
                        append(s)
                        append(text.subSequence(endIndex, text.length - 1))
                    }
                )
            }

            override fun selectText(startIndex: Int, endIndex: Int) {
                // I'm not sure about traversalMode = true here
                setSelection!!.action!!.invoke(startIndex, endIndex, false)
            }

            override fun setAttributes(startIndex: Int, endIndex: Int, `as`: AttributeSet?) {
                println("Not implemented: setAttributes")
                TODO("Not yet implemented")
            }
        }

        override fun getAccessibleEditableText(): AccessibleEditableText? {
            val accessibleText = accessibleText
            return if (accessibleText is AccessibleEditableText) {
                accessibleText
            } else {
                null
            }
        }

        // -----------------------------------

        override fun setBounds(r: Rectangle?) {
            println("Not implemented: setBounds")
            TODO("Not yet implemented")
        }

        override fun setSize(d: Dimension?) {
            println("Not implemented: setSize")
            TODO("Not yet implemented")
        }

        override fun setLocation(p: Point?) {
            println("Not implemented: setLocation")
            TODO("Not yet implemented")
        }

        override fun getBackground(): Color {
            println("Not implemented: getBackground")
            TODO("Not yet implemented")
        }

        override fun setBackground(c: Color?) {
            println("Not implemented: setBackground")
            TODO("Not yet implemented")
        }

        override fun getForeground(): Color {
            println("Not implemented: getForeground")
            TODO("Not yet implemented")
        }

        override fun setForeground(c: Color?) {
            println("Not implemented: setForeground")
            TODO("Not yet implemented")
        }

        override fun getCursor(): Cursor {
            println("Not implemented: getCursor")
            TODO("Not yet implemented")
        }

        override fun setCursor(cursor: Cursor?) {
            println("Not implemented: setCursor")
            TODO("Not yet implemented")
        }

        override fun getFont(): Font {
            println("Not implemented: getFont")
            TODO("Not yet implemented")
        }

        override fun setFont(f: Font?) {
            println("Not implemented: setFont")
            TODO("Not yet implemented")
        }

        override fun getFontMetrics(f: Font?): FontMetrics {
            println("Not implemented: getFontMetrics")
            TODO("Not yet implemented")
        }

        override fun setEnabled(b: Boolean) {
            println("Not implemented: setEnabled")
            TODO("Not yet implemented")
        }

        override fun setVisible(b: Boolean) {
            println("Not implemented: setVisible")
            TODO("Not yet implemented")
        }

        // For some reasons JDK's CAccessibility does not call getAccessibleAction
        // and performs actions on current component itself
        override fun getAccessibleActionCount(): Int {
            return accessibleAction?.accessibleActionCount ?: 0
        }

        override fun getAccessibleActionDescription(i: Int): String {
            return accessibleAction?.getAccessibleActionDescription(i) ?: ""
        }

        override fun doAccessibleAction(i: Int): Boolean {
            return accessibleAction?.doAccessibleAction(i) ?: false
        }
    }
}

private class ToggleableAccessibleValue(
    val component: ComposeAccessible.ComposeAccessibleComponent
): AccessibleValue {
    override fun getCurrentAccessibleValue(): Number {
        return when (component.toggleableState) {
            ToggleableState.On -> 1
            else -> 0
        }
    }

    override fun setCurrentAccessibleValue(n: Number?): Boolean {
        // TODO: Implement this
        return false
    }

    override fun getMinimumAccessibleValue(): Number {
        return 0
    }

    override fun getMaximumAccessibleValue(): Number {
        return 1
    }
}

private class ProgressBarAccessibleValue(
    val component: ComposeAccessible.ComposeAccessibleComponent
): AccessibleValue {

    private val rangeInfo: ProgressBarRangeInfo?
        get() = component.progressBarRangeInfo

    override fun getCurrentAccessibleValue(): Number {
        return rangeInfo?.current ?: 0f
    }

    override fun setCurrentAccessibleValue(n: Number?): Boolean {
        // Can't set the value of a progress bar
        return false
    }

    override fun getMinimumAccessibleValue(): Number {
        return rangeInfo?.range?.start ?: 0f
    }

    override fun getMaximumAccessibleValue(): Number {
        return rangeInfo?.range?.endInclusive ?: 1f
    }
}