/*    */ package ai.grazie.utils.http.stream;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.Boxing;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @DebugMetadata(f = "SSEStreamReader.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.utils.http.stream.SSEStreamReader$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/model/cloud/sse/ServerSentEvent;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<ServerSentEvent, Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 39 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(false); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(ServerSentEvent p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-ktor-jvm-0.4.32.jar!\ai\grazi\\utils\http\stream\SSEStreamReader$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */