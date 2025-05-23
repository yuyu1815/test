/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.engine.cio.CIOEngineConfig;
/*    */ import io.ktor.client.plugins.HttpClientPlugin;
/*    */ import io.ktor.client.plugins.logging.LogLevel;
/*    */ import io.ktor.client.plugins.logging.LoggingConfig;
/*    */ import io.ktor.client.plugins.logging.LoggingKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "invoke"})
/*    */ final class PlatformHttpClient$client$2 extends Lambda implements Function1<HttpClientConfig<CIOEngineConfig>, Unit> {
/*    */   public final void invoke(HttpClientConfig $this$HttpClient) {
/* 18 */     Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient"); $this$HttpClient.install((HttpClientPlugin)LoggingKt.getLogging(), new Function1<LoggingConfig, Unit>(this.$prefix) { public final void invoke(LoggingConfig $this$install) {
/* 19 */             Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setLogger(new PlatformHttpClientLogger(this.$prefix));
/* 20 */             $this$install.setLevel(DefaultServerHttpClientSetup.INSTANCE.getLoggingEnabled() ? LogLevel.INFO : LogLevel.NONE);
/*    */           } }
/*    */       );
/* 23 */     this.$config.invoke($this$HttpClient);
/*    */   }
/*    */   
/*    */   PlatformHttpClient$client$2(Function1<HttpClientConfig<?>, Unit> $config, String $prefix) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\PlatformHttpClient$client$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */