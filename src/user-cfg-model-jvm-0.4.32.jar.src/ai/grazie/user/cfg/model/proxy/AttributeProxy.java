/*    */ package ai.grazie.user.cfg.model.proxy;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\007\030\000*\004\b\000\020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\025\020\b\032\004\030\0018\0002\006\020\t\032\0020\n¢\006\002\020\013J\033\020\f\032\0020\n2\006\020\r\032\0028\0002\006\020\t\032\0020\n¢\006\002\020\016J\020\020\017\032\004\030\0010\0202\006\020\t\032\0020\nR\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lai/grazie/user/cfg/model/proxy/AttributeProxy;", "T", "", "key", "Lai/grazie/utils/attributes/Attributes$Key;", "(Lai/grazie/utils/attributes/Attributes$Key;)V", "getKey", "()Lai/grazie/utils/attributes/Attributes$Key;", "get", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Object;", "set", "value", "(Ljava/lang/Object;Lai/grazie/utils/attributes/Attributes;)Lai/grazie/utils/attributes/Attributes;", "time", "Lai/grazie/utils/mpp/time/Timestamp;", "user-cfg-model"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeProxy.kt\nai/grazie/user/cfg/model/proxy/AttributeProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/*    */ public final class AttributeProxy<T> {
/*  8 */   public AttributeProxy(@NotNull Attributes.Key key) { this.key = key; } @NotNull private final Attributes.Key key; @NotNull public final Attributes.Key getKey() { return this.key; } @Nullable
/*    */   public final T get(@NotNull Attributes attributes) {
/* 10 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); Attributes.Value it = attributes.get(this.key);
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
/* 25 */     int $i$a$-let-AttributeProxy$get$1 = 0;
/*    */     attributes.get(this.key);
/*    */     return (attributes.get(this.key) != null) ? (T)Attributes.Companion.unwrap(this.key, it) : null;
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\proxy\AttributeProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */