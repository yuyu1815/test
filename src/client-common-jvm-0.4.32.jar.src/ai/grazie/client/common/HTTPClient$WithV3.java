/*    */ package ai.grazie.client.common;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\022\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\001\022\006\020\003\032\0020\004¢\006\002\020\005J\030\020\b\032\0020\t2\006\020\n\032\0020\0042\006\020\013\032\0020\fH\026J \020\r\032\0020\t2\006\020\n\032\0020\0042\006\020\016\032\0020\0172\006\020\013\032\0020\fH\026J\030\020\r\032\0020\t2\006\020\n\032\0020\0042\006\020\013\032\0020\fH\026J \020\r\032\0020\t2\006\020\n\032\0020\0042\006\020\016\032\0020\0202\006\020\013\032\0020\fH\026R\016\020\002\032\0020\001X\004¢\006\002\n\000R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lai/grazie/client/common/HTTPClient$WithV3;", "Lai/grazie/client/common/HTTPClient;", "client", "token", "", "(Lai/grazie/client/common/HTTPClient;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "options", "Lai/grazie/client/common/model/RequestOptions;", "send", "content", "Lai/grazie/client/common/model/Multipart;", "", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nHTTPClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HTTPClient.kt\nai/grazie/client/common/HTTPClient$WithV3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/*    */ public final class WithV3 implements HTTPClient { @NotNull
/*    */   private final HTTPClient client;
/*    */   
/*  7 */   public WithV3(@NotNull HTTPClient client, @NotNull String token) { this.client = client; this.token = token; } @NotNull private final String token; @NotNull public final String getToken() { return this.token; }
/*    */   @NotNull
/*  9 */   public HTTPResponse send(@NotNull String url, @NotNull byte[] content, @NotNull RequestOptions options) { Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(options, "options"); RequestOptions requestOptions1 = options, requestOptions2 = requestOptions1;
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
/* 36 */     byte[] arrayOfByte = content; String str = url; HTTPClient hTTPClient = this.client; int $i$a$-also-HTTPClient$WithV3$send$1 = 0; requestOptions2.getHeaders().add("Grazie-Authenticate-JWT", this.token); Unit unit = Unit.INSTANCE; return hTTPClient.send(str, arrayOfByte, requestOptions1); } @NotNull public HTTPResponse send(@NotNull String url, @NotNull Multipart content, @NotNull RequestOptions options) { Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(options, "options"); RequestOptions requestOptions1 = options, requestOptions2 = requestOptions1; Multipart multipart = content; String str = url; HTTPClient hTTPClient = this.client; int $i$a$-also-HTTPClient$WithV3$send$2 = 0; requestOptions2.getHeaders().add("Grazie-Authenticate-JWT", this.token); Unit unit = Unit.INSTANCE; return hTTPClient.send(str, multipart, requestOptions1); } @NotNull public HTTPResponse send(@NotNull String url, @NotNull RequestOptions options) { Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(options, "options"); RequestOptions requestOptions1 = options, requestOptions2 = requestOptions1; String str = url; HTTPClient hTTPClient = this.client; int $i$a$-also-HTTPClient$WithV3$send$3 = 0; requestOptions2.getHeaders().add("Grazie-Authenticate-JWT", this.token); Unit unit = Unit.INSTANCE; return hTTPClient.send(str, requestOptions1); } @NotNull public HTTPResponse get(@NotNull String url, @NotNull RequestOptions options) { Intrinsics.checkNotNullParameter(url, "url"); Intrinsics.checkNotNullParameter(options, "options"); RequestOptions requestOptions1 = options, requestOptions2 = requestOptions1; String str = url; HTTPClient hTTPClient = this.client; int $i$a$-also-HTTPClient$WithV3$get$1 = 0;
/*    */     requestOptions2.getHeaders().add("Grazie-Authenticate-JWT", this.token);
/*    */     Unit unit = Unit.INSTANCE;
/*    */     return hTTPClient.get(str, requestOptions1); }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\HTTPClient$WithV3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */