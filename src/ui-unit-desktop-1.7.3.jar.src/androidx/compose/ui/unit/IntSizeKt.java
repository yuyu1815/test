/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\007\032\035\020\007\032\0020\0022\006\020\b\032\0020\t2\006\020\n\032\0020\tH\007¢\006\002\020\013\032\026\020\f\032\0020\002*\0020\rH\007ø\001\000¢\006\004\b\016\020\006\032\037\020\017\032\0020\002*\0020\t2\006\020\020\032\0020\002H\nø\001\000¢\006\004\b\021\020\022\032\026\020\023\032\0020\024*\0020\002H\007ø\001\000¢\006\004\b\025\020\026\032\026\020\027\032\0020\002*\0020\rH\007ø\001\000¢\006\004\b\030\020\006\032\026\020\031\032\0020\r*\0020\002H\007ø\001\000¢\006\004\b\032\020\006\"\036\020\000\032\0020\001*\0020\0028FX\004¢\006\f\022\004\b\003\020\004\032\004\b\005\020\006\002\007\n\005\b¡\0360\001¨\006\033"}, d2 = {"center", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/ui/unit/IntSize;", "getCenter-ozmzZPI$annotations", "(J)V", "getCenter-ozmzZPI", "(J)J", "IntSize", "width", "", "height", "(II)J", "roundToIntSize", "Landroidx/compose/ui/geometry/Size;", "roundToIntSize-uvyYCjk", "times", "size", "times-O0kMr_c", "(IJ)J", "toIntRect", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toIntSize", "toIntSize-uvyYCjk", "toSize", "toSize-ozmzZPI", "ui-unit"})
/*     */ @SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,146:1\n100#2:147\n100#2:148\n100#2:151\n26#3:149\n26#3:150\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n33#1:147\n133#1:148\n141#1:151\n142#1:149\n143#1:150\n*E\n"})
/*     */ public final class IntSizeKt {
/*     */   @Stable
/*     */   public static final long times-O0kMr_c(int $this$times_u2dO0kMr_c, long size) {
/*     */     int $i$f$times-O0kMr_c = 0;
/*     */     return IntSize.times-YEO4UFw(size, $this$times_u2dO0kMr_c);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final IntRect toIntRect-ozmzZPI(long $this$toIntRect_u2dozmzZPI) {
/*     */     return IntRectKt.IntRect-VbeCjmY(IntOffset.Companion.getZero-nOcc-ac(), $this$toIntRect_u2dozmzZPI);
/*     */   }
/*     */   
/*     */   public static final long getCenter-ozmzZPI(long $this$center) {
/*     */     return IntOffset.constructor-impl($this$center >> 33L << 32L | $this$center << 32L >> 33L & 0xFFFFFFFFL);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long toSize-ozmzZPI(long $this$toSize_u2dozmzZPI) {
/*     */     return SizeKt.Size(IntSize.getWidth-impl($this$toSize_u2dozmzZPI), IntSize.getHeight-impl($this$toSize_u2dozmzZPI));
/*     */   }
/*     */   
/*     */   @Stable
/*  33 */   public static final long IntSize(int width, int height) { int $i$f$packInts = 0; return IntSize.constructor-impl(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 147 */         width << 32L | height & 0xFFFFFFFFL); } @Stable public static final long toIntSize-uvyYCjk(long $this$toIntSize_u2duvyYCjk) { int i = (int)Size.getWidth-impl($this$toIntSize_u2duvyYCjk), val2$iv = (int)Size.getHeight-impl($this$toIntSize_u2duvyYCjk), $i$f$packInts = 0;
/* 148 */     return IntSize.constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); } @Stable public static final long roundToIntSize-uvyYCjk(long $this$roundToIntSize_u2duvyYCjk) { float $this$fastRoundToInt$iv = Size.getWidth-impl($this$roundToIntSize_u2duvyYCjk); int $i$f$fastRoundToInt = 0;
/* 149 */     int i = Math.round($this$fastRoundToInt$iv); float f1 = Size.getHeight-impl($this$roundToIntSize_u2duvyYCjk); int k = 0;
/* 150 */     int j = Math.round(f1); int $i$f$packInts = 0;
/* 151 */     return IntSize.constructor-impl(i << 32L | j & 0xFFFFFFFFL); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\IntSizeKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */