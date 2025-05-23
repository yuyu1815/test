/*    */ package ai.grazie.client.jdk;
/*    */ 
/*    */ import ai.grazie.client.common.model.HTTPResponse;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import java.net.URI;
/*    */ import java.net.http.HttpClient;
/*    */ import java.net.http.HttpRequest;
/*    */ import java.net.http.HttpResponse;
/*    */ import java.time.Duration;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\022\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\000 \0312\0020\001:\001\031B\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\026J\034\020\r\032\0020\b2\022\020\016\032\016\022\n\022\b\022\004\022\0020\0210\0200\017H\002J \020\022\032\0020\b2\006\020\t\032\0020\n2\006\020\023\032\0020\0242\006\020\013\032\0020\fH\026J\030\020\022\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\026J \020\022\032\0020\b2\006\020\t\032\0020\n2\006\020\023\032\0020\0212\006\020\013\032\0020\fH\026J\024\020\025\032\0020\026*\0020\0262\006\020\027\032\0020\030H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lai/grazie/client/jdk/GrazieJdkHTTPClient;", "Lai/grazie/client/common/HTTPClient;", "delegate", "Ljava/net/http/HttpClient;", "timeout", "Ljava/time/Duration;", "(Ljava/net/http/HttpClient;Ljava/time/Duration;)V", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "handle", "body", "Lkotlin/Function0;", "Ljava/net/http/HttpResponse;", "", "send", "content", "Lai/grazie/client/common/model/Multipart;", "append", "Ljava/net/http/HttpRequest$Builder;", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "Companion", "client-common"})
/*    */ public final class GrazieJdkHTTPClient implements HTTPClient {
/* 18 */   public GrazieJdkHTTPClient(@NotNull HttpClient delegate, @NotNull Duration timeout) { this.delegate = delegate; this.timeout = timeout; }
/*    */   @NotNull
/* 20 */   public HTTPResponse send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options) { Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(options, "options"); return handle(new GrazieJdkHTTPClient$send$1(url, options, content)); }
/*    */    @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\020\022\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Ljava/net/http/HttpResponse;", "", "invoke"})
/*    */   static final class GrazieJdkHTTPClient$send$1 extends Lambda implements Function0<HttpResponse<byte[]>> {
/* 23 */     public final HttpResponse<byte[]> invoke() { Intrinsics.checkNotNullExpressionValue(HttpRequest.newBuilder(new URI(this.$url)).header("Content-Type", "application/json"), "newBuilder(URI(url))\n   …ype\", \"application/json\")");
/* 24 */       HttpResponse<byte> httpResponse = GrazieJdkHTTPClient.this.delegate.send(GrazieJdkHTTPClient.this.append(HttpRequest.newBuilder(new URI(this.$url)).header("Content-Type", "application/json"), this.$options.getHeaders())
/* 25 */           .timeout(GrazieJdkHTTPClient.this.timeout)
/* 26 */           .POST(HttpRequest.BodyPublishers.ofByteArray(this.$content)).build(), 
/* 27 */           (HttpResponse.BodyHandler)HttpResponse.BodyHandlers.ofByteArray());
/*    */       Intrinsics.checkNotNullExpressionValue(httpResponse, "delegate.send(\n         …ByteArray()\n            )");
/*    */       return (HttpResponse)httpResponse; } GrazieJdkHTTPClient$send$1(String $url, RequestOptions $options, byte[] $content) {
/*    */       super(0);
/*    */     } } @NotNull
/*    */   public HTTPResponse send(@NotNull String url, @NotNull RequestOptions options) {
/* 33 */     Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(options, "options"); return handle(new GrazieJdkHTTPClient$send$2(url, options)); }
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\020\022\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Ljava/net/http/HttpResponse;", "", "invoke"})
/* 35 */   static final class GrazieJdkHTTPClient$send$2 extends Lambda implements Function0<HttpResponse<byte[]>> { public final HttpResponse<byte[]> invoke() { Intrinsics.checkNotNullExpressionValue(HttpRequest.newBuilder(new URI(this.$url)), "newBuilder(URI(url))");
/* 36 */       HttpResponse<byte> httpResponse = GrazieJdkHTTPClient.this.delegate.send(GrazieJdkHTTPClient.this.append(HttpRequest.newBuilder(new URI(this.$url)), this.$options.getHeaders())
/* 37 */           .timeout(GrazieJdkHTTPClient.this.timeout)
/* 38 */           .POST(HttpRequest.BodyPublishers.ofString("")).build(), 
/* 39 */           (HttpResponse.BodyHandler)HttpResponse.BodyHandlers.ofByteArray());
/*    */       Intrinsics.checkNotNullExpressionValue(httpResponse, "delegate.send(\n         …ByteArray()\n            )");
/*    */       return (HttpResponse)httpResponse; } GrazieJdkHTTPClient$send$2(String $url, RequestOptions $options) {
/*    */       super(0);
/*    */     } } @NotNull
/*    */   public HTTPResponse send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options) {
/* 45 */     Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(options, "options"); throw new IllegalStateException("That client does not support Multipart".toString());
/*    */   }
/*    */   
/*    */   @NotNull
/* 49 */   public HTTPResponse get(@NotNull String url, @NotNull RequestOptions options) { Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(options, "options"); return handle(new GrazieJdkHTTPClient$get$1(url, options)); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\020\022\n\000\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "Ljava/net/http/HttpResponse;", "", "invoke"})
/*    */   static final class GrazieJdkHTTPClient$get$1 extends Lambda implements Function0<HttpResponse<byte[]>> { public final HttpResponse<byte[]> invoke() {
/* 51 */       Intrinsics.checkNotNullExpressionValue(HttpRequest.newBuilder(new URI(this.$url)), "newBuilder(URI(url))");
/* 52 */       HttpResponse<byte> httpResponse = GrazieJdkHTTPClient.this.delegate.send(GrazieJdkHTTPClient.this.append(HttpRequest.newBuilder(new URI(this.$url)), this.$options.getHeaders())
/* 53 */           .timeout(GrazieJdkHTTPClient.this.timeout)
/* 54 */           .GET().build(), 
/* 55 */           (HttpResponse.BodyHandler)HttpResponse.BodyHandlers.ofByteArray());
/*    */       Intrinsics.checkNotNullExpressionValue(httpResponse, "delegate.send(\n         …ByteArray()\n            )");
/*    */       return (HttpResponse)httpResponse;
/*    */     }
/*    */ 
/*    */     
/*    */     GrazieJdkHTTPClient$get$1(String $url, RequestOptions $options) {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */   
/*    */   private final HTTPResponse handle(Function0 body) {
/*    */     // Byte code:
/*    */     //   0: nop
/*    */     //   1: aload_1
/*    */     //   2: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   7: checkcast java/net/http/HttpResponse
/*    */     //   10: astore_2
/*    */     //   11: aload_2
/*    */     //   12: invokeinterface statusCode : ()I
/*    */     //   17: istore_3
/*    */     //   18: nop
/*    */     //   19: sipush #200
/*    */     //   22: iload_3
/*    */     //   23: if_icmpgt -> 41
/*    */     //   26: iload_3
/*    */     //   27: sipush #300
/*    */     //   30: if_icmpge -> 37
/*    */     //   33: iconst_1
/*    */     //   34: goto -> 42
/*    */     //   37: iconst_0
/*    */     //   38: goto -> 42
/*    */     //   41: iconst_0
/*    */     //   42: ifeq -> 86
/*    */     //   45: new ai/grazie/client/common/model/HTTPResponse
/*    */     //   48: dup
/*    */     //   49: getstatic ai/grazie/model/cloud/HeaderCollection.Companion : Lai/grazie/model/cloud/HeaderCollection$Companion;
/*    */     //   52: aload_2
/*    */     //   53: invokeinterface headers : ()Ljava/net/http/HttpHeaders;
/*    */     //   58: invokevirtual map : ()Ljava/util/Map;
/*    */     //   61: dup
/*    */     //   62: ldc 'response.headers().map()'
/*    */     //   64: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   67: invokestatic of : (Lai/grazie/model/cloud/HeaderCollection$Companion;Ljava/util/Map;)Lai/grazie/model/cloud/HeaderCollection;
/*    */     //   70: iload_3
/*    */     //   71: aload_2
/*    */     //   72: invokeinterface body : ()Ljava/lang/Object;
/*    */     //   77: checkcast [B
/*    */     //   80: invokespecial <init> : (Lai/grazie/model/cloud/HeaderCollection;I[B)V
/*    */     //   83: goto -> 120
/*    */     //   86: getstatic ai/grazie/model/cloud/exceptions/HTTPStatusException.Companion : Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;
/*    */     //   89: iload_3
/*    */     //   90: getstatic ai/grazie/model/cloud/HeaderCollection.Companion : Lai/grazie/model/cloud/HeaderCollection$Companion;
/*    */     //   93: aload_2
/*    */     //   94: invokeinterface headers : ()Ljava/net/http/HttpHeaders;
/*    */     //   99: invokevirtual map : ()Ljava/util/Map;
/*    */     //   102: dup
/*    */     //   103: ldc 'response.headers().map()'
/*    */     //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   108: invokestatic of : (Lai/grazie/model/cloud/HeaderCollection$Companion;Ljava/util/Map;)Lai/grazie/model/cloud/HeaderCollection;
/*    */     //   111: aconst_null
/*    */     //   112: aconst_null
/*    */     //   113: bipush #8
/*    */     //   115: aconst_null
/*    */     //   116: invokestatic from$default : (Lai/grazie/model/cloud/exceptions/HTTPStatusException$Companion;ILai/grazie/model/cloud/HeaderCollection;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Lai/grazie/model/cloud/exceptions/HTTPStatusException;
/*    */     //   119: athrow
/*    */     //   120: astore_2
/*    */     //   121: goto -> 138
/*    */     //   124: astore_3
/*    */     //   125: new ai/grazie/model/cloud/exceptions/HTTPConnectionError
/*    */     //   128: dup
/*    */     //   129: aconst_null
/*    */     //   130: aload_3
/*    */     //   131: checkcast java/lang/Throwable
/*    */     //   134: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   137: athrow
/*    */     //   138: aload_2
/*    */     //   139: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #61	-> 0
/*    */     //   #62	-> 1
/*    */     //   #63	-> 11
/*    */     //   #64	-> 18
/*    */     //   #65	-> 19
/*    */     //   #66	-> 86
/*    */     //   #68	-> 124
/*    */     //   #69	-> 125
/*    */     //   #61	-> 139
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   11	109	2	response	Ljava/net/http/HttpResponse;
/*    */     //   18	102	3	code	I
/*    */     //   125	13	3	e	Ljava/io/IOException;
/*    */     //   0	140	0	this	Lai/grazie/client/jdk/GrazieJdkHTTPClient;
/*    */     //   0	140	1	body	Lkotlin/jvm/functions/Function0;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   0	121	124	java/io/IOException
/*    */   }
/*    */   
/*    */   private final HttpRequest.Builder append(HttpRequest.Builder $this$append, HeaderCollection headers) {
/*    */     String[] arrayOfString;
/*    */     byte b;
/*    */     int i;
/* 74 */     for (arrayOfString = headers.getKeys(), b = 0, i = arrayOfString.length; b < i; ) { String key = arrayOfString[b];
/* 75 */       if (headers.get(key) == null) { headers.get(key); }
/* 76 */       else { String[] values; byte b1; int j; for (b1 = 0, j = values.length; b1 < j; ) { String value = values[b1];
/* 77 */           $this$append.header(key, value); b1++; }
/*    */          }
/*    */        b++; }
/* 80 */      return $this$append;
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/client/jdk/GrazieJdkHTTPClient$Companion;", "", "()V", "Default", "Lai/grazie/client/jdk/GrazieJdkHTTPClient;", "getDefault", "()Lai/grazie/client/jdk/GrazieJdkHTTPClient;", "client-common"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 84 */     public final GrazieJdkHTTPClient getDefault() { return GrazieJdkHTTPClient.Default; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final HttpClient delegate; @NotNull private final Duration timeout; @NotNull private static final GrazieJdkHTTPClient Default = new GrazieJdkHTTPClient(HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build(), null, 2, null); static { Intrinsics.checkNotNullExpressionValue(HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10L)).build(), "newBuilder().connectTime…on.ofSeconds(10)).build()"); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\jdk\GrazieJdkHTTPClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */