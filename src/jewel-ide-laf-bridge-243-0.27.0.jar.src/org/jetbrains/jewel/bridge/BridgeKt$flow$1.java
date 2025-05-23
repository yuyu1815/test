/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import com.intellij.util.messages.MessageBus;
/*    */ import com.intellij.util.messages.SimpleMessageBusConnection;
/*    */ import com.intellij.util.messages.Topic;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.ProduceKt;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ 
/*    */ @DebugMetadata(f = "Bridge.kt", l = {36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.BridgeKt$flow$1")
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\n"}, d2 = {"<anonymous>", "", "K", "Lkotlinx/coroutines/channels/ProducerScope;"})
/*    */ final class BridgeKt$flow$1
/*    */   extends SuspendLambda
/*    */   implements Function2<ProducerScope<? super K>, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   BridgeKt$flow$1(MessageBus $receiver, CoroutineScope $parentScope, Topic<L> $topic, Function1<ProducerScope<? super K>, L> $listener, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ProducerScope $this$callbackFlow;
/*    */     SimpleMessageBusConnection connection;
/* 33 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$callbackFlow = (ProducerScope)this.L$0;
/* 34 */         connection = this.$this_flow.connect(this.$parentScope);
/* 35 */         connection.subscribe(this.$topic, this.$listener.invoke($this$callbackFlow));
/* 36 */         this.label = 1; if (ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this);
/* 37 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super BridgeKt$flow$1> $completion) {
/*    */     BridgeKt$flow$1 bridgeKt$flow$1 = new BridgeKt$flow$1(this.$this_flow, this.$parentScope, this.$topic, this.$listener, $completion);
/*    */     bridgeKt$flow$1.L$0 = value;
/*    */     return (Continuation<Unit>)bridgeKt$flow$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */     return ((BridgeKt$flow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(SimpleMessageBusConnection $connection) {
/*    */     $connection.disconnect();
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgeKt$flow$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */