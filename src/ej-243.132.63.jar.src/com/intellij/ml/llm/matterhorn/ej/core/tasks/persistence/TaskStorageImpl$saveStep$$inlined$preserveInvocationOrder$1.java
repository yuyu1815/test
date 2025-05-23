package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "TaskStorageImpl.kt", l = {177}, i = {0}, s = {"L$0"}, n = {"$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\002\b\002\n\002\030\002\n\000\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n¨\006\003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2"})
@SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n+ 5 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,171:1\n24#2:172\n116#3,7:173\n124#3,2:187\n72#4:180\n74#4:182\n73#4,4:183\n205#5:181\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n*L\n33#1:172\n36#1:173,7\n36#1:187,2\n72#2:181\n*E\n"})
public final class TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  Object L$1;
  
  int label;
  
  public TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1(Continuation $completion, StepEntity paramStepEntity, TaskChainId paramTaskChainId, TaskId paramTaskId, int paramInt, TaskStorageImpl paramTaskStorageImpl1) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Continuation $completion) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 285, 0 -> 32, 1 -> 126
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
    //   159: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
    //   162: checkcast kotlinx/serialization/json/Json
    //   165: astore #9
    //   167: iconst_0
    //   168: istore #10
    //   170: aload #9
    //   172: aload #9
    //   174: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
    //   177: pop
    //   178: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity$Companion;
    //   181: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   184: checkcast kotlinx/serialization/SerializationStrategy
    //   187: aload_0
    //   188: getfield $step$inlined : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
    //   191: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
    //   194: astore #11
    //   196: aload_0
    //   197: getfield $chainId$inlined : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
    //   200: invokevirtual getId : ()Ljava/util/UUID;
    //   203: getstatic java/io/File.separator : Ljava/lang/String;
    //   206: aload_0
    //   207: getfield $taskId$inlined : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
    //   210: invokevirtual getIndex : ()I
    //   213: getstatic java/io/File.separator : Ljava/lang/String;
    //   216: getstatic java/io/File.separator : Ljava/lang/String;
    //   219: aload_0
    //   220: getfield $index$inlined : I
    //   223: <illegal opcode> makeConcatWithConstants : (Ljava/util/UUID;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   228: astore #9
    //   230: aload_0
    //   231: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   234: invokestatic access$getCaches$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
    //   237: getstatic com/intellij/ml/llm/matterhorn/CacheType.Issues : Lcom/intellij/ml/llm/matterhorn/CacheType;
    //   240: aload #9
    //   242: aload #11
    //   244: invokeinterface save : (Lcom/intellij/ml/llm/matterhorn/CacheType;Ljava/lang/String;Ljava/lang/String;)V
    //   249: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   252: nop
    //   253: astore #12
    //   255: aload #4
    //   257: aload #5
    //   259: invokeinterface unlock : (Ljava/lang/Object;)V
    //   264: goto -> 281
    //   267: astore #7
    //   269: aload #4
    //   271: aload #5
    //   273: invokeinterface unlock : (Ljava/lang/Object;)V
    //   278: aload #7
    //   280: athrow
    //   281: aload #12
    //   283: nop
    //   284: areturn
    //   285: new java/lang/IllegalStateException
    //   288: dup
    //   289: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   291: invokespecial <init> : (Ljava/lang/String;)V
    //   294: athrow
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
    //   #181	-> 170
    //   #180	-> 194
    //   #182	-> 196
    //   #183	-> 228
    //   #185	-> 230
    //   #186	-> 249
    //   #37	-> 252
    //   #179	-> 253
    //   #187	-> 255
    //   #188	-> 264
    //   #187	-> 267
    //   #178	-> 283
    //   #38	-> 284
    //   #0	-> 285
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	16	3	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
    //   88	38	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   141	111	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   252	12	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   267	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   91	35	5	owner$iv	Ljava/lang/Object;
    //   141	111	5	owner$iv	Ljava/lang/Object;
    //   252	12	5	owner$iv	Ljava/lang/Object;
    //   267	17	5	owner$iv	Ljava/lang/Object;
    //   167	27	9	this_$iv	Lkotlinx/serialization/json/Json;
    //   230	22	9	path	Ljava/lang/String;
    //   196	56	11	jsonString	Ljava/lang/String;
    //   170	24	10	$i$f$encodeToString	I
    //   159	93	8	$i$a$-preserveInvocationOrder-TaskStorageImpl$saveStep$2	I
    //   0	295	1	$completion	Lkotlin/coroutines/Continuation;
    //   63	11	5	$i$f$thisLogger	I
    //   151	102	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
    //   94	32	6	$i$f$withLock	I
    //   0	295	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1;
    //   36	249	1	$result	Ljava/lang/Object;
    //   129	155	6	$i$f$withLock	I
    // Exception table:
    //   from	to	target	type
    //   147	255	267	finally
    //   267	269	267	finally
  }
  
  public final Continuation<Unit> create(Object value, Continuation $completion) {
    TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1 taskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1 = new TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1($completion, this.$step$inlined, this.$chainId$inlined, this.$taskId$inlined, this.$index$inlined, TaskStorageImpl.this);
    taskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1.L$0 = value;
    return (Continuation<Unit>)taskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl$saveStep$$inlined$preserveInvocationOrder$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */