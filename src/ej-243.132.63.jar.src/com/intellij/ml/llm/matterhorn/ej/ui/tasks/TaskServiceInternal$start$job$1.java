/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vcs.LocalFilePath;
/*     */ import com.intellij.openapi.vcs.VcsFileListenerContextHelper;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "TaskServiceInternal.kt", l = {210, 211}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal$start$job$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class TaskServiceInternal$start$job$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   TaskServiceInternal$start$job$1(LiveTaskSnapshot $taskSnapshot, TaskSnapshotUpdaterImpl $updater, TaskChainId $chainId, LiveTaskChainImpl $liveTaskChain, VcsFileListenerContextHelper $vcsFileListenerContextHelper, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     CoroutineScope $this$launch;
/* 202 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$launch = (CoroutineScope)this.L$0; try {
/*     */           Object object2;
/* 204 */           Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(TaskServiceInternal.access$getProject$p(TaskServiceInternal.this))); VirtualFile projectDir = ProjectUtil.guessProjectDir(TaskServiceInternal.access$getProject$p(TaskServiceInternal.this));
/* 205 */           CoroutineScope coroutineScope = $this$launch; VcsFileListenerContextHelper vcsFileListenerContextHelper = this.$vcsFileListenerContextHelper; try { int $i$a$-runCatching-TaskServiceInternal$start$job$1$1 = 0;
/* 206 */             vcsFileListenerContextHelper.ignoreAddedRecursive(CollectionsKt.listOf(new LocalFilePath(projectDir.toNioPath(), true)));
/* 207 */             object2 = Result.constructor-impl(Unit.INSTANCE); } catch (Throwable throwable) { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }  Object object1 = object2; Throwable throwable1 = Result.exceptionOrNull-impl(object1), it = throwable1; int $i$a$-onFailure-TaskServiceInternal$start$job$1$2 = 0;
/* 208 */           TaskServiceInternal.access$getLogger$cp().warn(it);
/*     */           Result.exceptionOrNull-impl(object1);
/* 210 */           this.label = 1; if (TaskServiceInternal.access$getTaskLauncher$p(TaskServiceInternal.this).launch(TaskServiceInternal.access$getProject$p(TaskServiceInternal.this), this.$taskSnapshot.getTask(), this.$updater, this.$chainId, $this$launch, (Continuation<? super Job>)this) == object)
/* 211 */             return object;  this.label = 2; if (((Job)TaskServiceInternal.access$getTaskLauncher$p(TaskServiceInternal.this).launch(TaskServiceInternal.access$getProject$p(TaskServiceInternal.this), this.$taskSnapshot.getTask(), this.$updater, this.$chainId, $this$launch, (Continuation<? super Job>)this)).join((Continuation)this) == object) return object;  ((Job)TaskServiceInternal.access$getTaskLauncher$p(TaskServiceInternal.this).launch(TaskServiceInternal.access$getProject$p(TaskServiceInternal.this), this.$taskSnapshot.getTask(), this.$updater, this.$chainId, $this$launch, (Continuation<? super Job>)this)).join((Continuation)this);
/* 212 */           TaskServiceInternal.access$produceReportIfNecessary(TaskServiceInternal.this, this.$liveTaskChain, this.$updater);
/* 213 */         } catch (Exception e) {
/* 214 */           TaskServiceInternal.access$produceReportIfNecessary(TaskServiceInternal.this, this.$liveTaskChain, this.$updater);
/* 215 */           throw e;
/*     */         } 
/* 217 */         return Unit.INSTANCE;
/*     */       case 1:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         this.label = 2;
/*     */         if (((Job)SYNTHETIC_LOCAL_VARIABLE_1).join((Continuation)this) == object)
/*     */           return object; 
/*     */         ((Job)SYNTHETIC_LOCAL_VARIABLE_1).join((Continuation)this);
/*     */         TaskServiceInternal.access$produceReportIfNecessary(TaskServiceInternal.this, this.$liveTaskChain, this.$updater);
/*     */       case 2:
/*     */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */         TaskServiceInternal.access$produceReportIfNecessary(TaskServiceInternal.this, this.$liveTaskChain, this.$updater); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super TaskServiceInternal$start$job$1> $completion) {
/*     */     TaskServiceInternal$start$job$1 taskServiceInternal$start$job$1 = new TaskServiceInternal$start$job$1(this.$taskSnapshot, this.$updater, this.$chainId, this.$liveTaskChain, this.$vcsFileListenerContextHelper, $completion);
/*     */     taskServiceInternal$start$job$1.L$0 = value;
/*     */     return (Continuation<Unit>)taskServiceInternal$start$job$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((TaskServiceInternal$start$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskServiceInternal$start$job$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */