/*     */ package androidx.compose.ui.graphics;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmInline;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.CharsKt;
/*     */ import kotlin.text.Regex;
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
/*     */ @JvmInline
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\017\n\000\n\002\020\007\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\n\n\002\b\002\n\002\020\b\n\002\b\021\n\002\020\013\n\002\020\000\n\002\b\024\n\002\020\005\n\002\b\t\n\002\020\016\n\002\b\005\n\002\020\t\n\002\b\017\b@\030\000 R2\b\022\004\022\0020\0000\001:\001RB\021\b\026\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B\021\b\026\022\006\020\002\032\0020\006¢\006\004\b\004\020\007B\017\022\006\020\b\032\0020\t¢\006\004\b\004\020\nJ\023\020\025\032\0020\000ø\001\001ø\001\000¢\006\004\b\026\020\nJ\023\020\027\032\0020\000ø\001\001ø\001\000¢\006\004\b\030\020\nJ\033\020\031\032\0020\f2\006\020\032\032\0020\000H\002ø\001\000¢\006\004\b\033\020\034J\032\020\035\032\0020\0362\b\020\032\032\004\030\0010\037HÖ\003¢\006\004\b \020!J\023\020\"\032\0020\000ø\001\001ø\001\000¢\006\004\b#\020\nJ\020\020$\032\0020\fHÖ\001¢\006\004\b%\020\016J\r\020&\032\0020\036¢\006\004\b'\020(J\r\020)\032\0020\036¢\006\004\b*\020(J\r\020+\032\0020\036¢\006\004\b,\020(J\r\020-\032\0020\036¢\006\004\b.\020(J\023\020/\032\0020\000ø\001\001ø\001\000¢\006\004\b0\020\nJ\r\0201\032\0020\f¢\006\004\b2\020\016J\r\0203\032\00204¢\006\004\b5\0206J\r\0207\032\0020\006¢\006\004\b8\0209J\r\020:\032\0020\003¢\006\004\b;\020<J\r\020=\032\0020>¢\006\004\b?\020@J\r\020A\032\0020\f¢\006\004\bB\020\016J\r\020C\032\0020D¢\006\004\bE\020FJ\r\020G\032\0020\f¢\006\004\bH\020\016J\r\020I\032\0020\t¢\006\004\bJ\020\nJ\017\020K\032\0020>H\026¢\006\004\bL\020@J\023\020M\032\0020\000ø\001\001ø\001\000¢\006\004\bN\020\nJ\030\020O\032\0020\0002\006\020\021\032\0020\000ø\001\000¢\006\004\bP\020QR\021\020\013\032\0020\f8F¢\006\006\032\004\b\r\020\016R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\017\020\020R\027\020\021\032\0020\0008Fø\001\000ø\001\001¢\006\006\032\004\b\022\020\nR\021\020\023\032\0020\f8F¢\006\006\032\004\b\024\020\016\001\b\002\013\n\005\b¡\0360\001\n\002\b!¨\006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nFloat16.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n+ 2 Float16.kt\nandroidx/compose/ui/graphics/Float16Kt\n+ 3 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,717:1\n605#2,38:718\n650#2,12:756\n662#2,17:769\n592#2,4:786\n22#3:768\n*S KotlinDebug\n*F\n+ 1 Float16.kt\nandroidx/compose/ui/graphics/Float16\n*L\n98#1:718,38\n151#1:756,12\n151#1:769,17\n217#1:786,4\n151#1:768\n*E\n"})
/*     */ public final class Float16
/*     */   implements Comparable<Float16>
/*     */ {
/*     */   public final short getHalfValue() {
/*  91 */     return this.halfValue;
/*     */   }
/*     */   public static short constructor-impl(double value) { return constructor-impl((float)value); }
/*     */   public static final byte toByte-impl(short arg0) { return (byte)(int)toFloat-impl(arg0); } public static final short toShort-impl(short arg0) {
/*     */     return (short)(int)toFloat-impl(arg0);
/*     */   } public static final int toInt-impl(short arg0) {
/*     */     return (int)toFloat-impl(arg0);
/*  98 */   } public static short constructor-impl(float value) { int $i$f$floatToHalf = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 718 */     int bits$iv = Float.floatToRawIntBits(value);
/* 719 */     int s$iv = bits$iv >>> 31;
/* 720 */     int e$iv = bits$iv >>> 23 & 0xFF;
/* 721 */     int m$iv = bits$iv & 0x7FFFFF;
/*     */     
/* 723 */     int outE$iv = 0;
/* 724 */     int outM$iv = 0;
/*     */     
/* 726 */     if (e$iv == 255) {
/* 727 */       outE$iv = 31;
/* 728 */       outM$iv = (m$iv != 0) ? 512 : 0;
/*     */     } else {
/* 730 */       e$iv = e$iv - 127 + 15;
/* 731 */       if (e$iv >= 31) {
/* 732 */         outE$iv = 49;
/* 733 */       } else if (e$iv <= 0) {
/* 734 */         if (e$iv >= -10) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 739 */           m$iv = (m$iv | 0x800000) >> 1 - e$iv;
/* 740 */           if ((m$iv & 0x1000) != 0) m$iv += 8192; 
/* 741 */           outM$iv = m$iv >> 13;
/*     */         } 
/*     */       } else {
/* 744 */         outE$iv = e$iv;
/* 745 */         outM$iv = m$iv >> 13;
/* 746 */         if ((m$iv & 0x1000) != 0) {
/*     */           
/* 748 */           int out$iv = outE$iv << 10 | outM$iv;
/* 749 */           out$iv++;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 755 */     return constructor-impl((short)(s$iv << 15 | outE$iv << 10 | outM$iv)); }
/* 756 */   public static final long toLong-impl(short arg0) { return (long)toFloat-impl(arg0); } public static final float toFloat-impl(short arg0) { short h$iv = arg0; int $i$f$halfToFloat = 0; int bits$iv = h$iv & 0xFFFF;
/* 757 */     int s$iv = bits$iv & 0x8000;
/* 758 */     int e$iv = bits$iv >>> 10 & 0x1F;
/* 759 */     int m$iv = bits$iv & 0x3FF;
/*     */     
/* 761 */     int outE$iv = 0;
/* 762 */     int outM$iv = 0;
/*     */     
/* 764 */     if (e$iv == 0) {
/* 765 */       if (m$iv != 0) {
/*     */         
/* 767 */         int bits$iv$iv = 1056964608 + m$iv, i = 0; float o$iv = 
/* 768 */           Float.intBitsToFloat(bits$iv$iv);
/* 769 */         o$iv -= Float16Kt.access$getFp32DenormalFloat$p();
/* 770 */         return (s$iv == 0) ? o$iv : -o$iv;
/*     */       } 
/*     */     } else {
/* 773 */       outM$iv = m$iv << 13;
/* 774 */       if (e$iv == 31) {
/* 775 */         outE$iv = 255;
/* 776 */         if (outM$iv != 0) {
/* 777 */           outM$iv |= 0x400000;
/*     */         }
/*     */       } else {
/* 780 */         outE$iv = e$iv - 15 + 127;
/*     */       } 
/*     */     } 
/*     */     
/* 784 */     int out$iv = s$iv << 16 | outE$iv << 23 | outM$iv;
/* 785 */     int $i$f$floatFromBits = 0; return Float.intBitsToFloat(out$iv); } public static int compareTo-41bOqos(short arg0, short other) { if (isNaN-impl(arg0)) return isNaN-impl(other) ? 0 : 1;  if (isNaN-impl(other))
/* 786 */       return -1;  short value$iv = arg0; int $i$f$toCompareValue = 0; value$iv = other; $i$f$toCompareValue = 0; return Intrinsics.compare(((value$iv & 0x8000) != 0) ? (
/* 787 */         32768 - (value$iv & 0xFFFF)) : (
/*     */         
/* 789 */         value$iv & 0xFFFF), ((value$iv & 0x8000) != 0) ? (32768 - (value$iv & 0xFFFF)) : (value$iv & 0xFFFF)); }
/*     */ 
/*     */   
/*     */   public static final double toDouble-impl(short arg0) {
/*     */     return toFloat-impl(arg0);
/*     */   }
/*     */   
/*     */   public static final int toBits-impl(short arg0) {
/*     */     return isNaN-impl(arg0) ? NaN : (arg0 & 0xFFFF);
/*     */   }
/*     */   
/*     */   public static final int toRawBits-impl(short arg0) {
/*     */     return arg0 & 0xFFFF;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static String toString-impl(short arg0) {
/*     */     return String.valueOf(toFloat-impl(arg0));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return toString-impl(this.halfValue);
/*     */   }
/*     */   
/*     */   public int compareTo-41bOqos(short other) {
/*     */     return compareTo-41bOqos(this.halfValue, other);
/*     */   }
/*     */   
/*     */   public static final short getSign-slo4al4(short arg0) {
/*     */     return isNaN-impl(arg0) ? NaN : ((compareTo-41bOqos(arg0, NegativeZero) < 0) ? Float16Kt.access$getNegativeOne$p() : ((compareTo-41bOqos(arg0, PositiveZero) > 0) ? Float16Kt.access$getOne$p() : arg0));
/*     */   }
/*     */   
/*     */   public static final short withSign-qCeQghg(short arg0, short sign) {
/*     */     return constructor-impl((short)(sign & 0x8000 | arg0 & Short.MAX_VALUE));
/*     */   }
/*     */   
/*     */   public static final short absoluteValue-slo4al4(short arg0) {
/*     */     return constructor-impl((short)(arg0 & Short.MAX_VALUE));
/*     */   }
/*     */   
/*     */   public static final short round-slo4al4(short arg0) {
/*     */     int bits = arg0 & 0xFFFF;
/*     */     int e = bits & 0x7FFF;
/*     */     int result = bits;
/*     */     if (e < 15360) {
/*     */       result &= 0x8000;
/*     */       result |= 0x3C00 & ((e >= 14336) ? 65535 : 0);
/*     */     } else if (e < 25600) {
/*     */       e = 25 - (e >> 10);
/*     */       int mask = (1 << e) - 1;
/*     */       result += 1 << e - 1;
/*     */       result &= mask ^ 0xFFFFFFFF;
/*     */     } 
/*     */     return constructor-impl((short)result);
/*     */   }
/*     */   
/*     */   public static final short ceil-slo4al4(short arg0) {
/*     */     int bits = arg0 & 0xFFFF;
/*     */     int e = bits & 0x7FFF;
/*     */     int result = bits;
/*     */     if (e < 15360) {
/*     */       result &= 0x8000;
/*     */       result |= 0x3C00 & -((bits >> 15 ^ 0xFFFFFFFF) & ((e != 0) ? 1 : 0));
/*     */     } else if (e < 25600) {
/*     */       e = 25 - (e >> 10);
/*     */       int mask = (1 << e) - 1;
/*     */       result += mask & (bits >> 15) - 1;
/*     */       result &= mask ^ 0xFFFFFFFF;
/*     */     } 
/*     */     return constructor-impl((short)result);
/*     */   }
/*     */   
/*     */   public static final short floor-slo4al4(short arg0) {
/*     */     int bits = arg0 & 0xFFFF;
/*     */     int e = bits & 0x7FFF;
/*     */     int result = bits;
/*     */     if (e < 15360) {
/*     */       result &= 0x8000;
/*     */       result |= 0x3C00 & ((bits > 32768) ? 65535 : 0);
/*     */     } else if (e < 25600) {
/*     */       e = 25 - (e >> 10);
/*     */       int mask = (1 << e) - 1;
/*     */       result += mask & -(bits >> 15);
/*     */       result &= mask ^ 0xFFFFFFFF;
/*     */     } 
/*     */     return constructor-impl((short)result);
/*     */   }
/*     */   
/*     */   public static final short trunc-slo4al4(short arg0) {
/*     */     int bits = arg0 & 0xFFFF;
/*     */     int e = bits & 0x7FFF;
/*     */     int result = bits;
/*     */     if (e < 15360) {
/*     */       result &= 0x8000;
/*     */     } else if (e < 25600) {
/*     */       e = 25 - (e >> 10);
/*     */       int mask = (1 << e) - 1;
/*     */       result &= mask ^ 0xFFFFFFFF;
/*     */     } 
/*     */     return constructor-impl((short)result);
/*     */   }
/*     */   
/*     */   public static final int getExponent-impl(short arg0) {
/*     */     return (arg0 >>> 10 & 0x1F) - 15;
/*     */   }
/*     */   
/*     */   public static final int getSignificand-impl(short arg0) {
/*     */     return arg0 & 0x3FF;
/*     */   }
/*     */   
/*     */   public static final boolean isNaN-impl(short arg0) {
/*     */     return ((arg0 & Short.MAX_VALUE) > 31744);
/*     */   }
/*     */   
/*     */   public static final boolean isInfinite-impl(short arg0) {
/*     */     return ((arg0 & Short.MAX_VALUE) == 31744);
/*     */   }
/*     */   
/*     */   public static final boolean isFinite-impl(short arg0) {
/*     */     return ((arg0 & Short.MAX_VALUE) != 31744);
/*     */   }
/*     */   
/*     */   public static final boolean isNormalized-impl(short arg0) {
/*     */     return ((arg0 & 0x7C00) != 0 && (arg0 & 0x7C00) != 31744);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String toHexString-impl(short arg0) {
/*     */     StringBuilder o = new StringBuilder();
/*     */     int bits = arg0 & 0xFFFF;
/*     */     int s = bits >>> 15;
/*     */     int e = bits >>> 10 & 0x1F;
/*     */     int m = bits & 0x3FF;
/*     */     if (e == 31) {
/*     */       if (m == 0) {
/*     */         if (s != 0)
/*     */           o.append('-'); 
/*     */         o.append("Infinity");
/*     */       } else {
/*     */         o.append("NaN");
/*     */       } 
/*     */     } else {
/*     */       if (s == 1)
/*     */         o.append('-'); 
/*     */       if (e == 0) {
/*     */         if (m == 0) {
/*     */           o.append("0x0.0p0");
/*     */         } else {
/*     */           o.append("0x0.");
/*     */           Intrinsics.checkNotNullExpressionValue(Integer.toString(m, CharsKt.checkRadix(16)), "toString(...)");
/*     */           String significand = Integer.toString(m, CharsKt.checkRadix(16));
/*     */           String str1 = significand;
/*     */           Regex regex = new Regex("0{2,}$");
/*     */           String str2 = "";
/*     */           o.append(regex.replaceFirst(str1, str2));
/*     */           o.append("p-14");
/*     */         } 
/*     */       } else {
/*     */         o.append("0x1.");
/*     */         Intrinsics.checkNotNullExpressionValue(Integer.toString(m, CharsKt.checkRadix(16)), "toString(...)");
/*     */         String significand = Integer.toString(m, CharsKt.checkRadix(16));
/*     */         String str1 = significand;
/*     */         Regex regex = new Regex("0{2,}$");
/*     */         String str2 = "";
/*     */         o.append(regex.replaceFirst(str1, str2));
/*     */         o.append('p');
/*     */         o.append(String.valueOf(e - 15));
/*     */       } 
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(o.toString(), "toString(...)");
/*     */     return o.toString();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\023\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\t\020\006R\016\020\n\032\0020\013XT¢\006\002\n\000R\031\020\f\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\r\020\006R\016\020\016\032\0020\013XT¢\006\002\n\000R\031\020\017\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\020\020\006R\031\020\021\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\022\020\006R\031\020\023\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\024\020\006R\031\020\025\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\026\020\006R\031\020\027\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\030\020\006R\031\020\031\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\032\020\006R\031\020\033\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\034\020\006R\016\020\035\032\0020\013XT¢\006\002\n\000\002\013\n\005\b¡\0360\001\n\002\b!¨\006\036"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", "S", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeZero", "getNegativeZero-slo4al4", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "ui-graphics"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final short getEpsilon-slo4al4() {
/*     */       return Float16.Epsilon;
/*     */     }
/*     */     
/*     */     public final short getLowestValue-slo4al4() {
/*     */       return Float16.LowestValue;
/*     */     }
/*     */     
/*     */     public final short getMaxValue-slo4al4() {
/*     */       return Float16.MaxValue;
/*     */     }
/*     */     
/*     */     public final short getMinNormal-slo4al4() {
/*     */       return Float16.MinNormal;
/*     */     }
/*     */     
/*     */     public final short getMinValue-slo4al4() {
/*     */       return Float16.MinValue;
/*     */     }
/*     */     
/*     */     public final short getNaN-slo4al4() {
/*     */       return Float16.NaN;
/*     */     }
/*     */     
/*     */     public final short getNegativeInfinity-slo4al4() {
/*     */       return Float16.NegativeInfinity;
/*     */     }
/*     */     
/*     */     public final short getNegativeZero-slo4al4() {
/*     */       return Float16.NegativeZero;
/*     */     }
/*     */     
/*     */     public final short getPositiveInfinity-slo4al4() {
/*     */       return Float16.PositiveInfinity;
/*     */     }
/*     */     
/*     */     public final short getPositiveZero-slo4al4() {
/*     */       return Float16.PositiveZero;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   private final short halfValue;
/*     */   public static final int Size = 16;
/*     */   private static final short Epsilon = constructor-impl((short)5120);
/*     */   public static final int MaxExponent = 15;
/*     */   public static final int MinExponent = -14;
/*     */   private static final short LowestValue = constructor-impl((short)-1025);
/*     */   private static final short MaxValue = constructor-impl((short)31743);
/*     */   private static final short MinNormal = constructor-impl((short)1024);
/*     */   private static final short MinValue = constructor-impl((short)1);
/*     */   private static final short NaN = constructor-impl((short)32256);
/*     */   private static final short NegativeInfinity = constructor-impl((short)-1024);
/*     */   private static final short NegativeZero = constructor-impl(-32768);
/*     */   private static final short PositiveInfinity = constructor-impl((short)31744);
/*     */   private static final short PositiveZero = constructor-impl((short)0);
/*     */   
/*     */   public static int hashCode-impl(short arg0) {
/*     */     return Short.hashCode(arg0);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return hashCode-impl(this.halfValue);
/*     */   }
/*     */   
/*     */   public static boolean equals-impl(short arg0, Object other) {
/*     */     if (!(other instanceof Float16))
/*     */       return false; 
/*     */     short s = ((Float16)other).unbox-impl();
/*     */     return !(arg0 != s);
/*     */   }
/*     */   
/*     */   public boolean equals(Object other) {
/*     */     return equals-impl(this.halfValue, other);
/*     */   }
/*     */   
/*     */   public static short constructor-impl(short halfValue) {
/*     */     return halfValue;
/*     */   }
/*     */   
/*     */   public static final boolean equals-impl0(short p1, short p2) {
/*     */     return (p1 == p2);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Float16.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */