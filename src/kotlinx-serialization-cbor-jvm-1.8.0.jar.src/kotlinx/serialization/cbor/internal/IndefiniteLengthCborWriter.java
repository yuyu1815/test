/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.cbor.Cbor;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\r2\006\020\n\032\0020\013H\026J\b\020\016\032\0020\005H\024J\b\020\017\032\0020\rH\024¨\006\020"}, d2 = {"Lkotlinx/serialization/cbor/internal/IndefiniteLengthCborWriter;", "Lkotlinx/serialization/cbor/internal/CborWriter;", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "output", "Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "<init>", "(Lkotlinx/serialization/cbor/Cbor;Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "endStructure", "", "getDestination", "incrementChildren", "kotlinx-serialization-cbor"})
/*     */ @SourceDebugExtension({"SMAP\nEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoder.kt\nkotlinx/serialization/cbor/internal/IndefiniteLengthCborWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n1863#2,2:334\n*S KotlinDebug\n*F\n+ 1 Encoder.kt\nkotlinx/serialization/cbor/internal/IndefiniteLengthCborWriter\n*L\n155#1:334,2\n*E\n"})
/*     */ public final class IndefiniteLengthCborWriter
/*     */   extends CborWriter
/*     */ {
/*     */   public IndefiniteLengthCborWriter(@NotNull Cbor cbor, @NotNull ByteArrayOutput output) {
/* 150 */     super(
/* 151 */         cbor, output, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'descriptor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual getCbor : ()Lkotlinx/serialization/cbor/Cbor;
/*     */     //   10: invokevirtual getConfiguration : ()Lkotlinx/serialization/cbor/CborConfiguration;
/*     */     //   13: invokevirtual getEncodeObjectTags : ()Z
/*     */     //   16: ifeq -> 97
/*     */     //   19: aload_1
/*     */     //   20: invokestatic getObjectTags : (Lkotlinx/serialization/descriptors/SerialDescriptor;)[J
/*     */     //   23: dup
/*     */     //   24: ifnull -> 95
/*     */     //   27: invokestatic box-impl : ([J)Lkotlin/ULongArray;
/*     */     //   30: checkcast java/lang/Iterable
/*     */     //   33: astore_3
/*     */     //   34: iconst_0
/*     */     //   35: istore #4
/*     */     //   37: aload_3
/*     */     //   38: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   43: astore #5
/*     */     //   45: aload #5
/*     */     //   47: invokeinterface hasNext : ()Z
/*     */     //   52: ifeq -> 91
/*     */     //   55: aload #5
/*     */     //   57: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   62: astore #6
/*     */     //   64: aload #6
/*     */     //   66: checkcast kotlin/ULong
/*     */     //   69: invokevirtual unbox-impl : ()J
/*     */     //   72: lstore #7
/*     */     //   74: iconst_0
/*     */     //   75: istore #9
/*     */     //   77: aload_0
/*     */     //   78: invokevirtual getOutput : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   81: lload #7
/*     */     //   83: invokestatic access$encodeTag-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   86: nop
/*     */     //   87: nop
/*     */     //   88: goto -> 45
/*     */     //   91: nop
/*     */     //   92: goto -> 97
/*     */     //   95: pop
/*     */     //   96: nop
/*     */     //   97: aload_1
/*     */     //   98: invokestatic hasArrayTag : (Lkotlinx/serialization/descriptors/SerialDescriptor;)Z
/*     */     //   101: ifeq -> 114
/*     */     //   104: aload_0
/*     */     //   105: invokevirtual getOutput : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   108: invokestatic access$startArray : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V
/*     */     //   111: goto -> 172
/*     */     //   114: aload_1
/*     */     //   115: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   120: astore_2
/*     */     //   121: aload_2
/*     */     //   122: getstatic kotlinx/serialization/descriptors/StructureKind$LIST.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$LIST;
/*     */     //   125: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   128: ifne -> 138
/*     */     //   131: aload_2
/*     */     //   132: instanceof kotlinx/serialization/descriptors/PolymorphicKind
/*     */     //   135: ifeq -> 148
/*     */     //   138: aload_0
/*     */     //   139: invokevirtual getOutput : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   142: invokestatic access$startArray : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V
/*     */     //   145: goto -> 172
/*     */     //   148: aload_2
/*     */     //   149: instanceof kotlinx/serialization/descriptors/StructureKind$MAP
/*     */     //   152: ifeq -> 165
/*     */     //   155: aload_0
/*     */     //   156: invokevirtual getOutput : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   159: invokestatic access$startMap : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V
/*     */     //   162: goto -> 172
/*     */     //   165: aload_0
/*     */     //   166: invokevirtual getOutput : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   169: invokestatic access$startMap : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V
/*     */     //   172: aload_0
/*     */     //   173: checkcast kotlinx/serialization/encoding/CompositeEncoder
/*     */     //   176: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #155	-> 6
/*     */     //   #334	-> 37
/*     */     //   #156	-> 77
/*     */     //   #157	-> 86
/*     */     //   #334	-> 87
/*     */     //   #335	-> 91
/*     */     //   #155	-> 95
/*     */     //   #158	-> 97
/*     */     //   #159	-> 104
/*     */     //   #161	-> 114
/*     */     //   #162	-> 121
/*     */     //   #163	-> 148
/*     */     //   #164	-> 165
/*     */     //   #167	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   77	10	9	$i$a$-forEach-IndefiniteLengthCborWriter$beginStructure$1	I
/*     */     //   74	13	7	it	J
/*     */     //   64	24	6	element$iv	Ljava/lang/Object;
/*     */     //   37	55	4	$i$f$forEach	I
/*     */     //   34	58	3	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   0	177	0	this	Lkotlinx/serialization/cbor/internal/IndefiniteLengthCborWriter;
/*     */     //   0	177	1	descriptor	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void endStructure(@NotNull SerialDescriptor descriptor) {
/* 171 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); EncoderKt.end(getOutput());
/*     */   } @NotNull
/*     */   protected ByteArrayOutput getDestination() {
/* 174 */     return getOutput();
/*     */   }
/*     */   
/*     */   protected void incrementChildren() {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\IndefiniteLengthCborWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */