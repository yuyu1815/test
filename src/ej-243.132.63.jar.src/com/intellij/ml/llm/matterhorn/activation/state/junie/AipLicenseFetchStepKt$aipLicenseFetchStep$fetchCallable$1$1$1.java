/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseProductType;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AipLicenseResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieAipLicenseRepository;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "aipLicenseFetchStep.kt", l = {106}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAipLicenseRepository;"})
/*     */ final class null
/*     */   extends SuspendLambda
/*     */   implements Function2<JunieAipLicenseRepository, Continuation<? super AipLicenseResult>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   null(AipLicenseProductType $productType, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     JunieAipLicenseRepository $this$performLicenseRequestWithTimeout;
/* 105 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$performLicenseRequestWithTimeout = (JunieAipLicenseRepository)this.L$0;
/* 106 */         this.label = 1; if ($this$performLicenseRequestWithTimeout.getActiveLicenses(this.$productType, (Continuation)this) == object) return object;  return $this$performLicenseRequestWithTimeout.getActiveLicenses(this.$productType, (Continuation)this);
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */     Object object = new Object(this.$productType, $completion);
/*     */     object.L$0 = value;
/*     */     return (Continuation<Unit>)object;
/*     */   }
/*     */   
/*     */   public final Object invoke(JunieAipLicenseRepository p1, Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseFetchStepKt$aipLicenseFetchStep$fetchCallable$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */