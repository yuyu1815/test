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

@DebugMetadata(f = "TaskStorageImpl.kt", l = {177}, i = {0}, s = {"L$0"}, n = {"$this$withLock_u24default$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\002\b\002\n\002\030\002\n\000\020\000\032\002H\001\"\004\b\000\020\001*\0020\002H\n¨\006\003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2"})
@SourceDebugExtension({"SMAP\nTaskStorageImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n24#2:172\n116#3,7:173\n124#3,2:204\n52#4,3:180\n55#4:186\n56#4,2:197\n58#4:203\n774#5:183\n865#5,2:184\n1611#5,9:187\n1863#5:196\n1864#5:201\n1620#5:202\n1#6:199\n1#6:200\n*S KotlinDebug\n*F\n+ 1 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$preserveInvocationOrder$2\n+ 2 TaskStorageImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl\n*L\n33#1:172\n36#1:173,7\n36#1:204,2\n54#2:183\n54#2:184,2\n55#2:187,9\n55#2:196\n55#2:201\n55#2:202\n55#2:200\n*E\n"})
public final class TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends TaskId>>, Object> {
  Object L$1;
  
  int label;
  
  public TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1(Continuation $completion, TaskChainId paramTaskChainId, TaskStorageImpl paramTaskStorageImpl1) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Continuation $completion) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield label : I
    //   8: tableswitch default -> 525, 0 -> 32, 1 -> 126
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
    //   169: <illegal opcode> makeConcatWithConstants : (Ljava/util/UUID;Ljava/lang/String;)Ljava/lang/String;
    //   174: astore #9
    //   176: aload_0
    //   177: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   180: invokestatic access$getCaches$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;)Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;
    //   183: getstatic com/intellij/ml/llm/matterhorn/CacheType.Issues : Lcom/intellij/ml/llm/matterhorn/CacheType;
    //   186: invokeinterface loadAllPaths : (Lcom/intellij/ml/llm/matterhorn/CacheType;)Ljava/lang/Iterable;
    //   191: astore #10
    //   193: iconst_0
    //   194: istore #11
    //   196: aload #10
    //   198: astore #12
    //   200: new java/util/ArrayList
    //   203: dup
    //   204: invokespecial <init> : ()V
    //   207: checkcast java/util/Collection
    //   210: astore #13
    //   212: iconst_0
    //   213: istore #14
    //   215: aload #12
    //   217: invokeinterface iterator : ()Ljava/util/Iterator;
    //   222: astore #15
    //   224: aload #15
    //   226: invokeinterface hasNext : ()Z
    //   231: ifeq -> 319
    //   234: aload #15
    //   236: invokeinterface next : ()Ljava/lang/Object;
    //   241: astore #16
    //   243: aload #16
    //   245: checkcast java/lang/String
    //   248: astore #17
    //   250: iconst_0
    //   251: istore #18
    //   253: aload #17
    //   255: aload #9
    //   257: iconst_0
    //   258: iconst_2
    //   259: aconst_null
    //   260: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   263: ifeq -> 302
    //   266: aload #17
    //   268: checkcast java/lang/CharSequence
    //   271: ldc 'task-'
    //   273: checkcast java/lang/CharSequence
    //   276: iconst_0
    //   277: iconst_2
    //   278: aconst_null
    //   279: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
    //   282: ifeq -> 302
    //   285: aload #17
    //   287: ldc '.json'
    //   289: iconst_0
    //   290: iconst_2
    //   291: aconst_null
    //   292: invokestatic endsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
    //   295: ifeq -> 302
    //   298: iconst_1
    //   299: goto -> 303
    //   302: iconst_0
    //   303: ifeq -> 224
    //   306: aload #13
    //   308: aload #16
    //   310: invokeinterface add : (Ljava/lang/Object;)Z
    //   315: pop
    //   316: goto -> 224
    //   319: aload #13
    //   321: checkcast java/util/List
    //   324: nop
    //   325: astore #19
    //   327: aload #19
    //   329: checkcast java/lang/Iterable
    //   332: astore #10
    //   334: iconst_0
    //   335: istore #11
    //   337: aload #10
    //   339: astore #12
    //   341: new java/util/ArrayList
    //   344: dup
    //   345: invokespecial <init> : ()V
    //   348: checkcast java/util/Collection
    //   351: astore #13
    //   353: iconst_0
    //   354: istore #14
    //   356: aload #12
    //   358: astore #15
    //   360: iconst_0
    //   361: istore #16
    //   363: aload #15
    //   365: invokeinterface iterator : ()Ljava/util/Iterator;
    //   370: astore #17
    //   372: aload #17
    //   374: invokeinterface hasNext : ()Z
    //   379: ifeq -> 484
    //   382: aload #17
    //   384: invokeinterface next : ()Ljava/lang/Object;
    //   389: astore #18
    //   391: aload #18
    //   393: astore #20
    //   395: iconst_0
    //   396: istore #21
    //   398: aload #20
    //   400: checkcast java/lang/String
    //   403: astore #22
    //   405: iconst_0
    //   406: istore #23
    //   408: aload #22
    //   410: aload #9
    //   412: checkcast java/lang/CharSequence
    //   415: invokestatic removePrefix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   418: astore #24
    //   420: aload_0
    //   421: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;
    //   424: aload #24
    //   426: invokestatic access$parseIntFromFilename : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl;Ljava/lang/String;)Ljava/lang/Integer;
    //   429: dup
    //   430: ifnull -> 456
    //   433: checkcast java/lang/Number
    //   436: invokevirtual intValue : ()I
    //   439: istore #25
    //   441: iconst_0
    //   442: istore #26
    //   444: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId
    //   447: dup
    //   448: iload #25
    //   450: invokespecial <init> : (I)V
    //   453: goto -> 458
    //   456: pop
    //   457: aconst_null
    //   458: dup
    //   459: ifnull -> 480
    //   462: astore #27
    //   464: iconst_0
    //   465: istore #28
    //   467: aload #13
    //   469: aload #27
    //   471: invokeinterface add : (Ljava/lang/Object;)Z
    //   476: pop
    //   477: goto -> 481
    //   480: pop
    //   481: goto -> 372
    //   484: nop
    //   485: aload #13
    //   487: checkcast java/util/List
    //   490: nop
    //   491: nop
    //   492: nop
    //   493: astore #29
    //   495: aload #4
    //   497: aload #5
    //   499: invokeinterface unlock : (Ljava/lang/Object;)V
    //   504: goto -> 521
    //   507: astore #7
    //   509: aload #4
    //   511: aload #5
    //   513: invokeinterface unlock : (Ljava/lang/Object;)V
    //   518: aload #7
    //   520: athrow
    //   521: aload #29
    //   523: nop
    //   524: areturn
    //   525: new java/lang/IllegalStateException
    //   528: dup
    //   529: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   531: invokespecial <init> : (Ljava/lang/String;)V
    //   534: athrow
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
    //   #182	-> 193
    //   #183	-> 196
    //   #184	-> 215
    //   #182	-> 253
    //   #184	-> 303
    //   #185	-> 319
    //   #183	-> 324
    //   #182	-> 325
    //   #181	-> 325
    //   #186	-> 327
    //   #187	-> 337
    //   #195	-> 356
    //   #196	-> 363
    //   #195	-> 398
    //   #197	-> 408
    //   #198	-> 420
    //   #199	-> 441
    //   #198	-> 444
    //   #198	-> 453
    //   #198	-> 456
    //   #195	-> 458
    //   #200	-> 464
    //   #195	-> 467
    //   #195	-> 477
    //   #195	-> 480
    //   #196	-> 481
    //   #201	-> 484
    //   #202	-> 485
    //   #187	-> 490
    //   #203	-> 491
    //   #37	-> 492
    //   #179	-> 493
    //   #204	-> 495
    //   #205	-> 504
    //   #204	-> 507
    //   #178	-> 523
    //   #38	-> 524
    //   #0	-> 525
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   44	16	3	$this$withContext	Lkotlinx/coroutines/CoroutineScope;
    //   88	38	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   141	351	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   492	12	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   507	17	4	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
    //   91	35	5	owner$iv	Ljava/lang/Object;
    //   141	351	5	owner$iv	Ljava/lang/Object;
    //   492	12	5	owner$iv	Ljava/lang/Object;
    //   507	17	5	owner$iv	Ljava/lang/Object;
    //   176	316	9	baseDir	Ljava/lang/String;
    //   193	19	10	$this$filter$iv	Ljava/lang/Iterable;
    //   334	19	10	$this$mapNotNull$iv	Ljava/lang/Iterable;
    //   212	12	12	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   353	7	12	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
    //   212	109	13	destination$iv$iv	Ljava/util/Collection;
    //   353	134	13	destination$iv$iv	Ljava/util/Collection;
    //   360	12	15	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
    //   243	73	16	element$iv$iv	Ljava/lang/Object;
    //   250	52	17	it	Ljava/lang/String;
    //   391	4	18	element$iv$iv$iv	Ljava/lang/Object;
    //   327	7	19	paths	Ljava/util/List;
    //   395	10	20	element$iv$iv	Ljava/lang/Object;
    //   405	15	22	path	Ljava/lang/String;
    //   420	21	24	filename	Ljava/lang/String;
    //   441	12	25	it	I
    //   464	13	27	it$iv$iv	Ljava/lang/Object;
    //   253	50	18	$i$a$-filter-TaskStorageImpl$loadAllTaskIds$2$paths$1	I
    //   215	106	14	$i$f$filterTo	I
    //   196	129	11	$i$f$filter	I
    //   444	9	26	$i$a$-let-TaskStorageImpl$loadAllTaskIds$2$1$1	I
    //   408	50	23	$i$a$-mapNotNull-TaskStorageImpl$loadAllTaskIds$2$1	I
    //   467	10	28	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
    //   398	83	21	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
    //   363	122	16	$i$f$forEach	I
    //   356	131	14	$i$f$mapNotNullTo	I
    //   337	154	11	$i$f$mapNotNull	I
    //   159	333	8	$i$a$-preserveInvocationOrder-TaskStorageImpl$loadAllTaskIds$2	I
    //   0	535	1	$completion	Lkotlin/coroutines/Continuation;
    //   63	11	5	$i$f$thisLogger	I
    //   151	342	7	$i$a$-withLock$default-TaskStorageImpl$preserveInvocationOrder$2$1	I
    //   94	32	6	$i$f$withLock	I
    //   0	535	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1;
    //   36	489	1	$result	Ljava/lang/Object;
    //   129	395	6	$i$f$withLock	I
    // Exception table:
    //   from	to	target	type
    //   147	495	507	finally
    //   507	509	507	finally
  }
  
  public final Continuation<Unit> create(Object value, Continuation $completion) {
    TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1 taskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1 = new TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1($completion, this.$chainId$inlined, TaskStorageImpl.this);
    taskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1.L$0 = value;
    return (Continuation<Unit>)taskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskStorageImpl$loadAllTaskIds$$inlined$preserveInvocationOrder$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */