/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpHandle;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class GrazieActivationVm$state$3$1
/*    */   implements Function0<Unit>
/*    */ {
/*    */   public final void invoke() {
/* 76 */     Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation"); if (((AiProJbaActivation)this.$activation).getLicenseJourney() != null && ((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementLoadStep() != null) { (OpHandle)((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementLoadStep().getOnLoadRequested().invoke(); } else { ((AiProJbaActivation)this.$activation).getLicenseJourney().getAgreementLoadStep(); }
/*    */   
/*    */   }
/*    */   
/*    */   GrazieActivationVm$state$3$1(AiaActivation $activation) {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm$state$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */