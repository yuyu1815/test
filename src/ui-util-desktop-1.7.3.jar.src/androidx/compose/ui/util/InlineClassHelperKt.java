/*     */ package androidx.compose.ui.util;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\030\n\000\n\002\020\t\n\000\n\002\020\007\n\002\b\002\n\002\020\b\n\002\b\b\032\031\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\003H\b\032\031\020\005\032\0020\0012\006\020\002\032\0020\0062\006\020\004\032\0020\006H\b\032\021\020\007\032\0020\0032\006\020\b\032\0020\001H\b\032\021\020\t\032\0020\0032\006\020\b\032\0020\001H\b\032\021\020\n\032\0020\0032\006\020\b\032\0020\001H\b\032\021\020\013\032\0020\0032\006\020\b\032\0020\001H\b\032\021\020\f\032\0020\0062\006\020\b\032\0020\001H\b\032\021\020\r\032\0020\0062\006\020\b\032\0020\001H\b¨\006\016"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "unpackAbsFloat1", "value", "unpackAbsFloat2", "unpackFloat1", "unpackFloat2", "unpackInt1", "unpackInt2", "ui-util"})
/*     */ @SourceDebugExtension({"SMAP\nInlineClassHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,116:1\n22#2:117\n22#2:118\n22#2:119\n22#2:120\n*S KotlinDebug\n*F\n+ 1 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n72#1:117\n79#1:118\n86#1:119\n93#1:120\n*E\n"})
/*     */ public final class InlineClassHelperKt
/*     */ {
/*     */   public static final long packFloats(float val1, float val2) {
/*  63 */     int $i$f$packFloats = 0; long v1 = Float.floatToRawIntBits(val1);
/*  64 */     long v2 = Float.floatToRawIntBits(val2);
/*  65 */     return v1 << 32L | v2 & 0xFFFFFFFFL;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final float unpackFloat1(long value) {
/*  72 */     int $i$f$unpackFloat1 = 0, bits$iv = (int)(value >> 32L), $i$f$floatFromBits = 0; return 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 117 */       Float.intBitsToFloat(bits$iv); } public static final float unpackAbsFloat1(long value) { int $i$f$unpackAbsFloat1 = 0, bits$iv = (int)(value >> 32L & 0x7FFFFFFFL), $i$f$floatFromBits = 0;
/* 118 */     return Float.intBitsToFloat(bits$iv); } public static final float unpackFloat2(long value) { int $i$f$unpackFloat2 = 0, bits$iv = (int)(value & 0xFFFFFFFFL), $i$f$floatFromBits = 0;
/* 119 */     return Float.intBitsToFloat(bits$iv); } public static final float unpackAbsFloat2(long value) { int $i$f$unpackAbsFloat2 = 0, bits$iv = (int)(value & 0x7FFFFFFFL), $i$f$floatFromBits = 0;
/* 120 */     return Float.intBitsToFloat(bits$iv); }
/*     */ 
/*     */   
/*     */   public static final long packInts(int val1, int val2) {
/*     */     int $i$f$packInts = 0;
/*     */     return val1 << 32L | val2 & 0xFFFFFFFFL;
/*     */   }
/*     */   
/*     */   public static final int unpackInt1(long value) {
/*     */     int $i$f$unpackInt1 = 0;
/*     */     return (int)(value >> 32L);
/*     */   }
/*     */   
/*     */   public static final int unpackInt2(long value) {
/*     */     int $i$f$unpackInt2 = 0;
/*     */     return (int)(value & 0xFFFFFFFFL);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-util-desktop-1.7.3.jar!\androidx\compos\\u\\util\InlineClassHelperKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */