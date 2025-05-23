/*    */ package ai.grazie.api.gateway.api.trf;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI;", "", "()V", "Synonymize", "api-gateway-api"})
/*    */ public final class SynAPI { @NotNull
/*    */   public static final SynAPI INSTANCE = new SynAPI();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize;", "", "()V", "V1", "V2", "api-gateway-api"})
/*    */   public static final class Synonymize { @NotNull
/*    */     public static final Synonymize INSTANCE = new Synonymize();
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Request;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*    */     @SourceDebugExtension({"SMAP\nSynAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynAPI.kt\nai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,38:1\n19#2,2:39\n19#2,2:41\n*S KotlinDebug\n*F\n+ 1 SynAPI.kt\nai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1\n*L\n12#1:39,2\n13#1:41,2\n*E\n"})
/*    */     public static final class V1 implements TypedApi<V1.Request, V1.Response> { @NotNull
/* 12 */       public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/trf/syn/synonymize"; static { int $i$f$typeInfo = 0;
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
/* 39 */         KType kType$iv = Reflection.typeOf(Request.class);
/* 40 */         requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 41 */         kType$iv = Reflection.typeOf(Response.class);
/* 42 */         responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B3\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\b¢\006\002\020\fJ\017\020\021\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\022\032\0020\bHÆ\003J#\020\023\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\bHÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\r\020\016R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Request;", "", "seen1", "", "texts", "", "Lai/grazie/syn/TextWithHighlight;", "lang", "Lai/grazie/nlp/langs/Language;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lai/grazie/nlp/langs/Language;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Lai/grazie/nlp/langs/Language;)V", "getLang", "()Lai/grazie/nlp/langs/Language;", "getTexts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<TextWithHighlight> texts; @NotNull private final Language lang; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Request(@NotNull List<TextWithHighlight> texts, @NotNull Language lang) { this.texts = texts; this.lang = lang; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)TextWithHighlight$.serializer.INSTANCE); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/SynAPI.Synonymize.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])SynAPI.Synonymize.V1.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)Language.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public SynAPI.Synonymize.V1.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; Language language = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])SynAPI.Synonymize.V1.Request.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue;case 1: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SynAPI.Synonymize.V1.Request(i, list, language, null); } public void serialize(@NotNull Encoder encoder, @NotNull SynAPI.Synonymize.V1.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SynAPI.Synonymize.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.SynAPI.Synonymize.V1.Request", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("texts", false); pluginGeneratedSerialDescriptor.addElement("lang", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SynAPI.Synonymize.V1.Request> serializer() { return (KSerializer<SynAPI.Synonymize.V1.Request>)SynAPI.Synonymize.V1.Request.$serializer.INSTANCE; } } @NotNull public final List<TextWithHighlight> getTexts() { return this.texts; } @NotNull public final Language getLang() { return this.lang; } @NotNull public final List<TextWithHighlight> component1() { return this.texts; } @NotNull public final Language component2() { return this.lang; } @NotNull public final Request copy(@NotNull List<TextWithHighlight> texts, @NotNull Language lang) { Intrinsics.checkNotNullParameter(texts, "texts"); Intrinsics.checkNotNullParameter(lang, "lang"); return new Request(texts, lang); } @NotNull public String toString() { return "Request(texts=" + this.texts + ", lang=" + this.lang + ")"; } public int hashCode() { result = this.texts.hashCode(); return result * 31 + this.lang.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !Intrinsics.areEqual(this.texts, request.texts) ? false : (!(this.lang != request.lang)); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B/\b\021\022\006\020\002\032\0020\003\022\024\020\004\032\020\022\n\022\b\022\004\022\0020\0060\005\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\031\022\022\020\004\032\016\022\n\022\b\022\004\022\0020\0060\0050\005¢\006\002\020\nJ\025\020\r\032\016\022\n\022\b\022\004\022\0020\0060\0050\005HÆ\003J\037\020\016\032\0020\0002\024\b\002\020\004\032\016\022\n\022\b\022\004\022\0020\0060\0050\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\006HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\035\020\004\032\016\022\n\022\b\022\004\022\0020\0060\0050\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Response;", "", "seen1", "", "syn", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getSyn", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final List<List<String>> syn; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull List<List<String>> syn) { this.syn = syn; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE)); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/SynAPI.Synonymize.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])SynAPI.Synonymize.V1.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public SynAPI.Synonymize.V1.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])SynAPI.Synonymize.V1.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SynAPI.Synonymize.V1.Response(i, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull SynAPI.Synonymize.V1.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SynAPI.Synonymize.V1.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.SynAPI.Synonymize.V1.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("syn", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V1$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<SynAPI.Synonymize.V1.Response> serializer() { return (KSerializer<SynAPI.Synonymize.V1.Response>)SynAPI.Synonymize.V1.Response.$serializer.INSTANCE; } } @NotNull public final List<List<String>> getSyn() { return this.syn; } @NotNull public final List<List<String>> component1() { return this.syn; } @NotNull public final Response copy(@NotNull List<? extends List<String>> syn) { Intrinsics.checkNotNullParameter(syn, "syn"); return new Response(syn); } @NotNull public String toString() { return "Response(syn=" + this.syn + ")"; } public int hashCode() { return this.syn.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.syn, response.syn); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Request;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nSynAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynAPI.kt\nai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,38:1\n19#2,2:39\n19#2,2:41\n*S KotlinDebug\n*F\n+ 1 SynAPI.kt\nai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2\n*L\n25#1:39,2\n26#1:41,2\n*E\n"}) public static final class V2 implements TypedApi<V2.Request, V2.Response> { static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*    */ 
/*    */       
/*    */       @NotNull
/*    */       public static final V2 INSTANCE = new V2();
/*    */       @NotNull
/*    */       private static final TypeInfo<Request> requestType;
/*    */       @NotNull
/*    */       private static final TypeInfo<Response> responseType;
/*    */       
/*    */       @NotNull
/*    */       public TypeInfo<Request> getRequestType() {
/*    */         return requestType;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public TypeInfo<Response> getResponseType() {
/*    */         return responseType;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       private static final HttpMethod httpMethod = HttpMethod.Post;
/*    */       
/*    */       @NotNull
/*    */       public HttpMethod getHttpMethod() {
/*    */         return httpMethod;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       private static final String path = "/trf/syn/synonymize/v2";
/*    */       
/*    */       @NotNull
/*    */       public String getPath() {
/*    */         return path;
/*    */       }
/*    */       
/*    */       @Serializable
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\t\020\026\032\0020\tHÆ\003J'\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\005HÖ\001J&\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÁ\001¢\006\002\b$R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023¨\006'"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Request;", "", "seen1", "", "text", "", "selection", "Lai/grazie/text/TextRange;", "lang", "Lai/grazie/nlp/langs/Language;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/text/TextRange;Lai/grazie/nlp/langs/Language;)V", "getLang", "()Lai/grazie/nlp/langs/Language;", "getSelection", "()Lai/grazie/text/TextRange;", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */       public static final class Request {
/*    */         @NotNull
/*    */         public static final Companion Companion = new Companion(null);
/*    */         @NotNull
/*    */         private final String text;
/*    */         @NotNull
/*    */         private final TextRange selection;
/*    */         @NotNull
/*    */         private final Language lang;
/*    */         
/*    */         public Request(@NotNull String text, @NotNull TextRange selection, @NotNull Language lang) {
/*    */           this.text = text;
/*    */           this.selection = selection;
/*    */           this.lang = lang;
/*    */         }
/*    */         
/*    */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/SynAPI.Synonymize.V2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */         public static final class $serializer implements GeneratedSerializer<Request> {
/*    */           @NotNull
/*    */           public static final $serializer INSTANCE = new $serializer();
/*    */           
/*    */           @NotNull
/*    */           public KSerializer<?>[] typeParametersSerializers() {
/*    */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public SerialDescriptor getDescriptor() {
/*    */             return (SerialDescriptor)descriptor;
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public KSerializer<?>[] childSerializers() {
/*    */             KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */             arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */             arrayOfKSerializer[1] = (KSerializer)TextRange$.serializer.INSTANCE;
/*    */             arrayOfKSerializer[2] = (KSerializer)Language.Serializer.INSTANCE;
/*    */             return (KSerializer<?>[])arrayOfKSerializer;
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public SynAPI.Synonymize.V2.Request deserialize(@NotNull Decoder decoder) {
/*    */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             boolean bool = true;
/*    */             int i = 0;
/*    */             String str = null;
/*    */             TextRange textRange = null;
/*    */             Language language = null;
/*    */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */             if (compositeDecoder.decodeSequentially()) {
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*    */               i |= 0x2;
/*    */               language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */               i |= 0x4;
/*    */             } else {
/*    */               while (bool) {
/*    */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */                 switch (j) {
/*    */                   case -1:
/*    */                     bool = false;
/*    */                     continue;
/*    */                   case 0:
/*    */                     str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                     i |= 0x1;
/*    */                     continue;
/*    */                   case 1:
/*    */                     textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*    */                     i |= 0x2;
/*    */                     continue;
/*    */                   case 2:
/*    */                     language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */                     i |= 0x4;
/*    */                     continue;
/*    */                 } 
/*    */                 throw new UnknownFieldException(j);
/*    */               } 
/*    */             } 
/*    */             compositeDecoder.endStructure(serialDescriptor);
/*    */             return new SynAPI.Synonymize.V2.Request(i, str, textRange, language, null);
/*    */           }
/*    */           
/*    */           public void serialize(@NotNull Encoder encoder, @NotNull SynAPI.Synonymize.V2.Request value) {
/*    */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */             Intrinsics.checkNotNullParameter(value, "value");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */             SynAPI.Synonymize.V2.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */             compositeEncoder.endStructure(serialDescriptor);
/*    */           }
/*    */           
/*    */           static {
/*    */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.SynAPI.Synonymize.V2.Request", INSTANCE, 3);
/*    */             pluginGeneratedSerialDescriptor.addElement("text", false);
/*    */             pluginGeneratedSerialDescriptor.addElement("selection", false);
/*    */             pluginGeneratedSerialDescriptor.addElement("lang", false);
/*    */             descriptor = pluginGeneratedSerialDescriptor;
/*    */           }
/*    */         }
/*    */         
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Request;", "api-gateway-api"})
/*    */         public static final class Companion {
/*    */           private Companion() {}
/*    */           
/*    */           @NotNull
/*    */           public final KSerializer<SynAPI.Synonymize.V2.Request> serializer() {
/*    */             return (KSerializer<SynAPI.Synonymize.V2.Request>)SynAPI.Synonymize.V2.Request.$serializer.INSTANCE;
/*    */           }
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final String getText() {
/*    */           return this.text;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final TextRange getSelection() {
/*    */           return this.selection;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final Language getLang() {
/*    */           return this.lang;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final String component1() {
/*    */           return this.text;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final TextRange component2() {
/*    */           return this.selection;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final Language component3() {
/*    */           return this.lang;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final Request copy(@NotNull String text, @NotNull TextRange selection, @NotNull Language lang) {
/*    */           Intrinsics.checkNotNullParameter(text, "text");
/*    */           Intrinsics.checkNotNullParameter(selection, "selection");
/*    */           Intrinsics.checkNotNullParameter(lang, "lang");
/*    */           return new Request(text, selection, lang);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public String toString() {
/*    */           return "Request(text=" + this.text + ", selection=" + this.selection + ", lang=" + this.lang + ")";
/*    */         }
/*    */         
/*    */         public int hashCode() {
/*    */           result = this.text.hashCode();
/*    */           result = result * 31 + this.selection.hashCode();
/*    */           return result * 31 + this.lang.hashCode();
/*    */         }
/*    */         
/*    */         public boolean equals(@Nullable Object other) {
/*    */           if (this == other)
/*    */             return true; 
/*    */           if (!(other instanceof Request))
/*    */             return false; 
/*    */           Request request = (Request)other;
/*    */           return !Intrinsics.areEqual(this.text, request.text) ? false : (!Intrinsics.areEqual(this.selection, request.selection) ? false : (!(this.lang != request.lang)));
/*    */         }
/*    */       }
/*    */       
/*    */       @Serializable
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\006HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Response;", "", "seen1", "", "synonyms", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getSynonyms", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */       public static final class Response {
/*    */         @NotNull
/*    */         public static final Companion Companion = new Companion(null);
/*    */         @NotNull
/*    */         private final List<String> synonyms;
/*    */         @JvmField
/*    */         @NotNull
/*    */         private static final KSerializer<Object>[] $childSerializers;
/*    */         
/*    */         public Response(@NotNull List<String> synonyms) {
/*    */           this.synonyms = synonyms;
/*    */         }
/*    */         
/*    */         static {
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */           arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/trf/SynAPI.Synonymize.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*    */         public static final class $serializer implements GeneratedSerializer<Response> {
/*    */           @NotNull
/*    */           public static final $serializer INSTANCE = new $serializer();
/*    */           
/*    */           @NotNull
/*    */           public KSerializer<?>[] typeParametersSerializers() {
/*    */             return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public SerialDescriptor getDescriptor() {
/*    */             return (SerialDescriptor)descriptor;
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public KSerializer<?>[] childSerializers() {
/*    */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])SynAPI.Synonymize.V2.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */             return (KSerializer<?>[])arrayOfKSerializer2;
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public SynAPI.Synonymize.V2.Response deserialize(@NotNull Decoder decoder) {
/*    */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             boolean bool = true;
/*    */             int i = 0;
/*    */             List list = null;
/*    */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */             KSerializer[] arrayOfKSerializer = (KSerializer[])SynAPI.Synonymize.V2.Response.$childSerializers;
/*    */             if (compositeDecoder.decodeSequentially()) {
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */               i |= 0x1;
/*    */             } else {
/*    */               while (bool) {
/*    */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */                 switch (j) {
/*    */                   case -1:
/*    */                     bool = false;
/*    */                     continue;
/*    */                   case 0:
/*    */                     list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */                     i |= 0x1;
/*    */                     continue;
/*    */                 } 
/*    */                 throw new UnknownFieldException(j);
/*    */               } 
/*    */             } 
/*    */             compositeDecoder.endStructure(serialDescriptor);
/*    */             return new SynAPI.Synonymize.V2.Response(i, list, null);
/*    */           }
/*    */           
/*    */           public void serialize(@NotNull Encoder encoder, @NotNull SynAPI.Synonymize.V2.Response value) {
/*    */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */             Intrinsics.checkNotNullParameter(value, "value");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */             SynAPI.Synonymize.V2.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */             compositeEncoder.endStructure(serialDescriptor);
/*    */           }
/*    */           
/*    */           static {
/*    */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.trf.SynAPI.Synonymize.V2.Response", INSTANCE, 1);
/*    */             pluginGeneratedSerialDescriptor.addElement("synonyms", false);
/*    */             descriptor = pluginGeneratedSerialDescriptor;
/*    */           }
/*    */         }
/*    */         
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/trf/SynAPI$Synonymize$V2$Response;", "api-gateway-api"})
/*    */         public static final class Companion {
/*    */           private Companion() {}
/*    */           
/*    */           @NotNull
/*    */           public final KSerializer<SynAPI.Synonymize.V2.Response> serializer() {
/*    */             return (KSerializer<SynAPI.Synonymize.V2.Response>)SynAPI.Synonymize.V2.Response.$serializer.INSTANCE;
/*    */           }
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final List<String> getSynonyms() {
/*    */           return this.synonyms;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final List<String> component1() {
/*    */           return this.synonyms;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final Response copy(@NotNull List<String> synonyms) {
/*    */           Intrinsics.checkNotNullParameter(synonyms, "synonyms");
/*    */           return new Response(synonyms);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public String toString() {
/*    */           return "Response(synonyms=" + this.synonyms + ")";
/*    */         }
/*    */         
/*    */         public int hashCode() {
/*    */           return this.synonyms.hashCode();
/*    */         }
/*    */         
/*    */         public boolean equals(@Nullable Object other) {
/*    */           if (this == other)
/*    */             return true; 
/*    */           if (!(other instanceof Response))
/*    */             return false; 
/*    */           Response response = (Response)other;
/*    */           return !!Intrinsics.areEqual(this.synonyms, response.synonyms);
/*    */         }
/*    */       } }
/*    */      }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\trf\SynAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */