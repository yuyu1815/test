/*   */ package ai.grazie.auth.model;
/*   */ import kotlin.Metadata;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\006\b\001\030\0002\b\022\004\022\0020\0000\001B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\b¨\006\t"}, d2 = {"Lai/grazie/auth/model/SSO;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Google", "JetBrains", "auth-model"})
/*   */ public enum SSO {
/* 7 */   Google("google"),
/* 8 */   JetBrains("jetbrains");
/*   */   @NotNull
/*   */   private final String value;
/*   */   
/*   */   SSO(String value) {
/*   */     this.value = value;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final String getValue() {
/*   */     return this.value;
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\SSO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */