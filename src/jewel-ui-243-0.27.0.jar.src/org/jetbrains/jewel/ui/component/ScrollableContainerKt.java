/*      */ package org.jetbrains.jewel.ui.component;
/*      */ 
/*      */ import androidx.compose.foundation.ScrollState;
/*      */ import androidx.compose.foundation.gestures.ScrollableState;
/*      */ import androidx.compose.foundation.interaction.MutableInteractionSource;
/*      */ import androidx.compose.foundation.layout.BoxKt;
/*      */ import androidx.compose.foundation.layout.BoxScope;
/*      */ import androidx.compose.foundation.layout.BoxScopeInstance;
/*      */ import androidx.compose.foundation.lazy.LazyListState;
/*      */ import androidx.compose.foundation.lazy.grid.LazyGridState;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.ComposableInferredTarget;
/*      */ import androidx.compose.runtime.ComposableTarget;
/*      */ import androidx.compose.runtime.ComposablesKt;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.CompositionLocalMap;
/*      */ import androidx.compose.runtime.MutableState;
/*      */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*      */ import androidx.compose.runtime.State;
/*      */ import androidx.compose.runtime.Updater;
/*      */ import androidx.compose.ui.Alignment;
/*      */ import androidx.compose.ui.ComposedModifierKt;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
/*      */ import androidx.compose.ui.layout.LayoutIdKt;
/*      */ import androidx.compose.ui.layout.MeasurePolicy;
/*      */ import androidx.compose.ui.layout.Placeable;
/*      */ import androidx.compose.ui.node.ComposeUiNode;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.Unit;
/*      */ import kotlin.coroutines.Continuation;
/*      */ import kotlin.jvm.functions.Function0;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Ref;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.reflect.KProperty;
/*      */ import kotlinx.coroutines.CoroutineScope;
/*      */ import kotlinx.coroutines.Job;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ import org.jetbrains.jewel.ui.component.styling.ScrollbarStyle;
/*      */ 
/*      */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000x\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\032f\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0212\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020\025\0328\020\026\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\027\032\0020\0072\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\001¢\006\002\020\030\032d\020\004\032\0020\0052\006\020\t\032\0020\0312\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0212\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020\032\032d\020\004\032\0020\0052\006\020\t\032\0020\0332\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0212\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020\034\032f\020\035\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0212\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020\025\032d\020\035\032\0020\0052\006\020\t\032\0020\0312\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0212\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020\032\032d\020\035\032\0020\0052\006\020\t\032\0020\0332\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\b\b\002\020\017\032\0020\0162\b\b\002\020\020\032\0020\0212\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020\034\032\\\020\036\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\037\032\0020\n2\b\b\002\020 \032\0020\n2\b\b\002\020!\032\0020\0072\b\b\002\020\"\032\0020\0072\b\b\002\020\013\032\0020\f2\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020#\032X\020\036\032\0020\0052\006\020\037\032\0020\0312\006\020 \032\0020\0312\b\b\002\020\006\032\0020\0072\b\b\002\020!\032\0020\0072\b\b\002\020\"\032\0020\0072\b\b\002\020\013\032\0020\f2\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020$\032X\020\036\032\0020\0052\006\020\037\032\0020\0332\006\020 \032\0020\0332\b\b\002\020\006\032\0020\0072\b\b\002\020!\032\0020\0072\b\b\002\020\"\032\0020\0072\b\b\002\020\013\032\0020\f2\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\007¢\006\002\020%\0327\020&\032\0020\007*\0020\0072\006\020'\032\0020(2\006\020)\032\0020*2\022\020+\032\016\022\004\022\0020\016\022\004\022\0020\0050,H\002¢\006\004\b-\020.\032Z\020/\032\0020\0052\023\0200\032\017\022\004\022\0020\005\030\0010\023¢\006\002\b\0242\023\0201\032\017\022\004\022\0020\005\030\0010\023¢\006\002\b\0242\006\020\006\032\0020\0072\006\0202\032\0020\f2\021\020\022\032\r\022\004\022\0020\0050\023¢\006\002\b\024H\003¢\006\002\0203\032;\0204\032\002052\006\0202\032\0020\f2\006\0206\032\0020\0162\006\0207\032\002052\b\0208\032\004\030\001092\b\020:\032\004\030\00109H\002¢\006\004\b;\020<\032\027\020=\032\0020>2\b\b\002\020\013\032\0020\fH\007¢\006\002\020?\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000¨\006@²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002²\006\n\020A\032\0020\016X\002"}, d2 = {"ID_CONTENT", "", "ID_VERTICAL_SCROLLBAR", "ID_HORIZONTAL_SCROLLBAR", "VerticallyScrollableContainer", "", "modifier", "Landroidx/compose/ui/Modifier;", "scrollbarModifier", "scrollState", "Landroidx/compose/foundation/ScrollState;", "style", "Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;", "reverseLayout", "", "scrollbarEnabled", "scrollbarInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TextAreaScrollableContainer", "contentModifier", "(Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "HorizontallyScrollableContainer", "ScrollableContainer", "verticalScrollState", "horizontalScrollState", "verticalScrollbarModifier", "horizontalScrollbarModifier", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "withKeepVisible", "lingerDuration", "Lkotlin/time/Duration;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onKeepVisibleChange", "Lkotlin/Function1;", "withKeepVisible-dWUq8MI", "(Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "ScrollableContainerImpl", "verticalScrollbar", "horizontalScrollbar", "scrollbarStyle", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "computeContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "isMacOs", "incomingConstraints", "verticalScrollbarPlaceable", "Landroidx/compose/ui/layout/Placeable;", "horizontalScrollbarPlaceable", "computeContentConstraints-L1NQ6kE", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZJLandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)J", "scrollbarContentSafePadding", "Landroidx/compose/ui/unit/Dp;", "(Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/Composer;II)F", "ui", "keepVisible"})
/*      */ @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,560:1\n1225#2,6:561\n1225#2,6:567\n1225#2,3:578\n1228#2,3:584\n1225#2,6:588\n1225#2,6:594\n1225#2,3:605\n1228#2,3:611\n1225#2,6:615\n1225#2,6:621\n1225#2,6:627\n1225#2,3:638\n1228#2,3:644\n1225#2,6:648\n1225#2,6:654\n1225#2,6:660\n1225#2,3:671\n1228#2,3:677\n1225#2,6:681\n1225#2,6:687\n1225#2,6:693\n1225#2,3:704\n1228#2,3:710\n1225#2,6:714\n1225#2,6:720\n1225#2,6:726\n1225#2,3:737\n1228#2,3:743\n1225#2,6:747\n1225#2,6:753\n1225#2,6:759\n1225#2,3:770\n1228#2,3:776\n1225#2,6:780\n1225#2,6:786\n1225#2,3:797\n1228#2,3:803\n1225#2,6:807\n1225#2,6:813\n1225#2,3:824\n1228#2,3:830\n1225#2,6:834\n1225#2,6:840\n1225#2,3:851\n1228#2,3:857\n1225#2,6:861\n1225#2,6:867\n481#3:573\n480#3,4:574\n484#3,2:581\n488#3:587\n481#3:600\n480#3,4:601\n484#3,2:608\n488#3:614\n481#3:633\n480#3,4:634\n484#3,2:641\n488#3:647\n481#3:666\n480#3,4:667\n484#3,2:674\n488#3:680\n481#3:699\n480#3,4:700\n484#3,2:707\n488#3:713\n481#3:732\n480#3,4:733\n484#3,2:740\n488#3:746\n481#3:765\n480#3,4:766\n484#3,2:773\n488#3:779\n481#3:792\n480#3,4:793\n484#3,2:800\n488#3:806\n481#3:819\n480#3,4:820\n484#3,2:827\n488#3:833\n481#3:846\n480#3,4:847\n484#3,2:854\n488#3:860\n480#4:583\n480#4:610\n480#4:643\n480#4:676\n480#4:709\n480#4:742\n480#4:775\n480#4:802\n480#4:829\n480#4:856\n79#5,6:873\n86#5,4:888\n90#5,2:898\n79#5,6:908\n86#5,4:923\n90#5,2:933\n94#5:939\n79#5,6:948\n86#5,4:963\n90#5,2:973\n94#5:979\n94#5:983\n368#6,9:879\n377#6:900\n368#6,9:914\n377#6:935\n378#6,2:937\n368#6,9:954\n377#6:975\n378#6,2:977\n378#6,2:981\n4034#7,6:892\n4034#7,6:927\n4034#7,6:967\n71#8:901\n68#8,6:902\n74#8:936\n78#8:940\n71#8:941\n68#8,6:942\n74#8:976\n78#8:980\n149#9:984\n81#10:985\n107#10,2:986\n81#10:988\n107#10,2:989\n81#10:991\n107#10,2:992\n81#10:994\n107#10,2:995\n81#10:997\n107#10,2:998\n81#10:1000\n107#10,2:1001\n81#10:1003\n107#10,2:1004\n81#10:1006\n107#10,2:1007\n81#10:1009\n107#10,2:1010\n81#10:1012\n107#10,2:1013\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt\n*L\n59#1:561,6\n62#1:567,6\n63#1:578,3\n63#1:584,3\n78#1:588,6\n92#1:594,6\n93#1:605,3\n93#1:611,3\n105#1:615,6\n120#1:621,6\n123#1:627,6\n124#1:638,3\n124#1:644,3\n139#1:648,6\n154#1:654,6\n157#1:660,6\n158#1:671,3\n158#1:677,3\n173#1:681,6\n188#1:687,6\n191#1:693,6\n192#1:704,3\n192#1:710,3\n207#1:714,6\n222#1:720,6\n225#1:726,6\n226#1:737,3\n226#1:743,3\n241#1:747,6\n256#1:753,6\n259#1:759,6\n260#1:770,3\n260#1:776,3\n275#1:780,6\n295#1:786,6\n296#1:797,3\n296#1:803,3\n310#1:807,6\n332#1:813,6\n333#1:824,3\n333#1:830,3\n347#1:834,6\n367#1:840,6\n368#1:851,3\n368#1:857,3\n382#1:861,6\n431#1:867,6\n63#1:573\n63#1:574,4\n63#1:581,2\n63#1:587\n93#1:600\n93#1:601,4\n93#1:608,2\n93#1:614\n124#1:633\n124#1:634,4\n124#1:641,2\n124#1:647\n158#1:666\n158#1:667,4\n158#1:674,2\n158#1:680\n192#1:699\n192#1:700,4\n192#1:707,2\n192#1:713\n226#1:732\n226#1:733,4\n226#1:740,2\n226#1:746\n260#1:765\n260#1:766,4\n260#1:773,2\n260#1:779\n296#1:792\n296#1:793,4\n296#1:800,2\n296#1:806\n333#1:819\n333#1:820,4\n333#1:827,2\n333#1:833\n368#1:846\n368#1:847,4\n368#1:854,2\n368#1:860\n63#1:583\n93#1:610\n124#1:643\n158#1:676\n192#1:709\n226#1:742\n260#1:775\n296#1:802\n333#1:829\n368#1:856\n418#1:873,6\n418#1:888,4\n418#1:898,2\n423#1:908,6\n423#1:923,4\n423#1:933,2\n423#1:939\n427#1:948,6\n427#1:963,4\n427#1:973,2\n427#1:979\n418#1:983\n418#1:879,9\n418#1:900\n423#1:914,9\n423#1:935\n423#1:937,2\n427#1:954,9\n427#1:975\n427#1:977,2\n418#1:981,2\n418#1:892,6\n423#1:927,6\n427#1:967,6\n423#1:901\n423#1:902,6\n423#1:936\n423#1:940\n427#1:941\n427#1:942,6\n427#1:976\n427#1:980\n556#1:984\n62#1:985\n62#1:986,2\n92#1:988\n92#1:989,2\n123#1:991\n123#1:992,2\n157#1:994\n157#1:995,2\n191#1:997\n191#1:998,2\n225#1:1000\n225#1:1001,2\n259#1:1003\n259#1:1004,2\n295#1:1006\n295#1:1007,2\n332#1:1009\n332#1:1010,2\n367#1:1012\n367#1:1013,2\n*E\n"})
/*      */ public final class ScrollableContainerKt {
/*      */   @NotNull
/*      */   private static final String ID_CONTENT = "VerticallyScrollableContainer_content";
/*      */   @NotNull
/*      */   private static final String ID_VERTICAL_SCROLLBAR = "VerticallyScrollableContainer_verticalScrollbar";
/*      */   @NotNull
/*      */   private static final String ID_HORIZONTAL_SCROLLBAR = "VerticallyScrollableContainer_horizontalScrollbar";
/*      */   
/*      */   @Composable
/*      */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*      */   public static final void VerticallyScrollableContainer(@Nullable Modifier modifier, @Nullable Modifier scrollbarModifier, @Nullable ScrollState scrollState, @Nullable ScrollbarStyle style, boolean reverseLayout, boolean scrollbarEnabled, @Nullable MutableInteractionSource scrollbarInteractionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*      */     // Byte code:
/*      */     //   0: aload #7
/*      */     //   2: ldc 'content'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #8
/*      */     //   9: ldc 1535686330
/*      */     //   11: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   16: astore #8
/*      */     //   18: iload #9
/*      */     //   20: istore #11
/*      */     //   22: iload #10
/*      */     //   24: iconst_1
/*      */     //   25: iand
/*      */     //   26: ifeq -> 39
/*      */     //   29: iload #11
/*      */     //   31: bipush #6
/*      */     //   33: ior
/*      */     //   34: istore #11
/*      */     //   36: goto -> 68
/*      */     //   39: iload #9
/*      */     //   41: bipush #6
/*      */     //   43: iand
/*      */     //   44: ifne -> 68
/*      */     //   47: iload #11
/*      */     //   49: aload #8
/*      */     //   51: aload_0
/*      */     //   52: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   57: ifeq -> 64
/*      */     //   60: iconst_4
/*      */     //   61: goto -> 65
/*      */     //   64: iconst_2
/*      */     //   65: ior
/*      */     //   66: istore #11
/*      */     //   68: iload #10
/*      */     //   70: iconst_2
/*      */     //   71: iand
/*      */     //   72: ifeq -> 85
/*      */     //   75: iload #11
/*      */     //   77: bipush #48
/*      */     //   79: ior
/*      */     //   80: istore #11
/*      */     //   82: goto -> 116
/*      */     //   85: iload #9
/*      */     //   87: bipush #48
/*      */     //   89: iand
/*      */     //   90: ifne -> 116
/*      */     //   93: iload #11
/*      */     //   95: aload #8
/*      */     //   97: aload_1
/*      */     //   98: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   103: ifeq -> 111
/*      */     //   106: bipush #32
/*      */     //   108: goto -> 113
/*      */     //   111: bipush #16
/*      */     //   113: ior
/*      */     //   114: istore #11
/*      */     //   116: iload #9
/*      */     //   118: sipush #384
/*      */     //   121: iand
/*      */     //   122: ifne -> 157
/*      */     //   125: iload #11
/*      */     //   127: iload #10
/*      */     //   129: iconst_4
/*      */     //   130: iand
/*      */     //   131: ifne -> 151
/*      */     //   134: aload #8
/*      */     //   136: aload_2
/*      */     //   137: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   142: ifeq -> 151
/*      */     //   145: sipush #256
/*      */     //   148: goto -> 154
/*      */     //   151: sipush #128
/*      */     //   154: ior
/*      */     //   155: istore #11
/*      */     //   157: iload #9
/*      */     //   159: sipush #3072
/*      */     //   162: iand
/*      */     //   163: ifne -> 199
/*      */     //   166: iload #11
/*      */     //   168: iload #10
/*      */     //   170: bipush #8
/*      */     //   172: iand
/*      */     //   173: ifne -> 193
/*      */     //   176: aload #8
/*      */     //   178: aload_3
/*      */     //   179: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   184: ifeq -> 193
/*      */     //   187: sipush #2048
/*      */     //   190: goto -> 196
/*      */     //   193: sipush #1024
/*      */     //   196: ior
/*      */     //   197: istore #11
/*      */     //   199: iload #10
/*      */     //   201: bipush #16
/*      */     //   203: iand
/*      */     //   204: ifeq -> 218
/*      */     //   207: iload #11
/*      */     //   209: sipush #24576
/*      */     //   212: ior
/*      */     //   213: istore #11
/*      */     //   215: goto -> 253
/*      */     //   218: iload #9
/*      */     //   220: sipush #24576
/*      */     //   223: iand
/*      */     //   224: ifne -> 253
/*      */     //   227: iload #11
/*      */     //   229: aload #8
/*      */     //   231: iload #4
/*      */     //   233: invokeinterface changed : (Z)Z
/*      */     //   238: ifeq -> 247
/*      */     //   241: sipush #16384
/*      */     //   244: goto -> 250
/*      */     //   247: sipush #8192
/*      */     //   250: ior
/*      */     //   251: istore #11
/*      */     //   253: iload #10
/*      */     //   255: bipush #32
/*      */     //   257: iand
/*      */     //   258: ifeq -> 271
/*      */     //   261: iload #11
/*      */     //   263: ldc 196608
/*      */     //   265: ior
/*      */     //   266: istore #11
/*      */     //   268: goto -> 303
/*      */     //   271: iload #9
/*      */     //   273: ldc 196608
/*      */     //   275: iand
/*      */     //   276: ifne -> 303
/*      */     //   279: iload #11
/*      */     //   281: aload #8
/*      */     //   283: iload #5
/*      */     //   285: invokeinterface changed : (Z)Z
/*      */     //   290: ifeq -> 298
/*      */     //   293: ldc 131072
/*      */     //   295: goto -> 300
/*      */     //   298: ldc 65536
/*      */     //   300: ior
/*      */     //   301: istore #11
/*      */     //   303: iload #10
/*      */     //   305: bipush #64
/*      */     //   307: iand
/*      */     //   308: ifeq -> 321
/*      */     //   311: iload #11
/*      */     //   313: ldc 1572864
/*      */     //   315: ior
/*      */     //   316: istore #11
/*      */     //   318: goto -> 353
/*      */     //   321: iload #9
/*      */     //   323: ldc 1572864
/*      */     //   325: iand
/*      */     //   326: ifne -> 353
/*      */     //   329: iload #11
/*      */     //   331: aload #8
/*      */     //   333: aload #6
/*      */     //   335: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   340: ifeq -> 348
/*      */     //   343: ldc 1048576
/*      */     //   345: goto -> 350
/*      */     //   348: ldc 524288
/*      */     //   350: ior
/*      */     //   351: istore #11
/*      */     //   353: iload #10
/*      */     //   355: sipush #128
/*      */     //   358: iand
/*      */     //   359: ifeq -> 372
/*      */     //   362: iload #11
/*      */     //   364: ldc 12582912
/*      */     //   366: ior
/*      */     //   367: istore #11
/*      */     //   369: goto -> 404
/*      */     //   372: iload #9
/*      */     //   374: ldc 12582912
/*      */     //   376: iand
/*      */     //   377: ifne -> 404
/*      */     //   380: iload #11
/*      */     //   382: aload #8
/*      */     //   384: aload #7
/*      */     //   386: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   391: ifeq -> 399
/*      */     //   394: ldc 8388608
/*      */     //   396: goto -> 401
/*      */     //   399: ldc 4194304
/*      */     //   401: ior
/*      */     //   402: istore #11
/*      */     //   404: iload #11
/*      */     //   406: ldc 4793491
/*      */     //   408: iand
/*      */     //   409: ldc 4793490
/*      */     //   411: if_icmpne -> 424
/*      */     //   414: aload #8
/*      */     //   416: invokeinterface getSkipping : ()Z
/*      */     //   421: ifne -> 1150
/*      */     //   424: aload #8
/*      */     //   426: invokeinterface startDefaults : ()V
/*      */     //   431: iload #9
/*      */     //   433: iconst_1
/*      */     //   434: iand
/*      */     //   435: ifeq -> 448
/*      */     //   438: aload #8
/*      */     //   440: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   445: ifeq -> 645
/*      */     //   448: iload #10
/*      */     //   450: iconst_1
/*      */     //   451: iand
/*      */     //   452: ifeq -> 462
/*      */     //   455: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   458: checkcast androidx/compose/ui/Modifier
/*      */     //   461: astore_0
/*      */     //   462: iload #10
/*      */     //   464: iconst_2
/*      */     //   465: iand
/*      */     //   466: ifeq -> 476
/*      */     //   469: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   472: checkcast androidx/compose/ui/Modifier
/*      */     //   475: astore_1
/*      */     //   476: iload #10
/*      */     //   478: iconst_4
/*      */     //   479: iand
/*      */     //   480: ifeq -> 500
/*      */     //   483: iconst_0
/*      */     //   484: aload #8
/*      */     //   486: iconst_0
/*      */     //   487: iconst_1
/*      */     //   488: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*      */     //   491: astore_2
/*      */     //   492: iload #11
/*      */     //   494: sipush #-897
/*      */     //   497: iand
/*      */     //   498: istore #11
/*      */     //   500: iload #10
/*      */     //   502: bipush #8
/*      */     //   504: iand
/*      */     //   505: ifeq -> 527
/*      */     //   508: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   511: aload #8
/*      */     //   513: bipush #6
/*      */     //   515: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   518: astore_3
/*      */     //   519: iload #11
/*      */     //   521: sipush #-7169
/*      */     //   524: iand
/*      */     //   525: istore #11
/*      */     //   527: iload #10
/*      */     //   529: bipush #16
/*      */     //   531: iand
/*      */     //   532: ifeq -> 538
/*      */     //   535: iconst_0
/*      */     //   536: istore #4
/*      */     //   538: iload #10
/*      */     //   540: bipush #32
/*      */     //   542: iand
/*      */     //   543: ifeq -> 549
/*      */     //   546: iconst_1
/*      */     //   547: istore #5
/*      */     //   549: iload #10
/*      */     //   551: bipush #64
/*      */     //   553: iand
/*      */     //   554: ifeq -> 683
/*      */     //   557: aload #8
/*      */     //   559: ldc 1469435296
/*      */     //   561: invokeinterface startReplaceGroup : (I)V
/*      */     //   566: aload #8
/*      */     //   568: astore #13
/*      */     //   570: iconst_0
/*      */     //   571: istore #14
/*      */     //   573: iconst_0
/*      */     //   574: istore #15
/*      */     //   576: aload #13
/*      */     //   578: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   583: astore #16
/*      */     //   585: iconst_0
/*      */     //   586: istore #17
/*      */     //   588: aload #16
/*      */     //   590: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   593: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   596: if_acmpne -> 621
/*      */     //   599: iconst_0
/*      */     //   600: istore #18
/*      */     //   602: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   605: astore #18
/*      */     //   607: aload #13
/*      */     //   609: aload #18
/*      */     //   611: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   616: aload #18
/*      */     //   618: goto -> 623
/*      */     //   621: aload #16
/*      */     //   623: nop
/*      */     //   624: nop
/*      */     //   625: nop
/*      */     //   626: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   629: astore #12
/*      */     //   631: aload #8
/*      */     //   633: invokeinterface endReplaceGroup : ()V
/*      */     //   638: aload #12
/*      */     //   640: astore #6
/*      */     //   642: goto -> 683
/*      */     //   645: aload #8
/*      */     //   647: invokeinterface skipToGroupEnd : ()V
/*      */     //   652: iload #10
/*      */     //   654: iconst_4
/*      */     //   655: iand
/*      */     //   656: ifeq -> 667
/*      */     //   659: iload #11
/*      */     //   661: sipush #-897
/*      */     //   664: iand
/*      */     //   665: istore #11
/*      */     //   667: iload #10
/*      */     //   669: bipush #8
/*      */     //   671: iand
/*      */     //   672: ifeq -> 683
/*      */     //   675: iload #11
/*      */     //   677: sipush #-7169
/*      */     //   680: iand
/*      */     //   681: istore #11
/*      */     //   683: aload #8
/*      */     //   685: invokeinterface endDefaults : ()V
/*      */     //   690: invokestatic isTraceInProgress : ()Z
/*      */     //   693: ifeq -> 706
/*      */     //   696: ldc 1535686330
/*      */     //   698: iload #11
/*      */     //   700: iconst_m1
/*      */     //   701: ldc 'org.jetbrains.jewel.ui.component.VerticallyScrollableContainer (ScrollableContainer.kt:60)'
/*      */     //   703: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   706: aload #8
/*      */     //   708: ldc 1469438651
/*      */     //   710: invokeinterface startReplaceGroup : (I)V
/*      */     //   715: aload #8
/*      */     //   717: astore #14
/*      */     //   719: iconst_0
/*      */     //   720: istore #15
/*      */     //   722: nop
/*      */     //   723: iconst_0
/*      */     //   724: istore #16
/*      */     //   726: aload #14
/*      */     //   728: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   733: astore #17
/*      */     //   735: iconst_0
/*      */     //   736: istore #18
/*      */     //   738: aload #17
/*      */     //   740: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   743: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   746: if_acmpne -> 778
/*      */     //   749: iconst_0
/*      */     //   750: istore #19
/*      */     //   752: iconst_0
/*      */     //   753: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   756: aconst_null
/*      */     //   757: iconst_2
/*      */     //   758: aconst_null
/*      */     //   759: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   762: astore #19
/*      */     //   764: aload #14
/*      */     //   766: aload #19
/*      */     //   768: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   773: aload #19
/*      */     //   775: goto -> 780
/*      */     //   778: aload #17
/*      */     //   780: nop
/*      */     //   781: nop
/*      */     //   782: nop
/*      */     //   783: checkcast androidx/compose/runtime/MutableState
/*      */     //   786: astore #13
/*      */     //   788: aload #8
/*      */     //   790: invokeinterface endReplaceGroup : ()V
/*      */     //   795: aload #13
/*      */     //   797: astore #12
/*      */     //   799: iconst_0
/*      */     //   800: istore #15
/*      */     //   802: nop
/*      */     //   803: iconst_0
/*      */     //   804: istore #16
/*      */     //   806: aload #8
/*      */     //   808: ldc 773894976
/*      */     //   810: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   812: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   815: aload #8
/*      */     //   817: astore #17
/*      */     //   819: aload #8
/*      */     //   821: ldc -954370320
/*      */     //   823: ldc 'CC(remember):Effects.kt#9igjgp'
/*      */     //   825: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   828: aload #8
/*      */     //   830: astore #18
/*      */     //   832: iconst_0
/*      */     //   833: istore #19
/*      */     //   835: iconst_0
/*      */     //   836: istore #20
/*      */     //   838: aload #18
/*      */     //   840: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   845: astore #21
/*      */     //   847: iconst_0
/*      */     //   848: istore #22
/*      */     //   850: aload #21
/*      */     //   852: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   855: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   858: if_acmpne -> 905
/*      */     //   861: iconst_0
/*      */     //   862: istore #23
/*      */     //   864: iconst_0
/*      */     //   865: istore #24
/*      */     //   867: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   870: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   873: aload #17
/*      */     //   875: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   878: astore #34
/*      */     //   880: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   883: dup
/*      */     //   884: aload #34
/*      */     //   886: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   889: astore #24
/*      */     //   891: aload #18
/*      */     //   893: aload #24
/*      */     //   895: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   900: aload #24
/*      */     //   902: goto -> 907
/*      */     //   905: aload #21
/*      */     //   907: nop
/*      */     //   908: nop
/*      */     //   909: nop
/*      */     //   910: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   913: astore #25
/*      */     //   915: aload #8
/*      */     //   917: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   920: aload #25
/*      */     //   922: astore #26
/*      */     //   924: aload #26
/*      */     //   926: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   929: astore #25
/*      */     //   931: aload #8
/*      */     //   933: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   936: aload #25
/*      */     //   938: nop
/*      */     //   939: astore #13
/*      */     //   941: ldc -861980247
/*      */     //   943: iconst_1
/*      */     //   944: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$2
/*      */     //   947: dup
/*      */     //   948: aload_2
/*      */     //   949: aload_1
/*      */     //   950: iload #4
/*      */     //   952: iload #5
/*      */     //   954: aload #6
/*      */     //   956: aload_3
/*      */     //   957: aload #12
/*      */     //   959: invokespecial <init> : (Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*      */     //   962: aload #8
/*      */     //   964: bipush #54
/*      */     //   966: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   969: checkcast kotlin/jvm/functions/Function2
/*      */     //   972: aconst_null
/*      */     //   973: aload_0
/*      */     //   974: aload_3
/*      */     //   975: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   978: invokeinterface getLingerDuration-UwyO8pc : ()J
/*      */     //   983: aload #13
/*      */     //   985: aload #8
/*      */     //   987: ldc 1469459085
/*      */     //   989: invokeinterface startReplaceGroup : (I)V
/*      */     //   994: aload #8
/*      */     //   996: astore #15
/*      */     //   998: iconst_0
/*      */     //   999: istore #16
/*      */     //   1001: iconst_0
/*      */     //   1002: istore #17
/*      */     //   1004: aload #15
/*      */     //   1006: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1011: astore #18
/*      */     //   1013: iconst_0
/*      */     //   1014: istore #19
/*      */     //   1016: aload #18
/*      */     //   1018: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1021: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1024: if_acmpne -> 1077
/*      */     //   1027: astore #32
/*      */     //   1029: lstore #30
/*      */     //   1031: astore #29
/*      */     //   1033: astore #28
/*      */     //   1035: astore #27
/*      */     //   1037: iconst_0
/*      */     //   1038: istore #20
/*      */     //   1040: aload #12
/*      */     //   1042: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1047: astore #33
/*      */     //   1049: aload #27
/*      */     //   1051: aload #28
/*      */     //   1053: aload #29
/*      */     //   1055: lload #30
/*      */     //   1057: aload #32
/*      */     //   1059: aload #33
/*      */     //   1061: astore #21
/*      */     //   1063: aload #15
/*      */     //   1065: aload #21
/*      */     //   1067: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1072: aload #21
/*      */     //   1074: goto -> 1079
/*      */     //   1077: aload #18
/*      */     //   1079: nop
/*      */     //   1080: nop
/*      */     //   1081: nop
/*      */     //   1082: checkcast kotlin/jvm/functions/Function1
/*      */     //   1085: astore #14
/*      */     //   1087: aload #8
/*      */     //   1089: invokeinterface endReplaceGroup : ()V
/*      */     //   1094: aload #14
/*      */     //   1096: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1099: aload_3
/*      */     //   1100: ldc -472112859
/*      */     //   1102: iconst_1
/*      */     //   1103: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$4
/*      */     //   1106: dup
/*      */     //   1107: aload_2
/*      */     //   1108: aload #7
/*      */     //   1110: invokespecial <init> : (Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1113: aload #8
/*      */     //   1115: bipush #54
/*      */     //   1117: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1120: checkcast kotlin/jvm/functions/Function2
/*      */     //   1123: aload #8
/*      */     //   1125: sipush #24630
/*      */     //   1128: sipush #7168
/*      */     //   1131: iload #11
/*      */     //   1133: iand
/*      */     //   1134: ior
/*      */     //   1135: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1138: invokestatic isTraceInProgress : ()Z
/*      */     //   1141: ifeq -> 1157
/*      */     //   1144: invokestatic traceEventEnd : ()V
/*      */     //   1147: goto -> 1157
/*      */     //   1150: aload #8
/*      */     //   1152: invokeinterface skipToGroupEnd : ()V
/*      */     //   1157: aload #8
/*      */     //   1159: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1164: dup
/*      */     //   1165: ifnull -> 1197
/*      */     //   1168: aload_0
/*      */     //   1169: aload_1
/*      */     //   1170: aload_2
/*      */     //   1171: aload_3
/*      */     //   1172: iload #4
/*      */     //   1174: iload #5
/*      */     //   1176: aload #6
/*      */     //   1178: aload #7
/*      */     //   1180: iload #9
/*      */     //   1182: iload #10
/*      */     //   1184: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1189: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1194: goto -> 1198
/*      */     //   1197: pop
/*      */     //   1198: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #61	-> 7
/*      */     //   #53	-> 455
/*      */     //   #54	-> 469
/*      */     //   #55	-> 483
/*      */     //   #56	-> 508
/*      */     //   #57	-> 535
/*      */     //   #58	-> 546
/*      */     //   #59	-> 557
/*      */     //   #561	-> 576
/*      */     //   #562	-> 588
/*      */     //   #563	-> 599
/*      */     //   #59	-> 602
/*      */     //   #563	-> 605
/*      */     //   #564	-> 607
/*      */     //   #565	-> 616
/*      */     //   #566	-> 621
/*      */     //   #562	-> 623
/*      */     //   #561	-> 624
/*      */     //   #561	-> 625
/*      */     //   #59	-> 626
/*      */     //   #61	-> 703
/*      */     //   #62	-> 722
/*      */     //   #567	-> 726
/*      */     //   #568	-> 738
/*      */     //   #569	-> 749
/*      */     //   #62	-> 752
/*      */     //   #569	-> 762
/*      */     //   #570	-> 764
/*      */     //   #571	-> 773
/*      */     //   #572	-> 778
/*      */     //   #568	-> 780
/*      */     //   #567	-> 781
/*      */     //   #567	-> 782
/*      */     //   #62	-> 783
/*      */     //   #63	-> 802
/*      */     //   #573	-> 812
/*      */     //   #574	-> 815
/*      */     //   #576	-> 817
/*      */     //   #577	-> 825
/*      */     //   #578	-> 838
/*      */     //   #579	-> 850
/*      */     //   #580	-> 861
/*      */     //   #581	-> 864
/*      */     //   #582	-> 864
/*      */     //   #583	-> 867
/*      */     //   #582	-> 870
/*      */     //   #581	-> 878
/*      */     //   #580	-> 889
/*      */     //   #584	-> 891
/*      */     //   #585	-> 900
/*      */     //   #586	-> 905
/*      */     //   #579	-> 907
/*      */     //   #578	-> 908
/*      */     //   #578	-> 909
/*      */     //   #577	-> 910
/*      */     //   #587	-> 924
/*      */     //   #573	-> 933
/*      */     //   #587	-> 938
/*      */     //   #63	-> 939
/*      */     //   #66	-> 941
/*      */     //   #77	-> 972
/*      */     //   #78	-> 973
/*      */     //   #588	-> 1004
/*      */     //   #589	-> 1016
/*      */     //   #590	-> 1027
/*      */     //   #78	-> 1040
/*      */     //   #590	-> 1061
/*      */     //   #591	-> 1063
/*      */     //   #592	-> 1072
/*      */     //   #593	-> 1077
/*      */     //   #589	-> 1079
/*      */     //   #588	-> 1080
/*      */     //   #588	-> 1081
/*      */     //   #78	-> 1082
/*      */     //   #79	-> 1099
/*      */     //   #80	-> 1100
/*      */     //   #65	-> 1135
/*      */     //   #83	-> 1150
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   602	3	18	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$1	I
/*      */     //   607	11	18	value$iv	Ljava/lang/Object;
/*      */     //   588	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   585	39	16	it$iv	Ljava/lang/Object;
/*      */     //   576	50	15	$i$f$cache	I
/*      */     //   573	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   573	53	14	invalid$iv	Z
/*      */     //   752	10	19	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$keepVisible$2	I
/*      */     //   764	11	19	value$iv	Ljava/lang/Object;
/*      */     //   738	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   735	46	17	it$iv	Ljava/lang/Object;
/*      */     //   726	57	16	$i$f$cache	I
/*      */     //   723	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   723	60	15	invalid$iv	Z
/*      */     //   867	3	24	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   864	25	23	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   891	11	24	value$iv$iv	Ljava/lang/Object;
/*      */     //   850	58	22	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   847	61	21	it$iv$iv	Ljava/lang/Object;
/*      */     //   838	72	20	$i$f$cache	I
/*      */     //   835	75	18	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   835	75	19	invalid$iv$iv	Z
/*      */     //   806	133	16	$i$f$rememberCoroutineScope	I
/*      */     //   819	120	17	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   924	15	26	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   803	136	15	$changed$iv	I
/*      */     //   1040	7	20	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$3	I
/*      */     //   1063	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1016	64	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1013	67	18	it$iv	Ljava/lang/Object;
/*      */     //   1004	78	17	$i$f$cache	I
/*      */     //   1001	81	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1001	81	16	invalid$iv	Z
/*      */     //   799	348	12	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   941	206	13	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   22	1177	11	$dirty	I
/*      */     //   0	1199	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1199	1	scrollbarModifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1199	2	scrollState	Landroidx/compose/foundation/ScrollState;
/*      */     //   0	1199	3	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	1199	4	reverseLayout	Z
/*      */     //   0	1199	5	scrollbarEnabled	Z
/*      */     //   0	1199	6	scrollbarInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	1199	7	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1199	8	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	1199	9	$changed	I
/*      */   }
/*      */   
/*   62 */   private static final boolean VerticallyScrollableContainer$lambda$2(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  985 */       (Boolean)state.getValue()).booleanValue(); } private static final void VerticallyScrollableContainer$lambda$3(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/*  986 */     mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$VerticallyScrollableContainer$2 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-861980247, $changed, -1, "org.jetbrains.jewel.ui.component.VerticallyScrollableContainer.<anonymous> (ScrollableContainer.kt:66)");  boolean bool = ScrollableContainerKt.VerticallyScrollableContainer$lambda$2(this.$keepVisible$delegate); ScrollbarKt.VerticalScrollbar((ScrollableState)this.$scrollState, this.$scrollbarModifier, this.$reverseLayout, this.$scrollbarEnabled, this.$scrollbarInteractionSource, this.$style, bool, $composer, 0, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$VerticallyScrollableContainer$2(ScrollState $scrollState, Modifier $scrollbarModifier, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final Unit VerticallyScrollableContainer$lambda$5$lambda$4(MutableState<Boolean> $keepVisible$delegate, boolean it) { VerticallyScrollableContainer$lambda$3($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$4\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$4\n*L\n81#1:561\n81#1:562,6\n81#1:596\n81#1:600\n81#1:568,6\n81#1:583,4\n81#1:593,2\n81#1:599\n81#1:574,9\n81#1:595\n81#1:597,2\n81#1:587,6\n*E\n"}) static final class ScrollableContainerKt$VerticallyScrollableContainer$4 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-472112859, $changed, -1, "org.jetbrains.jewel.ui.component.VerticallyScrollableContainer.<anonymous> (ScrollableContainer.kt:80)");  Modifier modifier1 = ScrollKt.verticalScroll$default(LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"), this.$scrollState, false, null, false, 14, null); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$VerticallyScrollableContainer$4$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$VerticallyScrollableContainer$4(ScrollState $scrollState, Function2<Composer, Integer, Unit> $content) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void TextAreaScrollableContainer(@NotNull ScrollState scrollState, @NotNull ScrollbarStyle style, @NotNull Modifier contentModifier, @NotNull Function2 content, @Nullable Composer $composer, int $changed) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'scrollState'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload_1
/*      */     //   8: ldc_w 'style'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload_2
/*      */     //   15: ldc_w 'contentModifier'
/*      */     //   18: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   21: aload_3
/*      */     //   22: ldc 'content'
/*      */     //   24: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   27: aload #4
/*      */     //   29: ldc_w -154132885
/*      */     //   32: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   37: astore #4
/*      */     //   39: iload #5
/*      */     //   41: istore #6
/*      */     //   43: iload #5
/*      */     //   45: bipush #6
/*      */     //   47: iand
/*      */     //   48: ifne -> 72
/*      */     //   51: iload #6
/*      */     //   53: aload #4
/*      */     //   55: aload_0
/*      */     //   56: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   61: ifeq -> 68
/*      */     //   64: iconst_4
/*      */     //   65: goto -> 69
/*      */     //   68: iconst_2
/*      */     //   69: ior
/*      */     //   70: istore #6
/*      */     //   72: iload #5
/*      */     //   74: bipush #48
/*      */     //   76: iand
/*      */     //   77: ifne -> 103
/*      */     //   80: iload #6
/*      */     //   82: aload #4
/*      */     //   84: aload_1
/*      */     //   85: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   90: ifeq -> 98
/*      */     //   93: bipush #32
/*      */     //   95: goto -> 100
/*      */     //   98: bipush #16
/*      */     //   100: ior
/*      */     //   101: istore #6
/*      */     //   103: iload #5
/*      */     //   105: sipush #384
/*      */     //   108: iand
/*      */     //   109: ifne -> 137
/*      */     //   112: iload #6
/*      */     //   114: aload #4
/*      */     //   116: aload_2
/*      */     //   117: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   122: ifeq -> 131
/*      */     //   125: sipush #256
/*      */     //   128: goto -> 134
/*      */     //   131: sipush #128
/*      */     //   134: ior
/*      */     //   135: istore #6
/*      */     //   137: iload #5
/*      */     //   139: sipush #3072
/*      */     //   142: iand
/*      */     //   143: ifne -> 171
/*      */     //   146: iload #6
/*      */     //   148: aload #4
/*      */     //   150: aload_3
/*      */     //   151: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   156: ifeq -> 165
/*      */     //   159: sipush #2048
/*      */     //   162: goto -> 168
/*      */     //   165: sipush #1024
/*      */     //   168: ior
/*      */     //   169: istore #6
/*      */     //   171: iload #6
/*      */     //   173: sipush #1171
/*      */     //   176: iand
/*      */     //   177: sipush #1170
/*      */     //   180: if_icmpne -> 193
/*      */     //   183: aload #4
/*      */     //   185: invokeinterface getSkipping : ()Z
/*      */     //   190: ifne -> 659
/*      */     //   193: invokestatic isTraceInProgress : ()Z
/*      */     //   196: ifeq -> 211
/*      */     //   199: ldc_w -154132885
/*      */     //   202: iload #6
/*      */     //   204: iconst_m1
/*      */     //   205: ldc_w 'org.jetbrains.jewel.ui.component.TextAreaScrollableContainer (ScrollableContainer.kt:90)'
/*      */     //   208: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   211: aload #4
/*      */     //   213: ldc_w -1234423580
/*      */     //   216: invokeinterface startReplaceGroup : (I)V
/*      */     //   221: aload #4
/*      */     //   223: astore #9
/*      */     //   225: iconst_0
/*      */     //   226: istore #10
/*      */     //   228: nop
/*      */     //   229: iconst_0
/*      */     //   230: istore #11
/*      */     //   232: aload #9
/*      */     //   234: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   239: astore #12
/*      */     //   241: iconst_0
/*      */     //   242: istore #13
/*      */     //   244: aload #12
/*      */     //   246: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   249: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   252: if_acmpne -> 284
/*      */     //   255: iconst_0
/*      */     //   256: istore #14
/*      */     //   258: iconst_0
/*      */     //   259: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   262: aconst_null
/*      */     //   263: iconst_2
/*      */     //   264: aconst_null
/*      */     //   265: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   268: astore #14
/*      */     //   270: aload #9
/*      */     //   272: aload #14
/*      */     //   274: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   279: aload #14
/*      */     //   281: goto -> 286
/*      */     //   284: aload #12
/*      */     //   286: nop
/*      */     //   287: nop
/*      */     //   288: nop
/*      */     //   289: checkcast androidx/compose/runtime/MutableState
/*      */     //   292: astore #8
/*      */     //   294: aload #4
/*      */     //   296: invokeinterface endReplaceGroup : ()V
/*      */     //   301: aload #8
/*      */     //   303: astore #7
/*      */     //   305: iconst_0
/*      */     //   306: istore #10
/*      */     //   308: nop
/*      */     //   309: iconst_0
/*      */     //   310: istore #11
/*      */     //   312: aload #4
/*      */     //   314: ldc 773894976
/*      */     //   316: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   318: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   321: aload #4
/*      */     //   323: astore #12
/*      */     //   325: aload #4
/*      */     //   327: ldc -954370320
/*      */     //   329: ldc 'CC(remember):Effects.kt#9igjgp'
/*      */     //   331: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   334: aload #4
/*      */     //   336: astore #13
/*      */     //   338: iconst_0
/*      */     //   339: istore #14
/*      */     //   341: iconst_0
/*      */     //   342: istore #15
/*      */     //   344: aload #13
/*      */     //   346: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   351: astore #16
/*      */     //   353: iconst_0
/*      */     //   354: istore #17
/*      */     //   356: aload #16
/*      */     //   358: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   361: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   364: if_acmpne -> 411
/*      */     //   367: iconst_0
/*      */     //   368: istore #18
/*      */     //   370: iconst_0
/*      */     //   371: istore #19
/*      */     //   373: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   376: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   379: aload #12
/*      */     //   381: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   384: astore #29
/*      */     //   386: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   389: dup
/*      */     //   390: aload #29
/*      */     //   392: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   395: astore #19
/*      */     //   397: aload #13
/*      */     //   399: aload #19
/*      */     //   401: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   406: aload #19
/*      */     //   408: goto -> 413
/*      */     //   411: aload #16
/*      */     //   413: nop
/*      */     //   414: nop
/*      */     //   415: nop
/*      */     //   416: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   419: astore #20
/*      */     //   421: aload #4
/*      */     //   423: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   426: aload #20
/*      */     //   428: astore #21
/*      */     //   430: aload #21
/*      */     //   432: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   435: astore #20
/*      */     //   437: aload #4
/*      */     //   439: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   442: aload #20
/*      */     //   444: nop
/*      */     //   445: astore #8
/*      */     //   447: ldc_w 1222748890
/*      */     //   450: iconst_1
/*      */     //   451: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$TextAreaScrollableContainer$1
/*      */     //   454: dup
/*      */     //   455: aload_0
/*      */     //   456: aload_1
/*      */     //   457: aload #7
/*      */     //   459: invokespecial <init> : (Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*      */     //   462: aload #4
/*      */     //   464: bipush #54
/*      */     //   466: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   469: checkcast kotlin/jvm/functions/Function2
/*      */     //   472: aconst_null
/*      */     //   473: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   476: checkcast androidx/compose/ui/Modifier
/*      */     //   479: aload_1
/*      */     //   480: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   483: invokeinterface getLingerDuration-UwyO8pc : ()J
/*      */     //   488: aload #8
/*      */     //   490: aload #4
/*      */     //   492: ldc_w -1234407178
/*      */     //   495: invokeinterface startReplaceGroup : (I)V
/*      */     //   500: aload #4
/*      */     //   502: astore #10
/*      */     //   504: iconst_0
/*      */     //   505: istore #11
/*      */     //   507: iconst_0
/*      */     //   508: istore #12
/*      */     //   510: aload #10
/*      */     //   512: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   517: astore #13
/*      */     //   519: iconst_0
/*      */     //   520: istore #14
/*      */     //   522: aload #13
/*      */     //   524: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   527: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   530: if_acmpne -> 583
/*      */     //   533: astore #27
/*      */     //   535: lstore #25
/*      */     //   537: astore #24
/*      */     //   539: astore #23
/*      */     //   541: astore #22
/*      */     //   543: iconst_0
/*      */     //   544: istore #15
/*      */     //   546: aload #7
/*      */     //   548: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   553: astore #28
/*      */     //   555: aload #22
/*      */     //   557: aload #23
/*      */     //   559: aload #24
/*      */     //   561: lload #25
/*      */     //   563: aload #27
/*      */     //   565: aload #28
/*      */     //   567: astore #16
/*      */     //   569: aload #10
/*      */     //   571: aload #16
/*      */     //   573: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   578: aload #16
/*      */     //   580: goto -> 585
/*      */     //   583: aload #13
/*      */     //   585: nop
/*      */     //   586: nop
/*      */     //   587: nop
/*      */     //   588: checkcast kotlin/jvm/functions/Function1
/*      */     //   591: astore #9
/*      */     //   593: aload #4
/*      */     //   595: invokeinterface endReplaceGroup : ()V
/*      */     //   600: aload #9
/*      */     //   602: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   605: aload_1
/*      */     //   606: ldc_w 1369249878
/*      */     //   609: iconst_1
/*      */     //   610: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$TextAreaScrollableContainer$3
/*      */     //   613: dup
/*      */     //   614: aload_2
/*      */     //   615: aload_3
/*      */     //   616: invokespecial <init> : (Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;)V
/*      */     //   619: aload #4
/*      */     //   621: bipush #54
/*      */     //   623: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   626: checkcast kotlin/jvm/functions/Function2
/*      */     //   629: aload #4
/*      */     //   631: sipush #24630
/*      */     //   634: sipush #7168
/*      */     //   637: iload #6
/*      */     //   639: bipush #6
/*      */     //   641: ishl
/*      */     //   642: iand
/*      */     //   643: ior
/*      */     //   644: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   647: invokestatic isTraceInProgress : ()Z
/*      */     //   650: ifeq -> 666
/*      */     //   653: invokestatic traceEventEnd : ()V
/*      */     //   656: goto -> 666
/*      */     //   659: aload #4
/*      */     //   661: invokeinterface skipToGroupEnd : ()V
/*      */     //   666: aload #4
/*      */     //   668: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   673: dup
/*      */     //   674: ifnull -> 696
/*      */     //   677: aload_0
/*      */     //   678: aload_1
/*      */     //   679: aload_2
/*      */     //   680: aload_3
/*      */     //   681: iload #5
/*      */     //   683: <illegal opcode> invoke : (Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*      */     //   688: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   693: goto -> 697
/*      */     //   696: pop
/*      */     //   697: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #91	-> 27
/*      */     //   #92	-> 228
/*      */     //   #594	-> 232
/*      */     //   #595	-> 244
/*      */     //   #596	-> 255
/*      */     //   #92	-> 258
/*      */     //   #596	-> 268
/*      */     //   #597	-> 270
/*      */     //   #598	-> 279
/*      */     //   #599	-> 284
/*      */     //   #595	-> 286
/*      */     //   #594	-> 287
/*      */     //   #594	-> 288
/*      */     //   #92	-> 289
/*      */     //   #93	-> 308
/*      */     //   #600	-> 318
/*      */     //   #601	-> 321
/*      */     //   #603	-> 323
/*      */     //   #604	-> 331
/*      */     //   #605	-> 344
/*      */     //   #606	-> 356
/*      */     //   #607	-> 367
/*      */     //   #608	-> 370
/*      */     //   #609	-> 370
/*      */     //   #610	-> 373
/*      */     //   #609	-> 376
/*      */     //   #608	-> 384
/*      */     //   #607	-> 395
/*      */     //   #611	-> 397
/*      */     //   #612	-> 406
/*      */     //   #613	-> 411
/*      */     //   #606	-> 413
/*      */     //   #605	-> 414
/*      */     //   #605	-> 415
/*      */     //   #604	-> 416
/*      */     //   #614	-> 430
/*      */     //   #600	-> 439
/*      */     //   #614	-> 444
/*      */     //   #93	-> 445
/*      */     //   #96	-> 447
/*      */     //   #104	-> 472
/*      */     //   #105	-> 473
/*      */     //   #615	-> 510
/*      */     //   #616	-> 522
/*      */     //   #617	-> 533
/*      */     //   #105	-> 546
/*      */     //   #617	-> 567
/*      */     //   #618	-> 569
/*      */     //   #619	-> 578
/*      */     //   #620	-> 583
/*      */     //   #616	-> 585
/*      */     //   #615	-> 586
/*      */     //   #615	-> 587
/*      */     //   #105	-> 588
/*      */     //   #106	-> 605
/*      */     //   #107	-> 606
/*      */     //   #95	-> 644
/*      */     //   #110	-> 659
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   258	10	14	$i$a$-cache-ScrollableContainerKt$TextAreaScrollableContainer$keepVisible$2	I
/*      */     //   270	11	14	value$iv	Ljava/lang/Object;
/*      */     //   244	43	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   241	46	12	it$iv	Ljava/lang/Object;
/*      */     //   232	57	11	$i$f$cache	I
/*      */     //   229	60	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   229	60	10	invalid$iv	Z
/*      */     //   373	3	19	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   370	25	18	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   397	11	19	value$iv$iv	Ljava/lang/Object;
/*      */     //   356	58	17	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   353	61	16	it$iv$iv	Ljava/lang/Object;
/*      */     //   344	72	15	$i$f$cache	I
/*      */     //   341	75	13	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   341	75	14	invalid$iv$iv	Z
/*      */     //   312	133	11	$i$f$rememberCoroutineScope	I
/*      */     //   325	120	12	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   430	15	21	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   309	136	10	$changed$iv	I
/*      */     //   546	7	15	$i$a$-cache-ScrollableContainerKt$TextAreaScrollableContainer$2	I
/*      */     //   569	11	16	value$iv	Ljava/lang/Object;
/*      */     //   522	64	14	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   519	67	13	it$iv	Ljava/lang/Object;
/*      */     //   510	78	12	$i$f$cache	I
/*      */     //   507	81	10	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   507	81	11	invalid$iv	Z
/*      */     //   305	351	7	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   447	209	8	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   43	655	6	$dirty	I
/*      */     //   0	698	0	scrollState	Landroidx/compose/foundation/ScrollState;
/*      */     //   0	698	1	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	698	2	contentModifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	698	3	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	698	4	$composer	Landroidx/compose/runtime/Composer;
/*  988 */     //   0	698	5	$changed	I } private static final boolean TextAreaScrollableContainer$lambda$8(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void TextAreaScrollableContainer$lambda$9(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/*  989 */     mutableState.setValue(value$iv); }
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$TextAreaScrollableContainer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,560:1\n149#2:561\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$TextAreaScrollableContainer$1\n*L\n100#1:561\n*E\n"}) static final class ScrollableContainerKt$TextAreaScrollableContainer$1 implements Function2<Composer, Integer, Unit> {
/*  991 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1222748890, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaScrollableContainer.<anonymous> (ScrollableContainer.kt:96)");  int $this$dp$iv = 1, $i$f$getDp = 0; Modifier modifier = PaddingKt.padding-3ABfNKs(PointerIconKt.pointerHoverIcon$default((Modifier)Modifier.Companion, PointerIcon.Companion.getDefault(), false, 2, null), Dp.constructor-impl($this$dp$iv)); boolean bool = ScrollableContainerKt.TextAreaScrollableContainer$lambda$8(this.$keepVisible$delegate); ScrollbarKt.VerticalScrollbar((ScrollableState)this.$scrollState, modifier, false, false, null, this.$style, bool, $composer, 0, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$TextAreaScrollableContainer$1(ScrollState $scrollState, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final Unit TextAreaScrollableContainer$lambda$11$lambda$10(MutableState<Boolean> $keepVisible$delegate, boolean it) { TextAreaScrollableContainer$lambda$9($keepVisible$delegate, it); return Unit.INSTANCE; } private static final boolean VerticallyScrollableContainer$lambda$15(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$TextAreaScrollableContainer$3\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$TextAreaScrollableContainer$3\n*L\n108#1:561\n108#1:562,6\n108#1:596\n108#1:600\n108#1:568,6\n108#1:583,4\n108#1:593,2\n108#1:599\n108#1:574,9\n108#1:595\n108#1:597,2\n108#1:587,6\n*E\n"}) static final class ScrollableContainerKt$TextAreaScrollableContainer$3 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1369249878, $changed, -1, "org.jetbrains.jewel.ui.component.TextAreaScrollableContainer.<anonymous> (ScrollableContainer.kt:107)");  Modifier modifier1 = LayoutIdKt.layoutId(this.$contentModifier, "VerticallyScrollableContainer_content"); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$TextAreaScrollableContainer$3$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$TextAreaScrollableContainer$3(Modifier $contentModifier, Function2<Composer, Integer, Unit> $content) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void VerticallyScrollableContainer(@NotNull LazyListState scrollState, @Nullable Modifier modifier, @Nullable Modifier scrollbarModifier, @Nullable ScrollbarStyle style, boolean reverseLayout, boolean scrollbarEnabled, @Nullable MutableInteractionSource scrollbarInteractionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'scrollState'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #7
/*      */     //   9: ldc 'content'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload #8
/*      */     //   16: ldc_w 1248637621
/*      */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   24: astore #8
/*      */     //   26: iload #9
/*      */     //   28: istore #11
/*      */     //   30: iload #10
/*      */     //   32: iconst_1
/*      */     //   33: iand
/*      */     //   34: ifeq -> 47
/*      */     //   37: iload #11
/*      */     //   39: bipush #6
/*      */     //   41: ior
/*      */     //   42: istore #11
/*      */     //   44: goto -> 76
/*      */     //   47: iload #9
/*      */     //   49: bipush #6
/*      */     //   51: iand
/*      */     //   52: ifne -> 76
/*      */     //   55: iload #11
/*      */     //   57: aload #8
/*      */     //   59: aload_0
/*      */     //   60: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   65: ifeq -> 72
/*      */     //   68: iconst_4
/*      */     //   69: goto -> 73
/*      */     //   72: iconst_2
/*      */     //   73: ior
/*      */     //   74: istore #11
/*      */     //   76: iload #10
/*      */     //   78: iconst_2
/*      */     //   79: iand
/*      */     //   80: ifeq -> 93
/*      */     //   83: iload #11
/*      */     //   85: bipush #48
/*      */     //   87: ior
/*      */     //   88: istore #11
/*      */     //   90: goto -> 124
/*      */     //   93: iload #9
/*      */     //   95: bipush #48
/*      */     //   97: iand
/*      */     //   98: ifne -> 124
/*      */     //   101: iload #11
/*      */     //   103: aload #8
/*      */     //   105: aload_1
/*      */     //   106: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   111: ifeq -> 119
/*      */     //   114: bipush #32
/*      */     //   116: goto -> 121
/*      */     //   119: bipush #16
/*      */     //   121: ior
/*      */     //   122: istore #11
/*      */     //   124: iload #10
/*      */     //   126: iconst_4
/*      */     //   127: iand
/*      */     //   128: ifeq -> 142
/*      */     //   131: iload #11
/*      */     //   133: sipush #384
/*      */     //   136: ior
/*      */     //   137: istore #11
/*      */     //   139: goto -> 176
/*      */     //   142: iload #9
/*      */     //   144: sipush #384
/*      */     //   147: iand
/*      */     //   148: ifne -> 176
/*      */     //   151: iload #11
/*      */     //   153: aload #8
/*      */     //   155: aload_2
/*      */     //   156: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   161: ifeq -> 170
/*      */     //   164: sipush #256
/*      */     //   167: goto -> 173
/*      */     //   170: sipush #128
/*      */     //   173: ior
/*      */     //   174: istore #11
/*      */     //   176: iload #9
/*      */     //   178: sipush #3072
/*      */     //   181: iand
/*      */     //   182: ifne -> 218
/*      */     //   185: iload #11
/*      */     //   187: iload #10
/*      */     //   189: bipush #8
/*      */     //   191: iand
/*      */     //   192: ifne -> 212
/*      */     //   195: aload #8
/*      */     //   197: aload_3
/*      */     //   198: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   203: ifeq -> 212
/*      */     //   206: sipush #2048
/*      */     //   209: goto -> 215
/*      */     //   212: sipush #1024
/*      */     //   215: ior
/*      */     //   216: istore #11
/*      */     //   218: iload #10
/*      */     //   220: bipush #16
/*      */     //   222: iand
/*      */     //   223: ifeq -> 237
/*      */     //   226: iload #11
/*      */     //   228: sipush #24576
/*      */     //   231: ior
/*      */     //   232: istore #11
/*      */     //   234: goto -> 272
/*      */     //   237: iload #9
/*      */     //   239: sipush #24576
/*      */     //   242: iand
/*      */     //   243: ifne -> 272
/*      */     //   246: iload #11
/*      */     //   248: aload #8
/*      */     //   250: iload #4
/*      */     //   252: invokeinterface changed : (Z)Z
/*      */     //   257: ifeq -> 266
/*      */     //   260: sipush #16384
/*      */     //   263: goto -> 269
/*      */     //   266: sipush #8192
/*      */     //   269: ior
/*      */     //   270: istore #11
/*      */     //   272: iload #10
/*      */     //   274: bipush #32
/*      */     //   276: iand
/*      */     //   277: ifeq -> 290
/*      */     //   280: iload #11
/*      */     //   282: ldc 196608
/*      */     //   284: ior
/*      */     //   285: istore #11
/*      */     //   287: goto -> 322
/*      */     //   290: iload #9
/*      */     //   292: ldc 196608
/*      */     //   294: iand
/*      */     //   295: ifne -> 322
/*      */     //   298: iload #11
/*      */     //   300: aload #8
/*      */     //   302: iload #5
/*      */     //   304: invokeinterface changed : (Z)Z
/*      */     //   309: ifeq -> 317
/*      */     //   312: ldc 131072
/*      */     //   314: goto -> 319
/*      */     //   317: ldc 65536
/*      */     //   319: ior
/*      */     //   320: istore #11
/*      */     //   322: iload #10
/*      */     //   324: bipush #64
/*      */     //   326: iand
/*      */     //   327: ifeq -> 340
/*      */     //   330: iload #11
/*      */     //   332: ldc 1572864
/*      */     //   334: ior
/*      */     //   335: istore #11
/*      */     //   337: goto -> 372
/*      */     //   340: iload #9
/*      */     //   342: ldc 1572864
/*      */     //   344: iand
/*      */     //   345: ifne -> 372
/*      */     //   348: iload #11
/*      */     //   350: aload #8
/*      */     //   352: aload #6
/*      */     //   354: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   359: ifeq -> 367
/*      */     //   362: ldc 1048576
/*      */     //   364: goto -> 369
/*      */     //   367: ldc 524288
/*      */     //   369: ior
/*      */     //   370: istore #11
/*      */     //   372: iload #10
/*      */     //   374: sipush #128
/*      */     //   377: iand
/*      */     //   378: ifeq -> 391
/*      */     //   381: iload #11
/*      */     //   383: ldc 12582912
/*      */     //   385: ior
/*      */     //   386: istore #11
/*      */     //   388: goto -> 423
/*      */     //   391: iload #9
/*      */     //   393: ldc 12582912
/*      */     //   395: iand
/*      */     //   396: ifne -> 423
/*      */     //   399: iload #11
/*      */     //   401: aload #8
/*      */     //   403: aload #7
/*      */     //   405: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   410: ifeq -> 418
/*      */     //   413: ldc 8388608
/*      */     //   415: goto -> 420
/*      */     //   418: ldc 4194304
/*      */     //   420: ior
/*      */     //   421: istore #11
/*      */     //   423: iload #11
/*      */     //   425: ldc 4793491
/*      */     //   427: iand
/*      */     //   428: ldc 4793490
/*      */     //   430: if_icmpne -> 443
/*      */     //   433: aload #8
/*      */     //   435: invokeinterface getSkipping : ()Z
/*      */     //   440: ifne -> 1136
/*      */     //   443: aload #8
/*      */     //   445: invokeinterface startDefaults : ()V
/*      */     //   450: iload #9
/*      */     //   452: iconst_1
/*      */     //   453: iand
/*      */     //   454: ifeq -> 467
/*      */     //   457: aload #8
/*      */     //   459: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   464: ifeq -> 641
/*      */     //   467: iload #10
/*      */     //   469: iconst_2
/*      */     //   470: iand
/*      */     //   471: ifeq -> 481
/*      */     //   474: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   477: checkcast androidx/compose/ui/Modifier
/*      */     //   480: astore_1
/*      */     //   481: iload #10
/*      */     //   483: iconst_4
/*      */     //   484: iand
/*      */     //   485: ifeq -> 495
/*      */     //   488: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   491: checkcast androidx/compose/ui/Modifier
/*      */     //   494: astore_2
/*      */     //   495: iload #10
/*      */     //   497: bipush #8
/*      */     //   499: iand
/*      */     //   500: ifeq -> 522
/*      */     //   503: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   506: aload #8
/*      */     //   508: bipush #6
/*      */     //   510: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   513: astore_3
/*      */     //   514: iload #11
/*      */     //   516: sipush #-7169
/*      */     //   519: iand
/*      */     //   520: istore #11
/*      */     //   522: iload #10
/*      */     //   524: bipush #16
/*      */     //   526: iand
/*      */     //   527: ifeq -> 533
/*      */     //   530: iconst_0
/*      */     //   531: istore #4
/*      */     //   533: iload #10
/*      */     //   535: bipush #32
/*      */     //   537: iand
/*      */     //   538: ifeq -> 544
/*      */     //   541: iconst_1
/*      */     //   542: istore #5
/*      */     //   544: iload #10
/*      */     //   546: bipush #64
/*      */     //   548: iand
/*      */     //   549: ifeq -> 664
/*      */     //   552: aload #8
/*      */     //   554: ldc_w 1469502720
/*      */     //   557: invokeinterface startReplaceGroup : (I)V
/*      */     //   562: aload #8
/*      */     //   564: astore #13
/*      */     //   566: iconst_0
/*      */     //   567: istore #14
/*      */     //   569: iconst_0
/*      */     //   570: istore #15
/*      */     //   572: aload #13
/*      */     //   574: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   579: astore #16
/*      */     //   581: iconst_0
/*      */     //   582: istore #17
/*      */     //   584: aload #16
/*      */     //   586: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   589: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   592: if_acmpne -> 617
/*      */     //   595: iconst_0
/*      */     //   596: istore #18
/*      */     //   598: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   601: astore #18
/*      */     //   603: aload #13
/*      */     //   605: aload #18
/*      */     //   607: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   612: aload #18
/*      */     //   614: goto -> 619
/*      */     //   617: aload #16
/*      */     //   619: nop
/*      */     //   620: nop
/*      */     //   621: nop
/*      */     //   622: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   625: astore #12
/*      */     //   627: aload #8
/*      */     //   629: invokeinterface endReplaceGroup : ()V
/*      */     //   634: aload #12
/*      */     //   636: astore #6
/*      */     //   638: goto -> 664
/*      */     //   641: aload #8
/*      */     //   643: invokeinterface skipToGroupEnd : ()V
/*      */     //   648: iload #10
/*      */     //   650: bipush #8
/*      */     //   652: iand
/*      */     //   653: ifeq -> 664
/*      */     //   656: iload #11
/*      */     //   658: sipush #-7169
/*      */     //   661: iand
/*      */     //   662: istore #11
/*      */     //   664: aload #8
/*      */     //   666: invokeinterface endDefaults : ()V
/*      */     //   671: invokestatic isTraceInProgress : ()Z
/*      */     //   674: ifeq -> 689
/*      */     //   677: ldc_w 1248637621
/*      */     //   680: iload #11
/*      */     //   682: iconst_m1
/*      */     //   683: ldc_w 'org.jetbrains.jewel.ui.component.VerticallyScrollableContainer (ScrollableContainer.kt:121)'
/*      */     //   686: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   689: aload #8
/*      */     //   691: ldc_w 1469506075
/*      */     //   694: invokeinterface startReplaceGroup : (I)V
/*      */     //   699: aload #8
/*      */     //   701: astore #14
/*      */     //   703: iconst_0
/*      */     //   704: istore #15
/*      */     //   706: nop
/*      */     //   707: iconst_0
/*      */     //   708: istore #16
/*      */     //   710: aload #14
/*      */     //   712: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   717: astore #17
/*      */     //   719: iconst_0
/*      */     //   720: istore #18
/*      */     //   722: aload #17
/*      */     //   724: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   727: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   730: if_acmpne -> 762
/*      */     //   733: iconst_0
/*      */     //   734: istore #19
/*      */     //   736: iconst_0
/*      */     //   737: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   740: aconst_null
/*      */     //   741: iconst_2
/*      */     //   742: aconst_null
/*      */     //   743: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   746: astore #19
/*      */     //   748: aload #14
/*      */     //   750: aload #19
/*      */     //   752: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   757: aload #19
/*      */     //   759: goto -> 764
/*      */     //   762: aload #17
/*      */     //   764: nop
/*      */     //   765: nop
/*      */     //   766: nop
/*      */     //   767: checkcast androidx/compose/runtime/MutableState
/*      */     //   770: astore #13
/*      */     //   772: aload #8
/*      */     //   774: invokeinterface endReplaceGroup : ()V
/*      */     //   779: aload #13
/*      */     //   781: astore #12
/*      */     //   783: iconst_0
/*      */     //   784: istore #15
/*      */     //   786: nop
/*      */     //   787: iconst_0
/*      */     //   788: istore #16
/*      */     //   790: aload #8
/*      */     //   792: ldc 773894976
/*      */     //   794: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   796: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   799: aload #8
/*      */     //   801: astore #17
/*      */     //   803: aload #8
/*      */     //   805: ldc -954370320
/*      */     //   807: ldc 'CC(remember):Effects.kt#9igjgp'
/*      */     //   809: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   812: aload #8
/*      */     //   814: astore #18
/*      */     //   816: iconst_0
/*      */     //   817: istore #19
/*      */     //   819: iconst_0
/*      */     //   820: istore #20
/*      */     //   822: aload #18
/*      */     //   824: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   829: astore #21
/*      */     //   831: iconst_0
/*      */     //   832: istore #22
/*      */     //   834: aload #21
/*      */     //   836: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   839: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   842: if_acmpne -> 889
/*      */     //   845: iconst_0
/*      */     //   846: istore #23
/*      */     //   848: iconst_0
/*      */     //   849: istore #24
/*      */     //   851: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   854: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   857: aload #17
/*      */     //   859: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   862: astore #34
/*      */     //   864: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   867: dup
/*      */     //   868: aload #34
/*      */     //   870: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   873: astore #24
/*      */     //   875: aload #18
/*      */     //   877: aload #24
/*      */     //   879: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   884: aload #24
/*      */     //   886: goto -> 891
/*      */     //   889: aload #21
/*      */     //   891: nop
/*      */     //   892: nop
/*      */     //   893: nop
/*      */     //   894: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   897: astore #25
/*      */     //   899: aload #8
/*      */     //   901: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   904: aload #25
/*      */     //   906: astore #26
/*      */     //   908: aload #26
/*      */     //   910: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   913: astore #25
/*      */     //   915: aload #8
/*      */     //   917: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   920: aload #25
/*      */     //   922: nop
/*      */     //   923: astore #13
/*      */     //   925: ldc_w -806472220
/*      */     //   928: iconst_1
/*      */     //   929: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$7
/*      */     //   932: dup
/*      */     //   933: aload_0
/*      */     //   934: aload_2
/*      */     //   935: iload #4
/*      */     //   937: iload #5
/*      */     //   939: aload #6
/*      */     //   941: aload_3
/*      */     //   942: aload #12
/*      */     //   944: invokespecial <init> : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*      */     //   947: aload #8
/*      */     //   949: bipush #54
/*      */     //   951: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   954: checkcast kotlin/jvm/functions/Function2
/*      */     //   957: aconst_null
/*      */     //   958: aload_1
/*      */     //   959: aload_3
/*      */     //   960: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   963: invokeinterface getLingerDuration-UwyO8pc : ()J
/*      */     //   968: aload #13
/*      */     //   970: aload #8
/*      */     //   972: ldc_w 1469526509
/*      */     //   975: invokeinterface startReplaceGroup : (I)V
/*      */     //   980: aload #8
/*      */     //   982: astore #15
/*      */     //   984: iconst_0
/*      */     //   985: istore #16
/*      */     //   987: iconst_0
/*      */     //   988: istore #17
/*      */     //   990: aload #15
/*      */     //   992: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   997: astore #18
/*      */     //   999: iconst_0
/*      */     //   1000: istore #19
/*      */     //   1002: aload #18
/*      */     //   1004: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1007: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1010: if_acmpne -> 1063
/*      */     //   1013: astore #32
/*      */     //   1015: lstore #30
/*      */     //   1017: astore #29
/*      */     //   1019: astore #28
/*      */     //   1021: astore #27
/*      */     //   1023: iconst_0
/*      */     //   1024: istore #20
/*      */     //   1026: aload #12
/*      */     //   1028: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1033: astore #33
/*      */     //   1035: aload #27
/*      */     //   1037: aload #28
/*      */     //   1039: aload #29
/*      */     //   1041: lload #30
/*      */     //   1043: aload #32
/*      */     //   1045: aload #33
/*      */     //   1047: astore #21
/*      */     //   1049: aload #15
/*      */     //   1051: aload #21
/*      */     //   1053: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1058: aload #21
/*      */     //   1060: goto -> 1065
/*      */     //   1063: aload #18
/*      */     //   1065: nop
/*      */     //   1066: nop
/*      */     //   1067: nop
/*      */     //   1068: checkcast kotlin/jvm/functions/Function1
/*      */     //   1071: astore #14
/*      */     //   1073: aload #8
/*      */     //   1075: invokeinterface endReplaceGroup : ()V
/*      */     //   1080: aload #14
/*      */     //   1082: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1085: aload_3
/*      */     //   1086: ldc_w 193932896
/*      */     //   1089: iconst_1
/*      */     //   1090: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$9
/*      */     //   1093: dup
/*      */     //   1094: aload #7
/*      */     //   1096: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1099: aload #8
/*      */     //   1101: bipush #54
/*      */     //   1103: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1106: checkcast kotlin/jvm/functions/Function2
/*      */     //   1109: aload #8
/*      */     //   1111: sipush #24630
/*      */     //   1114: sipush #7168
/*      */     //   1117: iload #11
/*      */     //   1119: iand
/*      */     //   1120: ior
/*      */     //   1121: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1124: invokestatic isTraceInProgress : ()Z
/*      */     //   1127: ifeq -> 1143
/*      */     //   1130: invokestatic traceEventEnd : ()V
/*      */     //   1133: goto -> 1143
/*      */     //   1136: aload #8
/*      */     //   1138: invokeinterface skipToGroupEnd : ()V
/*      */     //   1143: aload #8
/*      */     //   1145: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1150: dup
/*      */     //   1151: ifnull -> 1183
/*      */     //   1154: aload_0
/*      */     //   1155: aload_1
/*      */     //   1156: aload_2
/*      */     //   1157: aload_3
/*      */     //   1158: iload #4
/*      */     //   1160: iload #5
/*      */     //   1162: aload #6
/*      */     //   1164: aload #7
/*      */     //   1166: iload #9
/*      */     //   1168: iload #10
/*      */     //   1170: <illegal opcode> invoke : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1175: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1180: goto -> 1184
/*      */     //   1183: pop
/*      */     //   1184: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #122	-> 14
/*      */     //   #115	-> 474
/*      */     //   #116	-> 488
/*      */     //   #117	-> 503
/*      */     //   #118	-> 530
/*      */     //   #119	-> 541
/*      */     //   #120	-> 552
/*      */     //   #621	-> 572
/*      */     //   #622	-> 584
/*      */     //   #623	-> 595
/*      */     //   #120	-> 598
/*      */     //   #623	-> 601
/*      */     //   #624	-> 603
/*      */     //   #625	-> 612
/*      */     //   #626	-> 617
/*      */     //   #622	-> 619
/*      */     //   #621	-> 620
/*      */     //   #621	-> 621
/*      */     //   #120	-> 622
/*      */     //   #122	-> 686
/*      */     //   #123	-> 706
/*      */     //   #627	-> 710
/*      */     //   #628	-> 722
/*      */     //   #629	-> 733
/*      */     //   #123	-> 736
/*      */     //   #629	-> 746
/*      */     //   #630	-> 748
/*      */     //   #631	-> 757
/*      */     //   #632	-> 762
/*      */     //   #628	-> 764
/*      */     //   #627	-> 765
/*      */     //   #627	-> 766
/*      */     //   #123	-> 767
/*      */     //   #124	-> 786
/*      */     //   #633	-> 796
/*      */     //   #634	-> 799
/*      */     //   #636	-> 801
/*      */     //   #637	-> 809
/*      */     //   #638	-> 822
/*      */     //   #639	-> 834
/*      */     //   #640	-> 845
/*      */     //   #641	-> 848
/*      */     //   #642	-> 848
/*      */     //   #643	-> 851
/*      */     //   #642	-> 854
/*      */     //   #641	-> 862
/*      */     //   #640	-> 873
/*      */     //   #644	-> 875
/*      */     //   #645	-> 884
/*      */     //   #646	-> 889
/*      */     //   #639	-> 891
/*      */     //   #638	-> 892
/*      */     //   #638	-> 893
/*      */     //   #637	-> 894
/*      */     //   #647	-> 908
/*      */     //   #633	-> 917
/*      */     //   #647	-> 922
/*      */     //   #124	-> 923
/*      */     //   #127	-> 925
/*      */     //   #138	-> 957
/*      */     //   #139	-> 958
/*      */     //   #648	-> 990
/*      */     //   #649	-> 1002
/*      */     //   #650	-> 1013
/*      */     //   #139	-> 1026
/*      */     //   #650	-> 1047
/*      */     //   #651	-> 1049
/*      */     //   #652	-> 1058
/*      */     //   #653	-> 1063
/*      */     //   #649	-> 1065
/*      */     //   #648	-> 1066
/*      */     //   #648	-> 1067
/*      */     //   #139	-> 1068
/*      */     //   #140	-> 1085
/*      */     //   #141	-> 1086
/*      */     //   #126	-> 1121
/*      */     //   #144	-> 1136
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   598	3	18	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$6	I
/*      */     //   603	11	18	value$iv	Ljava/lang/Object;
/*      */     //   584	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   581	39	16	it$iv	Ljava/lang/Object;
/*      */     //   572	50	15	$i$f$cache	I
/*      */     //   569	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   569	53	14	invalid$iv	Z
/*      */     //   736	10	19	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$keepVisible$4	I
/*      */     //   748	11	19	value$iv	Ljava/lang/Object;
/*      */     //   722	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   719	46	17	it$iv	Ljava/lang/Object;
/*      */     //   710	57	16	$i$f$cache	I
/*      */     //   707	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   707	60	15	invalid$iv	Z
/*      */     //   851	3	24	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   848	25	23	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   875	11	24	value$iv$iv	Ljava/lang/Object;
/*      */     //   834	58	22	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   831	61	21	it$iv$iv	Ljava/lang/Object;
/*      */     //   822	72	20	$i$f$cache	I
/*      */     //   819	75	18	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   819	75	19	invalid$iv$iv	Z
/*      */     //   790	133	16	$i$f$rememberCoroutineScope	I
/*      */     //   803	120	17	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   908	15	26	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   787	136	15	$changed$iv	I
/*      */     //   1026	7	20	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$8	I
/*      */     //   1049	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1002	64	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   999	67	18	it$iv	Ljava/lang/Object;
/*      */     //   990	78	17	$i$f$cache	I
/*      */     //   987	81	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   987	81	16	invalid$iv	Z
/*      */     //   783	350	12	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   925	208	13	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   30	1155	11	$dirty	I
/*      */     //   0	1185	0	scrollState	Landroidx/compose/foundation/lazy/LazyListState;
/*      */     //   0	1185	1	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	2	scrollbarModifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	3	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	1185	4	reverseLayout	Z
/*      */     //   0	1185	5	scrollbarEnabled	Z
/*      */     //   0	1185	6	scrollbarInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	1185	7	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1185	8	$composer	Landroidx/compose/runtime/Composer;
/*  992 */     //   0	1185	9	$changed	I } private static final void VerticallyScrollableContainer$lambda$16(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$VerticallyScrollableContainer$7 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-806472220, $changed, -1, "org.jetbrains.jewel.ui.component.VerticallyScrollableContainer.<anonymous> (ScrollableContainer.kt:127)");  boolean bool = ScrollableContainerKt.VerticallyScrollableContainer$lambda$15(this.$keepVisible$delegate); ScrollbarKt.VerticalScrollbar((ScrollableState)this.$scrollState, this.$scrollbarModifier, this.$reverseLayout, this.$scrollbarEnabled, this.$scrollbarInteractionSource, this.$style, bool, $composer, 0, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$VerticallyScrollableContainer$7(LazyListState $scrollState, Modifier $scrollbarModifier, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final Unit VerticallyScrollableContainer$lambda$18$lambda$17(MutableState<Boolean> $keepVisible$delegate, boolean it) { VerticallyScrollableContainer$lambda$16($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$9\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$9\n*L\n142#1:561\n142#1:562,6\n142#1:596\n142#1:600\n142#1:568,6\n142#1:583,4\n142#1:593,2\n142#1:599\n142#1:574,9\n142#1:595\n142#1:597,2\n142#1:587,6\n*E\n"}) static final class ScrollableContainerKt$VerticallyScrollableContainer$9 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(193932896, $changed, -1, "org.jetbrains.jewel.ui.component.VerticallyScrollableContainer.<anonymous> (ScrollableContainer.kt:141)");  Modifier modifier1 = LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 6, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$VerticallyScrollableContainer$9$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$VerticallyScrollableContainer$9(Function2<Composer, Integer, Unit> $content) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void VerticallyScrollableContainer(@NotNull LazyGridState scrollState, @Nullable Modifier modifier, @Nullable Modifier scrollbarModifier, @Nullable ScrollbarStyle style, boolean reverseLayout, boolean scrollbarEnabled, @Nullable MutableInteractionSource scrollbarInteractionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'scrollState'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #7
/*      */     //   9: ldc 'content'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload #8
/*      */     //   16: ldc_w -1741064947
/*      */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   24: astore #8
/*      */     //   26: iload #9
/*      */     //   28: istore #11
/*      */     //   30: iload #10
/*      */     //   32: iconst_1
/*      */     //   33: iand
/*      */     //   34: ifeq -> 47
/*      */     //   37: iload #11
/*      */     //   39: bipush #6
/*      */     //   41: ior
/*      */     //   42: istore #11
/*      */     //   44: goto -> 76
/*      */     //   47: iload #9
/*      */     //   49: bipush #6
/*      */     //   51: iand
/*      */     //   52: ifne -> 76
/*      */     //   55: iload #11
/*      */     //   57: aload #8
/*      */     //   59: aload_0
/*      */     //   60: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   65: ifeq -> 72
/*      */     //   68: iconst_4
/*      */     //   69: goto -> 73
/*      */     //   72: iconst_2
/*      */     //   73: ior
/*      */     //   74: istore #11
/*      */     //   76: iload #10
/*      */     //   78: iconst_2
/*      */     //   79: iand
/*      */     //   80: ifeq -> 93
/*      */     //   83: iload #11
/*      */     //   85: bipush #48
/*      */     //   87: ior
/*      */     //   88: istore #11
/*      */     //   90: goto -> 124
/*      */     //   93: iload #9
/*      */     //   95: bipush #48
/*      */     //   97: iand
/*      */     //   98: ifne -> 124
/*      */     //   101: iload #11
/*      */     //   103: aload #8
/*      */     //   105: aload_1
/*      */     //   106: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   111: ifeq -> 119
/*      */     //   114: bipush #32
/*      */     //   116: goto -> 121
/*      */     //   119: bipush #16
/*      */     //   121: ior
/*      */     //   122: istore #11
/*      */     //   124: iload #10
/*      */     //   126: iconst_4
/*      */     //   127: iand
/*      */     //   128: ifeq -> 142
/*      */     //   131: iload #11
/*      */     //   133: sipush #384
/*      */     //   136: ior
/*      */     //   137: istore #11
/*      */     //   139: goto -> 176
/*      */     //   142: iload #9
/*      */     //   144: sipush #384
/*      */     //   147: iand
/*      */     //   148: ifne -> 176
/*      */     //   151: iload #11
/*      */     //   153: aload #8
/*      */     //   155: aload_2
/*      */     //   156: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   161: ifeq -> 170
/*      */     //   164: sipush #256
/*      */     //   167: goto -> 173
/*      */     //   170: sipush #128
/*      */     //   173: ior
/*      */     //   174: istore #11
/*      */     //   176: iload #9
/*      */     //   178: sipush #3072
/*      */     //   181: iand
/*      */     //   182: ifne -> 218
/*      */     //   185: iload #11
/*      */     //   187: iload #10
/*      */     //   189: bipush #8
/*      */     //   191: iand
/*      */     //   192: ifne -> 212
/*      */     //   195: aload #8
/*      */     //   197: aload_3
/*      */     //   198: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   203: ifeq -> 212
/*      */     //   206: sipush #2048
/*      */     //   209: goto -> 215
/*      */     //   212: sipush #1024
/*      */     //   215: ior
/*      */     //   216: istore #11
/*      */     //   218: iload #10
/*      */     //   220: bipush #16
/*      */     //   222: iand
/*      */     //   223: ifeq -> 237
/*      */     //   226: iload #11
/*      */     //   228: sipush #24576
/*      */     //   231: ior
/*      */     //   232: istore #11
/*      */     //   234: goto -> 272
/*      */     //   237: iload #9
/*      */     //   239: sipush #24576
/*      */     //   242: iand
/*      */     //   243: ifne -> 272
/*      */     //   246: iload #11
/*      */     //   248: aload #8
/*      */     //   250: iload #4
/*      */     //   252: invokeinterface changed : (Z)Z
/*      */     //   257: ifeq -> 266
/*      */     //   260: sipush #16384
/*      */     //   263: goto -> 269
/*      */     //   266: sipush #8192
/*      */     //   269: ior
/*      */     //   270: istore #11
/*      */     //   272: iload #10
/*      */     //   274: bipush #32
/*      */     //   276: iand
/*      */     //   277: ifeq -> 290
/*      */     //   280: iload #11
/*      */     //   282: ldc 196608
/*      */     //   284: ior
/*      */     //   285: istore #11
/*      */     //   287: goto -> 322
/*      */     //   290: iload #9
/*      */     //   292: ldc 196608
/*      */     //   294: iand
/*      */     //   295: ifne -> 322
/*      */     //   298: iload #11
/*      */     //   300: aload #8
/*      */     //   302: iload #5
/*      */     //   304: invokeinterface changed : (Z)Z
/*      */     //   309: ifeq -> 317
/*      */     //   312: ldc 131072
/*      */     //   314: goto -> 319
/*      */     //   317: ldc 65536
/*      */     //   319: ior
/*      */     //   320: istore #11
/*      */     //   322: iload #10
/*      */     //   324: bipush #64
/*      */     //   326: iand
/*      */     //   327: ifeq -> 340
/*      */     //   330: iload #11
/*      */     //   332: ldc 1572864
/*      */     //   334: ior
/*      */     //   335: istore #11
/*      */     //   337: goto -> 372
/*      */     //   340: iload #9
/*      */     //   342: ldc 1572864
/*      */     //   344: iand
/*      */     //   345: ifne -> 372
/*      */     //   348: iload #11
/*      */     //   350: aload #8
/*      */     //   352: aload #6
/*      */     //   354: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   359: ifeq -> 367
/*      */     //   362: ldc 1048576
/*      */     //   364: goto -> 369
/*      */     //   367: ldc 524288
/*      */     //   369: ior
/*      */     //   370: istore #11
/*      */     //   372: iload #10
/*      */     //   374: sipush #128
/*      */     //   377: iand
/*      */     //   378: ifeq -> 391
/*      */     //   381: iload #11
/*      */     //   383: ldc 12582912
/*      */     //   385: ior
/*      */     //   386: istore #11
/*      */     //   388: goto -> 423
/*      */     //   391: iload #9
/*      */     //   393: ldc 12582912
/*      */     //   395: iand
/*      */     //   396: ifne -> 423
/*      */     //   399: iload #11
/*      */     //   401: aload #8
/*      */     //   403: aload #7
/*      */     //   405: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   410: ifeq -> 418
/*      */     //   413: ldc 8388608
/*      */     //   415: goto -> 420
/*      */     //   418: ldc 4194304
/*      */     //   420: ior
/*      */     //   421: istore #11
/*      */     //   423: iload #11
/*      */     //   425: ldc 4793491
/*      */     //   427: iand
/*      */     //   428: ldc 4793490
/*      */     //   430: if_icmpne -> 443
/*      */     //   433: aload #8
/*      */     //   435: invokeinterface getSkipping : ()Z
/*      */     //   440: ifne -> 1136
/*      */     //   443: aload #8
/*      */     //   445: invokeinterface startDefaults : ()V
/*      */     //   450: iload #9
/*      */     //   452: iconst_1
/*      */     //   453: iand
/*      */     //   454: ifeq -> 467
/*      */     //   457: aload #8
/*      */     //   459: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   464: ifeq -> 641
/*      */     //   467: iload #10
/*      */     //   469: iconst_2
/*      */     //   470: iand
/*      */     //   471: ifeq -> 481
/*      */     //   474: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   477: checkcast androidx/compose/ui/Modifier
/*      */     //   480: astore_1
/*      */     //   481: iload #10
/*      */     //   483: iconst_4
/*      */     //   484: iand
/*      */     //   485: ifeq -> 495
/*      */     //   488: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   491: checkcast androidx/compose/ui/Modifier
/*      */     //   494: astore_2
/*      */     //   495: iload #10
/*      */     //   497: bipush #8
/*      */     //   499: iand
/*      */     //   500: ifeq -> 522
/*      */     //   503: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   506: aload #8
/*      */     //   508: bipush #6
/*      */     //   510: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   513: astore_3
/*      */     //   514: iload #11
/*      */     //   516: sipush #-7169
/*      */     //   519: iand
/*      */     //   520: istore #11
/*      */     //   522: iload #10
/*      */     //   524: bipush #16
/*      */     //   526: iand
/*      */     //   527: ifeq -> 533
/*      */     //   530: iconst_0
/*      */     //   531: istore #4
/*      */     //   533: iload #10
/*      */     //   535: bipush #32
/*      */     //   537: iand
/*      */     //   538: ifeq -> 544
/*      */     //   541: iconst_1
/*      */     //   542: istore #5
/*      */     //   544: iload #10
/*      */     //   546: bipush #64
/*      */     //   548: iand
/*      */     //   549: ifeq -> 664
/*      */     //   552: aload #8
/*      */     //   554: ldc_w 1469541920
/*      */     //   557: invokeinterface startReplaceGroup : (I)V
/*      */     //   562: aload #8
/*      */     //   564: astore #13
/*      */     //   566: iconst_0
/*      */     //   567: istore #14
/*      */     //   569: iconst_0
/*      */     //   570: istore #15
/*      */     //   572: aload #13
/*      */     //   574: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   579: astore #16
/*      */     //   581: iconst_0
/*      */     //   582: istore #17
/*      */     //   584: aload #16
/*      */     //   586: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   589: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   592: if_acmpne -> 617
/*      */     //   595: iconst_0
/*      */     //   596: istore #18
/*      */     //   598: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   601: astore #18
/*      */     //   603: aload #13
/*      */     //   605: aload #18
/*      */     //   607: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   612: aload #18
/*      */     //   614: goto -> 619
/*      */     //   617: aload #16
/*      */     //   619: nop
/*      */     //   620: nop
/*      */     //   621: nop
/*      */     //   622: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   625: astore #12
/*      */     //   627: aload #8
/*      */     //   629: invokeinterface endReplaceGroup : ()V
/*      */     //   634: aload #12
/*      */     //   636: astore #6
/*      */     //   638: goto -> 664
/*      */     //   641: aload #8
/*      */     //   643: invokeinterface skipToGroupEnd : ()V
/*      */     //   648: iload #10
/*      */     //   650: bipush #8
/*      */     //   652: iand
/*      */     //   653: ifeq -> 664
/*      */     //   656: iload #11
/*      */     //   658: sipush #-7169
/*      */     //   661: iand
/*      */     //   662: istore #11
/*      */     //   664: aload #8
/*      */     //   666: invokeinterface endDefaults : ()V
/*      */     //   671: invokestatic isTraceInProgress : ()Z
/*      */     //   674: ifeq -> 689
/*      */     //   677: ldc_w -1741064947
/*      */     //   680: iload #11
/*      */     //   682: iconst_m1
/*      */     //   683: ldc_w 'org.jetbrains.jewel.ui.component.VerticallyScrollableContainer (ScrollableContainer.kt:155)'
/*      */     //   686: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   689: aload #8
/*      */     //   691: ldc_w 1469545275
/*      */     //   694: invokeinterface startReplaceGroup : (I)V
/*      */     //   699: aload #8
/*      */     //   701: astore #14
/*      */     //   703: iconst_0
/*      */     //   704: istore #15
/*      */     //   706: nop
/*      */     //   707: iconst_0
/*      */     //   708: istore #16
/*      */     //   710: aload #14
/*      */     //   712: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   717: astore #17
/*      */     //   719: iconst_0
/*      */     //   720: istore #18
/*      */     //   722: aload #17
/*      */     //   724: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   727: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   730: if_acmpne -> 762
/*      */     //   733: iconst_0
/*      */     //   734: istore #19
/*      */     //   736: iconst_0
/*      */     //   737: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   740: aconst_null
/*      */     //   741: iconst_2
/*      */     //   742: aconst_null
/*      */     //   743: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   746: astore #19
/*      */     //   748: aload #14
/*      */     //   750: aload #19
/*      */     //   752: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   757: aload #19
/*      */     //   759: goto -> 764
/*      */     //   762: aload #17
/*      */     //   764: nop
/*      */     //   765: nop
/*      */     //   766: nop
/*      */     //   767: checkcast androidx/compose/runtime/MutableState
/*      */     //   770: astore #13
/*      */     //   772: aload #8
/*      */     //   774: invokeinterface endReplaceGroup : ()V
/*      */     //   779: aload #13
/*      */     //   781: astore #12
/*      */     //   783: iconst_0
/*      */     //   784: istore #15
/*      */     //   786: nop
/*      */     //   787: iconst_0
/*      */     //   788: istore #16
/*      */     //   790: aload #8
/*      */     //   792: ldc 773894976
/*      */     //   794: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   796: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   799: aload #8
/*      */     //   801: astore #17
/*      */     //   803: aload #8
/*      */     //   805: ldc -954370320
/*      */     //   807: ldc 'CC(remember):Effects.kt#9igjgp'
/*      */     //   809: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   812: aload #8
/*      */     //   814: astore #18
/*      */     //   816: iconst_0
/*      */     //   817: istore #19
/*      */     //   819: iconst_0
/*      */     //   820: istore #20
/*      */     //   822: aload #18
/*      */     //   824: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   829: astore #21
/*      */     //   831: iconst_0
/*      */     //   832: istore #22
/*      */     //   834: aload #21
/*      */     //   836: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   839: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   842: if_acmpne -> 889
/*      */     //   845: iconst_0
/*      */     //   846: istore #23
/*      */     //   848: iconst_0
/*      */     //   849: istore #24
/*      */     //   851: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   854: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   857: aload #17
/*      */     //   859: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   862: astore #34
/*      */     //   864: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   867: dup
/*      */     //   868: aload #34
/*      */     //   870: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   873: astore #24
/*      */     //   875: aload #18
/*      */     //   877: aload #24
/*      */     //   879: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   884: aload #24
/*      */     //   886: goto -> 891
/*      */     //   889: aload #21
/*      */     //   891: nop
/*      */     //   892: nop
/*      */     //   893: nop
/*      */     //   894: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   897: astore #25
/*      */     //   899: aload #8
/*      */     //   901: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   904: aload #25
/*      */     //   906: astore #26
/*      */     //   908: aload #26
/*      */     //   910: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   913: astore #25
/*      */     //   915: aload #8
/*      */     //   917: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   920: aload #25
/*      */     //   922: nop
/*      */     //   923: astore #13
/*      */     //   925: ldc_w 498792508
/*      */     //   928: iconst_1
/*      */     //   929: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$12
/*      */     //   932: dup
/*      */     //   933: aload_0
/*      */     //   934: aload_2
/*      */     //   935: iload #4
/*      */     //   937: iload #5
/*      */     //   939: aload #6
/*      */     //   941: aload_3
/*      */     //   942: aload #12
/*      */     //   944: invokespecial <init> : (Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*      */     //   947: aload #8
/*      */     //   949: bipush #54
/*      */     //   951: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   954: checkcast kotlin/jvm/functions/Function2
/*      */     //   957: aconst_null
/*      */     //   958: aload_1
/*      */     //   959: aload_3
/*      */     //   960: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   963: invokeinterface getLingerDuration-UwyO8pc : ()J
/*      */     //   968: aload #13
/*      */     //   970: aload #8
/*      */     //   972: ldc_w 1469565709
/*      */     //   975: invokeinterface startReplaceGroup : (I)V
/*      */     //   980: aload #8
/*      */     //   982: astore #15
/*      */     //   984: iconst_0
/*      */     //   985: istore #16
/*      */     //   987: iconst_0
/*      */     //   988: istore #17
/*      */     //   990: aload #15
/*      */     //   992: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   997: astore #18
/*      */     //   999: iconst_0
/*      */     //   1000: istore #19
/*      */     //   1002: aload #18
/*      */     //   1004: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1007: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1010: if_acmpne -> 1063
/*      */     //   1013: astore #32
/*      */     //   1015: lstore #30
/*      */     //   1017: astore #29
/*      */     //   1019: astore #28
/*      */     //   1021: astore #27
/*      */     //   1023: iconst_0
/*      */     //   1024: istore #20
/*      */     //   1026: aload #12
/*      */     //   1028: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1033: astore #33
/*      */     //   1035: aload #27
/*      */     //   1037: aload #28
/*      */     //   1039: aload #29
/*      */     //   1041: lload #30
/*      */     //   1043: aload #32
/*      */     //   1045: aload #33
/*      */     //   1047: astore #21
/*      */     //   1049: aload #15
/*      */     //   1051: aload #21
/*      */     //   1053: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1058: aload #21
/*      */     //   1060: goto -> 1065
/*      */     //   1063: aload #18
/*      */     //   1065: nop
/*      */     //   1066: nop
/*      */     //   1067: nop
/*      */     //   1068: checkcast kotlin/jvm/functions/Function1
/*      */     //   1071: astore #14
/*      */     //   1073: aload #8
/*      */     //   1075: invokeinterface endReplaceGroup : ()V
/*      */     //   1080: aload #14
/*      */     //   1082: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1085: aload_3
/*      */     //   1086: ldc_w 1499197624
/*      */     //   1089: iconst_1
/*      */     //   1090: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$14
/*      */     //   1093: dup
/*      */     //   1094: aload #7
/*      */     //   1096: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1099: aload #8
/*      */     //   1101: bipush #54
/*      */     //   1103: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1106: checkcast kotlin/jvm/functions/Function2
/*      */     //   1109: aload #8
/*      */     //   1111: sipush #24630
/*      */     //   1114: sipush #7168
/*      */     //   1117: iload #11
/*      */     //   1119: iand
/*      */     //   1120: ior
/*      */     //   1121: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1124: invokestatic isTraceInProgress : ()Z
/*      */     //   1127: ifeq -> 1143
/*      */     //   1130: invokestatic traceEventEnd : ()V
/*      */     //   1133: goto -> 1143
/*      */     //   1136: aload #8
/*      */     //   1138: invokeinterface skipToGroupEnd : ()V
/*      */     //   1143: aload #8
/*      */     //   1145: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1150: dup
/*      */     //   1151: ifnull -> 1183
/*      */     //   1154: aload_0
/*      */     //   1155: aload_1
/*      */     //   1156: aload_2
/*      */     //   1157: aload_3
/*      */     //   1158: iload #4
/*      */     //   1160: iload #5
/*      */     //   1162: aload #6
/*      */     //   1164: aload #7
/*      */     //   1166: iload #9
/*      */     //   1168: iload #10
/*      */     //   1170: <illegal opcode> invoke : (Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1175: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1180: goto -> 1184
/*      */     //   1183: pop
/*      */     //   1184: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #156	-> 14
/*      */     //   #149	-> 474
/*      */     //   #150	-> 488
/*      */     //   #151	-> 503
/*      */     //   #152	-> 530
/*      */     //   #153	-> 541
/*      */     //   #154	-> 552
/*      */     //   #654	-> 572
/*      */     //   #655	-> 584
/*      */     //   #656	-> 595
/*      */     //   #154	-> 598
/*      */     //   #656	-> 601
/*      */     //   #657	-> 603
/*      */     //   #658	-> 612
/*      */     //   #659	-> 617
/*      */     //   #655	-> 619
/*      */     //   #654	-> 620
/*      */     //   #654	-> 621
/*      */     //   #154	-> 622
/*      */     //   #156	-> 686
/*      */     //   #157	-> 706
/*      */     //   #660	-> 710
/*      */     //   #661	-> 722
/*      */     //   #662	-> 733
/*      */     //   #157	-> 736
/*      */     //   #662	-> 746
/*      */     //   #663	-> 748
/*      */     //   #664	-> 757
/*      */     //   #665	-> 762
/*      */     //   #661	-> 764
/*      */     //   #660	-> 765
/*      */     //   #660	-> 766
/*      */     //   #157	-> 767
/*      */     //   #158	-> 786
/*      */     //   #666	-> 796
/*      */     //   #667	-> 799
/*      */     //   #669	-> 801
/*      */     //   #670	-> 809
/*      */     //   #671	-> 822
/*      */     //   #672	-> 834
/*      */     //   #673	-> 845
/*      */     //   #674	-> 848
/*      */     //   #675	-> 848
/*      */     //   #676	-> 851
/*      */     //   #675	-> 854
/*      */     //   #674	-> 862
/*      */     //   #673	-> 873
/*      */     //   #677	-> 875
/*      */     //   #678	-> 884
/*      */     //   #679	-> 889
/*      */     //   #672	-> 891
/*      */     //   #671	-> 892
/*      */     //   #671	-> 893
/*      */     //   #670	-> 894
/*      */     //   #680	-> 908
/*      */     //   #666	-> 917
/*      */     //   #680	-> 922
/*      */     //   #158	-> 923
/*      */     //   #161	-> 925
/*      */     //   #172	-> 957
/*      */     //   #173	-> 958
/*      */     //   #681	-> 990
/*      */     //   #682	-> 1002
/*      */     //   #683	-> 1013
/*      */     //   #173	-> 1026
/*      */     //   #683	-> 1047
/*      */     //   #684	-> 1049
/*      */     //   #685	-> 1058
/*      */     //   #686	-> 1063
/*      */     //   #682	-> 1065
/*      */     //   #681	-> 1066
/*      */     //   #681	-> 1067
/*      */     //   #173	-> 1068
/*      */     //   #174	-> 1085
/*      */     //   #175	-> 1086
/*      */     //   #160	-> 1121
/*      */     //   #178	-> 1136
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   598	3	18	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$11	I
/*      */     //   603	11	18	value$iv	Ljava/lang/Object;
/*      */     //   584	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   581	39	16	it$iv	Ljava/lang/Object;
/*      */     //   572	50	15	$i$f$cache	I
/*      */     //   569	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   569	53	14	invalid$iv	Z
/*      */     //   736	10	19	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$keepVisible$6	I
/*      */     //   748	11	19	value$iv	Ljava/lang/Object;
/*      */     //   722	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   719	46	17	it$iv	Ljava/lang/Object;
/*      */     //   710	57	16	$i$f$cache	I
/*      */     //   707	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   707	60	15	invalid$iv	Z
/*      */     //   851	3	24	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   848	25	23	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   875	11	24	value$iv$iv	Ljava/lang/Object;
/*      */     //   834	58	22	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   831	61	21	it$iv$iv	Ljava/lang/Object;
/*      */     //   822	72	20	$i$f$cache	I
/*      */     //   819	75	18	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   819	75	19	invalid$iv$iv	Z
/*      */     //   790	133	16	$i$f$rememberCoroutineScope	I
/*      */     //   803	120	17	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   908	15	26	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   787	136	15	$changed$iv	I
/*      */     //   1026	7	20	$i$a$-cache-ScrollableContainerKt$VerticallyScrollableContainer$13	I
/*      */     //   1049	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1002	64	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   999	67	18	it$iv	Ljava/lang/Object;
/*      */     //   990	78	17	$i$f$cache	I
/*      */     //   987	81	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   987	81	16	invalid$iv	Z
/*      */     //   783	350	12	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   925	208	13	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   30	1155	11	$dirty	I
/*      */     //   0	1185	0	scrollState	Landroidx/compose/foundation/lazy/grid/LazyGridState;
/*      */     //   0	1185	1	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	2	scrollbarModifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	3	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	1185	4	reverseLayout	Z
/*      */     //   0	1185	5	scrollbarEnabled	Z
/*      */     //   0	1185	6	scrollbarInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	1185	7	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1185	8	$composer	Landroidx/compose/runtime/Composer;
/*  994 */     //   0	1185	9	$changed	I } private static final boolean VerticallyScrollableContainer$lambda$22(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void VerticallyScrollableContainer$lambda$23(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/*  995 */     mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$VerticallyScrollableContainer$12 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(498792508, $changed, -1, "org.jetbrains.jewel.ui.component.VerticallyScrollableContainer.<anonymous> (ScrollableContainer.kt:161)");  boolean bool = ScrollableContainerKt.VerticallyScrollableContainer$lambda$22(this.$keepVisible$delegate); ScrollbarKt.VerticalScrollbar((ScrollableState)this.$scrollState, this.$scrollbarModifier, this.$reverseLayout, this.$scrollbarEnabled, this.$scrollbarInteractionSource, this.$style, bool, $composer, 0, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$VerticallyScrollableContainer$12(LazyGridState $scrollState, Modifier $scrollbarModifier, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final Unit VerticallyScrollableContainer$lambda$25$lambda$24(MutableState<Boolean> $keepVisible$delegate, boolean it) { VerticallyScrollableContainer$lambda$23($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$14\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$VerticallyScrollableContainer$14\n*L\n176#1:561\n176#1:562,6\n176#1:596\n176#1:600\n176#1:568,6\n176#1:583,4\n176#1:593,2\n176#1:599\n176#1:574,9\n176#1:595\n176#1:597,2\n176#1:587,6\n*E\n"}) static final class ScrollableContainerKt$VerticallyScrollableContainer$14 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1499197624, $changed, -1, "org.jetbrains.jewel.ui.component.VerticallyScrollableContainer.<anonymous> (ScrollableContainer.kt:175)");  Modifier modifier1 = LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 6, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$VerticallyScrollableContainer$14$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$VerticallyScrollableContainer$14(Function2<Composer, Integer, Unit> $content) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void HorizontallyScrollableContainer(@Nullable Modifier modifier, @Nullable Modifier scrollbarModifier, @Nullable ScrollState scrollState, @Nullable ScrollbarStyle style, boolean reverseLayout, boolean scrollbarEnabled, @Nullable MutableInteractionSource scrollbarInteractionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload #7
/*      */     //   2: ldc 'content'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #8
/*      */     //   9: ldc_w 1562894924
/*      */     //   12: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   17: astore #8
/*      */     //   19: iload #9
/*      */     //   21: istore #11
/*      */     //   23: iload #10
/*      */     //   25: iconst_1
/*      */     //   26: iand
/*      */     //   27: ifeq -> 40
/*      */     //   30: iload #11
/*      */     //   32: bipush #6
/*      */     //   34: ior
/*      */     //   35: istore #11
/*      */     //   37: goto -> 69
/*      */     //   40: iload #9
/*      */     //   42: bipush #6
/*      */     //   44: iand
/*      */     //   45: ifne -> 69
/*      */     //   48: iload #11
/*      */     //   50: aload #8
/*      */     //   52: aload_0
/*      */     //   53: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   58: ifeq -> 65
/*      */     //   61: iconst_4
/*      */     //   62: goto -> 66
/*      */     //   65: iconst_2
/*      */     //   66: ior
/*      */     //   67: istore #11
/*      */     //   69: iload #10
/*      */     //   71: iconst_2
/*      */     //   72: iand
/*      */     //   73: ifeq -> 86
/*      */     //   76: iload #11
/*      */     //   78: bipush #48
/*      */     //   80: ior
/*      */     //   81: istore #11
/*      */     //   83: goto -> 117
/*      */     //   86: iload #9
/*      */     //   88: bipush #48
/*      */     //   90: iand
/*      */     //   91: ifne -> 117
/*      */     //   94: iload #11
/*      */     //   96: aload #8
/*      */     //   98: aload_1
/*      */     //   99: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   104: ifeq -> 112
/*      */     //   107: bipush #32
/*      */     //   109: goto -> 114
/*      */     //   112: bipush #16
/*      */     //   114: ior
/*      */     //   115: istore #11
/*      */     //   117: iload #9
/*      */     //   119: sipush #384
/*      */     //   122: iand
/*      */     //   123: ifne -> 158
/*      */     //   126: iload #11
/*      */     //   128: iload #10
/*      */     //   130: iconst_4
/*      */     //   131: iand
/*      */     //   132: ifne -> 152
/*      */     //   135: aload #8
/*      */     //   137: aload_2
/*      */     //   138: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   143: ifeq -> 152
/*      */     //   146: sipush #256
/*      */     //   149: goto -> 155
/*      */     //   152: sipush #128
/*      */     //   155: ior
/*      */     //   156: istore #11
/*      */     //   158: iload #9
/*      */     //   160: sipush #3072
/*      */     //   163: iand
/*      */     //   164: ifne -> 200
/*      */     //   167: iload #11
/*      */     //   169: iload #10
/*      */     //   171: bipush #8
/*      */     //   173: iand
/*      */     //   174: ifne -> 194
/*      */     //   177: aload #8
/*      */     //   179: aload_3
/*      */     //   180: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   185: ifeq -> 194
/*      */     //   188: sipush #2048
/*      */     //   191: goto -> 197
/*      */     //   194: sipush #1024
/*      */     //   197: ior
/*      */     //   198: istore #11
/*      */     //   200: iload #10
/*      */     //   202: bipush #16
/*      */     //   204: iand
/*      */     //   205: ifeq -> 219
/*      */     //   208: iload #11
/*      */     //   210: sipush #24576
/*      */     //   213: ior
/*      */     //   214: istore #11
/*      */     //   216: goto -> 254
/*      */     //   219: iload #9
/*      */     //   221: sipush #24576
/*      */     //   224: iand
/*      */     //   225: ifne -> 254
/*      */     //   228: iload #11
/*      */     //   230: aload #8
/*      */     //   232: iload #4
/*      */     //   234: invokeinterface changed : (Z)Z
/*      */     //   239: ifeq -> 248
/*      */     //   242: sipush #16384
/*      */     //   245: goto -> 251
/*      */     //   248: sipush #8192
/*      */     //   251: ior
/*      */     //   252: istore #11
/*      */     //   254: iload #10
/*      */     //   256: bipush #32
/*      */     //   258: iand
/*      */     //   259: ifeq -> 272
/*      */     //   262: iload #11
/*      */     //   264: ldc 196608
/*      */     //   266: ior
/*      */     //   267: istore #11
/*      */     //   269: goto -> 304
/*      */     //   272: iload #9
/*      */     //   274: ldc 196608
/*      */     //   276: iand
/*      */     //   277: ifne -> 304
/*      */     //   280: iload #11
/*      */     //   282: aload #8
/*      */     //   284: iload #5
/*      */     //   286: invokeinterface changed : (Z)Z
/*      */     //   291: ifeq -> 299
/*      */     //   294: ldc 131072
/*      */     //   296: goto -> 301
/*      */     //   299: ldc 65536
/*      */     //   301: ior
/*      */     //   302: istore #11
/*      */     //   304: iload #10
/*      */     //   306: bipush #64
/*      */     //   308: iand
/*      */     //   309: ifeq -> 322
/*      */     //   312: iload #11
/*      */     //   314: ldc 1572864
/*      */     //   316: ior
/*      */     //   317: istore #11
/*      */     //   319: goto -> 354
/*      */     //   322: iload #9
/*      */     //   324: ldc 1572864
/*      */     //   326: iand
/*      */     //   327: ifne -> 354
/*      */     //   330: iload #11
/*      */     //   332: aload #8
/*      */     //   334: aload #6
/*      */     //   336: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   341: ifeq -> 349
/*      */     //   344: ldc 1048576
/*      */     //   346: goto -> 351
/*      */     //   349: ldc 524288
/*      */     //   351: ior
/*      */     //   352: istore #11
/*      */     //   354: iload #10
/*      */     //   356: sipush #128
/*      */     //   359: iand
/*      */     //   360: ifeq -> 373
/*      */     //   363: iload #11
/*      */     //   365: ldc 12582912
/*      */     //   367: ior
/*      */     //   368: istore #11
/*      */     //   370: goto -> 405
/*      */     //   373: iload #9
/*      */     //   375: ldc 12582912
/*      */     //   377: iand
/*      */     //   378: ifne -> 405
/*      */     //   381: iload #11
/*      */     //   383: aload #8
/*      */     //   385: aload #7
/*      */     //   387: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   392: ifeq -> 400
/*      */     //   395: ldc 8388608
/*      */     //   397: goto -> 402
/*      */     //   400: ldc 4194304
/*      */     //   402: ior
/*      */     //   403: istore #11
/*      */     //   405: iload #11
/*      */     //   407: ldc 4793491
/*      */     //   409: iand
/*      */     //   410: ldc 4793490
/*      */     //   412: if_icmpne -> 425
/*      */     //   415: aload #8
/*      */     //   417: invokeinterface getSkipping : ()Z
/*      */     //   422: ifne -> 1158
/*      */     //   425: aload #8
/*      */     //   427: invokeinterface startDefaults : ()V
/*      */     //   432: iload #9
/*      */     //   434: iconst_1
/*      */     //   435: iand
/*      */     //   436: ifeq -> 449
/*      */     //   439: aload #8
/*      */     //   441: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   446: ifeq -> 647
/*      */     //   449: iload #10
/*      */     //   451: iconst_1
/*      */     //   452: iand
/*      */     //   453: ifeq -> 463
/*      */     //   456: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   459: checkcast androidx/compose/ui/Modifier
/*      */     //   462: astore_0
/*      */     //   463: iload #10
/*      */     //   465: iconst_2
/*      */     //   466: iand
/*      */     //   467: ifeq -> 477
/*      */     //   470: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   473: checkcast androidx/compose/ui/Modifier
/*      */     //   476: astore_1
/*      */     //   477: iload #10
/*      */     //   479: iconst_4
/*      */     //   480: iand
/*      */     //   481: ifeq -> 501
/*      */     //   484: iconst_0
/*      */     //   485: aload #8
/*      */     //   487: iconst_0
/*      */     //   488: iconst_1
/*      */     //   489: invokestatic rememberScrollState : (ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;
/*      */     //   492: astore_2
/*      */     //   493: iload #11
/*      */     //   495: sipush #-897
/*      */     //   498: iand
/*      */     //   499: istore #11
/*      */     //   501: iload #10
/*      */     //   503: bipush #8
/*      */     //   505: iand
/*      */     //   506: ifeq -> 528
/*      */     //   509: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   512: aload #8
/*      */     //   514: bipush #6
/*      */     //   516: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   519: astore_3
/*      */     //   520: iload #11
/*      */     //   522: sipush #-7169
/*      */     //   525: iand
/*      */     //   526: istore #11
/*      */     //   528: iload #10
/*      */     //   530: bipush #16
/*      */     //   532: iand
/*      */     //   533: ifeq -> 539
/*      */     //   536: iconst_0
/*      */     //   537: istore #4
/*      */     //   539: iload #10
/*      */     //   541: bipush #32
/*      */     //   543: iand
/*      */     //   544: ifeq -> 550
/*      */     //   547: iconst_1
/*      */     //   548: istore #5
/*      */     //   550: iload #10
/*      */     //   552: bipush #64
/*      */     //   554: iand
/*      */     //   555: ifeq -> 685
/*      */     //   558: aload #8
/*      */     //   560: ldc_w 1999219026
/*      */     //   563: invokeinterface startReplaceGroup : (I)V
/*      */     //   568: aload #8
/*      */     //   570: astore #13
/*      */     //   572: iconst_0
/*      */     //   573: istore #14
/*      */     //   575: iconst_0
/*      */     //   576: istore #15
/*      */     //   578: aload #13
/*      */     //   580: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   585: astore #16
/*      */     //   587: iconst_0
/*      */     //   588: istore #17
/*      */     //   590: aload #16
/*      */     //   592: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   595: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   598: if_acmpne -> 623
/*      */     //   601: iconst_0
/*      */     //   602: istore #18
/*      */     //   604: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   607: astore #18
/*      */     //   609: aload #13
/*      */     //   611: aload #18
/*      */     //   613: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   618: aload #18
/*      */     //   620: goto -> 625
/*      */     //   623: aload #16
/*      */     //   625: nop
/*      */     //   626: nop
/*      */     //   627: nop
/*      */     //   628: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   631: astore #12
/*      */     //   633: aload #8
/*      */     //   635: invokeinterface endReplaceGroup : ()V
/*      */     //   640: aload #12
/*      */     //   642: astore #6
/*      */     //   644: goto -> 685
/*      */     //   647: aload #8
/*      */     //   649: invokeinterface skipToGroupEnd : ()V
/*      */     //   654: iload #10
/*      */     //   656: iconst_4
/*      */     //   657: iand
/*      */     //   658: ifeq -> 669
/*      */     //   661: iload #11
/*      */     //   663: sipush #-897
/*      */     //   666: iand
/*      */     //   667: istore #11
/*      */     //   669: iload #10
/*      */     //   671: bipush #8
/*      */     //   673: iand
/*      */     //   674: ifeq -> 685
/*      */     //   677: iload #11
/*      */     //   679: sipush #-7169
/*      */     //   682: iand
/*      */     //   683: istore #11
/*      */     //   685: aload #8
/*      */     //   687: invokeinterface endDefaults : ()V
/*      */     //   692: invokestatic isTraceInProgress : ()Z
/*      */     //   695: ifeq -> 710
/*      */     //   698: ldc_w 1562894924
/*      */     //   701: iload #11
/*      */     //   703: iconst_m1
/*      */     //   704: ldc_w 'org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer (ScrollableContainer.kt:189)'
/*      */     //   707: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   710: aload #8
/*      */     //   712: ldc_w 1999222381
/*      */     //   715: invokeinterface startReplaceGroup : (I)V
/*      */     //   720: aload #8
/*      */     //   722: astore #14
/*      */     //   724: iconst_0
/*      */     //   725: istore #15
/*      */     //   727: nop
/*      */     //   728: iconst_0
/*      */     //   729: istore #16
/*      */     //   731: aload #14
/*      */     //   733: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   738: astore #17
/*      */     //   740: iconst_0
/*      */     //   741: istore #18
/*      */     //   743: aload #17
/*      */     //   745: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   748: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   751: if_acmpne -> 783
/*      */     //   754: iconst_0
/*      */     //   755: istore #19
/*      */     //   757: iconst_0
/*      */     //   758: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   761: aconst_null
/*      */     //   762: iconst_2
/*      */     //   763: aconst_null
/*      */     //   764: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   767: astore #19
/*      */     //   769: aload #14
/*      */     //   771: aload #19
/*      */     //   773: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   778: aload #19
/*      */     //   780: goto -> 785
/*      */     //   783: aload #17
/*      */     //   785: nop
/*      */     //   786: nop
/*      */     //   787: nop
/*      */     //   788: checkcast androidx/compose/runtime/MutableState
/*      */     //   791: astore #13
/*      */     //   793: aload #8
/*      */     //   795: invokeinterface endReplaceGroup : ()V
/*      */     //   800: aload #13
/*      */     //   802: astore #12
/*      */     //   804: iconst_0
/*      */     //   805: istore #15
/*      */     //   807: nop
/*      */     //   808: iconst_0
/*      */     //   809: istore #16
/*      */     //   811: aload #8
/*      */     //   813: ldc 773894976
/*      */     //   815: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   817: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   820: aload #8
/*      */     //   822: astore #17
/*      */     //   824: aload #8
/*      */     //   826: ldc -954370320
/*      */     //   828: ldc 'CC(remember):Effects.kt#9igjgp'
/*      */     //   830: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   833: aload #8
/*      */     //   835: astore #18
/*      */     //   837: iconst_0
/*      */     //   838: istore #19
/*      */     //   840: iconst_0
/*      */     //   841: istore #20
/*      */     //   843: aload #18
/*      */     //   845: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   850: astore #21
/*      */     //   852: iconst_0
/*      */     //   853: istore #22
/*      */     //   855: aload #21
/*      */     //   857: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   860: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   863: if_acmpne -> 910
/*      */     //   866: iconst_0
/*      */     //   867: istore #23
/*      */     //   869: iconst_0
/*      */     //   870: istore #24
/*      */     //   872: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   875: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   878: aload #17
/*      */     //   880: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   883: astore #34
/*      */     //   885: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   888: dup
/*      */     //   889: aload #34
/*      */     //   891: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   894: astore #24
/*      */     //   896: aload #18
/*      */     //   898: aload #24
/*      */     //   900: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   905: aload #24
/*      */     //   907: goto -> 912
/*      */     //   910: aload #21
/*      */     //   912: nop
/*      */     //   913: nop
/*      */     //   914: nop
/*      */     //   915: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   918: astore #25
/*      */     //   920: aload #8
/*      */     //   922: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   925: aload #25
/*      */     //   927: astore #26
/*      */     //   929: aload #26
/*      */     //   931: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   934: astore #25
/*      */     //   936: aload #8
/*      */     //   938: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   941: aload #25
/*      */     //   943: nop
/*      */     //   944: astore #13
/*      */     //   946: aconst_null
/*      */     //   947: ldc_w -242113638
/*      */     //   950: iconst_1
/*      */     //   951: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$2
/*      */     //   954: dup
/*      */     //   955: aload_2
/*      */     //   956: aload_1
/*      */     //   957: iload #4
/*      */     //   959: iload #5
/*      */     //   961: aload #6
/*      */     //   963: aload_3
/*      */     //   964: aload #12
/*      */     //   966: invokespecial <init> : (Landroidx/compose/foundation/ScrollState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*      */     //   969: aload #8
/*      */     //   971: bipush #54
/*      */     //   973: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   976: checkcast kotlin/jvm/functions/Function2
/*      */     //   979: aload_0
/*      */     //   980: aload_3
/*      */     //   981: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   984: invokeinterface getLingerDuration-UwyO8pc : ()J
/*      */     //   989: aload #13
/*      */     //   991: aload #8
/*      */     //   993: ldc_w 1999242879
/*      */     //   996: invokeinterface startReplaceGroup : (I)V
/*      */     //   1001: aload #8
/*      */     //   1003: astore #15
/*      */     //   1005: iconst_0
/*      */     //   1006: istore #16
/*      */     //   1008: iconst_0
/*      */     //   1009: istore #17
/*      */     //   1011: aload #15
/*      */     //   1013: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1018: astore #18
/*      */     //   1020: iconst_0
/*      */     //   1021: istore #19
/*      */     //   1023: aload #18
/*      */     //   1025: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1028: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1031: if_acmpne -> 1084
/*      */     //   1034: astore #32
/*      */     //   1036: lstore #30
/*      */     //   1038: astore #29
/*      */     //   1040: astore #28
/*      */     //   1042: astore #27
/*      */     //   1044: iconst_0
/*      */     //   1045: istore #20
/*      */     //   1047: aload #12
/*      */     //   1049: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1054: astore #33
/*      */     //   1056: aload #27
/*      */     //   1058: aload #28
/*      */     //   1060: aload #29
/*      */     //   1062: lload #30
/*      */     //   1064: aload #32
/*      */     //   1066: aload #33
/*      */     //   1068: astore #21
/*      */     //   1070: aload #15
/*      */     //   1072: aload #21
/*      */     //   1074: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1079: aload #21
/*      */     //   1081: goto -> 1086
/*      */     //   1084: aload #18
/*      */     //   1086: nop
/*      */     //   1087: nop
/*      */     //   1088: nop
/*      */     //   1089: checkcast kotlin/jvm/functions/Function1
/*      */     //   1092: astore #14
/*      */     //   1094: aload #8
/*      */     //   1096: invokeinterface endReplaceGroup : ()V
/*      */     //   1101: aload #14
/*      */     //   1103: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1106: aload_3
/*      */     //   1107: ldc_w 508190199
/*      */     //   1110: iconst_1
/*      */     //   1111: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$4
/*      */     //   1114: dup
/*      */     //   1115: aload_2
/*      */     //   1116: aload #7
/*      */     //   1118: invokespecial <init> : (Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1121: aload #8
/*      */     //   1123: bipush #54
/*      */     //   1125: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1128: checkcast kotlin/jvm/functions/Function2
/*      */     //   1131: aload #8
/*      */     //   1133: sipush #24630
/*      */     //   1136: sipush #7168
/*      */     //   1139: iload #11
/*      */     //   1141: iand
/*      */     //   1142: ior
/*      */     //   1143: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1146: invokestatic isTraceInProgress : ()Z
/*      */     //   1149: ifeq -> 1165
/*      */     //   1152: invokestatic traceEventEnd : ()V
/*      */     //   1155: goto -> 1165
/*      */     //   1158: aload #8
/*      */     //   1160: invokeinterface skipToGroupEnd : ()V
/*      */     //   1165: aload #8
/*      */     //   1167: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1172: dup
/*      */     //   1173: ifnull -> 1205
/*      */     //   1176: aload_0
/*      */     //   1177: aload_1
/*      */     //   1178: aload_2
/*      */     //   1179: aload_3
/*      */     //   1180: iload #4
/*      */     //   1182: iload #5
/*      */     //   1184: aload #6
/*      */     //   1186: aload #7
/*      */     //   1188: iload #9
/*      */     //   1190: iload #10
/*      */     //   1192: <illegal opcode> invoke : (Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1197: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1202: goto -> 1206
/*      */     //   1205: pop
/*      */     //   1206: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #190	-> 7
/*      */     //   #182	-> 456
/*      */     //   #183	-> 470
/*      */     //   #184	-> 484
/*      */     //   #185	-> 509
/*      */     //   #186	-> 536
/*      */     //   #187	-> 547
/*      */     //   #188	-> 558
/*      */     //   #687	-> 578
/*      */     //   #688	-> 590
/*      */     //   #689	-> 601
/*      */     //   #188	-> 604
/*      */     //   #689	-> 607
/*      */     //   #690	-> 609
/*      */     //   #691	-> 618
/*      */     //   #692	-> 623
/*      */     //   #688	-> 625
/*      */     //   #687	-> 626
/*      */     //   #687	-> 627
/*      */     //   #188	-> 628
/*      */     //   #190	-> 707
/*      */     //   #191	-> 727
/*      */     //   #693	-> 731
/*      */     //   #694	-> 743
/*      */     //   #695	-> 754
/*      */     //   #191	-> 757
/*      */     //   #695	-> 767
/*      */     //   #696	-> 769
/*      */     //   #697	-> 778
/*      */     //   #698	-> 783
/*      */     //   #694	-> 785
/*      */     //   #693	-> 786
/*      */     //   #693	-> 787
/*      */     //   #191	-> 788
/*      */     //   #192	-> 807
/*      */     //   #699	-> 817
/*      */     //   #700	-> 820
/*      */     //   #702	-> 822
/*      */     //   #703	-> 830
/*      */     //   #704	-> 843
/*      */     //   #705	-> 855
/*      */     //   #706	-> 866
/*      */     //   #707	-> 869
/*      */     //   #708	-> 869
/*      */     //   #709	-> 872
/*      */     //   #708	-> 875
/*      */     //   #707	-> 883
/*      */     //   #706	-> 894
/*      */     //   #710	-> 896
/*      */     //   #711	-> 905
/*      */     //   #712	-> 910
/*      */     //   #705	-> 912
/*      */     //   #704	-> 913
/*      */     //   #704	-> 914
/*      */     //   #703	-> 915
/*      */     //   #713	-> 929
/*      */     //   #699	-> 938
/*      */     //   #713	-> 943
/*      */     //   #192	-> 944
/*      */     //   #195	-> 946
/*      */     //   #196	-> 947
/*      */     //   #207	-> 979
/*      */     //   #714	-> 1011
/*      */     //   #715	-> 1023
/*      */     //   #716	-> 1034
/*      */     //   #207	-> 1047
/*      */     //   #716	-> 1068
/*      */     //   #717	-> 1070
/*      */     //   #718	-> 1079
/*      */     //   #719	-> 1084
/*      */     //   #715	-> 1086
/*      */     //   #714	-> 1087
/*      */     //   #714	-> 1088
/*      */     //   #207	-> 1089
/*      */     //   #208	-> 1106
/*      */     //   #209	-> 1107
/*      */     //   #194	-> 1143
/*      */     //   #212	-> 1158
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   604	3	18	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$1	I
/*      */     //   609	11	18	value$iv	Ljava/lang/Object;
/*      */     //   590	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   587	39	16	it$iv	Ljava/lang/Object;
/*      */     //   578	50	15	$i$f$cache	I
/*      */     //   575	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   575	53	14	invalid$iv	Z
/*      */     //   757	10	19	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$keepVisible$2	I
/*      */     //   769	11	19	value$iv	Ljava/lang/Object;
/*      */     //   743	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   740	46	17	it$iv	Ljava/lang/Object;
/*      */     //   731	57	16	$i$f$cache	I
/*      */     //   728	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   728	60	15	invalid$iv	Z
/*      */     //   872	3	24	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   869	25	23	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   896	11	24	value$iv$iv	Ljava/lang/Object;
/*      */     //   855	58	22	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   852	61	21	it$iv$iv	Ljava/lang/Object;
/*      */     //   843	72	20	$i$f$cache	I
/*      */     //   840	75	18	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   840	75	19	invalid$iv$iv	Z
/*      */     //   811	133	16	$i$f$rememberCoroutineScope	I
/*      */     //   824	120	17	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   929	15	26	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   808	136	15	$changed$iv	I
/*      */     //   1047	7	20	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$3	I
/*      */     //   1070	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1023	64	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   1020	67	18	it$iv	Ljava/lang/Object;
/*      */     //   1011	78	17	$i$f$cache	I
/*      */     //   1008	81	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1008	81	16	invalid$iv	Z
/*      */     //   804	351	12	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   946	209	13	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   23	1184	11	$dirty	I
/*      */     //   0	1207	0	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1207	1	scrollbarModifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1207	2	scrollState	Landroidx/compose/foundation/ScrollState;
/*      */     //   0	1207	3	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	1207	4	reverseLayout	Z
/*      */     //   0	1207	5	scrollbarEnabled	Z
/*      */     //   0	1207	6	scrollbarInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	1207	7	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1207	8	$composer	Landroidx/compose/runtime/Composer;
/*  997 */     //   0	1207	9	$changed	I } private static final boolean HorizontallyScrollableContainer$lambda$29(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void HorizontallyScrollableContainer$lambda$30(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/*  998 */     mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$HorizontallyScrollableContainer$2 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-242113638, $changed, -1, "org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer.<anonymous> (ScrollableContainer.kt:196)");  boolean bool = ScrollableContainerKt.HorizontallyScrollableContainer$lambda$29(this.$keepVisible$delegate); ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$scrollState, this.$scrollbarModifier, this.$reverseLayout, this.$scrollbarEnabled, this.$scrollbarInteractionSource, this.$style, bool, $composer, 0, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$HorizontallyScrollableContainer$2(ScrollState $scrollState, Modifier $scrollbarModifier, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final Unit HorizontallyScrollableContainer$lambda$32$lambda$31(MutableState<Boolean> $keepVisible$delegate, boolean it) { HorizontallyScrollableContainer$lambda$30($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$4\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$4\n*L\n210#1:561\n210#1:562,6\n210#1:596\n210#1:600\n210#1:568,6\n210#1:583,4\n210#1:593,2\n210#1:599\n210#1:574,9\n210#1:595\n210#1:597,2\n210#1:587,6\n*E\n"}) static final class ScrollableContainerKt$HorizontallyScrollableContainer$4 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(508190199, $changed, -1, "org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer.<anonymous> (ScrollableContainer.kt:209)");  Modifier modifier1 = ScrollKt.horizontalScroll$default(LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"), this.$scrollState, false, null, false, 14, null); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$HorizontallyScrollableContainer$4$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$HorizontallyScrollableContainer$4(ScrollState $scrollState, Function2<Composer, Integer, Unit> $content) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void HorizontallyScrollableContainer(@NotNull LazyListState scrollState, @Nullable Modifier modifier, @Nullable Modifier scrollbarModifier, @Nullable ScrollbarStyle style, boolean reverseLayout, boolean scrollbarEnabled, @Nullable MutableInteractionSource scrollbarInteractionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'scrollState'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #7
/*      */     //   9: ldc 'content'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload #8
/*      */     //   16: ldc_w 1626292679
/*      */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   24: astore #8
/*      */     //   26: iload #9
/*      */     //   28: istore #11
/*      */     //   30: iload #10
/*      */     //   32: iconst_1
/*      */     //   33: iand
/*      */     //   34: ifeq -> 47
/*      */     //   37: iload #11
/*      */     //   39: bipush #6
/*      */     //   41: ior
/*      */     //   42: istore #11
/*      */     //   44: goto -> 76
/*      */     //   47: iload #9
/*      */     //   49: bipush #6
/*      */     //   51: iand
/*      */     //   52: ifne -> 76
/*      */     //   55: iload #11
/*      */     //   57: aload #8
/*      */     //   59: aload_0
/*      */     //   60: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   65: ifeq -> 72
/*      */     //   68: iconst_4
/*      */     //   69: goto -> 73
/*      */     //   72: iconst_2
/*      */     //   73: ior
/*      */     //   74: istore #11
/*      */     //   76: iload #10
/*      */     //   78: iconst_2
/*      */     //   79: iand
/*      */     //   80: ifeq -> 93
/*      */     //   83: iload #11
/*      */     //   85: bipush #48
/*      */     //   87: ior
/*      */     //   88: istore #11
/*      */     //   90: goto -> 124
/*      */     //   93: iload #9
/*      */     //   95: bipush #48
/*      */     //   97: iand
/*      */     //   98: ifne -> 124
/*      */     //   101: iload #11
/*      */     //   103: aload #8
/*      */     //   105: aload_1
/*      */     //   106: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   111: ifeq -> 119
/*      */     //   114: bipush #32
/*      */     //   116: goto -> 121
/*      */     //   119: bipush #16
/*      */     //   121: ior
/*      */     //   122: istore #11
/*      */     //   124: iload #10
/*      */     //   126: iconst_4
/*      */     //   127: iand
/*      */     //   128: ifeq -> 142
/*      */     //   131: iload #11
/*      */     //   133: sipush #384
/*      */     //   136: ior
/*      */     //   137: istore #11
/*      */     //   139: goto -> 176
/*      */     //   142: iload #9
/*      */     //   144: sipush #384
/*      */     //   147: iand
/*      */     //   148: ifne -> 176
/*      */     //   151: iload #11
/*      */     //   153: aload #8
/*      */     //   155: aload_2
/*      */     //   156: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   161: ifeq -> 170
/*      */     //   164: sipush #256
/*      */     //   167: goto -> 173
/*      */     //   170: sipush #128
/*      */     //   173: ior
/*      */     //   174: istore #11
/*      */     //   176: iload #9
/*      */     //   178: sipush #3072
/*      */     //   181: iand
/*      */     //   182: ifne -> 218
/*      */     //   185: iload #11
/*      */     //   187: iload #10
/*      */     //   189: bipush #8
/*      */     //   191: iand
/*      */     //   192: ifne -> 212
/*      */     //   195: aload #8
/*      */     //   197: aload_3
/*      */     //   198: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   203: ifeq -> 212
/*      */     //   206: sipush #2048
/*      */     //   209: goto -> 215
/*      */     //   212: sipush #1024
/*      */     //   215: ior
/*      */     //   216: istore #11
/*      */     //   218: iload #10
/*      */     //   220: bipush #16
/*      */     //   222: iand
/*      */     //   223: ifeq -> 237
/*      */     //   226: iload #11
/*      */     //   228: sipush #24576
/*      */     //   231: ior
/*      */     //   232: istore #11
/*      */     //   234: goto -> 272
/*      */     //   237: iload #9
/*      */     //   239: sipush #24576
/*      */     //   242: iand
/*      */     //   243: ifne -> 272
/*      */     //   246: iload #11
/*      */     //   248: aload #8
/*      */     //   250: iload #4
/*      */     //   252: invokeinterface changed : (Z)Z
/*      */     //   257: ifeq -> 266
/*      */     //   260: sipush #16384
/*      */     //   263: goto -> 269
/*      */     //   266: sipush #8192
/*      */     //   269: ior
/*      */     //   270: istore #11
/*      */     //   272: iload #10
/*      */     //   274: bipush #32
/*      */     //   276: iand
/*      */     //   277: ifeq -> 290
/*      */     //   280: iload #11
/*      */     //   282: ldc 196608
/*      */     //   284: ior
/*      */     //   285: istore #11
/*      */     //   287: goto -> 322
/*      */     //   290: iload #9
/*      */     //   292: ldc 196608
/*      */     //   294: iand
/*      */     //   295: ifne -> 322
/*      */     //   298: iload #11
/*      */     //   300: aload #8
/*      */     //   302: iload #5
/*      */     //   304: invokeinterface changed : (Z)Z
/*      */     //   309: ifeq -> 317
/*      */     //   312: ldc 131072
/*      */     //   314: goto -> 319
/*      */     //   317: ldc 65536
/*      */     //   319: ior
/*      */     //   320: istore #11
/*      */     //   322: iload #10
/*      */     //   324: bipush #64
/*      */     //   326: iand
/*      */     //   327: ifeq -> 340
/*      */     //   330: iload #11
/*      */     //   332: ldc 1572864
/*      */     //   334: ior
/*      */     //   335: istore #11
/*      */     //   337: goto -> 372
/*      */     //   340: iload #9
/*      */     //   342: ldc 1572864
/*      */     //   344: iand
/*      */     //   345: ifne -> 372
/*      */     //   348: iload #11
/*      */     //   350: aload #8
/*      */     //   352: aload #6
/*      */     //   354: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   359: ifeq -> 367
/*      */     //   362: ldc 1048576
/*      */     //   364: goto -> 369
/*      */     //   367: ldc 524288
/*      */     //   369: ior
/*      */     //   370: istore #11
/*      */     //   372: iload #10
/*      */     //   374: sipush #128
/*      */     //   377: iand
/*      */     //   378: ifeq -> 391
/*      */     //   381: iload #11
/*      */     //   383: ldc 12582912
/*      */     //   385: ior
/*      */     //   386: istore #11
/*      */     //   388: goto -> 423
/*      */     //   391: iload #9
/*      */     //   393: ldc 12582912
/*      */     //   395: iand
/*      */     //   396: ifne -> 423
/*      */     //   399: iload #11
/*      */     //   401: aload #8
/*      */     //   403: aload #7
/*      */     //   405: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   410: ifeq -> 418
/*      */     //   413: ldc 8388608
/*      */     //   415: goto -> 420
/*      */     //   418: ldc 4194304
/*      */     //   420: ior
/*      */     //   421: istore #11
/*      */     //   423: iload #11
/*      */     //   425: ldc 4793491
/*      */     //   427: iand
/*      */     //   428: ldc 4793490
/*      */     //   430: if_icmpne -> 443
/*      */     //   433: aload #8
/*      */     //   435: invokeinterface getSkipping : ()Z
/*      */     //   440: ifne -> 1136
/*      */     //   443: aload #8
/*      */     //   445: invokeinterface startDefaults : ()V
/*      */     //   450: iload #9
/*      */     //   452: iconst_1
/*      */     //   453: iand
/*      */     //   454: ifeq -> 467
/*      */     //   457: aload #8
/*      */     //   459: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   464: ifeq -> 641
/*      */     //   467: iload #10
/*      */     //   469: iconst_2
/*      */     //   470: iand
/*      */     //   471: ifeq -> 481
/*      */     //   474: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   477: checkcast androidx/compose/ui/Modifier
/*      */     //   480: astore_1
/*      */     //   481: iload #10
/*      */     //   483: iconst_4
/*      */     //   484: iand
/*      */     //   485: ifeq -> 495
/*      */     //   488: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   491: checkcast androidx/compose/ui/Modifier
/*      */     //   494: astore_2
/*      */     //   495: iload #10
/*      */     //   497: bipush #8
/*      */     //   499: iand
/*      */     //   500: ifeq -> 522
/*      */     //   503: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   506: aload #8
/*      */     //   508: bipush #6
/*      */     //   510: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   513: astore_3
/*      */     //   514: iload #11
/*      */     //   516: sipush #-7169
/*      */     //   519: iand
/*      */     //   520: istore #11
/*      */     //   522: iload #10
/*      */     //   524: bipush #16
/*      */     //   526: iand
/*      */     //   527: ifeq -> 533
/*      */     //   530: iconst_0
/*      */     //   531: istore #4
/*      */     //   533: iload #10
/*      */     //   535: bipush #32
/*      */     //   537: iand
/*      */     //   538: ifeq -> 544
/*      */     //   541: iconst_1
/*      */     //   542: istore #5
/*      */     //   544: iload #10
/*      */     //   546: bipush #64
/*      */     //   548: iand
/*      */     //   549: ifeq -> 664
/*      */     //   552: aload #8
/*      */     //   554: ldc_w 1999259314
/*      */     //   557: invokeinterface startReplaceGroup : (I)V
/*      */     //   562: aload #8
/*      */     //   564: astore #13
/*      */     //   566: iconst_0
/*      */     //   567: istore #14
/*      */     //   569: iconst_0
/*      */     //   570: istore #15
/*      */     //   572: aload #13
/*      */     //   574: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   579: astore #16
/*      */     //   581: iconst_0
/*      */     //   582: istore #17
/*      */     //   584: aload #16
/*      */     //   586: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   589: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   592: if_acmpne -> 617
/*      */     //   595: iconst_0
/*      */     //   596: istore #18
/*      */     //   598: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   601: astore #18
/*      */     //   603: aload #13
/*      */     //   605: aload #18
/*      */     //   607: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   612: aload #18
/*      */     //   614: goto -> 619
/*      */     //   617: aload #16
/*      */     //   619: nop
/*      */     //   620: nop
/*      */     //   621: nop
/*      */     //   622: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   625: astore #12
/*      */     //   627: aload #8
/*      */     //   629: invokeinterface endReplaceGroup : ()V
/*      */     //   634: aload #12
/*      */     //   636: astore #6
/*      */     //   638: goto -> 664
/*      */     //   641: aload #8
/*      */     //   643: invokeinterface skipToGroupEnd : ()V
/*      */     //   648: iload #10
/*      */     //   650: bipush #8
/*      */     //   652: iand
/*      */     //   653: ifeq -> 664
/*      */     //   656: iload #11
/*      */     //   658: sipush #-7169
/*      */     //   661: iand
/*      */     //   662: istore #11
/*      */     //   664: aload #8
/*      */     //   666: invokeinterface endDefaults : ()V
/*      */     //   671: invokestatic isTraceInProgress : ()Z
/*      */     //   674: ifeq -> 689
/*      */     //   677: ldc_w 1626292679
/*      */     //   680: iload #11
/*      */     //   682: iconst_m1
/*      */     //   683: ldc_w 'org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer (ScrollableContainer.kt:223)'
/*      */     //   686: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   689: aload #8
/*      */     //   691: ldc_w 1999262669
/*      */     //   694: invokeinterface startReplaceGroup : (I)V
/*      */     //   699: aload #8
/*      */     //   701: astore #14
/*      */     //   703: iconst_0
/*      */     //   704: istore #15
/*      */     //   706: nop
/*      */     //   707: iconst_0
/*      */     //   708: istore #16
/*      */     //   710: aload #14
/*      */     //   712: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   717: astore #17
/*      */     //   719: iconst_0
/*      */     //   720: istore #18
/*      */     //   722: aload #17
/*      */     //   724: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   727: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   730: if_acmpne -> 762
/*      */     //   733: iconst_0
/*      */     //   734: istore #19
/*      */     //   736: iconst_0
/*      */     //   737: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   740: aconst_null
/*      */     //   741: iconst_2
/*      */     //   742: aconst_null
/*      */     //   743: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   746: astore #19
/*      */     //   748: aload #14
/*      */     //   750: aload #19
/*      */     //   752: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   757: aload #19
/*      */     //   759: goto -> 764
/*      */     //   762: aload #17
/*      */     //   764: nop
/*      */     //   765: nop
/*      */     //   766: nop
/*      */     //   767: checkcast androidx/compose/runtime/MutableState
/*      */     //   770: astore #13
/*      */     //   772: aload #8
/*      */     //   774: invokeinterface endReplaceGroup : ()V
/*      */     //   779: aload #13
/*      */     //   781: astore #12
/*      */     //   783: iconst_0
/*      */     //   784: istore #15
/*      */     //   786: nop
/*      */     //   787: iconst_0
/*      */     //   788: istore #16
/*      */     //   790: aload #8
/*      */     //   792: ldc 773894976
/*      */     //   794: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   796: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   799: aload #8
/*      */     //   801: astore #17
/*      */     //   803: aload #8
/*      */     //   805: ldc -954370320
/*      */     //   807: ldc 'CC(remember):Effects.kt#9igjgp'
/*      */     //   809: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   812: aload #8
/*      */     //   814: astore #18
/*      */     //   816: iconst_0
/*      */     //   817: istore #19
/*      */     //   819: iconst_0
/*      */     //   820: istore #20
/*      */     //   822: aload #18
/*      */     //   824: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   829: astore #21
/*      */     //   831: iconst_0
/*      */     //   832: istore #22
/*      */     //   834: aload #21
/*      */     //   836: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   839: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   842: if_acmpne -> 889
/*      */     //   845: iconst_0
/*      */     //   846: istore #23
/*      */     //   848: iconst_0
/*      */     //   849: istore #24
/*      */     //   851: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   854: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   857: aload #17
/*      */     //   859: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   862: astore #34
/*      */     //   864: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   867: dup
/*      */     //   868: aload #34
/*      */     //   870: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   873: astore #24
/*      */     //   875: aload #18
/*      */     //   877: aload #24
/*      */     //   879: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   884: aload #24
/*      */     //   886: goto -> 891
/*      */     //   889: aload #21
/*      */     //   891: nop
/*      */     //   892: nop
/*      */     //   893: nop
/*      */     //   894: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   897: astore #25
/*      */     //   899: aload #8
/*      */     //   901: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   904: aload #25
/*      */     //   906: astore #26
/*      */     //   908: aload #26
/*      */     //   910: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   913: astore #25
/*      */     //   915: aload #8
/*      */     //   917: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   920: aload #25
/*      */     //   922: nop
/*      */     //   923: astore #13
/*      */     //   925: aconst_null
/*      */     //   926: ldc_w -2115115115
/*      */     //   929: iconst_1
/*      */     //   930: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$7
/*      */     //   933: dup
/*      */     //   934: aload_0
/*      */     //   935: aload_2
/*      */     //   936: iload #4
/*      */     //   938: iload #5
/*      */     //   940: aload #6
/*      */     //   942: aload_3
/*      */     //   943: aload #12
/*      */     //   945: invokespecial <init> : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*      */     //   948: aload #8
/*      */     //   950: bipush #54
/*      */     //   952: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   955: checkcast kotlin/jvm/functions/Function2
/*      */     //   958: aload_1
/*      */     //   959: aload_3
/*      */     //   960: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   963: invokeinterface getLingerDuration-UwyO8pc : ()J
/*      */     //   968: aload #13
/*      */     //   970: aload #8
/*      */     //   972: ldc_w 1999283167
/*      */     //   975: invokeinterface startReplaceGroup : (I)V
/*      */     //   980: aload #8
/*      */     //   982: astore #15
/*      */     //   984: iconst_0
/*      */     //   985: istore #16
/*      */     //   987: iconst_0
/*      */     //   988: istore #17
/*      */     //   990: aload #15
/*      */     //   992: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   997: astore #18
/*      */     //   999: iconst_0
/*      */     //   1000: istore #19
/*      */     //   1002: aload #18
/*      */     //   1004: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1007: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1010: if_acmpne -> 1063
/*      */     //   1013: astore #32
/*      */     //   1015: lstore #30
/*      */     //   1017: astore #29
/*      */     //   1019: astore #28
/*      */     //   1021: astore #27
/*      */     //   1023: iconst_0
/*      */     //   1024: istore #20
/*      */     //   1026: aload #12
/*      */     //   1028: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1033: astore #33
/*      */     //   1035: aload #27
/*      */     //   1037: aload #28
/*      */     //   1039: aload #29
/*      */     //   1041: lload #30
/*      */     //   1043: aload #32
/*      */     //   1045: aload #33
/*      */     //   1047: astore #21
/*      */     //   1049: aload #15
/*      */     //   1051: aload #21
/*      */     //   1053: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1058: aload #21
/*      */     //   1060: goto -> 1065
/*      */     //   1063: aload #18
/*      */     //   1065: nop
/*      */     //   1066: nop
/*      */     //   1067: nop
/*      */     //   1068: checkcast kotlin/jvm/functions/Function1
/*      */     //   1071: astore #14
/*      */     //   1073: aload #8
/*      */     //   1075: invokeinterface endReplaceGroup : ()V
/*      */     //   1080: aload #14
/*      */     //   1082: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1085: aload_3
/*      */     //   1086: ldc_w 1667333810
/*      */     //   1089: iconst_1
/*      */     //   1090: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$9
/*      */     //   1093: dup
/*      */     //   1094: aload #7
/*      */     //   1096: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1099: aload #8
/*      */     //   1101: bipush #54
/*      */     //   1103: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1106: checkcast kotlin/jvm/functions/Function2
/*      */     //   1109: aload #8
/*      */     //   1111: sipush #24630
/*      */     //   1114: sipush #7168
/*      */     //   1117: iload #11
/*      */     //   1119: iand
/*      */     //   1120: ior
/*      */     //   1121: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1124: invokestatic isTraceInProgress : ()Z
/*      */     //   1127: ifeq -> 1143
/*      */     //   1130: invokestatic traceEventEnd : ()V
/*      */     //   1133: goto -> 1143
/*      */     //   1136: aload #8
/*      */     //   1138: invokeinterface skipToGroupEnd : ()V
/*      */     //   1143: aload #8
/*      */     //   1145: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1150: dup
/*      */     //   1151: ifnull -> 1183
/*      */     //   1154: aload_0
/*      */     //   1155: aload_1
/*      */     //   1156: aload_2
/*      */     //   1157: aload_3
/*      */     //   1158: iload #4
/*      */     //   1160: iload #5
/*      */     //   1162: aload #6
/*      */     //   1164: aload #7
/*      */     //   1166: iload #9
/*      */     //   1168: iload #10
/*      */     //   1170: <illegal opcode> invoke : (Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1175: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1180: goto -> 1184
/*      */     //   1183: pop
/*      */     //   1184: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #224	-> 14
/*      */     //   #217	-> 474
/*      */     //   #218	-> 488
/*      */     //   #219	-> 503
/*      */     //   #220	-> 530
/*      */     //   #221	-> 541
/*      */     //   #222	-> 552
/*      */     //   #720	-> 572
/*      */     //   #721	-> 584
/*      */     //   #722	-> 595
/*      */     //   #222	-> 598
/*      */     //   #722	-> 601
/*      */     //   #723	-> 603
/*      */     //   #724	-> 612
/*      */     //   #725	-> 617
/*      */     //   #721	-> 619
/*      */     //   #720	-> 620
/*      */     //   #720	-> 621
/*      */     //   #222	-> 622
/*      */     //   #224	-> 686
/*      */     //   #225	-> 706
/*      */     //   #726	-> 710
/*      */     //   #727	-> 722
/*      */     //   #728	-> 733
/*      */     //   #225	-> 736
/*      */     //   #728	-> 746
/*      */     //   #729	-> 748
/*      */     //   #730	-> 757
/*      */     //   #731	-> 762
/*      */     //   #727	-> 764
/*      */     //   #726	-> 765
/*      */     //   #726	-> 766
/*      */     //   #225	-> 767
/*      */     //   #226	-> 786
/*      */     //   #732	-> 796
/*      */     //   #733	-> 799
/*      */     //   #735	-> 801
/*      */     //   #736	-> 809
/*      */     //   #737	-> 822
/*      */     //   #738	-> 834
/*      */     //   #739	-> 845
/*      */     //   #740	-> 848
/*      */     //   #741	-> 848
/*      */     //   #742	-> 851
/*      */     //   #741	-> 854
/*      */     //   #740	-> 862
/*      */     //   #739	-> 873
/*      */     //   #743	-> 875
/*      */     //   #744	-> 884
/*      */     //   #745	-> 889
/*      */     //   #738	-> 891
/*      */     //   #737	-> 892
/*      */     //   #737	-> 893
/*      */     //   #736	-> 894
/*      */     //   #746	-> 908
/*      */     //   #732	-> 917
/*      */     //   #746	-> 922
/*      */     //   #226	-> 923
/*      */     //   #229	-> 925
/*      */     //   #230	-> 926
/*      */     //   #241	-> 958
/*      */     //   #747	-> 990
/*      */     //   #748	-> 1002
/*      */     //   #749	-> 1013
/*      */     //   #241	-> 1026
/*      */     //   #749	-> 1047
/*      */     //   #750	-> 1049
/*      */     //   #751	-> 1058
/*      */     //   #752	-> 1063
/*      */     //   #748	-> 1065
/*      */     //   #747	-> 1066
/*      */     //   #747	-> 1067
/*      */     //   #241	-> 1068
/*      */     //   #242	-> 1085
/*      */     //   #243	-> 1086
/*      */     //   #228	-> 1121
/*      */     //   #246	-> 1136
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   598	3	18	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$6	I
/*      */     //   603	11	18	value$iv	Ljava/lang/Object;
/*      */     //   584	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   581	39	16	it$iv	Ljava/lang/Object;
/*      */     //   572	50	15	$i$f$cache	I
/*      */     //   569	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   569	53	14	invalid$iv	Z
/*      */     //   736	10	19	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$keepVisible$4	I
/*      */     //   748	11	19	value$iv	Ljava/lang/Object;
/*      */     //   722	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   719	46	17	it$iv	Ljava/lang/Object;
/*      */     //   710	57	16	$i$f$cache	I
/*      */     //   707	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   707	60	15	invalid$iv	Z
/*      */     //   851	3	24	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   848	25	23	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   875	11	24	value$iv$iv	Ljava/lang/Object;
/*      */     //   834	58	22	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   831	61	21	it$iv$iv	Ljava/lang/Object;
/*      */     //   822	72	20	$i$f$cache	I
/*      */     //   819	75	18	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   819	75	19	invalid$iv$iv	Z
/*      */     //   790	133	16	$i$f$rememberCoroutineScope	I
/*      */     //   803	120	17	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   908	15	26	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   787	136	15	$changed$iv	I
/*      */     //   1026	7	20	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$8	I
/*      */     //   1049	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1002	64	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   999	67	18	it$iv	Ljava/lang/Object;
/*      */     //   990	78	17	$i$f$cache	I
/*      */     //   987	81	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   987	81	16	invalid$iv	Z
/*      */     //   783	350	12	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   925	208	13	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   30	1155	11	$dirty	I
/*      */     //   0	1185	0	scrollState	Landroidx/compose/foundation/lazy/LazyListState;
/*      */     //   0	1185	1	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	2	scrollbarModifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	3	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	1185	4	reverseLayout	Z
/*      */     //   0	1185	5	scrollbarEnabled	Z
/*      */     //   0	1185	6	scrollbarInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	1185	7	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1185	8	$composer	Landroidx/compose/runtime/Composer;
/* 1000 */     //   0	1185	9	$changed	I } private static final boolean HorizontallyScrollableContainer$lambda$36(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void HorizontallyScrollableContainer$lambda$37(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1001 */     mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$HorizontallyScrollableContainer$7 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2115115115, $changed, -1, "org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer.<anonymous> (ScrollableContainer.kt:230)");  boolean bool = ScrollableContainerKt.HorizontallyScrollableContainer$lambda$36(this.$keepVisible$delegate); ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$scrollState, this.$scrollbarModifier, this.$reverseLayout, this.$scrollbarEnabled, this.$scrollbarInteractionSource, this.$style, bool, $composer, 0, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$HorizontallyScrollableContainer$7(LazyListState $scrollState, Modifier $scrollbarModifier, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final Unit HorizontallyScrollableContainer$lambda$39$lambda$38(MutableState<Boolean> $keepVisible$delegate, boolean it) { HorizontallyScrollableContainer$lambda$37($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$9\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$9\n*L\n244#1:561\n244#1:562,6\n244#1:596\n244#1:600\n244#1:568,6\n244#1:583,4\n244#1:593,2\n244#1:599\n244#1:574,9\n244#1:595\n244#1:597,2\n244#1:587,6\n*E\n"}) static final class ScrollableContainerKt$HorizontallyScrollableContainer$9 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1667333810, $changed, -1, "org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer.<anonymous> (ScrollableContainer.kt:243)");  Modifier modifier1 = LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 6, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$HorizontallyScrollableContainer$9$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$HorizontallyScrollableContainer$9(Function2<Composer, Integer, Unit> $content) {} } @Composable @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]") public static final void HorizontallyScrollableContainer(@NotNull LazyGridState scrollState, @Nullable Modifier modifier, @Nullable Modifier scrollbarModifier, @Nullable ScrollbarStyle style, boolean reverseLayout, boolean scrollbarEnabled, @Nullable MutableInteractionSource scrollbarInteractionSource, @NotNull Function2 content, @Nullable Composer $composer, int $changed, int paramInt1) { // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: ldc_w 'scrollState'
/*      */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   7: aload #7
/*      */     //   9: ldc 'content'
/*      */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */     //   14: aload #8
/*      */     //   16: ldc_w -1363409889
/*      */     //   19: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   24: astore #8
/*      */     //   26: iload #9
/*      */     //   28: istore #11
/*      */     //   30: iload #10
/*      */     //   32: iconst_1
/*      */     //   33: iand
/*      */     //   34: ifeq -> 47
/*      */     //   37: iload #11
/*      */     //   39: bipush #6
/*      */     //   41: ior
/*      */     //   42: istore #11
/*      */     //   44: goto -> 76
/*      */     //   47: iload #9
/*      */     //   49: bipush #6
/*      */     //   51: iand
/*      */     //   52: ifne -> 76
/*      */     //   55: iload #11
/*      */     //   57: aload #8
/*      */     //   59: aload_0
/*      */     //   60: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   65: ifeq -> 72
/*      */     //   68: iconst_4
/*      */     //   69: goto -> 73
/*      */     //   72: iconst_2
/*      */     //   73: ior
/*      */     //   74: istore #11
/*      */     //   76: iload #10
/*      */     //   78: iconst_2
/*      */     //   79: iand
/*      */     //   80: ifeq -> 93
/*      */     //   83: iload #11
/*      */     //   85: bipush #48
/*      */     //   87: ior
/*      */     //   88: istore #11
/*      */     //   90: goto -> 124
/*      */     //   93: iload #9
/*      */     //   95: bipush #48
/*      */     //   97: iand
/*      */     //   98: ifne -> 124
/*      */     //   101: iload #11
/*      */     //   103: aload #8
/*      */     //   105: aload_1
/*      */     //   106: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   111: ifeq -> 119
/*      */     //   114: bipush #32
/*      */     //   116: goto -> 121
/*      */     //   119: bipush #16
/*      */     //   121: ior
/*      */     //   122: istore #11
/*      */     //   124: iload #10
/*      */     //   126: iconst_4
/*      */     //   127: iand
/*      */     //   128: ifeq -> 142
/*      */     //   131: iload #11
/*      */     //   133: sipush #384
/*      */     //   136: ior
/*      */     //   137: istore #11
/*      */     //   139: goto -> 176
/*      */     //   142: iload #9
/*      */     //   144: sipush #384
/*      */     //   147: iand
/*      */     //   148: ifne -> 176
/*      */     //   151: iload #11
/*      */     //   153: aload #8
/*      */     //   155: aload_2
/*      */     //   156: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   161: ifeq -> 170
/*      */     //   164: sipush #256
/*      */     //   167: goto -> 173
/*      */     //   170: sipush #128
/*      */     //   173: ior
/*      */     //   174: istore #11
/*      */     //   176: iload #9
/*      */     //   178: sipush #3072
/*      */     //   181: iand
/*      */     //   182: ifne -> 218
/*      */     //   185: iload #11
/*      */     //   187: iload #10
/*      */     //   189: bipush #8
/*      */     //   191: iand
/*      */     //   192: ifne -> 212
/*      */     //   195: aload #8
/*      */     //   197: aload_3
/*      */     //   198: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   203: ifeq -> 212
/*      */     //   206: sipush #2048
/*      */     //   209: goto -> 215
/*      */     //   212: sipush #1024
/*      */     //   215: ior
/*      */     //   216: istore #11
/*      */     //   218: iload #10
/*      */     //   220: bipush #16
/*      */     //   222: iand
/*      */     //   223: ifeq -> 237
/*      */     //   226: iload #11
/*      */     //   228: sipush #24576
/*      */     //   231: ior
/*      */     //   232: istore #11
/*      */     //   234: goto -> 272
/*      */     //   237: iload #9
/*      */     //   239: sipush #24576
/*      */     //   242: iand
/*      */     //   243: ifne -> 272
/*      */     //   246: iload #11
/*      */     //   248: aload #8
/*      */     //   250: iload #4
/*      */     //   252: invokeinterface changed : (Z)Z
/*      */     //   257: ifeq -> 266
/*      */     //   260: sipush #16384
/*      */     //   263: goto -> 269
/*      */     //   266: sipush #8192
/*      */     //   269: ior
/*      */     //   270: istore #11
/*      */     //   272: iload #10
/*      */     //   274: bipush #32
/*      */     //   276: iand
/*      */     //   277: ifeq -> 290
/*      */     //   280: iload #11
/*      */     //   282: ldc 196608
/*      */     //   284: ior
/*      */     //   285: istore #11
/*      */     //   287: goto -> 322
/*      */     //   290: iload #9
/*      */     //   292: ldc 196608
/*      */     //   294: iand
/*      */     //   295: ifne -> 322
/*      */     //   298: iload #11
/*      */     //   300: aload #8
/*      */     //   302: iload #5
/*      */     //   304: invokeinterface changed : (Z)Z
/*      */     //   309: ifeq -> 317
/*      */     //   312: ldc 131072
/*      */     //   314: goto -> 319
/*      */     //   317: ldc 65536
/*      */     //   319: ior
/*      */     //   320: istore #11
/*      */     //   322: iload #10
/*      */     //   324: bipush #64
/*      */     //   326: iand
/*      */     //   327: ifeq -> 340
/*      */     //   330: iload #11
/*      */     //   332: ldc 1572864
/*      */     //   334: ior
/*      */     //   335: istore #11
/*      */     //   337: goto -> 372
/*      */     //   340: iload #9
/*      */     //   342: ldc 1572864
/*      */     //   344: iand
/*      */     //   345: ifne -> 372
/*      */     //   348: iload #11
/*      */     //   350: aload #8
/*      */     //   352: aload #6
/*      */     //   354: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   359: ifeq -> 367
/*      */     //   362: ldc 1048576
/*      */     //   364: goto -> 369
/*      */     //   367: ldc 524288
/*      */     //   369: ior
/*      */     //   370: istore #11
/*      */     //   372: iload #10
/*      */     //   374: sipush #128
/*      */     //   377: iand
/*      */     //   378: ifeq -> 391
/*      */     //   381: iload #11
/*      */     //   383: ldc 12582912
/*      */     //   385: ior
/*      */     //   386: istore #11
/*      */     //   388: goto -> 423
/*      */     //   391: iload #9
/*      */     //   393: ldc 12582912
/*      */     //   395: iand
/*      */     //   396: ifne -> 423
/*      */     //   399: iload #11
/*      */     //   401: aload #8
/*      */     //   403: aload #7
/*      */     //   405: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   410: ifeq -> 418
/*      */     //   413: ldc 8388608
/*      */     //   415: goto -> 420
/*      */     //   418: ldc 4194304
/*      */     //   420: ior
/*      */     //   421: istore #11
/*      */     //   423: iload #11
/*      */     //   425: ldc 4793491
/*      */     //   427: iand
/*      */     //   428: ldc 4793490
/*      */     //   430: if_icmpne -> 443
/*      */     //   433: aload #8
/*      */     //   435: invokeinterface getSkipping : ()Z
/*      */     //   440: ifne -> 1136
/*      */     //   443: aload #8
/*      */     //   445: invokeinterface startDefaults : ()V
/*      */     //   450: iload #9
/*      */     //   452: iconst_1
/*      */     //   453: iand
/*      */     //   454: ifeq -> 467
/*      */     //   457: aload #8
/*      */     //   459: invokeinterface getDefaultsInvalid : ()Z
/*      */     //   464: ifeq -> 641
/*      */     //   467: iload #10
/*      */     //   469: iconst_2
/*      */     //   470: iand
/*      */     //   471: ifeq -> 481
/*      */     //   474: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   477: checkcast androidx/compose/ui/Modifier
/*      */     //   480: astore_1
/*      */     //   481: iload #10
/*      */     //   483: iconst_4
/*      */     //   484: iand
/*      */     //   485: ifeq -> 495
/*      */     //   488: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   491: checkcast androidx/compose/ui/Modifier
/*      */     //   494: astore_2
/*      */     //   495: iload #10
/*      */     //   497: bipush #8
/*      */     //   499: iand
/*      */     //   500: ifeq -> 522
/*      */     //   503: getstatic org/jetbrains/jewel/foundation/theme/JewelTheme.Companion : Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;
/*      */     //   506: aload #8
/*      */     //   508: bipush #6
/*      */     //   510: invokestatic getScrollbarStyle : (Lorg/jetbrains/jewel/foundation/theme/JewelTheme$Companion;Landroidx/compose/runtime/Composer;I)Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   513: astore_3
/*      */     //   514: iload #11
/*      */     //   516: sipush #-7169
/*      */     //   519: iand
/*      */     //   520: istore #11
/*      */     //   522: iload #10
/*      */     //   524: bipush #16
/*      */     //   526: iand
/*      */     //   527: ifeq -> 533
/*      */     //   530: iconst_0
/*      */     //   531: istore #4
/*      */     //   533: iload #10
/*      */     //   535: bipush #32
/*      */     //   537: iand
/*      */     //   538: ifeq -> 544
/*      */     //   541: iconst_1
/*      */     //   542: istore #5
/*      */     //   544: iload #10
/*      */     //   546: bipush #64
/*      */     //   548: iand
/*      */     //   549: ifeq -> 664
/*      */     //   552: aload #8
/*      */     //   554: ldc_w 1999298642
/*      */     //   557: invokeinterface startReplaceGroup : (I)V
/*      */     //   562: aload #8
/*      */     //   564: astore #13
/*      */     //   566: iconst_0
/*      */     //   567: istore #14
/*      */     //   569: iconst_0
/*      */     //   570: istore #15
/*      */     //   572: aload #13
/*      */     //   574: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   579: astore #16
/*      */     //   581: iconst_0
/*      */     //   582: istore #17
/*      */     //   584: aload #16
/*      */     //   586: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   589: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   592: if_acmpne -> 617
/*      */     //   595: iconst_0
/*      */     //   596: istore #18
/*      */     //   598: invokestatic MutableInteractionSource : ()Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   601: astore #18
/*      */     //   603: aload #13
/*      */     //   605: aload #18
/*      */     //   607: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   612: aload #18
/*      */     //   614: goto -> 619
/*      */     //   617: aload #16
/*      */     //   619: nop
/*      */     //   620: nop
/*      */     //   621: nop
/*      */     //   622: checkcast androidx/compose/foundation/interaction/MutableInteractionSource
/*      */     //   625: astore #12
/*      */     //   627: aload #8
/*      */     //   629: invokeinterface endReplaceGroup : ()V
/*      */     //   634: aload #12
/*      */     //   636: astore #6
/*      */     //   638: goto -> 664
/*      */     //   641: aload #8
/*      */     //   643: invokeinterface skipToGroupEnd : ()V
/*      */     //   648: iload #10
/*      */     //   650: bipush #8
/*      */     //   652: iand
/*      */     //   653: ifeq -> 664
/*      */     //   656: iload #11
/*      */     //   658: sipush #-7169
/*      */     //   661: iand
/*      */     //   662: istore #11
/*      */     //   664: aload #8
/*      */     //   666: invokeinterface endDefaults : ()V
/*      */     //   671: invokestatic isTraceInProgress : ()Z
/*      */     //   674: ifeq -> 689
/*      */     //   677: ldc_w -1363409889
/*      */     //   680: iload #11
/*      */     //   682: iconst_m1
/*      */     //   683: ldc_w 'org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer (ScrollableContainer.kt:257)'
/*      */     //   686: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   689: aload #8
/*      */     //   691: ldc_w 1999301997
/*      */     //   694: invokeinterface startReplaceGroup : (I)V
/*      */     //   699: aload #8
/*      */     //   701: astore #14
/*      */     //   703: iconst_0
/*      */     //   704: istore #15
/*      */     //   706: nop
/*      */     //   707: iconst_0
/*      */     //   708: istore #16
/*      */     //   710: aload #14
/*      */     //   712: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   717: astore #17
/*      */     //   719: iconst_0
/*      */     //   720: istore #18
/*      */     //   722: aload #17
/*      */     //   724: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   727: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   730: if_acmpne -> 762
/*      */     //   733: iconst_0
/*      */     //   734: istore #19
/*      */     //   736: iconst_0
/*      */     //   737: invokestatic valueOf : (Z)Ljava/lang/Boolean;
/*      */     //   740: aconst_null
/*      */     //   741: iconst_2
/*      */     //   742: aconst_null
/*      */     //   743: invokestatic mutableStateOf$default : (Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;
/*      */     //   746: astore #19
/*      */     //   748: aload #14
/*      */     //   750: aload #19
/*      */     //   752: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   757: aload #19
/*      */     //   759: goto -> 764
/*      */     //   762: aload #17
/*      */     //   764: nop
/*      */     //   765: nop
/*      */     //   766: nop
/*      */     //   767: checkcast androidx/compose/runtime/MutableState
/*      */     //   770: astore #13
/*      */     //   772: aload #8
/*      */     //   774: invokeinterface endReplaceGroup : ()V
/*      */     //   779: aload #13
/*      */     //   781: astore #12
/*      */     //   783: iconst_0
/*      */     //   784: istore #15
/*      */     //   786: nop
/*      */     //   787: iconst_0
/*      */     //   788: istore #16
/*      */     //   790: aload #8
/*      */     //   792: ldc 773894976
/*      */     //   794: ldc 'CC(rememberCoroutineScope)482@20254L144:Effects.kt#9igjgp'
/*      */     //   796: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   799: aload #8
/*      */     //   801: astore #17
/*      */     //   803: aload #8
/*      */     //   805: ldc -954370320
/*      */     //   807: ldc 'CC(remember):Effects.kt#9igjgp'
/*      */     //   809: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   812: aload #8
/*      */     //   814: astore #18
/*      */     //   816: iconst_0
/*      */     //   817: istore #19
/*      */     //   819: iconst_0
/*      */     //   820: istore #20
/*      */     //   822: aload #18
/*      */     //   824: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   829: astore #21
/*      */     //   831: iconst_0
/*      */     //   832: istore #22
/*      */     //   834: aload #21
/*      */     //   836: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   839: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   842: if_acmpne -> 889
/*      */     //   845: iconst_0
/*      */     //   846: istore #23
/*      */     //   848: iconst_0
/*      */     //   849: istore #24
/*      */     //   851: getstatic kotlin/coroutines/EmptyCoroutineContext.INSTANCE : Lkotlin/coroutines/EmptyCoroutineContext;
/*      */     //   854: checkcast kotlin/coroutines/CoroutineContext
/*      */     //   857: aload #17
/*      */     //   859: invokestatic createCompositionCoroutineScope : (Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;)Lkotlinx/coroutines/CoroutineScope;
/*      */     //   862: astore #34
/*      */     //   864: new androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   867: dup
/*      */     //   868: aload #34
/*      */     //   870: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;)V
/*      */     //   873: astore #24
/*      */     //   875: aload #18
/*      */     //   877: aload #24
/*      */     //   879: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   884: aload #24
/*      */     //   886: goto -> 891
/*      */     //   889: aload #21
/*      */     //   891: nop
/*      */     //   892: nop
/*      */     //   893: nop
/*      */     //   894: checkcast androidx/compose/runtime/CompositionScopedCoroutineScopeCanceller
/*      */     //   897: astore #25
/*      */     //   899: aload #8
/*      */     //   901: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   904: aload #25
/*      */     //   906: astore #26
/*      */     //   908: aload #26
/*      */     //   910: invokevirtual getCoroutineScope : ()Lkotlinx/coroutines/CoroutineScope;
/*      */     //   913: astore #25
/*      */     //   915: aload #8
/*      */     //   917: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   920: aload #25
/*      */     //   922: nop
/*      */     //   923: astore #13
/*      */     //   925: aconst_null
/*      */     //   926: ldc_w -809850387
/*      */     //   929: iconst_1
/*      */     //   930: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$12
/*      */     //   933: dup
/*      */     //   934: aload_0
/*      */     //   935: aload_2
/*      */     //   936: iload #4
/*      */     //   938: iload #5
/*      */     //   940: aload #6
/*      */     //   942: aload_3
/*      */     //   943: aload #12
/*      */     //   945: invokespecial <init> : (Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Landroidx/compose/runtime/MutableState;)V
/*      */     //   948: aload #8
/*      */     //   950: bipush #54
/*      */     //   952: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   955: checkcast kotlin/jvm/functions/Function2
/*      */     //   958: aload_1
/*      */     //   959: aload_3
/*      */     //   960: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   963: invokeinterface getLingerDuration-UwyO8pc : ()J
/*      */     //   968: aload #13
/*      */     //   970: aload #8
/*      */     //   972: ldc_w 1999322495
/*      */     //   975: invokeinterface startReplaceGroup : (I)V
/*      */     //   980: aload #8
/*      */     //   982: astore #15
/*      */     //   984: iconst_0
/*      */     //   985: istore #16
/*      */     //   987: iconst_0
/*      */     //   988: istore #17
/*      */     //   990: aload #15
/*      */     //   992: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   997: astore #18
/*      */     //   999: iconst_0
/*      */     //   1000: istore #19
/*      */     //   1002: aload #18
/*      */     //   1004: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   1007: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   1010: if_acmpne -> 1063
/*      */     //   1013: astore #32
/*      */     //   1015: lstore #30
/*      */     //   1017: astore #29
/*      */     //   1019: astore #28
/*      */     //   1021: astore #27
/*      */     //   1023: iconst_0
/*      */     //   1024: istore #20
/*      */     //   1026: aload #12
/*      */     //   1028: <illegal opcode> invoke : (Landroidx/compose/runtime/MutableState;)Lkotlin/jvm/functions/Function1;
/*      */     //   1033: astore #33
/*      */     //   1035: aload #27
/*      */     //   1037: aload #28
/*      */     //   1039: aload #29
/*      */     //   1041: lload #30
/*      */     //   1043: aload #32
/*      */     //   1045: aload #33
/*      */     //   1047: astore #21
/*      */     //   1049: aload #15
/*      */     //   1051: aload #21
/*      */     //   1053: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1058: aload #21
/*      */     //   1060: goto -> 1065
/*      */     //   1063: aload #18
/*      */     //   1065: nop
/*      */     //   1066: nop
/*      */     //   1067: nop
/*      */     //   1068: checkcast kotlin/jvm/functions/Function1
/*      */     //   1071: astore #14
/*      */     //   1073: aload #8
/*      */     //   1075: invokeinterface endReplaceGroup : ()V
/*      */     //   1080: aload #14
/*      */     //   1082: invokestatic withKeepVisible-dWUq8MI : (Landroidx/compose/ui/Modifier;JLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
/*      */     //   1085: aload_3
/*      */     //   1086: ldc_w -1322368758
/*      */     //   1089: iconst_1
/*      */     //   1090: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$14
/*      */     //   1093: dup
/*      */     //   1094: aload #7
/*      */     //   1096: invokespecial <init> : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1099: aload #8
/*      */     //   1101: bipush #54
/*      */     //   1103: invokestatic rememberComposableLambda : (IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;
/*      */     //   1106: checkcast kotlin/jvm/functions/Function2
/*      */     //   1109: aload #8
/*      */     //   1111: sipush #24630
/*      */     //   1114: sipush #7168
/*      */     //   1117: iload #11
/*      */     //   1119: iand
/*      */     //   1120: ior
/*      */     //   1121: invokestatic ScrollableContainerImpl : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*      */     //   1124: invokestatic isTraceInProgress : ()Z
/*      */     //   1127: ifeq -> 1143
/*      */     //   1130: invokestatic traceEventEnd : ()V
/*      */     //   1133: goto -> 1143
/*      */     //   1136: aload #8
/*      */     //   1138: invokeinterface skipToGroupEnd : ()V
/*      */     //   1143: aload #8
/*      */     //   1145: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1150: dup
/*      */     //   1151: ifnull -> 1183
/*      */     //   1154: aload_0
/*      */     //   1155: aload_1
/*      */     //   1156: aload_2
/*      */     //   1157: aload_3
/*      */     //   1158: iload #4
/*      */     //   1160: iload #5
/*      */     //   1162: aload #6
/*      */     //   1164: aload #7
/*      */     //   1166: iload #9
/*      */     //   1168: iload #10
/*      */     //   1170: <illegal opcode> invoke : (Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;II)Lkotlin/jvm/functions/Function2;
/*      */     //   1175: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1180: goto -> 1184
/*      */     //   1183: pop
/*      */     //   1184: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #258	-> 14
/*      */     //   #251	-> 474
/*      */     //   #252	-> 488
/*      */     //   #253	-> 503
/*      */     //   #254	-> 530
/*      */     //   #255	-> 541
/*      */     //   #256	-> 552
/*      */     //   #753	-> 572
/*      */     //   #754	-> 584
/*      */     //   #755	-> 595
/*      */     //   #256	-> 598
/*      */     //   #755	-> 601
/*      */     //   #756	-> 603
/*      */     //   #757	-> 612
/*      */     //   #758	-> 617
/*      */     //   #754	-> 619
/*      */     //   #753	-> 620
/*      */     //   #753	-> 621
/*      */     //   #256	-> 622
/*      */     //   #258	-> 686
/*      */     //   #259	-> 706
/*      */     //   #759	-> 710
/*      */     //   #760	-> 722
/*      */     //   #761	-> 733
/*      */     //   #259	-> 736
/*      */     //   #761	-> 746
/*      */     //   #762	-> 748
/*      */     //   #763	-> 757
/*      */     //   #764	-> 762
/*      */     //   #760	-> 764
/*      */     //   #759	-> 765
/*      */     //   #759	-> 766
/*      */     //   #259	-> 767
/*      */     //   #260	-> 786
/*      */     //   #765	-> 796
/*      */     //   #766	-> 799
/*      */     //   #768	-> 801
/*      */     //   #769	-> 809
/*      */     //   #770	-> 822
/*      */     //   #771	-> 834
/*      */     //   #772	-> 845
/*      */     //   #773	-> 848
/*      */     //   #774	-> 848
/*      */     //   #775	-> 851
/*      */     //   #774	-> 854
/*      */     //   #773	-> 862
/*      */     //   #772	-> 873
/*      */     //   #776	-> 875
/*      */     //   #777	-> 884
/*      */     //   #778	-> 889
/*      */     //   #771	-> 891
/*      */     //   #770	-> 892
/*      */     //   #770	-> 893
/*      */     //   #769	-> 894
/*      */     //   #779	-> 908
/*      */     //   #765	-> 917
/*      */     //   #779	-> 922
/*      */     //   #260	-> 923
/*      */     //   #263	-> 925
/*      */     //   #264	-> 926
/*      */     //   #275	-> 958
/*      */     //   #780	-> 990
/*      */     //   #781	-> 1002
/*      */     //   #782	-> 1013
/*      */     //   #275	-> 1026
/*      */     //   #782	-> 1047
/*      */     //   #783	-> 1049
/*      */     //   #784	-> 1058
/*      */     //   #785	-> 1063
/*      */     //   #781	-> 1065
/*      */     //   #780	-> 1066
/*      */     //   #780	-> 1067
/*      */     //   #275	-> 1068
/*      */     //   #276	-> 1085
/*      */     //   #277	-> 1086
/*      */     //   #262	-> 1121
/*      */     //   #280	-> 1136
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   598	3	18	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$11	I
/*      */     //   603	11	18	value$iv	Ljava/lang/Object;
/*      */     //   584	36	17	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   581	39	16	it$iv	Ljava/lang/Object;
/*      */     //   572	50	15	$i$f$cache	I
/*      */     //   569	53	13	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   569	53	14	invalid$iv	Z
/*      */     //   736	10	19	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$keepVisible$6	I
/*      */     //   748	11	19	value$iv	Ljava/lang/Object;
/*      */     //   722	43	18	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   719	46	17	it$iv	Ljava/lang/Object;
/*      */     //   710	57	16	$i$f$cache	I
/*      */     //   707	60	14	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   707	60	15	invalid$iv	Z
/*      */     //   851	3	24	$i$a$-rememberCoroutineScope-EffectsKt$rememberCoroutineScope$1	I
/*      */     //   848	25	23	$i$a$-cache-EffectsKt$rememberCoroutineScope$wrapper$1$iv	I
/*      */     //   875	11	24	value$iv$iv	Ljava/lang/Object;
/*      */     //   834	58	22	$i$a$-let-ComposerKt$cache$1$iv$iv	I
/*      */     //   831	61	21	it$iv$iv	Ljava/lang/Object;
/*      */     //   822	72	20	$i$f$cache	I
/*      */     //   819	75	18	$this$cache$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   819	75	19	invalid$iv$iv	Z
/*      */     //   790	133	16	$i$f$rememberCoroutineScope	I
/*      */     //   803	120	17	composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   908	15	26	wrapper$iv	Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;
/*      */     //   787	136	15	$changed$iv	I
/*      */     //   1026	7	20	$i$a$-cache-ScrollableContainerKt$HorizontallyScrollableContainer$13	I
/*      */     //   1049	11	21	value$iv	Ljava/lang/Object;
/*      */     //   1002	64	19	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   999	67	18	it$iv	Ljava/lang/Object;
/*      */     //   990	78	17	$i$f$cache	I
/*      */     //   987	81	15	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   987	81	16	invalid$iv	Z
/*      */     //   783	350	12	keepVisible$delegate	Landroidx/compose/runtime/MutableState;
/*      */     //   925	208	13	scope	Lkotlinx/coroutines/CoroutineScope;
/*      */     //   30	1155	11	$dirty	I
/*      */     //   0	1185	0	scrollState	Landroidx/compose/foundation/lazy/grid/LazyGridState;
/*      */     //   0	1185	1	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	2	scrollbarModifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1185	3	style	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	1185	4	reverseLayout	Z
/*      */     //   0	1185	5	scrollbarEnabled	Z
/*      */     //   0	1185	6	scrollbarInteractionSource	Landroidx/compose/foundation/interaction/MutableInteractionSource;
/*      */     //   0	1185	7	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1185	8	$composer	Landroidx/compose/runtime/Composer;
/* 1003 */     //   0	1185	9	$changed	I } private static final boolean HorizontallyScrollableContainer$lambda$43(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void HorizontallyScrollableContainer$lambda$44(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1004 */     mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$HorizontallyScrollableContainer$12 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-809850387, $changed, -1, "org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer.<anonymous> (ScrollableContainer.kt:264)");  boolean bool = ScrollableContainerKt.HorizontallyScrollableContainer$lambda$43(this.$keepVisible$delegate); ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$scrollState, this.$scrollbarModifier, this.$reverseLayout, this.$scrollbarEnabled, this.$scrollbarInteractionSource, this.$style, bool, $composer, 0, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$HorizontallyScrollableContainer$12(LazyGridState $scrollState, Modifier $scrollbarModifier, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final Unit HorizontallyScrollableContainer$lambda$46$lambda$45(MutableState<Boolean> $keepVisible$delegate, boolean it) { HorizontallyScrollableContainer$lambda$44($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$14\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$HorizontallyScrollableContainer$14\n*L\n278#1:561\n278#1:562,6\n278#1:596\n278#1:600\n278#1:568,6\n278#1:583,4\n278#1:593,2\n278#1:599\n278#1:574,9\n278#1:595\n278#1:597,2\n278#1:587,6\n*E\n"}) static final class ScrollableContainerKt$HorizontallyScrollableContainer$14 implements Function2<Composer, Integer, Unit> {
/* 1006 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1322368758, $changed, -1, "org.jetbrains.jewel.ui.component.HorizontallyScrollableContainer.<anonymous> (ScrollableContainer.kt:277)");  Modifier modifier1 = LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 6, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$HorizontallyScrollableContainer$14$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$HorizontallyScrollableContainer$14(Function2<Composer, Integer, Unit> $content) {} } private static final boolean ScrollableContainer$lambda$49(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final void ScrollableContainer$lambda$50(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0;
/* 1007 */     mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$ScrollableContainer$1 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1493208396, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:299)");  ScrollbarKt.VerticalScrollbar((ScrollableState)this.$verticalScrollState, this.$verticalScrollbarModifier, false, false, null, this.$style, ScrollableContainerKt.ScrollableContainer$lambda$49(this.$keepVisible$delegate), $composer, 0, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$ScrollableContainer$1(ScrollState $verticalScrollState, Modifier $verticalScrollbarModifier, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$ScrollableContainer$2 implements Function2<Composer, Integer, Unit> {
/* 1009 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1764748499, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:302)");  ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$horizontalScrollState, this.$horizontalScrollbarModifier, false, false, null, this.$style, ScrollableContainerKt.ScrollableContainer$lambda$49(this.$keepVisible$delegate), $composer, 0, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$ScrollableContainer$2(ScrollState $horizontalScrollState, Modifier $horizontalScrollbarModifier, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final boolean ScrollableContainer$lambda$55(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final Unit ScrollableContainer$lambda$52$lambda$51(MutableState<Boolean> $keepVisible$delegate, boolean it) { ScrollableContainer$lambda$50($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainer$4\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainer$4\n*L\n313#1:561\n313#1:562,6\n313#1:596\n313#1:600\n313#1:568,6\n313#1:583,4\n313#1:593,2\n313#1:599\n313#1:574,9\n313#1:595\n313#1:597,2\n313#1:587,6\n*E\n"}) static final class ScrollableContainerKt$ScrollableContainer$4 implements Function2<Composer, Integer, Unit> {
/* 1010 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1346282704, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:312)");  Modifier modifier1 = ScrollKt.horizontalScroll$default(ScrollKt.verticalScroll$default(LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"), this.$verticalScrollState, false, null, false, 14, null), this.$horizontalScrollState, false, null, false, 14, null); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 0, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$ScrollableContainer$4$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$ScrollableContainer$4(ScrollState $verticalScrollState, ScrollState $horizontalScrollState, Function2<Composer, Integer, Unit> $content) {} } private static final void ScrollableContainer$lambda$56(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$ScrollableContainer$6 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1035823434, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:336)");  ScrollbarKt.VerticalScrollbar((ScrollableState)this.$verticalScrollState, this.$verticalScrollbarModifier, false, false, null, this.$style, ScrollableContainerKt.ScrollableContainer$lambda$55(this.$keepVisible$delegate), $composer, 0, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$ScrollableContainer$6(LazyListState $verticalScrollState, Modifier $verticalScrollbarModifier, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ScrollableContainerKt$ScrollableContainer$7 implements Function2<Composer, Integer, Unit> {
/* 1012 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(550878185, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:339)");  ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$horizontalScrollState, this.$horizontalScrollbarModifier, false, false, null, this.$style, ScrollableContainerKt.ScrollableContainer$lambda$55(this.$keepVisible$delegate), $composer, 0, 28); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$ScrollableContainer$7(LazyListState $horizontalScrollState, Modifier $horizontalScrollbarModifier, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {} } private static final boolean ScrollableContainer$lambda$61(MutableState $keepVisible$delegate) { State state = (State)$keepVisible$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return ((Boolean)state.getValue()).booleanValue(); } private static final Unit ScrollableContainer$lambda$58$lambda$57(MutableState<Boolean> $keepVisible$delegate, boolean it) { ScrollableContainer$lambda$56($keepVisible$delegate, it); return Unit.INSTANCE; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainer$9\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainer$9\n*L\n350#1:561\n350#1:562,6\n350#1:596\n350#1:600\n350#1:568,6\n350#1:583,4\n350#1:593,2\n350#1:599\n350#1:574,9\n350#1:595\n350#1:597,2\n350#1:587,6\n*E\n"}) static final class ScrollableContainerKt$ScrollableContainer$9 implements Function2<Composer, Integer, Unit> {
/* 1013 */     @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable") public final void invoke(Composer $composer, int $changed) { if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-903957562, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:349)");  Modifier modifier1 = LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content"); Function2<Composer, Integer, Unit> function2 = this.$content; int $changed$iv = 6, $i$f$Box = 0; ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo"); Alignment contentAlignment$iv = Alignment.Companion.getTopStart(); boolean propagateMinConstraints$iv = false; MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv); int $changed$iv$iv = 0x70 & $changed$iv << 3; int $i$f$Layout = 0; ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"); int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0); CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap(); Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1); Function0 function0 = ComposeUiNode.Companion.getConstructor(); int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6; int $i$f$ReusableComposeNode = 0; ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"); if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier)) ComposablesKt.invalidApplier();  $composer.startReusableNode(); if ($composer.getInserting()) { $composer.createNode(function0); } else { $composer.useNode(); }  Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer); int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0; Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy()); Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals()); Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash(); int $i$f$set-impl = 0; Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv; int $i$a$-with-Updater$set$1$iv$iv$iv = 0; if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) { $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv)); $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv); }  Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier()); int i = 0xE & $changed$iv$iv$iv >> 6; Composer $composer$iv = $composer; int $i$a$-Layout-BoxKt$Box$1$iv = 0; ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo"); int j = 0x6 | 0x70 & $changed$iv >> 6; Composer composer1 = $composer$iv; BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE; int $i$a$-Box-ScrollableContainerKt$ScrollableContainer$9$1 = 0; function2.invoke(composer1, Integer.valueOf(0)); ComposerKt.sourceInformationMarkerEnd($composer$iv); $composer.endNode(); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); ComposerKt.sourceInformationMarkerEnd($composer); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }  } ScrollableContainerKt$ScrollableContainer$9(Function2<Composer, Integer, Unit> $content) {} } private static final void ScrollableContainer$lambda$62(MutableState $keepVisible$delegate, boolean <set-?>) { MutableState mutableState = $keepVisible$delegate; Object object1 = null, object2 = null; Object value$iv = Boolean.valueOf(<set-?>); int $i$f$setValue = 0; mutableState.setValue(value$iv); }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*      */   static final class ScrollableContainerKt$ScrollableContainer$11 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(Composer $composer, int $changed) {
/*      */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventStart(-778128390, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:371)"); 
/*      */         ScrollbarKt.VerticalScrollbar((ScrollableState)this.$verticalScrollState, this.$verticalScrollbarModifier, false, false, null, this.$style, ScrollableContainerKt.ScrollableContainer$lambda$61(this.$keepVisible$delegate), $composer, 0, 28);
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventEnd(); 
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */     
/*      */     ScrollableContainerKt$ScrollableContainer$11(LazyGridState $verticalScrollState, Modifier $verticalScrollbarModifier, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {}
/*      */   }
/*      */   
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*      */   static final class ScrollableContainerKt$ScrollableContainer$12 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(Composer $composer, int $changed) {
/*      */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventStart(-1263073639, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:374)"); 
/*      */         ScrollbarKt.HorizontalScrollbar((ScrollableState)this.$horizontalScrollState, this.$horizontalScrollbarModifier, false, false, null, this.$style, ScrollableContainerKt.ScrollableContainer$lambda$61(this.$keepVisible$delegate), $composer, 0, 28);
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventEnd(); 
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */     
/*      */     ScrollableContainerKt$ScrollableContainer$12(LazyGridState $horizontalScrollState, Modifier $horizontalScrollbarModifier, ScrollbarStyle $style, MutableState<Boolean> $keepVisible$delegate) {}
/*      */   }
/*      */   
/*      */   private static final Unit ScrollableContainer$lambda$64$lambda$63(MutableState<Boolean> $keepVisible$delegate, boolean it) {
/*      */     ScrollableContainer$lambda$62($keepVisible$delegate, it);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*      */   @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainer$14\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,560:1\n71#2:561\n68#2,6:562\n74#2:596\n78#2:600\n79#3,6:568\n86#3,4:583\n90#3,2:593\n94#3:599\n368#4,9:574\n377#4:595\n378#4,2:597\n4034#5,6:587\n*S KotlinDebug\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainer$14\n*L\n385#1:561\n385#1:562,6\n385#1:596\n385#1:600\n385#1:568,6\n385#1:583,4\n385#1:593,2\n385#1:599\n385#1:574,9\n385#1:595\n385#1:597,2\n385#1:587,6\n*E\n"})
/*      */   static final class ScrollableContainerKt$ScrollableContainer$14 implements Function2<Composer, Integer, Unit> {
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(Composer $composer, int $changed) {
/*      */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventStart(1577057910, $changed, -1, "org.jetbrains.jewel.ui.component.ScrollableContainer.<anonymous> (ScrollableContainer.kt:384)"); 
/*      */         Modifier modifier1 = LayoutIdKt.layoutId((Modifier)Modifier.Companion, "VerticallyScrollableContainer_content");
/*      */         Function2<Composer, Integer, Unit> function2 = this.$content;
/*      */         int $changed$iv = 6, $i$f$Box = 0;
/*      */         ComposerKt.sourceInformationMarkerStart($composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
/*      */         Alignment contentAlignment$iv = Alignment.Companion.getTopStart();
/*      */         boolean propagateMinConstraints$iv = false;
/*      */         MeasurePolicy measurePolicy$iv = BoxKt.maybeCachedBoxMeasurePolicy(contentAlignment$iv, propagateMinConstraints$iv);
/*      */         int $changed$iv$iv = 0x70 & $changed$iv << 3;
/*      */         int $i$f$Layout = 0;
/*      */         ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
/*      */         int compositeKeyHash$iv$iv = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
/*      */         CompositionLocalMap localMap$iv$iv = $composer.getCurrentCompositionLocalMap();
/*      */         Modifier materialized$iv$iv = ComposedModifierKt.materializeModifier($composer, modifier1);
/*      */         Function0 function0 = ComposeUiNode.Companion.getConstructor();
/*      */         int $changed$iv$iv$iv = 0x6 | 0x380 & $changed$iv$iv << 6;
/*      */         int $i$f$ReusableComposeNode = 0;
/*      */         ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
/*      */         if (!($composer.getApplier() instanceof androidx.compose.runtime.Applier))
/*      */           ComposablesKt.invalidApplier(); 
/*      */         $composer.startReusableNode();
/*      */         if ($composer.getInserting()) {
/*      */           $composer.createNode(function0);
/*      */         } else {
/*      */           $composer.useNode();
/*      */         } 
/*      */         Composer $this$Layout_u24lambda_u240$iv$iv = Updater.constructor-impl($composer);
/*      */         int $i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv = 0;
/*      */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, measurePolicy$iv, ComposeUiNode.Companion.getSetMeasurePolicy());
/*      */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, localMap$iv$iv, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
/*      */         Function2 block$iv$iv$iv = ComposeUiNode.Companion.getSetCompositeKeyHash();
/*      */         int $i$f$set-impl = 0;
/*      */         Composer $this$set_impl_u24lambda_u240$iv$iv$iv = $this$Layout_u24lambda_u240$iv$iv;
/*      */         int $i$a$-with-Updater$set$1$iv$iv$iv = 0;
/*      */         if ($this$set_impl_u24lambda_u240$iv$iv$iv.getInserting() || !Intrinsics.areEqual($this$set_impl_u24lambda_u240$iv$iv$iv.rememberedValue(), Integer.valueOf(compositeKeyHash$iv$iv))) {
/*      */           $this$set_impl_u24lambda_u240$iv$iv$iv.updateRememberedValue(Integer.valueOf(compositeKeyHash$iv$iv));
/*      */           $this$Layout_u24lambda_u240$iv$iv.apply(Integer.valueOf(compositeKeyHash$iv$iv), block$iv$iv$iv);
/*      */         } 
/*      */         Updater.set-impl($this$Layout_u24lambda_u240$iv$iv, materialized$iv$iv, ComposeUiNode.Companion.getSetModifier());
/*      */         int i = 0xE & $changed$iv$iv$iv >> 6;
/*      */         Composer $composer$iv = $composer;
/*      */         int $i$a$-Layout-BoxKt$Box$1$iv = 0;
/*      */         ComposerKt.sourceInformationMarkerStart($composer$iv, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
/*      */         int j = 0x6 | 0x70 & $changed$iv >> 6;
/*      */         Composer composer1 = $composer$iv;
/*      */         BoxScope $this$invoke_u24lambda_u240 = (BoxScope)BoxScopeInstance.INSTANCE;
/*      */         int $i$a$-Box-ScrollableContainerKt$ScrollableContainer$14$1 = 0;
/*      */         function2.invoke(composer1, Integer.valueOf(0));
/*      */         ComposerKt.sourceInformationMarkerEnd($composer$iv);
/*      */         $composer.endNode();
/*      */         ComposerKt.sourceInformationMarkerEnd($composer);
/*      */         ComposerKt.sourceInformationMarkerEnd($composer);
/*      */         ComposerKt.sourceInformationMarkerEnd($composer);
/*      */         if (ComposerKt.isTraceInProgress())
/*      */           ComposerKt.traceEventEnd(); 
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */     
/*      */     ScrollableContainerKt$ScrollableContainer$14(Function2<Composer, Integer, Unit> $content) {}
/*      */   }
/*      */   
/*      */   private static final Modifier withKeepVisible-dWUq8MI(Modifier $this$withKeepVisible_u2ddWUq8MI, long lingerDuration, CoroutineScope scope, Function1<? super Boolean, Unit> onKeepVisibleChange) {
/*      */     return SuspendingPointerInputFilterKt.pointerInput($this$withKeepVisible_u2ddWUq8MI, scope, new ScrollableContainerKt$withKeepVisible$1(onKeepVisibleChange, scope, lingerDuration, null));
/*      */   }
/*      */   
/*      */   @DebugMetadata(f = "ScrollableContainer.kt", l = {396}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.ui.component.ScrollableContainerKt$withKeepVisible$1")
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"})
/*      */   static final class ScrollableContainerKt$withKeepVisible$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
/*      */     int label;
/*      */     
/*      */     ScrollableContainerKt$withKeepVisible$1(Function1<Boolean, Unit> $onKeepVisibleChange, CoroutineScope $scope, long $lingerDuration, Continuation $completion) {
/*      */       super(2, $completion);
/*      */     }
/*      */     
/*      */     public final Object invokeSuspend(Object $result) {
/*      */       PointerInputScope $this$pointerInput;
/*      */       Ref.ObjectRef<Job> delayJob;
/*      */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*      */       switch (this.label) {
/*      */         case 0:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           $this$pointerInput = (PointerInputScope)this.L$0;
/*      */           delayJob = new Ref.ObjectRef();
/*      */           this.label = 1;
/*      */           if (ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, null) {
/*      */                 int label;
/*      */                 
/*      */                 public final Object invokeSuspend(Object $result) {
/*      */                   // Byte code:
/*      */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */                   //   3: astore #4
/*      */                   //   5: aload_0
/*      */                   //   6: getfield label : I
/*      */                   //   9: tableswitch default -> 173, 0 -> 32, 1 -> 69
/*      */                   //   32: aload_1
/*      */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   36: aload_0
/*      */                   //   37: getfield L$0 : Ljava/lang/Object;
/*      */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*      */                   //   43: astore_2
/*      */                   //   44: aload_2
/*      */                   //   45: aconst_null
/*      */                   //   46: aload_0
/*      */                   //   47: checkcast kotlin/coroutines/Continuation
/*      */                   //   50: iconst_1
/*      */                   //   51: aconst_null
/*      */                   //   52: aload_0
/*      */                   //   53: iconst_1
/*      */                   //   54: putfield label : I
/*      */                   //   57: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*      */                   //   60: dup
/*      */                   //   61: aload #4
/*      */                   //   63: if_acmpne -> 74
/*      */                   //   66: aload #4
/*      */                   //   68: areturn
/*      */                   //   69: aload_1
/*      */                   //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   73: aload_1
/*      */                   //   74: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*      */                   //   77: astore_3
/*      */                   //   78: aload_3
/*      */                   //   79: invokevirtual getType-7fucELk : ()I
/*      */                   //   82: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*      */                   //   85: invokevirtual getMove-7fucELk : ()I
/*      */                   //   88: invokestatic equals-impl0 : (II)Z
/*      */                   //   91: ifeq -> 169
/*      */                   //   94: aload_0
/*      */                   //   95: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*      */                   //   98: getfield element : Ljava/lang/Object;
/*      */                   //   101: checkcast kotlinx/coroutines/Job
/*      */                   //   104: dup
/*      */                   //   105: ifnull -> 117
/*      */                   //   108: aconst_null
/*      */                   //   109: iconst_1
/*      */                   //   110: aconst_null
/*      */                   //   111: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*      */                   //   114: goto -> 118
/*      */                   //   117: pop
/*      */                   //   118: aload_0
/*      */                   //   119: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*      */                   //   122: iconst_1
/*      */                   //   123: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*      */                   //   126: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */                   //   131: pop
/*      */                   //   132: aload_0
/*      */                   //   133: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*      */                   //   136: aload_0
/*      */                   //   137: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*      */                   //   140: aconst_null
/*      */                   //   141: aconst_null
/*      */                   //   142: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$withKeepVisible$1$1$1
/*      */                   //   145: dup
/*      */                   //   146: aload_0
/*      */                   //   147: getfield $lingerDuration : J
/*      */                   //   150: aload_0
/*      */                   //   151: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*      */                   //   154: aconst_null
/*      */                   //   155: invokespecial <init> : (JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*      */                   //   158: checkcast kotlin/jvm/functions/Function2
/*      */                   //   161: iconst_3
/*      */                   //   162: aconst_null
/*      */                   //   163: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*      */                   //   166: putfield element : Ljava/lang/Object;
/*      */                   //   169: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */                   //   172: areturn
/*      */                   //   173: new java/lang/IllegalStateException
/*      */                   //   176: dup
/*      */                   //   177: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */                   //   179: invokespecial <init> : (Ljava/lang/String;)V
/*      */                   //   182: athrow
/*      */                   // Line number table:
/*      */                   //   Java source line number -> byte code offset
/*      */                   //   #396	-> 3
/*      */                   //   #397	-> 44
/*      */                   //   #396	-> 66
/*      */                   //   #398	-> 78
/*      */                   //   #399	-> 94
/*      */                   //   #400	-> 118
/*      */                   //   #401	-> 132
/*      */                   //   #402	-> 136
/*      */                   //   #401	-> 166
/*      */                   //   #407	-> 169
/*      */                   //   #396	-> 173
/*      */                   // Local variable table:
/*      */                   //   start	length	slot	name	descriptor
/*      */                   //   44	16	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*      */                   //   78	16	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*      */                   //   0	183	0	this	Lorg/jetbrains/jewel/ui/component/ScrollableContainerKt$withKeepVisible$1$1;
/*      */                   //   36	137	1	$result	Ljava/lang/Object;
/*      */                 }
/*      */                 
/*      */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*      */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion);
/*      */                   function2.L$0 = value;
/*      */                   return (Continuation)function2;
/*      */                 }
/*      */                 
/*      */                 public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this) == object)
/*      */             return object; 
/*      */           ForEachGestureKt.awaitEachGesture($this$pointerInput, new Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object>(delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, null) {
/*      */                 int label;
/*      */                 
/*      */                 public final Object invokeSuspend(Object $result) {
/*      */                   // Byte code:
/*      */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*      */                   //   3: astore #4
/*      */                   //   5: aload_0
/*      */                   //   6: getfield label : I
/*      */                   //   9: tableswitch default -> 173, 0 -> 32, 1 -> 69
/*      */                   //   32: aload_1
/*      */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   36: aload_0
/*      */                   //   37: getfield L$0 : Ljava/lang/Object;
/*      */                   //   40: checkcast androidx/compose/ui/input/pointer/AwaitPointerEventScope
/*      */                   //   43: astore_2
/*      */                   //   44: aload_2
/*      */                   //   45: aconst_null
/*      */                   //   46: aload_0
/*      */                   //   47: checkcast kotlin/coroutines/Continuation
/*      */                   //   50: iconst_1
/*      */                   //   51: aconst_null
/*      */                   //   52: aload_0
/*      */                   //   53: iconst_1
/*      */                   //   54: putfield label : I
/*      */                   //   57: invokestatic awaitPointerEvent$default : (Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*      */                   //   60: dup
/*      */                   //   61: aload #4
/*      */                   //   63: if_acmpne -> 74
/*      */                   //   66: aload #4
/*      */                   //   68: areturn
/*      */                   //   69: aload_1
/*      */                   //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*      */                   //   73: aload_1
/*      */                   //   74: checkcast androidx/compose/ui/input/pointer/PointerEvent
/*      */                   //   77: astore_3
/*      */                   //   78: aload_3
/*      */                   //   79: invokevirtual getType-7fucELk : ()I
/*      */                   //   82: getstatic androidx/compose/ui/input/pointer/PointerEventType.Companion : Landroidx/compose/ui/input/pointer/PointerEventType$Companion;
/*      */                   //   85: invokevirtual getMove-7fucELk : ()I
/*      */                   //   88: invokestatic equals-impl0 : (II)Z
/*      */                   //   91: ifeq -> 169
/*      */                   //   94: aload_0
/*      */                   //   95: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*      */                   //   98: getfield element : Ljava/lang/Object;
/*      */                   //   101: checkcast kotlinx/coroutines/Job
/*      */                   //   104: dup
/*      */                   //   105: ifnull -> 117
/*      */                   //   108: aconst_null
/*      */                   //   109: iconst_1
/*      */                   //   110: aconst_null
/*      */                   //   111: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*      */                   //   114: goto -> 118
/*      */                   //   117: pop
/*      */                   //   118: aload_0
/*      */                   //   119: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*      */                   //   122: iconst_1
/*      */                   //   123: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*      */                   //   126: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*      */                   //   131: pop
/*      */                   //   132: aload_0
/*      */                   //   133: getfield $delayJob : Lkotlin/jvm/internal/Ref$ObjectRef;
/*      */                   //   136: aload_0
/*      */                   //   137: getfield $scope : Lkotlinx/coroutines/CoroutineScope;
/*      */                   //   140: aconst_null
/*      */                   //   141: aconst_null
/*      */                   //   142: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$withKeepVisible$1$1$1
/*      */                   //   145: dup
/*      */                   //   146: aload_0
/*      */                   //   147: getfield $lingerDuration : J
/*      */                   //   150: aload_0
/*      */                   //   151: getfield $onKeepVisibleChange : Lkotlin/jvm/functions/Function1;
/*      */                   //   154: aconst_null
/*      */                   //   155: invokespecial <init> : (JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*      */                   //   158: checkcast kotlin/jvm/functions/Function2
/*      */                   //   161: iconst_3
/*      */                   //   162: aconst_null
/*      */                   //   163: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*      */                   //   166: putfield element : Ljava/lang/Object;
/*      */                   //   169: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*      */                   //   172: areturn
/*      */                   //   173: new java/lang/IllegalStateException
/*      */                   //   176: dup
/*      */                   //   177: ldc 'call to 'resume' before 'invoke' with coroutine'
/*      */                   //   179: invokespecial <init> : (Ljava/lang/String;)V
/*      */                   //   182: athrow
/*      */                   // Line number table:
/*      */                   //   Java source line number -> byte code offset
/*      */                   //   #396	-> 3
/*      */                   //   #397	-> 44
/*      */                   //   #396	-> 66
/*      */                   //   #398	-> 78
/*      */                   //   #399	-> 94
/*      */                   //   #400	-> 118
/*      */                   //   #401	-> 132
/*      */                   //   #402	-> 136
/*      */                   //   #401	-> 166
/*      */                   //   #407	-> 169
/*      */                   //   #396	-> 173
/*      */                   // Local variable table:
/*      */                   //   start	length	slot	name	descriptor
/*      */                   //   44	16	2	$this$awaitEachGesture	Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;
/*      */                   //   78	16	3	event	Landroidx/compose/ui/input/pointer/PointerEvent;
/*      */                   //   0	183	0	this	Lorg/jetbrains/jewel/ui/component/ScrollableContainerKt$withKeepVisible$1$1;
/*      */                   //   36	137	1	$result	Ljava/lang/Object;
/*      */                 }
/*      */                 
/*      */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*      */                   Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$delayJob, this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion);
/*      */                   function2.L$0 = value;
/*      */                   return (Continuation)function2;
/*      */                 }
/*      */                 
/*      */                 public final Object invoke(AwaitPointerEventScope p1, Continuation<?> p2) {
/*      */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */                 }
/*      */               }(Continuation)this);
/*      */           return Unit.INSTANCE;
/*      */         case 1:
/*      */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*      */           return Unit.INSTANCE;
/*      */       } 
/*      */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*      */     }
/*      */     
/*      */     public final Continuation<Unit> create(Object value, Continuation<? super ScrollableContainerKt$withKeepVisible$1> $completion) {
/*      */       ScrollableContainerKt$withKeepVisible$1 scrollableContainerKt$withKeepVisible$1 = new ScrollableContainerKt$withKeepVisible$1(this.$onKeepVisibleChange, this.$scope, this.$lingerDuration, $completion);
/*      */       scrollableContainerKt$withKeepVisible$1.L$0 = value;
/*      */       return (Continuation<Unit>)scrollableContainerKt$withKeepVisible$1;
/*      */     }
/*      */     
/*      */     public final Object invoke(PointerInputScope p1, Continuation<?> p2) {
/*      */       return ((ScrollableContainerKt$withKeepVisible$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*      */     }
/*      */   }
/*      */   
/*      */   @Composable
/*      */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
/*      */   private static final void ScrollableContainerImpl(Function2 verticalScrollbar, Function2 horizontalScrollbar, Modifier modifier, ScrollbarStyle scrollbarStyle, Function2 content, Composer $composer, int $changed) {
/*      */     // Byte code:
/*      */     //   0: aload #5
/*      */     //   2: ldc_w -2084805037
/*      */     //   5: invokeinterface startRestartGroup : (I)Landroidx/compose/runtime/Composer;
/*      */     //   10: astore #5
/*      */     //   12: iload #6
/*      */     //   14: istore #7
/*      */     //   16: iload #6
/*      */     //   18: bipush #6
/*      */     //   20: iand
/*      */     //   21: ifne -> 45
/*      */     //   24: iload #7
/*      */     //   26: aload #5
/*      */     //   28: aload_0
/*      */     //   29: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   34: ifeq -> 41
/*      */     //   37: iconst_4
/*      */     //   38: goto -> 42
/*      */     //   41: iconst_2
/*      */     //   42: ior
/*      */     //   43: istore #7
/*      */     //   45: iload #6
/*      */     //   47: bipush #48
/*      */     //   49: iand
/*      */     //   50: ifne -> 76
/*      */     //   53: iload #7
/*      */     //   55: aload #5
/*      */     //   57: aload_1
/*      */     //   58: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   63: ifeq -> 71
/*      */     //   66: bipush #32
/*      */     //   68: goto -> 73
/*      */     //   71: bipush #16
/*      */     //   73: ior
/*      */     //   74: istore #7
/*      */     //   76: iload #6
/*      */     //   78: sipush #384
/*      */     //   81: iand
/*      */     //   82: ifne -> 110
/*      */     //   85: iload #7
/*      */     //   87: aload #5
/*      */     //   89: aload_2
/*      */     //   90: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   95: ifeq -> 104
/*      */     //   98: sipush #256
/*      */     //   101: goto -> 107
/*      */     //   104: sipush #128
/*      */     //   107: ior
/*      */     //   108: istore #7
/*      */     //   110: iload #6
/*      */     //   112: sipush #3072
/*      */     //   115: iand
/*      */     //   116: ifne -> 144
/*      */     //   119: iload #7
/*      */     //   121: aload #5
/*      */     //   123: aload_3
/*      */     //   124: invokeinterface changed : (Ljava/lang/Object;)Z
/*      */     //   129: ifeq -> 138
/*      */     //   132: sipush #2048
/*      */     //   135: goto -> 141
/*      */     //   138: sipush #1024
/*      */     //   141: ior
/*      */     //   142: istore #7
/*      */     //   144: iload #6
/*      */     //   146: sipush #24576
/*      */     //   149: iand
/*      */     //   150: ifne -> 179
/*      */     //   153: iload #7
/*      */     //   155: aload #5
/*      */     //   157: aload #4
/*      */     //   159: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*      */     //   164: ifeq -> 173
/*      */     //   167: sipush #16384
/*      */     //   170: goto -> 176
/*      */     //   173: sipush #8192
/*      */     //   176: ior
/*      */     //   177: istore #7
/*      */     //   179: iload #7
/*      */     //   181: sipush #9363
/*      */     //   184: iand
/*      */     //   185: sipush #9362
/*      */     //   188: if_icmpne -> 201
/*      */     //   191: aload #5
/*      */     //   193: invokeinterface getSkipping : ()Z
/*      */     //   198: ifne -> 1553
/*      */     //   201: invokestatic isTraceInProgress : ()Z
/*      */     //   204: ifeq -> 219
/*      */     //   207: ldc_w -2084805037
/*      */     //   210: iload #7
/*      */     //   212: iconst_m1
/*      */     //   213: ldc_w 'org.jetbrains.jewel.ui.component.ScrollableContainerImpl (ScrollableContainer.kt:416)'
/*      */     //   216: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*      */     //   219: aload #5
/*      */     //   221: ldc_w -1718845400
/*      */     //   224: invokeinterface startReplaceGroup : (I)V
/*      */     //   229: aload #5
/*      */     //   231: astore #9
/*      */     //   233: iload #7
/*      */     //   235: sipush #7168
/*      */     //   238: iand
/*      */     //   239: sipush #2048
/*      */     //   242: if_icmpne -> 249
/*      */     //   245: iconst_1
/*      */     //   246: goto -> 250
/*      */     //   249: iconst_0
/*      */     //   250: istore #10
/*      */     //   252: nop
/*      */     //   253: iconst_0
/*      */     //   254: istore #11
/*      */     //   256: aload #9
/*      */     //   258: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   263: astore #12
/*      */     //   265: iconst_0
/*      */     //   266: istore #13
/*      */     //   268: iload #10
/*      */     //   270: ifne -> 284
/*      */     //   273: aload #12
/*      */     //   275: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*      */     //   278: invokevirtual getEmpty : ()Ljava/lang/Object;
/*      */     //   281: if_acmpne -> 314
/*      */     //   284: iconst_0
/*      */     //   285: istore #14
/*      */     //   287: new org/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainerImpl$2$1
/*      */     //   290: dup
/*      */     //   291: aload_3
/*      */     //   292: invokespecial <init> : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;)V
/*      */     //   295: checkcast androidx/compose/ui/layout/MeasurePolicy
/*      */     //   298: astore #15
/*      */     //   300: aload #9
/*      */     //   302: aload #15
/*      */     //   304: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   309: aload #15
/*      */     //   311: goto -> 316
/*      */     //   314: aload #12
/*      */     //   316: nop
/*      */     //   317: nop
/*      */     //   318: nop
/*      */     //   319: checkcast androidx/compose/ui/layout/MeasurePolicy
/*      */     //   322: astore #8
/*      */     //   324: aload #5
/*      */     //   326: invokeinterface endReplaceGroup : ()V
/*      */     //   331: aload #8
/*      */     //   333: astore #8
/*      */     //   335: bipush #112
/*      */     //   337: iload #7
/*      */     //   339: iconst_3
/*      */     //   340: ishr
/*      */     //   341: iand
/*      */     //   342: istore #9
/*      */     //   344: nop
/*      */     //   345: iconst_0
/*      */     //   346: istore #10
/*      */     //   348: aload #5
/*      */     //   350: ldc_w -1323940314
/*      */     //   353: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   356: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   359: aload #5
/*      */     //   361: iconst_0
/*      */     //   362: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   365: istore #11
/*      */     //   367: aload #5
/*      */     //   369: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   374: astore #12
/*      */     //   376: aload #5
/*      */     //   378: aload_2
/*      */     //   379: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   382: astore #13
/*      */     //   384: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   387: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   390: astore #14
/*      */     //   392: bipush #6
/*      */     //   394: sipush #896
/*      */     //   397: iload #9
/*      */     //   399: bipush #6
/*      */     //   401: ishl
/*      */     //   402: iand
/*      */     //   403: ior
/*      */     //   404: istore #15
/*      */     //   406: nop
/*      */     //   407: iconst_0
/*      */     //   408: istore #16
/*      */     //   410: aload #5
/*      */     //   412: ldc_w -692256719
/*      */     //   415: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   418: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   421: aload #5
/*      */     //   423: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   428: instanceof androidx/compose/runtime/Applier
/*      */     //   431: ifne -> 437
/*      */     //   434: invokestatic invalidApplier : ()V
/*      */     //   437: aload #5
/*      */     //   439: invokeinterface startReusableNode : ()V
/*      */     //   444: aload #5
/*      */     //   446: invokeinterface getInserting : ()Z
/*      */     //   451: ifeq -> 466
/*      */     //   454: aload #5
/*      */     //   456: aload #14
/*      */     //   458: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   463: goto -> 473
/*      */     //   466: aload #5
/*      */     //   468: invokeinterface useNode : ()V
/*      */     //   473: aload #5
/*      */     //   475: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   478: astore #17
/*      */     //   480: iconst_0
/*      */     //   481: istore #18
/*      */     //   483: aload #17
/*      */     //   485: aload #8
/*      */     //   487: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   490: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   493: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   496: aload #17
/*      */     //   498: aload #12
/*      */     //   500: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   503: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   506: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   509: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   512: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   515: astore #19
/*      */     //   517: iconst_0
/*      */     //   518: istore #20
/*      */     //   520: aload #17
/*      */     //   522: astore #21
/*      */     //   524: iconst_0
/*      */     //   525: istore #22
/*      */     //   527: aload #21
/*      */     //   529: invokeinterface getInserting : ()Z
/*      */     //   534: ifne -> 555
/*      */     //   537: aload #21
/*      */     //   539: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   544: iload #11
/*      */     //   546: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   549: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   552: ifne -> 581
/*      */     //   555: aload #21
/*      */     //   557: iload #11
/*      */     //   559: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   562: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   567: aload #17
/*      */     //   569: iload #11
/*      */     //   571: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   574: aload #19
/*      */     //   576: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   581: nop
/*      */     //   582: nop
/*      */     //   583: nop
/*      */     //   584: aload #17
/*      */     //   586: aload #13
/*      */     //   588: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   591: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   594: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   597: nop
/*      */     //   598: nop
/*      */     //   599: aload #5
/*      */     //   601: bipush #14
/*      */     //   603: iload #15
/*      */     //   605: bipush #6
/*      */     //   607: ishr
/*      */     //   608: iand
/*      */     //   609: istore #23
/*      */     //   611: astore #24
/*      */     //   613: iconst_0
/*      */     //   614: istore #25
/*      */     //   616: aload #4
/*      */     //   618: aload #24
/*      */     //   620: bipush #14
/*      */     //   622: iload #7
/*      */     //   624: bipush #12
/*      */     //   626: ishr
/*      */     //   627: iand
/*      */     //   628: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   631: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   636: pop
/*      */     //   637: aload #24
/*      */     //   639: ldc_w -2034047585
/*      */     //   642: invokeinterface startReplaceGroup : (I)V
/*      */     //   647: aload_0
/*      */     //   648: ifnull -> 1071
/*      */     //   651: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   654: checkcast androidx/compose/ui/Modifier
/*      */     //   657: ldc_w 'VerticallyScrollableContainer_verticalScrollbar'
/*      */     //   660: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   663: astore #26
/*      */     //   665: bipush #6
/*      */     //   667: istore #27
/*      */     //   669: iconst_0
/*      */     //   670: istore #28
/*      */     //   672: aload #24
/*      */     //   674: ldc_w 733328855
/*      */     //   677: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   680: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   683: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   686: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   689: astore #29
/*      */     //   691: iconst_0
/*      */     //   692: istore #30
/*      */     //   694: aload #29
/*      */     //   696: iload #30
/*      */     //   698: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   701: astore #31
/*      */     //   703: bipush #112
/*      */     //   705: iload #27
/*      */     //   707: iconst_3
/*      */     //   708: ishl
/*      */     //   709: iand
/*      */     //   710: istore #32
/*      */     //   712: nop
/*      */     //   713: iconst_0
/*      */     //   714: istore #33
/*      */     //   716: aload #24
/*      */     //   718: ldc_w -1323940314
/*      */     //   721: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   724: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   727: aload #24
/*      */     //   729: iconst_0
/*      */     //   730: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   733: istore #34
/*      */     //   735: aload #24
/*      */     //   737: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   742: astore #35
/*      */     //   744: aload #24
/*      */     //   746: aload #26
/*      */     //   748: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   751: astore #36
/*      */     //   753: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   756: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   759: astore #37
/*      */     //   761: bipush #6
/*      */     //   763: sipush #896
/*      */     //   766: iload #32
/*      */     //   768: bipush #6
/*      */     //   770: ishl
/*      */     //   771: iand
/*      */     //   772: ior
/*      */     //   773: istore #38
/*      */     //   775: nop
/*      */     //   776: iconst_0
/*      */     //   777: istore #39
/*      */     //   779: aload #24
/*      */     //   781: ldc_w -692256719
/*      */     //   784: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   787: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   790: aload #24
/*      */     //   792: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   797: instanceof androidx/compose/runtime/Applier
/*      */     //   800: ifne -> 806
/*      */     //   803: invokestatic invalidApplier : ()V
/*      */     //   806: aload #24
/*      */     //   808: invokeinterface startReusableNode : ()V
/*      */     //   813: aload #24
/*      */     //   815: invokeinterface getInserting : ()Z
/*      */     //   820: ifeq -> 835
/*      */     //   823: aload #24
/*      */     //   825: aload #37
/*      */     //   827: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   832: goto -> 842
/*      */     //   835: aload #24
/*      */     //   837: invokeinterface useNode : ()V
/*      */     //   842: aload #24
/*      */     //   844: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   847: astore #40
/*      */     //   849: iconst_0
/*      */     //   850: istore #41
/*      */     //   852: aload #40
/*      */     //   854: aload #31
/*      */     //   856: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   859: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   862: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   865: aload #40
/*      */     //   867: aload #35
/*      */     //   869: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   872: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   875: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   878: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   881: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   884: astore #42
/*      */     //   886: iconst_0
/*      */     //   887: istore #43
/*      */     //   889: aload #40
/*      */     //   891: astore #44
/*      */     //   893: iconst_0
/*      */     //   894: istore #45
/*      */     //   896: aload #44
/*      */     //   898: invokeinterface getInserting : ()Z
/*      */     //   903: ifne -> 924
/*      */     //   906: aload #44
/*      */     //   908: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   913: iload #34
/*      */     //   915: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   918: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   921: ifne -> 950
/*      */     //   924: aload #44
/*      */     //   926: iload #34
/*      */     //   928: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   931: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   936: aload #40
/*      */     //   938: iload #34
/*      */     //   940: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   943: aload #42
/*      */     //   945: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   950: nop
/*      */     //   951: nop
/*      */     //   952: nop
/*      */     //   953: aload #40
/*      */     //   955: aload #36
/*      */     //   957: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   960: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   963: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   966: nop
/*      */     //   967: nop
/*      */     //   968: aload #24
/*      */     //   970: bipush #14
/*      */     //   972: iload #38
/*      */     //   974: bipush #6
/*      */     //   976: ishr
/*      */     //   977: iand
/*      */     //   978: istore #46
/*      */     //   980: astore #47
/*      */     //   982: iconst_0
/*      */     //   983: istore #48
/*      */     //   985: aload #47
/*      */     //   987: ldc_w -2146769399
/*      */     //   990: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   993: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   996: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   999: aload #47
/*      */     //   1001: bipush #6
/*      */     //   1003: bipush #112
/*      */     //   1005: iload #27
/*      */     //   1007: bipush #6
/*      */     //   1009: ishr
/*      */     //   1010: iand
/*      */     //   1011: ior
/*      */     //   1012: istore #49
/*      */     //   1014: astore #50
/*      */     //   1016: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   1019: astore #51
/*      */     //   1021: iconst_0
/*      */     //   1022: istore #52
/*      */     //   1024: aload_0
/*      */     //   1025: aload #50
/*      */     //   1027: bipush #14
/*      */     //   1029: iload #7
/*      */     //   1031: iand
/*      */     //   1032: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1035: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   1040: pop
/*      */     //   1041: aload #47
/*      */     //   1043: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1046: aload #24
/*      */     //   1048: invokeinterface endNode : ()V
/*      */     //   1053: aload #24
/*      */     //   1055: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1058: nop
/*      */     //   1059: aload #24
/*      */     //   1061: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1064: nop
/*      */     //   1065: aload #24
/*      */     //   1067: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1070: nop
/*      */     //   1071: aload #24
/*      */     //   1073: invokeinterface endReplaceGroup : ()V
/*      */     //   1078: aload #24
/*      */     //   1080: ldc_w -2034042907
/*      */     //   1083: invokeinterface startReplaceGroup : (I)V
/*      */     //   1088: aload_1
/*      */     //   1089: ifnull -> 1514
/*      */     //   1092: getstatic androidx/compose/ui/Modifier.Companion : Landroidx/compose/ui/Modifier$Companion;
/*      */     //   1095: checkcast androidx/compose/ui/Modifier
/*      */     //   1098: ldc_w 'VerticallyScrollableContainer_horizontalScrollbar'
/*      */     //   1101: invokestatic layoutId : (Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;
/*      */     //   1104: astore #26
/*      */     //   1106: bipush #6
/*      */     //   1108: istore #27
/*      */     //   1110: iconst_0
/*      */     //   1111: istore #28
/*      */     //   1113: aload #24
/*      */     //   1115: ldc_w 733328855
/*      */     //   1118: ldc_w 'CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo'
/*      */     //   1121: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1124: getstatic androidx/compose/ui/Alignment.Companion : Landroidx/compose/ui/Alignment$Companion;
/*      */     //   1127: invokevirtual getTopStart : ()Landroidx/compose/ui/Alignment;
/*      */     //   1130: astore #29
/*      */     //   1132: iconst_0
/*      */     //   1133: istore #30
/*      */     //   1135: aload #29
/*      */     //   1137: iload #30
/*      */     //   1139: invokestatic maybeCachedBoxMeasurePolicy : (Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1142: astore #31
/*      */     //   1144: bipush #112
/*      */     //   1146: iload #27
/*      */     //   1148: iconst_3
/*      */     //   1149: ishl
/*      */     //   1150: iand
/*      */     //   1151: istore #32
/*      */     //   1153: nop
/*      */     //   1154: iconst_0
/*      */     //   1155: istore #33
/*      */     //   1157: aload #24
/*      */     //   1159: ldc_w -1323940314
/*      */     //   1162: ldc_w 'CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh'
/*      */     //   1165: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1168: aload #24
/*      */     //   1170: iconst_0
/*      */     //   1171: invokestatic getCurrentCompositeKeyHash : (Landroidx/compose/runtime/Composer;I)I
/*      */     //   1174: istore #34
/*      */     //   1176: aload #24
/*      */     //   1178: invokeinterface getCurrentCompositionLocalMap : ()Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1183: astore #35
/*      */     //   1185: aload #24
/*      */     //   1187: aload #26
/*      */     //   1189: invokestatic materializeModifier : (Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
/*      */     //   1192: astore #36
/*      */     //   1194: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1197: invokevirtual getConstructor : ()Lkotlin/jvm/functions/Function0;
/*      */     //   1200: astore #37
/*      */     //   1202: bipush #6
/*      */     //   1204: sipush #896
/*      */     //   1207: iload #32
/*      */     //   1209: bipush #6
/*      */     //   1211: ishl
/*      */     //   1212: iand
/*      */     //   1213: ior
/*      */     //   1214: istore #38
/*      */     //   1216: nop
/*      */     //   1217: iconst_0
/*      */     //   1218: istore #39
/*      */     //   1220: aload #24
/*      */     //   1222: ldc_w -692256719
/*      */     //   1225: ldc_w 'CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp'
/*      */     //   1228: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1231: aload #24
/*      */     //   1233: invokeinterface getApplier : ()Landroidx/compose/runtime/Applier;
/*      */     //   1238: instanceof androidx/compose/runtime/Applier
/*      */     //   1241: ifne -> 1247
/*      */     //   1244: invokestatic invalidApplier : ()V
/*      */     //   1247: aload #24
/*      */     //   1249: invokeinterface startReusableNode : ()V
/*      */     //   1254: aload #24
/*      */     //   1256: invokeinterface getInserting : ()Z
/*      */     //   1261: ifeq -> 1276
/*      */     //   1264: aload #24
/*      */     //   1266: aload #37
/*      */     //   1268: invokeinterface createNode : (Lkotlin/jvm/functions/Function0;)V
/*      */     //   1273: goto -> 1283
/*      */     //   1276: aload #24
/*      */     //   1278: invokeinterface useNode : ()V
/*      */     //   1283: aload #24
/*      */     //   1285: invokestatic constructor-impl : (Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;
/*      */     //   1288: astore #40
/*      */     //   1290: iconst_0
/*      */     //   1291: istore #41
/*      */     //   1293: aload #40
/*      */     //   1295: aload #31
/*      */     //   1297: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1300: invokevirtual getSetMeasurePolicy : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1303: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1306: aload #40
/*      */     //   1308: aload #35
/*      */     //   1310: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1313: invokevirtual getSetResolvedCompositionLocals : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1316: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1319: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1322: invokevirtual getSetCompositeKeyHash : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1325: astore #42
/*      */     //   1327: iconst_0
/*      */     //   1328: istore #43
/*      */     //   1330: aload #40
/*      */     //   1332: astore #44
/*      */     //   1334: iconst_0
/*      */     //   1335: istore #45
/*      */     //   1337: aload #44
/*      */     //   1339: invokeinterface getInserting : ()Z
/*      */     //   1344: ifne -> 1365
/*      */     //   1347: aload #44
/*      */     //   1349: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*      */     //   1354: iload #34
/*      */     //   1356: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1359: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */     //   1362: ifne -> 1391
/*      */     //   1365: aload #44
/*      */     //   1367: iload #34
/*      */     //   1369: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1372: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*      */     //   1377: aload #40
/*      */     //   1379: iload #34
/*      */     //   1381: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1384: aload #42
/*      */     //   1386: invokeinterface apply : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1391: nop
/*      */     //   1392: nop
/*      */     //   1393: nop
/*      */     //   1394: aload #40
/*      */     //   1396: aload #36
/*      */     //   1398: getstatic androidx/compose/ui/node/ComposeUiNode.Companion : Landroidx/compose/ui/node/ComposeUiNode$Companion;
/*      */     //   1401: invokevirtual getSetModifier : ()Lkotlin/jvm/functions/Function2;
/*      */     //   1404: invokestatic set-impl : (Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V
/*      */     //   1407: nop
/*      */     //   1408: nop
/*      */     //   1409: aload #24
/*      */     //   1411: bipush #14
/*      */     //   1413: iload #38
/*      */     //   1415: bipush #6
/*      */     //   1417: ishr
/*      */     //   1418: iand
/*      */     //   1419: istore #46
/*      */     //   1421: astore #47
/*      */     //   1423: iconst_0
/*      */     //   1424: istore #48
/*      */     //   1426: aload #47
/*      */     //   1428: ldc_w -2146769399
/*      */     //   1431: ldc_w 'C73@3429L9:Box.kt#2w3rfo'
/*      */     //   1434: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*      */     //   1437: getstatic androidx/compose/foundation/layout/BoxScopeInstance.INSTANCE : Landroidx/compose/foundation/layout/BoxScopeInstance;
/*      */     //   1440: aload #47
/*      */     //   1442: bipush #6
/*      */     //   1444: bipush #112
/*      */     //   1446: iload #27
/*      */     //   1448: bipush #6
/*      */     //   1450: ishr
/*      */     //   1451: iand
/*      */     //   1452: ior
/*      */     //   1453: istore #49
/*      */     //   1455: astore #50
/*      */     //   1457: checkcast androidx/compose/foundation/layout/BoxScope
/*      */     //   1460: astore #51
/*      */     //   1462: iconst_0
/*      */     //   1463: istore #52
/*      */     //   1465: aload_1
/*      */     //   1466: aload #50
/*      */     //   1468: bipush #14
/*      */     //   1470: iload #7
/*      */     //   1472: iconst_3
/*      */     //   1473: ishr
/*      */     //   1474: iand
/*      */     //   1475: invokestatic valueOf : (I)Ljava/lang/Integer;
/*      */     //   1478: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*      */     //   1483: pop
/*      */     //   1484: aload #47
/*      */     //   1486: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1489: aload #24
/*      */     //   1491: invokeinterface endNode : ()V
/*      */     //   1496: aload #24
/*      */     //   1498: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1501: nop
/*      */     //   1502: aload #24
/*      */     //   1504: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1507: nop
/*      */     //   1508: aload #24
/*      */     //   1510: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1513: nop
/*      */     //   1514: aload #24
/*      */     //   1516: invokeinterface endReplaceGroup : ()V
/*      */     //   1521: nop
/*      */     //   1522: aload #5
/*      */     //   1524: invokeinterface endNode : ()V
/*      */     //   1529: aload #5
/*      */     //   1531: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1534: nop
/*      */     //   1535: aload #5
/*      */     //   1537: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*      */     //   1540: nop
/*      */     //   1541: invokestatic isTraceInProgress : ()Z
/*      */     //   1544: ifeq -> 1560
/*      */     //   1547: invokestatic traceEventEnd : ()V
/*      */     //   1550: goto -> 1560
/*      */     //   1553: aload #5
/*      */     //   1555: invokeinterface skipToGroupEnd : ()V
/*      */     //   1560: aload #5
/*      */     //   1562: invokeinterface endRestartGroup : ()Landroidx/compose/runtime/ScopeUpdateScope;
/*      */     //   1567: dup
/*      */     //   1568: ifnull -> 1592
/*      */     //   1571: aload_0
/*      */     //   1572: aload_1
/*      */     //   1573: aload_2
/*      */     //   1574: aload_3
/*      */     //   1575: aload #4
/*      */     //   1577: iload #6
/*      */     //   1579: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;Lkotlin/jvm/functions/Function2;I)Lkotlin/jvm/functions/Function2;
/*      */     //   1584: invokeinterface updateScope : (Lkotlin/jvm/functions/Function2;)V
/*      */     //   1589: goto -> 1593
/*      */     //   1592: pop
/*      */     //   1593: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #417	-> 0
/*      */     //   #431	-> 252
/*      */     //   #867	-> 256
/*      */     //   #868	-> 268
/*      */     //   #869	-> 284
/*      */     //   #431	-> 287
/*      */     //   #869	-> 298
/*      */     //   #870	-> 300
/*      */     //   #871	-> 309
/*      */     //   #872	-> 314
/*      */     //   #868	-> 316
/*      */     //   #867	-> 317
/*      */     //   #867	-> 318
/*      */     //   #431	-> 319
/*      */     //   #418	-> 344
/*      */     //   #873	-> 356
/*      */     //   #874	-> 362
/*      */     //   #875	-> 369
/*      */     //   #876	-> 378
/*      */     //   #878	-> 384
/*      */     //   #877	-> 406
/*      */     //   #879	-> 418
/*      */     //   #880	-> 421
/*      */     //   #881	-> 439
/*      */     //   #882	-> 444
/*      */     //   #883	-> 456
/*      */     //   #885	-> 468
/*      */     //   #887	-> 473
/*      */     //   #888	-> 483
/*      */     //   #889	-> 496
/*      */     //   #891	-> 509
/*      */     //   #892	-> 520
/*      */     //   #893	-> 527
/*      */     //   #894	-> 555
/*      */     //   #895	-> 567
/*      */     //   #897	-> 581
/*      */     //   #892	-> 582
/*      */     //   #897	-> 583
/*      */     //   #898	-> 584
/*      */     //   #899	-> 597
/*      */     //   #887	-> 598
/*      */     //   #900	-> 599
/*      */     //   #420	-> 616
/*      */     //   #422	-> 647
/*      */     //   #423	-> 651
/*      */     //   #901	-> 680
/*      */     //   #902	-> 683
/*      */     //   #903	-> 691
/*      */     //   #906	-> 694
/*      */     //   #907	-> 712
/*      */     //   #908	-> 724
/*      */     //   #909	-> 730
/*      */     //   #910	-> 737
/*      */     //   #911	-> 746
/*      */     //   #913	-> 753
/*      */     //   #912	-> 775
/*      */     //   #914	-> 787
/*      */     //   #915	-> 790
/*      */     //   #916	-> 808
/*      */     //   #917	-> 813
/*      */     //   #918	-> 825
/*      */     //   #920	-> 837
/*      */     //   #922	-> 842
/*      */     //   #923	-> 852
/*      */     //   #924	-> 865
/*      */     //   #926	-> 878
/*      */     //   #927	-> 889
/*      */     //   #928	-> 896
/*      */     //   #929	-> 924
/*      */     //   #930	-> 936
/*      */     //   #932	-> 950
/*      */     //   #927	-> 951
/*      */     //   #932	-> 952
/*      */     //   #933	-> 953
/*      */     //   #934	-> 966
/*      */     //   #922	-> 967
/*      */     //   #935	-> 968
/*      */     //   #936	-> 993
/*      */     //   #423	-> 1024
/*      */     //   #936	-> 1041
/*      */     //   #935	-> 1046
/*      */     //   #937	-> 1048
/*      */     //   #914	-> 1055
/*      */     //   #938	-> 1058
/*      */     //   #908	-> 1061
/*      */     //   #939	-> 1064
/*      */     //   #901	-> 1067
/*      */     //   #940	-> 1070
/*      */     //   #426	-> 1088
/*      */     //   #427	-> 1092
/*      */     //   #941	-> 1121
/*      */     //   #942	-> 1124
/*      */     //   #943	-> 1132
/*      */     //   #946	-> 1135
/*      */     //   #947	-> 1153
/*      */     //   #948	-> 1165
/*      */     //   #949	-> 1171
/*      */     //   #950	-> 1178
/*      */     //   #951	-> 1187
/*      */     //   #953	-> 1194
/*      */     //   #952	-> 1216
/*      */     //   #954	-> 1228
/*      */     //   #955	-> 1231
/*      */     //   #956	-> 1249
/*      */     //   #957	-> 1254
/*      */     //   #958	-> 1266
/*      */     //   #960	-> 1278
/*      */     //   #962	-> 1283
/*      */     //   #963	-> 1293
/*      */     //   #964	-> 1306
/*      */     //   #966	-> 1319
/*      */     //   #967	-> 1330
/*      */     //   #968	-> 1337
/*      */     //   #969	-> 1365
/*      */     //   #970	-> 1377
/*      */     //   #972	-> 1391
/*      */     //   #967	-> 1392
/*      */     //   #972	-> 1393
/*      */     //   #973	-> 1394
/*      */     //   #974	-> 1407
/*      */     //   #962	-> 1408
/*      */     //   #975	-> 1409
/*      */     //   #976	-> 1434
/*      */     //   #427	-> 1465
/*      */     //   #976	-> 1484
/*      */     //   #975	-> 1489
/*      */     //   #977	-> 1491
/*      */     //   #954	-> 1498
/*      */     //   #978	-> 1501
/*      */     //   #948	-> 1504
/*      */     //   #979	-> 1507
/*      */     //   #941	-> 1510
/*      */     //   #980	-> 1513
/*      */     //   #429	-> 1521
/*      */     //   #900	-> 1522
/*      */     //   #981	-> 1524
/*      */     //   #879	-> 1531
/*      */     //   #982	-> 1534
/*      */     //   #873	-> 1537
/*      */     //   #983	-> 1540
/*      */     //   #494	-> 1553
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   287	11	14	$i$a$-cache-ScrollableContainerKt$ScrollableContainerImpl$2	I
/*      */     //   300	11	15	value$iv	Ljava/lang/Object;
/*      */     //   268	49	13	$i$a$-let-ComposerKt$cache$1$iv	I
/*      */     //   265	52	12	it$iv	Ljava/lang/Object;
/*      */     //   256	63	11	$i$f$cache	I
/*      */     //   253	66	9	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*      */     //   253	66	10	invalid$iv	Z
/*      */     //   1024	17	52	$i$a$-Box-ScrollableContainerKt$ScrollableContainerImpl$1$1	I
/*      */     //   1021	20	51	$this$ScrollableContainerImpl_u24lambda_u2468_u24lambda_u2466	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   1021	20	50	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1021	20	49	$changed	I
/*      */     //   985	61	48	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   982	64	47	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   982	64	46	$changed$iv	I
/*      */     //   896	55	45	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   893	58	44	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   889	64	43	$i$f$set-impl	I
/*      */     //   886	67	42	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   852	115	41	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   849	118	40	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   779	280	39	$i$f$ReusableComposeNode	I
/*      */     //   776	283	37	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   776	283	38	$changed$iv$iv$iv	I
/*      */     //   716	349	33	$i$f$Layout	I
/*      */     //   735	330	34	compositeKeyHash$iv$iv	I
/*      */     //   744	321	35	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   753	312	36	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   713	352	32	$changed$iv$iv	I
/*      */     //   672	399	28	$i$f$Box	I
/*      */     //   703	368	31	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   669	402	26	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   691	380	29	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   694	377	30	propagateMinConstraints$iv	Z
/*      */     //   669	402	27	$changed$iv	I
/*      */     //   1465	19	52	$i$a$-Box-ScrollableContainerKt$ScrollableContainerImpl$1$2	I
/*      */     //   1462	22	51	$this$ScrollableContainerImpl_u24lambda_u2468_u24lambda_u2467	Landroidx/compose/foundation/layout/BoxScope;
/*      */     //   1462	22	50	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   1462	22	49	$changed	I
/*      */     //   1426	63	48	$i$a$-Layout-BoxKt$Box$1$iv	I
/*      */     //   1423	66	47	$composer$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1423	66	46	$changed$iv	I
/*      */     //   1337	55	45	$i$a$-with-Updater$set$1$iv$iv$iv	I
/*      */     //   1334	58	44	$this$set_impl_u24lambda_u240$iv$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1330	64	43	$i$f$set-impl	I
/*      */     //   1327	67	42	block$iv$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   1293	115	41	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv$iv	I
/*      */     //   1290	118	40	$this$Layout_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   1220	282	39	$i$f$ReusableComposeNode	I
/*      */     //   1217	285	37	factory$iv$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   1217	285	38	$changed$iv$iv$iv	I
/*      */     //   1157	351	33	$i$f$Layout	I
/*      */     //   1176	332	34	compositeKeyHash$iv$iv	I
/*      */     //   1185	323	35	localMap$iv$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   1194	314	36	materialized$iv$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1154	354	32	$changed$iv$iv	I
/*      */     //   1113	401	28	$i$f$Box	I
/*      */     //   1144	370	31	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   1110	404	26	modifier$iv	Landroidx/compose/ui/Modifier;
/*      */     //   1132	382	29	contentAlignment$iv	Landroidx/compose/ui/Alignment;
/*      */     //   1135	379	30	propagateMinConstraints$iv	Z
/*      */     //   1110	404	27	$changed$iv	I
/*      */     //   616	906	25	$i$a$-Layout-ScrollableContainerKt$ScrollableContainerImpl$1	I
/*      */     //   613	909	24	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   613	909	23	$changed	I
/*      */     //   527	55	22	$i$a$-with-Updater$set$1$iv$iv	I
/*      */     //   524	58	21	$this$set_impl_u24lambda_u240$iv$iv	Landroidx/compose/runtime/Composer;
/*      */     //   520	64	20	$i$f$set-impl	I
/*      */     //   517	67	19	block$iv$iv	Lkotlin/jvm/functions/Function2;
/*      */     //   483	115	18	$i$a$-ReusableComposeNode-LayoutKt$Layout$1$iv	I
/*      */     //   480	118	17	$this$Layout_u24lambda_u240$iv	Landroidx/compose/runtime/Composer;
/*      */     //   410	1125	16	$i$f$ReusableComposeNode	I
/*      */     //   407	1128	14	factory$iv$iv	Lkotlin/jvm/functions/Function0;
/*      */     //   407	1128	15	$changed$iv$iv	I
/*      */     //   348	1193	10	$i$f$Layout	I
/*      */     //   367	1174	11	compositeKeyHash$iv	I
/*      */     //   376	1165	12	localMap$iv	Landroidx/compose/runtime/CompositionLocalMap;
/*      */     //   384	1157	13	materialized$iv	Landroidx/compose/ui/Modifier;
/*      */     //   345	1196	8	measurePolicy$iv	Landroidx/compose/ui/layout/MeasurePolicy;
/*      */     //   345	1196	9	$changed$iv	I
/*      */     //   16	1578	7	$dirty	I
/*      */     //   0	1594	0	verticalScrollbar	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1594	1	horizontalScrollbar	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1594	2	modifier	Landroidx/compose/ui/Modifier;
/*      */     //   0	1594	3	scrollbarStyle	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */     //   0	1594	4	content	Lkotlin/jvm/functions/Function2;
/*      */     //   0	1594	5	$composer	Landroidx/compose/runtime/Composer;
/*      */     //   0	1594	6	$changed	I
/*      */   }
/*      */   
/*      */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*      */   @SourceDebugExtension({"SMAP\nScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrollableContainer.kt\norg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainerImpl$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,560:1\n1#2:561\n*E\n"})
/*      */   static final class ScrollableContainerKt$ScrollableContainerImpl$2$1 implements MeasurePolicy {
/*      */     ScrollableContainerKt$ScrollableContainerImpl$2$1(ScrollbarStyle $scrollbarStyle) {}
/*      */     
/*      */     public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*      */       // Byte code:
/*      */       //   0: aload_1
/*      */       //   1: ldc '$this$Layout'
/*      */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   6: aload_2
/*      */       //   7: ldc 'measurables'
/*      */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*      */       //   12: aload_2
/*      */       //   13: checkcast java/lang/Iterable
/*      */       //   16: astore #7
/*      */       //   18: aload #7
/*      */       //   20: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */       //   25: astore #8
/*      */       //   27: aload #8
/*      */       //   29: invokeinterface hasNext : ()Z
/*      */       //   34: ifeq -> 74
/*      */       //   37: aload #8
/*      */       //   39: invokeinterface next : ()Ljava/lang/Object;
/*      */       //   44: astore #9
/*      */       //   46: aload #9
/*      */       //   48: checkcast androidx/compose/ui/layout/Measurable
/*      */       //   51: astore #10
/*      */       //   53: iconst_0
/*      */       //   54: istore #11
/*      */       //   56: aload #10
/*      */       //   58: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*      */       //   61: ldc 'VerticallyScrollableContainer_verticalScrollbar'
/*      */       //   63: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   66: ifeq -> 27
/*      */       //   69: aload #9
/*      */       //   71: goto -> 75
/*      */       //   74: aconst_null
/*      */       //   75: checkcast androidx/compose/ui/layout/Measurable
/*      */       //   78: astore #5
/*      */       //   80: aload_2
/*      */       //   81: checkcast java/lang/Iterable
/*      */       //   84: astore #8
/*      */       //   86: aload #8
/*      */       //   88: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */       //   93: astore #9
/*      */       //   95: aload #9
/*      */       //   97: invokeinterface hasNext : ()Z
/*      */       //   102: ifeq -> 142
/*      */       //   105: aload #9
/*      */       //   107: invokeinterface next : ()Ljava/lang/Object;
/*      */       //   112: astore #10
/*      */       //   114: aload #10
/*      */       //   116: checkcast androidx/compose/ui/layout/Measurable
/*      */       //   119: astore #11
/*      */       //   121: iconst_0
/*      */       //   122: istore #12
/*      */       //   124: aload #11
/*      */       //   126: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*      */       //   129: ldc 'VerticallyScrollableContainer_horizontalScrollbar'
/*      */       //   131: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   134: ifeq -> 95
/*      */       //   137: aload #10
/*      */       //   139: goto -> 143
/*      */       //   142: aconst_null
/*      */       //   143: checkcast androidx/compose/ui/layout/Measurable
/*      */       //   146: astore #6
/*      */       //   148: aload #5
/*      */       //   150: ifnull -> 179
/*      */       //   153: aload #6
/*      */       //   155: ifnull -> 179
/*      */       //   158: aload_1
/*      */       //   159: aload_0
/*      */       //   160: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */       //   163: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */       //   166: invokeinterface getTrackThicknessExpanded-D9Ej5fM : ()F
/*      */       //   171: invokeinterface roundToPx-0680j_4 : (F)I
/*      */       //   176: goto -> 180
/*      */       //   179: iconst_0
/*      */       //   180: istore #7
/*      */       //   182: aload #5
/*      */       //   184: ifnull -> 214
/*      */       //   187: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*      */       //   190: lload_3
/*      */       //   191: invokestatic getMaxHeight-impl : (J)I
/*      */       //   194: iload #7
/*      */       //   196: isub
/*      */       //   197: invokevirtual fixedHeight-OenEA2s : (I)J
/*      */       //   200: lstore #9
/*      */       //   202: aload #5
/*      */       //   204: lload #9
/*      */       //   206: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*      */       //   211: goto -> 215
/*      */       //   214: aconst_null
/*      */       //   215: astore #8
/*      */       //   217: aload #6
/*      */       //   219: ifnull -> 249
/*      */       //   222: getstatic androidx/compose/ui/unit/Constraints.Companion : Landroidx/compose/ui/unit/Constraints$Companion;
/*      */       //   225: lload_3
/*      */       //   226: invokestatic getMaxWidth-impl : (J)I
/*      */       //   229: iload #7
/*      */       //   231: isub
/*      */       //   232: invokevirtual fixedWidth-OenEA2s : (I)J
/*      */       //   235: lstore #10
/*      */       //   237: aload #6
/*      */       //   239: lload #10
/*      */       //   241: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*      */       //   246: goto -> 250
/*      */       //   249: aconst_null
/*      */       //   250: astore #9
/*      */       //   252: invokestatic getHostOs : ()Lorg/jetbrains/skiko/OS;
/*      */       //   255: getstatic org/jetbrains/skiko/OS.MacOS : Lorg/jetbrains/skiko/OS;
/*      */       //   258: if_acmpne -> 265
/*      */       //   261: iconst_1
/*      */       //   262: goto -> 266
/*      */       //   265: iconst_0
/*      */       //   266: istore #10
/*      */       //   268: aload_2
/*      */       //   269: checkcast java/lang/Iterable
/*      */       //   272: astore #14
/*      */       //   274: aload #14
/*      */       //   276: invokeinterface iterator : ()Ljava/util/Iterator;
/*      */       //   281: astore #15
/*      */       //   283: aload #15
/*      */       //   285: invokeinterface hasNext : ()Z
/*      */       //   290: ifeq -> 330
/*      */       //   293: aload #15
/*      */       //   295: invokeinterface next : ()Ljava/lang/Object;
/*      */       //   300: astore #16
/*      */       //   302: aload #16
/*      */       //   304: checkcast androidx/compose/ui/layout/Measurable
/*      */       //   307: astore #17
/*      */       //   309: iconst_0
/*      */       //   310: istore #18
/*      */       //   312: aload #17
/*      */       //   314: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*      */       //   317: ldc 'VerticallyScrollableContainer_content'
/*      */       //   319: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*      */       //   322: ifeq -> 283
/*      */       //   325: aload #16
/*      */       //   327: goto -> 331
/*      */       //   330: aconst_null
/*      */       //   331: checkcast androidx/compose/ui/layout/Measurable
/*      */       //   334: dup
/*      */       //   335: ifnonnull -> 352
/*      */       //   338: pop
/*      */       //   339: new java/lang/IllegalStateException
/*      */       //   342: dup
/*      */       //   343: ldc 'Content not provided'
/*      */       //   345: invokevirtual toString : ()Ljava/lang/String;
/*      */       //   348: invokespecial <init> : (Ljava/lang/String;)V
/*      */       //   351: athrow
/*      */       //   352: astore #11
/*      */       //   354: aload_0
/*      */       //   355: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */       //   358: iload #10
/*      */       //   360: lload_3
/*      */       //   361: aload #8
/*      */       //   363: aload #9
/*      */       //   365: invokestatic access$computeContentConstraints-L1NQ6kE : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;ZJLandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)J
/*      */       //   368: lstore #12
/*      */       //   370: aload #11
/*      */       //   372: lload #12
/*      */       //   374: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*      */       //   379: astore #14
/*      */       //   381: aload_0
/*      */       //   382: getfield $scrollbarStyle : Lorg/jetbrains/jewel/ui/component/styling/ScrollbarStyle;
/*      */       //   385: invokevirtual getScrollbarVisibility : ()Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */       //   388: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible
/*      */       //   391: istore #15
/*      */       //   393: nop
/*      */       //   394: iload #10
/*      */       //   396: ifne -> 403
/*      */       //   399: iconst_0
/*      */       //   400: goto -> 426
/*      */       //   403: iload #15
/*      */       //   405: ifeq -> 425
/*      */       //   408: aload #8
/*      */       //   410: dup
/*      */       //   411: ifnull -> 420
/*      */       //   414: invokevirtual getWidth : ()I
/*      */       //   417: goto -> 426
/*      */       //   420: pop
/*      */       //   421: iconst_0
/*      */       //   422: goto -> 426
/*      */       //   425: iconst_0
/*      */       //   426: istore #16
/*      */       //   428: aload #14
/*      */       //   430: invokevirtual getWidth : ()I
/*      */       //   433: iload #16
/*      */       //   435: iadd
/*      */       //   436: istore #17
/*      */       //   438: nop
/*      */       //   439: iload #10
/*      */       //   441: ifne -> 448
/*      */       //   444: iconst_0
/*      */       //   445: goto -> 471
/*      */       //   448: iload #15
/*      */       //   450: ifeq -> 470
/*      */       //   453: aload #9
/*      */       //   455: dup
/*      */       //   456: ifnull -> 465
/*      */       //   459: invokevirtual getHeight : ()I
/*      */       //   462: goto -> 471
/*      */       //   465: pop
/*      */       //   466: iconst_0
/*      */       //   467: goto -> 471
/*      */       //   470: iconst_0
/*      */       //   471: istore #18
/*      */       //   473: aload #14
/*      */       //   475: invokevirtual getHeight : ()I
/*      */       //   478: iload #18
/*      */       //   480: iadd
/*      */       //   481: istore #19
/*      */       //   483: aload_1
/*      */       //   484: iload #17
/*      */       //   486: iload #19
/*      */       //   488: aconst_null
/*      */       //   489: aload #14
/*      */       //   491: aload #8
/*      */       //   493: iload #17
/*      */       //   495: aload #9
/*      */       //   497: iload #19
/*      */       //   499: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ILandroidx/compose/ui/layout/Placeable;I)Lkotlin/jvm/functions/Function1;
/*      */       //   504: iconst_4
/*      */       //   505: aconst_null
/*      */       //   506: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*      */       //   509: areturn
/*      */       // Line number table:
/*      */       //   Java source line number -> byte code offset
/*      */       //   #432	-> 12
/*      */       //   #561	-> 53
/*      */       //   #432	-> 56
/*      */       //   #432	-> 66
/*      */       //   #432	-> 75
/*      */       //   #433	-> 80
/*      */       //   #561	-> 121
/*      */       //   #433	-> 124
/*      */       //   #433	-> 134
/*      */       //   #433	-> 143
/*      */       //   #437	-> 148
/*      */       //   #438	-> 158
/*      */       //   #439	-> 179
/*      */       //   #437	-> 180
/*      */       //   #436	-> 180
/*      */       //   #442	-> 182
/*      */       //   #444	-> 187
/*      */       //   #443	-> 200
/*      */       //   #445	-> 202
/*      */       //   #446	-> 214
/*      */       //   #442	-> 215
/*      */       //   #441	-> 215
/*      */       //   #449	-> 217
/*      */       //   #451	-> 222
/*      */       //   #450	-> 235
/*      */       //   #452	-> 237
/*      */       //   #453	-> 249
/*      */       //   #449	-> 250
/*      */       //   #448	-> 250
/*      */       //   #455	-> 252
/*      */       //   #456	-> 268
/*      */       //   #561	-> 309
/*      */       //   #456	-> 312
/*      */       //   #456	-> 322
/*      */       //   #456	-> 331
/*      */       //   #459	-> 354
/*      */       //   #460	-> 358
/*      */       //   #461	-> 360
/*      */       //   #462	-> 361
/*      */       //   #463	-> 363
/*      */       //   #458	-> 365
/*      */       //   #457	-> 368
/*      */       //   #465	-> 370
/*      */       //   #467	-> 381
/*      */       //   #469	-> 393
/*      */       //   #470	-> 394
/*      */       //   #471	-> 403
/*      */       //   #472	-> 425
/*      */       //   #469	-> 426
/*      */       //   #468	-> 426
/*      */       //   #474	-> 428
/*      */       //   #477	-> 438
/*      */       //   #478	-> 439
/*      */       //   #479	-> 448
/*      */       //   #480	-> 470
/*      */       //   #477	-> 471
/*      */       //   #476	-> 471
/*      */       //   #482	-> 473
/*      */       //   #484	-> 483
/*      */       //   #492	-> 509
/*      */       // Local variable table:
/*      */       //   start	length	slot	name	descriptor
/*      */       //   56	10	11	$i$a$-find-ScrollableContainerKt$ScrollableContainerImpl$2$1$verticalScrollbarMeasurable$1	I
/*      */       //   53	13	10	it	Landroidx/compose/ui/layout/Measurable;
/*      */       //   124	10	12	$i$a$-find-ScrollableContainerKt$ScrollableContainerImpl$2$1$horizontalScrollbarMeasurable$1	I
/*      */       //   121	13	11	it	Landroidx/compose/ui/layout/Measurable;
/*      */       //   202	9	9	verticalScrollbarConstraints	J
/*      */       //   237	9	10	horizontalScrollbarConstraints	J
/*      */       //   312	10	18	$i$a$-find-ScrollableContainerKt$ScrollableContainerImpl$2$1$contentMeasurable$1	I
/*      */       //   309	13	17	it	Landroidx/compose/ui/layout/Measurable;
/*      */       //   80	430	5	verticalScrollbarMeasurable	Landroidx/compose/ui/layout/Measurable;
/*      */       //   148	362	6	horizontalScrollbarMeasurable	Landroidx/compose/ui/layout/Measurable;
/*      */       //   182	328	7	sizeOffsetWhenBothVisible	I
/*      */       //   217	293	8	verticalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*      */       //   252	258	9	horizontalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*      */       //   268	242	10	isMacOs	Z
/*      */       //   354	156	11	contentMeasurable	Landroidx/compose/ui/layout/Measurable;
/*      */       //   370	140	12	contentConstraints	J
/*      */       //   381	129	14	contentPlaceable	Landroidx/compose/ui/layout/Placeable;
/*      */       //   393	117	15	isAlwaysVisible	Z
/*      */       //   428	82	16	vScrollbarWidth	I
/*      */       //   438	72	17	width	I
/*      */       //   473	37	18	hScrollbarHeight	I
/*      */       //   483	27	19	height	I
/*      */       //   0	510	0	this	Lorg/jetbrains/jewel/ui/component/ScrollableContainerKt$ScrollableContainerImpl$2$1;
/*      */       //   0	510	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*      */       //   0	510	2	measurables	Ljava/util/List;
/*      */       //   0	510	3	incomingConstraints	J
/*      */     }
/*      */     
/*      */     private static final Unit measure_3p2s80s$lambda$3(Placeable $contentPlaceable, Placeable $verticalScrollbarPlaceable, int $width, Placeable $horizontalScrollbarPlaceable, int $height, Placeable.PlacementScope $this$layout) {
/*      */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*      */       $this$layout.placeRelative($contentPlaceable, 0, 0, 0.0F);
/*      */       if ($verticalScrollbarPlaceable != null) {
/*      */         $this$layout.placeRelative($verticalScrollbarPlaceable, $width - $verticalScrollbarPlaceable.getWidth(), 0, 1.0F);
/*      */       } else {
/*      */       
/*      */       } 
/*      */       if ($horizontalScrollbarPlaceable != null) {
/*      */         $this$layout.placeRelative($horizontalScrollbarPlaceable, 0, $height - $horizontalScrollbarPlaceable.getHeight(), 1.0F);
/*      */       } else {
/*      */       
/*      */       } 
/*      */       return Unit.INSTANCE;
/*      */     }
/*      */   }
/*      */   
/*      */   private static final long computeContentConstraints-L1NQ6kE(ScrollbarStyle scrollbarStyle, boolean isMacOs, long incomingConstraints, Placeable verticalScrollbarPlaceable, Placeable horizontalScrollbarPlaceable) {
/*      */     ScrollbarVisibility visibility = scrollbarStyle.getScrollbarVisibility();
/*      */     return (Constraints.getHasBoundedWidth-impl(incomingConstraints) && Constraints.getHasBoundedHeight-impl(incomingConstraints)) ? Constraints.Companion.fixed-JhjzzOo(computeContentConstraints_L1NQ6kE$width(incomingConstraints, isMacOs, visibility, verticalScrollbarPlaceable), computeContentConstraints_L1NQ6kE$height(incomingConstraints, isMacOs, visibility, horizontalScrollbarPlaceable)) : ((!Constraints.getHasBoundedWidth-impl(incomingConstraints) && Constraints.getHasBoundedHeight-impl(incomingConstraints)) ? Constraints.Companion.fixedHeight-OenEA2s(computeContentConstraints_L1NQ6kE$height(incomingConstraints, isMacOs, visibility, horizontalScrollbarPlaceable)) : ((Constraints.getHasBoundedWidth-impl(incomingConstraints) && !Constraints.getHasBoundedHeight-impl(incomingConstraints)) ? Constraints.Companion.fixedWidth-OenEA2s(computeContentConstraints_L1NQ6kE$width(incomingConstraints, isMacOs, visibility, verticalScrollbarPlaceable)) : ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null)));
/*      */   }
/*      */   
/*      */   private static final int computeContentConstraints_L1NQ6kE$width(long $incomingConstraints, boolean $isMacOs, ScrollbarVisibility visibility, Placeable $verticalScrollbarPlaceable) {
/*      */     // Byte code:
/*      */     //   0: lload_0
/*      */     //   1: invokestatic getHasBoundedWidth-impl : (J)Z
/*      */     //   4: ifeq -> 79
/*      */     //   7: lload_0
/*      */     //   8: invokestatic getMaxWidth-impl : (J)I
/*      */     //   11: istore #5
/*      */     //   13: nop
/*      */     //   14: iload_2
/*      */     //   15: ifne -> 23
/*      */     //   18: iload #5
/*      */     //   20: goto -> 93
/*      */     //   23: aload_3
/*      */     //   24: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible
/*      */     //   27: ifeq -> 50
/*      */     //   30: iload #5
/*      */     //   32: aload #4
/*      */     //   34: dup
/*      */     //   35: ifnull -> 44
/*      */     //   38: invokevirtual getWidth : ()I
/*      */     //   41: goto -> 46
/*      */     //   44: pop
/*      */     //   45: iconst_0
/*      */     //   46: isub
/*      */     //   47: goto -> 93
/*      */     //   50: aload_3
/*      */     //   51: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling
/*      */     //   54: ifeq -> 62
/*      */     //   57: iload #5
/*      */     //   59: goto -> 93
/*      */     //   62: new java/lang/IllegalStateException
/*      */     //   65: dup
/*      */     //   66: aload_3
/*      */     //   67: <illegal opcode> makeConcatWithConstants : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;)Ljava/lang/String;
/*      */     //   72: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   75: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   78: athrow
/*      */     //   79: new java/lang/IllegalStateException
/*      */     //   82: dup
/*      */     //   83: ldc_w 'Incoming constraints have infinite width, should not use fixed width'
/*      */     //   86: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   89: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   92: athrow
/*      */     //   93: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #506	-> 0
/*      */     //   #507	-> 7
/*      */     //   #508	-> 13
/*      */     //   #509	-> 14
/*      */     //   #510	-> 23
/*      */     //   #511	-> 50
/*      */     //   #512	-> 66
/*      */     //   #515	-> 83
/*      */     //   #516	-> 93
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   13	66	5	maxWidth	I
/*      */     //   0	94	0	$incomingConstraints	J
/*      */     //   0	94	2	$isMacOs	Z
/*      */     //   0	94	3	visibility	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   0	94	4	$verticalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*      */   }
/*      */   
/*      */   private static final int computeContentConstraints_L1NQ6kE$height(long $incomingConstraints, boolean $isMacOs, ScrollbarVisibility visibility, Placeable $horizontalScrollbarPlaceable) {
/*      */     // Byte code:
/*      */     //   0: lload_0
/*      */     //   1: invokestatic getHasBoundedHeight-impl : (J)Z
/*      */     //   4: ifeq -> 79
/*      */     //   7: lload_0
/*      */     //   8: invokestatic getMaxHeight-impl : (J)I
/*      */     //   11: istore #5
/*      */     //   13: nop
/*      */     //   14: iload_2
/*      */     //   15: ifne -> 23
/*      */     //   18: iload #5
/*      */     //   20: goto -> 93
/*      */     //   23: aload_3
/*      */     //   24: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$AlwaysVisible
/*      */     //   27: ifeq -> 50
/*      */     //   30: iload #5
/*      */     //   32: aload #4
/*      */     //   34: dup
/*      */     //   35: ifnull -> 44
/*      */     //   38: invokevirtual getHeight : ()I
/*      */     //   41: goto -> 46
/*      */     //   44: pop
/*      */     //   45: iconst_0
/*      */     //   46: isub
/*      */     //   47: goto -> 93
/*      */     //   50: aload_3
/*      */     //   51: instanceof org/jetbrains/jewel/ui/component/styling/ScrollbarVisibility$WhenScrolling
/*      */     //   54: ifeq -> 62
/*      */     //   57: iload #5
/*      */     //   59: goto -> 93
/*      */     //   62: new java/lang/IllegalStateException
/*      */     //   65: dup
/*      */     //   66: aload_3
/*      */     //   67: <illegal opcode> makeConcatWithConstants : (Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;)Ljava/lang/String;
/*      */     //   72: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   75: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   78: athrow
/*      */     //   79: new java/lang/IllegalStateException
/*      */     //   82: dup
/*      */     //   83: ldc_w 'Incoming constraints have infinite height, should not use fixed height'
/*      */     //   86: invokevirtual toString : ()Ljava/lang/String;
/*      */     //   89: invokespecial <init> : (Ljava/lang/String;)V
/*      */     //   92: athrow
/*      */     //   93: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #519	-> 0
/*      */     //   #520	-> 7
/*      */     //   #521	-> 13
/*      */     //   #522	-> 14
/*      */     //   #523	-> 23
/*      */     //   #524	-> 50
/*      */     //   #525	-> 66
/*      */     //   #528	-> 83
/*      */     //   #529	-> 93
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   13	66	5	maxHeight	I
/*      */     //   0	94	0	$incomingConstraints	J
/*      */     //   0	94	2	$isMacOs	Z
/*      */     //   0	94	3	visibility	Lorg/jetbrains/jewel/ui/component/styling/ScrollbarVisibility;
/*      */     //   0	94	4	$horizontalScrollbarPlaceable	Landroidx/compose/ui/layout/Placeable;
/*      */   }
/*      */   
/*      */   @Composable
/*      */   public static final float scrollbarContentSafePadding(@Nullable ScrollbarStyle style, @Nullable Composer $composer, int $changed, int paramInt1) {
/*      */     $composer.startReplaceGroup(-1372397190);
/*      */     if ((paramInt1 & 0x1) != 0)
/*      */       style = JewelThemeKt.getScrollbarStyle(JewelTheme.Companion, $composer, 6); 
/*      */     if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventStart(-1372397190, $changed, -1, "org.jetbrains.jewel.ui.component.scrollbarContentSafePadding (ScrollableContainer.kt:553)"); 
/*      */     int $this$dp$iv = 0, $i$f$getDp = 0;
/*      */     if (style.getScrollbarVisibility() instanceof ScrollbarVisibility.WhenScrolling) {
/*      */     
/*      */     } else {
/*      */       throw new IllegalStateException(("Unsupported visibility: " + style.getScrollbarVisibility()).toString());
/*      */     } 
/*      */     Object object = (OsArch_jvmKt.getHostOs() != OS.MacOS) ? style.getScrollbarVisibility().getTrackThicknessExpanded-D9Ej5fM() : ((style.getScrollbarVisibility() instanceof ScrollbarVisibility.AlwaysVisible) ? Dp.constructor-impl($this$dp$iv) : "JD-Core does not support Kotlin");
/*      */     if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventEnd(); 
/*      */     $composer.endReplaceGroup();
/*      */     return object;
/*      */   }
/*      */   
/*      */   private static final Unit VerticallyScrollableContainer$lambda$6(Modifier $modifier, Modifier $scrollbarModifier, ScrollState $scrollState, ScrollbarStyle $style, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     VerticallyScrollableContainer($modifier, $scrollbarModifier, $scrollState, $style, $reverseLayout, $scrollbarEnabled, $scrollbarInteractionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit TextAreaScrollableContainer$lambda$12(ScrollState $scrollState, ScrollbarStyle $style, Modifier $contentModifier, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*      */     TextAreaScrollableContainer($scrollState, $style, $contentModifier, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit VerticallyScrollableContainer$lambda$19(LazyListState $scrollState, Modifier $modifier, Modifier $scrollbarModifier, ScrollbarStyle $style, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     VerticallyScrollableContainer($scrollState, $modifier, $scrollbarModifier, $style, $reverseLayout, $scrollbarEnabled, $scrollbarInteractionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit VerticallyScrollableContainer$lambda$26(LazyGridState $scrollState, Modifier $modifier, Modifier $scrollbarModifier, ScrollbarStyle $style, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     VerticallyScrollableContainer($scrollState, $modifier, $scrollbarModifier, $style, $reverseLayout, $scrollbarEnabled, $scrollbarInteractionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit HorizontallyScrollableContainer$lambda$33(Modifier $modifier, Modifier $scrollbarModifier, ScrollState $scrollState, ScrollbarStyle $style, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     HorizontallyScrollableContainer($modifier, $scrollbarModifier, $scrollState, $style, $reverseLayout, $scrollbarEnabled, $scrollbarInteractionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit HorizontallyScrollableContainer$lambda$40(LazyListState $scrollState, Modifier $modifier, Modifier $scrollbarModifier, ScrollbarStyle $style, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     HorizontallyScrollableContainer($scrollState, $modifier, $scrollbarModifier, $style, $reverseLayout, $scrollbarEnabled, $scrollbarInteractionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit HorizontallyScrollableContainer$lambda$47(LazyGridState $scrollState, Modifier $modifier, Modifier $scrollbarModifier, ScrollbarStyle $style, boolean $reverseLayout, boolean $scrollbarEnabled, MutableInteractionSource $scrollbarInteractionSource, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     HorizontallyScrollableContainer($scrollState, $modifier, $scrollbarModifier, $style, $reverseLayout, $scrollbarEnabled, $scrollbarInteractionSource, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit ScrollableContainer$lambda$53(Modifier $modifier, ScrollState $verticalScrollState, ScrollState $horizontalScrollState, Modifier $verticalScrollbarModifier, Modifier $horizontalScrollbarModifier, ScrollbarStyle $style, Function2 $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     ScrollableContainer($modifier, $verticalScrollState, $horizontalScrollState, $verticalScrollbarModifier, $horizontalScrollbarModifier, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit ScrollableContainer$lambda$59(LazyListState $verticalScrollState, LazyListState $horizontalScrollState, Modifier $modifier, Modifier $verticalScrollbarModifier, Modifier $horizontalScrollbarModifier, ScrollbarStyle $style, Function2 $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     ScrollableContainer($verticalScrollState, $horizontalScrollState, $modifier, $verticalScrollbarModifier, $horizontalScrollbarModifier, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit ScrollableContainer$lambda$65(LazyGridState $verticalScrollState, LazyGridState $horizontalScrollState, Modifier $modifier, Modifier $verticalScrollbarModifier, Modifier $horizontalScrollbarModifier, ScrollbarStyle $style, Function2 $content, int $$changed, int $$default, Composer $composer, int $force) {
/*      */     ScrollableContainer($verticalScrollState, $horizontalScrollState, $modifier, $verticalScrollbarModifier, $horizontalScrollbarModifier, $style, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1), $$default);
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */   
/*      */   private static final Unit ScrollableContainerImpl$lambda$70(Function2<? super Composer, ? super Integer, Unit> $verticalScrollbar, Function2<? super Composer, ? super Integer, Unit> $horizontalScrollbar, Modifier $modifier, ScrollbarStyle $scrollbarStyle, Function2<? super Composer, ? super Integer, Unit> $content, int $$changed, Composer $composer, int $force) {
/*      */     ScrollableContainerImpl($verticalScrollbar, $horizontalScrollbar, $modifier, $scrollbarStyle, $content, $composer, RecomposeScopeImplKt.updateChangedFlags($$changed | 0x1));
/*      */     return Unit.INSTANCE;
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\ScrollableContainerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */