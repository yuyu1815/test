/*     */ package ai.grazie.client.common;
/*     */ 
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.auth.v5.AuthData;
/*     */ import ai.grazie.model.auth.v5.AuthServiceToken;
/*     */ import ai.grazie.model.cloud.AuthVersion;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\030\0002\0020\0012\0020\0022\0020\003B%\022\006\020\004\032\0020\001\022\n\b\002\020\005\032\004\030\0010\006\022\n\b\002\020\007\032\004\030\0010\b¢\006\002\020\tJ\026\020\021\032\0020\0222\006\020\023\032\0020\022H@¢\006\002\020\024R\020\020\005\032\004\030\0010\006X\004¢\006\002\n\000R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\001X\004¢\006\b\n\000\032\004\b\017\020\020R\016\020\004\032\0020\001X\004¢\006\002\n\000R\020\020\007\032\004\030\0010\bX\004¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithV5;", "Lai/grazie/client/common/SuspendableHTTPClient;", "Lai/grazie/client/common/SuspendableWithCloudAuth;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "authData", "Lai/grazie/model/auth/v5/AuthData;", "serviceToken", "Lai/grazie/model/auth/v5/AuthServiceToken;", "(Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/model/auth/v5/AuthData;Lai/grazie/model/auth/v5/AuthServiceToken;)V", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "baseHTTPClient", "getBaseHTTPClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*     */ public final class WithV5
/*     */   extends SuspendableHTTPClient.WithHeaders
/*     */   implements SuspendableHTTPClient, SuspendableWithCloudAuth
/*     */ {
/*     */   @NotNull
/*     */   private final SuspendableHTTPClient client;
/*     */   @Nullable
/*     */   private final AuthData authData;
/*     */   @Nullable
/*     */   private final AuthServiceToken serviceToken;
/*     */   @NotNull
/*     */   private final AuthVersion authVersion;
/*     */   @NotNull
/*     */   private final SuspendableHTTPClient baseHTTPClient;
/*     */   
/*     */   public WithV5(@NotNull SuspendableHTTPClient client, @Nullable AuthData authData, @Nullable AuthServiceToken serviceToken) {
/*  81 */     super(client, null, 2, null); this.client = client; this.authData = authData; this.serviceToken = serviceToken;
/*  82 */     this.authVersion = AuthVersion.V5;
/*  83 */     this.baseHTTPClient = this.client;
/*     */ 
/*     */     
/*  86 */     if (!(!(this.client instanceof WithCloudAuth) ? 1 : 0)) { int $i$a$-require-SuspendableHTTPClient$WithV5$1 = 0; String str = 
/*  87 */         "Client should not already be wrapped with authentication";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */   
/*     */   } @Nullable
/*     */   protected Object appendHeaders(@NotNull RequestOptions options, @NotNull Continuation $completion) {
/*  92 */     if (this.authData == null); AuthData requestAuthData = (AuthData)$completion.getContext().get((CoroutineContext.Key)AuthData.Key);
/*  93 */     if (this.serviceToken == null); AuthServiceToken serviceAuthData = (AuthServiceToken)$completion.getContext().get((CoroutineContext.Key)AuthServiceToken.Key);
/*  94 */     if (!((requestAuthData != null || serviceAuthData != null) ? 1 : 0)) { int $i$a$-require-SuspendableHTTPClient$WithV5$appendHeaders$2 = 0; String str = 
/*  95 */         "For v5 requests service or user data should be presented";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*  98 */     if (serviceAuthData == null || serviceAuthData.getToken() == null) { serviceAuthData.getToken(); Intrinsics.checkNotNull(requestAuthData); }  return serviceAuthData.getToken().append(requestAuthData.getToken(), 
/*  99 */         (requestAuthData != null) ? requestAuthData.getOriginalUserToken() : null, 
/* 100 */         (requestAuthData != null) ? requestAuthData.getOriginalServiceToken() : null, 
/* 101 */         (requestAuthData != null) ? requestAuthData.getOriginalApplicationToken() : null, 
/* 102 */         (requestAuthData != null) ? requestAuthData.getGrazieAgent() : null, 
/* 103 */         (requestAuthData != null) ? requestAuthData.getOriginalUserIP() : null, 
/* 104 */         (requestAuthData != null) ? requestAuthData.getApplicationUserId() : null, 
/* 105 */         (requestAuthData != null) ? requestAuthData.getOriginalUserCountry() : null, 
/* 106 */         options);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public AuthVersion getAuthVersion() {
/*     */     return this.authVersion;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public SuspendableHTTPClient getBaseHTTPClient() {
/*     */     return this.baseHTTPClient;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableHTTPClient$WithV5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */