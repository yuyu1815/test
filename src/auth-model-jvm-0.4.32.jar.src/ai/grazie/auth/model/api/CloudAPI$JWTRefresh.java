/*    */ package ai.grazie.auth.model.api;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh;", "", "()V", "V1", "V2", "V3", "auth-model"})
/*    */ public final class JWTRefresh {
/*    */   @NotNull
/*    */   public static final JWTRefresh INSTANCE = new JWTRefresh();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\023\024B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\025"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Request;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "auth-model"})
/*    */   @SourceDebugExtension({"SMAP\nCloudAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudAPI.kt\nai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,76:1\n19#2,2:77\n19#2,2:79\n*S KotlinDebug\n*F\n+ 1 CloudAPI.kt\nai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1\n*L\n10#1:77,2\n11#1:79,2\n*E\n"})
/*    */   public static final class V1 implements TypedApi<V1.Request, V1.Response> {
/*    */     @NotNull
/* 10 */     public static final V1 INSTANCE = new V1(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 77 */       KType kType$iv = Reflection.typeOf(Request.class);
/* 78 */       requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 79 */       kType$iv = Reflection.typeOf(Response.class);
/* 80 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
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
/*    */     private static final String path = "/cloud/jwt/refresh";
/*    */     
/*    */     @NotNull
/*    */     public String getPath() {
/*    */       return path;
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0342\0020\001:\002\033\034B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\005HÖ\001J&\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031HÁ\001¢\006\002\b\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Request;", "", "seen1", "", "token", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*    */     public static final class Request {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       @NotNull
/*    */       private final String token;
/*    */       
/*    */       public Request(@NotNull String token) {
/*    */         this.token = token;
/*    */       }
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/api/CloudAPI.JWTRefresh.V1.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
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
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */           arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public CloudAPI.JWTRefresh.V1.Request deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0;
/*    */           String str = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */             i |= 0x1;
/*    */           } else {
/*    */             while (bool) {
/*    */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (j) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(j);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new CloudAPI.JWTRefresh.V1.Request(i, str, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull CloudAPI.JWTRefresh.V1.Request value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           CloudAPI.JWTRefresh.V1.Request.write$Self$auth_model(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.api.CloudAPI.JWTRefresh.V1.Request", INSTANCE, 1);
/*    */           pluginGeneratedSerialDescriptor.addElement("token", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Request;", "auth-model"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<CloudAPI.JWTRefresh.V1.Request> serializer() {
/*    */           return (KSerializer<CloudAPI.JWTRefresh.V1.Request>)CloudAPI.JWTRefresh.V1.Request.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getToken() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String component1() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Request copy(@NotNull String token) {
/*    */         Intrinsics.checkNotNullParameter(token, "token");
/*    */         return new Request(token);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Request(token=" + this.token + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.token.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Request))
/*    */           return false; 
/*    */         Request request = (Request)other;
/*    */         return !!Intrinsics.areEqual(this.token, request.token);
/*    */       }
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0342\0020\001:\002\033\034B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\005HÖ\001J&\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031HÁ\001¢\006\002\b\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Response;", "", "seen1", "", "token", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*    */     public static final class Response {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       @NotNull
/*    */       private final String token;
/*    */       
/*    */       public Response(@NotNull String token) {
/*    */         this.token = token;
/*    */       }
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/api/CloudAPI.JWTRefresh.V1.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
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
/*    */           arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public CloudAPI.JWTRefresh.V1.Response deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0;
/*    */           String str = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */             i |= 0x1;
/*    */           } else {
/*    */             while (bool) {
/*    */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (j) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(j);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new CloudAPI.JWTRefresh.V1.Response(i, str, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull CloudAPI.JWTRefresh.V1.Response value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           CloudAPI.JWTRefresh.V1.Response.write$Self$auth_model(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.api.CloudAPI.JWTRefresh.V1.Response", INSTANCE, 1);
/*    */           pluginGeneratedSerialDescriptor.addElement("token", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V1$Response;", "auth-model"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<CloudAPI.JWTRefresh.V1.Response> serializer() {
/*    */           return (KSerializer<CloudAPI.JWTRefresh.V1.Response>)CloudAPI.JWTRefresh.V1.Response.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getToken() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String component1() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Response copy(@NotNull String token) {
/*    */         Intrinsics.checkNotNullParameter(token, "token");
/*    */         return new Response(token);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Response(token=" + this.token + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.token.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Response))
/*    */           return false; 
/*    */         Response response = (Response)other;
/*    */         return !!Intrinsics.areEqual(this.token, response.token);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "auth-model"})
/*    */   @SourceDebugExtension({"SMAP\nCloudAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudAPI.kt\nai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,76:1\n19#2,2:77\n*S KotlinDebug\n*F\n+ 1 CloudAPI.kt\nai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2\n*L\n23#1:77,2\n*E\n"})
/*    */   public static final class V2 implements UnitTypedApi<V2.Response> {
/*    */     @NotNull
/*    */     public static final V2 INSTANCE = new V2();
/*    */     @NotNull
/*    */     private static final TypeInfo<Response> responseType;
/*    */     
/*    */     @NotNull
/*    */     public TypeInfo<Response> getResponseType() {
/*    */       return responseType;
/*    */     }
/*    */     
/*    */     static {
/*    */       int $i$f$typeInfo = 0;
/*    */       KType kType$iv = Reflection.typeOf(Response.class);
/*    */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class));
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
/*    */     private static final String path = "/cloud/jwt/refresh";
/*    */     
/*    */     @NotNull
/*    */     public String getPath() {
/*    */       return path;
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0342\0020\001:\002\033\034B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\005HÖ\001J&\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031HÁ\001¢\006\002\b\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2$Response;", "", "seen1", "", "token", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*    */     public static final class Response {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       @NotNull
/*    */       private final String token;
/*    */       
/*    */       public Response(@NotNull String token) {
/*    */         this.token = token;
/*    */       }
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/api/CloudAPI.JWTRefresh.V2.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
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
/*    */           arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public CloudAPI.JWTRefresh.V2.Response deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0;
/*    */           String str = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */             i |= 0x1;
/*    */           } else {
/*    */             while (bool) {
/*    */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (j) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(j);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new CloudAPI.JWTRefresh.V2.Response(i, str, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull CloudAPI.JWTRefresh.V2.Response value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           CloudAPI.JWTRefresh.V2.Response.write$Self$auth_model(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.api.CloudAPI.JWTRefresh.V2.Response", INSTANCE, 1);
/*    */           pluginGeneratedSerialDescriptor.addElement("token", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V2$Response;", "auth-model"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<CloudAPI.JWTRefresh.V2.Response> serializer() {
/*    */           return (KSerializer<CloudAPI.JWTRefresh.V2.Response>)CloudAPI.JWTRefresh.V2.Response.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getToken() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String component1() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Response copy(@NotNull String token) {
/*    */         Intrinsics.checkNotNullParameter(token, "token");
/*    */         return new Response(token);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Response(token=" + this.token + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.token.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Response))
/*    */           return false; 
/*    */         Response response = (Response)other;
/*    */         return !!Intrinsics.areEqual(this.token, response.token);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\bÆ\002\030\0002\b\022\004\022\0020\0020\001:\001\020B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3;", "Lai/grazie/model/cloud/UnitTypedApi;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "Response", "auth-model"})
/*    */   @SourceDebugExtension({"SMAP\nCloudAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudAPI.kt\nai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,76:1\n19#2,2:77\n*S KotlinDebug\n*F\n+ 1 CloudAPI.kt\nai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3\n*L\n32#1:77,2\n*E\n"})
/*    */   public static final class V3 implements UnitTypedApi<V3.Response> {
/*    */     @NotNull
/*    */     public static final V3 INSTANCE = new V3();
/*    */     @NotNull
/*    */     private static final TypeInfo<Response> responseType;
/*    */     
/*    */     @NotNull
/*    */     public TypeInfo<Response> getResponseType() {
/*    */       return responseType;
/*    */     }
/*    */     
/*    */     static {
/*    */       int $i$f$typeInfo = 0;
/*    */       KType kType$iv = Reflection.typeOf(Response.class);
/*    */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class));
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
/*    */     private static final String path = "/cloud/jwt/refresh/v3";
/*    */     
/*    */     @NotNull
/*    */     public String getPath() {
/*    */       return path;
/*    */     }
/*    */     
/*    */     @Serializable
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0342\0020\001:\002\033\034B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\005HÖ\001J&\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031HÁ\001¢\006\002\b\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\035"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3$Response;", "", "seen1", "", "token", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*    */     public static final class Response {
/*    */       @NotNull
/*    */       public static final Companion Companion = new Companion(null);
/*    */       @NotNull
/*    */       private final String token;
/*    */       
/*    */       public Response(@NotNull String token) {
/*    */         this.token = token;
/*    */       }
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/api/CloudAPI.JWTRefresh.V3.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
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
/*    */           arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public CloudAPI.JWTRefresh.V3.Response deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0;
/*    */           String str = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */             i |= 0x1;
/*    */           } else {
/*    */             while (bool) {
/*    */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (j) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(j);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new CloudAPI.JWTRefresh.V3.Response(i, str, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull CloudAPI.JWTRefresh.V3.Response value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           CloudAPI.JWTRefresh.V3.Response.write$Self$auth_model(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.api.CloudAPI.JWTRefresh.V3.Response", INSTANCE, 1);
/*    */           pluginGeneratedSerialDescriptor.addElement("token", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/api/CloudAPI$JWTRefresh$V3$Response;", "auth-model"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<CloudAPI.JWTRefresh.V3.Response> serializer() {
/*    */           return (KSerializer<CloudAPI.JWTRefresh.V3.Response>)CloudAPI.JWTRefresh.V3.Response.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String getToken() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final String component1() {
/*    */         return this.token;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Response copy(@NotNull String token) {
/*    */         Intrinsics.checkNotNullParameter(token, "token");
/*    */         return new Response(token);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "Response(token=" + this.token + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         return this.token.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof Response))
/*    */           return false; 
/*    */         Response response = (Response)other;
/*    */         return !!Intrinsics.areEqual(this.token, response.token);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\api\CloudAPI$JWTRefresh.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */