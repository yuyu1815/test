/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.util.messages.MessageBus;
/*     */ import com.intellij.util.messages.SimpleMessageBusConnection;
/*     */ import com.intellij.util.messages.Topic;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.channels.ProduceKt;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "Utils.kt", l = {220}, i = {0}, s = {"L$0"}, n = {"connection"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.UtilsKt$connectionFlow$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\n"}, d2 = {"<anonymous>", "", "K", "Lkotlinx/coroutines/channels/ProducerScope;"})
/*     */ final class UtilsKt$connectionFlow$1
/*     */   extends SuspendLambda
/*     */   implements Function2<ProducerScope<? super K>, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   UtilsKt$connectionFlow$1(Function1<ProducerScope<? super K>, T> $listenerFactory, MessageBus $receiver, Topic<T> $topic, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     ProducerScope $this$channelFlow;
/*     */     Object listener;
/*     */     SimpleMessageBusConnection connection;
/* 215 */     Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$channelFlow = (ProducerScope)this.L$0;
/* 216 */         listener = this.$listenerFactory.invoke($this$channelFlow);
/* 217 */         connection = this.$this_connectionFlow.simpleConnect();
/*     */         try {
/* 219 */           connection.subscribe(this.$topic, listener);
/* 220 */           this.L$0 = connection; this.label = 1; if (ProduceKt.awaitClose$default($this$channelFlow, null, (Continuation)this, 1, null) == object1) return object1;  ProduceKt.awaitClose$default($this$channelFlow, null, (Continuation)this, 1, null);
/*     */         } finally {
/* 222 */           connection.disconnect();
/*     */         } 
/* 224 */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         connection = (SimpleMessageBusConnection)this.L$0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         connection.disconnect(); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super UtilsKt$connectionFlow$1> $completion) {
/*     */     UtilsKt$connectionFlow$1 utilsKt$connectionFlow$1 = new UtilsKt$connectionFlow$1(this.$listenerFactory, this.$this_connectionFlow, this.$topic, $completion);
/*     */     utilsKt$connectionFlow$1.L$0 = value;
/*     */     return (Continuation<Unit>)utilsKt$connectionFlow$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */     return ((UtilsKt$connectionFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\UtilsKt$connectionFlow$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */