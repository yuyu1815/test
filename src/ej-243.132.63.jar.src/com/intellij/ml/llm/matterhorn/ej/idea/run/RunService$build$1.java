/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CoroutinesKt;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.platform.util.coroutines.CoroutineScopeKt;
/*     */ import com.intellij.task.ProjectTaskManager;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "RunService.kt", l = {113, 119}, i = {0}, s = {"L$0"}, n = {"$this$channelFlow"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.run.RunService$build$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;"})
/*     */ final class RunService$build$1
/*     */   extends SuspendLambda
/*     */   implements Function2<ProducerScope<? super RunEvent>, Continuation<? super Unit>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   RunService$build$1(Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     ProducerScope $this$channelFlow;
/*     */     CompletableDeferred buildFinished;
/* 110 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); $this$channelFlow = (ProducerScope)this.L$0;
/* 111 */         CoroutineScopeKt.attachAsChildTo((CoroutineScope)$this$channelFlow, RunService.access$getScope$p(RunService.this));
/*     */         
/* 113 */         this.L$0 = $this$channelFlow; this.label = 1; if ($this$channelFlow.send(RunStartedEvent.INSTANCE, (Continuation)this) == object) return object;  $this$channelFlow.send(RunStartedEvent.INSTANCE, (Continuation)this);
/*     */         
/* 115 */         buildFinished = RunService.access$setupBuildListeners(RunService.this, $this$channelFlow, this.$project, CoroutinesKt.nestedDisposable((CoroutineScope)$this$channelFlow));
/*     */         
/* 117 */         ProjectTaskManager.getInstance(this.$project).buildAllModules();
/*     */         
/* 119 */         this.L$0 = null; this.label = 2; if (buildFinished.await((Continuation)this) == object) return object;  buildFinished.await((Continuation)this);
/* 120 */         return Unit.INSTANCE;case 1: $this$channelFlow = (ProducerScope)this.L$0; ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); buildFinished = RunService.access$setupBuildListeners(RunService.this, $this$channelFlow, this.$project, CoroutinesKt.nestedDisposable((CoroutineScope)$this$channelFlow)); ProjectTaskManager.getInstance(this.$project).buildAllModules(); this.L$0 = null; this.label = 2; if (buildFinished.await((Continuation)this) == object) return object;  buildFinished.await((Continuation)this); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super RunService$build$1> $completion) {
/*     */     RunService$build$1 runService$build$1 = new RunService$build$1(this.$project, $completion);
/*     */     runService$build$1.L$0 = value;
/*     */     return (Continuation<Unit>)runService$build$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*     */     return ((RunService$build$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\RunService$build$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */