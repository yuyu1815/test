/*    */ package ai.grazie.auth.model.api;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\007\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\002\025\026B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\nXD¢\006\b\n\000\032\004\b\016\020\fR\032\020\017\032\b\022\004\022\0020\0020\020X\004¢\006\b\n\000\032\004\b\021\020\022R\032\020\023\032\b\022\004\022\0020\0030\020X\004¢\006\b\n\000\032\004\b\024\020\022¨\006\027"}, d2 = {"Lai/grazie/auth/model/api/AttributeAPI$Store;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/auth/model/api/AttributeAPI$Store$Request;", "Lai/grazie/auth/model/api/AttributeAPI$Store$Response;", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "prefix", "getPrefix", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "Response", "auth-model"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeAPI.kt\nai/grazie/auth/model/api/AttributeAPI$Store\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,52:1\n19#2,2:53\n19#2,2:55\n*S KotlinDebug\n*F\n+ 1 AttributeAPI.kt\nai/grazie/auth/model/api/AttributeAPI$Store\n*L\n11#1:53,2\n12#1:55,2\n*E\n"})
/*    */ public final class Store implements TypedApi<AttributeAPI.Store.Request, AttributeAPI.Store.Response> {
/*    */   @NotNull
/* 11 */   public static final Store INSTANCE = new Store(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Response> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 53 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 54 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 55 */     kType$iv = Reflection.typeOf(Response.class);
/* 56 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Response.class)); }
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
/*    */   private static final String prefix = "/api/user";
/*    */   
/*    */   @NotNull
/*    */   public String getPrefix() {
/*    */     return prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final String path = "/attribute/store";
/*    */   
/*    */   @NotNull
/*    */   public String getPath() {
/*    */     return path;
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B#\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\r\022\006\020\004\032\0020\005¢\006\002\020\tJ\t\020\f\032\0020\005HÆ\003J\023\020\r\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\003HÖ\001J\t\020\022\032\0020\023HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\036"}, d2 = {"Lai/grazie/auth/model/api/AttributeAPI$Store$Request;", "", "seen1", "", "attributes", "Lai/grazie/utils/attributes/Attributes;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/attributes/Attributes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/attributes/Attributes;)V", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*    */   public static final class Request {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final Attributes attributes;
/*    */     
/*    */     public Request(@NotNull Attributes attributes) {
/*    */       this.attributes = attributes;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/api/AttributeAPI.Store.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/api/AttributeAPI$Store$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
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
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */         arrayOfKSerializer[0] = (KSerializer)Attributes$.serializer.INSTANCE;
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public AttributeAPI.Store.Request deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         Attributes attributes = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*    */           i |= 0x1;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 attributes = (Attributes)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Attributes$.serializer.INSTANCE, attributes);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new AttributeAPI.Store.Request(i, attributes, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull AttributeAPI.Store.Request value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         AttributeAPI.Store.Request.write$Self$auth_model(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.api.AttributeAPI.Store.Request", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("attributes", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/AttributeAPI$Store$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/api/AttributeAPI$Store$Request;", "auth-model"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AttributeAPI.Store.Request> serializer() {
/*    */         return (KSerializer<AttributeAPI.Store.Request>)AttributeAPI.Store.Request.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Attributes getAttributes() {
/*    */       return this.attributes;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Attributes component1() {
/*    */       return this.attributes;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull Attributes attributes) {
/*    */       Intrinsics.checkNotNullParameter(attributes, "attributes");
/*    */       return new Request(attributes);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(attributes=" + this.attributes + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.attributes.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return !!Intrinsics.areEqual(this.attributes, request.attributes);
/*    */     }
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\"\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\037"}, d2 = {"Lai/grazie/auth/model/api/AttributeAPI$Store$Response;", "", "seen1", "", "keys", "", "Lai/grazie/utils/attributes/Attributes$Key;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Set;)V", "getKeys", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_model", "$serializer", "Companion", "auth-model"})
/*    */   public static final class Response {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final Set<Attributes.Key> keys;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Response(@NotNull Set<Attributes.Key> keys) {
/*    */       this.keys = keys;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */       arrayOfKSerializer[0] = (KSerializer)new LinkedHashSetSerializer(Attributes.Key.Companion.serializer());
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/auth/model/api/AttributeAPI.Store.Response.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/auth/model/api/AttributeAPI$Store$Response;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "auth-model"})
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
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])AttributeAPI.Store.Response.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public AttributeAPI.Store.Response deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         Set set = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])AttributeAPI.Store.Response.$childSerializers;
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], set);
/*    */           i |= 0x1;
/*    */         } else {
/*    */           while (bool) {
/*    */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (j) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 set = (Set)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], set);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(j);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new AttributeAPI.Store.Response(i, set, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull AttributeAPI.Store.Response value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         AttributeAPI.Store.Response.write$Self$auth_model(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.auth.model.api.AttributeAPI.Store.Response", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("keys", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/AttributeAPI$Store$Response$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/api/AttributeAPI$Store$Response;", "auth-model"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<AttributeAPI.Store.Response> serializer() {
/*    */         return (KSerializer<AttributeAPI.Store.Response>)AttributeAPI.Store.Response.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Set<Attributes.Key> getKeys() {
/*    */       return this.keys;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Set<Attributes.Key> component1() {
/*    */       return this.keys;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Response copy(@NotNull Set<? extends Attributes.Key> keys) {
/*    */       Intrinsics.checkNotNullParameter(keys, "keys");
/*    */       return new Response(keys);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Response(keys=" + this.keys + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.keys.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Response))
/*    */         return false; 
/*    */       Response response = (Response)other;
/*    */       return !!Intrinsics.areEqual(this.keys, response.keys);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\api\AttributeAPI$Store.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */