/*     */ package org.jetbrains.compose.resources;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.painter.Painter;
/*     */ import androidx.compose.ui.graphics.vector.ImageVector;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\br\030\0002\0020\001:\003\002\003\004\001\003\005\006\007¨\006\b"}, d2 = {"Lorg/jetbrains/compose/resources/ImageCache;", "", "Bitmap", "Svg", "Vector", "Lorg/jetbrains/compose/resources/ImageCache$Bitmap;", "Lorg/jetbrains/compose/resources/ImageCache$Svg;", "Lorg/jetbrains/compose/resources/ImageCache$Vector;", "library"})
/*     */ interface ImageCache
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/ImageCache$Bitmap;", "Lorg/jetbrains/compose/resources/ImageCache;", "bitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "getBitmap", "()Landroidx/compose/ui/graphics/ImageBitmap;", "library"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class Bitmap
/*     */     implements ImageCache
/*     */   {
/*     */     @NotNull
/*     */     private final ImageBitmap bitmap;
/*     */     public static final int $stable = 8;
/*     */     
/*     */     public Bitmap(@NotNull ImageBitmap bitmap) {
/* 141 */       this.bitmap = bitmap; } @NotNull public final ImageBitmap getBitmap() { return this.bitmap; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/ImageCache$Vector;", "Lorg/jetbrains/compose/resources/ImageCache;", "vector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getVector", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "library"}) @StabilityInferred(parameters = 1) public static final class Vector implements ImageCache { @NotNull
/* 142 */     private final ImageVector vector; public Vector(@NotNull ImageVector vector) { this.vector = vector; } public static final int $stable; @NotNull public final ImageVector getVector() { return this.vector; } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lorg/jetbrains/compose/resources/ImageCache$Svg;", "Lorg/jetbrains/compose/resources/ImageCache;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "library"}) @StabilityInferred(parameters = 0) public static final class Svg implements ImageCache { @NotNull
/* 143 */     private final Painter painter; public static final int $stable = 8; public Svg(@NotNull Painter painter) { this.painter = painter; } @NotNull public final Painter getPainter() { return this.painter; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ImageCache.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */