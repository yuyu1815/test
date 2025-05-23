/*   */ package ai.grazie.code.indexing.model.search;
/*   */ @Serializable
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\006\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B!\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/code/indexing/model/search/SearchScore;", "", "seen1", "", "similarity", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(D)V", "getSimilarity", "()D", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*   */ public final class SearchScore {
/*   */   @NotNull
/*   */   public static final Companion Companion = new Companion(null);
/*   */   
/* 8 */   public SearchScore(double similarity) { this.similarity = similarity; } private final double similarity; public final double getSimilarity() { return this.similarity; }
/*   */ 
/*   */   
/*   */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*   */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/search/SearchScore.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/search/SearchScore;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*   */   public static final class $serializer implements GeneratedSerializer<SearchScore> {
/*   */     @NotNull
/*   */     public static final $serializer INSTANCE = new $serializer();
/*   */     
/*   */     @NotNull
/*   */     public KSerializer<?>[] typeParametersSerializers() {
/*   */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public SerialDescriptor getDescriptor() {
/*   */       return (SerialDescriptor)descriptor;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public KSerializer<?>[] childSerializers() {
/*   */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*   */       arrayOfKSerializer[0] = (KSerializer)DoubleSerializer.INSTANCE;
/*   */       return (KSerializer<?>[])arrayOfKSerializer;
/*   */     }
/*   */     
/*   */     @NotNull
/*   */     public SearchScore deserialize(@NotNull Decoder decoder) {
/*   */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*   */       SerialDescriptor serialDescriptor = getDescriptor();
/*   */       boolean bool = true;
/*   */       int i = 0;
/*   */       double d = 0.0D;
/*   */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*   */       if (compositeDecoder.decodeSequentially()) {
/*   */         d = compositeDecoder.decodeDoubleElement(serialDescriptor, 0);
/*   */         i |= 0x1;
/*   */       } else {
/*   */         while (bool) {
/*   */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*   */           switch (j) {
/*   */             case -1:
/*   */               bool = false;
/*   */               continue;
/*   */             case 0:
/*   */               d = compositeDecoder.decodeDoubleElement(serialDescriptor, 0);
/*   */               i |= 0x1;
/*   */               continue;
/*   */           } 
/*   */           throw new UnknownFieldException(j);
/*   */         } 
/*   */       } 
/*   */       compositeDecoder.endStructure(serialDescriptor);
/*   */       return new SearchScore(i, d, null);
/*   */     }
/*   */     
/*   */     public void serialize(@NotNull Encoder encoder, @NotNull SearchScore value) {
/*   */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*   */       Intrinsics.checkNotNullParameter(value, "value");
/*   */       SerialDescriptor serialDescriptor = getDescriptor();
/*   */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*   */       SearchScore.write$Self$model_indexing(value, compositeEncoder, serialDescriptor);
/*   */       compositeEncoder.endStructure(serialDescriptor);
/*   */     }
/*   */     
/*   */     static {
/*   */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.search.SearchScore", INSTANCE, 1);
/*   */       pluginGeneratedSerialDescriptor.addElement("similarity", false);
/*   */       descriptor = pluginGeneratedSerialDescriptor;
/*   */     }
/*   */   }
/*   */   
/*   */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/search/SearchScore$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/search/SearchScore;", "model-indexing"})
/*   */   public static final class Companion {
/*   */     private Companion() {}
/*   */     
/*   */     @NotNull
/*   */     public final KSerializer<SearchScore> serializer() {
/*   */       return (KSerializer<SearchScore>)SearchScore.$serializer.INSTANCE;
/*   */     }
/*   */   }
/*   */   
/*   */   public final double component1() {
/*   */     return this.similarity;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final SearchScore copy(double similarity) {
/*   */     return new SearchScore(similarity);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "SearchScore(similarity=" + this.similarity + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     return Double.hashCode(this.similarity);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof SearchScore))
/*   */       return false; 
/*   */     SearchScore searchScore = (SearchScore)other;
/*   */     return !(Double.compare(this.similarity, searchScore.similarity) != 0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\search\SearchScore.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */