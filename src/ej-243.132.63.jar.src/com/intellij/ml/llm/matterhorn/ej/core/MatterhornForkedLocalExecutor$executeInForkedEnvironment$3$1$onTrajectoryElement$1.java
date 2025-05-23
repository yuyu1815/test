/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.TrajectoryElement;
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
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {138}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1(ExecutionContext $originalContext, TrajectoryElement $element, String $name, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 137 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 138 */         this.label = 1; if (this.$originalContext.logTrajectoryElement(this.$element.withId(this.$name), (Continuation)this) == object) return object;  this.$originalContext.logTrajectoryElement(this.$element.withId(this.$name), (Continuation)this);
/* 139 */         return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1> $completion) {
/*     */     return (Continuation<Unit>)new MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1(this.$originalContext, this.$element, this.$name, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor$executeInForkedEnvironment$3$1$onTrajectoryElement$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */