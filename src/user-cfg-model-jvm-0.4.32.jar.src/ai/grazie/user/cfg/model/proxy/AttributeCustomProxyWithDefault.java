/*    */ package ai.grazie.user.cfg.model.proxy;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\007\030\000*\b\b\000\020\001*\0020\0022\0020\002B%\b\000\022\006\020\003\032\0020\004\022\006\020\005\032\0028\000\022\f\020\006\032\b\022\004\022\0028\0000\007¢\006\002\020\bJ\023\020\020\032\0028\0002\006\020\021\032\0020\022¢\006\002\020\023J\033\020\024\032\0020\0222\006\020\025\032\0028\0002\006\020\021\032\0020\022¢\006\002\020\026J\020\020\027\032\004\030\0010\0302\006\020\021\032\0020\022R\023\020\005\032\0028\000¢\006\n\n\002\020\013\032\004\b\t\020\nR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\f\020\rR\027\020\006\032\b\022\004\022\0028\0000\007¢\006\b\n\000\032\004\b\016\020\017¨\006\031"}, d2 = {"Lai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault;", "T", "", "key", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "default", "serializer", "Lkotlinx/serialization/KSerializer;", "(Lai/grazie/utils/attributes/Attributes$Key$Json;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V", "getDefault", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getKey", "()Lai/grazie/utils/attributes/Attributes$Key$Json;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "get", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Object;", "set", "value", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes;)Lai/grazie/utils/attributes/Attributes;", "time", "Lai/grazie/utils/mpp/time/Timestamp;", "user-cfg-model"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeCustomProxyWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeCustomProxyWithDefault.kt\nai/grazie/user/cfg/model/proxy/AttributeCustomProxyWithDefault\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/*    */ public final class AttributeCustomProxyWithDefault<T> {
/*    */   @NotNull
/*    */   private final Attributes.Key.Json key;
/*    */   
/* 10 */   public AttributeCustomProxyWithDefault(@NotNull Attributes.Key.Json key, @NotNull Object default, @NotNull KSerializer<T> serializer) { this.key = key; this.default = (T)default; this.serializer = serializer; } @NotNull private final T default; @NotNull private final KSerializer<T> serializer; @NotNull public final Attributes.Key.Json getKey() { return this.key; } @NotNull public final T getDefault() { return this.default; } @NotNull public final KSerializer<T> getSerializer() { return this.serializer; } @NotNull
/*    */   public final T get(@NotNull Attributes attributes) {
/* 12 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); if (attributes.getJson(this.key) != null && attributes.getJson(this.key).getValue() != null) { String it = attributes.getJson(this.key).getValue();
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
/* 25 */       int $i$a$-let-AttributeCustomProxyWithDefault$get$1 = 0;
/*    */       if (JSON.Default.INSTANCE.parse((DeserializationStrategy)this.serializer, it) == null) {
/*    */         JSON.Default.INSTANCE.parse((DeserializationStrategy)this.serializer, it);
/*    */         return this.default;
/*    */       } 
/*    */       return (T)JSON.Default.INSTANCE.parse((DeserializationStrategy)this.serializer, it); }
/*    */     
/*    */     JSON.Default.INSTANCE.parse((DeserializationStrategy)this.serializer, it);
/*    */     return this.default;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Timestamp time(@NotNull Attributes attributes) {
/*    */     Intrinsics.checkNotNullParameter(attributes, "attributes");
/*    */     attributes.get((Attributes.Key)this.key);
/*    */     return (attributes.get((Attributes.Key)this.key) != null) ? attributes.get((Attributes.Key)this.key).getModified() : null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes set(@NotNull Object value, @NotNull Attributes attributes) {
/*    */     Intrinsics.checkNotNullParameter(value, "value");
/*    */     Intrinsics.checkNotNullParameter(attributes, "attributes");
/*    */     return attributes.put((Attributes.Key)this.key, (Attributes.Value)new Attributes.Value.Json(JSON.Default.INSTANCE.string((SerializationStrategy)this.serializer, value), null, 2, null));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\proxy\AttributeCustomProxyWithDefault.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */