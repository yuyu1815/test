/*     */ package ai.grazie.api.gateway.api.llm;
/*     */ 
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.SseConfig;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import ai.grazie.model.cloud.sse.continuous.Data;
/*     */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*     */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*     */ import ai.grazie.model.llm.chat.v5.LLMChat$;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.model.llm.prompt.LLMPromptID;
/*     */ import ai.grazie.quota.Quota;
/*     */ import ai.grazie.quota.Quota$;
/*     */ import ai.grazie.utils.attributes.Attributes;
/*     */ import ai.grazie.utils.attributes.Attributes$;
/*     */ import ai.grazie.utils.mpp.money.Credit;
/*     */ import ai.grazie.utils.mpp.money.Credit$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.LazyThreadSafetyMode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.EncodeDefault;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SealedClassSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\027\030B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026¨\006\031"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "sseConfig", "Lai/grazie/model/cloud/SseConfig;", "getSseConfig", "()Lai/grazie/model/cloud/SseConfig;", "LLMData", "Request", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nLlmAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LlmAPI.kt\nai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,361:1\n19#2,2:362\n19#2,2:364\n*S KotlinDebug\n*F\n+ 1 LlmAPI.kt\nai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6\n*L\n66#1:362,2\n67#1:364,2\n*E\n"})
/*     */ public final class V6 implements TypedApi<LlmAPI.Chat.Stream.V6.Request, LlmAPI.Chat.Stream.V6.LLMData> {
/*     */   @NotNull
/*     */   private static final TypeInfo<Request> requestType;
/*     */   @NotNull
/*     */   private static final TypeInfo<LLMData> responseType;
/*     */   @NotNull
/*  66 */   public static final V6 INSTANCE = new V6(); @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 362 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 363 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 364 */     kType$iv = Reflection.typeOf(LLMData.class);
/* 365 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(LLMData.class)); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TypeInfo<LLMData> getResponseType() {
/*     */     return responseType;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final SseConfig sseConfig = new SseConfig(null, 1, null);
/*     */   
/*     */   @NotNull
/*     */   public SseConfig getSseConfig() {
/*     */     return sseConfig;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final HttpMethod httpMethod = HttpMethod.Post;
/*     */   
/*     */   @NotNull
/*     */   public HttpMethod getHttpMethod() {
/*     */     return httpMethod;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final String path = "/llm/chat/stream/v6";
/*     */   
/*     */   @NotNull
/*     */   public String getPath() {
/*     */     return path;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B)\022\b\b\002\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\b\b\002\020\n\032\0020\013¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J\t\020\033\032\0020\013HÆ\003J1\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\"HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\020\020\021R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\026\020\027¨\006-"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;", "", "seen1", "", "prompt", "Lai/grazie/model/llm/prompt/LLMPromptID;", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "chat", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;)V", "getChat", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "getParameters", "()Lai/grazie/utils/attributes/Attributes;", "getProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPrompt", "()Lai/grazie/model/llm/prompt/LLMPromptID;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Request {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final LLMPromptID prompt;
/*     */     @NotNull
/*     */     private final LLMProfileID profile;
/*     */     @NotNull
/*     */     private final LLMChat chat;
/*     */     @NotNull
/*     */     private final Attributes parameters;
/*     */     
/*     */     public Request(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters) {
/*     */       this.prompt = prompt;
/*     */       this.profile = profile;
/*     */       this.chat = chat;
/*     */       this.parameters = parameters;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Chat.Stream.V6.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */     public static final class $serializer implements GeneratedSerializer<Request> {
/*     */       @NotNull
/*     */       public static final $serializer INSTANCE = new $serializer();
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] typeParametersSerializers() {
/*     */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public SerialDescriptor getDescriptor() {
/*     */         return (SerialDescriptor)descriptor;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] childSerializers() {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */         arrayOfKSerializer[0] = (KSerializer)LLMPromptID.Serializer.INSTANCE;
/*     */         arrayOfKSerializer[1] = (KSerializer)LLMProfileID.Serializer.INSTANCE;
/*     */         arrayOfKSerializer[2] = (KSerializer)LLMChat$.serializer.INSTANCE;
/*     */         arrayOfKSerializer[3] = (KSerializer)Attributes$.serializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public LlmAPI.Chat.Stream.V6.Request deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         LLMPromptID lLMPromptID = null;
/*     */         LLMProfileID lLMProfileID = null;
/*     */         LLMChat lLMChat = null;
/*     */         Attributes attributes = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*     */           i |= 0x1;
/*     */           lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */           i |= 0x2;
/*     */           lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*     */           i |= 0x4;
/*     */           attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */           i |= 0x8;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 lLMPromptID = (LLMPromptID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LLMPromptID.Serializer.INSTANCE, lLMPromptID);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 lLMProfileID = (LLMProfileID)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */               case 3:
/*     */                 attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*     */                 i |= 0x8;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new LlmAPI.Chat.Stream.V6.Request(i, lLMPromptID, lLMProfileID, lLMChat, attributes, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Chat.Stream.V6.Request value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         LlmAPI.Chat.Stream.V6.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.llm.LlmAPI.Chat.Stream.V6.Request", INSTANCE, 4);
/*     */         pluginGeneratedSerialDescriptor.addElement("prompt", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("profile", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("chat", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("parameters", true);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$Request;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<LlmAPI.Chat.Stream.V6.Request> serializer() {
/*     */         return (KSerializer<LlmAPI.Chat.Stream.V6.Request>)LlmAPI.Chat.Stream.V6.Request.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LLMPromptID getPrompt() {
/*     */       return this.prompt;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LLMProfileID getProfile() {
/*     */       return this.profile;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LLMChat getChat() {
/*     */       return this.chat;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Attributes getParameters() {
/*     */       return this.parameters;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LLMPromptID component1() {
/*     */       return this.prompt;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LLMProfileID component2() {
/*     */       return this.profile;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LLMChat component3() {
/*     */       return this.chat;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Attributes component4() {
/*     */       return this.parameters;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull LLMPromptID prompt, @NotNull LLMProfileID profile, @NotNull LLMChat chat, @NotNull Attributes parameters) {
/*     */       Intrinsics.checkNotNullParameter(prompt, "prompt");
/*     */       Intrinsics.checkNotNullParameter(profile, "profile");
/*     */       Intrinsics.checkNotNullParameter(chat, "chat");
/*     */       Intrinsics.checkNotNullParameter(parameters, "parameters");
/*     */       return new Request(prompt, profile, chat, parameters);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(prompt=" + this.prompt + ", profile=" + this.profile + ", chat=" + this.chat + ", parameters=" + this.parameters + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.prompt.hashCode();
/*     */       result = result * 31 + this.profile.hashCode();
/*     */       result = result * 31 + this.chat.hashCode();
/*     */       return result * 31 + this.parameters.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return !Intrinsics.areEqual(this.prompt, request.prompt) ? false : (!Intrinsics.areEqual(this.profile, request.profile) ? false : (!Intrinsics.areEqual(this.chat, request.chat) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters))));
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0252\0020\001:\004\025\026\027\030B%\b\027\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\007\b\004¢\006\002\020\tJ!\020\016\032\0020\0172\006\020\020\032\0020\0002\006\020\021\032\0020\0222\006\020\023\032\0020\024HÇ\001R\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\r\001\003\031\032\033¨\006\034"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "content", "", "getContent", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Content", "FunctionCall", "QuotaMetadata", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Content;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$FunctionCall;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$QuotaMetadata;", "api-gateway-api"})
/*     */   public static abstract class LLMData extends Data {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     @NotNull
/*     */     private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */       arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public abstract String getContent();
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*     */       public static final null INSTANCE = (null)new Function0<>();
/*     */       
/*     */       null() {
/*     */         super(0);
/*     */       }
/*     */       
/*     */       public final KSerializer<Object> invoke() {
/*     */         KClass[] arrayOfKClass = new KClass[3];
/*     */         arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V6.LLMData.Content.class);
/*     */         arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V6.LLMData.FunctionCall.class);
/*     */         arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata.class);
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */         arrayOfKSerializer[0] = (KSerializer)LlmAPI.Chat.Stream.V6.LLMData.Content.$serializer.INSTANCE;
/*     */         arrayOfKSerializer[1] = (KSerializer)LlmAPI.Chat.Stream.V6.LLMData.FunctionCall.$serializer.INSTANCE;
/*     */         arrayOfKSerializer[2] = (KSerializer)LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata.$serializer.INSTANCE;
/*     */         return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.api.gateway.api.llm.LlmAPI.Chat.Stream.V6.LLMData", Reflection.getOrCreateKotlinClass(LlmAPI.Chat.Stream.V6.LLMData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<LlmAPI.Chat.Stream.V6.LLMData> serializer() {
/*     */         return get$cachedSerializer();
/*     */       }
/*     */     }
/*     */     
/*     */     private LLMData() {}
/*     */     
/*     */     @Serializable
/*     */     @SerialName("Content")
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\031\022\006\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\003¢\006\002\020\fJ\t\020\022\032\0020\007HÆ\003J\020\020\023\032\004\030\0010\003HÆ\003¢\006\002\020\016J$\020\024\032\0020\0002\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\003HÆ\001¢\006\002\020\025J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\007HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\025\020\b\032\004\030\0010\003¢\006\n\n\002\020\017\032\004\b\r\020\016R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\020\020\021¨\006&"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Content;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "content", "", "choiceIndex", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getChoiceIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Content;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */     public static final class Content extends LLMData {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final String content;
/*     */       @Nullable
/*     */       private final Integer choiceIndex;
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */         arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */         arrayOfKSerializer[1] = null;
/*     */         arrayOfKSerializer[2] = null;
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Content))
/*     */           return false; 
/*     */         Content content = (Content)other;
/*     */         return !Intrinsics.areEqual(this.content, content.content) ? false : (!!Intrinsics.areEqual(this.choiceIndex, content.choiceIndex));
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = this.content.hashCode();
/*     */         return result * 31 + ((this.choiceIndex == null) ? 0 : this.choiceIndex.hashCode());
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Content(content=" + this.content + ", choiceIndex=" + this.choiceIndex + ")";
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Content copy(@NotNull String content, @Nullable Integer choiceIndex) {
/*     */         Intrinsics.checkNotNullParameter(content, "content");
/*     */         return new Content(content, choiceIndex);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Integer component2() {
/*     */         return this.choiceIndex;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component1() {
/*     */         return this.content;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Chat.Stream.V6.LLMData.Content.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Content;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */       public static final class $serializer implements GeneratedSerializer<Content> {
/*     */         @NotNull
/*     */         public static final $serializer INSTANCE = new $serializer();
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] typeParametersSerializers() {
/*     */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public SerialDescriptor getDescriptor() {
/*     */           return (SerialDescriptor)descriptor;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] childSerializers() {
/*     */           KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.Chat.Stream.V6.LLMData.Content.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */           arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */           arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */           arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*     */           return (KSerializer<?>[])arrayOfKSerializer2;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public LlmAPI.Chat.Stream.V6.LLMData.Content deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           ContinuousSSEEventType continuousSSEEventType = null;
/*     */           String str = null;
/*     */           Integer integer = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.Chat.Stream.V6.LLMData.Content.$childSerializers;
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */             i |= 0x1;
/*     */             str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */             i |= 0x2;
/*     */             integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*     */             i |= 0x4;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */                 case 1:
/*     */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                   i |= 0x2;
/*     */                   continue;
/*     */                 case 2:
/*     */                   integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*     */                   i |= 0x4;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new LlmAPI.Chat.Stream.V6.LLMData.Content(i, continuousSSEEventType, str, integer, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Chat.Stream.V6.LLMData.Content value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           LlmAPI.Chat.Stream.V6.LLMData.Content.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Content", INSTANCE, 3);
/*     */           pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */           pluginGeneratedSerialDescriptor.addElement("content", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("choiceIndex", true);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Content$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$Content;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<LlmAPI.Chat.Stream.V6.LLMData.Content> serializer() {
/*     */           return (KSerializer<LlmAPI.Chat.Stream.V6.LLMData.Content>)LlmAPI.Chat.Stream.V6.LLMData.Content.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Integer getChoiceIndex() {
/*     */         return this.choiceIndex;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String getContent() {
/*     */         return this.content;
/*     */       }
/*     */       
/*     */       public Content(@NotNull String content, @Nullable Integer choiceIndex) {
/*     */         super(null);
/*     */         this.content = content;
/*     */         this.choiceIndex = choiceIndex;
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @SerialName("FunctionCall")
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\016\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\003\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB#\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\007\022\n\b\002\020\t\032\004\030\0010\003¢\006\002\020\rJ\013\020\024\032\004\030\0010\007HÆ\003J\t\020\025\032\0020\007HÆ\003J\020\020\026\032\004\030\0010\003HÆ\003¢\006\002\020\017J0\020\027\032\0020\0002\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\003HÆ\001¢\006\002\020\030J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\007HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\025\020\t\032\004\030\0010\003¢\006\n\n\002\020\020\032\004\b\016\020\017R\024\020\b\032\0020\007X\004¢\006\b\n\000\032\004\b\021\020\022R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\023\020\022¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$FunctionCall;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "name", "", "content", "choiceIndex", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getChoiceIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContent", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$FunctionCall;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */     public static final class FunctionCall extends LLMData {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @Nullable
/*     */       private final String name;
/*     */       @NotNull
/*     */       private final String content;
/*     */       @Nullable
/*     */       private final Integer choiceIndex;
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */         arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */         arrayOfKSerializer[1] = null;
/*     */         arrayOfKSerializer[2] = null;
/*     */         arrayOfKSerializer[3] = null;
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof FunctionCall))
/*     */           return false; 
/*     */         FunctionCall functionCall = (FunctionCall)other;
/*     */         return !Intrinsics.areEqual(this.name, functionCall.name) ? false : (!Intrinsics.areEqual(this.content, functionCall.content) ? false : (!!Intrinsics.areEqual(this.choiceIndex, functionCall.choiceIndex)));
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = (this.name == null) ? 0 : this.name.hashCode();
/*     */         result = result * 31 + this.content.hashCode();
/*     */         return result * 31 + ((this.choiceIndex == null) ? 0 : this.choiceIndex.hashCode());
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "FunctionCall(name=" + this.name + ", content=" + this.content + ", choiceIndex=" + this.choiceIndex + ")";
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final FunctionCall copy(@Nullable String name, @NotNull String content, @Nullable Integer choiceIndex) {
/*     */         Intrinsics.checkNotNullParameter(content, "content");
/*     */         return new FunctionCall(name, content, choiceIndex);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Integer component3() {
/*     */         return this.choiceIndex;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component2() {
/*     */         return this.content;
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final String component1() {
/*     */         return this.name;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Chat.Stream.V6.LLMData.FunctionCall.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$FunctionCall;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */       public static final class $serializer implements GeneratedSerializer<FunctionCall> {
/*     */         @NotNull
/*     */         public static final $serializer INSTANCE = new $serializer();
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] typeParametersSerializers() {
/*     */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public SerialDescriptor getDescriptor() {
/*     */           return (SerialDescriptor)descriptor;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] childSerializers() {
/*     */           KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.Chat.Stream.V6.LLMData.FunctionCall.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*     */           arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */           arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */           arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */           arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*     */           return (KSerializer<?>[])arrayOfKSerializer2;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public LlmAPI.Chat.Stream.V6.LLMData.FunctionCall deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           ContinuousSSEEventType continuousSSEEventType = null;
/*     */           String str1 = null, str2 = null;
/*     */           Integer integer = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.Chat.Stream.V6.LLMData.FunctionCall.$childSerializers;
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */             i |= 0x1;
/*     */             str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */             i |= 0x2;
/*     */             str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */             i |= 0x4;
/*     */             integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*     */             i |= 0x8;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */                 case 1:
/*     */                   str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */                   i |= 0x2;
/*     */                   continue;
/*     */                 case 2:
/*     */                   str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */                   i |= 0x4;
/*     */                   continue;
/*     */                 case 3:
/*     */                   integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer);
/*     */                   i |= 0x8;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new LlmAPI.Chat.Stream.V6.LLMData.FunctionCall(i, continuousSSEEventType, str1, str2, integer, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Chat.Stream.V6.LLMData.FunctionCall value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           LlmAPI.Chat.Stream.V6.LLMData.FunctionCall.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FunctionCall", INSTANCE, 4);
/*     */           pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */           pluginGeneratedSerialDescriptor.addElement("name", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("content", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("choiceIndex", true);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$FunctionCall$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$FunctionCall;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<LlmAPI.Chat.Stream.V6.LLMData.FunctionCall> serializer() {
/*     */           return (KSerializer<LlmAPI.Chat.Stream.V6.LLMData.FunctionCall>)LlmAPI.Chat.Stream.V6.LLMData.FunctionCall.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Integer getChoiceIndex() {
/*     */         return this.choiceIndex;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String getContent() {
/*     */         return this.content;
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final String getName() {
/*     */         return this.name;
/*     */       }
/*     */       
/*     */       public FunctionCall(@Nullable String name, @NotNull String content, @Nullable Integer choiceIndex) {
/*     */         super(null);
/*     */         this.name = name;
/*     */         this.content = content;
/*     */         this.choiceIndex = choiceIndex;
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @SerialName("QuotaMetadata")
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 (2\0020\001:\002'(BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B\025\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\017J\t\020\026\032\0020\007HÆ\003J\t\020\027\032\0020\tHÆ\003J\035\020\030\032\0020\0002\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\013HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\024\020\n\032\0020\013XD¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$QuotaMetadata;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "updated", "Lai/grazie/quota/Quota;", "spent", "Lai/grazie/utils/mpp/money/Credit;", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/Quota;Lai/grazie/utils/mpp/money/Credit;)V", "getContent", "()Ljava/lang/String;", "getSpent", "()Lai/grazie/utils/mpp/money/Credit;", "getUpdated", "()Lai/grazie/quota/Quota;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */     public static final class QuotaMetadata extends LLMData {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final Quota updated;
/*     */       @NotNull
/*     */       private final Credit spent;
/*     */       @NotNull
/*     */       private final String content;
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */         arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer();
/*     */         arrayOfKSerializer[1] = null;
/*     */         arrayOfKSerializer[2] = null;
/*     */         arrayOfKSerializer[3] = null;
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/llm/LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$QuotaMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */       public static final class $serializer implements GeneratedSerializer<QuotaMetadata> {
/*     */         @NotNull
/*     */         public static final $serializer INSTANCE = new $serializer();
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] typeParametersSerializers() {
/*     */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public SerialDescriptor getDescriptor() {
/*     */           return (SerialDescriptor)descriptor;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] childSerializers() {
/*     */           KSerializer[] arrayOfKSerializer1 = (KSerializer[])LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*     */           arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */           arrayOfKSerializer2[1] = (KSerializer)Quota$.serializer.INSTANCE;
/*     */           arrayOfKSerializer2[2] = (KSerializer)Credit$.serializer.INSTANCE;
/*     */           arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer2;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           ContinuousSSEEventType continuousSSEEventType = null;
/*     */           Quota quota = null;
/*     */           Credit credit = null;
/*     */           String str = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           KSerializer[] arrayOfKSerializer = (KSerializer[])LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata.$childSerializers;
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */             i |= 0x1;
/*     */             quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota);
/*     */             i |= 0x2;
/*     */             credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*     */             i |= 0x4;
/*     */             str = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */             i |= 0x8;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */                 case 1:
/*     */                   quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota);
/*     */                   i |= 0x2;
/*     */                   continue;
/*     */                 case 2:
/*     */                   credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*     */                   i |= 0x4;
/*     */                   continue;
/*     */                 case 3:
/*     */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */                   i |= 0x8;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata(i, continuousSSEEventType, quota, credit, str, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("QuotaMetadata", INSTANCE, 4);
/*     */           pluginGeneratedSerialDescriptor.addElement("event_type", true);
/*     */           pluginGeneratedSerialDescriptor.addElement("updated", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("spent", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("content", true);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$QuotaMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/llm/LlmAPI$Chat$Stream$V6$LLMData$QuotaMetadata;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata> serializer() {
/*     */           return (KSerializer<LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata>)LlmAPI.Chat.Stream.V6.LLMData.QuotaMetadata.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       public QuotaMetadata(@NotNull Quota updated, @NotNull Credit spent) {
/*     */         super(null);
/*     */         this.updated = updated;
/*     */         this.spent = spent;
/*     */         this.content = "";
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Quota getUpdated() {
/*     */         return this.updated;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Credit getSpent() {
/*     */         return this.spent;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String getContent() {
/*     */         return this.content;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Quota component1() {
/*     */         return this.updated;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Credit component2() {
/*     */         return this.spent;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final QuotaMetadata copy(@NotNull Quota updated, @NotNull Credit spent) {
/*     */         Intrinsics.checkNotNullParameter(updated, "updated");
/*     */         Intrinsics.checkNotNullParameter(spent, "spent");
/*     */         return new QuotaMetadata(updated, spent);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "QuotaMetadata(updated=" + this.updated + ", spent=" + this.spent + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = this.updated.hashCode();
/*     */         return result * 31 + this.spent.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof QuotaMetadata))
/*     */           return false; 
/*     */         QuotaMetadata quotaMetadata = (QuotaMetadata)other;
/*     */         return !Intrinsics.areEqual(this.updated, quotaMetadata.updated) ? false : (!!Intrinsics.areEqual(this.spent, quotaMetadata.spent));
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\llm\LlmAPI$Chat$Stream$V6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */