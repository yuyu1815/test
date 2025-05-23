/*     */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.openapi.components.ComponentManager;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.UUID;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000x\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\006\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\002\030\000 82\0020\001:\0018B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J4\020\n\032\002H\013\"\004\b\000\020\0132\036\b\004\020\f\032\030\b\001\022\n\022\b\022\004\022\002H\0130\016\022\006\022\004\030\0010\0170\rHH¢\006\002\020\020J\036\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\026H@¢\006\002\020\027J\034\020\030\032\b\022\004\022\0020\0320\0312\006\020\023\032\0020\024H@¢\006\002\020\033J \020\034\032\004\030\0010\0262\006\020\023\032\0020\0242\006\020\035\032\0020\032H@¢\006\002\020\036J.\020\037\032\0020\0222\006\020\023\032\0020\0242\006\020 \032\0020!2\006\020\"\032\0020\0322\006\020#\032\0020$H@¢\006\002\020%J$\020&\032\b\022\004\022\0020$0\0312\006\020\023\032\0020\0242\006\020\"\032\0020\032H@¢\006\002\020\036J\027\020'\032\004\030\0010!2\006\020(\032\0020)H\002¢\006\002\020*J\026\020+\032\0020\0222\006\020,\032\0020-H@¢\006\002\020.J\024\020/\032\b\022\004\022\0020\0240\031H@¢\006\002\0200J\030\0201\032\004\030\0010-2\006\0202\032\0020\024H@¢\006\002\020\033J\026\0203\032\0020\0222\006\0202\032\0020\024H@¢\006\002\020\033J\016\0204\032\0020\022H@¢\006\002\0200J\027\0205\032\004\030\0010!2\006\020(\032\0020)H\002¢\006\002\020*J\022\0206\032\004\030\001072\006\020(\032\0020)H\002R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000¨\0069"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorage;", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "caches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "preserveInvocationOrder", "T", "body", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveTask", "", "chainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "task", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllTaskIds", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadTask", "id", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveStep", "index", "", "taskId", "step", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;ILcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllSteps", "parseStepIndexFromFilename", "filename", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "saveChain", "taskChain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllChainIds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadChain", "taskChainId", "removeTaskChain", "removeAllTaskChains", "parseIntFromFilename", "parseUUIDFromFilename", "Ljava/util/UUID;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,171:1\n31#1:174\n31#1:175\n31#1:176\n31#1:177\n31#1:178\n31#1:179\n31#1:180\n31#1:181\n31#1:182\n31#1:183\n31#2,2:172\n14#3:184\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n*L\n43#1:174\n51#1:175\n63#1:176\n71#1:177\n80#1:178\n108#1:179\n115#1:180\n126#1:181\n138#1:182\n148#1:183\n22#1:172,2\n19#1:184\n*E\n"})
/*     */ public final class TaskStorageImpl implements TaskStorage {
/*     */   public TaskStorageImpl(@NotNull Project project) {
/*  22 */     ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     Class<ArtifactRequestExecutorService> serviceClass$iv = ArtifactRequestExecutorService.class;
/* 173 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  ((TaskStorageImpl)$this$service$iv.getService(serviceClass$iv)).caches = ((ArtifactRequestExecutorService)$this$service$iv.getService(serviceClass$iv)).getCaches();
/*     */     this.mutex = MutexKt.Mutex$default(false, 1, null);
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {} }
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null); @NotNull
/*     */   private final MatterhornCaches caches; @NotNull
/*     */   private final Mutex mutex;
/*     */   static { int $i$f$logger = 0;
/* 184 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(TaskStorageImpl.class), "getInstance(...)"); } private final <T> Object preserveInvocationOrder(Function1<? super Continuation<? super T>, ? extends Object> body, Continuation $completion) { int $i$f$preserveInvocationOrder = 0; InlineMarker.mark(0); InlineMarker.mark(1); return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$preserveInvocationOrder$2(body, null), $completion); } @NotNull private static final Logger logger = Logger.getInstance(TaskStorageImpl.class);
/*     */   
/*     */   @DebugMetadata(f = "TaskStorageImpl.kt", l = {177, 37}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorageImpl$preserveInvocationOrder$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n24#2:172\n116#3,10:173\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n*L\n33#1:172\n36#1:173,10\n*E\n"})
/*     */   public static final class TaskStorageImpl$preserveInvocationOrder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     public TaskStorageImpl$preserveInvocationOrder$2(Function1<Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #9
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 260, 0 -> 36, 1 -> 141, 2 -> 206
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: aload_0
/*     */       //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
/*     */       //   52: invokestatic access$getMutex$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lkotlinx/coroutines/sync/Mutex;
/*     */       //   55: invokeinterface isLocked : ()Z
/*     */       //   60: ifeq -> 83
/*     */       //   63: nop
/*     */       //   64: iconst_0
/*     */       //   65: istore #4
/*     */       //   67: ldc kotlinx/coroutines/CoroutineScope
/*     */       //   69: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   72: dup
/*     */       //   73: ldc 'getInstance(...)'
/*     */       //   75: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   78: ldc 'TaskStorage.dispatcher should not allow concurrent execution'
/*     */       //   80: invokevirtual error : (Ljava/lang/String;)V
/*     */       //   83: aload_0
/*     */       //   84: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
/*     */       //   87: invokestatic access$getMutex$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lkotlinx/coroutines/sync/Mutex;
/*     */       //   90: astore_3
/*     */       //   91: aload_0
/*     */       //   92: getfield $body : Lkotlin/jvm/functions/Function1;
/*     */       //   95: astore #5
/*     */       //   97: aconst_null
/*     */       //   98: astore #4
/*     */       //   100: iconst_0
/*     */       //   101: istore #6
/*     */       //   103: nop
/*     */       //   104: aload_3
/*     */       //   105: aload #4
/*     */       //   107: aload_0
/*     */       //   108: checkcast kotlin/coroutines/Continuation
/*     */       //   111: aload_0
/*     */       //   112: aload_3
/*     */       //   113: putfield L$0 : Ljava/lang/Object;
/*     */       //   116: aload_0
/*     */       //   117: aload #5
/*     */       //   119: putfield L$1 : Ljava/lang/Object;
/*     */       //   122: aload_0
/*     */       //   123: iconst_1
/*     */       //   124: putfield label : I
/*     */       //   127: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   132: dup
/*     */       //   133: aload #9
/*     */       //   135: if_acmpne -> 169
/*     */       //   138: aload #9
/*     */       //   140: areturn
/*     */       //   141: iconst_0
/*     */       //   142: istore #6
/*     */       //   144: aload_0
/*     */       //   145: getfield L$1 : Ljava/lang/Object;
/*     */       //   148: checkcast kotlin/jvm/functions/Function1
/*     */       //   151: astore #5
/*     */       //   153: aconst_null
/*     */       //   154: astore #4
/*     */       //   156: aload_0
/*     */       //   157: getfield L$0 : Ljava/lang/Object;
/*     */       //   160: checkcast kotlinx/coroutines/sync/Mutex
/*     */       //   163: astore_3
/*     */       //   164: aload_1
/*     */       //   165: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   168: aload_1
/*     */       //   169: pop
/*     */       //   170: nop
/*     */       //   171: iconst_0
/*     */       //   172: istore #7
/*     */       //   174: aload #5
/*     */       //   176: aload_0
/*     */       //   177: aload_0
/*     */       //   178: aload_3
/*     */       //   179: putfield L$0 : Ljava/lang/Object;
/*     */       //   182: aload_0
/*     */       //   183: aconst_null
/*     */       //   184: putfield L$1 : Ljava/lang/Object;
/*     */       //   187: aload_0
/*     */       //   188: iconst_2
/*     */       //   189: putfield label : I
/*     */       //   192: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   197: dup
/*     */       //   198: aload #9
/*     */       //   200: if_acmpne -> 229
/*     */       //   203: aload #9
/*     */       //   205: areturn
/*     */       //   206: iconst_0
/*     */       //   207: istore #6
/*     */       //   209: iconst_0
/*     */       //   210: istore #7
/*     */       //   212: aconst_null
/*     */       //   213: astore #4
/*     */       //   215: aload_0
/*     */       //   216: getfield L$0 : Ljava/lang/Object;
/*     */       //   219: checkcast kotlinx/coroutines/sync/Mutex
/*     */       //   222: astore_3
/*     */       //   223: nop
/*     */       //   224: aload_1
/*     */       //   225: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   228: aload_1
/*     */       //   229: nop
/*     */       //   230: astore #8
/*     */       //   232: aload_3
/*     */       //   233: aload #4
/*     */       //   235: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   240: goto -> 256
/*     */       //   243: astore #7
/*     */       //   245: aload_3
/*     */       //   246: aload #4
/*     */       //   248: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */       //   253: aload #7
/*     */       //   255: athrow
/*     */       //   256: aload #8
/*     */       //   258: nop
/*     */       //   259: areturn
/*     */       //   260: new java/lang/IllegalStateException
/*     */       //   263: dup
/*     */       //   264: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   266: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   269: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #31	-> 3
/*     */       //   #32	-> 48
/*     */       //   #33	-> 63
/*     */       //   #172	-> 67
/*     */       //   #33	-> 78
/*     */       //   #36	-> 83
/*     */       //   #173	-> 97
/*     */       //   #174	-> 103
/*     */       //   #177	-> 104
/*     */       //   #31	-> 138
/*     */       //   #178	-> 169
/*     */       //   #179	-> 171
/*     */       //   #37	-> 174
/*     */       //   #31	-> 203
/*     */       //   #37	-> 229
/*     */       //   #179	-> 230
/*     */       //   #181	-> 232
/*     */       //   #182	-> 240
/*     */       //   #181	-> 243
/*     */       //   #178	-> 258
/*     */       //   #38	-> 259
/*     */       //   #31	-> 260
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	16	2	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   97	44	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   164	42	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   223	7	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   230	10	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   243	16	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */       //   100	41	4	owner$iv	Ljava/lang/Object;
/*     */       //   164	42	4	owner$iv	Ljava/lang/Object;
/*     */       //   230	10	4	owner$iv	Ljava/lang/Object;
/*     */       //   243	16	4	owner$iv	Ljava/lang/Object;
/*     */       //   67	11	4	$i$f$thisLogger	I
/*     */       //   174	32	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
/*     */       //   103	38	6	$i$f$withLock	I
/*     */       //   0	270	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2;
/*     */       //   40	220	1	$result	Ljava/lang/Object;
/*     */       //   144	62	6	$i$f$withLock	I
/*     */       //   212	18	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
/*     */       //   209	50	6	$i$f$withLock	I
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   170	197	243	finally
/*     */       //   223	232	243	finally
/*     */       //   243	245	243	finally
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend$$forInline(Object $result) {
/*     */       CoroutineScope $this$withContext = (CoroutineScope)this.L$0;
/*     */       if (TaskStorageImpl.this.mutex.isLocked()) {
/*     */         CoroutineScope coroutineScope = $this$withContext;
/*     */         int $i$f$thisLogger = 0;
/*     */         Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CoroutineScope.class), "getInstance(...)");
/*     */       } 
/*     */       Object $this$thisLogger$iv = TaskStorageImpl.this.mutex;
/*     */       Function1<Continuation<? super T>, Object> function1 = this.$body;
/*     */       Object owner$iv = null;
/*     */       int $i$f$withLock = 0;
/*     */       InlineMarker.mark(0);
/*     */       InlineMarker.mark(1);
/*     */       $this$thisLogger$iv.lock(owner$iv, (Continuation)this);
/*     */       try {
/*     */         int $i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1 = 0;
/*     */       } finally {
/*     */         $this$thisLogger$iv.unlock(owner$iv);
/*     */       } 
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskStorageImpl$preserveInvocationOrder$2> $completion) {
/*     */       TaskStorageImpl$preserveInvocationOrder$2 taskStorageImpl$preserveInvocationOrder$2 = new TaskStorageImpl$preserveInvocationOrder$2(this.$body, $completion);
/*     */       taskStorageImpl$preserveInvocationOrder$2.L$0 = value;
/*     */       return (Continuation<Unit>)taskStorageImpl$preserveInvocationOrder$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TaskStorageImpl$preserveInvocationOrder$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object saveTask(@NotNull TaskChainId chainId, @NotNull TaskEntity task, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     if (BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveTask$$inlined$preserveInvocationOrder$1(this_$iv, null, task, chainId, this), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveTask$$inlined$preserveInvocationOrder$1(this_$iv, null, task, chainId, this), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveTask$$inlined$preserveInvocationOrder$1(this_$iv, null, task, chainId, this), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object loadAllTaskIds(@NotNull TaskChainId chainId, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1(this_$iv, null, chainId, this), $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object loadTask(@NotNull TaskChainId chainId, @NotNull TaskId id, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1(this_$iv, null, chainId, id, this), $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object saveStep(@NotNull TaskChainId chainId, int index, @NotNull TaskId taskId, @NotNull StepEntity step, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     if (BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1(this_$iv, null, step, chainId, taskId, index, this), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1(this_$iv, null, step, chainId, taskId, index, this), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1(this_$iv, null, step, chainId, taskId, index, this), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object loadAllSteps(@NotNull TaskChainId chainId, @NotNull TaskId taskId, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1(this_$iv, null, chainId, taskId, this), $completion);
/*     */   }
/*     */   
/*     */   private final Integer parseStepIndexFromFilename(String filename) {
/*     */     Integer integer;
/*     */     try {
/*     */       Regex regex = new Regex("step-(\\d+)\\.json");
/*     */       MatchResult matchResult = regex.matchEntire(filename);
/*     */       matchResult.getGroups().get(1).getValue();
/*     */       integer = (matchResult != null && matchResult.getGroups() != null && matchResult.getGroups().get(1) != null && matchResult.getGroups().get(1).getValue() != null) ? Integer.valueOf(Integer.parseInt(matchResult.getGroups().get(1).getValue())) : null;
/*     */     } catch (NumberFormatException e) {
/*     */       integer = null;
/*     */     } 
/*     */     return integer;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object saveChain(@NotNull TaskChainEntity taskChain, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     if (BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveChain$$inlined$preserveInvocationOrder$1(this_$iv, null, taskChain, this), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveChain$$inlined$preserveInvocationOrder$1(this_$iv, null, taskChain, this), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$saveChain$$inlined$preserveInvocationOrder$1(this_$iv, null, taskChain, this), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object loadAllChainIds(@NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1(this_$iv, null, this), $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object loadChain(@NotNull TaskChainId taskChainId, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$loadChain$$inlined$preserveInvocationOrder$1(this_$iv, null, this, taskChainId), $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object removeTaskChain(@NotNull TaskChainId taskChainId, @NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     if (BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$removeTaskChain$$inlined$preserveInvocationOrder$1(this_$iv, null, taskChainId, this), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$removeTaskChain$$inlined$preserveInvocationOrder$1(this_$iv, null, taskChainId, this), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$removeTaskChain$$inlined$preserveInvocationOrder$1(this_$iv, null, taskChainId, this), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object removeAllTaskChains(@NotNull Continuation $completion) {
/*     */     TaskStorageImpl this_$iv = this;
/*     */     int $i$f$preserveInvocationOrder = 0;
/*     */     if (BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$removeAllTaskChains$$inlined$preserveInvocationOrder$1(this_$iv, null, this), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$removeAllTaskChains$$inlined$preserveInvocationOrder$1(this_$iv, null, this), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)TaskStorage.Companion.getDispatcher(), new TaskStorageImpl$removeAllTaskChains$$inlined$preserveInvocationOrder$1(this_$iv, null, this), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Integer parseIntFromFilename(String filename) {
/*     */     Integer integer;
/*     */     try {
/*     */       Regex regex = new Regex("task-(\\d+)\\.json");
/*     */       MatchResult matchResult = regex.matchEntire(filename);
/*     */       matchResult.getGroups().get(1).getValue();
/*     */       integer = (matchResult != null && matchResult.getGroups() != null && matchResult.getGroups().get(1) != null && matchResult.getGroups().get(1).getValue() != null) ? Integer.valueOf(Integer.parseInt(matchResult.getGroups().get(1).getValue())) : null;
/*     */     } catch (NumberFormatException e) {
/*     */       integer = null;
/*     */     } 
/*     */     return integer;
/*     */   }
/*     */   
/*     */   private final UUID parseUUIDFromFilename(String filename) {
/*     */     UUID uUID;
/*     */     try {
/*     */       uUID = UUID.fromString(filename);
/*     */     } catch (IllegalArgumentException e) {
/*     */       uUID = null;
/*     */     } 
/*     */     return uUID;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */