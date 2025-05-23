/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.followup.FollowupViewModel;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function0;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(TaskChainEntity value, Continuation $completion) {
/* 206 */     if (value.getState().isTerminal()) {
/*     */ 
/*     */       
/* 209 */       CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope();
/* 210 */       LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy();
/* 211 */       Project project = TaskChainDetailsViewModel.this.getProject();
/* 212 */       LiveTaskChain liveTaskChain = TaskChainDetailsViewModel.this.getLiveTaskChain();
/* 213 */       TaskService taskService = TaskChainDetailsViewModel.access$getTaskService$p(TaskChainDetailsViewModel.this);
/* 214 */       Function0 function0 = TaskChainDetailsViewModel.access$getCheckForJunieProblems$p(TaskChainDetailsViewModel.this); TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).setValue(new FollowupViewModel(coroutineScope, project, lLMProxy, liveTaskChain, taskService, function0));
/*     */     } else {
/*     */       
/* 217 */       if ((FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue() != null) { ((FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue()).closeVM(); } else { (FollowupViewModel)TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).getValue(); }
/* 218 */        TaskChainDetailsViewModel.access$get_followupVm$p(TaskChainDetailsViewModel.this).setValue(null);
/*     */     } 
/* 220 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModel$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */