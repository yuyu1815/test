/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.plugins.HttpClientPlugin;
/*    */ import io.ktor.client.plugins.HttpTimeoutConfig;
/*    */ import io.ktor.client.plugins.HttpTimeoutKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/*    */ final class KtorWebSocketClient$Companion$withExtendedTimeout$1
/*    */   extends Lambda
/*    */   implements Function1<HttpClientConfig<?>, Unit>
/*    */ {
/*    */   public static final KtorWebSocketClient$Companion$withExtendedTimeout$1 INSTANCE = new KtorWebSocketClient$Companion$withExtendedTimeout$1();
/*    */   
/*    */   public final void invoke(HttpClientConfig $this$config) {
/* 29 */     Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeoutKt.getHttpTimeout(), null.INSTANCE);
/*    */   }
/*    */   
/*    */   KtorWebSocketClient$Companion$withExtendedTimeout$1() {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\KtorWebSocketClient$Companion$withExtendedTimeout$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */