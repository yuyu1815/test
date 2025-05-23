/*    */ package ai.grazie.emb;@Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\023\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\n\n\002\020\006\n\002\b\002\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B+\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\027\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\016\020\023\032\0020\0242\006\020\025\032\0020\000J\023\020\026\032\0020\0072\b\020\025\032\004\030\0010\027H\002J\b\020\030\032\0020\003H\026J\020\020\031\032\0020\0322\006\020\025\032\0020\000H\002J\020\020\033\032\0020\0242\006\020\025\032\0020\001H\026J\021\020\034\032\0020\0242\006\020\025\032\0020\000H\002J\t\020\035\032\0020\036HÖ\001J&\020\037\032\0020\0322\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006("}, d2 = {"Lai/grazie/emb/DoubleTextEmbedding;", "Lai/grazie/emb/TextEmbedding;", "seen1", "", "values", "", "normalized", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[DZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([DZ)V", "getNormalized", "()Z", "getValues", "()[D", "component1", "component2", "copy", "cosine", "", "other", "equals", "", "hashCode", "requireSameSize", "", "similarity", "times", "toString", "", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_emb", "$serializer", "Companion", "model-emb"})
/*    */ @SourceDebugExtension({"SMAP\nDoubleTextEmbedding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleTextEmbedding.kt\nai/grazie/emb/DoubleTextEmbedding\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/*    */ public final class DoubleTextEmbedding implements TextEmbedding { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final double[] values;
/*    */   private final boolean normalized;
/*    */   
/*  9 */   public DoubleTextEmbedding(@NotNull double[] values, boolean normalized) { this.values = values; this.normalized = normalized; } @NotNull public final double[] getValues() { return this.values; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/emb/DoubleTextEmbedding.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/emb/DoubleTextEmbedding;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-emb"}) public static final class $serializer implements GeneratedSerializer<DoubleTextEmbedding> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)DoubleArraySerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)BooleanSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public DoubleTextEmbedding deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; double[] arrayOfDouble = null; boolean bool1 = false; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { arrayOfDouble = (double[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DoubleArraySerializer.INSTANCE, arrayOfDouble); i |= 0x1; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfDouble = (double[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DoubleArraySerializer.INSTANCE, arrayOfDouble); i |= 0x1; continue;case 1: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new DoubleTextEmbedding(i, arrayOfDouble, bool1, null); } public void serialize(@NotNull Encoder encoder, @NotNull DoubleTextEmbedding value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); DoubleTextEmbedding.write$Self$model_emb(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.emb.DoubleTextEmbedding", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("values", false); pluginGeneratedSerialDescriptor.addElement("normalized", true); descriptor = pluginGeneratedSerialDescriptor; } } public final boolean getNormalized() { return this.normalized; }
/*    */    public boolean equals(@Nullable Object other) {
/* 11 */     if (this == other) return true; 
/* 12 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 14 */     (DoubleTextEmbedding)other;
/*    */     
/* 16 */     return Arrays.equals(this.values, ((DoubleTextEmbedding)other).values);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 20 */     return Arrays.hashCode(this.values);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public final double times(@NotNull DoubleTextEmbedding other)
/*    */   {
/* 27 */     Intrinsics.checkNotNullParameter(other, "other"); requireSameSize(other); Iterable iterable; double d; Iterator iterator;
/* 28 */     for (iterable = (Iterable)ArraysKt.getIndices(this.values), d = 0.0D, iterator = iterable.iterator(); iterator.hasNext(); ) { int i = ((IntIterator)iterator).nextInt(), j = i;
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
/* 59 */       double d1 = d; int $i$a$-sumOfDouble-DoubleTextEmbedding$times$1 = 0; double d2 = this.values[j] * other.values[j]; d = d1 + d2; }  return d; } public final double cosine(@NotNull DoubleTextEmbedding other) { Intrinsics.checkNotNullParameter(other, "other"); requireSameSize(other); double dot = times(other); double norm = Math.sqrt(times(this)) * Math.sqrt(other.times(other)); return (this.normalized && other.normalized) ? dot : (dot / norm); } public double similarity(@NotNull TextEmbedding other) { Intrinsics.checkNotNullParameter(other, "other"); return cosine((DoubleTextEmbedding)other); } private final void requireSameSize(DoubleTextEmbedding other) { if (!((this.values.length == other.values.length) ? 1 : 0)) { int $i$a$-require-DoubleTextEmbedding$requireSameSize$1 = 0;
/*    */       String str = "Embeddings must have the same size";
/*    */       throw new IllegalArgumentException(str.toString()); }
/*    */      }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final double[] component1() {
/*    */     return this.values;
/*    */   }
/*    */   
/*    */   public final boolean component2() {
/*    */     return this.normalized;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DoubleTextEmbedding copy(@NotNull double[] values, boolean normalized) {
/*    */     Intrinsics.checkNotNullParameter(values, "values");
/*    */     return new DoubleTextEmbedding(values, normalized);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DoubleTextEmbedding(values=" + Arrays.toString(this.values) + ", normalized=" + this.normalized + ")";
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004J\017\020\005\032\b\022\004\022\0020\0040\006HÆ\001¨\006\007"}, d2 = {"Lai/grazie/emb/DoubleTextEmbedding$Companion;", "", "()V", "empty", "Lai/grazie/emb/DoubleTextEmbedding;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-emb"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<DoubleTextEmbedding> serializer() {
/*    */       return (KSerializer<DoubleTextEmbedding>)DoubleTextEmbedding.$serializer.INSTANCE;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final DoubleTextEmbedding empty() {
/*    */       return new DoubleTextEmbedding(new double[0], false, 2, null);
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-emb-jvm-0.4.32.jar!\ai\grazie\emb\DoubleTextEmbedding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */