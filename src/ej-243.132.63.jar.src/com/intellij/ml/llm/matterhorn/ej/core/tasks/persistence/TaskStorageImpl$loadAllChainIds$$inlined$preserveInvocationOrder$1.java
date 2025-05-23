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

@DebugMetadata(f = "TaskStorageImpl.kt", l = {177}, i = {0}, s = {"L$0"}, n = {"$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\002\b\002\n\002\030\002\n\000\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n¨\006\003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2"})
@SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n24#2:172\n116#3,7:173\n124#3,2:203\n116#4,2:180\n118#4:185\n120#4:196\n119#4:197\n121#4:202\n774#5:182\n865#5,2:183\n1611#5,9:186\n1863#5:195\n1864#5:200\n1620#5:201\n1#6:198\n1#6:199\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n*L\n33#1:172\n36#1:173,7\n36#1:203,2\n117#2:182\n117#2:183,2\n118#2:186,9\n118#2:195\n118#2:200\n118#2:201\n118#2:199\n*E\n"})
public final class TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TaskChainId>>, Object> {
  Object L$1;
  
  int label;
  
  public TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1(Continuation $completion, TaskStorageImpl paramTaskStorageImpl1) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Continuation $completion) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 517, 0 -> 32, 1 -> 126
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
    //   160: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   163: invokestatic access$getCaches$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
    //   166: getstatic com/intellij/ml/llm/matterhorn/CacheType.Issues : Lcom/intellij/ml/llm/matterhorn/CacheType;
    //   169: invokeinterface loadAllPaths : (Lcom/intellij/ml/llm/matterhorn/CacheType;)Ljava/lang/Iterable;
    //   174: astore #9
    //   176: aload #9
    //   178: astore #10
    //   180: iconst_0
    //   181: istore #11
    //   183: aload #10
    //   185: astore #12
    //   187: new java/util/ArrayList
    //   190: dup
    //   191: invokespecial <init> : ()V
    //   194: checkcast java/util/Collection
    //   197: astore #13
    //   199: iconst_0
    //   200: istore #14
    //   202: aload #12
    //   204: invokeinterface iterator : ()Ljava/util/Iterator;
    //   209: astore #15
    //   211: aload #15
    //   213: invokeinterface hasNext : ()Z
    //   218: ifeq -> 313
    //   221: aload #15
    //   223: invokeinterface next : ()Ljava/lang/Object;
    //   228: astore #16
    //   230: aload #16
    //   232: checkcast java/lang/String
    //   235: astore #17
    //   237: iconst_0
    //   238: istore #18
    //   240: aload #17
    //   242: ldc 'chain-'
    //   244: iconst_0
    //   245: iconst_2
    //   246: aconst_null
    //   247: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   250: ifeq -> 296
    //   253: aload #17
    //   255: ldc '.json'
    //   257: iconst_0
    //   258: iconst_2
    //   259: aconst_null
    //   260: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   263: ifeq -> 296
    //   266: aload #17
    //   268: checkcast java/lang/CharSequence
    //   271: getstatic java/io/File.separator : Ljava/lang/String;
    //   274: dup
    //   275: ldc 'separator'
    //   277: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   280: checkcast java/lang/CharSequence
    //   283: iconst_0
    //   284: iconst_2
    //   285: aconst_null
    //   286: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   289: ifne -> 296
    //   292: iconst_1
    //   293: goto -> 297
    //   296: iconst_0
    //   297: ifeq -> 211
    //   300: aload #13
    //   302: aload #16
    //   304: invokeinterface add : (Ljava/lang/Object;)Z
    //   309: pop
    //   310: goto -> 211
    //   313: aload #13
    //   315: checkcast java/util/List
    //   318: nop
    //   319: checkcast java/lang/Iterable
    //   322: astore #10
    //   324: iconst_0
    //   325: istore #11
    //   327: aload #10
    //   329: astore #12
    //   331: new java/util/ArrayList
    //   334: dup
    //   335: invokespecial <init> : ()V
    //   338: checkcast java/util/Collection
    //   341: astore #13
    //   343: iconst_0
    //   344: istore #14
    //   346: aload #12
    //   348: astore #15
    //   350: iconst_0
    //   351: istore #16
    //   353: aload #15
    //   355: invokeinterface iterator : ()Ljava/util/Iterator;
    //   360: astore #17
    //   362: aload #17
    //   364: invokeinterface hasNext : ()Z
    //   369: ifeq -> 476
    //   372: aload #17
    //   374: invokeinterface next : ()Ljava/lang/Object;
    //   379: astore #18
    //   381: aload #18
    //   383: astore #19
    //   385: iconst_0
    //   386: istore #20
    //   388: aload #19
    //   390: checkcast java/lang/String
    //   393: astore #21
    //   395: iconst_0
    //   396: istore #22
    //   398: aload_0
    //   399: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   402: aload #21
    //   404: ldc 'chain-'
    //   406: checkcast java/lang/CharSequence
    //   409: invokestatic removePrefix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   412: ldc '.json'
    //   414: checkcast java/lang/CharSequence
    //   417: invokestatic removeSuffix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   420: invokestatic access$parseUUIDFromFilename : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;Ljava/lang/String;)Ljava/util/UUID;
    //   423: astore #23
    //   425: aload #23
    //   427: ifnull -> 449
    //   430: aload #23
    //   432: astore #24
    //   434: iconst_0
    //   435: istore #25
    //   437: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId
    //   440: dup
    //   441: aload #24
    //   443: invokespecial <init> : (Ljava/util/UUID;)V
    //   446: goto -> 450
    //   449: aconst_null
    //   450: dup
    //   451: ifnull -> 472
    //   454: astore #26
    //   456: iconst_0
    //   457: istore #27
    //   459: aload #13
    //   461: aload #26
    //   463: invokeinterface add : (Ljava/lang/Object;)Z
    //   468: pop
    //   469: goto -> 473
    //   472: pop
    //   473: goto -> 362
    //   476: nop
    //   477: aload #13
    //   479: checkcast java/util/List
    //   482: nop
    //   483: nop
    //   484: nop
    //   485: astore #28
    //   487: aload #4
    //   489: aload #5
    //   491: invokeinterface unlock : (Ljava/lang/Object;)V
    //   496: goto -> 513
    //   499: astore #7
    //   501: aload #4
    //   503: aload #5
    //   505: invokeinterface unlock : (Ljava/lang/Object;)V
    //   510: aload #7
    //   512: athrow
    //   513: aload #28
    //   515: nop
    //   516: areturn
    //   517: new java/lang/IllegalStateException
    //   520: dup
    //   521: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   523: invokespecial <init> : (Ljava/lang/String;)V
    //   526: athrow
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
    //   #181	-> 176
    //   #182	-> 183
    //   #183	-> 202
    //   #181	-> 240
    //   #183	-> 297
    //   #184	-> 313
    //   #182	-> 318
    //   #185	-> 324
    //   #186	-> 327
    //   #194	-> 346
    //   #195	-> 353
    //   #194	-> 388
    //   #196	-> 398
    //   #197	-> 398
    //   #196	-> 425
    //   #197	-> 430
    //   #196	-> 432
    //   #198	-> 434
    //   #196	-> 437
    //   #196	-> 446
    //   #196	-> 449
    //   #194	-> 450
    //   #199	-> 456
    //   #194	-> 459
    //   #194	-> 469
    //   #194	-> 472
    //   #195	-> 473
    //   #200	-> 476
    //   #201	-> 477
    //   #186	-> 482
    //   #202	-> 483
    //   #37	-> 484
    //   #179	-> 485
    //   #203	-> 487
    //   #204	-> 496
    //   #203	-> 499
    //   #178	-> 515
    //   #38	-> 516
    //   #0	-> 517
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	16	3	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
    //   88	38	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   141	343	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   484	12	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   499	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   91	35	5	owner$iv	Ljava/lang/Object;
    //   141	343	5	owner$iv	Ljava/lang/Object;
    //   484	12	5	owner$iv	Ljava/lang/Object;
    //   499	17	5	owner$iv	Ljava/lang/Object;
    //   176	4	9	paths	Ljava/lang/Iterable;
    //   180	19	10	$this$filter$iv	Ljava/lang/Iterable;
    //   324	19	10	$this$mapNotNull$iv	Ljava/lang/Iterable;
    //   199	12	12	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   343	7	12	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
    //   199	116	13	destination$iv$iv	Ljava/util/Collection;
    //   343	136	13	destination$iv$iv	Ljava/util/Collection;
    //   350	12	15	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
    //   230	80	16	element$iv$iv	Ljava/lang/Object;
    //   237	59	17	it	Ljava/lang/String;
    //   381	4	18	element$iv$iv$iv	Ljava/lang/Object;
    //   385	10	19	element$iv$iv	Ljava/lang/Object;
    //   395	30	21	it	Ljava/lang/String;
    //   434	12	24	uuid	Ljava/util/UUID;
    //   456	13	26	it$iv$iv	Ljava/lang/Object;
    //   240	57	18	$i$a$-filter-TaskStorageImpl$loadAllChainIds$2$1	I
    //   202	113	14	$i$f$filterTo	I
    //   183	136	11	$i$f$filter	I
    //   437	9	25	$i$a$-let-TaskStorageImpl$loadAllChainIds$2$2$1	I
    //   398	52	22	$i$a$-mapNotNull-TaskStorageImpl$loadAllChainIds$2$2	I
    //   459	10	27	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
    //   388	85	20	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
    //   353	124	16	$i$f$forEach	I
    //   346	133	14	$i$f$mapNotNullTo	I
    //   327	156	11	$i$f$mapNotNull	I
    //   159	325	8	$i$a$-preserveInvocationOrder-TaskStorageImpl$loadAllChainIds$2	I
    //   0	527	1	$completion	Lkotlin/coroutines/Continuation;
    //   63	11	5	$i$f$thisLogger	I
    //   151	334	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
    //   94	32	6	$i$f$withLock	I
    //   0	527	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1;
    //   36	481	1	$result	Ljava/lang/Object;
    //   129	387	6	$i$f$withLock	I
    // Exception table:
    //   from	to	target	type
    //   147	487	499	finally
    //   499	501	499	finally
  }
  
  public final Continuation<Unit> create(Object value, Continuation $completion) {
    TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1 taskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1 = new TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1($completion, TaskStorageImpl.this);
    taskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1.L$0 = value;
    return (Continuation<Unit>)taskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl$loadAllChainIds$$inlined$preserveInvocationOrder$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */