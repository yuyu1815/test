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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\005\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\b\n\002\020\016\n\002\b\004\b@\030\000 %2\0020\001:\001%B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J$\020\020\032\0020\0002\b\b\002\020\b\032\0020\t2\b\b\002\020\r\032\0020\tø\001\000¢\006\004\b\021\020\022J\032\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003¢\006\004\b\026\020\027J\020\020\030\032\0020\031HÖ\001¢\006\004\b\032\020\033J\033\020\034\032\0020\0002\006\020\025\032\0020\000H\002ø\001\000¢\006\004\b\035\020\036J\033\020\037\032\0020\0002\006\020\025\032\0020\000H\002ø\001\000¢\006\004\b \020\036J\017\020!\032\0020\"H\027¢\006\004\b#\020$R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\006\020\007R \020\b\032\0020\t8FX\004ø\001\000ø\001\001¢\006\f\022\004\b\n\020\007\032\004\b\013\020\fR \020\r\032\0020\t8FX\004ø\001\000ø\001\001¢\006\f\022\004\b\016\020\007\032\004\b\017\020\f\001\002\001\0020\003\002\013\n\005\b¡\0360\001\n\002\b!¨\006&"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nDp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,577:1\n72#2:578\n86#2:581\n63#2,3:584\n63#2,3:589\n63#2,3:594\n22#3:579\n22#3:582\n169#4:580\n169#4:583\n325#4:597\n57#5:587\n57#5:588\n51#5:592\n51#5:593\n*S KotlinDebug\n*F\n+ 1 Dp.kt\nandroidx/compose/ui/unit/DpOffset\n*L\n261#1:578\n267#1:581\n273#1:584,3\n280#1:589,3\n291#1:594,3\n261#1:579\n267#1:582\n261#1:580\n267#1:583\n299#1:597\n281#1:587\n282#1:588\n292#1:592\n293#1:593\n*E\n"})
/*     */ public final class DpOffset
/*     */ {
/*     */   public static final float getX-D9Ej5fM(long arg0) {
/* 261 */     long value$iv = arg0; int $i$f$unpackFloat1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 580 */     return Dp.constructor-impl(f); } public static final float getY-D9Ej5fM(long arg0) { long value$iv = arg0; int $i$f$unpackFloat2 = 0;
/* 581 */     int bits$iv$iv = (int)(value$iv & 0xFFFFFFFFL), $i$f$floatFromBits = 0; float f = 
/* 582 */       Float.intBitsToFloat(bits$iv$iv); int $i$f$getDp = 0;
/* 583 */     return Dp.constructor-impl(f); } public static final long copy-tPigGR8(long arg0, float x, float y) { float f1 = x, val2$iv = y; int $i$f$packFloats = 0;
/* 584 */     long v1$iv = Float.floatToRawIntBits(f1);
/* 585 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 586 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long minus-CB-Mgk4(long arg0, long other) { float f1 = getX-D9Ej5fM(arg0), other$iv = getX-D9Ej5fM(other); int $i$f$minus-5rwHm24 = 0;
/* 587 */     float arg0$iv = Dp.constructor-impl(f1 - other$iv); other$iv = getY-D9Ej5fM(arg0); float f2 = getY-D9Ej5fM(other); int i = 0;
/* 588 */     float val2$iv = Dp.constructor-impl(other$iv - f2); int $i$f$packFloats = 0;
/* 589 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 590 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 591 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable public static final long plus-CB-Mgk4(long arg0, long other) { float f1 = getX-D9Ej5fM(arg0), other$iv = getX-D9Ej5fM(other); int $i$f$plus-5rwHm24 = 0;
/* 592 */     float arg0$iv = Dp.constructor-impl(f1 + other$iv); other$iv = getY-D9Ej5fM(arg0); float f2 = getY-D9Ej5fM(other); int i = 0;
/* 593 */     float val2$iv = Dp.constructor-impl(other$iv + f2); int $i$f$packFloats = 0;
/* 594 */     long v1$iv = Float.floatToRawIntBits(arg0$iv);
/* 595 */     long v2$iv = Float.floatToRawIntBits(val2$iv);
/* 596 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } @Stable @NotNull public static String toString-impl(long arg0) { long $this$isSpecified$iv = arg0; int $i$f$isSpecified-jo-Fl9I = 0;
/* 597 */     return (($this$isSpecified$iv != 9205357640488583168L)) ? ('(' + Dp.toString-impl(getX-D9Ej5fM(arg0)) + ", " + Dp.toString-impl(getY-D9Ej5fM(arg0)) + ')') : "DpOffset.Unspecified"; }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.packedValue);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getZero-RKDOV3M() {
/*     */       return DpOffset.Zero;
/*     */     }
/*     */     
/*     */     public final long getUnspecified-RKDOV3M() {
/*     */       return DpOffset.Unspecified;
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
/*     */     if (!(other instanceof DpOffset))
/*     */       return false; 
/*     */     long l = ((DpOffset)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\DpOffset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */