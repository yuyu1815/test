/*    */ package ai.grazie.client.common.subscription;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "AsyncDispatchableSubscriptionClient.kt", l = {35}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "ai.grazie.client.common.subscription.AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2")
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\b\004\n\002\020\016\020\000\032\0020\001\"\004\b\000\020\002\"\004\b\001\020\003\"\004\b\002\020\002\"\004\b\003\020\0032\006\020\004\032\002H\0022\006\020\005\032\0020\006H@"}, d2 = {"<anonymous>", "", "Id", "E", "myId", "entity", ""})
/*    */ final class AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2
/*    */   extends SuspendLambda
/*    */   implements Function3<Id, String, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2(AsyncDispatchableSubscriptionClient.WithSerializer<Id, E> $receiver, Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Object myId;
/*    */     String entity;
/* 34 */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); myId = this.L$0; entity = (String)this.L$1;
/* 35 */         this.L$0 = null; this.label = 1; if (this.$onEntity.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this) == object1) return object1;  this.$onEntity.invoke(myId, AsyncDispatchableSubscriptionClient.WithSerializer.this.getJson().parse((DeserializationStrategy)AsyncDispatchableSubscriptionClient.WithSerializer.this.getSerializer(), entity), this);
/* 36 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(Object p1, String p2, Continuation<? super AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2> p3) {
/*    */     AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2 asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2 = new AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2(AsyncDispatchableSubscriptionClient.WithSerializer.this, p3);
/*    */     asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2.L$0 = p1;
/*    */     asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2.L$1 = p2;
/*    */     return asyncDispatchableSubscriptionClient$WithSerializer$subscribe$2.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\subscription\AsyncDispatchableSubscriptionClient$WithSerializer$subscribe$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */