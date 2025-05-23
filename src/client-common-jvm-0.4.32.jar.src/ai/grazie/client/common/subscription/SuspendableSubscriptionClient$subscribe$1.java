/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @DebugMetadata(f = "SuspendableSubscriptionClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.SuspendableSubscriptionClient$subscribe$1")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\020\000\032\0020\001\"\004\b\000\020\002H@"}, d2 = {"<anonymous>", "", "E"})
/*    */ final class SuspendableSubscriptionClient$subscribe$1
/*    */   extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   SuspendableSubscriptionClient$subscribe$1(Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 23 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super SuspendableSubscriptionClient$subscribe$1> $completion) {
/*    */     return (Continuation<Unit>)new SuspendableSubscriptionClient$subscribe$1($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((SuspendableSubscriptionClient$subscribe$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\subscription\SuspendableSubscriptionClient$subscribe$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */