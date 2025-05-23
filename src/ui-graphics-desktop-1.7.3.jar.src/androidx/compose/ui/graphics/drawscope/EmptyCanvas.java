/*     */ package androidx.compose.ui.graphics.drawscope;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.Paint;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.Vertices;
/*     */ import java.util.List;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\007\n\002\b\007\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020\024\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\b\b\000\030\0002\0020\001B\005¢\006\002\020\002J\"\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bH\026ø\001\000¢\006\004\b\t\020\nJ:\020\013\032\0020\0042\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\r2\006\020\020\032\0020\r2\006\020\007\032\0020\bH\026ø\001\000¢\006\004\b\021\020\022J\032\020\023\032\0020\0042\006\020\024\032\0020\025H\026ø\001\000¢\006\004\b\026\020\027J\b\020\030\032\0020\004H\026JH\020\031\032\0020\0042\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\r2\006\020\020\032\0020\r2\006\020\032\032\0020\r2\006\020\033\032\0020\r2\006\020\034\032\0020\0352\006\020\036\032\0020\037H\026J*\020 \032\0020\0042\006\020!\032\0020\"2\006\020#\032\0020\r2\006\020\036\032\0020\037H\026ø\001\000¢\006\004\b$\020%J*\020&\032\0020\0042\006\020'\032\0020(2\006\020)\032\0020\"2\006\020\036\032\0020\037H\026ø\001\000¢\006\004\b*\020+JB\020,\032\0020\0042\006\020'\032\0020(2\006\020-\032\0020.2\006\020/\032\002002\006\0201\032\0020.2\006\0202\032\002002\006\020\036\032\0020\037H\026ø\001\000¢\006\004\b3\0204J*\0205\032\0020\0042\006\0206\032\0020\"2\006\0207\032\0020\"2\006\020\036\032\0020\037H\026ø\001\000¢\006\004\b8\0209J0\020:\032\0020\0042\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\r2\006\020\020\032\0020\r2\006\020\036\032\0020\037H\026J\030\020;\032\0020\0042\006\020\005\032\0020\0062\006\020\036\032\0020\037H\026J0\020<\032\0020\0042\006\020=\032\0020>2\f\020?\032\b\022\004\022\0020\"0@2\006\020\036\032\0020\037H\026ø\001\000¢\006\004\bA\020BJ*\020C\032\0020\0042\006\020=\032\0020>2\006\020?\032\0020D2\006\020\036\032\0020\037H\026ø\001\000¢\006\004\bE\020FJ0\020G\032\0020\0042\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\r2\006\020\020\032\0020\r2\006\020\036\032\0020\037H\026J@\020H\032\0020\0042\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\r2\006\020\020\032\0020\r2\006\020I\032\0020\r2\006\020J\032\0020\r2\006\020\036\032\0020\037H\026J*\020K\032\0020\0042\006\020L\032\0020M2\006\020N\032\0020O2\006\020\036\032\0020\037H\026ø\001\000¢\006\004\bP\020QJ\b\020R\032\0020\004H\026J\b\020S\032\0020\004H\026J\020\020T\032\0020\0042\006\020U\032\0020\rH\026J\b\020V\032\0020\004H\026J\030\020W\032\0020\0042\006\020X\032\0020Y2\006\020\036\032\0020\037H\026J\030\020Z\032\0020\0042\006\020[\032\0020\r2\006\020\\\032\0020\rH\026J\030\020]\032\0020\0042\006\020[\032\0020\r2\006\020\\\032\0020\rH\026J\030\020^\032\0020\0042\006\020_\032\0020\r2\006\020`\032\0020\rH\026\002\007\n\005\b¡\0360\001¨\006a"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/EmptyCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "()V", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "points", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "ui-graphics"})
/*     */ public final class EmptyCanvas
/*     */   implements Canvas
/*     */ {
/*     */   public void save() {
/*  45 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void restore() {
/*  49 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void saveLayer(@NotNull Rect bounds, @NotNull Paint paint) {
/*  53 */     Intrinsics.checkNotNullParameter(bounds, "bounds"); Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void translate(float dx, float dy) {
/*  57 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void scale(float sx, float sy) {
/*  61 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void rotate(float degrees) {
/*  65 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void skew(float sx, float sy) {
/*  69 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void concat-58bKbWc(@NotNull float[] matrix) {
/*  73 */     Intrinsics.checkNotNullParameter(matrix, "matrix"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void clipRect-N_I0leg(float left, float top, float right, float bottom, int clipOp) {
/*  77 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void clipPath-mtrdD-E(@NotNull Path path, int clipOp) {
/*  81 */     Intrinsics.checkNotNullParameter(path, "path"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawLine-Wko1d7g(long p1, long p2, @NotNull Paint paint) {
/*  85 */     Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint) {
/*  89 */     Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawRoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY, @NotNull Paint paint) {
/* 101 */     Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint) {
/* 105 */     Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawCircle-9KIMszo(long center, float radius, @NotNull Paint paint) {
/* 109 */     Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
/* 122 */     Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawPath(@NotNull Path path, @NotNull Paint paint) {
/* 126 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawImage-d-4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint) {
/* 130 */     Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawImageRect-HPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint) {
/* 141 */     Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawPoints-O7TthRY(int pointMode, @NotNull List points, @NotNull Paint paint) {
/* 145 */     Intrinsics.checkNotNullParameter(points, "points"); Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawRawPoints-O7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint) {
/* 149 */     Intrinsics.checkNotNullParameter(points, "points"); Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void drawVertices-TPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint) {
/* 153 */     Intrinsics.checkNotNullParameter(vertices, "vertices"); Intrinsics.checkNotNullParameter(paint, "paint"); throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void enableZ() {
/* 157 */     throw new UnsupportedOperationException();
/*     */   }
/*     */   
/*     */   public void disableZ() {
/* 161 */     throw new UnsupportedOperationException();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\EmptyCanvas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */