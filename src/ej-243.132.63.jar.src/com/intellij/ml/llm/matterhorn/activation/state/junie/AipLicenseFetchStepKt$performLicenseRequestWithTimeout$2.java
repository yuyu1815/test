/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ 
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
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "aipLicenseFetchStep.kt", l = {140, 141}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AipLicenseResult;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super AipLicenseResult>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2(Function2<JunieAipLicenseRepository, Continuation<? super AipLicenseResult>, Object> $block, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     Object object1;
/*     */     Function2<JunieAipLicenseRepository, Continuation<? super AipLicenseResult>, Object> function2;
/*     */     JunieAipLicenseRepository $this$invokeSuspend_u24lambda_u240;
/*     */     int $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1;
/* 139 */     Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 140 */         this.label = 1; if (JunieAipLicenseRepository.Companion.instance((Continuation)this) == object2) return object2;  object1 = JunieAipLicenseRepository.Companion.instance((Continuation)this); function2 = this.$block; $this$invokeSuspend_u24lambda_u240 = (JunieAipLicenseRepository)object1; $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1 = 0;
/* 141 */         this.label = 2; if (function2.invoke($this$invokeSuspend_u24lambda_u240, this) == object2) return object2;  return function2.invoke($this$invokeSuspend_u24lambda_u240, this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); object1 = SYNTHETIC_LOCAL_VARIABLE_1; function2 = this.$block; $this$invokeSuspend_u24lambda_u240 = (JunieAipLicenseRepository)object1; $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1 = 0; this.label = 2; if (function2.invoke($this$invokeSuspend_u24lambda_u240, this) == object2) return object2;  return function2.invoke($this$invokeSuspend_u24lambda_u240, this);
/*     */       case 2:
/*     */         $i$a$-with-AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2$1 = 0;
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2> $completion) {
/*     */     return (Continuation<Unit>)new AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2(this.$block, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AipLicenseFetchStepKt$performLicenseRequestWithTimeout$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */