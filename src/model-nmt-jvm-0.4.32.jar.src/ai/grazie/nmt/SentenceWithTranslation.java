/*   */ package ai.grazie.nmt;@Serializable
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\b¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\bHÆ\003J\t\020\027\032\0020\bHÆ\003J1\020\030\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\bHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\005HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\022\020\017R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\023\020\021¨\006("}, d2 = {"Lai/grazie/nmt/SentenceWithTranslation;", "", "seen1", "", "text", "", "translation", "fromLang", "Lai/grazie/nlp/langs/Language;", "toLang", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Lai/grazie/nlp/langs/Language;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Lai/grazie/nlp/langs/Language;)V", "getFromLang", "()Lai/grazie/nlp/langs/Language;", "getText", "()Ljava/lang/String;", "getToLang", "getTranslation", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_nmt", "$serializer", "Companion", "model-nmt"})
/*   */ public final class SentenceWithTranslation { @NotNull
/*   */   public static final Companion Companion = new Companion(null); @NotNull
/*   */   private final String text; @NotNull
/*   */   private final String translation; @NotNull
/*   */   private final Language fromLang; @NotNull
/*   */   private final Language toLang;
/* 9 */   public SentenceWithTranslation(@NotNull String text, @NotNull String translation, @NotNull Language fromLang, @NotNull Language toLang) { this.text = text; this.translation = translation; this.fromLang = fromLang; this.toLang = toLang; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/nmt/SentenceWithTranslation.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/nmt/SentenceWithTranslation;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-nmt"}) public static final class $serializer implements GeneratedSerializer<SentenceWithTranslation> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)Language.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public SentenceWithTranslation deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; Language language1 = null, language2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; language1 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language1); i |= 0x4; language2 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Language.Serializer.INSTANCE, language2); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: language1 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language1); i |= 0x4; continue;case 3: language2 = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Language.Serializer.INSTANCE, language2); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SentenceWithTranslation(i, str1, str2, language1, language2, null); } public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithTranslation value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SentenceWithTranslation.write$Self$model_nmt(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.nmt.SentenceWithTranslation", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("translation", false); pluginGeneratedSerialDescriptor.addElement("fromLang", false); pluginGeneratedSerialDescriptor.addElement("toLang", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getText() { return this.text; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/nmt/SentenceWithTranslation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/nmt/SentenceWithTranslation;", "model-nmt"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SentenceWithTranslation> serializer() { return (KSerializer<SentenceWithTranslation>)SentenceWithTranslation.$serializer.INSTANCE; } } @NotNull public final String getTranslation() { return this.translation; } @NotNull public final Language getFromLang() { return this.fromLang; } @NotNull public final Language getToLang() { return this.toLang; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final String component1() {
/*   */     return this.text;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component2() {
/*   */     return this.translation;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Language component3() {
/*   */     return this.fromLang;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final Language component4() {
/*   */     return this.toLang;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final SentenceWithTranslation copy(@NotNull String text, @NotNull String translation, @NotNull Language fromLang, @NotNull Language toLang) {
/*   */     Intrinsics.checkNotNullParameter(text, "text");
/*   */     Intrinsics.checkNotNullParameter(translation, "translation");
/*   */     Intrinsics.checkNotNullParameter(fromLang, "fromLang");
/*   */     Intrinsics.checkNotNullParameter(toLang, "toLang");
/*   */     return new SentenceWithTranslation(text, translation, fromLang, toLang);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "SentenceWithTranslation(text=" + this.text + ", translation=" + this.translation + ", fromLang=" + this.fromLang + ", toLang=" + this.toLang + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.text.hashCode();
/*   */     result = result * 31 + this.translation.hashCode();
/*   */     result = result * 31 + this.fromLang.hashCode();
/*   */     return result * 31 + this.toLang.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof SentenceWithTranslation))
/*   */       return false; 
/*   */     SentenceWithTranslation sentenceWithTranslation = (SentenceWithTranslation)other;
/*   */     return !Intrinsics.areEqual(this.text, sentenceWithTranslation.text) ? false : (!Intrinsics.areEqual(this.translation, sentenceWithTranslation.translation) ? false : ((this.fromLang != sentenceWithTranslation.fromLang) ? false : (!(this.toLang != sentenceWithTranslation.toLang))));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nmt-jvm-0.4.32.jar!\ai\grazie\nmt\SentenceWithTranslation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */