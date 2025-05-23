/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.cbor.Cbor;
/*     */ import kotlinx.serialization.cbor.CborEncoder;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.AbstractEncoder;
/*     */ import kotlinx.serialization.modules.SerializersModule;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\b\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\000\n\002\020\007\n\000\n\002\020\006\n\000\n\002\020\f\n\000\n\002\020\005\n\000\n\002\020\n\n\002\b\002\n\002\020\t\n\002\b\006\n\002\030\002\n\002\030\002\n\000\b0\030\0002\0020\0012\0020\002:\001;B\031\b\004\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\b\020\025\032\0020\006H$J)\020\032\032\0020\033\"\004\b\000\020\0342\f\020\035\032\b\022\004\022\002H\0340\0362\006\020\037\032\002H\034H\026¢\006\002\020 J\030\020!\032\0020\0162\006\020\"\032\0020#2\006\020$\032\0020%H\026J\b\020&\032\0020\033H$J\020\020'\032\0020\0332\006\020\037\032\0020(H\026J\020\020)\032\0020\0332\006\020\037\032\0020*H\026J\020\020+\032\0020\0332\006\020\037\032\0020,H\026J\020\020-\032\0020\0332\006\020\037\032\0020.H\026J\020\020/\032\0020\0332\006\020\037\032\00200H\026J\020\0201\032\0020\0332\006\020\037\032\00202H\026J\020\0203\032\0020\0332\006\020\037\032\0020%H\026J\020\0204\032\0020\0332\006\020\037\032\00205H\026J\020\0206\032\0020\0332\006\020\037\032\0020\016H\026J\b\0207\032\0020\033H\026J\030\0208\032\0020\0332\006\0209\032\0020#2\006\020$\032\0020%H\026J\030\020:\032\0020\0162\006\020\"\032\0020#2\006\020$\032\0020%H\026R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\0020\016X\016¢\006\016\n\000\032\004\b\r\020\017\"\004\b\020\020\021R\032\020\022\032\0020\016X\016¢\006\016\n\000\032\004\b\023\020\017\"\004\b\024\020\021R\024\020\026\032\0020\0278VX\004¢\006\006\032\004\b\030\020\031\001\002<=¨\006>"}, d2 = {"Lkotlinx/serialization/cbor/internal/CborWriter;", "Lkotlinx/serialization/encoding/AbstractEncoder;", "Lkotlinx/serialization/cbor/CborEncoder;", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "output", "Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "<init>", "(Lkotlinx/serialization/cbor/Cbor;Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V", "getCbor", "()Lkotlinx/serialization/cbor/Cbor;", "getOutput", "()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "isClass", "", "()Z", "setClass", "(Z)V", "encodeByteArrayAsByteString", "getEncodeByteArrayAsByteString", "setEncodeByteArrayAsByteString", "getDestination", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "encodeSerializableValue", "", "T", "serializer", "Lkotlinx/serialization/SerializationStrategy;", "value", "(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V", "shouldEncodeElementDefault", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "incrementChildren", "encodeString", "", "encodeFloat", "", "encodeDouble", "", "encodeChar", "", "encodeByte", "", "encodeShort", "", "encodeInt", "encodeLong", "", "encodeBoolean", "encodeNull", "encodeEnum", "enumDescriptor", "encodeElement", "Data", "Lkotlinx/serialization/cbor/internal/DefiniteLengthCborWriter;", "Lkotlinx/serialization/cbor/internal/IndefiniteLengthCborWriter;", "kotlinx-serialization-cbor"})
/*     */ @SourceDebugExtension({"SMAP\nEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoder.kt\nkotlinx/serialization/cbor/internal/CborWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n1863#2,2:334\n1863#2,2:336\n*S KotlinDebug\n*F\n+ 1 Encoder.kt\nkotlinx/serialization/cbor/internal/CborWriter\n*L\n127#1:334,2\n141#1:336,2\n*E\n"})
/*     */ public abstract class CborWriter extends AbstractEncoder implements CborEncoder {
/*     */   @NotNull
/*     */   private final Cbor cbor;
/*     */   @NotNull
/*     */   private final ByteArrayOutput output;
/*     */   private boolean isClass;
/*     */   private boolean encodeByteArrayAsByteString;
/*     */   
/*     */   @NotNull
/*     */   public Cbor getCbor() {
/*  28 */     return this.cbor; } @NotNull
/*  29 */   protected final ByteArrayOutput getOutput() { return this.output; } private CborWriter(Cbor cbor, ByteArrayOutput output) { this.cbor = cbor; this.output = output; }
/*     */   
/*  31 */   protected final boolean isClass() { return this.isClass; } protected final void setClass(boolean <set-?>) { this.isClass = <set-?>; }
/*     */   
/*  33 */   protected final boolean getEncodeByteArrayAsByteString() { return this.encodeByteArrayAsByteString; } protected final void setEncodeByteArrayAsByteString(boolean <set-?>) { this.encodeByteArrayAsByteString = <set-?>; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\t\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\r¨\006\016"}, d2 = {"Lkotlinx/serialization/cbor/internal/CborWriter$Data;", "", "bytes", "Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "elementCount", "", "<init>", "(Lkotlinx/serialization/cbor/internal/ByteArrayOutput;I)V", "getBytes", "()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "getElementCount", "()I", "setElementCount", "(I)V", "kotlinx-serialization-cbor"})
/*     */   public static final class Data { @NotNull
/*  35 */     private final ByteArrayOutput bytes; public Data(@NotNull ByteArrayOutput bytes, int elementCount) { this.bytes = bytes; this.elementCount = elementCount; } private int elementCount; @NotNull public final ByteArrayOutput getBytes() { return this.bytes; } public final int getElementCount() { return this.elementCount; } public final void setElementCount(int <set-?>) { this.elementCount = <set-?>; }
/*     */      }
/*     */   
/*     */   @NotNull
/*     */   public SerializersModule getSerializersModule() {
/*  40 */     return getCbor().getSerializersModule();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public <T> void encodeSerializableValue(@NotNull SerializationStrategy serializer, Object value) {
/*  46 */     Intrinsics.checkNotNullParameter(serializer, "serializer"); if ((this.encodeByteArrayAsByteString || getCbor().getConfiguration().getAlwaysUseByteString()) && 
/*  47 */       Intrinsics.areEqual(serializer.getDescriptor(), BuiltinSerializersKt.ByteArraySerializer().getDescriptor())) {
/*     */       
/*  49 */       Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.ByteArray"); EncoderKt.encodeByteString(getDestination(), (byte[])value);
/*     */     } else {
/*  51 */       this.encodeByteArrayAsByteString = (this.encodeByteArrayAsByteString || EncodingKt.isInlineByteString(serializer.getDescriptor())); super
/*  52 */         .encodeSerializableValue(serializer, value);
/*     */     } 
/*     */   }
/*     */   
/*     */   public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
/*  57 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return getCbor().getConfiguration().getEncodeDefaults();
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeString(@NotNull String value) {
/*  62 */     Intrinsics.checkNotNullParameter(value, "value"); EncoderKt.encodeString(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeFloat(float value) {
/*  67 */     EncoderKt.encodeFloat(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeDouble(double value) {
/*  72 */     EncoderKt.encodeDouble(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeChar(char value) {
/*  77 */     EncoderKt.encodeNumber(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeByte(byte value) {
/*  82 */     EncoderKt.encodeNumber(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeShort(short value) {
/*  87 */     EncoderKt.encodeNumber(getDestination(), value);
/*     */   }
/*     */   
/*     */   public void encodeInt(int value) {
/*  91 */     EncoderKt.encodeNumber(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeLong(long value) {
/*  96 */     EncoderKt.encodeNumber(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeBoolean(boolean value) {
/* 101 */     EncoderKt.encodeBoolean(getDestination(), value);
/*     */   }
/*     */ 
/*     */   
/*     */   public void encodeNull() {
/* 106 */     if (this.isClass) { EncoderKt.encodeEmptyMap(getDestination()); }
/* 107 */     else { EncoderKt.encodeNull(getDestination()); }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
/* 115 */     Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor"); EncoderKt.encodeString(getDestination(), enumDescriptor.getElementName(index));
/*     */   }
/*     */   
/*     */   public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'descriptor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual getDestination : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   10: astore_3
/*     */     //   11: aload_0
/*     */     //   12: aload_1
/*     */     //   13: iload_2
/*     */     //   14: invokeinterface getElementDescriptor : (I)Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   19: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   24: getstatic kotlinx/serialization/descriptors/StructureKind$CLASS.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$CLASS;
/*     */     //   27: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   30: putfield isClass : Z
/*     */     //   33: aload_0
/*     */     //   34: aload_1
/*     */     //   35: iload_2
/*     */     //   36: invokestatic isByteString : (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z
/*     */     //   39: putfield encodeByteArrayAsByteString : Z
/*     */     //   42: aload_1
/*     */     //   43: iload_2
/*     */     //   44: invokeinterface getElementName : (I)Ljava/lang/String;
/*     */     //   49: astore #4
/*     */     //   51: aload_1
/*     */     //   52: invokestatic hasArrayTag : (Lkotlinx/serialization/descriptors/SerialDescriptor;)Z
/*     */     //   55: ifne -> 227
/*     */     //   58: aload_0
/*     */     //   59: invokevirtual getCbor : ()Lkotlinx/serialization/cbor/Cbor;
/*     */     //   62: invokevirtual getConfiguration : ()Lkotlinx/serialization/cbor/CborConfiguration;
/*     */     //   65: invokevirtual getEncodeKeyTags : ()Z
/*     */     //   68: ifeq -> 148
/*     */     //   71: aload_1
/*     */     //   72: iload_2
/*     */     //   73: invokestatic getKeyTags : (Lkotlinx/serialization/descriptors/SerialDescriptor;I)[J
/*     */     //   76: dup
/*     */     //   77: ifnull -> 146
/*     */     //   80: invokestatic box-impl : ([J)Lkotlin/ULongArray;
/*     */     //   83: checkcast java/lang/Iterable
/*     */     //   86: astore #6
/*     */     //   88: iconst_0
/*     */     //   89: istore #7
/*     */     //   91: aload #6
/*     */     //   93: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   98: astore #8
/*     */     //   100: aload #8
/*     */     //   102: invokeinterface hasNext : ()Z
/*     */     //   107: ifeq -> 142
/*     */     //   110: aload #8
/*     */     //   112: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   117: astore #9
/*     */     //   119: aload #9
/*     */     //   121: checkcast kotlin/ULong
/*     */     //   124: invokevirtual unbox-impl : ()J
/*     */     //   127: lstore #10
/*     */     //   129: iconst_0
/*     */     //   130: istore #12
/*     */     //   132: aload_3
/*     */     //   133: lload #10
/*     */     //   135: invokestatic access$encodeTag-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   138: nop
/*     */     //   139: goto -> 100
/*     */     //   142: nop
/*     */     //   143: goto -> 148
/*     */     //   146: pop
/*     */     //   147: nop
/*     */     //   148: aload_1
/*     */     //   149: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   154: instanceof kotlinx/serialization/descriptors/StructureKind$LIST
/*     */     //   157: ifne -> 227
/*     */     //   160: aload_1
/*     */     //   161: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   166: instanceof kotlinx/serialization/descriptors/StructureKind$MAP
/*     */     //   169: ifne -> 227
/*     */     //   172: aload_1
/*     */     //   173: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   178: instanceof kotlinx/serialization/descriptors/PolymorphicKind
/*     */     //   181: ifne -> 227
/*     */     //   184: aload_1
/*     */     //   185: iload_2
/*     */     //   186: invokestatic getCborLabel : (Lkotlinx/serialization/descriptors/SerialDescriptor;I)Ljava/lang/Long;
/*     */     //   189: astore #5
/*     */     //   191: aload_0
/*     */     //   192: invokevirtual getCbor : ()Lkotlinx/serialization/cbor/Cbor;
/*     */     //   195: invokevirtual getConfiguration : ()Lkotlinx/serialization/cbor/CborConfiguration;
/*     */     //   198: invokevirtual getPreferCborLabelsOverNames : ()Z
/*     */     //   201: ifeq -> 221
/*     */     //   204: aload #5
/*     */     //   206: ifnull -> 221
/*     */     //   209: aload_3
/*     */     //   210: aload #5
/*     */     //   212: invokevirtual longValue : ()J
/*     */     //   215: invokestatic encodeNumber : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   218: goto -> 227
/*     */     //   221: aload_3
/*     */     //   222: aload #4
/*     */     //   224: invokestatic encodeString : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;Ljava/lang/String;)V
/*     */     //   227: aload_0
/*     */     //   228: invokevirtual getCbor : ()Lkotlinx/serialization/cbor/Cbor;
/*     */     //   231: invokevirtual getConfiguration : ()Lkotlinx/serialization/cbor/CborConfiguration;
/*     */     //   234: invokevirtual getEncodeValueTags : ()Z
/*     */     //   237: ifeq -> 317
/*     */     //   240: aload_1
/*     */     //   241: iload_2
/*     */     //   242: invokestatic getValueTags : (Lkotlinx/serialization/descriptors/SerialDescriptor;I)[J
/*     */     //   245: dup
/*     */     //   246: ifnull -> 315
/*     */     //   249: invokestatic box-impl : ([J)Lkotlin/ULongArray;
/*     */     //   252: checkcast java/lang/Iterable
/*     */     //   255: astore #6
/*     */     //   257: iconst_0
/*     */     //   258: istore #7
/*     */     //   260: aload #6
/*     */     //   262: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   267: astore #8
/*     */     //   269: aload #8
/*     */     //   271: invokeinterface hasNext : ()Z
/*     */     //   276: ifeq -> 311
/*     */     //   279: aload #8
/*     */     //   281: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   286: astore #9
/*     */     //   288: aload #9
/*     */     //   290: checkcast kotlin/ULong
/*     */     //   293: invokevirtual unbox-impl : ()J
/*     */     //   296: lstore #10
/*     */     //   298: iconst_0
/*     */     //   299: istore #12
/*     */     //   301: aload_3
/*     */     //   302: lload #10
/*     */     //   304: invokestatic access$encodeTag-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   307: nop
/*     */     //   308: goto -> 269
/*     */     //   311: nop
/*     */     //   312: goto -> 317
/*     */     //   315: pop
/*     */     //   316: nop
/*     */     //   317: aload_0
/*     */     //   318: invokevirtual incrementChildren : ()V
/*     */     //   321: iconst_1
/*     */     //   322: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #119	-> 6
/*     */     //   #120	-> 11
/*     */     //   #121	-> 33
/*     */     //   #123	-> 42
/*     */     //   #126	-> 51
/*     */     //   #127	-> 58
/*     */     //   #334	-> 91
/*     */     //   #127	-> 132
/*     */     //   #334	-> 138
/*     */     //   #335	-> 142
/*     */     //   #127	-> 146
/*     */     //   #129	-> 148
/*     */     //   #131	-> 184
/*     */     //   #132	-> 191
/*     */     //   #133	-> 209
/*     */     //   #135	-> 221
/*     */     //   #140	-> 227
/*     */     //   #141	-> 240
/*     */     //   #336	-> 260
/*     */     //   #141	-> 301
/*     */     //   #336	-> 307
/*     */     //   #337	-> 311
/*     */     //   #141	-> 315
/*     */     //   #143	-> 317
/*     */     //   #144	-> 321
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   132	6	12	$i$a$-forEach-CborWriter$encodeElement$1	I
/*     */     //   129	9	10	it	J
/*     */     //   119	20	9	element$iv	Ljava/lang/Object;
/*     */     //   91	52	7	$i$f$forEach	I
/*     */     //   88	55	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   191	36	5	cborLabel	Ljava/lang/Long;
/*     */     //   301	6	12	$i$a$-forEach-CborWriter$encodeElement$2	I
/*     */     //   298	9	10	it	J
/*     */     //   288	20	9	element$iv	Ljava/lang/Object;
/*     */     //   260	52	7	$i$f$forEach	I
/*     */     //   257	55	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   11	312	3	destination	Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   51	272	4	name	Ljava/lang/String;
/*     */     //   0	323	0	this	Lkotlinx/serialization/cbor/internal/CborWriter;
/*     */     //   0	323	1	descriptor	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */     //   0	323	2	index	I
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected abstract ByteArrayOutput getDestination();
/*     */   
/*     */   protected abstract void incrementChildren();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\CborWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */