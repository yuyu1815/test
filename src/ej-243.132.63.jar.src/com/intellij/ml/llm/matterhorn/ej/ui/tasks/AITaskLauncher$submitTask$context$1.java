/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AITaskLauncher.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$submitTask$context$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ final class AITaskLauncher$submitTask$context$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super RootExecutionContext>, Object>
/*     */ {
/*     */   int label;
/*     */   
/*     */   AITaskLauncher$submitTask$context$1(LLMProxy $llmProxy, ArtifactRequest<AgentIssue, TaskResult> $request, TaskSnapshotUpdater $updater, boolean $braveMode, TaskChainId $chainId, TaskEntity $task, BlockTerminalShellExecutor $executor, AITaskLauncher $receiver, Project $project, Function1<Path, Boolean> $checker, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/* 221 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 222 */         return new RootExecutionContext(
/* 223 */             this.$service, 
/* 224 */             this.$llmProxy, 
/* 225 */             this.$request.getArtifact().getName(), 
/* 226 */             this.$executor::invokeSuspend$lambda$0, 
/* 227 */             false, 
/* 228 */             (MatterhornPropertyProvider)MatterhornSettingsService.Companion.getInstance(), 
/* 229 */             (HumanInLoop)new HumanInLoopImpl(
/* 230 */               this.$updater, 
/* 231 */               this.$braveMode, 
/* 232 */               this.$chainId, 
/* 233 */               this.$task.getId(), 
/* 234 */               new Function2<Path, Continuation<? super Boolean>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { Path it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; this.label = 1; return (AITaskLauncher.this.isSensitiveFile(this.$project, it, (Continuation<? super Boolean>)this) == object) ? object : AITaskLauncher.this.isSensitiveFile(this.$project, it, (Continuation<? super Boolean>)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/* 235 */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(AITaskLauncher.this, this.$project, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(Path p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }new Function2<Path, Continuation<? super Boolean>, Object>(this.$checker, null) { int label; public final Object invokeSuspend(Object $result) { Path it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/* 236 */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(Path p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }new Function2<Path, Continuation<? super Boolean>, Object>(this.$project, null) {
/*     */                 int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore_3
/*     */                   //   4: aload_0
/*     */                   //   5: getfield label : I
/*     */                   //   8: tableswitch default -> 98, 0 -> 32, 1 -> 75
/*     */                   //   32: aload_1
/*     */                   //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   36: aload_0
/*     */                   //   37: getfield L$0 : Ljava/lang/Object;
/*     */                   //   40: checkcast java/nio/file/Path
/*     */                   //   43: astore_2
/*     */                   //   44: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/OutOfProjectFilesFileDetector
/*     */                   //   47: dup
/*     */                   //   48: invokespecial <init> : ()V
/*     */                   //   51: aload_0
/*     */                   //   52: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */                   //   55: aload_2
/*     */                   //   56: aload_0
/*     */                   //   57: checkcast kotlin/coroutines/Continuation
/*     */                   //   60: aload_0
/*     */                   //   61: iconst_1
/*     */                   //   62: putfield label : I
/*     */                   //   65: invokevirtual isSensitiveFile : (Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   68: dup
/*     */                   //   69: aload_3
/*     */                   //   70: if_acmpne -> 80
/*     */                   //   73: aload_3
/*     */                   //   74: areturn
/*     */                   //   75: aload_1
/*     */                   //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   79: aload_1
/*     */                   //   80: checkcast java/lang/Boolean
/*     */                   //   83: invokevirtual booleanValue : ()Z
/*     */                   //   86: ifne -> 93
/*     */                   //   89: iconst_1
/*     */                   //   90: goto -> 94
/*     */                   //   93: iconst_0
/*     */                   //   94: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */                   //   97: areturn
/*     */                   //   98: new java/lang/IllegalStateException
/*     */                   //   101: dup
/*     */                   //   102: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   104: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   107: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #236	-> 3
/*     */                   //   #236	-> 44
/*     */                   //   #236	-> 73
/*     */                   //   #236	-> 80
/*     */                   //   #236	-> 98
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   44	24	2	it	Ljava/nio/file/Path;
/*     */                   //   0	108	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$context$1$4;
/*     */                   //   36	62	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$project, $completion); function2.L$0 = value; return (Continuation)function2; } public final Object invoke(Path p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); }
/* 238 */               }), new Function2<Path, Continuation<? super Boolean>, Object>(this.$checker, null) { int label; public final Object invokeSuspend(Object $result) { Path it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */               
/*     */               public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                 Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion);
/*     */                 function2.L$0 = value;
/*     */                 return (Continuation)function2;
/*     */               }
/*     */               
/*     */               public final Object invoke(Path p1, Continuation<?> p2) {
/*     */                 return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */               } }
/*     */           ); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$submitTask$context$1> $completion) {
/*     */     return (Continuation<Unit>)new AITaskLauncher$submitTask$context$1(this.$llmProxy, this.$request, this.$updater, this.$braveMode, this.$chainId, this.$task, this.$executor, AITaskLauncher.this, this.$project, this.$checker, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((AITaskLauncher$submitTask$context$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   private static final ShellExecutor invokeSuspend$lambda$0(BlockTerminalShellExecutor $executor) {
/*     */     return (ShellExecutor)$executor;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\AITaskLauncher$submitTask$context$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */