/*     */ package ai.grazie.user.storage.model;
/*     */ import ai.grazie.model.chat.StoredChat;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.utils.mpp.UUID;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Deprecated(message = "JBAI-5047 in favour of Get.V2")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\b\bÇ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\003\023\024\025B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\026"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/user/storage/model/ChatApi$Get$Request;", "Lai/grazie/user/storage/model/ChatApi$Get$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "V2", "user-strg-model"})
/*     */ @SourceDebugExtension({"SMAP\nChatApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatApi.kt\nai/grazie/user/storage/model/ChatApi$Get\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,152:1\n19#2,2:153\n19#2,2:155\n*S KotlinDebug\n*F\n+ 1 ChatApi.kt\nai/grazie/user/storage/model/ChatApi$Get\n*L\n31#1:153,2\n32#1:155,2\n*E\n"})
/*     */ public final class Get implements TypedApi<ChatApi.Get.Request, ChatApi.Get.Response> {
/*     */   @NotNull
/*  29 */   public static final Get INSTANCE = new Get(); @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull
/*  30 */   private static final String path = "/chat/get"; @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public String getPath() { return path; } @NotNull
/*  31 */   public TypeInfo<Request> getRequestType() { return requestType; } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$Request;", "", "seen1", "", "id", "Lai/grazie/utils/mpp/UUID;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;)V", "getId", "()Lai/grazie/utils/mpp/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final UUID id; public Request(@NotNull UUID id) { this.id = id; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/ChatApi.Get.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)UUID.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public ChatApi.Get.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; UUID uUID = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ChatApi.Get.Request(i, uUID, null); } public void serialize(@NotNull Encoder encoder, @NotNull ChatApi.Get.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ChatApi.Get.Request.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.ChatApi.Get.Request", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("id", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$Request;", "user-strg-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ChatApi.Get.Request> serializer() { return (KSerializer<ChatApi.Get.Request>)ChatApi.Get.Request.$serializer.INSTANCE; } } @NotNull public final UUID getId() { return this.id; } @NotNull public final UUID component1() { return this.id; } @NotNull public final Request copy(@NotNull UUID id) { Intrinsics.checkNotNullParameter(id, "id"); return new Request(id); } @NotNull public String toString() { return "Request(id=" + this.id + ")"; } public int hashCode() { return this.id.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !!Intrinsics.areEqual(this.id, request.id); } } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 154 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 155 */     kType$iv = Reflection.typeOf(Response.class);
/* 156 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$Response;", "", "seen1", "", "chat", "Lai/grazie/user/storage/model/StoredChat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/user/storage/model/StoredChat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/user/storage/model/StoredChat;)V", "getChat", "()Lai/grazie/user/storage/model/StoredChat;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final StoredChat chat; public Response(@NotNull StoredChat chat) { this.chat = chat; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/ChatApi.Get.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)StoredChat.$serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public ChatApi.Get.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; StoredChat storedChat = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { storedChat = (StoredChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChat.$serializer.INSTANCE, storedChat); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: storedChat = (StoredChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChat.$serializer.INSTANCE, storedChat); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ChatApi.Get.Response(i, storedChat, null); } public void serialize(@NotNull Encoder encoder, @NotNull ChatApi.Get.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ChatApi.Get.Response.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.ChatApi.Get.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("chat", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$Response;", "user-strg-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ChatApi.Get.Response> serializer() { return (KSerializer<ChatApi.Get.Response>)ChatApi.Get.Response.$serializer.INSTANCE; } } @NotNull public final StoredChat getChat() { return this.chat; } @NotNull public final StoredChat component1() { return this.chat; } @NotNull public final Response copy(@NotNull StoredChat chat) { Intrinsics.checkNotNullParameter(chat, "chat"); return new Response(chat); } @NotNull public String toString() { return "Response(chat=" + this.chat + ")"; } public int hashCode() { return this.chat.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.chat, response.chat); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$V2;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/user/storage/model/ChatApi$Get$V2$Request;", "Lai/grazie/user/storage/model/ChatApi$Get$V2$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "user-strg-model"}) @SourceDebugExtension({"SMAP\nChatApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatApi.kt\nai/grazie/user/storage/model/ChatApi$Get$V2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,152:1\n19#2,2:153\n19#2,2:155\n*S KotlinDebug\n*F\n+ 1 ChatApi.kt\nai/grazie/user/storage/model/ChatApi$Get$V2\n*L\n41#1:153,2\n42#1:155,2\n*E\n"}) public static final class V2 implements TypedApi<V2.Request, V2.Response> { static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public static final V2 INSTANCE = new V2();
/*     */     @NotNull
/*     */     private static final TypeInfo<Request> requestType;
/*     */     @NotNull
/*     */     private static final TypeInfo<Response> responseType;
/*     */     
/*     */     @NotNull
/*     */     public TypeInfo<Request> getRequestType() {
/*     */       return requestType;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public TypeInfo<Response> getResponseType() {
/*     */       return responseType;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final HttpMethod httpMethod = HttpMethod.Post;
/*     */     
/*     */     @NotNull
/*     */     public HttpMethod getHttpMethod() {
/*     */       return httpMethod;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final String path = "/chat/get_v2";
/*     */     
/*     */     @NotNull
/*     */     public String getPath() {
/*     */       return path;
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$V2$Request;", "", "seen1", "", "chatId", "Lai/grazie/utils/mpp/UUID;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;)V", "getChatId", "()Lai/grazie/utils/mpp/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"})
/*     */     public static final class Request {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final UUID chatId;
/*     */       
/*     */       public Request(@NotNull UUID chatId) {
/*     */         this.chatId = chatId;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/ChatApi.Get.V2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$V2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"})
/*     */       public static final class $serializer implements GeneratedSerializer<Request> {
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
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */           arrayOfKSerializer[0] = (KSerializer)UUID.Serializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public ChatApi.Get.V2.Request deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           UUID uUID = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*     */             i |= 0x1;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new ChatApi.Get.V2.Request(i, uUID, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull ChatApi.Get.V2.Request value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           ChatApi.Get.V2.Request.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.ChatApi.Get.V2.Request", INSTANCE, 1);
/*     */           pluginGeneratedSerialDescriptor.addElement("chatId", false);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$V2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$V2$Request;", "user-strg-model"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<ChatApi.Get.V2.Request> serializer() {
/*     */           return (KSerializer<ChatApi.Get.V2.Request>)ChatApi.Get.V2.Request.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final UUID getChatId() {
/*     */         return this.chatId;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final UUID component1() {
/*     */         return this.chatId;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Request copy(@NotNull UUID chatId) {
/*     */         Intrinsics.checkNotNullParameter(chatId, "chatId");
/*     */         return new Request(chatId);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Request(chatId=" + this.chatId + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.chatId.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Request))
/*     */           return false; 
/*     */         Request request = (Request)other;
/*     */         return !!Intrinsics.areEqual(this.chatId, request.chatId);
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$V2$Response;", "", "seen1", "", "chat", "Lai/grazie/model/chat/StoredChat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/chat/StoredChat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/chat/StoredChat;)V", "getChat", "()Lai/grazie/model/chat/StoredChat;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"})
/*     */     public static final class Response {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final StoredChat chat;
/*     */       
/*     */       public Response(@NotNull StoredChat chat) {
/*     */         this.chat = chat;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/ChatApi.Get.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"})
/*     */       public static final class $serializer implements GeneratedSerializer<Response> {
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
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */           arrayOfKSerializer[0] = (KSerializer)StoredChat$.serializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public ChatApi.Get.V2.Response deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           StoredChat storedChat = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             storedChat = (StoredChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChat$.serializer.INSTANCE, storedChat);
/*     */             i |= 0x1;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   storedChat = (StoredChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChat$.serializer.INSTANCE, storedChat);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new ChatApi.Get.V2.Response(i, storedChat, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull ChatApi.Get.V2.Response value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           ChatApi.Get.V2.Response.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.ChatApi.Get.V2.Response", INSTANCE, 1);
/*     */           pluginGeneratedSerialDescriptor.addElement("chat", false);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Get$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/ChatApi$Get$V2$Response;", "user-strg-model"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<ChatApi.Get.V2.Response> serializer() {
/*     */           return (KSerializer<ChatApi.Get.V2.Response>)ChatApi.Get.V2.Response.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final StoredChat getChat() {
/*     */         return this.chat;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final StoredChat component1() {
/*     */         return this.chat;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Response copy(@NotNull StoredChat chat) {
/*     */         Intrinsics.checkNotNullParameter(chat, "chat");
/*     */         return new Response(chat);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Response(chat=" + this.chat + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.chat.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Response))
/*     */           return false; 
/*     */         Response response = (Response)other;
/*     */         return !!Intrinsics.areEqual(this.chat, response.chat);
/*     */       }
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\model\ChatApi$Get.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */