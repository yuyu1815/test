/*    */ package androidx.compose.ui.graphics;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.geometry.SizeKt;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import androidx.compose.ui.unit.LayoutDirection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\b\005\"\034\020\000\032\0020\0018\006X\004¢\006\016\n\000\022\004\b\002\020\003\032\004\b\004\020\005¨\006\006"}, d2 = {"RectangleShape", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "ui-graphics"})
/*    */ public final class RectangleShapeKt
/*    */ {
/*    */   @NotNull
/* 29 */   private static final Shape RectangleShape = new RectangleShapeKt$RectangleShape$1(); @NotNull public static final Shape getRectangleShape() { return RectangleShape; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000*\001\000\b\n\030\0002\0020\001J*\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026ø\001\000¢\006\004\b\n\020\013J\b\020\f\032\0020\rH\026\002\007\n\005\b¡\0360\001¨\006\016"}, d2 = {"androidx/compose/ui/graphics/RectangleShapeKt$RectangleShape$1", "Landroidx/compose/ui/graphics/Shape;", "createOutline", "Landroidx/compose/ui/graphics/Outline$Rectangle;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline$Rectangle;", "toString", "", "ui-graphics"})
/*    */   public static final class RectangleShapeKt$RectangleShape$1 implements Shape { @NotNull
/* 31 */     public Outline.Rectangle createOutline-Pq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) { Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(density, "density"); return new Outline.Rectangle(SizeKt.toRect-uvyYCjk(size)); } @NotNull
/*    */     public String toString() {
/* 33 */       return "RectangleShape";
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\RectangleShapeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */