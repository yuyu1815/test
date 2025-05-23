package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "TaskStorageImpl.kt", l = {177}, i = {0}, s = {"L$0"}, n = {"$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\002\b\002\n\002\030\002\n\000\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n¨\006\003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2"})
@SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Json.kt\nkotlinx/serialization/json/Json\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n24#2:172\n116#3,7:173\n124#3,2:208\n82#4:180\n81#4,4:181\n86#4:188\n90#4:190\n91#4,2:201\n93#4:207\n774#5:185\n865#5,2:186\n1053#5:189\n1611#5,9:191\n1863#5:200\n1864#5:205\n1620#5:206\n222#6:203\n1#7:204\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n*L\n33#1:172\n36#1:173,7\n36#1:208,2\n84#2:185\n84#2:186,2\n86#2:189\n90#2:191,9\n90#2:200\n90#2:205\n90#2:206\n92#2:203\n90#2:204\n*E\n"})
public final class TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends StepEntity>>, Object> {
  Object L$1;
  
  int label;
  
  public TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1(Continuation $completion, TaskChainId paramTaskChainId, TaskId paramTaskId, TaskStorageImpl paramTaskStorageImpl1) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Continuation $completion) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 571, 0 -> 32, 1 -> 126
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
    //   170: getfield $taskId$inlined : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
    //   173: invokevirtual getIndex : ()I
    //   176: getstatic java/io/File.separator : Ljava/lang/String;
    //   179: getstatic java/io/File.separator : Ljava/lang/String;
    //   182: <illegal opcode> makeConcatWithConstants : (Ljava/util/UUID;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   187: astore #9
    //   189: aload_0
    //   190: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   193: invokestatic access$getCaches$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
    //   196: getstatic com/intellij/ml/llm/matterhorn/CacheType.Issues : Lcom/intellij/ml/llm/matterhorn/CacheType;
    //   199: invokeinterface loadAllPaths : (Lcom/intellij/ml/llm/matterhorn/CacheType;)Ljava/lang/Iterable;
    //   204: astore #10
    //   206: aload #10
    //   208: astore #11
    //   210: iconst_0
    //   211: istore #12
    //   213: aload #11
    //   215: astore #13
    //   217: new java/util/ArrayList
    //   220: dup
    //   221: invokespecial <init> : ()V
    //   224: checkcast java/util/Collection
    //   227: astore #14
    //   229: iconst_0
    //   230: istore #15
    //   232: aload #13
    //   234: invokeinterface iterator : ()Ljava/util/Iterator;
    //   239: astore #16
    //   241: aload #16
    //   243: invokeinterface hasNext : ()Z
    //   248: ifeq -> 317
    //   251: aload #16
    //   253: invokeinterface next : ()Ljava/lang/Object;
    //   258: astore #17
    //   260: aload #17
    //   262: checkcast java/lang/String
    //   265: astore #18
    //   267: iconst_0
    //   268: istore #19
    //   270: aload #18
    //   272: aload #9
    //   274: iconst_0
    //   275: iconst_2
    //   276: aconst_null
    //   277: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   280: ifeq -> 300
    //   283: aload #18
    //   285: ldc '.json'
    //   287: iconst_0
    //   288: iconst_2
    //   289: aconst_null
    //   290: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   293: ifeq -> 300
    //   296: iconst_1
    //   297: goto -> 301
    //   300: iconst_0
    //   301: ifeq -> 241
    //   304: aload #14
    //   306: aload #17
    //   308: invokeinterface add : (Ljava/lang/Object;)Z
    //   313: pop
    //   314: goto -> 241
    //   317: aload #14
    //   319: checkcast java/util/List
    //   322: nop
    //   323: astore #20
    //   325: aload #20
    //   327: checkcast java/lang/Iterable
    //   330: astore #12
    //   332: iconst_0
    //   333: istore #13
    //   335: aload #12
    //   337: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$loadAllSteps$lambda$10$$inlined$sortedBy$1
    //   340: dup
    //   341: aload_0
    //   342: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   345: aload #9
    //   347: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;Ljava/lang/String;)V
    //   350: checkcast java/util/Comparator
    //   353: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
    //   356: astore #11
    //   358: aload #11
    //   360: checkcast java/lang/Iterable
    //   363: astore #12
    //   365: iconst_0
    //   366: istore #13
    //   368: aload #12
    //   370: astore #14
    //   372: new java/util/ArrayList
    //   375: dup
    //   376: invokespecial <init> : ()V
    //   379: checkcast java/util/Collection
    //   382: astore #15
    //   384: iconst_0
    //   385: istore #16
    //   387: aload #14
    //   389: astore #17
    //   391: iconst_0
    //   392: istore #18
    //   394: aload #17
    //   396: invokeinterface iterator : ()Ljava/util/Iterator;
    //   401: astore #19
    //   403: aload #19
    //   405: invokeinterface hasNext : ()Z
    //   410: ifeq -> 530
    //   413: aload #19
    //   415: invokeinterface next : ()Ljava/lang/Object;
    //   420: astore #21
    //   422: aload #21
    //   424: astore #22
    //   426: iconst_0
    //   427: istore #23
    //   429: aload #22
    //   431: checkcast java/lang/String
    //   434: astore #24
    //   436: iconst_0
    //   437: istore #25
    //   439: aload_0
    //   440: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   443: invokestatic access$getCaches$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
    //   446: getstatic com/intellij/ml/llm/matterhorn/CacheType.Issues : Lcom/intellij/ml/llm/matterhorn/CacheType;
    //   449: aload #24
    //   451: invokeinterface load : (Lcom/intellij/ml/llm/matterhorn/CacheType;Ljava/lang/String;)Ljava/lang/String;
    //   456: dup
    //   457: ifnonnull -> 465
    //   460: pop
    //   461: aconst_null
    //   462: goto -> 504
    //   465: astore #26
    //   467: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
    //   470: checkcast kotlinx/serialization/json/Json
    //   473: astore #27
    //   475: iconst_0
    //   476: istore #28
    //   478: aload #27
    //   480: aload #27
    //   482: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
    //   485: pop
    //   486: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity$Companion;
    //   489: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
    //   492: checkcast kotlinx/serialization/DeserializationStrategy
    //   495: aload #26
    //   497: invokevirtual decodeFromString : (Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;
    //   500: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
    //   503: nop
    //   504: dup
    //   505: ifnull -> 526
    //   508: astore #29
    //   510: iconst_0
    //   511: istore #30
    //   513: aload #15
    //   515: aload #29
    //   517: invokeinterface add : (Ljava/lang/Object;)Z
    //   522: pop
    //   523: goto -> 527
    //   526: pop
    //   527: goto -> 403
    //   530: nop
    //   531: aload #15
    //   533: checkcast java/util/List
    //   536: nop
    //   537: nop
    //   538: nop
    //   539: astore #31
    //   541: aload #4
    //   543: aload #5
    //   545: invokeinterface unlock : (Ljava/lang/Object;)V
    //   550: goto -> 567
    //   553: astore #7
    //   555: aload #4
    //   557: aload #5
    //   559: invokeinterface unlock : (Ljava/lang/Object;)V
    //   564: aload #7
    //   566: athrow
    //   567: aload #31
    //   569: nop
    //   570: areturn
    //   571: new java/lang/IllegalStateException
    //   574: dup
    //   575: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   577: invokespecial <init> : (Ljava/lang/String;)V
    //   580: athrow
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
    //   #181	-> 187
    //   #183	-> 189
    //   #184	-> 206
    //   #185	-> 213
    //   #186	-> 232
    //   #184	-> 270
    //   #186	-> 301
    //   #187	-> 317
    //   #185	-> 322
    //   #184	-> 323
    //   #188	-> 325
    //   #189	-> 335
    //   #189	-> 353
    //   #188	-> 356
    //   #190	-> 358
    //   #191	-> 368
    //   #199	-> 387
    //   #200	-> 394
    //   #199	-> 429
    //   #201	-> 439
    //   #202	-> 467
    //   #203	-> 478
    //   #202	-> 503
    //   #199	-> 504
    //   #204	-> 510
    //   #199	-> 513
    //   #199	-> 523
    //   #199	-> 526
    //   #200	-> 527
    //   #205	-> 530
    //   #206	-> 531
    //   #191	-> 536
    //   #207	-> 537
    //   #37	-> 538
    //   #179	-> 539
    //   #208	-> 541
    //   #209	-> 550
    //   #208	-> 553
    //   #178	-> 569
    //   #38	-> 570
    //   #0	-> 571
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	16	3	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
    //   88	38	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   141	397	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   538	12	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   553	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   91	35	5	owner$iv	Ljava/lang/Object;
    //   141	397	5	owner$iv	Ljava/lang/Object;
    //   538	12	5	owner$iv	Ljava/lang/Object;
    //   553	17	5	owner$iv	Ljava/lang/Object;
    //   189	164	9	baseDir	Ljava/lang/String;
    //   206	4	10	allPaths	Ljava/lang/Iterable;
    //   210	19	11	$this$filter$iv	Ljava/lang/Iterable;
    //   358	7	11	sortedStepPaths	Ljava/util/List;
    //   332	24	12	$this$sortedBy$iv	Ljava/lang/Iterable;
    //   365	19	12	$this$mapNotNull$iv	Ljava/lang/Iterable;
    //   229	12	13	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   229	90	14	destination$iv$iv	Ljava/util/Collection;
    //   384	7	14	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
    //   384	149	15	destination$iv$iv	Ljava/util/Collection;
    //   260	54	17	element$iv$iv	Ljava/lang/Object;
    //   391	12	17	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
    //   267	33	18	it	Ljava/lang/String;
    //   325	7	20	stepPaths	Ljava/util/List;
    //   422	4	21	element$iv$iv$iv	Ljava/lang/Object;
    //   426	10	22	element$iv$iv	Ljava/lang/Object;
    //   436	68	24	path	Ljava/lang/String;
    //   467	37	26	json	Ljava/lang/String;
    //   475	25	27	this_$iv	Lkotlinx/serialization/json/Json;
    //   510	13	29	it$iv$iv	Ljava/lang/Object;
    //   270	31	19	$i$a$-filter-TaskStorageImpl$loadAllSteps$2$stepPaths$1	I
    //   232	87	15	$i$f$filterTo	I
    //   213	110	12	$i$f$filter	I
    //   335	21	13	$i$f$sortedBy	I
    //   478	22	28	$i$f$decodeFromString	I
    //   439	65	25	$i$a$-mapNotNull-TaskStorageImpl$loadAllSteps$2$1	I
    //   513	10	30	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
    //   429	98	23	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
    //   394	137	18	$i$f$forEach	I
    //   387	146	16	$i$f$mapNotNullTo	I
    //   368	169	13	$i$f$mapNotNull	I
    //   159	379	8	$i$a$-preserveInvocationOrder-TaskStorageImpl$loadAllSteps$2	I
    //   0	581	1	$completion	Lkotlin/coroutines/Continuation;
    //   63	11	5	$i$f$thisLogger	I
    //   151	388	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
    //   94	32	6	$i$f$withLock	I
    //   0	581	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1;
    //   36	535	1	$result	Ljava/lang/Object;
    //   129	441	6	$i$f$withLock	I
    // Exception table:
    //   from	to	target	type
    //   147	541	553	finally
    //   553	555	553	finally
  }
  
  public final Continuation<Unit> create(Object value, Continuation $completion) {
    TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1 taskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1 = new TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1($completion, this.$chainId$inlined, this.$taskId$inlined, TaskStorageImpl.this);
    taskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1.L$0 = value;
    return (Continuation<Unit>)taskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl$loadAllSteps$$inlined$preserveInvocationOrder$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */