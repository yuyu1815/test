/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import androidx.annotation.FloatRange;
/*     */ import androidx.compose.ui.geometry.CornerRadius;
/*     */ import androidx.compose.ui.geometry.CornerRadiusKt;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.geometry.RoundRect;
/*     */ import androidx.compose.ui.geometry.SizeKt;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.graphics.drawscope.Fill;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000|\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\032\022\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004\032\032\020\005\032\0020\001*\0020\0062\006\020\003\032\0020\0042\006\020\007\032\0020\b\032N\020\005\032\0020\001*\0020\t2\006\020\003\032\0020\0042\006\020\n\032\0020\0132\b\b\003\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\n\b\002\020\020\032\004\030\0010\0212\b\b\002\020\022\032\0020\023ø\001\000¢\006\004\b\024\020\025\032N\020\005\032\0020\001*\0020\t2\006\020\003\032\0020\0042\006\020\026\032\0020\0272\b\b\003\020\f\032\0020\r2\b\b\002\020\016\032\0020\0172\n\b\002\020\020\032\004\030\0010\0212\b\b\002\020\022\032\0020\023ø\001\000¢\006\004\b\030\020\031\032\001\020\032\032\0020\001*\0020\t2\006\020\003\032\0020\0042,\020\033\032(\022\004\022\0020\t\022\023\022\0210\035¢\006\f\b\036\022\b\b\037\022\004\b\b( \022\004\022\0020\0010\034¢\006\002\b!2,\020\"\032(\022\004\022\0020\t\022\023\022\0210#¢\006\f\b\036\022\b\b\037\022\004\b\b($\022\004\022\0020\0010\034¢\006\002\b!2,\020%\032(\022\004\022\0020\t\022\023\022\0210\002¢\006\f\b\036\022\b\b\037\022\004\b\b(&\022\004\022\0020\0010\034¢\006\002\b!H\b\032\f\020'\032\0020(*\0020#H\002\032\021\020)\032\0020**\0020\035H\002¢\006\002\020+\032\021\020)\032\0020**\0020#H\002¢\006\002\020,\032\021\020-\032\0020.*\0020\035H\002¢\006\002\020+\032\021\020-\032\0020.*\0020#H\002¢\006\002\020,\002\007\n\005\b¡\0360\001¨\006/"}, d2 = {"addOutline", "", "Landroidx/compose/ui/graphics/Path;", "outline", "Landroidx/compose/ui/graphics/Outline;", "drawOutline", "Landroidx/compose/ui/graphics/Canvas;", "paint", "Landroidx/compose/ui/graphics/Paint;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawOutline-hn5TExg", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawOutline-wDX37Ww", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Outline;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOutlineHelper", "drawRectBlock", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "rect", "Lkotlin/ExtensionFunctionType;", "drawRoundedRectBlock", "Landroidx/compose/ui/geometry/RoundRect;", "rrect", "drawPathBlock", "path", "hasSameCornerRadius", "", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Rect;)J", "(Landroidx/compose/ui/geometry/RoundRect;)J", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,297:1\n235#1,16:298\n235#1,16:314\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n146#1:298,16\n185#1:314,16\n*E\n"})
/*     */ public final class OutlineKt
/*     */ {
/*     */   public static final void addOutline(@NotNull Path $this$addOutline, @NotNull Outline outline) {
/* 122 */     Intrinsics.checkNotNullParameter($this$addOutline, "<this>"); Intrinsics.checkNotNullParameter(outline, "outline"); Outline outline1 = outline;
/* 123 */     if (outline1 instanceof Outline.Rectangle) { Path.addRect$default($this$addOutline, ((Outline.Rectangle)outline).getRect(), null, 2, null); }
/* 124 */     else if (outline1 instanceof Outline.Rounded) { Path.addRoundRect$default($this$addOutline, ((Outline.Rounded)outline).getRoundRect(), null, 2, null); }
/* 125 */     else if (outline1 instanceof Outline.Generic) { Path.addPath-Uv8p0NA$default($this$addOutline, ((Outline.Generic)outline).getPath(), 0L, 2, null); } else { throw new NoWhenBranchMatchedException(); }
/*     */   
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
/*     */   public static final void drawOutline-wDX37Ww(@NotNull DrawScope $this$drawOutline_u2dwDX37Ww, @NotNull Outline outline, long color, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 146 */     Intrinsics.checkNotNullParameter($this$drawOutline_u2dwDX37Ww, "$this$drawOutline"); Intrinsics.checkNotNullParameter(outline, "outline"); Intrinsics.checkNotNullParameter(style, "style"); DrawScope $this$drawOutlineHelper$iv = $this$drawOutline_u2dwDX37Ww; int $i$f$drawOutlineHelper = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 298 */     Outline outline1 = outline;
/* 299 */     if (outline1 instanceof Outline.Rectangle) { Rect rect = ((Outline.Rectangle)outline).getRect(); DrawScope $this$drawOutline_wDX37Ww_u24lambda_u240 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$1 = 0; $this$drawOutline_wDX37Ww_u24lambda_u240.drawRect-n-J9OG0(color, topLeft(rect), size(rect), alpha, style, colorFilter, blendMode); }
/* 300 */      if (outline1 instanceof Outline.Rounded) {
/* 301 */       Path path$iv = ((Outline.Rounded)outline).getRoundRectPath$ui_graphics();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 306 */       if (path$iv != null) {
/* 307 */         Path path = path$iv; DrawScope $this$drawOutline_wDX37Ww_u24lambda_u242 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$3 = 0; $this$drawOutline_wDX37Ww_u24lambda_u242.drawPath-LG529CI(path, color, alpha, style, colorFilter, blendMode);
/*     */       } 
/* 309 */       RoundRect roundRect = ((Outline.Rounded)outline).getRoundRect(); DrawScope $this$drawOutline_wDX37Ww_u24lambda_u241 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$2 = 0; float radius = CornerRadius.getX-impl(roundRect.getBottomLeftCornerRadius-kKHJgLs()); long l1 = topLeft(roundRect); long l2 = size(roundRect);
/*     */       long l3 = CornerRadiusKt.CornerRadius$default(radius, 0.0F, 2, null);
/*     */     } 
/* 312 */     if (outline1 instanceof Outline.Generic) { Path path = ((Outline.Generic)outline).getPath(); DrawScope $this$drawOutline_wDX37Ww_u24lambda_u242 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$3 = 0; $this$drawOutline_wDX37Ww_u24lambda_u242.drawPath-LG529CI(path, color, alpha, style, colorFilter, blendMode); }  throw new NoWhenBranchMatchedException(); } public static final void drawOutline-hn5TExg(@NotNull DrawScope $this$drawOutline_u2dhn5TExg, @NotNull Outline outline, @NotNull Brush brush, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) { Intrinsics.checkNotNullParameter($this$drawOutline_u2dhn5TExg, "$this$drawOutline"); Intrinsics.checkNotNullParameter(outline, "outline"); Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(style, "style"); DrawScope $this$drawOutlineHelper$iv = $this$drawOutline_u2dhn5TExg;
/*     */     int $i$f$drawOutlineHelper = 0;
/* 314 */     Outline outline1 = outline;
/* 315 */     if (outline1 instanceof Outline.Rectangle) { Rect rect = ((Outline.Rectangle)outline).getRect(); DrawScope $this$drawOutline_hn5TExg_u24lambda_u243 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$4 = 0; $this$drawOutline_hn5TExg_u24lambda_u243.drawRect-AsUm42w(brush, topLeft(rect), size(rect), alpha, style, colorFilter, blendMode); }
/* 316 */      if (outline1 instanceof Outline.Rounded) {
/* 317 */       Path path$iv = ((Outline.Rounded)outline).getRoundRectPath$ui_graphics();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 322 */       if (path$iv != null) {
/* 323 */         Path path = path$iv; DrawScope $this$drawOutline_hn5TExg_u24lambda_u245 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$6 = 0; $this$drawOutline_hn5TExg_u24lambda_u245.drawPath-GBMwjPU(path, brush, alpha, style, colorFilter, blendMode);
/*     */       } 
/* 325 */       RoundRect roundRect = ((Outline.Rounded)outline).getRoundRect(); DrawScope $this$drawOutline_hn5TExg_u24lambda_u244 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$5 = 0;
/*     */       float radius = CornerRadius.getX-impl(roundRect.getBottomLeftCornerRadius-kKHJgLs());
/*     */     } 
/* 328 */     if (outline1 instanceof Outline.Generic) { Path path = ((Outline.Generic)outline).getPath(); DrawScope $this$drawOutline_hn5TExg_u24lambda_u245 = $this$drawOutlineHelper$iv; int $i$a$-drawOutlineHelper-OutlineKt$drawOutline$6 = 0; $this$drawOutline_hn5TExg_u24lambda_u245.drawPath-GBMwjPU(path, brush, alpha, style, colorFilter, blendMode); }  throw new NoWhenBranchMatchedException(); }
/*     */ 
/*     */   
/*     */   private static final long topLeft(Rect $this$topLeft) {
/*     */     return OffsetKt.Offset($this$topLeft.getLeft(), $this$topLeft.getTop());
/*     */   }
/*     */   
/*     */   private static final long size(Rect $this$size) {
/*     */     return SizeKt.Size($this$size.getWidth(), $this$size.getHeight());
/*     */   }
/*     */   
/*     */   private static final long topLeft(RoundRect $this$topLeft) {
/*     */     return OffsetKt.Offset($this$topLeft.getLeft(), $this$topLeft.getTop());
/*     */   }
/*     */   
/*     */   private static final long size(RoundRect $this$size) {
/*     */     return SizeKt.Size($this$size.getWidth(), $this$size.getHeight());
/*     */   }
/*     */   
/*     */   private static final void drawOutlineHelper(DrawScope $this$drawOutlineHelper, Outline outline, Function2 drawRectBlock, Function2 drawRoundedRectBlock, Function2 drawPathBlock) {
/*     */     int $i$f$drawOutlineHelper = 0;
/*     */     Outline outline1 = outline;
/*     */     if (outline1 instanceof Outline.Rectangle) {
/*     */       drawRectBlock.invoke($this$drawOutlineHelper, ((Outline.Rectangle)outline).getRect());
/*     */     } else if (outline1 instanceof Outline.Rounded) {
/*     */       Path path = ((Outline.Rounded)outline).getRoundRectPath$ui_graphics();
/*     */       if (path != null) {
/*     */         drawPathBlock.invoke($this$drawOutlineHelper, path);
/*     */       } else {
/*     */         drawRoundedRectBlock.invoke($this$drawOutlineHelper, ((Outline.Rounded)outline).getRoundRect());
/*     */       } 
/*     */     } else if (outline1 instanceof Outline.Generic) {
/*     */       drawPathBlock.invoke($this$drawOutlineHelper, ((Outline.Generic)outline).getPath());
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static final void drawOutline(@NotNull Canvas $this$drawOutline, @NotNull Outline outline, @NotNull Paint paint) {
/*     */     Intrinsics.checkNotNullParameter($this$drawOutline, "<this>");
/*     */     Intrinsics.checkNotNullParameter(outline, "outline");
/*     */     Intrinsics.checkNotNullParameter(paint, "paint");
/*     */     Outline outline1 = outline;
/*     */     if (outline1 instanceof Outline.Rectangle) {
/*     */       $this$drawOutline.drawRect(((Outline.Rectangle)outline).getRect(), paint);
/*     */     } else if (outline1 instanceof Outline.Rounded) {
/*     */       Path path = ((Outline.Rounded)outline).getRoundRectPath$ui_graphics();
/*     */       if (path != null) {
/*     */         $this$drawOutline.drawPath(path, paint);
/*     */       } else {
/*     */         $this$drawOutline.drawRoundRect(((Outline.Rounded)outline).getRoundRect().getLeft(), ((Outline.Rounded)outline).getRoundRect().getTop(), ((Outline.Rounded)outline).getRoundRect().getRight(), ((Outline.Rounded)outline).getRoundRect().getBottom(), CornerRadius.getX-impl(((Outline.Rounded)outline).getRoundRect().getBottomLeftCornerRadius-kKHJgLs()), CornerRadius.getY-impl(((Outline.Rounded)outline).getRoundRect().getBottomLeftCornerRadius-kKHJgLs()), paint);
/*     */       } 
/*     */     } else if (outline1 instanceof Outline.Generic) {
/*     */       $this$drawOutline.drawPath(((Outline.Generic)outline).getPath(), paint);
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final boolean hasSameCornerRadius(RoundRect $this$hasSameCornerRadius) {
/*     */     boolean sameRadiusX = (((CornerRadius.getX-impl($this$hasSameCornerRadius.getBottomLeftCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$hasSameCornerRadius.getBottomRightCornerRadius-kKHJgLs()))) && ((CornerRadius.getX-impl($this$hasSameCornerRadius.getBottomRightCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$hasSameCornerRadius.getTopRightCornerRadius-kKHJgLs()))) && ((CornerRadius.getX-impl($this$hasSameCornerRadius.getTopRightCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$hasSameCornerRadius.getTopLeftCornerRadius-kKHJgLs()))));
/*     */     boolean sameRadiusY = (((CornerRadius.getY-impl($this$hasSameCornerRadius.getBottomLeftCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$hasSameCornerRadius.getBottomRightCornerRadius-kKHJgLs()))) && ((CornerRadius.getY-impl($this$hasSameCornerRadius.getBottomRightCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$hasSameCornerRadius.getTopRightCornerRadius-kKHJgLs()))) && ((CornerRadius.getY-impl($this$hasSameCornerRadius.getTopRightCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$hasSameCornerRadius.getTopLeftCornerRadius-kKHJgLs()))));
/*     */     return (sameRadiusX && sameRadiusY);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\OutlineKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */