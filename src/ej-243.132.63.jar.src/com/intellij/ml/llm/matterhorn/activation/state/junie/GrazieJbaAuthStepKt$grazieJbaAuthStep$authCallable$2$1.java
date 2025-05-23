/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
/*    */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.time.DurationKt;
/*    */ import kotlin.time.DurationUnit;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.DelayKt;
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
/*    */ @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {84, 85}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1(ActivityCallable<GrazieResult<GrazieAuthData>, GrazieResult.GrazieFailure, GrazieAuthData> $refreshTokenCallable, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Object object1;
/*    */     OpResult opResult;
/*    */     int $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1;
/* 83 */     Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 84 */         this.label = 1; if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(3, DurationUnit.HOURS), (Continuation)this) == object2) return object2;  DelayKt.delay-VtjQ1oo(DurationKt.toDuration(3, DurationUnit.HOURS), (Continuation)this);
/* 85 */         this.label = 2; if (this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this) == object2) return object2;  object1 = this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this); opResult = (OpResult)object1; $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1 = 0;
/* 86 */         GrazieJbaAuthStepKt.access$getLOG$p().info("Background refresh-token activity finished: " + opResult);
/*    */         
/* 88 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this) == object2) return object2;  object1 = this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this); opResult = (OpResult)object1; $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1 = 0; GrazieJbaAuthStepKt.access$getLOG$p().info("Background refresh-token activity finished: " + opResult); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); object1 = SYNTHETIC_LOCAL_VARIABLE_1; opResult = (OpResult)object1; $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1 = 0; GrazieJbaAuthStepKt.access$getLOG$p().info("Background refresh-token activity finished: " + opResult); return Unit.INSTANCE; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1> $completion) {
/*    */     return (Continuation<Unit>)new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1(this.$refreshTokenCallable, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */