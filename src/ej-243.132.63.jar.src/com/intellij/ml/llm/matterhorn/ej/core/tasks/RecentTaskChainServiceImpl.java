/*     */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorage;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.util.messages.MessageBusConnection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.ExtensionsKt;
/*     */ import kotlinx.collections.immutable.ImmutableCollection;
/*     */ import kotlinx.collections.immutable.PersistentMap;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000n\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\006\030\0002\0020\0012\0020\002B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\034\020\022\032\020\022\f\022\n\022\004\022\0020\r\030\0010\0240\023H@¢\006\002\020\025J\026\020\026\032\0020\0272\006\020\030\032\0020\fH@¢\006\002\020\031J\016\020\032\032\0020\027H@¢\006\002\020\025J\026\020\033\032\b\022\004\022\0020\r0\034H@¢\006\004\b\035\020\025J*\020\036\032\b\022\004\022\0020\0370\0342\f\020 \032\b\022\004\022\0020\0370\0342\006\020!\032\0020\"H@¢\006\002\020#J\032\020$\032\0020%*\0020\0372\006\020!\032\0020\"H@¢\006\002\020&J\035\020'\032\0020\0272\006\020\030\032\0020\f2\006\020(\032\0020\rH\000¢\006\002\b)J\b\020*\032\0020\027H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\"\020\t\032\026\022\022\022\020\022\004\022\0020\f\022\004\022\0020\r\030\0010\0130\nX\004¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000¨\006+"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainService;", "Lcom/intellij/openapi/Disposable;", "project", "Lcom/intellij/openapi/project/Project;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lcom/intellij/openapi/project/Project;Lkotlinx/coroutines/CoroutineScope;)V", "recentTaskChainsFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/collections/immutable/PersistentMap;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;", "recentTaskChainListener", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainListener;", "messageBusConnection", "Lcom/intellij/util/messages/MessageBusConnection;", "getRecentTaskChains", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/collections/immutable/ImmutableCollection;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeTask", "", "taskChainId", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeAllTasks", "loadAllTasks", "", "loadAllTasks$ej_core", "patchInconsistentTasks", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "loadedChainsEntity", "taskStorage", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "(Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConsistent", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTrackedTaskChain", "recentTaskChain", "updateTrackedTaskChain$ej_core", "dispose", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nRecentTaskChainServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,181:1\n1611#2,9:182\n1863#2:191\n1864#2:193\n1620#2:194\n1557#2:195\n1628#2,3:196\n1062#2:199\n1863#2,2:201\n1863#2,2:203\n1#3:192\n1#3:200\n226#4,5:205\n*S KotlinDebug\n*F\n+ 1 RecentTaskChainServiceImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl\n*L\n90#1:182,9\n90#1:191\n90#1:193\n90#1:194\n96#1:195\n96#1:196,3\n97#1:199\n139#1:201,2\n140#1:203,2\n90#1:192\n161#1:205,5\n*E\n"})
/*     */ public final class RecentTaskChainServiceImpl implements RecentTaskChainService, Disposable {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final MutableStateFlow<PersistentMap<TaskChainId, RecentTaskChain>> recentTaskChainsFlow;
/*     */   @NotNull
/*     */   private final RecentTaskChainListener recentTaskChainListener;
/*     */   @NotNull
/*     */   private final MessageBusConnection messageBusConnection;
/*     */   
/*     */   public RecentTaskChainServiceImpl(@NotNull Project project, @NotNull CoroutineScope scope) {
/*  42 */     this.project = project;
/*     */ 
/*     */ 
/*     */     
/*  46 */     this.recentTaskChainsFlow = StateFlowKt.MutableStateFlow(null);
/*     */     
/*  48 */     this.recentTaskChainListener = new RecentTaskChainListener();
/*     */     
/*  50 */     this.messageBusConnection = this.project.getMessageBus().connect();
/*     */ 
/*     */     
/*  53 */     this.messageBusConnection.subscribe(TaskService.Companion.getTOPIC(), this.recentTaskChainListener);
/*     */     
/*  55 */     BuildersKt.launch$default(scope, null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */             //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */             //   3: astore #13
/*     */             //   5: aload_0
/*     */             //   6: getfield label : I
/*     */             //   9: tableswitch default -> 169, 0 -> 32, 1 -> 61
/*     */             //   32: aload_1
/*     */             //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   36: aload_0
/*     */             //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */             //   40: aload_0
/*     */             //   41: checkcast kotlin/coroutines/Continuation
/*     */             //   44: aload_0
/*     */             //   45: iconst_1
/*     */             //   46: putfield label : I
/*     */             //   49: invokevirtual loadAllTasks$ej_core : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */             //   52: dup
/*     */             //   53: aload #13
/*     */             //   55: if_acmpne -> 66
/*     */             //   58: aload #13
/*     */             //   60: areturn
/*     */             //   61: aload_1
/*     */             //   62: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */             //   65: aload_1
/*     */             //   66: checkcast java/util/List
/*     */             //   69: astore_2
/*     */             //   70: aload_2
/*     */             //   71: checkcast java/lang/Iterable
/*     */             //   74: astore #4
/*     */             //   76: invokestatic persistentHashMapOf : ()Lkotlinx/collections/immutable/PersistentMap;
/*     */             //   79: astore #5
/*     */             //   81: iconst_0
/*     */             //   82: istore #6
/*     */             //   84: aload #5
/*     */             //   86: astore #7
/*     */             //   88: aload #4
/*     */             //   90: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */             //   95: astore #8
/*     */             //   97: aload #8
/*     */             //   99: invokeinterface hasNext : ()Z
/*     */             //   104: ifeq -> 149
/*     */             //   107: aload #8
/*     */             //   109: invokeinterface next : ()Ljava/lang/Object;
/*     */             //   114: astore #9
/*     */             //   116: aload #7
/*     */             //   118: aload #9
/*     */             //   120: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain
/*     */             //   123: astore #10
/*     */             //   125: astore #11
/*     */             //   127: iconst_0
/*     */             //   128: istore #12
/*     */             //   130: aload #11
/*     */             //   132: aload #10
/*     */             //   134: invokevirtual getTaskChainId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */             //   137: aload #10
/*     */             //   139: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentMap;
/*     */             //   144: astore #7
/*     */             //   146: goto -> 97
/*     */             //   149: aload #7
/*     */             //   151: astore_3
/*     */             //   152: aload_0
/*     */             //   153: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */             //   156: invokestatic access$getRecentTaskChainsFlow$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;)Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */             //   159: aload_3
/*     */             //   160: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */             //   165: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */             //   168: areturn
/*     */             //   169: new java/lang/IllegalStateException
/*     */             //   172: dup
/*     */             //   173: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */             //   175: invokespecial <init> : (Ljava/lang/String;)V
/*     */             //   178: athrow
/*     */             // Line number table:
/*     */             //   Java source line number -> byte code offset
/*     */             //   #55	-> 3
/*     */             //   #56	-> 36
/*     */             //   #55	-> 58
/*     */             //   #57	-> 70
/*     */             //   #182	-> 84
/*     */             //   #183	-> 88
/*     */             //   #58	-> 130
/*     */             //   #183	-> 144
/*     */             //   #184	-> 149
/*     */             //   #57	-> 151
/*     */             //   #60	-> 152
/*     */             //   #61	-> 165
/*     */             //   #55	-> 169
/*     */             // Local variable table:
/*     */             //   start	length	slot	name	descriptor
/*     */             //   70	11	2	recentTasks	Ljava/util/List;
/*     */             //   152	17	3	initialTrackedChains	Lkotlinx/collections/immutable/PersistentMap;
/*     */             //   81	16	4	$this$fold$iv	Ljava/lang/Iterable;
/*     */             //   81	7	5	initial$iv	Ljava/lang/Object;
/*     */             //   88	63	7	accumulator$iv	Ljava/lang/Object;
/*     */             //   116	30	9	element$iv	Ljava/lang/Object;
/*     */             //   127	17	10	chain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */             //   127	17	11	acc	Lkotlinx/collections/immutable/PersistentMap;
/*     */             //   130	14	12	$i$a$-fold-RecentTaskChainServiceImpl$1$initialTrackedChains$1	I
/*     */             //   84	67	6	$i$f$fold	I
/*     */             //   0	179	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$1;
/*  55 */             //   36	133	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(RecentTaskChainServiceImpl.this, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }3, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object getRecentTaskChains(@NotNull Continuation $completion) {
/*  65 */     return CoroutineUtilKt.mapState((StateFlow)this.recentTaskChainsFlow, RecentTaskChainServiceImpl::getRecentTaskChains$lambda$0); } private static final ImmutableCollection getRecentTaskChains$lambda$0(PersistentMap it) { return (it != null) ? (ImmutableCollection)it.values() : null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object removeTask(@NotNull TaskChainId taskChainId, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$removeTask$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$removeTask$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$removeTask$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #4
/*     */     //   50: aload #4
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore_3
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #5
/*     */     //   61: aload #4
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 201, 0 -> 88, 1 -> 137
/*     */     //   88: aload_3
/*     */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   92: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion;
/*     */     //   95: aload_0
/*     */     //   96: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   99: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   102: aload_1
/*     */     //   103: aload #4
/*     */     //   105: aload #4
/*     */     //   107: aload_0
/*     */     //   108: putfield L$0 : Ljava/lang/Object;
/*     */     //   111: aload #4
/*     */     //   113: aload_1
/*     */     //   114: putfield L$1 : Ljava/lang/Object;
/*     */     //   117: aload #4
/*     */     //   119: iconst_1
/*     */     //   120: putfield label : I
/*     */     //   123: invokeinterface removeTaskChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   128: dup
/*     */     //   129: aload #5
/*     */     //   131: if_acmpne -> 160
/*     */     //   134: aload #5
/*     */     //   136: areturn
/*     */     //   137: aload #4
/*     */     //   139: getfield L$1 : Ljava/lang/Object;
/*     */     //   142: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   145: astore_1
/*     */     //   146: aload #4
/*     */     //   148: getfield L$0 : Ljava/lang/Object;
/*     */     //   151: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl
/*     */     //   154: astore_0
/*     */     //   155: aload_3
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload_3
/*     */     //   160: pop
/*     */     //   161: aload_0
/*     */     //   162: getfield recentTaskChainsFlow : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   165: aload_0
/*     */     //   166: getfield recentTaskChainsFlow : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   169: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   174: checkcast kotlinx/collections/immutable/PersistentMap
/*     */     //   177: dup
/*     */     //   178: ifnull -> 190
/*     */     //   181: aload_1
/*     */     //   182: invokeinterface remove : (Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentMap;
/*     */     //   187: goto -> 192
/*     */     //   190: pop
/*     */     //   191: aconst_null
/*     */     //   192: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   197: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   200: areturn
/*     */     //   201: new java/lang/IllegalStateException
/*     */     //   204: dup
/*     */     //   205: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   207: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   210: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #68	-> 59
/*     */     //   #69	-> 92
/*     */     //   #68	-> 134
/*     */     //   #70	-> 160
/*     */     //   #71	-> 197
/*     */     //   #68	-> 201
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   92	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   155	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   92	45	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   146	44	1	taskChainId	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   0	211	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	151	4	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	145	3	$result	Ljava/lang/Object;
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
/*     */   @Nullable
/*     */   public Object removeAllTasks(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$removeAllTasks$1
/*     */     //   4: ifeq -> 36
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$removeAllTasks$1
/*     */     //   11: astore_3
/*     */     //   12: aload_3
/*     */     //   13: getfield label : I
/*     */     //   16: ldc -2147483648
/*     */     //   18: iand
/*     */     //   19: ifeq -> 36
/*     */     //   22: aload_3
/*     */     //   23: dup
/*     */     //   24: getfield label : I
/*     */     //   27: ldc -2147483648
/*     */     //   29: isub
/*     */     //   30: putfield label : I
/*     */     //   33: goto -> 46
/*     */     //   36: new com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$removeAllTasks$1
/*     */     //   39: dup
/*     */     //   40: aload_0
/*     */     //   41: aload_1
/*     */     //   42: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: getfield result : Ljava/lang/Object;
/*     */     //   50: astore_2
/*     */     //   51: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   54: astore #4
/*     */     //   56: aload_3
/*     */     //   57: getfield label : I
/*     */     //   60: tableswitch default -> 153, 0 -> 84, 1 -> 123
/*     */     //   84: aload_2
/*     */     //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   88: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion;
/*     */     //   91: aload_0
/*     */     //   92: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   95: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   98: aload_3
/*     */     //   99: aload_3
/*     */     //   100: aload_0
/*     */     //   101: putfield L$0 : Ljava/lang/Object;
/*     */     //   104: aload_3
/*     */     //   105: iconst_1
/*     */     //   106: putfield label : I
/*     */     //   109: invokeinterface removeAllTaskChains : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   114: dup
/*     */     //   115: aload #4
/*     */     //   117: if_acmpne -> 136
/*     */     //   120: aload #4
/*     */     //   122: areturn
/*     */     //   123: aload_3
/*     */     //   124: getfield L$0 : Ljava/lang/Object;
/*     */     //   127: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl
/*     */     //   130: astore_0
/*     */     //   131: aload_2
/*     */     //   132: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   135: aload_2
/*     */     //   136: pop
/*     */     //   137: aload_0
/*     */     //   138: getfield recentTaskChainsFlow : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   141: invokestatic persistentHashMapOf : ()Lkotlinx/collections/immutable/PersistentMap;
/*     */     //   144: invokeinterface setValue : (Ljava/lang/Object;)V
/*     */     //   149: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   152: areturn
/*     */     //   153: new java/lang/IllegalStateException
/*     */     //   156: dup
/*     */     //   157: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   159: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   162: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #73	-> 54
/*     */     //   #74	-> 88
/*     */     //   #73	-> 120
/*     */     //   #75	-> 136
/*     */     //   #76	-> 149
/*     */     //   #73	-> 153
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   88	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   131	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   0	163	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   46	107	3	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   51	102	2	$result	Ljava/lang/Object;
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
/*     */   @Nullable
/*     */   public final Object loadAllTasks$ej_core(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$loadAllTasks$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$loadAllTasks$1
/*     */     //   11: astore #21
/*     */     //   13: aload #21
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #21
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$loadAllTasks$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #21
/*     */     //   50: aload #21
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #20
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #22
/*     */     //   62: aload #21
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 587, 0 -> 96, 1 -> 147, 2 -> 302, 3 -> 446
/*     */     //   96: aload #20
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage$Companion;
/*     */     //   104: aload_0
/*     */     //   105: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   108: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   111: astore_2
/*     */     //   112: aload_2
/*     */     //   113: aload #21
/*     */     //   115: aload #21
/*     */     //   117: aload_0
/*     */     //   118: putfield L$0 : Ljava/lang/Object;
/*     */     //   121: aload #21
/*     */     //   123: aload_2
/*     */     //   124: putfield L$1 : Ljava/lang/Object;
/*     */     //   127: aload #21
/*     */     //   129: iconst_1
/*     */     //   130: putfield label : I
/*     */     //   133: invokeinterface loadAllChainIds : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   138: dup
/*     */     //   139: aload #22
/*     */     //   141: if_acmpne -> 172
/*     */     //   144: aload #22
/*     */     //   146: areturn
/*     */     //   147: aload #21
/*     */     //   149: getfield L$1 : Ljava/lang/Object;
/*     */     //   152: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage
/*     */     //   155: astore_2
/*     */     //   156: aload #21
/*     */     //   158: getfield L$0 : Ljava/lang/Object;
/*     */     //   161: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl
/*     */     //   164: astore_0
/*     */     //   165: aload #20
/*     */     //   167: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   170: aload #20
/*     */     //   172: checkcast java/lang/Iterable
/*     */     //   175: astore #4
/*     */     //   177: iconst_0
/*     */     //   178: istore #5
/*     */     //   180: aload #4
/*     */     //   182: astore #6
/*     */     //   184: new java/util/ArrayList
/*     */     //   187: dup
/*     */     //   188: invokespecial <init> : ()V
/*     */     //   191: checkcast java/util/Collection
/*     */     //   194: astore #7
/*     */     //   196: iconst_0
/*     */     //   197: istore #8
/*     */     //   199: aload #6
/*     */     //   201: astore #9
/*     */     //   203: iconst_0
/*     */     //   204: istore #10
/*     */     //   206: aload #9
/*     */     //   208: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   213: astore #11
/*     */     //   215: aload #11
/*     */     //   217: invokeinterface hasNext : ()Z
/*     */     //   222: ifeq -> 391
/*     */     //   225: aload #11
/*     */     //   227: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   232: astore #12
/*     */     //   234: aload #12
/*     */     //   236: astore #13
/*     */     //   238: iconst_0
/*     */     //   239: istore #14
/*     */     //   241: aload #13
/*     */     //   243: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
/*     */     //   246: astore #15
/*     */     //   248: iconst_0
/*     */     //   249: istore #16
/*     */     //   251: aload_2
/*     */     //   252: aload #15
/*     */     //   254: aload #21
/*     */     //   256: aload #21
/*     */     //   258: aload_0
/*     */     //   259: putfield L$0 : Ljava/lang/Object;
/*     */     //   262: aload #21
/*     */     //   264: aload_2
/*     */     //   265: putfield L$1 : Ljava/lang/Object;
/*     */     //   268: aload #21
/*     */     //   270: aload #7
/*     */     //   272: putfield L$2 : Ljava/lang/Object;
/*     */     //   275: aload #21
/*     */     //   277: aload #11
/*     */     //   279: putfield L$3 : Ljava/lang/Object;
/*     */     //   282: aload #21
/*     */     //   284: iconst_2
/*     */     //   285: putfield label : I
/*     */     //   288: invokeinterface loadChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   293: dup
/*     */     //   294: aload #22
/*     */     //   296: if_acmpne -> 362
/*     */     //   299: aload #22
/*     */     //   301: areturn
/*     */     //   302: iconst_0
/*     */     //   303: istore #5
/*     */     //   305: iconst_0
/*     */     //   306: istore #8
/*     */     //   308: iconst_0
/*     */     //   309: istore #10
/*     */     //   311: iconst_0
/*     */     //   312: istore #14
/*     */     //   314: iconst_0
/*     */     //   315: istore #16
/*     */     //   317: aload #21
/*     */     //   319: getfield L$3 : Ljava/lang/Object;
/*     */     //   322: checkcast java/util/Iterator
/*     */     //   325: astore #11
/*     */     //   327: aload #21
/*     */     //   329: getfield L$2 : Ljava/lang/Object;
/*     */     //   332: checkcast java/util/Collection
/*     */     //   335: astore #7
/*     */     //   337: aload #21
/*     */     //   339: getfield L$1 : Ljava/lang/Object;
/*     */     //   342: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage
/*     */     //   345: astore_2
/*     */     //   346: aload #21
/*     */     //   348: getfield L$0 : Ljava/lang/Object;
/*     */     //   351: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl
/*     */     //   354: astore_0
/*     */     //   355: aload #20
/*     */     //   357: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   360: aload #20
/*     */     //   362: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   365: dup
/*     */     //   366: ifnull -> 387
/*     */     //   369: astore #17
/*     */     //   371: iconst_0
/*     */     //   372: istore #18
/*     */     //   374: aload #7
/*     */     //   376: aload #17
/*     */     //   378: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   383: pop
/*     */     //   384: goto -> 388
/*     */     //   387: pop
/*     */     //   388: goto -> 215
/*     */     //   391: nop
/*     */     //   392: aload #7
/*     */     //   394: checkcast java/util/List
/*     */     //   397: nop
/*     */     //   398: astore_3
/*     */     //   399: aload_0
/*     */     //   400: aload_3
/*     */     //   401: aload_2
/*     */     //   402: aload #21
/*     */     //   404: aload #21
/*     */     //   406: aconst_null
/*     */     //   407: putfield L$0 : Ljava/lang/Object;
/*     */     //   410: aload #21
/*     */     //   412: aconst_null
/*     */     //   413: putfield L$1 : Ljava/lang/Object;
/*     */     //   416: aload #21
/*     */     //   418: aconst_null
/*     */     //   419: putfield L$2 : Ljava/lang/Object;
/*     */     //   422: aload #21
/*     */     //   424: aconst_null
/*     */     //   425: putfield L$3 : Ljava/lang/Object;
/*     */     //   428: aload #21
/*     */     //   430: iconst_3
/*     */     //   431: putfield label : I
/*     */     //   434: invokespecial patchInconsistentTasks : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   437: dup
/*     */     //   438: aload #22
/*     */     //   440: if_acmpne -> 453
/*     */     //   443: aload #22
/*     */     //   445: areturn
/*     */     //   446: aload #20
/*     */     //   448: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   451: aload #20
/*     */     //   453: checkcast java/util/List
/*     */     //   456: astore #4
/*     */     //   458: aload #4
/*     */     //   460: checkcast java/lang/Iterable
/*     */     //   463: astore #6
/*     */     //   465: iconst_0
/*     */     //   466: istore #7
/*     */     //   468: aload #6
/*     */     //   470: astore #8
/*     */     //   472: new java/util/ArrayList
/*     */     //   475: dup
/*     */     //   476: aload #6
/*     */     //   478: bipush #10
/*     */     //   480: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   483: invokespecial <init> : (I)V
/*     */     //   486: checkcast java/util/Collection
/*     */     //   489: astore #9
/*     */     //   491: iconst_0
/*     */     //   492: istore #10
/*     */     //   494: aload #8
/*     */     //   496: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   501: astore #11
/*     */     //   503: aload #11
/*     */     //   505: invokeinterface hasNext : ()Z
/*     */     //   510: ifeq -> 553
/*     */     //   513: aload #11
/*     */     //   515: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   520: astore #12
/*     */     //   522: aload #9
/*     */     //   524: aload #12
/*     */     //   526: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   529: astore #13
/*     */     //   531: astore #19
/*     */     //   533: iconst_0
/*     */     //   534: istore #14
/*     */     //   536: aload #13
/*     */     //   538: invokestatic access$convert : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;
/*     */     //   541: aload #19
/*     */     //   543: swap
/*     */     //   544: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   549: pop
/*     */     //   550: goto -> 503
/*     */     //   553: aload #9
/*     */     //   555: checkcast java/util/List
/*     */     //   558: nop
/*     */     //   559: astore #5
/*     */     //   561: aload #5
/*     */     //   563: checkcast java/lang/Iterable
/*     */     //   566: astore #6
/*     */     //   568: iconst_0
/*     */     //   569: istore #7
/*     */     //   571: aload #6
/*     */     //   573: new com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$loadAllTasks$$inlined$sortedByDescending$1
/*     */     //   576: dup
/*     */     //   577: invokespecial <init> : ()V
/*     */     //   580: checkcast java/util/Comparator
/*     */     //   583: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   586: areturn
/*     */     //   587: new java/lang/IllegalStateException
/*     */     //   590: dup
/*     */     //   591: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   593: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   596: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #87	-> 60
/*     */     //   #88	-> 101
/*     */     //   #89	-> 112
/*     */     //   #87	-> 144
/*     */     //   #90	-> 177
/*     */     //   #182	-> 180
/*     */     //   #190	-> 199
/*     */     //   #191	-> 206
/*     */     //   #190	-> 241
/*     */     //   #90	-> 251
/*     */     //   #87	-> 299
/*     */     //   #90	-> 362
/*     */     //   #190	-> 365
/*     */     //   #192	-> 371
/*     */     //   #190	-> 374
/*     */     //   #190	-> 384
/*     */     //   #190	-> 387
/*     */     //   #191	-> 388
/*     */     //   #193	-> 391
/*     */     //   #194	-> 392
/*     */     //   #182	-> 397
/*     */     //   #90	-> 398
/*     */     //   #89	-> 398
/*     */     //   #93	-> 399
/*     */     //   #87	-> 443
/*     */     //   #96	-> 458
/*     */     //   #195	-> 468
/*     */     //   #196	-> 494
/*     */     //   #197	-> 522
/*     */     //   #96	-> 536
/*     */     //   #197	-> 544
/*     */     //   #198	-> 553
/*     */     //   #195	-> 558
/*     */     //   #96	-> 559
/*     */     //   #97	-> 561
/*     */     //   #199	-> 571
/*     */     //   #199	-> 583
/*     */     //   #97	-> 586
/*     */     //   #87	-> 587
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   165	137	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   355	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   365	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   398	39	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   112	35	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   156	146	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   346	19	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   365	33	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   398	39	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   399	38	3	loadedChainsEntity	Ljava/util/List;
/*     */     //   177	19	4	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*     */     //   458	7	4	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   561	26	5	recentTaskChains	Ljava/util/List;
/*     */     //   196	7	6	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   465	26	6	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   568	18	6	$this$sortedByDescending$iv	Ljava/lang/Iterable;
/*     */     //   196	106	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   337	28	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   365	29	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   491	12	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   203	12	9	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*     */     //   491	64	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   234	4	12	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   522	28	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   238	10	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   533	8	13	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   248	45	15	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   371	13	17	it$iv$iv	Ljava/lang/Object;
/*     */     //   251	51	16	$i$a$-mapNotNull-RecentTaskChainServiceImpl$loadAllTasks$loadedChainsEntity$1	I
/*     */     //   374	10	18	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   241	61	14	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   206	96	10	$i$f$forEach	I
/*     */     //   199	103	8	$i$f$mapNotNullTo	I
/*     */     //   180	122	5	$i$f$mapNotNull	I
/*     */     //   536	5	14	$i$a$-map-RecentTaskChainServiceImpl$loadAllTasks$recentTaskChains$1	I
/*     */     //   494	61	10	$i$f$mapTo	I
/*     */     //   468	91	7	$i$f$map	I
/*     */     //   571	15	7	$i$f$sortedByDescending	I
/*     */     //   0	597	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	537	21	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	530	20	$result	Ljava/lang/Object;
/*     */     //   317	48	16	$i$a$-mapNotNull-RecentTaskChainServiceImpl$loadAllTasks$loadedChainsEntity$1	I
/*     */     //   314	74	14	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   311	81	10	$i$f$forEach	I
/*     */     //   308	86	8	$i$f$mapNotNullTo	I
/*     */     //   305	93	5	$i$f$mapNotNull	I
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
/*     */   private final Object patchInconsistentTasks(List loadedChainsEntity, TaskStorage taskStorage, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$patchInconsistentTasks$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$patchInconsistentTasks$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$patchInconsistentTasks$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #14
/*     */     //   50: aload #14
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #13
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #15
/*     */     //   62: aload #14
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 778, 0 -> 96, 1 -> 238, 2 -> 551, 3 -> 728
/*     */     //   96: aload #13
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: new java/util/ArrayList
/*     */     //   104: dup
/*     */     //   105: invokespecial <init> : ()V
/*     */     //   108: checkcast java/util/List
/*     */     //   111: astore #4
/*     */     //   113: new java/util/ArrayList
/*     */     //   116: dup
/*     */     //   117: invokespecial <init> : ()V
/*     */     //   120: checkcast java/util/List
/*     */     //   123: astore #5
/*     */     //   125: new java/util/ArrayList
/*     */     //   128: dup
/*     */     //   129: invokespecial <init> : ()V
/*     */     //   132: checkcast java/util/List
/*     */     //   135: astore #6
/*     */     //   137: aload_1
/*     */     //   138: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   143: astore #7
/*     */     //   145: aload #7
/*     */     //   147: invokeinterface hasNext : ()Z
/*     */     //   152: ifeq -> 433
/*     */     //   155: aload #7
/*     */     //   157: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   162: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   165: astore #8
/*     */     //   167: aload_0
/*     */     //   168: aload #8
/*     */     //   170: aload_2
/*     */     //   171: aload #14
/*     */     //   173: aload #14
/*     */     //   175: aload_0
/*     */     //   176: putfield L$0 : Ljava/lang/Object;
/*     */     //   179: aload #14
/*     */     //   181: aload_2
/*     */     //   182: putfield L$1 : Ljava/lang/Object;
/*     */     //   185: aload #14
/*     */     //   187: aload #4
/*     */     //   189: putfield L$2 : Ljava/lang/Object;
/*     */     //   192: aload #14
/*     */     //   194: aload #5
/*     */     //   196: putfield L$3 : Ljava/lang/Object;
/*     */     //   199: aload #14
/*     */     //   201: aload #6
/*     */     //   203: putfield L$4 : Ljava/lang/Object;
/*     */     //   206: aload #14
/*     */     //   208: aload #7
/*     */     //   210: putfield L$5 : Ljava/lang/Object;
/*     */     //   213: aload #14
/*     */     //   215: aload #8
/*     */     //   217: putfield L$6 : Ljava/lang/Object;
/*     */     //   220: aload #14
/*     */     //   222: iconst_1
/*     */     //   223: putfield label : I
/*     */     //   226: invokespecial isConsistent : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   229: dup
/*     */     //   230: aload #15
/*     */     //   232: if_acmpne -> 313
/*     */     //   235: aload #15
/*     */     //   237: areturn
/*     */     //   238: aload #14
/*     */     //   240: getfield L$6 : Ljava/lang/Object;
/*     */     //   243: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   246: astore #8
/*     */     //   248: aload #14
/*     */     //   250: getfield L$5 : Ljava/lang/Object;
/*     */     //   253: checkcast java/util/Iterator
/*     */     //   256: astore #7
/*     */     //   258: aload #14
/*     */     //   260: getfield L$4 : Ljava/lang/Object;
/*     */     //   263: checkcast java/util/List
/*     */     //   266: astore #6
/*     */     //   268: aload #14
/*     */     //   270: getfield L$3 : Ljava/lang/Object;
/*     */     //   273: checkcast java/util/List
/*     */     //   276: astore #5
/*     */     //   278: aload #14
/*     */     //   280: getfield L$2 : Ljava/lang/Object;
/*     */     //   283: checkcast java/util/List
/*     */     //   286: astore #4
/*     */     //   288: aload #14
/*     */     //   290: getfield L$1 : Ljava/lang/Object;
/*     */     //   293: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage
/*     */     //   296: astore_2
/*     */     //   297: aload #14
/*     */     //   299: getfield L$0 : Ljava/lang/Object;
/*     */     //   302: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl
/*     */     //   305: astore_0
/*     */     //   306: aload #13
/*     */     //   308: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   311: aload #13
/*     */     //   313: checkcast java/lang/Boolean
/*     */     //   316: invokevirtual booleanValue : ()Z
/*     */     //   319: ifne -> 332
/*     */     //   322: aload #5
/*     */     //   324: aload #8
/*     */     //   326: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   331: pop
/*     */     //   332: iconst_3
/*     */     //   333: anewarray com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState
/*     */     //   336: astore #10
/*     */     //   338: aload #10
/*     */     //   340: iconst_0
/*     */     //   341: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   344: aastore
/*     */     //   345: aload #10
/*     */     //   347: iconst_1
/*     */     //   348: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingUserInput : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   351: aastore
/*     */     //   352: aload #10
/*     */     //   354: iconst_2
/*     */     //   355: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingSmartMode : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   358: aastore
/*     */     //   359: aload #10
/*     */     //   361: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   364: aload #8
/*     */     //   366: invokevirtual getState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   369: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   374: ifeq -> 416
/*     */     //   377: aload #8
/*     */     //   379: aconst_null
/*     */     //   380: aconst_null
/*     */     //   381: aconst_null
/*     */     //   382: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Stopped : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   385: aconst_null
/*     */     //   386: bipush #23
/*     */     //   388: aconst_null
/*     */     //   389: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Ljava/lang/String;Lkotlinx/datetime/Instant;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   392: astore #10
/*     */     //   394: aload #10
/*     */     //   396: astore #11
/*     */     //   398: iconst_0
/*     */     //   399: istore #12
/*     */     //   401: aload #4
/*     */     //   403: aload #11
/*     */     //   405: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   410: pop
/*     */     //   411: aload #10
/*     */     //   413: goto -> 418
/*     */     //   416: aload #8
/*     */     //   418: astore #9
/*     */     //   420: aload #6
/*     */     //   422: aload #9
/*     */     //   424: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   429: pop
/*     */     //   430: goto -> 145
/*     */     //   433: aload #4
/*     */     //   435: checkcast java/lang/Iterable
/*     */     //   438: astore #7
/*     */     //   440: iconst_0
/*     */     //   441: istore #8
/*     */     //   443: aload #7
/*     */     //   445: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   450: astore #9
/*     */     //   452: aload #9
/*     */     //   454: invokeinterface hasNext : ()Z
/*     */     //   459: ifeq -> 607
/*     */     //   462: aload #9
/*     */     //   464: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   469: astore #10
/*     */     //   471: aload #10
/*     */     //   473: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   476: astore #11
/*     */     //   478: iconst_0
/*     */     //   479: istore #12
/*     */     //   481: aload_2
/*     */     //   482: aload #11
/*     */     //   484: aload #14
/*     */     //   486: aload #14
/*     */     //   488: aload_2
/*     */     //   489: putfield L$0 : Ljava/lang/Object;
/*     */     //   492: aload #14
/*     */     //   494: aload #5
/*     */     //   496: putfield L$1 : Ljava/lang/Object;
/*     */     //   499: aload #14
/*     */     //   501: aload #6
/*     */     //   503: putfield L$2 : Ljava/lang/Object;
/*     */     //   506: aload #14
/*     */     //   508: aload #9
/*     */     //   510: putfield L$3 : Ljava/lang/Object;
/*     */     //   513: aload #14
/*     */     //   515: aconst_null
/*     */     //   516: putfield L$4 : Ljava/lang/Object;
/*     */     //   519: aload #14
/*     */     //   521: aconst_null
/*     */     //   522: putfield L$5 : Ljava/lang/Object;
/*     */     //   525: aload #14
/*     */     //   527: aconst_null
/*     */     //   528: putfield L$6 : Ljava/lang/Object;
/*     */     //   531: aload #14
/*     */     //   533: iconst_2
/*     */     //   534: putfield label : I
/*     */     //   537: invokeinterface saveChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   542: dup
/*     */     //   543: aload #15
/*     */     //   545: if_acmpne -> 603
/*     */     //   548: aload #15
/*     */     //   550: areturn
/*     */     //   551: iconst_0
/*     */     //   552: istore #8
/*     */     //   554: iconst_0
/*     */     //   555: istore #12
/*     */     //   557: aload #14
/*     */     //   559: getfield L$3 : Ljava/lang/Object;
/*     */     //   562: checkcast java/util/Iterator
/*     */     //   565: astore #9
/*     */     //   567: aload #14
/*     */     //   569: getfield L$2 : Ljava/lang/Object;
/*     */     //   572: checkcast java/util/List
/*     */     //   575: astore #6
/*     */     //   577: aload #14
/*     */     //   579: getfield L$1 : Ljava/lang/Object;
/*     */     //   582: checkcast java/util/List
/*     */     //   585: astore #5
/*     */     //   587: aload #14
/*     */     //   589: getfield L$0 : Ljava/lang/Object;
/*     */     //   592: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage
/*     */     //   595: astore_2
/*     */     //   596: aload #13
/*     */     //   598: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   601: aload #13
/*     */     //   603: pop
/*     */     //   604: goto -> 452
/*     */     //   607: nop
/*     */     //   608: aload #5
/*     */     //   610: checkcast java/lang/Iterable
/*     */     //   613: astore #7
/*     */     //   615: iconst_0
/*     */     //   616: istore #8
/*     */     //   618: aload #7
/*     */     //   620: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   625: astore #9
/*     */     //   627: aload #9
/*     */     //   629: invokeinterface hasNext : ()Z
/*     */     //   634: ifeq -> 774
/*     */     //   637: aload #9
/*     */     //   639: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   644: astore #10
/*     */     //   646: aload #10
/*     */     //   648: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   651: astore #11
/*     */     //   653: iconst_0
/*     */     //   654: istore #12
/*     */     //   656: aload_2
/*     */     //   657: aload #11
/*     */     //   659: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   662: aload #14
/*     */     //   664: aload #14
/*     */     //   666: aload_2
/*     */     //   667: putfield L$0 : Ljava/lang/Object;
/*     */     //   670: aload #14
/*     */     //   672: aload #6
/*     */     //   674: putfield L$1 : Ljava/lang/Object;
/*     */     //   677: aload #14
/*     */     //   679: aload #9
/*     */     //   681: putfield L$2 : Ljava/lang/Object;
/*     */     //   684: aload #14
/*     */     //   686: aconst_null
/*     */     //   687: putfield L$3 : Ljava/lang/Object;
/*     */     //   690: aload #14
/*     */     //   692: aconst_null
/*     */     //   693: putfield L$4 : Ljava/lang/Object;
/*     */     //   696: aload #14
/*     */     //   698: aconst_null
/*     */     //   699: putfield L$5 : Ljava/lang/Object;
/*     */     //   702: aload #14
/*     */     //   704: aconst_null
/*     */     //   705: putfield L$6 : Ljava/lang/Object;
/*     */     //   708: aload #14
/*     */     //   710: iconst_3
/*     */     //   711: putfield label : I
/*     */     //   714: invokeinterface removeTaskChain : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   719: dup
/*     */     //   720: aload #15
/*     */     //   722: if_acmpne -> 770
/*     */     //   725: aload #15
/*     */     //   727: areturn
/*     */     //   728: iconst_0
/*     */     //   729: istore #8
/*     */     //   731: iconst_0
/*     */     //   732: istore #12
/*     */     //   734: aload #14
/*     */     //   736: getfield L$2 : Ljava/lang/Object;
/*     */     //   739: checkcast java/util/Iterator
/*     */     //   742: astore #9
/*     */     //   744: aload #14
/*     */     //   746: getfield L$1 : Ljava/lang/Object;
/*     */     //   749: checkcast java/util/List
/*     */     //   752: astore #6
/*     */     //   754: aload #14
/*     */     //   756: getfield L$0 : Ljava/lang/Object;
/*     */     //   759: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage
/*     */     //   762: astore_2
/*     */     //   763: aload #13
/*     */     //   765: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   768: aload #13
/*     */     //   770: pop
/*     */     //   771: goto -> 627
/*     */     //   774: nop
/*     */     //   775: aload #6
/*     */     //   777: areturn
/*     */     //   778: new java/lang/IllegalStateException
/*     */     //   781: dup
/*     */     //   782: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   784: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   787: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #114	-> 60
/*     */     //   #118	-> 101
/*     */     //   #118	-> 111
/*     */     //   #119	-> 113
/*     */     //   #119	-> 123
/*     */     //   #120	-> 125
/*     */     //   #120	-> 135
/*     */     //   #122	-> 137
/*     */     //   #123	-> 167
/*     */     //   #114	-> 235
/*     */     //   #123	-> 313
/*     */     //   #124	-> 322
/*     */     //   #126	-> 332
/*     */     //   #127	-> 332
/*     */     //   #128	-> 348
/*     */     //   #127	-> 352
/*     */     //   #129	-> 355
/*     */     //   #127	-> 359
/*     */     //   #126	-> 361
/*     */     //   #132	-> 377
/*     */     //   #200	-> 398
/*     */     //   #132	-> 401
/*     */     //   #132	-> 411
/*     */     //   #134	-> 416
/*     */     //   #126	-> 418
/*     */     //   #136	-> 420
/*     */     //   #139	-> 433
/*     */     //   #201	-> 443
/*     */     //   #139	-> 481
/*     */     //   #114	-> 548
/*     */     //   #139	-> 603
/*     */     //   #201	-> 604
/*     */     //   #202	-> 607
/*     */     //   #140	-> 608
/*     */     //   #203	-> 618
/*     */     //   #140	-> 656
/*     */     //   #114	-> 725
/*     */     //   #140	-> 770
/*     */     //   #203	-> 771
/*     */     //   #204	-> 774
/*     */     //   #141	-> 775
/*     */     //   #114	-> 778
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   111	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   123	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   135	103	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   306	105	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   411	2	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   413	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;
/*     */     //   101	10	1	loadedChainsEntity	Ljava/util/List;
/*     */     //   111	12	1	loadedChainsEntity	Ljava/util/List;
/*     */     //   123	12	1	loadedChainsEntity	Ljava/util/List;
/*     */     //   135	10	1	loadedChainsEntity	Ljava/util/List;
/*     */     //   101	10	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   111	12	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   123	12	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   135	103	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   297	114	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   411	2	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   413	138	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   596	8	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   604	4	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   608	120	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   763	15	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   113	10	4	changedChains	Ljava/util/List;
/*     */     //   123	12	4	changedChains	Ljava/util/List;
/*     */     //   135	103	4	changedChains	Ljava/util/List;
/*     */     //   288	123	4	changedChains	Ljava/util/List;
/*     */     //   411	2	4	changedChains	Ljava/util/List;
/*     */     //   413	27	4	changedChains	Ljava/util/List;
/*     */     //   125	10	5	inconsistentChains	Ljava/util/List;
/*     */     //   135	103	5	inconsistentChains	Ljava/util/List;
/*     */     //   278	133	5	inconsistentChains	Ljava/util/List;
/*     */     //   411	2	5	inconsistentChains	Ljava/util/List;
/*     */     //   413	138	5	inconsistentChains	Ljava/util/List;
/*     */     //   587	17	5	inconsistentChains	Ljava/util/List;
/*     */     //   604	4	5	inconsistentChains	Ljava/util/List;
/*     */     //   608	7	5	inconsistentChains	Ljava/util/List;
/*     */     //   137	101	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   268	143	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   411	2	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   413	138	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   577	27	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   604	4	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   608	120	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   754	24	6	finalTaskChainsEntities	Ljava/util/List;
/*     */     //   440	12	7	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   615	12	7	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   167	71	8	chain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   248	146	8	chain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   416	2	8	chain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   420	9	9	updatedChain	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   471	7	10	element$iv	Ljava/lang/Object;
/*     */     //   646	7	10	element$iv	Ljava/lang/Object;
/*     */     //   398	13	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   478	64	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   653	66	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   401	10	12	$i$a$-also-RecentTaskChainServiceImpl$patchInconsistentTasks$updatedChain$1	I
/*     */     //   481	70	12	$i$a$-forEach-RecentTaskChainServiceImpl$patchInconsistentTasks$2	I
/*     */     //   443	108	8	$i$f$forEach	I
/*     */     //   656	72	12	$i$a$-forEach-RecentTaskChainServiceImpl$patchInconsistentTasks$3	I
/*     */     //   618	110	8	$i$f$forEach	I
/*     */     //   0	788	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	728	14	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	721	13	$result	Ljava/lang/Object;
/*     */     //   557	47	12	$i$a$-forEach-RecentTaskChainServiceImpl$patchInconsistentTasks$2	I
/*     */     //   554	54	8	$i$f$forEach	I
/*     */     //   734	37	12	$i$a$-forEach-RecentTaskChainServiceImpl$patchInconsistentTasks$3	I
/*     */     //   731	44	8	$i$f$forEach	I
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
/*     */   private final Object isConsistent(TaskChainEntity $this$isConsistent, TaskStorage taskStorage, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$isConsistent$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$isConsistent$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl$isConsistent$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChainServiceImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 262, 0 -> 92, 1 -> 136, 2 -> 228
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_2
/*     */     //   98: aload_1
/*     */     //   99: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   102: aload #7
/*     */     //   104: aload #7
/*     */     //   106: aload_1
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload #7
/*     */     //   112: aload_2
/*     */     //   113: putfield L$1 : Ljava/lang/Object;
/*     */     //   116: aload #7
/*     */     //   118: iconst_1
/*     */     //   119: putfield label : I
/*     */     //   122: invokeinterface loadAllTaskIds : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   127: dup
/*     */     //   128: aload #8
/*     */     //   130: if_acmpne -> 161
/*     */     //   133: aload #8
/*     */     //   135: areturn
/*     */     //   136: aload #7
/*     */     //   138: getfield L$1 : Ljava/lang/Object;
/*     */     //   141: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage
/*     */     //   144: astore_2
/*     */     //   145: aload #7
/*     */     //   147: getfield L$0 : Ljava/lang/Object;
/*     */     //   150: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity
/*     */     //   153: astore_1
/*     */     //   154: aload #6
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #6
/*     */     //   161: checkcast java/util/List
/*     */     //   164: astore #4
/*     */     //   166: aload #4
/*     */     //   168: invokeinterface isEmpty : ()Z
/*     */     //   173: ifeq -> 181
/*     */     //   176: iconst_0
/*     */     //   177: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   180: areturn
/*     */     //   181: aload_2
/*     */     //   182: aload_1
/*     */     //   183: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   186: aload #4
/*     */     //   188: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   191: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
/*     */     //   194: aload #7
/*     */     //   196: aload #7
/*     */     //   198: aconst_null
/*     */     //   199: putfield L$0 : Ljava/lang/Object;
/*     */     //   202: aload #7
/*     */     //   204: aconst_null
/*     */     //   205: putfield L$1 : Ljava/lang/Object;
/*     */     //   208: aload #7
/*     */     //   210: iconst_2
/*     */     //   211: putfield label : I
/*     */     //   214: invokeinterface loadAllSteps : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   219: dup
/*     */     //   220: aload #8
/*     */     //   222: if_acmpne -> 235
/*     */     //   225: aload #8
/*     */     //   227: areturn
/*     */     //   228: aload #6
/*     */     //   230: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   233: aload #6
/*     */     //   235: checkcast java/util/List
/*     */     //   238: astore #5
/*     */     //   240: aload #5
/*     */     //   242: checkcast java/util/Collection
/*     */     //   245: invokeinterface isEmpty : ()Z
/*     */     //   250: ifne -> 257
/*     */     //   253: iconst_1
/*     */     //   254: goto -> 258
/*     */     //   257: iconst_0
/*     */     //   258: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   261: areturn
/*     */     //   262: new java/lang/IllegalStateException
/*     */     //   265: dup
/*     */     //   266: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   268: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   271: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #153	-> 60
/*     */     //   #154	-> 97
/*     */     //   #153	-> 133
/*     */     //   #155	-> 166
/*     */     //   #156	-> 181
/*     */     //   #153	-> 225
/*     */     //   #157	-> 240
/*     */     //   #157	-> 261
/*     */     //   #153	-> 262
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	39	1	$this$isConsistent	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   154	27	1	$this$isConsistent	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   181	38	1	$this$isConsistent	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;
/*     */     //   97	39	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   145	36	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   181	38	2	taskStorage	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;
/*     */     //   166	15	4	taskIds	Ljava/util/List;
/*     */     //   181	38	4	taskIds	Ljava/util/List;
/*     */     //   240	17	5	initialSteps	Ljava/util/List;
/*     */     //   0	272	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	212	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	205	6	$result	Ljava/lang/Object;
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
/*     */   public final void updateTrackedTaskChain$ej_core(@NotNull TaskChainId taskChainId, @NotNull RecentTaskChain recentTaskChain) {
/* 161 */     Intrinsics.checkNotNullParameter(taskChainId, "taskChainId"); Intrinsics.checkNotNullParameter(recentTaskChain, "recentTaskChain"); MutableStateFlow<PersistentMap<TaskChainId, RecentTaskChain>> $this$update$iv = this.recentTaskChainsFlow; int $i$f$update = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/* 206 */       Object prevValue$iv = $this$update$iv.getValue();
/* 207 */       PersistentMap it = (PersistentMap)prevValue$iv; int $i$a$-update-RecentTaskChainServiceImpl$updateTrackedTaskChain$1 = 0; if (it == null || it.put(taskChainId, recentTaskChain) == null) { it.put(taskChainId, recentTaskChain); Pair[] arrayOfPair = new Pair[1]; arrayOfPair[0] = TuplesKt.to(taskChainId, recentTaskChain); }  Object nextValue$iv = ExtensionsKt.persistentHashMapOf(arrayOfPair);
/* 208 */       if ($this$update$iv.compareAndSet(prevValue$iv, nextValue$iv))
/*     */         return; 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void dispose() {
/*     */     this.messageBusConnection.disconnect();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {154, 156}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$isConsistent", "taskStorage"}, m = "isConsistent", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RecentTaskChainServiceImpl$isConsistent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     RecentTaskChainServiceImpl$isConsistent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RecentTaskChainServiceImpl.this.isConsistent(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {89, 90, 93}, i = {0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, n = {"this", "taskStorage", "this", "taskStorage", "destination$iv$iv"}, m = "loadAllTasks$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RecentTaskChainServiceImpl$loadAllTasks$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     RecentTaskChainServiceImpl$loadAllTasks$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RecentTaskChainServiceImpl.this.loadAllTasks$ej_core((Continuation<? super List<RecentTaskChain>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {123, 139, 140}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"this", "taskStorage", "changedChains", "inconsistentChains", "finalTaskChainsEntities", "chain", "taskStorage", "inconsistentChains", "finalTaskChainsEntities", "taskStorage", "finalTaskChainsEntities"}, m = "patchInconsistentTasks", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RecentTaskChainServiceImpl$patchInconsistentTasks$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     RecentTaskChainServiceImpl$patchInconsistentTasks$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RecentTaskChainServiceImpl.this.patchInconsistentTasks(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {74}, i = {0}, s = {"L$0"}, n = {"this"}, m = "removeAllTasks", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RecentTaskChainServiceImpl$removeAllTasks$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     RecentTaskChainServiceImpl$removeAllTasks$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RecentTaskChainServiceImpl.this.removeAllTasks((Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {69}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "taskChainId"}, m = "removeTask", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class RecentTaskChainServiceImpl$removeTask$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     RecentTaskChainServiceImpl$removeTask$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return RecentTaskChainServiceImpl.this.removeTask(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\RecentTaskChainServiceImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */