/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.login;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseRequestFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpHandle;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class GrazieActivationVm$state$3$12
/*     */   implements Function0<OpHandle<? extends AipLicenseRequestFailure>>
/*     */ {
/*     */   public final OpHandle<AipLicenseRequestFailure> invoke() {
/* 185 */     Intrinsics.checkNotNull(this.$activation, "null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.activation.state.model.AiProJbaActivation"); if (((AiProJbaActivation)this.$activation).getLicenseJourney() == null || ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep() == null || ((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested() == null || (OpHandle<AipLicenseRequestFailure>)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested().invoke() == null) { (OpHandle<AipLicenseRequestFailure>)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested().invoke(); throw new IllegalStateException(
/* 186 */           "Required step is null".toString()); }
/*     */     
/*     */     return (OpHandle<AipLicenseRequestFailure>)((AiProJbaActivation)this.$activation).getLicenseJourney().getLicenseFetchStep().getOnTrialRequested().invoke();
/*     */   }
/*     */   
/*     */   GrazieActivationVm$state$3$12(AiaActivation $activation) {}
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\GrazieActivationVm$state$3$12.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */