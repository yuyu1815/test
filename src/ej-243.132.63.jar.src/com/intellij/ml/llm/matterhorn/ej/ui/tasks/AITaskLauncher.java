/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoop;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.TerminalEvent;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistorySnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TerminalState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.channels.Channel;
/*     */ import kotlinx.coroutines.channels.SendChannel;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J6\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H@¢\006\002\020\020J\036\020\021\032\0020\0222\006\020\006\032\0020\0072\006\020\023\032\0020\024H@¢\006\002\020\025J@\020\026\032\004\030\0010\0272\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\030\032\0020\0312\006\020\032\032\0020\0052\006\020\f\032\0020\r2\006\020\n\032\0020\013H@¢\006\002\020\033J<\020\034\032\032\022\n\022\b\022\004\022\0020\0370\036\022\n\022\b\022\004\022\0020\0240\0360\0352\006\020 \032\0020!2\f\020\"\032\b\022\004\022\0020\0240\0362\006\020#\032\0020\022¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskLauncher;", "<init>", "()V", "launch", "Lkotlinx/coroutines/Job;", "project", "Lcom/intellij/openapi/project/Project;", "task", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "updater", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSensitiveFile", "", "path", "Ljava/nio/file/Path;", "(Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitTask", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "artifactualListener", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;", "currentJob", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;Lkotlinx/coroutines/Job;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "separateImagesAndTextFiles", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "paths", "imagesAllowed", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nAITaskLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITaskLauncher.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorServiceKt\n+ 4 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,316:1\n1755#2,3:317\n1863#2,2:325\n117#3:320\n31#4,2:321\n31#4,2:323\n*S KotlinDebug\n*F\n+ 1 AITaskLauncher.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher\n*L\n177#1:317,3\n300#1:325,2\n198#1:320\n210#1:321,2\n212#1:323,2\n*E\n"})
/*     */ public final class AITaskLauncher implements TaskLauncher {
/*     */   public static final int $stable;
/*     */   
/*     */   @Nullable
/*     */   public Object launch(@NotNull Project project, @NotNull TaskEntity task, @NotNull TaskSnapshotUpdater updater, @NotNull TaskChainId chainId, @NotNull CoroutineScope scope, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: getstatic com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider$Companion;
/*     */     //   3: aload_1
/*     */     //   4: invokevirtual getSupport : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
/*     */     //   7: aload_2
/*     */     //   8: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
/*     */     //   11: invokeinterface getIssueWorker : (Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;)Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   16: invokevirtual getSingleStepArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   19: astore #7
/*     */     //   21: ldc 2147483647
/*     */     //   23: aconst_null
/*     */     //   24: aconst_null
/*     */     //   25: bipush #6
/*     */     //   27: aconst_null
/*     */     //   28: invokestatic Channel$default : (ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
/*     */     //   31: astore #8
/*     */     //   33: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener
/*     */     //   36: dup
/*     */     //   37: aload #7
/*     */     //   39: aload #8
/*     */     //   41: <illegal opcode> invoke : (Lkotlinx/coroutines/channels/Channel;)Lkotlin/jvm/functions/Function1;
/*     */     //   46: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactType;Lkotlin/jvm/functions/Function1;)V
/*     */     //   49: astore #9
/*     */     //   51: iconst_0
/*     */     //   52: aconst_null
/*     */     //   53: aconst_null
/*     */     //   54: bipush #7
/*     */     //   56: aconst_null
/*     */     //   57: invokestatic Channel$default : (ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/coroutines/channels/Channel;
/*     */     //   60: astore #10
/*     */     //   62: getstatic com/intellij/openapi/project/DumbService.Companion : Lcom/intellij/openapi/project/DumbService$Companion;
/*     */     //   65: aload_1
/*     */     //   66: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/project/DumbService;
/*     */     //   69: aload #5
/*     */     //   71: aload #10
/*     */     //   73: <illegal opcode> run : (Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/Channel;)Ljava/lang/Runnable;
/*     */     //   78: invokevirtual runWhenSmart : (Ljava/lang/Runnable;)V
/*     */     //   81: aload #5
/*     */     //   83: new kotlinx/coroutines/CoroutineName
/*     */     //   86: dup
/*     */     //   87: ldc 'Top level task'
/*     */     //   89: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   92: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   95: aconst_null
/*     */     //   96: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1
/*     */     //   99: dup
/*     */     //   100: aload #10
/*     */     //   102: aload_3
/*     */     //   103: aload #8
/*     */     //   105: aload_0
/*     */     //   106: aload_1
/*     */     //   107: aload_2
/*     */     //   108: aload #9
/*     */     //   110: aload #4
/*     */     //   112: aconst_null
/*     */     //   113: invokespecial <init> : (Lkotlinx/coroutines/channels/Channel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lkotlinx/coroutines/channels/Channel;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)V
/*     */     //   116: checkcast kotlin/jvm/functions/Function2
/*     */     //   119: iconst_2
/*     */     //   120: aconst_null
/*     */     //   121: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */     //   124: astore #11
/*     */     //   126: aload #11
/*     */     //   128: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #53	-> 0
/*     */     //   #54	-> 7
/*     */     //   #55	-> 16
/*     */     //   #53	-> 19
/*     */     //   #57	-> 21
/*     */     //   #58	-> 33
/*     */     //   #62	-> 51
/*     */     //   #63	-> 62
/*     */     //   #69	-> 81
/*     */     //   #173	-> 126
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   21	108	7	artifactType	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   33	96	8	channel	Lkotlinx/coroutines/channels/Channel;
/*     */     //   51	78	9	listener	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   62	67	10	channelSmartModeNotify	Lkotlinx/coroutines/channels/Channel;
/*     */     //   126	3	11	job	Lkotlinx/coroutines/Job;
/*     */     //   0	129	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */     //   0	129	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	129	2	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   0	129	3	updater	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   0	129	4	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	129	5	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   0	129	6	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */   
/*  59 */   private static final Unit launch$lambda$0(Channel $channel, StepBuildingEvent it) { Intrinsics.checkNotNullParameter(it, "it"); $channel.trySend-JP2dKIU(it);
/*  60 */     return Unit.INSTANCE; } @DebugMetadata(f = "AITaskLauncher.kt", l = {177}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"project", "path"}, m = "isSensitiveFile", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class AITaskLauncher$isSensitiveFile$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; int label; AITaskLauncher$isSensitiveFile$1(Continuation $completion) { super($completion); }
/*     */     @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE;
/*     */       return AITaskLauncher.this.isSensitiveFile(null, null, (Continuation<? super Boolean>)this); } }
/*  64 */   private static final void launch$lambda$1(CoroutineScope $scope, Channel<Unit> $channelSmartModeNotify) { BuildersKt.launch$default($scope, null, null, new AITaskLauncher$launch$2$1($channelSmartModeNotify, null), 3, null); } @DebugMetadata(f = "AITaskLauncher.kt", l = {65}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$launch$2$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AITaskLauncher$launch$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; AITaskLauncher$launch$2$1(Channel<Unit> $channelSmartModeNotify, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  65 */           this.label = 1; if (this.$channelSmartModeNotify.send(Unit.INSTANCE, (Continuation)this) == object) return object;  this.$channelSmartModeNotify.send(Unit.INSTANCE, (Continuation)this);
/*  66 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */      public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$launch$2$1> $completion) {
/*     */       return (Continuation<Unit>)new AITaskLauncher$launch$2$1(this.$channelSmartModeNotify, $completion);
/*     */     } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AITaskLauncher$launch$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } } @DebugMetadata(f = "AITaskLauncher.kt", l = {71, 73, 73, 170, 171}, i = {0, 1, 2}, s = {"L$0", "L$0", "L$0"}, n = {"$this$launch", "$this$launch", "$this$launch"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$launch$job$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nAITaskLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITaskLauncher.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/*     */   static final class AITaskLauncher$launch$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { Object L$1; int label; AITaskLauncher$launch$job$1(TaskSnapshotUpdater $updater, Channel<StepBuildingEvent> $channel, AITaskLauncher $receiver, Project $project, TaskEntity $task, StepsBuildingContextListener $listener, TaskChainId $chainId, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     } public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #7
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 446, 0 -> 48, 1 -> 107, 2 -> 153, 3 -> 215, 4 -> 403, 5 -> 436
/*     */       //   48: aload_1
/*     */       //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   52: aload_0
/*     */       //   53: getfield L$0 : Ljava/lang/Object;
/*     */       //   56: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   59: astore_2
/*     */       //   60: aload_0
/*     */       //   61: getfield $channelSmartModeNotify : Lkotlinx/coroutines/channels/Channel;
/*     */       //   64: invokeinterface isEmpty : ()Z
/*     */       //   69: ifeq -> 121
/*     */       //   72: aload_0
/*     */       //   73: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   76: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingSmartMode : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */       //   79: aload_0
/*     */       //   80: checkcast kotlin/coroutines/Continuation
/*     */       //   83: aload_0
/*     */       //   84: aload_2
/*     */       //   85: putfield L$0 : Ljava/lang/Object;
/*     */       //   88: aload_0
/*     */       //   89: iconst_1
/*     */       //   90: putfield label : I
/*     */       //   93: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   98: dup
/*     */       //   99: aload #7
/*     */       //   101: if_acmpne -> 120
/*     */       //   104: aload #7
/*     */       //   106: areturn
/*     */       //   107: aload_0
/*     */       //   108: getfield L$0 : Ljava/lang/Object;
/*     */       //   111: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   114: astore_2
/*     */       //   115: aload_1
/*     */       //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   119: aload_1
/*     */       //   120: pop
/*     */       //   121: aload_0
/*     */       //   122: getfield $channelSmartModeNotify : Lkotlinx/coroutines/channels/Channel;
/*     */       //   125: aload_0
/*     */       //   126: checkcast kotlin/coroutines/Continuation
/*     */       //   129: aload_0
/*     */       //   130: aload_2
/*     */       //   131: putfield L$0 : Ljava/lang/Object;
/*     */       //   134: aload_0
/*     */       //   135: iconst_2
/*     */       //   136: putfield label : I
/*     */       //   139: invokeinterface receive : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   144: dup
/*     */       //   145: aload #7
/*     */       //   147: if_acmpne -> 166
/*     */       //   150: aload #7
/*     */       //   152: areturn
/*     */       //   153: aload_0
/*     */       //   154: getfield L$0 : Ljava/lang/Object;
/*     */       //   157: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   160: astore_2
/*     */       //   161: aload_1
/*     */       //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   165: aload_1
/*     */       //   166: pop
/*     */       //   167: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   170: astore_3
/*     */       //   171: aload_0
/*     */       //   172: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   175: astore #4
/*     */       //   177: iconst_0
/*     */       //   178: istore #6
/*     */       //   180: aload #4
/*     */       //   182: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */       //   185: aload_0
/*     */       //   186: aload_0
/*     */       //   187: aload_2
/*     */       //   188: putfield L$0 : Ljava/lang/Object;
/*     */       //   191: aload_0
/*     */       //   192: aload_3
/*     */       //   193: putfield L$1 : Ljava/lang/Object;
/*     */       //   196: aload_0
/*     */       //   197: iconst_3
/*     */       //   198: putfield label : I
/*     */       //   201: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   206: dup
/*     */       //   207: aload #7
/*     */       //   209: if_acmpne -> 239
/*     */       //   212: aload #7
/*     */       //   214: areturn
/*     */       //   215: iconst_0
/*     */       //   216: istore #6
/*     */       //   218: aload_0
/*     */       //   219: getfield L$1 : Ljava/lang/Object;
/*     */       //   222: checkcast kotlin/Unit
/*     */       //   225: astore_3
/*     */       //   226: aload_0
/*     */       //   227: getfield L$0 : Ljava/lang/Object;
/*     */       //   230: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   233: astore_2
/*     */       //   234: aload_1
/*     */       //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   238: aload_1
/*     */       //   239: pop
/*     */       //   240: nop
/*     */       //   241: aload_2
/*     */       //   242: new kotlinx/coroutines/CoroutineName
/*     */       //   245: dup
/*     */       //   246: ldc 'LinearTreeConversion'
/*     */       //   248: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   251: checkcast kotlin/coroutines/CoroutineContext
/*     */       //   254: aconst_null
/*     */       //   255: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$linearTreeConversionJob$1
/*     */       //   258: dup
/*     */       //   259: aload_0
/*     */       //   260: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   263: aload_0
/*     */       //   264: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */       //   267: aconst_null
/*     */       //   268: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
/*     */       //   271: checkcast kotlin/jvm/functions/Function2
/*     */       //   274: iconst_2
/*     */       //   275: aconst_null
/*     */       //   276: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */       //   279: astore_3
/*     */       //   280: aload_2
/*     */       //   281: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */       //   286: invokestatic getJob : (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;
/*     */       //   289: astore #4
/*     */       //   291: aload_2
/*     */       //   292: new kotlinx/coroutines/CoroutineName
/*     */       //   295: dup
/*     */       //   296: ldc 'submitTask'
/*     */       //   298: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   301: checkcast kotlin/coroutines/CoroutineContext
/*     */       //   304: aconst_null
/*     */       //   305: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$taskJob$1
/*     */       //   308: dup
/*     */       //   309: aload_0
/*     */       //   310: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */       //   313: aload_0
/*     */       //   314: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   317: aload_0
/*     */       //   318: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */       //   321: aload_0
/*     */       //   322: getfield $listener : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */       //   325: aload #4
/*     */       //   327: aload_0
/*     */       //   328: getfield $chainId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */       //   331: aload_0
/*     */       //   332: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   335: aload_0
/*     */       //   336: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */       //   339: aconst_null
/*     */       //   340: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;Lkotlinx/coroutines/Job;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
/*     */       //   343: checkcast kotlin/jvm/functions/Function2
/*     */       //   346: iconst_2
/*     */       //   347: aconst_null
/*     */       //   348: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */       //   351: astore #5
/*     */       //   353: iconst_2
/*     */       //   354: anewarray kotlinx/coroutines/Job
/*     */       //   357: astore #6
/*     */       //   359: aload #6
/*     */       //   361: iconst_0
/*     */       //   362: aload #5
/*     */       //   364: aastore
/*     */       //   365: aload #6
/*     */       //   367: iconst_1
/*     */       //   368: aload_3
/*     */       //   369: aastore
/*     */       //   370: aload #6
/*     */       //   372: aload_0
/*     */       //   373: checkcast kotlin/coroutines/Continuation
/*     */       //   376: aload_0
/*     */       //   377: aconst_null
/*     */       //   378: putfield L$0 : Ljava/lang/Object;
/*     */       //   381: aload_0
/*     */       //   382: aconst_null
/*     */       //   383: putfield L$1 : Ljava/lang/Object;
/*     */       //   386: aload_0
/*     */       //   387: iconst_4
/*     */       //   388: putfield label : I
/*     */       //   391: invokestatic joinAll : ([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   394: dup
/*     */       //   395: aload #7
/*     */       //   397: if_acmpne -> 408
/*     */       //   400: aload #7
/*     */       //   402: areturn
/*     */       //   403: aload_1
/*     */       //   404: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   407: aload_1
/*     */       //   408: pop
/*     */       //   409: aload_0
/*     */       //   410: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   413: aload_0
/*     */       //   414: checkcast kotlin/coroutines/Continuation
/*     */       //   417: aload_0
/*     */       //   418: iconst_5
/*     */       //   419: putfield label : I
/*     */       //   422: invokeinterface complete : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   427: dup
/*     */       //   428: aload #7
/*     */       //   430: if_acmpne -> 441
/*     */       //   433: aload #7
/*     */       //   435: areturn
/*     */       //   436: aload_1
/*     */       //   437: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   440: aload_1
/*     */       //   441: pop
/*     */       //   442: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   445: areturn
/*     */       //   446: new java/lang/IllegalStateException
/*     */       //   449: dup
/*     */       //   450: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   452: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   455: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #69	-> 3
/*     */       //   #70	-> 60
/*     */       //   #71	-> 72
/*     */       //   #69	-> 104
/*     */       //   #73	-> 120
/*     */       //   #69	-> 150
/*     */       //   #317	-> 166
/*     */       //   #73	-> 180
/*     */       //   #69	-> 212
/*     */       //   #73	-> 239
/*     */       //   #73	-> 240
/*     */       //   #75	-> 241
/*     */       //   #164	-> 280
/*     */       //   #165	-> 291
/*     */       //   #170	-> 353
/*     */       //   #69	-> 400
/*     */       //   #171	-> 408
/*     */       //   #69	-> 433
/*     */       //   #172	-> 441
/*     */       //   #69	-> 446
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   60	47	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   115	38	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   161	54	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   234	6	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   240	1	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   241	112	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   280	92	3	linearTreeConversionJob	Lkotlinx/coroutines/Job;
/*     */       //   291	62	4	topLevelJob	Lkotlinx/coroutines/Job;
/*     */       //   353	19	5	taskJob	Lkotlinx/coroutines/Job;
/*     */       //   180	35	6	$i$a$-also-AITaskLauncher$launch$job$1$1	I
/*     */       //   0	456	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1;
/*     */       //   52	394	1	$result	Ljava/lang/Object;
/*     */       //   218	22	6	$i$a$-also-AITaskLauncher$launch$job$1$1	I
/*     */     } public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$launch$job$1> $completion) {
/*     */       AITaskLauncher$launch$job$1 aITaskLauncher$launch$job$1 = new AITaskLauncher$launch$job$1(this.$updater, this.$channel, AITaskLauncher.this, this.$project, this.$task, this.$listener, this.$chainId, $completion);
/*     */       aITaskLauncher$launch$job$1.L$0 = value;
/*     */       return (Continuation<Unit>)aITaskLauncher$launch$job$1;
/*     */     } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AITaskLauncher$launch$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     @DebugMetadata(f = "AITaskLauncher.kt", l = {78, 81, 136, 137, 159}, i = {0, 1, 2, 3, 4}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"}, n = {"steps", "steps", "steps", "steps", "steps"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$launch$job$1$linearTreeConversionJob$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     @SourceDebugExtension({"SMAP\nAITaskLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITaskLauncher.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$linearTreeConversionJob$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/*     */     static final class AITaskLauncher$launch$job$1$linearTreeConversionJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { Object L$0;
/*     */       private static final LiveTaskSnapshot invokeSuspend$lambda$1(Ref.ObjectRef $steps, LiveTaskSnapshot it) {
/*  92 */         return LiveTaskSnapshot.copy$default(it, null, null, (PersistentList)$steps.element, null, null, 27, null);
/*     */       }
/*     */       Object L$1; int label;
/*     */       AITaskLauncher$launch$job$1$linearTreeConversionJob$1(TaskSnapshotUpdater $updater, Channel<StepBuildingEvent> $channel, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       public final Object invokeSuspend(Object $result) {
/*     */         // Byte code:
/*     */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */         //   3: astore #7
/*     */         //   5: aload_0
/*     */         //   6: getfield label : I
/*     */         //   9: tableswitch default -> 898, 0 -> 48, 1 -> 120, 2 -> 218, 3 -> 640, 4 -> 702, 5 -> 861
/*     */         //   48: aload_1
/*     */         //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   52: new kotlin/jvm/internal/Ref$ObjectRef
/*     */         //   55: dup
/*     */         //   56: invokespecial <init> : ()V
/*     */         //   59: astore_2
/*     */         //   60: aload_2
/*     */         //   61: aload_0
/*     */         //   62: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   65: invokeinterface getValue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */         //   70: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*     */         //   73: putfield element : Ljava/lang/Object;
/*     */         //   76: aload_0
/*     */         //   77: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */         //   80: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
/*     */         //   85: astore_3
/*     */         //   86: aload_3
/*     */         //   87: aload_0
/*     */         //   88: checkcast kotlin/coroutines/Continuation
/*     */         //   91: aload_0
/*     */         //   92: aload_2
/*     */         //   93: putfield L$0 : Ljava/lang/Object;
/*     */         //   96: aload_0
/*     */         //   97: aload_3
/*     */         //   98: putfield L$1 : Ljava/lang/Object;
/*     */         //   101: aload_0
/*     */         //   102: iconst_1
/*     */         //   103: putfield label : I
/*     */         //   106: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   111: dup
/*     */         //   112: aload #7
/*     */         //   114: if_acmpne -> 141
/*     */         //   117: aload #7
/*     */         //   119: areturn
/*     */         //   120: aload_0
/*     */         //   121: getfield L$1 : Ljava/lang/Object;
/*     */         //   124: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */         //   127: astore_3
/*     */         //   128: aload_0
/*     */         //   129: getfield L$0 : Ljava/lang/Object;
/*     */         //   132: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */         //   135: astore_2
/*     */         //   136: aload_1
/*     */         //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   140: aload_1
/*     */         //   141: checkcast java/lang/Boolean
/*     */         //   144: invokevirtual booleanValue : ()Z
/*     */         //   147: ifeq -> 894
/*     */         //   150: aload_3
/*     */         //   151: invokeinterface next : ()Ljava/lang/Object;
/*     */         //   156: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent
/*     */         //   159: astore #4
/*     */         //   161: aload #4
/*     */         //   163: astore #5
/*     */         //   165: aload #5
/*     */         //   167: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$NameAppeared
/*     */         //   170: ifeq -> 243
/*     */         //   173: aload_0
/*     */         //   174: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   177: aload #4
/*     */         //   179: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$NameAppeared
/*     */         //   182: invokevirtual getName : ()Ljava/lang/String;
/*     */         //   185: aload_0
/*     */         //   186: checkcast kotlin/coroutines/Continuation
/*     */         //   189: aload_0
/*     */         //   190: aload_2
/*     */         //   191: putfield L$0 : Ljava/lang/Object;
/*     */         //   194: aload_0
/*     */         //   195: aload_3
/*     */         //   196: putfield L$1 : Ljava/lang/Object;
/*     */         //   199: aload_0
/*     */         //   200: iconst_2
/*     */         //   201: putfield label : I
/*     */         //   204: invokeinterface tryUpdateName : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   209: dup
/*     */         //   210: aload #7
/*     */         //   212: if_acmpne -> 239
/*     */         //   215: aload #7
/*     */         //   217: areturn
/*     */         //   218: aload_0
/*     */         //   219: getfield L$1 : Ljava/lang/Object;
/*     */         //   222: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */         //   225: astore_3
/*     */         //   226: aload_0
/*     */         //   227: getfield L$0 : Ljava/lang/Object;
/*     */         //   230: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */         //   233: astore_2
/*     */         //   234: aload_1
/*     */         //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   238: aload_1
/*     */         //   239: pop
/*     */         //   240: goto -> 86
/*     */         //   243: aload #5
/*     */         //   245: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */         //   248: ifeq -> 427
/*     */         //   251: aload #4
/*     */         //   253: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */         //   256: invokevirtual getIndex : ()I
/*     */         //   259: iconst_1
/*     */         //   260: iadd
/*     */         //   261: aload_2
/*     */         //   262: getfield element : Ljava/lang/Object;
/*     */         //   265: checkcast kotlinx/collections/immutable/PersistentList
/*     */         //   268: invokeinterface size : ()I
/*     */         //   273: if_icmpgt -> 280
/*     */         //   276: iconst_1
/*     */         //   277: goto -> 281
/*     */         //   280: iconst_0
/*     */         //   281: ifne -> 327
/*     */         //   284: iconst_0
/*     */         //   285: istore #6
/*     */         //   287: aload #4
/*     */         //   289: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */         //   292: invokevirtual getIndex : ()I
/*     */         //   295: aload_2
/*     */         //   296: getfield element : Ljava/lang/Object;
/*     */         //   299: checkcast kotlinx/collections/immutable/PersistentList
/*     */         //   302: invokeinterface size : ()I
/*     */         //   307: <illegal opcode> makeConcatWithConstants : (II)Ljava/lang/String;
/*     */         //   312: astore #6
/*     */         //   314: new java/lang/IllegalArgumentException
/*     */         //   317: dup
/*     */         //   318: aload #6
/*     */         //   320: invokevirtual toString : ()Ljava/lang/String;
/*     */         //   323: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   326: athrow
/*     */         //   327: aload_2
/*     */         //   328: aload #4
/*     */         //   330: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */         //   333: invokevirtual getIndex : ()I
/*     */         //   336: iconst_1
/*     */         //   337: iadd
/*     */         //   338: aload_2
/*     */         //   339: getfield element : Ljava/lang/Object;
/*     */         //   342: checkcast kotlinx/collections/immutable/PersistentList
/*     */         //   345: invokeinterface size : ()I
/*     */         //   350: if_icmpne -> 376
/*     */         //   353: aload_2
/*     */         //   354: getfield element : Ljava/lang/Object;
/*     */         //   357: checkcast kotlinx/collections/immutable/PersistentList
/*     */         //   360: aload #4
/*     */         //   362: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */         //   365: invokevirtual getStep : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*     */         //   368: invokeinterface add : (Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */         //   373: goto -> 406
/*     */         //   376: aload_2
/*     */         //   377: getfield element : Ljava/lang/Object;
/*     */         //   380: checkcast kotlinx/collections/immutable/PersistentList
/*     */         //   383: aload #4
/*     */         //   385: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */         //   388: invokevirtual getIndex : ()I
/*     */         //   391: iconst_1
/*     */         //   392: iadd
/*     */         //   393: aload #4
/*     */         //   395: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */         //   398: invokevirtual getStep : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*     */         //   401: invokeinterface set : (ILjava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */         //   406: putfield element : Ljava/lang/Object;
/*     */         //   409: aload_0
/*     */         //   410: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   413: aload_2
/*     */         //   414: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */         //   419: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */         //   424: goto -> 86
/*     */         //   427: aload #5
/*     */         //   429: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */         //   432: ifeq -> 518
/*     */         //   435: aload_2
/*     */         //   436: aload_2
/*     */         //   437: getfield element : Ljava/lang/Object;
/*     */         //   440: checkcast kotlinx/collections/immutable/PersistentList
/*     */         //   443: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*     */         //   446: dup
/*     */         //   447: aload #4
/*     */         //   449: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */         //   452: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */         //   455: invokevirtual getTitle : ()Ljava/lang/String;
/*     */         //   458: aload #4
/*     */         //   460: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */         //   463: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */         //   466: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */         //   469: aload #4
/*     */         //   471: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */         //   474: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */         //   477: invokevirtual getOutput : ()Ljava/lang/String;
/*     */         //   480: invokestatic emptyList : ()Ljava/util/List;
/*     */         //   483: invokestatic emptyList : ()Ljava/util/List;
/*     */         //   486: aconst_null
/*     */         //   487: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V
/*     */         //   490: invokeinterface add : (Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */         //   495: putfield element : Ljava/lang/Object;
/*     */         //   498: aload_0
/*     */         //   499: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   502: aload_2
/*     */         //   503: aload #4
/*     */         //   505: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */         //   510: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */         //   515: goto -> 86
/*     */         //   518: aload #5
/*     */         //   520: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionFinished
/*     */         //   523: ifeq -> 545
/*     */         //   526: aload_0
/*     */         //   527: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   530: aload #4
/*     */         //   532: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */         //   537: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */         //   542: goto -> 86
/*     */         //   545: aload #5
/*     */         //   547: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionStarted
/*     */         //   550: ifeq -> 572
/*     */         //   553: aload_0
/*     */         //   554: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   557: aload #4
/*     */         //   559: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */         //   564: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */         //   569: goto -> 86
/*     */         //   572: aload #5
/*     */         //   574: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ErrorOccurred
/*     */         //   577: ifeq -> 727
/*     */         //   580: aload_0
/*     */         //   581: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   584: aload #4
/*     */         //   586: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ErrorOccurred
/*     */         //   589: invokevirtual getException : ()Ljava/lang/Exception;
/*     */         //   592: dup
/*     */         //   593: ifnull -> 603
/*     */         //   596: invokevirtual getMessage : ()Ljava/lang/String;
/*     */         //   599: dup
/*     */         //   600: ifnonnull -> 607
/*     */         //   603: pop
/*     */         //   604: ldc_w 'Unknown error'
/*     */         //   607: aload_0
/*     */         //   608: checkcast kotlin/coroutines/Continuation
/*     */         //   611: aload_0
/*     */         //   612: aload_2
/*     */         //   613: putfield L$0 : Ljava/lang/Object;
/*     */         //   616: aload_0
/*     */         //   617: aload_3
/*     */         //   618: putfield L$1 : Ljava/lang/Object;
/*     */         //   621: aload_0
/*     */         //   622: iconst_3
/*     */         //   623: putfield label : I
/*     */         //   626: invokeinterface updateError : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   631: dup
/*     */         //   632: aload #7
/*     */         //   634: if_acmpne -> 661
/*     */         //   637: aload #7
/*     */         //   639: areturn
/*     */         //   640: aload_0
/*     */         //   641: getfield L$1 : Ljava/lang/Object;
/*     */         //   644: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */         //   647: astore_3
/*     */         //   648: aload_0
/*     */         //   649: getfield L$0 : Ljava/lang/Object;
/*     */         //   652: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */         //   655: astore_2
/*     */         //   656: aload_1
/*     */         //   657: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   660: aload_1
/*     */         //   661: pop
/*     */         //   662: aload_0
/*     */         //   663: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   666: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Failed : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */         //   669: aload_0
/*     */         //   670: checkcast kotlin/coroutines/Continuation
/*     */         //   673: aload_0
/*     */         //   674: aload_2
/*     */         //   675: putfield L$0 : Ljava/lang/Object;
/*     */         //   678: aload_0
/*     */         //   679: aload_3
/*     */         //   680: putfield L$1 : Ljava/lang/Object;
/*     */         //   683: aload_0
/*     */         //   684: iconst_4
/*     */         //   685: putfield label : I
/*     */         //   688: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   693: dup
/*     */         //   694: aload #7
/*     */         //   696: if_acmpne -> 723
/*     */         //   699: aload #7
/*     */         //   701: areturn
/*     */         //   702: aload_0
/*     */         //   703: getfield L$1 : Ljava/lang/Object;
/*     */         //   706: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */         //   709: astore_3
/*     */         //   710: aload_0
/*     */         //   711: getfield L$0 : Ljava/lang/Object;
/*     */         //   714: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */         //   717: astore_2
/*     */         //   718: aload_1
/*     */         //   719: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   722: aload_1
/*     */         //   723: pop
/*     */         //   724: goto -> 86
/*     */         //   727: aload #5
/*     */         //   729: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentStateUpdated
/*     */         //   732: ifeq -> 754
/*     */         //   735: aload_0
/*     */         //   736: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   739: aload #4
/*     */         //   741: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */         //   746: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */         //   751: goto -> 86
/*     */         //   754: aload #5
/*     */         //   756: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentSessionHistoryUpdated
/*     */         //   759: ifeq -> 781
/*     */         //   762: aload_0
/*     */         //   763: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   766: aload #4
/*     */         //   768: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */         //   773: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */         //   778: goto -> 86
/*     */         //   781: aload #5
/*     */         //   783: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$PlanUpdated
/*     */         //   786: ifeq -> 808
/*     */         //   789: aload_0
/*     */         //   790: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   793: aload #4
/*     */         //   795: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */         //   800: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */         //   805: goto -> 86
/*     */         //   808: aload #5
/*     */         //   810: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ProgressUpdated
/*     */         //   813: ifeq -> 886
/*     */         //   816: aload_0
/*     */         //   817: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */         //   820: aload #4
/*     */         //   822: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ProgressUpdated
/*     */         //   825: invokevirtual getProgress : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;
/*     */         //   828: aload_0
/*     */         //   829: checkcast kotlin/coroutines/Continuation
/*     */         //   832: aload_0
/*     */         //   833: aload_2
/*     */         //   834: putfield L$0 : Ljava/lang/Object;
/*     */         //   837: aload_0
/*     */         //   838: aload_3
/*     */         //   839: putfield L$1 : Ljava/lang/Object;
/*     */         //   842: aload_0
/*     */         //   843: iconst_5
/*     */         //   844: putfield label : I
/*     */         //   847: invokeinterface updateProgress : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   852: dup
/*     */         //   853: aload #7
/*     */         //   855: if_acmpne -> 882
/*     */         //   858: aload #7
/*     */         //   860: areturn
/*     */         //   861: aload_0
/*     */         //   862: getfield L$1 : Ljava/lang/Object;
/*     */         //   865: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */         //   868: astore_3
/*     */         //   869: aload_0
/*     */         //   870: getfield L$0 : Ljava/lang/Object;
/*     */         //   873: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */         //   876: astore_2
/*     */         //   877: aload_1
/*     */         //   878: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   881: aload_1
/*     */         //   882: pop
/*     */         //   883: goto -> 86
/*     */         //   886: new kotlin/NoWhenBranchMatchedException
/*     */         //   889: dup
/*     */         //   890: invokespecial <init> : ()V
/*     */         //   893: athrow
/*     */         //   894: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */         //   897: areturn
/*     */         //   898: new java/lang/IllegalStateException
/*     */         //   901: dup
/*     */         //   902: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */         //   905: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   908: athrow
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #75	-> 3
/*     */         //   #77	-> 52
/*     */         //   #78	-> 76
/*     */         //   #75	-> 117
/*     */         //   #78	-> 141
/*     */         //   #79	-> 161
/*     */         //   #80	-> 165
/*     */         //   #81	-> 173
/*     */         //   #75	-> 215
/*     */         //   #81	-> 239
/*     */         //   #84	-> 243
/*     */         //   #85	-> 251
/*     */         //   #317	-> 284
/*     */         //   #85	-> 287
/*     */         //   #85	-> 312
/*     */         //   #86	-> 327
/*     */         //   #87	-> 353
/*     */         //   #89	-> 376
/*     */         //   #86	-> 406
/*     */         //   #91	-> 409
/*     */         //   #96	-> 427
/*     */         //   #98	-> 435
/*     */         //   #99	-> 443
/*     */         //   #100	-> 447
/*     */         //   #101	-> 458
/*     */         //   #102	-> 469
/*     */         //   #103	-> 480
/*     */         //   #104	-> 483
/*     */         //   #105	-> 486
/*     */         //   #99	-> 487
/*     */         //   #98	-> 490
/*     */         //   #108	-> 498
/*     */         //   #118	-> 518
/*     */         //   #119	-> 526
/*     */         //   #127	-> 545
/*     */         //   #128	-> 553
/*     */         //   #135	-> 572
/*     */         //   #136	-> 580
/*     */         //   #75	-> 637
/*     */         //   #137	-> 661
/*     */         //   #75	-> 699
/*     */         //   #137	-> 723
/*     */         //   #140	-> 727
/*     */         //   #141	-> 735
/*     */         //   #146	-> 754
/*     */         //   #147	-> 762
/*     */         //   #152	-> 781
/*     */         //   #153	-> 789
/*     */         //   #158	-> 808
/*     */         //   #159	-> 816
/*     */         //   #75	-> 858
/*     */         //   #159	-> 882
/*     */         //   #79	-> 886
/*     */         //   #163	-> 894
/*     */         //   #75	-> 898
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   60	60	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   136	82	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   234	78	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   327	156	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   483	3	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   486	154	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   656	46	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   718	143	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   877	9	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   894	4	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */         //   161	48	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   243	69	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   327	49	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   376	30	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   427	56	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   483	3	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   486	32	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   518	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   545	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   572	20	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   727	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   754	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   781	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   808	44	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */         //   287	25	6	$i$a$-require-AITaskLauncher$launch$job$1$linearTreeConversionJob$1$1	I
/*     */         //   0	909	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$linearTreeConversionJob$1;
/*     */         //   52	846	1	$result	Ljava/lang/Object;
/*     */       }
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$launch$job$1$linearTreeConversionJob$1> $completion) {
/*     */         return (Continuation<Unit>)new AITaskLauncher$launch$job$1$linearTreeConversionJob$1(this.$updater, this.$channel, $completion);
/*     */       }
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((AITaskLauncher$launch$job$1$linearTreeConversionJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */       
/*     */       private static final LiveTaskSnapshot invokeSuspend$lambda$2(Ref.ObjectRef $steps, StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 110 */         PersistentList persistentList = (PersistentList)$steps.element;
/* 111 */         TaskEntity taskEntity2 = it.getTask();
/* 112 */         AgentSessionHistorySnapshot agentSessionHistorySnapshot = ((StepBuildingEvent.ResultAppeared)$stepBuildingEvent).getResult().getSessionHistory();
/* 113 */         String str = ((StepBuildingEvent.ResultAppeared)$stepBuildingEvent).getResult().getPatch(); TaskEntity taskEntity1 = TaskEntity.copy$default(taskEntity2, null, null, null, null, null, null, null, false, null, str, null, agentSessionHistorySnapshot, 1535, null);
/*     */         return LiveTaskSnapshot.copy$default(it, null, taskEntity1, persistentList, null, null, 25, null);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       private static final LiveTaskSnapshot invokeSuspend$lambda$3(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot snapshot) {
/* 121 */         TerminalState.SessionLogAvailable sessionLogAvailable = new TerminalState.SessionLogAvailable(((StepBuildingEvent.TerminalSessionFinished)$stepBuildingEvent).getSessionLog());
/* 122 */         TaskEntity taskEntity = TaskEntity.copy$default(snapshot.getTask(), null, null, null, null, null, null, null, false, null, null, ((StepBuildingEvent.TerminalSessionFinished)$stepBuildingEvent).getSessionLog(), null, 3071, null); return LiveTaskSnapshot.copy$default(snapshot, null, taskEntity, null, (TerminalState)sessionLogAvailable, null, 21, null);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       private static final LiveTaskSnapshot invokeSuspend$lambda$4(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot snapshot) {
/* 129 */         return LiveTaskSnapshot.copy$default(snapshot, null, null, null, 
/* 130 */             (TerminalState)new TerminalState.TerminalAvailable(((StepBuildingEvent.TerminalSessionStarted)$stepBuildingEvent).getOpenAction()), null, 23, null);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       private static final LiveTaskSnapshot invokeSuspend$lambda$5(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 142 */         return LiveTaskSnapshot.copy$default(it, null, TaskEntity.copy$default(it.getTask(), null, null, null, null, null, null, ((StepBuildingEvent.AgentStateUpdated)$stepBuildingEvent).getAgentState(), false, null, null, null, null, 4031, null), null, null, null, 29, null);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       private static final LiveTaskSnapshot invokeSuspend$lambda$6(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 148 */         return LiveTaskSnapshot.copy$default(it, null, TaskEntity.copy$default(it.getTask(), null, null, null, null, null, null, null, false, null, null, null, ((StepBuildingEvent.AgentSessionHistoryUpdated)$stepBuildingEvent).getHistorySnapshot(), 2047, null), null, null, null, 29, null);
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*     */       private static final LiveTaskSnapshot invokeSuspend$lambda$7(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 154 */         return LiveTaskSnapshot.copy$default(it, null, TaskEntity.copy$default(it.getTask(), null, null, null, null, null, null, null, false, ((StepBuildingEvent.PlanUpdated)$stepBuildingEvent).getPlan(), null, null, null, 3839, null), null, null, null, 29, null);
/*     */       } }
/*     */     @DebugMetadata(f = "AITaskLauncher.kt", l = {167}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$launch$job$1$taskJob$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class AITaskLauncher$launch$job$1$taskJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*     */       
/*     */       AITaskLauncher$launch$job$1$taskJob$1(Project $project, TaskEntity $task, StepsBuildingContextListener $listener, Job $topLevelJob, TaskChainId $chainId, TaskSnapshotUpdater $updater, Channel<StepBuildingEvent> $channel, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       public final Object invokeSuspend(Object $result) {
/* 165 */         Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */             
/* 167 */             this.label = 1; if (AITaskLauncher.this.submitTask(this.$project, this.$task, this.$listener, this.$topLevelJob, this.$chainId, this.$updater, (Continuation)this) == object) return object;  AITaskLauncher.this.submitTask(this.$project, this.$task, this.$listener, this.$topLevelJob, this.$chainId, this.$updater, (Continuation)this);
/* 168 */             SendChannel.DefaultImpls.close$default((SendChannel)this.$channel, null, 1, null);
/* 169 */             return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); SendChannel.DefaultImpls.close$default((SendChannel)this.$channel, null, 1, null); return Unit.INSTANCE; }
/*     */         
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$launch$job$1$taskJob$1> $completion) {
/*     */         return (Continuation<Unit>)new AITaskLauncher$launch$job$1$taskJob$1(this.$project, this.$task, this.$listener, this.$topLevelJob, this.$chainId, this.$updater, this.$channel, $completion);
/*     */       }
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((AITaskLauncher$launch$job$1$taskJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       } } }
/*     */   @Nullable
/*     */   public final Object isSensitiveFile(@NotNull Project project, @NotNull Path path, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$isSensitiveFile$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$isSensitiveFile$1
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$isSensitiveFile$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 277, 0 -> 88, 1 -> 218
/*     */     //   88: aload #10
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector$Companion;
/*     */     //   96: invokevirtual getEP_NAME : ()Lcom/intellij/openapi/extensions/ExtensionPointName;
/*     */     //   99: invokevirtual getExtensionList : ()Ljava/util/List;
/*     */     //   102: checkcast java/lang/Iterable
/*     */     //   105: astore #4
/*     */     //   107: iconst_0
/*     */     //   108: istore #5
/*     */     //   110: aload #4
/*     */     //   112: instanceof java/util/Collection
/*     */     //   115: ifeq -> 135
/*     */     //   118: aload #4
/*     */     //   120: checkcast java/util/Collection
/*     */     //   123: invokeinterface isEmpty : ()Z
/*     */     //   128: ifeq -> 135
/*     */     //   131: iconst_0
/*     */     //   132: goto -> 273
/*     */     //   135: aload #4
/*     */     //   137: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   142: astore #6
/*     */     //   144: aload #6
/*     */     //   146: invokeinterface hasNext : ()Z
/*     */     //   151: ifeq -> 272
/*     */     //   154: aload #6
/*     */     //   156: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   161: astore #7
/*     */     //   163: aload #7
/*     */     //   165: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector
/*     */     //   168: astore #8
/*     */     //   170: iconst_0
/*     */     //   171: istore #9
/*     */     //   173: aload #8
/*     */     //   175: aload_1
/*     */     //   176: aload_2
/*     */     //   177: aload #11
/*     */     //   179: aload #11
/*     */     //   181: aload_1
/*     */     //   182: putfield L$0 : Ljava/lang/Object;
/*     */     //   185: aload #11
/*     */     //   187: aload_2
/*     */     //   188: putfield L$1 : Ljava/lang/Object;
/*     */     //   191: aload #11
/*     */     //   193: aload #6
/*     */     //   195: putfield L$2 : Ljava/lang/Object;
/*     */     //   198: aload #11
/*     */     //   200: iconst_1
/*     */     //   201: putfield label : I
/*     */     //   204: invokeinterface isSensitiveFile : (Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   209: dup
/*     */     //   210: aload #12
/*     */     //   212: if_acmpne -> 259
/*     */     //   215: aload #12
/*     */     //   217: areturn
/*     */     //   218: iconst_0
/*     */     //   219: istore #5
/*     */     //   221: iconst_0
/*     */     //   222: istore #9
/*     */     //   224: aload #11
/*     */     //   226: getfield L$2 : Ljava/lang/Object;
/*     */     //   229: checkcast java/util/Iterator
/*     */     //   232: astore #6
/*     */     //   234: aload #11
/*     */     //   236: getfield L$1 : Ljava/lang/Object;
/*     */     //   239: checkcast java/nio/file/Path
/*     */     //   242: astore_2
/*     */     //   243: aload #11
/*     */     //   245: getfield L$0 : Ljava/lang/Object;
/*     */     //   248: checkcast com/intellij/openapi/project/Project
/*     */     //   251: astore_1
/*     */     //   252: aload #10
/*     */     //   254: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   257: aload #10
/*     */     //   259: checkcast java/lang/Boolean
/*     */     //   262: invokevirtual booleanValue : ()Z
/*     */     //   265: ifeq -> 144
/*     */     //   268: iconst_1
/*     */     //   269: goto -> 273
/*     */     //   272: iconst_0
/*     */     //   273: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   276: areturn
/*     */     //   277: new java/lang/IllegalStateException
/*     */     //   280: dup
/*     */     //   281: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   283: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   286: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #176	-> 60
/*     */     //   #177	-> 93
/*     */     //   #317	-> 110
/*     */     //   #318	-> 135
/*     */     //   #177	-> 173
/*     */     //   #176	-> 215
/*     */     //   #177	-> 259
/*     */     //   #318	-> 265
/*     */     //   #319	-> 272
/*     */     //   #177	-> 276
/*     */     //   #176	-> 277
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	42	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   135	83	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   252	13	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   265	7	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   93	42	2	path	Ljava/nio/file/Path;
/*     */     //   135	83	2	path	Ljava/nio/file/Path;
/*     */     //   243	22	2	path	Ljava/nio/file/Path;
/*     */     //   265	7	2	path	Ljava/nio/file/Path;
/*     */     //   107	28	4	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   135	9	4	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   163	7	7	element$iv	Ljava/lang/Object;
/*     */     //   170	39	8	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SensitiveFileDetector;
/*     */     //   173	45	9	$i$a$-any-AITaskLauncher$isSensitiveFile$2	I
/*     */     //   110	108	5	$i$f$any	I
/*     */     //   0	287	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	227	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	220	10	$result	Ljava/lang/Object;
/*     */     //   224	41	9	$i$a$-any-AITaskLauncher$isSensitiveFile$2	I
/*     */     //   221	52	5	$i$f$any	I
/*     */   }
/*     */   private final Object submitTask(Project project, TaskEntity task, StepsBuildingContextListener artifactualListener, Job currentJob, TaskChainId chainId, TaskSnapshotUpdater updater, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #7
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$1
/*     */     //   13: astore #25
/*     */     //   15: aload #25
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #25
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #7
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #25
/*     */     //   53: aload #25
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #24
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #26
/*     */     //   65: aload #25
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 1753, 0 -> 112, 1 -> 248, 2 -> 494, 3 -> 896, 4 -> 1145, 5 -> 1457, 6 -> 1743
/*     */     //   112: aload #24
/*     */     //   114: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   117: getstatic com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupportProvider$Companion;
/*     */     //   120: aload_1
/*     */     //   121: invokevirtual getSupport : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
/*     */     //   124: astore #8
/*     */     //   126: aload_2
/*     */     //   127: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   130: checkcast java/lang/CharSequence
/*     */     //   133: invokestatic lineSequence : (Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;
/*     */     //   136: invokestatic firstOrNull : (Lkotlin/sequences/Sequence;)Ljava/lang/Object;
/*     */     //   139: checkcast java/lang/String
/*     */     //   142: dup
/*     */     //   143: ifnonnull -> 151
/*     */     //   146: pop
/*     */     //   147: aload_2
/*     */     //   148: invokevirtual getArtifactPath : ()Ljava/lang/String;
/*     */     //   151: pop
/*     */     //   152: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */     //   155: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   158: astore #9
/*     */     //   160: aload #8
/*     */     //   162: aload_2
/*     */     //   163: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
/*     */     //   166: invokeinterface getIssueWorker : (Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;)Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker;
/*     */     //   171: aload #9
/*     */     //   173: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */     //   176: aload #25
/*     */     //   178: aload #25
/*     */     //   180: aload_0
/*     */     //   181: putfield L$0 : Ljava/lang/Object;
/*     */     //   184: aload #25
/*     */     //   186: aload_1
/*     */     //   187: putfield L$1 : Ljava/lang/Object;
/*     */     //   190: aload #25
/*     */     //   192: aload_2
/*     */     //   193: putfield L$2 : Ljava/lang/Object;
/*     */     //   196: aload #25
/*     */     //   198: aload_3
/*     */     //   199: putfield L$3 : Ljava/lang/Object;
/*     */     //   202: aload #25
/*     */     //   204: aload #4
/*     */     //   206: putfield L$4 : Ljava/lang/Object;
/*     */     //   209: aload #25
/*     */     //   211: aload #5
/*     */     //   213: putfield L$5 : Ljava/lang/Object;
/*     */     //   216: aload #25
/*     */     //   218: aload #6
/*     */     //   220: putfield L$6 : Ljava/lang/Object;
/*     */     //   223: aload #25
/*     */     //   225: aload #8
/*     */     //   227: putfield L$7 : Ljava/lang/Object;
/*     */     //   230: aload #25
/*     */     //   232: iconst_1
/*     */     //   233: putfield label : I
/*     */     //   236: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   239: dup
/*     */     //   240: aload #26
/*     */     //   242: if_acmpne -> 331
/*     */     //   245: aload #26
/*     */     //   247: areturn
/*     */     //   248: aload #25
/*     */     //   250: getfield L$7 : Ljava/lang/Object;
/*     */     //   253: checkcast com/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport
/*     */     //   256: astore #8
/*     */     //   258: aload #25
/*     */     //   260: getfield L$6 : Ljava/lang/Object;
/*     */     //   263: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater
/*     */     //   266: astore #6
/*     */     //   268: aload #25
/*     */     //   270: getfield L$5 : Ljava/lang/Object;
/*     */     //   273: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   276: astore #5
/*     */     //   278: aload #25
/*     */     //   280: getfield L$4 : Ljava/lang/Object;
/*     */     //   283: checkcast kotlinx/coroutines/Job
/*     */     //   286: astore #4
/*     */     //   288: aload #25
/*     */     //   290: getfield L$3 : Ljava/lang/Object;
/*     */     //   293: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener
/*     */     //   296: astore_3
/*     */     //   297: aload #25
/*     */     //   299: getfield L$2 : Ljava/lang/Object;
/*     */     //   302: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity
/*     */     //   305: astore_2
/*     */     //   306: aload #25
/*     */     //   308: getfield L$1 : Ljava/lang/Object;
/*     */     //   311: checkcast com/intellij/openapi/project/Project
/*     */     //   314: astore_1
/*     */     //   315: aload #25
/*     */     //   317: getfield L$0 : Ljava/lang/Object;
/*     */     //   320: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher
/*     */     //   323: astore_0
/*     */     //   324: aload #24
/*     */     //   326: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   329: aload #24
/*     */     //   331: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*     */     //   334: invokevirtual getModelParameters : ()Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   337: astore #10
/*     */     //   339: getstatic com/intellij/ml/llm/matterhorn/ej/ui/activation/JuniePluginLLMProxyProvider.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JuniePluginLLMProxyProvider;
/*     */     //   342: aload_1
/*     */     //   343: invokevirtual createLLMProxy : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   346: astore #11
/*     */     //   348: aload_0
/*     */     //   349: aload #10
/*     */     //   351: aload_2
/*     */     //   352: invokevirtual getExplicitlySelectedContextFiles : ()Ljava/util/List;
/*     */     //   355: aload #11
/*     */     //   357: invokeinterface getImagesSupported : ()Z
/*     */     //   362: invokevirtual separateImagesAndTextFiles : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;Z)Lkotlin/Pair;
/*     */     //   365: astore #12
/*     */     //   367: new com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   370: dup
/*     */     //   371: aload_2
/*     */     //   372: invokevirtual getArtifactPath : ()Ljava/lang/String;
/*     */     //   375: aload #8
/*     */     //   377: aload_2
/*     */     //   378: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
/*     */     //   381: invokeinterface getResolveIssueArtifactType : (Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;)Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   386: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)V
/*     */     //   389: astore #14
/*     */     //   391: aload_2
/*     */     //   392: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   395: astore #15
/*     */     //   397: getstatic com/intellij/ml/llm/matterhorn/ej/core/EditorContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */     //   400: aload_1
/*     */     //   401: aload #25
/*     */     //   403: aload #25
/*     */     //   405: aload_0
/*     */     //   406: putfield L$0 : Ljava/lang/Object;
/*     */     //   409: aload #25
/*     */     //   411: aload_1
/*     */     //   412: putfield L$1 : Ljava/lang/Object;
/*     */     //   415: aload #25
/*     */     //   417: aload_2
/*     */     //   418: putfield L$2 : Ljava/lang/Object;
/*     */     //   421: aload #25
/*     */     //   423: aload_3
/*     */     //   424: putfield L$3 : Ljava/lang/Object;
/*     */     //   427: aload #25
/*     */     //   429: aload #4
/*     */     //   431: putfield L$4 : Ljava/lang/Object;
/*     */     //   434: aload #25
/*     */     //   436: aload #5
/*     */     //   438: putfield L$5 : Ljava/lang/Object;
/*     */     //   441: aload #25
/*     */     //   443: aload #6
/*     */     //   445: putfield L$6 : Ljava/lang/Object;
/*     */     //   448: aload #25
/*     */     //   450: aload #11
/*     */     //   452: putfield L$7 : Ljava/lang/Object;
/*     */     //   455: aload #25
/*     */     //   457: aload #12
/*     */     //   459: putfield L$8 : Ljava/lang/Object;
/*     */     //   462: aload #25
/*     */     //   464: aload #14
/*     */     //   466: putfield L$9 : Ljava/lang/Object;
/*     */     //   469: aload #25
/*     */     //   471: aload #15
/*     */     //   473: putfield L$10 : Ljava/lang/Object;
/*     */     //   476: aload #25
/*     */     //   478: iconst_2
/*     */     //   479: putfield label : I
/*     */     //   482: invokevirtual collectEditorContext : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   485: dup
/*     */     //   486: aload #26
/*     */     //   488: if_acmpne -> 607
/*     */     //   491: aload #26
/*     */     //   493: areturn
/*     */     //   494: aload #25
/*     */     //   496: getfield L$10 : Ljava/lang/Object;
/*     */     //   499: checkcast java/lang/String
/*     */     //   502: astore #15
/*     */     //   504: aload #25
/*     */     //   506: getfield L$9 : Ljava/lang/Object;
/*     */     //   509: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   512: astore #14
/*     */     //   514: aload #25
/*     */     //   516: getfield L$8 : Ljava/lang/Object;
/*     */     //   519: checkcast kotlin/Pair
/*     */     //   522: astore #12
/*     */     //   524: aload #25
/*     */     //   526: getfield L$7 : Ljava/lang/Object;
/*     */     //   529: checkcast com/intellij/ml/llm/matterhorn/llm/LLMProxy
/*     */     //   532: astore #11
/*     */     //   534: aload #25
/*     */     //   536: getfield L$6 : Ljava/lang/Object;
/*     */     //   539: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater
/*     */     //   542: astore #6
/*     */     //   544: aload #25
/*     */     //   546: getfield L$5 : Ljava/lang/Object;
/*     */     //   549: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   552: astore #5
/*     */     //   554: aload #25
/*     */     //   556: getfield L$4 : Ljava/lang/Object;
/*     */     //   559: checkcast kotlinx/coroutines/Job
/*     */     //   562: astore #4
/*     */     //   564: aload #25
/*     */     //   566: getfield L$3 : Ljava/lang/Object;
/*     */     //   569: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener
/*     */     //   572: astore_3
/*     */     //   573: aload #25
/*     */     //   575: getfield L$2 : Ljava/lang/Object;
/*     */     //   578: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity
/*     */     //   581: astore_2
/*     */     //   582: aload #25
/*     */     //   584: getfield L$1 : Ljava/lang/Object;
/*     */     //   587: checkcast com/intellij/openapi/project/Project
/*     */     //   590: astore_1
/*     */     //   591: aload #25
/*     */     //   593: getfield L$0 : Ljava/lang/Object;
/*     */     //   596: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher
/*     */     //   599: astore_0
/*     */     //   600: aload #24
/*     */     //   602: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   605: aload #24
/*     */     //   607: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext
/*     */     //   610: astore #16
/*     */     //   612: aload #12
/*     */     //   614: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   617: checkcast java/util/List
/*     */     //   620: astore #17
/*     */     //   622: aload #12
/*     */     //   624: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   627: checkcast java/util/List
/*     */     //   630: astore #18
/*     */     //   632: aload_2
/*     */     //   633: invokevirtual getPreviousTasksInfo : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;
/*     */     //   636: astore #19
/*     */     //   638: new com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */     //   641: dup
/*     */     //   642: ldc_w ''
/*     */     //   645: aload #15
/*     */     //   647: aload #16
/*     */     //   649: aload #17
/*     */     //   651: aload #19
/*     */     //   653: aconst_null
/*     */     //   654: aload #18
/*     */     //   656: aconst_null
/*     */     //   657: sipush #160
/*     */     //   660: aconst_null
/*     */     //   661: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   664: astore #15
/*     */     //   666: iconst_0
/*     */     //   667: istore #16
/*     */     //   669: new com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   672: dup
/*     */     //   673: aload #14
/*     */     //   675: aload #15
/*     */     //   677: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentIssue.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion;
/*     */     //   680: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   683: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V
/*     */     //   686: astore #13
/*     */     //   688: aload_1
/*     */     //   689: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   692: astore #15
/*     */     //   694: iconst_0
/*     */     //   695: istore #16
/*     */     //   697: ldc_w com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   700: astore #17
/*     */     //   702: aload #15
/*     */     //   704: aload #17
/*     */     //   706: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   711: dup
/*     */     //   712: ifnonnull -> 724
/*     */     //   715: pop
/*     */     //   716: aload #15
/*     */     //   718: aload #17
/*     */     //   720: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   723: athrow
/*     */     //   724: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   727: astore #14
/*     */     //   729: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   732: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   735: astore #16
/*     */     //   737: iconst_0
/*     */     //   738: istore #17
/*     */     //   740: ldc_w com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*     */     //   743: astore #18
/*     */     //   745: aload #16
/*     */     //   747: aload #18
/*     */     //   749: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   754: dup
/*     */     //   755: ifnonnull -> 767
/*     */     //   758: pop
/*     */     //   759: aload #16
/*     */     //   761: aload #18
/*     */     //   763: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   766: athrow
/*     */     //   767: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*     */     //   770: astore #15
/*     */     //   772: aload #15
/*     */     //   774: invokevirtual getBraveMode : ()Z
/*     */     //   777: istore #16
/*     */     //   779: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   782: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   785: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$executor$1
/*     */     //   788: dup
/*     */     //   789: aload_1
/*     */     //   790: aconst_null
/*     */     //   791: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */     //   794: checkcast kotlin/jvm/functions/Function2
/*     */     //   797: aload #25
/*     */     //   799: aload #25
/*     */     //   801: aload_0
/*     */     //   802: putfield L$0 : Ljava/lang/Object;
/*     */     //   805: aload #25
/*     */     //   807: aload_1
/*     */     //   808: putfield L$1 : Ljava/lang/Object;
/*     */     //   811: aload #25
/*     */     //   813: aload_2
/*     */     //   814: putfield L$2 : Ljava/lang/Object;
/*     */     //   817: aload #25
/*     */     //   819: aload_3
/*     */     //   820: putfield L$3 : Ljava/lang/Object;
/*     */     //   823: aload #25
/*     */     //   825: aload #4
/*     */     //   827: putfield L$4 : Ljava/lang/Object;
/*     */     //   830: aload #25
/*     */     //   832: aload #5
/*     */     //   834: putfield L$5 : Ljava/lang/Object;
/*     */     //   837: aload #25
/*     */     //   839: aload #6
/*     */     //   841: putfield L$6 : Ljava/lang/Object;
/*     */     //   844: aload #25
/*     */     //   846: aload #11
/*     */     //   848: putfield L$7 : Ljava/lang/Object;
/*     */     //   851: aload #25
/*     */     //   853: aload #13
/*     */     //   855: putfield L$8 : Ljava/lang/Object;
/*     */     //   858: aload #25
/*     */     //   860: aload #14
/*     */     //   862: putfield L$9 : Ljava/lang/Object;
/*     */     //   865: aload #25
/*     */     //   867: aconst_null
/*     */     //   868: putfield L$10 : Ljava/lang/Object;
/*     */     //   871: aload #25
/*     */     //   873: iload #16
/*     */     //   875: putfield Z$0 : Z
/*     */     //   878: aload #25
/*     */     //   880: iconst_3
/*     */     //   881: putfield label : I
/*     */     //   884: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   887: dup
/*     */     //   888: aload #26
/*     */     //   890: if_acmpne -> 1006
/*     */     //   893: aload #26
/*     */     //   895: areturn
/*     */     //   896: aload #25
/*     */     //   898: getfield Z$0 : Z
/*     */     //   901: istore #16
/*     */     //   903: aload #25
/*     */     //   905: getfield L$9 : Ljava/lang/Object;
/*     */     //   908: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   911: astore #14
/*     */     //   913: aload #25
/*     */     //   915: getfield L$8 : Ljava/lang/Object;
/*     */     //   918: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   921: astore #13
/*     */     //   923: aload #25
/*     */     //   925: getfield L$7 : Ljava/lang/Object;
/*     */     //   928: checkcast com/intellij/ml/llm/matterhorn/llm/LLMProxy
/*     */     //   931: astore #11
/*     */     //   933: aload #25
/*     */     //   935: getfield L$6 : Ljava/lang/Object;
/*     */     //   938: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater
/*     */     //   941: astore #6
/*     */     //   943: aload #25
/*     */     //   945: getfield L$5 : Ljava/lang/Object;
/*     */     //   948: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   951: astore #5
/*     */     //   953: aload #25
/*     */     //   955: getfield L$4 : Ljava/lang/Object;
/*     */     //   958: checkcast kotlinx/coroutines/Job
/*     */     //   961: astore #4
/*     */     //   963: aload #25
/*     */     //   965: getfield L$3 : Ljava/lang/Object;
/*     */     //   968: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener
/*     */     //   971: astore_3
/*     */     //   972: aload #25
/*     */     //   974: getfield L$2 : Ljava/lang/Object;
/*     */     //   977: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity
/*     */     //   980: astore_2
/*     */     //   981: aload #25
/*     */     //   983: getfield L$1 : Ljava/lang/Object;
/*     */     //   986: checkcast com/intellij/openapi/project/Project
/*     */     //   989: astore_1
/*     */     //   990: aload #25
/*     */     //   992: getfield L$0 : Ljava/lang/Object;
/*     */     //   995: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher
/*     */     //   998: astore_0
/*     */     //   999: aload #24
/*     */     //   1001: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1004: aload #24
/*     */     //   1006: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   1009: astore #17
/*     */     //   1011: aload_1
/*     */     //   1012: invokestatic obtainAIIgnoreChecker : (Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function1;
/*     */     //   1015: astore #18
/*     */     //   1017: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   1020: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   1023: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$context$1
/*     */     //   1026: dup
/*     */     //   1027: aload #14
/*     */     //   1029: aload #11
/*     */     //   1031: aload #13
/*     */     //   1033: aload #6
/*     */     //   1035: iload #16
/*     */     //   1037: ifeq -> 1044
/*     */     //   1040: iconst_1
/*     */     //   1041: goto -> 1045
/*     */     //   1044: iconst_0
/*     */     //   1045: aload #5
/*     */     //   1047: aload_2
/*     */     //   1048: aload #17
/*     */     //   1050: aload_0
/*     */     //   1051: aload_1
/*     */     //   1052: aload #18
/*     */     //   1054: aconst_null
/*     */     //   1055: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;ZLcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   1058: checkcast kotlin/jvm/functions/Function2
/*     */     //   1061: aload #25
/*     */     //   1063: aload #25
/*     */     //   1065: aload_1
/*     */     //   1066: putfield L$0 : Ljava/lang/Object;
/*     */     //   1069: aload #25
/*     */     //   1071: aload_2
/*     */     //   1072: putfield L$1 : Ljava/lang/Object;
/*     */     //   1075: aload #25
/*     */     //   1077: aload_3
/*     */     //   1078: putfield L$2 : Ljava/lang/Object;
/*     */     //   1081: aload #25
/*     */     //   1083: aload #4
/*     */     //   1085: putfield L$3 : Ljava/lang/Object;
/*     */     //   1088: aload #25
/*     */     //   1090: aload #5
/*     */     //   1092: putfield L$4 : Ljava/lang/Object;
/*     */     //   1095: aload #25
/*     */     //   1097: aload #13
/*     */     //   1099: putfield L$5 : Ljava/lang/Object;
/*     */     //   1102: aload #25
/*     */     //   1104: aload #17
/*     */     //   1106: putfield L$6 : Ljava/lang/Object;
/*     */     //   1109: aload #25
/*     */     //   1111: aconst_null
/*     */     //   1112: putfield L$7 : Ljava/lang/Object;
/*     */     //   1115: aload #25
/*     */     //   1117: aconst_null
/*     */     //   1118: putfield L$8 : Ljava/lang/Object;
/*     */     //   1121: aload #25
/*     */     //   1123: aconst_null
/*     */     //   1124: putfield L$9 : Ljava/lang/Object;
/*     */     //   1127: aload #25
/*     */     //   1129: iconst_4
/*     */     //   1130: putfield label : I
/*     */     //   1133: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1136: dup
/*     */     //   1137: aload #26
/*     */     //   1139: if_acmpne -> 1219
/*     */     //   1142: aload #26
/*     */     //   1144: areturn
/*     */     //   1145: aload #25
/*     */     //   1147: getfield L$6 : Ljava/lang/Object;
/*     */     //   1150: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   1153: astore #17
/*     */     //   1155: aload #25
/*     */     //   1157: getfield L$5 : Ljava/lang/Object;
/*     */     //   1160: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   1163: astore #13
/*     */     //   1165: aload #25
/*     */     //   1167: getfield L$4 : Ljava/lang/Object;
/*     */     //   1170: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   1173: astore #5
/*     */     //   1175: aload #25
/*     */     //   1177: getfield L$3 : Ljava/lang/Object;
/*     */     //   1180: checkcast kotlinx/coroutines/Job
/*     */     //   1183: astore #4
/*     */     //   1185: aload #25
/*     */     //   1187: getfield L$2 : Ljava/lang/Object;
/*     */     //   1190: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener
/*     */     //   1193: astore_3
/*     */     //   1194: aload #25
/*     */     //   1196: getfield L$1 : Ljava/lang/Object;
/*     */     //   1199: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity
/*     */     //   1202: astore_2
/*     */     //   1203: aload #25
/*     */     //   1205: getfield L$0 : Ljava/lang/Object;
/*     */     //   1208: checkcast com/intellij/openapi/project/Project
/*     */     //   1211: astore_1
/*     */     //   1212: aload #24
/*     */     //   1214: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1217: aload #24
/*     */     //   1219: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   1222: astore #19
/*     */     //   1224: aload_1
/*     */     //   1225: invokeinterface getMessageBus : ()Lcom/intellij/util/messages/MessageBus;
/*     */     //   1230: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceImpl.Companion : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceImpl$Companion;
/*     */     //   1233: invokevirtual getTOPIC : ()Lcom/intellij/util/messages/Topic;
/*     */     //   1236: invokeinterface syncPublisher : (Lcom/intellij/util/messages/Topic;)Ljava/lang/Object;
/*     */     //   1241: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskListener
/*     */     //   1244: aload #19
/*     */     //   1246: aload #4
/*     */     //   1248: invokeinterface beforeTaskStarted : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlinx/coroutines/Job;)V
/*     */     //   1253: aload #19
/*     */     //   1255: aload_3
/*     */     //   1256: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContextListener
/*     */     //   1259: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;)V
/*     */     //   1262: invokestatic getConfig : ()Lcom/intellij/ml/llm/matterhorn/configuration/Env;
/*     */     //   1265: invokevirtual getCanSendNonAnonymizedStats : ()Z
/*     */     //   1268: ifeq -> 1299
/*     */     //   1271: iconst_2
/*     */     //   1272: anewarray java/lang/Object
/*     */     //   1275: astore #21
/*     */     //   1277: aload #21
/*     */     //   1279: iconst_0
/*     */     //   1280: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/EJEventLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJEventLogger;
/*     */     //   1283: aastore
/*     */     //   1284: aload #21
/*     */     //   1286: iconst_1
/*     */     //   1287: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/EJPrivateEventLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJPrivateEventLogger;
/*     */     //   1290: aastore
/*     */     //   1291: aload #21
/*     */     //   1293: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1296: goto -> 1305
/*     */     //   1299: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/EJEventLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJEventLogger;
/*     */     //   1302: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1305: astore #20
/*     */     //   1307: aload #19
/*     */     //   1309: new com/intellij/ml/llm/matterhorn/ej/core/statistics/StatisticsExecutionContextListener
/*     */     //   1312: dup
/*     */     //   1313: aload_1
/*     */     //   1314: aload #20
/*     */     //   1316: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/EJVcsStateLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJVcsStateLogger;
/*     */     //   1319: checkcast com/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger
/*     */     //   1322: aload_2
/*     */     //   1323: aload #19
/*     */     //   1325: aload #5
/*     */     //   1327: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJVcsStateLogger;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;)V
/*     */     //   1330: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContextListener
/*     */     //   1333: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;)V
/*     */     //   1336: aload #19
/*     */     //   1338: ldc_w 'submitTask'
/*     */     //   1341: invokevirtual setCurrentActionName : (Ljava/lang/String;)V
/*     */     //   1344: new com/intellij/ml/llm/matterhorn/ProjectFileStructure
/*     */     //   1347: dup
/*     */     //   1348: invokespecial <init> : ()V
/*     */     //   1351: astore #21
/*     */     //   1353: nop
/*     */     //   1354: new com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1357: dup
/*     */     //   1358: aload #19
/*     */     //   1360: aconst_null
/*     */     //   1361: aload #13
/*     */     //   1363: aload #21
/*     */     //   1365: aconst_null
/*     */     //   1366: bipush #16
/*     */     //   1368: aconst_null
/*     */     //   1369: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1372: astore #22
/*     */     //   1374: aload #17
/*     */     //   1376: aload #22
/*     */     //   1378: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lkotlin/jvm/functions/Function1;
/*     */     //   1383: invokevirtual attachEventHandler : (Lkotlin/jvm/functions/Function1;)V
/*     */     //   1386: aload #22
/*     */     //   1388: aload #13
/*     */     //   1390: aload #21
/*     */     //   1392: aload #25
/*     */     //   1394: aload #25
/*     */     //   1396: aload #13
/*     */     //   1398: putfield L$0 : Ljava/lang/Object;
/*     */     //   1401: aload #25
/*     */     //   1403: aload #17
/*     */     //   1405: putfield L$1 : Ljava/lang/Object;
/*     */     //   1408: aload #25
/*     */     //   1410: aload #19
/*     */     //   1412: putfield L$2 : Ljava/lang/Object;
/*     */     //   1415: aload #25
/*     */     //   1417: aconst_null
/*     */     //   1418: putfield L$3 : Ljava/lang/Object;
/*     */     //   1421: aload #25
/*     */     //   1423: aconst_null
/*     */     //   1424: putfield L$4 : Ljava/lang/Object;
/*     */     //   1427: aload #25
/*     */     //   1429: aconst_null
/*     */     //   1430: putfield L$5 : Ljava/lang/Object;
/*     */     //   1433: aload #25
/*     */     //   1435: aconst_null
/*     */     //   1436: putfield L$6 : Ljava/lang/Object;
/*     */     //   1439: aload #25
/*     */     //   1441: iconst_5
/*     */     //   1442: putfield label : I
/*     */     //   1445: invokevirtual getOrCreateArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1448: dup
/*     */     //   1449: aload #26
/*     */     //   1451: if_acmpne -> 1495
/*     */     //   1454: aload #26
/*     */     //   1456: areturn
/*     */     //   1457: aload #25
/*     */     //   1459: getfield L$2 : Ljava/lang/Object;
/*     */     //   1462: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */     //   1465: astore #19
/*     */     //   1467: aload #25
/*     */     //   1469: getfield L$1 : Ljava/lang/Object;
/*     */     //   1472: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   1475: astore #17
/*     */     //   1477: aload #25
/*     */     //   1479: getfield L$0 : Ljava/lang/Object;
/*     */     //   1482: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   1485: astore #13
/*     */     //   1487: nop
/*     */     //   1488: aload #24
/*     */     //   1490: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1493: aload #24
/*     */     //   1495: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   1498: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   1501: astore #23
/*     */     //   1503: aload #17
/*     */     //   1505: invokevirtual detachEventHandler : ()V
/*     */     //   1508: aload #23
/*     */     //   1510: areturn
/*     */     //   1511: astore #22
/*     */     //   1513: aload #19
/*     */     //   1515: invokevirtual getListener : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   1518: aload #22
/*     */     //   1520: invokevirtual onCancellation : (Ljava/util/concurrent/CancellationException;)V
/*     */     //   1523: aload #22
/*     */     //   1525: athrow
/*     */     //   1526: astore #22
/*     */     //   1528: getstatic com/intellij/ml/llm/matterhorn/LLMPaymentRequiredException.Companion : Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException$Companion;
/*     */     //   1531: aload #22
/*     */     //   1533: invokevirtual fromException : (Ljava/lang/Exception;)Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;
/*     */     //   1536: dup
/*     */     //   1537: ifnull -> 1546
/*     */     //   1540: checkcast java/lang/Exception
/*     */     //   1543: goto -> 1628
/*     */     //   1546: pop
/*     */     //   1547: getstatic com/intellij/ml/llm/matterhorn/LLMCountryForbiddenException.Companion : Lcom/intellij/ml/llm/matterhorn/LLMCountryForbiddenException$Companion;
/*     */     //   1550: aload #22
/*     */     //   1552: invokevirtual fromException : (Ljava/lang/Exception;)Lcom/intellij/ml/llm/matterhorn/LLMCountryForbiddenException;
/*     */     //   1555: dup
/*     */     //   1556: ifnull -> 1565
/*     */     //   1559: checkcast java/lang/Exception
/*     */     //   1562: goto -> 1628
/*     */     //   1565: pop
/*     */     //   1566: getstatic com/intellij/ml/llm/matterhorn/LLMContextLengthExceeded.Companion : Lcom/intellij/ml/llm/matterhorn/LLMContextLengthExceeded$Companion;
/*     */     //   1569: aload #22
/*     */     //   1571: invokevirtual fromException : (Ljava/lang/Exception;)Lcom/intellij/ml/llm/matterhorn/LLMContextLengthExceeded;
/*     */     //   1574: dup
/*     */     //   1575: ifnull -> 1584
/*     */     //   1578: checkcast java/lang/Exception
/*     */     //   1581: goto -> 1628
/*     */     //   1584: pop
/*     */     //   1585: getstatic com/intellij/ml/llm/matterhorn/TooManyAttemptsWithoutSuccessException.Companion : Lcom/intellij/ml/llm/matterhorn/TooManyAttemptsWithoutSuccessException$Companion;
/*     */     //   1588: aload #22
/*     */     //   1590: invokevirtual fromException : (Ljava/lang/Exception;)Ljava/lang/Exception;
/*     */     //   1593: dup
/*     */     //   1594: ifnonnull -> 1628
/*     */     //   1597: pop
/*     */     //   1598: getstatic com/intellij/ml/llm/matterhorn/LLMBadResponseException.Companion : Lcom/intellij/ml/llm/matterhorn/LLMBadResponseException$Companion;
/*     */     //   1601: aload #22
/*     */     //   1603: invokevirtual fromException : (Ljava/lang/Exception;)Lcom/intellij/ml/llm/matterhorn/LLMBadResponseException;
/*     */     //   1606: dup
/*     */     //   1607: ifnull -> 1616
/*     */     //   1610: checkcast java/lang/Exception
/*     */     //   1613: goto -> 1628
/*     */     //   1616: pop
/*     */     //   1617: getstatic com/intellij/ml/llm/matterhorn/CostLimitExceededException.Companion : Lcom/intellij/ml/llm/matterhorn/CostLimitExceededException$Companion;
/*     */     //   1620: aload #22
/*     */     //   1622: invokevirtual fromException : (Ljava/lang/Exception;)Lcom/intellij/ml/llm/matterhorn/CostLimitExceededException;
/*     */     //   1625: checkcast java/lang/Exception
/*     */     //   1628: astore #23
/*     */     //   1630: aload #19
/*     */     //   1632: invokevirtual getListener : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */     //   1635: aload #23
/*     */     //   1637: dup
/*     */     //   1638: ifnonnull -> 1644
/*     */     //   1641: pop
/*     */     //   1642: aload #22
/*     */     //   1644: aload #13
/*     */     //   1646: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1649: invokevirtual onException : (Ljava/lang/Exception;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */     //   1652: aload #23
/*     */     //   1654: ifnonnull -> 1660
/*     */     //   1657: aload #22
/*     */     //   1659: athrow
/*     */     //   1660: aload #17
/*     */     //   1662: invokevirtual detachEventHandler : ()V
/*     */     //   1665: goto -> 1678
/*     */     //   1668: astore #22
/*     */     //   1670: aload #17
/*     */     //   1672: invokevirtual detachEventHandler : ()V
/*     */     //   1675: aload #22
/*     */     //   1677: athrow
/*     */     //   1678: aload #19
/*     */     //   1680: aload #25
/*     */     //   1682: aload #25
/*     */     //   1684: aconst_null
/*     */     //   1685: putfield L$0 : Ljava/lang/Object;
/*     */     //   1688: aload #25
/*     */     //   1690: aconst_null
/*     */     //   1691: putfield L$1 : Ljava/lang/Object;
/*     */     //   1694: aload #25
/*     */     //   1696: aconst_null
/*     */     //   1697: putfield L$2 : Ljava/lang/Object;
/*     */     //   1700: aload #25
/*     */     //   1702: aconst_null
/*     */     //   1703: putfield L$3 : Ljava/lang/Object;
/*     */     //   1706: aload #25
/*     */     //   1708: aconst_null
/*     */     //   1709: putfield L$4 : Ljava/lang/Object;
/*     */     //   1712: aload #25
/*     */     //   1714: aconst_null
/*     */     //   1715: putfield L$5 : Ljava/lang/Object;
/*     */     //   1718: aload #25
/*     */     //   1720: aconst_null
/*     */     //   1721: putfield L$6 : Ljava/lang/Object;
/*     */     //   1724: aload #25
/*     */     //   1726: bipush #6
/*     */     //   1728: putfield label : I
/*     */     //   1731: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1734: dup
/*     */     //   1735: aload #26
/*     */     //   1737: if_acmpne -> 1750
/*     */     //   1740: aload #26
/*     */     //   1742: areturn
/*     */     //   1743: aload #24
/*     */     //   1745: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1748: aload #24
/*     */     //   1750: pop
/*     */     //   1751: aconst_null
/*     */     //   1752: areturn
/*     */     //   1753: new java/lang/IllegalStateException
/*     */     //   1756: dup
/*     */     //   1757: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1759: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1762: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #180	-> 63
/*     */     //   #189	-> 117
/*     */     //   #190	-> 126
/*     */     //   #192	-> 152
/*     */     //   #193	-> 160
/*     */     //   #180	-> 245
/*     */     //   #193	-> 331
/*     */     //   #194	-> 339
/*     */     //   #195	-> 348
/*     */     //   #199	-> 367
/*     */     //   #202	-> 391
/*     */     //   #203	-> 397
/*     */     //   #180	-> 491
/*     */     //   #204	-> 612
/*     */     //   #205	-> 622
/*     */     //   #206	-> 632
/*     */     //   #200	-> 638
/*     */     //   #201	-> 642
/*     */     //   #202	-> 645
/*     */     //   #203	-> 647
/*     */     //   #204	-> 649
/*     */     //   #206	-> 651
/*     */     //   #200	-> 653
/*     */     //   #205	-> 654
/*     */     //   #200	-> 656
/*     */     //   #198	-> 666
/*     */     //   #320	-> 669
/*     */     //   #198	-> 686
/*     */     //   #197	-> 686
/*     */     //   #210	-> 688
/*     */     //   #321	-> 697
/*     */     //   #322	-> 702
/*     */     //   #210	-> 724
/*     */     //   #212	-> 729
/*     */     //   #323	-> 740
/*     */     //   #324	-> 745
/*     */     //   #212	-> 767
/*     */     //   #213	-> 772
/*     */     //   #215	-> 779
/*     */     //   #180	-> 893
/*     */     //   #220	-> 1011
/*     */     //   #221	-> 1017
/*     */     //   #180	-> 1142
/*     */     //   #242	-> 1224
/*     */     //   #243	-> 1253
/*     */     //   #245	-> 1262
/*     */     //   #246	-> 1271
/*     */     //   #248	-> 1299
/*     */     //   #245	-> 1305
/*     */     //   #250	-> 1307
/*     */     //   #251	-> 1309
/*     */     //   #252	-> 1313
/*     */     //   #253	-> 1314
/*     */     //   #254	-> 1316
/*     */     //   #255	-> 1322
/*     */     //   #256	-> 1323
/*     */     //   #257	-> 1325
/*     */     //   #251	-> 1327
/*     */     //   #250	-> 1333
/*     */     //   #261	-> 1336
/*     */     //   #262	-> 1344
/*     */     //   #263	-> 1353
/*     */     //   #264	-> 1354
/*     */     //   #265	-> 1374
/*     */     //   #266	-> 1386
/*     */     //   #180	-> 1454
/*     */     //   #266	-> 1495
/*     */     //   #286	-> 1503
/*     */     //   #266	-> 1510
/*     */     //   #267	-> 1511
/*     */     //   #268	-> 1513
/*     */     //   #269	-> 1523
/*     */     //   #270	-> 1526
/*     */     //   #271	-> 1528
/*     */     //   #272	-> 1546
/*     */     //   #271	-> 1555
/*     */     //   #273	-> 1565
/*     */     //   #271	-> 1574
/*     */     //   #274	-> 1584
/*     */     //   #271	-> 1593
/*     */     //   #275	-> 1597
/*     */     //   #271	-> 1606
/*     */     //   #276	-> 1617
/*     */     //   #271	-> 1628
/*     */     //   #279	-> 1630
/*     */     //   #282	-> 1652
/*     */     //   #283	-> 1657
/*     */     //   #286	-> 1660
/*     */     //   #287	-> 1665
/*     */     //   #286	-> 1668
/*     */     //   #288	-> 1678
/*     */     //   #180	-> 1740
/*     */     //   #289	-> 1750
/*     */     //   #180	-> 1753
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   117	131	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */     //   324	170	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */     //   600	296	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */     //   999	137	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */     //   117	131	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   315	179	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   591	305	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   990	155	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1212	102	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   117	131	2	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   306	188	2	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   582	314	2	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   981	164	2	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   1203	120	2	task	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   117	131	3	artifactualListener	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   297	197	3	artifactualListener	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   573	323	3	artifactualListener	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   972	173	3	artifactualListener	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   1194	68	3	artifactualListener	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   117	131	4	currentJob	Lkotlinx/coroutines/Job;
/*     */     //   288	206	4	currentJob	Lkotlinx/coroutines/Job;
/*     */     //   564	332	4	currentJob	Lkotlinx/coroutines/Job;
/*     */     //   963	182	4	currentJob	Lkotlinx/coroutines/Job;
/*     */     //   1185	68	4	currentJob	Lkotlinx/coroutines/Job;
/*     */     //   117	131	5	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   278	216	5	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   554	342	5	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   953	192	5	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   1175	152	5	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   117	131	6	updater	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   268	226	6	updater	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   544	352	6	updater	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   943	101	6	updater	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   126	122	8	ejSupport	Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
/*     */     //   258	133	8	ejSupport	Lcom/intellij/ml/llm/matterhorn/ej/core/ElectricJuniorSupport;
/*     */     //   160	79	9	propertyProvider	Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */     //   339	28	10	modelParemeters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   348	146	11	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   534	362	11	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   933	111	11	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */     //   367	127	12	imagesAndFiles	Lkotlin/Pair;
/*     */     //   524	108	12	imagesAndFiles	Lkotlin/Pair;
/*     */     //   688	208	13	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   923	222	13	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   1165	292	13	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   1487	16	13	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   1526	126	13	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   524	162	14	artifact$iv	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   729	167	14	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   913	131	14	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   666	20	15	input$iv	Ljava/lang/Object;
/*     */     //   694	30	15	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   772	7	15	settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*     */     //   737	30	16	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   779	117	16	braveMode	Z
/*     */     //   903	141	16	braveMode	Z
/*     */     //   702	22	17	serviceClass$iv	Ljava/lang/Class;
/*     */     //   1011	134	17	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   1155	302	17	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   1477	31	17	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   1511	15	17	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   1526	139	17	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   1668	7	17	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   745	22	18	serviceClass$iv	Ljava/lang/Class;
/*     */     //   1017	119	18	checker	Lkotlin/jvm/functions/Function1;
/*     */     //   1224	233	19	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1467	36	19	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1511	12	19	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1526	131	19	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1660	8	19	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1678	56	19	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1307	9	20	statisticsProcessors	Ljava/util/List;
/*     */     //   1353	95	21	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   1374	74	22	executionContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1513	13	22	e	Ljava/util/concurrent/CancellationException;
/*     */     //   1528	132	22	e	Ljava/lang/Exception;
/*     */     //   1630	30	23	knownException	Ljava/lang/Exception;
/*     */     //   669	17	16	$i$f$artifactRequest	I
/*     */     //   697	27	16	$i$f$service	I
/*     */     //   740	27	17	$i$f$service	I
/*     */     //   0	1763	7	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	1700	25	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	1693	24	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   1353	1448	1511	java/util/concurrent/CancellationException
/*     */     //   1353	1448	1526	java/lang/Exception
/*     */     //   1353	1448	1668	finally
/*     */     //   1487	1503	1511	java/util/concurrent/CancellationException
/*     */     //   1487	1503	1526	java/lang/Exception
/*     */     //   1487	1503	1668	finally
/*     */     //   1511	1526	1668	finally
/*     */     //   1526	1660	1668	finally
/*     */     //   1668	1670	1668	finally
/*     */   }
/*     */   @DebugMetadata(f = "AITaskLauncher.kt", l = {193, 203, 215, 221, 266, 288}, i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2"}, n = {"this", "project", "task", "artifactualListener", "currentJob", "chainId", "updater", "ejSupport", "this", "project", "task", "artifactualListener", "currentJob", "chainId", "updater", "llmProxy", "imagesAndFiles", "this", "project", "task", "artifactualListener", "currentJob", "chainId", "updater", "llmProxy", "request", "service", "braveMode", "project", "task", "artifactualListener", "currentJob", "chainId", "request", "executor", "request", "executor", "context"}, m = "submitTask", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AITaskLauncher$submitTask$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; Object L$3; Object L$4; Object L$5; Object L$6; Object L$7;
/*     */     Object L$8;
/*     */     Object L$9;
/*     */     Object L$10;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     AITaskLauncher$submitTask$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AITaskLauncher.this.submitTask(null, null, null, null, null, null, (Continuation)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "AITaskLauncher.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$submitTask$executor$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AITaskLauncher$submitTask$executor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BlockTerminalShellExecutor>, Object> { int label;
/*     */     
/*     */     AITaskLauncher$submitTask$executor$1(Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) { CoroutineScope scope;
/* 215 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 216 */           scope = MatterhornServiceScope.Companion.getScope(this.$project);
/* 217 */           return BlockTerminalShellExecutorKt.launchBlockTerminalShellExecutor$default(scope, this.$project, null, null, 12, null); }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$submitTask$executor$1> $completion) { return (Continuation<Unit>)new AITaskLauncher$submitTask$executor$1(this.$project, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((AITaskLauncher$submitTask$executor$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @DebugMetadata(f = "AITaskLauncher.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$submitTask$context$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class AITaskLauncher$submitTask$context$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RootExecutionContext>, Object> { int label;
/*     */     AITaskLauncher$submitTask$context$1(LLMProxy $llmProxy, ArtifactRequest<AgentIssue, TaskResult> $request, TaskSnapshotUpdater $updater, boolean $braveMode, TaskChainId $chainId, TaskEntity $task, BlockTerminalShellExecutor $executor, AITaskLauncher $receiver, Project $project, Function1<Path, Boolean> $checker, Continuation $completion) { super(2, $completion); }
/* 221 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 222 */           return new RootExecutionContext(
/* 223 */               this.$service, 
/* 224 */               this.$llmProxy, 
/* 225 */               this.$request.getArtifact().getName(), 
/* 226 */               this.$executor::invokeSuspend$lambda$0, 
/* 227 */               false, 
/* 228 */               (MatterhornPropertyProvider)MatterhornSettingsService.Companion.getInstance(), 
/* 229 */               (HumanInLoop)new HumanInLoopImpl(
/* 230 */                 this.$updater, 
/* 231 */                 this.$braveMode, 
/* 232 */                 this.$chainId, 
/* 233 */                 this.$task.getId(), 
/* 234 */                 new Function2<Path, Continuation<? super Boolean>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { Path it; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; this.label = 1; return (AITaskLauncher.this.isSensitiveFile(this.$project, it, (Continuation<? super Boolean>)this) == object) ? object : AITaskLauncher.this.isSensitiveFile(this.$project, it, (Continuation<? super Boolean>)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(AITaskLauncher.this, this.$project, $completion); function2.L$0 = value; return (Continuation)function2; }
/* 235 */                   public final Object invoke(Path p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }new Function2<Path, Continuation<? super Boolean>, Object>(this.$checker, null) { int label; public final Object invokeSuspend(Object $result) { Path it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion); function2.L$0 = value; return (Continuation)function2; }
/* 236 */                   public final Object invoke(Path p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }new Function2<Path, Continuation<? super Boolean>, Object>(this.$project, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                     //   3: astore_3
/*     */                     //   4: aload_0
/*     */                     //   5: getfield label : I
/*     */                     //   8: tableswitch default -> 98, 0 -> 32, 1 -> 75
/*     */                     //   32: aload_1
/*     */                     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                     //   36: aload_0
/*     */                     //   37: getfield L$0 : Ljava/lang/Object;
/*     */                     //   40: checkcast java/nio/file/Path
/*     */                     //   43: astore_2
/*     */                     //   44: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/OutOfProjectFilesFileDetector
/*     */                     //   47: dup
/*     */                     //   48: invokespecial <init> : ()V
/*     */                     //   51: aload_0
/*     */                     //   52: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */                     //   55: aload_2
/*     */                     //   56: aload_0
/*     */                     //   57: checkcast kotlin/coroutines/Continuation
/*     */                     //   60: aload_0
/*     */                     //   61: iconst_1
/*     */                     //   62: putfield label : I
/*     */                     //   65: invokevirtual isSensitiveFile : (Lcom/intellij/openapi/project/Project;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                     //   68: dup
/*     */                     //   69: aload_3
/*     */                     //   70: if_acmpne -> 80
/*     */                     //   73: aload_3
/*     */                     //   74: areturn
/*     */                     //   75: aload_1
/*     */                     //   76: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                     //   79: aload_1
/*     */                     //   80: checkcast java/lang/Boolean
/*     */                     //   83: invokevirtual booleanValue : ()Z
/*     */                     //   86: ifne -> 93
/*     */                     //   89: iconst_1
/*     */                     //   90: goto -> 94
/*     */                     //   93: iconst_0
/*     */                     //   94: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */                     //   97: areturn
/*     */                     //   98: new java/lang/IllegalStateException
/*     */                     //   101: dup
/*     */                     //   102: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                     //   104: invokespecial <init> : (Ljava/lang/String;)V
/*     */                     //   107: athrow
/*     */                     // Line number table:
/*     */                     //   Java source line number -> byte code offset
/*     */                     //   #236	-> 3
/*     */                     //   #236	-> 44
/*     */                     //   #236	-> 73
/*     */                     //   #236	-> 80
/*     */                     //   #236	-> 98
/*     */                     // Local variable table:
/*     */                     //   start	length	slot	name	descriptor
/*     */                     //   44	24	2	it	Ljava/nio/file/Path;
/*     */                     //   0	108	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$submitTask$context$1$4;
/*     */                     //   36	62	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$project, $completion); function2.L$0 = value; return (Continuation)function2; }
/*     */                   public final Object invoke(Path p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/* 238 */               ), new Function2<Path, Continuation<? super Boolean>, Object>(this.$checker, null) { int label; public final Object invokeSuspend(Object $result) { Path it; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0; return this.$checker.invoke(it); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   Function2<Path, Continuation<? super Boolean>, Object> function2 = new Function2<>(this.$checker, $completion);
/*     */                   function2.L$0 = value;
/*     */                   return (Continuation)function2;
/*     */                 }
/*     */                 public final Object invoke(Path p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 } }
/*     */             ); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$submitTask$context$1> $completion) {
/*     */       return (Continuation<Unit>)new AITaskLauncher$submitTask$context$1(this.$llmProxy, this.$request, this.$updater, this.$braveMode, this.$chainId, this.$task, this.$executor, AITaskLauncher.this, this.$project, this.$checker, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AITaskLauncher$submitTask$context$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final ShellExecutor invokeSuspend$lambda$0(BlockTerminalShellExecutor $executor) {
/*     */       return (ShellExecutor)$executor;
/*     */     } }
/*     */   
/*     */   private static final Unit submitTask$lambda$3(ExecutionContext $executionContext, TerminalEvent event) {
/* 265 */     Intrinsics.checkNotNullParameter(event, "event"); $executionContext.sendEvent((CustomArtifactEvent)event); return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Pair<List<MatterhornChatMessagePart>, List<Path>> separateImagesAndTextFiles(@NotNull ModelParameters modelParameters, @NotNull List paths, boolean imagesAllowed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'modelParameters'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w 'paths'
/*     */     //   11: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   14: new java/util/ArrayList
/*     */     //   17: dup
/*     */     //   18: invokespecial <init> : ()V
/*     */     //   21: checkcast java/util/List
/*     */     //   24: astore #4
/*     */     //   26: new java/util/ArrayList
/*     */     //   29: dup
/*     */     //   30: invokespecial <init> : ()V
/*     */     //   33: checkcast java/util/List
/*     */     //   36: astore #5
/*     */     //   38: aload_2
/*     */     //   39: checkcast java/lang/Iterable
/*     */     //   42: astore #6
/*     */     //   44: iconst_0
/*     */     //   45: istore #7
/*     */     //   47: aload #6
/*     */     //   49: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   54: astore #8
/*     */     //   56: aload #8
/*     */     //   58: invokeinterface hasNext : ()Z
/*     */     //   63: ifeq -> 219
/*     */     //   66: aload #8
/*     */     //   68: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   73: astore #9
/*     */     //   75: aload #9
/*     */     //   77: checkcast java/nio/file/Path
/*     */     //   80: astore #10
/*     */     //   82: iconst_0
/*     */     //   83: istore #11
/*     */     //   85: getstatic com/intellij/ml/llm/matterhorn/helpers/ContentTypeHelpers.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/ContentTypeHelpers;
/*     */     //   88: aload #10
/*     */     //   90: invokevirtual getContentTypeByPath : (Ljava/nio/file/Path;)Lio/ktor/http/ContentType;
/*     */     //   93: astore #12
/*     */     //   95: iload_3
/*     */     //   96: ifeq -> 204
/*     */     //   99: aload #12
/*     */     //   101: dup
/*     */     //   102: ifnull -> 111
/*     */     //   105: invokevirtual getContentType : ()Ljava/lang/String;
/*     */     //   108: goto -> 113
/*     */     //   111: pop
/*     */     //   112: aconst_null
/*     */     //   113: getstatic io/ktor/http/ContentType$Image.INSTANCE : Lio/ktor/http/ContentType$Image;
/*     */     //   116: invokevirtual getAny : ()Lio/ktor/http/ContentType;
/*     */     //   119: invokevirtual getContentType : ()Ljava/lang/String;
/*     */     //   122: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   125: ifeq -> 204
/*     */     //   128: aload #10
/*     */     //   130: invokeinterface toFile : ()Ljava/io/File;
/*     */     //   135: dup
/*     */     //   136: ldc_w 'toFile(...)'
/*     */     //   139: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   142: invokestatic readBytes : (Ljava/io/File;)[B
/*     */     //   145: astore #13
/*     */     //   147: getstatic com/intellij/ml/llm/matterhorn/helpers/ImageContentHelper.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/ImageContentHelper;
/*     */     //   150: aload #12
/*     */     //   152: aload #13
/*     */     //   154: aload_1
/*     */     //   155: invokevirtual adjustImageData : (Lio/ktor/http/ContentType;[BLcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)[B
/*     */     //   158: astore #14
/*     */     //   160: aload #14
/*     */     //   162: ifnull -> 214
/*     */     //   165: aload #4
/*     */     //   167: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageImagePart
/*     */     //   170: dup
/*     */     //   171: aload #12
/*     */     //   173: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   176: getstatic kotlin/io/encoding/Base64.Default : Lkotlin/io/encoding/Base64$Default;
/*     */     //   179: checkcast kotlin/io/encoding/Base64
/*     */     //   182: aload #14
/*     */     //   184: iconst_0
/*     */     //   185: iconst_0
/*     */     //   186: bipush #6
/*     */     //   188: aconst_null
/*     */     //   189: invokestatic encode$default : (Lkotlin/io/encoding/Base64;[BIIILjava/lang/Object;)Ljava/lang/String;
/*     */     //   192: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   195: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   200: pop
/*     */     //   201: goto -> 214
/*     */     //   204: aload #5
/*     */     //   206: aload #10
/*     */     //   208: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   213: pop
/*     */     //   214: nop
/*     */     //   215: nop
/*     */     //   216: goto -> 56
/*     */     //   219: nop
/*     */     //   220: new kotlin/Pair
/*     */     //   223: dup
/*     */     //   224: aload #4
/*     */     //   226: aload #5
/*     */     //   228: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   231: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #298	-> 14
/*     */     //   #298	-> 24
/*     */     //   #299	-> 26
/*     */     //   #299	-> 36
/*     */     //   #300	-> 38
/*     */     //   #325	-> 47
/*     */     //   #301	-> 85
/*     */     //   #302	-> 95
/*     */     //   #303	-> 128
/*     */     //   #304	-> 147
/*     */     //   #306	-> 160
/*     */     //   #307	-> 165
/*     */     //   #310	-> 204
/*     */     //   #312	-> 214
/*     */     //   #325	-> 215
/*     */     //   #326	-> 219
/*     */     //   #313	-> 220
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   147	54	13	mediaFileBytes	[B
/*     */     //   160	41	14	adjustedData	[B
/*     */     //   85	130	11	$i$a$-forEach-AITaskLauncher$separateImagesAndTextFiles$1	I
/*     */     //   95	120	12	contentType	Lio/ktor/http/ContentType;
/*     */     //   82	133	10	providedFile	Ljava/nio/file/Path;
/*     */     //   75	141	9	element$iv	Ljava/lang/Object;
/*     */     //   47	173	7	$i$f$forEach	I
/*     */     //   44	176	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   26	206	4	imageFiles	Ljava/util/List;
/*     */     //   38	194	5	otherFiles	Ljava/util/List;
/*     */     //   0	232	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */     //   0	232	1	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   0	232	2	paths	Ljava/util/List;
/*     */     //   0	232	3	imagesAllowed	Z
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\AITaskLauncher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */