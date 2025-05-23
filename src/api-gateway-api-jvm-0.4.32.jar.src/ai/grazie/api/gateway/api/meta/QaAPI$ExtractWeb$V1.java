/*     */ package ai.grazie.api.gateway.api.meta;
/*     */ 
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import ai.grazie.qa.ExtractWebResponse;
/*     */ import java.util.List;
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
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\023B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\024"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "Lai/grazie/qa/ExtractWebResponse;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n19#2,2:127\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1\n*L\n92#1:125,2\n93#1:127,2\n*E\n"})
/*     */ public final class V1
/*     */   implements TypedApi<QaAPI.ExtractWeb.V1.Request, ExtractWebResponse>
/*     */ {
/*     */   @NotNull
/*     */   private static final TypeInfo<Request> requestType;
/*     */   @NotNull
/*     */   private static final TypeInfo<ExtractWebResponse> responseType;
/*     */   @NotNull
/*  92 */   public static final V1 INSTANCE = new V1(); @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 126 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 127 */     kType$iv = Reflection.typeOf(ExtractWebResponse.class);
/* 128 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(ExtractWebResponse.class)); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TypeInfo<ExtractWebResponse> getResponseType() {
/*     */     return responseType;
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
/*     */   private static final String path = "/meta/qa/web/extract/v1";
/*     */   
/*     */   @NotNull
/*     */   public String getPath() {
/*     */     return path;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B=\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\006\022\b\020\b\032\004\030\0010\006\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B+\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\006\022\n\b\002\020\b\032\004\030\0010\006¢\006\002\020\fJ\017\020\022\032\b\022\004\022\0020\0060\005HÆ\003J\013\020\023\032\004\030\0010\006HÆ\003J\013\020\024\032\004\030\0010\006HÆ\003J1\020\025\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\0062\n\b\002\020\b\032\004\030\0010\006HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\006HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\023\020\007\032\004\030\0010\006¢\006\b\n\000\032\004\b\r\020\016R\023\020\b\032\004\030\0010\006¢\006\b\n\000\032\004\b\017\020\016R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\021¨\006%"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "", "seen1", "", "urls", "", "", "parametersJson", "provider", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getParametersJson", "()Ljava/lang/String;", "getProvider", "getUrls", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Request {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final List<String> urls;
/*     */     @Nullable
/*     */     private final String parametersJson;
/*     */     @Nullable
/*     */     private final String provider;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     public Request(@NotNull List<String> urls, @Nullable String parametersJson, @Nullable String provider) {
/*     */       this.urls = urls;
/*     */       this.parametersJson = parametersJson;
/*     */       this.provider = provider;
/*     */     }
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*     */       arrayOfKSerializer[1] = null;
/*     */       arrayOfKSerializer[2] = null;
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.ExtractWeb.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.ExtractWeb.V1.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */         arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */         arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public QaAPI.ExtractWeb.V1.Request deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         List list = null;
/*     */         String str1 = null, str2 = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.ExtractWeb.V1.Request.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */           i |= 0x1;
/*     */           str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */           i |= 0x2;
/*     */           str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */           i |= 0x4;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new QaAPI.ExtractWeb.V1.Request(i, list, str1, str2, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.ExtractWeb.V1.Request value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         QaAPI.ExtractWeb.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.ExtractWeb.V1.Request", INSTANCE, 3);
/*     */         pluginGeneratedSerialDescriptor.addElement("urls", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("parametersJson", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("provider", true);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$ExtractWeb$V1$Request;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<QaAPI.ExtractWeb.V1.Request> serializer() {
/*     */         return (KSerializer<QaAPI.ExtractWeb.V1.Request>)QaAPI.ExtractWeb.V1.Request.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> getUrls() {
/*     */       return this.urls;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getParametersJson() {
/*     */       return this.parametersJson;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getProvider() {
/*     */       return this.provider;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<String> component1() {
/*     */       return this.urls;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String component2() {
/*     */       return this.parametersJson;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String component3() {
/*     */       return this.provider;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull List<String> urls, @Nullable String parametersJson, @Nullable String provider) {
/*     */       Intrinsics.checkNotNullParameter(urls, "urls");
/*     */       return new Request(urls, parametersJson, provider);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(urls=" + this.urls + ", parametersJson=" + this.parametersJson + ", provider=" + this.provider + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.urls.hashCode();
/*     */       result = result * 31 + ((this.parametersJson == null) ? 0 : this.parametersJson.hashCode());
/*     */       return result * 31 + ((this.provider == null) ? 0 : this.provider.hashCode());
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return !Intrinsics.areEqual(this.urls, request.urls) ? false : (!Intrinsics.areEqual(this.parametersJson, request.parametersJson) ? false : (!!Intrinsics.areEqual(this.provider, request.provider)));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\QaAPI$ExtractWeb$V1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */