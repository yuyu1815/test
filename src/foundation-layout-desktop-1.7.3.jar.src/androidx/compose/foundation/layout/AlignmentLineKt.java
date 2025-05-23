/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.AlignmentLine;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.platform.InspectableValueKt;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\020\013\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\032>\020\005\032\0020\006*\0020\0072\006\020\b\032\0020\0022\006\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\r2\006\020\016\032\0020\017H\002ø\001\000¢\006\004\b\020\020\021\0322\020\022\032\0020\023*\0020\0232\006\020\b\032\0020\0022\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\nH\007ø\001\000¢\006\004\b\024\020\025\0322\020\022\032\0020\023*\0020\0232\006\020\b\032\0020\0022\b\b\002\020\t\032\0020\0262\b\b\002\020\013\032\0020\026H\007ø\001\000¢\006\004\b\027\020\030\032*\020\031\032\0020\023*\0020\0232\b\b\002\020\032\032\0020\n2\b\b\002\020\033\032\0020\nH\007ø\001\000¢\006\004\b\034\020\035\032*\020\031\032\0020\023*\0020\0232\b\b\002\020\032\032\0020\0262\b\b\002\020\033\032\0020\026H\007ø\001\000¢\006\004\b\036\020\037\"\030\020\000\032\0020\001*\0020\0028BX\004¢\006\006\032\004\b\003\020\004\002\007\n\005\b¡\0360\001¨\006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout"})
/*     */ @SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,366:1\n135#2:367\n135#2:368\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:367\n121#1:368\n*E\n"})
/*     */ public final class AlignmentLineKt
/*     */ {
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier paddingFrom-4j6BHR0(@NotNull Modifier $this$paddingFrom_u2d4j6BHR0, @NotNull AlignmentLine alignmentLine, float before, float after) {
/*  70 */     Intrinsics.checkNotNullParameter($this$paddingFrom_u2d4j6BHR0, "$this$paddingFrom"); Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     int $i$f$debugInspectorInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 367 */     return $this$paddingFrom_u2d4j6BHR0.then((Modifier)new AlignmentLineOffsetDpElement(alignmentLine, before, after, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, before, after) : InspectableValueKt.getNoInspectorInfo(), null)); } @Stable @NotNull public static final Modifier paddingFrom-Y_r0B1c(@NotNull Modifier $this$paddingFrom_u2dY_r0B1c, @NotNull AlignmentLine alignmentLine, long before, long after) { Intrinsics.checkNotNullParameter($this$paddingFrom_u2dY_r0B1c, "$this$paddingFrom"); Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine"); int $i$f$debugInspectorInfo = 0;
/* 368 */     return $this$paddingFrom_u2dY_r0B1c.then((Modifier)new AlignmentLineOffsetTextUnitElement(alignmentLine, before, after, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AlignmentLineKt$paddingFrom-Y_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine, before, after) : InspectableValueKt.getNoInspectorInfo(), null)); }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier paddingFromBaseline-VpY3zN4(@NotNull Modifier $this$paddingFromBaseline_u2dVpY3zN4, float top, float bottom) {
/*     */     Intrinsics.checkNotNullParameter($this$paddingFromBaseline_u2dVpY3zN4, "$this$paddingFromBaseline");
/*     */     return $this$paddingFromBaseline_u2dVpY3zN4.then(!Dp.equals-impl0(top, Dp.Companion.getUnspecified-D9Ej5fM()) ? paddingFrom-4j6BHR0$default((Modifier)Modifier.Companion, (AlignmentLine)androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), top, 0.0F, 4, null) : (Modifier)Modifier.Companion).then(!Dp.equals-impl0(bottom, Dp.Companion.getUnspecified-D9Ej5fM()) ? paddingFrom-4j6BHR0$default((Modifier)Modifier.Companion, (AlignmentLine)androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0F, bottom, 2, null) : (Modifier)Modifier.Companion);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Modifier paddingFromBaseline-wCyjxdI(@NotNull Modifier $this$paddingFromBaseline_u2dwCyjxdI, long top, long bottom) {
/*     */     Intrinsics.checkNotNullParameter($this$paddingFromBaseline_u2dwCyjxdI, "$this$paddingFromBaseline");
/*     */     return $this$paddingFromBaseline_u2dwCyjxdI.then(!TextUnitKt.isUnspecified--R2X_6o(top) ? paddingFrom-Y_r0B1c$default((Modifier)Modifier.Companion, (AlignmentLine)androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), top, 0L, 4, null) : (Modifier)Modifier.Companion).then(!TextUnitKt.isUnspecified--R2X_6o(bottom) ? paddingFrom-Y_r0B1c$default((Modifier)Modifier.Companion, (AlignmentLine)androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, bottom, 2, null) : (Modifier)Modifier.Companion);
/*     */   }
/*     */   
/*     */   private static final MeasureResult alignmentLineOffsetMeasure-tjqqzMA(MeasureScope $this$alignmentLineOffsetMeasure_u2dtjqqzMA, AlignmentLine alignmentLine, float before, float after, Measurable measurable, long constraints) {
/*     */     Placeable placeable = measurable.measure-BRTryo0(getHorizontal(alignmentLine) ? Constraints.copy-Zbe2FdA$default(constraints, 0, 0, 0, 0, 11, null) : Constraints.copy-Zbe2FdA$default(constraints, 0, 0, 0, 0, 14, null));
/*     */     int it = placeable.get(alignmentLine), $i$a$-let-AlignmentLineKt$alignmentLineOffsetMeasure$linePosition$1 = 0, linePosition = (it != Integer.MIN_VALUE) ? it : 0;
/*     */     int axis = getHorizontal(alignmentLine) ? placeable.getHeight() : placeable.getWidth();
/*     */     int axisMax = getHorizontal(alignmentLine) ? Constraints.getMaxHeight-impl(constraints) : Constraints.getMaxWidth-impl(constraints);
/*     */     int paddingBefore = RangesKt.coerceIn((!Dp.equals-impl0(before, Dp.Companion.getUnspecified-D9Ej5fM()) ? $this$alignmentLineOffsetMeasure_u2dtjqqzMA.roundToPx-0680j_4(before) : 0) - linePosition, 0, axisMax - axis);
/*     */     int paddingAfter = RangesKt.coerceIn((!Dp.equals-impl0(after, Dp.Companion.getUnspecified-D9Ej5fM()) ? $this$alignmentLineOffsetMeasure_u2dtjqqzMA.roundToPx-0680j_4(after) : 0) - axis + linePosition, 0, axisMax - axis - paddingBefore);
/*     */     int width = getHorizontal(alignmentLine) ? placeable.getWidth() : Math.max(paddingBefore + placeable.getWidth() + paddingAfter, Constraints.getMinWidth-impl(constraints));
/*     */     int height = getHorizontal(alignmentLine) ? Math.max(paddingBefore + placeable.getHeight() + paddingAfter, Constraints.getMinHeight-impl(constraints)) : placeable.getHeight();
/*     */     return MeasureScope.layout$default($this$alignmentLineOffsetMeasure_u2dtjqqzMA, width, height, null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, before, paddingBefore, width, paddingAfter, placeable, height), 4, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/*     */   static final class AlignmentLineKt$alignmentLineOffsetMeasure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
/*     */     public final void invoke(@NotNull Placeable.PlacementScope $this$layout) {
/*     */       Intrinsics.checkNotNullParameter($this$layout, "$this$layout");
/*     */       int x = AlignmentLineKt.getHorizontal(this.$alignmentLine) ? 0 : (!Dp.equals-impl0(this.$before, Dp.Companion.getUnspecified-D9Ej5fM()) ? this.$paddingBefore : (this.$width - this.$paddingAfter - this.$placeable.getWidth()));
/*     */       int y = !AlignmentLineKt.getHorizontal(this.$alignmentLine) ? 0 : (!Dp.equals-impl0(this.$before, Dp.Companion.getUnspecified-D9Ej5fM()) ? this.$paddingBefore : (this.$height - this.$paddingAfter - this.$placeable.getHeight()));
/*     */       Placeable.PlacementScope.placeRelative$default($this$layout, this.$placeable, x, y, 0.0F, 4, null);
/*     */     }
/*     */     
/*     */     AlignmentLineKt$alignmentLineOffsetMeasure$1(AlignmentLine $alignmentLine, float $before, int $paddingBefore, int $width, int $paddingAfter, Placeable $placeable, int $height) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final boolean getHorizontal(AlignmentLine $this$horizontal) {
/*     */     return $this$horizontal instanceof androidx.compose.ui.layout.HorizontalAlignmentLine;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\AlignmentLineKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */