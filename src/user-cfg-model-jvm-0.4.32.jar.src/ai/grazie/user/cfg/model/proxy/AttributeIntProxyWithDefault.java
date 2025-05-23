/*    */ package ai.grazie.user.cfg.model.proxy;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\007\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\016\020\013\032\0020\0052\006\020\f\032\0020\rJ\026\020\016\032\0020\r2\006\020\017\032\0020\0052\006\020\f\032\0020\rJ\020\020\020\032\004\030\0010\0212\006\020\f\032\0020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\022"}, d2 = {"Lai/grazie/user/cfg/model/proxy/AttributeIntProxyWithDefault;", "", "key", "Lai/grazie/utils/attributes/Attributes$Key$Double;", "default", "", "(Lai/grazie/utils/attributes/Attributes$Key$Double;I)V", "getDefault", "()I", "getKey", "()Lai/grazie/utils/attributes/Attributes$Key$Double;", "get", "attributes", "Lai/grazie/utils/attributes/Attributes;", "set", "value", "time", "Lai/grazie/utils/mpp/time/Timestamp;", "user-cfg-model"})
/*    */ public final class AttributeIntProxyWithDefault {
/*    */   @NotNull
/*    */   private final Attributes.Key.Double key;
/*    */   
/*  8 */   public AttributeIntProxyWithDefault(@NotNull Attributes.Key.Double key, int default) { this.key = key; this.default = default; } private final int default; @NotNull public final Attributes.Key.Double getKey() { return this.key; } public final int getDefault() { return this.default; }
/*    */    public final int get(@NotNull Attributes attributes) {
/* 10 */     Intrinsics.checkNotNullParameter(attributes, "attributes"); attributes.getDouble(this.key); return (attributes.getDouble(this.key) != null) ? (int)attributes.getDouble(this.key).getValue().doubleValue() : this.default;
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-cfg-model-jvm-0.4.32.jar!\ai\grazi\\user\cfg\model\proxy\AttributeIntProxyWithDefault.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */