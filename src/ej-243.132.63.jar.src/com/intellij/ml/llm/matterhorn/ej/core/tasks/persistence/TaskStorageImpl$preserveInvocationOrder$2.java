/*     */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*     */ 
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ 
/*     */ @DebugMetadata(f = "TaskStorageImpl.kt", l = {177, 37}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorageImpl$preserveInvocationOrder$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\b\n\002\b\002\n\002\030\002\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,171:1\n24#2:172\n116#3,10:173\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n*L\n33#1:172\n36#1:173,10\n*E\n"})
/*     */ public final class TaskStorageImpl$preserveInvocationOrder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
/*     */   Object L$1;
/*     */   int label;
/*     */   
/*     */   public TaskStorageImpl$preserveInvocationOrder$2(Function1<Continuation<? super T>, Object> $body, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #9
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 260, 0 -> 36, 1 -> 141, 2 -> 206
/*     */     //   36: aload_1
/*     */     //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   40: aload_0
/*     */     //   41: getfield L$0 : Ljava/lang/Object;
/*     */     //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   47: astore_2
/*     */     //   48: aload_0
/*     */     //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
/*     */     //   52: invokestatic access$getMutex$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lkotlinx/coroutines/sync/Mutex;
/*     */     //   55: invokeinterface isLocked : ()Z
/*     */     //   60: ifeq -> 83
/*     */     //   63: nop
/*     */     //   64: iconst_0
/*     */     //   65: istore #4
/*     */     //   67: ldc kotlinx/coroutines/CoroutineScope
/*     */     //   69: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   72: dup
/*     */     //   73: ldc 'getInstance(...)'
/*     */     //   75: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   78: ldc 'TaskStorage.dispatcher should not allow concurrent execution'
/*     */     //   80: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   83: aload_0
/*     */     //   84: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
/*     */     //   87: invokestatic access$getMutex$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lkotlinx/coroutines/sync/Mutex;
/*     */     //   90: astore_3
/*     */     //   91: aload_0
/*     */     //   92: getfield $body : Lkotlin/jvm/functions/Function1;
/*     */     //   95: astore #5
/*     */     //   97: aconst_null
/*     */     //   98: astore #4
/*     */     //   100: iconst_0
/*     */     //   101: istore #6
/*     */     //   103: nop
/*     */     //   104: aload_3
/*     */     //   105: aload #4
/*     */     //   107: aload_0
/*     */     //   108: checkcast kotlin/coroutines/Continuation
/*     */     //   111: aload_0
/*     */     //   112: aload_3
/*     */     //   113: putfield L$0 : Ljava/lang/Object;
/*     */     //   116: aload_0
/*     */     //   117: aload #5
/*     */     //   119: putfield L$1 : Ljava/lang/Object;
/*     */     //   122: aload_0
/*     */     //   123: iconst_1
/*     */     //   124: putfield label : I
/*     */     //   127: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   132: dup
/*     */     //   133: aload #9
/*     */     //   135: if_acmpne -> 169
/*     */     //   138: aload #9
/*     */     //   140: areturn
/*     */     //   141: iconst_0
/*     */     //   142: istore #6
/*     */     //   144: aload_0
/*     */     //   145: getfield L$1 : Ljava/lang/Object;
/*     */     //   148: checkcast kotlin/jvm/functions/Function1
/*     */     //   151: astore #5
/*     */     //   153: aconst_null
/*     */     //   154: astore #4
/*     */     //   156: aload_0
/*     */     //   157: getfield L$0 : Ljava/lang/Object;
/*     */     //   160: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   163: astore_3
/*     */     //   164: aload_1
/*     */     //   165: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   168: aload_1
/*     */     //   169: pop
/*     */     //   170: nop
/*     */     //   171: iconst_0
/*     */     //   172: istore #7
/*     */     //   174: aload #5
/*     */     //   176: aload_0
/*     */     //   177: aload_0
/*     */     //   178: aload_3
/*     */     //   179: putfield L$0 : Ljava/lang/Object;
/*     */     //   182: aload_0
/*     */     //   183: aconst_null
/*     */     //   184: putfield L$1 : Ljava/lang/Object;
/*     */     //   187: aload_0
/*     */     //   188: iconst_2
/*     */     //   189: putfield label : I
/*     */     //   192: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   197: dup
/*     */     //   198: aload #9
/*     */     //   200: if_acmpne -> 229
/*     */     //   203: aload #9
/*     */     //   205: areturn
/*     */     //   206: iconst_0
/*     */     //   207: istore #6
/*     */     //   209: iconst_0
/*     */     //   210: istore #7
/*     */     //   212: aconst_null
/*     */     //   213: astore #4
/*     */     //   215: aload_0
/*     */     //   216: getfield L$0 : Ljava/lang/Object;
/*     */     //   219: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   222: astore_3
/*     */     //   223: nop
/*     */     //   224: aload_1
/*     */     //   225: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   228: aload_1
/*     */     //   229: nop
/*     */     //   230: astore #8
/*     */     //   232: aload_3
/*     */     //   233: aload #4
/*     */     //   235: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   240: goto -> 256
/*     */     //   243: astore #7
/*     */     //   245: aload_3
/*     */     //   246: aload #4
/*     */     //   248: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   253: aload #7
/*     */     //   255: athrow
/*     */     //   256: aload #8
/*     */     //   258: nop
/*     */     //   259: areturn
/*     */     //   260: new java/lang/IllegalStateException
/*     */     //   263: dup
/*     */     //   264: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   266: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   269: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #31	-> 3
/*     */     //   #32	-> 48
/*     */     //   #33	-> 63
/*     */     //   #172	-> 67
/*     */     //   #33	-> 78
/*     */     //   #36	-> 83
/*     */     //   #173	-> 97
/*     */     //   #174	-> 103
/*     */     //   #177	-> 104
/*     */     //   #31	-> 138
/*     */     //   #178	-> 169
/*     */     //   #179	-> 171
/*     */     //   #37	-> 174
/*     */     //   #31	-> 203
/*     */     //   #37	-> 229
/*     */     //   #179	-> 230
/*     */     //   #181	-> 232
/*     */     //   #182	-> 240
/*     */     //   #181	-> 243
/*     */     //   #178	-> 258
/*     */     //   #38	-> 259
/*     */     //   #31	-> 260
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   48	16	2	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   97	44	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   164	42	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   223	7	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   230	10	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   243	16	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   100	41	4	owner$iv	Ljava/lang/Object;
/*     */     //   164	42	4	owner$iv	Ljava/lang/Object;
/*     */     //   230	10	4	owner$iv	Ljava/lang/Object;
/*     */     //   243	16	4	owner$iv	Ljava/lang/Object;
/*     */     //   67	11	4	$i$f$thisLogger	I
/*     */     //   174	32	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
/*     */     //   103	38	6	$i$f$withLock	I
/*     */     //   0	270	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2;
/*     */     //   40	220	1	$result	Ljava/lang/Object;
/*     */     //   144	62	6	$i$f$withLock	I
/*     */     //   212	18	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
/*     */     //   209	50	6	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   170	197	243	finally
/*     */     //   223	232	243	finally
/*     */     //   243	245	243	finally
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend$$forInline(Object $result) {
/*  32 */     CoroutineScope $this$withContext = (CoroutineScope)this.L$0; if (TaskStorageImpl.access$getMutex$p(TaskStorageImpl.this).isLocked()) {
/*  33 */       CoroutineScope coroutineScope = $this$withContext; int $i$f$thisLogger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 172 */       Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CoroutineScope.class), "getInstance(...)");
/* 173 */     }  Object $this$thisLogger$iv = TaskStorageImpl.access$getMutex$p(TaskStorageImpl.this); Function1<Continuation<? super T>, Object> function1 = this.$body; Object owner$iv = null; int $i$f$withLock = 0;
/*     */ 
/*     */ 
/*     */     
/* 177 */     InlineMarker.mark(0); InlineMarker.mark(1); $this$thisLogger$iv.lock(owner$iv, (Continuation)this);
/*     */     try {
/* 179 */       int $i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1 = 0;
/*     */     } finally {
/* 181 */       $this$thisLogger$iv.unlock(owner$iv);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super TaskStorageImpl$preserveInvocationOrder$2> $completion) {
/*     */     TaskStorageImpl$preserveInvocationOrder$2 taskStorageImpl$preserveInvocationOrder$2 = new TaskStorageImpl$preserveInvocationOrder$2(this.$body, $completion);
/*     */     taskStorageImpl$preserveInvocationOrder$2.L$0 = value;
/*     */     return (Continuation<Unit>)taskStorageImpl$preserveInvocationOrder$2;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((TaskStorageImpl$preserveInvocationOrder$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl$preserveInvocationOrder$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */