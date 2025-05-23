/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RoundRect;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.IntProgression;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.Bitmap;
/*     */ import org.jetbrains.skia.Canvas;
/*     */ import org.jetbrains.skia.ClipMode;
/*     */ import org.jetbrains.skia.CubicResampler;
/*     */ import org.jetbrains.skia.FilterMipmap;
/*     */ import org.jetbrains.skia.FilterMode;
/*     */ import org.jetbrains.skia.Image;
/*     */ import org.jetbrains.skia.Matrix44;
/*     */ import org.jetbrains.skia.MipmapMode;
/*     */ import org.jetbrains.skia.Paint;
/*     */ import org.jetbrains.skia.RRect;
/*     */ import org.jetbrains.skia.Rect;
/*     */ import org.jetbrains.skia.SamplingMode;
/*     */ import org.jetbrains.skia.impl.Managed;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Æ\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\b\n\002\020 \n\000\n\002\020\b\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\024\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\000\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\"\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\025H\026ø\001\000¢\006\004\b\026\020\027J:\020\030\032\0020\0212\006\020\031\032\0020\0062\006\020\032\032\0020\0062\006\020\033\032\0020\0062\006\020\034\032\0020\0062\006\020\024\032\0020\025H\026ø\001\000¢\006\004\b\035\020\036J\"\020\037\032\0020\0212\006\020 \032\0020!2\b\b\002\020\024\032\0020\025ø\001\000¢\006\004\b\"\020#J\032\020$\032\0020\0212\006\020%\032\0020&H\026ø\001\000¢\006\004\b'\020(J\b\020)\032\0020\021H\026JH\020*\032\0020\0212\006\020\031\032\0020\0062\006\020\032\032\0020\0062\006\020\033\032\0020\0062\006\020\034\032\0020\0062\006\020+\032\0020\0062\006\020,\032\0020\0062\006\020-\032\0020.2\006\020/\032\0020\016H\026J*\0200\032\0020\0212\006\0201\032\002022\006\0203\032\0020\0062\006\020/\032\0020\016H\026ø\001\000¢\006\004\b4\0205J*\0206\032\0020\0212\006\0207\032\002082\006\0209\032\002022\006\020/\032\0020\016H\026ø\001\000¢\006\004\b:\020;JB\020<\032\0020\0212\006\0207\032\002082\006\020=\032\002022\006\020>\032\0020?2\006\020@\032\002022\006\020A\032\0020?2\006\020/\032\0020\016H\002ø\001\000¢\006\004\bB\020CJB\020<\032\0020\0212\006\0207\032\002082\006\020=\032\0020D2\006\020>\032\0020E2\006\020@\032\0020D2\006\020A\032\0020E2\006\020/\032\0020\016H\026ø\001\000¢\006\004\bF\020CJ*\020G\032\0020\0212\006\020H\032\002022\006\020I\032\002022\006\020/\032\0020\016H\026ø\001\000¢\006\004\bJ\020KJ&\020L\032\0020\0212\f\020M\032\b\022\004\022\002020N2\006\020/\032\0020\0162\006\020O\032\0020PH\002J0\020Q\032\0020\0212\006\020\031\032\0020\0062\006\020\032\032\0020\0062\006\020\033\032\0020\0062\006\020\034\032\0020\0062\006\020/\032\0020\016H\026J\030\020R\032\0020\0212\006\020\022\032\0020\0232\006\020/\032\0020\016H\026J0\020S\032\0020\0212\006\020T\032\0020U2\f\020M\032\b\022\004\022\002020N2\006\020/\032\0020\016H\026ø\001\000¢\006\004\bV\020WJ\036\020S\032\0020\0212\f\020M\032\b\022\004\022\002020N2\006\020/\032\0020\016H\002J \020X\032\0020\0212\006\020M\032\0020Y2\006\020/\032\0020\0162\006\020O\032\0020PH\002J*\020Z\032\0020\0212\006\020T\032\0020U2\006\020M\032\0020Y2\006\020/\032\0020\016H\026ø\001\000¢\006\004\b[\020\\J \020Z\032\0020\0212\006\020M\032\0020Y2\006\020/\032\0020\0162\006\020O\032\0020PH\002J0\020]\032\0020\0212\006\020\031\032\0020\0062\006\020\032\032\0020\0062\006\020\033\032\0020\0062\006\020\034\032\0020\0062\006\020/\032\0020\016H\026J@\020^\032\0020\0212\006\020\031\032\0020\0062\006\020\032\032\0020\0062\006\020\033\032\0020\0062\006\020\034\032\0020\0062\006\020_\032\0020\0062\006\020`\032\0020\0062\006\020/\032\0020\016H\026J*\020a\032\0020\0212\006\020b\032\0020c2\006\020d\032\0020e2\006\020/\032\0020\016H\026ø\001\000¢\006\004\bf\020gJ\b\020h\032\0020\021H\026J\b\020i\032\0020\021H\026J\020\020j\032\0020\0212\006\020k\032\0020\006H\026J\b\020l\032\0020\021H\026J\030\020m\032\0020\0212\006\020n\032\0020o2\006\020/\032\0020\016H\026J\030\020p\032\0020\0212\006\020q\032\0020\0062\006\020r\032\0020\006H\026J\030\020s\032\0020\0212\006\020q\032\0020\0062\006\020r\032\0020\006H\026J\030\020t\032\0020\0212\006\020u\032\0020\0062\006\020v\032\0020\006H\026J\026\020w\032\0020x*\0020\025H\002ø\001\000¢\006\004\by\020zJ\026\020w\032\0020{*\0020|H\002ø\001\000¢\006\004\b}\020~J\030\020w\032\0020*\0020&H\002ø\001\000¢\006\006\b\001\020\001R\032\020\005\032\0020\006X\016¢\006\016\n\000\032\004\b\007\020\b\"\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\030\020\002\032\0020\r*\0020\0168BX\004¢\006\006\032\004\b\013\020\017\002\007\n\005\b¡\0360\001¨\006\001"}, d2 = {"Landroidx/compose/ui/graphics/SkiaBackedCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "skia", "Lorg/jetbrains/skia/Canvas;", "(Lorg/jetbrains/skia/Canvas;)V", "alphaMultiplier", "", "getAlphaMultiplier$ui_graphics", "()F", "setAlphaMultiplier$ui_graphics", "(F)V", "getSkia", "()Lorg/jetbrains/skia/Canvas;", "Lorg/jetbrains/skia/Paint;", "Landroidx/compose/ui/graphics/Paint;", "(Landroidx/compose/ui/graphics/Paint;)Lorg/jetbrains/skia/Paint;", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "left", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "clipRoundRect", "rect", "Landroidx/compose/ui/geometry/RoundRect;", "clipRoundRect-mtrdD-E", "(Landroidx/compose/ui/geometry/RoundRect;I)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstOffset", "dstSize", "drawImageRect-cI72Soc", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "drawImageRect-HPBpro0", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawLines", "points", "", "stepBy", "", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawLines", "", "drawRawPoints", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "Landroidx/compose/ui/geometry/Rect;", "scale", "sx", "sy", "skew", "translate", "dx", "dy", "toSkia", "Lorg/jetbrains/skia/ClipMode;", "toSkia--7u2Bmg", "(I)Lorg/jetbrains/skia/ClipMode;", "Lorg/jetbrains/skia/SamplingMode;", "Landroidx/compose/ui/graphics/FilterQuality;", "toSkia-vDHp3xo", "(I)Lorg/jetbrains/skia/SamplingMode;", "Lorg/jetbrains/skia/Matrix44;", "toSkia-58bKbWc", "([F)Lorg/jetbrains/skia/Matrix44;", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nSkiaBackedCanvas.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaBackedCanvas.skiko.kt\nandroidx/compose/ui/graphics/SkiaBackedCanvas\n+ 2 Managed.kt\norg/jetbrains/skia/impl/ManagedKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,407:1\n22#2,5:408\n33#3,6:413\n39#4:419\n39#4:420\n39#4:421\n39#4:422\n39#4:423\n39#4:424\n39#4:425\n39#4:426\n39#4:427\n39#4:428\n39#4:429\n39#4:430\n39#4:431\n39#4:432\n39#4:433\n39#4:434\n*S KotlinDebug\n*F\n+ 1 SkiaBackedCanvas.skiko.kt\nandroidx/compose/ui/graphics/SkiaBackedCanvas\n*L\n223#1:408,5\n264#1:413,6\n377#1:419\n378#1:420\n379#1:421\n380#1:422\n382#1:423\n383#1:424\n384#1:425\n385#1:426\n387#1:427\n388#1:428\n389#1:429\n390#1:430\n392#1:431\n393#1:432\n394#1:433\n395#1:434\n*E\n"})
/*     */ public final class SkiaBackedCanvas
/*     */   implements Canvas
/*     */ {
/*     */   @NotNull
/*     */   private final Canvas skia;
/*     */   private float alphaMultiplier;
/*     */   
/*     */   @NotNull
/*     */   public final Canvas getSkia() {
/*     */     return this.skia;
/*     */   }
/*     */   
/*     */   public SkiaBackedCanvas(@NotNull Canvas skia) {
/*  59 */     this.skia = skia;
/*  60 */     this.alphaMultiplier = 1.0F; } public final float getAlphaMultiplier$ui_graphics() { return this.alphaMultiplier; } public final void setAlphaMultiplier$ui_graphics(float <set-?>) { this.alphaMultiplier = <set-?>; }
/*     */    private final Paint getSkia(Paint $this$skia) {
/*  62 */     Intrinsics.checkNotNull($this$skia, "null cannot be cast to non-null type androidx.compose.ui.graphics.SkiaBackedPaint"); SkiaBackedPaint skiaBackedPaint1 = (SkiaBackedPaint)$this$skia, $this$_get_skia__u24lambda_u240 = skiaBackedPaint1; int $i$a$-apply-SkiaBackedCanvas$skia$1 = 0;
/*  63 */     $this$_get_skia__u24lambda_u240.setAlphaMultiplier(this.alphaMultiplier);
/*  64 */     return skiaBackedPaint1.getSkia();
/*     */   }
/*     */   public void save() {
/*  67 */     this.skia.save();
/*     */   }
/*     */   
/*     */   public void restore() {
/*  71 */     this.skia.restore();
/*     */   }
/*     */   
/*     */   public void saveLayer(@NotNull Rect bounds, @NotNull Paint paint) {
/*  75 */     Intrinsics.checkNotNullParameter(bounds, "bounds"); Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.saveLayer(
/*  76 */         bounds.getLeft(), 
/*  77 */         bounds.getTop(), 
/*  78 */         bounds.getRight(), 
/*  79 */         bounds.getBottom(), 
/*  80 */         getSkia(paint));
/*     */   }
/*     */ 
/*     */   
/*     */   public void translate(float dx, float dy) {
/*  85 */     this.skia.translate(dx, dy);
/*     */   }
/*     */   
/*     */   public void scale(float sx, float sy) {
/*  89 */     this.skia.scale(sx, sy);
/*     */   }
/*     */   
/*     */   public void rotate(float degrees) {
/*  93 */     this.skia.rotate(degrees);
/*     */   }
/*     */   
/*     */   public void skew(float sx, float sy) {
/*  97 */     this.skia.skew(sx, sy);
/*     */   }
/*     */   
/*     */   public void concat-58bKbWc(@NotNull float[] matrix) {
/* 101 */     Intrinsics.checkNotNullParameter(matrix, "matrix"); if (!MatrixKt.isIdentity-58bKbWc(matrix)) {
/* 102 */       this.skia.concat(toSkia-58bKbWc(matrix));
/*     */     }
/*     */   }
/*     */   
/*     */   public void clipRect-N_I0leg(float left, float top, float right, float bottom, int clipOp) {
/* 107 */     boolean antiAlias = true;
/* 108 */     this.skia.clipRect(Rect.Companion.makeLTRB(left, top, right, bottom), toSkia--7u2Bmg(clipOp), antiAlias);
/*     */   }
/*     */   
/*     */   public void clipPath-mtrdD-E(@NotNull Path path, int clipOp) {
/* 112 */     Intrinsics.checkNotNullParameter(path, "path"); boolean antiAlias = true;
/* 113 */     this.skia.clipPath(SkiaBackedPath_skikoKt.asSkiaPath(path), toSkia--7u2Bmg(clipOp), antiAlias);
/*     */   }
/*     */   
/*     */   public final void clipRoundRect-mtrdD-E(@NotNull RoundRect rect, int clipOp) {
/* 117 */     Intrinsics.checkNotNullParameter(rect, "rect"); boolean antiAlias = true;
/* 118 */     SkiaBackedCanvas_skikoKt.getNativeCanvas(this).clipRRect(Rects_skikoKt.toSkiaRRect(rect), toSkia--7u2Bmg(clipOp), antiAlias);
/*     */   }
/*     */   
/*     */   public void drawLine-Wko1d7g(long p1, long p2, @NotNull Paint paint) {
/* 122 */     Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.drawLine(Offset.getX-impl(p1), Offset.getY-impl(p1), Offset.getX-impl(p2), Offset.getY-impl(p2), getSkia(paint));
/*     */   }
/*     */   
/*     */   public void drawRect(float left, float top, float right, float bottom, @NotNull Paint paint) {
/* 126 */     Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.drawRect(Rect.Companion.makeLTRB(left, top, right, bottom), getSkia(paint));
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
/* 138 */     Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.drawRRect(
/* 139 */         RRect.Companion.makeLTRB(
/* 140 */           left, 
/* 141 */           top, 
/* 142 */           right, 
/* 143 */           bottom, 
/* 144 */           radiusX, 
/* 145 */           radiusY), 
/*     */         
/* 147 */         getSkia(paint));
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawOval(float left, float top, float right, float bottom, @NotNull Paint paint) {
/* 152 */     Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.drawOval(Rect.Companion.makeLTRB(left, top, right, bottom), getSkia(paint));
/*     */   }
/*     */   
/*     */   public void drawCircle-9KIMszo(long center, float radius, @NotNull Paint paint) {
/* 156 */     Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.drawCircle(Offset.getX-impl(center), Offset.getY-impl(center), radius, getSkia(paint));
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
/* 169 */     Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.drawArc(
/* 170 */         left, 
/* 171 */         top, 
/* 172 */         right, 
/* 173 */         bottom, 
/* 174 */         startAngle, 
/* 175 */         sweepAngle, 
/* 176 */         useCenter, 
/* 177 */         getSkia(paint));
/*     */   }
/*     */ 
/*     */   
/*     */   public void drawPath(@NotNull Path path, @NotNull Paint paint) {
/* 182 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(paint, "paint"); this.skia.drawPath(SkiaBackedPath_skikoKt.asSkiaPath(path), getSkia(paint));
/*     */   }
/*     */   
/*     */   public void drawImage-d-4ec7I(@NotNull ImageBitmap image, long topLeftOffset, @NotNull Paint paint) {
/* 186 */     Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(paint, "paint"); long size = SizeKt.Size(image.getWidth(), image.getHeight());
/* 187 */     drawImageRect-cI72Soc(image, Offset.Companion.getZero-F1C5BW0(), size, topLeftOffset, size, paint);
/*     */   } public void drawPoints-O7TthRY(int pointMode, @NotNull List<Offset> points, @NotNull Paint paint) { Intrinsics.checkNotNullParameter(points, "points");
/*     */     Intrinsics.checkNotNullParameter(paint, "paint");
/*     */     int i = pointMode;
/*     */     if (PointMode.equals-impl0(i, PointMode.Companion.getLines-r_lszbg())) {
/*     */       drawLines(points, paint, 2);
/*     */     } else if (PointMode.equals-impl0(i, PointMode.Companion.getPolygon-r_lszbg())) {
/*     */       drawLines(points, paint, 1);
/*     */     } else if (PointMode.equals-impl0(i, PointMode.Companion.getPoints-r_lszbg())) {
/*     */       drawPoints(points, paint);
/*     */     }  } public void drawImageRect-HPBpro0(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @NotNull Paint paint) {
/* 198 */     Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(paint, "paint"); drawImageRect-cI72Soc(
/* 199 */         image, 
/* 200 */         OffsetKt.Offset(IntOffset.getX-impl(srcOffset), IntOffset.getY-impl(srcOffset)), 
/* 201 */         SizeKt.Size(IntSize.getWidth-impl(srcSize), IntSize.getHeight-impl(srcSize)), 
/* 202 */         OffsetKt.Offset(IntOffset.getX-impl(dstOffset), IntOffset.getY-impl(dstOffset)), 
/* 203 */         SizeKt.Size(IntSize.getWidth-impl(dstSize), IntSize.getHeight-impl(dstSize)), 
/* 204 */         paint);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void enableZ() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void drawImageRect-cI72Soc(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, Paint paint) {
/* 217 */     Bitmap bitmap = SkiaImageAsset_skikoKt.asSkiaBitmap(image);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     Managed $this$use$iv = (Managed)Image.Companion.makeFromBitmap(bitmap); int $i$f$use = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 409 */     try { Image skiaImage = (Image)$this$use$iv; int $i$a$-use-SkiaBackedCanvas$drawImageRect$1 = 0; Canvas canvas = this.skia.drawImageRect(skiaImage, Rect.Companion.makeXYWH(Offset.getX-impl(srcOffset), Offset.getY-impl(srcOffset), Size.getWidth-impl(srcSize), Size.getHeight-impl(srcSize)), Rect.Companion.makeXYWH(Offset.getX-impl(dstOffset), Offset.getY-impl(dstOffset), Size.getWidth-impl(dstSize), Size.getHeight-impl(dstSize)), toSkia-vDHp3xo(paint.getFilterQuality-f-v9h1I()), getSkia(paint), true);
/*     */       
/* 411 */       $this$use$iv.close(); } finally { $this$use$iv.close(); }
/*     */      } public void disableZ() {} private final void drawPoints(List points, Paint paint) { List $this$fastForEach$iv = points;
/*     */     int $i$f$fastForEach = 0;
/* 414 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 415 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 416 */       long point = ((Offset)item$iv).unbox-impl(); int $i$a$-fastForEach-SkiaBackedCanvas$drawPoints$1 = 0;
/*     */     }  } private final Matrix44 toSkia-58bKbWc(float[] $this$toSkia_u2d58bKbWc) { float[] arrayOfFloat = new float[16]; byte b = 0;
/*     */     int column$iv = 0, $i$f$get-impl = 0;
/* 419 */     arrayOfFloat[0] = $this$toSkia_u2d58bKbWc[b * 4 + column$iv]; int row$iv = 1; column$iv = 0; $i$f$get-impl = 0;
/* 420 */     arrayOfFloat[1] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 2; column$iv = 0; $i$f$get-impl = 0;
/* 421 */     arrayOfFloat[2] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 3; column$iv = 0; $i$f$get-impl = 0;
/* 422 */     arrayOfFloat[3] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 0; column$iv = 1; $i$f$get-impl = 0;
/* 423 */     arrayOfFloat[4] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 1; column$iv = 1; $i$f$get-impl = 0;
/* 424 */     arrayOfFloat[5] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 2; column$iv = 1; $i$f$get-impl = 0;
/* 425 */     arrayOfFloat[6] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 3; column$iv = 1; $i$f$get-impl = 0;
/* 426 */     arrayOfFloat[7] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 0; column$iv = 2; $i$f$get-impl = 0;
/* 427 */     arrayOfFloat[8] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 1; column$iv = 2; $i$f$get-impl = 0;
/* 428 */     arrayOfFloat[9] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 2; column$iv = 2; $i$f$get-impl = 0;
/* 429 */     arrayOfFloat[10] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 3; column$iv = 2; $i$f$get-impl = 0;
/* 430 */     arrayOfFloat[11] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 0; column$iv = 3; $i$f$get-impl = 0;
/* 431 */     arrayOfFloat[12] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 1; column$iv = 3; $i$f$get-impl = 0;
/* 432 */     arrayOfFloat[13] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 2; column$iv = 3; $i$f$get-impl = 0;
/* 433 */     arrayOfFloat[14] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv]; row$iv = 3; column$iv = 3; $i$f$get-impl = 0;
/* 434 */     arrayOfFloat[15] = $this$toSkia_u2d58bKbWc[row$iv * 4 + column$iv];
/*     */     return new Matrix44(arrayOfFloat); }
/*     */ 
/*     */   
/*     */   private final void drawLines(List<Offset> points, Paint paint, int stepBy) {
/*     */     if (points.size() >= 2) {
/*     */       IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, points.size() - 1), stepBy);
/*     */       int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep();
/*     */       if ((k > 0 && i <= j) || (k < 0 && j <= i))
/*     */         while (true) {
/*     */           long p1 = ((Offset)points.get(i)).unbox-impl();
/*     */           long p2 = ((Offset)points.get(i + 1)).unbox-impl();
/*     */           this.skia.drawLine(Offset.getX-impl(p1), Offset.getY-impl(p1), Offset.getX-impl(p2), Offset.getY-impl(p2), getSkia(paint));
/*     */           if (i != j) {
/*     */             i += k;
/*     */             continue;
/*     */           } 
/*     */           break;
/*     */         }  
/*     */     } 
/*     */   }
/*     */   
/*     */   public void drawRawPoints-O7TthRY(int pointMode, @NotNull float[] points, @NotNull Paint paint) {
/*     */     Intrinsics.checkNotNullParameter(points, "points");
/*     */     Intrinsics.checkNotNullParameter(paint, "paint");
/*     */     if (points.length % 2 != 0)
/*     */       throw new IllegalArgumentException("points must have an even number of values"); 
/*     */     int i = pointMode;
/*     */     if (PointMode.equals-impl0(i, PointMode.Companion.getLines-r_lszbg())) {
/*     */       drawRawLines(points, paint, 2);
/*     */     } else if (PointMode.equals-impl0(i, PointMode.Companion.getPolygon-r_lszbg())) {
/*     */       drawRawLines(points, paint, 1);
/*     */     } else if (PointMode.equals-impl0(i, PointMode.Companion.getPoints-r_lszbg())) {
/*     */       drawRawPoints(points, paint, 2);
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void drawRawPoints(float[] points, Paint paint, int stepBy) {
/*     */     if (points.length % 2 == 0) {
/*     */       IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, points.length - 1), stepBy);
/*     */       int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep();
/*     */       if ((k > 0 && i <= j) || (k < 0 && j <= i))
/*     */         while (true) {
/*     */           float x = points[i];
/*     */           float y = points[i + 1];
/*     */           this.skia.drawPoint(x, y, getSkia(paint));
/*     */           if (i != j) {
/*     */             i += k;
/*     */             continue;
/*     */           } 
/*     */           break;
/*     */         }  
/*     */     } 
/*     */   }
/*     */   
/*     */   private final void drawRawLines(float[] points, Paint paint, int stepBy) {
/*     */     if (points.length >= 4 && points.length % 2 == 0) {
/*     */       IntProgression intProgression = RangesKt.step((IntProgression)RangesKt.until(0, points.length - 3), stepBy * 2);
/*     */       int i = intProgression.getFirst(), j = intProgression.getLast(), k = intProgression.getStep();
/*     */       if ((k > 0 && i <= j) || (k < 0 && j <= i))
/*     */         while (true) {
/*     */           float x1 = points[i];
/*     */           float y1 = points[i + 1];
/*     */           float x2 = points[i + 2];
/*     */           float y2 = points[i + 3];
/*     */           this.skia.drawLine(x1, y1, x2, y2, getSkia(paint));
/*     */           if (i != j) {
/*     */             i += k;
/*     */             continue;
/*     */           } 
/*     */           break;
/*     */         }  
/*     */     } 
/*     */   }
/*     */   
/*     */   public void drawVertices-TPEHhCM(@NotNull Vertices vertices, int blendMode, @NotNull Paint paint) {
/*     */     Intrinsics.checkNotNullParameter(vertices, "vertices");
/*     */     Intrinsics.checkNotNullParameter(paint, "paint");
/*     */     this.skia.drawVertices(SkiaVertexMode_skikoKt.toSkiaVertexMode-JOOmi9M(vertices.getVertexMode-c2xauaI()), vertices.getPositions(), vertices.getColors(), vertices.getTextureCoordinates(), vertices.getIndices(), BlendMode_skikoKt.toSkia-s9anfk8(blendMode), paint.asFrameworkPaint());
/*     */   }
/*     */   
/*     */   private final ClipMode toSkia--7u2Bmg(int $this$toSkia_u2d_u2d7u2Bmg) {
/*     */     int i = $this$toSkia_u2d_u2d7u2Bmg;
/*     */     return ClipOp.equals-impl0(i, ClipOp.Companion.getDifference-rtfAjoo()) ? ClipMode.DIFFERENCE : (ClipOp.equals-impl0(i, ClipOp.Companion.getIntersect-rtfAjoo()) ? ClipMode.INTERSECT : ClipMode.INTERSECT);
/*     */   }
/*     */   
/*     */   private final SamplingMode toSkia-vDHp3xo(int $this$toSkia_u2dvDHp3xo) {
/*     */     int i = $this$toSkia_u2dvDHp3xo;
/*     */     return FilterQuality.equals-impl0(i, FilterQuality.Companion.getLow-f-v9h1I()) ? (SamplingMode)new FilterMipmap(FilterMode.LINEAR, MipmapMode.NONE) : (FilterQuality.equals-impl0(i, FilterQuality.Companion.getMedium-f-v9h1I()) ? (SamplingMode)new FilterMipmap(FilterMode.LINEAR, MipmapMode.NEAREST) : (FilterQuality.equals-impl0(i, FilterQuality.Companion.getHigh-f-v9h1I()) ? (SamplingMode)new CubicResampler(0.33333334F, 0.33333334F) : (SamplingMode)new FilterMipmap(FilterMode.NEAREST, MipmapMode.NONE)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\SkiaBackedCanvas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */