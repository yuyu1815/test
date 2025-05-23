/*    */ package com.intellij.ml.llm.matterhorn.activation.platform.util;
/*    */ 
/*    */ import com.intellij.ide.plugins.DynamicPluginListener;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import com.intellij.openapi.application.ApplicationManager;
/*    */ import com.intellij.util.messages.SimpleMessageBusConnection;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.channels.ProduceKt;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ 
/*    */ @DebugMetadata(f = "service.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.platform.util.ServiceKt$dynamicPluginEvents$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;"})
/*    */ final class ServiceKt$dynamicPluginEvents$1
/*    */   extends SuspendLambda
/*    */   implements Function2<ProducerScope<? super IdeaPluginDescriptor>, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   ServiceKt$dynamicPluginEvents$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ProducerScope<? super IdeaPluginDescriptor> $this$callbackFlow;
/*    */     SimpleMessageBusConnection connection;
/* 34 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$callbackFlow = (ProducerScope)this.L$0;
/* 35 */         connection = ApplicationManager.getApplication().getMessageBus().connect((CoroutineScope)$this$callbackFlow);
/* 36 */         connection.subscribe(DynamicPluginListener.TOPIC, new DynamicPluginListener($this$callbackFlow) {
/* 37 */               public void pluginLoaded(IdeaPluginDescriptor pluginDescriptor) { Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); onEvent(pluginDescriptor); } public void pluginUnloaded(IdeaPluginDescriptor pluginDescriptor, boolean isUpdate) {
/* 38 */                 Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); onEvent(pluginDescriptor);
/*    */               }
/*    */               private final void onEvent(IdeaPluginDescriptor pluginDescriptor) {
/* 41 */                 this.$$this$callbackFlow.trySend-JP2dKIU(pluginDescriptor);
/*    */               }
/*    */             });
/* 44 */         this.label = 1; if (ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this) == object) return object;  ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$0, (Continuation)this);
/* 45 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super ServiceKt$dynamicPluginEvents$1> $completion) {
/*    */     ServiceKt$dynamicPluginEvents$1 serviceKt$dynamicPluginEvents$1 = new ServiceKt$dynamicPluginEvents$1($completion);
/*    */     serviceKt$dynamicPluginEvents$1.L$0 = value;
/*    */     return (Continuation<Unit>)serviceKt$dynamicPluginEvents$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */     return ((ServiceKt$dynamicPluginEvents$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(SimpleMessageBusConnection $connection) {
/*    */     $connection.disconnect();
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\ServiceKt$dynamicPluginEvents$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */