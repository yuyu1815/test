/*    */ package ai.grazie.nlc;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\021\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\005\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\0050\007¢\006\002\020\013J\t\020\021\032\0020\005HÆ\003J\024\020\022\032\b\022\004\022\0020\0050\007HÆ\003¢\006\002\020\rJ(\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\0050\007HÆ\001¢\006\002\020\024J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001H\002J\b\020\030\032\0020\003H\026J\b\020\031\032\0020\005H\026J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\031\020\006\032\b\022\004\022\0020\0050\007¢\006\n\n\002\020\016\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lai/grazie/nlc/PrefixWithCompletions;", "", "seen1", "", "prefix", "", "options", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;[Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;[Ljava/lang/String;)V", "getOptions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;[Ljava/lang/String;)Lai/grazie/nlc/PrefixWithCompletions;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_nlc", "$serializer", "Companion", "model-nlc"})
/*    */ public final class PrefixWithCompletions {
/*    */   @NotNull
/*  6 */   public static final Companion Companion = new Companion(null); @NotNull private final String prefix; @NotNull private final String[] options; @JvmField
/*    */   @NotNull
/*  8 */   private static final KSerializer<Object>[] $childSerializers; public PrefixWithCompletions(@NotNull String prefix, @NotNull String[] options) { this.prefix = prefix; this.options = options; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(String.class), (KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final String getPrefix() { return this.prefix; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/nlc/PrefixWithCompletions.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/nlc/PrefixWithCompletions;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-nlc"}) public static final class $serializer implements GeneratedSerializer<PrefixWithCompletions> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])PrefixWithCompletions.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public PrefixWithCompletions deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null, arrayOfString[] = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])PrefixWithCompletions.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; arrayOfString = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfString); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: arrayOfString = (String[])compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], arrayOfString); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new PrefixWithCompletions(i, str, arrayOfString, null); } public void serialize(@NotNull Encoder encoder, @NotNull PrefixWithCompletions value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); PrefixWithCompletions.write$Self$model_nlc(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.nlc.PrefixWithCompletions", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("prefix", false); pluginGeneratedSerialDescriptor.addElement("options", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/nlc/PrefixWithCompletions$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/nlc/PrefixWithCompletions;", "model-nlc"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<PrefixWithCompletions> serializer() { return (KSerializer<PrefixWithCompletions>)PrefixWithCompletions.$serializer.INSTANCE; } } @NotNull public final String[] getOptions() { return this.options; }
/*    */    @NotNull
/*    */   public String toString() {
/* 11 */     Intrinsics.checkNotNullExpressionValue(Arrays.toString((Object[])this.options), "toString(...)"); return "Completions(prefix='" + this.prefix + "', completions=" + Arrays.toString((Object[])this.options) + ")";
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/* 15 */     if (this == other) return true; 
/* 16 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 18 */     (PrefixWithCompletions)other;
/*    */     
/* 20 */     if (!Intrinsics.areEqual(this.prefix, ((PrefixWithCompletions)other).prefix)) return false; 
/* 21 */     if (!Arrays.equals((Object[])this.options, (Object[])((PrefixWithCompletions)other).options)) return false;
/*    */     
/* 23 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 27 */     int result = this.prefix.hashCode();
/* 28 */     result = 31 * result + Arrays.hashCode((Object[])this.options);
/* 29 */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String[] component2() {
/*    */     return this.options;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final PrefixWithCompletions copy(@NotNull String prefix, @NotNull String[] options) {
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     Intrinsics.checkNotNullParameter(options, "options");
/*    */     return new PrefixWithCompletions(prefix, options);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nlc-jvm-0.4.32.jar!\ai\grazie\nlc\PrefixWithCompletions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */