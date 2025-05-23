/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {205}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class null
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   null(Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 204 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 205 */         this.label = 1; if (TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().collect(new FlowCollector() {
/* 206 */               public final Object emit(TaskChainEntity value, Continuation $completion) { if (value.getState().isTerminal()) {
/*     */ 
/*     */                   
/* 209 */                   CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope();
/* 210 */                   LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy();
/* 211 */                   Project project = TaskChainDetailsViewModel.this.getProject();
/* 212 */                   LiveTaskChain liveTaskChain = TaskChainDetailsViewModel.this.getLiveTaskChain();
/* 213 */                   TaskService taskService = TaskChainDetailsViewModel.access$getTaskService$p(TaskChainDetailsViewModel.this);
/* 214 */                   Function0 function0 = TaskChainDetailsViewModel.access$getCheckForJunieProblems$p(TaskChainDetailsViewModel.this); TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).setValue(new FollowupViewModel(coroutineScope, project, lLMProxy, liveTaskChain, taskService, function0));
/*     */                 } else {
/*     */                   
/* 217 */                   if ((FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue() != null) { ((FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue()).closeVM(); } else { (FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue(); }
/* 218 */                    TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).setValue(null);
/*     */                 } 
/* 220 */                 return Unit.INSTANCE; } }(Continuation)this) == object) return object;  TaskChainDetailsViewModel.this.getLiveTaskChain().getChain().collect(new FlowCollector() { public final Object emit(TaskChainEntity value, Continuation $completion) { if (value.getState().isTerminal()) { CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope(); LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy(); Project project = TaskChainDetailsViewModel.this.getProject(); LiveTaskChain liveTaskChain = TaskChainDetailsViewModel.this.getLiveTaskChain(); TaskService taskService = TaskChainDetailsViewModel.access$getTaskService$p(TaskChainDetailsViewModel.this); Function0 function0 = TaskChainDetailsViewModel.access$getCheckForJunieProblems$p(TaskChainDetailsViewModel.this); TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).setValue(new FollowupViewModel(coroutineScope, project, lLMProxy, liveTaskChain, taskService, function0)); } else { if ((FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue() != null) { ((FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue()).closeVM(); } else { (FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue(); }  TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).setValue(null); }  return Unit.INSTANCE; }
/*     */                }
/*     */             (Continuation)this);
/*     */         throw new KotlinNothingValueException();
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         throw new KotlinNothingValueException(); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */     return (Continuation<Unit>)new Object(TaskChainDetailsViewModel.this, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModel$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */