/*    */ package ai.grazie.model.auth.v5;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\000 \0202\0020\001:\001\020B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\021"}, d2 = {"Lai/grazie/model/auth/v5/AuthServiceToken;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "model-auth"})
/*    */ public final class AuthServiceToken extends AbstractCoroutineContextElement { @NotNull
/*    */   public static final Key Key = new Key(null); @NotNull
/*    */   private final String token; public boolean equals(@Nullable Object other) { if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AuthServiceToken))
/*    */       return false; 
/*    */     AuthServiceToken authServiceToken = (AuthServiceToken)other;
/*    */     return !!Intrinsics.areEqual(this.token, authServiceToken.token); } @NotNull
/* 12 */   public final String getToken() { return this.token; }
/* 13 */   public int hashCode() { return this.token.hashCode(); } @NotNull public String toString() { return "AuthServiceToken(token=" + this.token + ")"; } @NotNull public final AuthServiceToken copy(@NotNull String token) { Intrinsics.checkNotNullParameter(token, "token"); return new AuthServiceToken(token); } @NotNull public final String component1() { return this.token; } public AuthServiceToken(@NotNull String token) { super(Key);
/*    */     this.token = token; }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/auth/v5/AuthServiceToken$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lai/grazie/model/auth/v5/AuthServiceToken;", "()V", "model-auth"})
/*    */   public static final class Key implements CoroutineContext.Key<AuthServiceToken> {
/*    */     private Key() {}
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\v5\AuthServiceToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */