/*    */ package ai.grazie.utils;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020!\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 #*\b\b\000\020\001*\0020\0022\0020\002:\003\"#$B)\b\021\022\006\020\003\032\0020\004\022\016\020\005\032\n\022\004\022\0028\000\030\0010\006\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\016\b\002\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\nJ\017\020\013\032\b\022\004\022\0028\0000\006HÂ\003J\037\020\f\032\b\022\004\022\0028\0000\0002\016\b\002\020\005\032\b\022\004\022\0028\0000\006HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\002HÖ\003J\031\020\020\032\b\022\004\022\0028\0000\0212\006\020\022\032\0028\000¢\006\002\020\023J\t\020\024\032\0020\004HÖ\001J\t\020\025\032\0020\026HÖ\001J@\020\027\032\0020\030\"\004\b\001\020\0312\f\020\032\032\b\022\004\022\002H\0310\0002\006\020\033\032\0020\0342\006\020\035\032\0020\0362\f\020\037\032\b\022\004\022\002H\0310 HÁ\001¢\006\002\b!R\024\020\005\032\b\022\004\022\0028\0000\006X\004¢\006\002\n\000¨\006%"}, d2 = {"Lai/grazie/utils/DictionaryCompression;", "T", "", "seen1", "", "values", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "component1", "copy", "equals", "", "other", "getOrCreate", "Lai/grazie/utils/DictionaryCompression$Getter;", "element", "(Ljava/lang/Object;)Lai/grazie/utils/DictionaryCompression$Getter;", "hashCode", "toString", "", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$utils_common", "$serializer", "Companion", "Getter", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nDictionaryCompression.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DictionaryCompression.kt\nai/grazie/utils/DictionaryCompression\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n360#2,7:38\n1#3:45\n*S KotlinDebug\n*F\n+ 1 DictionaryCompression.kt\nai/grazie/utils/DictionaryCompression\n*L\n30#1:38,7\n*E\n"})
/*    */ public final class DictionaryCompression<T> {
/*    */   @NotNull
/*  9 */   public static final Companion Companion = new Companion(null); @NotNull private final List<T> values; @JvmField @NotNull private static final SerialDescriptor $cachedDescriptor; static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.utils.DictionaryCompression", null, 1); pluginGeneratedSerialDescriptor.addElement("values", true); $cachedDescriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\b\007\030\000*\004\b\001\020\0012\016\022\n\022\b\022\004\022\0028\0000\0030\002B\007\b\002¢\006\002\020\004B\025\b\027\022\f\020\005\032\b\022\004\022\0028\0010\006¢\006\002\020\007J\030\020\016\032\f\022\b\022\006\022\002\b\0030\0060\017HÖ\001¢\006\002\020\020J\027\020\021\032\b\022\004\022\0028\0000\0032\006\020\022\032\0020\023HÖ\001J\037\020\024\032\0020\0252\006\020\026\032\0020\0272\f\020\030\032\b\022\004\022\0028\0000\003HÖ\001J\030\020\031\032\f\022\b\022\006\022\002\b\0030\0060\017HÖ\001¢\006\002\020\020R\024\020\b\032\0020\t8VXÖ\005¢\006\006\032\004\b\n\020\013R\032\020\005\032\b\022\004\022\0028\0010\0068BXÂ\005¢\006\006\032\004\b\f\020\r¨\006\032"}, d2 = {"ai/grazie/utils/DictionaryCompression.$serializer", "T", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/utils/DictionaryCompression;", "()V", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "(Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "childSerializers", "", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "typeParametersSerializers", "utils-common"}) public static final class $serializer<T> implements GeneratedSerializer<DictionaryCompression<T>> {
/* 10 */     private $serializer() { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.utils.DictionaryCompression", this, 1); pluginGeneratedSerialDescriptor.addElement("values", true); this.descriptor = pluginGeneratedSerialDescriptor; } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)this.descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer(this.typeSerial0); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public DictionaryCompression<T> deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer(this.typeSerial0), list); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)new ArrayListSerializer(this.typeSerial0), list); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new DictionaryCompression<>(i, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull DictionaryCompression value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); DictionaryCompression.write$Self$utils_common(value, compositeEncoder, serialDescriptor, this.typeSerial0); compositeEncoder.endStructure(serialDescriptor); } @NotNull public KSerializer<?>[] typeParametersSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = this.typeSerial0; return (KSerializer<?>[])arrayOfKSerializer; } private final KSerializer<T> getTypeSerial0() { return (KSerializer)this.typeSerial0; } } public DictionaryCompression(@NotNull List<T> values) { this.values = values; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\016\022\n\022\b\022\004\022\002H\0060\0050\004\"\004\b\001\020\0062\f\020\007\032\b\022\004\022\002H\0060\004HÆ\001¨\006\b"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/DictionaryCompression;", "T0", "typeSerial0", "utils-common"}) public static final class Companion {
/*    */     private Companion() {} @NotNull public final <T0> KSerializer<DictionaryCompression<T0>> serializer(@NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<DictionaryCompression<T0>>)new DictionaryCompression.$serializer(typeSerial0); } } @Serializable(with = Getter.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\b\005\b\007\030\000 \r*\b\b\001\020\001*\0020\0022\0020\002:\002\r\016B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\033\020\b\032\004\030\0018\0012\f\020\t\032\b\022\004\022\0028\0010\n¢\006\002\020\013J\031\020\f\032\0028\0012\f\020\t\032\b\022\004\022\0028\0010\n¢\006\002\020\013R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\017"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Getter;", "T", "", "id", "", "(I)V", "getId", "()I", "get", "dictionary", "Lai/grazie/utils/DictionaryCompression;", "(Lai/grazie/utils/DictionaryCompression;)Ljava/lang/Object;", "getOrFail", "Companion", "Serializer", "utils-common"}) public static final class Getter<T> {
/* 12 */     @NotNull public static final Companion Companion = new Companion(null); private final int id; public Getter(int id) { this.id = id; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\016\022\n\022\b\022\004\022\002H\0060\0050\004\"\004\b\002\020\0062\f\020\007\032\b\022\004\022\002H\0060\004HÆ\001¨\006\b"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Getter$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/DictionaryCompression$Getter;", "T0", "typeSerial0", "utils-common"}) public static final class Companion { private Companion() {} @NotNull public final <T0> KSerializer<DictionaryCompression.Getter<T0>> serializer(@NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return DictionaryCompression.Getter.Serializer.INSTANCE; } } public final int getId() { return this.id; } @Nullable
/* 13 */     public final T get(@NotNull DictionaryCompression dictionary) { Intrinsics.checkNotNullParameter(dictionary, "dictionary"); return (T)CollectionsKt.getOrNull(dictionary.values, this.id); } @NotNull
/* 14 */     public final T getOrFail(@NotNull DictionaryCompression<T> dictionary) { Intrinsics.checkNotNullParameter(dictionary, "dictionary"); if (get(dictionary) == null) { get(dictionary); throw new IllegalStateException(("Can't find " + this.id).toString()); }  return get(dictionary); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\f\022\b\022\006\022\002\b\0030\0020\001B\007\b\002¢\006\002\020\003J\024\020\b\032\006\022\002\b\0030\0022\006\020\t\032\0020\nH\026J\034\020\013\032\0020\f2\006\020\r\032\0020\0162\n\020\017\032\006\022\002\b\0030\002H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/utils/DictionaryCompression$Getter$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/utils/DictionaryCompression$Getter;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "utils-common"})
/*    */     public static final class Serializer implements KSerializer<Getter<?>> { @NotNull
/*    */       public static final Serializer INSTANCE = new Serializer(); @NotNull
/* 17 */       public DictionaryCompression.Getter<?> deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); return new DictionaryCompression.Getter(decoder.decodeInt()); }
/*    */        @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/* 20 */         return SerialDescriptorsKt.PrimitiveSerialDescriptor("Getter", (PrimitiveKind)PrimitiveKind.INT.INSTANCE);
/*    */       }
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull DictionaryCompression.Getter value) {
/* 23 */         Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); encoder.encodeInt(value.getId());
/*    */       } }
/*    */   
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final synchronized Getter<T> getOrCreate(@NotNull Object element) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'element'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield values : Ljava/util/List;
/*    */     //   10: astore_3
/*    */     //   11: iconst_0
/*    */     //   12: istore #4
/*    */     //   14: iconst_0
/*    */     //   15: istore #5
/*    */     //   17: aload_3
/*    */     //   18: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   23: astore #6
/*    */     //   25: aload #6
/*    */     //   27: invokeinterface hasNext : ()Z
/*    */     //   32: ifeq -> 71
/*    */     //   35: aload #6
/*    */     //   37: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   42: astore #7
/*    */     //   44: aload #7
/*    */     //   46: astore #8
/*    */     //   48: iconst_0
/*    */     //   49: istore #9
/*    */     //   51: aload #8
/*    */     //   53: aload_1
/*    */     //   54: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   57: ifeq -> 65
/*    */     //   60: iload #5
/*    */     //   62: goto -> 72
/*    */     //   65: iinc #5, 1
/*    */     //   68: goto -> 25
/*    */     //   71: iconst_m1
/*    */     //   72: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   75: astore_3
/*    */     //   76: aload_3
/*    */     //   77: checkcast java/lang/Number
/*    */     //   80: invokevirtual intValue : ()I
/*    */     //   83: istore #4
/*    */     //   85: iconst_0
/*    */     //   86: istore #5
/*    */     //   88: iload #4
/*    */     //   90: iconst_m1
/*    */     //   91: if_icmpeq -> 98
/*    */     //   94: iconst_1
/*    */     //   95: goto -> 99
/*    */     //   98: iconst_0
/*    */     //   99: ifeq -> 106
/*    */     //   102: aload_3
/*    */     //   103: goto -> 107
/*    */     //   106: aconst_null
/*    */     //   107: dup
/*    */     //   108: ifnull -> 117
/*    */     //   111: invokevirtual intValue : ()I
/*    */     //   114: goto -> 157
/*    */     //   117: pop
/*    */     //   118: aload_0
/*    */     //   119: checkcast ai/grazie/utils/DictionaryCompression
/*    */     //   122: astore #4
/*    */     //   124: iconst_0
/*    */     //   125: istore #5
/*    */     //   127: aload #4
/*    */     //   129: getfield values : Ljava/util/List;
/*    */     //   132: checkcast java/util/Collection
/*    */     //   135: aload_1
/*    */     //   136: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   141: pop
/*    */     //   142: aload #4
/*    */     //   144: getfield values : Ljava/util/List;
/*    */     //   147: checkcast java/util/Collection
/*    */     //   150: invokestatic getIndices : (Ljava/util/Collection;)Lkotlin/ranges/IntRange;
/*    */     //   153: invokevirtual getLast : ()I
/*    */     //   156: nop
/*    */     //   157: istore_2
/*    */     //   158: new ai/grazie/utils/DictionaryCompression$Getter
/*    */     //   161: dup
/*    */     //   162: iload_2
/*    */     //   163: invokespecial <init> : (I)V
/*    */     //   166: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #30	-> 6
/*    */     //   #38	-> 14
/*    */     //   #39	-> 17
/*    */     //   #40	-> 44
/*    */     //   #30	-> 51
/*    */     //   #40	-> 57
/*    */     //   #41	-> 60
/*    */     //   #42	-> 65
/*    */     //   #44	-> 71
/*    */     //   #30	-> 72
/*    */     //   #45	-> 85
/*    */     //   #30	-> 88
/*    */     //   #30	-> 99
/*    */     //   #30	-> 107
/*    */     //   #31	-> 127
/*    */     //   #32	-> 142
/*    */     //   #30	-> 156
/*    */     //   #30	-> 157
/*    */     //   #34	-> 158
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   51	6	9	$i$a$-indexOfFirst-DictionaryCompression$getOrCreate$id$1	I
/*    */     //   48	9	8	it	Ljava/lang/Object;
/*    */     //   44	24	7	item$iv	Ljava/lang/Object;
/*    */     //   14	58	4	$i$f$indexOfFirst	I
/*    */     //   17	55	5	index$iv	I
/*    */     //   11	61	3	$this$indexOfFirst$iv	Ljava/util/List;
/*    */     //   88	11	5	$i$a$-takeIf-DictionaryCompression$getOrCreate$id$2	I
/*    */     //   85	14	4	it	I
/*    */     //   127	29	5	$i$a$-run-DictionaryCompression$getOrCreate$id$3	I
/*    */     //   124	32	4	$this$getOrCreate_u24lambda_u242	Lai/grazie/utils/DictionaryCompression;
/*    */     //   158	9	2	id	I
/*    */     //   0	167	0	this	Lai/grazie/utils/DictionaryCompression;
/*    */     //   0	167	1	element	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private final List<T> component1() {
/*    */     return this.values;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DictionaryCompression<T> copy(@NotNull List<T> values) {
/*    */     Intrinsics.checkNotNullParameter(values, "values");
/*    */     return new DictionaryCompression(values);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DictionaryCompression(values=" + this.values + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.values.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DictionaryCompression))
/*    */       return false; 
/*    */     DictionaryCompression dictionaryCompression = (DictionaryCompression)other;
/*    */     return !!Intrinsics.areEqual(this.values, dictionaryCompression.values);
/*    */   }
/*    */   
/*    */   public DictionaryCompression() {
/*    */     this((List)null, 1, (DefaultConstructorMarker)null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\DictionaryCompression.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */