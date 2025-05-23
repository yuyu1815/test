/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.ui.JBAccountInfoService;
/*     */ import com.intellij.util.messages.SimpleMessageBusConnection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @DebugMetadata(f = "JunieJbaUserRepository.kt", l = {114}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryKt$jbaAuthUpdates$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\n\022\006\022\004\030\0010\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ui/JBAccountInfoService$JBAData;"})
/*     */ final class JunieJbaUserRepositoryKt$jbaAuthUpdates$1
/*     */   extends SuspendLambda
/*     */   implements Function2<ProducerScope<? super JBAccountInfoService.JBAData>, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   JunieJbaUserRepositoryKt$jbaAuthUpdates$1(ComponentManager $receiver, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     ProducerScope $this$callbackFlow;
/*     */     SimpleMessageBusConnection connection;
/* 109 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$callbackFlow = (ProducerScope)this.L$0;
/* 110 */         connection = this.$this_jbaAuthUpdates.getMessageBus().connect((CoroutineScope)$this$callbackFlow);
/* 111 */         Intrinsics.checkNotNullExpressionValue(JBAccountInfoService.AuthStateListener.TOPIC, "TOPIC"); connection.subscribe(JBAccountInfoService.AuthStateListener.TOPIC, $this$callbackFlow::invokeSuspend$lambda$0);
/*     */ 
/*     */         
/* 114 */         this.label = 1; if (ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$1, (Continuation)this) == object) return object;  ProduceKt.awaitClose($this$callbackFlow, connection::invokeSuspend$lambda$1, (Continuation)this);
/* 115 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super JunieJbaUserRepositoryKt$jbaAuthUpdates$1> $completion) {
/*     */     JunieJbaUserRepositoryKt$jbaAuthUpdates$1 junieJbaUserRepositoryKt$jbaAuthUpdates$1 = new JunieJbaUserRepositoryKt$jbaAuthUpdates$1(this.$this_jbaAuthUpdates, $completion);
/*     */     junieJbaUserRepositoryKt$jbaAuthUpdates$1.L$0 = value;
/*     */     return (Continuation<Unit>)junieJbaUserRepositoryKt$jbaAuthUpdates$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */     return ((JunieJbaUserRepositoryKt$jbaAuthUpdates$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final void invokeSuspend$lambda$0(ProducerScope $$this$callbackFlow, JBAccountInfoService.JBAData authState) {
/*     */     $$this$callbackFlow.trySend-JP2dKIU(authState);
/*     */   }
/*     */   
/*     */   private static final Unit invokeSuspend$lambda$1(SimpleMessageBusConnection $connection) {
/*     */     $connection.disconnect();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepositoryKt$jbaAuthUpdates$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */