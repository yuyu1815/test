/*     */ package ai.grazie.api.gateway.api.llm;
/*     */ 
/*     */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChat;
/*     */ import ai.grazie.model.llm.chat.multimodal.LLMMultiModalChat$;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.prompt.LLMPromptID;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import ai.grazie.utils.attributes.Attributes$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B)\022\b\b\002\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\b\b\002\020\n\032\0020\013¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J\t\020\033\032\0020\013HÆ\003J1\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\"HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\020\020\021R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\026\020\027¨\006-"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request;", "", "seen1", "", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "chat", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;Lai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;Lai/grazie/utils/attributes/Attributes;)V", "getChat", "()Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "getParameters", "()Lai/grazie/utils/attributes/Attributes;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPrompt", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class Request
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final LLMPromptID prompt;
/*     */   @NotNull
/*     */   private final LLMProfileID profile;
/*     */   @NotNull
/*     */   private final LLMMultiModalChat chat;
/*     */   @NotNull
/*     */   private final Attributes parameters;
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.MultiModalChat.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */   public static final class $serializer
/*     */     implements GeneratedSerializer<Request>
/*     */   {
/*     */     @NotNull
/*     */     public static final $serializer INSTANCE = new $serializer();
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] typeParametersSerializers() {
/*     */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*     */       return (SerialDescriptor)descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] childSerializers() {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */       arrayOfKSerializer[0] = (KSerializer)LLMPromptID.Serializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)LLMProfileID.Serializer.INSTANCE;
/*     */       arrayOfKSerializer[2] = (KSerializer)LLMMultiModalChat$.serializer.INSTANCE;
/*     */       arrayOfKSerializer[3] = (KSerializer)Attributes$.serializer.INSTANCE;
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public LlmAPI.MultiModalChat.V1.Request deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       LLMPromptID lLMPromptID = null;
/*     */       LLMProfileID lLMProfileID = null;
/*     */       LLMMultiModalChat lLMMultiModalChat = null;
/*     */       Attributes attributes = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*     */         i |= 0x1;
/*     */         lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */         i |= 0x2;
/*     */         lLMMultiModalChat = (LLMMultiModalChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMMultiModalChat$.serializer.INSTANCE, lLMMultiModalChat);
/*     */         i |= 0x4;
/*     */         attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */         i |= 0x8;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */               i |= 0x2;
/*     */               continue;
/*     */             case 2:
/*     */               lLMMultiModalChat = (LLMMultiModalChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMMultiModalChat$.serializer.INSTANCE, lLMMultiModalChat);
/*     */               i |= 0x4;
/*     */               continue;
/*     */             case 3:
/*     */               attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */               i |= 0x8;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new LlmAPI.MultiModalChat.V1.Request(i, lLMPromptID, lLMProfileID, lLMMultiModalChat, attributes, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.MultiModalChat.V1.Request value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       LlmAPI.MultiModalChat.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.llm.LlmAPI.MultiModalChat.V1.Request", INSTANCE, 4);
/*     */       pluginGeneratedSerialDescriptor.addElement("prompt", true);
/*     */       pluginGeneratedSerialDescriptor.addElement("profile", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("chat", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("parameters", true);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$MultiModalChat$V1$Request;", "api-gateway-api"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<LlmAPI.MultiModalChat.V1.Request> serializer() {
/*     */       return (KSerializer<LlmAPI.MultiModalChat.V1.Request>)LlmAPI.MultiModalChat.V1.Request.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMPromptID getPrompt() {
/*     */     return this.prompt;
/*     */   }
/*     */   
/*     */   public Request(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMMultiModalChat chat, @NotNull Attributes parameters) {
/* 322 */     this.prompt = prompt;
/* 323 */     this.profile = profile; this.chat = chat; this.parameters = parameters; } @NotNull public final LLMProfileID getProfile() { return this.profile; } @NotNull public final LLMMultiModalChat getChat() { return this.chat; } @NotNull public final Attributes getParameters() { return this.parameters; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final LLMPromptID component1() {
/*     */     return this.prompt;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMProfileID component2() {
/*     */     return this.profile;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMMultiModalChat component3() {
/*     */     return this.chat;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Attributes component4() {
/*     */     return this.parameters;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Request copy(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMMultiModalChat chat, @NotNull Attributes parameters) {
/*     */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*     */     Intrinsics.checkNotNullParameter(profile, "profile");
/*     */     Intrinsics.checkNotNullParameter(chat, "chat");
/*     */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*     */     return new Request(prompt, profile, chat, parameters);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Request(prompt=" + this.prompt + ", profile=" + this.profile + ", chat=" + this.chat + ", parameters=" + this.parameters + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.prompt.hashCode();
/*     */     result = result * 31 + this.profile.hashCode();
/*     */     result = result * 31 + this.chat.hashCode();
/*     */     return result * 31 + this.parameters.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Request))
/*     */       return false; 
/*     */     Request request = (Request)other;
/*     */     return !Intrinsics.areEqual(this.prompt, request.prompt) ? false : (!Intrinsics.areEqual(this.profile, request.profile) ? false : (!Intrinsics.areEqual(this.chat, request.chat) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$MultiModalChat$V1$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */