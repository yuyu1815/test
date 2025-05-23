/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.util.MathHelpersKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\006\n\002\020\007\n\000\n\002\030\002\n\002\b\002\032\"\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\007ø\001\000¢\006\004\b\005\020\006\032\"\020\000\032\0020\0012\006\020\007\032\0020\0032\006\020\b\032\0020\tH\007ø\001\000¢\006\004\b\n\020\006\032\"\020\000\032\0020\0012\006\020\013\032\0020\0032\006\020\f\032\0020\rH\007ø\001\000¢\006\004\b\016\020\017\032 \020\020\032\0020\0012\006\020\021\032\0020\0012\006\020\022\032\0020\0012\006\020\023\032\0020\024H\007\032\f\020\025\032\0020\001*\0020\026H\007\032\f\020\027\032\0020\026*\0020\001H\007\002\007\n\005\b¡\0360\001¨\006\030"}, d2 = {"IntRect", "Landroidx/compose/ui/unit/IntRect;", "topLeft", "Landroidx/compose/ui/unit/IntOffset;", "bottomRight", "IntRect-E1MhUcY", "(JJ)Landroidx/compose/ui/unit/IntRect;", "offset", "size", "Landroidx/compose/ui/unit/IntSize;", "IntRect-VbeCjmY", "center", "radius", "", "IntRect-ar5cAso", "(JI)Landroidx/compose/ui/unit/IntRect;", "lerp", "start", "stop", "fraction", "", "roundToIntRect", "Landroidx/compose/ui/geometry/Rect;", "toRect", "ui-unit"})
/*     */ @SourceDebugExtension({"SMAP\nIntRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,335:1\n26#2:336\n26#2:337\n26#2:338\n26#2:339\n*S KotlinDebug\n*F\n+ 1 IntRect.kt\nandroidx/compose/ui/unit/IntRectKt\n*L\n330#1:336\n331#1:337\n332#1:338\n333#1:339\n*E\n"})
/*     */ public final class IntRectKt
/*     */ {
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final IntRect IntRect-VbeCjmY(long offset, long size) {
/* 253 */     return new IntRect(
/* 254 */         IntOffset.getX-impl(offset), 
/* 255 */         IntOffset.getY-impl(offset), 
/* 256 */         IntOffset.getX-impl(offset) + IntSize.getWidth-impl(size), 
/* 257 */         IntOffset.getY-impl(offset) + IntSize.getHeight-impl(size));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final IntRect IntRect-E1MhUcY(long topLeft, long bottomRight) {
/* 268 */     return new IntRect(
/* 269 */         IntOffset.getX-impl(topLeft), 
/* 270 */         IntOffset.getY-impl(topLeft), 
/* 271 */         IntOffset.getX-impl(bottomRight), 
/* 272 */         IntOffset.getY-impl(bottomRight));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final IntRect IntRect-ar5cAso(long center, int radius) {
/* 282 */     return new IntRect(
/* 283 */         IntOffset.getX-impl(center) - radius, 
/* 284 */         IntOffset.getY-impl(center) - radius, 
/* 285 */         IntOffset.getX-impl(center) + radius, 
/* 286 */         IntOffset.getY-impl(center) + radius);
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
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final IntRect lerp(@NotNull IntRect start, @NotNull IntRect stop, float fraction) {
/* 306 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); return new IntRect(
/* 307 */         MathHelpersKt.lerp(start.getLeft(), stop.getLeft(), fraction), 
/* 308 */         MathHelpersKt.lerp(start.getTop(), stop.getTop(), fraction), 
/* 309 */         MathHelpersKt.lerp(start.getRight(), stop.getRight(), fraction), 
/* 310 */         MathHelpersKt.lerp(start.getBottom(), stop.getBottom(), fraction));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final Rect toRect(@NotNull IntRect $this$toRect) {
/* 318 */     Intrinsics.checkNotNullParameter($this$toRect, "<this>"); return new Rect(
/* 319 */         $this$toRect.getLeft(), 
/* 320 */         $this$toRect.getTop(), 
/* 321 */         $this$toRect.getRight(), 
/* 322 */         $this$toRect.getBottom());
/*     */   }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final IntRect roundToIntRect(@NotNull Rect $this$roundToIntRect) {
/* 329 */     Intrinsics.checkNotNullParameter($this$roundToIntRect, "<this>");
/* 330 */     float $this$fastRoundToInt$iv = $this$roundToIntRect.getLeft(); int $i$f$fastRoundToInt = 0;
/* 331 */     $this$fastRoundToInt$iv = $this$roundToIntRect.getTop(); $i$f$fastRoundToInt = 0;
/* 332 */     $this$fastRoundToInt$iv = $this$roundToIntRect.getRight(); $i$f$fastRoundToInt = 0;
/* 333 */     $this$fastRoundToInt$iv = $this$roundToIntRect.getBottom(); $i$f$fastRoundToInt = 0;
/*     */ 
/*     */     
/* 336 */     return new IntRect(Math.round($this$fastRoundToInt$iv), 
/* 337 */         Math.round($this$fastRoundToInt$iv), 
/* 338 */         Math.round($this$fastRoundToInt$iv), 
/* 339 */         Math.round($this$fastRoundToInt$iv));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\IntRectKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */