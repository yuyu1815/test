/*     */ package ai.grazie.api.gateway.api.meta;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\007\bÆ\002\030\0002\0020\001:\005\003\004\005\006\007B\007\b\002¢\006\002\020\002¨\006\b"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI;", "", "()V", "Answer", "ExtractWeb", "ListSources", "Retrieve", "SearchWeb", "api-gateway-api"})
/*     */ public final class QaAPI { @NotNull
/*     */   public static final QaAPI INSTANCE = new QaAPI();
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Answer;", "", "()V", "V2", "api-gateway-api"})
/*     */   public static final class Answer { @NotNull
/*     */     public static final Answer INSTANCE = new Answer();
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\027\030B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020R\024\020\023\032\0020\024X\004¢\006\b\n\000\032\004\b\025\020\026¨\006\031"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request;", "Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "sseConfig", "Lai/grazie/model/cloud/SseConfig;", "getSseConfig", "()Lai/grazie/model/cloud/SseConfig;", "Request", "Response", "api-gateway-api"})
/*     */     @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Answer$V2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n19#2,2:127\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Answer$V2\n*L\n14#1:125,2\n15#1:127,2\n*E\n"})
/*     */     public static final class V2 implements TypedApi<V2.Request, V2.Response> { @NotNull
/*  14 */       public static final V2 INSTANCE = new V2(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 125 */         KType kType$iv = Reflection.typeOf(Request.class);
/* 126 */         requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 127 */         kType$iv = Reflection.typeOf(Response.class);
/* 128 */         responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/meta/qa/answer/v2"; @NotNull public String getPath() { return path; } @NotNull private static final SseConfig sseConfig = new SseConfig(null, 1, null); @NotNull public SseConfig getSseConfig() { return sseConfig; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+BI\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\005\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB9\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\005\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\005¢\006\002\020\016J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\005HÆ\003J\013\020\032\032\004\030\0010\tHÆ\003J\013\020\033\032\004\030\0010\005HÆ\003J?\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0052\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\005HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\005HÖ\001J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\023\020\n\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\021\020\020R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\020R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\025\020\026¨\006,"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request;", "", "seen1", "", "query", "", "size", "dataSource", "llmProfile", "Lai/grazie/model/llm/profile/LLMProfileID;", "context", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getDataSource", "getLlmProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getQuery", "getSize", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String query; private final int size; @NotNull private final String dataSource; @Nullable private final LLMProfileID llmProfile; @Nullable private final String context; public Request(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID llmProfile, @Nullable String context) { this.query = query; this.size = size; this.dataSource = dataSource; this.llmProfile = llmProfile; this.context = context; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Answer.V2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)LLMProfileID.Serializer.INSTANCE); arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public QaAPI.Answer.V2.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; int j = 0; String str2 = null; LLMProfileID lLMProfileID = null; String str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x8; str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x10; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue;case 3: lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x8; continue;case 4: str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x10; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new QaAPI.Answer.V2.Request(i, str1, j, str2, lLMProfileID, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Answer.V2.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QaAPI.Answer.V2.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Answer.V2.Request", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("query", false); pluginGeneratedSerialDescriptor.addElement("size", true); pluginGeneratedSerialDescriptor.addElement("dataSource", true); pluginGeneratedSerialDescriptor.addElement("llmProfile", true); pluginGeneratedSerialDescriptor.addElement("context", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QaAPI.Answer.V2.Request> serializer() { return (KSerializer<QaAPI.Answer.V2.Request>)QaAPI.Answer.V2.Request.$serializer.INSTANCE; } } @NotNull public final String getQuery() { return this.query; } public final int getSize() { return this.size; } @NotNull public final String getDataSource() { return this.dataSource; } @Nullable public final LLMProfileID getLlmProfile() { return this.llmProfile; } @Nullable public final String getContext() { return this.context; } @NotNull public final String component1() { return this.query; } public final int component2() { return this.size; } @NotNull public final String component3() { return this.dataSource; } @Nullable public final LLMProfileID component4() { return this.llmProfile; } @Nullable public final String component5() { return this.context; } @NotNull public final Request copy(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID llmProfile, @Nullable String context) { Intrinsics.checkNotNullParameter(query, "query"); Intrinsics.checkNotNullParameter(dataSource, "dataSource"); return new Request(query, size, dataSource, llmProfile, context); } @NotNull public String toString() { return "Request(query=" + this.query + ", size=" + this.size + ", dataSource=" + this.dataSource + ", llmProfile=" + this.llmProfile + ", context=" + this.context + ")"; } public int hashCode() { result = this.query.hashCode(); result = result * 31 + Integer.hashCode(this.size); result = result * 31 + this.dataSource.hashCode(); result = result * 31 + ((this.llmProfile == null) ? 0 : this.llmProfile.hashCode()); return result * 31 + ((this.context == null) ? 0 : this.context.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.query, request.query) ? false : ((this.size != request.size) ? false : (!Intrinsics.areEqual(this.dataSource, request.dataSource) ? false : (!Intrinsics.areEqual(this.llmProfile, request.llmProfile) ? false : (!!Intrinsics.areEqual(this.context, request.context))))); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000  2\0020\001:\002\037 B/\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\r\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\016\032\0020\007HÆ\003J\023\020\017\032\0020\0002\b\b\002\020\006\032\0020\007HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\026HÖ\001J&\020\027\032\0020\0302\006\020\031\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035HÁ\001¢\006\002\b\036R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\r¨\006!"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Response;", "Lai/grazie/model/cloud/sse/continuous/Data;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "chunk", "Lai/grazie/qa/QAAnswersChunk;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lai/grazie/qa/QAAnswersChunk;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/qa/QAAnswersChunk;)V", "getChunk", "()Lai/grazie/qa/QAAnswersChunk;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response extends Data { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final QAAnswersChunk chunk; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.chunk, response.chunk); } public int hashCode() { return this.chunk.hashCode(); } @NotNull public String toString() { return "Response(chunk=" + this.chunk + ")"; } @NotNull public final Response copy(@NotNull QAAnswersChunk chunk) { Intrinsics.checkNotNullParameter(chunk, "chunk"); return new Response(chunk); } @NotNull public final QAAnswersChunk component1() { return this.chunk; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Answer.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.Answer.V2.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)QAAnswersChunk$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public QaAPI.Answer.V2.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; QAAnswersChunk qAAnswersChunk = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.Answer.V2.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; qAAnswersChunk = (QAAnswersChunk)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)QAAnswersChunk$.serializer.INSTANCE, qAAnswersChunk); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: qAAnswersChunk = (QAAnswersChunk)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)QAAnswersChunk$.serializer.INSTANCE, qAAnswersChunk); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QaAPI.Answer.V2.Response(i, continuousSSEEventType, qAAnswersChunk, null); } public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Answer.V2.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QaAPI.Answer.V2.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Answer.V2.Response", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("chunk", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Answer$V2$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QaAPI.Answer.V2.Response> serializer() { return (KSerializer<QaAPI.Answer.V2.Response>)QaAPI.Answer.V2.Response.$serializer.INSTANCE; } } @NotNull public final QAAnswersChunk getChunk() { return this.chunk; } public Response(@NotNull QAAnswersChunk chunk) { this.chunk = chunk; } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve;", "", "()V", "V1", "V2", "api-gateway-api"}) public static final class Retrieve { @NotNull public static final Retrieve INSTANCE = new Retrieve(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n19#2,2:127\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1\n*L\n35#1:125,2\n36#1:127,2\n*E\n"}) public static final class V1 implements TypedApi<V1.Request, V1.Response> { @NotNull public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/meta/qa/retrieve/v1"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+BI\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\005\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB9\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\005\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\005¢\006\002\020\016J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\005HÆ\003J\013\020\032\032\004\030\0010\tHÆ\003J\013\020\033\032\004\030\0010\005HÆ\003J?\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0052\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\005HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\005HÖ\001J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\023\020\n\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\021\020\020R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\020R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\025\020\026¨\006,"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "", "seen1", "", "query", "", "size", "dataSource", "llmProfile", "Lai/grazie/model/llm/profile/LLMProfileID;", "context", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getDataSource", "getLlmProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getQuery", "getSize", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String query; private final int size; @NotNull private final String dataSource; @Nullable private final LLMProfileID llmProfile; @Nullable private final String context; public Request(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID llmProfile, @Nullable String context) { this.query = query; this.size = size; this.dataSource = dataSource; this.llmProfile = llmProfile; this.context = context; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Retrieve.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)LLMProfileID.Serializer.INSTANCE); arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public QaAPI.Retrieve.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; int j = 0; String str2 = null; LLMProfileID lLMProfileID = null; String str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x8; str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x10; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue;case 3: lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x8; continue;case 4: str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x10; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new QaAPI.Retrieve.V1.Request(i, str1, j, str2, lLMProfileID, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Retrieve.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QaAPI.Retrieve.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Retrieve.V1.Request", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("query", false); pluginGeneratedSerialDescriptor.addElement("size", true); pluginGeneratedSerialDescriptor.addElement("dataSource", true); pluginGeneratedSerialDescriptor.addElement("llmProfile", true); pluginGeneratedSerialDescriptor.addElement("context", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QaAPI.Retrieve.V1.Request> serializer() { return (KSerializer<QaAPI.Retrieve.V1.Request>)QaAPI.Retrieve.V1.Request.$serializer.INSTANCE; } } @NotNull public final String getQuery() { return this.query; } public final int getSize() { return this.size; } @NotNull public final String getDataSource() { return this.dataSource; } @Nullable public final LLMProfileID getLlmProfile() { return this.llmProfile; } @Nullable public final String getContext() { return this.context; } @NotNull public final String component1() { return this.query; } public final int component2() { return this.size; } @NotNull public final String component3() { return this.dataSource; } @Nullable public final LLMProfileID component4() { return this.llmProfile; } @Nullable public final String component5() { return this.context; } @NotNull public final Request copy(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID llmProfile, @Nullable String context) { Intrinsics.checkNotNullParameter(query, "query"); Intrinsics.checkNotNullParameter(dataSource, "dataSource"); return new Request(query, size, dataSource, llmProfile, context); } @NotNull public String toString() { return "Request(query=" + this.query + ", size=" + this.size + ", dataSource=" + this.dataSource + ", llmProfile=" + this.llmProfile + ", context=" + this.context + ")"; } public int hashCode() { result = this.query.hashCode(); result = result * 31 + Integer.hashCode(this.size); result = result * 31 + this.dataSource.hashCode(); result = result * 31 + ((this.llmProfile == null) ? 0 : this.llmProfile.hashCode()); return result * 31 + ((this.context == null) ? 0 : this.context.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.query, request.query) ? false : ((this.size != request.size) ? false : (!Intrinsics.areEqual(this.dataSource, request.dataSource) ? false : (!Intrinsics.areEqual(this.llmProfile, request.llmProfile) ? false : (!!Intrinsics.areEqual(this.context, request.context))))); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "", "seen1", "", "documents", "", "Lai/grazie/qa/QADocument;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<QADocument> documents; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull List<QADocument> documents) { this.documents = documents; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)QADocument$.serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Retrieve.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.Retrieve.V1.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public QaAPI.Retrieve.V1.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.Retrieve.V1.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QaAPI.Retrieve.V1.Response(i, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Retrieve.V1.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QaAPI.Retrieve.V1.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Retrieve.V1.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("documents", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QaAPI.Retrieve.V1.Response> serializer() { return (KSerializer<QaAPI.Retrieve.V1.Response>)QaAPI.Retrieve.V1.Response.$serializer.INSTANCE; } } @NotNull public final List<QADocument> getDocuments() { return this.documents; } @NotNull public final List<QADocument> component1() { return this.documents; } @NotNull public final Response copy(@NotNull List<QADocument> documents) { Intrinsics.checkNotNullParameter(documents, "documents"); return new Response(documents); } @NotNull public String toString() { return "Response(documents=" + this.documents + ")"; } public int hashCode() { return this.documents.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.documents, response.documents); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n19#2,2:127\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2\n*L\n53#1:125,2\n54#1:127,2\n*E\n"}) public static final class V2 implements TypedApi<V2.Request, V2.Response> { @NotNull public static final V2 INSTANCE = new V2(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/meta/qa/retrieve/v2"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201B_\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\024\020\b\032\020\022\n\022\b\022\004\022\0020\n0\t\030\0010\t\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\005\022\b\020\016\032\004\030\0010\017¢\006\002\020\020BI\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\005\022\022\020\b\032\016\022\n\022\b\022\004\022\0020\n0\t0\t\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\005¢\006\002\020\021J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\003HÆ\003J\t\020\036\032\0020\005HÆ\003J\025\020\037\032\016\022\n\022\b\022\004\022\0020\n0\t0\tHÆ\003J\013\020 \032\004\030\0010\fHÆ\003J\013\020!\032\004\030\0010\005HÆ\003JU\020\"\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0052\024\b\002\020\b\032\016\022\n\022\b\022\004\022\0020\n0\t0\t2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\005HÆ\001J\023\020#\032\0020$2\b\020%\032\004\030\0010\001HÖ\003J\t\020&\032\0020\003HÖ\001J\t\020'\032\0020\005HÖ\001J&\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.HÁ\001¢\006\002\b/R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\023\020\r\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\023R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\025\020\026R\035\020\b\032\016\022\n\022\b\022\004\022\0020\n0\t0\t¢\006\b\n\000\032\004\b\027\020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\031\020\023R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\032\020\033¨\0062"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request;", "", "seen1", "", "query", "", "size", "config", "prioritizedSources", "", "Lai/grazie/qa/PrioritizedSource;", "llmProfile", "Lai/grazie/model/llm/profile/LLMProfileID;", "context", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V", "getConfig", "()Ljava/lang/String;", "getContext", "getLlmProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getPrioritizedSources", "()Ljava/util/List;", "getQuery", "getSize", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String query; private final int size; @NotNull private final String config; @NotNull private final List<List<PrioritizedSource>> prioritizedSources; @Nullable private final LLMProfileID llmProfile; @Nullable private final String context; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull String query, int size, @NotNull String config, @NotNull List<List<PrioritizedSource>> prioritizedSources, @Nullable LLMProfileID llmProfile, @Nullable String context) { this.query = query; this.size = size; this.config = config; this.prioritizedSources = prioritizedSources; this.llmProfile = llmProfile; this.context = context; } static { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)new ArrayListSerializer((KSerializer)PrioritizedSource$.serializer.INSTANCE)); arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Retrieve.V2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.Retrieve.V2.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[6]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable((KSerializer)LLMProfileID.Serializer.INSTANCE); arrayOfKSerializer2[5] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public QaAPI.Retrieve.V2.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; int j = 0; String str2 = null; List list = null; LLMProfileID lLMProfileID = null; String str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.Retrieve.V2.Request.$childSerializers; if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list); i |= 0x8; lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x10; str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x20; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue;case 3: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list); i |= 0x8; continue;case 4: lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID); i |= 0x10; continue;case 5: str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x20; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new QaAPI.Retrieve.V2.Request(i, str1, j, str2, list, lLMProfileID, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Retrieve.V2.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QaAPI.Retrieve.V2.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Retrieve.V2.Request", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("query", false); pluginGeneratedSerialDescriptor.addElement("size", false); pluginGeneratedSerialDescriptor.addElement("config", false); pluginGeneratedSerialDescriptor.addElement("prioritizedSources", false); pluginGeneratedSerialDescriptor.addElement("llmProfile", true); pluginGeneratedSerialDescriptor.addElement("context", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QaAPI.Retrieve.V2.Request> serializer() { return (KSerializer<QaAPI.Retrieve.V2.Request>)QaAPI.Retrieve.V2.Request.$serializer.INSTANCE; } } @NotNull public final String getQuery() { return this.query; } public final int getSize() { return this.size; } @NotNull public final String getConfig() { return this.config; } @NotNull public final List<List<PrioritizedSource>> getPrioritizedSources() { return this.prioritizedSources; } @Nullable public final LLMProfileID getLlmProfile() { return this.llmProfile; } @Nullable public final String getContext() { return this.context; } @NotNull public final String component1() { return this.query; } public final int component2() { return this.size; } @NotNull public final String component3() { return this.config; } @NotNull public final List<List<PrioritizedSource>> component4() { return this.prioritizedSources; } @Nullable public final LLMProfileID component5() { return this.llmProfile; } @Nullable public final String component6() { return this.context; } @NotNull public final Request copy(@NotNull String query, int size, @NotNull String config, @NotNull List<? extends List<PrioritizedSource>> prioritizedSources, @Nullable LLMProfileID llmProfile, @Nullable String context) { Intrinsics.checkNotNullParameter(query, "query"); Intrinsics.checkNotNullParameter(config, "config"); Intrinsics.checkNotNullParameter(prioritizedSources, "prioritizedSources"); return new Request(query, size, config, prioritizedSources, llmProfile, context); } @NotNull public String toString() { return "Request(query=" + this.query + ", size=" + this.size + ", config=" + this.config + ", prioritizedSources=" + this.prioritizedSources + ", llmProfile=" + this.llmProfile + ", context=" + this.context + ")"; } public int hashCode() { result = this.query.hashCode(); result = result * 31 + Integer.hashCode(this.size); result = result * 31 + this.config.hashCode(); result = result * 31 + this.prioritizedSources.hashCode(); result = result * 31 + ((this.llmProfile == null) ? 0 : this.llmProfile.hashCode()); return result * 31 + ((this.context == null) ? 0 : this.context.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.query, request.query) ? false : ((this.size != request.size) ? false : (!Intrinsics.areEqual(this.config, request.config) ? false : (!Intrinsics.areEqual(this.prioritizedSources, request.prioritizedSources) ? false : (!Intrinsics.areEqual(this.llmProfile, request.llmProfile) ? false : (!!Intrinsics.areEqual(this.context, request.context)))))); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response;", "", "seen1", "", "documents", "", "Lai/grazie/qa/QADocument;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<QADocument> documents; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull List<QADocument> documents) { this.documents = documents; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)QADocument$.serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Retrieve.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.Retrieve.V2.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public QaAPI.Retrieve.V2.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.Retrieve.V2.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QaAPI.Retrieve.V2.Response(i, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Retrieve.V2.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QaAPI.Retrieve.V2.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Retrieve.V2.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("documents", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V2$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QaAPI.Retrieve.V2.Response> serializer() { return (KSerializer<QaAPI.Retrieve.V2.Response>)QaAPI.Retrieve.V2.Response.$serializer.INSTANCE; } } @NotNull public final List<QADocument> getDocuments() { return this.documents; } @NotNull public final List<QADocument> component1() { return this.documents; } @NotNull public final Response copy(@NotNull List<QADocument> documents) { Intrinsics.checkNotNullParameter(documents, "documents"); return new Response(documents); } @NotNull public String toString() { return "Response(documents=" + this.documents + ")"; } public int hashCode() { return this.documents.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.documents, response.documents); } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb;", "", "()V", "V1", "api-gateway-api"}) public static final class SearchWeb { @NotNull public static final SearchWeb INSTANCE = new SearchWeb(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\023B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\024"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1$Request;", "Lai/grazie/qa/SearchWebResponse;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n19#2,2:127\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1\n*L\n75#1:125,2\n76#1:127,2\n*E\n"}) public static final class V1 implements TypedApi<V1.Request, SearchWebResponse> { @NotNull public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(SearchWebResponse.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(SearchWebResponse.class)); } @NotNull private static final TypeInfo<SearchWebResponse> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } @NotNull public TypeInfo<SearchWebResponse> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/meta/qa/web/search/v1"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B?\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B-\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\n\b\002\020\007\032\004\030\0010\005\022\n\b\002\020\b\032\004\030\0010\005¢\006\002\020\fJ\t\020\023\032\0020\005HÆ\003J\t\020\024\032\0020\003HÆ\003J\013\020\025\032\004\030\0010\005HÆ\003J\013\020\026\032\004\030\0010\005HÆ\003J5\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\n\b\002\020\007\032\004\030\0010\0052\n\b\002\020\b\032\004\030\0010\005HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\005HÖ\001J&\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÁ\001¢\006\002\b$R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\r\020\016R\023\020\b\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\016R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\021\020\022¨\006'"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1$Request;", "", "seen1", "", "query", "", "size", "parametersJson", "provider", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getParametersJson", "()Ljava/lang/String;", "getProvider", "getQuery", "getSize", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String query; private final int size; @Nullable private final String parametersJson; @Nullable private final String provider; public Request(@NotNull String query, int size, @Nullable String parametersJson, @Nullable String provider) { this.query = query; this.size = size; this.parametersJson = parametersJson; this.provider = provider; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.SearchWeb.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE; arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public QaAPI.SearchWeb.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; int j = 0; String str2 = null, str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x4; str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x8; } else { while (bool) { int k = compositeDecoder.decodeElementIndex(serialDescriptor); switch (k) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: j = compositeDecoder.decodeIntElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x4; continue;case 3: str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str3); i |= 0x8; continue; }  throw new UnknownFieldException(k); }  }  compositeDecoder.endStructure(serialDescriptor); return new QaAPI.SearchWeb.V1.Request(i, str1, j, str2, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.SearchWeb.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QaAPI.SearchWeb.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.SearchWeb.V1.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("query", false); pluginGeneratedSerialDescriptor.addElement("size", false); pluginGeneratedSerialDescriptor.addElement("parametersJson", true); pluginGeneratedSerialDescriptor.addElement("provider", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$SearchWeb$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QaAPI.SearchWeb.V1.Request> serializer() { return (KSerializer<QaAPI.SearchWeb.V1.Request>)QaAPI.SearchWeb.V1.Request.$serializer.INSTANCE; } } @NotNull public final String getQuery() { return this.query; } public final int getSize() { return this.size; } @Nullable public final String getParametersJson() { return this.parametersJson; } @Nullable public final String getProvider() { return this.provider; } @NotNull public final String component1() { return this.query; } public final int component2() { return this.size; } @Nullable public final String component3() { return this.parametersJson; } @Nullable public final String component4() { return this.provider; } @NotNull public final Request copy(@NotNull String query, int size, @Nullable String parametersJson, @Nullable String provider) { Intrinsics.checkNotNullParameter(query, "query"); return new Request(query, size, parametersJson, provider); } @NotNull public String toString() { return "Request(query=" + this.query + ", size=" + this.size + ", parametersJson=" + this.parametersJson + ", provider=" + this.provider + ")"; } public int hashCode() { result = this.query.hashCode(); result = result * 31 + Integer.hashCode(this.size); result = result * 31 + ((this.parametersJson == null) ? 0 : this.parametersJson.hashCode()); return result * 31 + ((this.provider == null) ? 0 : this.provider.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.query, request.query) ? false : ((this.size != request.size) ? false : (!Intrinsics.areEqual(this.parametersJson, request.parametersJson) ? false : (!!Intrinsics.areEqual(this.provider, request.provider)))); } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb;", "", "()V", "V1", "api-gateway-api"}) public static final class ExtractWeb { @NotNull public static final ExtractWeb INSTANCE = new ExtractWeb(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\023B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\024"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "Lai/grazie/qa/ExtractWebResponse;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n19#2,2:127\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1\n*L\n92#1:125,2\n93#1:127,2\n*E\n"}) public static final class V1 implements TypedApi<V1.Request, ExtractWebResponse> { @NotNull public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<ExtractWebResponse> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(ExtractWebResponse.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(ExtractWebResponse.class)); }
/*     */ 
/*     */       
/*     */       @NotNull
/*     */       public TypeInfo<ExtractWebResponse> getResponseType() {
/*     */         return responseType;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       private static final HttpMethod httpMethod = HttpMethod.Post;
/*     */       
/*     */       @NotNull
/*     */       public HttpMethod getHttpMethod() {
/*     */         return httpMethod;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       private static final String path = "/meta/qa/web/extract/v1";
/*     */       
/*     */       @NotNull
/*     */       public String getPath() {
/*     */         return path;
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B=\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\006\022\b\020\b\032\004\030\0010\006\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B+\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\006\022\n\b\002\020\b\032\004\030\0010\006¢\006\002\020\fJ\017\020\022\032\b\022\004\022\0020\0060\005HÆ\003J\013\020\023\032\004\030\0010\006HÆ\003J\013\020\024\032\004\030\0010\006HÆ\003J1\020\025\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\0062\n\b\002\020\b\032\004\030\0010\006HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\006HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\023\020\007\032\004\030\0010\006¢\006\b\n\000\032\004\b\r\020\016R\023\020\b\032\004\030\0010\006¢\006\b\n\000\032\004\b\017\020\016R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\021¨\006%"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "", "seen1", "", "urls", "", "", "parametersJson", "provider", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getParametersJson", "()Ljava/lang/String;", "getProvider", "getUrls", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class Request {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @NotNull
/*     */         private final List<String> urls;
/*     */         @Nullable
/*     */         private final String parametersJson;
/*     */         @Nullable
/*     */         private final String provider;
/*     */         @JvmField
/*     */         @NotNull
/*     */         private static final KSerializer<Object>[] $childSerializers;
/*     */         
/*     */         public Request(@NotNull List<String> urls, @Nullable String parametersJson, @Nullable String provider) {
/*     */           this.urls = urls;
/*     */           this.parametersJson = parametersJson;
/*     */           this.provider = provider;
/*     */         }
/*     */         
/*     */         static {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */           arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*     */           arrayOfKSerializer[1] = null;
/*     */           arrayOfKSerializer[2] = null;
/*     */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.ExtractWeb.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */         public static final class $serializer implements GeneratedSerializer<Request> {
/*     */           @NotNull
/*     */           public static final $serializer INSTANCE = new $serializer();
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] typeParametersSerializers() {
/*     */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public SerialDescriptor getDescriptor() {
/*     */             return (SerialDescriptor)descriptor;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public KSerializer<?>[] childSerializers() {
/*     */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.ExtractWeb.V1.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */             arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */             arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */             return (KSerializer<?>[])arrayOfKSerializer2;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public QaAPI.ExtractWeb.V1.Request deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             List list = null;
/*     */             String str1 = null, str2 = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.ExtractWeb.V1.Request.$childSerializers;
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */               i |= 0x1;
/*     */               str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */               i |= 0x2;
/*     */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */               i |= 0x4;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                   case 1:
/*     */                     str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */                     i |= 0x2;
/*     */                     continue;
/*     */                   case 2:
/*     */                     str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */                     i |= 0x4;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new QaAPI.ExtractWeb.V1.Request(i, list, str1, str2, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.ExtractWeb.V1.Request value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             QaAPI.ExtractWeb.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.ExtractWeb.V1.Request", INSTANCE, 3);
/*     */             pluginGeneratedSerialDescriptor.addElement("urls", false);
/*     */             pluginGeneratedSerialDescriptor.addElement("parametersJson", true);
/*     */             pluginGeneratedSerialDescriptor.addElement("provider", true);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<QaAPI.ExtractWeb.V1.Request> serializer() {
/*     */             return (KSerializer<QaAPI.ExtractWeb.V1.Request>)QaAPI.ExtractWeb.V1.Request.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final List<String> getUrls() {
/*     */           return this.urls;
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         public final String getParametersJson() {
/*     */           return this.parametersJson;
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         public final String getProvider() {
/*     */           return this.provider;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final List<String> component1() {
/*     */           return this.urls;
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         public final String component2() {
/*     */           return this.parametersJson;
/*     */         }
/*     */         
/*     */         @Nullable
/*     */         public final String component3() {
/*     */           return this.provider;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Request copy(@NotNull List<String> urls, @Nullable String parametersJson, @Nullable String provider) {
/*     */           Intrinsics.checkNotNullParameter(urls, "urls");
/*     */           return new Request(urls, parametersJson, provider);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "Request(urls=" + this.urls + ", parametersJson=" + this.parametersJson + ", provider=" + this.provider + ")";
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           result = this.urls.hashCode();
/*     */           result = result * 31 + ((this.parametersJson == null) ? 0 : this.parametersJson.hashCode());
/*     */           return result * 31 + ((this.provider == null) ? 0 : this.provider.hashCode());
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof Request))
/*     */             return false; 
/*     */           Request request = (Request)other;
/*     */           return !Intrinsics.areEqual(this.urls, request.urls) ? false : (!Intrinsics.areEqual(this.parametersJson, request.parametersJson) ? false : (!!Intrinsics.areEqual(this.provider, request.provider)));
/*     */         }
/*     */       } }
/*     */      }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\002\020\021B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\022"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ListSources;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "RequestParams", "Response", "api-gateway-api"})
/*     */   @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$ListSources\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$ListSources\n*L\n107#1:125,2\n*E\n"})
/*     */   public static final class ListSources implements UnitTypedApi<ListSources.Response> {
/*     */     @NotNull
/*     */     public static final ListSources INSTANCE = new ListSources();
/*     */     @NotNull
/*     */     private static final TypeInfo<Response> responseType;
/*     */     
/*     */     @NotNull
/*     */     public TypeInfo<Response> getResponseType() {
/*     */       return responseType;
/*     */     }
/*     */     
/*     */     static {
/*     */       int $i$f$typeInfo = 0;
/*     */       KType kType$iv = Reflection.typeOf(Response.class);
/*     */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final HttpMethod httpMethod = HttpMethod.Get;
/*     */     
/*     */     @NotNull
/*     */     public HttpMethod getHttpMethod() {
/*     */       return httpMethod;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     private static final String path = "/meta/qa/list";
/*     */     
/*     */     @NotNull
/*     */     public String getPath() {
/*     */       return path;
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B!\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\017\022\b\b\002\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0052\b\020\017\032\004\030\0010\001HÖ\003J\t\020\020\032\0020\003HÖ\001J\006\020\021\032\0020\022J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$RequestParams;", "", "seen1", "", "showAll", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Z)V", "getShowAll", "()Z", "component1", "copy", "equals", "other", "hashCode", "toQueryParameters", "Lai/grazie/client/common/model/QueryParameterCollection;", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */     public static final class RequestParams {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       private final boolean showAll;
/*     */       
/*     */       public RequestParams(boolean showAll) {
/*     */         this.showAll = showAll;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.ListSources.RequestParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$RequestParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */       public static final class $serializer implements GeneratedSerializer<RequestParams> {
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
/*     */           arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public QaAPI.ListSources.RequestParams deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           boolean bool1 = false;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0);
/*     */             i |= 0x1;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new QaAPI.ListSources.RequestParams(i, bool1, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.ListSources.RequestParams value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           QaAPI.ListSources.RequestParams.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.ListSources.RequestParams", INSTANCE, 1);
/*     */           pluginGeneratedSerialDescriptor.addElement("showAll", true);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$RequestParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$RequestParams;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<QaAPI.ListSources.RequestParams> serializer() {
/*     */           return (KSerializer<QaAPI.ListSources.RequestParams>)QaAPI.ListSources.RequestParams.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       public final boolean getShowAll() {
/*     */         return this.showAll;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final QueryParameterCollection toQueryParameters() {
/*     */         Pair[] arrayOfPair = new Pair[1];
/*     */         arrayOfPair[0] = TuplesKt.to("showAll", CollectionsKt.listOf(String.valueOf(this.showAll)));
/*     */         return QueryParameterCollectionKt.of(QueryParameterCollection.Companion, arrayOfPair);
/*     */       }
/*     */       
/*     */       public final boolean component1() {
/*     */         return this.showAll;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final RequestParams copy(boolean showAll) {
/*     */         return new RequestParams(showAll);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "RequestParams(showAll=" + this.showAll + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return Boolean.hashCode(this.showAll);
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof RequestParams))
/*     */           return false; 
/*     */         RequestParams requestParams = (RequestParams)other;
/*     */         return !(this.showAll != requestParams.showAll);
/*     */       }
/*     */       
/*     */       public RequestParams() {
/*     */         this(false, 1, (DefaultConstructorMarker)null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\006HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response;", "", "seen1", "", "sources", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getSources", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */     public static final class Response {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final List<String> sources;
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       
/*     */       public Response(@NotNull List<String> sources) {
/*     */         this.sources = sources;
/*     */       }
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */         arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.ListSources.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */           KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.ListSources.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*     */           arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */           return (KSerializer<?>[])arrayOfKSerializer2;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public QaAPI.ListSources.Response deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           List list = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.ListSources.Response.$childSerializers;
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */             i |= 0x1;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new QaAPI.ListSources.Response(i, list, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.ListSources.Response value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           QaAPI.ListSources.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.ListSources.Response", INSTANCE, 1);
/*     */           pluginGeneratedSerialDescriptor.addElement("sources", false);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ListSources$Response;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<QaAPI.ListSources.Response> serializer() {
/*     */           return (KSerializer<QaAPI.ListSources.Response>)QaAPI.ListSources.Response.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final List<String> getSources() {
/*     */         return this.sources;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final List<String> component1() {
/*     */         return this.sources;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Response copy(@NotNull List<String> sources) {
/*     */         Intrinsics.checkNotNullParameter(sources, "sources");
/*     */         return new Response(sources);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Response(sources=" + this.sources + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.sources.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Response))
/*     */           return false; 
/*     */         Response response = (Response)other;
/*     */         return !!Intrinsics.areEqual(this.sources, response.sources);
/*     */       }
/*     */     }
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\QaAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */