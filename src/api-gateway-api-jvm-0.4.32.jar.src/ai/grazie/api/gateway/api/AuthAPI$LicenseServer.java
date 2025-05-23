/*     */ package ai.grazie.api.gateway.api;
/*     */ 
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\bÆ\002\030\0002\0020\001:\002\003\004B\007\b\002¢\006\002\020\002¨\006\005"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$LicenseServer;", "", "()V", "ProvideAccess", "TicketPayload", "api-gateway-api"})
/*     */ public final class LicenseServer
/*     */ {
/*     */   @NotNull
/*     */   public static final LicenseServer INSTANCE = new LicenseServer();
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\023B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\024"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload;", "Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Response", "api-gateway-api"})
/*     */   @SourceDebugExtension({"SMAP\nAuthAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,196:1\n19#2,2:197\n19#2,2:199\n*S KotlinDebug\n*F\n+ 1 AuthAPI.kt\nai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess\n*L\n114#1:197,2\n115#1:199,2\n*E\n"})
/*     */   public static final class ProvideAccess
/*     */     implements TypedApi<TicketPayload, ProvideAccess.Response>
/*     */   {
/*     */     @NotNull
/*     */     private static final TypeInfo<AuthAPI.LicenseServer.TicketPayload> requestType;
/*     */     @NotNull
/*     */     private static final TypeInfo<Response> responseType;
/*     */     @NotNull
/* 114 */     public static final ProvideAccess INSTANCE = new ProvideAccess(); @NotNull public TypeInfo<AuthAPI.LicenseServer.TicketPayload> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 197 */       KType kType$iv = Reflection.typeOf(AuthAPI.LicenseServer.TicketPayload.class);
/* 198 */       requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(AuthAPI.LicenseServer.TicketPayload.class)); $i$f$typeInfo = 0;
/* 199 */       kType$iv = Reflection.typeOf(Response.class);
/* 200 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*     */ 
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
/*     */     private static final String path = "/auth/ls/provide-access";
/*     */     
/*     */     @NotNull
/*     */     public String getPath() {
/*     */       return path;
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0342\0020\001:\002\033\034B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\005HÖ\001J&\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031HÁ\001¢\006\002\b\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response;", "", "seen1", "", "token", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */     public static final class Response {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final String token;
/*     */       
/*     */       public Response(@NotNull String token) {
/*     */         this.token = token;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.LicenseServer.ProvideAccess.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */           arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public AuthAPI.LicenseServer.ProvideAccess.Response deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           String str = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */             i |= 0x1;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new AuthAPI.LicenseServer.ProvideAccess.Response(i, str, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.LicenseServer.ProvideAccess.Response value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           AuthAPI.LicenseServer.ProvideAccess.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.LicenseServer.ProvideAccess.Response", INSTANCE, 1);
/*     */           pluginGeneratedSerialDescriptor.addElement("token", false);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$ProvideAccess$Response;", "api-gateway-api"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<AuthAPI.LicenseServer.ProvideAccess.Response> serializer() {
/*     */           return (KSerializer<AuthAPI.LicenseServer.ProvideAccess.Response>)AuthAPI.LicenseServer.ProvideAccess.Response.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getToken() {
/*     */         return this.token;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component1() {
/*     */         return this.token;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Response copy(@NotNull String token) {
/*     */         Intrinsics.checkNotNullParameter(token, "token");
/*     */         return new Response(token);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Response(token=" + this.token + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.token.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Response))
/*     */           return false; 
/*     */         Response response = (Response)other;
/*     */         return !!Intrinsics.areEqual(this.token, response.token);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0372\0020\001:\002\036\037B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\nJ\t\020\016\032\0020\005HÆ\003J\t\020\017\032\0020\005HÆ\003J\035\020\020\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001HÖ\003J\t\020\024\032\0020\003HÖ\001J\t\020\025\032\0020\005HÖ\001J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\f¨\006 "}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload;", "", "seen1", "", "ticket", "", "sign", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getSign", "()Ljava/lang/String;", "getTicket", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class TicketPayload {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final String ticket;
/*     */     @NotNull
/*     */     private final String sign;
/*     */     
/*     */     public TicketPayload(@NotNull String ticket, @NotNull String sign) {
/*     */       this.ticket = ticket;
/*     */       this.sign = sign;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/AuthAPI.LicenseServer.TicketPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */     public static final class $serializer implements GeneratedSerializer<TicketPayload> {
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
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */         arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */         arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public AuthAPI.LicenseServer.TicketPayload deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         String str1 = null, str2 = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */           i |= 0x1;
/*     */           str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */           i |= 0x2;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new AuthAPI.LicenseServer.TicketPayload(i, str1, str2, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull AuthAPI.LicenseServer.TicketPayload value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         AuthAPI.LicenseServer.TicketPayload.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.AuthAPI.LicenseServer.TicketPayload", INSTANCE, 2);
/*     */         pluginGeneratedSerialDescriptor.addElement("ticket", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("sign", false);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/AuthAPI$LicenseServer$TicketPayload;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<AuthAPI.LicenseServer.TicketPayload> serializer() {
/*     */         return (KSerializer<AuthAPI.LicenseServer.TicketPayload>)AuthAPI.LicenseServer.TicketPayload.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getTicket() {
/*     */       return this.ticket;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getSign() {
/*     */       return this.sign;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.ticket;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.sign;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TicketPayload copy(@NotNull String ticket, @NotNull String sign) {
/*     */       Intrinsics.checkNotNullParameter(ticket, "ticket");
/*     */       Intrinsics.checkNotNullParameter(sign, "sign");
/*     */       return new TicketPayload(ticket, sign);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "TicketPayload(ticket=" + this.ticket + ", sign=" + this.sign + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.ticket.hashCode();
/*     */       return result * 31 + this.sign.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof TicketPayload))
/*     */         return false; 
/*     */       TicketPayload ticketPayload = (TicketPayload)other;
/*     */       return !Intrinsics.areEqual(this.ticket, ticketPayload.ticket) ? false : (!!Intrinsics.areEqual(this.sign, ticketPayload.sign));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\AuthAPI$LicenseServer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */