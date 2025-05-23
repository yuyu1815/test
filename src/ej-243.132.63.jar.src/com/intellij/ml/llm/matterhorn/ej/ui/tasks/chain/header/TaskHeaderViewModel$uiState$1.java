/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "TaskHeaderViewModel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.TaskHeaderViewModel$uiState$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "hasChanges", ""})
/*    */ final class TaskHeaderViewModel$uiState$1
/*    */   extends SuspendLambda
/*    */   implements Function3<TaskChainEntity, Boolean, Continuation<? super TaskHeaderState>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   TaskHeaderViewModel$uiState$1(Continuation $completion) {
/*    */     super(3, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     TaskChainEntity taskChain;
/*    */     boolean hasChanges;
/* 32 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); taskChain = (TaskChainEntity)this.L$0; hasChanges = this.Z$0;
/* 33 */         return TaskHeaderViewModel.access$computeUiState(TaskHeaderViewModel.this, taskChain, hasChanges); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Object invoke(TaskChainEntity p1, boolean p2, Continuation<? super TaskHeaderViewModel$uiState$1> p3) {
/*    */     TaskHeaderViewModel$uiState$1 taskHeaderViewModel$uiState$1 = new TaskHeaderViewModel$uiState$1(p3);
/*    */     taskHeaderViewModel$uiState$1.L$0 = p1;
/*    */     taskHeaderViewModel$uiState$1.Z$0 = p2;
/*    */     return taskHeaderViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderViewModel$uiState$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */