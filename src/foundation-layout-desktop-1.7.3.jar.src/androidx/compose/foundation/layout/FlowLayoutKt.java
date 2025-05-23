/*      */ package androidx.compose.foundation.layout;
/*      */ 
/*      */ import androidx.collection.IntIntPair;
/*      */ import androidx.collection.IntList;
/*      */ import androidx.collection.IntObjectMapKt;
/*      */ import androidx.collection.MutableIntList;
/*      */ import androidx.collection.MutableIntObjectMap;
/*      */ import androidx.compose.runtime.Composable;
/*      */ import androidx.compose.runtime.ComposableInferredTarget;
/*      */ import androidx.compose.runtime.ComposableTarget;
/*      */ import androidx.compose.runtime.Composer;
/*      */ import androidx.compose.runtime.ComposerKt;
/*      */ import androidx.compose.runtime.RecomposeScopeImplKt;
/*      */ import androidx.compose.runtime.collection.MutableVector;
/*      */ import androidx.compose.ui.Alignment;
/*      */ import androidx.compose.ui.Modifier;
/*      */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*      */ import androidx.compose.ui.layout.Measurable;
/*      */ import androidx.compose.ui.layout.MeasurePolicy;
/*      */ import androidx.compose.ui.layout.MeasureResult;
/*      */ import androidx.compose.ui.layout.MeasureScope;
/*      */ import androidx.compose.ui.layout.MultiContentMeasurePolicy;
/*      */ import androidx.compose.ui.layout.Placeable;
/*      */ import androidx.compose.ui.unit.Constraints;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.NoSuchElementException;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.collections.IntIterator;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.Ref;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import kotlin.ranges.IntRange;
/*      */ import kotlin.ranges.RangesKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000Ô\001\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\025\n\002\b\n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020(\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\006\n\002\030\002\n\000\032g\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0172\b\b\002\020\021\032\0020\0222\034\020\023\032\030\022\004\022\0020\025\022\004\022\0020\0070\024¢\006\002\b\026¢\006\002\b\027H\007¢\006\002\020\030\032g\020\031\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\f\032\0020\r2\b\b\002\020\n\032\0020\0132\b\b\002\020\032\032\0020\0172\b\b\002\020\020\032\0020\0172\b\b\002\020\021\032\0020\0332\034\020\023\032\030\022\004\022\0020\034\022\004\022\0020\0070\024¢\006\002\b\026¢\006\002\b\027H\007¢\006\002\020\035\032%\020\036\032\0020\0372\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020 \032\0020\017H\001¢\006\002\020!\0325\020\"\032\0020#2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020 \032\0020\0172\006\020\020\032\0020\0172\006\020$\032\0020%H\001¢\006\002\020&\032\001\020'\032\0020(2\f\020)\032\b\022\004\022\0020+0*2#\020,\032\037\022\004\022\0020+\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170-¢\006\002\b\0272#\020.\032\037\022\004\022\0020+\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170-¢\006\002\b\0272\006\020/\032\0020\0172\006\0200\032\0020\0172\006\0201\032\0020\0172\006\020 \032\0020\0172\006\020\020\032\0020\0172\006\020\021\032\0020%H\002¢\006\002\0202\032[\020'\032\0020(2\f\020)\032\b\022\004\022\0020+0*2\006\0203\032\002042\006\0205\032\002042\006\020/\032\0020\0172\006\0200\032\0020\0172\006\0201\032\0020\0172\006\020 \032\0020\0172\006\020\020\032\0020\0172\006\020\021\032\0020%H\002¢\006\002\0206\032S\0207\032\0020\0172\f\020)\032\b\022\004\022\0020+0*2#\020,\032\037\022\004\022\0020+\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170-¢\006\002\b\0272\006\0208\032\0020\0172\006\0200\032\0020\0172\006\020 \032\0020\017H\002\032\001\0209\032\0020\0172\f\020)\032\b\022\004\022\0020+0*2#\020,\032\037\022\004\022\0020+\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170-¢\006\002\b\0272#\020.\032\037\022\004\022\0020+\022\004\022\0020\017\022\004\022\0020\017\022\004\022\0020\0170-¢\006\002\b\0272\006\0208\032\0020\0172\006\0200\032\0020\0172\006\0201\032\0020\0172\006\020 \032\0020\0172\006\020\020\032\0020\0172\006\020\021\032\0020%H\002\032%\020:\032\0020\0372\006\020\f\032\0020\r2\006\020\n\032\0020\0132\006\020 \032\0020\017H\001¢\006\002\020;\0325\020<\032\0020#2\006\020\f\032\0020\r2\006\020\n\032\0020\0132\006\020 \032\0020\0172\006\020\020\032\0020\0172\006\020$\032\0020%H\001¢\006\002\020=\032\\\020>\032\0020?*\0020@2\006\020A\032\0020B2\f\020C\032\b\022\004\022\0020E0D2\006\020F\032\0020G2\006\020H\032\0020G2\006\020I\032\0020J2\006\020 \032\0020\0172\006\020\020\032\0020\0172\006\020\021\032\0020%H\000ø\001\000¢\006\004\bK\020L\032\034\020M\032\0020\017*\0020+2\006\020N\032\0020O2\006\020,\032\0020\017H\000\032\034\020P\032\0020\017*\0020+2\006\020N\032\0020O2\006\020.\032\0020\017H\000\032<\020Q\032\0020(*\0020E2\006\020A\032\0020B2\006\020I\032\0020R2\024\020S\032\020\022\006\022\004\030\0010T\022\004\022\0020\0070\024H\000ø\001\000¢\006\004\bU\020V\032T\020W\032\0020?*\0020@2\006\020I\032\0020J2\006\020X\032\0020\0172\006\020Y\032\0020\0172\006\0205\032\002042\f\020Z\032\b\022\004\022\0020?0[2\006\020\\\032\0020B2\006\020]\032\00204H\000ø\001\000¢\006\004\b^\020_\032\036\020`\032\004\030\0010E*\b\022\004\022\0020E0D2\b\020a\032\004\030\0010bH\002\"\024\020\000\032\0020\001X\004¢\006\b\n\000\032\004\b\002\020\003\"\024\020\004\032\0020\001X\004¢\006\b\n\000\032\004\b\005\020\003\002\007\n\005\b¡\0360\001¨\006c"}, d2 = {"CROSS_AXIS_ALIGNMENT_START", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCROSS_AXIS_ALIGNMENT_START", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "CROSS_AXIS_ALIGNMENT_TOP", "getCROSS_AXIS_ALIGNMENT_TOP", "FlowColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "maxItemsInEachColumn", "", "maxLines", "overflow", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "FlowRow", "maxItemsInEachRow", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowRowScope;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "columnMeasurementHelper", "Landroidx/compose/ui/layout/MeasurePolicy;", "maxItemsInMainAxis", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "columnMeasurementMultiContentHelper", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "overflowState", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "intrinsicCrossAxisSize", "Landroidx/collection/IntIntPair;", "children", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "mainAxisSize", "Lkotlin/Function3;", "crossAxisSize", "mainAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "mainAxisSizes", "", "crossAxisSizes", "(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J", "maxIntrinsicMainAxisSize", "crossAxisAvailable", "minIntrinsicMainAxisSize", "rowMeasurementHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;", "rowMeasurementMultiContentHelper", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "breakDownItems", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurablesIterator", "", "Landroidx/compose/ui/layout/Measurable;", "mainAxisSpacingDp", "Landroidx/compose/ui/unit/Dp;", "crossAxisSpacingDp", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "breakDownItems-di9J0FM", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;", "crossAxisMin", "isHorizontal", "", "mainAxisMin", "measureAndCache", "Landroidx/compose/ui/unit/Constraints;", "storePlaceable", "Landroidx/compose/ui/layout/Placeable;", "measureAndCache-rqJ1uqs", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function1;)J", "placeHelper", "mainAxisTotalSize", "crossAxisTotalSize", "items", "Landroidx/compose/runtime/collection/MutableVector;", "measureHelper", "outPosition", "placeHelper-BmaY500", "(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;", "safeNext", "info", "Landroidx/compose/foundation/layout/FlowLineInfo;", "foundation-layout"})
/*      */ @SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,1544:1\n1225#2,6:1545\n1225#2,6:1551\n1225#2,6:1562\n1225#2,6:1600\n1225#2,6:1606\n1225#2,6:1617\n1225#2,6:1655\n1225#2,6:1661\n1225#2,6:1667\n1225#2,6:1673\n171#3,5:1557\n79#3,6:1568\n86#3,4:1583\n90#3,2:1593\n94#3:1598\n177#3:1599\n171#3,5:1612\n79#3,6:1623\n86#3,4:1638\n90#3,2:1648\n94#3:1653\n177#3:1654\n368#4,9:1574\n377#4,3:1595\n368#4,9:1629\n377#4,3:1650\n4034#5,6:1587\n4034#5,6:1642\n69#6,6:1679\n1#7:1685\n1208#8:1686\n1187#8,2:1687\n230#9:1689\n229#9:1690\n232#9:1691\n231#9:1699\n230#9:1700\n231#9:1702\n232#9:1703\n231#9:1704\n232#9:1705\n229#9:1706\n230#9:1707\n933#10:1692\n933#10:1693\n70#11:1694\n266#11,4:1695\n271#11:1701\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n94#1:1545,6\n104#1:1551,6\n111#1:1562,6\n158#1:1600,6\n168#1:1606,6\n174#1:1617,6\n381#1:1655,6\n415#1:1661,6\n444#1:1667,6\n476#1:1673,6\n111#1:1557,5\n111#1:1568,6\n111#1:1583,4\n111#1:1593,2\n111#1:1598\n111#1:1599\n174#1:1612,5\n174#1:1623,6\n174#1:1638,4\n174#1:1648,2\n174#1:1653\n174#1:1654\n111#1:1574,9\n111#1:1595,3\n174#1:1629,9\n174#1:1650,3\n111#1:1587,6\n174#1:1642,6\n905#1:1679,6\n1175#1:1686\n1175#1:1687,2\n1176#1:1689\n1177#1:1690\n1178#1:1691\n1375#1:1699\n1376#1:1700\n1497#1:1702\n1498#1:1703\n1511#1:1704\n1512#1:1705\n1524#1:1706\n1525#1:1707\n1227#1:1692\n1228#1:1693\n1351#1:1694\n1371#1:1695,4\n1371#1:1701\n*E\n"})
/*      */ public final class FlowLayoutKt
/*      */ {
/*      */   @Composable
/*      */   @ExperimentalLayoutApi
/*      */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*      */   public static final void FlowRow(@Nullable Modifier modifier, @Nullable Arrangement.Horizontal horizontalArrangement, @Nullable Arrangement.Vertical verticalArrangement, int maxItemsInEachRow, int maxLines, @Nullable FlowRowOverflow overflow, @NotNull Function3<? super FlowRowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*   93 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(437853230); ComposerKt.sourceInformation($composer, "C(FlowRow)P(4,1,6,2,3,5)93@4089L65,96@4179L166,103@4391L261,110@4658L105:FlowLayout.kt#2w3rfo"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed(modifier) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(horizontalArrangement) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(verticalArrangement) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(maxItemsInEachRow) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(maxLines) ? 16384 : 8192; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(overflow) ? 131072 : 65536; }  if ((paramInt1 & 0x40) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changedInstance(content) ? 1048576 : 524288; }  if (($dirty & 0x92493) != 599186 || !$composer.getSkipping()) { if ((paramInt1 & 0x1) != 0) {
/*      */         modifier = (Modifier)Modifier.Companion;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       if ((paramInt1 & 0x2) != 0) {
/*      */         horizontalArrangement = Arrangement.INSTANCE.getStart();
/*      */       } }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  116 */     $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new FlowLayoutKt$FlowRow$1(modifier, horizontalArrangement, verticalArrangement, maxItemsInEachRow, maxLines, overflow, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"})
/*      */   static final class FlowLayoutKt$FlowRow$list$1$1
/*      */     extends Lambda
/*      */     implements Function2<Composer, Integer, Unit>
/*      */   {
/*      */     FlowLayoutKt$FlowRow$list$1$1(Function3<FlowRowScope, Composer, Integer, Unit> $content) {
/*      */       super(2);
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(@Nullable Composer $composer, int $changed) {
/*      */       ComposerKt.sourceInformation($composer, "C105@4547L9:FlowLayout.kt#2w3rfo");
/*      */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress()) {
/*      */           ComposerKt.traceEventStart(-139531073, $changed, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:105)");
/*      */         }
/*      */         this.$content.invoke(FlowRowScopeInstance.INSTANCE, $composer, Integer.valueOf(6));
/*      */         if (ComposerKt.isTraceInProgress()) {
/*      */           ComposerKt.traceEventEnd();
/*      */         }
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Composable
/*      */   @ExperimentalLayoutApi
/*      */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*      */   public static final void FlowColumn(@Nullable Modifier modifier, @Nullable Arrangement.Vertical verticalArrangement, @Nullable Arrangement.Horizontal horizontalArrangement, int maxItemsInEachColumn, int maxLines, @Nullable FlowColumnOverflow overflow, @NotNull Function3<? super FlowColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer $composer, int $changed, int paramInt1) {
/*  157 */     Intrinsics.checkNotNullParameter(content, "content"); $composer = $composer.startRestartGroup(-1704849416); ComposerKt.sourceInformation($composer, "C(FlowColumn)P(4,6,1,2,3,5)157@6483L65,160@6573L172,167@6791L264,173@7060L105:FlowLayout.kt#2w3rfo"); int $dirty = $changed; if ((paramInt1 & 0x1) != 0) { $dirty |= 0x6; } else if (($changed & 0x6) == 0) { $dirty |= $composer.changed(modifier) ? 4 : 2; }  if ((paramInt1 & 0x2) != 0) { $dirty |= 0x30; } else if (($changed & 0x30) == 0) { $dirty |= $composer.changed(verticalArrangement) ? 32 : 16; }  if ((paramInt1 & 0x4) != 0) { $dirty |= 0x180; } else if (($changed & 0x180) == 0) { $dirty |= $composer.changed(horizontalArrangement) ? 256 : 128; }  if ((paramInt1 & 0x8) != 0) { $dirty |= 0xC00; } else if (($changed & 0xC00) == 0) { $dirty |= $composer.changed(maxItemsInEachColumn) ? 2048 : 1024; }  if ((paramInt1 & 0x10) != 0) { $dirty |= 0x6000; } else if (($changed & 0x6000) == 0) { $dirty |= $composer.changed(maxLines) ? 16384 : 8192; }  if ((paramInt1 & 0x20) != 0) { $dirty |= 0x30000; } else if (($changed & 0x30000) == 0) { $dirty |= $composer.changed(overflow) ? 131072 : 65536; }  if ((paramInt1 & 0x40) != 0) { $dirty |= 0x180000; } else if (($changed & 0x180000) == 0) { $dirty |= $composer.changedInstance(content) ? 1048576 : 524288; }  if (($dirty & 0x92493) != 599186 || !$composer.getSkipping()) { if ((paramInt1 & 0x1) != 0) {
/*      */         modifier = (Modifier)Modifier.Companion;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       if ((paramInt1 & 0x2) != 0) {
/*      */         verticalArrangement = Arrangement.INSTANCE.getTop();
/*      */       } }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  179 */     $composer.skipToGroupEnd(); if ($composer.endRestartGroup() != null) { $composer.endRestartGroup().updateScope(new FlowLayoutKt$FlowColumn$1(modifier, verticalArrangement, horizontalArrangement, maxItemsInEachColumn, maxLines, overflow, content, $changed, paramInt1)); } else { $composer.endRestartGroup(); }
/*      */   
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\b\002\020\000\032\0020\001H\013¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"})
/*      */   static final class FlowLayoutKt$FlowColumn$list$1$1
/*      */     extends Lambda
/*      */     implements Function2<Composer, Integer, Unit>
/*      */   {
/*      */     FlowLayoutKt$FlowColumn$list$1$1(Function3<FlowColumnScope, Composer, Integer, Unit> $content) {
/*      */       super(2);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Composable
/*      */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*      */     public final void invoke(@Nullable Composer $composer, int $changed) {
/*      */       ComposerKt.sourceInformation($composer, "C169@6950L9:FlowLayout.kt#2w3rfo");
/*      */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*      */         if (ComposerKt.isTraceInProgress()) {
/*      */           ComposerKt.traceEventStart(985886665, $changed, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:169)");
/*      */         }
/*      */         this.$content.invoke(FlowColumnScopeInstance.INSTANCE, $composer, Integer.valueOf(6));
/*      */         if (ComposerKt.isTraceInProgress()) {
/*      */           ComposerKt.traceEventEnd();
/*      */         }
/*      */       } else {
/*      */         $composer.skipToGroupEnd();
/*      */       } 
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @PublishedApi
/*      */   @Composable
/*      */   @NotNull
/*      */   public static final MeasurePolicy rowMeasurementHelper(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, int maxItemsInMainAxis, @Nullable Composer $composer, int $changed) {
/*  380 */     Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement"); Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement"); ComposerKt.sourceInformationMarkerStart($composer, 1479255111, "C(rowMeasurementHelper)P(!1,2)380@13086L883:FlowLayout.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1479255111, $changed, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:379)"); 
/*  381 */     ComposerKt.sourceInformationMarkerStart($composer, -75342195, "CC(remember):FlowLayout.kt#9igjgp"); Composer composer = $composer;
/*      */ 
/*      */     
/*  384 */     int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(horizontalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(verticalArrangement)) || ($changed & 0x30) == 32) ? 1 : 0) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(maxItemsInMainAxis)) || ($changed & 0x180) == 256) ? 1 : 0);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     int $i$f$cache = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1655 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 1656 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 1657 */       int $i$a$-cache-FlowLayoutKt$rowMeasurementHelper$1 = 0; float f1 = horizontalArrangement.getSpacing-D9Ej5fM(); CrossAxisAlignment crossAxisAlignment = CROSS_AXIS_ALIGNMENT_TOP; float f2 = verticalArrangement.getSpacing-D9Ej5fM();
/*      */       FlowLayoutOverflowState flowLayoutOverflowState = FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout();
/*      */     } 
/* 1660 */     MeasurePolicy measurePolicy2 = (MeasurePolicy)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); MeasurePolicy measurePolicy1 = measurePolicy2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return measurePolicy1;
/* 1661 */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\f\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\n¢\006\004\b\b\020\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}) static final class FlowLayoutKt$rowMeasurementHelper$1$1 implements MeasurePolicy { FlowLayoutKt$rowMeasurementHelper$1$1(MultiContentMeasurePolicy $measurePolicy) {} @NotNull public final MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$MeasurePolicy, @NotNull List measurables, long constraints) { Intrinsics.checkNotNullParameter($this$MeasurePolicy, "$this$MeasurePolicy"); Intrinsics.checkNotNullParameter(measurables, "measurables"); MultiContentMeasurePolicy $this$measure_3p2s80s_u24lambda_u240 = this.$measurePolicy; int $i$a$-with-FlowLayoutKt$rowMeasurementHelper$1$1$1 = 0; return $this$measure_3p2s80s_u24lambda_u240.measure-3p2s80s($this$MeasurePolicy, CollectionsKt.listOf(measurables), constraints); } } @Composable @NotNull public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Arrangement.Vertical verticalArrangement, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflowState, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement"); Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement"); Intrinsics.checkNotNullParameter(overflowState, "overflowState"); ComposerKt.sourceInformationMarkerStart($composer, -2134502475, "C(rowMeasurementMultiContentHelper)P(!1,4)414@14301L649:FlowLayout.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-2134502475, $changed, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)");  ComposerKt.sourceInformationMarkerStart($composer, 744443043, "CC(remember):FlowLayout.kt#9igjgp"); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(horizontalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(verticalArrangement)) || ($changed & 0x30) == 32) ? 1 : 0) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(maxItemsInMainAxis)) || ($changed & 0x180) == 256) ? 1 : 0) | (((($changed & 0x1C00 ^ 0xC00) > 2048 && $composer.changed(maxLines)) || ($changed & 0xC00) == 2048) ? 1 : 0) | $composer.changed(overflowState); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 1662 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 1663 */       int $i$a$-cache-FlowLayoutKt$rowMeasurementMultiContentHelper$1 = 0; float f1 = horizontalArrangement.getSpacing-D9Ej5fM(); CrossAxisAlignment crossAxisAlignment = CROSS_AXIS_ALIGNMENT_TOP;
/*      */       float f2 = verticalArrangement.getSpacing-D9Ej5fM();
/*      */     } 
/* 1666 */     FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); FlowMeasurePolicy flowMeasurePolicy1 = flowMeasurePolicy2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return flowMeasurePolicy1; } @PublishedApi @Composable @NotNull public static final MeasurePolicy columnMeasurementHelper(@NotNull Arrangement.Vertical verticalArrangement, @NotNull Arrangement.Horizontal horizontalArrangement, int maxItemsInMainAxis, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement"); Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement"); ComposerKt.sourceInformationMarkerStart($composer, -2013098357, "C(columnMeasurementHelper)P(2)443@15212L856:FlowLayout.kt#2w3rfo"); if (ComposerKt.isTraceInProgress())
/* 1667 */       ComposerKt.traceEventStart(-2013098357, $changed, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:442)");  ComposerKt.sourceInformationMarkerStart($composer, 1837869538, "CC(remember):FlowLayout.kt#9igjgp"); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(verticalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(horizontalArrangement)) || ($changed & 0x30) == 32) ? 1 : 0) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(maxItemsInMainAxis)) || ($changed & 0x180) == 256) ? 1 : 0); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 1668 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 1669 */       int $i$a$-cache-FlowLayoutKt$columnMeasurementHelper$1 = 0; float f1 = verticalArrangement.getSpacing-D9Ej5fM(); CrossAxisAlignment crossAxisAlignment = CROSS_AXIS_ALIGNMENT_START; float f2 = horizontalArrangement.getSpacing-D9Ej5fM();
/*      */       FlowLayoutOverflowState flowLayoutOverflowState = FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout();
/*      */     } 
/* 1672 */     MeasurePolicy measurePolicy2 = (MeasurePolicy)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); MeasurePolicy measurePolicy1 = measurePolicy2; if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return measurePolicy1; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\0020\001*\0020\0022\f\020\003\032\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H\n¢\006\004\b\b\020\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}) static final class FlowLayoutKt$columnMeasurementHelper$1$1 implements MeasurePolicy {
/* 1673 */     FlowLayoutKt$columnMeasurementHelper$1$1(FlowMeasurePolicy $measurePolicy) {} @NotNull public final MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$MeasurePolicy, @NotNull List measurables, long constraints) { Intrinsics.checkNotNullParameter($this$MeasurePolicy, "$this$MeasurePolicy"); Intrinsics.checkNotNullParameter(measurables, "measurables"); FlowMeasurePolicy $this$measure_3p2s80s_u24lambda_u240 = this.$measurePolicy; int $i$a$-with-FlowLayoutKt$columnMeasurementHelper$1$1$1 = 0; return $this$measure_3p2s80s_u24lambda_u240.measure-3p2s80s($this$MeasurePolicy, CollectionsKt.listOf(measurables), constraints); } } @Composable @NotNull public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(@NotNull Arrangement.Vertical verticalArrangement, @NotNull Arrangement.Horizontal horizontalArrangement, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflowState, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(verticalArrangement, "verticalArrangement"); Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement"); Intrinsics.checkNotNullParameter(overflowState, "overflowState"); ComposerKt.sourceInformationMarkerStart($composer, 748776953, "C(columnMeasurementMultiContentHelper)P(4)475@16365L652:FlowLayout.kt#2w3rfo"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(748776953, $changed, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:474)");  ComposerKt.sourceInformationMarkerStart($composer, 287541334, "CC(remember):FlowLayout.kt#9igjgp"); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(verticalArrangement)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(horizontalArrangement)) || ($changed & 0x30) == 32) ? 1 : 0) | (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(maxItemsInMainAxis)) || ($changed & 0x180) == 256) ? 1 : 0) | (((($changed & 0x1C00 ^ 0xC00) > 2048 && $composer.changed(maxLines)) || ($changed & 0xC00) == 2048) ? 1 : 0) | $composer.changed(overflowState); int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 1674 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 1675 */       int $i$a$-cache-FlowLayoutKt$columnMeasurementMultiContentHelper$1 = 0; float f1 = verticalArrangement.getSpacing-D9Ej5fM(); CrossAxisAlignment crossAxisAlignment = CROSS_AXIS_ALIGNMENT_START;
/*      */       float f2 = horizontalArrangement.getSpacing-D9Ej5fM();
/*      */     } 
/* 1678 */     FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy)it$iv; ComposerKt.sourceInformationMarkerEnd($composer); FlowMeasurePolicy flowMeasurePolicy1 = flowMeasurePolicy2; if (ComposerKt.isTraceInProgress())
/*      */       ComposerKt.traceEventEnd();  ComposerKt.sourceInformationMarkerEnd($composer); return flowMeasurePolicy1; } private static final int maxIntrinsicMainAxisSize(List children, Function3 mainAxisSize, int crossAxisAvailable, int mainAxisSpacing, int maxItemsInMainAxis) { int fixedSpace = 0; int currentFixedSpace = 0; int lastBreak = 0; List $this$fastForEachIndexed$iv = children; int $i$f$fastForEachIndexed = 0;
/* 1680 */     int index$iv = 0, i = $this$fastForEachIndexed$iv.size(); if (index$iv < i)
/* 1681 */     { Object item$iv = $this$fastForEachIndexed$iv.get(index$iv);
/* 1682 */       IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable)item$iv; int index = index$iv, $i$a$-fastForEachIndexed-FlowLayoutKt$maxIntrinsicMainAxisSize$1 = 0; int size = ((Number)mainAxisSize.invoke(intrinsicMeasurable, Integer.valueOf(index), Integer.valueOf(crossAxisAvailable))).intValue() + mainAxisSpacing; }  return fixedSpace; }
/*      */   private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> children, int[] mainAxisSizes, int[] crossAxisSizes, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) { return intrinsicCrossAxisSize(children, new FlowLayoutKt$intrinsicCrossAxisSize$1(mainAxisSizes), new FlowLayoutKt$intrinsicCrossAxisSize$2(crossAxisSizes), mainAxisAvailable, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow); }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "index", "<anonymous parameter 1>", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"}) static final class FlowLayoutKt$intrinsicCrossAxisSize$1 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {
/* 1685 */     @NotNull public final Integer invoke(@NotNull IntrinsicMeasurable $this$intrinsicCrossAxisSize, int index, int param1Int1) { Intrinsics.checkNotNullParameter($this$intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize"); return Integer.valueOf(this.$mainAxisSizes[index]); } FlowLayoutKt$intrinsicCrossAxisSize$1(int[] $mainAxisSizes) { super(3); } } private static final int minIntrinsicMainAxisSize(List<IntrinsicMeasurable> children, Function3 mainAxisSize, Function3 crossAxisSize, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) { if (children.isEmpty()) return 0;  int i, arrayOfInt1[]; for (byte b = 0; b < i; ) { byte b1 = b; arrayOfInt1[b1] = 0; b++; }  int[] mainAxisSizes = arrayOfInt1; int j, arrayOfInt2[]; for (i = 0, j = children.size(), arrayOfInt2 = new int[j]; i < j; ) { int m = i; arrayOfInt2[m] = 0; i++; }  int[] crossAxisSizes = arrayOfInt2; for (int index = 0; index < j; index++) { IntrinsicMeasurable child = children.get(index); int mainAxisItemSize = ((Number)mainAxisSize.invoke(child, Integer.valueOf(index), Integer.valueOf(crossAxisAvailable))).intValue(); mainAxisSizes[index] = mainAxisItemSize; crossAxisSizes[index] = ((Number)crossAxisSize.invoke(child, Integer.valueOf(index), Integer.valueOf(mainAxisItemSize))).intValue(); }  int maxItemsThatCanBeShown = (maxLines != Integer.MAX_VALUE && maxItemsInMainAxis != Integer.MAX_VALUE) ? (maxItemsInMainAxis * maxLines) : Integer.MAX_VALUE; boolean mustHaveEllipsis = (maxItemsThatCanBeShown < children.size() && (overflow.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandIndicator || overflow.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? true : ((maxItemsThatCanBeShown >= children.size() && maxLines >= overflow.getMinLinesToShowCollapse$foundation_layout() && overflow.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)); maxItemsThatCanBeShown -= mustHaveEllipsis ? 1 : 0; maxItemsThatCanBeShown = Math.min(maxItemsThatCanBeShown, children.size()); int $this$minIntrinsicMainAxisSize_u24lambda_u249 = ArraysKt.sum(mainAxisSizes); int $i$a$-run-FlowLayoutKt$minIntrinsicMainAxisSize$maxMainAxisSize$1 = 0; int maxMainAxisSize = $this$minIntrinsicMainAxisSize_u24lambda_u249 + (children.size() - 1) * mainAxisSpacing; int mainAxisUsed = maxMainAxisSize; int[] arrayOfInt3 = crossAxisSizes; if ((arrayOfInt3.length == 0)) throw new NoSuchElementException();  int it = arrayOfInt3[0]; int $i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$crossAxisUsed$1 = 0; IntIterator intIterator1; for (it = it, intIterator1 = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt3))).iterator(); intIterator1.hasNext(); ) { int m = intIterator1.nextInt(), n = arrayOfInt3[m]; int i1 = 0; n = n; if (it < n) it = n;  }  int crossAxisUsed = it; int[] arrayOfInt4 = mainAxisSizes; if ((arrayOfInt4.length == 0)) throw new NoSuchElementException();  int k = arrayOfInt4[0]; int $i$a$-maxOf-FlowLayoutKt$minIntrinsicMainAxisSize$minimumItemSize$1 = 0; IntIterator intIterator2; for (k = k, intIterator2 = (new IntRange(1, ArraysKt.getLastIndex(arrayOfInt4))).iterator(); intIterator2.hasNext(); ) { int m = intIterator2.nextInt(), n = arrayOfInt4[m]; int i1 = 0; n = n; if (k < n) k = n;  }  int minimumItemSize = k; int low = minimumItemSize; int high = maxMainAxisSize; while (low <= high) { if (crossAxisUsed == crossAxisAvailable) return mainAxisUsed;  int mid = (low + high) / 2; mainAxisUsed = mid; long pair = intrinsicCrossAxisSize(children, mainAxisSizes, crossAxisSizes, mainAxisUsed, mainAxisSpacing, crossAxisSpacing, maxItemsInMainAxis, maxLines, overflow); crossAxisUsed = IntIntPair.getFirst-impl(pair); int itemShown = IntIntPair.getSecond-impl(pair); if (crossAxisUsed > crossAxisAvailable || itemShown < maxItemsThatCanBeShown) { low = mid + 1; if (low > high) return low;  continue; }  if (crossAxisUsed < crossAxisAvailable) { high = mid - 1; continue; }  return mainAxisUsed; }  return mainAxisUsed; }
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\b\n\002\030\002\n\002\b\004\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0012\006\020\004\032\0020\001H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "index", "<anonymous parameter 1>", "invoke", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;II)Ljava/lang/Integer;"}) static final class FlowLayoutKt$intrinsicCrossAxisSize$2 extends Lambda implements Function3<IntrinsicMeasurable, Integer, Integer, Integer> {
/* 1687 */     @NotNull public final Integer invoke(@NotNull IntrinsicMeasurable $this$intrinsicCrossAxisSize, int index, int param1Int1) { Intrinsics.checkNotNullParameter($this$intrinsicCrossAxisSize, "$this$intrinsicCrossAxisSize"); return Integer.valueOf(this.$crossAxisSizes[index]); } FlowLayoutKt$intrinsicCrossAxisSize$2(int[] $crossAxisSizes) { super(3); } } private static final long intrinsicCrossAxisSize(List children, Function3 mainAxisSize, Function3 crossAxisSize, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) { if (children.isEmpty()) return IntIntPair.constructor-impl(0, 0);  long l = OrientationIndependentConstraints.constructor-impl(0, mainAxisAvailable, 0, 2147483647); FlowLayoutBuildingBlocks buildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, l, maxLines, mainAxisSpacing, crossAxisSpacing, null); IntrinsicMeasurable nextChild = (IntrinsicMeasurable)CollectionsKt.getOrNull(children, 0); int nextCrossAxisSize = (nextChild != null) ? ((Number)crossAxisSize.invoke(nextChild, Integer.valueOf(0), Integer.valueOf(mainAxisAvailable))).intValue() : 0; int nextMainAxisSize = (nextChild != null) ? ((Number)mainAxisSize.invoke(nextChild, Integer.valueOf(0), Integer.valueOf(nextCrossAxisSize))).intValue() : 0; int remaining = mainAxisAvailable; int currentCrossAxisSize = 0; int totalCrossAxisSize = 0; int lastBreak = 0; int lineIndex = 0; FlowLayoutBuildingBlocks.WrapInfo wrapInfo = buildingBlocks.getWrapInfo-OpUlnko((children.size() > 1), 0, IntIntPair.constructor-impl(remaining, 2147483647), (nextChild == null) ? null : IntIntPair.box-impl(IntIntPair.constructor-impl(nextMainAxisSize, nextCrossAxisSize)), lineIndex, totalCrossAxisSize, currentCrossAxisSize, false, false); if (wrapInfo.isLastItemInContainer()) { IntIntPair intIntPair = overflow.ellipsisSize-F35zm-w$foundation_layout((nextChild != null), 0, 0); if (intIntPair != null); int size = 0; int j = 0; return IntIntPair.constructor-impl(size, j); }  int noOfItemsShown = 0; int index = 0, i = children.size(); while (true) { if (index < i) { int childCrossAxisSize = nextCrossAxisSize; int childMainAxisSize = nextMainAxisSize; remaining -= childMainAxisSize; noOfItemsShown = index + 1; currentCrossAxisSize = Math.max(currentCrossAxisSize, childCrossAxisSize); nextChild = (IntrinsicMeasurable)CollectionsKt.getOrNull(children, index + 1); nextCrossAxisSize = (nextChild != null) ? ((Number)crossAxisSize.invoke(nextChild, Integer.valueOf(index + 1), Integer.valueOf(mainAxisAvailable))).intValue() : 0; nextMainAxisSize = (nextChild != null) ? (((Number)mainAxisSize.invoke(nextChild, Integer.valueOf(index + 1), Integer.valueOf(nextCrossAxisSize))).intValue() + mainAxisSpacing) : 0; wrapInfo = buildingBlocks.getWrapInfo-OpUlnko((index + 2 < children.size()), index + 1 - lastBreak, IntIntPair.constructor-impl(remaining, 2147483647), (nextChild == null) ? null : IntIntPair.box-impl(IntIntPair.constructor-impl(nextMainAxisSize, nextCrossAxisSize)), lineIndex, totalCrossAxisSize, currentCrossAxisSize, false, false); if (wrapInfo.isLastItemInLine()) { totalCrossAxisSize += currentCrossAxisSize + crossAxisSpacing; FlowLayoutBuildingBlocks.WrapInfo wrapInfo1 = wrapInfo; boolean bool = (nextChild != null) ? true : false; int j = remaining; int k = lineIndex; int m = totalCrossAxisSize; int n = index + 1 - lastBreak; FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisWrapInfo = buildingBlocks.getWrapEllipsisInfo(wrapInfo1, bool, k, m, j, n); currentCrossAxisSize = 0; remaining = mainAxisAvailable; lastBreak = index + 1; nextMainAxisSize -= mainAxisSpacing; lineIndex++; if (wrapInfo.isLastItemInContainer()) { long it = ellipsisWrapInfo.getEllipsisSize-OO21N7I(); int $i$a$-let-FlowLayoutKt$intrinsicCrossAxisSize$3 = 0; if (!ellipsisWrapInfo.getPlaceEllipsisOnLastContentLine()) totalCrossAxisSize += IntIntPair.getSecond-impl(it) + crossAxisSpacing;  }  }  index++; continue; }  totalCrossAxisSize -= crossAxisSpacing; return IntIntPair.constructor-impl(totalCrossAxisSize, noOfItemsShown); }  } @NotNull public static final MeasureResult breakDownItems-di9J0FM(@NotNull MeasureScope $this$breakDownItems_u2ddi9J0FM, @NotNull FlowLineMeasurePolicy measurePolicy, @NotNull Iterator<? extends Measurable> measurablesIterator, float mainAxisSpacingDp, float crossAxisSpacingDp, long constraints, int maxItemsInMainAxis, int maxLines, @NotNull FlowLayoutOverflowState overflow) { Intrinsics.checkNotNullParameter($this$breakDownItems_u2ddi9J0FM, "$this$breakDownItems"); Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy"); Intrinsics.checkNotNullParameter(measurablesIterator, "measurablesIterator"); Intrinsics.checkNotNullParameter(overflow, "overflow"); int $i$f$mutableVectorOf = 0; int capacity$iv$iv = 16, $i$f$MutableVector = 0;
/* 1688 */     MutableVector<MeasureResult> items = new MutableVector((Object[])new MeasureResult[capacity$iv$iv], 0);
/* 1689 */     int $i$f$getMainAxisMax-impl = 0, mainAxisMax = Constraints.getMaxWidth-impl(constraints);
/* 1690 */     int $i$f$getMainAxisMin-impl = 0, mainAxisMin = Constraints.getMinWidth-impl(constraints);
/* 1691 */     int $i$f$getCrossAxisMax-impl = 0, crossAxisMax = Constraints.getMaxHeight-impl(constraints); MutableIntObjectMap placeables = IntObjectMapKt.mutableIntObjectMapOf(); List<Object> measurables = new ArrayList(); int spacing = (int)(float)Math.ceil($this$breakDownItems_u2ddi9J0FM.toPx-0680j_4(mainAxisSpacingDp)); int crossAxisSpacing = (int)(float)Math.ceil($this$breakDownItems_u2ddi9J0FM.toPx-0680j_4(crossAxisSpacingDp)); long subsetConstraints = OrientationIndependentConstraints.constructor-impl(0, mainAxisMax, 0, crossAxisMax); long measureConstraints = OrientationIndependentConstraints.toBoxConstraints-OenEA2s(OrientationIndependentConstraints.copy-yUG9Ft0$default(subsetConstraints, 0, 0, 0, 0, 14, null), measurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical); int index = 0; Object measurable = null; Ref.ObjectRef<Placeable> placeableItem = new Ref.ObjectRef(); int lineIndex = 0; int leftOver = 0; leftOver = mainAxisMax; int leftOverCrossAxis = crossAxisMax; if (measurablesIterator instanceof ContextualFlowItemIterator) {  } else {  }
/* 1692 */      FlowLineInfo lineInfo = null; Object nextSize = null; boolean $this$breakDownItems_di9J0FM_u24lambda_u2413 = measurablesIterator.hasNext(); int $i$a$-run-FlowLayoutKt$breakDownItems$nextSize$1 = 0; measurable = !$this$breakDownItems_di9J0FM_u24lambda_u2413 ? null : safeNext(measurablesIterator, lineInfo); nextSize = (measurable != null) ? IntIntPair.box-impl(measureAndCache-rqJ1uqs((Measurable)measurable, measurePolicy, measureConstraints, new FlowLayoutKt$breakDownItems$nextSize$1$1(placeableItem))) : null; Integer nextMainAxisSize = (nextSize != null) ? Integer.valueOf(IntIntPair.getFirst-impl(nextSize.unbox-impl())) : null; Integer nextCrossAxisSize = (nextSize != null) ? Integer.valueOf(IntIntPair.getSecond-impl(nextSize.unbox-impl())) : null; int startBreakLineIndex = 0; int $i$f$mutableIntListOf = 0; MutableIntList endBreakLineList = new MutableIntList(0, 1, null); int i = 0;
/* 1693 */     MutableIntList crossAxisSizes = new MutableIntList(0, 1, null); FlowLayoutBuildingBlocks buildingBlocks = new FlowLayoutBuildingBlocks(maxItemsInMainAxis, overflow, constraints, maxLines, spacing, crossAxisSpacing, null); Object ellipsisWrapInfo = null; boolean bool1 = measurablesIterator.hasNext(); long l1 = IntIntPair.constructor-impl(leftOver, leftOverCrossAxis); Object object1 = nextSize; FlowLayoutBuildingBlocks.WrapInfo wrapInfo1 = buildingBlocks.getWrapInfo-OpUlnko(bool1, 0, l1, (IntIntPair)object1, 0, 0, 0, false, false); FlowLayoutBuildingBlocks.WrapInfo wrapInfo2 = wrapInfo1; int $i$a$-also-FlowLayoutKt$breakDownItems$wrapInfo$1 = 0; if (wrapInfo2.isLastItemInContainer())
/* 1694 */       ellipsisWrapInfo = buildingBlocks.getWrapEllipsisInfo(wrapInfo2, (nextSize != null), -1, 0, leftOver, 0);  FlowLayoutBuildingBlocks.WrapInfo wrapInfo = wrapInfo1; int mainAxisTotalSize = 0; mainAxisTotalSize = mainAxisMin; int crossAxisTotalSize = 0; int currentLineMainAxisSize = 0; int currentLineCrossAxisSize = 0; while (!wrapInfo.isLastItemInContainer() && measurable != null) { Intrinsics.checkNotNull(nextMainAxisSize); int itemMainAxisSize = nextMainAxisSize.intValue(); Intrinsics.checkNotNull(nextCrossAxisSize); int itemCrossAxisSize = nextCrossAxisSize.intValue(); currentLineMainAxisSize += itemMainAxisSize; currentLineCrossAxisSize = Math.max(currentLineCrossAxisSize, itemCrossAxisSize); leftOver -= itemMainAxisSize; overflow.setItemShown$foundation_layout(index + 1); measurables.add(measurable); placeables.set(index, placeableItem.element); int nextIndexInLine = index + 1 - startBreakLineIndex; boolean willFitLine = (nextIndexInLine < maxItemsInMainAxis); if (lineInfo != null) { lineInfo.update-4j6BHR0$foundation_layout(willFitLine ? lineIndex : (lineIndex + 1), willFitLine ? nextIndexInLine : 0, $this$breakDownItems_u2ddi9J0FM.toDp-u2uoSUM(willFitLine ? RangesKt.coerceAtLeast(leftOver - spacing, 0) : mainAxisMax), $this$breakDownItems_u2ddi9J0FM.toDp-u2uoSUM(willFitLine ? leftOverCrossAxis : RangesKt.coerceAtLeast(leftOverCrossAxis - currentLineCrossAxisSize - crossAxisSpacing, 0))); } else {  }  boolean $this$breakDownItems_di9J0FM_u24lambda_u2415 = measurablesIterator.hasNext(); int $i$a$-run-FlowLayoutKt$breakDownItems$1 = 0; measurable = !$this$breakDownItems_di9J0FM_u24lambda_u2415 ? null : safeNext(measurablesIterator, lineInfo); placeableItem.element = null; nextSize = (measurable != null) ? IntIntPair.box-impl(measureAndCache-rqJ1uqs((Measurable)measurable, measurePolicy, measureConstraints, new FlowLayoutKt$breakDownItems$1$1(placeableItem))) : null; nextMainAxisSize = (nextSize != null) ? Integer.valueOf(IntIntPair.getFirst-impl(nextSize.unbox-impl()) + spacing) : null; nextCrossAxisSize = (nextSize != null) ? Integer.valueOf(IntIntPair.getSecond-impl(nextSize.unbox-impl())) : null; boolean bool2 = measurablesIterator.hasNext(); long l = IntIntPair.constructor-impl(leftOver, leftOverCrossAxis); int i1 = crossAxisTotalSize; Intrinsics.checkNotNull(nextMainAxisSize); Intrinsics.checkNotNull(nextCrossAxisSize); IntIntPair intIntPair = (nextSize == null) ? null : IntIntPair.box-impl(IntIntPair.constructor-impl(nextMainAxisSize.intValue(), nextCrossAxisSize.intValue())); int i2 = currentLineCrossAxisSize; int i3 = lineIndex; wrapInfo = buildingBlocks.getWrapInfo-OpUlnko(bool2, nextIndexInLine, l, intIntPair, i3, i1, i2, false, false); if (wrapInfo.isLastItemInLine()) { mainAxisTotalSize = Math.max(mainAxisTotalSize, currentLineMainAxisSize); mainAxisTotalSize = Math.min(mainAxisTotalSize, mainAxisMax); crossAxisTotalSize += currentLineCrossAxisSize; ellipsisWrapInfo = buildingBlocks.getWrapEllipsisInfo(wrapInfo, (nextSize != null), lineIndex, crossAxisTotalSize, leftOver, index + 1 - startBreakLineIndex); crossAxisSizes.add(currentLineCrossAxisSize); leftOver = mainAxisMax; leftOverCrossAxis = crossAxisMax - crossAxisTotalSize - crossAxisSpacing; startBreakLineIndex = index + 1; endBreakLineList.add(index + 1); currentLineMainAxisSize = 0; currentLineCrossAxisSize = 0; nextMainAxisSize = (nextMainAxisSize != null) ? Integer.valueOf(nextMainAxisSize.intValue() - spacing) : null; int i4 = lineIndex; lineIndex = i4 + 1; crossAxisTotalSize += crossAxisSpacing; }  index++; }  Object object2 = ellipsisWrapInfo; int $i$a$-let-FlowLayoutKt$breakDownItems$2 = 0; measurables.add(object2.getEllipsis()); placeables.set(measurables.size() - 1, object2.getPlaceable()); IntList intList1 = (IntList)endBreakLineList; int $i$f$getLastIndex = 0; lineIndex = intList1._size - 1; if (object2.getPlaceEllipsisOnLastContentLine()) { int lastIndex = endBreakLineList.getSize() - 1; int lastLineCrossAxis = crossAxisSizes.get(lineIndex); crossAxisSizes.set(lineIndex, Math.max(lastLineCrossAxis, IntIntPair.getSecond-impl(object2.getEllipsisSize-OO21N7I()))); endBreakLineList.set(lastIndex, endBreakLineList.last() + 1); } else { crossAxisSizes.add(IntIntPair.getSecond-impl(object2.getEllipsisSize-OO21N7I())); endBreakLineList.add(endBreakLineList.last() + 1); }  int j; Placeable[] arrayOfPlaceable1; for (byte b = 0; b < j; ) { byte b1 = b; arrayOfPlaceable1[b1] = (Placeable)placeables.get(b1); b++; }  Placeable[] arrayOfPlaceables = arrayOfPlaceable1; int k, arrayOfInt1[]; for (j = 0, k = endBreakLineList.getSize(), arrayOfInt1 = new int[k]; j < k; ) { $i$f$getLastIndex = j; arrayOfInt1[$i$f$getLastIndex] = 0; j++; }
/*      */      int[] crossAxisOffsets = arrayOfInt1; int m, arrayOfInt2[]; for (k = 0, m = endBreakLineList.getSize(), arrayOfInt2 = new int[m]; k < m; ) { int i1 = k; arrayOfInt2[i1] = 0; k++; }
/* 1696 */      int[] crossAxisSizesArray = arrayOfInt2; crossAxisTotalSize = 0; int startIndex = 0; IntList this_$iv = (IntList)endBreakLineList; int $i$f$forEachIndexed = 0; int[] content$iv = this_$iv.content;
/* 1697 */     int i$iv = 0, n = this_$iv._size; if (i$iv < n)
/* 1698 */     { int i1 = content$iv[i$iv], currentLineIndex = i$iv, $i$a$-forEachIndexed-FlowLayoutKt$breakDownItems$3 = 0; int crossAxisSize = crossAxisSizes.get(currentLineIndex); int $i$f$getCrossAxisMin-impl = 0; }  if (items.isEmpty()) { mainAxisTotalSize = 0; crossAxisTotalSize = 0; }  return placeHelper-BmaY500($this$breakDownItems_u2ddi9J0FM, constraints, mainAxisTotalSize, crossAxisTotalSize, crossAxisSizesArray, items, measurePolicy, crossAxisOffsets); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "invoke"}) static final class FlowLayoutKt$breakDownItems$nextSize$1$1 extends Lambda implements Function1<Placeable, Unit> {
/*      */     public final void invoke(@Nullable Placeable placeable) { this.$placeableItem.element = placeable; } FlowLayoutKt$breakDownItems$nextSize$1$1(Ref.ObjectRef<Placeable> $placeableItem) { super(1); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "invoke"}) static final class FlowLayoutKt$breakDownItems$1$1 extends Lambda implements Function1<Placeable, Unit> {
/*      */     public final void invoke(@Nullable Placeable placeable) { this.$placeableItem.element = placeable; } FlowLayoutKt$breakDownItems$1$1(Ref.ObjectRef<Placeable> $placeableItem) { super(1); } } private static final Measurable safeNext(Iterator<Measurable> $this$safeNext, FlowLineInfo info) { Measurable measurable; try { Intrinsics.checkNotNull(info); measurable = ($this$safeNext instanceof ContextualFlowItemIterator) ? ((ContextualFlowItemIterator)$this$safeNext).getNext$foundation_layout(info) : $this$safeNext.next(); } catch (IndexOutOfBoundsException e) { measurable = null; }  return measurable; } public static final int mainAxisMin(@NotNull IntrinsicMeasurable $this$mainAxisMin, boolean isHorizontal, int crossAxisSize) { Intrinsics.checkNotNullParameter($this$mainAxisMin, "<this>"); return isHorizontal ? $this$mainAxisMin.minIntrinsicWidth(crossAxisSize) : $this$mainAxisMin.minIntrinsicHeight(crossAxisSize); } public static final int crossAxisMin(@NotNull IntrinsicMeasurable $this$crossAxisMin, boolean isHorizontal, int mainAxisSize) { Intrinsics.checkNotNullParameter($this$crossAxisMin, "<this>"); return isHorizontal ? $this$crossAxisMin.minIntrinsicHeight(mainAxisSize) : $this$crossAxisMin.minIntrinsicWidth(mainAxisSize); } @NotNull private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP = CrossAxisAlignment.Companion.vertical$foundation_layout(Alignment.Companion.getTop()); @NotNull public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() { return CROSS_AXIS_ALIGNMENT_TOP; } @NotNull private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START = CrossAxisAlignment.Companion.horizontal$foundation_layout(Alignment.Companion.getStart()); @NotNull public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() { return CROSS_AXIS_ALIGNMENT_START; }
/*      */   public static final long measureAndCache-rqJ1uqs(@NotNull Measurable $this$measureAndCache_u2drqJ1uqs, @NotNull FlowLineMeasurePolicy measurePolicy, long constraints, @NotNull Function1 storePlaceable) { Intrinsics.checkNotNullParameter($this$measureAndCache_u2drqJ1uqs, "$this$measureAndCache"); Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy"); Intrinsics.checkNotNullParameter(storePlaceable, "storePlaceable"); if ((RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData((IntrinsicMeasurable)$this$measureAndCache_u2drqJ1uqs)) == 0.0F)) { RowColumnImplKt.getRowColumnParentData((IntrinsicMeasurable)$this$measureAndCache_u2drqJ1uqs).getFlowLayoutData(); if (((RowColumnImplKt.getRowColumnParentData((IntrinsicMeasurable)$this$measureAndCache_u2drqJ1uqs) != null && RowColumnImplKt.getRowColumnParentData((IntrinsicMeasurable)$this$measureAndCache_u2drqJ1uqs).getFlowLayoutData() != null) ? Float.valueOf(RowColumnImplKt.getRowColumnParentData((IntrinsicMeasurable)$this$measureAndCache_u2drqJ1uqs).getFlowLayoutData().getFillCrossAxisFraction()) : null) == null) { Placeable placeable1 = $this$measureAndCache_u2drqJ1uqs.measure-BRTryo0(constraints); storePlaceable.invoke(placeable1); Placeable placeable = placeable1; FlowLineMeasurePolicy $this$measureAndCache_rqJ1uqs_u24lambda_u2418 = measurePolicy; int $i$a$-with-FlowLayoutKt$measureAndCache$1 = 0; int i = $this$measureAndCache_rqJ1uqs_u24lambda_u2418.mainAxisSize(placeable); int j = $this$measureAndCache_rqJ1uqs_u24lambda_u2418.crossAxisSize(placeable); }  }  int mainAxis = mainAxisMin((IntrinsicMeasurable)$this$measureAndCache_u2drqJ1uqs, measurePolicy.isHorizontal(), 2147483647); int crossAxis = crossAxisMin((IntrinsicMeasurable)$this$measureAndCache_u2drqJ1uqs, measurePolicy.isHorizontal(), mainAxis); return IntIntPair.constructor-impl(mainAxis, crossAxis); }
/* 1702 */   @NotNull public static final MeasureResult placeHelper-BmaY500(@NotNull MeasureScope $this$placeHelper_u2dBmaY500, long constraints, int mainAxisTotalSize, int crossAxisTotalSize, @NotNull int[] crossAxisSizes, @NotNull MutableVector<MeasureResult> items, @NotNull FlowLineMeasurePolicy measureHelper, @NotNull int[] outPosition) { Arrangement.Vertical $this$placeHelper_BmaY500_u24lambda_u2420; Arrangement.Horizontal $this$placeHelper_BmaY500_u24lambda_u2422; Intrinsics.checkNotNullParameter($this$placeHelper_u2dBmaY500, "$this$placeHelper"); Intrinsics.checkNotNullParameter(crossAxisSizes, "crossAxisSizes"); Intrinsics.checkNotNullParameter(items, "items"); Intrinsics.checkNotNullParameter(measureHelper, "measureHelper"); Intrinsics.checkNotNullParameter(outPosition, "outPosition"); boolean isHorizontal = measureHelper.isHorizontal(); Arrangement.Vertical verticalArrangement = measureHelper.getVerticalArrangement(); Arrangement.Horizontal horizontalArrangement = measureHelper.getHorizontalArrangement(); int totalCrossAxisSize = 0; totalCrossAxisSize = crossAxisTotalSize; if (verticalArrangement == null) { int $i$a$-requireNotNull-FlowLayoutKt$placeHelper$1 = 0; String str = "null verticalArrangement"; throw new IllegalArgumentException(str.toString()); }  int $i$a$-with-FlowLayoutKt$placeHelper$2 = 0; int totalCrossAxisSpacing = $this$placeHelper_u2dBmaY500.roundToPx-0680j_4($this$placeHelper_BmaY500_u24lambda_u2420.getSpacing-D9Ej5fM()) * (items.getSize() - 1); totalCrossAxisSize += totalCrossAxisSpacing; int j = 0; int i = 0; totalCrossAxisSize = RangesKt.coerceIn(totalCrossAxisSize, Constraints.getMinHeight-impl(constraints), 
/* 1703 */         Constraints.getMaxHeight-impl(constraints)); $this$placeHelper_BmaY500_u24lambda_u2420.arrange((Density)$this$placeHelper_u2dBmaY500, totalCrossAxisSize, crossAxisSizes, outPosition); if (horizontalArrangement == null) { int $i$a$-requireNotNull-FlowLayoutKt$placeHelper$3 = 0; String str = "null horizontalArrangement"; throw new IllegalArgumentException(str.toString()); }
/* 1704 */      int $i$a$-with-FlowLayoutKt$placeHelper$4 = 0; totalCrossAxisSpacing = $this$placeHelper_u2dBmaY500.roundToPx-0680j_4($this$placeHelper_BmaY500_u24lambda_u2422.getSpacing-D9Ej5fM()) * (items.getSize() - 1); totalCrossAxisSize += totalCrossAxisSpacing; int $i$f$getCrossAxisMin-impl = 0; int $i$f$getCrossAxisMax-impl = 0; totalCrossAxisSize = RangesKt.coerceIn(totalCrossAxisSize, Constraints.getMinHeight-impl(constraints), 
/* 1705 */         Constraints.getMaxHeight-impl(constraints)); $this$placeHelper_BmaY500_u24lambda_u2422.arrange((Density)$this$placeHelper_u2dBmaY500, totalCrossAxisSize, crossAxisSizes, $this$placeHelper_u2dBmaY500.getLayoutDirection(), outPosition); int $i$f$getMainAxisMin-impl = 0; int $i$f$getMainAxisMax-impl = 0;
/* 1706 */     int finalMainAxisTotalSize = RangesKt.coerceIn(mainAxisTotalSize, Constraints.getMinWidth-impl(constraints), 
/* 1707 */         Constraints.getMaxWidth-impl(constraints));
/*      */     int layoutWidth = 0;
/*      */     int layoutHeight = 0;
/*      */     if (isHorizontal) {
/*      */       layoutWidth = finalMainAxisTotalSize;
/*      */       layoutHeight = totalCrossAxisSize;
/*      */     } else {
/*      */       layoutWidth = totalCrossAxisSize;
/*      */       layoutHeight = finalMainAxisTotalSize;
/*      */     } 
/*      */     return MeasureScope.layout$default($this$placeHelper_u2dBmaY500, layoutWidth, layoutHeight, null, new FlowLayoutKt$placeHelper$5(items), 4, null); }
/*      */ 
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$placeHelper$5\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1544:1\n460#2,11:1545\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$placeHelper$5\n*L\n1539#1:1545,11\n*E\n"})
/*      */   static final class FlowLayoutKt$placeHelper$5 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*      */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*      */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*      */       MutableVector<MeasureResult> this_$iv = this.$items;
/*      */       int $i$f$forEach = 0;
/*      */       int size$iv = this_$iv.getSize();
/*      */       if (size$iv > 0) {
/*      */         int i$iv = 0;
/*      */         Object[] content$iv = this_$iv.getContent();
/*      */         do {
/*      */           MeasureResult measureResult = (MeasureResult)content$iv[i$iv];
/*      */           int $i$a$-forEach-FlowLayoutKt$placeHelper$5$1 = 0;
/*      */           measureResult.placeChildren();
/*      */           ++i$iv;
/*      */         } while (i$iv < size$iv);
/*      */       } 
/*      */     }
/*      */     
/*      */     FlowLayoutKt$placeHelper$5(MutableVector<MeasureResult> $items) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class FlowLayoutKt$FlowColumn$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*      */     FlowLayoutKt$FlowColumn$1(Modifier $modifier, Arrangement.Vertical $verticalArrangement, Arrangement.Horizontal $horizontalArrangement, int $maxItemsInEachColumn, int $maxLines, FlowColumnOverflow $overflow, Function3<FlowColumnScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*      */       super(2);
/*      */     }
/*      */     
/*      */     public final void invoke(@Nullable Composer $composer, int $force) {
/*      */       FlowLayoutKt.FlowColumn(this.$modifier, this.$verticalArrangement, this.$horizontalArrangement, this.$maxItemsInEachColumn, this.$maxLines, this.$overflow, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*      */   static final class FlowLayoutKt$FlowRow$1 extends Lambda implements Function2<Composer, Integer, Unit> {
/*      */     FlowLayoutKt$FlowRow$1(Modifier $modifier, Arrangement.Horizontal $horizontalArrangement, Arrangement.Vertical $verticalArrangement, int $maxItemsInEachRow, int $maxLines, FlowRowOverflow $overflow, Function3<FlowRowScope, Composer, Integer, Unit> $content, int $$changed, int $$default) {
/*      */       super(2);
/*      */     }
/*      */     
/*      */     public final void invoke(@Nullable Composer $composer, int $force) {
/*      */       FlowLayoutKt.FlowRow(this.$modifier, this.$horizontalArrangement, this.$verticalArrangement, this.$maxItemsInEachRow, this.$maxLines, this.$overflow, this.$content, $composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 0x1), this.$$default);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowLayoutKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */