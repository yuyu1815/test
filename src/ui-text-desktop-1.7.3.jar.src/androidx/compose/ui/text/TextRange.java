/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import kotlin.Metadata;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\t\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\033\n\002\020\016\n\002\b\004\b@\030\000 *2\0020\001:\001*B\021\b\000\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\033\020\030\032\0020\0072\006\020\031\032\0020\000H\002ø\001\000¢\006\004\b\032\020\033J\030\020\030\032\0020\0072\006\020\034\032\0020\013H\002¢\006\004\b\035\020\036J\032\020\037\032\0020\0072\b\020\031\032\004\030\0010\001HÖ\003¢\006\004\b \020!J\020\020\"\032\0020\013HÖ\001¢\006\004\b#\020\rJ\030\020$\032\0020\0072\006\020\031\032\0020\000ø\001\000¢\006\004\b%\020\033J\017\020&\032\0020'H\026¢\006\004\b(\020)R\021\020\006\032\0020\0078F¢\006\006\032\004\b\b\020\tR\021\020\n\032\0020\0138F¢\006\006\032\004\b\f\020\rR\021\020\016\032\0020\0138F¢\006\006\032\004\b\017\020\rR\021\020\020\032\0020\0138F¢\006\006\032\004\b\021\020\rR\021\020\022\032\0020\0138F¢\006\006\032\004\b\023\020\rR\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\024\032\0020\0078F¢\006\006\032\004\b\025\020\tR\021\020\026\032\0020\0138F¢\006\006\032\004\b\027\020\r\001\002\001\0020\003\002\007\n\005\b¡\0360\001¨\006+"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "collapsed", "", "getCollapsed-impl", "(J)Z", "end", "", "getEnd-impl", "(J)I", "length", "getLength-impl", "max", "getMax-impl", "min", "getMin-impl", "reversed", "getReversed-impl", "start", "getStart-impl", "contains", "other", "contains-5zc-tL8", "(JJ)Z", "offset", "contains-impl", "(JI)Z", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "intersects", "intersects-5zc-tL8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-text"})
/*     */ @Immutable
/*     */ @SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,129:1\n107#2:130\n114#2:131\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:130\n50#1:131\n*E\n"})
/*     */ public final class TextRange
/*     */ {
/*     */   public static final int getStart-impl(long arg0) {
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
/* 130 */       (int)(value$iv >> 32L); } public static final int getEnd-impl(long arg0) { long value$iv = arg0; int $i$f$unpackInt2 = 0;
/* 131 */     return (int)(value$iv & 0xFFFFFFFFL); }
/*     */ 
/*     */   
/*     */   public static final int getMin-impl(long arg0) {
/*     */     return (getStart-impl(arg0) > getEnd-impl(arg0)) ? getEnd-impl(arg0) : getStart-impl(arg0);
/*     */   }
/*     */   
/*     */   public static final int getMax-impl(long arg0) {
/*     */     return (getStart-impl(arg0) > getEnd-impl(arg0)) ? getStart-impl(arg0) : getEnd-impl(arg0);
/*     */   }
/*     */   
/*     */   public static final boolean getCollapsed-impl(long arg0) {
/*     */     return (getStart-impl(arg0) == getEnd-impl(arg0));
/*     */   }
/*     */   
/*     */   public static final boolean getReversed-impl(long arg0) {
/*     */     return (getStart-impl(arg0) > getEnd-impl(arg0));
/*     */   }
/*     */   
/*     */   public static final int getLength-impl(long arg0) {
/*     */     return getMax-impl(arg0) - getMin-impl(arg0);
/*     */   }
/*     */   
/*     */   public static final boolean intersects-5zc-tL8(long arg0, long other) {
/*     */     return (getMin-impl(arg0) < getMax-impl(other) && getMin-impl(other) < getMax-impl(arg0));
/*     */   }
/*     */   
/*     */   public static final boolean contains-5zc-tL8(long arg0, long other) {
/*     */     return (getMin-impl(arg0) <= getMin-impl(other) && getMax-impl(other) <= getMax-impl(arg0));
/*     */   }
/*     */   
/*     */   public static final boolean contains-impl(long arg0, int offset) {
/*     */     int i = getMin-impl(arg0);
/*     */     return (offset < getMax-impl(arg0)) ? ((i <= offset)) : false;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.packedValue);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static String toString-impl(long arg0) {
/*     */     return "TextRange(" + getStart-impl(arg0) + ", " + getEnd-impl(arg0) + ')';
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\b"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getZero-d9O1mEE() {
/*     */       return TextRange.Zero;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final long packedValue;
/*     */   private static final long Zero = TextRangeKt.TextRange(0);
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
/*     */     if (!(other instanceof TextRange))
/*     */       return false; 
/*     */     long l = ((TextRange)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextRange.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */