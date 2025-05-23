/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "TaskServiceInternal.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal$requireTaskChainSnapshot$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;", "it", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;"})
/*     */ final class TaskServiceInternal$requireTaskChainSnapshot$2
/*     */   extends SuspendLambda
/*     */   implements Function2<List<? extends LiveTaskSnapshot>, Continuation<? super LiveTaskChainImpl>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   TaskServiceInternal$requireTaskChainSnapshot$2(TaskChainId $taskChainId, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 112 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); throw new IllegalStateException(("Task chain with id " + 
/* 113 */             this.$taskChainId + " is not found").toString()); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super TaskServiceInternal$requireTaskChainSnapshot$2> $completion) {
/*     */     return (Continuation<Unit>)new TaskServiceInternal$requireTaskChainSnapshot$2(this.$taskChainId, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(List p1, Continuation<?> p2) {
/*     */     return ((TaskServiceInternal$requireTaskChainSnapshot$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskServiceInternal$requireTaskChainSnapshot$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */