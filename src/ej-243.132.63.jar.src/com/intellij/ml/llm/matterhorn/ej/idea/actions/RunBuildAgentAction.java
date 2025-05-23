/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.idea.run.RunEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\007¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunBuildAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-idea"})
/*    */ public final class RunBuildAgentAction implements AgentAction {
/*    */   @Nullable
/*  9 */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); } @NotNull public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull
/*    */   public String getName() {
/* 11 */     return "build";
/*    */   } @NotNull
/* 13 */   private final List<Argument> arguments = CollectionsKt.emptyList(); @NotNull public List<Argument> getArguments() { return this.arguments; } @NotNull
/*    */   public String getDocstring() {
/* 15 */     return this.docstring;
/*    */   }
/*    */   
/*    */   @NotNull
/* 19 */   private final String docstring = "This command initiates the build process for the project.\nIt compiles all source files and reports any build errors. This process may take a long time, so use this command only if it's the only way to verify that the project can build.\nInstead, consider running specific tests that automatically build the necessary components when required.\nAvoid running this command if you plan to run tests. It is not a substitute for verifying functionality."; @Nullable
/*    */   public Object execute(@NotNull ActionRequest paramActionRequest, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/RunBuildAgentAction$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/RunBuildAgentAction$execute$1
/*    */     //   11: astore #13
/*    */     //   13: aload #13
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #13
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunBuildAgentAction$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunBuildAgentAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #13
/*    */     //   50: aload #13
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #12
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #14
/*    */     //   62: aload #13
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 433, 0 -> 96, 1 -> 168, 2 -> 291, 3 -> 422
/*    */     //   96: aload #12
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: ldc 'Build entire project'
/*    */     //   103: astore #4
/*    */     //   105: aload #4
/*    */     //   107: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Build : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*    */     //   110: aload_2
/*    */     //   111: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*    */     //   114: aload_2
/*    */     //   115: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   120: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   123: astore #5
/*    */     //   125: aload #5
/*    */     //   127: invokevirtual getHumanInLoop : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*    */     //   130: astore #6
/*    */     //   132: aload #6
/*    */     //   134: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopAction$BuildAction.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$BuildAction;
/*    */     //   137: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*    */     //   140: aload #13
/*    */     //   142: aload #13
/*    */     //   144: aload_2
/*    */     //   145: putfield L$0 : Ljava/lang/Object;
/*    */     //   148: aload #13
/*    */     //   150: iconst_1
/*    */     //   151: putfield label : I
/*    */     //   154: invokeinterface shouldAllowAction : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   159: dup
/*    */     //   160: aload #14
/*    */     //   162: if_acmpne -> 184
/*    */     //   165: aload #14
/*    */     //   167: areturn
/*    */     //   168: aload #13
/*    */     //   170: getfield L$0 : Ljava/lang/Object;
/*    */     //   173: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   176: astore_2
/*    */     //   177: aload #12
/*    */     //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   182: aload #12
/*    */     //   184: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopResponse
/*    */     //   187: astore #7
/*    */     //   189: aload #7
/*    */     //   191: instanceof com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree
/*    */     //   194: ifeq -> 200
/*    */     //   197: ldc 'Human rejected launching the build. Try doing something else.'
/*    */     //   199: areturn
/*    */     //   200: new java/util/ArrayList
/*    */     //   203: dup
/*    */     //   204: invokespecial <init> : ()V
/*    */     //   207: checkcast java/util/List
/*    */     //   210: astore #8
/*    */     //   212: new com/intellij/ml/llm/matterhorn/ej/idea/run/RunService
/*    */     //   215: dup
/*    */     //   216: invokespecial <init> : ()V
/*    */     //   219: astore #9
/*    */     //   221: aload #9
/*    */     //   223: aload_2
/*    */     //   224: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   229: invokevirtual build : (Lcom/intellij/openapi/project/Project;)Lkotlinx/coroutines/flow/Flow;
/*    */     //   232: astore #10
/*    */     //   234: nop
/*    */     //   235: aload #10
/*    */     //   237: new com/intellij/ml/llm/matterhorn/ej/idea/actions/RunBuildAgentAction$execute$2
/*    */     //   240: dup
/*    */     //   241: aload #8
/*    */     //   243: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   246: checkcast kotlinx/coroutines/flow/FlowCollector
/*    */     //   249: aload #13
/*    */     //   251: aload #13
/*    */     //   253: aload_2
/*    */     //   254: putfield L$0 : Ljava/lang/Object;
/*    */     //   257: aload #13
/*    */     //   259: aload #8
/*    */     //   261: putfield L$1 : Ljava/lang/Object;
/*    */     //   264: aload #13
/*    */     //   266: aload #9
/*    */     //   268: putfield L$2 : Ljava/lang/Object;
/*    */     //   271: aload #13
/*    */     //   273: iconst_2
/*    */     //   274: putfield label : I
/*    */     //   277: invokeinterface collect : (Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   282: dup
/*    */     //   283: aload #14
/*    */     //   285: if_acmpne -> 328
/*    */     //   288: aload #14
/*    */     //   290: areturn
/*    */     //   291: aload #13
/*    */     //   293: getfield L$2 : Ljava/lang/Object;
/*    */     //   296: checkcast com/intellij/ml/llm/matterhorn/ej/idea/run/RunService
/*    */     //   299: astore #9
/*    */     //   301: aload #13
/*    */     //   303: getfield L$1 : Ljava/lang/Object;
/*    */     //   306: checkcast java/util/List
/*    */     //   309: astore #8
/*    */     //   311: aload #13
/*    */     //   313: getfield L$0 : Ljava/lang/Object;
/*    */     //   316: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   319: astore_2
/*    */     //   320: nop
/*    */     //   321: aload #12
/*    */     //   323: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   326: aload #12
/*    */     //   328: pop
/*    */     //   329: aload #9
/*    */     //   331: invokevirtual close : ()V
/*    */     //   334: goto -> 347
/*    */     //   337: astore #11
/*    */     //   339: aload #9
/*    */     //   341: invokevirtual close : ()V
/*    */     //   344: aload #11
/*    */     //   346: athrow
/*    */     //   347: aload #8
/*    */     //   349: checkcast java/util/Collection
/*    */     //   352: invokeinterface isEmpty : ()Z
/*    */     //   357: ifne -> 364
/*    */     //   360: iconst_1
/*    */     //   361: goto -> 365
/*    */     //   364: iconst_0
/*    */     //   365: ifeq -> 430
/*    */     //   368: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/RunResultPresentation.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResultPresentation;
/*    */     //   371: new com/intellij/ml/llm/matterhorn/ej/idea/actions/BuildFailed
/*    */     //   374: dup
/*    */     //   375: aload #8
/*    */     //   377: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   380: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   383: aload_2
/*    */     //   384: aload #13
/*    */     //   386: aload #13
/*    */     //   388: aconst_null
/*    */     //   389: putfield L$0 : Ljava/lang/Object;
/*    */     //   392: aload #13
/*    */     //   394: aconst_null
/*    */     //   395: putfield L$1 : Ljava/lang/Object;
/*    */     //   398: aload #13
/*    */     //   400: aconst_null
/*    */     //   401: putfield L$2 : Ljava/lang/Object;
/*    */     //   404: aload #13
/*    */     //   406: iconst_3
/*    */     //   407: putfield label : I
/*    */     //   410: invokevirtual present : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   413: dup
/*    */     //   414: aload #14
/*    */     //   416: if_acmpne -> 429
/*    */     //   419: aload #14
/*    */     //   421: areturn
/*    */     //   422: aload #12
/*    */     //   424: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   427: aload #12
/*    */     //   429: areturn
/*    */     //   430: ldc 'Build completed successfully'
/*    */     //   432: areturn
/*    */     //   433: new java/lang/IllegalStateException
/*    */     //   436: dup
/*    */     //   437: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   439: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   442: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 60
/*    */     //   #22	-> 101
/*    */     //   #23	-> 105
/*    */     //   #25	-> 114
/*    */     //   #26	-> 125
/*    */     //   #27	-> 132
/*    */     //   #21	-> 165
/*    */     //   #28	-> 189
/*    */     //   #29	-> 197
/*    */     //   #32	-> 200
/*    */     //   #32	-> 210
/*    */     //   #33	-> 212
/*    */     //   #34	-> 221
/*    */     //   #35	-> 234
/*    */     //   #36	-> 235
/*    */     //   #21	-> 288
/*    */     //   #43	-> 328
/*    */     //   #44	-> 334
/*    */     //   #43	-> 337
/*    */     //   #46	-> 347
/*    */     //   #46	-> 365
/*    */     //   #47	-> 368
/*    */     //   #21	-> 419
/*    */     //   #51	-> 429
/*    */     //   #49	-> 430
/*    */     //   #46	-> 432
/*    */     //   #21	-> 433
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	67	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   177	114	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   320	17	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   347	18	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   365	48	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   105	9	4	name	Ljava/lang/String;
/*    */     //   125	7	5	root	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   132	27	6	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*    */     //   189	8	7	mayBeVeto	Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;
/*    */     //   212	79	8	buildMessages	Ljava/util/List;
/*    */     //   311	26	8	buildMessages	Ljava/util/List;
/*    */     //   347	18	8	buildMessages	Ljava/util/List;
/*    */     //   365	48	8	buildMessages	Ljava/util/List;
/*    */     //   221	70	9	service	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   301	33	9	service	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   337	7	9	service	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/RunService;
/*    */     //   234	48	10	flow	Lkotlinx/coroutines/flow/Flow;
/*    */     //   0	443	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	383	13	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	376	12	$result	Ljava/lang/Object;
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   234	282	337	finally
/*    */     //   320	329	337	finally
/*    */     //   337	339	337	finally
/*    */   } @DebugMetadata(f = "RunBuildAgentAction.kt", l = {27, 36, 47}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "L$1", "L$2"}, n = {"context", "context", "buildMessages", "service"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.RunBuildAgentAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RunBuildAgentAction$execute$1 extends ContinuationImpl {
/*    */     Object L$0; Object L$1; Object L$2; int label;
/*    */     RunBuildAgentAction$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return RunBuildAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*    */     } }
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class RunBuildAgentAction$execute$2<T> implements FlowCollector { public final Object emit(RunEvent event, Continuation $completion) {
/* 37 */       RunEvent runEvent = event;
/* 38 */       if (runEvent instanceof BuildErrorEvent) { Boxing.boxBoolean(this.$buildMessages.add(new BuildMessage(((BuildErrorEvent)event).getPosition(), ((BuildErrorEvent)event).getMessage()))); }
/* 39 */       else if (!(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.RunFinishedEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.BuildStartEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.BuildStartedEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.OutputEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.RunStartedEvent) && !(runEvent instanceof com.intellij.ml.llm.matterhorn.ej.idea.run.TestEvent))
/*    */       { throw new NoWhenBranchMatchedException(); }
/* 41 */        return Unit.INSTANCE;
/*    */     }
/*    */     
/*    */     RunBuildAgentAction$execute$2(List<BuildMessage> $buildMessages) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\RunBuildAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */