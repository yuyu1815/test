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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\005\n\002\020\b\n\002\b\017\n\002\020\007\n\002\b\003\n\002\020\013\n\002\b\020\n\002\020\016\n\002\b\006\b@\030\000 32\0020\001:\0013B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\020\032\0020\tH\n¢\006\004\b\021\020\fJ\020\020\022\032\0020\tH\n¢\006\004\b\023\020\fJ'\020\024\032\0020\0002\b\b\002\020\b\032\0020\t2\b\b\002\020\r\032\0020\tø\001\000ø\001\001¢\006\004\b\025\020\026J\036\020\027\032\0020\0002\006\020\030\032\0020\031H\002ø\001\000ø\001\001¢\006\004\b\032\020\033J\032\020\034\032\0020\0352\b\020\036\032\004\030\0010\001HÖ\003¢\006\004\b\037\020 J\020\020!\032\0020\tHÖ\001¢\006\004\b\"\020\fJ\033\020#\032\0020\0002\006\020\036\032\0020\000H\002ø\001\001¢\006\004\b$\020%J\033\020&\032\0020\0002\006\020\036\032\0020\000H\002ø\001\001¢\006\004\b'\020%J\036\020(\032\0020\0002\006\020\030\032\0020\tH\002ø\001\000ø\001\001¢\006\004\b)\020*J\036\020+\032\0020\0002\006\020\030\032\0020\031H\002ø\001\000ø\001\001¢\006\004\b,\020\033J\017\020-\032\0020.H\027¢\006\004\b/\0200J\026\0201\032\0020\000H\002ø\001\000ø\001\001¢\006\004\b2\020\005R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\006\020\007R\032\020\b\032\0020\t8FX\004¢\006\f\022\004\b\n\020\007\032\004\b\013\020\fR\032\020\r\032\0020\t8FX\004¢\006\f\022\004\b\016\020\007\032\004\b\017\020\f\001\002\001\0020\003\002\013\n\002\b!\n\005\b¡\0360\001¨\0064"}, d2 = {"Landroidx/compose/ui/unit/IntOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)I", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-iSbpLlY", "(JII)J", "div", "operand", "", "div-Bjo55l4", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "minus", "minus-qkQi6aY", "(JJ)J", "plus", "plus-qkQi6aY", "rem", "rem-Bjo55l4", "(JI)J", "times", "times-Bjo55l4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-nOcc-ac", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nIntOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,199:1\n107#2:200\n114#2:201\n100#2:202\n107#2,8:203\n107#2:211\n114#2:212\n100#2:213\n107#2:214\n114#2:215\n100#2:216\n107#2,8:217\n100#2:225\n107#2:226\n114#2:228\n100#2:230\n107#2:231\n114#2:233\n100#2:235\n107#2:236\n114#2:237\n100#2:238\n26#3:227\n26#3:229\n26#3:232\n26#3:234\n*S KotlinDebug\n*F\n+ 1 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n48#1:200\n55#1:201\n68#1:202\n67#1:203,8\n77#1:211\n78#1:212\n76#1:213\n89#1:214\n90#1:215\n88#1:216\n97#1:217,8\n97#1:225\n109#1:226\n110#1:228\n108#1:230\n124#1:231\n125#1:233\n123#1:235\n139#1:236\n140#1:237\n138#1:238\n109#1:227\n110#1:229\n124#1:232\n125#1:234\n*E\n"})
/*     */ public final class IntOffset
/*     */ {
/*     */   public static final int getX-impl(long arg0) {
/*  48 */     long value$iv = arg0; int $i$f$unpackInt1 = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 200 */       (int)(value$iv >> 32L); }
/* 201 */   @Stable public static final int component1-impl(long arg0) { int $i$f$component1-impl = 0; return getX-impl(arg0); } public static final int getY-impl(long arg0) { long value$iv = arg0; int $i$f$unpackInt2 = 0; return (int)(value$iv & 0xFFFFFFFFL); } public static final long copy-iSbpLlY(long arg0, int x, int y) { int $i$f$packInts = 0;
/* 202 */     return constructor-impl(x << 32L | y & 0xFFFFFFFFL); } @Stable
/*     */   public static final int component2-impl(long arg0) { int $i$f$component2-impl = 0;
/*     */     return getY-impl(arg0); }
/*     */   @Stable
/*     */   public static final long minus-qkQi6aY(long arg0, long other) {
/*     */     long value$iv = arg0;
/*     */     int $i$f$unpackInt1 = 0;
/*     */     value$iv = other;
/*     */     $i$f$unpackInt1 = 0;
/* 211 */     int i = (int)(value$iv >> 32L) - (int)(value$iv >> 32L); long l1 = arg0; int $i$f$unpackInt2 = 0; l1 = other; $i$f$unpackInt2 = 0;
/* 212 */     int val2$iv = (int)(l1 & 0xFFFFFFFFL) - (int)(l1 & 0xFFFFFFFFL); int $i$f$packInts = 0;
/* 213 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); } @Stable public static final long plus-qkQi6aY(long arg0, long other) { long value$iv = arg0; int $i$f$unpackInt1 = 0; value$iv = other; $i$f$unpackInt1 = 0;
/* 214 */     int i = (int)(value$iv >> 32L) + (int)(value$iv >> 32L); long l1 = arg0; int $i$f$unpackInt2 = 0; l1 = other; $i$f$unpackInt2 = 0;
/* 215 */     int val2$iv = (int)(l1 & 0xFFFFFFFFL) + (int)(l1 & 0xFFFFFFFFL); int $i$f$packInts = 0;
/* 216 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); } @Stable public static final long unaryMinus-nOcc-ac(long arg0) { long value$iv = arg0;
/* 217 */     int $i$f$unpackInt1 = 0, i = -((int)(value$iv >> 32L));
/*     */ 
/*     */ 
/*     */     
/*     */     long l1 = arg0;
/*     */ 
/*     */     
/* 224 */     int $i$f$unpackInt2 = 0, val2$iv = -((int)(l1 & 0xFFFFFFFFL)), $i$f$packInts = 0;
/* 225 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); } @Stable public static final long times-Bjo55l4(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackInt1 = 0;
/* 226 */     float $this$fastRoundToInt$iv = (int)(value$iv >> 32L) * operand; int $i$f$fastRoundToInt = 0;
/* 227 */     int i = Math.round($this$fastRoundToInt$iv); long l1 = arg0; int $i$f$unpackInt2 = 0;
/* 228 */     float f1 = (int)(l1 & 0xFFFFFFFFL) * operand; int j = 0;
/* 229 */     int val2$iv = Math.round(f1); int $i$f$packInts = 0;
/* 230 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); } @Stable public static final long div-Bjo55l4(long arg0, float operand) { long value$iv = arg0; int $i$f$unpackInt1 = 0;
/* 231 */     float $this$fastRoundToInt$iv = (int)(value$iv >> 32L) / operand; int $i$f$fastRoundToInt = 0;
/* 232 */     int i = Math.round($this$fastRoundToInt$iv); long l1 = arg0; int $i$f$unpackInt2 = 0;
/* 233 */     float f1 = (int)(l1 & 0xFFFFFFFFL) / operand; int j = 0;
/* 234 */     int val2$iv = Math.round(f1); int $i$f$packInts = 0;
/* 235 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); } @Stable public static final long rem-Bjo55l4(long arg0, int operand) { long value$iv = arg0;
/* 236 */     int $i$f$unpackInt1 = 0, i = (int)(value$iv >> 32L) % operand; long l1 = arg0;
/* 237 */     int $i$f$unpackInt2 = 0, val2$iv = (int)(l1 & 0xFFFFFFFFL) % operand; int $i$f$packInts = 0;
/* 238 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     return '(' + getX-impl(arg0) + ", " + getY-impl(arg0) + ')';
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.packedValue);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\b"}, d2 = {"Landroidx/compose/ui/unit/IntOffset$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntOffset;", "getZero-nOcc-ac", "()J", "J", "ui-unit"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getZero-nOcc-ac() {
/*     */       return IntOffset.Zero;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long packedValue;
/*     */   private static final long Zero = constructor-impl(0L);
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
/*     */     if (!(other instanceof IntOffset))
/*     */       return false; 
/*     */     long l = ((IntOffset)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\IntOffset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */