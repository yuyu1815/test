/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ import com.intellij.ml.llm.activation.platform.JunieActivationStateListener;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.GrazieAuthContext;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
/*    */ import kotlinx.coroutines.flow.StateFlow;
/*    */ 
/*    */ @DebugMetadata(f = "JunieActivationTransmitter.kt", l = {31}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieActivationTransmitter$execute$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class JunieActivationTransmitter$execute$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*    */   int label;
/*    */   
/*    */   JunieActivationTransmitter$execute$2(JunieGrazieLLMProxy $grazieLLMProxy, Project $project, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     StateFlow<AiaActivation> activationState;
/* 29 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 30 */         activationState = this.$grazieLLMProxy.getAuthService().getAuthFacade().getActivationState();
/* 31 */         this.label = 1; if (activationState.collect(new FlowCollector(this.$project) {
/*    */               public final Object emit(AiaActivation activation, Continuation $completion) { try {
/* 33 */                   GrazieAuthContext complete = (GrazieAuthContext)Outcome.getOrNull-impl(activation.getOutcome-07x5Wys());
/* 34 */                   if (complete != null) {
/* 35 */                     ((JunieActivationStateListener)this.$project.getMessageBus().syncPublisher(JunieActivationStateListener.Companion.getTOPIC()))
/* 36 */                       .productActivationStateChanged(JunieActivationTransmitterKt.access$getSenderJunie$p(), "activation_complete");
/*    */                   }
/* 38 */                 } catch (Throwable th) {
/* 39 */                   JunieActivationTransmitterKt.access$getLogger$p().error(th);
/*    */                 } 
/* 41 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  activationState.collect(new FlowCollector(this.$project) { public final Object emit(AiaActivation activation, Continuation $completion) { try { GrazieAuthContext complete = (GrazieAuthContext)Outcome.getOrNull-impl(activation.getOutcome-07x5Wys()); if (complete != null) ((JunieActivationStateListener)this.$project.getMessageBus().syncPublisher(JunieActivationStateListener.Companion.getTOPIC())).productActivationStateChanged(JunieActivationTransmitterKt.access$getSenderJunie$p(), "activation_complete");  } catch (Throwable th) { JunieActivationTransmitterKt.access$getLogger$p().error(th); }  return Unit.INSTANCE; }
/*    */                }
/*    */             (Continuation)this);
/*    */         throw new KotlinNothingValueException();
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         throw new KotlinNothingValueException(); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super JunieActivationTransmitter$execute$2> $completion) {
/*    */     return (Continuation<Unit>)new JunieActivationTransmitter$execute$2(this.$grazieLLMProxy, this.$project, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((JunieActivationTransmitter$execute$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieActivationTransmitter$execute$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */