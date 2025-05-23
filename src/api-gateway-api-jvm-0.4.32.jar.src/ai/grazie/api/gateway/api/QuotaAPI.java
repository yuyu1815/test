/*    */ package ai.grazie.api.gateway.api;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI;", "", "()V", "Get", "Metadata", "api-gateway-api"})
/*    */ public final class QuotaAPI {
/*    */   @NotNull
/*    */   public static final QuotaAPI INSTANCE = new QuotaAPI();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Get;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/api/gateway/api/QuotaAPI$Get$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "api-gateway-api"})
/*    */   @SourceDebugExtension({"SMAP\nQuotaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Get\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,47:1\n19#2,2:48\n*S KotlinDebug\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Get\n*L\n10#1:48,2\n*E\n"})
/*    */   public static final class Get implements UnitTypedApi<Get.Response> { @NotNull
/* 10 */     public static final Get INSTANCE = new Get(); @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/quota/get"; static { int $i$f$typeInfo = 0;
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
/* 48 */       KType kType$iv = Reflection.typeOf(Response.class);
/* 49 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Get$Response;", "", "seen1", "", "current", "Lai/grazie/quota/Quota;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/quota/Quota;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/Quota;)V", "getCurrent", "()Lai/grazie/quota/Quota;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Quota current; public Response(@NotNull Quota current) { this.current = current; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/QuotaAPI.Get.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Get$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)Quota$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public QuotaAPI.Get.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Quota quota = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: quota = (Quota)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Quota$.serializer.INSTANCE, quota); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QuotaAPI.Get.Response(i, quota, null); } public void serialize(@NotNull Encoder encoder, @NotNull QuotaAPI.Get.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QuotaAPI.Get.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.QuotaAPI.Get.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("current", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Get$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Get$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QuotaAPI.Get.Response> serializer() { return (KSerializer<QuotaAPI.Get.Response>)QuotaAPI.Get.Response.$serializer.INSTANCE; } } @NotNull public final Quota getCurrent() { return this.current; } @NotNull public final Quota component1() { return this.current; } @NotNull public final Response copy(@NotNull Quota current) { Intrinsics.checkNotNullParameter(current, "current"); return new Response(current); } @NotNull public String toString() { return "Response(current=" + this.current + ")"; } public int hashCode() { return this.current.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.current, response.current); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata;", "", "()V", "Extensions", "Refill", "Tariff", "api-gateway-api"}) public static final class Metadata { @NotNull public static final Metadata INSTANCE = new Metadata(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nQuotaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,47:1\n19#2,2:48\n*S KotlinDebug\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff\n*L\n20#1:48,2\n*E\n"}) public static final class Tariff implements UnitTypedApi<Tariff.Response> { @NotNull public static final Tariff INSTANCE = new Tariff(); @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Response> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/quota/metadata/tariff"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response;", "", "seen1", "", "current", "Lai/grazie/quota/QuotaTariff;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/quota/QuotaTariff;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/QuotaTariff;)V", "getCurrent", "()Lai/grazie/quota/QuotaTariff;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final QuotaTariff current; public Response(@NotNull QuotaTariff current) { this.current = current; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/QuotaAPI.Metadata.Tariff.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)QuotaTariff$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public QuotaAPI.Metadata.Tariff.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; QuotaTariff quotaTariff = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { quotaTariff = (QuotaTariff)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)QuotaTariff$.serializer.INSTANCE, quotaTariff); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: quotaTariff = (QuotaTariff)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)QuotaTariff$.serializer.INSTANCE, quotaTariff); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QuotaAPI.Metadata.Tariff.Response(i, quotaTariff, null); } public void serialize(@NotNull Encoder encoder, @NotNull QuotaAPI.Metadata.Tariff.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QuotaAPI.Metadata.Tariff.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.QuotaAPI.Metadata.Tariff.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("current", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Tariff$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QuotaAPI.Metadata.Tariff.Response> serializer() { return (KSerializer<QuotaAPI.Metadata.Tariff.Response>)QuotaAPI.Metadata.Tariff.Response.$serializer.INSTANCE; } } @NotNull public final QuotaTariff getCurrent() { return this.current; } @NotNull public final QuotaTariff component1() { return this.current; } @NotNull public final Response copy(@NotNull QuotaTariff current) { Intrinsics.checkNotNullParameter(current, "current"); return new Response(current); } @NotNull public String toString() { return "Response(current=" + this.current + ")"; } public int hashCode() { return this.current.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.current, response.current); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nQuotaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,47:1\n19#2,2:48\n*S KotlinDebug\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill\n*L\n29#1:48,2\n*E\n"}) public static final class Refill implements UnitTypedApi<Refill.Response> { @NotNull public static final Refill INSTANCE = new Refill(); @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Response> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/quota/metadata/refill"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response;", "", "seen1", "", "current", "Lai/grazie/quota/QuotaRefill;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/quota/QuotaRefill;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/quota/QuotaRefill;)V", "getCurrent", "()Lai/grazie/quota/QuotaRefill;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final QuotaRefill current; public Response(@NotNull QuotaRefill current) { this.current = current; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/QuotaAPI.Metadata.Refill.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)QuotaRefill$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public QuotaAPI.Metadata.Refill.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; QuotaRefill quotaRefill = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { quotaRefill = (QuotaRefill)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)QuotaRefill$.serializer.INSTANCE, quotaRefill); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: quotaRefill = (QuotaRefill)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)QuotaRefill$.serializer.INSTANCE, quotaRefill); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new QuotaAPI.Metadata.Refill.Response(i, quotaRefill, null); } public void serialize(@NotNull Encoder encoder, @NotNull QuotaAPI.Metadata.Refill.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); QuotaAPI.Metadata.Refill.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.QuotaAPI.Metadata.Refill.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("current", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Refill$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<QuotaAPI.Metadata.Refill.Response> serializer() { return (KSerializer<QuotaAPI.Metadata.Refill.Response>)QuotaAPI.Metadata.Refill.Response.$serializer.INSTANCE; } } @NotNull public final QuotaRefill getCurrent() { return this.current; } @NotNull public final QuotaRefill component1() { return this.current; } @NotNull public final Response copy(@NotNull QuotaRefill current) { Intrinsics.checkNotNullParameter(current, "current"); return new Response(current); } @NotNull public String toString() { return "Response(current=" + this.current + ")"; } public int hashCode() { return this.current.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.current, response.current); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nQuotaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,47:1\n19#2,2:48\n*S KotlinDebug\n*F\n+ 1 QuotaAPI.kt\nai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions\n*L\n38#1:48,2\n*E\n"}) public static final class Extensions implements UnitTypedApi<Extensions.Response> { @NotNull public static final Extensions INSTANCE = new Extensions(); @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Response> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*    */ 
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
/*    */       private static final String path = "/quota/metadata/extensions";
/*    */       
/*    */       @NotNull
/*    */       public String getPath() {
/*    */         return path;
/*    */       }
/*    */       
/*    */       @Serializable
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response;", "", "seen1", "", "extensions", "", "Lai/grazie/quota/QuotaExtension;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getExtensions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */       public static final class Response {
/*    */         @NotNull
/*    */         public static final Companion Companion = new Companion(null);
/*    */         @NotNull
/*    */         private final List<QuotaExtension> extensions;
/*    */         @JvmField
/*    */         @NotNull
/*    */         private static final KSerializer<Object>[] $childSerializers;
/*    */         
/*    */         public Response(@NotNull List<QuotaExtension> extensions) {
/*    */           this.extensions = extensions;
/*    */         }
/*    */         
/*    */         static {
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */           arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)QuotaExtension$.serializer.INSTANCE);
/*    */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/QuotaAPI.Metadata.Extensions.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])QuotaAPI.Metadata.Extensions.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */             return (KSerializer<?>[])arrayOfKSerializer2;
/*    */           }
/*    */           
/*    */           @NotNull
/*    */           public QuotaAPI.Metadata.Extensions.Response deserialize(@NotNull Decoder decoder) {
/*    */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             boolean bool = true;
/*    */             int i = 0;
/*    */             List list = null;
/*    */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */             KSerializer[] arrayOfKSerializer = (KSerializer[])QuotaAPI.Metadata.Extensions.Response.$childSerializers;
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
/*    */             return new QuotaAPI.Metadata.Extensions.Response(i, list, null);
/*    */           }
/*    */           
/*    */           public void serialize(@NotNull Encoder encoder, @NotNull QuotaAPI.Metadata.Extensions.Response value) {
/*    */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */             Intrinsics.checkNotNullParameter(value, "value");
/*    */             SerialDescriptor serialDescriptor = getDescriptor();
/*    */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */             QuotaAPI.Metadata.Extensions.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */             compositeEncoder.endStructure(serialDescriptor);
/*    */           }
/*    */           
/*    */           static {
/*    */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.QuotaAPI.Metadata.Extensions.Response", INSTANCE, 1);
/*    */             pluginGeneratedSerialDescriptor.addElement("extensions", false);
/*    */             descriptor = pluginGeneratedSerialDescriptor;
/*    */           }
/*    */         }
/*    */         
/*    */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/QuotaAPI$Metadata$Extensions$Response;", "api-gateway-api"})
/*    */         public static final class Companion {
/*    */           private Companion() {}
/*    */           
/*    */           @NotNull
/*    */           public final KSerializer<QuotaAPI.Metadata.Extensions.Response> serializer() {
/*    */             return (KSerializer<QuotaAPI.Metadata.Extensions.Response>)QuotaAPI.Metadata.Extensions.Response.$serializer.INSTANCE;
/*    */           }
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final List<QuotaExtension> getExtensions() {
/*    */           return this.extensions;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final List<QuotaExtension> component1() {
/*    */           return this.extensions;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public final Response copy(@NotNull List<QuotaExtension> extensions) {
/*    */           Intrinsics.checkNotNullParameter(extensions, "extensions");
/*    */           return new Response(extensions);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public String toString() {
/*    */           return "Response(extensions=" + this.extensions + ")";
/*    */         }
/*    */         
/*    */         public int hashCode() {
/*    */           return this.extensions.hashCode();
/*    */         }
/*    */         
/*    */         public boolean equals(@Nullable Object other) {
/*    */           if (this == other)
/*    */             return true; 
/*    */           if (!(other instanceof Response))
/*    */             return false; 
/*    */           Response response = (Response)other;
/*    */           return !!Intrinsics.areEqual(this.extensions, response.extensions);
/*    */         }
/*    */       } }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\QuotaAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */