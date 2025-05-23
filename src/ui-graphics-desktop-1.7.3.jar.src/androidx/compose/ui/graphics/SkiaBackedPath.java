/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RoundRect;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Matrix33;
/*     */ import org.jetbrains.skia.Path;
/*     */ import org.jetbrains.skia.PathDirection;
/*     */ import org.jetbrains.skia.PathFillMode;
/*     */ import org.jetbrains.skia.PathOp;
/*     */ import org.jetbrains.skia.Rect;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\023\n\002\030\002\n\002\b\025\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J \020\023\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\0302\006\020\031\032\0020\030H\026J \020\032\032\0020\0242\006\020\025\032\0020\0262\006\020\033\032\0020\0302\006\020\034\032\0020\030H\026J\020\020\035\032\0020\0242\006\020\025\032\0020\026H\026J\030\020\035\032\0020\0242\006\020\025\032\0020\0262\006\020\036\032\0020\037H\026J\"\020 \032\0020\0242\006\020!\032\0020\0012\006\020\"\032\0020#H\026ø\001\000¢\006\004\b$\020%J\020\020&\032\0020\0242\006\020'\032\0020\026H\026J\030\020&\032\0020\0242\006\020'\032\0020\0262\006\020\036\032\0020\037H\026J\020\020(\032\0020\0242\006\020)\032\0020*H\026J\030\020(\032\0020\0242\006\020)\032\0020*2\006\020\036\032\0020\037H\026J(\020+\032\0020\0242\006\020'\032\0020\0262\006\020\027\032\0020\0302\006\020\031\032\0020\0302\006\020,\032\0020\020H\026J\b\020-\032\0020\024H\026J8\020.\032\0020\0242\006\020/\032\0020\0302\006\0200\032\0020\0302\006\0201\032\0020\0302\006\0202\032\0020\0302\006\0203\032\0020\0302\006\0204\032\0020\030H\026J\b\0205\032\0020\026H\026J\030\0206\032\0020\0242\006\0207\032\0020\0302\006\0208\032\0020\030H\026J\030\0209\032\0020\0242\006\0207\032\0020\0302\006\0208\032\0020\030H\026J*\020:\032\0020\0202\006\020;\032\0020\0012\006\020<\032\0020\0012\006\020=\032\0020>H\026ø\001\000¢\006\004\b?\020@J(\020A\032\0020\0242\006\020/\032\0020\0302\006\0200\032\0020\0302\006\0201\032\0020\0302\006\0202\032\0020\030H\026J(\020B\032\0020\0242\006\020/\032\0020\0302\006\0200\032\0020\0302\006\0201\032\0020\0302\006\0202\032\0020\030H\026J8\020C\032\0020\0242\006\020D\032\0020\0302\006\020E\032\0020\0302\006\020F\032\0020\0302\006\020G\032\0020\0302\006\020H\032\0020\0302\006\020I\032\0020\030H\026J\030\020J\032\0020\0242\006\020K\032\0020\0302\006\020L\032\0020\030H\026J\030\020M\032\0020\0242\006\020K\032\0020\0302\006\020L\032\0020\030H\026J(\020N\032\0020\0242\006\020D\032\0020\0302\006\020E\032\0020\0302\006\020F\032\0020\0302\006\020G\032\0020\030H\026J(\020O\032\0020\0242\006\020D\032\0020\0302\006\020E\032\0020\0302\006\020F\032\0020\0302\006\020G\032\0020\030H\026J\b\020P\032\0020\024H\026J\b\020Q\032\0020\024H\026J\032\020R\032\0020\0242\006\020S\032\0020TH\026ø\001\000¢\006\004\bU\020VJ\032\020W\032\0020\0242\006\020\"\032\0020#H\026ø\001\000¢\006\004\bX\020YJ\036\020Z\032\0020\024*\0020[2\006\020S\032\0020TH\002ø\001\000¢\006\004\b\\\020]J\026\020^\032\0020_*\0020>H\002ø\001\000¢\006\004\b`\020aR*\020\007\032\0020\0062\006\020\005\032\0020\0068V@VX\016ø\001\000ø\001\001¢\006\f\032\004\b\b\020\t\"\004\b\n\020\013R\036\020\002\032\0020\0032\006\020\f\032\0020\003@BX\016¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\0208VX\004¢\006\006\032\004\b\017\020\021R\024\020\022\032\0020\0208VX\004¢\006\006\032\004\b\022\020\021\002\013\n\005\b¡\0360\001\n\002\b!¨\006b"}, d2 = {"Landroidx/compose/ui/graphics/SkiaBackedPath;", "Landroidx/compose/ui/graphics/Path;", "internalPath", "Lorg/jetbrains/skia/Path;", "(Lorg/jetbrains/skia/Path;)V", "value", "Landroidx/compose/ui/graphics/PathFillType;", "fillType", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "<set-?>", "getInternalPath", "()Lorg/jetbrains/skia/Path;", "isConvex", "", "()Z", "isEmpty", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "direction", "Landroidx/compose/ui/graphics/Path$Direction;", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "arcTo", "forceMoveTo", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "lineTo", "x", "y", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "quadraticBezierTo", "quadraticTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "relativeQuadraticTo", "reset", "rewind", "transform", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "transform-58bKbWc", "([F)V", "translate", "translate-k-4lQ0M", "(J)V", "setFrom", "Lorg/jetbrains/skia/Matrix33;", "setFrom-EL8BTi8", "(Lorg/jetbrains/skia/Matrix33;[F)V", "toSkiaOperation", "Lorg/jetbrains/skia/PathOp;", "toSkiaOperation-qH5f7Ps", "(I)Lorg/jetbrains/skia/PathOp;", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nSkiaBackedPath.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaBackedPath.skiko.kt\nandroidx/compose/ui/graphics/SkiaBackedPath\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,301:1\n1#2:302\n39#3:303\n39#3:304\n39#3:305\n39#3:306\n39#3:307\n39#3:308\n39#3:309\n*S KotlinDebug\n*F\n+ 1 SkiaBackedPath.skiko.kt\nandroidx/compose/ui/graphics/SkiaBackedPath\n*L\n240#1:303\n241#1:304\n242#1:305\n243#1:306\n244#1:307\n245#1:308\n246#1:309\n*E\n"})
/*     */ public final class SkiaBackedPath
/*     */   implements Path
/*     */ {
/*     */   @NotNull
/*     */   private Path internalPath;
/*     */   
/*     */   public SkiaBackedPath(@NotNull Path internalPath) {
/*  50 */     this.internalPath = internalPath; } @NotNull public final Path getInternalPath() { return this.internalPath; }
/*     */ 
/*     */ 
/*     */   
/*     */   public int getFillType-Rg-k1Os() {
/*  55 */     return (this.internalPath.getFillMode() == PathFillMode.EVEN_ODD) ? 
/*  56 */       PathFillType.Companion.getEvenOdd-Rg-k1Os() : 
/*     */       
/*  58 */       PathFillType.Companion.getNonZero-Rg-k1Os();
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFillType-oQ8Xj4U(int value) {
/*  63 */     this.internalPath.setFillMode(
/*  64 */         PathFillType.equals-impl0(value, PathFillType.Companion.getEvenOdd-Rg-k1Os()) ? 
/*  65 */         PathFillMode.EVEN_ODD : 
/*     */         
/*  67 */         PathFillMode.WINDING);
/*     */   }
/*     */ 
/*     */   
/*     */   public void moveTo(float x, float y) {
/*  72 */     this.internalPath.moveTo(x, y);
/*     */   }
/*     */   
/*     */   public void relativeMoveTo(float dx, float dy) {
/*  76 */     this.internalPath.rMoveTo(dx, dy);
/*     */   }
/*     */   
/*     */   public void lineTo(float x, float y) {
/*  80 */     this.internalPath.lineTo(x, y);
/*     */   }
/*     */   
/*     */   public void relativeLineTo(float dx, float dy) {
/*  84 */     this.internalPath.rLineTo(dx, dy);
/*     */   }
/*     */   
/*     */   public void quadraticBezierTo(float x1, float y1, float x2, float y2) {
/*  88 */     this.internalPath.quadTo(x1, y1, x2, y2);
/*     */   }
/*     */   
/*     */   public void quadraticTo(float x1, float y1, float x2, float y2) {
/*  92 */     this.internalPath.quadTo(x1, y1, x2, y2);
/*     */   }
/*     */   
/*     */   public void relativeQuadraticBezierTo(float dx1, float dy1, float dx2, float dy2) {
/*  96 */     this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
/*     */   }
/*     */   
/*     */   public void relativeQuadraticTo(float dx1, float dy1, float dx2, float dy2) {
/* 100 */     this.internalPath.rQuadTo(dx1, dy1, dx2, dy2);
/*     */   }
/*     */   
/*     */   public void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) {
/* 104 */     this.internalPath.cubicTo(
/* 105 */         x1, y1, 
/* 106 */         x2, y2, 
/* 107 */         x3, y3);
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
/*     */   public void relativeCubicTo(float dx1, float dy1, float dx2, float dy2, float dx3, float dy3) {
/* 119 */     this.internalPath.rCubicTo(
/* 120 */         dx1, dy1, 
/* 121 */         dx2, dy2, 
/* 122 */         dx3, dy3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void arcTo(@NotNull Rect rect, float startAngleDegrees, float sweepAngleDegrees, boolean forceMoveTo) {
/* 132 */     Intrinsics.checkNotNullParameter(rect, "rect"); this.internalPath.arcTo(
/* 133 */         Rects_skikoKt.toSkiaRect(rect), 
/* 134 */         startAngleDegrees, 
/* 135 */         sweepAngleDegrees, 
/* 136 */         forceMoveTo);
/*     */   }
/*     */ 
/*     */   
/*     */   public void addRect(@NotNull Rect rect) {
/* 141 */     Intrinsics.checkNotNullParameter(rect, "rect"); Path.addRect$default(this.internalPath, Rects_skikoKt.toSkiaRect(rect), PathDirection.COUNTER_CLOCKWISE, 0, 4, null);
/*     */   }
/*     */   
/*     */   public void addRect(@NotNull Rect rect, @NotNull Path.Direction direction) {
/* 145 */     Intrinsics.checkNotNullParameter(rect, "rect"); Intrinsics.checkNotNullParameter(direction, "direction"); Path.addRect$default(this.internalPath, Rects_skikoKt.toSkiaRect(rect), SkiaBackedPath_skikoKt.access$toSkiaPathDirection(direction), 0, 4, null);
/*     */   }
/*     */   
/*     */   public void addOval(@NotNull Rect oval) {
/* 149 */     Intrinsics.checkNotNullParameter(oval, "oval"); Path.addOval$default(this.internalPath, Rects_skikoKt.toSkiaRect(oval), PathDirection.COUNTER_CLOCKWISE, 0, 4, null);
/*     */   }
/*     */   
/*     */   public void addOval(@NotNull Rect oval, @NotNull Path.Direction direction) {
/* 153 */     Intrinsics.checkNotNullParameter(oval, "oval"); Intrinsics.checkNotNullParameter(direction, "direction"); Path.addOval$default(this.internalPath, Rects_skikoKt.toSkiaRect(oval), SkiaBackedPath_skikoKt.access$toSkiaPathDirection(direction), 0, 4, null);
/*     */   }
/*     */   
/*     */   public void addRoundRect(@NotNull RoundRect roundRect) {
/* 157 */     Intrinsics.checkNotNullParameter(roundRect, "roundRect"); Path.addRRect$default(this.internalPath, Rects_skikoKt.toSkiaRRect(roundRect), PathDirection.COUNTER_CLOCKWISE, 0, 4, null);
/*     */   }
/*     */   
/*     */   public void addRoundRect(@NotNull RoundRect roundRect, @NotNull Path.Direction direction) {
/* 161 */     Intrinsics.checkNotNullParameter(roundRect, "roundRect"); Intrinsics.checkNotNullParameter(direction, "direction"); Path.addRRect$default(this.internalPath, Rects_skikoKt.toSkiaRRect(roundRect), SkiaBackedPath_skikoKt.access$toSkiaPathDirection(direction), 0, 4, null);
/*     */   }
/*     */   
/*     */   public void addArcRad(@NotNull Rect oval, float startAngleRadians, float sweepAngleRadians) {
/* 165 */     Intrinsics.checkNotNullParameter(oval, "oval"); addArc(oval, DegreesKt.degrees(startAngleRadians), DegreesKt.degrees(sweepAngleRadians));
/*     */   }
/*     */   
/*     */   public void addArc(@NotNull Rect oval, float startAngleDegrees, float sweepAngleDegrees) {
/* 169 */     Intrinsics.checkNotNullParameter(oval, "oval"); this.internalPath.addArc(Rects_skikoKt.toSkiaRect(oval), startAngleDegrees, sweepAngleDegrees);
/*     */   }
/*     */   
/*     */   public void addPath-Uv8p0NA(@NotNull Path path, long offset) {
/* 173 */     Intrinsics.checkNotNullParameter(path, "path"); Path.addPath$default(this.internalPath, SkiaBackedPath_skikoKt.asSkiaPath(path), Offset.getX-impl(offset), Offset.getY-impl(offset), false, 8, null);
/*     */   }
/*     */   
/*     */   public void close() {
/* 177 */     this.internalPath.closePath();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void reset() {
/* 183 */     int fillType = getFillType-Rg-k1Os();
/* 184 */     this.internalPath.reset();
/* 185 */     setFillType-oQ8Xj4U(fillType);
/*     */   }
/*     */   
/*     */   public void rewind() {
/* 189 */     this.internalPath.rewind();
/*     */   }
/*     */   
/*     */   public void translate-k-4lQ0M(long offset) {
/* 193 */     Path.transform$default(this.internalPath, Matrix33.Companion.makeTranslate(Offset.getX-impl(offset), Offset.getY-impl(offset)), null, false, 6, null);
/*     */   }
/*     */   
/*     */   public void transform-58bKbWc(@NotNull float[] matrix) {
/* 197 */     Intrinsics.checkNotNullParameter(matrix, "matrix"); Matrix33 matrix331 = Matrix33.Companion.makeTranslate(0.0F, 0.0F), matrix332 = matrix331;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 302 */     Path path = this.internalPath; int $i$a$-apply-SkiaBackedPath$transform$1 = 0;
/*     */     setFrom-EL8BTi8(matrix332, matrix);
/*     */     Path.transform$default(path, matrix331, null, false, 6, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Rect getBounds() {
/*     */     Rect bounds = this.internalPath.getBounds();
/*     */     return new Rect(bounds.getLeft(), bounds.getTop(), bounds.getRight(), bounds.getBottom());
/*     */   }
/*     */   
/*     */   public boolean op-N5in7k0(@NotNull Path path1, @NotNull Path path2, int operation) {
/*     */     Intrinsics.checkNotNullParameter(path1, "path1");
/*     */     Intrinsics.checkNotNullParameter(path2, "path2");
/*     */     Path path = Path.Companion.makeCombining(SkiaBackedPath_skikoKt.asSkiaPath(path1), SkiaBackedPath_skikoKt.asSkiaPath(path2), toSkiaOperation-qH5f7Ps(operation));
/*     */     if (path == null);
/*     */     ((SkiaBackedPath)path).internalPath = this.internalPath;
/*     */     return (path != null);
/*     */   }
/*     */   
/*     */   private final PathOp toSkiaOperation-qH5f7Ps(int $this$toSkiaOperation_u2dqH5f7Ps) {
/*     */     int i = $this$toSkiaOperation_u2dqH5f7Ps;
/*     */     return PathOperation.equals-impl0(i, PathOperation.Companion.getDifference-b3I0S0c()) ? PathOp.DIFFERENCE : (PathOperation.equals-impl0(i, PathOperation.Companion.getIntersect-b3I0S0c()) ? PathOp.INTERSECT : (PathOperation.equals-impl0(i, PathOperation.Companion.getUnion-b3I0S0c()) ? PathOp.UNION : (PathOperation.equals-impl0(i, PathOperation.Companion.getXor-b3I0S0c()) ? PathOp.XOR : (PathOperation.equals-impl0(i, PathOperation.Companion.getReverseDifference-b3I0S0c()) ? PathOp.REVERSE_DIFFERENCE : PathOp.XOR))));
/*     */   }
/*     */   
/*     */   public boolean isConvex() {
/*     */     return this.internalPath.isConvex();
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*     */     return this.internalPath.isEmpty();
/*     */   }
/*     */   
/*     */   private final void setFrom-EL8BTi8(Matrix33 $this$setFrom_u2dEL8BTi8, float[] matrix) {
/*     */     // Byte code:
/*     */     //   0: iconst_0
/*     */     //   1: istore_3
/*     */     //   2: iconst_2
/*     */     //   3: istore #4
/*     */     //   5: iconst_0
/*     */     //   6: istore #5
/*     */     //   8: aload_2
/*     */     //   9: iload_3
/*     */     //   10: iconst_4
/*     */     //   11: imul
/*     */     //   12: iload #4
/*     */     //   14: iadd
/*     */     //   15: faload
/*     */     //   16: fconst_0
/*     */     //   17: fcmpg
/*     */     //   18: ifne -> 25
/*     */     //   21: iconst_1
/*     */     //   22: goto -> 26
/*     */     //   25: iconst_0
/*     */     //   26: ifeq -> 207
/*     */     //   29: iconst_1
/*     */     //   30: istore_3
/*     */     //   31: iconst_2
/*     */     //   32: istore #4
/*     */     //   34: iconst_0
/*     */     //   35: istore #5
/*     */     //   37: aload_2
/*     */     //   38: iload_3
/*     */     //   39: iconst_4
/*     */     //   40: imul
/*     */     //   41: iload #4
/*     */     //   43: iadd
/*     */     //   44: faload
/*     */     //   45: fconst_0
/*     */     //   46: fcmpg
/*     */     //   47: ifne -> 54
/*     */     //   50: iconst_1
/*     */     //   51: goto -> 55
/*     */     //   54: iconst_0
/*     */     //   55: ifeq -> 207
/*     */     //   58: iconst_2
/*     */     //   59: istore_3
/*     */     //   60: iconst_2
/*     */     //   61: istore #4
/*     */     //   63: iconst_0
/*     */     //   64: istore #5
/*     */     //   66: aload_2
/*     */     //   67: iload_3
/*     */     //   68: iconst_4
/*     */     //   69: imul
/*     */     //   70: iload #4
/*     */     //   72: iadd
/*     */     //   73: faload
/*     */     //   74: fconst_1
/*     */     //   75: fcmpg
/*     */     //   76: ifne -> 83
/*     */     //   79: iconst_1
/*     */     //   80: goto -> 84
/*     */     //   83: iconst_0
/*     */     //   84: ifeq -> 207
/*     */     //   87: iconst_3
/*     */     //   88: istore_3
/*     */     //   89: iconst_2
/*     */     //   90: istore #4
/*     */     //   92: iconst_0
/*     */     //   93: istore #5
/*     */     //   95: aload_2
/*     */     //   96: iload_3
/*     */     //   97: iconst_4
/*     */     //   98: imul
/*     */     //   99: iload #4
/*     */     //   101: iadd
/*     */     //   102: faload
/*     */     //   103: fconst_0
/*     */     //   104: fcmpg
/*     */     //   105: ifne -> 112
/*     */     //   108: iconst_1
/*     */     //   109: goto -> 113
/*     */     //   112: iconst_0
/*     */     //   113: ifeq -> 207
/*     */     //   116: iconst_2
/*     */     //   117: istore_3
/*     */     //   118: iconst_0
/*     */     //   119: istore #4
/*     */     //   121: iconst_0
/*     */     //   122: istore #5
/*     */     //   124: aload_2
/*     */     //   125: iload_3
/*     */     //   126: iconst_4
/*     */     //   127: imul
/*     */     //   128: iload #4
/*     */     //   130: iadd
/*     */     //   131: faload
/*     */     //   132: fconst_0
/*     */     //   133: fcmpg
/*     */     //   134: ifne -> 141
/*     */     //   137: iconst_1
/*     */     //   138: goto -> 142
/*     */     //   141: iconst_0
/*     */     //   142: ifeq -> 207
/*     */     //   145: iconst_2
/*     */     //   146: istore_3
/*     */     //   147: iconst_1
/*     */     //   148: istore #4
/*     */     //   150: iconst_0
/*     */     //   151: istore #5
/*     */     //   153: aload_2
/*     */     //   154: iload_3
/*     */     //   155: iconst_4
/*     */     //   156: imul
/*     */     //   157: iload #4
/*     */     //   159: iadd
/*     */     //   160: faload
/*     */     //   161: fconst_0
/*     */     //   162: fcmpg
/*     */     //   163: ifne -> 170
/*     */     //   166: iconst_1
/*     */     //   167: goto -> 171
/*     */     //   170: iconst_0
/*     */     //   171: ifeq -> 207
/*     */     //   174: iconst_2
/*     */     //   175: istore_3
/*     */     //   176: iconst_3
/*     */     //   177: istore #4
/*     */     //   179: iconst_0
/*     */     //   180: istore #5
/*     */     //   182: aload_2
/*     */     //   183: iload_3
/*     */     //   184: iconst_4
/*     */     //   185: imul
/*     */     //   186: iload #4
/*     */     //   188: iadd
/*     */     //   189: faload
/*     */     //   190: fconst_0
/*     */     //   191: fcmpg
/*     */     //   192: ifne -> 199
/*     */     //   195: iconst_1
/*     */     //   196: goto -> 200
/*     */     //   199: iconst_0
/*     */     //   200: ifeq -> 207
/*     */     //   203: iconst_1
/*     */     //   204: goto -> 208
/*     */     //   207: iconst_0
/*     */     //   208: ifne -> 232
/*     */     //   211: iconst_0
/*     */     //   212: istore #4
/*     */     //   214: ldc_w 'Matrix33 does not support arbitrary transforms'
/*     */     //   217: astore #4
/*     */     //   219: new java/lang/IllegalArgumentException
/*     */     //   222: dup
/*     */     //   223: aload #4
/*     */     //   225: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   228: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   231: athrow
/*     */     //   232: aload_2
/*     */     //   233: iconst_0
/*     */     //   234: faload
/*     */     //   235: fstore_3
/*     */     //   236: aload_2
/*     */     //   237: iconst_1
/*     */     //   238: faload
/*     */     //   239: fstore #4
/*     */     //   241: aload_2
/*     */     //   242: iconst_2
/*     */     //   243: faload
/*     */     //   244: fstore #5
/*     */     //   246: aload_2
/*     */     //   247: iconst_3
/*     */     //   248: faload
/*     */     //   249: fstore #6
/*     */     //   251: aload_2
/*     */     //   252: iconst_4
/*     */     //   253: faload
/*     */     //   254: fstore #7
/*     */     //   256: aload_2
/*     */     //   257: iconst_5
/*     */     //   258: faload
/*     */     //   259: fstore #8
/*     */     //   261: aload_2
/*     */     //   262: bipush #6
/*     */     //   264: faload
/*     */     //   265: fstore #9
/*     */     //   267: aload_2
/*     */     //   268: bipush #7
/*     */     //   270: faload
/*     */     //   271: fstore #10
/*     */     //   273: aload_2
/*     */     //   274: bipush #8
/*     */     //   276: faload
/*     */     //   277: fstore #11
/*     */     //   279: aload_2
/*     */     //   280: bipush #12
/*     */     //   282: faload
/*     */     //   283: fstore #12
/*     */     //   285: aload_2
/*     */     //   286: bipush #13
/*     */     //   288: faload
/*     */     //   289: fstore #13
/*     */     //   291: aload_2
/*     */     //   292: bipush #15
/*     */     //   294: faload
/*     */     //   295: fstore #14
/*     */     //   297: aload_2
/*     */     //   298: astore #15
/*     */     //   300: aload #15
/*     */     //   302: iconst_0
/*     */     //   303: fload_3
/*     */     //   304: fastore
/*     */     //   305: aload #15
/*     */     //   307: iconst_1
/*     */     //   308: fload #7
/*     */     //   310: fastore
/*     */     //   311: aload #15
/*     */     //   313: iconst_2
/*     */     //   314: fload #12
/*     */     //   316: fastore
/*     */     //   317: aload #15
/*     */     //   319: iconst_3
/*     */     //   320: fload #4
/*     */     //   322: fastore
/*     */     //   323: aload #15
/*     */     //   325: iconst_4
/*     */     //   326: fload #8
/*     */     //   328: fastore
/*     */     //   329: aload #15
/*     */     //   331: iconst_5
/*     */     //   332: fload #13
/*     */     //   334: fastore
/*     */     //   335: aload #15
/*     */     //   337: bipush #6
/*     */     //   339: fload #6
/*     */     //   341: fastore
/*     */     //   342: aload #15
/*     */     //   344: bipush #7
/*     */     //   346: fload #10
/*     */     //   348: fastore
/*     */     //   349: aload #15
/*     */     //   351: bipush #8
/*     */     //   353: fload #14
/*     */     //   355: fastore
/*     */     //   356: iconst_0
/*     */     //   357: istore #16
/*     */     //   359: iload #16
/*     */     //   361: bipush #9
/*     */     //   363: if_icmpge -> 384
/*     */     //   366: aload_1
/*     */     //   367: invokevirtual getMat : ()[F
/*     */     //   370: iload #16
/*     */     //   372: aload #15
/*     */     //   374: iload #16
/*     */     //   376: faload
/*     */     //   377: fastore
/*     */     //   378: iinc #16, 1
/*     */     //   381: goto -> 359
/*     */     //   384: aload #15
/*     */     //   386: iconst_0
/*     */     //   387: fload_3
/*     */     //   388: fastore
/*     */     //   389: aload #15
/*     */     //   391: iconst_1
/*     */     //   392: fload #4
/*     */     //   394: fastore
/*     */     //   395: aload #15
/*     */     //   397: iconst_2
/*     */     //   398: fload #5
/*     */     //   400: fastore
/*     */     //   401: aload #15
/*     */     //   403: iconst_3
/*     */     //   404: fload #6
/*     */     //   406: fastore
/*     */     //   407: aload #15
/*     */     //   409: iconst_4
/*     */     //   410: fload #7
/*     */     //   412: fastore
/*     */     //   413: aload #15
/*     */     //   415: iconst_5
/*     */     //   416: fload #8
/*     */     //   418: fastore
/*     */     //   419: aload #15
/*     */     //   421: bipush #6
/*     */     //   423: fload #9
/*     */     //   425: fastore
/*     */     //   426: aload #15
/*     */     //   428: bipush #7
/*     */     //   430: fload #10
/*     */     //   432: fastore
/*     */     //   433: aload #15
/*     */     //   435: bipush #8
/*     */     //   437: fload #11
/*     */     //   439: fastore
/*     */     //   440: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #240	-> 0
/*     */     //   #303	-> 8
/*     */     //   #240	-> 16
/*     */     //   #241	-> 29
/*     */     //   #304	-> 37
/*     */     //   #241	-> 45
/*     */     //   #242	-> 58
/*     */     //   #305	-> 66
/*     */     //   #242	-> 74
/*     */     //   #243	-> 87
/*     */     //   #306	-> 95
/*     */     //   #243	-> 103
/*     */     //   #244	-> 116
/*     */     //   #307	-> 124
/*     */     //   #244	-> 132
/*     */     //   #245	-> 145
/*     */     //   #308	-> 153
/*     */     //   #245	-> 161
/*     */     //   #246	-> 174
/*     */     //   #309	-> 182
/*     */     //   #246	-> 190
/*     */     //   #239	-> 208
/*     */     //   #248	-> 214
/*     */     //   #239	-> 217
/*     */     //   #255	-> 232
/*     */     //   #256	-> 236
/*     */     //   #257	-> 241
/*     */     //   #258	-> 246
/*     */     //   #259	-> 251
/*     */     //   #260	-> 256
/*     */     //   #261	-> 261
/*     */     //   #262	-> 267
/*     */     //   #263	-> 273
/*     */     //   #265	-> 279
/*     */     //   #266	-> 285
/*     */     //   #267	-> 291
/*     */     //   #269	-> 297
/*     */     //   #271	-> 300
/*     */     //   #272	-> 305
/*     */     //   #273	-> 311
/*     */     //   #274	-> 317
/*     */     //   #275	-> 323
/*     */     //   #276	-> 329
/*     */     //   #277	-> 335
/*     */     //   #278	-> 342
/*     */     //   #279	-> 349
/*     */     //   #281	-> 356
/*     */     //   #282	-> 366
/*     */     //   #281	-> 378
/*     */     //   #286	-> 384
/*     */     //   #287	-> 389
/*     */     //   #288	-> 395
/*     */     //   #289	-> 401
/*     */     //   #290	-> 407
/*     */     //   #291	-> 413
/*     */     //   #292	-> 419
/*     */     //   #293	-> 426
/*     */     //   #294	-> 433
/*     */     //   #295	-> 440
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   8	8	5	$i$f$get-impl	I
/*     */     //   5	11	3	row$iv	I
/*     */     //   5	11	4	column$iv	I
/*     */     //   37	8	5	$i$f$get-impl	I
/*     */     //   34	11	3	row$iv	I
/*     */     //   34	11	4	column$iv	I
/*     */     //   66	8	5	$i$f$get-impl	I
/*     */     //   63	11	3	row$iv	I
/*     */     //   63	11	4	column$iv	I
/*     */     //   95	8	5	$i$f$get-impl	I
/*     */     //   92	11	3	row$iv	I
/*     */     //   92	11	4	column$iv	I
/*     */     //   124	8	5	$i$f$get-impl	I
/*     */     //   121	11	3	row$iv	I
/*     */     //   121	11	4	column$iv	I
/*     */     //   153	8	5	$i$f$get-impl	I
/*     */     //   150	11	3	row$iv	I
/*     */     //   150	11	4	column$iv	I
/*     */     //   182	8	5	$i$f$get-impl	I
/*     */     //   179	11	3	row$iv	I
/*     */     //   179	11	4	column$iv	I
/*     */     //   214	3	4	$i$a$-require-SkiaBackedPath$setFrom$1	I
/*     */     //   359	25	16	i	I
/*     */     //   236	205	3	scaleX	F
/*     */     //   241	200	4	skewY	F
/*     */     //   246	195	5	v2	F
/*     */     //   251	190	6	persp0	F
/*     */     //   256	185	7	skewX	F
/*     */     //   261	180	8	scaleY	F
/*     */     //   267	174	9	v6	F
/*     */     //   273	168	10	persp1	F
/*     */     //   279	162	11	v8	F
/*     */     //   285	156	12	translateX	F
/*     */     //   291	150	13	translateY	F
/*     */     //   297	144	14	persp2	F
/*     */     //   300	141	15	v	[F
/*     */     //   0	441	0	this	Landroidx/compose/ui/graphics/SkiaBackedPath;
/*     */     //   0	441	1	$this$setFrom_u2dEL8BTi8	Lorg/jetbrains/skia/Matrix33;
/*     */     //   0	441	2	matrix	[F
/*     */   }
/*     */   
/*     */   public SkiaBackedPath() {
/*     */     this(null, 1, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedPath.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */