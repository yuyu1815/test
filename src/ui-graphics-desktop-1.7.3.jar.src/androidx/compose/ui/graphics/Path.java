/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RoundRect;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\016\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\027\n\002\030\002\n\002\b\t\bf\030\000 ^2\0020\001:\002^_J \020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\021H&J \020\023\032\0020\r2\006\020\016\032\0020\0172\006\020\024\032\0020\0212\006\020\025\032\0020\021H&J\020\020\026\032\0020\r2\006\020\016\032\0020\017H'J\032\020\026\032\0020\r2\006\020\016\032\0020\0172\b\b\002\020\027\032\0020\030H&J$\020\031\032\0020\r2\006\020\032\032\0020\0002\b\b\002\020\033\032\0020\034H&ø\001\000¢\006\004\b\035\020\036J\020\020\037\032\0020\r2\006\020 \032\0020\017H'J\032\020\037\032\0020\r2\006\020 \032\0020\0172\b\b\002\020\027\032\0020\030H&J\020\020!\032\0020\r2\006\020\"\032\0020#H'J\032\020!\032\0020\r2\006\020\"\032\0020#2\b\b\002\020\027\032\0020\030H&J\021\020$\032\0020\0002\006\020\032\032\0020\000H\004J(\020%\032\0020\r2\006\020 \032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0212\006\020&\032\0020\tH&J(\020'\032\0020\r2\006\020 \032\0020\0172\006\020\024\032\0020\0212\006\020\025\032\0020\0212\006\020&\032\0020\tH\026J\b\020(\032\0020\rH&J8\020)\032\0020\r2\006\020*\032\0020\0212\006\020+\032\0020\0212\006\020,\032\0020\0212\006\020-\032\0020\0212\006\020.\032\0020\0212\006\020/\032\0020\021H&J\b\0200\032\0020\017H&J\t\0201\032\00202H\002J\032\0201\032\002022\006\0203\032\002042\b\b\002\0205\032\0020\021H\026J\030\0206\032\0020\r2\006\0207\032\0020\0212\006\0208\032\0020\021H&J\021\0209\032\0020\0002\006\020\032\032\0020\000H\002J\030\020:\032\0020\r2\006\0207\032\0020\0212\006\0208\032\0020\021H&J*\020;\032\0020\t2\006\020<\032\0020\0002\006\020=\032\0020\0002\006\020>\032\0020?H&ø\001\000¢\006\004\b@\020AJ\021\020B\032\0020\0002\006\020\032\032\0020\000H\004J\021\020C\032\0020\0002\006\020\032\032\0020\000H\002J(\020D\032\0020\r2\006\020*\032\0020\0212\006\020+\032\0020\0212\006\020,\032\0020\0212\006\020-\032\0020\021H'J(\020E\032\0020\r2\006\020*\032\0020\0212\006\020+\032\0020\0212\006\020,\032\0020\0212\006\020-\032\0020\021H\026J8\020F\032\0020\r2\006\020G\032\0020\0212\006\020H\032\0020\0212\006\020I\032\0020\0212\006\020J\032\0020\0212\006\020K\032\0020\0212\006\020L\032\0020\021H&J\030\020M\032\0020\r2\006\020N\032\0020\0212\006\020O\032\0020\021H&J\030\020P\032\0020\r2\006\020N\032\0020\0212\006\020O\032\0020\021H&J(\020Q\032\0020\r2\006\020G\032\0020\0212\006\020H\032\0020\0212\006\020I\032\0020\0212\006\020J\032\0020\021H'J(\020R\032\0020\r2\006\020G\032\0020\0212\006\020H\032\0020\0212\006\020I\032\0020\0212\006\020J\032\0020\021H\026J\b\020S\032\0020\rH&J\b\020T\032\0020\rH\026J\032\020U\032\0020\r2\006\020V\032\0020WH\026ø\001\000¢\006\004\bX\020YJ\032\020Z\032\0020\r2\006\020\033\032\0020\034H&ø\001\000¢\006\004\b[\020\\J\021\020]\032\0020\0002\006\020\032\032\0020\000H\004R\036\020\002\032\0020\003X¦\016ø\001\000ø\001\001¢\006\f\032\004\b\004\020\005\"\004\b\006\020\007R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\b\020\nR\022\020\013\032\0020\tX¦\004¢\006\006\032\004\b\013\020\nø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006`À\006\003"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "fillType", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "isConvex", "", "()Z", "isEmpty", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "direction", "Landroidx/compose/ui/graphics/Path$Direction;", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "and", "arcTo", "forceMoveTo", "arcToRad", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "iterator", "Landroidx/compose/ui/graphics/PathIterator;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "tolerance", "lineTo", "x", "y", "minus", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "or", "plus", "quadraticBezierTo", "quadraticTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "relativeQuadraticTo", "reset", "rewind", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "translate-k-4lQ0M", "(J)V", "xor", "Companion", "Direction", "ui-graphics"})
/*     */ public interface Path
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = Companion.$$INSTANCE;
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\004\b\002\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\005"}, d2 = {"Landroidx/compose/ui/graphics/Path$Direction;", "", "(Ljava/lang/String;I)V", "CounterClockwise", "Clockwise", "ui-graphics"})
/*     */   public enum Direction
/*     */   {
/*  41 */     CounterClockwise,
/*     */ 
/*     */ 
/*     */     
/*  45 */     Clockwise;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<Direction> getEntries() {
/*     */       return $ENTRIES;
/*     */     }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     @Deprecated
/*     */     public static void quadraticTo(@NotNull Path $this, float x1, float y1, float x2, float y2) {
/* 111 */       $this.quadraticTo(x1, y1, x2, y2);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public static void relativeQuadraticTo(@NotNull Path $this, float dx1, float dy1, float dx2, float dy2) {
/* 135 */       $this.relativeQuadraticTo(dx1, dy1, dx2, dy2);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public static void arcToRad(@NotNull Path $this, @NotNull Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) {
/* 173 */       Intrinsics.checkNotNullParameter(rect, "rect"); $this.arcToRad(rect, startAngleRadians, sweepAngleRadians, forceMoveTo);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public static void rewind(@NotNull Path $this) {
/* 316 */       $this.rewind();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     public static void transform-58bKbWc(@NotNull Path $this, @NotNull float[] matrix) {
/* 330 */       Intrinsics.checkNotNullParameter(matrix, "matrix"); $this.transform-58bKbWc(matrix);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static PathIterator iterator(@NotNull Path $this) {
/* 346 */       return $this.iterator();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static PathIterator iterator(@NotNull Path $this, @NotNull PathIterator.ConicEvaluation conicEvaluation, float tolerance) {
/* 357 */       Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation"); return $this.iterator(conicEvaluation, tolerance);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static Path plus(@NotNull Path $this, @NotNull Path path) {
/* 383 */       Intrinsics.checkNotNullParameter(path, "path"); return $this.plus(path);
/*     */     }
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static Path minus(@NotNull Path $this, @NotNull Path path) {
/* 390 */       Intrinsics.checkNotNullParameter(path, "path"); return $this.minus(path);
/*     */     }
/*     */ 
/*     */     
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static Path or(@NotNull Path $this, @NotNull Path path) {
/* 397 */       Intrinsics.checkNotNullParameter(path, "path"); return $this.or(path);
/*     */     }
/*     */     
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static Path and(@NotNull Path $this, @NotNull Path path) {
/* 403 */       Intrinsics.checkNotNullParameter(path, "path"); return $this.and(path);
/*     */     }
/*     */     
/*     */     @Deprecated
/*     */     @NotNull
/*     */     public static Path xor(@NotNull Path $this, @NotNull Path path)
/*     */     {
/* 410 */       Intrinsics.checkNotNullParameter(path, "path"); return $this.xor(path); } } default void quadraticTo(float x1, float y1, float x2, float y2) { quadraticBezierTo(x1, y1, x2, y2); } default void relativeQuadraticTo(float dx1, float dy1, float dx2, float dy2) { relativeQuadraticBezierTo(dx1, dy1, dx2, dy2); } default void arcToRad(@NotNull Rect rect, float startAngleRadians, float sweepAngleRadians, boolean forceMoveTo) { Intrinsics.checkNotNullParameter(rect, "rect"); arcTo(rect, DegreesKt.degrees(startAngleRadians), DegreesKt.degrees(sweepAngleRadians), forceMoveTo); } default void rewind() { reset(); } default void transform-58bKbWc(@NotNull float[] matrix) { Intrinsics.checkNotNullParameter(matrix, "matrix"); } @NotNull default Path xor(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); Path path1 = SkiaBackedPath_skikoKt.Path(), $this$xor_u24lambda_u243 = path1; int $i$a$-apply-Path$xor$1 = 0;
/* 411 */     $this$xor_u24lambda_u243.op-N5in7k0(this, path, PathOperation.Companion.getXor-b3I0S0c()); return path1; }
/*     */   @NotNull default PathIterator iterator() { return SkiaPathIterator_skikoKt.PathIterator$default(this, null, 0.0F, 6, null); }
/*     */   @NotNull default PathIterator iterator(@NotNull PathIterator.ConicEvaluation conicEvaluation, float tolerance) { Intrinsics.checkNotNullParameter(conicEvaluation, "conicEvaluation"); return SkiaPathIterator_skikoKt.PathIterator(this, conicEvaluation, tolerance); }
/*     */   @NotNull default Path plus(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path");
/*     */     Path path1 = SkiaBackedPath_skikoKt.Path(), $this$plus_u24lambda_u240 = path1;
/*     */     int $i$a$-apply-Path$plus$1 = 0;
/*     */     $this$plus_u24lambda_u240.op-N5in7k0(this, path, PathOperation.Companion.getUnion-b3I0S0c());
/*     */     return path1; }
/*     */   @NotNull default Path minus(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path");
/*     */     Path path1 = SkiaBackedPath_skikoKt.Path(), $this$minus_u24lambda_u241 = path1;
/*     */     int $i$a$-apply-Path$minus$1 = 0;
/*     */     $this$minus_u24lambda_u241.op-N5in7k0(this, path, PathOperation.Companion.getDifference-b3I0S0c());
/*     */     return path1; } @NotNull default Path or(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path");
/*     */     return plus(path); } @NotNull default Path and(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path");
/*     */     Path path1 = SkiaBackedPath_skikoKt.Path(), $this$and_u24lambda_u242 = path1;
/*     */     int $i$a$-apply-Path$and$1 = 0;
/*     */     $this$and_u24lambda_u242.op-N5in7k0(this, path, PathOperation.Companion.getIntersect-b3I0S0c());
/*     */     return path1; } int getFillType-Rg-k1Os(); void setFillType-oQ8Xj4U(int paramInt); boolean isConvex(); boolean isEmpty(); void moveTo(float paramFloat1, float paramFloat2); void relativeMoveTo(float paramFloat1, float paramFloat2); void lineTo(float paramFloat1, float paramFloat2); void relativeLineTo(float paramFloat1, float paramFloat2); @Deprecated(message = "Use quadraticTo() for consistency with cubicTo()", replaceWith = @ReplaceWith(expression = "quadraticTo(x1, y1, x2, y2)", imports = {}), level = DeprecationLevel.WARNING) void quadraticBezierTo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4); @Deprecated(message = "Use relativeQuadraticTo() for consistency with relativeCubicTo()", replaceWith = @ReplaceWith(expression = "relativeQuadraticTo(dx1, dy1, dx2, dy2)", imports = {}), level = DeprecationLevel.WARNING) void relativeQuadraticBezierTo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4); void cubicTo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6); void relativeCubicTo(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6); void arcTo(@NotNull Rect paramRect, float paramFloat1, float paramFloat2, boolean paramBoolean); void addRect(@NotNull Rect paramRect, @NotNull Direction paramDirection); void addOval(@NotNull Rect paramRect, @NotNull Direction paramDirection); void addRoundRect(@NotNull RoundRect paramRoundRect, @NotNull Direction paramDirection); void addArcRad(@NotNull Rect paramRect, float paramFloat1, float paramFloat2); void addArc(@NotNull Rect paramRect, float paramFloat1, float paramFloat2); void addPath-Uv8p0NA(@NotNull Path paramPath, long paramLong); void close(); void reset(); void translate-k-4lQ0M(long paramLong); @NotNull Rect getBounds(); boolean op-N5in7k0(@NotNull Path paramPath1, @NotNull Path paramPath2, int paramInt); @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J(\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\0042\006\020\b\032\0020\004ø\001\000¢\006\004\b\t\020\n\002\007\n\005\b¡\0360\001¨\006\013"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics"}) public static final class Companion
/*     */   {
/* 430 */     @NotNull public final Path combine-xh6zSI8(int operation, @NotNull Path path1, @NotNull Path path2) { Intrinsics.checkNotNullParameter(path1, "path1"); Intrinsics.checkNotNullParameter(path2, "path2"); Path path = SkiaBackedPath_skikoKt.Path();
/* 431 */       if (path.op-N5in7k0(path1, path2, operation)) {
/* 432 */         return path;
/*     */       }
/*     */       
/* 435 */       throw new IllegalArgumentException(
/* 436 */           "Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values."); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Path.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */