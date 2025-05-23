/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function4;
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
/*    */ @DebugMetadata(f = "JunieGrazieQuota.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieQuota$refreshFlow$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\031\n\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002*\001\001\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\n"}, d2 = {"<anonymous>", "com/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieQuota$refreshFlow$2$1", "refresh", "Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JunieGrazieLLMProxy;", "exceededQuotaDebugLicenseId", "", "activationState", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivation;"})
/*    */ final class JunieGrazieQuota$refreshFlow$2
/*    */   extends SuspendLambda
/*    */   implements Function4<JunieGrazieLLMProxy, String, AiaActivation, Continuation<? super JunieGrazieQuota$refreshFlow$2.null>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   JunieGrazieQuota$refreshFlow$2(Continuation $completion) {
/*    */     super(4, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     AiaActivation activationState;
/* 68 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); activationState = (AiaActivation)this.L$0;
/* 69 */         return new Object(activationState) { public final AiaActivation getActivationState() {
/* 70 */               return this.activationState;
/*    */             }
/*    */             
/*    */             private final AiaActivation activationState; }
/*    */           ; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(JunieGrazieLLMProxy p1, String p2, AiaActivation p3, Continuation<? super JunieGrazieQuota$refreshFlow$2> p4) {
/*    */     JunieGrazieQuota$refreshFlow$2 junieGrazieQuota$refreshFlow$2 = new JunieGrazieQuota$refreshFlow$2(p4);
/*    */     junieGrazieQuota$refreshFlow$2.L$0 = p3;
/*    */     return junieGrazieQuota$refreshFlow$2.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieGrazieQuota$refreshFlow$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */