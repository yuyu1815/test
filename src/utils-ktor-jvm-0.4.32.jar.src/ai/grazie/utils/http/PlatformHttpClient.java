/*    */ package ai.grazie.utils.http;
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.plugins.logging.LoggingConfig;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J/\020\003\032\0020\0042\b\b\002\020\005\032\0020\0062\035\b\002\020\007\032\027\022\b\022\006\022\002\b\0030\t\022\004\022\0020\n0\b¢\006\002\b\013¨\006\f"}, d2 = {"Lai/grazie/utils/http/PlatformHttpClient;", "", "()V", "client", "Lio/ktor/client/HttpClient;", "prefix", "", "config", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "utils-ktor"})
/*    */ public final class PlatformHttpClient {
/*    */   @NotNull
/*    */   public static final PlatformHttpClient INSTANCE = new PlatformHttpClient();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class PlatformHttpClient$client$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> {
/*    */     public static final PlatformHttpClient$client$1 INSTANCE = new PlatformHttpClient$client$1();
/*    */     
/* 16 */     public final void invoke(HttpClientConfig $this$null) { Intrinsics.checkNotNullParameter($this$null, "$this$null"); } PlatformHttpClient$client$1() { super(1); }
/* 17 */   } @NotNull public final HttpClient client(@NotNull String prefix, @NotNull Function1<? super HttpClientConfig<?>, Unit> config) { Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(config, "config"); return HttpClientKt.HttpClient((HttpClientEngineFactory)CIO.INSTANCE, new PlatformHttpClient$client$2(config, prefix)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\030\002\n\002\030\002\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "Lio/ktor/client/engine/cio/CIOEngineConfig;", "invoke"})
/* 18 */   static final class PlatformHttpClient$client$2 extends Lambda implements Function1<HttpClientConfig<CIOEngineConfig>, Unit> { public final void invoke(HttpClientConfig $this$HttpClient) { Intrinsics.checkNotNullParameter($this$HttpClient, "$this$HttpClient"); $this$HttpClient.install((HttpClientPlugin)LoggingKt.getLogging(), new Function1<LoggingConfig, Unit>(this.$prefix) { public final void invoke(LoggingConfig $this$install) {
/* 19 */               Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setLogger(new PlatformHttpClientLogger(this.$prefix));
/* 20 */               $this$install.setLevel(DefaultServerHttpClientSetup.INSTANCE.getLoggingEnabled() ? LogLevel.INFO : LogLevel.NONE);
/*    */             } }
/*    */         );
/* 23 */       this.$config.invoke($this$HttpClient); }
/*    */ 
/*    */     
/*    */     PlatformHttpClient$client$2(Function1<HttpClientConfig<?>, Unit> $config, String $prefix) {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\PlatformHttpClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */