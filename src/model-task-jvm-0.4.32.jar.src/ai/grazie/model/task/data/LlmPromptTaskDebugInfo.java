/*    */ package ai.grazie.model.task.data;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.model.llm.prompt.LLMPromptID;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J\t\020\033\032\0020\013HÆ\003J1\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\"HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\026\020\027¨\006-"}, d2 = {"Lai/grazie/model/task/data/LlmPromptTaskDebugInfo;", "", "seen1", "", "llmProfileId", "Lai/grazie/model/llm/profile/LLMProfileID;", "promptId", "Lai/grazie/model/llm/prompt/LLMPromptID;", "chat", "Lai/grazie/model/llm/chat/v5/LLMChat;", "attributes", "Lai/grazie/utils/attributes/Attributes;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;)V", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getChat", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "getLlmProfileId", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPromptId", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*    */ public final class LlmPromptTaskDebugInfo {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final LLMProfileID llmProfileId;
/*    */   
/* 15 */   public LlmPromptTaskDebugInfo(@NotNull LLMProfileID llmProfileId, @NotNull LLMPromptID promptId, @NotNull LLMChat chat, @NotNull Attributes attributes) { this.llmProfileId = llmProfileId;
/* 16 */     this.promptId = promptId;
/* 17 */     this.chat = chat;
/* 18 */     this.attributes = attributes; } @NotNull private final LLMPromptID promptId; @NotNull private final LLMChat chat; @NotNull private final Attributes attributes; @NotNull public final Attributes getAttributes() { return this.attributes; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/data/LlmPromptTaskDebugInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/data/LlmPromptTaskDebugInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class $serializer implements GeneratedSerializer<LlmPromptTaskDebugInfo> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */       arrayOfKSerializer[0] = (KSerializer)LLMProfileID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)LLMPromptID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)LLMChat$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)Attributes$.serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public LlmPromptTaskDebugInfo deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       LLMProfileID lLMProfileID = null;
/*    */       LLMPromptID lLMPromptID = null;
/*    */       LLMChat lLMChat = null;
/*    */       Attributes attributes = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */         i |= 0x1;
/*    */         lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*    */         i |= 0x2;
/*    */         lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*    */         i |= 0x4;
/*    */         attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*    */         i |= 0x8;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new LlmPromptTaskDebugInfo(i, lLMProfileID, lLMPromptID, lLMChat, attributes, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull LlmPromptTaskDebugInfo value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       LlmPromptTaskDebugInfo.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.data.LlmPromptTaskDebugInfo", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("llmProfileId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("promptId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("chat", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("attributes", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/data/LlmPromptTaskDebugInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/data/LlmPromptTaskDebugInfo;", "model-task"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<LlmPromptTaskDebugInfo> serializer() {
/*    */       return (KSerializer<LlmPromptTaskDebugInfo>)LlmPromptTaskDebugInfo.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMProfileID getLlmProfileId() {
/*    */     return this.llmProfileId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMPromptID getPromptId() {
/*    */     return this.promptId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMChat getChat() {
/*    */     return this.chat;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMProfileID component1() {
/*    */     return this.llmProfileId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMPromptID component2() {
/*    */     return this.promptId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMChat component3() {
/*    */     return this.chat;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes component4() {
/*    */     return this.attributes;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LlmPromptTaskDebugInfo copy(@NotNull LLMProfileID llmProfileId, @NotNull LLMPromptID promptId, @NotNull LLMChat chat, @NotNull Attributes attributes) {
/*    */     Intrinsics.checkNotNullParameter(llmProfileId, "llmProfileId");
/*    */     Intrinsics.checkNotNullParameter(promptId, "promptId");
/*    */     Intrinsics.checkNotNullParameter(chat, "chat");
/*    */     Intrinsics.checkNotNullParameter(attributes, "attributes");
/*    */     return new LlmPromptTaskDebugInfo(llmProfileId, promptId, chat, attributes);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LlmPromptTaskDebugInfo(llmProfileId=" + this.llmProfileId + ", promptId=" + this.promptId + ", chat=" + this.chat + ", attributes=" + this.attributes + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.llmProfileId.hashCode();
/*    */     result = result * 31 + this.promptId.hashCode();
/*    */     result = result * 31 + this.chat.hashCode();
/*    */     return result * 31 + this.attributes.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LlmPromptTaskDebugInfo))
/*    */       return false; 
/*    */     LlmPromptTaskDebugInfo llmPromptTaskDebugInfo = (LlmPromptTaskDebugInfo)other;
/*    */     return !Intrinsics.areEqual(this.llmProfileId, llmPromptTaskDebugInfo.llmProfileId) ? false : (!Intrinsics.areEqual(this.promptId, llmPromptTaskDebugInfo.promptId) ? false : (!Intrinsics.areEqual(this.chat, llmPromptTaskDebugInfo.chat) ? false : (!!Intrinsics.areEqual(this.attributes, llmPromptTaskDebugInfo.attributes))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\data\LlmPromptTaskDebugInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */