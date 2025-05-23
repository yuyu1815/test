/*    */ package ai.grazie.model.auth.v5;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\030\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\003\b\b\030\000 )2\0020\001:\001)Ba\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003\022\n\b\002\020\005\032\004\030\0010\003\022\n\b\002\020\006\032\004\030\0010\003\022\n\b\002\020\007\032\004\030\0010\b\022\n\b\002\020\t\032\004\030\0010\n\022\n\b\002\020\013\032\004\030\0010\003\022\n\b\002\020\f\032\004\030\0010\003¢\006\002\020\rJ\t\020\031\032\0020\003HÆ\003J\013\020\032\032\004\030\0010\003HÆ\003J\013\020\033\032\004\030\0010\003HÆ\003J\013\020\034\032\004\030\0010\003HÆ\003J\013\020\035\032\004\030\0010\bHÆ\003J\013\020\036\032\004\030\0010\nHÆ\003J\013\020\037\032\004\030\0010\003HÆ\003J\013\020 \032\004\030\0010\003HÆ\003Jg\020!\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0032\n\b\002\020\005\032\004\030\0010\0032\n\b\002\020\006\032\004\030\0010\0032\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\n2\n\b\002\020\013\032\004\030\0010\0032\n\b\002\020\f\032\004\030\0010\003HÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010%HÖ\003J\t\020&\032\0020'HÖ\001J\t\020(\032\0020\003HÖ\001R\023\020\013\032\004\030\0010\003¢\006\b\n\000\032\004\b\016\020\017R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\020\020\021R\023\020\006\032\004\030\0010\003¢\006\b\n\000\032\004\b\022\020\017R\023\020\005\032\004\030\0010\003¢\006\b\n\000\032\004\b\023\020\017R\023\020\f\032\004\030\0010\003¢\006\b\n\000\032\004\b\024\020\017R\023\020\t\032\004\030\0010\n¢\006\b\n\000\032\004\b\025\020\026R\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\027\020\017R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\030\020\017¨\006*"}, d2 = {"Lai/grazie/model/auth/v5/AuthData;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "token", "", "originalUserToken", "originalServiceToken", "originalApplicationToken", "grazieAgent", "Lai/grazie/model/auth/GrazieAgent;", "originalUserIP", "Lai/grazie/model/cloud/ip/IPAddress;", "applicationUserId", "originalUserCountry", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/auth/GrazieAgent;Lai/grazie/model/cloud/ip/IPAddress;Ljava/lang/String;Ljava/lang/String;)V", "getApplicationUserId", "()Ljava/lang/String;", "getGrazieAgent", "()Lai/grazie/model/auth/GrazieAgent;", "getOriginalApplicationToken", "getOriginalServiceToken", "getOriginalUserCountry", "getOriginalUserIP", "()Lai/grazie/model/cloud/ip/IPAddress;", "getOriginalUserToken", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "model-auth"})
/*    */ public final class AuthData extends AbstractCoroutineContextElement {
/*    */   @NotNull
/*    */   public static final Key Key = new Key(null);
/*    */   @NotNull
/*    */   private final String token;
/*    */   @Nullable
/*    */   private final String originalUserToken;
/*    */   @Nullable
/*    */   private final String originalServiceToken;
/*    */   
/*    */   @NotNull
/* 16 */   public final String getToken() { return this.token; } @Nullable private final String originalApplicationToken; @Nullable private final GrazieAgent grazieAgent; @Nullable private final IPAddress originalUserIP; @Nullable private final String applicationUserId; @Nullable private final String originalUserCountry; @Nullable
/* 17 */   public final String getOriginalUserToken() { return this.originalUserToken; } @Nullable
/* 18 */   public final String getOriginalServiceToken() { return this.originalServiceToken; } @Nullable
/* 19 */   public final String getOriginalApplicationToken() { return this.originalApplicationToken; } @Nullable
/* 20 */   public final GrazieAgent getGrazieAgent() { return this.grazieAgent; } @Nullable
/* 21 */   public final IPAddress getOriginalUserIP() { return this.originalUserIP; } @Nullable
/* 22 */   public final String getApplicationUserId() { return this.applicationUserId; } @Nullable
/* 23 */   public final String getOriginalUserCountry() { return this.originalUserCountry; } public AuthData(@NotNull String token, @Nullable String originalUserToken, @Nullable String originalServiceToken, @Nullable String originalApplicationToken, @Nullable GrazieAgent grazieAgent, @Nullable IPAddress originalUserIP, @Nullable String applicationUserId, @Nullable String originalUserCountry) {
/* 24 */     super(Key);
/*    */     this.token = token;
/*    */     this.originalUserToken = originalUserToken;
/*    */     this.originalServiceToken = originalServiceToken;
/*    */     this.originalApplicationToken = originalApplicationToken;
/*    */     this.grazieAgent = grazieAgent;
/*    */     this.originalUserIP = originalUserIP;
/*    */     this.applicationUserId = applicationUserId;
/*    */     this.originalUserCountry = originalUserCountry;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.token;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.originalUserToken;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.originalServiceToken;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.originalApplicationToken;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final GrazieAgent component5() {
/*    */     return this.grazieAgent;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final IPAddress component6() {
/*    */     return this.originalUserIP;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component7() {
/*    */     return this.applicationUserId;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component8() {
/*    */     return this.originalUserCountry;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AuthData copy(@NotNull String token, @Nullable String originalUserToken, @Nullable String originalServiceToken, @Nullable String originalApplicationToken, @Nullable GrazieAgent grazieAgent, @Nullable IPAddress originalUserIP, @Nullable String applicationUserId, @Nullable String originalUserCountry) {
/*    */     Intrinsics.checkNotNullParameter(token, "token");
/*    */     return new AuthData(token, originalUserToken, originalServiceToken, originalApplicationToken, grazieAgent, originalUserIP, applicationUserId, originalUserCountry);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "AuthData(token=" + this.token + ", originalUserToken=" + this.originalUserToken + ", originalServiceToken=" + this.originalServiceToken + ", originalApplicationToken=" + this.originalApplicationToken + ", grazieAgent=" + this.grazieAgent + ", originalUserIP=" + this.originalUserIP + ", applicationUserId=" + this.applicationUserId + ", originalUserCountry=" + this.originalUserCountry + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.token.hashCode();
/*    */     result = result * 31 + ((this.originalUserToken == null) ? 0 : this.originalUserToken.hashCode());
/*    */     result = result * 31 + ((this.originalServiceToken == null) ? 0 : this.originalServiceToken.hashCode());
/*    */     result = result * 31 + ((this.originalApplicationToken == null) ? 0 : this.originalApplicationToken.hashCode());
/*    */     result = result * 31 + ((this.grazieAgent == null) ? 0 : this.grazieAgent.hashCode());
/*    */     result = result * 31 + ((this.originalUserIP == null) ? 0 : this.originalUserIP.hashCode());
/*    */     result = result * 31 + ((this.applicationUserId == null) ? 0 : this.applicationUserId.hashCode());
/*    */     return result * 31 + ((this.originalUserCountry == null) ? 0 : this.originalUserCountry.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof AuthData))
/*    */       return false; 
/*    */     AuthData authData = (AuthData)other;
/*    */     return !Intrinsics.areEqual(this.token, authData.token) ? false : (!Intrinsics.areEqual(this.originalUserToken, authData.originalUserToken) ? false : (!Intrinsics.areEqual(this.originalServiceToken, authData.originalServiceToken) ? false : (!Intrinsics.areEqual(this.originalApplicationToken, authData.originalApplicationToken) ? false : (!Intrinsics.areEqual(this.grazieAgent, authData.grazieAgent) ? false : (!Intrinsics.areEqual(this.originalUserIP, authData.originalUserIP) ? false : (!Intrinsics.areEqual(this.applicationUserId, authData.applicationUserId) ? false : (!!Intrinsics.areEqual(this.originalUserCountry, authData.originalUserCountry))))))));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/auth/v5/AuthData$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lai/grazie/model/auth/v5/AuthData;", "()V", "model-auth"})
/*    */   public static final class Key implements CoroutineContext.Key<AuthData> {
/*    */     private Key() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\v5\AuthData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */