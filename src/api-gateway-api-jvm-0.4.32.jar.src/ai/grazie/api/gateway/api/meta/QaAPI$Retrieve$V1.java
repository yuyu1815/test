/*     */ package ai.grazie.api.gateway.api.meta;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.llm.profile.LLMProfileID;
/*     */ import ai.grazie.qa.QADocument;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KType;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*     */ @SourceDebugExtension({"SMAP\nQaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,124:1\n19#2,2:125\n19#2,2:127\n*S KotlinDebug\n*F\n+ 1 QaAPI.kt\nai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1\n*L\n35#1:125,2\n36#1:127,2\n*E\n"})
/*     */ public final class V1 implements TypedApi<QaAPI.Retrieve.V1.Request, QaAPI.Retrieve.V1.Response> {
/*     */   @NotNull
/*  35 */   public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 127 */     kType$iv = Reflection.typeOf(Response.class);
/* 128 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TypeInfo<Response> getResponseType() {
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
/*     */   private static final String path = "/meta/qa/retrieve/v1";
/*     */   
/*     */   @NotNull
/*     */   public String getPath() {
/*     */     return path;
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+BI\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\005\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB9\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\003\022\b\b\002\020\007\032\0020\005\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\005¢\006\002\020\016J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\005HÆ\003J\013\020\032\032\004\030\0010\tHÆ\003J\013\020\033\032\004\030\0010\005HÆ\003J?\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0052\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\005HÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\005HÖ\001J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\023\020\n\032\004\030\0010\005¢\006\b\n\000\032\004\b\017\020\020R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\021\020\020R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\020R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\025\020\026¨\006,"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "", "seen1", "", "query", "", "size", "dataSource", "llmProfile", "Lai/grazie/model/llm/profile/LLMProfileID;", "context", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;)V", "getContext", "()Ljava/lang/String;", "getDataSource", "getLlmProfile", "()Lai/grazie/model/llm/profile/LLMProfileID;", "getQuery", "getSize", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Request {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final String query;
/*     */     private final int size;
/*     */     @NotNull
/*     */     private final String dataSource;
/*     */     @Nullable
/*     */     private final LLMProfileID llmProfile;
/*     */     @Nullable
/*     */     private final String context;
/*     */     
/*     */     public Request(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID llmProfile, @Nullable String context) {
/*     */       this.query = query;
/*     */       this.size = size;
/*     */       this.dataSource = dataSource;
/*     */       this.llmProfile = llmProfile;
/*     */       this.context = context;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Retrieve.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*     */         arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */         arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*     */         arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */         arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)LLMProfileID.Serializer.INSTANCE);
/*     */         arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*     */         return (KSerializer<?>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public QaAPI.Retrieve.V1.Request deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         String str1 = null;
/*     */         int j = 0;
/*     */         String str2 = null;
/*     */         LLMProfileID lLMProfileID = null;
/*     */         String str3 = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */           i |= 0x1;
/*     */           j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*     */           i |= 0x2;
/*     */           str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */           i |= 0x4;
/*     */           lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */           i |= 0x8;
/*     */           str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*     */           i |= 0x10;
/*     */         } else {
/*     */           while (bool) {
/*     */             int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (k) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */               case 3:
/*     */                 lLMProfileID = (LLMProfileID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMProfileID.Serializer.INSTANCE, lLMProfileID);
/*     */                 i |= 0x8;
/*     */                 continue;
/*     */               case 4:
/*     */                 str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*     */                 i |= 0x10;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(k);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new QaAPI.Retrieve.V1.Request(i, str1, j, str2, lLMProfileID, str3, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Retrieve.V1.Request value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         QaAPI.Retrieve.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Retrieve.V1.Request", INSTANCE, 5);
/*     */         pluginGeneratedSerialDescriptor.addElement("query", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("size", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("dataSource", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("llmProfile", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("context", true);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Request;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<QaAPI.Retrieve.V1.Request> serializer() {
/*     */         return (KSerializer<QaAPI.Retrieve.V1.Request>)QaAPI.Retrieve.V1.Request.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getQuery() {
/*     */       return this.query;
/*     */     }
/*     */     
/*     */     public final int getSize() {
/*     */       return this.size;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getDataSource() {
/*     */       return this.dataSource;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final LLMProfileID getLlmProfile() {
/*     */       return this.llmProfile;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String getContext() {
/*     */       return this.context;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component1() {
/*     */       return this.query;
/*     */     }
/*     */     
/*     */     public final int component2() {
/*     */       return this.size;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component3() {
/*     */       return this.dataSource;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final LLMProfileID component4() {
/*     */       return this.llmProfile;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String component5() {
/*     */       return this.context;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull String query, int size, @NotNull String dataSource, @Nullable LLMProfileID llmProfile, @Nullable String context) {
/*     */       Intrinsics.checkNotNullParameter(query, "query");
/*     */       Intrinsics.checkNotNullParameter(dataSource, "dataSource");
/*     */       return new Request(query, size, dataSource, llmProfile, context);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(query=" + this.query + ", size=" + this.size + ", dataSource=" + this.dataSource + ", llmProfile=" + this.llmProfile + ", context=" + this.context + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.query.hashCode();
/*     */       result = result * 31 + Integer.hashCode(this.size);
/*     */       result = result * 31 + this.dataSource.hashCode();
/*     */       result = result * 31 + ((this.llmProfile == null) ? 0 : this.llmProfile.hashCode());
/*     */       return result * 31 + ((this.context == null) ? 0 : this.context.hashCode());
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return !Intrinsics.areEqual(this.query, request.query) ? false : ((this.size != request.size) ? false : (!Intrinsics.areEqual(this.dataSource, request.dataSource) ? false : (!Intrinsics.areEqual(this.llmProfile, request.llmProfile) ? false : (!!Intrinsics.areEqual(this.context, request.context)))));
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "", "seen1", "", "documents", "", "Lai/grazie/qa/QADocument;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getDocuments", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */   public static final class Response {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final List<QADocument> documents;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     public Response(@NotNull List<QADocument> documents) {
/*     */       this.documents = documents;
/*     */     }
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)QADocument$.serializer.INSTANCE);
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/QaAPI.Retrieve.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
/*     */     public static final class $serializer implements GeneratedSerializer<Response> {
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
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])QaAPI.Retrieve.V1.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*     */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public QaAPI.Retrieve.V1.Response deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         List list = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])QaAPI.Retrieve.V1.Response.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*     */           i |= 0x1;
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
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new QaAPI.Retrieve.V1.Response(i, list, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull QaAPI.Retrieve.V1.Response value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         QaAPI.Retrieve.V1.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.QaAPI.Retrieve.V1.Response", INSTANCE, 1);
/*     */         pluginGeneratedSerialDescriptor.addElement("documents", false);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/QaAPI$Retrieve$V1$Response;", "api-gateway-api"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<QaAPI.Retrieve.V1.Response> serializer() {
/*     */         return (KSerializer<QaAPI.Retrieve.V1.Response>)QaAPI.Retrieve.V1.Response.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<QADocument> getDocuments() {
/*     */       return this.documents;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<QADocument> component1() {
/*     */       return this.documents;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Response copy(@NotNull List<QADocument> documents) {
/*     */       Intrinsics.checkNotNullParameter(documents, "documents");
/*     */       return new Response(documents);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Response(documents=" + this.documents + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.documents.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Response))
/*     */         return false; 
/*     */       Response response = (Response)other;
/*     */       return !!Intrinsics.areEqual(this.documents, response.documents);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\QaAPI$Retrieve$V1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */