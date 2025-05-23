/*    */ package ai.grazie.client.jdk;
/*    */ 
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import java.net.URI;
/*    */ import java.net.http.HttpRequest;
/*    */ import java.net.http.HttpResponse;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\020\022\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Ljava/net/http/HttpResponse;", "", "invoke"})
/*    */ final class GrazieJdkHTTPClient$send$1
/*    */   extends Lambda
/*    */   implements Function0<HttpResponse<byte[]>>
/*    */ {
/*    */   public final HttpResponse<byte[]> invoke() {
/* 23 */     Intrinsics.checkNotNullExpressionValue(HttpRequest.newBuilder(new URI(this.$url)).header("Content-Type", "application/json"), "newBuilder(URI(url))\n   …ype\", \"application/json\")");
/* 24 */     HttpResponse<byte> httpResponse = GrazieJdkHTTPClient.access$getDelegate$p(GrazieJdkHTTPClient.this).send(GrazieJdkHTTPClient.access$append(GrazieJdkHTTPClient.this, HttpRequest.newBuilder(new URI(this.$url)).header("Content-Type", "application/json"), this.$options.getHeaders())
/* 25 */         .timeout(GrazieJdkHTTPClient.access$getTimeout$p(GrazieJdkHTTPClient.this))
/* 26 */         .POST(HttpRequest.BodyPublishers.ofByteArray(this.$content)).build(), 
/* 27 */         (HttpResponse.BodyHandler)HttpResponse.BodyHandlers.ofByteArray());
/*    */     Intrinsics.checkNotNullExpressionValue(httpResponse, "delegate.send(\n         …ByteArray()\n            )");
/*    */     return (HttpResponse)httpResponse;
/*    */   }
/*    */   
/*    */   GrazieJdkHTTPClient$send$1(String $url, RequestOptions $options, byte[] $content) {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\jdk\GrazieJdkHTTPClient$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */