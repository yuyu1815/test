/*     */ package androidx.compose.animation;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.node.LayoutModifierNode;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b \030\0002\0020\0012\0020\002B\005¢\006\002\020\003J\034\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\005H\026J\034\020\n\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\013\032\0020\005H\026J\034\020\f\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\005H\026J\034\020\r\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\013\032\0020\005H\026¨\006\016"}, d2 = {"Landroidx/compose/animation/LayoutModifierNodeWithPassThroughIntrinsics;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "()V", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "minIntrinsicHeight", "minIntrinsicWidth", "animation"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public abstract class LayoutModifierNodeWithPassThroughIntrinsics
/*     */   extends Modifier.Node
/*     */   implements LayoutModifierNode
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 251 */     Intrinsics.checkNotNullParameter($this$minIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.minIntrinsicWidth(height);
/*     */   }
/*     */ 
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 256 */     Intrinsics.checkNotNullParameter($this$minIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.minIntrinsicHeight(width);
/*     */   }
/*     */ 
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull IntrinsicMeasurable measurable, int height) {
/* 261 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicWidth, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.maxIntrinsicWidth(height);
/*     */   }
/*     */ 
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull IntrinsicMeasurable measurable, int width) {
/* 266 */     Intrinsics.checkNotNullParameter($this$maxIntrinsicHeight, "<this>"); Intrinsics.checkNotNullParameter(measurable, "measurable"); return measurable.maxIntrinsicHeight(width);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\LayoutModifierNodeWithPassThroughIntrinsics.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */