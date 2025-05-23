/*     */ package androidx.compose.animation.core;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\t\n\002\b\005\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B\033\b\026\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007B\021\b\002\022\006\020\b\032\0020\t¢\006\004\b\006\020\nJ\032\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003¢\006\004\b\021\020\022J\020\020\023\032\0020\003HÖ\001¢\006\004\b\024\020\fJ\020\020\025\032\0020\026HÖ\001¢\006\004\b\027\020\030R\021\020\002\032\0020\0038F¢\006\006\032\004\b\013\020\fR\027\020\004\032\0020\0058Fø\001\000ø\001\001¢\006\006\032\004\b\r\020\fR\016\020\b\032\0020\tX\004¢\006\002\n\000\001\b\001\0020\t\002\013\n\005\b¡\0360\001\n\002\b!¨\006\031"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", "value", "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core"})
/*     */ public final class StartOffset
/*     */ {
/*     */   private final long value;
/*     */   
/*     */   public static long constructor-impl(int offsetMillis, int offsetType) {
/* 290 */     return constructor-impl((
/* 291 */         offsetMillis * offsetType));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getOffsetMillis-impl(long arg0) {
/* 298 */     return Math.abs((int)arg0);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int getOffsetType-Eo1U57Q(long arg0) {
/* 304 */     boolean bool = (arg0 > 0L) ? true : false;
/*     */     
/* 306 */     if (!bool) {  } else { throw new NoWhenBranchMatchedException(); }
/*     */     
/*     */     return (bool == true) ? StartOffsetType.Companion.getFastForward-Eo1U57Q() : "JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   public static String toString-impl(long arg0) {
/*     */     return "StartOffset(value=" + arg0 + ')';
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     return toString-impl(this.value);
/*     */   }
/*     */   
/*     */   public static int hashCode-impl(long arg0) {
/*     */     return Long.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.value);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(long arg0, Object other) {
/*     */     if (!(other instanceof StartOffset))
/*     */       return false; 
/*     */     long l = ((StartOffset)other).unbox-impl();
/*     */     return !(arg0 != l);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.value, other);
/*     */   }
/*     */   
/*     */   private static long constructor-impl(long value) {
/*     */     return value;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(long p1, long p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\StartOffset.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */