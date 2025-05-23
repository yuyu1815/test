/*     */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.IdeLicenseAiFlag;
/*     */ import com.intellij.openapi.actionSystem.ActionManager;
/*     */ import com.intellij.openapi.actionSystem.AnAction;
/*     */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*     */ import com.intellij.openapi.actionSystem.DataContext;
/*     */ import com.intellij.openapi.actionSystem.Presentation;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.ui.LicensingFacade;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowKt;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000*\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\032\016\020\000\032\0020\001*\004\030\0010\002H\002\032\b\020\003\032\0020\004H\002\032\034\020\t\032\n\022\006\022\004\030\0010\0020\n*\0020\0132\006\020\f\032\0020\rH\002\"\024\020\005\032\0020\0068BX\004¢\006\006\032\004\b\007\020\b¨\006\016"}, d2 = {"toAiFlag", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;", "Lcom/intellij/ui/LicensingFacade;", "launchLicenseValidation", "", "licenseValidationActionDataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "getLicenseValidationActionDataContext", "()Lcom/intellij/openapi/actionSystem/DataContext;", "licensingFacadeStateIn", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/openapi/components/ComponentManager;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "data.repos"})
/*     */ public final class JunieIdeLicenseRepositoryKt
/*     */ {
/*     */   private static final IdeLicenseAiFlag toAiFlag(LicensingFacade $this$toAiFlag) {
/*  93 */     return ((($this$toAiFlag != null) ? $this$toAiFlag.licensedTo : null) == null) ? IdeLicenseAiFlag.LicenseAiUnknown : (
/*     */       
/*  95 */       ($this$toAiFlag.metadata == null || $this$toAiFlag.ai_enabled) ? IdeLicenseAiFlag.LicenseAiEnabled : 
/*  96 */       IdeLicenseAiFlag.LicenseAiDisabled);
/*     */   }
/*     */   private static final boolean launchLicenseValidation() {
/*     */     ActionManager actionManager;
/*     */     AnAction action;
/* 101 */     if (ActionManager.getInstance() == null) { ActionManager.getInstance(); return false; }
/* 102 */      if (actionManager.getAction("RegisterPlugins") == null) { actionManager.getAction("RegisterPlugins"); if (actionManager.getAction("Register") == null) { actionManager.getAction("Register"); return false; }  }
/* 103 */      Intrinsics.checkNotNullExpressionValue(AnActionEvent.createFromDataContext("unknown", new Presentation(), getLicenseValidationActionDataContext()), "createFromDataContext(...)"); AnActionEvent actionEvent = AnActionEvent.createFromDataContext("unknown", new Presentation(), getLicenseValidationActionDataContext());
/* 104 */     action.actionPerformed(actionEvent);
/* 105 */     return true;
/*     */   }
/*     */   
/*     */   private static final DataContext getLicenseValidationActionDataContext() {
/* 109 */     return JunieIdeLicenseRepositoryKt::_get_licenseValidationActionDataContext_$lambda$0; } private static final Object _get_licenseValidationActionDataContext_$lambda$0(String dataId) {
/* 110 */     Intrinsics.checkNotNullParameter(dataId, "dataId"); String str = dataId; switch (str.hashCode()) { case -1721191885: if (str.equals("register.request.revalidate")); break; }
/*     */     
/* 112 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final StateFlow<LicensingFacade> licensingFacadeStateIn(ComponentManager $this$licensingFacadeStateIn, CoroutineScope cs) {
/* 117 */     MutableStateFlow mutableStateFlow1 = StateFlowKt.MutableStateFlow(LicensingFacade.getInstance()), mutableState = mutableStateFlow1; int $i$a$-also-JunieIdeLicenseRepositoryKt$licensingFacadeStateIn$1 = 0;
/*     */     
/* 119 */     Intrinsics.checkNotNullExpressionValue(LicensingFacade.LicenseStateListener.TOPIC, "TOPIC"); $this$licensingFacadeStateIn.getMessageBus().connect(cs).subscribe(LicensingFacade.LicenseStateListener.TOPIC, mutableState::licensingFacadeStateIn$lambda$2$lambda$1);
/*     */ 
/*     */     
/* 122 */     mutableState.setValue(LicensingFacade.getInstance());
/* 123 */     return FlowKt.asStateFlow(mutableStateFlow1);
/*     */   }
/*     */   
/*     */   private static final void licensingFacadeStateIn$lambda$2$lambda$1(MutableStateFlow $mutableState, LicensingFacade facade) {
/*     */     $mutableState.setValue(facade);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieIdeLicenseRepositoryKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */