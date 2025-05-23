/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.manager.JunieAiaActivationManager;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.CoroutineContext;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.CoroutineScopeKt;
/*    */ import kotlinx.coroutines.SupervisorKt;
/*    */ import kotlinx.coroutines.channels.ProduceKt;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import kotlinx.coroutines.flow.StateFlow;
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
/*    */ @DebugMetadata(f = "GrazieAuthFacade.kt", l = {60}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.GrazieAuthFacade$activationState$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;"})
/*    */ final class GrazieAuthFacade$activationState$1$1
/*    */   extends SuspendLambda
/*    */   implements Function2<ProducerScope<? super AiaActivation>, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieAuthFacade$activationState$1$1(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     ProducerScope<? super AiaActivation> $this$channelFlow;
/*    */     CoroutineScope subScope;
/*    */     StateFlow secondStateFlow;
/* 51 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$channelFlow = (ProducerScope)this.L$0;
/* 52 */         GrazieAuthFacadeKt.access$getLog$p().debug("Composing new activation flow");
/* 53 */         subScope = CoroutineScopeKt.CoroutineScope($this$channelFlow.getCoroutineContext().plus((CoroutineContext)SupervisorKt.SupervisorJob$default(null, 1, null)));
/* 54 */         secondStateFlow = JunieAiaActivationManager.Companion.syncInstance().createActivationState(subScope);
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 59 */         FlowKt.launchIn(FlowKt.onEach((Flow)secondStateFlow, new Function2<AiaActivation, Continuation<? super Unit>, Object>($this$channelFlow, null) { int label; public final Object invokeSuspend(Object $result) { AiaActivation it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (AiaActivation)this.L$0; this.label = 1; if (this.$$this$channelFlow.send(it, (Continuation)this) == object) return object;  this.$$this$channelFlow.send(it, (Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<AiaActivation, Continuation<? super Unit>, Object> function2 = new Function2<>(this.$$this$channelFlow, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(AiaActivation p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }), subScope);
/* 60 */         this.label = 1; if (ProduceKt.awaitClose($this$channelFlow, new Function0<Unit>(subScope) {
/* 61 */               public final void invoke() { GrazieAuthFacadeKt.access$getLog$p().debug("Activation flow closed");
/* 62 */                 CoroutineScopeKt.cancel$default(this.$subScope, null, 1, null); } }(Continuation)this) == object) return object;  ProduceKt.awaitClose($this$channelFlow, new Function0<Unit>(subScope) { public final void invoke() { GrazieAuthFacadeKt.access$getLog$p().debug("Activation flow closed"); CoroutineScopeKt.cancel$default(this.$subScope, null, 1, null); } }
/*    */             (Continuation)this);
/* 64 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super GrazieAuthFacade$activationState$1$1> $completion) {
/*    */     GrazieAuthFacade$activationState$1$1 grazieAuthFacade$activationState$1$1 = new GrazieAuthFacade$activationState$1$1($completion);
/*    */     grazieAuthFacade$activationState$1$1.L$0 = value;
/*    */     return (Continuation<Unit>)grazieAuthFacade$activationState$1$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */     return ((GrazieAuthFacade$activationState$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\GrazieAuthFacade$activationState$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */