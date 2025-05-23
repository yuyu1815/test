/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*     */ 
/*     */ import com.intellij.util.net.HttpConfigurable;
/*     */ import io.ktor.client.plugins.api.OnRequestContext;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.http.HttpHeaders;
/*     */ import java.util.Base64;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.Charsets;
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
/*     */ @DebugMetadata(f = "GrazieHttpClientUtil.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\006H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/OnRequestContext;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "<unused var>", ""})
/*     */ final class GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1
/*     */   extends SuspendLambda
/*     */   implements Function4<OnRequestContext, HttpRequestBuilder, Object, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1(Continuation $completion) {
/*     */     super(4, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     HttpRequestBuilder request;
/*     */     HttpConfigurable platformHttpConfig;
/* 102 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); request = (HttpRequestBuilder)this.L$0;
/* 103 */         platformHttpConfig = HttpConfigurable.getInstance();
/* 104 */         if (platformHttpConfig.USE_HTTP_PROXY && platformHttpConfig.PROXY_AUTHENTICATION) {
/* 105 */           String proxyLogin = platformHttpConfig.getProxyLogin();
/* 106 */           String proxyPassword = platformHttpConfig.getPlainProxyPassword();
/* 107 */           String str1 = proxyLogin + ":" + proxyLogin; Intrinsics.checkNotNullExpressionValue(str1.getBytes(Charsets.UTF_8), "getBytes(...)"); String token = Base64.getEncoder().encodeToString(str1.getBytes(Charsets.UTF_8));
/* 108 */           request.getHeaders().append(HttpHeaders.INSTANCE.getProxyAuthorization(), "Basic " + token);
/*     */         } 
/* 110 */         return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Object invoke(OnRequestContext p1, HttpRequestBuilder p2, Object p3, Continuation<? super GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1> p4) {
/*     */     GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1 grazieHttpClientUtil$ProxyAuthenticationPlugin$1$1 = new GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1(p4);
/*     */     grazieHttpClientUtil$ProxyAuthenticationPlugin$1$1.L$0 = p2;
/*     */     return grazieHttpClientUtil$ProxyAuthenticationPlugin$1$1.invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */