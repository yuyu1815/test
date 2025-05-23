/*    */ package ai.grazie.api.gateway.api.llm;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.LLMChat;
/*    */ import ai.grazie.model.llm.chat.LLMChat$;
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.attributes.Attributes$;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\013\020\025\032\004\030\0010\007HÆ\003J\013\020\026\032\004\030\0010\tHÆ\003J+\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\tHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\035HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\020\020\021R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\022\020\023¨\006("}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V3$Request;", "", "seen1", "", "chat", "Lai/grazie/model/llm/chat/LLMChat;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/chat/LLMChat;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;)V", "getChat", "()Lai/grazie/model/llm/chat/LLMChat;", "getParameters", "()Lai/grazie/utils/attributes/Attributes;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final LLMChat chat;
/*    */   @Nullable
/*    */   private final LLMProfileID profile;
/*    */   @Nullable
/*    */   private final Attributes parameters;
/*    */   
/* 32 */   public Request(@NotNull LLMChat chat, @Nullable LLMProfileID profile, @Nullable Attributes parameters) { this.chat = chat; this.profile = profile; this.parameters = parameters; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Chat.Stream.V3.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V3$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)LLMChat$.serializer.INSTANCE; arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)LLMProfileID.Serializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)Attributes$.serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public LlmAPI.Chat.Stream.V3.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LLMChat lLMChat = null; LLMProfileID lLMProfileID = null; Attributes attributes = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat); i |= 0x1; lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x2; attributes = (Attributes)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat); i |= 0x1; continue;case 1: lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x2; continue;case 2: attributes = (Attributes)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LlmAPI.Chat.Stream.V3.Request(i, lLMChat, lLMProfileID, attributes, null); } public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Chat.Stream.V3.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LlmAPI.Chat.Stream.V3.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.llm.LlmAPI.Chat.Stream.V3.Request", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("chat", false); pluginGeneratedSerialDescriptor.addElement("profile", true); pluginGeneratedSerialDescriptor.addElement("parameters", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final LLMChat getChat() { return this.chat; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V3$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V3$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LlmAPI.Chat.Stream.V3.Request> serializer() { return (KSerializer<LlmAPI.Chat.Stream.V3.Request>)LlmAPI.Chat.Stream.V3.Request.$serializer.INSTANCE; } } @Nullable public final LLMProfileID getProfile() { return this.profile; } @Nullable public final Attributes getParameters() { return this.parameters; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LLMChat component1() {
/*    */     return this.chat;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final LLMProfileID component2() {
/*    */     return this.profile;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Attributes component3() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull LLMChat chat, @Nullable LLMProfileID profile, @Nullable Attributes parameters) {
/*    */     Intrinsics.checkNotNullParameter(chat, "chat");
/*    */     return new Request(chat, profile, parameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(chat=" + this.chat + ", profile=" + this.profile + ", parameters=" + this.parameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.chat.hashCode();
/*    */     result = result * 31 + ((this.profile == null) ? 0 : this.profile.hashCode());
/*    */     return result * 31 + ((this.parameters == null) ? 0 : this.parameters.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.chat, request.chat) ? false : (!Intrinsics.areEqual(this.profile, request.profile) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$Chat$Stream$V3$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */