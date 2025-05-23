/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\030\0002\0020\001:\001\022B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\004\b\t\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\023\020\006\032\0020\007¢\006\n\n\002\020\020\032\004\b\017\020\fR\023\020\b\032\0020\007¢\006\n\n\002\020\020\032\004\b\021\020\f¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement;", "", "name", "", "document", "Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "documentUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/RegionUrl;", "acceptableUsePolicyUrl", "<init>", "(Ljava/lang/String;Lcom/intellij/ide/gdpr/EndUserAgreement$Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getDocument", "()Lcom/intellij/ide/gdpr/EndUserAgreement$Document;", "getDocumentUrl-VLHUAj8", "Ljava/lang/String;", "getAcceptableUsePolicyUrl-VLHUAj8", "Version", "data.model"})
/*    */ public final class AipLicenseAgreement { @NotNull
/*    */   private final String name; @NotNull
/*    */   private final EndUserAgreement.Document document; @NotNull
/*    */   private final String documentUrl; @NotNull
/*  6 */   private final String acceptableUsePolicyUrl; private AipLicenseAgreement(String name, EndUserAgreement.Document document, String documentUrl, String acceptableUsePolicyUrl) { this.name = name;
/*  7 */     this.document = document;
/*  8 */     this.documentUrl = documentUrl;
/*  9 */     this.acceptableUsePolicyUrl = acceptableUsePolicyUrl; } @NotNull public final String getName() { return this.name; } @NotNull public final String getAcceptableUsePolicyUrl-VLHUAj8() { return this.acceptableUsePolicyUrl; } @NotNull
/*    */   public final EndUserAgreement.Document getDocument() { return this.document; } @NotNull
/*    */   public final String getDocumentUrl-VLHUAj8() { return this.documentUrl; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\007\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\004\b\b\030\000 \0232\0020\001:\001\023B\031\b\002\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\b\020\n\032\0020\013H\026J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÂ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;", "", "major", "", "minor", "<init>", "(II)V", "getMajor", "()I", "getMinor", "toString", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "Companion", "data.model"})
/*    */   public static final class Version
/*    */   {
/* 14 */     private Version(int major, int minor) { this.major = major; this.minor = minor; } public final int getMajor() { return this.major; } public final int getMinor() { return this.minor; } @NotNull
/* 15 */     public String toString() { return Intrinsics.areEqual(this, Unknown) ? "Unknown" : ("" + this.major + "." + this.major); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\nR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version$Companion;", "", "<init>", "()V", "Unknown", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;", "getUnknown", "()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseAgreement$Version;", "of", "major", "", "minor", "data.model"})
/*    */     public static final class Companion { private Companion() {}
/*    */       @NotNull
/* 18 */       public final AipLicenseAgreement.Version getUnknown() { return AipLicenseAgreement.Version.Unknown; } @NotNull
/* 19 */       public final AipLicenseAgreement.Version of(int major, int minor) { return (major < 0 || minor < 0) ? getUnknown() : new AipLicenseAgreement.Version(major, minor, null); }
/*    */        }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public static final Companion Companion = new Companion(null);
/*    */     private final int major;
/*    */     private final int minor;
/*    */     @NotNull
/*    */     private static final Version Unknown = new Version(-1, -1);
/*    */     
/*    */     public final int component1() {
/*    */       return this.major;
/*    */     }
/*    */     
/*    */     public final int component2() {
/*    */       return this.minor;
/*    */     }
/*    */     
/*    */     private final Version copy(int major, int minor) {
/*    */       return new Version(major, minor);
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = Integer.hashCode(this.major);
/*    */       return result * 31 + Integer.hashCode(this.minor);
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Version))
/*    */         return false; 
/*    */       Version version = (Version)other;
/*    */       return (this.major != version.major) ? false : (!(this.minor != version.minor));
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\AipLicenseAgreement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */