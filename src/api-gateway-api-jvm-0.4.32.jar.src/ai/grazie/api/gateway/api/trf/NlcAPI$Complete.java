/*    */ package ai.grazie.api.gateway.api.trf;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete;", "", "()V", "V1", "V2", "V3", "api-gateway-api"})
/*    */ public final class Complete {
/*    */   @NotNull
/*    */   public static final Complete INSTANCE = new Complete();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*    */   @SourceDebugExtension({"SMAP\nNlcAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NlcAPI.kt\nai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,52:1\n19#2,2:53\n19#2,2:55\n*S KotlinDebug\n*F\n+ 1 NlcAPI.kt\nai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1\n*L\n12#1:53,2\n13#1:55,2\n*E\n"})
/*    */   public static final class V1 implements TypedApi<V1.Request, V1.Response> { @NotNull
/* 12 */     public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/trf/nlc/complete"; static { int $i$f$typeInfo = 0;
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
/* 53 */       KType kType$iv = Reflection.typeOf(Request.class);
/* 54 */       requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 55 */       kType$iv = Reflection.typeOf(Response.class);
/* 56 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\016\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB'\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\b\b\002\020\t\032\0020\005¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\bHÆ\003J\t\020\027\032\0020\005HÆ\003J1\020\030\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\005HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\005HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\020\020\021R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\022\020\017R\021\020\t\032\0020\005¢\006\b\n\000\032\004\b\023\020\017¨\006("}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request;", "", "seen1", "", "context", "", "prefix", "lang", "Lai/grazie/nlp/langs/Language;", "profile", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getLang", "()Lai/grazie/nlp/langs/Language;", "getPrefix", "getProfile", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String context; @NotNull private final String prefix; @NotNull private final Language lang; @NotNull private final String profile; public Request(@NotNull String context, @NotNull String prefix, @NotNull Language lang, @NotNull String profile) { this.context = context; this.prefix = prefix; this.lang = lang; this.profile = profile; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NlcAPI.Complete.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public NlcAPI.Complete.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; Language language = null; String str3 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x4; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x4; continue;case 3: str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NlcAPI.Complete.V1.Request(i, str1, str2, language, str3, null); } public void serialize(@NotNull Encoder encoder, @NotNull NlcAPI.Complete.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NlcAPI.Complete.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NlcAPI.Complete.V1.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("context", false); pluginGeneratedSerialDescriptor.addElement("prefix", false); pluginGeneratedSerialDescriptor.addElement("lang", false); pluginGeneratedSerialDescriptor.addElement("profile", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<NlcAPI.Complete.V1.Request> serializer() { return (KSerializer<NlcAPI.Complete.V1.Request>)NlcAPI.Complete.V1.Request.$serializer.INSTANCE; } } @NotNull public final String getContext() { return this.context; } @NotNull public final String getPrefix() { return this.prefix; } @NotNull public final Language getLang() { return this.lang; } @NotNull public final String getProfile() { return this.profile; } @NotNull public final String component1() { return this.context; } @NotNull public final String component2() { return this.prefix; } @NotNull public final Language component3() { return this.lang; } @NotNull public final String component4() { return this.profile; } @NotNull public final Request copy(@NotNull String context, @NotNull String prefix, @NotNull Language lang, @NotNull String profile) { Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(lang, "lang"); Intrinsics.checkNotNullParameter(profile, "profile"); return new Request(context, prefix, lang, profile); } @NotNull public String toString() { return "Request(context=" + this.context + ", prefix=" + this.prefix + ", lang=" + this.lang + ", profile=" + this.profile + ")"; } public int hashCode() { result = this.context.hashCode(); result = result * 31 + this.prefix.hashCode(); result = result * 31 + this.lang.hashCode(); return result * 31 + this.profile.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.context, request.context) ? false : (!Intrinsics.areEqual(this.prefix, request.prefix) ? false : ((this.lang != request.lang) ? false : (!!Intrinsics.areEqual(this.profile, request.profile)))); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\006HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response;", "", "seen1", "", "completions", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getCompletions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<String> completions; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull List<String> completions) { this.completions = completions; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NlcAPI.Complete.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])NlcAPI.Complete.V1.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public NlcAPI.Complete.V1.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])NlcAPI.Complete.V1.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NlcAPI.Complete.V1.Response(i, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull NlcAPI.Complete.V1.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NlcAPI.Complete.V1.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NlcAPI.Complete.V1.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("completions", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V1$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<NlcAPI.Complete.V1.Response> serializer() { return (KSerializer<NlcAPI.Complete.V1.Response>)NlcAPI.Complete.V1.Response.$serializer.INSTANCE; } } @NotNull public final List<String> getCompletions() { return this.completions; } @NotNull public final List<String> component1() { return this.completions; } @NotNull public final Response copy(@NotNull List<String> completions) { Intrinsics.checkNotNullParameter(completions, "completions"); return new Response(completions); } @NotNull public String toString() { return "Response(completions=" + this.completions + ")"; } public int hashCode() { return this.completions.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.completions, response.completions); } } } @Deprecated(message = "JBAI-6817 in favour of V3") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÇ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Request;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nNlcAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NlcAPI.kt\nai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,52:1\n19#2,2:53\n19#2,2:55\n*S KotlinDebug\n*F\n+ 1 NlcAPI.kt\nai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2\n*L\n26#1:53,2\n27#1:55,2\n*E\n"}) public static final class V2 implements TypedApi<V2.Request, V2.Response> { @NotNull public static final V2 INSTANCE = new V2(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/trf/nlc/complete/v2"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\037\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\005¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\t\020\023\032\0020\007HÆ\003J\t\020\024\032\0020\005HÆ\003J'\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\005HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\021\020\016¨\006%"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Request;", "", "seen1", "", "context", "", "lang", "Lai/grazie/nlp/langs/Language;", "profile", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getLang", "()Lai/grazie/nlp/langs/Language;", "getProfile", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String context; @NotNull private final Language lang; @NotNull private final String profile; public Request(@NotNull String context, @NotNull Language lang, @NotNull String profile) { this.context = context; this.lang = lang; this.profile = profile; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NlcAPI.Complete.V2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public NlcAPI.Complete.V2.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; Language language = null; String str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NlcAPI.Complete.V2.Request(i, str1, language, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull NlcAPI.Complete.V2.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NlcAPI.Complete.V2.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NlcAPI.Complete.V2.Request", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("context", false); pluginGeneratedSerialDescriptor.addElement("lang", false); pluginGeneratedSerialDescriptor.addElement("profile", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<NlcAPI.Complete.V2.Request> serializer() { return (KSerializer<NlcAPI.Complete.V2.Request>)NlcAPI.Complete.V2.Request.$serializer.INSTANCE; } } @NotNull public final String getContext() { return this.context; } @NotNull public final Language getLang() { return this.lang; } @NotNull public final String getProfile() { return this.profile; } @NotNull public final String component1() { return this.context; } @NotNull public final Language component2() { return this.lang; } @NotNull public final String component3() { return this.profile; } @NotNull public final Request copy(@NotNull String context, @NotNull Language lang, @NotNull String profile) { Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(lang, "lang"); Intrinsics.checkNotNullParameter(profile, "profile"); return new Request(context, lang, profile); } @NotNull public String toString() { return "Request(context=" + this.context + ", lang=" + this.lang + ", profile=" + this.profile + ")"; } public int hashCode() { result = this.context.hashCode(); result = result * 31 + this.lang.hashCode(); return result * 31 + this.profile.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.context, request.context) ? false : ((this.lang != request.lang) ? false : (!!Intrinsics.areEqual(this.profile, request.profile))); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\006HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response;", "", "seen1", "", "completions", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getCompletions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<String> completions; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull List<String> completions) { this.completions = completions; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NlcAPI.Complete.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])NlcAPI.Complete.V2.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public NlcAPI.Complete.V2.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])NlcAPI.Complete.V2.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NlcAPI.Complete.V2.Response(i, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull NlcAPI.Complete.V2.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NlcAPI.Complete.V2.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NlcAPI.Complete.V2.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("completions", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V2$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<NlcAPI.Complete.V2.Response> serializer() { return (KSerializer<NlcAPI.Complete.V2.Response>)NlcAPI.Complete.V2.Response.$serializer.INSTANCE; } } @NotNull public final List<String> getCompletions() { return this.completions; } @NotNull public final List<String> component1() { return this.completions; } @NotNull public final Response copy(@NotNull List<String> completions) { Intrinsics.checkNotNullParameter(completions, "completions"); return new Response(completions); } @NotNull public String toString() { return "Response(completions=" + this.completions + ")"; } public int hashCode() { return this.completions.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.completions, response.completions); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Request;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nNlcAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NlcAPI.kt\nai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,52:1\n19#2,2:53\n19#2,2:55\n*S KotlinDebug\n*F\n+ 1 NlcAPI.kt\nai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3\n*L\n39#1:53,2\n40#1:55,2\n*E\n"}) public static final class V3 implements TypedApi<V3.Request, V3.Response> { @NotNull public static final V3 INSTANCE = new V3(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public TypeInfo<Response> getResponseType() {
/*    */       return responseType;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     private static final HttpMethod httpMethod = HttpMethod.Post;
/*    */     
/*    */     @NotNull
/*    */     public HttpMethod getHttpMethod() {
/*    */       return httpMethod;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     private static final String path = "/trf/nlc/complete/v3";
/*    */     
/*    */     @NotNull
/*    */     public String getPath() {
/*    */       return path;
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\037\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\005¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\t\020\023\032\0020\007HÆ\003J\t\020\024\032\0020\005HÆ\003J'\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\005HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\021\020\016¨\006%"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Request;", "", "seen1", "", "context", "", "lang", "Lai/grazie/nlp/langs/Language;", "profile", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getLang", "()Lai/grazie/nlp/langs/Language;", "getProfile", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */     public static final class Request {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       @NotNull
/*    */       private final String context;
/*    */       @NotNull
/*    */       private final Language lang;
/*    */       @NotNull
/*    */       private final String profile;
/*    */       
/*    */       public Request(@NotNull String context, @NotNull Language lang, @NotNull String profile) {
/*    */         this.context = context;
/*    */         this.lang = lang;
/*    */         this.profile = profile;
/*    */       }
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NlcAPI.Complete.V3.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */       public static final class $serializer implements GeneratedSerializer<Request> {
/*    */         @NotNull
/*    */         public static final $serializer INSTANCE = new $serializer();
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] typeParametersSerializers() {
/*    */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public SerialDescriptor getDescriptor() {
/*    */           return (SerialDescriptor)descriptor;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] childSerializers() {
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */           arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */           arrayOfKSerializer[1] = (KSerializer)Language.Serializer.INSTANCE;
/*    */           arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public NlcAPI.Complete.V3.Request deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0;
/*    */           String str1 = null;
/*    */           Language language = null;
/*    */           String str2 = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */             i |= 0x1;
/*    */             language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */             i |= 0x2;
/*    */             str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */             i |= 0x4;
/*    */           } else {
/*    */             while (bool) {
/*    */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (j) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */                 case 1:
/*    */                   language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */                   i |= 0x2;
/*    */                   continue;
/*    */                 case 2:
/*    */                   str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */                   i |= 0x4;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(j);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new NlcAPI.Complete.V3.Request(i, str1, language, str2, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull NlcAPI.Complete.V3.Request value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           NlcAPI.Complete.V3.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NlcAPI.Complete.V3.Request", INSTANCE, 3);
/*    */           pluginGeneratedSerialDescriptor.addElement("context", false);
/*    */           pluginGeneratedSerialDescriptor.addElement("lang", false);
/*    */           pluginGeneratedSerialDescriptor.addElement("profile", true);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Request;", "api-gateway-api"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<NlcAPI.Complete.V3.Request> serializer() {
/*    */           return (KSerializer<NlcAPI.Complete.V3.Request>)NlcAPI.Complete.V3.Request.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getContext() {
/*    */         return this.context;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Language getLang() {
/*    */         return this.lang;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getProfile() {
/*    */         return this.profile;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String component1() {
/*    */         return this.context;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Language component2() {
/*    */         return this.lang;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String component3() {
/*    */         return this.profile;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Request copy(@NotNull String context, @NotNull Language lang, @NotNull String profile) {
/*    */         Intrinsics.checkNotNullParameter(context, "context");
/*    */         Intrinsics.checkNotNullParameter(lang, "lang");
/*    */         Intrinsics.checkNotNullParameter(profile, "profile");
/*    */         return new Request(context, lang, profile);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Request(context=" + this.context + ", lang=" + this.lang + ", profile=" + this.profile + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         result = this.context.hashCode();
/*    */         result = result * 31 + this.lang.hashCode();
/*    */         return result * 31 + this.profile.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Request))
/*    */           return false; 
/*    */         Request request = (Request)other;
/*    */         return !Intrinsics.areEqual(this.context, request.context) ? false : ((this.lang != request.lang) ? false : (!!Intrinsics.areEqual(this.profile, request.profile)));
/*    */       }
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response;", "", "seen1", "", "completions", "Lai/grazie/nlc/PrefixWithCompletions;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlc/PrefixWithCompletions;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlc/PrefixWithCompletions;)V", "getCompletions", "()Lai/grazie/nlc/PrefixWithCompletions;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */     public static final class Response {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       @NotNull
/*    */       private final PrefixWithCompletions completions;
/*    */       
/*    */       public Response(@NotNull PrefixWithCompletions completions) {
/*    */         this.completions = completions;
/*    */       }
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/NlcAPI.Complete.V3.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */       public static final class $serializer implements GeneratedSerializer<Response> {
/*    */         @NotNull
/*    */         public static final $serializer INSTANCE = new $serializer();
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] typeParametersSerializers() {
/*    */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public SerialDescriptor getDescriptor() {
/*    */           return (SerialDescriptor)descriptor;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] childSerializers() {
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */           arrayOfKSerializer[0] = (KSerializer)PrefixWithCompletions$.serializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public NlcAPI.Complete.V3.Response deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0;
/*    */           PrefixWithCompletions prefixWithCompletions = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             prefixWithCompletions = (PrefixWithCompletions)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)PrefixWithCompletions$.serializer.INSTANCE, prefixWithCompletions);
/*    */             i |= 0x1;
/*    */           } else {
/*    */             while (bool) {
/*    */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (j) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   prefixWithCompletions = (PrefixWithCompletions)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)PrefixWithCompletions$.serializer.INSTANCE, prefixWithCompletions);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(j);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new NlcAPI.Complete.V3.Response(i, prefixWithCompletions, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull NlcAPI.Complete.V3.Response value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           NlcAPI.Complete.V3.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.NlcAPI.Complete.V3.Response", INSTANCE, 1);
/*    */           pluginGeneratedSerialDescriptor.addElement("completions", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/NlcAPI$Complete$V3$Response;", "api-gateway-api"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<NlcAPI.Complete.V3.Response> serializer() {
/*    */           return (KSerializer<NlcAPI.Complete.V3.Response>)NlcAPI.Complete.V3.Response.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final PrefixWithCompletions getCompletions() {
/*    */         return this.completions;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final PrefixWithCompletions component1() {
/*    */         return this.completions;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Response copy(@NotNull PrefixWithCompletions completions) {
/*    */         Intrinsics.checkNotNullParameter(completions, "completions");
/*    */         return new Response(completions);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Response(completions=" + this.completions + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.completions.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Response))
/*    */           return false; 
/*    */         Response response = (Response)other;
/*    */         return !!Intrinsics.areEqual(this.completions, response.completions);
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\trf\NlcAPI$Complete.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */