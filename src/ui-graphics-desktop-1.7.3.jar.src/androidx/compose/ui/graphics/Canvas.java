/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.unit.IntOffset;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\007\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020\024\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\024\bf\030\0002\0020\001J$\020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H&ø\001\000¢\006\004\b\b\020\tJ$\020\n\032\0020\0032\006\020\013\032\0020\f2\b\b\002\020\006\032\0020\007H\026ø\001\000¢\006\004\b\r\020\016J<\020\n\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\020\022\032\0020\0202\006\020\023\032\0020\0202\b\b\002\020\006\032\0020\007H&ø\001\000¢\006\004\b\024\020\025J\032\020\026\032\0020\0032\006\020\027\032\0020\030H&ø\001\000¢\006\004\b\031\020\032J\b\020\033\032\0020\003H&J0\020\034\032\0020\0032\006\020\013\032\0020\f2\006\020\035\032\0020\0202\006\020\036\032\0020\0202\006\020\037\032\0020 2\006\020!\032\0020\"H\026JH\020\034\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\020\022\032\0020\0202\006\020\023\032\0020\0202\006\020\035\032\0020\0202\006\020\036\032\0020\0202\006\020\037\032\0020 2\006\020!\032\0020\"H&J0\020#\032\0020\0032\006\020\013\032\0020\f2\006\020$\032\0020\0202\006\020%\032\0020\0202\006\020\037\032\0020 2\006\020!\032\0020\"H\026J*\020&\032\0020\0032\006\020'\032\0020(2\006\020)\032\0020\0202\006\020!\032\0020\"H&ø\001\000¢\006\004\b*\020+J*\020,\032\0020\0032\006\020-\032\0020.2\006\020/\032\0020(2\006\020!\032\0020\"H&ø\001\000¢\006\004\b0\0201JJ\0202\032\0020\0032\006\020-\032\0020.2\b\b\002\0203\032\002042\b\b\002\0205\032\002062\b\b\002\0207\032\002042\b\b\002\0208\032\002062\006\020!\032\0020\"H&ø\001\000¢\006\004\b9\020:J*\020;\032\0020\0032\006\020<\032\0020(2\006\020=\032\0020(2\006\020!\032\0020\"H&ø\001\000¢\006\004\b>\020?J\030\020@\032\0020\0032\006\020\013\032\0020\f2\006\020!\032\0020\"H\026J0\020@\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\020\022\032\0020\0202\006\020\023\032\0020\0202\006\020!\032\0020\"H&J\030\020A\032\0020\0032\006\020\004\032\0020\0052\006\020!\032\0020\"H&J0\020B\032\0020\0032\006\020C\032\0020D2\f\020E\032\b\022\004\022\0020(0F2\006\020!\032\0020\"H&ø\001\000¢\006\004\bG\020HJ*\020I\032\0020\0032\006\020C\032\0020D2\006\020E\032\0020J2\006\020!\032\0020\"H&ø\001\000¢\006\004\bK\020LJ\030\020M\032\0020\0032\006\020\013\032\0020\f2\006\020!\032\0020\"H\026J0\020M\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\020\022\032\0020\0202\006\020\023\032\0020\0202\006\020!\032\0020\"H&J@\020N\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\020\022\032\0020\0202\006\020\023\032\0020\0202\006\020O\032\0020\0202\006\020P\032\0020\0202\006\020!\032\0020\"H&J*\020Q\032\0020\0032\006\020R\032\0020S2\006\020T\032\0020U2\006\020!\032\0020\"H&ø\001\000¢\006\004\bV\020WJ\b\020X\032\0020\003H&J\b\020Y\032\0020\003H&J\020\020Z\032\0020\0032\006\020[\032\0020\020H&J\b\020\\\032\0020\003H&J\030\020]\032\0020\0032\006\020^\032\0020\f2\006\020!\032\0020\"H&J\032\020_\032\0020\0032\006\020`\032\0020\0202\b\b\002\020a\032\0020\020H&J\030\020b\032\0020\0032\006\020`\032\0020\0202\006\020a\032\0020\020H&J\030\020c\032\0020\0032\006\020d\032\0020\0202\006\020e\032\0020\020H\026J\030\020f\032\0020\0032\006\020g\032\0020\0202\006\020h\032\0020\020H&ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006iÀ\006\003"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "", "clipPath", "", "path", "Landroidx/compose/ui/graphics/Path;", "clipOp", "Landroidx/compose/ui/graphics/ClipOp;", "clipPath-mtrdD-E", "(Landroidx/compose/ui/graphics/Path;I)V", "clipRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "clipRect-mtrdD-E", "(Landroidx/compose/ui/geometry/Rect;I)V", "left", "", "top", "right", "bottom", "clipRect-N_I0leg", "(FFFFI)V", "concat", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "concat-58bKbWc", "([F)V", "disableZ", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "paint", "Landroidx/compose/ui/graphics/Paint;", "drawArcRad", "startAngleRad", "sweepAngleRad", "drawCircle", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "drawCircle-9KIMszo", "(JFLandroidx/compose/ui/graphics/Paint;)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "topLeftOffset", "drawImage-d-4ec7I", "(Landroidx/compose/ui/graphics/ImageBitmap;JLandroidx/compose/ui/graphics/Paint;)V", "drawImageRect", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImageRect-HPBpro0", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJLandroidx/compose/ui/graphics/Paint;)V", "drawLine", "p1", "p2", "drawLine-Wko1d7g", "(JJLandroidx/compose/ui/graphics/Paint;)V", "drawOval", "drawPath", "drawPoints", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "points", "", "drawPoints-O7TthRY", "(ILjava/util/List;Landroidx/compose/ui/graphics/Paint;)V", "drawRawPoints", "", "drawRawPoints-O7TthRY", "(I[FLandroidx/compose/ui/graphics/Paint;)V", "drawRect", "drawRoundRect", "radiusX", "radiusY", "drawVertices", "vertices", "Landroidx/compose/ui/graphics/Vertices;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawVertices-TPEHhCM", "(Landroidx/compose/ui/graphics/Vertices;ILandroidx/compose/ui/graphics/Paint;)V", "enableZ", "restore", "rotate", "degrees", "save", "saveLayer", "bounds", "scale", "sx", "sy", "skew", "skewRad", "sxRad", "syRad", "translate", "dx", "dy", "ui-graphics"})
/*     */ public interface Canvas
/*     */ {
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   public static final class DefaultImpls
/*     */   {
/*     */     @Deprecated
/*     */     public static void skewRad(@NotNull Canvas $this, float sxRad, float syRad) {
/* 300 */       $this.skewRad(sxRad, syRad);
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
/*     */     @Deprecated
/*     */     public static void clipRect-mtrdD-E(@NotNull Canvas $this, @NotNull Rect rect, int clipOp) {
/* 318 */       Intrinsics.checkNotNullParameter(rect, "rect"); $this.clipRect-mtrdD-E(rect, clipOp);
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
/*     */     @Deprecated
/*     */     public static void drawRect(@NotNull Canvas $this, @NotNull Rect rect, @NotNull Paint paint) {
/* 360 */       Intrinsics.checkNotNullParameter(rect, "rect"); Intrinsics.checkNotNullParameter(paint, "paint"); $this.drawRect(rect, paint);
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
/*     */     @Deprecated
/*     */     public static void drawOval(@NotNull Canvas $this, @NotNull Rect rect, @NotNull Paint paint) {
/* 405 */       Intrinsics.checkNotNullParameter(rect, "rect"); Intrinsics.checkNotNullParameter(paint, "paint"); $this.drawOval(rect, paint);
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
/*     */     @Deprecated
/*     */     public static void drawArc(@NotNull Canvas $this, @NotNull Rect rect, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
/* 446 */       Intrinsics.checkNotNullParameter(rect, "rect"); Intrinsics.checkNotNullParameter(paint, "paint"); $this.drawArc(rect, startAngle, sweepAngle, useCenter, paint);
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
/*     */     @Deprecated
/*     */     public static void drawArcRad(@NotNull Canvas $this, @NotNull Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, @NotNull Paint paint) {
/* 508 */       Intrinsics.checkNotNullParameter(rect, "rect"); Intrinsics.checkNotNullParameter(paint, "paint"); $this.drawArcRad(rect, startAngleRad, sweepAngleRad, useCenter, paint);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   default void drawArcRad(@NotNull Rect rect, float startAngleRad, float sweepAngleRad, boolean useCenter, @NotNull Paint paint) {
/* 515 */     Intrinsics.checkNotNullParameter(rect, "rect"); Intrinsics.checkNotNullParameter(paint, "paint"); drawArc(rect, DegreesKt.degrees(startAngleRad), DegreesKt.degrees(sweepAngleRad), useCenter, paint);
/*     */   }
/*     */   
/*     */   default void skewRad(float sxRad, float syRad) {
/*     */     skew(DegreesKt.degrees(sxRad), DegreesKt.degrees(syRad));
/*     */   }
/*     */   
/*     */   default void clipRect-mtrdD-E(@NotNull Rect rect, int clipOp) {
/*     */     Intrinsics.checkNotNullParameter(rect, "rect");
/*     */     clipRect-N_I0leg(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), clipOp);
/*     */   }
/*     */   
/*     */   default void drawRect(@NotNull Rect rect, @NotNull Paint paint) {
/*     */     Intrinsics.checkNotNullParameter(rect, "rect");
/*     */     Intrinsics.checkNotNullParameter(paint, "paint");
/*     */     drawRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
/*     */   }
/*     */   
/*     */   default void drawOval(@NotNull Rect rect, @NotNull Paint paint) {
/*     */     Intrinsics.checkNotNullParameter(rect, "rect");
/*     */     Intrinsics.checkNotNullParameter(paint, "paint");
/*     */     drawOval(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), paint);
/*     */   }
/*     */   
/*     */   default void drawArc(@NotNull Rect rect, float startAngle, float sweepAngle, boolean useCenter, @NotNull Paint paint) {
/*     */     Intrinsics.checkNotNullParameter(rect, "rect");
/*     */     Intrinsics.checkNotNullParameter(paint, "paint");
/*     */     drawArc(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), startAngle, sweepAngle, useCenter, paint);
/*     */   }
/*     */   
/*     */   void save();
/*     */   
/*     */   void restore();
/*     */   
/*     */   void saveLayer(@NotNull Rect paramRect, @NotNull Paint paramPaint);
/*     */   
/*     */   void translate(float paramFloat1, float paramFloat2);
/*     */   
/*     */   void scale(float paramFloat1, float paramFloat2);
/*     */   
/*     */   void rotate(float paramFloat);
/*     */   
/*     */   void skew(float paramFloat1, float paramFloat2);
/*     */   
/*     */   void concat-58bKbWc(@NotNull float[] paramArrayOffloat);
/*     */   
/*     */   void clipRect-N_I0leg(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt);
/*     */   
/*     */   void clipPath-mtrdD-E(@NotNull Path paramPath, int paramInt);
/*     */   
/*     */   void drawLine-Wko1d7g(long paramLong1, long paramLong2, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawRect(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawRoundRect(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawOval(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawCircle-9KIMszo(long paramLong, float paramFloat, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawArc(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawPath(@NotNull Path paramPath, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawImage-d-4ec7I(@NotNull ImageBitmap paramImageBitmap, long paramLong, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawImageRect-HPBpro0(@NotNull ImageBitmap paramImageBitmap, long paramLong1, long paramLong2, long paramLong3, long paramLong4, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawPoints-O7TthRY(int paramInt, @NotNull List<Offset> paramList, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawRawPoints-O7TthRY(int paramInt, @NotNull float[] paramArrayOffloat, @NotNull Paint paramPaint);
/*     */   
/*     */   void drawVertices-TPEHhCM(@NotNull Vertices paramVertices, int paramInt, @NotNull Paint paramPaint);
/*     */   
/*     */   void enableZ();
/*     */   
/*     */   void disableZ();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Canvas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */