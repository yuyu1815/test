/*    */ package ai.grazie.user.cfg.model.proxy;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\007\030\000*\b\b\000\020\001*\0020\0022\0020\002B\035\b\000\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\002\020\007J\025\020\f\032\004\030\0018\0002\006\020\r\032\0020\016¢\006\002\020\017J\033\020\020\032\0020\0162\006\020\021\032\0028\0002\006\020\r\032\0020\016¢\006\002\020\022J\020\020\023\032\004\030\0010\0242\006\020\r\032\0020\016R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\b\020\tR\027\020\005\032\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "T", "", "key", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "serializer", "Lkotlinx/serialization/KSerializer;", "(Lai/grazie/utils/attributes/Attributes$Key$Json;Lkotlinx/serialization/KSerializer;)V", "getKey", "()Lai/grazie/utils/attributes/Attributes$Key$Json;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "get", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Object;", "set", "value", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes;)Lai/grazie/utils/attributes/Attributes;", "time", "Lai/grazie/utils/mpp/time/Timestamp;", "user-cfg-model"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeCustomProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeCustomProxy.kt\nai/grazie/user/cfg/model/proxy/AttributeCustomProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/*    */ public final class AttributeCustomProxy<T> {
/*    */   @NotNull
/*    */   private final Attributes.Key.Json key;
/*    */   
/* 10 */   public AttributeCustomProxy(@NotNull Attributes.Key.Json key, @NotNull KSerializer<T> serializer) { this.key = key; this.serializer = serializer; } @NotNull private final KSerializer<T> serializer; @NotNull public final Attributes.Key.Json getKey() { return this.key; } @NotNull public final KSerializer<T> getSerializer() { return this.serializer; } @Nullable
/*    */   public final T get(@NotNull Attributes attributes) {
/* 12 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); String it = attributes.getJson(this.key).getValue();
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
/* 25 */     int $i$a$-let-AttributeCustomProxy$get$1 = 0;
/*    */     attributes.getJson(this.key).getValue();
/*    */     return (attributes.getJson(this.key) != null && attributes.getJson(this.key).getValue() != null) ? (T)JSON.Default.INSTANCE.parse((DeserializationStrategy)this.serializer, it) : null;
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\proxy\AttributeCustomProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */