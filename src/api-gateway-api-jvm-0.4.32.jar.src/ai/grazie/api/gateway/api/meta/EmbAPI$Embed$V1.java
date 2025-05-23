/*    */ package ai.grazie.api.gateway.api.meta;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request;", "Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*    */ @SourceDebugExtension({"SMAP\nEmbAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbAPI.kt\nai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,26:1\n19#2,2:27\n19#2,2:29\n*S KotlinDebug\n*F\n+ 1 EmbAPI.kt\nai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1\n*L\n10#1:27,2\n11#1:29,2\n*E\n"})
/*    */ public final class V1 implements TypedApi<EmbAPI.Embed.V1.Request, EmbAPI.Embed.V1.Response> {
/*    */   @NotNull
/* 10 */   public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 27 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 28 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 29 */     kType$iv = Reflection.typeOf(Response.class);
/* 30 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
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
/*    */   private static final String path = "/meta/emb/embed";
/*    */   
/*    */   @NotNull
/*    */   public String getPath() {
/*    */     return path;
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B3\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\006\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\037\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\006¢\006\002\020\013J\017\020\020\032\b\022\004\022\0020\0060\005HÆ\003J\013\020\021\032\004\030\0010\006HÆ\003J%\020\022\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\006HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\006HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\023\020\007\032\004\030\0010\006¢\006\b\n\000\032\004\b\f\020\rR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\016\020\017¨\006\""}, d2 = {"Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request;", "", "seen1", "", "texts", "", "", "model", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;)V", "getModel", "()Ljava/lang/String;", "getTexts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Request {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final List<String> texts;
/*    */     @Nullable
/*    */     private final String model;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Request(@NotNull List<String> texts, @Nullable String model) {
/*    */       this.texts = texts;
/*    */       this.model = model;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[1] = null;
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/EmbAPI.Embed.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])EmbAPI.Embed.V1.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*    */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */         arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public EmbAPI.Embed.V1.Request deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         List list = null;
/*    */         String str = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])EmbAPI.Embed.V1.Request.$childSerializers;
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */           i |= 0x1;
/*    */           str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */           i |= 0x2;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new EmbAPI.Embed.V1.Request(i, list, str, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull EmbAPI.Embed.V1.Request value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         EmbAPI.Embed.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.EmbAPI.Embed.V1.Request", INSTANCE, 2);
/*    */         pluginGeneratedSerialDescriptor.addElement("texts", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("model", true);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Request;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<EmbAPI.Embed.V1.Request> serializer() {
/*    */         return (KSerializer<EmbAPI.Embed.V1.Request>)EmbAPI.Embed.V1.Request.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> getTexts() {
/*    */       return this.texts;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String getModel() {
/*    */       return this.model;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> component1() {
/*    */       return this.texts;
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final String component2() {
/*    */       return this.model;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull List<String> texts, @Nullable String model) {
/*    */       Intrinsics.checkNotNullParameter(texts, "texts");
/*    */       return new Request(texts, model);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(texts=" + this.texts + ", model=" + this.model + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.texts.hashCode();
/*    */       return result * 31 + ((this.model == null) ? 0 : this.model.hashCode());
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return !Intrinsics.areEqual(this.texts, request.texts) ? false : (!!Intrinsics.areEqual(this.model, request.model));
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response;", "", "seen1", "", "embeddings", "", "Lai/grazie/emb/DoubleTextEmbedding;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getEmbeddings", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Response {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final List<DoubleTextEmbedding> embeddings;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Response(@NotNull List<DoubleTextEmbedding> embeddings) {
/*    */       this.embeddings = embeddings;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)DoubleTextEmbedding$.serializer.INSTANCE);
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/EmbAPI.Embed.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])EmbAPI.Embed.V1.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public EmbAPI.Embed.V1.Response deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         List list = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])EmbAPI.Embed.V1.Response.$childSerializers;
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */           i |= 0x1;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new EmbAPI.Embed.V1.Response(i, list, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull EmbAPI.Embed.V1.Response value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         EmbAPI.Embed.V1.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.EmbAPI.Embed.V1.Response", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("embeddings", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/EmbAPI$Embed$V1$Response;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<EmbAPI.Embed.V1.Response> serializer() {
/*    */         return (KSerializer<EmbAPI.Embed.V1.Response>)EmbAPI.Embed.V1.Response.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<DoubleTextEmbedding> getEmbeddings() {
/*    */       return this.embeddings;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<DoubleTextEmbedding> component1() {
/*    */       return this.embeddings;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Response copy(@NotNull List<DoubleTextEmbedding> embeddings) {
/*    */       Intrinsics.checkNotNullParameter(embeddings, "embeddings");
/*    */       return new Response(embeddings);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Response(embeddings=" + this.embeddings + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.embeddings.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Response))
/*    */         return false; 
/*    */       Response response = (Response)other;
/*    */       return !!Intrinsics.areEqual(this.embeddings, response.embeddings);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\EmbAPI$Embed$V1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */