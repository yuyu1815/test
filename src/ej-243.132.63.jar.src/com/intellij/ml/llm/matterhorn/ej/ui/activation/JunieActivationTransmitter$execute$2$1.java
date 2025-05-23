/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ import com.intellij.ml.llm.activation.platform.JunieActivationStateListener;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.GrazieAuthContext;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.Outcome;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.flow.FlowCollector;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class null<T>
/*    */   implements FlowCollector
/*    */ {
/*    */   public final Object emit(AiaActivation activation, Continuation $completion) {
/*    */     try {
/* 33 */       GrazieAuthContext complete = (GrazieAuthContext)Outcome.getOrNull-impl(activation.getOutcome-07x5Wys());
/* 34 */       if (complete != null) {
/* 35 */         ((JunieActivationStateListener)this.$project.getMessageBus().syncPublisher(JunieActivationStateListener.Companion.getTOPIC()))
/* 36 */           .productActivationStateChanged(JunieActivationTransmitterKt.access$getSenderJunie$p(), "activation_complete");
/*    */       }
/* 38 */     } catch (Throwable th) {
/* 39 */       JunieActivationTransmitterKt.access$getLogger$p().error(th);
/*    */     } 
/* 41 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   null(Project $project) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieActivationTransmitter$execute$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */