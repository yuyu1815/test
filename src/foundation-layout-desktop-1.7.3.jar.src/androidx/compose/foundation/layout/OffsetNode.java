/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.node.LayoutModifierNode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\r\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\0012\0020\002B\035\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004\022\006\020\006\032\0020\007¢\006\002\020\bJ&\020\024\032\0020\025*\0020\0262\006\020\027\032\0020\0302\006\020\031\032\0020\032H\026ø\001\000¢\006\004\b\033\020\034R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR\"\020\003\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\021\032\004\b\r\020\016\"\004\b\017\020\020R\"\020\005\032\0020\004X\016ø\001\000ø\001\001¢\006\020\n\002\020\021\032\004\b\022\020\016\"\004\b\023\020\020\002\013\n\005\b¡\0360\001\n\002\b!¨\006\035"}, d2 = {"Landroidx/compose/foundation/layout/OffsetNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "rtlAware", "", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "getX-D9Ej5fM", "()F", "setX-0680j_4", "(F)V", "F", "getY-D9Ej5fM", "setY-0680j_4", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout"})
/*     */ final class OffsetNode
/*     */   extends Modifier.Node
/*     */   implements LayoutModifierNode
/*     */ {
/*     */   private float x;
/*     */   private float y;
/*     */   private boolean rtlAware;
/*     */   
/*     */   public final float getX-D9Ej5fM() {
/* 182 */     return this.x; } public final void setX-0680j_4(float <set-?>) { this.x = <set-?>; }
/* 183 */   public final float getY-D9Ej5fM() { return this.y; } public final void setY-0680j_4(float <set-?>) { this.y = <set-?>; }
/* 184 */   public final boolean getRtlAware() { return this.rtlAware; } public final void setRtlAware(boolean <set-?>) { this.rtlAware = <set-?>; } private OffsetNode(float x, float y, boolean rtlAware) { this.x = x; this.y = y; this.rtlAware = rtlAware; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull Measurable measurable, long constraints) {
/* 191 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurable, "measurable"); Placeable placeable = measurable.measure-BRTryo0(constraints);
/* 192 */     return MeasureScope.layout$default($this$measure_u2d3p2s80s, placeable.getWidth(), placeable.getHeight(), null, new OffsetNode$measure$1(placeable, $this$measure_u2d3p2s80s), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/* 193 */   static final class OffsetNode$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); if (OffsetNode.this.getRtlAware()) {
/* 194 */         Placeable.PlacementScope.placeRelative$default($this$layout, this.$placeable, this.$this_measure.roundToPx-0680j_4(OffsetNode.this.getX-D9Ej5fM()), this.$this_measure.roundToPx-0680j_4(OffsetNode.this.getY-D9Ej5fM()), 0.0F, 4, null);
/*     */       } else {
/* 196 */         Placeable.PlacementScope.place$default($this$layout, this.$placeable, this.$this_measure.roundToPx-0680j_4(OffsetNode.this.getX-D9Ej5fM()), this.$this_measure.roundToPx-0680j_4(OffsetNode.this.getY-D9Ej5fM()), 0.0F, 4, null);
/*     */       }  }
/*     */ 
/*     */     
/*     */     OffsetNode$measure$1(Placeable $placeable, MeasureScope measureScope) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\OffsetNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */