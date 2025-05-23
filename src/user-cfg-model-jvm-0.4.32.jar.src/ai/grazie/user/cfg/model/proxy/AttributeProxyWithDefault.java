/*    */ package ai.grazie.user.cfg.model.proxy;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\007\030\000*\004\b\000\020\0012\0020\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0028\000¢\006\002\020\006J\023\020\f\032\0028\0002\006\020\r\032\0020\016¢\006\002\020\017J\033\020\020\032\0020\0162\006\020\021\032\0028\0002\006\020\r\032\0020\016¢\006\002\020\022J\020\020\023\032\004\030\0010\0242\006\020\r\032\0020\016R\023\020\005\032\0028\000¢\006\n\n\002\020\t\032\004\b\007\020\bR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lai/grazie/user/cfg/model/proxy/AttributeProxyWithDefault;", "T", "", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "default", "(Lai/grazie/utils/attributes/Attributes$Key;Ljava/lang/Object;)V", "getDefault", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getKey", "()Lai/grazie/utils/attributes/Attributes$Key;", "get", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Object;", "set", "value", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes;)Lai/grazie/utils/attributes/Attributes;", "time", "Lai/grazie/utils/mpp/time/Timestamp;", "user-cfg-model"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeProxyWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeProxyWithDefault.kt\nai/grazie/user/cfg/model/proxy/AttributeProxyWithDefault\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
/*    */ public final class AttributeProxyWithDefault<T> {
/*    */   @NotNull
/*    */   private final Attributes.Key key;
/*    */   
/*  8 */   public AttributeProxyWithDefault(@NotNull Attributes.Key key, Object default) { this.key = key; this.default = (T)default; } private final T default; @NotNull public final Attributes.Key getKey() { return this.key; } public final T getDefault() { return this.default; }
/*    */    public final T get(@NotNull Attributes attributes) {
/* 10 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); if (attributes.get(this.key) != null) { Attributes.Value it = attributes.get(this.key);
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
/* 23 */       int $i$a$-let-AttributeProxyWithDefault$get$1 = 0;
/*    */       if (Attributes.Companion.unwrap(this.key, it) == null) {
/*    */         Attributes.Companion.unwrap(this.key, it);
/*    */         return this.default;
/*    */       } 
/*    */       return (T)Attributes.Companion.unwrap(this.key, it); }
/*    */     
/*    */     Attributes.Companion.unwrap(this.key, it);
/*    */     return this.default;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Timestamp time(@NotNull Attributes attributes) {
/*    */     Intrinsics.checkNotNullParameter(attributes, "attributes");
/*    */     attributes.get(this.key);
/*    */     return (attributes.get(this.key) != null) ? attributes.get(this.key).getModified() : null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Attributes set(Object value, @NotNull Attributes attributes) {
/*    */     Intrinsics.checkNotNullParameter(attributes, "attributes");
/*    */     return attributes.put(this.key, Attributes.Companion.wrap(value, this.key));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\proxy\AttributeProxyWithDefault.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */