/*     */ package androidx.compose.ui.unit;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\030\002\n\002\b\021\n\002\020\007\n\002\b\002\n\002\020\b\n\002\b\002\n\002\020\013\n\002\b\r\n\002\020\016\n\002\b\004\b@\030\000 02\0020\001:\0010B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\026\020\020\032\0020\007H\nø\001\001ø\001\000¢\006\004\b\021\020\013J\026\020\022\032\0020\007H\nø\001\001ø\001\000¢\006\004\b\023\020\013J$\020\024\032\0020\0002\b\b\002\020\r\032\0020\0072\b\b\002\020\006\032\0020\007ø\001\000¢\006\004\b\025\020\026J\036\020\027\032\0020\0002\006\020\030\032\0020\031H\002ø\001\001ø\001\000¢\006\004\b\032\020\033J\036\020\027\032\0020\0002\006\020\030\032\0020\034H\002ø\001\001ø\001\000¢\006\004\b\032\020\035J\032\020\036\032\0020\0372\b\020\030\032\004\030\0010\001HÖ\003¢\006\004\b \020!J\020\020\"\032\0020\034HÖ\001¢\006\004\b#\020$J\033\020%\032\0020\0002\006\020\030\032\0020\000H\002ø\001\000¢\006\004\b&\020'J\033\020(\032\0020\0002\006\020\030\032\0020\000H\002ø\001\000¢\006\004\b)\020'J\036\020*\032\0020\0002\006\020\030\032\0020\031H\002ø\001\001ø\001\000¢\006\004\b+\020\033J\036\020*\032\0020\0002\006\020\030\032\0020\034H\002ø\001\001ø\001\000¢\006\004\b+\020\035J\017\020,\032\0020-H\027¢\006\004\b.\020/R \020\006\032\0020\0078FX\004ø\001\000ø\001\001¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\f\020\tR \020\r\032\0020\0078FX\004ø\001\000ø\001\001¢\006\f\022\004\b\016\020\t\032\004\b\017\020\013\001\002\001\0020\003\002\013\n\005\b¡\0360\001\n\002\b!¨\0061"}, d2 = {"Landroidx/compose/ui/unit/DpSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "Landroidx/compose/ui/unit/Dp;", "getHeight-D9Ej5fM$annotations", "()V", "getHeight-D9Ej5fM", "(J)F", "getPackedValue$annotations", "width", "getWidth-D9Ej5fM$annotations", "getWidth-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-DwJknco", "(JFF)J", "div", "other", "", "div-Gh9hcWk", "(JF)J", "", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-e_xh8Ic", "(JJ)J", "plus", "plus-e_xh8Ic", "times", "times-Gh9hcWk", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,577:1\n72#2:578\n86#2:581\n63#2,3:584\n63#2,3:589\n63#2,3:594\n63#2,3:599\n63#2,3:604\n63#2,3:609\n63#2,3:614\n22#3:579\n22#3:582\n169#4:580\n169#4:583\n483#4:617\n57#5:587\n57#5:588\n51#5:592\n51#5:593\n87#5:597\n87#5:598\n84#5:602\n84#5:603\n72#5:607\n72#5:608\n69#5:612\n69#5:613\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpSize\n*L\n377#1:578\n383#1:581\n390#1:584,3\n399#1:589,3\n411#1:594,3\n425#1:599,3\n433#1:604,3\n441#1:609,3\n449#1:614,3\n377#1:579\n383#1:582\n377#1:580\n383#1:583\n457#1:617\n400#1:587\n401#1:588\n412#1:592\n413#1:593\n426#1:597\n427#1:598\n434#1:602\n435#1:603\n442#1:607\n443#1:608\n450#1:612\n451#1:613\n*E\n"})
/*     */ public final class DpSize
/*     */ {
/*     */   public static final float getWidth-D9Ej5fM(long arg0) {
/* 377 */     long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 578 */     int bits$iv$iv = (int)(value$iv >> 32L), $i$f$floatFromBits = 0; float f = 
/* 579 */       Float.intBitsToFloat(bits$iv$iv); int $i$f$getDp = 0;
/* 580 */     return Dp.constructor-impl(f); } public static final float getHeight-D9Ej5fM(long arg0) { long value$iv = arg0; int $i$f$unpackFloat2 = 0;
/* 581 */     int bits$iv$iv = (int)(value$iv & 0xFFFFFFFFL), $i$f$floatFromBits = 0; float f = 
/* 582 */       Float.intBitsToFloat(bits$iv$iv); int $i$f$getDp = 0;
/* 583 */     return Dp.constructor-impl(f); } public static final long copy-DwJknco(long arg0, float width, float height) { float f1 = width, val2$iv = height; int $i$f$packFloats = 0;
/* 584 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 585 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 586 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long minus-e_xh8Ic(long arg0, long other) { float f1 = getWidth-D9Ej5fM(arg0), other$iv = getWidth-D9Ej5fM(other); int $i$f$minus-5rwHm24 = 0;
/* 587 */     float arg0$iv = Dp.constructor-impl(f1 - other$iv); other$iv = getHeight-D9Ej5fM(arg0); float f2 = getHeight-D9Ej5fM(other); int i = 0;
/* 588 */     float val2$iv = Dp.constructor-impl(other$iv - f2); int $i$f$packFloats = 0;
/* 589 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 590 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 591 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long plus-e_xh8Ic(long arg0, long other) { float f1 = getWidth-D9Ej5fM(arg0), other$iv = getWidth-D9Ej5fM(other); int $i$f$plus-5rwHm24 = 0;
/* 592 */     float arg0$iv = Dp.constructor-impl(f1 + other$iv); other$iv = getHeight-D9Ej5fM(arg0); float f2 = getHeight-D9Ej5fM(other); int i = 0;
/* 593 */     float val2$iv = Dp.constructor-impl(other$iv + f2); int $i$f$packFloats = 0;
/* 594 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 595 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 596 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/* 597 */   @Stable public static final float component1-D9Ej5fM(long arg0) { int $i$f$component1-D9Ej5fM = 0; return getWidth-D9Ej5fM(arg0); } @Stable public static final long times-Gh9hcWk(long arg0, int other) { float arg0$iv = getWidth-D9Ej5fM(arg0); int $i$f$times-u2uoSUM = 0; arg0$iv = Dp.constructor-impl(arg0$iv * other); float f1 = getHeight-D9Ej5fM(arg0); int i = 0;
/* 598 */     float val2$iv = Dp.constructor-impl(f1 * other); int $i$f$packFloats = 0;
/* 599 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 600 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 601 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); }
/* 602 */   @Stable public static final float component2-D9Ej5fM(long arg0) { int $i$f$component2-D9Ej5fM = 0; return getHeight-D9Ej5fM(arg0); } @Stable public static final long times-Gh9hcWk(long arg0, float other) { float arg0$iv = getWidth-D9Ej5fM(arg0); int $i$f$times-u2uoSUM = 0; arg0$iv = Dp.constructor-impl(arg0$iv * other); float f1 = getHeight-D9Ej5fM(arg0); int i = 0;
/* 603 */     float val2$iv = Dp.constructor-impl(f1 * other); int $i$f$packFloats = 0;
/* 604 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 605 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 606 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long div-Gh9hcWk(long arg0, int other) { float arg0$iv = getWidth-D9Ej5fM(arg0); int $i$f$div-u2uoSUM = 0;
/* 607 */     arg0$iv = Dp.constructor-impl(arg0$iv / other); float f1 = getHeight-D9Ej5fM(arg0); int i = 0;
/* 608 */     float val2$iv = Dp.constructor-impl(f1 / other); int $i$f$packFloats = 0;
/* 609 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 610 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 611 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long div-Gh9hcWk(long arg0, float other) { float arg0$iv = getWidth-D9Ej5fM(arg0); int $i$f$div-u2uoSUM = 0;
/* 612 */     arg0$iv = Dp.constructor-impl(arg0$iv / other); float f1 = getHeight-D9Ej5fM(arg0); int i = 0;
/* 613 */     float val2$iv = Dp.constructor-impl(f1 / other); int $i$f$packFloats = 0;
/* 614 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 615 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 616 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable @NotNull public String toString() { return toString-impl(this.packedValue); }
/* 617 */   @Stable @NotNull public static String toString-impl(long arg0) { long $this$isSpecified$iv = arg0; int $i$f$isSpecified-EaSLcWc = 0; return (($this$isSpecified$iv != 9205357640488583168L)) ? (Dp.toString-impl(getWidth-D9Ej5fM(arg0)) + " x " + Dp.toString-impl(getHeight-D9Ej5fM(arg0))) : "DpSize.Unspecified"; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\n"}, d2 = {"Landroidx/compose/ui/unit/DpSize$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpSize;", "getUnspecified-MYxV2XQ", "()J", "J", "Zero", "getZero-MYxV2XQ", "ui-unit"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getZero-MYxV2XQ() {
/*     */       return DpSize.Zero;
/*     */     }
/*     */     
/*     */     public final long getUnspecified-MYxV2XQ() {
/*     */       return DpSize.Unspecified;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long packedValue;
/*     */   private static final long Zero = constructor-impl(0L);
/*     */   private static final long Unspecified = constructor-impl(9205357640488583168L);
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return Long.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.packedValue);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof DpSize))
/*     */       return false; 
/*     */     long l = ((DpSize)other).unbox-impl();
/*     */     return !(arg0 != l);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.packedValue, other);
/*     */   }
/*     */   
/*     */   public static long constructor-impl(long packedValue) {
/*     */     return packedValue;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\DpSize.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */