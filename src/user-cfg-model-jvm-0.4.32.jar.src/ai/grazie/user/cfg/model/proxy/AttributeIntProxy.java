/*    */ package ai.grazie.user.cfg.model.proxy;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\025\020\007\032\004\030\0010\b2\006\020\t\032\0020\n¢\006\002\020\013J\026\020\f\032\0020\n2\006\020\r\032\0020\b2\006\020\t\032\0020\nJ\020\020\016\032\004\030\0010\0172\006\020\t\032\0020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/user/cfg/model/proxy/AttributeIntProxy;", "", "key", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "(Lai/grazie/utils/attributes/Attributes$Key$Double;)V", "getKey", "()Lai/grazie/utils/attributes/Attributes$Key$Double;", "get", "", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Integer;", "set", "value", "time", "Lai/grazie/utils/mpp/time/Timestamp;", "user-cfg-model"})
/*    */ public final class AttributeIntProxy {
/*  8 */   public AttributeIntProxy(@NotNull Attributes.Key.Double key) { this.key = key; } @NotNull private final Attributes.Key.Double key; @NotNull public final Attributes.Key.Double getKey() { return this.key; } @Nullable
/*    */   public final Integer get(@NotNull Attributes attributes) {
/* 10 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); attributes.getDouble(this.key); return (attributes.getDouble(this.key) != null) ? Integer.valueOf((int)attributes.getDouble(this.key).getValue().doubleValue()) : null;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Timestamp time(@NotNull Attributes attributes) {
/* 15 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); attributes.get((Attributes.Key)this.key); return (attributes.get((Attributes.Key)this.key) != null) ? attributes.get((Attributes.Key)this.key).getModified() : null;
/*    */   }
/*    */   @NotNull
/*    */   public final Attributes set(int value, @NotNull Attributes attributes) {
/* 19 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); return attributes.put((Attributes.Key)this.key, (Attributes.Value)new Attributes.Value.Double(value, null, 2, null));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\proxy\AttributeIntProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */