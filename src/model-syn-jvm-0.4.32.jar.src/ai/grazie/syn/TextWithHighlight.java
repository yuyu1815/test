/*   */ package ai.grazie.syn;@Serializable
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003¢\006\002\020\013J\t\020\021\032\0020\005HÆ\003J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J'\020\024\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\003HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\005HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\016\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lai/grazie/syn/TextWithHighlight;", "", "seen1", "", "text", "", "start", "finish", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;II)V", "getFinish", "()I", "getStart", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_syn", "$serializer", "Companion", "model-syn"})
/*   */ public final class TextWithHighlight { @NotNull
/*   */   public static final Companion Companion = new Companion(null); @NotNull
/*   */   private final String text; private final int start;
/*   */   private final int finish;
/*   */   
/* 8 */   public TextWithHighlight(@NotNull String text, int start, int finish) { this.text = text; this.start = start; this.finish = finish; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/syn/TextWithHighlight.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/syn/TextWithHighlight;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-syn"}) public static final class $serializer implements GeneratedSerializer<TextWithHighlight> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)IntSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TextWithHighlight deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; int j = 0, k = 0; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; k = compositeDecoder.decodeIntElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int m = compositeDecoder.decodeElementIndex(serialDescriptor); switch (m) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: k = compositeDecoder.decodeIntElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(m); }  }  compositeDecoder.endStructure(serialDescriptor); return new TextWithHighlight(i, str, j, k, null); } public void serialize(@NotNull Encoder encoder, @NotNull TextWithHighlight value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TextWithHighlight.write$Self$model_syn(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.syn.TextWithHighlight", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("start", false); pluginGeneratedSerialDescriptor.addElement("finish", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getText() { return this.text; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/syn/TextWithHighlight$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/syn/TextWithHighlight;", "model-syn"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TextWithHighlight> serializer() { return (KSerializer<TextWithHighlight>)TextWithHighlight.$serializer.INSTANCE; } } public final int getStart() { return this.start; } public final int getFinish() { return this.finish; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.text;
/*   */   }
/*   */   
/*   */   public final int component2() {
/*   */     return this.start;
/*   */   }
/*   */   
/*   */   public final int component3() {
/*   */     return this.finish;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final TextWithHighlight copy(@NotNull String text, int start, int finish) {
/*   */     Intrinsics.checkNotNullParameter(text, "text");
/*   */     return new TextWithHighlight(text, start, finish);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "TextWithHighlight(text=" + this.text + ", start=" + this.start + ", finish=" + this.finish + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.text.hashCode();
/*   */     result = result * 31 + Integer.hashCode(this.start);
/*   */     return result * 31 + Integer.hashCode(this.finish);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof TextWithHighlight))
/*   */       return false; 
/*   */     TextWithHighlight textWithHighlight = (TextWithHighlight)other;
/*   */     return !Intrinsics.areEqual(this.text, textWithHighlight.text) ? false : ((this.start != textWithHighlight.start) ? false : (!(this.finish != textWithHighlight.finish)));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-syn-jvm-0.4.32.jar!\ai\grazie\syn\TextWithHighlight.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */