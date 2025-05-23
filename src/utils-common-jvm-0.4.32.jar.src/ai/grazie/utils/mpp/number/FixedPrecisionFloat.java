/*     */ package ai.grazie.utils.mpp.number;
/*     */ 
/*     */ import ai.grazie.utils.StringValueClassSerializer;
/*     */ import ai.grazie.utils.mpp.MPPComparable;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable(with = FixedPrecisionFloat.Serializer.class)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\020\t\n\002\b\005\n\002\020\006\n\000\n\002\020\007\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\t\n\002\020\013\n\002\020\000\n\002\b\r\b\007\030\000 &2\b\022\004\022\0020\0000\001:\002&'B\027\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\002\020\005B\037\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\006\032\0020\003¢\006\002\020\007B\017\b\027\022\006\020\b\032\0020\t¢\006\002\020\nB\017\b\027\022\006\020\b\032\0020\013¢\006\002\020\fB\017\b\027\022\006\020\b\032\0020\r¢\006\002\020\016B\017\b\027\022\006\020\b\032\0020\003¢\006\002\020\017B\017\b\027\022\006\020\b\032\0020\020¢\006\002\020\021J\006\020\025\032\0020\tJ\006\020\026\032\0020\013J\021\020\027\032\0020\r2\006\020\030\032\0020\000H\002J\023\020\031\032\0020\0322\b\020\030\032\004\030\0010\033H\002J\b\020\034\032\0020\rH\026J\006\020\035\032\0020\032J\021\020\036\032\0020\0002\006\020\030\032\0020\000H\002J\021\020\037\032\0020\0002\006\020\030\032\0020\000H\002J\021\020 \032\0020\0002\006\020!\032\0020\rH\004J\021\020\"\032\0020\0002\006\020\030\032\0020\rH\002J\b\020#\032\0020\020H\026J\006\020$\032\0020\020J\006\020%\032\0020\020R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\022\020\023R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\024\020\023¨\006("}, d2 = {"Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "Lai/grazie/utils/mpp/MPPComparable;", "integer", "", "fraction", "(JJ)V", "exponent", "(JJJ)V", "value", "", "(D)V", "", "(F)V", "", "(I)V", "(J)V", "", "(Ljava/lang/String;)V", "getFraction$utils_common", "()J", "getInteger$utils_common", "asDouble", "asFloat", "compareTo", "other", "equals", "", "", "hashCode", "isZero", "minus", "plus", "shr", "count", "times", "toString", "toStringFraction", "toStringInteger", "Companion", "Serializer", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nFixedPrecisionFloat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FixedPrecisionFloat.kt\nai/grazie/utils/mpp/number/FixedPrecisionFloat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,180:1\n1#2:181\n142#3:182\n131#3,5:183\n*S KotlinDebug\n*F\n+ 1 FixedPrecisionFloat.kt\nai/grazie/utils/mpp/number/FixedPrecisionFloat\n*L\n156#1:182\n156#1:183,5\n*E\n"})
/*     */ public final class FixedPrecisionFloat implements MPPComparable<FixedPrecisionFloat> {
/*     */   public final long getInteger$utils_common() {
/*  23 */     return this.integer; } public final long getFraction$utils_common() {
/*  24 */     return this.fraction;
/*     */   }
/*     */ 
/*     */   
/*     */   public FixedPrecisionFloat(long integer, long fraction) {
/*  29 */     this.integer = integer + fraction / 1000000000000L;
/*  30 */     this.fraction = fraction % 1000000000000L;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FixedPrecisionFloat(long integer, long fraction, long exponent) {
/*  41 */     this(integer, fraction * 1000000000000L / exponent);
/*     */   }
/*     */   public FixedPrecisionFloat(double value) {
/*  44 */     this((long)value, (long)(value % true * 1000000000000L));
/*     */   }
/*     */   public FixedPrecisionFloat(float value) {
/*  47 */     this((long)value, (long)(value % true * (float)1000000000000L));
/*     */   }
/*     */   public FixedPrecisionFloat(int value) {
/*  50 */     this(value, 0L);
/*     */   }
/*     */   public FixedPrecisionFloat(long value) {
/*  53 */     this(value, 0L);
/*     */   }
/*     */   
/*     */   public FixedPrecisionFloat(@NotNull String value) {
/*  57 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = '.'; List<String> list = StringsKt.split$default(StringsKt.replace$default(value, "_", "", false, 4, null), arrayOfChar, false, 0, 6, null); String integer = list.get(0), fraction = list.get(1);
/*  58 */     this.integer = Long.parseLong(integer);
/*  59 */     this.fraction = Long.parseLong(StringsKt.padEnd(fraction, 12, '0'));
/*     */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/utils/mpp/number/FixedPrecisionFloat$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "()V", "utils-common"})
/*     */   public static final class Serializer extends StringValueClassSerializer<FixedPrecisionFloat> { @NotNull
/*     */     public static final Serializer INSTANCE = new Serializer();
/*  63 */     private Serializer() { super("FixedPrecisionFloat", null.INSTANCE, null.INSTANCE); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\t\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\013\032\b\022\004\022\0020\b0\fHÆ\001R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\006XT¢\006\002\n\000R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\r"}, d2 = {"Lai/grazie/utils/mpp/number/FixedPrecisionFloat$Companion;", "", "()V", "EXPONENT", "", "PRECISION", "", "ZERO", "Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "getZERO", "()Lai/grazie/utils/mpp/number/FixedPrecisionFloat;", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*     */   public static final class Companion { @NotNull
/*  65 */     public final KSerializer<FixedPrecisionFloat> serializer() { return (KSerializer<FixedPrecisionFloat>)FixedPrecisionFloat.Serializer.INSTANCE; }
/*     */      private Companion() {}
/*     */     @NotNull
/*     */     public final FixedPrecisionFloat getZERO() {
/*  69 */       return FixedPrecisionFloat.ZERO; } } @NotNull public static final Companion Companion = new Companion(null); private final long integer; private final long fraction; public static final long EXPONENT = 1000000000000L; public static final int PRECISION = 12; @NotNull private static final FixedPrecisionFloat ZERO = new FixedPrecisionFloat(0L, 0L);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float asFloat() {
/*  76 */     return (float)this.integer + (float)this.fraction / 1.0E12F;
/*     */   }
/*     */ 
/*     */   
/*     */   public final double asDouble() {
/*  81 */     return this.integer + this.fraction / 1.0E12D;
/*     */   } @NotNull
/*     */   public final FixedPrecisionFloat plus(@NotNull FixedPrecisionFloat other) {
/*  84 */     Intrinsics.checkNotNullParameter(other, "other"); long fraction = this.fraction + other.fraction;
/*  85 */     long integer = this.integer + other.integer + fraction / 1000000000000L;
/*  86 */     return new FixedPrecisionFloat(integer, fraction % 1000000000000L);
/*     */   }
/*     */   @NotNull
/*     */   public final FixedPrecisionFloat times(int other) {
/*  90 */     long fraction = this.fraction * other % 1000000000000L;
/*  91 */     long integer = this.integer * other + this.fraction * other / 1000000000000L;
/*  92 */     return new FixedPrecisionFloat(integer, fraction % 1000000000000L);
/*     */   }
/*     */   @NotNull
/*     */   public final FixedPrecisionFloat minus(@NotNull FixedPrecisionFloat other) {
/*  96 */     Intrinsics.checkNotNullParameter(other, "other"); long fraction = this.fraction - other.fraction;
/*  97 */     if (fraction >= 0L) {
/*  98 */       return new FixedPrecisionFloat(this.integer - other.integer, fraction);
/*     */     }
/* 100 */     if (fraction < 0L) {
/* 101 */       return new FixedPrecisionFloat(this.integer - other.integer - 1L, fraction + 1000000000000L);
/*     */     }
/* 103 */     long integer = this.integer - other.integer - fraction / 1000000000000L;
/* 104 */     return new FixedPrecisionFloat(integer, fraction % 1000000000000L);
/*     */   }
/*     */   public final boolean isZero() {
/* 107 */     return (this.integer == 0L && this.fraction == 0L);
/*     */   }
/*     */   public int compareTo(@NotNull FixedPrecisionFloat other) {
/* 110 */     Intrinsics.checkNotNullParameter(other, "other"); if (this.integer != other.integer) {
/* 111 */       return Intrinsics.compare(this.integer, other.integer);
/*     */     }
/* 113 */     return Intrinsics.compare(this.fraction, other.fraction);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final FixedPrecisionFloat shr(int count) {
/*     */     // Byte code:
/*     */     //   0: iload_1
/*     */     //   1: iflt -> 8
/*     */     //   4: iconst_1
/*     */     //   5: goto -> 9
/*     */     //   8: iconst_0
/*     */     //   9: ifne -> 29
/*     */     //   12: iconst_0
/*     */     //   13: istore_3
/*     */     //   14: ldc 'Shift count must be non-negative'
/*     */     //   16: astore_3
/*     */     //   17: new java/lang/IllegalArgumentException
/*     */     //   20: dup
/*     */     //   21: aload_3
/*     */     //   22: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   25: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   28: athrow
/*     */     //   29: iload_1
/*     */     //   30: bipush #12
/*     */     //   32: if_icmpgt -> 39
/*     */     //   35: iconst_1
/*     */     //   36: goto -> 40
/*     */     //   39: iconst_0
/*     */     //   40: ifne -> 60
/*     */     //   43: iconst_0
/*     */     //   44: istore_3
/*     */     //   45: ldc 'Shift count must not be bigger than 12'
/*     */     //   47: astore_3
/*     */     //   48: new java/lang/IllegalArgumentException
/*     */     //   51: dup
/*     */     //   52: aload_3
/*     */     //   53: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   56: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   59: athrow
/*     */     //   60: iconst_0
/*     */     //   61: istore_2
/*     */     //   62: iconst_1
/*     */     //   63: istore_2
/*     */     //   64: iconst_0
/*     */     //   65: istore_3
/*     */     //   66: iload_3
/*     */     //   67: iload_1
/*     */     //   68: if_icmpge -> 89
/*     */     //   71: iload_3
/*     */     //   72: istore #4
/*     */     //   74: iconst_0
/*     */     //   75: istore #5
/*     */     //   77: iload_2
/*     */     //   78: bipush #10
/*     */     //   80: imul
/*     */     //   81: istore_2
/*     */     //   82: nop
/*     */     //   83: iinc #3, 1
/*     */     //   86: goto -> 66
/*     */     //   89: aload_0
/*     */     //   90: getfield fraction : J
/*     */     //   93: iload_2
/*     */     //   94: i2l
/*     */     //   95: ldiv
/*     */     //   96: lstore_3
/*     */     //   97: lload_3
/*     */     //   98: iload_2
/*     */     //   99: i2l
/*     */     //   100: lmul
/*     */     //   101: aload_0
/*     */     //   102: getfield fraction : J
/*     */     //   105: lcmp
/*     */     //   106: ifne -> 113
/*     */     //   109: iconst_1
/*     */     //   110: goto -> 114
/*     */     //   113: iconst_0
/*     */     //   114: ifne -> 142
/*     */     //   117: iconst_0
/*     */     //   118: istore #6
/*     */     //   120: aload_0
/*     */     //   121: iload_1
/*     */     //   122: <illegal opcode> makeConcatWithConstants : (Lai/grazie/utils/mpp/number/FixedPrecisionFloat;I)Ljava/lang/String;
/*     */     //   127: astore #6
/*     */     //   129: new java/lang/IllegalArgumentException
/*     */     //   132: dup
/*     */     //   133: aload #6
/*     */     //   135: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   138: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   141: athrow
/*     */     //   142: aload_0
/*     */     //   143: getfield integer : J
/*     */     //   146: iload_2
/*     */     //   147: i2l
/*     */     //   148: ldiv
/*     */     //   149: lstore #5
/*     */     //   151: aload_0
/*     */     //   152: getfield integer : J
/*     */     //   155: iload_2
/*     */     //   156: i2l
/*     */     //   157: lrem
/*     */     //   158: ldc2_w 1000000000000
/*     */     //   161: iload_2
/*     */     //   162: i2l
/*     */     //   163: ldiv
/*     */     //   164: lmul
/*     */     //   165: lstore #7
/*     */     //   167: new ai/grazie/utils/mpp/number/FixedPrecisionFloat
/*     */     //   170: dup
/*     */     //   171: lload #5
/*     */     //   173: lload #7
/*     */     //   175: lload_3
/*     */     //   176: ladd
/*     */     //   177: invokespecial <init> : (JJ)V
/*     */     //   180: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #130	-> 0
/*     */     //   #181	-> 12
/*     */     //   #130	-> 14
/*     */     //   #130	-> 16
/*     */     //   #131	-> 29
/*     */     //   #181	-> 43
/*     */     //   #131	-> 45
/*     */     //   #131	-> 47
/*     */     //   #133	-> 60
/*     */     //   #134	-> 64
/*     */     //   #135	-> 77
/*     */     //   #136	-> 82
/*     */     //   #134	-> 83
/*     */     //   #138	-> 89
/*     */     //   #140	-> 97
/*     */     //   #181	-> 117
/*     */     //   #140	-> 120
/*     */     //   #140	-> 127
/*     */     //   #142	-> 142
/*     */     //   #143	-> 151
/*     */     //   #145	-> 167
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   14	2	3	$i$a$-require-FixedPrecisionFloat$shr$1	I
/*     */     //   45	2	3	$i$a$-require-FixedPrecisionFloat$shr$2	I
/*     */     //   77	6	5	$i$a$-repeat-FixedPrecisionFloat$shr$3	I
/*     */     //   74	9	4	it	I
/*     */     //   120	7	6	$i$a$-require-FixedPrecisionFloat$shr$4	I
/*     */     //   62	119	2	exponent	I
/*     */     //   97	84	3	bottomFraction	J
/*     */     //   151	30	5	newInteger	J
/*     */     //   167	14	7	topFraction	J
/*     */     //   0	181	0	this	Lai/grazie/utils/mpp/number/FixedPrecisionFloat;
/*     */     //   0	181	1	count	I
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String toStringInteger() {
/* 151 */     return String.valueOf(this.integer);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String toStringFraction() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield fraction : J
/*     */     //   4: invokestatic valueOf : (J)Ljava/lang/String;
/*     */     //   7: bipush #12
/*     */     //   9: bipush #48
/*     */     //   11: invokestatic padStart : (Ljava/lang/String;IC)Ljava/lang/String;
/*     */     //   14: astore_1
/*     */     //   15: iconst_0
/*     */     //   16: istore_2
/*     */     //   17: aload_1
/*     */     //   18: checkcast java/lang/CharSequence
/*     */     //   21: astore_3
/*     */     //   22: iconst_0
/*     */     //   23: istore #4
/*     */     //   25: aload_3
/*     */     //   26: invokeinterface length : ()I
/*     */     //   31: iconst_m1
/*     */     //   32: iadd
/*     */     //   33: istore #5
/*     */     //   35: iconst_0
/*     */     //   36: iload #5
/*     */     //   38: if_icmpgt -> 96
/*     */     //   41: iload #5
/*     */     //   43: istore #6
/*     */     //   45: iinc #5, -1
/*     */     //   48: aload_3
/*     */     //   49: iload #6
/*     */     //   51: invokeinterface charAt : (I)C
/*     */     //   56: istore #7
/*     */     //   58: iconst_0
/*     */     //   59: istore #8
/*     */     //   61: iload #7
/*     */     //   63: bipush #48
/*     */     //   65: if_icmpne -> 72
/*     */     //   68: iconst_1
/*     */     //   69: goto -> 73
/*     */     //   72: iconst_0
/*     */     //   73: ifne -> 90
/*     */     //   76: aload_3
/*     */     //   77: iconst_0
/*     */     //   78: iload #6
/*     */     //   80: iconst_1
/*     */     //   81: iadd
/*     */     //   82: invokeinterface subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   87: goto -> 101
/*     */     //   90: iconst_0
/*     */     //   91: iload #5
/*     */     //   93: if_icmple -> 41
/*     */     //   96: ldc ''
/*     */     //   98: checkcast java/lang/CharSequence
/*     */     //   101: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   104: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #156	-> 0
/*     */     //   #182	-> 17
/*     */     //   #183	-> 25
/*     */     //   #184	-> 48
/*     */     //   #156	-> 61
/*     */     //   #184	-> 73
/*     */     //   #185	-> 76
/*     */     //   #183	-> 90
/*     */     //   #187	-> 96
/*     */     //   #182	-> 101
/*     */     //   #156	-> 104
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   61	12	8	$i$a$-trimEnd-FixedPrecisionFloat$toStringFraction$1	I
/*     */     //   58	15	7	it	C
/*     */     //   45	51	6	index$iv$iv	I
/*     */     //   25	76	4	$i$f$trimEnd	I
/*     */     //   22	79	3	$this$trimEnd$iv$iv	Ljava/lang/CharSequence;
/*     */     //   17	87	2	$i$f$trimEnd	I
/*     */     //   15	89	1	$this$trimEnd$iv	Ljava/lang/String;
/*     */     //   0	105	0	this	Lai/grazie/utils/mpp/number/FixedPrecisionFloat;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/* 161 */     return toStringInteger() + "." + toStringInteger();
/*     */   }
/*     */   public boolean equals(@Nullable Object other) {
/* 164 */     if (this == other) return true; 
/* 165 */     if (other == null || getClass() != other.getClass()) return false;
/*     */     
/* 167 */     (FixedPrecisionFloat)other;
/*     */     
/* 169 */     if (this.integer != ((FixedPrecisionFloat)other).integer) return false; 
/* 170 */     return (this.fraction == ((FixedPrecisionFloat)other).fraction);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 174 */     int result = Long.hashCode(this.integer);
/* 175 */     result = 31 * result + Long.hashCode(this.fraction);
/* 176 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\number\FixedPrecisionFloat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */