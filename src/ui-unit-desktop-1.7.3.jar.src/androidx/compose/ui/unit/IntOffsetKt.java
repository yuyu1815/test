/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.util.MathHelpersKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\006\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\r\032\035\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\007¢\006\002\020\005\032*\020\006\032\0020\0012\006\020\007\032\0020\0012\006\020\b\032\0020\0012\006\020\t\032\0020\nH\007ø\001\000¢\006\004\b\013\020\f\032\037\020\r\032\0020\016*\0020\0162\006\020\017\032\0020\001H\002ø\001\000¢\006\004\b\020\020\021\032\037\020\r\032\0020\016*\0020\0012\006\020\017\032\0020\016H\002ø\001\000¢\006\004\b\022\020\021\032\037\020\023\032\0020\016*\0020\0162\006\020\017\032\0020\001H\002ø\001\000¢\006\004\b\024\020\021\032\037\020\023\032\0020\016*\0020\0012\006\020\017\032\0020\016H\002ø\001\000¢\006\004\b\025\020\021\032\026\020\026\032\0020\001*\0020\016H\007ø\001\000¢\006\004\b\027\020\030\032\027\020\031\032\0020\016*\0020\001H\bø\001\000¢\006\004\b\032\020\030\002\007\n\005\b¡\0360\001¨\006\033"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", "offset", "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit"})
/*     */ @SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,199:1\n100#2:200\n100#2:201\n100#2:203\n26#3:202\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n35#1:200\n166#1:201\n198#1:203\n198#1:202\n*E\n"})
/*     */ public final class IntOffsetKt
/*     */ {
/*     */   @Stable
/*     */   public static final long IntOffset(int x, int y) {
/*  35 */     int $i$f$packInts = 0; return IntOffset.constructor-impl(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 200 */         x << 32L | y & 0xFFFFFFFFL); } @Stable public static final long lerp-81ZRxRo(long start, long stop, float fraction) { int i = MathHelpersKt.lerp(IntOffset.getX-impl(start), IntOffset.getX-impl(stop), fraction); int val2$iv = MathHelpersKt.lerp(IntOffset.getY-impl(start), IntOffset.getY-impl(stop), fraction); int $i$f$packInts = 0;
/* 201 */     return IntOffset.constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); } @Stable public static final long round-k-4lQ0M(long $this$round_u2dk_u2d4lQ0M) { float $this$fastRoundToInt$iv = Offset.getX-impl($this$round_u2dk_u2d4lQ0M); int $i$f$fastRoundToInt = 0;
/* 202 */     int i = Math.round($this$fastRoundToInt$iv); float f1 = Offset.getY-impl($this$round_u2dk_u2d4lQ0M); int k = 0; int j = Math.round(f1); int $i$f$packInts = 0;
/* 203 */     return IntOffset.constructor-impl(i << 32L | j & 0xFFFFFFFFL); }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   public static final long toOffset--gyyYBs(long $this$toOffset_u2d_u2dgyyYBs) {
/*     */     int $i$f$toOffset--gyyYBs = 0;
/*     */     return OffsetKt.Offset(IntOffset.getX-impl($this$toOffset_u2d_u2dgyyYBs), IntOffset.getY-impl($this$toOffset_u2d_u2dgyyYBs));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long plus-Nv-tHpc(long $this$plus_u2dNv_u2dtHpc, long offset) {
/*     */     return OffsetKt.Offset(Offset.getX-impl($this$plus_u2dNv_u2dtHpc) + IntOffset.getX-impl(offset), Offset.getY-impl($this$plus_u2dNv_u2dtHpc) + IntOffset.getY-impl(offset));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long minus-Nv-tHpc(long $this$minus_u2dNv_u2dtHpc, long offset) {
/*     */     return OffsetKt.Offset(Offset.getX-impl($this$minus_u2dNv_u2dtHpc) - IntOffset.getX-impl(offset), Offset.getY-impl($this$minus_u2dNv_u2dtHpc) - IntOffset.getY-impl(offset));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long plus-oCl6YwE(long $this$plus_u2doCl6YwE, long offset) {
/*     */     return OffsetKt.Offset(IntOffset.getX-impl($this$plus_u2doCl6YwE) + Offset.getX-impl(offset), IntOffset.getY-impl($this$plus_u2doCl6YwE) + Offset.getY-impl(offset));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   public static final long minus-oCl6YwE(long $this$minus_u2doCl6YwE, long offset) {
/*     */     return OffsetKt.Offset(IntOffset.getX-impl($this$minus_u2doCl6YwE) - Offset.getX-impl(offset), IntOffset.getY-impl($this$minus_u2doCl6YwE) - Offset.getY-impl(offset));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\IntOffsetKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */