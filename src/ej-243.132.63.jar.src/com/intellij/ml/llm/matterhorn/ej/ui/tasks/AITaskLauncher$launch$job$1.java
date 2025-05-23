/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistorySnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TerminalState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskEntity;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.channels.Channel;
/*     */ import kotlinx.coroutines.channels.SendChannel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @DebugMetadata(f = "AITaskLauncher.kt", l = {71, 73, 73, 170, 171}, i = {0, 1, 2}, s = {"L$0", "L$0", "L$0"}, n = {"$this$launch", "$this$launch", "$this$launch"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$launch$job$1")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nAITaskLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITaskLauncher.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/*     */ final class AITaskLauncher$launch$job$1
/*     */   extends SuspendLambda
/*     */   implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */ {
/*     */   Object L$1;
/*     */   int label;
/*     */   
/*     */   AITaskLauncher$launch$job$1(TaskSnapshotUpdater $updater, Channel<StepBuildingEvent> $channel, AITaskLauncher $receiver, Project $project, TaskEntity $task, StepsBuildingContextListener $listener, TaskChainId $chainId, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   3: astore #7
/*     */     //   5: aload_0
/*     */     //   6: getfield label : I
/*     */     //   9: tableswitch default -> 446, 0 -> 48, 1 -> 107, 2 -> 153, 3 -> 215, 4 -> 403, 5 -> 436
/*     */     //   48: aload_1
/*     */     //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   52: aload_0
/*     */     //   53: getfield L$0 : Ljava/lang/Object;
/*     */     //   56: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   59: astore_2
/*     */     //   60: aload_0
/*     */     //   61: getfield $channelSmartModeNotify : Lkotlinx/coroutines/channels/Channel;
/*     */     //   64: invokeinterface isEmpty : ()Z
/*     */     //   69: ifeq -> 121
/*     */     //   72: aload_0
/*     */     //   73: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   76: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingSmartMode : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   79: aload_0
/*     */     //   80: checkcast kotlin/coroutines/Continuation
/*     */     //   83: aload_0
/*     */     //   84: aload_2
/*     */     //   85: putfield L$0 : Ljava/lang/Object;
/*     */     //   88: aload_0
/*     */     //   89: iconst_1
/*     */     //   90: putfield label : I
/*     */     //   93: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   98: dup
/*     */     //   99: aload #7
/*     */     //   101: if_acmpne -> 120
/*     */     //   104: aload #7
/*     */     //   106: areturn
/*     */     //   107: aload_0
/*     */     //   108: getfield L$0 : Ljava/lang/Object;
/*     */     //   111: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   114: astore_2
/*     */     //   115: aload_1
/*     */     //   116: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   119: aload_1
/*     */     //   120: pop
/*     */     //   121: aload_0
/*     */     //   122: getfield $channelSmartModeNotify : Lkotlinx/coroutines/channels/Channel;
/*     */     //   125: aload_0
/*     */     //   126: checkcast kotlin/coroutines/Continuation
/*     */     //   129: aload_0
/*     */     //   130: aload_2
/*     */     //   131: putfield L$0 : Ljava/lang/Object;
/*     */     //   134: aload_0
/*     */     //   135: iconst_2
/*     */     //   136: putfield label : I
/*     */     //   139: invokeinterface receive : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   144: dup
/*     */     //   145: aload #7
/*     */     //   147: if_acmpne -> 166
/*     */     //   150: aload #7
/*     */     //   152: areturn
/*     */     //   153: aload_0
/*     */     //   154: getfield L$0 : Ljava/lang/Object;
/*     */     //   157: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   160: astore_2
/*     */     //   161: aload_1
/*     */     //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   165: aload_1
/*     */     //   166: pop
/*     */     //   167: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   170: astore_3
/*     */     //   171: aload_0
/*     */     //   172: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   175: astore #4
/*     */     //   177: iconst_0
/*     */     //   178: istore #6
/*     */     //   180: aload #4
/*     */     //   182: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Running : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   185: aload_0
/*     */     //   186: aload_0
/*     */     //   187: aload_2
/*     */     //   188: putfield L$0 : Ljava/lang/Object;
/*     */     //   191: aload_0
/*     */     //   192: aload_3
/*     */     //   193: putfield L$1 : Ljava/lang/Object;
/*     */     //   196: aload_0
/*     */     //   197: iconst_3
/*     */     //   198: putfield label : I
/*     */     //   201: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   206: dup
/*     */     //   207: aload #7
/*     */     //   209: if_acmpne -> 239
/*     */     //   212: aload #7
/*     */     //   214: areturn
/*     */     //   215: iconst_0
/*     */     //   216: istore #6
/*     */     //   218: aload_0
/*     */     //   219: getfield L$1 : Ljava/lang/Object;
/*     */     //   222: checkcast kotlin/Unit
/*     */     //   225: astore_3
/*     */     //   226: aload_0
/*     */     //   227: getfield L$0 : Ljava/lang/Object;
/*     */     //   230: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   233: astore_2
/*     */     //   234: aload_1
/*     */     //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   238: aload_1
/*     */     //   239: pop
/*     */     //   240: nop
/*     */     //   241: aload_2
/*     */     //   242: new kotlinx/coroutines/CoroutineName
/*     */     //   245: dup
/*     */     //   246: ldc 'LinearTreeConversion'
/*     */     //   248: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   251: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   254: aconst_null
/*     */     //   255: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$linearTreeConversionJob$1
/*     */     //   258: dup
/*     */     //   259: aload_0
/*     */     //   260: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   263: aload_0
/*     */     //   264: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */     //   267: aconst_null
/*     */     //   268: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
/*     */     //   271: checkcast kotlin/jvm/functions/Function2
/*     */     //   274: iconst_2
/*     */     //   275: aconst_null
/*     */     //   276: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */     //   279: astore_3
/*     */     //   280: aload_2
/*     */     //   281: invokeinterface getCoroutineContext : ()Lkotlin/coroutines/CoroutineContext;
/*     */     //   286: invokestatic getJob : (Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Job;
/*     */     //   289: astore #4
/*     */     //   291: aload_2
/*     */     //   292: new kotlinx/coroutines/CoroutineName
/*     */     //   295: dup
/*     */     //   296: ldc 'submitTask'
/*     */     //   298: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   301: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   304: aconst_null
/*     */     //   305: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$taskJob$1
/*     */     //   308: dup
/*     */     //   309: aload_0
/*     */     //   310: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;
/*     */     //   313: aload_0
/*     */     //   314: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */     //   317: aload_0
/*     */     //   318: getfield $task : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;
/*     */     //   321: aload_0
/*     */     //   322: getfield $listener : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;
/*     */     //   325: aload #4
/*     */     //   327: aload_0
/*     */     //   328: getfield $chainId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   331: aload_0
/*     */     //   332: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   335: aload_0
/*     */     //   336: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */     //   339: aconst_null
/*     */     //   340: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher;Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepsBuildingContextListener;Lkotlinx/coroutines/Job;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;Lkotlinx/coroutines/channels/Channel;Lkotlin/coroutines/Continuation;)V
/*     */     //   343: checkcast kotlin/jvm/functions/Function2
/*     */     //   346: iconst_2
/*     */     //   347: aconst_null
/*     */     //   348: invokestatic launch$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;
/*     */     //   351: astore #5
/*     */     //   353: iconst_2
/*     */     //   354: anewarray kotlinx/coroutines/Job
/*     */     //   357: astore #6
/*     */     //   359: aload #6
/*     */     //   361: iconst_0
/*     */     //   362: aload #5
/*     */     //   364: aastore
/*     */     //   365: aload #6
/*     */     //   367: iconst_1
/*     */     //   368: aload_3
/*     */     //   369: aastore
/*     */     //   370: aload #6
/*     */     //   372: aload_0
/*     */     //   373: checkcast kotlin/coroutines/Continuation
/*     */     //   376: aload_0
/*     */     //   377: aconst_null
/*     */     //   378: putfield L$0 : Ljava/lang/Object;
/*     */     //   381: aload_0
/*     */     //   382: aconst_null
/*     */     //   383: putfield L$1 : Ljava/lang/Object;
/*     */     //   386: aload_0
/*     */     //   387: iconst_4
/*     */     //   388: putfield label : I
/*     */     //   391: invokestatic joinAll : ([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   394: dup
/*     */     //   395: aload #7
/*     */     //   397: if_acmpne -> 408
/*     */     //   400: aload #7
/*     */     //   402: areturn
/*     */     //   403: aload_1
/*     */     //   404: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   407: aload_1
/*     */     //   408: pop
/*     */     //   409: aload_0
/*     */     //   410: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   413: aload_0
/*     */     //   414: checkcast kotlin/coroutines/Continuation
/*     */     //   417: aload_0
/*     */     //   418: iconst_5
/*     */     //   419: putfield label : I
/*     */     //   422: invokeinterface complete : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   427: dup
/*     */     //   428: aload #7
/*     */     //   430: if_acmpne -> 441
/*     */     //   433: aload #7
/*     */     //   435: areturn
/*     */     //   436: aload_1
/*     */     //   437: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   440: aload_1
/*     */     //   441: pop
/*     */     //   442: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   445: areturn
/*     */     //   446: new java/lang/IllegalStateException
/*     */     //   449: dup
/*     */     //   450: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   452: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   455: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 3
/*     */     //   #70	-> 60
/*     */     //   #71	-> 72
/*     */     //   #69	-> 104
/*     */     //   #73	-> 120
/*     */     //   #69	-> 150
/*     */     //   #317	-> 166
/*     */     //   #73	-> 180
/*     */     //   #69	-> 212
/*     */     //   #73	-> 239
/*     */     //   #73	-> 240
/*     */     //   #75	-> 241
/*     */     //   #164	-> 280
/*     */     //   #165	-> 291
/*     */     //   #170	-> 353
/*     */     //   #69	-> 400
/*     */     //   #171	-> 408
/*     */     //   #69	-> 433
/*     */     //   #172	-> 441
/*     */     //   #69	-> 446
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   60	47	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   115	38	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   161	54	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   234	6	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   240	1	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   241	112	2	$this$launch	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   280	92	3	linearTreeConversionJob	Lkotlinx/coroutines/Job;
/*     */     //   291	62	4	topLevelJob	Lkotlinx/coroutines/Job;
/*     */     //   353	19	5	taskJob	Lkotlinx/coroutines/Job;
/*     */     //   180	35	6	$i$a$-also-AITaskLauncher$launch$job$1$1	I
/*     */     //   0	456	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1;
/*     */     //   52	394	1	$result	Ljava/lang/Object;
/*     */     //   218	22	6	$i$a$-also-AITaskLauncher$launch$job$1$1	I
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$launch$job$1> $completion) {
/*     */     AITaskLauncher$launch$job$1 aITaskLauncher$launch$job$1 = new AITaskLauncher$launch$job$1(this.$updater, this.$channel, AITaskLauncher.this, this.$project, this.$task, this.$listener, this.$chainId, $completion);
/*     */     aITaskLauncher$launch$job$1.L$0 = value;
/*     */     return (Continuation<Unit>)aITaskLauncher$launch$job$1;
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((AITaskLauncher$launch$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AITaskLauncher.kt", l = {78, 81, 136, 137, 159}, i = {0, 1, 2, 3, 4}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"}, n = {"steps", "steps", "steps", "steps", "steps"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$launch$job$1$linearTreeConversionJob$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nAITaskLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AITaskLauncher.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$linearTreeConversionJob$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
/*     */   static final class AITaskLauncher$launch$job$1$linearTreeConversionJob$1
/*     */     extends SuspendLambda
/*     */     implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */   {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AITaskLauncher$launch$job$1$linearTreeConversionJob$1(TaskSnapshotUpdater $updater, Channel<StepBuildingEvent> $channel, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #7
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 898, 0 -> 48, 1 -> 120, 2 -> 218, 3 -> 640, 4 -> 702, 5 -> 861
/*     */       //   48: aload_1
/*     */       //   49: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   52: new kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   55: dup
/*     */       //   56: invokespecial <init> : ()V
/*     */       //   59: astore_2
/*     */       //   60: aload_2
/*     */       //   61: aload_0
/*     */       //   62: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   65: invokeinterface getValue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */       //   70: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*     */       //   73: putfield element : Ljava/lang/Object;
/*     */       //   76: aload_0
/*     */       //   77: getfield $channel : Lkotlinx/coroutines/channels/Channel;
/*     */       //   80: invokeinterface iterator : ()Lkotlinx/coroutines/channels/ChannelIterator;
/*     */       //   85: astore_3
/*     */       //   86: aload_3
/*     */       //   87: aload_0
/*     */       //   88: checkcast kotlin/coroutines/Continuation
/*     */       //   91: aload_0
/*     */       //   92: aload_2
/*     */       //   93: putfield L$0 : Ljava/lang/Object;
/*     */       //   96: aload_0
/*     */       //   97: aload_3
/*     */       //   98: putfield L$1 : Ljava/lang/Object;
/*     */       //   101: aload_0
/*     */       //   102: iconst_1
/*     */       //   103: putfield label : I
/*     */       //   106: invokeinterface hasNext : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   111: dup
/*     */       //   112: aload #7
/*     */       //   114: if_acmpne -> 141
/*     */       //   117: aload #7
/*     */       //   119: areturn
/*     */       //   120: aload_0
/*     */       //   121: getfield L$1 : Ljava/lang/Object;
/*     */       //   124: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */       //   127: astore_3
/*     */       //   128: aload_0
/*     */       //   129: getfield L$0 : Ljava/lang/Object;
/*     */       //   132: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   135: astore_2
/*     */       //   136: aload_1
/*     */       //   137: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   140: aload_1
/*     */       //   141: checkcast java/lang/Boolean
/*     */       //   144: invokevirtual booleanValue : ()Z
/*     */       //   147: ifeq -> 894
/*     */       //   150: aload_3
/*     */       //   151: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   156: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent
/*     */       //   159: astore #4
/*     */       //   161: aload #4
/*     */       //   163: astore #5
/*     */       //   165: aload #5
/*     */       //   167: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$NameAppeared
/*     */       //   170: ifeq -> 243
/*     */       //   173: aload_0
/*     */       //   174: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   177: aload #4
/*     */       //   179: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$NameAppeared
/*     */       //   182: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   185: aload_0
/*     */       //   186: checkcast kotlin/coroutines/Continuation
/*     */       //   189: aload_0
/*     */       //   190: aload_2
/*     */       //   191: putfield L$0 : Ljava/lang/Object;
/*     */       //   194: aload_0
/*     */       //   195: aload_3
/*     */       //   196: putfield L$1 : Ljava/lang/Object;
/*     */       //   199: aload_0
/*     */       //   200: iconst_2
/*     */       //   201: putfield label : I
/*     */       //   204: invokeinterface tryUpdateName : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   209: dup
/*     */       //   210: aload #7
/*     */       //   212: if_acmpne -> 239
/*     */       //   215: aload #7
/*     */       //   217: areturn
/*     */       //   218: aload_0
/*     */       //   219: getfield L$1 : Ljava/lang/Object;
/*     */       //   222: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */       //   225: astore_3
/*     */       //   226: aload_0
/*     */       //   227: getfield L$0 : Ljava/lang/Object;
/*     */       //   230: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   233: astore_2
/*     */       //   234: aload_1
/*     */       //   235: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   238: aload_1
/*     */       //   239: pop
/*     */       //   240: goto -> 86
/*     */       //   243: aload #5
/*     */       //   245: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */       //   248: ifeq -> 427
/*     */       //   251: aload #4
/*     */       //   253: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */       //   256: invokevirtual getIndex : ()I
/*     */       //   259: iconst_1
/*     */       //   260: iadd
/*     */       //   261: aload_2
/*     */       //   262: getfield element : Ljava/lang/Object;
/*     */       //   265: checkcast kotlinx/collections/immutable/PersistentList
/*     */       //   268: invokeinterface size : ()I
/*     */       //   273: if_icmpgt -> 280
/*     */       //   276: iconst_1
/*     */       //   277: goto -> 281
/*     */       //   280: iconst_0
/*     */       //   281: ifne -> 327
/*     */       //   284: iconst_0
/*     */       //   285: istore #6
/*     */       //   287: aload #4
/*     */       //   289: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */       //   292: invokevirtual getIndex : ()I
/*     */       //   295: aload_2
/*     */       //   296: getfield element : Ljava/lang/Object;
/*     */       //   299: checkcast kotlinx/collections/immutable/PersistentList
/*     */       //   302: invokeinterface size : ()I
/*     */       //   307: <illegal opcode> makeConcatWithConstants : (II)Ljava/lang/String;
/*     */       //   312: astore #6
/*     */       //   314: new java/lang/IllegalArgumentException
/*     */       //   317: dup
/*     */       //   318: aload #6
/*     */       //   320: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   323: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   326: athrow
/*     */       //   327: aload_2
/*     */       //   328: aload #4
/*     */       //   330: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */       //   333: invokevirtual getIndex : ()I
/*     */       //   336: iconst_1
/*     */       //   337: iadd
/*     */       //   338: aload_2
/*     */       //   339: getfield element : Ljava/lang/Object;
/*     */       //   342: checkcast kotlinx/collections/immutable/PersistentList
/*     */       //   345: invokeinterface size : ()I
/*     */       //   350: if_icmpne -> 376
/*     */       //   353: aload_2
/*     */       //   354: getfield element : Ljava/lang/Object;
/*     */       //   357: checkcast kotlinx/collections/immutable/PersistentList
/*     */       //   360: aload #4
/*     */       //   362: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */       //   365: invokevirtual getStep : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*     */       //   368: invokeinterface add : (Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */       //   373: goto -> 406
/*     */       //   376: aload_2
/*     */       //   377: getfield element : Ljava/lang/Object;
/*     */       //   380: checkcast kotlinx/collections/immutable/PersistentList
/*     */       //   383: aload #4
/*     */       //   385: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */       //   388: invokevirtual getIndex : ()I
/*     */       //   391: iconst_1
/*     */       //   392: iadd
/*     */       //   393: aload #4
/*     */       //   395: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated
/*     */       //   398: invokevirtual getStep : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*     */       //   401: invokeinterface set : (ILjava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */       //   406: putfield element : Ljava/lang/Object;
/*     */       //   409: aload_0
/*     */       //   410: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   413: aload_2
/*     */       //   414: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;)Lkotlin/jvm/functions/Function1;
/*     */       //   419: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   424: goto -> 86
/*     */       //   427: aload #5
/*     */       //   429: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */       //   432: ifeq -> 518
/*     */       //   435: aload_2
/*     */       //   436: aload_2
/*     */       //   437: getfield element : Ljava/lang/Object;
/*     */       //   440: checkcast kotlinx/collections/immutable/PersistentList
/*     */       //   443: new com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*     */       //   446: dup
/*     */       //   447: aload #4
/*     */       //   449: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */       //   452: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */       //   455: invokevirtual getTitle : ()Ljava/lang/String;
/*     */       //   458: aload #4
/*     */       //   460: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */       //   463: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */       //   466: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */       //   469: aload #4
/*     */       //   471: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared
/*     */       //   474: invokevirtual getResult : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;
/*     */       //   477: invokevirtual getOutput : ()Ljava/lang/String;
/*     */       //   480: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   483: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   486: aconst_null
/*     */       //   487: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V
/*     */       //   490: invokeinterface add : (Ljava/lang/Object;)Lkotlinx/collections/immutable/PersistentList;
/*     */       //   495: putfield element : Ljava/lang/Object;
/*     */       //   498: aload_0
/*     */       //   499: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   502: aload_2
/*     */       //   503: aload #4
/*     */       //   505: <illegal opcode> invoke : (Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */       //   510: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   515: goto -> 86
/*     */       //   518: aload #5
/*     */       //   520: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionFinished
/*     */       //   523: ifeq -> 545
/*     */       //   526: aload_0
/*     */       //   527: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   530: aload #4
/*     */       //   532: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */       //   537: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   542: goto -> 86
/*     */       //   545: aload #5
/*     */       //   547: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionStarted
/*     */       //   550: ifeq -> 572
/*     */       //   553: aload_0
/*     */       //   554: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   557: aload #4
/*     */       //   559: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */       //   564: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   569: goto -> 86
/*     */       //   572: aload #5
/*     */       //   574: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ErrorOccurred
/*     */       //   577: ifeq -> 727
/*     */       //   580: aload_0
/*     */       //   581: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   584: aload #4
/*     */       //   586: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ErrorOccurred
/*     */       //   589: invokevirtual getException : ()Ljava/lang/Exception;
/*     */       //   592: dup
/*     */       //   593: ifnull -> 603
/*     */       //   596: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   599: dup
/*     */       //   600: ifnonnull -> 607
/*     */       //   603: pop
/*     */       //   604: ldc_w 'Unknown error'
/*     */       //   607: aload_0
/*     */       //   608: checkcast kotlin/coroutines/Continuation
/*     */       //   611: aload_0
/*     */       //   612: aload_2
/*     */       //   613: putfield L$0 : Ljava/lang/Object;
/*     */       //   616: aload_0
/*     */       //   617: aload_3
/*     */       //   618: putfield L$1 : Ljava/lang/Object;
/*     */       //   621: aload_0
/*     */       //   622: iconst_3
/*     */       //   623: putfield label : I
/*     */       //   626: invokeinterface updateError : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   631: dup
/*     */       //   632: aload #7
/*     */       //   634: if_acmpne -> 661
/*     */       //   637: aload #7
/*     */       //   639: areturn
/*     */       //   640: aload_0
/*     */       //   641: getfield L$1 : Ljava/lang/Object;
/*     */       //   644: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */       //   647: astore_3
/*     */       //   648: aload_0
/*     */       //   649: getfield L$0 : Ljava/lang/Object;
/*     */       //   652: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   655: astore_2
/*     */       //   656: aload_1
/*     */       //   657: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   660: aload_1
/*     */       //   661: pop
/*     */       //   662: aload_0
/*     */       //   663: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   666: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.Failed : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */       //   669: aload_0
/*     */       //   670: checkcast kotlin/coroutines/Continuation
/*     */       //   673: aload_0
/*     */       //   674: aload_2
/*     */       //   675: putfield L$0 : Ljava/lang/Object;
/*     */       //   678: aload_0
/*     */       //   679: aload_3
/*     */       //   680: putfield L$1 : Ljava/lang/Object;
/*     */       //   683: aload_0
/*     */       //   684: iconst_4
/*     */       //   685: putfield label : I
/*     */       //   688: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   693: dup
/*     */       //   694: aload #7
/*     */       //   696: if_acmpne -> 723
/*     */       //   699: aload #7
/*     */       //   701: areturn
/*     */       //   702: aload_0
/*     */       //   703: getfield L$1 : Ljava/lang/Object;
/*     */       //   706: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */       //   709: astore_3
/*     */       //   710: aload_0
/*     */       //   711: getfield L$0 : Ljava/lang/Object;
/*     */       //   714: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   717: astore_2
/*     */       //   718: aload_1
/*     */       //   719: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   722: aload_1
/*     */       //   723: pop
/*     */       //   724: goto -> 86
/*     */       //   727: aload #5
/*     */       //   729: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentStateUpdated
/*     */       //   732: ifeq -> 754
/*     */       //   735: aload_0
/*     */       //   736: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   739: aload #4
/*     */       //   741: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */       //   746: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   751: goto -> 86
/*     */       //   754: aload #5
/*     */       //   756: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentSessionHistoryUpdated
/*     */       //   759: ifeq -> 781
/*     */       //   762: aload_0
/*     */       //   763: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   766: aload #4
/*     */       //   768: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */       //   773: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   778: goto -> 86
/*     */       //   781: aload #5
/*     */       //   783: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$PlanUpdated
/*     */       //   786: ifeq -> 808
/*     */       //   789: aload_0
/*     */       //   790: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   793: aload #4
/*     */       //   795: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;)Lkotlin/jvm/functions/Function1;
/*     */       //   800: invokeinterface update : (Lkotlin/jvm/functions/Function1;)V
/*     */       //   805: goto -> 86
/*     */       //   808: aload #5
/*     */       //   810: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ProgressUpdated
/*     */       //   813: ifeq -> 886
/*     */       //   816: aload_0
/*     */       //   817: getfield $updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */       //   820: aload #4
/*     */       //   822: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ProgressUpdated
/*     */       //   825: invokevirtual getProgress : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;
/*     */       //   828: aload_0
/*     */       //   829: checkcast kotlin/coroutines/Continuation
/*     */       //   832: aload_0
/*     */       //   833: aload_2
/*     */       //   834: putfield L$0 : Ljava/lang/Object;
/*     */       //   837: aload_0
/*     */       //   838: aload_3
/*     */       //   839: putfield L$1 : Ljava/lang/Object;
/*     */       //   842: aload_0
/*     */       //   843: iconst_5
/*     */       //   844: putfield label : I
/*     */       //   847: invokeinterface updateProgress : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   852: dup
/*     */       //   853: aload #7
/*     */       //   855: if_acmpne -> 882
/*     */       //   858: aload #7
/*     */       //   860: areturn
/*     */       //   861: aload_0
/*     */       //   862: getfield L$1 : Ljava/lang/Object;
/*     */       //   865: checkcast kotlinx/coroutines/channels/ChannelIterator
/*     */       //   868: astore_3
/*     */       //   869: aload_0
/*     */       //   870: getfield L$0 : Ljava/lang/Object;
/*     */       //   873: checkcast kotlin/jvm/internal/Ref$ObjectRef
/*     */       //   876: astore_2
/*     */       //   877: aload_1
/*     */       //   878: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   881: aload_1
/*     */       //   882: pop
/*     */       //   883: goto -> 86
/*     */       //   886: new kotlin/NoWhenBranchMatchedException
/*     */       //   889: dup
/*     */       //   890: invokespecial <init> : ()V
/*     */       //   893: athrow
/*     */       //   894: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   897: areturn
/*     */       //   898: new java/lang/IllegalStateException
/*     */       //   901: dup
/*     */       //   902: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   905: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   908: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #75	-> 3
/*     */       //   #77	-> 52
/*     */       //   #78	-> 76
/*     */       //   #75	-> 117
/*     */       //   #78	-> 141
/*     */       //   #79	-> 161
/*     */       //   #80	-> 165
/*     */       //   #81	-> 173
/*     */       //   #75	-> 215
/*     */       //   #81	-> 239
/*     */       //   #84	-> 243
/*     */       //   #85	-> 251
/*     */       //   #317	-> 284
/*     */       //   #85	-> 287
/*     */       //   #85	-> 312
/*     */       //   #86	-> 327
/*     */       //   #87	-> 353
/*     */       //   #89	-> 376
/*     */       //   #86	-> 406
/*     */       //   #91	-> 409
/*     */       //   #96	-> 427
/*     */       //   #98	-> 435
/*     */       //   #99	-> 443
/*     */       //   #100	-> 447
/*     */       //   #101	-> 458
/*     */       //   #102	-> 469
/*     */       //   #103	-> 480
/*     */       //   #104	-> 483
/*     */       //   #105	-> 486
/*     */       //   #99	-> 487
/*     */       //   #98	-> 490
/*     */       //   #108	-> 498
/*     */       //   #118	-> 518
/*     */       //   #119	-> 526
/*     */       //   #127	-> 545
/*     */       //   #128	-> 553
/*     */       //   #135	-> 572
/*     */       //   #136	-> 580
/*     */       //   #75	-> 637
/*     */       //   #137	-> 661
/*     */       //   #75	-> 699
/*     */       //   #137	-> 723
/*     */       //   #140	-> 727
/*     */       //   #141	-> 735
/*     */       //   #146	-> 754
/*     */       //   #147	-> 762
/*     */       //   #152	-> 781
/*     */       //   #153	-> 789
/*     */       //   #158	-> 808
/*     */       //   #159	-> 816
/*     */       //   #75	-> 858
/*     */       //   #159	-> 882
/*     */       //   #79	-> 886
/*     */       //   #163	-> 894
/*     */       //   #75	-> 898
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   60	60	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   136	82	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   234	78	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   327	156	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   483	3	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   486	154	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   656	46	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   718	143	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   877	9	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   894	4	2	steps	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */       //   161	48	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   243	69	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   327	49	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   376	30	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   427	56	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   483	3	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   486	32	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   518	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   545	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   572	20	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   727	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   754	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   781	27	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   808	44	4	stepBuildingEvent	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;
/*     */       //   287	25	6	$i$a$-require-AITaskLauncher$launch$job$1$linearTreeConversionJob$1$1	I
/*     */       //   0	909	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/AITaskLauncher$launch$job$1$linearTreeConversionJob$1;
/*     */       //   52	846	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$launch$job$1$linearTreeConversionJob$1> $completion) {
/*     */       return (Continuation<Unit>)new AITaskLauncher$launch$job$1$linearTreeConversionJob$1(this.$updater, this.$channel, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AITaskLauncher$launch$job$1$linearTreeConversionJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final LiveTaskSnapshot invokeSuspend$lambda$1(Ref.ObjectRef $steps, LiveTaskSnapshot it) {
/*  92 */       return LiveTaskSnapshot.copy$default(it, null, null, (PersistentList)$steps.element, null, null, 27, null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final LiveTaskSnapshot invokeSuspend$lambda$2(Ref.ObjectRef $steps, StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 110 */       PersistentList persistentList = (PersistentList)$steps.element;
/* 111 */       TaskEntity taskEntity2 = it.getTask();
/* 112 */       AgentSessionHistorySnapshot agentSessionHistorySnapshot = ((StepBuildingEvent.ResultAppeared)$stepBuildingEvent).getResult().getSessionHistory();
/* 113 */       String str = ((StepBuildingEvent.ResultAppeared)$stepBuildingEvent).getResult().getPatch(); TaskEntity taskEntity1 = TaskEntity.copy$default(taskEntity2, null, null, null, null, null, null, null, false, null, str, null, agentSessionHistorySnapshot, 1535, null);
/*     */       return LiveTaskSnapshot.copy$default(it, null, taskEntity1, persistentList, null, null, 25, null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final LiveTaskSnapshot invokeSuspend$lambda$3(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot snapshot) {
/* 121 */       TerminalState.SessionLogAvailable sessionLogAvailable = new TerminalState.SessionLogAvailable(((StepBuildingEvent.TerminalSessionFinished)$stepBuildingEvent).getSessionLog());
/* 122 */       TaskEntity taskEntity = TaskEntity.copy$default(snapshot.getTask(), null, null, null, null, null, null, null, false, null, null, ((StepBuildingEvent.TerminalSessionFinished)$stepBuildingEvent).getSessionLog(), null, 3071, null); return LiveTaskSnapshot.copy$default(snapshot, null, taskEntity, null, (TerminalState)sessionLogAvailable, null, 21, null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final LiveTaskSnapshot invokeSuspend$lambda$4(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot snapshot) {
/* 129 */       return LiveTaskSnapshot.copy$default(snapshot, null, null, null, 
/* 130 */           (TerminalState)new TerminalState.TerminalAvailable(((StepBuildingEvent.TerminalSessionStarted)$stepBuildingEvent).getOpenAction()), null, 23, null);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     private static final LiveTaskSnapshot invokeSuspend$lambda$5(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 142 */       return LiveTaskSnapshot.copy$default(it, null, TaskEntity.copy$default(it.getTask(), null, null, null, null, null, null, ((StepBuildingEvent.AgentStateUpdated)$stepBuildingEvent).getAgentState(), false, null, null, null, null, 4031, null), null, null, null, 29, null);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static final LiveTaskSnapshot invokeSuspend$lambda$6(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 148 */       return LiveTaskSnapshot.copy$default(it, null, TaskEntity.copy$default(it.getTask(), null, null, null, null, null, null, null, false, null, null, null, ((StepBuildingEvent.AgentSessionHistoryUpdated)$stepBuildingEvent).getHistorySnapshot(), 2047, null), null, null, null, 29, null);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     private static final LiveTaskSnapshot invokeSuspend$lambda$7(StepBuildingEvent $stepBuildingEvent, LiveTaskSnapshot it) {
/* 154 */       return LiveTaskSnapshot.copy$default(it, null, TaskEntity.copy$default(it.getTask(), null, null, null, null, null, null, null, false, ((StepBuildingEvent.PlanUpdated)$stepBuildingEvent).getPlan(), null, null, null, 3839, null), null, null, null, 29, null);
/*     */     } }
/*     */   @DebugMetadata(f = "AITaskLauncher.kt", l = {167}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher$launch$job$1$taskJob$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AITaskLauncher$launch$job$1$taskJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*     */     
/*     */     AITaskLauncher$launch$job$1$taskJob$1(Project $project, TaskEntity $task, StepsBuildingContextListener $listener, Job $topLevelJob, TaskChainId $chainId, TaskSnapshotUpdater $updater, Channel<StepBuildingEvent> $channel, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/* 165 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           
/* 167 */           this.label = 1; if (AITaskLauncher.access$submitTask(AITaskLauncher.this, this.$project, this.$task, this.$listener, this.$topLevelJob, this.$chainId, this.$updater, (Continuation)this) == object) return object;  AITaskLauncher.access$submitTask(AITaskLauncher.this, this.$project, this.$task, this.$listener, this.$topLevelJob, this.$chainId, this.$updater, (Continuation)this);
/* 168 */           SendChannel.DefaultImpls.close$default((SendChannel)this.$channel, null, 1, null);
/* 169 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); SendChannel.DefaultImpls.close$default((SendChannel)this.$channel, null, 1, null); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AITaskLauncher$launch$job$1$taskJob$1> $completion) {
/*     */       return (Continuation<Unit>)new AITaskLauncher$launch$job$1$taskJob$1(this.$project, this.$task, this.$listener, this.$topLevelJob, this.$chainId, this.$updater, this.$channel, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AITaskLauncher$launch$job$1$taskJob$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\AITaskLauncher$launch$job$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */