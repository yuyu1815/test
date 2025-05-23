/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ 
/*    */ import com.intellij.openapi.Disposable;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @DebugMetadata(f = "RunService.kt", l = {91, 97, 102, 104}, i = {0, 1, 1, 2}, s = {"L$0", "L$0", "L$1", "L$0"}, n = {"$this$channelFlow", "buildFinished", "testsFinished", "testsFinished"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.run.RunService$doRun$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunEvent;"})
/*    */ final class RunService$doRun$1
/*    */   extends SuspendLambda
/*    */   implements Function2<ProducerScope<? super RunEvent>, Continuation<? super Unit>, Object>
/*    */ {
/*    */   Object L$1;
/*    */   int label;
/*    */   
/*    */   RunService$doRun$1(Project $project, Function2<ProducerScope<? super RunEvent>, Disposable, Unit> $action, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore #7
/*    */     //   5: aload_0
/*    */     //   6: getfield label : I
/*    */     //   9: tableswitch default -> 327, 0 -> 44, 1 -> 102, 2 -> 200, 3 -> 260, 4 -> 317
/*    */     //   44: aload_1
/*    */     //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   48: aload_0
/*    */     //   49: getfield L$0 : Ljava/lang/Object;
/*    */     //   52: checkcast kotlinx/coroutines/channels/ProducerScope
/*    */     //   55: astore_2
/*    */     //   56: aload_2
/*    */     //   57: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   60: aload_0
/*    */     //   61: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   64: invokestatic access$getScope$p : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;)Lkotlinx/coroutines/CoroutineScope;
/*    */     //   67: invokestatic attachAsChildTo : (Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineScope;)V
/*    */     //   70: aload_2
/*    */     //   71: getstatic com/intellij/ml/llm/matterhorn/ej/idea/run/RunStartedEvent.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunStartedEvent;
/*    */     //   74: aload_0
/*    */     //   75: checkcast kotlin/coroutines/Continuation
/*    */     //   78: aload_0
/*    */     //   79: aload_2
/*    */     //   80: putfield L$0 : Ljava/lang/Object;
/*    */     //   83: aload_0
/*    */     //   84: iconst_1
/*    */     //   85: putfield label : I
/*    */     //   88: invokeinterface send : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   93: dup
/*    */     //   94: aload #7
/*    */     //   96: if_acmpne -> 115
/*    */     //   99: aload #7
/*    */     //   101: areturn
/*    */     //   102: aload_0
/*    */     //   103: getfield L$0 : Ljava/lang/Object;
/*    */     //   106: checkcast kotlinx/coroutines/channels/ProducerScope
/*    */     //   109: astore_2
/*    */     //   110: aload_1
/*    */     //   111: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   114: aload_1
/*    */     //   115: pop
/*    */     //   116: aload_2
/*    */     //   117: checkcast kotlinx/coroutines/CoroutineScope
/*    */     //   120: invokestatic nestedDisposable : (Lkotlinx/coroutines/CoroutineScope;)Lcom/intellij/openapi/Disposable;
/*    */     //   123: astore_3
/*    */     //   124: aload_0
/*    */     //   125: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   128: aload_2
/*    */     //   129: aload_0
/*    */     //   130: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   133: aload_3
/*    */     //   134: invokestatic access$setupBuildListeners : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;Lkotlinx/coroutines/channels/ProducerScope;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;)Lkotlinx/coroutines/CompletableDeferred;
/*    */     //   137: astore #4
/*    */     //   139: aload_0
/*    */     //   140: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   143: aload_2
/*    */     //   144: aload_0
/*    */     //   145: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */     //   148: aload_3
/*    */     //   149: aload #4
/*    */     //   151: invokestatic access$setupLaunchListeners : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;Lkotlinx/coroutines/channels/ProducerScope;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/Disposable;Lkotlinx/coroutines/CompletableDeferred;)Lkotlinx/coroutines/CompletableDeferred;
/*    */     //   154: astore #5
/*    */     //   156: aload_0
/*    */     //   157: getfield $action : Lkotlin/jvm/functions/Function2;
/*    */     //   160: aload_2
/*    */     //   161: aload_3
/*    */     //   162: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/channels/ProducerScope;Lcom/intellij/openapi/Disposable;)Lkotlin/jvm/functions/Function0;
/*    */     //   167: aload_0
/*    */     //   168: checkcast kotlin/coroutines/Continuation
/*    */     //   171: aload_0
/*    */     //   172: aload #4
/*    */     //   174: putfield L$0 : Ljava/lang/Object;
/*    */     //   177: aload_0
/*    */     //   178: aload #5
/*    */     //   180: putfield L$1 : Ljava/lang/Object;
/*    */     //   183: aload_0
/*    */     //   184: iconst_2
/*    */     //   185: putfield label : I
/*    */     //   188: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   191: dup
/*    */     //   192: aload #7
/*    */     //   194: if_acmpne -> 223
/*    */     //   197: aload #7
/*    */     //   199: areturn
/*    */     //   200: aload_0
/*    */     //   201: getfield L$1 : Ljava/lang/Object;
/*    */     //   204: checkcast kotlinx/coroutines/CompletableDeferred
/*    */     //   207: astore #5
/*    */     //   209: aload_0
/*    */     //   210: getfield L$0 : Ljava/lang/Object;
/*    */     //   213: checkcast kotlinx/coroutines/CompletableDeferred
/*    */     //   216: astore #4
/*    */     //   218: aload_1
/*    */     //   219: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   222: aload_1
/*    */     //   223: pop
/*    */     //   224: aload #4
/*    */     //   226: aload_0
/*    */     //   227: checkcast kotlin/coroutines/Continuation
/*    */     //   230: aload_0
/*    */     //   231: aload #5
/*    */     //   233: putfield L$0 : Ljava/lang/Object;
/*    */     //   236: aload_0
/*    */     //   237: aconst_null
/*    */     //   238: putfield L$1 : Ljava/lang/Object;
/*    */     //   241: aload_0
/*    */     //   242: iconst_3
/*    */     //   243: putfield label : I
/*    */     //   246: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   251: dup
/*    */     //   252: aload #7
/*    */     //   254: if_acmpne -> 274
/*    */     //   257: aload #7
/*    */     //   259: areturn
/*    */     //   260: aload_0
/*    */     //   261: getfield L$0 : Ljava/lang/Object;
/*    */     //   264: checkcast kotlinx/coroutines/CompletableDeferred
/*    */     //   267: astore #5
/*    */     //   269: aload_1
/*    */     //   270: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   273: aload_1
/*    */     //   274: checkcast java/lang/Boolean
/*    */     //   277: invokevirtual booleanValue : ()Z
/*    */     //   280: istore #6
/*    */     //   282: iload #6
/*    */     //   284: ifeq -> 323
/*    */     //   287: aload #5
/*    */     //   289: aload_0
/*    */     //   290: checkcast kotlin/coroutines/Continuation
/*    */     //   293: aload_0
/*    */     //   294: aconst_null
/*    */     //   295: putfield L$0 : Ljava/lang/Object;
/*    */     //   298: aload_0
/*    */     //   299: iconst_4
/*    */     //   300: putfield label : I
/*    */     //   303: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   308: dup
/*    */     //   309: aload #7
/*    */     //   311: if_acmpne -> 322
/*    */     //   314: aload #7
/*    */     //   316: areturn
/*    */     //   317: aload_1
/*    */     //   318: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   321: aload_1
/*    */     //   322: pop
/*    */     //   323: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   326: areturn
/*    */     //   327: new java/lang/IllegalStateException
/*    */     //   330: dup
/*    */     //   331: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   333: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   336: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #88	-> 3
/*    */     //   #89	-> 56
/*    */     //   #91	-> 70
/*    */     //   #88	-> 99
/*    */     //   #92	-> 115
/*    */     //   #94	-> 124
/*    */     //   #95	-> 139
/*    */     //   #97	-> 156
/*    */     //   #88	-> 197
/*    */     //   #102	-> 223
/*    */     //   #88	-> 257
/*    */     //   #102	-> 274
/*    */     //   #103	-> 282
/*    */     //   #104	-> 287
/*    */     //   #88	-> 314
/*    */     //   #106	-> 322
/*    */     //   #88	-> 327
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   56	46	2	$this$channelFlow	Lkotlinx/coroutines/channels/ProducerScope;
/*    */     //   110	81	2	$this$channelFlow	Lkotlinx/coroutines/channels/ProducerScope;
/*    */     //   124	67	3	channelDisposable	Lcom/intellij/openapi/Disposable;
/*    */     //   139	61	4	buildFinished	Lkotlinx/coroutines/CompletableDeferred;
/*    */     //   218	33	4	buildFinished	Lkotlinx/coroutines/CompletableDeferred;
/*    */     //   156	44	5	testsFinished	Lkotlinx/coroutines/CompletableDeferred;
/*    */     //   209	51	5	testsFinished	Lkotlinx/coroutines/CompletableDeferred;
/*    */     //   269	39	5	testsFinished	Lkotlinx/coroutines/CompletableDeferred;
/*    */     //   282	5	6	buildOk	Z
/*    */     //   0	337	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService$doRun$1;
/*    */     //   48	279	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super RunService$doRun$1> $completion) {
/*    */     RunService$doRun$1 runService$doRun$1 = new RunService$doRun$1(this.$project, this.$action, $completion);
/*    */     runService$doRun$1.L$0 = value;
/*    */     return (Continuation<Unit>)runService$doRun$1;
/*    */   }
/*    */   
/*    */   public final Object invoke(ProducerScope p1, Continuation<?> p2) {
/*    */     return ((RunService$doRun$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */   
/*    */   private static final Unit invokeSuspend$lambda$0(Function2 $action, ProducerScope $$this$channelFlow, Disposable $channelDisposable) {
/* 98 */     $action.invoke($$this$channelFlow, $channelDisposable);
/* 99 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\RunService$doRun$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */