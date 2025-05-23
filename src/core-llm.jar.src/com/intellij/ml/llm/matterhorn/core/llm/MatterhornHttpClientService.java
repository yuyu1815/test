/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import io.ktor.client.HttpClient;
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.plugins.HttpClientPlugin;
/*    */ import io.ktor.client.plugins.HttpRequestRetryConfig;
/*    */ import io.ktor.client.plugins.HttpRetryShouldRetryContext;
/*    */ import io.ktor.client.plugins.HttpTimeoutConfig;
/*    */ import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
/*    */ import io.ktor.client.request.HttpRequestBuilder;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.json.JsonBuilder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Service
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\b\007\030\000 \n2\0020\001:\001\nB\007¢\006\004\b\002\020\003J\b\020\b\032\0020\tH\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService;", "Lcom/intellij/openapi/Disposable;", "<init>", "()V", "client", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "dispose", "", "Companion", "core-llm"})
/*    */ public final class MatterhornHttpClientService implements Disposable {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/* 23 */   private final HttpClient client = HttpClientKt.HttpClient((HttpClientEngineFactory)Java.INSTANCE, MatterhornHttpClientService::client$lambda$5); @NotNull public final HttpClient getClient() { return this.client; }
/* 24 */   private static final Unit client$lambda$5$lambda$1(ContentNegotiationConfig $this$install) { Intrinsics.checkNotNullParameter($this$install, "$this$install"); JsonSupportKt.json$default((Configuration)$this$install, JsonKt.Json$default(null, MatterhornHttpClientService::client$lambda$5$lambda$1$lambda$0, 1, null), null, 2, null); return Unit.INSTANCE; } private static final Unit client$lambda$5$lambda$1$lambda$0(JsonBuilder $this$Json) { Intrinsics.checkNotNullParameter($this$Json, "$this$Json"); $this$Json.setExplicitNulls(false); return Unit.INSTANCE; } private static final Unit client$lambda$5$lambda$2(HttpTimeoutConfig $this$install) { Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setRequestTimeoutMillis(Long.valueOf(Duration.ofMinutes(5L).toMillis())); return Unit.INSTANCE; } private static final Unit client$lambda$5(HttpClientConfig $this$HttpClient) { Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient"); HttpClientConfig.install$default($this$HttpClient, (HttpClientPlugin)SSEKt.getSSE(), null, 2, null);
/* 25 */     $this$HttpClient.install((HttpClientPlugin)ContentNegotiationKt.getContentNegotiation(), MatterhornHttpClientService::client$lambda$5$lambda$1);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     $this$HttpClient.install((HttpClientPlugin)HttpTimeoutKt.getHttpTimeout(), MatterhornHttpClientService::client$lambda$5$lambda$2);
/*    */ 
/*    */     
/* 33 */     $this$HttpClient.install((HttpClientPlugin)HttpRequestRetryKt.getHttpRequestRetry(), MatterhornHttpClientService::client$lambda$5$lambda$4);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     return Unit.INSTANCE; }
/*    */   private static final Unit client$lambda$5$lambda$4(HttpRequestRetryConfig $this$install) { Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setMaxRetries(5); HttpRequestRetryConfig.retryOnServerErrors$default($this$install, 0, 1, null); HttpRequestRetryConfig.retryOnExceptionIf$default($this$install, 0, MatterhornHttpClientService::client$lambda$5$lambda$4$lambda$3, 1, null); HttpRequestRetryConfig.exponentialDelay$default($this$install, 0.0D, 0L, 0L, 0L, false, 31, null); return Unit.INSTANCE; }
/*    */   private static final boolean client$lambda$5$lambda$4$lambda$3(HttpRetryShouldRetryContext $this$retryOnExceptionIf, HttpRequestBuilder paramHttpRequestBuilder, Throwable cause) { Intrinsics.checkNotNullParameter($this$retryOnExceptionIf, "$this$retryOnExceptionIf"); Intrinsics.checkNotNullParameter(paramHttpRequestBuilder, "<unused var>"); Intrinsics.checkNotNullParameter(cause, "cause");
/* 42 */     return (cause instanceof io.ktor.client.plugins.HttpRequestTimeoutException || cause instanceof java.io.EOFException); } public void dispose() { this.client.close(); }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\0058F¢\006\006\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService$Companion;", "", "<init>", "()V", "instance", "Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService;", "getInstance", "()Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService;", "core-llm"})
/*    */   @SourceDebugExtension({"SMAP\nMatterhornHttpClientService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornHttpClientService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService$Companion\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,49:1\n40#2,3:50\n*S KotlinDebug\n*F\n+ 1 MatterhornHttpClientService.kt\ncom/intellij/ml/llm/matterhorn/core/llm/MatterhornHttpClientService$Companion\n*L\n47#1:50,3\n*E\n"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/*    */     public final MatterhornHttpClientService getInstance() {
/* 47 */       int $i$f$service = 0;
/*    */ 
/*    */       
/* 50 */       Class<MatterhornHttpClientService> serviceClass$iv = MatterhornHttpClientService.class;
/* 51 */       if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 52 */         throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*    */       
/*    */       return (MatterhornHttpClientService)ApplicationManager.getApplication().getService(serviceClass$iv);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornHttpClientService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */