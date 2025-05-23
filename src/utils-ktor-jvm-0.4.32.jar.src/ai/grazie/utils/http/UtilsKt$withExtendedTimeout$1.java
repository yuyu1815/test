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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
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
/*    */ final class UtilsKt$withExtendedTimeout$1
/*    */   extends Lambda
/*    */   implements Function1<HttpClientConfig<?>, Unit>
/*    */ {
/*    */   public final void invoke(HttpClientConfig $this$config) {
/* 90 */     Intrinsics.checkNotNullParameter($this$config, "$this$config"); $this$config.install((HttpClientPlugin)HttpTimeoutKt.getHttpTimeout(), new Function1<HttpTimeoutConfig, Unit>(this.$requestTimeout, this.$connectTimeout, this.$socketTimeout) { public final void invoke(HttpTimeoutConfig $this$install) {
/* 91 */             Intrinsics.checkNotNullParameter($this$install, "$this$install"); $this$install.setRequestTimeoutMillis(Long.valueOf(this.$requestTimeout));
/* 92 */             $this$install.setConnectTimeoutMillis(Long.valueOf(this.$connectTimeout));
/* 93 */             $this$install.setSocketTimeoutMillis(Long.valueOf(this.$socketTimeout));
/*    */           } }
/*    */       );
/*    */   }
/*    */   
/*    */   UtilsKt$withExtendedTimeout$1(long $requestTimeout, long $connectTimeout, long $socketTimeout) {
/*    */     super(1);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\UtilsKt$withExtendedTimeout$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */