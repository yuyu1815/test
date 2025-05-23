/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import androidx.compose.ui.Modifier;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import org.jetbrains.jewel.foundation.lazy.tree.TreeElementState;
/*    */ import org.jetbrains.jewel.ui.component.styling.LazyTreeStyle;
/*    */ import org.jetbrains.jewel.ui.icon.IconKey;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class LazyTreeKt$LazyTree$4
/*    */   implements Function3<TreeElementState, Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke-EWxiZrY(long elementState, Composer $composer, int $changed) {
/* 56 */     int $dirty = $changed; if (($changed & 0x6) == 0) $dirty |= $composer.changed(elementState) ? 4 : 2;  if (($dirty & 0x13) != 18 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1675396453, $dirty, -1, "org.jetbrains.jewel.ui.component.LazyTree.<anonymous> (LazyTree.kt:55)");  IconKey iconKey = this.$style.getIcons().chevron(TreeElementState.isExpanded-impl(elementState), TreeElementState.isSelected-impl(elementState), $composer, 0);
/* 57 */       IconKt.Icon-FHprtrg(iconKey, (String)null, (Modifier)null, (Class<?>)null, 0L, new org.jetbrains.jewel.ui.painter.PainterHint[0], $composer, 48, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   LazyTreeKt$LazyTree$4(LazyTreeStyle $style) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\LazyTreeKt$LazyTree$4.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */