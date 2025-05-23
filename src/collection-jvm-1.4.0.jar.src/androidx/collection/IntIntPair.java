/*    */ package androidx.collection;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.PublishedApi;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmInline;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\004\n\002\020\t\n\002\b\013\n\002\020\013\n\002\b\006\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B\031\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B\021\b\000\022\006\020\007\032\0020\b¢\006\004\b\005\020\tJ\020\020\017\032\0020\003H\n¢\006\004\b\020\020\013J\020\020\021\032\0020\003H\n¢\006\004\b\022\020\013J\032\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003¢\006\004\b\026\020\027J\020\020\030\032\0020\003HÖ\001¢\006\004\b\031\020\013J\017\020\032\032\0020\033H\026¢\006\004\b\034\020\035R\021\020\002\032\0020\0038F¢\006\006\032\004\b\n\020\013R\026\020\007\032\0020\b8\000X\004¢\006\b\n\000\022\004\b\f\020\rR\021\020\004\032\0020\0038F¢\006\006\032\004\b\016\020\013\001\007\001\0020\b¨\006\036"}, d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"})
/*    */ @SourceDebugExtension({"SMAP\nIntIntPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n*L\n1#1,83:1\n33#2:84\n*S KotlinDebug\n*F\n+ 1 IntIntPair.kt\nandroidx/collection/IntIntPair\n*L\n41#1:84\n*E\n"})
/*    */ public final class IntIntPair
/*    */ {
/*    */   @JvmField
/*    */   public final long packedValue;
/*    */   
/*    */   public static long constructor-impl(int first, int second) {
/* 41 */     int $i$f$packInts = 0; return constructor-impl(
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 84 */         first << 32L | second & 0xFFFFFFFFL);
/*    */   }
/*    */   
/*    */   public static final int getFirst-impl(long arg0) {
/*    */     return (int)(arg0 >> 32L);
/*    */   }
/*    */   
/*    */   public static final int getSecond-impl(long arg0) {
/*    */     return (int)(arg0 & 0xFFFFFFFFL);
/*    */   }
/*    */   
/*    */   public static final int component1-impl(long arg0) {
/*    */     int $i$f$component1-impl = 0;
/*    */     return (int)(arg0 >> 32L);
/*    */   }
/*    */   
/*    */   public static final int component2-impl(long arg0) {
/*    */     int $i$f$component2-impl = 0;
/*    */     return (int)(arg0 & 0xFFFFFFFFL);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static String toString-impl(long arg0) {
/*    */     return '(' + getFirst-impl(arg0) + ", " + getSecond-impl(arg0) + ')';
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return toString-impl(this.packedValue);
/*    */   }
/*    */   
/*    */   public static int hashCode-impl(long arg0) {
/*    */     return Long.hashCode(arg0);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return hashCode-impl(this.packedValue);
/*    */   }
/*    */   
/*    */   public static boolean equals-impl(long arg0, Object other) {
/*    */     if (!(other instanceof IntIntPair))
/*    */       return false; 
/*    */     long l = ((IntIntPair)other).unbox-impl();
/*    */     return !(arg0 != l);
/*    */   }
/*    */   
/*    */   public boolean equals(Object other) {
/*    */     return equals-impl(this.packedValue, other);
/*    */   }
/*    */   
/*    */   public static long constructor-impl(long packedValue) {
/*    */     return packedValue;
/*    */   }
/*    */   
/*    */   public static final boolean equals-impl0(long p1, long p2) {
/*    */     return (p1 == p2);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\IntIntPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */