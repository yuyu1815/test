/*    */ package androidx.compose.ui.graphics.drawscope;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Canvas;
/*    */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import androidx.compose.ui.unit.LayoutDirection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R$\020\004\032\0020\0032\006\020\002\032\0020\0038V@VX\016¢\006\f\032\004\b\005\020\006\"\004\b\007\020\bR$\020\n\032\0020\t2\006\020\002\032\0020\t8V@VX\016¢\006\f\032\004\b\013\020\f\"\004\b\r\020\016R(\020\020\032\004\030\0010\0172\b\020\002\032\004\030\0010\0178V@VX\016¢\006\f\032\004\b\021\020\022\"\004\b\023\020\024R$\020\026\032\0020\0252\006\020\002\032\0020\0258V@VX\016¢\006\f\032\004\b\027\020\030\"\004\b\031\020\032R\036\020\033\032\0020\034X¦\016ø\001\000ø\001\001¢\006\f\032\004\b\035\020\036\"\004\b\037\020 R\022\020!\032\0020\"X¦\004¢\006\006\032\004\b#\020$ø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006%À\006\001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawContext;", "", "<anonymous parameter 0>", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "getGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setGraphicsLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "transform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "getTransform", "()Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "ui-graphics"})
/*    */ public interface DrawContext
/*    */ {
/*    */   long getSize-NH-jbRc();
/*    */   
/*    */   void setSize-uvyYCjk(long paramLong);
/*    */   
/*    */   @NotNull
/*    */   default Canvas getCanvas() {
/* 55 */     return new EmptyCanvas(); } default void setCanvas(@NotNull Canvas paramCanvas) {
/* 56 */     Intrinsics.checkNotNullParameter(paramCanvas, "<anonymous parameter 0>");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   DrawTransform getTransform();
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default LayoutDirection getLayoutDirection() {
/* 67 */     return LayoutDirection.Ltr; } default void setLayoutDirection(@NotNull LayoutDirection paramLayoutDirection) {
/* 68 */     Intrinsics.checkNotNullParameter(paramLayoutDirection, "<anonymous parameter 0>");
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default Density getDensity() {
/* 74 */     return DrawContextKt.getDefaultDensity(); } default void setDensity(@NotNull Density paramDensity) {
/* 75 */     Intrinsics.checkNotNullParameter(paramDensity, "<anonymous parameter 0>");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   default GraphicsLayer getGraphicsLayer() {
/* 82 */     return null;
/*    */   }
/*    */   
/*    */   default void setGraphicsLayer(@Nullable GraphicsLayer paramGraphicsLayer) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\DrawContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */