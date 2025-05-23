/*    */ package ai.grazie.client;
/*    */ 
/*    */ import ai.grazie.client.common.HTTPClient;
/*    */ import ai.grazie.client.common.SuspendableHTTPClient;
/*    */ import ai.grazie.client.common.model.Multipart;
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000I\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002*\001\000\b\n\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ4\020\t\032\b\022\004\022\0020\0130\n2\006\020\004\032\0020\0052\006\020\f\032\0020\0052\006\020\006\032\0020\0072\006\020\r\032\0020\016H@¢\006\002\020\017J@\020\020\032\b\022\004\022\0020\0050\n2\006\020\004\032\0020\0052\006\020\f\032\0020\0052\006\020\006\032\0020\0072\022\020\021\032\016\022\004\022\0020\005\022\004\022\0020\0160\022H@¢\006\002\020\023J&\020\024\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0252\006\020\006\032\0020\007H@¢\006\002\020\026J\036\020\024\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ&\020\024\032\0020\0032\006\020\004\032\0020\0052\006\020\f\032\0020\0272\006\020\006\032\0020\007H@¢\006\002\020\030¨\006\031"}, d2 = {"ai/grazie/client/HTTPClientTransform$suspendable$1", "Lai/grazie/client/common/SuspendableHTTPClient;", "get", "Lai/grazie/client/common/model/HTTPResponse;", "url", "", "options", "Lai/grazie/client/common/model/RequestOptions;", "(Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveContinuousSSE", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "content", "reconnect", "", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveLineStream", "isLastLine", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/client/common/model/RequestOptions;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "send", "Lai/grazie/client/common/model/Multipart;", "(Ljava/lang/String;Lai/grazie/client/common/model/Multipart;Lai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;[BLai/grazie/client/common/model/RequestOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "client-common"})
/*    */ public final class HTTPClientTransform$suspendable$1 implements SuspendableHTTPClient {
/*    */   HTTPClientTransform$suspendable$1(HTTPClient $client) {}
/*    */   
/*    */   public Object send(String url, RequestOptions options, Continuation $completion) {
/* 16 */     return this.$client.send(url, options);
/*    */   } public Object send(String url, byte[] content, RequestOptions options, Continuation $completion) {
/* 18 */     return this.$client.send(url, content, options);
/*    */   } public Object send(String url, Multipart content, RequestOptions options, Continuation $completion) {
/* 20 */     return this.$client.send(url, content, options);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object receiveContinuousSSE(String url, String content, RequestOptions options, boolean reconnect, Continuation $completion) {
/* 28 */     throw new IllegalStateException("Flow is not supported for blocking client".toString());
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object receiveLineStream(String url, String content, RequestOptions options, Function1 isLastLine, Continuation $completion) {
/* 37 */     throw new IllegalStateException("Flow is not supported for blocking client".toString());
/*    */   }
/*    */   public Object get(String url, RequestOptions options, Continuation $completion) {
/* 40 */     return this.$client.get(url, options);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\HTTPClientTransform$suspendable$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */