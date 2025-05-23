/*    */ package ai.grazie.client.common.external;
/*    */ 
/*    */ import ai.grazie.model.cloud.TypeInfo;
/*    */ import ai.grazie.model.cloud.TypedExternalApi;
/*    */ import ai.grazie.model.cloud.exceptions.JsonBodyException;
/*    */ import ai.grazie.model.cloud.sse.ServerSentEvent;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ @DebugMetadata(f = "ExternalApiClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.external.ExternalApiClient$receiveContinuousSSE$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\000\n\002\020\000\n\002\030\002\n\002\030\002\n\000\n\002\020\003\020\000\032\0020\001\"\b\b\000\020\002*\0020\003*\b\022\004\022\0020\0050\0042\006\020\006\032\0020\007H@"}, d2 = {"<anonymous>", "", "Request", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lai/grazie/model/cloud/sse/ServerSentEvent;", "it", ""})
/*    */ final class ExternalApiClient$receiveContinuousSSE$2
/*    */   extends SuspendLambda
/*    */   implements Function3<FlowCollector<? super ServerSentEvent>, Throwable, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   ExternalApiClient$receiveContinuousSSE$2(ExternalApiClient $receiver, Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Throwable it;
/*    */     TypeInfo exceptionBodyType;
/* 65 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Throwable)this.L$0;
/* 66 */         exceptionBodyType = this.$api.getExceptionBodyType();
/* 67 */         if (exceptionBodyType == null) {
/* 68 */           throw it;
/*    */         }
/* 70 */         if (it instanceof JsonBodyException.Unknown) {
/* 71 */           ExternalApiClient.access$throwDetailedException(ExternalApiClient.this, exceptionBodyType, (JsonBodyException.Unknown)it); throw new KotlinNothingValueException();
/*    */         } 
/* 73 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(FlowCollector p1, Throwable p2, Continuation<? super ExternalApiClient$receiveContinuousSSE$2> p3) {
/*    */     ExternalApiClient$receiveContinuousSSE$2 externalApiClient$receiveContinuousSSE$2 = new ExternalApiClient$receiveContinuousSSE$2(ExternalApiClient.this, p3);
/*    */     externalApiClient$receiveContinuousSSE$2.L$0 = p2;
/*    */     return externalApiClient$receiveContinuousSSE$2.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\external\ExternalApiClient$receiveContinuousSSE$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */