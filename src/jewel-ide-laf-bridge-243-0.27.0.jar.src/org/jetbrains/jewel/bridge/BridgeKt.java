/*    */ package org.jetbrains.jewel.bridge;
/*    */ import com.intellij.openapi.application.Application;
/*    */ import com.intellij.util.messages.SimpleMessageBusConnection;
/*    */ import com.intellij.util.messages.Topic;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.SharingStarted;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000D\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\032\032\020\004\032\b\022\004\022\0020\0060\005*\0020\0012\006\020\007\032\0020\bH\002\032$\020\t\032\b\022\004\022\0020\0060\005*\0020\0012\006\020\007\032\0020\b2\b\b\002\020\n\032\0020\013H\000\032W\020\f\032\b\022\004\022\002H\r0\005\"\b\b\000\020\016*\0020\017\"\004\b\001\020\r*\0020\0202\f\020\021\032\b\022\004\022\002H\0160\0222\006\020\023\032\0020\b2\035\020\024\032\031\022\n\022\b\022\004\022\002H\r0\026\022\004\022\002H\0160\025¢\006\002\b\027H\000\"\024\020\000\032\0020\0018@X\004¢\006\006\032\004\b\002\020\003¨\006\030"}, d2 = {"IntelliJApplication", "Lcom/intellij/openapi/application/Application;", "getIntelliJApplication", "()Lcom/intellij/openapi/application/Application;", "lookAndFeelFlow", "Lkotlinx/coroutines/flow/Flow;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "lookAndFeelChangedFlow", "sharingStarted", "Lkotlinx/coroutines/flow/SharingStarted;", "flow", "K", "L", "", "Lcom/intellij/util/messages/MessageBus;", "topic", "Lcom/intellij/util/messages/Topic;", "parentScope", "listener", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/ExtensionFunctionType;", "ide-laf-bridge"})
/*    */ public final class BridgeKt {
/*    */   @NotNull
/*    */   public static final Application getIntelliJApplication() {
/* 19 */     Intrinsics.checkNotNullExpressionValue(ApplicationManager.getApplication(), "getApplication(...)"); return ApplicationManager.getApplication();
/*    */   }
/*    */   
/* 22 */   private static final Flow<Unit> lookAndFeelFlow(Application $this$lookAndFeelFlow, CoroutineScope scope) { Intrinsics.checkNotNullExpressionValue($this$lookAndFeelFlow.getMessageBus(), "getMessageBus(...)"); Intrinsics.checkNotNullExpressionValue(LafManagerListener.TOPIC, "TOPIC"); return flow($this$lookAndFeelFlow.getMessageBus(), LafManagerListener.TOPIC, scope, BridgeKt::lookAndFeelFlow$lambda$1); } private static final void lookAndFeelFlow$lambda$1$lambda$0(ProducerScope $this_flow, LafManager it) { Intrinsics.checkNotNullParameter(it, "it"); $this_flow.trySend-JP2dKIU(Unit.INSTANCE); } private static final LafManagerListener lookAndFeelFlow$lambda$1(ProducerScope $this$flow) { Intrinsics.checkNotNullParameter($this$flow, "$this$flow"); return $this$flow::lookAndFeelFlow$lambda$1$lambda$0; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Flow<Unit> lookAndFeelChangedFlow(@NotNull Application $this$lookAndFeelChangedFlow, @NotNull CoroutineScope scope, @NotNull SharingStarted sharingStarted) {
/* 27 */     Intrinsics.checkNotNullParameter($this$lookAndFeelChangedFlow, "<this>"); Intrinsics.checkNotNullParameter(scope, "scope"); Intrinsics.checkNotNullParameter(sharingStarted, "sharingStarted"); return (Flow<Unit>)FlowKt.shareIn(FlowKt.onStart(lookAndFeelFlow($this$lookAndFeelChangedFlow, scope), new BridgeKt$lookAndFeelChangedFlow$1(null)), scope, sharingStarted, 1); } @DebugMetadata(f = "Bridge.kt", l = {27}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.BridgeKt$lookAndFeelChangedFlow$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0010\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;"}) static final class BridgeKt$lookAndFeelChangedFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> { int label; BridgeKt$lookAndFeelChangedFlow$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { FlowCollector $this$onStart; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$onStart = (FlowCollector)this.L$0; this.label = 1; if ($this$onStart.emit(Unit.INSTANCE, (Continuation)this) == object) return object;  $this$onStart.emit(Unit.INSTANCE, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super BridgeKt$lookAndFeelChangedFlow$1> $completion) { BridgeKt$lookAndFeelChangedFlow$1 bridgeKt$lookAndFeelChangedFlow$1 = new BridgeKt$lookAndFeelChangedFlow$1($completion);
/*    */       bridgeKt$lookAndFeelChangedFlow$1.L$0 = value;
/*    */       return (Continuation<Unit>)bridgeKt$lookAndFeelChangedFlow$1; }
/*    */     public final Object invoke(FlowCollector p1, Continuation<?> p2) { return ((BridgeKt$lookAndFeelChangedFlow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*    */   @NotNull
/* 33 */   public static final <L, K> Flow<K> flow(@NotNull MessageBus $this$flow, @NotNull Topic<L> topic, @NotNull CoroutineScope parentScope, @NotNull Function1<? super ProducerScope<? super K>, ? extends L> listener) { Intrinsics.checkNotNullParameter($this$flow, "<this>"); Intrinsics.checkNotNullParameter(topic, "topic"); Intrinsics.checkNotNullParameter(parentScope, "parentScope"); Intrinsics.checkNotNullParameter(listener, "listener"); return FlowKt.callbackFlow(new BridgeKt$flow$1($this$flow, parentScope, topic, listener, null)); } @DebugMetadata(f = "Bridge.kt", l = {36}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.jewel.bridge.BridgeKt$flow$1") @Metadata(mv = {2, 0, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\001\"\004\b\000\020\002*\b\022\004\022\002H\0020\003H\n"}, d2 = {"<anonymous>", "", "K", "Lkotlinx/coroutines/channels/ProducerScope;"}) static final class BridgeKt$flow$1 extends SuspendLambda implements Function2<ProducerScope<? super K>, Continuation<? super Unit>, Object> { int label; public final Object invokeSuspend(Object $result) { ProducerScope $this$callbackFlow; SimpleMessageBusConnection connection; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$callbackFlow = (ProducerScope)this.L$0;
/* 34 */           connection = this.$this_flow.connect(this.$parentScope);
/* 35 */           connection.subscribe(this.$topic, this.$listener.invoke($this$callbackFlow));
/* 36 */           this.label = 1; if (ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this);
/* 37 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*    */ 
/*    */     
/*    */     BridgeKt$flow$1(MessageBus $receiver, CoroutineScope $parentScope, Topic<L> $topic, Function1<ProducerScope<? super K>, L> $listener, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/*    */     public final Continuation<Unit> create(Object value, Continuation<? super BridgeKt$flow$1> $completion) {
/*    */       BridgeKt$flow$1 bridgeKt$flow$1 = new BridgeKt$flow$1(this.$this_flow, this.$parentScope, this.$topic, this.$listener, $completion);
/*    */       bridgeKt$flow$1.L$0 = value;
/*    */       return (Continuation<Unit>)bridgeKt$flow$1;
/*    */     }
/*    */     
/*    */     public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */       return ((BridgeKt$flow$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */     
/*    */     private static final Unit invokeSuspend$lambda$0(SimpleMessageBusConnection $connection) {
/*    */       $connection.disconnect();
/*    */       return Unit.INSTANCE;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\BridgeKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */