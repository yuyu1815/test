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
/*    */ 
/*    */ @JvmInline
/*    */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\004\n\002\020\t\n\002\b\013\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\016\n\002\b\003\b@\030\0002\0020\001B\031\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006B\021\b\000\022\006\020\007\032\0020\b¢\006\004\b\005\020\tJ\020\020\017\032\0020\003H\n¢\006\004\b\020\020\013J\020\020\021\032\0020\003H\n¢\006\004\b\022\020\013J\032\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003¢\006\004\b\026\020\027J\020\020\030\032\0020\031HÖ\001¢\006\004\b\032\020\033J\017\020\034\032\0020\035H\026¢\006\004\b\036\020\037R\022\020\002\032\0020\0038Æ\002¢\006\006\032\004\b\n\020\013R\026\020\007\032\0020\b8\000X\004¢\006\b\n\000\022\004\b\f\020\rR\022\020\004\032\0020\0038Æ\002¢\006\006\032\004\b\016\020\013\001\007\001\0020\b¨\006 "}, d2 = {"Landroidx/collection/FloatFloatPair;", "", "first", "", "second", "constructor-impl", "(FF)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)F", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"})
/*    */ @SourceDebugExtension({"SMAP\nFloatFloatPair.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 2 PackingUtils.kt\nandroidx/collection/PackingUtilsKt\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n*L\n1#1,85:1\n48#1:93\n54#1:95\n24#2,3:86\n22#3:89\n22#3:90\n22#3:91\n22#3:92\n22#3:94\n*S KotlinDebug\n*F\n+ 1 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n*L\n83#1:93\n83#1:95\n42#1:86,3\n48#1:89\n54#1:90\n67#1:91\n81#1:92\n83#1:94\n*E\n"})
/*    */ public final class FloatFloatPair
/*    */ {
/*    */   @JvmField
/*    */   public final long packedValue;
/*    */   
/*    */   public static long constructor-impl(float first, float second) {
/* 42 */     int $i$f$packFloats = 0;
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
/*    */     
/* 86 */     long v1$iv = Float.floatToRawIntBits(first);
/* 87 */     long v2$iv = Float.floatToRawIntBits(second);
/* 88 */     return constructor-impl(v1$iv << 32L | v2$iv & 0xFFFFFFFFL); } public static final float getFirst-impl(long arg0) { int $i$f$getFirst-impl = 0, bits$iv = (int)(arg0 >> 32L), $i$f$floatFromBits = 0;
/* 89 */     return Float.intBitsToFloat(bits$iv); } public static final float getSecond-impl(long arg0) { int $i$f$getSecond-impl = 0, bits$iv = (int)(arg0 & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 90 */     return Float.intBitsToFloat(bits$iv); } public static final float component1-impl(long arg0) { int $i$f$component1-impl = 0, bits$iv = (int)(arg0 >> 32L), $i$f$floatFromBits = 0;
/* 91 */     return Float.intBitsToFloat(bits$iv); } public static final float component2-impl(long arg0) { int $i$f$component2-impl = 0, bits$iv = (int)(arg0 & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 92 */     return Float.intBitsToFloat(bits$iv); } @NotNull public static String toString-impl(long arg0) { int $i$f$getFirst-impl = 0;
/* 93 */     int bits$iv$iv = (int)(arg0 >> 32L), $i$f$floatFromBits = 0;
/*    */     int $i$f$getSecond-impl = 0;
/* 95 */     bits$iv$iv = (int)(arg0 & 0xFFFFFFFFL); $i$f$floatFromBits = 0;
/*    */     return '(' + Float.intBitsToFloat(bits$iv$iv) + ", " + Float.intBitsToFloat(bits$iv$iv) + ')'; }
/*    */ 
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
/*    */     if (!(other instanceof FloatFloatPair))
/*    */       return false; 
/*    */     long l = ((FloatFloatPair)other).unbox-impl();
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\FloatFloatPair.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */