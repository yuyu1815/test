/*    */ package ai.grazie.api.gateway.api;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\023B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\024"}, d2 = {"Lai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers$Request;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "api-gateway-api"})
/*    */ @SourceDebugExtension({"SMAP\nEnterpriseQuotaAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterpriseQuotaAPI.kt\nai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,17:1\n19#2,2:18\n19#2,2:20\n*S KotlinDebug\n*F\n+ 1 EnterpriseQuotaAPI.kt\nai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers\n*L\n8#1:18,2\n9#1:20,2\n*E\n"})
/*    */ public final class UpdateMembers implements TypedApi<EnterpriseQuotaAPI.UpdateMembers.Request, Unit> {
/*    */   @NotNull
/*  8 */   public static final UpdateMembers INSTANCE = new UpdateMembers(); @NotNull private static final TypeInfo<Request> requestType; @NotNull private static final TypeInfo<Unit> responseType; @NotNull public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 19 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 20 */     kType$iv = Reflection.typeOf(Unit.class);
/* 21 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public TypeInfo<Unit> getResponseType() {
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
/*    */   private static final String path = "/quota/enterprise/update-members";
/*    */   
/*    */   @NotNull
/*    */   public String getPath() {
/*    */     return path;
/*    */   }
/*    */   
/*    */   @Serializable
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0352\0020\001:\002\034\035B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\023\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\017\020\r\032\b\022\004\022\0020\0060\005HÆ\003J\031\020\016\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\006HÖ\001J&\020\024\032\0020\0252\006\020\026\032\0020\0002\006\020\027\032\0020\0302\006\020\031\032\0020\032HÁ\001¢\006\002\b\033R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\036"}, d2 = {"Lai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers$Request;", "", "seen1", "", "enabledUsers", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getEnabledUsers", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */   public static final class Request {
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final List<String> enabledUsers;
/*    */     @JvmField
/*    */     @NotNull
/*    */     private static final KSerializer<Object>[] $childSerializers;
/*    */     
/*    */     public Request(@NotNull List<String> enabledUsers) {
/*    */       this.enabledUsers = enabledUsers;
/*    */     }
/*    */     
/*    */     static {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*    */       arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/EnterpriseQuotaAPI.UpdateMembers.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"})
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
/*    */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])EnterpriseQuotaAPI.UpdateMembers.Request.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*    */         arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */         return (KSerializer<?>[])arrayOfKSerializer2;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public EnterpriseQuotaAPI.UpdateMembers.Request deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0;
/*    */         List list = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         KSerializer[] arrayOfKSerializer = (KSerializer[])EnterpriseQuotaAPI.UpdateMembers.Request.$childSerializers;
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
/*    */         return new EnterpriseQuotaAPI.UpdateMembers.Request(i, list, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull EnterpriseQuotaAPI.UpdateMembers.Request value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         EnterpriseQuotaAPI.UpdateMembers.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.EnterpriseQuotaAPI.UpdateMembers.Request", INSTANCE, 1);
/*    */         pluginGeneratedSerialDescriptor.addElement("enabledUsers", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/EnterpriseQuotaAPI$UpdateMembers$Request;", "api-gateway-api"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<EnterpriseQuotaAPI.UpdateMembers.Request> serializer() {
/*    */         return (KSerializer<EnterpriseQuotaAPI.UpdateMembers.Request>)EnterpriseQuotaAPI.UpdateMembers.Request.$serializer.INSTANCE;
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> getEnabledUsers() {
/*    */       return this.enabledUsers;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<String> component1() {
/*    */       return this.enabledUsers;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Request copy(@NotNull List<String> enabledUsers) {
/*    */       Intrinsics.checkNotNullParameter(enabledUsers, "enabledUsers");
/*    */       return new Request(enabledUsers);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Request(enabledUsers=" + this.enabledUsers + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.enabledUsers.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Request))
/*    */         return false; 
/*    */       Request request = (Request)other;
/*    */       return !!Intrinsics.areEqual(this.enabledUsers, request.enabledUsers);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\EnterpriseQuotaAPI$UpdateMembers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */