/*    */ package ai.grazie.license;
/*    */ @Serializable(with = LicenseID.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\004\b\b\030\000 \0172\0020\001:\002\017\020B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\001HÖ\003J\t\020\f\032\0020\rHÖ\001J\b\020\016\032\0020\003H\026R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/license/LicenseID;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Serializer", "model-license"})
/*    */ public final class LicenseID {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String id;
/*    */   
/* 10 */   public LicenseID(@NotNull String id) { this.id = id; } @NotNull public final String getId() { return this.id; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/LicenseID$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/LicenseID;", "model-license"}) public static final class Companion {
/* 11 */     private Companion() {} @NotNull public final KSerializer<LicenseID> serializer() { return (KSerializer<LicenseID>)LicenseID.Serializer.INSTANCE; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/license/LicenseID$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/license/LicenseID;", "()V", "model-license"}) public static final class Serializer extends StringValueClassSerializer<LicenseID> { private Serializer() { super("LicenseID", null.INSTANCE, null.INSTANCE); } @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); } @NotNull
/* 13 */   public String toString() { return this.id; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LicenseID copy(@NotNull String id) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     return new LicenseID(id);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.id.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LicenseID))
/*    */       return false; 
/*    */     LicenseID licenseID = (LicenseID)other;
/*    */     return !!Intrinsics.areEqual(this.id, licenseID.id);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\LicenseID.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */