/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.LayoutModifierNode;
/*     */ import androidx.compose.ui.unit.Density;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\b\n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\0012\0020\002B&\022\027\020\003\032\023\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\002\b\007\022\006\020\b\032\0020\t¢\006\002\020\nJ&\020\023\032\0020\024*\0020\0252\006\020\026\032\0020\0272\006\020\030\032\0020\031H\026ø\001\000¢\006\004\b\032\020\033R+\020\003\032\023\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\002\b\007X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022\002\007\n\005\b¡\0360\001¨\006\034"}, d2 = {"Landroidx/compose/foundation/layout/OffsetPxNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "rtlAware", "", "(Lkotlin/jvm/functions/Function1;Z)V", "getOffset", "()Lkotlin/jvm/functions/Function1;", "setOffset", "(Lkotlin/jvm/functions/Function1;)V", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*     */ final class OffsetPxNode
/*     */   extends Modifier.Node
/*     */   implements LayoutModifierNode
/*     */ {
/*     */   @NotNull
/*     */   private Function1<? super Density, IntOffset> offset;
/*     */   private boolean rtlAware;
/*     */   
/*     */   @NotNull
/*     */   public final Function1<Density, IntOffset> getOffset() {
/* 238 */     return (Function1)this.offset; } public final void setOffset(@NotNull Function1<? super Density, IntOffset> <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.offset = <set-?>; }
/* 239 */   public final boolean getRtlAware() { return this.rtlAware; } public final void setRtlAware(boolean <set-?>) { this.rtlAware = <set-?>; } public OffsetPxNode(@NotNull Function1<? super Density, IntOffset> offset, boolean rtlAware) { this.offset = offset; this.rtlAware = rtlAware; }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/* 245 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); Placeable placeable = measurable.measure-BRTryo0(constraints);
/* 246 */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new OffsetPxNode$measure$1($this$measure_u2d3p2s80s, placeable), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/* 247 */   static final class OffsetPxNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); long offsetValue = ((IntOffset)OffsetPxNode.this.getOffset().invoke(this.$this_measure)).unbox-impl();
/* 248 */       if (OffsetPxNode.this.getRtlAware()) {
/* 249 */         Placeable.PlacementScope.placeRelativeWithLayer$default($this$layout, this.$placeable, IntOffset.getX-impl(offsetValue), IntOffset.getY-impl(offsetValue), 0.0F, null, 12, null);
/*     */       } else {
/* 251 */         Placeable.PlacementScope.placeWithLayer$default($this$layout, this.$placeable, IntOffset.getX-impl(offsetValue), IntOffset.getY-impl(offsetValue), 0.0F, null, 12, null);
/*     */       }  }
/*     */ 
/*     */     
/*     */     OffsetPxNode$measure$1(MeasureScope measureScope, Placeable $placeable) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\OffsetPxNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */