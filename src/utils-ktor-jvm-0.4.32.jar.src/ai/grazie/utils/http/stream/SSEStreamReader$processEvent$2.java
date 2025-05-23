/*    */ package ai.grazie.utils.http.stream;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */ final class SSEStreamReader$processEvent$2
/*    */   extends Lambda
/*    */   implements Function0<String>
/*    */ {
/*    */   SSEStreamReader$processEvent$2(ServerSentEvent $event) {
/*    */     super(0);
/*    */   }
/*    */   
/*    */   public final String invoke() {
/* 62 */     return "Empty SSE event received: " + this.$event;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\SSEStreamReader$processEvent$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */