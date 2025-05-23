/*    */ package ai.grazie.tone;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\031\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\013J\t\020\021\032\0020\005HÆ\003J\020\020\022\032\004\030\0010\007HÆ\003¢\006\002\020\rJ$\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001¢\006\002\020\024J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\032HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\025\020\006\032\004\030\0010\007¢\006\n\n\002\020\016\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006%"}, d2 = {"Lai/grazie/tone/FormalityPrediction;", "", "seen1", "", "tone", "Lai/grazie/tone/SentenceFormalityTone;", "score", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/tone/SentenceFormalityTone;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/tone/SentenceFormalityTone;Ljava/lang/Double;)V", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTone", "()Lai/grazie/tone/SentenceFormalityTone;", "component1", "component2", "copy", "(Lai/grazie/tone/SentenceFormalityTone;Ljava/lang/Double;)Lai/grazie/tone/FormalityPrediction;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_tone_formality", "$serializer", "Companion", "model-tone-formality"})
/*    */ public final class FormalityPrediction {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 10 */   public FormalityPrediction(@NotNull SentenceFormalityTone tone, @Nullable Double score) { this.tone = tone;
/* 11 */     this.score = score; } @NotNull private final SentenceFormalityTone tone; @Nullable private final Double score; @Nullable public final Double getScore() { return this.score; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/tone/FormalityPrediction.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/tone/FormalityPrediction;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-tone-formality"})
/*    */   public static final class $serializer implements GeneratedSerializer<FormalityPrediction> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)SentenceFormalityToneSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)DoubleSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public FormalityPrediction deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       SentenceFormalityTone sentenceFormalityTone = null;
/*    */       Double double_ = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         sentenceFormalityTone = (SentenceFormalityTone)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)SentenceFormalityToneSerializer.INSTANCE, sentenceFormalityTone);
/*    */         i |= 0x1;
/*    */         double_ = (Double)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DoubleSerializer.INSTANCE, double_);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               sentenceFormalityTone = (SentenceFormalityTone)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)SentenceFormalityToneSerializer.INSTANCE, sentenceFormalityTone);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               double_ = (Double)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DoubleSerializer.INSTANCE, double_);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new FormalityPrediction(i, sentenceFormalityTone, double_, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull FormalityPrediction value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       FormalityPrediction.write$Self$model_tone_formality(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.tone.FormalityPrediction", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("tone", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("score", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/tone/FormalityPrediction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/tone/FormalityPrediction;", "model-tone-formality"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<FormalityPrediction> serializer() {
/*    */       return (KSerializer<FormalityPrediction>)FormalityPrediction.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceFormalityTone getTone() {
/*    */     return this.tone;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceFormalityTone component1() {
/*    */     return this.tone;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Double component2() {
/*    */     return this.score;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FormalityPrediction copy(@NotNull SentenceFormalityTone tone, @Nullable Double score) {
/*    */     Intrinsics.checkNotNullParameter(tone, "tone");
/*    */     return new FormalityPrediction(tone, score);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FormalityPrediction(tone=" + this.tone + ", score=" + this.score + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.tone.hashCode();
/*    */     return result * 31 + ((this.score == null) ? 0 : this.score.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FormalityPrediction))
/*    */       return false; 
/*    */     FormalityPrediction formalityPrediction = (FormalityPrediction)other;
/*    */     return (this.tone != formalityPrediction.tone) ? false : (!!Intrinsics.areEqual(this.score, formalityPrediction.score));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tone-formality-jvm-0.4.32.jar!\ai\grazie\tone\FormalityPrediction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */