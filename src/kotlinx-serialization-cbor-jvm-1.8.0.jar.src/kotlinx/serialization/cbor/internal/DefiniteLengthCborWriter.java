/*     */ package kotlinx.serialization.cbor.internal;
/*     */ 
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020!\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\f\032\0020\005H\024J\b\020\r\032\0020\016H\024J\020\020\017\032\0020\0202\006\020\021\032\0020\022H\026J\020\020\023\032\0020\0162\006\020\021\032\0020\022H\026R\030\020\b\032\f\022\004\022\0020\n0\tj\002`\013X\004¢\006\002\n\000¨\006\024"}, d2 = {"Lkotlinx/serialization/cbor/internal/DefiniteLengthCborWriter;", "Lkotlinx/serialization/cbor/internal/CborWriter;", "cbor", "Lkotlinx/serialization/cbor/Cbor;", "output", "Lkotlinx/serialization/cbor/internal/ByteArrayOutput;", "<init>", "(Lkotlinx/serialization/cbor/Cbor;Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V", "structureStack", "", "Lkotlinx/serialization/cbor/internal/CborWriter$Data;", "Lkotlinx/serialization/cbor/internal/Stack;", "getDestination", "incrementChildren", "", "beginStructure", "Lkotlinx/serialization/encoding/CompositeEncoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "endStructure", "kotlinx-serialization-cbor"})
/*     */ @SourceDebugExtension({"SMAP\nEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encoder.kt\nkotlinx/serialization/cbor/internal/DefiniteLengthCborWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n1863#2,2:334\n*S KotlinDebug\n*F\n+ 1 Encoder.kt\nkotlinx/serialization/cbor/internal/DefiniteLengthCborWriter\n*L\n207#1:334,2\n*E\n"})
/*     */ public final class DefiniteLengthCborWriter
/*     */   extends CborWriter
/*     */ {
/*     */   @NotNull
/*     */   private final List<CborWriter.Data> structureStack;
/*     */   
/*     */   public DefiniteLengthCborWriter(@NotNull Cbor cbor, @NotNull ByteArrayOutput output) {
/* 183 */     super(cbor, output, null);
/*     */     
/* 185 */     this.structureStack = EncoderKt.access$Stack(new CborWriter.Data(output, -1)); } @NotNull
/*     */   protected ByteArrayOutput getDestination() {
/* 187 */     return EncoderKt.access$peek(this.structureStack).getBytes();
/*     */   }
/*     */   
/*     */   protected void incrementChildren() {
/* 191 */     CborWriter.Data data = EncoderKt.access$peek(this.structureStack); int i = data.getElementCount(); data.setElementCount(i + 1);
/*     */   }
/*     */   @NotNull
/*     */   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
/* 195 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); CborWriter.Data current = new CborWriter.Data(new ByteArrayOutput(), 0);
/* 196 */     EncoderKt.access$push(this.structureStack, current);
/* 197 */     return (CompositeEncoder)this;
/*     */   }
/*     */   
/*     */   public void endStructure(@NotNull SerialDescriptor descriptor) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'descriptor'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: getfield structureStack : Ljava/util/List;
/*     */     //   10: invokestatic access$pop : (Ljava/util/List;)Lkotlinx/serialization/cbor/internal/CborWriter$Data;
/*     */     //   13: astore_2
/*     */     //   14: aload_0
/*     */     //   15: invokevirtual getDestination : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   18: astore_3
/*     */     //   19: aload_2
/*     */     //   20: invokevirtual getElementCount : ()I
/*     */     //   23: istore #4
/*     */     //   25: aload_0
/*     */     //   26: invokevirtual getCbor : ()Lkotlinx/serialization/cbor/Cbor;
/*     */     //   29: invokevirtual getConfiguration : ()Lkotlinx/serialization/cbor/CborConfiguration;
/*     */     //   32: invokevirtual getEncodeObjectTags : ()Z
/*     */     //   35: ifeq -> 115
/*     */     //   38: aload_1
/*     */     //   39: invokestatic getObjectTags : (Lkotlinx/serialization/descriptors/SerialDescriptor;)[J
/*     */     //   42: dup
/*     */     //   43: ifnull -> 113
/*     */     //   46: invokestatic box-impl : ([J)Lkotlin/ULongArray;
/*     */     //   49: checkcast java/lang/Iterable
/*     */     //   52: astore #6
/*     */     //   54: iconst_0
/*     */     //   55: istore #7
/*     */     //   57: aload #6
/*     */     //   59: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   64: astore #8
/*     */     //   66: aload #8
/*     */     //   68: invokeinterface hasNext : ()Z
/*     */     //   73: ifeq -> 109
/*     */     //   76: aload #8
/*     */     //   78: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   83: astore #9
/*     */     //   85: aload #9
/*     */     //   87: checkcast kotlin/ULong
/*     */     //   90: invokevirtual unbox-impl : ()J
/*     */     //   93: lstore #10
/*     */     //   95: iconst_0
/*     */     //   96: istore #12
/*     */     //   98: aload_3
/*     */     //   99: lload #10
/*     */     //   101: invokestatic access$encodeTag-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   104: nop
/*     */     //   105: nop
/*     */     //   106: goto -> 66
/*     */     //   109: nop
/*     */     //   110: goto -> 115
/*     */     //   113: pop
/*     */     //   114: nop
/*     */     //   115: aload_1
/*     */     //   116: invokestatic hasArrayTag : (Lkotlinx/serialization/descriptors/SerialDescriptor;)Z
/*     */     //   119: ifeq -> 135
/*     */     //   122: aload_3
/*     */     //   123: iload #4
/*     */     //   125: i2l
/*     */     //   126: invokestatic constructor-impl : (J)J
/*     */     //   129: invokestatic access$startArray-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   132: goto -> 208
/*     */     //   135: aload_1
/*     */     //   136: invokeinterface getKind : ()Lkotlinx/serialization/descriptors/SerialKind;
/*     */     //   141: astore #5
/*     */     //   143: aload #5
/*     */     //   145: getstatic kotlinx/serialization/descriptors/StructureKind$LIST.INSTANCE : Lkotlinx/serialization/descriptors/StructureKind$LIST;
/*     */     //   148: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   151: ifne -> 162
/*     */     //   154: aload #5
/*     */     //   156: instanceof kotlinx/serialization/descriptors/PolymorphicKind
/*     */     //   159: ifeq -> 175
/*     */     //   162: aload_3
/*     */     //   163: iload #4
/*     */     //   165: i2l
/*     */     //   166: invokestatic constructor-impl : (J)J
/*     */     //   169: invokestatic access$startArray-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   172: goto -> 208
/*     */     //   175: aload #5
/*     */     //   177: instanceof kotlinx/serialization/descriptors/StructureKind$MAP
/*     */     //   180: ifeq -> 198
/*     */     //   183: aload_3
/*     */     //   184: iload #4
/*     */     //   186: iconst_2
/*     */     //   187: idiv
/*     */     //   188: i2l
/*     */     //   189: invokestatic constructor-impl : (J)J
/*     */     //   192: invokestatic access$startMap-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   195: goto -> 208
/*     */     //   198: aload_3
/*     */     //   199: iload #4
/*     */     //   201: i2l
/*     */     //   202: invokestatic constructor-impl : (J)J
/*     */     //   205: invokestatic access$startMap-2TYgG_w : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;J)V
/*     */     //   208: aload_3
/*     */     //   209: aload_2
/*     */     //   210: invokevirtual getBytes : ()Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   213: invokevirtual copyFrom : (Lkotlinx/serialization/cbor/internal/ByteArrayOutput;)V
/*     */     //   216: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #201	-> 6
/*     */     //   #203	-> 14
/*     */     //   #205	-> 19
/*     */     //   #207	-> 25
/*     */     //   #334	-> 57
/*     */     //   #208	-> 98
/*     */     //   #209	-> 104
/*     */     //   #334	-> 105
/*     */     //   #335	-> 109
/*     */     //   #207	-> 113
/*     */     //   #211	-> 115
/*     */     //   #212	-> 122
/*     */     //   #212	-> 129
/*     */     //   #214	-> 135
/*     */     //   #215	-> 143
/*     */     //   #215	-> 169
/*     */     //   #216	-> 175
/*     */     //   #216	-> 192
/*     */     //   #217	-> 198
/*     */     //   #217	-> 205
/*     */     //   #220	-> 208
/*     */     //   #221	-> 216
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   98	7	12	$i$a$-forEach-DefiniteLengthCborWriter$endStructure$1	I
/*     */     //   95	10	10	it	J
/*     */     //   85	21	9	element$iv	Ljava/lang/Object;
/*     */     //   57	53	7	$i$f$forEach	I
/*     */     //   54	56	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   14	203	2	completedCurrent	Lkotlinx/serialization/cbor/internal/CborWriter$Data;
/*     */     //   19	198	3	accumulator	Lkotlinx/serialization/cbor/internal/ByteArrayOutput;
/*     */     //   25	192	4	numChildren	I
/*     */     //   0	217	0	this	Lkotlinx/serialization/cbor/internal/DefiniteLengthCborWriter;
/*     */     //   0	217	1	descriptor	Lkotlinx/serialization/descriptors/SerialDescriptor;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\DefiniteLengthCborWriter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */