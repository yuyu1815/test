/*     */ package androidx.compose.ui.geometry;
/*     */ 
/*     */ import androidx.compose.ui.util.MathHelpersKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\007\n\002\020\007\n\002\b\t\n\002\030\002\n\002\b\031\032 \020\031\032\0020\0022\006\020\032\032\0020\0012\006\020\033\032\0020\034ø\001\000¢\006\004\b\035\020\036\032@\020\031\032\0020\0022\006\020\032\032\0020\0012\b\b\002\020\037\032\0020\0342\b\b\002\020 \032\0020\0342\b\b\002\020!\032\0020\0342\b\b\002\020\"\032\0020\034ø\001\000¢\006\004\b#\020$\032\036\020\031\032\0020\0022\006\020\032\032\0020\0012\006\020%\032\0020\0222\006\020&\032\0020\022\0328\020\031\032\0020\0022\006\020'\032\0020\0222\006\020(\032\0020\0222\006\020)\032\0020\0222\006\020*\032\0020\0222\006\020\033\032\0020\034ø\001\000¢\006\004\b+\020,\0326\020\031\032\0020\0022\006\020'\032\0020\0222\006\020(\032\0020\0222\006\020)\032\0020\0222\006\020*\032\0020\0222\006\020%\032\0020\0222\006\020&\032\0020\022\032\036\020-\032\0020\0022\006\020.\032\0020\0022\006\020/\032\0020\0022\006\0200\032\0020\022\032\034\0201\032\0020\002*\0020\0022\006\0202\032\0020\006ø\001\000¢\006\004\b3\0204\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\025\020\005\032\0020\006*\0020\0028F¢\006\006\032\004\b\007\020\b\"\025\020\t\032\0020\n*\0020\0028F¢\006\006\032\004\b\t\020\013\"\025\020\f\032\0020\n*\0020\0028F¢\006\006\032\004\b\f\020\013\"\025\020\r\032\0020\n*\0020\0028F¢\006\006\032\004\b\r\020\013\"\025\020\016\032\0020\n*\0020\0028F¢\006\006\032\004\b\016\020\013\"\025\020\017\032\0020\n*\0020\0028F¢\006\006\032\004\b\017\020\013\"\025\020\020\032\0020\n*\0020\0028F¢\006\006\032\004\b\020\020\013\"\025\020\021\032\0020\022*\0020\0028F¢\006\006\032\004\b\023\020\024\"\025\020\025\032\0020\022*\0020\0028F¢\006\006\032\004\b\026\020\024\"\025\020\027\032\0020\001*\0020\0028F¢\006\006\032\004\b\030\020\004\002\007\n\005\b¡\0360\001¨\0065"}, d2 = {"boundingRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/geometry/RoundRect;", "getBoundingRect", "(Landroidx/compose/ui/geometry/RoundRect;)Landroidx/compose/ui/geometry/Rect;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter", "(Landroidx/compose/ui/geometry/RoundRect;)J", "isCircle", "", "(Landroidx/compose/ui/geometry/RoundRect;)Z", "isEllipse", "isEmpty", "isFinite", "isRect", "isSimple", "maxDimension", "", "getMaxDimension", "(Landroidx/compose/ui/geometry/RoundRect;)F", "minDimension", "getMinDimension", "safeInnerRect", "getSafeInnerRect", "RoundRect", "rect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "RoundRect-sniSvfs", "(Landroidx/compose/ui/geometry/Rect;J)Landroidx/compose/ui/geometry/RoundRect;", "topLeft", "topRight", "bottomRight", "bottomLeft", "RoundRect-ZAM2FJo", "(Landroidx/compose/ui/geometry/Rect;JJJJ)Landroidx/compose/ui/geometry/RoundRect;", "radiusX", "radiusY", "left", "top", "right", "bottom", "RoundRect-gG7oq9Y", "(FFFFJ)Landroidx/compose/ui/geometry/RoundRect;", "lerp", "start", "stop", "fraction", "translate", "offset", "translate-Uv8p0NA", "(Landroidx/compose/ui/geometry/RoundRect;J)Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry"})
/*     */ public final class RoundRectKt
/*     */ {
/*     */   @NotNull
/*     */   public static final RoundRect RoundRect(float left, float top, float right, float bottom, float radiusX, float radiusY) {
/* 224 */     long radius = CornerRadiusKt.CornerRadius(radiusX, radiusY);
/* 225 */     return new RoundRect(
/* 226 */         left, 
/* 227 */         top, 
/* 228 */         right, 
/* 229 */         bottom, 
/* 230 */         radius, 
/* 231 */         radius, 
/* 232 */         radius, 
/* 233 */         radius, null);
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
/*     */   @NotNull
/*     */   public static final RoundRect RoundRect-gG7oq9Y(float left, float top, float right, float bottom, long cornerRadius) {
/* 247 */     return RoundRect(
/* 248 */         left, 
/* 249 */         top, 
/* 250 */         right, 
/* 251 */         bottom, 
/* 252 */         CornerRadius.getX-impl(cornerRadius), 
/* 253 */         CornerRadius.getY-impl(cornerRadius));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final RoundRect RoundRect(@NotNull Rect rect, float radiusX, float radiusY) {
/* 265 */     Intrinsics.checkNotNullParameter(rect, "rect"); return RoundRect(rect.getLeft(), 
/* 266 */         rect.getTop(), 
/* 267 */         rect.getRight(), 
/* 268 */         rect.getBottom(), 
/* 269 */         radiusX, 
/* 270 */         radiusY);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final RoundRect RoundRect-sniSvfs(@NotNull Rect rect, long cornerRadius) {
/* 281 */     Intrinsics.checkNotNullParameter(rect, "rect"); return RoundRect(rect, 
/* 282 */         CornerRadius.getX-impl(cornerRadius), 
/* 283 */         CornerRadius.getY-impl(cornerRadius));
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
/*     */   @NotNull
/*     */   public static final RoundRect RoundRect-ZAM2FJo(@NotNull Rect rect, long topLeft, long topRight, long bottomRight, long bottomLeft) {
/* 298 */     Intrinsics.checkNotNullParameter(rect, "rect"); return new RoundRect(
/* 299 */         rect.getLeft(), 
/* 300 */         rect.getTop(), 
/* 301 */         rect.getRight(), 
/* 302 */         rect.getBottom(), 
/* 303 */         topLeft, 
/* 304 */         topRight, 
/* 305 */         bottomRight, 
/* 306 */         bottomLeft, null);
/*     */   }
/*     */   @NotNull
/*     */   public static final RoundRect translate-Uv8p0NA(@NotNull RoundRect $this$translate_u2dUv8p0NA, long offset) {
/* 310 */     Intrinsics.checkNotNullParameter($this$translate_u2dUv8p0NA, "$this$translate"); return new RoundRect(
/* 311 */         $this$translate_u2dUv8p0NA.getLeft() + Offset.getX-impl(offset), 
/* 312 */         $this$translate_u2dUv8p0NA.getTop() + Offset.getY-impl(offset), 
/* 313 */         $this$translate_u2dUv8p0NA.getRight() + Offset.getX-impl(offset), 
/* 314 */         $this$translate_u2dUv8p0NA.getBottom() + Offset.getY-impl(offset), 
/* 315 */         $this$translate_u2dUv8p0NA.getTopLeftCornerRadius-kKHJgLs(), 
/* 316 */         $this$translate_u2dUv8p0NA.getTopRightCornerRadius-kKHJgLs(), 
/* 317 */         $this$translate_u2dUv8p0NA.getBottomRightCornerRadius-kKHJgLs(), 
/* 318 */         $this$translate_u2dUv8p0NA.getBottomLeftCornerRadius-kKHJgLs(), null);
/*     */   }
/*     */   @NotNull
/*     */   public static final Rect getBoundingRect(@NotNull RoundRect $this$boundingRect) {
/* 322 */     Intrinsics.checkNotNullParameter($this$boundingRect, "<this>"); return new Rect($this$boundingRect.getLeft(), $this$boundingRect.getTop(), $this$boundingRect.getRight(), $this$boundingRect.getBottom());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Rect getSafeInnerRect(@NotNull RoundRect $this$safeInnerRect) {
/* 332 */     Intrinsics.checkNotNullParameter($this$safeInnerRect, "<this>"); float insetFactor = 0.29289323F;
/*     */     
/* 334 */     float leftRadius = Math.max(CornerRadius.getX-impl($this$safeInnerRect.getBottomLeftCornerRadius-kKHJgLs()), CornerRadius.getX-impl($this$safeInnerRect.getTopLeftCornerRadius-kKHJgLs()));
/* 335 */     float topRadius = Math.max(CornerRadius.getY-impl($this$safeInnerRect.getTopLeftCornerRadius-kKHJgLs()), CornerRadius.getY-impl($this$safeInnerRect.getTopRightCornerRadius-kKHJgLs()));
/* 336 */     float rightRadius = Math.max(CornerRadius.getX-impl($this$safeInnerRect.getTopRightCornerRadius-kKHJgLs()), CornerRadius.getX-impl($this$safeInnerRect.getBottomRightCornerRadius-kKHJgLs()));
/* 337 */     float bottomRadius = Math.max(CornerRadius.getY-impl($this$safeInnerRect.getBottomRightCornerRadius-kKHJgLs()), CornerRadius.getY-impl($this$safeInnerRect.getBottomLeftCornerRadius-kKHJgLs()));
/*     */     
/* 339 */     return new Rect(
/* 340 */         $this$safeInnerRect.getLeft() + leftRadius * insetFactor, 
/* 341 */         $this$safeInnerRect.getTop() + topRadius * insetFactor, 
/* 342 */         $this$safeInnerRect.getRight() - rightRadius * insetFactor, 
/* 343 */         $this$safeInnerRect.getBottom() - bottomRadius * insetFactor);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean isEmpty(@NotNull RoundRect $this$isEmpty) {
/* 351 */     Intrinsics.checkNotNullParameter($this$isEmpty, "<this>"); return ($this$isEmpty.getLeft() >= $this$isEmpty.getRight() || $this$isEmpty.getTop() >= $this$isEmpty.getBottom());
/*     */   }
/*     */   
/*     */   public static final boolean isFinite(@NotNull RoundRect $this$isFinite) {
/* 355 */     Intrinsics.checkNotNullParameter($this$isFinite, "<this>"); float f = $this$isFinite.getLeft(); if ((!Float.isInfinite(f) && !Float.isNaN(f))) { f = $this$isFinite.getTop(); if ((!Float.isInfinite(f) && !Float.isNaN(f))) { f = $this$isFinite.getRight(); if ((!Float.isInfinite(f) && !Float.isNaN(f))) { f = $this$isFinite.getBottom(); if ((!Float.isInfinite(f) && !Float.isNaN(f))); }  }  }  return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean isRect(@NotNull RoundRect $this$isRect) {
/* 362 */     Intrinsics.checkNotNullParameter($this$isRect, "<this>"); return ((((CornerRadius.getX-impl($this$isRect.getTopLeftCornerRadius-kKHJgLs()) == 0.0F)) || ((CornerRadius.getY-impl($this$isRect.getTopLeftCornerRadius-kKHJgLs()) == 0.0F))) && ((
/* 363 */       (CornerRadius.getX-impl($this$isRect.getTopRightCornerRadius-kKHJgLs()) == 0.0F)) || ((CornerRadius.getY-impl($this$isRect.getTopRightCornerRadius-kKHJgLs()) == 0.0F))) && ((
/* 364 */       (CornerRadius.getX-impl($this$isRect.getBottomLeftCornerRadius-kKHJgLs()) == 0.0F)) || ((CornerRadius.getY-impl($this$isRect.getBottomLeftCornerRadius-kKHJgLs()) == 0.0F))) && ((
/* 365 */       (CornerRadius.getX-impl($this$isRect.getBottomRightCornerRadius-kKHJgLs()) == 0.0F)) || ((CornerRadius.getY-impl($this$isRect.getBottomRightCornerRadius-kKHJgLs()) == 0.0F))));
/*     */   }
/*     */   
/*     */   public static final boolean isEllipse(@NotNull RoundRect $this$isEllipse) {
/* 369 */     Intrinsics.checkNotNullParameter($this$isEllipse, "<this>"); return (((CornerRadius.getX-impl($this$isEllipse.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$isEllipse.getTopRightCornerRadius-kKHJgLs()))) && (
/* 370 */       (CornerRadius.getY-impl($this$isEllipse.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$isEllipse.getTopRightCornerRadius-kKHJgLs()))) && (
/* 371 */       (CornerRadius.getX-impl($this$isEllipse.getTopRightCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$isEllipse.getBottomRightCornerRadius-kKHJgLs()))) && (
/* 372 */       (CornerRadius.getY-impl($this$isEllipse.getTopRightCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$isEllipse.getBottomRightCornerRadius-kKHJgLs()))) && (
/* 373 */       (CornerRadius.getX-impl($this$isEllipse.getBottomRightCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$isEllipse.getBottomLeftCornerRadius-kKHJgLs()))) && (
/* 374 */       (CornerRadius.getY-impl($this$isEllipse.getBottomRightCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$isEllipse.getBottomLeftCornerRadius-kKHJgLs()))) && 
/* 375 */       $this$isEllipse.getWidth() <= 2.0D * CornerRadius.getX-impl($this$isEllipse.getTopLeftCornerRadius-kKHJgLs()) && 
/* 376 */       $this$isEllipse.getHeight() <= 2.0D * CornerRadius.getY-impl($this$isEllipse.getTopLeftCornerRadius-kKHJgLs()));
/*     */   }
/*     */   public static final boolean isCircle(@NotNull RoundRect $this$isCircle) {
/* 379 */     Intrinsics.checkNotNullParameter($this$isCircle, "<this>"); return ((($this$isCircle.getWidth() == $this$isCircle.getHeight())) && isEllipse($this$isCircle));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float getMinDimension(@NotNull RoundRect $this$minDimension) {
/* 385 */     Intrinsics.checkNotNullParameter($this$minDimension, "<this>"); return Math.min(Math.abs($this$minDimension.getWidth()), Math.abs($this$minDimension.getHeight()));
/*     */   } public static final float getMaxDimension(@NotNull RoundRect $this$maxDimension) {
/* 387 */     Intrinsics.checkNotNullParameter($this$maxDimension, "<this>"); return Math.max(Math.abs($this$maxDimension.getWidth()), Math.abs($this$maxDimension.getHeight()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long getCenter(@NotNull RoundRect $this$center) {
/* 393 */     Intrinsics.checkNotNullParameter($this$center, "<this>"); return OffsetKt.Offset($this$center.getLeft() + $this$center.getWidth() / 2.0F, $this$center.getTop() + $this$center.getHeight() / 2.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final boolean isSimple(@NotNull RoundRect $this$isSimple) {
/* 400 */     Intrinsics.checkNotNullParameter($this$isSimple, "<this>"); return (((CornerRadius.getX-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()))) && (
/* 401 */       (CornerRadius.getX-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$isSimple.getTopRightCornerRadius-kKHJgLs()))) && (
/* 402 */       (CornerRadius.getX-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$isSimple.getTopRightCornerRadius-kKHJgLs()))) && (
/* 403 */       (CornerRadius.getX-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$isSimple.getBottomRightCornerRadius-kKHJgLs()))) && (
/* 404 */       (CornerRadius.getX-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$isSimple.getBottomRightCornerRadius-kKHJgLs()))) && (
/* 405 */       (CornerRadius.getX-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getX-impl($this$isSimple.getBottomLeftCornerRadius-kKHJgLs()))) && (
/* 406 */       (CornerRadius.getX-impl($this$isSimple.getTopLeftCornerRadius-kKHJgLs()) == CornerRadius.getY-impl($this$isSimple.getBottomLeftCornerRadius-kKHJgLs()))));
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
/*     */   @NotNull
/*     */   public static final RoundRect lerp(@NotNull RoundRect start, @NotNull RoundRect stop, float fraction) {
/* 424 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); return new RoundRect(
/* 425 */         MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), fraction), 
/* 426 */         MathHelpersKt.lerp(start.getTop(), stop.getTop(), fraction), 
/* 427 */         MathHelpersKt.lerp(start.getRight(), stop.getRight(), fraction), 
/* 428 */         MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), fraction), 
/* 429 */         CornerRadiusKt.lerp-3Ry4LBc(
/* 430 */           start.getTopLeftCornerRadius-kKHJgLs(), 
/* 431 */           stop.getTopLeftCornerRadius-kKHJgLs(), 
/* 432 */           fraction), 
/*     */         
/* 434 */         CornerRadiusKt.lerp-3Ry4LBc(
/* 435 */           start.getTopRightCornerRadius-kKHJgLs(), 
/* 436 */           stop.getTopRightCornerRadius-kKHJgLs(), 
/* 437 */           fraction), 
/*     */         
/* 439 */         CornerRadiusKt.lerp-3Ry4LBc(
/* 440 */           start.getBottomRightCornerRadius-kKHJgLs(), 
/* 441 */           stop.getBottomRightCornerRadius-kKHJgLs(), 
/* 442 */           fraction), 
/*     */         
/* 444 */         CornerRadiusKt.lerp-3Ry4LBc(
/* 445 */           start.getBottomLeftCornerRadius-kKHJgLs(), 
/* 446 */           stop.getBottomLeftCornerRadius-kKHJgLs(), 
/* 447 */           fraction), null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-geometry-desktop-1.7.3.jar!\androidx\compos\\ui\geometry\RoundRectKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */