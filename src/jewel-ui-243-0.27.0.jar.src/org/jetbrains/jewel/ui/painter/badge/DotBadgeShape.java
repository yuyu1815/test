/*    */ package org.jetbrains.jewel.ui.painter.badge;
/*    */ 
/*    */ import androidx.compose.ui.geometry.Size;
/*    */ import androidx.compose.ui.graphics.Outline;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import androidx.compose.ui.unit.LayoutDirection;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @GenerateDataFunctions
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\007\n\002\b\013\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\004\b\007\030\000 \0362\0020\001:\001\036B/\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\b\b\002\020\005\032\0020\003\022\b\b\002\020\006\032\0020\003¢\006\004\b\007\020\bJ'\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026¢\006\004\b\026\020\027J'\020\030\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026¢\006\004\b\031\020\027J\037\020\030\032\0020\0172\006\020\020\032\0020\0212\006\020\032\032\0020\033H\002¢\006\004\b\034\020\035R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\f\020\nR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\r\020\n¨\006\037"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/badge/DotBadgeShape;", "Lorg/jetbrains/jewel/ui/painter/badge/BadgeShape;", "x", "", "y", "radius", "border", "<init>", "(FFFF)V", "getX", "()F", "getY", "getRadius", "getBorder", "createHoleOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createHoleOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "createOutline-Pq9zytI", "hole", "", "createOutline-TmRCtEA", "(JZ)Landroidx/compose/ui/graphics/Outline;", "Companion", "ui"})
/*    */ @Immutable
/*    */ public final class DotBadgeShape implements BadgeShape {
/* 16 */   public DotBadgeShape(float x, float y, float radius, float border) { this.x = x;
/* 17 */     this.y = y;
/* 18 */     this.radius = radius;
/* 19 */     this.border = border; } public final float getX() { return this.x; } public final float getBorder() { return this.border; }
/*    */   public final float getY() { return this.y; }
/*    */   @NotNull
/* 22 */   public Outline createHoleOutline-Pq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) { Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(density, "density"); return createOutline-TmRCtEA(size, true); }
/*    */   public final float getRadius() { return this.radius; } @NotNull
/*    */   public Outline createOutline-Pq9zytI(long size, @NotNull LayoutDirection layoutDirection, @NotNull Density density) {
/* 25 */     Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(density, "density"); return createOutline-TmRCtEA(size, false);
/*    */   }
/*    */   private final Outline createOutline-TmRCtEA(long size, boolean hole) {
/* 28 */     float dotSize = RangesKt.coerceAtMost(Size.getWidth-impl(size), Size.getHeight-impl(size));
/*    */     
/* 30 */     if (dotSize <= 0.0F) return (Outline)BadgeShapeKt.getEmptyOutline();
/*    */     
/* 32 */     float radius = dotSize * this.radius;
/* 33 */     if (radius <= 0.0F) return (Outline)BadgeShapeKt.getEmptyOutline();
/*    */     
/* 35 */     float x = Size.getWidth-impl(size) * this.x;
/* 36 */     if (0.0F > x + radius || x - radius > Size.getWidth-impl(size)) return (Outline)BadgeShapeKt.getEmptyOutline();
/*    */     
/* 38 */     float y = Size.getHeight-impl(size) * this.y;
/* 39 */     if (0.0F > y + radius || y - radius > Size.getHeight-impl(size)) return (Outline)BadgeShapeKt.getEmptyOutline();
/*    */     
/* 41 */     float border = 
/*    */       
/* 43 */       hole ? (dotSize * this.border) : 
/* 44 */       0.0F;
/*    */ 
/*    */     
/* 47 */     float r = radius + RangesKt.coerceAtLeast(border, 0.0F);
/*    */     
/* 49 */     return (Outline)new Outline.Rounded(
/* 50 */         RoundRectKt.RoundRect-gG7oq9Y(x - r, y - r, x + r, y + r, CornerRadiusKt.CornerRadius$default(r, 0.0F, 2, null)));
/*    */   }
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/badge/DotBadgeShape$Companion;", "", "<init>", "()V", "Default", "Lorg/jetbrains/jewel/ui/painter/badge/DotBadgeShape;", "getDefault", "()Lorg/jetbrains/jewel/ui/painter/badge/DotBadgeShape;", "ui"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 55 */     public final DotBadgeShape getDefault() { return DotBadgeShape.Default; } } @NotNull public static final Companion Companion = new Companion(null); private final float x; private final float y; private final float radius; private final float border; public static final int $stable; @NotNull private static final DotBadgeShape Default = new DotBadgeShape(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DotBadgeShape))
/*    */       return false; 
/*    */     DotBadgeShape dotBadgeShape = (DotBadgeShape)other;
/*    */     return (Float.compare(this.x, dotBadgeShape.x) != 0) ? false : ((Float.compare(this.y, dotBadgeShape.y) != 0) ? false : ((Float.compare(this.radius, dotBadgeShape.radius) != 0) ? false : (!(Float.compare(this.border, dotBadgeShape.border) != 0))));
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Float.hashCode(this.x);
/*    */     result = result * 31 + Float.hashCode(this.y);
/*    */     result = result * 31 + Float.hashCode(this.radius);
/*    */     return result * 31 + Float.hashCode(this.border);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DotBadgeShape(x=" + this.x + ", y=" + this.y + ", radius=" + this.radius + ", border=" + this.border + ")";
/*    */   }
/*    */   
/*    */   public DotBadgeShape() {
/*    */     this(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\badge\DotBadgeShape.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */