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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\030\002\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J&\020\017\032\0020\020*\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\020H\026ø\001\000¢\006\004\b\025\020\026J\034\020\027\032\0020\030*\0020\0312\006\020\022\032\0020\0322\006\020\033\032\0020\030H\026J\034\020\034\032\0020\030*\0020\0312\006\020\022\032\0020\0322\006\020\033\032\0020\030H\026R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016\002\007\n\005\b¡\0360\001¨\006\035"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthNode;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "width", "Landroidx/compose/foundation/layout/IntrinsicSize;", "enforceIncoming", "", "(Landroidx/compose/foundation/layout/IntrinsicSize;Z)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getWidth", "()Landroidx/compose/foundation/layout/IntrinsicSize;", "setWidth", "(Landroidx/compose/foundation/layout/IntrinsicSize;)V", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicWidth", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "foundation-layout"})
/*     */ final class IntrinsicWidthNode
/*     */   extends IntrinsicSizeModifier
/*     */ {
/*     */   @NotNull
/*     */   private IntrinsicSize width;
/*     */   private boolean enforceIncoming;
/*     */   
/*     */   @NotNull
/*     */   public final IntrinsicSize getWidth() {
/* 158 */     return this.width; } public final void setWidth(@NotNull IntrinsicSize <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.width = <set-?>; }
/* 159 */   public boolean getEnforceIncoming() { return this.enforceIncoming; } public void setEnforceIncoming(boolean <set-?>) { this.enforceIncoming = <set-?>; } public IntrinsicWidthNode(@NotNull IntrinsicSize width, boolean enforceIncoming) { this.width = width; this.enforceIncoming = enforceIncoming; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public long calculateContentConstraints-l58MMJ0(@NotNull MeasureScope $this$calculateContentConstraints_u2dl58MMJ0, @NotNull Measurable measurable, long constraints) {
/* 165 */     Intrinsics.checkNotNullParameter($this$calculateContentConstraints_u2dl58MMJ0, "$this$calculateContentConstraints"); Intrinsics.checkNotNullParameter(measurable, "measurable"); int measuredWidth = (this.width == IntrinsicSize.Min) ? 
/* 166 */       measurable.minIntrinsicWidth(Constraints.getMaxHeight-impl(constraints)) : 
/*     */       
/* 168 */       measurable.maxIntrinsicWidth(Constraints.getMaxHeight-impl(constraints));
/*     */     
/* 170 */     if (measuredWidth < 0) measuredWidth = 0; 
/* 171 */     return Constraints.Companion.fixedWidth-OenEA2s(measuredWidth);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 177 */     Intrinsics.checkNotNullParameter($this$minIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return (this.width == IntrinsicSize.Min) ? measurable.minIntrinsicWidth(height) : 
/* 178 */       measurable.maxIntrinsicWidth(height);
/*     */   }
/*     */ 
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 183 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return (this.width == IntrinsicSize.Min) ? measurable.minIntrinsicWidth(height) : 
/* 184 */       measurable.maxIntrinsicWidth(height);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\IntrinsicWidthNode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */