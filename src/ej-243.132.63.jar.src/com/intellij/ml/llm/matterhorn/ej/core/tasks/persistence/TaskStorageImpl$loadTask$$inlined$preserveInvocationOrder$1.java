package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "TaskStorageImpl.kt", l = {177}, i = {0}, s = {"L$0"}, n = {"$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\002\b\002\n\002\030\002\n\000\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n¨\006\003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2"})
@SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,171:1\n24#2:172\n116#3,7:173\n124#3,2:184\n64#4,3:180\n222#5:183\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n*L\n33#1:172\n36#1:173,7\n36#1:184,2\n66#2:183\n*E\n"})
public final class TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TaskEntity>, Object> {
  Object L$1;
  
  int label;
  
  public TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1(Continuation $completion, TaskChainId paramTaskChainId, TaskId paramTaskId, TaskStorageImpl paramTaskStorageImpl1) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Continuation $completion) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 278, 0 -> 32, 1 -> 126
    //   32: aload_1
    //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   36: aload_0
    //   37: getfield L$0 : Ljava/lang/Object;
    //   40: checkcast kotlinx/coroutines/CoroutineScope
    //   43: astore_3
    //   44: aload_0
    //   45: getfield this$0$inline_fun : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   48: invokestatic access$getMutex$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lkotlinx/coroutines/sync/Mutex;
    //   51: invokeinterface isLocked : ()Z
    //   56: ifeq -> 79
    //   59: nop
    //   60: iconst_0
    //   61: istore #5
    //   63: ldc kotlinx/coroutines/CoroutineScope
    //   65: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
    //   68: dup
    //   69: ldc 'getInstance(...)'
    //   71: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   74: ldc 'TaskStorage.dispatcher should not allow concurrent execution'
    //   76: invokevirtual error : (Ljava/lang/String;)V
    //   79: aload_0
    //   80: getfield this$0$inline_fun : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   83: invokestatic access$getMutex$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lkotlinx/coroutines/sync/Mutex;
    //   86: astore #4
    //   88: aconst_null
    //   89: astore #5
    //   91: iconst_0
    //   92: istore #6
    //   94: nop
    //   95: aload #4
    //   97: aload #5
    //   99: aload_0
    //   100: checkcast kotlin/coroutines/Continuation
    //   103: aload_0
    //   104: aload #4
    //   106: putfield L$0 : Ljava/lang/Object;
    //   109: aload_0
    //   110: iconst_1
    //   111: putfield label : I
    //   114: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   119: dup
    //   120: aload_2
    //   121: if_acmpne -> 146
    //   124: aload_2
    //   125: areturn
    //   126: iconst_0
    //   127: istore #6
    //   129: aconst_null
    //   130: astore #5
    //   132: aload_0
    //   133: getfield L$0 : Ljava/lang/Object;
    //   136: checkcast kotlinx/coroutines/sync/Mutex
    //   139: astore #4
    //   141: aload_1
    //   142: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   145: aload_1
    //   146: pop
    //   147: nop
    //   148: iconst_0
    //   149: istore #7
    //   151: aload_0
    //   152: checkcast kotlin/coroutines/Continuation
    //   155: pop
    //   156: iconst_0
    //   157: istore #8
    //   159: aload_0
    //   160: getfield $chainId$inlined : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
    //   163: invokevirtual getId : ()Ljava/util/UUID;
    //   166: getstatic java/io/File.separator : Ljava/lang/String;
    //   169: aload_0
    //   170: getfield $id$inlined : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
    //   173: invokevirtual getIndex : ()I
    //   176: <illegal opcode> makeConcatWithConstants : (Ljava/util/UUID;Ljava/lang/String;I)Ljava/lang/String;
    //   181: astore #9
    //   183: aload_0
    //   184: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   187: invokestatic access$getCaches$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
    //   190: getstatic com/intellij/ml/llm/matterhorn/CacheType.Issues : Lcom/intellij/ml/llm/matterhorn/CacheType;
    //   193: aload #9
    //   195: invokeinterface load : (Lcom/intellij/ml/llm/matterhorn/CacheType;Ljava/lang/String;)Ljava/lang/String;
    //   200: dup
    //   201: ifnonnull -> 209
    //   204: pop
    //   205: aconst_null
    //   206: goto -> 245
    //   209: astore #10
    //   211: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
    //   214: checkcast kotlinx/serialization/json/Json
    //   217: astore #11
    //   219: iconst_0
    //   220: istore #12
    //   222: aload #11
    //   224: aload #11
    //   226: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
    //   229: pop
    //   230: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity$Companion;
    //   233: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   236: checkcast kotlinx/serialization/DeserializationStrategy
    //   239: aload #10
    //   241: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   244: nop
    //   245: nop
    //   246: astore #13
    //   248: aload #4
    //   250: aload #5
    //   252: invokeinterface unlock : (Ljava/lang/Object;)V
    //   257: goto -> 274
    //   260: astore #7
    //   262: aload #4
    //   264: aload #5
    //   266: invokeinterface unlock : (Ljava/lang/Object;)V
    //   271: aload #7
    //   273: athrow
    //   274: aload #13
    //   276: nop
    //   277: areturn
    //   278: new java/lang/IllegalStateException
    //   281: dup
    //   282: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   284: invokespecial <init> : (Ljava/lang/String;)V
    //   287: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #0	-> 3
    //   #32	-> 44
    //   #33	-> 59
    //   #172	-> 63
    //   #33	-> 74
    //   #36	-> 79
    //   #173	-> 88
    //   #174	-> 94
    //   #177	-> 95
    //   #0	-> 124
    //   #178	-> 146
    //   #179	-> 148
    //   #37	-> 151
    //   #180	-> 159
    //   #181	-> 183
    //   #182	-> 211
    //   #183	-> 222
    //   #182	-> 244
    //   #37	-> 245
    //   #179	-> 246
    //   #184	-> 248
    //   #185	-> 257
    //   #184	-> 260
    //   #178	-> 276
    //   #38	-> 277
    //   #0	-> 278
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	16	3	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
    //   88	38	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   141	68	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   209	36	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   245	12	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   260	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   91	35	5	owner$iv	Ljava/lang/Object;
    //   141	68	5	owner$iv	Ljava/lang/Object;
    //   209	36	5	owner$iv	Ljava/lang/Object;
    //   245	12	5	owner$iv	Ljava/lang/Object;
    //   260	17	5	owner$iv	Ljava/lang/Object;
    //   183	62	9	path	Ljava/lang/String;
    //   211	34	10	json	Ljava/lang/String;
    //   219	25	11	this_$iv	Lkotlinx/serialization/json/Json;
    //   222	22	12	$i$f$decodeFromString	I
    //   159	86	8	$i$a$-preserveInvocationOrder-TaskStorageImpl$loadTask$2	I
    //   0	288	1	$completion	Lkotlin/coroutines/Continuation;
    //   63	11	5	$i$f$thisLogger	I
    //   151	95	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
    //   94	32	6	$i$f$withLock	I
    //   0	288	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1;
    //   36	242	1	$result	Ljava/lang/Object;
    //   129	148	6	$i$f$withLock	I
    // Exception table:
    //   from	to	target	type
    //   147	248	260	finally
    //   260	262	260	finally
  }
  
  public final Continuation<Unit> create(Object value, Continuation $completion) {
    TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1 taskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1 = new TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1($completion, this.$chainId$inlined, this.$id$inlined, TaskStorageImpl.this);
    taskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1.L$0 = value;
    return (Continuation<Unit>)taskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl$loadTask$$inlined$preserveInvocationOrder$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */