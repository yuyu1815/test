/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\030\002\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J&\020\017\032\0020\020*\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\020H\026ø\001\000¢\006\004\b\025\020\026J\034\020\027\032\0020\030*\0020\0312\006\020\022\032\0020\0322\006\020\033\032\0020\030H\026J\034\020\034\032\0020\030*\0020\0312\006\020\022\032\0020\0322\006\020\033\032\0020\030H\026R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016\002\007\n\005\b¡\0360\001¨\006\035"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightNode;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "height", "Landroidx/compose/foundation/layout/IntrinsicSize;", "enforceIncoming", "", "(Landroidx/compose/foundation/layout/IntrinsicSize;Z)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getHeight", "()Landroidx/compose/foundation/layout/IntrinsicSize;", "setHeight", "(Landroidx/compose/foundation/layout/IntrinsicSize;)V", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "minIntrinsicHeight", "foundation-layout"})
/*     */ final class IntrinsicHeightNode
/*     */   extends IntrinsicSizeModifier
/*     */ {
/*     */   @NotNull
/*     */   private IntrinsicSize height;
/*     */   private boolean enforceIncoming;
/*     */   
/*     */   @NotNull
/*     */   public final IntrinsicSize getHeight() {
/* 214 */     return this.height; } public final void setHeight(@NotNull IntrinsicSize <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.height = <set-?>; }
/* 215 */   public boolean getEnforceIncoming() { return this.enforceIncoming; } public void setEnforceIncoming(boolean <set-?>) { this.enforceIncoming = <set-?>; } public IntrinsicHeightNode(@NotNull IntrinsicSize height, boolean enforceIncoming) { this.height = height; this.enforceIncoming = enforceIncoming; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long calculateContentConstraints-l58MMJ0(@NotNull MeasureScope $this$calculateContentConstraints_u2dl58MMJ0, @NotNull Measurable measurable, long constraints) {
/* 221 */     Intrinsics.checkNotNullParameter($this$calculateContentConstraints_u2dl58MMJ0, "$this$calculateContentConstraints"); Intrinsics.checkNotNullParameter(measurable, "measurable"); int measuredHeight = (this.height == IntrinsicSize.Min) ? 
/* 222 */       measurable.minIntrinsicHeight(Constraints.getMaxWidth-impl(constraints)) : 
/*     */       
/* 224 */       measurable.maxIntrinsicHeight(Constraints.getMaxWidth-impl(constraints));
/*     */     
/* 226 */     if (measuredHeight < 0) measuredHeight = 0; 
/* 227 */     return Constraints.Companion.fixedHeight-OenEA2s(measuredHeight);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 233 */     Intrinsics.checkNotNullParameter($this$minIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return (this.height == IntrinsicSize.Min) ? measurable.minIntrinsicHeight(width) : 
/* 234 */       measurable.maxIntrinsicHeight(width);
/*     */   }
/*     */ 
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 239 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return (this.height == IntrinsicSize.Min) ? measurable.minIntrinsicHeight(width) : 
/* 240 */       measurable.maxIntrinsicHeight(width);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\IntrinsicHeightNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */