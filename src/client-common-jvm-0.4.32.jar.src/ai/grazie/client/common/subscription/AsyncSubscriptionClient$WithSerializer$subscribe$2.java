/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "AsyncSubscriptionClient.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.AsyncSubscriptionClient$WithSerializer$subscribe$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\002\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\0022\006\020\003\032\0020\004H@"}, d2 = {"<anonymous>", "", "E", "it", ""})
/*    */ final class AsyncSubscriptionClient$WithSerializer$subscribe$2
/*    */   extends SuspendLambda
/*    */   implements Function2<String, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   AsyncSubscriptionClient$WithSerializer$subscribe$2(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     String it;
/* 29 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (String)this.L$0;
/* 30 */         AsyncSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncSubscriptionClient.WithSerializer.this.getSerializer(), it);
/* 31 */         return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super AsyncSubscriptionClient$WithSerializer$subscribe$2> $completion) {
/*    */     AsyncSubscriptionClient$WithSerializer$subscribe$2 asyncSubscriptionClient$WithSerializer$subscribe$2 = new AsyncSubscriptionClient$WithSerializer$subscribe$2($completion);
/*    */     asyncSubscriptionClient$WithSerializer$subscribe$2.L$0 = value;
/*    */     return (Continuation<Unit>)asyncSubscriptionClient$WithSerializer$subscribe$2;
/*    */   }
/*    */   
/*    */   public final Object invoke(String p1, Continuation<?> p2) {
/*    */     return ((AsyncSubscriptionClient$WithSerializer$subscribe$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\subscription\AsyncSubscriptionClient$WithSerializer$subscribe$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */