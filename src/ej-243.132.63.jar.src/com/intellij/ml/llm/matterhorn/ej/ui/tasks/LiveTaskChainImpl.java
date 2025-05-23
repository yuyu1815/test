/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.collaboration.async.CoroutineUtilKt;
/*     */ import com.intellij.history.LocalHistory;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.JunieActivityKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskChain;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TerminalState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorage;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\t\b\002\030\0002\0020\001Bi\022\f\020\002\032\b\022\004\022\0020\0040\003\022\022\020\005\032\016\022\n\022\b\022\004\022\0020\0070\0060\003\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\016\020\f\032\n\022\006\022\004\030\0010\r0\003\022\016\020\016\032\n\022\006\022\004\030\0010\0170\003\022\016\020\020\032\n\022\006\022\004\030\0010\0210\003¢\006\004\b\022\020\023J\026\020!\032\0020\"2\006\020#\032\0020$H@¢\006\002\020%J\016\020&\032\0020\"H@¢\006\002\020'J\006\020(\032\0020\"J\016\020)\032\0020\"2\006\020*\032\0020\rJ\030\020+\032\0020\"2\b\020,\032\004\030\0010-H@¢\006\002\020.J\026\020/\032\0020\"2\006\0200\032\00201H@¢\006\002\0202J\030\0203\032\0020\"2\b\0204\032\004\030\00101H@¢\006\002\0202J\026\0205\032\0020\"2\006\0206\032\0020\033H@¢\006\002\0207J\020\0208\032\0020\"2\006\0209\032\00201H\002R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R \020\005\032\016\022\n\022\b\022\004\022\0020\0070\0060\003X\004¢\006\b\n\000\032\004\b\024\020\025R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\034\020\f\032\n\022\006\022\004\030\0010\r0\003X\004¢\006\b\n\000\032\004\b\026\020\025R\034\020\016\032\n\022\006\022\004\030\0010\0170\003X\004¢\006\b\n\000\032\004\b\027\020\025R\034\020\020\032\n\022\006\022\004\030\0010\0210\003X\004¢\006\b\n\000\032\004\b\030\020\025R\032\020\031\032\b\022\004\022\0020\0330\032X\004¢\006\b\n\000\032\004\b\034\020\035R\032\020\036\032\b\022\004\022\0020\0370\003X\004¢\006\b\n\000\032\004\b \020\025¨\006:"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskChain;", "chainData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData;", "tasks", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "project", "Lcom/intellij/openapi/project/Project;", "storage", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "currentJob", "Lkotlinx/coroutines/Job;", "humanInLoopRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getTasks", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getCurrentJob", "getHumanInLoopRequest", "getProgress", "chain", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "getChain", "()Lkotlinx/coroutines/flow/StateFlow;", "terminalState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TerminalState;", "getTerminalState", "updateState", "", "newState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "complete", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "setJob", "job", "declineStartingFrom", "firstDeclinedId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateName", "newName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateErrorText", "errorText", "update", "newTaskChain", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putLocalHistoryLabel", "name", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nTaskServiceInternal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskServiceInternal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,525:1\n194#2,5:526\n226#2,5:535\n226#2,5:540\n226#2,3:545\n229#2,2:549\n194#2,5:551\n194#2,5:556\n31#3,2:531\n31#3,2:533\n24#4:548\n*S KotlinDebug\n*F\n+ 1 TaskServiceInternal.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl\n*L\n435#1:526,5\n458#1:535,5\n466#1:540,5\n473#1:545,3\n473#1:549,2\n498#1:551,5\n505#1:556,5\n437#1:531,2\n448#1:533,2\n489#1:548\n*E\n"})
/*     */ final class LiveTaskChainImpl
/*     */   implements LiveTaskChain
/*     */ {
/*     */   @NotNull
/*     */   private final MutableStateFlow<ChainData> chainData;
/*     */   @NotNull
/*     */   private final MutableStateFlow<PersistentList<LiveTaskSnapshot>> tasks;
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final TaskStorage storage;
/*     */   @NotNull
/*     */   private final MutableStateFlow<Job> currentJob;
/*     */   @NotNull
/*     */   private final MutableStateFlow<HumanInLoopRequest> humanInLoopRequest;
/*     */   @NotNull
/*     */   private final MutableStateFlow<ProgressEntity> progress;
/*     */   @NotNull
/*     */   private final StateFlow<TaskChainEntity> chain;
/*     */   @NotNull
/*     */   private final MutableStateFlow<TerminalState> terminalState;
/*     */   
/*     */   @NotNull
/*     */   public MutableStateFlow<PersistentList<LiveTaskSnapshot>> getTasks() {
/*     */     return this.tasks;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public MutableStateFlow<Job> getCurrentJob() {
/*     */     return this.currentJob;
/*     */   }
/*     */   
/*     */   public LiveTaskChainImpl(@NotNull MutableStateFlow<ChainData> chainData, @NotNull MutableStateFlow<PersistentList<LiveTaskSnapshot>> tasks, @NotNull Project project, @NotNull TaskStorage storage, @NotNull MutableStateFlow<Job> currentJob, @NotNull MutableStateFlow<HumanInLoopRequest> humanInLoopRequest, @NotNull MutableStateFlow<ProgressEntity> progress) {
/* 423 */     this.chainData = chainData;
/* 424 */     this.tasks = tasks;
/* 425 */     this.project = project;
/* 426 */     this.storage = storage;
/* 427 */     this.currentJob = currentJob;
/* 428 */     this.humanInLoopRequest = humanInLoopRequest;
/* 429 */     this.progress = progress;
/*     */     
/* 431 */     this.chain = CoroutineUtilKt.mapState((StateFlow)this.chainData, LiveTaskChainImpl::chain$lambda$0);
/* 432 */     this.terminalState = StateFlowKt.MutableStateFlow(TerminalState.NotAvailable.INSTANCE); } @NotNull public MutableStateFlow<HumanInLoopRequest> getHumanInLoopRequest() { return this.humanInLoopRequest; } @NotNull public MutableStateFlow<TerminalState> getTerminalState() { return this.terminalState; }
/*     */   
/*     */   @NotNull
/*     */   public MutableStateFlow<ProgressEntity> getProgress() {
/*     */     return this.progress;
/*     */   }
/*     */   @NotNull
/*     */   public StateFlow<TaskChainEntity> getChain() {
/*     */     return this.chain;
/*     */   }
/*     */   private static final TaskChainEntity chain$lambda$0(ChainData it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getChainEntity();
/*     */   }
/*     */   @Nullable
/*     */   public final Object updateState(@NotNull TaskChainState newState, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$updateState$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$updateState$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #10
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$updateState$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 327, 0 -> 88, 1 -> 261
/*     */     //   88: aload #9
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield chainData : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   97: astore #4
/*     */     //   99: iconst_0
/*     */     //   100: istore #5
/*     */     //   102: nop
/*     */     //   103: aload #4
/*     */     //   105: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   110: astore #6
/*     */     //   112: aload #6
/*     */     //   114: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData
/*     */     //   117: astore #7
/*     */     //   119: iconst_0
/*     */     //   120: istore #8
/*     */     //   122: aload #7
/*     */     //   124: aconst_null
/*     */     //   125: aload #7
/*     */     //   127: invokevirtual getChainEntity : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   130: aconst_null
/*     */     //   131: aconst_null
/*     */     //   132: aconst_null
/*     */     //   133: aload_1
/*     */     //   134: aconst_null
/*     */     //   135: bipush #23
/*     */     //   137: aconst_null
/*     */     //   138: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Ljava/lang/String;Lkotlinx/datetime/Instant;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   141: iconst_1
/*     */     //   142: aconst_null
/*     */     //   143: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData;Lkotlinx/coroutines/Job;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData;
/*     */     //   146: astore #7
/*     */     //   148: aload #4
/*     */     //   150: aload #6
/*     */     //   152: aload #7
/*     */     //   154: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   159: ifeq -> 102
/*     */     //   162: aload #7
/*     */     //   164: astore_3
/*     */     //   165: aload_1
/*     */     //   166: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingUserInput : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   169: if_acmpne -> 219
/*     */     //   172: aload_0
/*     */     //   173: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   176: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   179: astore #4
/*     */     //   181: iconst_0
/*     */     //   182: istore #5
/*     */     //   184: ldc com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService
/*     */     //   186: astore #6
/*     */     //   188: aload #4
/*     */     //   190: aload #6
/*     */     //   192: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   197: dup
/*     */     //   198: ifnonnull -> 210
/*     */     //   201: pop
/*     */     //   202: aload #4
/*     */     //   204: aload #6
/*     */     //   206: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   209: athrow
/*     */     //   210: checkcast com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService
/*     */     //   213: getstatic com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType.REQUIRE_HUMAN : Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;
/*     */     //   216: invokevirtual sendUserNotification : (Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;)V
/*     */     //   219: aload_0
/*     */     //   220: getfield storage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   223: aload_3
/*     */     //   224: invokevirtual getChainEntity : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   227: aload #10
/*     */     //   229: aload #10
/*     */     //   231: aload_0
/*     */     //   232: putfield L$0 : Ljava/lang/Object;
/*     */     //   235: aload #10
/*     */     //   237: aload_3
/*     */     //   238: putfield L$1 : Ljava/lang/Object;
/*     */     //   241: aload #10
/*     */     //   243: iconst_1
/*     */     //   244: putfield label : I
/*     */     //   247: invokeinterface saveChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   252: dup
/*     */     //   253: aload #11
/*     */     //   255: if_acmpne -> 286
/*     */     //   258: aload #11
/*     */     //   260: areturn
/*     */     //   261: aload #10
/*     */     //   263: getfield L$1 : Ljava/lang/Object;
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData
/*     */     //   269: astore_3
/*     */     //   270: aload #10
/*     */     //   272: getfield L$0 : Ljava/lang/Object;
/*     */     //   275: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   278: astore_0
/*     */     //   279: aload #9
/*     */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   284: aload #9
/*     */     //   286: pop
/*     */     //   287: aload_0
/*     */     //   288: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   291: invokeinterface getMessageBus : ()Lcom/intellij/util/messages/MessageBus;
/*     */     //   296: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion;
/*     */     //   299: invokevirtual getTOPIC : ()Lcom/intellij/util/messages/Topic;
/*     */     //   302: invokeinterface syncPublisher : (Lcom/intellij/util/messages/Topic;)Ljava/lang/Object;
/*     */     //   307: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainListener
/*     */     //   310: aload_0
/*     */     //   311: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   314: aload_3
/*     */     //   315: invokevirtual getChainEntity : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   318: invokeinterface onTaskChainUpdated : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;)V
/*     */     //   323: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   326: areturn
/*     */     //   327: new java/lang/IllegalStateException
/*     */     //   330: dup
/*     */     //   331: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   333: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   336: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #434	-> 60
/*     */     //   #435	-> 93
/*     */     //   #526	-> 102
/*     */     //   #527	-> 103
/*     */     //   #528	-> 112
/*     */     //   #435	-> 122
/*     */     //   #528	-> 146
/*     */     //   #529	-> 148
/*     */     //   #530	-> 162
/*     */     //   #435	-> 164
/*     */     //   #436	-> 165
/*     */     //   #437	-> 172
/*     */     //   #531	-> 184
/*     */     //   #532	-> 188
/*     */     //   #438	-> 213
/*     */     //   #440	-> 219
/*     */     //   #434	-> 258
/*     */     //   #441	-> 286
/*     */     //   #442	-> 323
/*     */     //   #434	-> 327
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	53	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   146	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   164	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   210	51	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   279	48	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   93	53	1	newState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   146	18	1	newState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   164	8	1	newState	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   165	45	3	newChainData	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData;
/*     */     //   210	51	3	newChainData	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData;
/*     */     //   270	57	3	newChainData	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData;
/*     */     //   99	65	4	$this$updateAndGet$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   181	29	4	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   112	52	6	prevValue$iv	Ljava/lang/Object;
/*     */     //   188	22	6	serviceClass$iv	Ljava/lang/Class;
/*     */     //   119	27	7	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData;
/*     */     //   148	16	7	nextValue$iv	Ljava/lang/Object;
/*     */     //   122	24	8	$i$a$-updateAndGet-LiveTaskChainImpl$updateState$newChainData$1	I
/*     */     //   102	62	5	$i$f$updateAndGet	I
/*     */     //   184	26	5	$i$f$service	I
/*     */     //   0	337	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	277	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	270	9	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object complete(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$complete$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$complete$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$complete$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 255, 0 -> 88, 1 -> 147
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield chainData : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   97: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   102: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData
/*     */     //   105: invokevirtual getChainEntity : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   108: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   111: invokevirtual isTerminal : ()Z
/*     */     //   114: ifne -> 164
/*     */     //   117: aload_0
/*     */     //   118: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Finished : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   121: aload #7
/*     */     //   123: aload #7
/*     */     //   125: aload_0
/*     */     //   126: putfield L$0 : Ljava/lang/Object;
/*     */     //   129: aload #7
/*     */     //   131: iconst_1
/*     */     //   132: putfield label : I
/*     */     //   135: invokevirtual updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   138: dup
/*     */     //   139: aload #8
/*     */     //   141: if_acmpne -> 163
/*     */     //   144: aload #8
/*     */     //   146: areturn
/*     */     //   147: aload #7
/*     */     //   149: getfield L$0 : Ljava/lang/Object;
/*     */     //   152: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   155: astore_0
/*     */     //   156: aload #6
/*     */     //   158: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   161: aload #6
/*     */     //   163: pop
/*     */     //   164: aload_0
/*     */     //   165: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   168: checkcast com/intellij/openapi/components/ComponentManager
/*     */     //   171: astore_2
/*     */     //   172: iconst_0
/*     */     //   173: istore_3
/*     */     //   174: ldc com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService
/*     */     //   176: astore #4
/*     */     //   178: aload_2
/*     */     //   179: aload #4
/*     */     //   181: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   186: dup
/*     */     //   187: ifnonnull -> 198
/*     */     //   190: pop
/*     */     //   191: aload_2
/*     */     //   192: aload #4
/*     */     //   194: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */     //   197: athrow
/*     */     //   198: checkcast com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService
/*     */     //   201: getstatic com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType.TASK_FINISHED : Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;
/*     */     //   204: invokevirtual sendUserNotification : (Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;)V
/*     */     //   207: aload_0
/*     */     //   208: getfield chainData : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   211: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   216: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/ChainData
/*     */     //   219: invokevirtual getChainEntity : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   222: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   225: dup
/*     */     //   226: ifnull -> 249
/*     */     //   229: astore #4
/*     */     //   231: iconst_0
/*     */     //   232: istore #5
/*     */     //   234: aload_0
/*     */     //   235: aload #4
/*     */     //   237: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   242: invokespecial putLocalHistoryLabel : (Ljava/lang/String;)V
/*     */     //   245: nop
/*     */     //   246: goto -> 251
/*     */     //   249: pop
/*     */     //   250: nop
/*     */     //   251: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   254: areturn
/*     */     //   255: new java/lang/IllegalStateException
/*     */     //   258: dup
/*     */     //   259: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   261: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   264: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #444	-> 60
/*     */     //   #445	-> 93
/*     */     //   #446	-> 117
/*     */     //   #444	-> 144
/*     */     //   #448	-> 163
/*     */     //   #533	-> 174
/*     */     //   #534	-> 178
/*     */     //   #449	-> 201
/*     */     //   #451	-> 207
/*     */     //   #452	-> 234
/*     */     //   #453	-> 245
/*     */     //   #451	-> 246
/*     */     //   #451	-> 249
/*     */     //   #454	-> 251
/*     */     //   #444	-> 255
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	54	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   156	42	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   198	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   172	26	2	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */     //   178	20	4	serviceClass$iv	Ljava/lang/Class;
/*     */     //   231	15	4	name	Ljava/lang/String;
/*     */     //   174	24	3	$i$f$service	I
/*     */     //   234	12	5	$i$a$-let-LiveTaskChainImpl$complete$2	I
/*     */     //   0	265	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	205	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	198	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   public final void cancel() {
/* 457 */     if (((ChainData)this.chainData.getValue()).getJob() != null) { Job.DefaultImpls.cancel$default(((ChainData)this.chainData.getValue()).getJob(), null, 1, null); } else { ((ChainData)this.chainData.getValue()).getJob(); }
/* 458 */      MutableStateFlow<ChainData> $this$update$iv = this.chainData; int $i$f$update = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     while (true) {
/* 536 */       Object prevValue$iv = $this$update$iv.getValue();
/* 537 */       ChainData it = (ChainData)prevValue$iv; int $i$a$-update-LiveTaskChainImpl$cancel$1 = 0; Object nextValue$iv = ChainData.copy$default(it, null, null, 2, null);
/* 538 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv)) { String name = ((ChainData)this.chainData.getValue()).getChainEntity().getName(); int $i$a$-let-LiveTaskChainImpl$cancel$2 = 0; putLocalHistoryLabel("Junie Task Canceled: " + name); ((ChainData)this.chainData.getValue()).getChainEntity().getName(); }
/*     */     
/*     */     }  } public final void setJob(@NotNull Job job) { Intrinsics.checkNotNullParameter(job, "job"); MutableStateFlow<ChainData> $this$update$iv = this.chainData; int $i$f$update = 0; while (true) {
/* 541 */       Object prevValue$iv = $this$update$iv.getValue();
/* 542 */       ChainData it = (ChainData)prevValue$iv; int $i$a$-update-LiveTaskChainImpl$setJob$1 = 0; Object nextValue$iv = ChainData.copy$default(it, job, null, 2, null);
/* 543 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */         return; 
/*     */     }  } @Nullable
/*     */   public final Object declineStartingFrom(@Nullable TaskId firstDeclinedId, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$declineStartingFrom$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$declineStartingFrom$1
/*     */     //   11: astore #15
/*     */     //   13: aload #15
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #15
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$declineStartingFrom$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #15
/*     */     //   50: aload #15
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #14
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #16
/*     */     //   62: aload #15
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 483, 0 -> 88, 1 -> 315
/*     */     //   88: aload #14
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokevirtual getTasks : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   97: astore_3
/*     */     //   98: iconst_0
/*     */     //   99: istore #4
/*     */     //   101: nop
/*     */     //   102: aload_3
/*     */     //   103: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   108: astore #5
/*     */     //   110: aload #5
/*     */     //   112: checkcast kotlinx/collections/immutable/PersistentList
/*     */     //   115: astore #6
/*     */     //   117: iconst_0
/*     */     //   118: istore #7
/*     */     //   120: new java/util/ArrayList
/*     */     //   123: dup
/*     */     //   124: invokespecial <init> : ()V
/*     */     //   127: checkcast java/util/List
/*     */     //   130: astore #8
/*     */     //   132: aload_1
/*     */     //   133: ifnonnull -> 140
/*     */     //   136: iconst_1
/*     */     //   137: goto -> 141
/*     */     //   140: iconst_0
/*     */     //   141: istore #9
/*     */     //   143: aload #6
/*     */     //   145: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   150: astore #10
/*     */     //   152: aload #10
/*     */     //   154: invokeinterface hasNext : ()Z
/*     */     //   159: ifeq -> 425
/*     */     //   162: aload #10
/*     */     //   164: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   172: astore #11
/*     */     //   174: iload #9
/*     */     //   176: ifne -> 194
/*     */     //   179: aload #11
/*     */     //   181: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   184: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   187: aload_1
/*     */     //   188: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   191: ifeq -> 198
/*     */     //   194: iconst_1
/*     */     //   195: goto -> 199
/*     */     //   198: iconst_0
/*     */     //   199: istore #9
/*     */     //   201: iload #9
/*     */     //   203: ifeq -> 412
/*     */     //   206: aload #11
/*     */     //   208: invokevirtual withDeclined : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   211: astore #12
/*     */     //   213: aload #11
/*     */     //   215: invokevirtual isDeclined : ()Z
/*     */     //   218: aload #12
/*     */     //   220: invokevirtual isDeclined : ()Z
/*     */     //   223: if_icmpeq -> 400
/*     */     //   226: aload_0
/*     */     //   227: getfield storage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   230: aload #12
/*     */     //   232: invokevirtual getTaskChainId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   235: aload #12
/*     */     //   237: invokevirtual getTask : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   240: aload #15
/*     */     //   242: aload #15
/*     */     //   244: aload_0
/*     */     //   245: putfield L$0 : Ljava/lang/Object;
/*     */     //   248: aload #15
/*     */     //   250: aload_1
/*     */     //   251: putfield L$1 : Ljava/lang/Object;
/*     */     //   254: aload #15
/*     */     //   256: aload_3
/*     */     //   257: putfield L$2 : Ljava/lang/Object;
/*     */     //   260: aload #15
/*     */     //   262: aload #5
/*     */     //   264: putfield L$3 : Ljava/lang/Object;
/*     */     //   267: aload #15
/*     */     //   269: aload #8
/*     */     //   271: putfield L$4 : Ljava/lang/Object;
/*     */     //   274: aload #15
/*     */     //   276: aload #10
/*     */     //   278: putfield L$5 : Ljava/lang/Object;
/*     */     //   281: aload #15
/*     */     //   283: aload #12
/*     */     //   285: putfield L$6 : Ljava/lang/Object;
/*     */     //   288: aload #15
/*     */     //   290: iload #9
/*     */     //   292: putfield I$0 : I
/*     */     //   295: aload #15
/*     */     //   297: iconst_1
/*     */     //   298: putfield label : I
/*     */     //   301: invokeinterface saveTask : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   306: dup
/*     */     //   307: aload #16
/*     */     //   309: if_acmpne -> 399
/*     */     //   312: aload #16
/*     */     //   314: areturn
/*     */     //   315: iconst_0
/*     */     //   316: istore #4
/*     */     //   318: iconst_0
/*     */     //   319: istore #7
/*     */     //   321: aload #15
/*     */     //   323: getfield I$0 : I
/*     */     //   326: istore #9
/*     */     //   328: aload #15
/*     */     //   330: getfield L$6 : Ljava/lang/Object;
/*     */     //   333: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   336: astore #12
/*     */     //   338: aload #15
/*     */     //   340: getfield L$5 : Ljava/lang/Object;
/*     */     //   343: checkcast java/util/Iterator
/*     */     //   346: astore #10
/*     */     //   348: aload #15
/*     */     //   350: getfield L$4 : Ljava/lang/Object;
/*     */     //   353: checkcast java/util/List
/*     */     //   356: astore #8
/*     */     //   358: aload #15
/*     */     //   360: getfield L$3 : Ljava/lang/Object;
/*     */     //   363: astore #5
/*     */     //   365: aload #15
/*     */     //   367: getfield L$2 : Ljava/lang/Object;
/*     */     //   370: checkcast kotlinx/coroutines/flow/MutableStateFlow
/*     */     //   373: astore_3
/*     */     //   374: aload #15
/*     */     //   376: getfield L$1 : Ljava/lang/Object;
/*     */     //   379: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   382: astore_1
/*     */     //   383: aload #15
/*     */     //   385: getfield L$0 : Ljava/lang/Object;
/*     */     //   388: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   391: astore_0
/*     */     //   392: aload #14
/*     */     //   394: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   397: aload #14
/*     */     //   399: pop
/*     */     //   400: aload #8
/*     */     //   402: aload #12
/*     */     //   404: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   409: goto -> 421
/*     */     //   412: aload #8
/*     */     //   414: aload #11
/*     */     //   416: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   421: pop
/*     */     //   422: goto -> 152
/*     */     //   425: iload #9
/*     */     //   427: ifne -> 455
/*     */     //   430: iconst_0
/*     */     //   431: istore #11
/*     */     //   433: ldc com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   435: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   438: dup
/*     */     //   439: ldc_w 'getInstance(...)'
/*     */     //   442: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   445: aload_0
/*     */     //   446: aload_1
/*     */     //   447: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)Ljava/lang/String;
/*     */     //   452: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   455: aload #8
/*     */     //   457: checkcast java/lang/Iterable
/*     */     //   460: invokestatic toPersistentList : (Ljava/lang/Iterable;)Lkotlinx/collections/immutable/PersistentList;
/*     */     //   463: astore #13
/*     */     //   465: aload_3
/*     */     //   466: aload #5
/*     */     //   468: aload #13
/*     */     //   470: invokeinterface compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   475: ifeq -> 101
/*     */     //   478: nop
/*     */     //   479: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   482: areturn
/*     */     //   483: new java/lang/IllegalStateException
/*     */     //   486: dup
/*     */     //   487: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   489: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   492: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #472	-> 60
/*     */     //   #473	-> 93
/*     */     //   #545	-> 101
/*     */     //   #546	-> 102
/*     */     //   #547	-> 110
/*     */     //   #474	-> 120
/*     */     //   #474	-> 130
/*     */     //   #475	-> 132
/*     */     //   #476	-> 143
/*     */     //   #477	-> 174
/*     */     //   #478	-> 201
/*     */     //   #479	-> 206
/*     */     //   #480	-> 213
/*     */     //   #481	-> 226
/*     */     //   #472	-> 312
/*     */     //   #483	-> 399
/*     */     //   #485	-> 412
/*     */     //   #488	-> 425
/*     */     //   #489	-> 430
/*     */     //   #548	-> 433
/*     */     //   #489	-> 445
/*     */     //   #491	-> 455
/*     */     //   #547	-> 463
/*     */     //   #549	-> 465
/*     */     //   #550	-> 478
/*     */     //   #493	-> 479
/*     */     //   #472	-> 483
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	222	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   392	91	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   93	222	1	firstDeclinedId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   383	100	1	firstDeclinedId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   98	217	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   374	105	3	$this$update$iv	Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   110	205	5	prevValue$iv	Ljava/lang/Object;
/*     */     //   365	114	5	prevValue$iv	Ljava/lang/Object;
/*     */     //   117	35	6	oldSnapshots	Lkotlinx/collections/immutable/PersistentList;
/*     */     //   132	183	8	result	Ljava/util/List;
/*     */     //   358	105	8	result	Ljava/util/List;
/*     */     //   143	51	9	declining	Z
/*     */     //   201	114	9	declining	Z
/*     */     //   328	102	9	declining	Z
/*     */     //   174	52	11	next	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   412	9	11	next	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   213	102	12	declinedTask	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   338	71	12	declinedTask	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   465	14	13	nextValue$iv	Ljava/lang/Object;
/*     */     //   433	12	11	$i$f$thisLogger	I
/*     */     //   120	195	7	$i$a$-update-LiveTaskChainImpl$declineStartingFrom$2	I
/*     */     //   101	214	4	$i$f$update	I
/*     */     //   0	493	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	433	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	426	14	$result	Ljava/lang/Object;
/*     */     //   321	142	7	$i$a$-update-LiveTaskChainImpl$declineStartingFrom$2	I
/*     */     //   318	161	4	$i$f$update	I }
/*     */   @Nullable
/*     */   public final Object updateName(@NotNull String newName, @NotNull Continuation $completion) { putLocalHistoryLabel("Junie Task Started: " + newName);
/*     */     MutableStateFlow<ChainData> $this$updateAndGet$iv = this.chainData;
/*     */     int $i$f$updateAndGet = 0;
/*     */     while (true) {
/* 552 */       Object prevValue$iv = $this$updateAndGet$iv.getValue();
/* 553 */       ChainData data = (ChainData)prevValue$iv; int $i$a$-updateAndGet-LiveTaskChainImpl$updateName$updatedData$1 = 0; Object nextValue$iv = ChainData.copy$default(data, null, TaskChainEntity.copy$default(data.getChainEntity(), null, newName, null, null, null, 29, null), 1, null);
/* 554 */       if ($this$updateAndGet$iv.compareAndSet(prevValue$iv, nextValue$iv))
/* 555 */         Object object = nextValue$iv; 
/*     */     }  } @Nullable public final Object updateErrorText(@Nullable String errorText, @NotNull Continuation $completion) { MutableStateFlow<ChainData> $this$updateAndGet$iv = this.chainData; int $i$f$updateAndGet = 0; while (true) {
/* 557 */       Object prevValue$iv = $this$updateAndGet$iv.getValue();
/* 558 */       ChainData data = (ChainData)prevValue$iv; int $i$a$-updateAndGet-LiveTaskChainImpl$updateErrorText$updatedData$1 = 0; Object nextValue$iv = ChainData.copy$default(data, null, TaskChainEntity.copy$default(data.getChainEntity(), null, null, null, null, errorText, 15, null), 1, null);
/* 559 */       if ($this$updateAndGet$iv.compareAndSet(prevValue$iv, nextValue$iv))
/* 560 */         Object object = nextValue$iv; 
/*     */     }  }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object update(@NotNull TaskChainEntity newTaskChain, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$update$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$update$1
/*     */     //   11: astore #4
/*     */     //   13: aload #4
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #4
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl$update$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore_3
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #5
/*     */     //   61: aload #4
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 192, 0 -> 88, 1 -> 131
/*     */     //   88: aload_3
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: aload_0
/*     */     //   93: getfield storage : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   96: aload_1
/*     */     //   97: aload #4
/*     */     //   99: aload #4
/*     */     //   101: aload_0
/*     */     //   102: putfield L$0 : Ljava/lang/Object;
/*     */     //   105: aload #4
/*     */     //   107: aload_1
/*     */     //   108: putfield L$1 : Ljava/lang/Object;
/*     */     //   111: aload #4
/*     */     //   113: iconst_1
/*     */     //   114: putfield label : I
/*     */     //   117: invokeinterface saveChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: aload #5
/*     */     //   125: if_acmpne -> 154
/*     */     //   128: aload #5
/*     */     //   130: areturn
/*     */     //   131: aload #4
/*     */     //   133: getfield L$1 : Ljava/lang/Object;
/*     */     //   136: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   139: astore_1
/*     */     //   140: aload #4
/*     */     //   142: getfield L$0 : Ljava/lang/Object;
/*     */     //   145: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl
/*     */     //   148: astore_0
/*     */     //   149: aload_3
/*     */     //   150: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   153: aload_3
/*     */     //   154: pop
/*     */     //   155: aload_0
/*     */     //   156: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   159: invokeinterface getMessageBus : ()Lcom/intellij/util/messages/MessageBus;
/*     */     //   164: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskService$Companion;
/*     */     //   167: invokevirtual getTOPIC : ()Lcom/intellij/util/messages/Topic;
/*     */     //   170: invokeinterface syncPublisher : (Lcom/intellij/util/messages/Topic;)Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainListener
/*     */     //   178: aload_0
/*     */     //   179: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   182: aload_1
/*     */     //   183: invokeinterface onTaskChainUpdated : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;)V
/*     */     //   188: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   191: areturn
/*     */     //   192: new java/lang/IllegalStateException
/*     */     //   195: dup
/*     */     //   196: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   198: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   201: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #511	-> 59
/*     */     //   #512	-> 92
/*     */     //   #511	-> 128
/*     */     //   #513	-> 154
/*     */     //   #514	-> 188
/*     */     //   #511	-> 192
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	39	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   149	43	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/LiveTaskChainImpl;
/*     */     //   92	39	1	newTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   140	52	1	newTaskChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   0	202	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	142	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	136	3	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final void putLocalHistoryLabel(String name) {
/*     */     LocalHistory.Companion.getInstance().putEventLabel(this.project, name, JunieActivityKt.getJunieActivityId());
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {446}, i = {0}, s = {"L$0"}, n = {"this"}, m = "complete", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.LiveTaskChainImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LiveTaskChainImpl$complete$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     LiveTaskChainImpl$complete$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LiveTaskChainImpl.this.complete((Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {481}, i = {0, 0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0"}, n = {"this", "firstDeclinedId", "$this$update$iv", "prevValue$iv", "result", "declinedTask", "declining"}, m = "declineStartingFrom", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.LiveTaskChainImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LiveTaskChainImpl$declineStartingFrom$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     LiveTaskChainImpl$declineStartingFrom$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LiveTaskChainImpl.this.declineStartingFrom(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {512}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "newTaskChain"}, m = "update", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.LiveTaskChainImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LiveTaskChainImpl$update$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LiveTaskChainImpl$update$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LiveTaskChainImpl.this.update(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskServiceInternal.kt", l = {440}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "newChainData"}, m = "updateState", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.LiveTaskChainImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class LiveTaskChainImpl$updateState$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     LiveTaskChainImpl$updateState$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return LiveTaskChainImpl.this.updateState(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\LiveTaskChainImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */