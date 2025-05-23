/*   */ package ai.grazie.model.llm.chat;@Serializable
/*   */ @Deprecated(message = "Use ai.grazie.model.llm.chat.v5.LLMChatMessage instead")
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\007HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\""}, d2 = {"Lai/grazie/model/llm/chat/LLMChatMessage;", "", "seen1", "", "role", "Lai/grazie/model/llm/chat/LLMChatRole;", "text", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/chat/LLMChatRole;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/chat/LLMChatRole;Ljava/lang/String;)V", "getRole", "()Lai/grazie/model/llm/chat/LLMChatRole;", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*   */ public final class LLMChatMessage {
/*   */   @NotNull
/* 6 */   public static final Companion Companion = new Companion(null); @NotNull private final LLMChatRole role; @NotNull
/*   */   private final String text; @JvmField
/*   */   @NotNull
/* 9 */   private static final KSerializer<Object>[] $childSerializers; public LLMChatMessage(@NotNull LLMChatRole role, @NotNull String text) { this.role = role; this.text = text; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = LLMChatRole.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final LLMChatRole getRole() { return this.role; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/LLMChatMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/LLMChatMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"}) public static final class $serializer implements GeneratedSerializer<LLMChatMessage> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LLMChatMessage.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LLMChatMessage deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LLMChatRole lLMChatRole = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LLMChatMessage.$childSerializers; if (compositeDecoder.decodeSequentially()) { lLMChatRole = (LLMChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], lLMChatRole); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: lLMChatRole = (LLMChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], lLMChatRole); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LLMChatMessage(i, lLMChatRole, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull LLMChatMessage value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LLMChatMessage.write$Self$model_llm(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.chat.LLMChatMessage", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("role", false); pluginGeneratedSerialDescriptor.addElement("text", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/chat/LLMChatMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/LLMChatMessage;", "model-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LLMChatMessage> serializer() { return (KSerializer<LLMChatMessage>)LLMChatMessage.$serializer.INSTANCE; } } @NotNull public final String getText() { return this.text; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final LLMChatRole component1() {
/*   */     return this.role;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String component2() {
/*   */     return this.text;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final LLMChatMessage copy(@NotNull LLMChatRole role, @NotNull String text) {
/*   */     Intrinsics.checkNotNullParameter(role, "role");
/*   */     Intrinsics.checkNotNullParameter(text, "text");
/*   */     return new LLMChatMessage(role, text);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "LLMChatMessage(role=" + this.role + ", text=" + this.text + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.role.hashCode();
/*   */     return result * 31 + this.text.hashCode();
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof LLMChatMessage))
/*   */       return false; 
/*   */     LLMChatMessage lLMChatMessage = (LLMChatMessage)other;
/*   */     return (this.role != lLMChatMessage.role) ? false : (!!Intrinsics.areEqual(this.text, lLMChatMessage.text));
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\LLMChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */