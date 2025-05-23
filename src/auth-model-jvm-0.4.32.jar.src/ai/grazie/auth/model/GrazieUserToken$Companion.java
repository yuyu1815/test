/*    */ package ai.grazie.auth.model;
/*    */ 
/*    */ import ai.grazie.utils.jwt.JWTToken;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/GrazieUserToken$Companion;", "", "()V", "decode", "Lai/grazie/auth/model/GrazieUserToken;", "token", "", "auth-model"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final GrazieUserToken decode(@NotNull String token) {
/* 17 */     Intrinsics.checkNotNullParameter(token, "token"); return new GrazieUserToken(new JWTToken(token));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieUserToken$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */