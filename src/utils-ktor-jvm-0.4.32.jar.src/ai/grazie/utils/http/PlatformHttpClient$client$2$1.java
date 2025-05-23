/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.plugins.logging.LogLevel;
/*    */ import io.ktor.client.plugins.logging.LoggingConfig;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/plugins/logging/LoggingConfig;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<LoggingConfig, Unit>
/*    */ {
/*    */   public final void invoke(LoggingConfig $this$install) {
/* 19 */     Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setLogger(new PlatformHttpClientLogger(this.$prefix));
/* 20 */     $this$install.setLevel(DefaultServerHttpClientSetup.INSTANCE.getLoggingEnabled() ? LogLevel.INFO : LogLevel.NONE);
/*    */   }
/*    */   
/*    */   null(String $prefix) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\PlatformHttpClient$client$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */