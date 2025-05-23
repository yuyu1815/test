/*    */ package ai.grazie.api.gateway.api.chat;
/*    */ import ai.grazie.model.chat.StoredChat;
/*    */ import ai.grazie.model.cloud.TypeInfo;
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat$;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KType;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/chat/ChatAPI$Update;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Request;", "Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*    */ @SourceDebugExtension({"SMAP\nChatAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatAPI.kt\nai/grazie/api/gateway/api/chat/ChatAPI$Update\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,79:1\n19#2,2:80\n19#2,2:82\n*S KotlinDebug\n*F\n+ 1 ChatAPI.kt\nai/grazie/api/gateway/api/chat/ChatAPI$Update\n*L\n28#1:80,2\n29#1:82,2\n*E\n"})
/*    */ public final class Update implements TypedApi<ChatAPI.Update.Request, ChatAPI.Update.Response> {
/*    */   @NotNull
/* 28 */   public static final Update INSTANCE = new Update(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 80 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 81 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 82 */     kType$iv = Reflection.typeOf(Response.class);
/* 83 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public TypeInfo<Response> getResponseType() {
/*    */     return responseType;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final HttpMethod httpMethod = HttpMethod.Post;
/*    */   
/*    */   @NotNull
/*    */   public HttpMethod getHttpMethod() {
/*    */     return httpMethod;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final String path = "/chat/update";
/*    */   
/*    */   @NotNull
/*    */   public String getPath() {
/*    */     return path;
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\024\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*B?\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J\t\020\033\032\0020\013HÆ\003J1\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\035\032\0020\t2\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\003HÖ\001J\t\020 \032\0020\007HÖ\001J&\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'HÁ\001¢\006\002\b(R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\026\020\027¨\006+"}, d2 = {"Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Request;", "", "seen1", "", "chatId", "Lai/grazie/utils/mpp/UUID;", "name", "", "pinned", "", "content", "Lai/grazie/model/llm/chat/v5/LLMChat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Ljava/lang/String;ZLai/grazie/model/llm/chat/v5/LLMChat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;Ljava/lang/String;ZLai/grazie/model/llm/chat/v5/LLMChat;)V", "getChatId", "()Lai/grazie/utils/mpp/UUID;", "getContent", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "getName", "()Ljava/lang/String;", "getPinned", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Request {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final UUID chatId;
/*    */     @NotNull
/*    */     private final String name;
/*    */     private final boolean pinned;
/*    */     @NotNull
/*    */     private final LLMChat content;
/*    */     
/*    */     public Request(@NotNull UUID chatId, @NotNull String name, boolean pinned, @NotNull LLMChat content) {
/*    */       this.chatId = chatId;
/*    */       this.name = name;
/*    */       this.pinned = pinned;
/*    */       this.content = content;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/chat/ChatAPI.Update.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */     public static final class $serializer implements GeneratedSerializer<Request> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */         arrayOfKSerializer[0] = (KSerializer)UUID.Serializer.INSTANCE;
/*    */         arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */         arrayOfKSerializer[2] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */         arrayOfKSerializer[3] = (KSerializer)LLMChat$.serializer.INSTANCE;
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public ChatAPI.Update.Request deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         UUID uUID = null;
/*    */         String str = null;
/*    */         boolean bool1 = false;
/*    */         LLMChat lLMChat = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*    */           i |= 0x1;
/*    */           str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */           i |= 0x2;
/*    */           bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2);
/*    */           i |= 0x4;
/*    */           lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*    */           i |= 0x8;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */               case 2:
/*    */                 bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2);
/*    */                 i |= 0x4;
/*    */                 continue;
/*    */               case 3:
/*    */                 lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*    */                 i |= 0x8;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new ChatAPI.Update.Request(i, uUID, str, bool1, lLMChat, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull ChatAPI.Update.Request value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         ChatAPI.Update.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.chat.ChatAPI.Update.Request", INSTANCE, 4);
/*    */         pluginGeneratedSerialDescriptor.addElement("chatId", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("name", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("pinned", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("content", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Request;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<ChatAPI.Update.Request> serializer() {
/*    */         return (KSerializer<ChatAPI.Update.Request>)ChatAPI.Update.Request.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final UUID getChatId() {
/*    */       return this.chatId;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getName() {
/*    */       return this.name;
/*    */     }
/*    */     
/*    */     public final boolean getPinned() {
/*    */       return this.pinned;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final LLMChat getContent() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final UUID component1() {
/*    */       return this.chatId;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.name;
/*    */     }
/*    */     
/*    */     public final boolean component3() {
/*    */       return this.pinned;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final LLMChat component4() {
/*    */       return this.content;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull UUID chatId, @NotNull String name, boolean pinned, @NotNull LLMChat content) {
/*    */       Intrinsics.checkNotNullParameter(chatId, "chatId");
/*    */       Intrinsics.checkNotNullParameter(name, "name");
/*    */       Intrinsics.checkNotNullParameter(content, "content");
/*    */       return new Request(chatId, name, pinned, content);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(chatId=" + this.chatId + ", name=" + this.name + ", pinned=" + this.pinned + ", content=" + this.content + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.chatId.hashCode();
/*    */       result = result * 31 + this.name.hashCode();
/*    */       result = result * 31 + Boolean.hashCode(this.pinned);
/*    */       return result * 31 + this.content.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return !Intrinsics.areEqual(this.chatId, request.chatId) ? false : (!Intrinsics.areEqual(this.name, request.name) ? false : ((this.pinned != request.pinned) ? false : (!!Intrinsics.areEqual(this.content, request.content))));
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Response;", "", "seen1", "", "chat", "Lai/grazie/model/chat/StoredChat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/chat/StoredChat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/chat/StoredChat;)V", "getChat", "()Lai/grazie/model/chat/StoredChat;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Response {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final StoredChat chat;
/*    */     
/*    */     public Response(@NotNull StoredChat chat) {
/*    */       this.chat = chat;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/chat/ChatAPI.Update.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */     public static final class $serializer implements GeneratedSerializer<Response> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */         arrayOfKSerializer[0] = (KSerializer)StoredChat$.serializer.INSTANCE;
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public ChatAPI.Update.Response deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         StoredChat storedChat = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           storedChat = (StoredChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChat$.serializer.INSTANCE, storedChat);
/*    */           i |= 0x1;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 storedChat = (StoredChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChat$.serializer.INSTANCE, storedChat);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new ChatAPI.Update.Response(i, storedChat, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull ChatAPI.Update.Response value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         ChatAPI.Update.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.chat.ChatAPI.Update.Response", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("chat", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/chat/ChatAPI$Update$Response;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<ChatAPI.Update.Response> serializer() {
/*    */         return (KSerializer<ChatAPI.Update.Response>)ChatAPI.Update.Response.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final StoredChat getChat() {
/*    */       return this.chat;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final StoredChat component1() {
/*    */       return this.chat;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Response copy(@NotNull StoredChat chat) {
/*    */       Intrinsics.checkNotNullParameter(chat, "chat");
/*    */       return new Response(chat);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Response(chat=" + this.chat + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.chat.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Response))
/*    */         return false; 
/*    */       Response response = (Response)other;
/*    */       return !!Intrinsics.areEqual(this.chat, response.chat);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\chat\ChatAPI$Update.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */