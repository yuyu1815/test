/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieIdeLicenseRepository;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "ideLicenseAiAllowanceStep.kt", l = {33, 33}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class null
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   null(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 32 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 33 */         this.label = 1; if (JunieIdeLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null);
/* 34 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*    */     return (Continuation<Unit>)new Object($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */