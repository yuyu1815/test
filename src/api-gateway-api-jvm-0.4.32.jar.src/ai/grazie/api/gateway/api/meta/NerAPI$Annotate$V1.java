/*    */ package ai.grazie.api.gateway.api.meta;
/*    */ import java.util.List;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Request;", "Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "api-gateway-api"})
/*    */ @SourceDebugExtension({"SMAP\nNerAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NerAPI.kt\nai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,24:1\n19#2,2:25\n19#2,2:27\n*S KotlinDebug\n*F\n+ 1 NerAPI.kt\nai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1\n*L\n11#1:25,2\n12#1:27,2\n*E\n"})
/*    */ public final class V1 implements TypedApi<NerAPI.Annotate.V1.Request, NerAPI.Annotate.V1.Response> {
/*    */   @NotNull
/* 11 */   public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 25 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 26 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 27 */     kType$iv = Reflection.typeOf(Response.class);
/* 28 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
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
/*    */   private static final String path = "/meta/ner/annotate/v1";
/*    */   
/*    */   @NotNull
/*    */   public String getPath() {
/*    */     return path;
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 &2\0020\001:\002%&B=\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\b\b\002\020\t\032\0020\b¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\017\020\025\032\b\022\004\022\0020\b0\007HÆ\003J\t\020\026\032\0020\bHÆ\003J-\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\b\b\002\020\t\032\0020\bHÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\bHÖ\001J&\020\035\032\0020\0362\006\020\037\032\0020\0002\006\020 \032\0020!2\006\020\"\032\0020#HÁ\001¢\006\002\b$R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\t\032\0020\b¢\006\b\n\000\032\004\b\022\020\023¨\006'"}, d2 = {"Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Request;", "", "seen1", "", "lang", "Lai/grazie/nlp/langs/Language;", "texts", "", "", "version", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Ljava/lang/String;)V", "getLang", "()Lai/grazie/nlp/langs/Language;", "getTexts", "()Ljava/util/List;", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Request {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final Language lang;
/*    */     @NotNull
/*    */     private final List<String> texts;
/*    */     @NotNull
/*    */     private final String version;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Request(@NotNull Language lang, @NotNull List<String> texts, @NotNull String version) {
/*    */       this.lang = lang;
/*    */       this.texts = texts;
/*    */       this.version = version;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */       arrayOfKSerializer[0] = null;
/*    */       arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[2] = null;
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/NerAPI.Annotate.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])NerAPI.Annotate.V1.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */         arrayOfKSerializer2[0] = (KSerializer)Language.Serializer.INSTANCE;
/*    */         arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */         arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public NerAPI.Annotate.V1.Request deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         Language language = null;
/*    */         List list = null;
/*    */         String str = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])NerAPI.Annotate.V1.Request.$childSerializers;
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */           i |= 0x1;
/*    */           list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */           i |= 0x2;
/*    */           str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */           i |= 0x4;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */               case 2:
/*    */                 str = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */                 i |= 0x4;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new NerAPI.Annotate.V1.Request(i, language, list, str, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull NerAPI.Annotate.V1.Request value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         NerAPI.Annotate.V1.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.NerAPI.Annotate.V1.Request", INSTANCE, 3);
/*    */         pluginGeneratedSerialDescriptor.addElement("lang", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("texts", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("version", true);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Request;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<NerAPI.Annotate.V1.Request> serializer() {
/*    */         return (KSerializer<NerAPI.Annotate.V1.Request>)NerAPI.Annotate.V1.Request.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Language getLang() {
/*    */       return this.lang;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> getTexts() {
/*    */       return this.texts;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getVersion() {
/*    */       return this.version;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Language component1() {
/*    */       return this.lang;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> component2() {
/*    */       return this.texts;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component3() {
/*    */       return this.version;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull Language lang, @NotNull List<String> texts, @NotNull String version) {
/*    */       Intrinsics.checkNotNullParameter(lang, "lang");
/*    */       Intrinsics.checkNotNullParameter(texts, "texts");
/*    */       Intrinsics.checkNotNullParameter(version, "version");
/*    */       return new Request(lang, texts, version);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(lang=" + this.lang + ", texts=" + this.texts + ", version=" + this.version + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.lang.hashCode();
/*    */       result = result * 31 + this.texts.hashCode();
/*    */       return result * 31 + this.version.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return (this.lang != request.lang) ? false : (!Intrinsics.areEqual(this.texts, request.texts) ? false : (!!Intrinsics.areEqual(this.version, request.version)));
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response;", "", "seen1", "", "annotations", "", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getAnnotations", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Response {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final List<SentenceWithNERAnnotations> annotations;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Response(@NotNull List<SentenceWithNERAnnotations> annotations) {
/*    */       this.annotations = annotations;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)SentenceWithNERAnnotations$.serializer.INSTANCE);
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/meta/NerAPI.Annotate.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])NerAPI.Annotate.V1.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public NerAPI.Annotate.V1.Response deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         List list = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])NerAPI.Annotate.V1.Response.$childSerializers;
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
/*    */         return new NerAPI.Annotate.V1.Response(i, list, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull NerAPI.Annotate.V1.Response value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         NerAPI.Annotate.V1.Response.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.meta.NerAPI.Annotate.V1.Response", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("annotations", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/meta/NerAPI$Annotate$V1$Response;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<NerAPI.Annotate.V1.Response> serializer() {
/*    */         return (KSerializer<NerAPI.Annotate.V1.Response>)NerAPI.Annotate.V1.Response.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<SentenceWithNERAnnotations> getAnnotations() {
/*    */       return this.annotations;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<SentenceWithNERAnnotations> component1() {
/*    */       return this.annotations;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Response copy(@NotNull List<SentenceWithNERAnnotations> annotations) {
/*    */       Intrinsics.checkNotNullParameter(annotations, "annotations");
/*    */       return new Response(annotations);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Response(annotations=" + this.annotations + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.annotations.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Response))
/*    */         return false; 
/*    */       Response response = (Response)other;
/*    */       return !!Intrinsics.areEqual(this.annotations, response.annotations);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\meta\NerAPI$Annotate$V1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */