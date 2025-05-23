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
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.TimeoutKt;
/*    */ 
/*    */ @DebugMetadata(f = "ideLicenseAiAllowanceStep.kt", l = {32}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*    */ final class IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1
/*    */   extends SuspendLambda
/*    */   implements Function1<Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1(Continuation $completion) {
/*    */     super(1, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 31 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 32 */         this.label = 1; if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(10, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 33 */                     this.label = 1; if (JunieIdeLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null);
/* 34 */                     return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } }(Continuation)this) == object) return object;  TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(10, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (JunieIdeLicenseRepository.Companion.instance((Continuation)this) == object) return object;  this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)JunieIdeLicenseRepository.Companion.instance((Continuation)this), null, (Continuation)this, 1, null); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null) == object) return object;  JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait$default((JunieIdeLicenseRepository)SYNTHETIC_LOCAL_VARIABLE_1, null, (Continuation)this, 1, null); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>($completion); }
/* 35 */               public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this); return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Continuation<? super IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1> $completion) {
/*    */     return (Continuation<Unit>)new IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1($completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(Continuation<?> p1) {
/*    */     return ((IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\IdeLicenseAiAllowanceStepKt$ideLicenseAiAllowanceStep$verifyCallable$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */