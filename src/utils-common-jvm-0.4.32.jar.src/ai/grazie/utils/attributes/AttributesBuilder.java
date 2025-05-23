/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\003\n\002\020\006\n\000\n\002\020\b\n\002\b\002\n\002\020\t\n\002\b\f\b\007\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\026\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nJ\r\020\013\032\0020\003H\000¢\006\002\b\fJ\026\020\r\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\016J\026\020\017\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\020J\026\020\021\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bJ\026\020\022\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\023J\035\020\024\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\n¢\006\002\020\025J\035\020\026\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\016¢\006\002\020\027J\035\020\030\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\020¢\006\002\020\031J\030\020\032\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\bJ\035\020\033\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\023¢\006\002\020\034J\030\020\035\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\bJ\026\020\036\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\bR\016\020\002\032\0020\003X\016¢\006\002\n\000¨\006\037"}, d2 = {"Lai/grazie/utils/attributes/AttributesBuilder;", "", "attributes", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/utils/attributes/Attributes;)V", "bool", "", "fqdn", "", "value", "", "build", "build$utils_common", "double", "", "int", "", "json", "long", "", "optBool", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "optDouble", "(Ljava/lang/String;Ljava/lang/Double;)V", "optInt", "(Ljava/lang/String;Ljava/lang/Integer;)V", "optJson", "optLong", "(Ljava/lang/String;Ljava/lang/Long;)V", "optText", "text", "utils-common"})
/*    */ public final class AttributesBuilder {
/*  6 */   public AttributesBuilder(@NotNull Attributes attributes) { this.attributes = attributes; } @NotNull
/*    */   private Attributes attributes; public final void bool(@NotNull String fqdn, boolean value) {
/*  8 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); this.attributes = this.attributes.put(new Attributes.Key.Bool(fqdn), new Attributes.Value.Bool(value, null, 2, null));
/*    */   }
/*    */   
/*    */   public final void optBool(@NotNull String fqdn, @Nullable Boolean value) {
/* 12 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); if (value == null)
/* 13 */       return;  this.attributes = this.attributes.put(new Attributes.Key.Bool(fqdn), new Attributes.Value.Bool(value.booleanValue(), null, 2, null));
/*    */   }
/*    */   
/*    */   public final void int(@NotNull String fqdn, int value) {
/* 17 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); this.attributes = this.attributes.put(new Attributes.Key.Long(fqdn), new Attributes.Value.Long(value, null, 2, null));
/*    */   }
/*    */   
/*    */   public final void optInt(@NotNull String fqdn, @Nullable Integer value) {
/* 21 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); if (value == null)
/* 22 */       return;  this.attributes = this.attributes.put(new Attributes.Key.Long(fqdn), new Attributes.Value.Long(value.intValue(), null, 2, null));
/*    */   }
/*    */ 
/*    */   
/*    */   public final void long(@NotNull String fqdn, long value) {
/* 27 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); this.attributes = this.attributes.put(new Attributes.Key.Long(fqdn), new Attributes.Value.Long(value, null, 2, null));
/*    */   }
/*    */ 
/*    */   
/*    */   public final void optLong(@NotNull String fqdn, @Nullable Long value) {
/* 32 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); if (value == null)
/* 33 */       return;  this.attributes = this.attributes.put(new Attributes.Key.Long(fqdn), new Attributes.Value.Long(value.longValue(), null, 2, null));
/*    */   }
/*    */   
/*    */   public final void double(@NotNull String fqdn, double value) {
/* 37 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); this.attributes = this.attributes.put(new Attributes.Key.Double(fqdn), new Attributes.Value.Double(value, null, 2, null));
/*    */   }
/*    */   
/*    */   public final void optDouble(@NotNull String fqdn, @Nullable Double value) {
/* 41 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); if (value == null)
/* 42 */       return;  this.attributes = this.attributes.put(new Attributes.Key.Double(fqdn), new Attributes.Value.Double(value.doubleValue(), null, 2, null));
/*    */   }
/*    */   
/*    */   public final void text(@NotNull String fqdn, @NotNull String value) {
/* 46 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); Intrinsics.checkNotNullParameter(value, "value"); this.attributes = this.attributes.put(new Attributes.Key.Text(fqdn, null, 2, null), new Attributes.Value.Text(value, null, 2, null));
/*    */   }
/*    */   
/*    */   public final void optText(@NotNull String fqdn, @Nullable String value) {
/* 50 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); if (value == null)
/* 51 */       return;  this.attributes = this.attributes.put(new Attributes.Key.Text(fqdn, null, 2, null), new Attributes.Value.Text(value, null, 2, null));
/*    */   }
/*    */   
/*    */   public final void json(@NotNull String fqdn, @NotNull String value) {
/* 55 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); Intrinsics.checkNotNullParameter(value, "value"); this.attributes = this.attributes.put(new Attributes.Key.Json(fqdn, null, 2, null), new Attributes.Value.Json(value, null, 2, null));
/*    */   }
/*    */   
/*    */   public final void optJson(@NotNull String fqdn, @Nullable String value) {
/* 59 */     Intrinsics.checkNotNullParameter(fqdn, "fqdn"); if (value == null)
/* 60 */       return;  this.attributes = this.attributes.put(new Attributes.Key.Json(fqdn, null, 2, null), new Attributes.Value.Json(value, null, 2, null));
/*    */   } @NotNull
/*    */   public final Attributes build$utils_common() {
/* 63 */     return this.attributes;
/*    */   }
/*    */   
/*    */   public AttributesBuilder() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\AttributesBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */