/*    */ package ai.grazie.emb;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\024\n\000\n\002\030\002\n\002\b\007\n\002\020\007\n\002\b\002\n\002\020\013\n\002\020\000\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\016\020\016\032\0020\0172\006\020\020\032\0020\000J\023\020\021\032\0020\0222\b\020\020\032\004\030\0010\023H\002J\b\020\024\032\0020\003H\026J\020\020\025\032\0020\0262\006\020\020\032\0020\001H\026J\021\020\027\032\0020\0172\006\020\020\032\0020\000H\002J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006$"}, d2 = {"Lai/grazie/emb/FloatTextEmbedding;", "Lai/grazie/emb/TextEmbedding;", "seen1", "", "values", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([F)V", "getValues", "()[F", "component1", "copy", "cosine", "", "other", "equals", "", "", "hashCode", "similarity", "", "times", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_emb", "$serializer", "Companion", "model-emb"})
/*    */ @SourceDebugExtension({"SMAP\nFloatTextEmbedding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatTextEmbedding.kt\nai/grazie/emb/FloatTextEmbedding\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1#2:47\n1557#3:48\n1628#3,3:49\n*S KotlinDebug\n*F\n+ 1 FloatTextEmbedding.kt\nai/grazie/emb/FloatTextEmbedding\n*L\n29#1:48\n29#1:49,3\n*E\n"})
/*    */ public final class FloatTextEmbedding implements TextEmbedding { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final float[] values;
/*    */   
/* 10 */   public FloatTextEmbedding(@NotNull float[] values) { this.values = values; } @NotNull public final float[] getValues() { return this.values; }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/emb/FloatTextEmbedding.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/emb/FloatTextEmbedding;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-emb"}) public static final class $serializer implements GeneratedSerializer<FloatTextEmbedding> {
/* 12 */     @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)FloatArraySerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public FloatTextEmbedding deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; float[] arrayOfFloat = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { arrayOfFloat = (float[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)FloatArraySerializer.INSTANCE, arrayOfFloat); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfFloat = (float[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)FloatArraySerializer.INSTANCE, arrayOfFloat); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new FloatTextEmbedding(i, arrayOfFloat, null); } public void serialize(@NotNull Encoder encoder, @NotNull FloatTextEmbedding value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); FloatTextEmbedding.write$Self$model_emb(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.emb.FloatTextEmbedding", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("values", false); descriptor = pluginGeneratedSerialDescriptor; } } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 13 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 15 */     (FloatTextEmbedding)other;
/*    */     
/* 17 */     return Arrays.equals(this.values, ((FloatTextEmbedding)other).values); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/emb/FloatTextEmbedding$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/emb/FloatTextEmbedding;", "model-emb"})
/*    */   public static final class Companion {
/*    */     private Companion() {} @NotNull
/* 21 */     public final KSerializer<FloatTextEmbedding> serializer() { return (KSerializer<FloatTextEmbedding>)FloatTextEmbedding.$serializer.INSTANCE; } } public int hashCode() { return Arrays.hashCode(this.values); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final float times(@NotNull FloatTextEmbedding other) {
/* 28 */     Intrinsics.checkNotNullParameter(other, "other"); if (!((this.values.length == other.values.length) ? 1 : 0)) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 47 */       int $i$a$-require-FloatTextEmbedding$times$1 = 0; String str = "Embeddings must have the same size"; throw new IllegalArgumentException(str.toString());
/* 48 */     }  Iterable $this$map$iv = (Iterable)ArraysKt.getIndices(this.values); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<Float> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 49 */     for (Iterator iterator = iterable1.iterator(); iterator.hasNext(); ) { int item$iv$iv = ((IntIterator)iterator).nextInt();
/* 50 */       int i = item$iv$iv; Collection<Float> collection = destination$iv$iv; int $i$a$-map-FloatTextEmbedding$times$2 = 0; collection.add(Float.valueOf(this.values[i] * other.values[i])); }
/* 51 */      return CollectionsKt.sumOfFloat(destination$iv$iv);
/*    */   }
/*    */   
/*    */   public final float cosine(@NotNull FloatTextEmbedding other) {
/*    */     Intrinsics.checkNotNullParameter(other, "other");
/*    */     if (!((this.values.length == other.values.length) ? 1 : 0)) {
/*    */       int $i$a$-require-FloatTextEmbedding$cosine$1 = 0;
/*    */       String str = "Embeddings must have the same size";
/*    */       throw new IllegalArgumentException(str.toString());
/*    */     } 
/*    */     float dot = times(other);
/*    */     float norm = (float)Math.sqrt(times(this)) * (float)Math.sqrt(other.times(other));
/*    */     return dot / norm;
/*    */   }
/*    */   
/*    */   public double similarity(@NotNull TextEmbedding other) {
/*    */     Intrinsics.checkNotNullParameter(other, "other");
/*    */     return cosine((FloatTextEmbedding)other);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final float[] component1() {
/*    */     return this.values;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FloatTextEmbedding copy(@NotNull float[] values) {
/*    */     Intrinsics.checkNotNullParameter(values, "values");
/*    */     return new FloatTextEmbedding(values);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FloatTextEmbedding(values=" + Arrays.toString(this.values) + ")";
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-emb-jvm-0.4.32.jar!\ai\grazie\emb\FloatTextEmbedding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */