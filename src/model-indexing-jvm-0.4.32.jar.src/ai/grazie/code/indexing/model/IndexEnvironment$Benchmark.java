/*    */ package ai.grazie.code.indexing.model;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\r\022\006\020\004\032\0020\005¢\006\002\020\nJ\t\020\r\032\0020\005HÂ\003J\023\020\016\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\003HÖ\001J\t\020\024\032\0020\005HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\016\020\004\032\0020\005X\004¢\006\002\n\000R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/code/indexing/model/IndexEnvironment$Benchmark;", "Lai/grazie/code/indexing/model/IndexEnvironment;", "seen1", "", "clientId", "", "id", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class Benchmark extends IndexEnvironment {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String clientId;
/*    */   @NotNull
/*    */   private final String id;
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/IndexEnvironment.Benchmark.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/IndexEnvironment$Benchmark;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*    */   public static final class $serializer implements GeneratedSerializer<Benchmark> { @NotNull
/* 17 */     public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public IndexEnvironment.Benchmark deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new IndexEnvironment.Benchmark(i, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull IndexEnvironment.Benchmark value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); IndexEnvironment.Benchmark.write$Self$model_indexing(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.IndexEnvironment.Benchmark", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("clientId", false); pluginGeneratedSerialDescriptor.addElement("id", true); pluginGeneratedSerialDescriptor.pushClassAnnotation((Annotation)new IndexEnvironment$Benchmark$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type")); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/IndexEnvironment$Benchmark$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/IndexEnvironment$Benchmark;", "model-indexing"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<IndexEnvironment.Benchmark> serializer() { return (KSerializer<IndexEnvironment.Benchmark>)IndexEnvironment.Benchmark.$serializer.INSTANCE; } }
/* 18 */    public Benchmark(@NotNull String clientId) { super(null); this.clientId = clientId;
/* 19 */     this.id = "Ben_" + this.clientId; } @NotNull public String getId() { return this.id; }
/*    */ 
/*    */   
/*    */   private final String component1() {
/*    */     return this.clientId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Benchmark copy(@NotNull String clientId) {
/*    */     Intrinsics.checkNotNullParameter(clientId, "clientId");
/*    */     return new Benchmark(clientId);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Benchmark(clientId=" + this.clientId + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.clientId.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Benchmark))
/*    */       return false; 
/*    */     Benchmark benchmark = (Benchmark)other;
/*    */     return !!Intrinsics.areEqual(this.clientId, benchmark.clientId);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexEnvironment$Benchmark.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */