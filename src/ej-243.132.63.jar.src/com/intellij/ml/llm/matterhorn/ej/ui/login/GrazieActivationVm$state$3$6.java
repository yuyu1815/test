/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiEnterpriseActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpHandle;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ final class GrazieActivationVm$state$3$6
/*     */   implements Function0<Unit>
/*     */ {
/*     */   public final void invoke() {
/* 106 */     Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiEnterpriseActivation"); if (((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep() != null && ((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep().getOnFetchCapabilities() != null) { (OpHandle)((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep().getOnFetchCapabilities().invoke(); } else { ((AiEnterpriseActivation)this.$activation).getCompatibilityCheckStep().getOnFetchCapabilities(); }
/*     */   
/*     */   }
/*     */   
/*     */   GrazieActivationVm$state$3$6(AiaActivation $activation) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm$state$3$6.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */