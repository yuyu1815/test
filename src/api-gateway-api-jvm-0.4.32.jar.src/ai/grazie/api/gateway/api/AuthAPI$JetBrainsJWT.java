/*     */ package ai.grazie.api.gateway.api;
/*     */ 
/*     */ import ai.grazie.license.JBALicense;
/*     */ import ai.grazie.license.JBALicense$;
/*     */ import ai.grazie.license.LicenseID;
/*     */ import ai.grazie.model.auth.GrazieUserState;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import ai.grazie.model.cloud.UnitTypedApi;
/*     */ import ai.grazie.swagger.SecurityRequirement;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
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
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
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
/*     */ @SecurityRequirement(name = "jbaIdToken")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\006\bÇ\002\030\0002\0020\001:\004\003\004\005\006B\007\b\002¢\006\002\020\002¨\006\007"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT;", "", "()V", "License", "ProvideAccess", "Register", "UserInfo", "api-gateway-api"})
/*     */ public final class JetBrainsJWT
/*     */ {
/*     */   @NotNull
/*     */   public static final JetBrainsJWT INSTANCE = new JetBrainsJWT();
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "api-gateway-api"})
/*     */   @SourceDebugExtension({"SMAP\nAuthAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,196:1\n19#2,2:197\n*S KotlinDebug\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo\n*L\n139#1:197,2\n*E\n"})
/*     */   public static final class UserInfo
/*     */     implements UnitTypedApi<UserInfo.Response>
/*     */   {
/*     */     @NotNull
/* 139 */     public static final UserInfo INSTANCE = new UserInfo(); @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Response> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 197 */       KType kType$iv = Reflection.typeOf(Response.class);
/* 198 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull private static final HttpMethod httpMethod = HttpMethod.Get; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/auth/jetbrains-jwt/user-info"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response;", "", "seen1", "", "state", "Lai/grazie/model/auth/GrazieUserState;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/auth/GrazieUserState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/auth/GrazieUserState;)V", "getState", "()Lai/grazie/model/auth/GrazieUserState;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final GrazieUserState state; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull GrazieUserState state) { this.state = state; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = GrazieUserState.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.JetBrainsJWT.UserInfo.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])AuthAPI.JetBrainsJWT.UserInfo.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public AuthAPI.JetBrainsJWT.UserInfo.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; GrazieUserState grazieUserState = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])AuthAPI.JetBrainsJWT.UserInfo.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new AuthAPI.JetBrainsJWT.UserInfo.Response(i, grazieUserState, null); } public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.UserInfo.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); AuthAPI.JetBrainsJWT.UserInfo.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.JetBrainsJWT.UserInfo.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("state", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$UserInfo$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AuthAPI.JetBrainsJWT.UserInfo.Response> serializer() { return (KSerializer<AuthAPI.JetBrainsJWT.UserInfo.Response>)AuthAPI.JetBrainsJWT.UserInfo.Response.$serializer.INSTANCE; } } @NotNull public final GrazieUserState getState() { return this.state; } @NotNull public final GrazieUserState component1() { return this.state; } @NotNull public final Response copy(@NotNull GrazieUserState state) { Intrinsics.checkNotNullParameter(state, "state"); return new Response(state); } @NotNull public String toString() { return "Response(state=" + this.state + ")"; } public int hashCode() { return this.state.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !(this.state != response.state); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nAuthAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,196:1\n19#2,2:197\n*S KotlinDebug\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register\n*L\n148#1:197,2\n*E\n"}) public static final class Register implements UnitTypedApi<Register.Response> { @NotNull public static final Register INSTANCE = new Register(); @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Response> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/auth/jetbrains-jwt/register"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response;", "", "seen1", "", "state", "Lai/grazie/model/auth/GrazieUserState;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/auth/GrazieUserState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/auth/GrazieUserState;)V", "getState", "()Lai/grazie/model/auth/GrazieUserState;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final GrazieUserState state; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull GrazieUserState state) { this.state = state; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = GrazieUserState.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.JetBrainsJWT.Register.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])AuthAPI.JetBrainsJWT.Register.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public AuthAPI.JetBrainsJWT.Register.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; GrazieUserState grazieUserState = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])AuthAPI.JetBrainsJWT.Register.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new AuthAPI.JetBrainsJWT.Register.Response(i, grazieUserState, null); } public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.Register.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); AuthAPI.JetBrainsJWT.Register.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.JetBrainsJWT.Register.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("state", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$Register$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AuthAPI.JetBrainsJWT.Register.Response> serializer() { return (KSerializer<AuthAPI.JetBrainsJWT.Register.Response>)AuthAPI.JetBrainsJWT.Register.Response.$serializer.INSTANCE; } } @NotNull public final GrazieUserState getState() { return this.state; } @NotNull public final GrazieUserState component1() { return this.state; } @NotNull public final Response copy(@NotNull GrazieUserState state) { Intrinsics.checkNotNullParameter(state, "state"); return new Response(state); } @NotNull public String toString() { return "Response(state=" + this.state + ")"; } public int hashCode() { return this.state.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !(this.state != response.state); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License;", "", "()V", "ObtainGrazieLite", "api-gateway-api"}) public static final class License { @NotNull public static final License INSTANCE = new License(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0000\001:\001\017B\007\b\002¢\006\002\020\002R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bXD¢\006\b\n\000\032\004\b\t\020\nR\032\020\013\032\b\022\004\022\0020\0000\fX\004¢\006\b\n\000\032\004\b\r\020\016¨\006\020"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite;", "Lai/grazie/model/cloud/UnitTypedApi;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nAuthAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,196:1\n19#2,2:197\n*S KotlinDebug\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite\n*L\n158#1:197,2\n*E\n"}) public static final class ObtainGrazieLite implements UnitTypedApi<ObtainGrazieLite> { @NotNull public static final ObtainGrazieLite INSTANCE = new ObtainGrazieLite(); @NotNull private static final TypeInfo<ObtainGrazieLite> responseType; @NotNull public TypeInfo<ObtainGrazieLite> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(ObtainGrazieLite.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(ObtainGrazieLite.class)); } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/auth/jetbrains-jwt/license/obtain/grazie-lite"; @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\017\022\b\020\004\032\004\030\0010\005¢\006\002\020\tJ\013\020\f\032\004\030\0010\005HÆ\003J\025\020\r\032\0020\0002\n\b\002\020\004\032\004\030\0010\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;", "", "seen1", "", "license", "Lai/grazie/license/JBALicense;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/JBALicense;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/JBALicense;)V", "getLicense", "()Lai/grazie/license/JBALicense;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @Nullable private final JBALicense license; public Response(@Nullable JBALicense license) { this.license = license; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = BuiltinSerializersKt.getNullable((KSerializer)JBALicense$.serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; JBALicense jBALicense = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { jBALicense = (JBALicense)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)JBALicense$.serializer.INSTANCE, jBALicense); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: jBALicense = (JBALicense)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)JBALicense$.serializer.INSTANCE, jBALicense); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response(i, jBALicense, null); } public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("license", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$License$ObtainGrazieLite$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response> serializer() { return (KSerializer<AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response>)AuthAPI.JetBrainsJWT.License.ObtainGrazieLite.Response.$serializer.INSTANCE; } } @Nullable public final JBALicense getLicense() { return this.license; } @Nullable public final JBALicense component1() { return this.license; } @NotNull public final Response copy(@Nullable JBALicense license) { return new Response(license); } @NotNull public String toString() { return "Response(license=" + this.license + ")"; } public int hashCode() { return (this.license == null) ? 0 : this.license.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return !!Intrinsics.areEqual(this.license, response.license); } } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess;", "", "()V", "License", "LicenseV2", "api-gateway-api"}) public static final class ProvideAccess { @NotNull public static final ProvideAccess INSTANCE = new ProvideAccess(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nAuthAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,196:1\n19#2,2:197\n19#2,2:199\n*S KotlinDebug\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License\n*L\n169#1:197,2\n170#1:199,2\n*E\n"}) public static final class License implements TypedApi<License.Request, License.Response> { @NotNull public static final License INSTANCE = new License(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } @NotNull public TypeInfo<Response> getResponseType() { return responseType; } @NotNull private static final HttpMethod httpMethod = HttpMethod.Post; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull private static final String path = "/auth/jetbrains-jwt/provide-access/license"; static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 199 */         kType$iv = Reflection.typeOf(Response.class);
/* 200 */         responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); } @NotNull public String getPath() { return path; } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request;", "", "seen1", "", "licenseId", "Lai/grazie/license/LicenseID;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;)V", "getLicenseId", "()Lai/grazie/license/LicenseID;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Request { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final LicenseID licenseId; public Request(@NotNull LicenseID licenseId) { this.licenseId = licenseId; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.JetBrainsJWT.ProvideAccess.License.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)LicenseID.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public AuthAPI.JetBrainsJWT.ProvideAccess.License.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LicenseID licenseID = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID); i |= 0x1; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new AuthAPI.JetBrainsJWT.ProvideAccess.License.Request(i, licenseID, null); } public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.ProvideAccess.License.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); AuthAPI.JetBrainsJWT.ProvideAccess.License.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.JetBrainsJWT.ProvideAccess.License.Request", INSTANCE, 1); pluginGeneratedSerialDescriptor.addElement("licenseId", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.License.Request> serializer() { return (KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.License.Request>)AuthAPI.JetBrainsJWT.ProvideAccess.License.Request.$serializer.INSTANCE; } } @NotNull public final LicenseID getLicenseId() { return this.licenseId; } @NotNull public final LicenseID component1() { return this.licenseId; } @NotNull public final Request copy(@NotNull LicenseID licenseId) { Intrinsics.checkNotNullParameter(licenseId, "licenseId"); return new Request(licenseId); } @NotNull public String toString() { return "Request(licenseId=" + this.licenseId + ")"; } public int hashCode() { return this.licenseId.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Request)) return false;  Request request = (Request)other; return !!Intrinsics.areEqual(this.licenseId, request.licenseId); } } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\007HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\""}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response;", "", "seen1", "", "state", "Lai/grazie/model/auth/GrazieUserState;", "token", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/auth/GrazieUserState;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/auth/GrazieUserState;Ljava/lang/String;)V", "getState", "()Lai/grazie/model/auth/GrazieUserState;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"}) public static final class Response { @NotNull public static final Companion Companion = new Companion(null); @NotNull private final GrazieUserState state; @NotNull private final String token; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public Response(@NotNull GrazieUserState state, @NotNull String token) { this.state = state; this.token = token; } static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = GrazieUserState.Companion.serializer(); arrayOfKSerializer[1] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.JetBrainsJWT.ProvideAccess.License.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Response> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])AuthAPI.JetBrainsJWT.ProvideAccess.License.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public AuthAPI.JetBrainsJWT.ProvideAccess.License.Response deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; GrazieUserState grazieUserState = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])AuthAPI.JetBrainsJWT.ProvideAccess.License.Response.$childSerializers; if (compositeDecoder.decodeSequentially()) { grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new AuthAPI.JetBrainsJWT.ProvideAccess.License.Response(i, grazieUserState, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.ProvideAccess.License.Response value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); AuthAPI.JetBrainsJWT.ProvideAccess.License.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.JetBrainsJWT.ProvideAccess.License.Response", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("state", false); pluginGeneratedSerialDescriptor.addElement("token", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$License$Response;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.License.Response> serializer() { return (KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.License.Response>)AuthAPI.JetBrainsJWT.ProvideAccess.License.Response.$serializer.INSTANCE; } } @NotNull public final GrazieUserState getState() { return this.state; } @NotNull public final String getToken() { return this.token; } @NotNull public final GrazieUserState component1() { return this.state; } @NotNull public final String component2() { return this.token; } @NotNull public final Response copy(@NotNull GrazieUserState state, @NotNull String token) { Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(token, "token"); return new Response(state, token); } @NotNull public String toString() { return "Response(state=" + this.state + ", token=" + this.token + ")"; } public int hashCode() { result = this.state.hashCode(); return result * 31 + this.token.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Response)) return false;  Response response = (Response)other; return (this.state != response.state) ? false : (!!Intrinsics.areEqual(this.token, response.token)); } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"}) @SourceDebugExtension({"SMAP\nAuthAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,196:1\n19#2,2:197\n19#2,2:199\n*S KotlinDebug\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2\n*L\n182#1:197,2\n183#1:199,2\n*E\n"}) public static final class LicenseV2 implements TypedApi<LicenseV2.Request, LicenseV2.Response> { static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Request.class); requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0; kType$iv = Reflection.typeOf(Response.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*     */ 
/*     */       
/*     */       @NotNull
/*     */       public static final LicenseV2 INSTANCE = new LicenseV2();
/*     */       @NotNull
/*     */       private static final TypeInfo<Request> requestType;
/*     */       @NotNull
/*     */       private static final TypeInfo<Response> responseType;
/*     */       
/*     */       @NotNull
/*     */       public TypeInfo<Request> getRequestType() {
/*     */         return requestType;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public TypeInfo<Response> getResponseType() {
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
/*     */       private static final String path = "/auth/jetbrains-jwt/provide-access/license/v2";
/*     */       
/*     */       @NotNull
/*     */       public String getPath() {
/*     */         return path;
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request;", "", "seen1", "", "licenseId", "Lai/grazie/license/LicenseID;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/license/LicenseID;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/license/LicenseID;)V", "getLicenseId", "()Lai/grazie/license/LicenseID;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class Request {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @NotNull
/*     */         private final LicenseID licenseId;
/*     */         
/*     */         public Request(@NotNull LicenseID licenseId) {
/*     */           this.licenseId = licenseId;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */             KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */             arrayOfKSerializer[0] = (KSerializer)LicenseID.Serializer.INSTANCE;
/*     */             return (KSerializer<?>[])arrayOfKSerializer;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             LicenseID licenseID = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID);
/*     */               i |= 0x1;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     licenseID = (LicenseID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)LicenseID.Serializer.INSTANCE, licenseID);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request(i, licenseID, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request", INSTANCE, 1);
/*     */             pluginGeneratedSerialDescriptor.addElement("licenseId", false);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Request;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request> serializer() {
/*     */             return (KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request>)AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Request.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final LicenseID getLicenseId() {
/*     */           return this.licenseId;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final LicenseID component1() {
/*     */           return this.licenseId;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Request copy(@NotNull LicenseID licenseId) {
/*     */           Intrinsics.checkNotNullParameter(licenseId, "licenseId");
/*     */           return new Request(licenseId);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "Request(licenseId=" + this.licenseId + ")";
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           return this.licenseId.hashCode();
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof Request))
/*     */             return false; 
/*     */           Request request = (Request)other;
/*     */           return !!Intrinsics.areEqual(this.licenseId, request.licenseId);
/*     */         }
/*     */       }
/*     */       
/*     */       @Serializable
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\007HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\""}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response;", "", "seen1", "", "state", "Lai/grazie/model/auth/GrazieUserState;", "token", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/auth/GrazieUserState;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/auth/GrazieUserState;Ljava/lang/String;)V", "getState", "()Lai/grazie/model/auth/GrazieUserState;", "getToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */       public static final class Response {
/*     */         @NotNull
/*     */         public static final Companion Companion = new Companion(null);
/*     */         @NotNull
/*     */         private final GrazieUserState state;
/*     */         @NotNull
/*     */         private final String token;
/*     */         @JvmField
/*     */         @NotNull
/*     */         private static final KSerializer<Object>[] $childSerializers;
/*     */         
/*     */         public Response(@NotNull GrazieUserState state, @NotNull String token) {
/*     */           this.state = state;
/*     */           this.token = token;
/*     */         }
/*     */         
/*     */         static {
/*     */           KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */           arrayOfKSerializer[0] = GrazieUserState.Companion.serializer();
/*     */           arrayOfKSerializer[1] = null;
/*     */           $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */         public static final class $serializer implements GeneratedSerializer<Response> {
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
/*     */             KSerializer[] arrayOfKSerializer1 = (KSerializer[])AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*     */             arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */             arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */             return (KSerializer<?>[])arrayOfKSerializer2;
/*     */           }
/*     */           
/*     */           @NotNull
/*     */           public AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response deserialize(@NotNull Decoder decoder) {
/*     */             Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             boolean bool = true;
/*     */             int i = 0;
/*     */             GrazieUserState grazieUserState = null;
/*     */             String str = null;
/*     */             CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */             KSerializer[] arrayOfKSerializer = (KSerializer[])AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response.$childSerializers;
/*     */             if (compositeDecoder.decodeSequentially()) {
/*     */               grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState);
/*     */               i |= 0x1;
/*     */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */               i |= 0x2;
/*     */             } else {
/*     */               while (bool) {
/*     */                 int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */                 switch (j) {
/*     */                   case -1:
/*     */                     bool = false;
/*     */                     continue;
/*     */                   case 0:
/*     */                     grazieUserState = (GrazieUserState)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], grazieUserState);
/*     */                     i |= 0x1;
/*     */                     continue;
/*     */                   case 1:
/*     */                     str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                     i |= 0x2;
/*     */                     continue;
/*     */                 } 
/*     */                 throw new UnknownFieldException(j);
/*     */               } 
/*     */             } 
/*     */             compositeDecoder.endStructure(serialDescriptor);
/*     */             return new AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response(i, grazieUserState, str, null);
/*     */           }
/*     */           
/*     */           public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response value) {
/*     */             Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */             Intrinsics.checkNotNullParameter(value, "value");
/*     */             SerialDescriptor serialDescriptor = getDescriptor();
/*     */             CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */             AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */             compositeEncoder.endStructure(serialDescriptor);
/*     */           }
/*     */           
/*     */           static {
/*     */             PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response", INSTANCE, 2);
/*     */             pluginGeneratedSerialDescriptor.addElement("state", false);
/*     */             pluginGeneratedSerialDescriptor.addElement("token", false);
/*     */             descriptor = pluginGeneratedSerialDescriptor;
/*     */           }
/*     */         }
/*     */         
/*     */         @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$JetBrainsJWT$ProvideAccess$LicenseV2$Response;", "api-gateway-api"})
/*     */         public static final class Companion {
/*     */           private Companion() {}
/*     */           
/*     */           @NotNull
/*     */           public final KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response> serializer() {
/*     */             return (KSerializer<AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response>)AuthAPI.JetBrainsJWT.ProvideAccess.LicenseV2.Response.$serializer.INSTANCE;
/*     */           }
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final GrazieUserState getState() {
/*     */           return this.state;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final String getToken() {
/*     */           return this.token;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final GrazieUserState component1() {
/*     */           return this.state;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final String component2() {
/*     */           return this.token;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public final Response copy(@NotNull GrazieUserState state, @NotNull String token) {
/*     */           Intrinsics.checkNotNullParameter(state, "state");
/*     */           Intrinsics.checkNotNullParameter(token, "token");
/*     */           return new Response(state, token);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public String toString() {
/*     */           return "Response(state=" + this.state + ", token=" + this.token + ")";
/*     */         }
/*     */         
/*     */         public int hashCode() {
/*     */           result = this.state.hashCode();
/*     */           return result * 31 + this.token.hashCode();
/*     */         }
/*     */         
/*     */         public boolean equals(@Nullable Object other) {
/*     */           if (this == other)
/*     */             return true; 
/*     */           if (!(other instanceof Response))
/*     */             return false; 
/*     */           Response response = (Response)other;
/*     */           return (this.state != response.state) ? false : (!!Intrinsics.areEqual(this.token, response.token));
/*     */         }
/*     */       } }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\AuthAPI$JetBrainsJWT.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */