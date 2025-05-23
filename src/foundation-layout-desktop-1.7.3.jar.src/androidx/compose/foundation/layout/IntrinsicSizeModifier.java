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
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\b\"\030\0002\0020\0012\0020\002B\005¢\006\002\020\003J&\020\b\032\0020\t*\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\tH&ø\001\000¢\006\004\b\016\020\017J\034\020\020\032\0020\021*\0020\0222\006\020\013\032\0020\0232\006\020\024\032\0020\021H\026J\034\020\025\032\0020\021*\0020\0222\006\020\013\032\0020\0232\006\020\026\032\0020\021H\026J$\020\027\032\0020\030*\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\tø\001\000¢\006\004\b\031\020\032J\034\020\033\032\0020\021*\0020\0222\006\020\013\032\0020\0232\006\020\024\032\0020\021H\026J\034\020\034\032\0020\021*\0020\0222\006\020\013\032\0020\0232\006\020\026\032\0020\021H\026R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007\002\007\n\005\b¡\0360\001¨\006\035"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "enforceIncoming", "", "getEnforceIncoming", "()Z", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout"})
/*     */ abstract class IntrinsicSizeModifier
/*     */   extends Modifier.Node
/*     */   implements LayoutModifierNode
/*     */ {
/*     */   public abstract boolean getEnforceIncoming();
/*     */   
/*     */   public abstract long calculateContentConstraints-l58MMJ0(@NotNull MeasureScope paramMeasureScope, @NotNull Measurable paramMeasurable, long paramLong);
/*     */   
/*     */   @NotNull
/*     */   public final MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/* 256 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); long contentConstraints = calculateContentConstraints-l58MMJ0($this$measure_u2d3p2s80s, measurable, constraints);
/* 257 */     Placeable placeable = measurable.measure-BRTryo0(
/* 258 */         getEnforceIncoming() ? ConstraintsKt.constrain-N9IONVI(constraints, contentConstraints) : contentConstraints);
/*     */     
/* 260 */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new IntrinsicSizeModifier$measure$1(placeable), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/* 261 */   static final class IntrinsicSizeModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable.PlacementScope.placeRelative-70tqf50$default($this$layout, this.$placeable, IntOffset.Companion.getZero-nOcc-ac(), 0.0F, 2, null); }
/*     */     
/*     */     IntrinsicSizeModifier$measure$1(Placeable $placeable) {
/*     */       super(1);
/*     */     } }
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 268 */     Intrinsics.checkNotNullParameter($this$minIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.minIntrinsicWidth(height);
/*     */   }
/*     */ 
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 273 */     Intrinsics.checkNotNullParameter($this$minIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.minIntrinsicHeight(width);
/*     */   }
/*     */ 
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 278 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.maxIntrinsicWidth(height);
/*     */   }
/*     */ 
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 283 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.maxIntrinsicHeight(width);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\IntrinsicSizeModifier.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */