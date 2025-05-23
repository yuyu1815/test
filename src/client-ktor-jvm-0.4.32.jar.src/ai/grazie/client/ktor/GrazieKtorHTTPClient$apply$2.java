/*     */ package ai.grazie.client.ktor;
/*     */ 
/*     */ import ai.grazie.client.common.model.RequestOptions;
/*     */ import ai.grazie.model.cloud.HttpTimeoutConfig;
/*     */ import io.ktor.client.plugins.HttpTimeoutConfig;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "invoke"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieKtorHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieKtorHTTPClient.kt\nai/grazie/client/ktor/GrazieKtorHTTPClient$apply$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,216:1\n1#2:217\n*E\n"})
/*     */ final class GrazieKtorHTTPClient$apply$2
/*     */   extends Lambda
/*     */   implements Function1<HttpTimeoutConfig, Unit>
/*     */ {
/*     */   public final void invoke(HttpTimeoutConfig $this$timeout) {
/* 139 */     Intrinsics.checkNotNullParameter($this$timeout, "$this$timeout"); HttpTimeoutConfig timeoutConfig = this.$requestOptions.getTimeoutConfig(); int $i$a$-let-GrazieKtorHTTPClient$apply$2$1 = 0;
/* 140 */     if (timeoutConfig.getRequestTimeout() != null) { long it = timeoutConfig.getRequestTimeout().getMillis();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 217 */       int $i$a$-let-GrazieKtorHTTPClient$apply$2$1$1 = 0; $this$timeout.setRequestTimeoutMillis(Long.valueOf(it)); } else { timeoutConfig.getRequestTimeout(); }  if (timeoutConfig.getConnectTimeout() != null) { long it = timeoutConfig.getConnectTimeout().getMillis(); int $i$a$-let-GrazieKtorHTTPClient$apply$2$1$2 = 0; $this$timeout.setConnectTimeoutMillis(Long.valueOf(it)); } else { timeoutConfig.getConnectTimeout(); }  if (timeoutConfig.getSocketTimeout() != null) { long it = timeoutConfig.getSocketTimeout().getMillis(); int $i$a$-let-GrazieKtorHTTPClient$apply$2$1$3 = 0;
/*     */       $this$timeout.setSocketTimeoutMillis(Long.valueOf(it)); }
/*     */     else
/*     */     { timeoutConfig.getSocketTimeout(); }
/*     */     
/*     */     this.$requestOptions.getTimeoutConfig();
/*     */   }
/*     */   
/*     */   GrazieKtorHTTPClient$apply$2(RequestOptions $requestOptions) {
/*     */     super(1);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-ktor-jvm-0.4.32.jar!\ai\grazie\client\ktor\GrazieKtorHTTPClient$apply$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */