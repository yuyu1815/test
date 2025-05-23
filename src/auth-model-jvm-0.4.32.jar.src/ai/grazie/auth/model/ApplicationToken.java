/*    */ package ai.grazie.auth.model;
/*    */ 
/*    */ import ai.grazie.utils.jwt.JWTToken;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b\007\030\000 \t2\0020\001:\001\tB\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\005\032\0020\0068VX\004¢\006\006\032\004\b\007\020\b¨\006\n"}, d2 = {"Lai/grazie/auth/model/ApplicationToken;", "Lai/grazie/auth/model/GrazieToken;", "token", "Lai/grazie/utils/jwt/JWTToken;", "(Lai/grazie/utils/jwt/JWTToken;)V", "license", "Lai/grazie/license/LicenseID;", "getLicense", "()Lai/grazie/license/LicenseID;", "Companion", "auth-model"})
/*    */ public final class ApplicationToken extends GrazieToken {
/*  8 */   public ApplicationToken(@NotNull JWTToken token) { super(token); } @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/* 10 */   public LicenseID getLicense() { if (super.getLicense() == null) { super.getLicense(); throw new IllegalStateException("Application token must have license".toString()); }  return super.getLicense(); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/ApplicationToken$Companion;", "", "()V", "decode", "Lai/grazie/auth/model/ApplicationToken;", "token", "", "auth-model"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*    */     public final ApplicationToken decode(@NotNull String token) {
/* 13 */       Intrinsics.checkNotNullParameter(token, "token"); return new ApplicationToken(new JWTToken(token));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\ApplicationToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */