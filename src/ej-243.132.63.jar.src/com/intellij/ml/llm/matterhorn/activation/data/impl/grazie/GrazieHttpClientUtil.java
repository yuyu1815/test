/*     */ package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;
/*     */ import ai.grazie.client.common.SuspendableHTTPClient;
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContextElement;
/*     */ import com.intellij.util.net.HttpConfigurable;
/*     */ import io.ktor.client.HttpClientConfig;
/*     */ import io.ktor.client.plugins.HttpClientPlugin;
/*     */ import io.ktor.client.plugins.HttpTimeoutConfig;
/*     */ import io.ktor.client.plugins.api.ClientPluginBuilder;
/*     */ import io.ktor.client.plugins.api.OnRequestContext;
/*     */ import io.ktor.client.request.HttpRequestBuilder;
/*     */ import io.ktor.client.statement.HttpResponse;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\"\n\002\020\016\n\000\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\f\032\0020\rJ\033\020\016\032\0020\r*\0020\r2\006\020\017\032\0020\020H\000¢\006\004\b\021\020\022R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R\027\020\007\032\b\022\004\022\0020\t0\b¢\006\b\n\000\032\004\b\n\020\013R\024\020\023\032\b\022\004\022\0020\t0\bX\004¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil;", "", "<init>", "()V", "allowedHeaders", "", "", "TraceHeaders", "Lio/ktor/client/plugins/api/ClientPlugin;", "", "getTraceHeaders", "()Lio/ktor/client/plugins/api/ClientPlugin;", "createHttpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "withCloudAuth", "authHeaders", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "withCloudAuth-P03y53I$data_impl_grazie", "(Lai/grazie/client/common/SuspendableHTTPClient;Ljava/util/Map;)Lai/grazie/client/common/SuspendableHTTPClient;", "ProxyAuthenticationPlugin", "data.impl.grazie"})
/*     */ public final class GrazieHttpClientUtil {
/*     */   @NotNull
/*  28 */   public static final GrazieHttpClientUtil INSTANCE = new GrazieHttpClientUtil(); @NotNull
/*  29 */   private static final Set<String> allowedHeaders; static { String[] arrayOfString = new String[2]; arrayOfString[0] = "grazie-agent"; arrayOfString[1] = 
/*  30 */       "grazie-trace-id";
/*     */     allowedHeaders = SetsKt.setOf((Object[])arrayOfString); }
/*     */    @NotNull
/*  33 */   private static final ClientPlugin<Unit> TraceHeaders = CreatePluginUtilsKt.createClientPlugin("TraceHeaders", GrazieHttpClientUtil::TraceHeaders$lambda$0); @NotNull public final ClientPlugin<Unit> getTraceHeaders() { return TraceHeaders; } @DebugMetadata(f = "GrazieHttpClientUtil.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.GrazieHttpClientUtil$TraceHeaders$1$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\006H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/OnRequestContext;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "<unused var>", ""}) static final class GrazieHttpClientUtil$TraceHeaders$1$1 extends SuspendLambda implements Function4<OnRequestContext, HttpRequestBuilder, Object, Continuation<? super Unit>, Object> {
/*  34 */     int label; GrazieHttpClientUtil$TraceHeaders$1$1(Continuation $completion) { super(4, $completion); } public final Object invokeSuspend(Object $result) { HttpRequestBuilder request; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); request = (HttpRequestBuilder)this.L$0; request.getHeaders().build().forEach(GrazieHttpClientUtil$TraceHeaders$1$1::invokeSuspend$lambda$0); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(OnRequestContext p1, HttpRequestBuilder p2, Object p3, Continuation<? super GrazieHttpClientUtil$TraceHeaders$1$1> p4) { GrazieHttpClientUtil$TraceHeaders$1$1 grazieHttpClientUtil$TraceHeaders$1$1 = new GrazieHttpClientUtil$TraceHeaders$1$1(p4); grazieHttpClientUtil$TraceHeaders$1$1.L$0 = p2; return grazieHttpClientUtil$TraceHeaders$1$1.invokeSuspend(Unit.INSTANCE); } private static final Unit invokeSuspend$lambda$0(String header, List values) { if (GrazieHttpClientUtil.allowedHeaders.contains(header)) GrazieHttpClientUtilKt.getLog().info(">>> Request Header: " + header + ": " + CollectionsKt.joinToString$default(values, null, null, null, 0, null, null, 63, null));  return Unit.INSTANCE; } } private static final Unit TraceHeaders$lambda$0(ClientPluginBuilder $this$createClientPlugin) { Intrinsics.checkNotNullParameter($this$createClientPlugin, "$this$createClientPlugin"); $this$createClientPlugin.onRequest(new GrazieHttpClientUtil$TraceHeaders$1$1(null));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  41 */     $this$createClientPlugin.onResponse(new GrazieHttpClientUtil$TraceHeaders$1$2(null));
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
/*  52 */     return Unit.INSTANCE; }
/*     */   
/*     */   @NotNull
/*  55 */   public final SuspendableHTTPClient createHttpClient() { HttpClient httpClient = HttpClientKt.HttpClient((HttpClientEngineFactory)Java.INSTANCE, GrazieHttpClientUtil::createHttpClient$lambda$2);
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
/*  66 */     return (SuspendableHTTPClient)new GrazieKtorHTTPClient(httpClient, new GrazieHttpClientUtil$createHttpClient$1()); } @DebugMetadata(f = "GrazieHttpClientUtil.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.GrazieHttpClientUtil$TraceHeaders$1$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/OnResponseContext;", "response", "Lio/ktor/client/statement/HttpResponse;"}) static final class GrazieHttpClientUtil$TraceHeaders$1$2 extends SuspendLambda implements Function3<OnResponseContext, HttpResponse, Continuation<? super Unit>, Object> {
/*     */     int label; GrazieHttpClientUtil$TraceHeaders$1$2(Continuation $completion) { super(3, $completion); } public final Object invokeSuspend(Object $result) { HttpResponse response; ExecutionContextElement context; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); response = (HttpResponse)this.L$0; context = (ExecutionContextElement)getContext().get((CoroutineContext.Key)ExecutionContextKey.INSTANCE); response.getHeaders().forEach(context::invokeSuspend$lambda$0); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Object invoke(OnResponseContext p1, HttpResponse p2, Continuation<? super GrazieHttpClientUtil$TraceHeaders$1$2> p3) { GrazieHttpClientUtil$TraceHeaders$1$2 grazieHttpClientUtil$TraceHeaders$1$2 = new GrazieHttpClientUtil$TraceHeaders$1$2(p3); grazieHttpClientUtil$TraceHeaders$1$2.L$0 = p2; return grazieHttpClientUtil$TraceHeaders$1$2.invokeSuspend(Unit.INSTANCE); } private static final Unit invokeSuspend$lambda$0(ExecutionContextElement $context, String header, List values) { if (GrazieHttpClientUtil.allowedHeaders.contains(header)) GrazieHttpClientUtilKt.getLog().info("<<< Response Header: " + header + ": " + CollectionsKt.joinToString$default(values, null, null, null, 0, null, null, 63, null));  if (Intrinsics.areEqual(header, "grazie-trace-id")) if ($context != null && $context.getTraceIds() != null) { $context.getTraceIds().addAll(values); } else { $context.getTraceIds(); }   return Unit.INSTANCE; } } private static final Unit createHttpClient$lambda$2(HttpClientConfig $this$HttpClient) { Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient"); $this$HttpClient.install((HttpClientPlugin)HttpTimeoutKt.getHttpTimeout(), GrazieHttpClientUtil::createHttpClient$lambda$2$lambda$1); HttpClientConfig.install$default($this$HttpClient, (HttpClientPlugin)ProxyAuthenticationPlugin, null, 2, null); HttpClientConfig.install$default($this$HttpClient, (HttpClientPlugin)TraceHeaders, null, 2, null); return Unit.INSTANCE; } private static final Unit createHttpClient$lambda$2$lambda$1(HttpTimeoutConfig $this$install) { Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setRequestTimeoutMillis(Long.valueOf(240000L)); $this$install.setConnectTimeoutMillis(Long.valueOf(240000L)); $this$install.setSocketTimeoutMillis(Long.valueOf(240000L)); return Unit.INSTANCE; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\020\t\n\002\b\003*\001\000\b\n\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil$createHttpClient$1", "Lai/grazie/utils/http/HttpClientRequestSetup;", "sseSocketTimeout", "", "getSseSocketTimeout", "()J", "data.impl.grazie"}) public static final class GrazieHttpClientUtil$createHttpClient$1 implements HttpClientRequestSetup {
/*  68 */     public long getSseSocketTimeout() { return 240000L; }
/*     */   
/*     */   }
/*     */   
/*     */   @NotNull
/*  73 */   public final SuspendableHTTPClient withCloudAuth-P03y53I$data_impl_grazie(@NotNull SuspendableHTTPClient $this$withCloudAuth_u2dP03y53I, @NotNull Map<String, ? extends String> authHeaders) { Intrinsics.checkNotNullParameter($this$withCloudAuth_u2dP03y53I, "$this$withCloudAuth"); Intrinsics.checkNotNullParameter(authHeaders, "authHeaders"); if (!(!($this$withCloudAuth_u2dP03y53I instanceof ai.grazie.client.common.WithCloudAuth) ? 1 : 0)) { int $i$a$-require-GrazieHttpClientUtil$withCloudAuth$1 = 0; String str = 
/*  74 */         "Client must not already be wrapped with authentication";
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*  77 */     return (SuspendableHTTPClient)new GrazieHttpClientUtil$withCloudAuth$2($this$withCloudAuth_u2dP03y53I, authHeaders); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\0012\0020\002J\026\020\013\032\0020\f2\006\020\r\032\0020\fH@¢\006\002\020\016R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\n¨\006\017"}, d2 = {"com/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil$withCloudAuth$2", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "Lai/grazie/client/common/SuspendableWithCloudAuth;", "baseHTTPClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "getBaseHTTPClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "authVersion", "Lai/grazie/model/cloud/AuthVersion;", "getAuthVersion", "()Lai/grazie/model/cloud/AuthVersion;", "appendHeaders", "Lai/grazie/client/common/model/RequestOptions;", "options", "(Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data.impl.grazie"}) @SourceDebugExtension({"SMAP\nGrazieHttpClientUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieHttpClientUtil.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil$withCloudAuth$2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,114:1\n216#2,2:115\n*S KotlinDebug\n*F\n+ 1 GrazieHttpClientUtil.kt\ncom/intellij/ml/llm/matterhorn/activation/data/impl/grazie/GrazieHttpClientUtil$withCloudAuth$2\n*L\n83#1:115,2\n*E\n"}) public static final class GrazieHttpClientUtil$withCloudAuth$2 extends SuspendableHTTPClient.WithHeaders implements SuspendableWithCloudAuth { private final SuspendableHTTPClient baseHTTPClient; private final AuthVersion authVersion; GrazieHttpClientUtil$withCloudAuth$2(SuspendableHTTPClient $receiver, Map<String, ? extends String> $authHeaders) { super($receiver, null, 2, null);
/*  78 */       this.baseHTTPClient = $receiver;
/*  79 */       this.authVersion = AuthVersion.V5; } public SuspendableHTTPClient getBaseHTTPClient() { return this.baseHTTPClient; } public AuthVersion getAuthVersion() { return this.authVersion; }
/*     */     
/*     */     protected Object appendHeaders(RequestOptions options, Continuation $completion) {
/*  82 */       RequestOptions requestOptions1 = options; Map<String, ? extends String> map = this.$authHeaders; RequestOptions $this$appendHeaders_u24lambda_u241 = requestOptions1; int $i$a$-apply-GrazieHttpClientUtil$withCloudAuth$2$appendHeaders$2 = 0;
/*  83 */       Map $this$forEach$iv = SimpleHttpHeaders.asMap-impl(map); int $i$f$forEach = 0;
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
/* 115 */       Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-GrazieHttpClientUtil$withCloudAuth$2$appendHeaders$2$1 = 0;
/*     */         String key = (String)entry1.getKey(), value = (String)entry1.getValue();
/*     */         $this$appendHeaders_u24lambda_u241.getHeaders().add(key, value); }
/*     */       
/*     */       return requestOptions1;
/*     */     } }
/*     */   
/*     */   @NotNull
/*     */   private static final ClientPlugin<Unit> ProxyAuthenticationPlugin = CreatePluginUtilsKt.createClientPlugin("ProxyAuthenticationPlugin", GrazieHttpClientUtil::ProxyAuthenticationPlugin$lambda$4);
/*     */   
/*     */   private static final Unit ProxyAuthenticationPlugin$lambda$4(ClientPluginBuilder $this$createClientPlugin) {
/*     */     Intrinsics.checkNotNullParameter($this$createClientPlugin, "$this$createClientPlugin");
/*     */     $this$createClientPlugin.onRequest(new GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1(null));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieHttpClientUtil.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\000\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\006H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/api/OnRequestContext;", "request", "Lio/ktor/client/request/HttpRequestBuilder;", "<unused var>", ""})
/*     */   static final class GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1 extends SuspendLambda implements Function4<OnRequestContext, HttpRequestBuilder, Object, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1(Continuation $completion) {
/*     */       super(4, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       HttpRequestBuilder request;
/*     */       HttpConfigurable platformHttpConfig;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           request = (HttpRequestBuilder)this.L$0;
/*     */           platformHttpConfig = HttpConfigurable.getInstance();
/*     */           if (platformHttpConfig.USE_HTTP_PROXY && platformHttpConfig.PROXY_AUTHENTICATION) {
/*     */             String proxyLogin = platformHttpConfig.getProxyLogin();
/*     */             String proxyPassword = platformHttpConfig.getPlainProxyPassword();
/*     */             String str1 = proxyLogin + ":" + proxyLogin;
/*     */             Intrinsics.checkNotNullExpressionValue(str1.getBytes(Charsets.UTF_8), "getBytes(...)");
/*     */             String token = Base64.getEncoder().encodeToString(str1.getBytes(Charsets.UTF_8));
/*     */             request.getHeaders().append(HttpHeaders.INSTANCE.getProxyAuthorization(), "Basic " + token);
/*     */           } 
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Object invoke(OnRequestContext p1, HttpRequestBuilder p2, Object p3, Continuation<? super GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1> p4) {
/*     */       GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1 grazieHttpClientUtil$ProxyAuthenticationPlugin$1$1 = new GrazieHttpClientUtil$ProxyAuthenticationPlugin$1$1(p4);
/*     */       grazieHttpClientUtil$ProxyAuthenticationPlugin$1$1.L$0 = p2;
/*     */       return grazieHttpClientUtil$ProxyAuthenticationPlugin$1$1.invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\GrazieHttpClientUtil.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */