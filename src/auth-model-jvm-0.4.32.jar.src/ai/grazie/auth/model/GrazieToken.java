/*    */ package ai.grazie.auth.model;
/*    */ import ai.grazie.utils.jwt.JWTToken;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\b\027\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\026\020\005\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\007\020\bR\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/auth/model/GrazieToken;", "", "token", "Lai/grazie/utils/jwt/JWTToken;", "(Lai/grazie/utils/jwt/JWTToken;)V", "license", "Lai/grazie/license/LicenseID;", "getLicense", "()Lai/grazie/license/LicenseID;", "licenseType", "Lai/grazie/license/LicenseType;", "getLicenseType", "()Lai/grazie/license/LicenseType;", "getToken", "()Lai/grazie/utils/jwt/JWTToken;", "auth-model"})
/*    */ @SourceDebugExtension({"SMAP\nGrazieToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieToken.kt\nai/grazie/auth/model/GrazieToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
/*    */ public class GrazieToken {
/*    */   public GrazieToken(@NotNull JWTToken token) {
/*  9 */     this.token = token;
/* 10 */     String str1 = this.token.getText("license");
/*    */ 
/*    */ 
/*    */     
/* 14 */     GrazieToken grazieToken = this; int $i$a$-let-GrazieToken$license$1 = 0; this.token.getText("license"); this.license = (this.token.getText("license") != null) ? new LicenseID(str1) : null; String it = this.token.getText("license_type"); grazieToken = this; int $i$a$-let-GrazieToken$licenseType$1 = 0;
/*    */     this.token.getText("license_type");
/*    */     this.licenseType = (this.token.getText("license_type") != null) ? new LicenseType(it) : null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final JWTToken token;
/*    */   @Nullable
/*    */   private final LicenseID license;
/*    */   @Nullable
/*    */   private final LicenseType licenseType;
/*    */   
/*    */   @NotNull
/*    */   public final JWTToken getToken() {
/*    */     return this.token;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public LicenseID getLicense() {
/*    */     return this.license;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final LicenseType getLicenseType() {
/*    */     return this.licenseType;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */