/*    */ package ai.grazie.utils.http;
/*    */ 
/*    */ import io.ktor.client.HttpClient;
/*    */ import io.ktor.client.HttpClientConfig;
/*    */ import io.ktor.client.plugins.HttpClientPlugin;
/*    */ import io.ktor.client.plugins.HttpTimeoutConfig;
/*    */ import io.ktor.client.plugins.HttpTimeoutKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\005\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/utils/http/KtorWebSocketClient$Companion;", "", "()V", "default", "Lai/grazie/utils/http/KtorWebSocketClient;", "client", "Lio/ktor/client/HttpClient;", "withExtendedTimeout", "utils-ktor"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/* 20 */   public final KtorWebSocketClient default(@NotNull HttpClient client) { Intrinsics.checkNotNullParameter(client, "client"); return new KtorWebSocketClient(client.config(KtorWebSocketClient$Companion$default$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/* 21 */   static final class KtorWebSocketClient$Companion$default$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public final void invoke(HttpClientConfig $this$config) { Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeoutKt.getHttpTimeout(), null.INSTANCE); }
/*    */      public static final KtorWebSocketClient$Companion$default$1 INSTANCE = new KtorWebSocketClient$Companion$default$1();
/*    */     KtorWebSocketClient$Companion$default$1() {
/*    */       super(1);
/*    */     } }
/*    */   @NotNull
/*    */   public final KtorWebSocketClient withExtendedTimeout(@NotNull HttpClient client) {
/* 28 */     Intrinsics.checkNotNullParameter(client, "client"); return new KtorWebSocketClient(client.config(KtorWebSocketClient$Companion$withExtendedTimeout$1.INSTANCE)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\006\022\002\b\0030\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lio/ktor/client/HttpClientConfig;", "invoke"})
/* 29 */   static final class KtorWebSocketClient$Companion$withExtendedTimeout$1 extends Lambda implements Function1<HttpClientConfig<?>, Unit> { public static final KtorWebSocketClient$Companion$withExtendedTimeout$1 INSTANCE = new KtorWebSocketClient$Companion$withExtendedTimeout$1(); public final void invoke(HttpClientConfig $this$config) { Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeoutKt.getHttpTimeout(), null.INSTANCE); }
/*    */ 
/*    */     
/*    */     KtorWebSocketClient$Companion$withExtendedTimeout$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\KtorWebSocketClient$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */