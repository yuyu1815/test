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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\b\n\002\b\021\n\002\020\013\n\002\b\007\n\002\020\016\n\002\b\004\b@\030\000 $2\0020\001:\001$B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\020\032\0020\007H\n¢\006\004\b\021\020\013J\020\020\022\032\0020\007H\n¢\006\004\b\023\020\013J\036\020\024\032\0020\0002\006\020\025\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b\026\020\027J\032\020\030\032\0020\0312\b\020\025\032\004\030\0010\001HÖ\003¢\006\004\b\032\020\033J\020\020\034\032\0020\007HÖ\001¢\006\004\b\035\020\013J\036\020\036\032\0020\0002\006\020\025\032\0020\007H\002ø\001\000ø\001\001¢\006\004\b\037\020\027J\017\020 \032\0020!H\027¢\006\004\b\"\020#R\032\020\006\032\0020\0078FX\004¢\006\f\022\004\b\b\020\t\032\004\b\n\020\013R\026\020\002\032\0020\0038\000X\004¢\006\b\n\000\022\004\b\f\020\tR\032\020\r\032\0020\0078FX\004¢\006\f\022\004\b\016\020\t\032\004\b\017\020\013\001\002\001\0020\003\002\013\n\002\b!\n\005\b¡\0360\001¨\006%"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)I", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "div", "other", "div-YEO4UFw", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "times", "times-YEO4UFw", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,146:1\n107#2:147\n114#2:148\n107#2:149\n114#2:150\n100#2:151\n107#2:152\n114#2:153\n100#2:154\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n46#1:147\n53#1:148\n67#1:149\n68#1:150\n66#1:151\n78#1:152\n79#1:153\n77#1:154\n*E\n"})
/*     */ public final class IntSize
/*     */ {
/*     */   public static final int getWidth-impl(long arg0) {
/*  46 */     long value$iv = arg0; int $i$f$unpackInt1 = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 147 */       (int)(value$iv >> 32L); } public static final int getHeight-impl(long arg0) { long value$iv = arg0; int $i$f$unpackInt2 = 0;
/* 148 */     return (int)(value$iv & 0xFFFFFFFFL); }
/* 149 */   @Stable public static final int component1-impl(long arg0) { int $i$f$component1-impl = 0; return getWidth-impl(arg0); } @Stable public static final long times-YEO4UFw(long arg0, int other) { long value$iv = arg0; int $i$f$unpackInt1 = 0, i = (int)(value$iv >> 32L) * other; long l1 = arg0;
/* 150 */     int $i$f$unpackInt2 = 0, val2$iv = (int)(l1 & 0xFFFFFFFFL) * other; int $i$f$packInts = 0;
/* 151 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); }
/* 152 */   @Stable public static final int component2-impl(long arg0) { int $i$f$component2-impl = 0; return getHeight-impl(arg0); } @Stable public static final long div-YEO4UFw(long arg0, int other) { long value$iv = arg0; int $i$f$unpackInt1 = 0, i = (int)(value$iv >> 32L) / other; long l1 = arg0;
/* 153 */     int $i$f$unpackInt2 = 0, val2$iv = (int)(l1 & 0xFFFFFFFFL) / other; int $i$f$packInts = 0;
/* 154 */     return constructor-impl(i << 32L | val2$iv & 0xFFFFFFFFL); }
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     return getWidth-impl(arg0) + " x " + getHeight-impl(arg0);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.packedValue);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\b"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntSize;", "getZero-YbymL2g", "()J", "J", "ui-unit"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getZero-YbymL2g() {
/*     */       return IntSize.Zero;
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
/*     */     if (!(other instanceof IntSize))
/*     */       return false; 
/*     */     long l = ((IntSize)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-unit-desktop-1.7.3.jar!\androidx\compos\\u\\unit\IntSize.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */