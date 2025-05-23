/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.LayoutModifierNode;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.Dp;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\021\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\b\002\030\0002\0020\0012\0020\002B5\022\b\b\002\020\003\032\0020\004\022\b\b\002\020\005\032\0020\004\022\b\b\002\020\006\032\0020\004\022\b\b\002\020\007\032\0020\004\022\006\020\b\032\0020\t¢\006\002\020\nJ\034\020\037\032\0020 *\0020!2\006\020\"\032\0020#2\006\020$\032\0020 H\026J\034\020%\032\0020 *\0020!2\006\020\"\032\0020#2\006\020&\032\0020 H\026J&\020'\032\0020(*\0020)2\006\020\"\032\0020*2\006\020+\032\0020\033H\026ø\001\000¢\006\004\b,\020-J\034\020.\032\0020 *\0020!2\006\020\"\032\0020#2\006\020$\032\0020 H\026J\034\020/\032\0020 *\0020!2\006\020\"\032\0020#2\006\020&\032\0020 H\026R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\"\020\007\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\023\032\004\b\017\020\020\"\004\b\021\020\022R\"\020\006\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\023\032\004\b\024\020\020\"\004\b\025\020\022R\"\020\005\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\023\032\004\b\026\020\020\"\004\b\027\020\022R\"\020\003\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\023\032\004\b\030\020\020\"\004\b\031\020\022R\036\020\032\032\0020\033*\0020\0348BX\004ø\001\000ø\001\001¢\006\006\032\004\b\035\020\036\002\013\n\005\b¡\0360\001\n\002\b!¨\0060"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getMaxHeight-D9Ej5fM", "()F", "setMaxHeight-0680j_4", "(F)V", "F", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout"})
/*     */ final class SizeNode
/*     */   extends Modifier.Node
/*     */   implements LayoutModifierNode
/*     */ {
/*     */   private float minWidth;
/*     */   private float minHeight;
/*     */   private float maxWidth;
/*     */   private float maxHeight;
/*     */   private boolean enforceIncoming;
/*     */   
/*     */   public final float getMinWidth-D9Ej5fM() {
/* 762 */     return this.minWidth; } public final void setMinWidth-0680j_4(float <set-?>) { this.minWidth = <set-?>; }
/* 763 */   public final float getMinHeight-D9Ej5fM() { return this.minHeight; } public final void setMinHeight-0680j_4(float <set-?>) { this.minHeight = <set-?>; }
/* 764 */   public final float getMaxWidth-D9Ej5fM() { return this.maxWidth; } public final void setMaxWidth-0680j_4(float <set-?>) { this.maxWidth = <set-?>; }
/* 765 */   public final float getMaxHeight-D9Ej5fM() { return this.maxHeight; } public final void setMaxHeight-0680j_4(float <set-?>) { this.maxHeight = <set-?>; }
/* 766 */   public final boolean getEnforceIncoming() { return this.enforceIncoming; } public final void setEnforceIncoming(boolean <set-?>) { this.enforceIncoming = <set-?>; } private SizeNode(float minWidth, float minHeight, float maxWidth, float maxHeight, boolean enforceIncoming) { this.minWidth = minWidth; this.minHeight = minHeight; this.maxWidth = maxWidth; this.maxHeight = maxHeight; this.enforceIncoming = enforceIncoming; }
/*     */ 
/*     */   
/*     */   private final long getTargetConstraints-OenEA2s(Density $this$targetConstraints) {
/* 770 */     int maxWidth = !Dp.equals-impl0(this.maxWidth, Dp.Companion.getUnspecified-D9Ej5fM()) ? 
/* 771 */       RangesKt.coerceAtLeast($this$targetConstraints.roundToPx-0680j_4(this.maxWidth), 0) : Integer
/*     */       
/* 773 */       .MAX_VALUE;
/*     */     
/* 775 */     int maxHeight = !Dp.equals-impl0(this.maxHeight, Dp.Companion.getUnspecified-D9Ej5fM()) ? 
/* 776 */       RangesKt.coerceAtLeast($this$targetConstraints.roundToPx-0680j_4(this.maxHeight), 0) : Integer
/*     */       
/* 778 */       .MAX_VALUE;
/*     */ 
/*     */     
/* 781 */     int it = RangesKt.coerceAtLeast(RangesKt.coerceAtMost($this$targetConstraints.roundToPx-0680j_4(this.minWidth), maxWidth), 0), $i$a$-let-SizeNode$targetConstraints$minWidth$1 = 0;
/* 782 */     int minWidth = !Dp.equals-impl0(this.minWidth, Dp.Companion.getUnspecified-D9Ej5fM()) ? ((it != Integer.MAX_VALUE) ? it : 0) : 
/*     */ 
/*     */       
/* 785 */       0;
/*     */ 
/*     */     
/* 788 */     int i = RangesKt.coerceAtLeast(RangesKt.coerceAtMost($this$targetConstraints.roundToPx-0680j_4(this.minHeight), maxHeight), 0), $i$a$-let-SizeNode$targetConstraints$minHeight$1 = 0;
/* 789 */     int minHeight = !Dp.equals-impl0(this.minHeight, Dp.Companion.getUnspecified-D9Ej5fM()) ? ((i != Integer.MAX_VALUE) ? i : 0) : 
/*     */ 
/*     */       
/* 792 */       0;
/*     */     
/* 794 */     return ConstraintsKt.Constraints(
/* 795 */         minWidth, 
/*     */         
/* 797 */         maxWidth, minHeight, 
/* 798 */         maxHeight);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/* 806 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); long targetConstraints = getTargetConstraints-OenEA2s((Density)$this$measure_u2d3p2s80s); int $i$a$-let-SizeNode$measure$wrappedConstraints$1 = 0;
/*     */ 
/*     */ 
/*     */     
/* 810 */     int resolvedMinWidth = !Dp.equals-impl0(this.minWidth, Dp.Companion.getUnspecified-D9Ej5fM()) ? 
/* 811 */       Constraints.getMinWidth-impl(targetConstraints) : 
/*     */       
/* 813 */       RangesKt.coerceAtMost(Constraints.getMinWidth-impl(constraints), Constraints.getMaxWidth-impl(targetConstraints));
/*     */     
/* 815 */     int resolvedMaxWidth = !Dp.equals-impl0(this.maxWidth, Dp.Companion.getUnspecified-D9Ej5fM()) ? 
/* 816 */       Constraints.getMaxWidth-impl(targetConstraints) : 
/*     */       
/* 818 */       RangesKt.coerceAtLeast(Constraints.getMaxWidth-impl(constraints), Constraints.getMinWidth-impl(targetConstraints));
/*     */     
/* 820 */     int resolvedMinHeight = !Dp.equals-impl0(this.minHeight, Dp.Companion.getUnspecified-D9Ej5fM()) ? 
/* 821 */       Constraints.getMinHeight-impl(targetConstraints) : 
/*     */       
/* 823 */       RangesKt.coerceAtMost(Constraints.getMinHeight-impl(constraints), Constraints.getMaxHeight-impl(targetConstraints));
/*     */     
/* 825 */     int resolvedMaxHeight = !Dp.equals-impl0(this.maxHeight, Dp.Companion.getUnspecified-D9Ej5fM()) ? 
/* 826 */       Constraints.getMaxHeight-impl(targetConstraints) : 
/*     */       
/* 828 */       RangesKt.coerceAtLeast(Constraints.getMaxHeight-impl(constraints), Constraints.getMinHeight-impl(targetConstraints));
/*     */     
/* 830 */     long wrappedConstraints = this.enforceIncoming ? ConstraintsKt.constrain-N9IONVI(constraints, targetConstraints) : ConstraintsKt.Constraints(
/* 831 */         resolvedMinWidth, 
/* 832 */         resolvedMaxWidth, 
/* 833 */         resolvedMinHeight, 
/* 834 */         resolvedMaxHeight);
/*     */ 
/*     */ 
/*     */     
/* 838 */     Placeable placeable = measurable.measure-BRTryo0(wrappedConstraints);
/* 839 */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new SizeNode$measure$1(placeable), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/* 840 */   static final class SizeNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable.PlacementScope.placeRelative$default($this$layout, this.$placeable, 0, 0, 0.0F, 4, null); }
/*     */ 
/*     */     
/*     */     SizeNode$measure$1(Placeable $placeable) {
/*     */       super(1);
/*     */     } }
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 848 */     Intrinsics.checkNotNullParameter($this$minIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); long constraints = getTargetConstraints-OenEA2s((Density)$this$minIntrinsicWidth);
/* 849 */     return Constraints.getHasFixedWidth-impl(constraints) ? 
/* 850 */       Constraints.getMaxWidth-impl(constraints) : 
/*     */       
/* 852 */       ConstraintsKt.constrainWidth-K40F9xA(constraints, measurable.minIntrinsicWidth(height));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 860 */     Intrinsics.checkNotNullParameter($this$minIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); long constraints = getTargetConstraints-OenEA2s((Density)$this$minIntrinsicHeight);
/* 861 */     return Constraints.getHasFixedHeight-impl(constraints) ? 
/* 862 */       Constraints.getMaxHeight-impl(constraints) : 
/*     */       
/* 864 */       ConstraintsKt.constrainHeight-K40F9xA(constraints, measurable.minIntrinsicHeight(width));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 872 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); long constraints = getTargetConstraints-OenEA2s((Density)$this$maxIntrinsicWidth);
/* 873 */     return Constraints.getHasFixedWidth-impl(constraints) ? 
/* 874 */       Constraints.getMaxWidth-impl(constraints) : 
/*     */       
/* 876 */       ConstraintsKt.constrainWidth-K40F9xA(constraints, measurable.maxIntrinsicWidth(height));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 884 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); long constraints = getTargetConstraints-OenEA2s((Density)$this$maxIntrinsicHeight);
/* 885 */     return Constraints.getHasFixedHeight-impl(constraints) ? 
/* 886 */       Constraints.getMaxHeight-impl(constraints) : 
/*     */       
/* 888 */       ConstraintsKt.constrainHeight-K40F9xA(constraints, measurable.maxIntrinsicHeight(width));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\SizeNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */