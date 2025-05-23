/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.StepEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorage;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vcs.VcsFileListenerContextHelper;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.datetime.Instant;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020%\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020$\n\002\030\002\n\002\020\016\n\002\b\b\b\007\030\000 A2\0020\001:\001AB\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\026\020\020\032\0020\0212\006\020\022\032\0020\016H@¢\006\002\020\023JO\020\024\032\0020\0172\006\020\022\032\0020\01627\020\025\0323\b\001\022\031\022\027\022\004\022\0020\0300\027¢\006\f\b\031\022\b\b\032\022\004\b\b(\033\022\n\022\b\022\004\022\0020\0170\034\022\006\022\004\030\0010\0350\026H@¢\006\002\020\036J\026\020\037\032\0020\0172\006\020\022\032\0020\016H@¢\006\002\020\023J\026\020 \032\0020\0172\006\020\022\032\0020\016H@¢\006\002\020\023J,\020!\032\0020\0172\006\020\022\032\0020\0162\006\020\"\032\0020#2\f\020\033\032\b\022\004\022\0020\0300\027H@¢\006\002\020$J(\020%\032\0020&2\006\020'\032\0020\0162\006\020(\032\0020)2\b\020*\032\004\030\0010+H@¢\006\002\020,J\030\020-\032\0020.2\006\020/\032\0020\0172\006\0200\032\00201H\002J\026\0202\032\0020.2\006\020'\032\0020\016H@¢\006\002\020\023J \0203\032\002042\006\020'\032\0020\0162\b\0205\032\004\030\0010&H@¢\006\002\0206J$\0207\032\020\022\004\022\00209\022\006\022\004\030\0010:082\f\020;\032\b\022\004\022\0020\0300\027H\002J$\020<\032\0020.2\024\020=\032\020\022\004\022\00209\022\006\022\004\030\0010:08H@¢\006\002\020>J\026\020?\032\0020.2\006\020'\032\0020\016H@¢\006\002\020\023J\026\020@\032\0020.2\006\020'\032\0020\016H@¢\006\002\020\023R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\032\020\f\032\016\022\004\022\0020\016\022\004\022\0020\0170\rX\004¢\006\002\n\000¨\006B"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService;", "project", "Lcom/intellij/openapi/project/Project;", "taskLauncher", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskLauncher;", "taskStorage", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskLauncher;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;)V", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "trackedTasks", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;", "observeTaskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "taskChainId", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskChainSnapshotOr", "onAbsent", "Lkotlin/Function2;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "Lkotlin/ParameterName;", "name", "tasks", "Lkotlin/coroutines/Continuation;", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireTaskChainSnapshot", "getOrCreateTaskChainSnapshot", "createNewTaskChain", "now", "Lkotlinx/datetime/Instant;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlinx/datetime/Instant;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "chainId", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;", "previousTasksInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceReportIfNecessary", "", "taskChain", "updater", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;", "stop", "declineStartingFrom", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;", "startingFrom", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "computeRollbackState", "", "Ljava/nio/file/Path;", "", "snapshots", "applyFilesState", "fileContents", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "done", "continueTask", "Companion", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nTaskServiceInternal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskServiceInternal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,525:1\n116#2,10:526\n116#2,10:551\n116#2,10:561\n1611#3,9:536\n1863#3:545\n1864#3:548\n1620#3:549\n1053#3:550\n774#3:581\n865#3,2:582\n967#3,7:584\n756#3,10:591\n543#3,6:601\n1#4:546\n1#4:547\n194#5,5:571\n194#5,5:576\n14#6:607\n*S KotlinDebug\n*F\n+ 1 TaskServiceInternal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal\n*L\n61#1:526,10\n98#1:551,10\n105#1:561,10\n70#1:536,9\n70#1:545\n70#1:548\n70#1:549\n82#1:550\n274#1:581\n274#1:582,2\n278#1:584,7\n283#1:591,10\n287#1:601,6\n70#1:547\n163#1:571,5\n263#1:576,5\n45#1:607\n*E\n"})
/*     */ public final class TaskServiceInternal implements TaskService {
/*     */   public TaskServiceInternal(@NotNull Project project, @NotNull TaskLauncher taskLauncher, @NotNull TaskStorage taskStorage) {
/*  40 */     this.project = project;
/*  41 */     this.taskLauncher = taskLauncher;
/*  42 */     this.taskStorage = taskStorage;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  48 */     this.mutex = MutexKt.Mutex$default(false, 1, null);
/*     */ 
/*     */     
/*  51 */     this.trackedTasks = new LinkedHashMap<>();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-ui"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Project project;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final TaskLauncher taskLauncher;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final TaskStorage taskStorage;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Mutex mutex;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private final Map<TaskChainId, LiveTaskChainImpl> trackedTasks;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final int $stable = 8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static
/*     */   {
/*     */     int $i$f$logger = 0;
/* 607 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TaskServiceImpl.class), "getInstance(...)"); } @Nullable public Object observeTaskChain(@NotNull TaskChainId taskChainId, @NotNull Continuation<? super LiveTaskChainImpl> $completion) { return getOrCreateTaskChainSnapshot(taskChainId, $completion); } private final Object getTaskChainSnapshotOr(TaskChainId taskChainId, Function2 onAbsent, Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$getTaskChainSnapshotOr$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$getTaskChainSnapshotOr$1
/*     */     //   11: astore #29
/*     */     //   13: aload #29
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #29
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$getTaskChainSnapshotOr$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #29
/*     */     //   50: aload #29
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #28
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #30
/*     */     //   62: aload #29
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1562, 0 -> 116, 1 -> 185, 2 -> 345, 3 -> 436, 4 -> 641, 5 -> 833, 6 -> 1188, 7 -> 1361, 8 -> 1457
/*     */     //   116: aload #28
/*     */     //   118: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   121: aload_0
/*     */     //   122: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   125: astore #5
/*     */     //   127: aconst_null
/*     */     //   128: astore #6
/*     */     //   130: iconst_0
/*     */     //   131: istore #7
/*     */     //   133: nop
/*     */     //   134: aload #5
/*     */     //   136: aload #6
/*     */     //   138: aload #29
/*     */     //   140: aload #29
/*     */     //   142: aload_0
/*     */     //   143: putfield L$0 : Ljava/lang/Object;
/*     */     //   146: aload #29
/*     */     //   148: aload_1
/*     */     //   149: putfield L$1 : Ljava/lang/Object;
/*     */     //   152: aload #29
/*     */     //   154: aload_2
/*     */     //   155: putfield L$2 : Ljava/lang/Object;
/*     */     //   158: aload #29
/*     */     //   160: aload #5
/*     */     //   162: putfield L$3 : Ljava/lang/Object;
/*     */     //   165: aload #29
/*     */     //   167: iconst_1
/*     */     //   168: putfield label : I
/*     */     //   171: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   176: dup
/*     */     //   177: aload #30
/*     */     //   179: if_acmpne -> 235
/*     */     //   182: aload #30
/*     */     //   184: areturn
/*     */     //   185: iconst_0
/*     */     //   186: istore #7
/*     */     //   188: aconst_null
/*     */     //   189: astore #6
/*     */     //   191: aload #29
/*     */     //   193: getfield L$3 : Ljava/lang/Object;
/*     */     //   196: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   199: astore #5
/*     */     //   201: aload #29
/*     */     //   203: getfield L$2 : Ljava/lang/Object;
/*     */     //   206: checkcast kotlin/jvm/functions/Function2
/*     */     //   209: astore_2
/*     */     //   210: aload #29
/*     */     //   212: getfield L$1 : Ljava/lang/Object;
/*     */     //   215: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   218: astore_1
/*     */     //   219: aload #29
/*     */     //   221: getfield L$0 : Ljava/lang/Object;
/*     */     //   224: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   227: astore_0
/*     */     //   228: aload #28
/*     */     //   230: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   233: aload #28
/*     */     //   235: pop
/*     */     //   236: nop
/*     */     //   237: iconst_0
/*     */     //   238: istore #8
/*     */     //   240: aload_0
/*     */     //   241: getfield trackedTasks : Ljava/util/Map;
/*     */     //   244: aload_1
/*     */     //   245: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   250: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   253: astore #9
/*     */     //   255: aload #5
/*     */     //   257: aload #6
/*     */     //   259: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   264: goto -> 281
/*     */     //   267: astore #10
/*     */     //   269: aload #5
/*     */     //   271: aload #6
/*     */     //   273: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   278: aload #10
/*     */     //   280: athrow
/*     */     //   281: aload #9
/*     */     //   283: nop
/*     */     //   284: astore #4
/*     */     //   286: aload #4
/*     */     //   288: ifnull -> 294
/*     */     //   291: aload #4
/*     */     //   293: areturn
/*     */     //   294: aload_0
/*     */     //   295: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   298: aload_1
/*     */     //   299: aload #29
/*     */     //   301: aload #29
/*     */     //   303: aload_0
/*     */     //   304: putfield L$0 : Ljava/lang/Object;
/*     */     //   307: aload #29
/*     */     //   309: aload_1
/*     */     //   310: putfield L$1 : Ljava/lang/Object;
/*     */     //   313: aload #29
/*     */     //   315: aload_2
/*     */     //   316: putfield L$2 : Ljava/lang/Object;
/*     */     //   319: aload #29
/*     */     //   321: aconst_null
/*     */     //   322: putfield L$3 : Ljava/lang/Object;
/*     */     //   325: aload #29
/*     */     //   327: iconst_2
/*     */     //   328: putfield label : I
/*     */     //   331: invokeinterface loadChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   336: dup
/*     */     //   337: aload #30
/*     */     //   339: if_acmpne -> 379
/*     */     //   342: aload #30
/*     */     //   344: areturn
/*     */     //   345: aload #29
/*     */     //   347: getfield L$2 : Ljava/lang/Object;
/*     */     //   350: checkcast kotlin/jvm/functions/Function2
/*     */     //   353: astore_2
/*     */     //   354: aload #29
/*     */     //   356: getfield L$1 : Ljava/lang/Object;
/*     */     //   359: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   362: astore_1
/*     */     //   363: aload #29
/*     */     //   365: getfield L$0 : Ljava/lang/Object;
/*     */     //   368: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   371: astore_0
/*     */     //   372: aload #28
/*     */     //   374: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   377: aload #28
/*     */     //   379: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   382: astore #5
/*     */     //   384: aload_0
/*     */     //   385: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   388: aload_1
/*     */     //   389: aload #29
/*     */     //   391: aload #29
/*     */     //   393: aload_0
/*     */     //   394: putfield L$0 : Ljava/lang/Object;
/*     */     //   397: aload #29
/*     */     //   399: aload_1
/*     */     //   400: putfield L$1 : Ljava/lang/Object;
/*     */     //   403: aload #29
/*     */     //   405: aload_2
/*     */     //   406: putfield L$2 : Ljava/lang/Object;
/*     */     //   409: aload #29
/*     */     //   411: aload #5
/*     */     //   413: putfield L$3 : Ljava/lang/Object;
/*     */     //   416: aload #29
/*     */     //   418: iconst_3
/*     */     //   419: putfield label : I
/*     */     //   422: invokeinterface loadAllTaskIds : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   427: dup
/*     */     //   428: aload #30
/*     */     //   430: if_acmpne -> 480
/*     */     //   433: aload #30
/*     */     //   435: areturn
/*     */     //   436: aload #29
/*     */     //   438: getfield L$3 : Ljava/lang/Object;
/*     */     //   441: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   444: astore #5
/*     */     //   446: aload #29
/*     */     //   448: getfield L$2 : Ljava/lang/Object;
/*     */     //   451: checkcast kotlin/jvm/functions/Function2
/*     */     //   454: astore_2
/*     */     //   455: aload #29
/*     */     //   457: getfield L$1 : Ljava/lang/Object;
/*     */     //   460: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   463: astore_1
/*     */     //   464: aload #29
/*     */     //   466: getfield L$0 : Ljava/lang/Object;
/*     */     //   469: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   472: astore_0
/*     */     //   473: aload #28
/*     */     //   475: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   478: aload #28
/*     */     //   480: checkcast java/util/List
/*     */     //   483: astore #6
/*     */     //   485: aload #6
/*     */     //   487: checkcast java/lang/Iterable
/*     */     //   490: astore #8
/*     */     //   492: iconst_0
/*     */     //   493: istore #9
/*     */     //   495: aload #8
/*     */     //   497: astore #10
/*     */     //   499: new java/util/ArrayList
/*     */     //   502: dup
/*     */     //   503: invokespecial <init> : ()V
/*     */     //   506: checkcast java/util/Collection
/*     */     //   509: astore #11
/*     */     //   511: iconst_0
/*     */     //   512: istore #12
/*     */     //   514: aload #10
/*     */     //   516: astore #13
/*     */     //   518: iconst_0
/*     */     //   519: istore #14
/*     */     //   521: aload #13
/*     */     //   523: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   528: astore #15
/*     */     //   530: aload #15
/*     */     //   532: invokeinterface hasNext : ()Z
/*     */     //   537: ifeq -> 1014
/*     */     //   540: aload #15
/*     */     //   542: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   547: astore #16
/*     */     //   549: aload #16
/*     */     //   551: astore #17
/*     */     //   553: iconst_0
/*     */     //   554: istore #18
/*     */     //   556: aload #17
/*     */     //   558: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   561: astore #19
/*     */     //   563: iconst_0
/*     */     //   564: istore #20
/*     */     //   566: aload_0
/*     */     //   567: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   570: aload_1
/*     */     //   571: aload #19
/*     */     //   573: aload #29
/*     */     //   575: aload #29
/*     */     //   577: aload_0
/*     */     //   578: putfield L$0 : Ljava/lang/Object;
/*     */     //   581: aload #29
/*     */     //   583: aload_1
/*     */     //   584: putfield L$1 : Ljava/lang/Object;
/*     */     //   587: aload #29
/*     */     //   589: aload_2
/*     */     //   590: putfield L$2 : Ljava/lang/Object;
/*     */     //   593: aload #29
/*     */     //   595: aload #5
/*     */     //   597: putfield L$3 : Ljava/lang/Object;
/*     */     //   600: aload #29
/*     */     //   602: aload #11
/*     */     //   604: putfield L$4 : Ljava/lang/Object;
/*     */     //   607: aload #29
/*     */     //   609: aload #15
/*     */     //   611: putfield L$5 : Ljava/lang/Object;
/*     */     //   614: aload #29
/*     */     //   616: aload #19
/*     */     //   618: putfield L$6 : Ljava/lang/Object;
/*     */     //   621: aload #29
/*     */     //   623: iconst_4
/*     */     //   624: putfield label : I
/*     */     //   627: invokeinterface loadTask : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   632: dup
/*     */     //   633: aload #30
/*     */     //   635: if_acmpne -> 730
/*     */     //   638: aload #30
/*     */     //   640: areturn
/*     */     //   641: iconst_0
/*     */     //   642: istore #9
/*     */     //   644: iconst_0
/*     */     //   645: istore #12
/*     */     //   647: iconst_0
/*     */     //   648: istore #14
/*     */     //   650: iconst_0
/*     */     //   651: istore #18
/*     */     //   653: iconst_0
/*     */     //   654: istore #20
/*     */     //   656: aload #29
/*     */     //   658: getfield L$6 : Ljava/lang/Object;
/*     */     //   661: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   664: astore #19
/*     */     //   666: aload #29
/*     */     //   668: getfield L$5 : Ljava/lang/Object;
/*     */     //   671: checkcast java/util/Iterator
/*     */     //   674: astore #15
/*     */     //   676: aload #29
/*     */     //   678: getfield L$4 : Ljava/lang/Object;
/*     */     //   681: checkcast java/util/Collection
/*     */     //   684: astore #11
/*     */     //   686: aload #29
/*     */     //   688: getfield L$3 : Ljava/lang/Object;
/*     */     //   691: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   694: astore #5
/*     */     //   696: aload #29
/*     */     //   698: getfield L$2 : Ljava/lang/Object;
/*     */     //   701: checkcast kotlin/jvm/functions/Function2
/*     */     //   704: astore_2
/*     */     //   705: aload #29
/*     */     //   707: getfield L$1 : Ljava/lang/Object;
/*     */     //   710: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   713: astore_1
/*     */     //   714: aload #29
/*     */     //   716: getfield L$0 : Ljava/lang/Object;
/*     */     //   719: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   722: astore_0
/*     */     //   723: aload #28
/*     */     //   725: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   728: aload #28
/*     */     //   730: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity
/*     */     //   733: astore #21
/*     */     //   735: aload #21
/*     */     //   737: ifnonnull -> 758
/*     */     //   740: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   743: aload_1
/*     */     //   744: aload #19
/*     */     //   746: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)Ljava/lang/String;
/*     */     //   751: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   754: aconst_null
/*     */     //   755: goto -> 987
/*     */     //   758: aload_0
/*     */     //   759: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   762: aload_1
/*     */     //   763: aload #19
/*     */     //   765: aload #29
/*     */     //   767: aload #29
/*     */     //   769: aload_0
/*     */     //   770: putfield L$0 : Ljava/lang/Object;
/*     */     //   773: aload #29
/*     */     //   775: aload_1
/*     */     //   776: putfield L$1 : Ljava/lang/Object;
/*     */     //   779: aload #29
/*     */     //   781: aload_2
/*     */     //   782: putfield L$2 : Ljava/lang/Object;
/*     */     //   785: aload #29
/*     */     //   787: aload #5
/*     */     //   789: putfield L$3 : Ljava/lang/Object;
/*     */     //   792: aload #29
/*     */     //   794: aload #11
/*     */     //   796: putfield L$4 : Ljava/lang/Object;
/*     */     //   799: aload #29
/*     */     //   801: aload #15
/*     */     //   803: putfield L$5 : Ljava/lang/Object;
/*     */     //   806: aload #29
/*     */     //   808: aload #21
/*     */     //   810: putfield L$6 : Ljava/lang/Object;
/*     */     //   813: aload #29
/*     */     //   815: iconst_5
/*     */     //   816: putfield label : I
/*     */     //   819: invokeinterface loadAllSteps : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   824: dup
/*     */     //   825: aload #30
/*     */     //   827: if_acmpne -> 922
/*     */     //   830: aload #30
/*     */     //   832: areturn
/*     */     //   833: iconst_0
/*     */     //   834: istore #9
/*     */     //   836: iconst_0
/*     */     //   837: istore #12
/*     */     //   839: iconst_0
/*     */     //   840: istore #14
/*     */     //   842: iconst_0
/*     */     //   843: istore #18
/*     */     //   845: iconst_0
/*     */     //   846: istore #20
/*     */     //   848: aload #29
/*     */     //   850: getfield L$6 : Ljava/lang/Object;
/*     */     //   853: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity
/*     */     //   856: astore #21
/*     */     //   858: aload #29
/*     */     //   860: getfield L$5 : Ljava/lang/Object;
/*     */     //   863: checkcast java/util/Iterator
/*     */     //   866: astore #15
/*     */     //   868: aload #29
/*     */     //   870: getfield L$4 : Ljava/lang/Object;
/*     */     //   873: checkcast java/util/Collection
/*     */     //   876: astore #11
/*     */     //   878: aload #29
/*     */     //   880: getfield L$3 : Ljava/lang/Object;
/*     */     //   883: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   886: astore #5
/*     */     //   888: aload #29
/*     */     //   890: getfield L$2 : Ljava/lang/Object;
/*     */     //   893: checkcast kotlin/jvm/functions/Function2
/*     */     //   896: astore_2
/*     */     //   897: aload #29
/*     */     //   899: getfield L$1 : Ljava/lang/Object;
/*     */     //   902: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   905: astore_1
/*     */     //   906: aload #29
/*     */     //   908: getfield L$0 : Ljava/lang/Object;
/*     */     //   911: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   914: astore_0
/*     */     //   915: aload #28
/*     */     //   917: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   920: aload #28
/*     */     //   922: checkcast java/lang/Iterable
/*     */     //   925: invokestatic toPersistentList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;
/*     */     //   928: astore #22
/*     */     //   930: aload #21
/*     */     //   932: invokevirtual getTerminalLog : ()Ljava/lang/String;
/*     */     //   935: dup
/*     */     //   936: ifnull -> 960
/*     */     //   939: astore #23
/*     */     //   941: iconst_0
/*     */     //   942: istore #24
/*     */     //   944: new com/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$SessionLogAvailable
/*     */     //   947: dup
/*     */     //   948: aload #23
/*     */     //   950: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   953: nop
/*     */     //   954: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState
/*     */     //   957: goto -> 967
/*     */     //   960: pop
/*     */     //   961: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$NotAvailable.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$NotAvailable;
/*     */     //   964: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState
/*     */     //   967: astore #25
/*     */     //   969: new com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   972: dup
/*     */     //   973: aload_1
/*     */     //   974: aload #21
/*     */     //   976: aload #22
/*     */     //   978: aload #25
/*     */     //   980: aconst_null
/*     */     //   981: bipush #16
/*     */     //   983: aconst_null
/*     */     //   984: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lkotlinx/collections/immutable/PersistentList;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;Lkotlinx/coroutines/CompletableDeferred;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   987: nop
/*     */     //   988: dup
/*     */     //   989: ifnull -> 1010
/*     */     //   992: astore #26
/*     */     //   994: iconst_0
/*     */     //   995: istore #27
/*     */     //   997: aload #11
/*     */     //   999: aload #26
/*     */     //   1001: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1006: pop
/*     */     //   1007: goto -> 1011
/*     */     //   1010: pop
/*     */     //   1011: goto -> 530
/*     */     //   1014: nop
/*     */     //   1015: aload #11
/*     */     //   1017: checkcast java/util/List
/*     */     //   1020: nop
/*     */     //   1021: checkcast java/lang/Iterable
/*     */     //   1024: astore #8
/*     */     //   1026: iconst_0
/*     */     //   1027: istore #9
/*     */     //   1029: aload #8
/*     */     //   1031: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$getTaskChainSnapshotOr$$inlined$sortedBy$1
/*     */     //   1034: dup
/*     */     //   1035: invokespecial <init> : ()V
/*     */     //   1038: checkcast java/util/Comparator
/*     */     //   1041: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   1044: astore #7
/*     */     //   1046: aload #5
/*     */     //   1048: ifnull -> 1293
/*     */     //   1051: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   1054: dup
/*     */     //   1055: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData
/*     */     //   1058: dup
/*     */     //   1059: aconst_null
/*     */     //   1060: aload #5
/*     */     //   1062: invokespecial <init> : (Lkotlinx/coroutines/Job;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;)V
/*     */     //   1065: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   1068: aload #7
/*     */     //   1070: checkcast java/lang/Iterable
/*     */     //   1073: invokestatic toPersistentList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;
/*     */     //   1076: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   1079: aload_0
/*     */     //   1080: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   1083: aload_0
/*     */     //   1084: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   1087: aconst_null
/*     */     //   1088: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   1091: aconst_null
/*     */     //   1092: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   1095: aconst_null
/*     */     //   1096: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   1099: invokespecial <init> : (Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V
/*     */     //   1102: astore #8
/*     */     //   1104: aload_0
/*     */     //   1105: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1108: astore #9
/*     */     //   1110: aconst_null
/*     */     //   1111: astore #10
/*     */     //   1113: iconst_0
/*     */     //   1114: istore #11
/*     */     //   1116: nop
/*     */     //   1117: aload #9
/*     */     //   1119: aload #10
/*     */     //   1121: aload #29
/*     */     //   1123: aload #29
/*     */     //   1125: aload_0
/*     */     //   1126: putfield L$0 : Ljava/lang/Object;
/*     */     //   1129: aload #29
/*     */     //   1131: aload_1
/*     */     //   1132: putfield L$1 : Ljava/lang/Object;
/*     */     //   1135: aload #29
/*     */     //   1137: aload #8
/*     */     //   1139: putfield L$2 : Ljava/lang/Object;
/*     */     //   1142: aload #29
/*     */     //   1144: aload #9
/*     */     //   1146: putfield L$3 : Ljava/lang/Object;
/*     */     //   1149: aload #29
/*     */     //   1151: aconst_null
/*     */     //   1152: putfield L$4 : Ljava/lang/Object;
/*     */     //   1155: aload #29
/*     */     //   1157: aconst_null
/*     */     //   1158: putfield L$5 : Ljava/lang/Object;
/*     */     //   1161: aload #29
/*     */     //   1163: aconst_null
/*     */     //   1164: putfield L$6 : Ljava/lang/Object;
/*     */     //   1167: aload #29
/*     */     //   1169: bipush #6
/*     */     //   1171: putfield label : I
/*     */     //   1174: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1179: dup
/*     */     //   1180: aload #30
/*     */     //   1182: if_acmpne -> 1239
/*     */     //   1185: aload #30
/*     */     //   1187: areturn
/*     */     //   1188: iconst_0
/*     */     //   1189: istore #11
/*     */     //   1191: aconst_null
/*     */     //   1192: astore #10
/*     */     //   1194: aload #29
/*     */     //   1196: getfield L$3 : Ljava/lang/Object;
/*     */     //   1199: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   1202: astore #9
/*     */     //   1204: aload #29
/*     */     //   1206: getfield L$2 : Ljava/lang/Object;
/*     */     //   1209: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   1212: astore #8
/*     */     //   1214: aload #29
/*     */     //   1216: getfield L$1 : Ljava/lang/Object;
/*     */     //   1219: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   1222: astore_1
/*     */     //   1223: aload #29
/*     */     //   1225: getfield L$0 : Ljava/lang/Object;
/*     */     //   1228: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   1231: astore_0
/*     */     //   1232: aload #28
/*     */     //   1234: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1237: aload #28
/*     */     //   1239: pop
/*     */     //   1240: nop
/*     */     //   1241: iconst_0
/*     */     //   1242: istore #12
/*     */     //   1244: aload_0
/*     */     //   1245: getfield trackedTasks : Ljava/util/Map;
/*     */     //   1248: aload_1
/*     */     //   1249: aload #8
/*     */     //   1251: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1256: pop
/*     */     //   1257: nop
/*     */     //   1258: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1261: astore #13
/*     */     //   1263: aload #9
/*     */     //   1265: aload #10
/*     */     //   1267: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   1272: goto -> 1289
/*     */     //   1275: astore #14
/*     */     //   1277: aload #9
/*     */     //   1279: aload #10
/*     */     //   1281: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   1286: aload #14
/*     */     //   1288: athrow
/*     */     //   1289: nop
/*     */     //   1290: aload #8
/*     */     //   1292: areturn
/*     */     //   1293: aload_2
/*     */     //   1294: aload #7
/*     */     //   1296: aload #29
/*     */     //   1298: aload #29
/*     */     //   1300: aload_0
/*     */     //   1301: putfield L$0 : Ljava/lang/Object;
/*     */     //   1304: aload #29
/*     */     //   1306: aload_1
/*     */     //   1307: putfield L$1 : Ljava/lang/Object;
/*     */     //   1310: aload #29
/*     */     //   1312: aconst_null
/*     */     //   1313: putfield L$2 : Ljava/lang/Object;
/*     */     //   1316: aload #29
/*     */     //   1318: aconst_null
/*     */     //   1319: putfield L$3 : Ljava/lang/Object;
/*     */     //   1322: aload #29
/*     */     //   1324: aconst_null
/*     */     //   1325: putfield L$4 : Ljava/lang/Object;
/*     */     //   1328: aload #29
/*     */     //   1330: aconst_null
/*     */     //   1331: putfield L$5 : Ljava/lang/Object;
/*     */     //   1334: aload #29
/*     */     //   1336: aconst_null
/*     */     //   1337: putfield L$6 : Ljava/lang/Object;
/*     */     //   1340: aload #29
/*     */     //   1342: bipush #7
/*     */     //   1344: putfield label : I
/*     */     //   1347: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1352: dup
/*     */     //   1353: aload #30
/*     */     //   1355: if_acmpne -> 1386
/*     */     //   1358: aload #30
/*     */     //   1360: areturn
/*     */     //   1361: aload #29
/*     */     //   1363: getfield L$1 : Ljava/lang/Object;
/*     */     //   1366: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   1369: astore_1
/*     */     //   1370: aload #29
/*     */     //   1372: getfield L$0 : Ljava/lang/Object;
/*     */     //   1375: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   1378: astore_0
/*     */     //   1379: aload #28
/*     */     //   1381: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1384: aload #28
/*     */     //   1386: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   1389: astore #8
/*     */     //   1391: aload_0
/*     */     //   1392: getfield mutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1395: astore #9
/*     */     //   1397: aconst_null
/*     */     //   1398: astore #10
/*     */     //   1400: iconst_0
/*     */     //   1401: istore #11
/*     */     //   1403: nop
/*     */     //   1404: aload #9
/*     */     //   1406: aload #10
/*     */     //   1408: aload #29
/*     */     //   1410: aload #29
/*     */     //   1412: aload_0
/*     */     //   1413: putfield L$0 : Ljava/lang/Object;
/*     */     //   1416: aload #29
/*     */     //   1418: aload_1
/*     */     //   1419: putfield L$1 : Ljava/lang/Object;
/*     */     //   1422: aload #29
/*     */     //   1424: aload #8
/*     */     //   1426: putfield L$2 : Ljava/lang/Object;
/*     */     //   1429: aload #29
/*     */     //   1431: aload #9
/*     */     //   1433: putfield L$3 : Ljava/lang/Object;
/*     */     //   1436: aload #29
/*     */     //   1438: bipush #8
/*     */     //   1440: putfield label : I
/*     */     //   1443: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1448: dup
/*     */     //   1449: aload #30
/*     */     //   1451: if_acmpne -> 1508
/*     */     //   1454: aload #30
/*     */     //   1456: areturn
/*     */     //   1457: iconst_0
/*     */     //   1458: istore #11
/*     */     //   1460: aconst_null
/*     */     //   1461: astore #10
/*     */     //   1463: aload #29
/*     */     //   1465: getfield L$3 : Ljava/lang/Object;
/*     */     //   1468: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   1471: astore #9
/*     */     //   1473: aload #29
/*     */     //   1475: getfield L$2 : Ljava/lang/Object;
/*     */     //   1478: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   1481: astore #8
/*     */     //   1483: aload #29
/*     */     //   1485: getfield L$1 : Ljava/lang/Object;
/*     */     //   1488: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   1491: astore_1
/*     */     //   1492: aload #29
/*     */     //   1494: getfield L$0 : Ljava/lang/Object;
/*     */     //   1497: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   1500: astore_0
/*     */     //   1501: aload #28
/*     */     //   1503: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1506: aload #28
/*     */     //   1508: pop
/*     */     //   1509: nop
/*     */     //   1510: iconst_0
/*     */     //   1511: istore #12
/*     */     //   1513: aload_0
/*     */     //   1514: getfield trackedTasks : Ljava/util/Map;
/*     */     //   1517: aload_1
/*     */     //   1518: aload #8
/*     */     //   1520: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1525: pop
/*     */     //   1526: nop
/*     */     //   1527: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1530: astore #13
/*     */     //   1532: aload #9
/*     */     //   1534: aload #10
/*     */     //   1536: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   1541: goto -> 1558
/*     */     //   1544: astore #14
/*     */     //   1546: aload #9
/*     */     //   1548: aload #10
/*     */     //   1550: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   1555: aload #14
/*     */     //   1557: athrow
/*     */     //   1558: nop
/*     */     //   1559: aload #8
/*     */     //   1561: areturn
/*     */     //   1562: new java/lang/IllegalStateException
/*     */     //   1565: dup
/*     */     //   1566: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1569: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1572: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 60
/*     */     //   #61	-> 121
/*     */     //   #526	-> 127
/*     */     //   #527	-> 133
/*     */     //   #530	-> 134
/*     */     //   #57	-> 182
/*     */     //   #531	-> 235
/*     */     //   #532	-> 237
/*     */     //   #62	-> 240
/*     */     //   #532	-> 253
/*     */     //   #534	-> 255
/*     */     //   #535	-> 264
/*     */     //   #534	-> 267
/*     */     //   #531	-> 283
/*     */     //   #61	-> 284
/*     */     //   #64	-> 286
/*     */     //   #65	-> 291
/*     */     //   #68	-> 294
/*     */     //   #57	-> 342
/*     */     //   #69	-> 384
/*     */     //   #57	-> 433
/*     */     //   #70	-> 485
/*     */     //   #536	-> 495
/*     */     //   #544	-> 514
/*     */     //   #545	-> 521
/*     */     //   #544	-> 556
/*     */     //   #71	-> 566
/*     */     //   #57	-> 638
/*     */     //   #72	-> 735
/*     */     //   #73	-> 740
/*     */     //   #74	-> 754
/*     */     //   #76	-> 758
/*     */     //   #57	-> 830
/*     */     //   #76	-> 922
/*     */     //   #77	-> 930
/*     */     //   #546	-> 941
/*     */     //   #77	-> 944
/*     */     //   #77	-> 953
/*     */     //   #77	-> 954
/*     */     //   #78	-> 961
/*     */     //   #77	-> 967
/*     */     //   #80	-> 969
/*     */     //   #81	-> 987
/*     */     //   #544	-> 988
/*     */     //   #547	-> 994
/*     */     //   #544	-> 997
/*     */     //   #544	-> 1007
/*     */     //   #544	-> 1010
/*     */     //   #545	-> 1011
/*     */     //   #548	-> 1014
/*     */     //   #549	-> 1015
/*     */     //   #536	-> 1020
/*     */     //   #82	-> 1026
/*     */     //   #550	-> 1029
/*     */     //   #550	-> 1041
/*     */     //   #82	-> 1044
/*     */     //   #70	-> 1044
/*     */     //   #83	-> 1046
/*     */     //   #84	-> 1051
/*     */     //   #86	-> 1055
/*     */     //   #87	-> 1059
/*     */     //   #88	-> 1060
/*     */     //   #86	-> 1062
/*     */     //   #85	-> 1065
/*     */     //   #91	-> 1068
/*     */     //   #92	-> 1079
/*     */     //   #93	-> 1083
/*     */     //   #94	-> 1087
/*     */     //   #95	-> 1091
/*     */     //   #96	-> 1095
/*     */     //   #84	-> 1099
/*     */     //   #98	-> 1104
/*     */     //   #551	-> 1110
/*     */     //   #552	-> 1116
/*     */     //   #555	-> 1117
/*     */     //   #57	-> 1185
/*     */     //   #556	-> 1239
/*     */     //   #557	-> 1241
/*     */     //   #99	-> 1244
/*     */     //   #100	-> 1257
/*     */     //   #557	-> 1261
/*     */     //   #559	-> 1263
/*     */     //   #560	-> 1272
/*     */     //   #559	-> 1275
/*     */     //   #556	-> 1289
/*     */     //   #101	-> 1290
/*     */     //   #104	-> 1293
/*     */     //   #57	-> 1358
/*     */     //   #105	-> 1391
/*     */     //   #561	-> 1397
/*     */     //   #562	-> 1403
/*     */     //   #565	-> 1404
/*     */     //   #57	-> 1454
/*     */     //   #566	-> 1508
/*     */     //   #567	-> 1510
/*     */     //   #106	-> 1513
/*     */     //   #107	-> 1526
/*     */     //   #567	-> 1530
/*     */     //   #569	-> 1532
/*     */     //   #570	-> 1541
/*     */     //   #569	-> 1544
/*     */     //   #566	-> 1558
/*     */     //   #108	-> 1559
/*     */     //   #57	-> 1562
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   121	64	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   228	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   253	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   281	64	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   372	64	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   473	168	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   723	110	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   915	73	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   988	200	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   1232	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   1293	68	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   1379	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   1501	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   121	64	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   219	34	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   253	14	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   281	64	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   363	73	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   464	177	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   714	119	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   906	82	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   988	200	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   1223	34	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   1293	68	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   1370	87	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   1492	34	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   121	64	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   210	43	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   253	14	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   281	64	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   354	82	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   455	186	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   705	128	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   897	91	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   988	33	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   1021	23	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   1044	7	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   1293	59	2	onAbsent	Lkotlin/jvm/functions/Function2;
/*     */     //   286	8	4	chainData	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   127	58	5	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   201	52	5	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   253	11	5	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   267	17	5	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   384	52	5	existingTaskChainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   446	195	5	existingTaskChainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   696	137	5	existingTaskChainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   888	100	5	existingTaskChainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   988	33	5	existingTaskChainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   1021	23	5	existingTaskChainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   1044	18	5	existingTaskChainEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   130	55	6	owner$iv	Ljava/lang/Object;
/*     */     //   201	52	6	owner$iv	Ljava/lang/Object;
/*     */     //   253	11	6	owner$iv	Ljava/lang/Object;
/*     */     //   267	17	6	owner$iv	Ljava/lang/Object;
/*     */     //   485	7	6	taskIds	Ljava/util/List;
/*     */     //   1046	33	7	tasks	Ljava/util/List;
/*     */     //   1293	59	7	tasks	Ljava/util/List;
/*     */     //   492	19	8	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   1026	18	8	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */     //   1104	84	8	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1214	44	8	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1258	17	8	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1289	4	8	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1391	66	8	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1483	44	8	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1527	17	8	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1558	4	8	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   1110	78	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1204	54	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1258	14	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1275	15	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1397	60	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1473	54	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1527	14	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   1544	15	9	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   511	7	10	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1113	75	10	owner$iv	Ljava/lang/Object;
/*     */     //   1204	54	10	owner$iv	Ljava/lang/Object;
/*     */     //   1258	14	10	owner$iv	Ljava/lang/Object;
/*     */     //   1275	15	10	owner$iv	Ljava/lang/Object;
/*     */     //   1400	57	10	owner$iv	Ljava/lang/Object;
/*     */     //   1473	54	10	owner$iv	Ljava/lang/Object;
/*     */     //   1527	14	10	owner$iv	Ljava/lang/Object;
/*     */     //   1544	15	10	owner$iv	Ljava/lang/Object;
/*     */     //   511	130	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   686	147	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   878	110	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   988	29	11	destination$iv$iv	Ljava/util/Collection;
/*     */     //   518	12	13	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   549	4	16	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   553	10	17	element$iv$iv	Ljava/lang/Object;
/*     */     //   563	78	19	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   666	88	19	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   758	66	19	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   735	98	21	loadedTask	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   858	129	21	loadedTask	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   930	57	22	steps	Lkotlinx/collections/immutable/PersistentList;
/*     */     //   941	12	23	it	Ljava/lang/String;
/*     */     //   969	18	25	terminalState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;
/*     */     //   994	13	26	it$iv$iv	Ljava/lang/Object;
/*     */     //   240	13	8	$i$a$-withLock$default-TaskServiceInternal$getTaskChainSnapshotOr$chainData$1	I
/*     */     //   133	52	7	$i$f$withLock	I
/*     */     //   944	9	24	$i$a$-let-TaskServiceInternal$getTaskChainSnapshotOr$tasks$1$terminalState$1	I
/*     */     //   566	75	20	$i$a$-mapNotNull-TaskServiceInternal$getTaskChainSnapshotOr$tasks$1	I
/*     */     //   997	10	27	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   556	85	18	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   521	120	14	$i$f$forEach	I
/*     */     //   514	127	12	$i$f$mapNotNullTo	I
/*     */     //   495	146	9	$i$f$mapNotNull	I
/*     */     //   1029	15	9	$i$f$sortedBy	I
/*     */     //   1244	14	12	$i$a$-withLock$default-TaskServiceInternal$getTaskChainSnapshotOr$2	I
/*     */     //   1116	72	11	$i$f$withLock	I
/*     */     //   1513	14	12	$i$a$-withLock$default-TaskServiceInternal$getTaskChainSnapshotOr$3	I
/*     */     //   1403	54	11	$i$f$withLock	I
/*     */     //   0	1573	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1512	29	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1505	28	$result	Ljava/lang/Object;
/*     */     //   188	96	7	$i$f$withLock	I
/*     */     //   656	177	20	$i$a$-mapNotNull-TaskServiceInternal$getTaskChainSnapshotOr$tasks$1	I
/*     */     //   653	180	18	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   650	183	14	$i$f$forEach	I
/*     */     //   647	186	12	$i$f$mapNotNullTo	I
/*     */     //   644	189	9	$i$f$mapNotNull	I
/*     */     //   848	140	20	$i$a$-mapNotNull-TaskServiceInternal$getTaskChainSnapshotOr$tasks$1	I
/*     */     //   845	166	18	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   842	173	14	$i$f$forEach	I
/*     */     //   839	178	12	$i$f$mapNotNullTo	I
/*     */     //   836	185	9	$i$f$mapNotNull	I
/*     */     //   1191	99	11	$i$f$withLock	I
/*     */     //   1460	99	11	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   236	255	267	finally
/*     */     //   267	269	267	finally
/*     */     //   1240	1263	1275	finally
/*     */     //   1275	1277	1275	finally
/*     */     //   1509	1532	1544	finally
/* 607 */     //   1544	1546	1544	finally } @NotNull private static final Logger logger = Logger.getInstance(TaskServiceImpl.class);
/*     */   
/*     */   private final Object requireTaskChainSnapshot(TaskChainId taskChainId, Continuation<? super LiveTaskChainImpl> $completion) {
/*     */     return getTaskChainSnapshotOr(taskChainId, new TaskServiceInternal$requireTaskChainSnapshot$2(taskChainId, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal$requireTaskChainSnapshot$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;", "it", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;"})
/*     */   static final class TaskServiceInternal$requireTaskChainSnapshot$2 extends SuspendLambda implements Function2<List<? extends LiveTaskSnapshot>, Continuation<? super LiveTaskChainImpl>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$requireTaskChainSnapshot$2(TaskChainId $taskChainId, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           throw new IllegalStateException(("Task chain with id " + this.$taskChainId + " is not found").toString());
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskServiceInternal$requireTaskChainSnapshot$2> $completion) {
/*     */       return (Continuation<Unit>)new TaskServiceInternal$requireTaskChainSnapshot$2(this.$taskChainId, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(List p1, Continuation<?> p2) {
/*     */       return ((TaskServiceInternal$requireTaskChainSnapshot$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object getOrCreateTaskChainSnapshot(TaskChainId taskChainId, Continuation<? super LiveTaskChainImpl> $completion) {
/*     */     return getTaskChainSnapshotOr(taskChainId, new TaskServiceInternal$getOrCreateTaskChainSnapshot$2(taskChainId, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {120}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal$getOrCreateTaskChainSnapshot$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\020\000\032\0020\0012\f\020\002\032\b\022\004\022\0020\0040\003H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;", "tasks", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;"})
/*     */   static final class TaskServiceInternal$getOrCreateTaskChainSnapshot$2 extends SuspendLambda implements Function2<List<? extends LiveTaskSnapshot>, Continuation<? super LiveTaskChainImpl>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$getOrCreateTaskChainSnapshot$2(TaskChainId $taskChainId, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       List tasks;
/*     */       Instant now;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           tasks = (List)this.L$0;
/*     */           now = Clock.System.INSTANCE.now();
/*     */           this.label = 1;
/*     */           if (TaskServiceInternal.this.createNewTaskChain(this.$taskChainId, now, tasks, (Continuation)this) == object)
/*     */             return object; 
/*     */           return TaskServiceInternal.this.createNewTaskChain(this.$taskChainId, now, tasks, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskServiceInternal$getOrCreateTaskChainSnapshot$2> $completion) {
/*     */       TaskServiceInternal$getOrCreateTaskChainSnapshot$2 taskServiceInternal$getOrCreateTaskChainSnapshot$2 = new TaskServiceInternal$getOrCreateTaskChainSnapshot$2(this.$taskChainId, $completion);
/*     */       taskServiceInternal$getOrCreateTaskChainSnapshot$2.L$0 = value;
/*     */       return (Continuation<Unit>)taskServiceInternal$getOrCreateTaskChainSnapshot$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(List p1, Continuation<?> p2) {
/*     */       return ((TaskServiceInternal$getOrCreateTaskChainSnapshot$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object createNewTaskChain(TaskChainId taskChainId, Instant now, List tasks, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$createNewTaskChain$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$createNewTaskChain$1
/*     */     //   13: astore #8
/*     */     //   15: aload #8
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #8
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$createNewTaskChain$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #7
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #9
/*     */     //   65: aload #8
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 290, 0 -> 92, 1 -> 216
/*     */     //   92: aload #7
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   100: dup
/*     */     //   101: aload_1
/*     */     //   102: aconst_null
/*     */     //   103: aload_2
/*     */     //   104: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Stopped : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   107: aconst_null
/*     */     //   108: bipush #16
/*     */     //   110: aconst_null
/*     */     //   111: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Ljava/lang/String;Lkotlinx/datetime/Instant;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   114: astore #5
/*     */     //   116: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   119: dup
/*     */     //   120: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData
/*     */     //   123: dup
/*     */     //   124: aconst_null
/*     */     //   125: aload #5
/*     */     //   127: invokespecial <init> : (Lkotlinx/coroutines/Job;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;)V
/*     */     //   130: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   133: aload_3
/*     */     //   134: checkcast java/lang/Iterable
/*     */     //   137: invokestatic toPersistentList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;
/*     */     //   140: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   143: aload_0
/*     */     //   144: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   147: aload_0
/*     */     //   148: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   151: aconst_null
/*     */     //   152: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   155: aconst_null
/*     */     //   156: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   159: aconst_null
/*     */     //   160: invokestatic MutableStateFlow : (Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   163: invokespecial <init> : (Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V
/*     */     //   166: astore #6
/*     */     //   168: aload_0
/*     */     //   169: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   172: aload #5
/*     */     //   174: aload #8
/*     */     //   176: aload #8
/*     */     //   178: aload_0
/*     */     //   179: putfield L$0 : Ljava/lang/Object;
/*     */     //   182: aload #8
/*     */     //   184: aload #5
/*     */     //   186: putfield L$1 : Ljava/lang/Object;
/*     */     //   189: aload #8
/*     */     //   191: aload #6
/*     */     //   193: putfield L$2 : Ljava/lang/Object;
/*     */     //   196: aload #8
/*     */     //   198: iconst_1
/*     */     //   199: putfield label : I
/*     */     //   202: invokeinterface saveChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   207: dup
/*     */     //   208: aload #9
/*     */     //   210: if_acmpne -> 252
/*     */     //   213: aload #9
/*     */     //   215: areturn
/*     */     //   216: aload #8
/*     */     //   218: getfield L$2 : Ljava/lang/Object;
/*     */     //   221: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   224: astore #6
/*     */     //   226: aload #8
/*     */     //   228: getfield L$1 : Ljava/lang/Object;
/*     */     //   231: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   234: astore #5
/*     */     //   236: aload #8
/*     */     //   238: getfield L$0 : Ljava/lang/Object;
/*     */     //   241: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   244: astore_0
/*     */     //   245: aload #7
/*     */     //   247: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   250: aload #7
/*     */     //   252: pop
/*     */     //   253: aload_0
/*     */     //   254: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   257: invokeinterface getMessageBus : ()Lcom/intellij/util/messages/MessageBus;
/*     */     //   262: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion;
/*     */     //   265: invokevirtual getTOPIC : ()Lcom/intellij/util/messages/Topic;
/*     */     //   268: invokeinterface syncPublisher : (Lcom/intellij/util/messages/Topic;)Ljava/lang/Object;
/*     */     //   273: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainListener
/*     */     //   276: aload_0
/*     */     //   277: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   280: aload #5
/*     */     //   282: invokeinterface onTaskChainUpdated : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;)V
/*     */     //   287: aload #6
/*     */     //   289: areturn
/*     */     //   290: new java/lang/IllegalStateException
/*     */     //   293: dup
/*     */     //   294: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   297: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   300: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #124	-> 63
/*     */     //   #129	-> 97
/*     */     //   #130	-> 116
/*     */     //   #132	-> 120
/*     */     //   #133	-> 124
/*     */     //   #134	-> 125
/*     */     //   #132	-> 127
/*     */     //   #131	-> 130
/*     */     //   #137	-> 133
/*     */     //   #138	-> 143
/*     */     //   #139	-> 147
/*     */     //   #140	-> 151
/*     */     //   #141	-> 155
/*     */     //   #142	-> 159
/*     */     //   #130	-> 163
/*     */     //   #144	-> 168
/*     */     //   #124	-> 213
/*     */     //   #145	-> 252
/*     */     //   #146	-> 287
/*     */     //   #124	-> 290
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	119	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   245	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   97	19	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   97	19	2	now	Lkotlinx/datetime/Instant;
/*     */     //   97	46	3	tasks	Ljava/util/List;
/*     */     //   116	100	5	newTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   236	54	5	newTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   168	48	6	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   226	64	6	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   0	301	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	237	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	230	7	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object start(@NotNull TaskChainId chainId, @NotNull ExplicitTaskContext context, @Nullable PreviousTasksInfo previousTasksInfo, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$start$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$start$1
/*     */     //   13: astore #20
/*     */     //   15: aload #20
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #20
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$start$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #20
/*     */     //   53: aload #20
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #19
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #21
/*     */     //   65: aload #20
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 952, 0 -> 104, 1 -> 155, 2 -> 310, 3 -> 650, 4 -> 781
/*     */     //   104: aload #19
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: aload_0
/*     */     //   110: aload_1
/*     */     //   111: aload #20
/*     */     //   113: aload #20
/*     */     //   115: aload_0
/*     */     //   116: putfield L$0 : Ljava/lang/Object;
/*     */     //   119: aload #20
/*     */     //   121: aload_1
/*     */     //   122: putfield L$1 : Ljava/lang/Object;
/*     */     //   125: aload #20
/*     */     //   127: aload_2
/*     */     //   128: putfield L$2 : Ljava/lang/Object;
/*     */     //   131: aload #20
/*     */     //   133: aload_3
/*     */     //   134: putfield L$3 : Ljava/lang/Object;
/*     */     //   137: aload #20
/*     */     //   139: iconst_1
/*     */     //   140: putfield label : I
/*     */     //   143: invokespecial getOrCreateTaskChainSnapshot : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   146: dup
/*     */     //   147: aload #21
/*     */     //   149: if_acmpne -> 198
/*     */     //   152: aload #21
/*     */     //   154: areturn
/*     */     //   155: aload #20
/*     */     //   157: getfield L$3 : Ljava/lang/Object;
/*     */     //   160: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo
/*     */     //   163: astore_3
/*     */     //   164: aload #20
/*     */     //   166: getfield L$2 : Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext
/*     */     //   172: astore_2
/*     */     //   173: aload #20
/*     */     //   175: getfield L$1 : Ljava/lang/Object;
/*     */     //   178: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   181: astore_1
/*     */     //   182: aload #20
/*     */     //   184: getfield L$0 : Ljava/lang/Object;
/*     */     //   187: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   190: astore_0
/*     */     //   191: aload #19
/*     */     //   193: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   196: aload #19
/*     */     //   198: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   201: astore #5
/*     */     //   203: aload #5
/*     */     //   205: invokevirtual getChain : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   208: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   213: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   216: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   219: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   222: if_acmpeq -> 229
/*     */     //   225: iconst_1
/*     */     //   226: goto -> 230
/*     */     //   229: iconst_0
/*     */     //   230: ifne -> 254
/*     */     //   233: iconst_0
/*     */     //   234: istore #7
/*     */     //   236: ldc_w 'Task chain must be not in running state on start'
/*     */     //   239: astore #7
/*     */     //   241: new java/lang/IllegalArgumentException
/*     */     //   244: dup
/*     */     //   245: aload #7
/*     */     //   247: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   250: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   253: athrow
/*     */     //   254: aload #5
/*     */     //   256: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   259: aload #20
/*     */     //   261: aload #20
/*     */     //   263: aload_0
/*     */     //   264: putfield L$0 : Ljava/lang/Object;
/*     */     //   267: aload #20
/*     */     //   269: aload_1
/*     */     //   270: putfield L$1 : Ljava/lang/Object;
/*     */     //   273: aload #20
/*     */     //   275: aload_2
/*     */     //   276: putfield L$2 : Ljava/lang/Object;
/*     */     //   279: aload #20
/*     */     //   281: aload_3
/*     */     //   282: putfield L$3 : Ljava/lang/Object;
/*     */     //   285: aload #20
/*     */     //   287: aload #5
/*     */     //   289: putfield L$4 : Ljava/lang/Object;
/*     */     //   292: aload #20
/*     */     //   294: iconst_2
/*     */     //   295: putfield label : I
/*     */     //   298: invokevirtual updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   301: dup
/*     */     //   302: aload #21
/*     */     //   304: if_acmpne -> 363
/*     */     //   307: aload #21
/*     */     //   309: areturn
/*     */     //   310: aload #20
/*     */     //   312: getfield L$4 : Ljava/lang/Object;
/*     */     //   315: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   318: astore #5
/*     */     //   320: aload #20
/*     */     //   322: getfield L$3 : Ljava/lang/Object;
/*     */     //   325: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo
/*     */     //   328: astore_3
/*     */     //   329: aload #20
/*     */     //   331: getfield L$2 : Ljava/lang/Object;
/*     */     //   334: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext
/*     */     //   337: astore_2
/*     */     //   338: aload #20
/*     */     //   340: getfield L$1 : Ljava/lang/Object;
/*     */     //   343: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   346: astore_1
/*     */     //   347: aload #20
/*     */     //   349: getfield L$0 : Ljava/lang/Object;
/*     */     //   352: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   355: astore_0
/*     */     //   356: aload #19
/*     */     //   358: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   361: aload #19
/*     */     //   363: pop
/*     */     //   364: getstatic kotlinx/datetime/Clock$System.INSTANCE : Lkotlinx/datetime/Clock$System;
/*     */     //   367: invokevirtual now : ()Lkotlinx/datetime/Instant;
/*     */     //   370: astore #6
/*     */     //   372: aload_2
/*     */     //   373: invokevirtual getDescription : ()Ljava/lang/String;
/*     */     //   376: astore #7
/*     */     //   378: aload #5
/*     */     //   380: invokevirtual getTasks : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   383: astore #9
/*     */     //   385: iconst_0
/*     */     //   386: istore #10
/*     */     //   388: nop
/*     */     //   389: aload #9
/*     */     //   391: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   396: astore #11
/*     */     //   398: aload #11
/*     */     //   400: checkcast kotlinx/collections/immutable/PersistentList
/*     */     //   403: astore #12
/*     */     //   405: iconst_0
/*     */     //   406: istore #13
/*     */     //   408: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   411: dup
/*     */     //   412: aload #12
/*     */     //   414: invokeinterface size : ()I
/*     */     //   419: invokespecial <init> : (I)V
/*     */     //   422: astore #14
/*     */     //   424: aload_2
/*     */     //   425: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;
/*     */     //   428: astore #15
/*     */     //   430: aload_1
/*     */     //   431: aload #14
/*     */     //   433: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)Ljava/lang/String;
/*     */     //   438: astore #16
/*     */     //   440: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity
/*     */     //   443: dup
/*     */     //   444: aload #14
/*     */     //   446: aload #15
/*     */     //   448: aload #6
/*     */     //   450: aload #16
/*     */     //   452: aload_2
/*     */     //   453: aload_3
/*     */     //   454: aconst_null
/*     */     //   455: iconst_0
/*     */     //   456: aconst_null
/*     */     //   457: aconst_null
/*     */     //   458: aconst_null
/*     */     //   459: aconst_null
/*     */     //   460: sipush #1792
/*     */     //   463: aconst_null
/*     */     //   464: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;Lkotlinx/datetime/Instant;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   467: astore #17
/*     */     //   469: aload #12
/*     */     //   471: new com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   474: dup
/*     */     //   475: aload_1
/*     */     //   476: aload #17
/*     */     //   478: iconst_1
/*     */     //   479: anewarray com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*     */     //   482: astore #15
/*     */     //   484: aload #15
/*     */     //   486: iconst_0
/*     */     //   487: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*     */     //   490: dup
/*     */     //   491: ldc_w ''
/*     */     //   494: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Prompt : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   497: aload #7
/*     */     //   499: aconst_null
/*     */     //   500: aconst_null
/*     */     //   501: lconst_0
/*     */     //   502: invokestatic boxLong : (J)Ljava/lang/Long;
/*     */     //   505: bipush #24
/*     */     //   507: aconst_null
/*     */     //   508: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   511: aastore
/*     */     //   512: aload #15
/*     */     //   514: invokestatic persistentListOf : ([Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */     //   517: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$NotAvailable.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState$NotAvailable;
/*     */     //   520: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState
/*     */     //   523: aconst_null
/*     */     //   524: bipush #16
/*     */     //   526: aconst_null
/*     */     //   527: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lkotlinx/collections/immutable/PersistentList;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;Lkotlinx/coroutines/CompletableDeferred;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   530: invokeinterface add : (Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */     //   535: nop
/*     */     //   536: astore #18
/*     */     //   538: aload #9
/*     */     //   540: aload #11
/*     */     //   542: aload #18
/*     */     //   544: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   549: ifeq -> 388
/*     */     //   552: aload #18
/*     */     //   554: astore #8
/*     */     //   556: aload #8
/*     */     //   558: checkcast java/util/List
/*     */     //   561: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   564: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   567: astore #9
/*     */     //   569: aload #9
/*     */     //   571: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*     */     //   574: checkcast java/util/List
/*     */     //   577: invokestatic single : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   580: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*     */     //   583: astore #10
/*     */     //   585: aload_0
/*     */     //   586: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   589: aload_1
/*     */     //   590: aload #9
/*     */     //   592: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   595: aload #20
/*     */     //   597: aload #20
/*     */     //   599: aload_0
/*     */     //   600: putfield L$0 : Ljava/lang/Object;
/*     */     //   603: aload #20
/*     */     //   605: aload_1
/*     */     //   606: putfield L$1 : Ljava/lang/Object;
/*     */     //   609: aload #20
/*     */     //   611: aload #5
/*     */     //   613: putfield L$2 : Ljava/lang/Object;
/*     */     //   616: aload #20
/*     */     //   618: aload #9
/*     */     //   620: putfield L$3 : Ljava/lang/Object;
/*     */     //   623: aload #20
/*     */     //   625: aload #10
/*     */     //   627: putfield L$4 : Ljava/lang/Object;
/*     */     //   630: aload #20
/*     */     //   632: iconst_3
/*     */     //   633: putfield label : I
/*     */     //   636: invokeinterface saveTask : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   641: dup
/*     */     //   642: aload #21
/*     */     //   644: if_acmpne -> 705
/*     */     //   647: aload #21
/*     */     //   649: areturn
/*     */     //   650: aload #20
/*     */     //   652: getfield L$4 : Ljava/lang/Object;
/*     */     //   655: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*     */     //   658: astore #10
/*     */     //   660: aload #20
/*     */     //   662: getfield L$3 : Ljava/lang/Object;
/*     */     //   665: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   668: astore #9
/*     */     //   670: aload #20
/*     */     //   672: getfield L$2 : Ljava/lang/Object;
/*     */     //   675: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   678: astore #5
/*     */     //   680: aload #20
/*     */     //   682: getfield L$1 : Ljava/lang/Object;
/*     */     //   685: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   688: astore_1
/*     */     //   689: aload #20
/*     */     //   691: getfield L$0 : Ljava/lang/Object;
/*     */     //   694: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   697: astore_0
/*     */     //   698: aload #19
/*     */     //   700: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   703: aload #19
/*     */     //   705: pop
/*     */     //   706: aload #9
/*     */     //   708: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   711: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   714: astore #11
/*     */     //   716: aload_0
/*     */     //   717: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   720: aload_1
/*     */     //   721: iconst_0
/*     */     //   722: aload #11
/*     */     //   724: aload #10
/*     */     //   726: aload #20
/*     */     //   728: aload #20
/*     */     //   730: aload_0
/*     */     //   731: putfield L$0 : Ljava/lang/Object;
/*     */     //   734: aload #20
/*     */     //   736: aload_1
/*     */     //   737: putfield L$1 : Ljava/lang/Object;
/*     */     //   740: aload #20
/*     */     //   742: aload #5
/*     */     //   744: putfield L$2 : Ljava/lang/Object;
/*     */     //   747: aload #20
/*     */     //   749: aload #9
/*     */     //   751: putfield L$3 : Ljava/lang/Object;
/*     */     //   754: aload #20
/*     */     //   756: aload #11
/*     */     //   758: putfield L$4 : Ljava/lang/Object;
/*     */     //   761: aload #20
/*     */     //   763: iconst_4
/*     */     //   764: putfield label : I
/*     */     //   767: invokeinterface saveStep : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;ILcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   772: dup
/*     */     //   773: aload #21
/*     */     //   775: if_acmpne -> 836
/*     */     //   778: aload #21
/*     */     //   780: areturn
/*     */     //   781: aload #20
/*     */     //   783: getfield L$4 : Ljava/lang/Object;
/*     */     //   786: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   789: astore #11
/*     */     //   791: aload #20
/*     */     //   793: getfield L$3 : Ljava/lang/Object;
/*     */     //   796: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   799: astore #9
/*     */     //   801: aload #20
/*     */     //   803: getfield L$2 : Ljava/lang/Object;
/*     */     //   806: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   809: astore #5
/*     */     //   811: aload #20
/*     */     //   813: getfield L$1 : Ljava/lang/Object;
/*     */     //   816: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   819: astore_1
/*     */     //   820: aload #20
/*     */     //   822: getfield L$0 : Ljava/lang/Object;
/*     */     //   825: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   828: astore_0
/*     */     //   829: aload #19
/*     */     //   831: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   834: aload #19
/*     */     //   836: pop
/*     */     //   837: getstatic com/intellij/ml/llm/matterhorn/MatterhornServiceScope.Companion : Lcom/intellij/ml/llm/matterhorn/MatterhornServiceScope$Companion;
/*     */     //   840: aload_0
/*     */     //   841: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   844: invokevirtual getScope : (Lcom/intellij/openapi/project/Project;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   847: astore #12
/*     */     //   849: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdaterImpl
/*     */     //   852: dup
/*     */     //   853: aload #5
/*     */     //   855: aload_1
/*     */     //   856: aload_0
/*     */     //   857: getfield taskStorage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   860: aload #12
/*     */     //   862: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlinx/coroutines/CoroutineScope;)V
/*     */     //   865: astore #13
/*     */     //   867: aload_0
/*     */     //   868: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   871: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vcs/VcsFileListenerContextHelper;
/*     */     //   874: astore #14
/*     */     //   876: aload #12
/*     */     //   878: new kotlinx/coroutines/CoroutineName
/*     */     //   881: dup
/*     */     //   882: aload #11
/*     */     //   884: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)Ljava/lang/String;
/*     */     //   889: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   892: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   895: aconst_null
/*     */     //   896: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$start$job$1
/*     */     //   899: dup
/*     */     //   900: aload_0
/*     */     //   901: aload #9
/*     */     //   903: aload #13
/*     */     //   905: aload_1
/*     */     //   906: aload #5
/*     */     //   908: aload #14
/*     */     //   910: aconst_null
/*     */     //   911: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdaterImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lcom/intellij/openapi/vcs/VcsFileListenerContextHelper;Lkotlin/coroutines/Continuation;)V
/*     */     //   914: checkcast kotlin/jvm/functions/Function2
/*     */     //   917: iconst_2
/*     */     //   918: aconst_null
/*     */     //   919: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */     //   922: astore #15
/*     */     //   924: aload #15
/*     */     //   926: aload_0
/*     */     //   927: aload #9
/*     */     //   929: aload #14
/*     */     //   931: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;Lcom/intellij/openapi/vcs/VcsFileListenerContextHelper;)Lkotlin/jvm/functions/Function1;
/*     */     //   936: invokeinterface invokeOnCompletion : (Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;
/*     */     //   941: pop
/*     */     //   942: aload #5
/*     */     //   944: aload #15
/*     */     //   946: invokevirtual setJob : (Lkotlinx/coroutines/Job;)V
/*     */     //   949: aload #11
/*     */     //   951: areturn
/*     */     //   952: new java/lang/IllegalStateException
/*     */     //   955: dup
/*     */     //   956: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   959: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   962: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #149	-> 63
/*     */     //   #154	-> 109
/*     */     //   #149	-> 152
/*     */     //   #156	-> 203
/*     */     //   #546	-> 233
/*     */     //   #156	-> 236
/*     */     //   #156	-> 239
/*     */     //   #158	-> 254
/*     */     //   #149	-> 307
/*     */     //   #160	-> 363
/*     */     //   #161	-> 372
/*     */     //   #163	-> 378
/*     */     //   #571	-> 388
/*     */     //   #572	-> 389
/*     */     //   #573	-> 398
/*     */     //   #164	-> 408
/*     */     //   #167	-> 424
/*     */     //   #169	-> 430
/*     */     //   #165	-> 440
/*     */     //   #166	-> 444
/*     */     //   #167	-> 446
/*     */     //   #168	-> 448
/*     */     //   #169	-> 450
/*     */     //   #170	-> 452
/*     */     //   #171	-> 453
/*     */     //   #172	-> 454
/*     */     //   #174	-> 455
/*     */     //   #165	-> 456
/*     */     //   #173	-> 459
/*     */     //   #165	-> 460
/*     */     //   #176	-> 469
/*     */     //   #177	-> 471
/*     */     //   #178	-> 475
/*     */     //   #179	-> 476
/*     */     //   #181	-> 478
/*     */     //   #180	-> 514
/*     */     //   #183	-> 517
/*     */     //   #177	-> 523
/*     */     //   #176	-> 530
/*     */     //   #185	-> 535
/*     */     //   #573	-> 536
/*     */     //   #574	-> 538
/*     */     //   #575	-> 552
/*     */     //   #163	-> 554
/*     */     //   #187	-> 556
/*     */     //   #188	-> 569
/*     */     //   #190	-> 585
/*     */     //   #149	-> 647
/*     */     //   #191	-> 705
/*     */     //   #192	-> 716
/*     */     //   #149	-> 778
/*     */     //   #194	-> 836
/*     */     //   #195	-> 849
/*     */     //   #196	-> 853
/*     */     //   #197	-> 855
/*     */     //   #198	-> 856
/*     */     //   #199	-> 860
/*     */     //   #195	-> 862
/*     */     //   #201	-> 867
/*     */     //   #202	-> 876
/*     */     //   #218	-> 924
/*     */     //   #230	-> 942
/*     */     //   #231	-> 949
/*     */     //   #149	-> 952
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   191	119	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   356	294	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   698	83	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   829	123	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   109	46	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   182	128	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   347	303	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   689	92	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   820	132	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   109	46	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;
/*     */     //   173	137	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;
/*     */     //   338	198	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;
/*     */     //   536	16	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;
/*     */     //   109	46	3	previousTasksInfo	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;
/*     */     //   164	146	3	previousTasksInfo	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;
/*     */     //   329	207	3	previousTasksInfo	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;
/*     */     //   536	16	3	previousTasksInfo	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;
/*     */     //   203	107	5	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   320	330	5	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   680	101	5	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   811	141	5	liveTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   372	164	6	now	Lkotlinx/datetime/Instant;
/*     */     //   536	16	6	now	Lkotlinx/datetime/Instant;
/*     */     //   378	158	7	description	Ljava/lang/String;
/*     */     //   536	16	7	description	Ljava/lang/String;
/*     */     //   556	13	8	updatedTaskList	Lkotlinx/collections/immutable/PersistentList;
/*     */     //   385	169	9	$this$updateAndGet$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   569	81	9	taskSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   670	111	9	taskSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   801	151	9	taskSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   585	65	10	promptStep	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*     */     //   660	112	10	promptStep	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*     */     //   398	156	11	prevValue$iv	Ljava/lang/Object;
/*     */     //   716	65	11	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   791	161	11	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   405	131	12	previousTaskList	Lkotlinx/collections/immutable/PersistentList;
/*     */     //   849	103	12	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   867	85	13	updater	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdaterImpl;
/*     */     //   424	112	14	taskId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   876	76	14	vcsFileListenerContextHelper	Lcom/intellij/openapi/vcs/VcsFileListenerContextHelper;
/*     */     //   924	28	15	job	Lkotlinx/coroutines/Job;
/*     */     //   469	67	17	taskEntity	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   538	16	18	nextValue$iv	Ljava/lang/Object;
/*     */     //   236	3	7	$i$a$-require-TaskServiceInternal$start$2	I
/*     */     //   408	128	13	$i$a$-updateAndGet-TaskServiceInternal$start$updatedTaskList$1	I
/*     */     //   388	166	10	$i$f$updateAndGet	I
/*     */     //   0	963	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	899	20	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	892	19	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {210, 211}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal$start$job$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TaskServiceInternal$start$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$start$job$1(LiveTaskSnapshot $taskSnapshot, TaskSnapshotUpdaterImpl $updater, TaskChainId $chainId, LiveTaskChainImpl $liveTaskChain, VcsFileListenerContextHelper $vcsFileListenerContextHelper, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       CoroutineScope $this$launch;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$launch = (CoroutineScope)this.L$0;
/*     */           try {
/*     */             Object object2;
/*     */             Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(TaskServiceInternal.this.project));
/*     */             VirtualFile projectDir = ProjectUtil.guessProjectDir(TaskServiceInternal.this.project);
/*     */             CoroutineScope coroutineScope = $this$launch;
/*     */             VcsFileListenerContextHelper vcsFileListenerContextHelper = this.$vcsFileListenerContextHelper;
/*     */             try {
/*     */               int $i$a$-runCatching-TaskServiceInternal$start$job$1$1 = 0;
/*     */               vcsFileListenerContextHelper.ignoreAddedRecursive(CollectionsKt.listOf(new LocalFilePath(projectDir.toNioPath(), true)));
/*     */               object2 = Result.constructor-impl(Unit.INSTANCE);
/*     */             } catch (Throwable throwable) {
/*     */               object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
/*     */             } 
/*     */             Object object1 = object2;
/*     */             Throwable throwable1 = Result.exceptionOrNull-impl(object1), it = throwable1;
/*     */             int $i$a$-onFailure-TaskServiceInternal$start$job$1$2 = 0;
/*     */             TaskServiceInternal.logger.warn(it);
/*     */             Result.exceptionOrNull-impl(object1);
/*     */             this.label = 1;
/*     */             if (TaskServiceInternal.this.taskLauncher.launch(TaskServiceInternal.this.project, this.$taskSnapshot.getTask(), this.$updater, this.$chainId, $this$launch, (Continuation<? super Job>)this) == object)
/*     */               return object; 
/*     */             this.label = 2;
/*     */             if (((Job)TaskServiceInternal.this.taskLauncher.launch(TaskServiceInternal.this.project, this.$taskSnapshot.getTask(), this.$updater, this.$chainId, $this$launch, (Continuation<? super Job>)this)).join((Continuation)this) == object)
/*     */               return object; 
/*     */             ((Job)TaskServiceInternal.this.taskLauncher.launch(TaskServiceInternal.this.project, this.$taskSnapshot.getTask(), this.$updater, this.$chainId, $this$launch, (Continuation<? super Job>)this)).join((Continuation)this);
/*     */             TaskServiceInternal.this.produceReportIfNecessary(this.$liveTaskChain, this.$updater);
/*     */           } catch (Exception e) {
/*     */             TaskServiceInternal.this.produceReportIfNecessary(this.$liveTaskChain, this.$updater);
/*     */             throw e;
/*     */           } 
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 2;
/*     */           if (((Job)SYNTHETIC_LOCAL_VARIABLE_1).join((Continuation)this) == object)
/*     */             return object; 
/*     */           ((Job)SYNTHETIC_LOCAL_VARIABLE_1).join((Continuation)this);
/*     */           TaskServiceInternal.this.produceReportIfNecessary(this.$liveTaskChain, this.$updater);
/*     */         case 2:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           TaskServiceInternal.this.produceReportIfNecessary(this.$liveTaskChain, this.$updater);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskServiceInternal$start$job$1> $completion) {
/*     */       TaskServiceInternal$start$job$1 taskServiceInternal$start$job$1 = new TaskServiceInternal$start$job$1(this.$taskSnapshot, this.$updater, this.$chainId, this.$liveTaskChain, this.$vcsFileListenerContextHelper, $completion);
/*     */       taskServiceInternal$start$job$1.L$0 = value;
/*     */       return (Continuation<Unit>)taskServiceInternal$start$job$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TaskServiceInternal$start$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit start$lambda$10(TaskServiceInternal this$0, LiveTaskSnapshot $taskSnapshot, VcsFileListenerContextHelper $vcsFileListenerContextHelper, Throwable it) {
/*     */     Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(this$0.project));
/*     */     Intrinsics.checkNotNullExpressionValue(ProjectUtil.guessProjectDir(this$0.project).toNioPath().resolve(".output.txt"), "resolve(...)");
/*     */     if (Files.deleteIfExists(ProjectUtil.guessProjectDir(this$0.project).toNioPath().resolve(".output.txt")))
/*     */       logger.info("Output file .output.txt deleted after task completion"); 
/*     */     $taskSnapshot.getFinishedSignal().complete(Unit.INSTANCE);
/*     */     TaskServiceInternal taskServiceInternal = this$0;
/*     */     try {
/*     */       TaskServiceInternal $this$start_u24lambda_u2410_u24lambda_u248 = taskServiceInternal;
/*     */       int $i$a$-runCatching-TaskServiceInternal$start$3$1 = 0;
/*     */       $vcsFileListenerContextHelper.clearContext();
/*     */       object2 = Result.constructor-impl(Unit.INSTANCE);
/*     */     } catch (Throwable throwable) {
/*     */       object2 = Result.constructor-impl(ResultKt.createFailure(throwable));
/*     */     } 
/*     */     Object object1 = object2;
/*     */     Object object2 = Result.exceptionOrNull-impl(object1), object3 = object2;
/*     */     int $i$a$-onFailure-TaskServiceInternal$start$3$2 = 0;
/*     */     logger.warn((Throwable)object3);
/*     */     Result.exceptionOrNull-impl(object1);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final void produceReportIfNecessary(LiveTaskChainImpl taskChain, TaskSnapshotUpdater updater) {
/*     */     PersistentList tasks = (PersistentList)taskChain.getTasks().getValue();
/*     */     PersistentList steps = ((LiveTaskSnapshot)CollectionsKt.last((List)tasks)).getSteps();
/*     */     StepEntity last = (StepEntity)CollectionsKt.last((List)steps);
/*     */     List fileChanges = TaskChainDetailsViewModelKt.collectFileChanges(steps);
/*     */     if (last.getType() != StepType.Report && (!fileChanges.isEmpty()))
/*     */       updater.update(fileChanges::produceReportIfNecessary$lambda$11); 
/*     */   }
/*     */   
/*     */   private static final LiveTaskSnapshot produceReportIfNecessary$lambda$11(List $fileChanges, LiveTaskSnapshot it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     PersistentList oldSteps = it.getSteps();
/*     */     return LiveTaskSnapshot.copy$default(it, null, null, oldSteps.add(new StepEntity("Report", StepType.Report, "Request has produced a set of edits.", $fileChanges, null, null, 16, null)), null, null, 27, null);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object stop(@NotNull TaskChainId chainId, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$stop$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$stop$1
/*     */     //   11: astore #14
/*     */     //   13: aload #14
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #14
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$stop$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #14
/*     */     //   50: aload #14
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #13
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #15
/*     */     //   62: aload #14
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 388, 0 -> 96, 1 -> 129, 2 -> 189, 3 -> 376
/*     */     //   96: aload #13
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: aload #14
/*     */     //   105: aload #14
/*     */     //   107: aload_0
/*     */     //   108: putfield L$0 : Ljava/lang/Object;
/*     */     //   111: aload #14
/*     */     //   113: iconst_1
/*     */     //   114: putfield label : I
/*     */     //   117: invokespecial requireTaskChainSnapshot : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   120: dup
/*     */     //   121: aload #15
/*     */     //   123: if_acmpne -> 145
/*     */     //   126: aload #15
/*     */     //   128: areturn
/*     */     //   129: aload #14
/*     */     //   131: getfield L$0 : Ljava/lang/Object;
/*     */     //   134: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   137: astore_0
/*     */     //   138: aload #13
/*     */     //   140: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   143: aload #13
/*     */     //   145: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   148: astore_3
/*     */     //   149: aload_3
/*     */     //   150: invokevirtual cancel : ()V
/*     */     //   153: aload_3
/*     */     //   154: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Stopped : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   157: aload #14
/*     */     //   159: aload #14
/*     */     //   161: aload_0
/*     */     //   162: putfield L$0 : Ljava/lang/Object;
/*     */     //   165: aload #14
/*     */     //   167: aload_3
/*     */     //   168: putfield L$1 : Ljava/lang/Object;
/*     */     //   171: aload #14
/*     */     //   173: iconst_2
/*     */     //   174: putfield label : I
/*     */     //   177: invokevirtual updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   180: dup
/*     */     //   181: aload #15
/*     */     //   183: if_acmpne -> 214
/*     */     //   186: aload #15
/*     */     //   188: areturn
/*     */     //   189: aload #14
/*     */     //   191: getfield L$1 : Ljava/lang/Object;
/*     */     //   194: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   197: astore_3
/*     */     //   198: aload #14
/*     */     //   200: getfield L$0 : Ljava/lang/Object;
/*     */     //   203: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   206: astore_0
/*     */     //   207: aload #13
/*     */     //   209: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   212: aload #13
/*     */     //   214: pop
/*     */     //   215: aload_3
/*     */     //   216: invokevirtual getHumanInLoopRequest : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   219: aconst_null
/*     */     //   220: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   225: aload_0
/*     */     //   226: astore #4
/*     */     //   228: nop
/*     */     //   229: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   232: pop
/*     */     //   233: aload #4
/*     */     //   235: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   238: pop
/*     */     //   239: iconst_0
/*     */     //   240: istore #6
/*     */     //   242: aload_3
/*     */     //   243: invokevirtual getCurrentJob : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   246: astore #7
/*     */     //   248: iconst_0
/*     */     //   249: istore #8
/*     */     //   251: nop
/*     */     //   252: aload #7
/*     */     //   254: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   259: astore #9
/*     */     //   261: aload #9
/*     */     //   263: checkcast kotlinx/coroutines/Job
/*     */     //   266: pop
/*     */     //   267: iconst_0
/*     */     //   268: istore #11
/*     */     //   270: aconst_null
/*     */     //   271: astore #10
/*     */     //   273: aload #7
/*     */     //   275: aload #9
/*     */     //   277: aload #10
/*     */     //   279: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   284: ifeq -> 251
/*     */     //   287: aload #10
/*     */     //   289: astore #12
/*     */     //   291: nop
/*     */     //   292: aconst_null
/*     */     //   293: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   296: astore #5
/*     */     //   298: goto -> 317
/*     */     //   301: astore #6
/*     */     //   303: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   306: pop
/*     */     //   307: aload #6
/*     */     //   309: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */     //   312: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   315: astore #5
/*     */     //   317: aload_3
/*     */     //   318: invokevirtual getTasks : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   321: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   326: checkcast java/util/List
/*     */     //   329: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   332: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   335: astore #4
/*     */     //   337: aload #4
/*     */     //   339: invokevirtual getFinishedSignal : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   342: aload #14
/*     */     //   344: aload #14
/*     */     //   346: aconst_null
/*     */     //   347: putfield L$0 : Ljava/lang/Object;
/*     */     //   350: aload #14
/*     */     //   352: aconst_null
/*     */     //   353: putfield L$1 : Ljava/lang/Object;
/*     */     //   356: aload #14
/*     */     //   358: iconst_3
/*     */     //   359: putfield label : I
/*     */     //   362: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   367: dup
/*     */     //   368: aload #15
/*     */     //   370: if_acmpne -> 383
/*     */     //   373: aload #15
/*     */     //   375: areturn
/*     */     //   376: aload #13
/*     */     //   378: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   381: aload #13
/*     */     //   383: pop
/*     */     //   384: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   387: areturn
/*     */     //   388: new java/lang/IllegalStateException
/*     */     //   391: dup
/*     */     //   392: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   395: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   398: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #257	-> 60
/*     */     //   #258	-> 101
/*     */     //   #257	-> 126
/*     */     //   #259	-> 149
/*     */     //   #260	-> 153
/*     */     //   #257	-> 186
/*     */     //   #261	-> 214
/*     */     //   #262	-> 225
/*     */     //   #263	-> 242
/*     */     //   #576	-> 251
/*     */     //   #577	-> 252
/*     */     //   #578	-> 261
/*     */     //   #263	-> 270
/*     */     //   #578	-> 271
/*     */     //   #579	-> 273
/*     */     //   #580	-> 287
/*     */     //   #263	-> 289
/*     */     //   #264	-> 291
/*     */     //   #262	-> 293
/*     */     //   #266	-> 317
/*     */     //   #267	-> 337
/*     */     //   #257	-> 373
/*     */     //   #268	-> 383
/*     */     //   #257	-> 388
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   138	51	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   207	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   101	19	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   149	40	3	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   198	95	3	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   293	24	3	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   317	20	3	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   337	30	4	taskSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   248	41	7	$this$updateAndGet$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   261	28	9	prevValue$iv	Ljava/lang/Object;
/*     */     //   273	16	10	nextValue$iv	Ljava/lang/Object;
/*     */     //   291	1	12	existingJob	Lkotlinx/coroutines/Job;
/*     */     //   270	1	11	$i$a$-updateAndGet-TaskServiceInternal$stop$2$existingJob$1	I
/*     */     //   251	38	8	$i$f$updateAndGet	I
/*     */     //   242	51	6	$i$a$-runCatching-TaskServiceInternal$stop$2	I
/*     */     //   0	399	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	338	14	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	331	13	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   228	298	301	java/lang/Throwable
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object declineStartingFrom(@NotNull TaskChainId chainId, @Nullable TaskId startingFrom, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$declineStartingFrom$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$declineStartingFrom$1
/*     */     //   11: astore #18
/*     */     //   13: aload #18
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #18
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$declineStartingFrom$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #18
/*     */     //   50: aload #18
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #17
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #19
/*     */     //   62: aload #18
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1055, 0 -> 100, 1 -> 139, 2 -> 763, 3 -> 874, 4 -> 984
/*     */     //   100: aload #17
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: aload_1
/*     */     //   107: aload #18
/*     */     //   109: aload #18
/*     */     //   111: aload_0
/*     */     //   112: putfield L$0 : Ljava/lang/Object;
/*     */     //   115: aload #18
/*     */     //   117: aload_2
/*     */     //   118: putfield L$1 : Ljava/lang/Object;
/*     */     //   121: aload #18
/*     */     //   123: iconst_1
/*     */     //   124: putfield label : I
/*     */     //   127: invokespecial requireTaskChainSnapshot : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   130: dup
/*     */     //   131: aload #19
/*     */     //   133: if_acmpne -> 164
/*     */     //   136: aload #19
/*     */     //   138: areturn
/*     */     //   139: aload #18
/*     */     //   141: getfield L$1 : Ljava/lang/Object;
/*     */     //   144: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   147: astore_2
/*     */     //   148: aload #18
/*     */     //   150: getfield L$0 : Ljava/lang/Object;
/*     */     //   153: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   156: astore_0
/*     */     //   157: aload #17
/*     */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   162: aload #17
/*     */     //   164: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   167: astore #4
/*     */     //   169: aload #4
/*     */     //   171: invokevirtual getChain : ()Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   174: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   179: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   182: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   185: astore #5
/*     */     //   187: aload #4
/*     */     //   189: invokevirtual getTasks : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   192: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   197: checkcast java/lang/Iterable
/*     */     //   200: astore #7
/*     */     //   202: iconst_0
/*     */     //   203: istore #8
/*     */     //   205: aload #7
/*     */     //   207: astore #9
/*     */     //   209: new java/util/ArrayList
/*     */     //   212: dup
/*     */     //   213: invokespecial <init> : ()V
/*     */     //   216: checkcast java/util/Collection
/*     */     //   219: astore #10
/*     */     //   221: iconst_0
/*     */     //   222: istore #11
/*     */     //   224: aload #9
/*     */     //   226: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   231: astore #12
/*     */     //   233: aload #12
/*     */     //   235: invokeinterface hasNext : ()Z
/*     */     //   240: ifeq -> 291
/*     */     //   243: aload #12
/*     */     //   245: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   250: astore #13
/*     */     //   252: aload #13
/*     */     //   254: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   257: astore #14
/*     */     //   259: iconst_0
/*     */     //   260: istore #15
/*     */     //   262: aload #14
/*     */     //   264: invokevirtual isDeclined : ()Z
/*     */     //   267: ifne -> 274
/*     */     //   270: iconst_1
/*     */     //   271: goto -> 275
/*     */     //   274: iconst_0
/*     */     //   275: ifeq -> 233
/*     */     //   278: aload #10
/*     */     //   280: aload #13
/*     */     //   282: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   287: pop
/*     */     //   288: goto -> 233
/*     */     //   291: aload #10
/*     */     //   293: checkcast java/util/List
/*     */     //   296: nop
/*     */     //   297: astore #6
/*     */     //   299: aload_2
/*     */     //   300: ifnonnull -> 309
/*     */     //   303: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   306: goto -> 408
/*     */     //   309: aload #6
/*     */     //   311: checkcast java/lang/Iterable
/*     */     //   314: astore #8
/*     */     //   316: iconst_0
/*     */     //   317: istore #9
/*     */     //   319: new java/util/ArrayList
/*     */     //   322: dup
/*     */     //   323: invokespecial <init> : ()V
/*     */     //   326: astore #10
/*     */     //   328: aload #8
/*     */     //   330: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   335: astore #11
/*     */     //   337: aload #11
/*     */     //   339: invokeinterface hasNext : ()Z
/*     */     //   344: ifeq -> 403
/*     */     //   347: aload #11
/*     */     //   349: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   354: astore #12
/*     */     //   356: aload #12
/*     */     //   358: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   361: astore #13
/*     */     //   363: iconst_0
/*     */     //   364: istore #14
/*     */     //   366: aload #13
/*     */     //   368: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   371: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   374: aload_2
/*     */     //   375: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   378: ifne -> 385
/*     */     //   381: iconst_1
/*     */     //   382: goto -> 386
/*     */     //   385: iconst_0
/*     */     //   386: ifne -> 392
/*     */     //   389: goto -> 403
/*     */     //   392: aload #10
/*     */     //   394: aload #12
/*     */     //   396: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   399: pop
/*     */     //   400: goto -> 337
/*     */     //   403: aload #10
/*     */     //   405: checkcast java/util/List
/*     */     //   408: astore #7
/*     */     //   410: aload_2
/*     */     //   411: ifnonnull -> 419
/*     */     //   414: aload #6
/*     */     //   416: goto -> 537
/*     */     //   419: aload #6
/*     */     //   421: checkcast java/lang/Iterable
/*     */     //   424: astore #9
/*     */     //   426: iconst_0
/*     */     //   427: istore #10
/*     */     //   429: iconst_0
/*     */     //   430: istore #11
/*     */     //   432: new java/util/ArrayList
/*     */     //   435: dup
/*     */     //   436: invokespecial <init> : ()V
/*     */     //   439: astore #12
/*     */     //   441: aload #9
/*     */     //   443: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   448: astore #13
/*     */     //   450: aload #13
/*     */     //   452: invokeinterface hasNext : ()Z
/*     */     //   457: ifeq -> 532
/*     */     //   460: aload #13
/*     */     //   462: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   467: astore #14
/*     */     //   469: iload #11
/*     */     //   471: ifeq -> 485
/*     */     //   474: aload #12
/*     */     //   476: aload #14
/*     */     //   478: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   481: pop
/*     */     //   482: goto -> 450
/*     */     //   485: aload #14
/*     */     //   487: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   490: astore #15
/*     */     //   492: iconst_0
/*     */     //   493: istore #16
/*     */     //   495: aload #15
/*     */     //   497: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   500: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   503: aload_2
/*     */     //   504: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   507: ifne -> 514
/*     */     //   510: iconst_1
/*     */     //   511: goto -> 515
/*     */     //   514: iconst_0
/*     */     //   515: ifne -> 450
/*     */     //   518: aload #12
/*     */     //   520: aload #14
/*     */     //   522: invokevirtual add : (Ljava/lang/Object;)Z
/*     */     //   525: pop
/*     */     //   526: iconst_1
/*     */     //   527: istore #11
/*     */     //   529: goto -> 450
/*     */     //   532: aload #12
/*     */     //   534: checkcast java/util/List
/*     */     //   537: astore #8
/*     */     //   539: aload #7
/*     */     //   541: invokeinterface size : ()I
/*     */     //   546: aload #8
/*     */     //   548: invokeinterface size : ()I
/*     */     //   553: iadd
/*     */     //   554: aload #6
/*     */     //   556: invokeinterface size : ()I
/*     */     //   561: if_icmpne -> 568
/*     */     //   564: iconst_1
/*     */     //   565: goto -> 569
/*     */     //   568: iconst_0
/*     */     //   569: istore #9
/*     */     //   571: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   574: ifeq -> 597
/*     */     //   577: iload #9
/*     */     //   579: ifne -> 597
/*     */     //   582: ldc_w 'Assertion failed'
/*     */     //   585: astore #10
/*     */     //   587: new java/lang/AssertionError
/*     */     //   590: dup
/*     */     //   591: aload #10
/*     */     //   593: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   596: athrow
/*     */     //   597: aload #7
/*     */     //   599: astore #10
/*     */     //   601: iconst_0
/*     */     //   602: istore #11
/*     */     //   604: aload #10
/*     */     //   606: aload #10
/*     */     //   608: invokeinterface size : ()I
/*     */     //   613: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*     */     //   618: astore #12
/*     */     //   620: aload #12
/*     */     //   622: invokeinterface hasPrevious : ()Z
/*     */     //   627: ifeq -> 670
/*     */     //   630: aload #12
/*     */     //   632: invokeinterface previous : ()Ljava/lang/Object;
/*     */     //   637: astore #13
/*     */     //   639: aload #13
/*     */     //   641: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   644: astore #14
/*     */     //   646: iconst_0
/*     */     //   647: istore #15
/*     */     //   649: aload #14
/*     */     //   651: invokevirtual isDeclined : ()Z
/*     */     //   654: ifne -> 661
/*     */     //   657: iconst_1
/*     */     //   658: goto -> 662
/*     */     //   661: iconst_0
/*     */     //   662: ifeq -> 620
/*     */     //   665: aload #13
/*     */     //   667: goto -> 671
/*     */     //   670: aconst_null
/*     */     //   671: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   674: astore #9
/*     */     //   676: aload #9
/*     */     //   678: ifnonnull -> 701
/*     */     //   681: aload #5
/*     */     //   683: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Finished : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   686: if_acmpne -> 695
/*     */     //   689: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Declined : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   692: goto -> 704
/*     */     //   695: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Failed : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   698: goto -> 704
/*     */     //   701: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Finished : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   704: astore #10
/*     */     //   706: aload #4
/*     */     //   708: aload #10
/*     */     //   710: aload #18
/*     */     //   712: aload #18
/*     */     //   714: aload_0
/*     */     //   715: putfield L$0 : Ljava/lang/Object;
/*     */     //   718: aload #18
/*     */     //   720: aload_2
/*     */     //   721: putfield L$1 : Ljava/lang/Object;
/*     */     //   724: aload #18
/*     */     //   726: aload #4
/*     */     //   728: putfield L$2 : Ljava/lang/Object;
/*     */     //   731: aload #18
/*     */     //   733: aload #7
/*     */     //   735: putfield L$3 : Ljava/lang/Object;
/*     */     //   738: aload #18
/*     */     //   740: aload #8
/*     */     //   742: putfield L$4 : Ljava/lang/Object;
/*     */     //   745: aload #18
/*     */     //   747: iconst_2
/*     */     //   748: putfield label : I
/*     */     //   751: invokevirtual updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   754: dup
/*     */     //   755: aload #19
/*     */     //   757: if_acmpne -> 818
/*     */     //   760: aload #19
/*     */     //   762: areturn
/*     */     //   763: aload #18
/*     */     //   765: getfield L$4 : Ljava/lang/Object;
/*     */     //   768: checkcast java/util/List
/*     */     //   771: astore #8
/*     */     //   773: aload #18
/*     */     //   775: getfield L$3 : Ljava/lang/Object;
/*     */     //   778: checkcast java/util/List
/*     */     //   781: astore #7
/*     */     //   783: aload #18
/*     */     //   785: getfield L$2 : Ljava/lang/Object;
/*     */     //   788: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   791: astore #4
/*     */     //   793: aload #18
/*     */     //   795: getfield L$1 : Ljava/lang/Object;
/*     */     //   798: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   801: astore_2
/*     */     //   802: aload #18
/*     */     //   804: getfield L$0 : Ljava/lang/Object;
/*     */     //   807: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   810: astore_0
/*     */     //   811: aload #17
/*     */     //   813: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   816: aload #17
/*     */     //   818: pop
/*     */     //   819: aload #4
/*     */     //   821: aload_2
/*     */     //   822: aload #18
/*     */     //   824: aload #18
/*     */     //   826: aload_0
/*     */     //   827: putfield L$0 : Ljava/lang/Object;
/*     */     //   830: aload #18
/*     */     //   832: aload #7
/*     */     //   834: putfield L$1 : Ljava/lang/Object;
/*     */     //   837: aload #18
/*     */     //   839: aload #8
/*     */     //   841: putfield L$2 : Ljava/lang/Object;
/*     */     //   844: aload #18
/*     */     //   846: aconst_null
/*     */     //   847: putfield L$3 : Ljava/lang/Object;
/*     */     //   850: aload #18
/*     */     //   852: aconst_null
/*     */     //   853: putfield L$4 : Ljava/lang/Object;
/*     */     //   856: aload #18
/*     */     //   858: iconst_3
/*     */     //   859: putfield label : I
/*     */     //   862: invokevirtual declineStartingFrom : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   865: dup
/*     */     //   866: aload #19
/*     */     //   868: if_acmpne -> 910
/*     */     //   871: aload #19
/*     */     //   873: areturn
/*     */     //   874: aload #18
/*     */     //   876: getfield L$2 : Ljava/lang/Object;
/*     */     //   879: checkcast java/util/List
/*     */     //   882: astore #8
/*     */     //   884: aload #18
/*     */     //   886: getfield L$1 : Ljava/lang/Object;
/*     */     //   889: checkcast java/util/List
/*     */     //   892: astore #7
/*     */     //   894: aload #18
/*     */     //   896: getfield L$0 : Ljava/lang/Object;
/*     */     //   899: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal
/*     */     //   902: astore_0
/*     */     //   903: aload #17
/*     */     //   905: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   908: aload #17
/*     */     //   910: pop
/*     */     //   911: aload_0
/*     */     //   912: aload #8
/*     */     //   914: invokespecial computeRollbackState : (Ljava/util/List;)Ljava/util/Map;
/*     */     //   917: astore #11
/*     */     //   919: getstatic com/intellij/history/LocalHistory.Companion : Lcom/intellij/history/LocalHistory$Companion;
/*     */     //   922: invokevirtual getInstance : ()Lcom/intellij/history/LocalHistory;
/*     */     //   925: ldc_w 'command.revert.name'
/*     */     //   928: iconst_0
/*     */     //   929: anewarray java/lang/Object
/*     */     //   932: invokestatic message : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   935: invokevirtual startAction : (Ljava/lang/String;)Lcom/intellij/history/LocalHistoryAction;
/*     */     //   938: astore #12
/*     */     //   940: nop
/*     */     //   941: aload_0
/*     */     //   942: aload #11
/*     */     //   944: aload #18
/*     */     //   946: aload #18
/*     */     //   948: aload #7
/*     */     //   950: putfield L$0 : Ljava/lang/Object;
/*     */     //   953: aload #18
/*     */     //   955: aload #12
/*     */     //   957: putfield L$1 : Ljava/lang/Object;
/*     */     //   960: aload #18
/*     */     //   962: aconst_null
/*     */     //   963: putfield L$2 : Ljava/lang/Object;
/*     */     //   966: aload #18
/*     */     //   968: iconst_4
/*     */     //   969: putfield label : I
/*     */     //   972: invokespecial applyFilesState : (Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   975: dup
/*     */     //   976: aload #19
/*     */     //   978: if_acmpne -> 1012
/*     */     //   981: aload #19
/*     */     //   983: areturn
/*     */     //   984: aload #18
/*     */     //   986: getfield L$1 : Ljava/lang/Object;
/*     */     //   989: checkcast com/intellij/history/LocalHistoryAction
/*     */     //   992: astore #12
/*     */     //   994: aload #18
/*     */     //   996: getfield L$0 : Ljava/lang/Object;
/*     */     //   999: checkcast java/util/List
/*     */     //   1002: astore #7
/*     */     //   1004: nop
/*     */     //   1005: aload #17
/*     */     //   1007: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1010: aload #17
/*     */     //   1012: pop
/*     */     //   1013: aload #12
/*     */     //   1015: invokeinterface finish : ()V
/*     */     //   1020: goto -> 1035
/*     */     //   1023: astore #13
/*     */     //   1025: aload #12
/*     */     //   1027: invokeinterface finish : ()V
/*     */     //   1032: aload #13
/*     */     //   1034: athrow
/*     */     //   1035: aload #7
/*     */     //   1037: invokeinterface isEmpty : ()Z
/*     */     //   1042: ifeq -> 1051
/*     */     //   1045: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus.NOTHING_LEFT : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;
/*     */     //   1048: goto -> 1054
/*     */     //   1051: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus.DONE : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$DeclineStatus;
/*     */     //   1054: areturn
/*     */     //   1055: new java/lang/IllegalStateException
/*     */     //   1058: dup
/*     */     //   1059: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1062: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1065: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #270	-> 60
/*     */     //   #271	-> 105
/*     */     //   #270	-> 136
/*     */     //   #272	-> 169
/*     */     //   #274	-> 187
/*     */     //   #581	-> 205
/*     */     //   #582	-> 224
/*     */     //   #274	-> 262
/*     */     //   #582	-> 275
/*     */     //   #583	-> 291
/*     */     //   #581	-> 296
/*     */     //   #274	-> 297
/*     */     //   #275	-> 299
/*     */     //   #276	-> 303
/*     */     //   #278	-> 309
/*     */     //   #584	-> 319
/*     */     //   #585	-> 328
/*     */     //   #586	-> 356
/*     */     //   #278	-> 366
/*     */     //   #586	-> 386
/*     */     //   #587	-> 389
/*     */     //   #588	-> 392
/*     */     //   #590	-> 403
/*     */     //   #275	-> 408
/*     */     //   #280	-> 410
/*     */     //   #281	-> 414
/*     */     //   #283	-> 419
/*     */     //   #591	-> 429
/*     */     //   #592	-> 432
/*     */     //   #593	-> 441
/*     */     //   #594	-> 469
/*     */     //   #595	-> 474
/*     */     //   #596	-> 485
/*     */     //   #283	-> 495
/*     */     //   #596	-> 515
/*     */     //   #597	-> 518
/*     */     //   #598	-> 526
/*     */     //   #600	-> 532
/*     */     //   #280	-> 537
/*     */     //   #285	-> 539
/*     */     //   #287	-> 597
/*     */     //   #601	-> 604
/*     */     //   #602	-> 620
/*     */     //   #603	-> 630
/*     */     //   #604	-> 639
/*     */     //   #287	-> 649
/*     */     //   #604	-> 662
/*     */     //   #606	-> 670
/*     */     //   #287	-> 671
/*     */     //   #289	-> 676
/*     */     //   #290	-> 681
/*     */     //   #292	-> 701
/*     */     //   #289	-> 704
/*     */     //   #295	-> 706
/*     */     //   #270	-> 760
/*     */     //   #296	-> 818
/*     */     //   #270	-> 871
/*     */     //   #298	-> 910
/*     */     //   #300	-> 919
/*     */     //   #301	-> 940
/*     */     //   #302	-> 941
/*     */     //   #270	-> 981
/*     */     //   #304	-> 1012
/*     */     //   #305	-> 1020
/*     */     //   #304	-> 1023
/*     */     //   #307	-> 1035
/*     */     //   #308	-> 1045
/*     */     //   #310	-> 1051
/*     */     //   #307	-> 1054
/*     */     //   #270	-> 1055
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   157	118	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   275	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   297	89	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   386	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   408	107	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   515	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   537	60	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   597	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   662	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   670	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   671	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   811	63	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   903	72	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   105	25	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   105	34	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   148	127	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   275	22	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   297	89	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   386	22	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   408	107	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   515	22	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   537	60	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   597	65	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   662	8	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   670	1	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   671	92	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   802	63	2	startingFrom	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   169	106	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   275	22	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   297	89	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   386	22	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   408	107	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   515	22	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   537	60	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   597	65	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   662	8	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   670	1	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   671	92	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   793	72	4	liveChain	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   187	88	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   275	22	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   297	89	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   386	22	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   408	107	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   515	22	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   537	60	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   597	65	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   662	8	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   670	1	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   671	24	5	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   299	87	6	allSnapshots	Ljava/util/List;
/*     */     //   386	22	6	allSnapshots	Ljava/util/List;
/*     */     //   408	107	6	allSnapshots	Ljava/util/List;
/*     */     //   515	22	6	allSnapshots	Ljava/util/List;
/*     */     //   537	31	6	allSnapshots	Ljava/util/List;
/*     */     //   202	19	7	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   410	105	7	toLive	Ljava/util/List;
/*     */     //   515	22	7	toLive	Ljava/util/List;
/*     */     //   537	60	7	toLive	Ljava/util/List;
/*     */     //   597	65	7	toLive	Ljava/util/List;
/*     */     //   662	8	7	toLive	Ljava/util/List;
/*     */     //   670	1	7	toLive	Ljava/util/List;
/*     */     //   671	92	7	toLive	Ljava/util/List;
/*     */     //   783	91	7	toLive	Ljava/util/List;
/*     */     //   894	90	7	toLive	Ljava/util/List;
/*     */     //   1004	19	7	toLive	Ljava/util/List;
/*     */     //   1035	10	7	toLive	Ljava/util/List;
/*     */     //   316	21	8	$this$takeWhile$iv	Ljava/lang/Iterable;
/*     */     //   539	58	8	toBeDeclined	Ljava/util/List;
/*     */     //   597	65	8	toBeDeclined	Ljava/util/List;
/*     */     //   662	8	8	toBeDeclined	Ljava/util/List;
/*     */     //   670	1	8	toBeDeclined	Ljava/util/List;
/*     */     //   671	92	8	toBeDeclined	Ljava/util/List;
/*     */     //   773	101	8	toBeDeclined	Ljava/util/List;
/*     */     //   884	35	8	toBeDeclined	Ljava/util/List;
/*     */     //   221	12	9	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   426	24	9	$this$dropWhile$iv	Ljava/lang/Iterable;
/*     */     //   676	5	9	lastToLive	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   221	72	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   328	58	10	list$iv	Ljava/util/ArrayList;
/*     */     //   386	22	10	list$iv	Ljava/util/ArrayList;
/*     */     //   601	19	10	$this$lastOrNull$iv	Ljava/util/List;
/*     */     //   706	48	10	newState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   432	105	11	yielding$iv	Z
/*     */     //   919	56	11	rollbackState	Ljava/util/Map;
/*     */     //   356	44	12	item$iv	Ljava/lang/Object;
/*     */     //   441	96	12	list$iv	Ljava/util/ArrayList;
/*     */     //   620	51	12	iterator$iv	Ljava/util/ListIterator;
/*     */     //   940	44	12	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   994	26	12	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   1023	9	12	localHistoryAction	Lcom/intellij/history/LocalHistoryAction;
/*     */     //   252	36	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   363	22	13	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   639	31	13	element$iv	Ljava/lang/Object;
/*     */     //   259	15	14	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   469	16	14	item$iv	Ljava/lang/Object;
/*     */     //   485	44	14	item$iv	Ljava/lang/Object;
/*     */     //   646	15	14	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   492	22	15	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   262	13	15	$i$a$-filter-TaskServiceInternal$declineStartingFrom$allSnapshots$1	I
/*     */     //   224	69	11	$i$f$filterTo	I
/*     */     //   205	92	8	$i$f$filter	I
/*     */     //   366	20	14	$i$a$-takeWhile-TaskServiceInternal$declineStartingFrom$toLive$1	I
/*     */     //   319	89	9	$i$f$takeWhile	I
/*     */     //   495	20	16	$i$a$-dropWhile-TaskServiceInternal$declineStartingFrom$toBeDeclined$1	I
/*     */     //   429	108	10	$i$f$dropWhile	I
/*     */     //   649	13	15	$i$a$-lastOrNull-TaskServiceInternal$declineStartingFrom$lastToLive$1	I
/*     */     //   604	67	11	$i$f$lastOrNull	I
/*     */     //   0	1066	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1005	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	998	17	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   940	975	1023	finally
/*     */     //   1004	1013	1023	finally
/*     */     //   1023	1025	1023	finally
/*     */   }
/*     */   
/*     */   private final Map<Path, String> computeRollbackState(List snapshots) {
/*     */     Sequence<StepEntity> steps = SequencesKt.flatMapIterable(SequencesKt.filter(CollectionsKt.asSequence(snapshots), TaskServiceInternal::computeRollbackState$lambda$18), TaskServiceInternal::computeRollbackState$lambda$19);
/*     */     return RollbackHelper.INSTANCE.computeRollbackState(steps);
/*     */   }
/*     */   
/*     */   private static final boolean computeRollbackState$lambda$18(LiveTaskSnapshot it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return !it.isDeclined();
/*     */   }
/*     */   
/*     */   private static final Iterable computeRollbackState$lambda$19(LiveTaskSnapshot it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return (Iterable)it.getSteps();
/*     */   }
/*     */   
/*     */   private final Object applyFilesState(Map<Path, String> fileContents, Continuation<? super Unit> $completion) {
/*     */     if (RollbackHelper.INSTANCE.applyFilesState(this.project, fileContents, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return RollbackHelper.INSTANCE.applyFilesState(this.project, fileContents, $completion); 
/*     */     RollbackHelper.INSTANCE.applyFilesState(this.project, fileContents, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object done(@NotNull TaskChainId chainId, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$done$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$done$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$done$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 166, 0 -> 92, 1 -> 119, 2 -> 154
/*     */     //   92: aload #4
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: aload #5
/*     */     //   101: aload #5
/*     */     //   103: iconst_1
/*     */     //   104: putfield label : I
/*     */     //   107: invokespecial requireTaskChainSnapshot : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   110: dup
/*     */     //   111: aload #6
/*     */     //   113: if_acmpne -> 126
/*     */     //   116: aload #6
/*     */     //   118: areturn
/*     */     //   119: aload #4
/*     */     //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   124: aload #4
/*     */     //   126: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   129: astore_3
/*     */     //   130: aload_3
/*     */     //   131: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Done : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   134: aload #5
/*     */     //   136: aload #5
/*     */     //   138: iconst_2
/*     */     //   139: putfield label : I
/*     */     //   142: invokevirtual updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   145: dup
/*     */     //   146: aload #6
/*     */     //   148: if_acmpne -> 161
/*     */     //   151: aload #6
/*     */     //   153: areturn
/*     */     //   154: aload #4
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #4
/*     */     //   161: pop
/*     */     //   162: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   165: areturn
/*     */     //   166: new java/lang/IllegalStateException
/*     */     //   169: dup
/*     */     //   170: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   173: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   176: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #327	-> 60
/*     */     //   #328	-> 97
/*     */     //   #327	-> 116
/*     */     //   #329	-> 130
/*     */     //   #327	-> 151
/*     */     //   #330	-> 161
/*     */     //   #327	-> 166
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   97	13	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   130	15	3	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   0	177	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	116	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	109	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object continueTask(@NotNull TaskChainId chainId, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$continueTask$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$continueTask$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal$continueTask$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 166, 0 -> 92, 1 -> 119, 2 -> 154
/*     */     //   92: aload #4
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_1
/*     */     //   99: aload #5
/*     */     //   101: aload #5
/*     */     //   103: iconst_1
/*     */     //   104: putfield label : I
/*     */     //   107: invokespecial requireTaskChainSnapshot : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   110: dup
/*     */     //   111: aload #6
/*     */     //   113: if_acmpne -> 126
/*     */     //   116: aload #6
/*     */     //   118: areturn
/*     */     //   119: aload #4
/*     */     //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   124: aload #4
/*     */     //   126: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   129: astore_3
/*     */     //   130: aload_3
/*     */     //   131: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   134: aload #5
/*     */     //   136: aload #5
/*     */     //   138: iconst_2
/*     */     //   139: putfield label : I
/*     */     //   142: invokevirtual updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   145: dup
/*     */     //   146: aload #6
/*     */     //   148: if_acmpne -> 161
/*     */     //   151: aload #6
/*     */     //   153: areturn
/*     */     //   154: aload #4
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #4
/*     */     //   161: pop
/*     */     //   162: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   165: areturn
/*     */     //   166: new java/lang/IllegalStateException
/*     */     //   169: dup
/*     */     //   170: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   173: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   176: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #332	-> 60
/*     */     //   #333	-> 97
/*     */     //   #332	-> 116
/*     */     //   #334	-> 130
/*     */     //   #332	-> 151
/*     */     //   #335	-> 161
/*     */     //   #332	-> 166
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskServiceInternal;
/*     */     //   97	13	1	chainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   130	15	3	chainSnapshot	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   0	177	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	116	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	109	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {333, 334}, i = {}, s = {}, n = {}, m = "continueTask", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskServiceInternal$continueTask$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$continueTask$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskServiceInternal.this.continueTask(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {144}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "newTaskChain", "chainSnapshot"}, m = "createNewTaskChain", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskServiceInternal$createNewTaskChain$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$createNewTaskChain$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskServiceInternal.this.createNewTaskChain(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {271, 295, 296, 302}, i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "startingFrom", "this", "startingFrom", "liveChain", "toLive", "toBeDeclined", "this", "toLive", "toBeDeclined", "toLive", "localHistoryAction"}, m = "declineStartingFrom", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskServiceInternal$declineStartingFrom$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$declineStartingFrom$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskServiceInternal.this.declineStartingFrom(null, null, (Continuation<? super TaskService.DeclineStatus>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {328, 329}, i = {}, s = {}, n = {}, m = "done", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskServiceInternal$done$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$done$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskServiceInternal.this.done(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {530, 68, 69, 71, 76, 555, 104, 565}, i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7, 7, 7}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "taskChainId", "onAbsent", "$this$withLock_u24default$iv", "this", "taskChainId", "onAbsent", "this", "taskChainId", "onAbsent", "existingTaskChainEntity", "this", "taskChainId", "onAbsent", "existingTaskChainEntity", "destination$iv$iv", "taskId", "this", "taskChainId", "onAbsent", "existingTaskChainEntity", "destination$iv$iv", "loadedTask", "this", "taskChainId", "liveChain", "$this$withLock_u24default$iv", "this", "taskChainId", "this", "taskChainId", "chainSnapshot", "$this$withLock_u24default$iv"}, m = "getTaskChainSnapshotOr", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskServiceInternal$getTaskChainSnapshotOr$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$getTaskChainSnapshotOr$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskServiceInternal.this.getTaskChainSnapshotOr(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {154, 158, 190, 192}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"this", "chainId", "context", "previousTasksInfo", "this", "chainId", "context", "previousTasksInfo", "liveTaskChain", "this", "chainId", "liveTaskChain", "taskSnapshot", "promptStep", "this", "chainId", "liveTaskChain", "taskSnapshot", "taskId"}, m = "start", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskServiceInternal$start$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$start$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskServiceInternal.this.start(null, null, null, (Continuation<? super TaskId>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {258, 260, 267}, i = {0, 1, 1}, s = {"L$0", "L$0", "L$1"}, n = {"this", "this", "chainSnapshot"}, m = "stop", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.TaskServiceInternal")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class TaskServiceInternal$stop$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     TaskServiceInternal$stop$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return TaskServiceInternal.this.stop(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\TaskServiceInternal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */