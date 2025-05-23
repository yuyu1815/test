/*     */ package androidx.compose.ui.graphics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\b\n\002\b\b\n\002\020\007\n\002\b\b\n\002\030\002\n\002\b\003\n\002\020\n\n\002\b\r\032\021\020\026\032\0020\0272\006\020\030\032\0020\nH\b\032\021\020\031\032\0020\n2\006\020\032\032\0020\027H\b\032\"\020\033\032\0020\0232\006\020\034\032\0020\0232\006\020\035\032\0020\023H\000ø\001\000¢\006\004\b\036\020\037\032\"\020 \032\0020\0232\006\020\034\032\0020\0232\006\020\035\032\0020\023H\000ø\001\000¢\006\004\b!\020\037\032\021\020\"\032\0020\0012\006\020#\032\0020\027H\b\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\001XT¢\006\002\n\000\"\016\020\t\032\0020\nX\004¢\006\002\n\000\"\016\020\013\032\0020\001XT¢\006\002\n\000\"\016\020\f\032\0020\001XT¢\006\002\n\000\"\016\020\r\032\0020\001XT¢\006\002\n\000\"\016\020\016\032\0020\001XT¢\006\002\n\000\"\016\020\017\032\0020\001XT¢\006\002\n\000\"\016\020\020\032\0020\001XT¢\006\002\n\000\"\016\020\021\032\0020\001XT¢\006\002\n\000\"\020\020\022\032\0020\023X\004¢\006\004\n\002\020\024\"\020\020\025\032\0020\023X\004¢\006\004\n\002\020\024\002\007\n\005\b¡\0360\001¨\006$"}, d2 = {"Fp16Combined", "", "Fp16ExponentBias", "Fp16ExponentMask", "Fp16ExponentMax", "Fp16ExponentShift", "Fp16SignMask", "Fp16SignShift", "Fp16SignificandMask", "Fp32DenormalFloat", "", "Fp32DenormalMagic", "Fp32ExponentBias", "Fp32ExponentMask", "Fp32ExponentShift", "Fp32QNaNMask", "Fp32SignShift", "Fp32SignificandMask", "NegativeOne", "Landroidx/compose/ui/graphics/Float16;", "S", "One", "floatToHalf", "", "f", "halfToFloat", "h", "max", "x", "y", "max-AoSsdG0", "(SS)S", "min", "min-AoSsdG0", "toCompareValue", "value", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,717:1\n22#2:718\n22#2:719\n22#2:720\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n*L\n661#1:718\n678#1:719\n588#1:720\n*E\n"})
/*     */ public final class Float16Kt
/*     */ {
/* 568 */   private static final short One = Float16.constructor-impl(1.0F);
/* 569 */   private static final short NegativeOne = Float16.constructor-impl(-1.0F);
/*     */   private static final int Fp16SignShift = 15;
/*     */   private static final int Fp16SignMask = 32768;
/*     */   private static final int Fp16ExponentShift = 10;
/*     */   private static final int Fp16ExponentMask = 31;
/*     */   private static final int Fp16SignificandMask = 1023;
/*     */   private static final int Fp16ExponentBias = 15;
/*     */   private static final int Fp16Combined = 32767;
/*     */   private static final int Fp16ExponentMax = 31744;
/*     */   private static final int Fp32SignShift = 31;
/*     */   private static final int Fp32ExponentShift = 23;
/*     */   private static final int Fp32ExponentMask = 255;
/*     */   private static final int Fp32SignificandMask = 8388607;
/*     */   private static final int Fp32ExponentBias = 127;
/*     */   private static final int Fp32QNaNMask = 4194304;
/*     */   private static final int Fp32DenormalMagic = 1056964608;
/*     */   private static final float Fp32DenormalFloat;
/*     */   
/*     */   static {
/* 588 */     int bits$iv = 1056964608, $i$f$floatFromBits = 0; Fp32DenormalFloat = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 720 */       Float.intBitsToFloat(bits$iv);
/*     */   }
/*     */   
/*     */   private static final int toCompareValue(short value) {
/*     */     int $i$f$toCompareValue = 0;
/*     */     return ((value & 0x8000) != 0) ? (32768 - (value & 0xFFFF)) : (value & 0xFFFF);
/*     */   }
/*     */   
/*     */   public static final short floatToHalf(float f) {
/*     */     int $i$f$floatToHalf = 0, bits = Float.floatToRawIntBits(f);
/*     */     int s = bits >>> 31;
/*     */     int e = bits >>> 23 & 0xFF;
/*     */     int m = bits & 0x7FFFFF;
/*     */     int outE = 0;
/*     */     int outM = 0;
/*     */     if (e == 255) {
/*     */       outE = 31;
/*     */       outM = (m != 0) ? 512 : 0;
/*     */     } else {
/*     */       e = e - 127 + 15;
/*     */       if (e >= 31) {
/*     */         outE = 49;
/*     */       } else if (e <= 0) {
/*     */         if (e >= -10) {
/*     */           m = (m | 0x800000) >> 1 - e;
/*     */           if ((m & 0x1000) != 0)
/*     */             m += 8192; 
/*     */           outM = m >> 13;
/*     */         } 
/*     */       } else {
/*     */         outE = e;
/*     */         outM = m >> 13;
/*     */         if ((m & 0x1000) != 0) {
/*     */           int out = outE << 10 | outM;
/*     */           out++;
/*     */           return (short)(out | s << 15);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     return (short)(s << 15 | outE << 10 | outM);
/*     */   }
/*     */   
/*     */   public static final float halfToFloat(short h) {
/*     */     int $i$f$halfToFloat = 0, bits = h & 0xFFFF;
/*     */     int s = bits & 0x8000;
/*     */     int e = bits >>> 10 & 0x1F;
/*     */     int m = bits & 0x3FF;
/*     */     int outE = 0;
/*     */     int outM = 0;
/*     */     if (e == 0) {
/*     */       if (m != 0) {
/*     */         int bits$iv = 1056964608 + m, i = 0;
/*     */         float o = Float.intBitsToFloat(bits$iv);
/*     */         o -= access$getFp32DenormalFloat$p();
/*     */         return (s == 0) ? o : -o;
/*     */       } 
/*     */     } else {
/*     */       outM = m << 13;
/*     */       if (e == 31) {
/*     */         outE = 255;
/*     */         if (outM != 0)
/*     */           outM |= 0x400000; 
/*     */       } else {
/*     */         outE = e - 15 + 127;
/*     */       } 
/*     */     } 
/*     */     int out = s << 16 | outE << 23 | outM;
/*     */     int $i$f$floatFromBits = 0;
/*     */     return Float.intBitsToFloat(out);
/*     */   }
/*     */   
/*     */   public static final short min-AoSsdG0(short x, short y) {
/*     */     if (Float16.isNaN-impl(x) || Float16.isNaN-impl(y))
/*     */       return Float16.Companion.getNaN-slo4al4(); 
/*     */     return (Float16.compareTo-41bOqos(x, y) <= 0) ? x : y;
/*     */   }
/*     */   
/*     */   public static final short max-AoSsdG0(short x, short y) {
/*     */     if (Float16.isNaN-impl(x) || Float16.isNaN-impl(y))
/*     */       return Float16.Companion.getNaN-slo4al4(); 
/*     */     return (Float16.compareTo-41bOqos(x, y) >= 0) ? x : y;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Float16Kt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */