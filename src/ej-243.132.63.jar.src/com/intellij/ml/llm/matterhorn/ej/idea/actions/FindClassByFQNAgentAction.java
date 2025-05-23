/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*    */ import com.intellij.psi.PsiClass;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0252\0020\001:\001\025B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\t8VX\004¢\006\006\032\004\b\013\020\fR\024\020\r\032\0020\0058VX\004¢\006\006\032\004\b\016\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nFindClassByFQNAgentAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindClassByFQNAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n1611#2,9:63\n1863#2:72\n1864#2:74\n1620#2:75\n1863#2,2:76\n1#3:73\n1#3:88\n11483#4,9:78\n13409#4:87\n13410#4:89\n11492#4:90\n*S KotlinDebug\n*F\n+ 1 FindClassByFQNAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction\n*L\n59#1:63,9\n59#1:72\n59#1:74\n59#1:75\n59#1:76,2\n59#1:73\n51#1:88\n51#1:78,9\n51#1:87\n51#1:89\n51#1:90\n*E\n"})
/*    */ public final class FindClassByFQNAgentAction implements AgentAction {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @Nullable
/* 16 */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @NotNull public static final String FQN_ARGUMENT = "fqn"; @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); } @NotNull public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); }
/*    */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction$Companion;", "", "<init>", "()V", "FQN_ARGUMENT", "", "ej-idea"})
/*    */   public static final class Companion {
/*    */     private Companion() {} }
/*    */   @NotNull
/* 21 */   public String getName() { return "find_class_by_fqn"; } @NotNull
/*    */   public List<Argument> getArguments() {
/* 23 */     return CollectionsKt.listOf(
/* 24 */         new Argument(
/* 25 */           "fqn", 
/* 26 */           ArgumentType.STRING, 
/* 27 */           "JVM fully qualified name of the class to find, e.g. com.pack.MyTargetClass", false, false, 24, null));
/*    */   }
/*    */   @NotNull
/*    */   public String getDocstring() {
/* 31 */     return "Searches for files that contain the given fully qualified name";
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction$execute$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction$execute$1
/*    */     //   11: astore #29
/*    */     //   13: aload #29
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #29
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction$execute$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #29
/*    */     //   50: aload #29
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #28
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #30
/*    */     //   62: aload #29
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 641, 0 -> 96, 1 -> 129, 2 -> 243, 3 -> 345
/*    */     //   96: aload #28
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_0
/*    */     //   102: aload_1
/*    */     //   103: aload #29
/*    */     //   105: aload #29
/*    */     //   107: aload_2
/*    */     //   108: putfield L$0 : Ljava/lang/Object;
/*    */     //   111: aload #29
/*    */     //   113: iconst_1
/*    */     //   114: putfield label : I
/*    */     //   117: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   120: dup
/*    */     //   121: aload #30
/*    */     //   123: if_acmpne -> 145
/*    */     //   126: aload #30
/*    */     //   128: areturn
/*    */     //   129: aload #29
/*    */     //   131: getfield L$0 : Ljava/lang/Object;
/*    */     //   134: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*    */     //   137: astore_2
/*    */     //   138: aload #28
/*    */     //   140: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   143: aload #28
/*    */     //   145: checkcast java/util/Map
/*    */     //   148: astore #4
/*    */     //   150: aload #4
/*    */     //   152: ldc 'fqn'
/*    */     //   154: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   159: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*    */     //   162: invokestatic tryGetNonEmptyStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*    */     //   165: dup
/*    */     //   166: ifnonnull -> 173
/*    */     //   169: pop
/*    */     //   170: ldc 'ERROR: fqn is missing'
/*    */     //   172: areturn
/*    */     //   173: astore #5
/*    */     //   175: aload_2
/*    */     //   176: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   181: astore #6
/*    */     //   183: aload #6
/*    */     //   185: invokestatic projectScope : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/search/GlobalSearchScope;
/*    */     //   188: dup
/*    */     //   189: ldc 'projectScope(...)'
/*    */     //   191: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   194: astore #7
/*    */     //   196: aload #6
/*    */     //   198: aload #6
/*    */     //   200: aload #5
/*    */     //   202: aload #7
/*    */     //   204: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/search/GlobalSearchScope;)Lkotlin/jvm/functions/Function0;
/*    */     //   209: aload #29
/*    */     //   211: aload #29
/*    */     //   213: aload #5
/*    */     //   215: putfield L$0 : Ljava/lang/Object;
/*    */     //   218: aload #29
/*    */     //   220: aload #6
/*    */     //   222: putfield L$1 : Ljava/lang/Object;
/*    */     //   225: aload #29
/*    */     //   227: iconst_2
/*    */     //   228: putfield label : I
/*    */     //   231: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   234: dup
/*    */     //   235: aload #30
/*    */     //   237: if_acmpne -> 270
/*    */     //   240: aload #30
/*    */     //   242: areturn
/*    */     //   243: aload #29
/*    */     //   245: getfield L$1 : Ljava/lang/Object;
/*    */     //   248: checkcast com/intellij/openapi/project/Project
/*    */     //   251: astore #6
/*    */     //   253: aload #29
/*    */     //   255: getfield L$0 : Ljava/lang/Object;
/*    */     //   258: checkcast java/lang/String
/*    */     //   261: astore #5
/*    */     //   263: aload #28
/*    */     //   265: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   268: aload #28
/*    */     //   270: dup
/*    */     //   271: ldc 'smartReadAction(...)'
/*    */     //   273: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   276: checkcast [Lcom/intellij/psi/PsiClass;
/*    */     //   279: astore #8
/*    */     //   281: aload #8
/*    */     //   283: arraylength
/*    */     //   284: ifne -> 291
/*    */     //   287: iconst_1
/*    */     //   288: goto -> 292
/*    */     //   291: iconst_0
/*    */     //   292: ifeq -> 303
/*    */     //   295: aload #5
/*    */     //   297: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   302: areturn
/*    */     //   303: aload #6
/*    */     //   305: aload #8
/*    */     //   307: <illegal opcode> invoke : ([Lcom/intellij/psi/PsiClass;)Lkotlin/jvm/functions/Function0;
/*    */     //   312: aload #29
/*    */     //   314: aload #29
/*    */     //   316: aload #5
/*    */     //   318: putfield L$0 : Ljava/lang/Object;
/*    */     //   321: aload #29
/*    */     //   323: aconst_null
/*    */     //   324: putfield L$1 : Ljava/lang/Object;
/*    */     //   327: aload #29
/*    */     //   329: iconst_3
/*    */     //   330: putfield label : I
/*    */     //   333: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   336: dup
/*    */     //   337: aload #30
/*    */     //   339: if_acmpne -> 362
/*    */     //   342: aload #30
/*    */     //   344: areturn
/*    */     //   345: aload #29
/*    */     //   347: getfield L$0 : Ljava/lang/Object;
/*    */     //   350: checkcast java/lang/String
/*    */     //   353: astore #5
/*    */     //   355: aload #28
/*    */     //   357: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   360: aload #28
/*    */     //   362: checkcast java/util/Set
/*    */     //   365: astore #9
/*    */     //   367: aload #9
/*    */     //   369: invokeinterface size : ()I
/*    */     //   374: bipush #50
/*    */     //   376: if_icmple -> 387
/*    */     //   379: aload #5
/*    */     //   381: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   386: areturn
/*    */     //   387: new java/lang/StringBuilder
/*    */     //   390: dup
/*    */     //   391: invokespecial <init> : ()V
/*    */     //   394: astore #10
/*    */     //   396: aload #10
/*    */     //   398: astore #11
/*    */     //   400: iconst_0
/*    */     //   401: istore #12
/*    */     //   403: aload #11
/*    */     //   405: aload #5
/*    */     //   407: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   412: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   415: dup
/*    */     //   416: ldc 'append(...)'
/*    */     //   418: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   421: bipush #10
/*    */     //   423: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   426: dup
/*    */     //   427: ldc 'append(...)'
/*    */     //   429: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   432: pop
/*    */     //   433: aload #9
/*    */     //   435: checkcast java/lang/Iterable
/*    */     //   438: astore #13
/*    */     //   440: iconst_0
/*    */     //   441: istore #14
/*    */     //   443: aload #13
/*    */     //   445: astore #15
/*    */     //   447: new java/util/ArrayList
/*    */     //   450: dup
/*    */     //   451: invokespecial <init> : ()V
/*    */     //   454: checkcast java/util/Collection
/*    */     //   457: astore #16
/*    */     //   459: iconst_0
/*    */     //   460: istore #17
/*    */     //   462: aload #15
/*    */     //   464: astore #18
/*    */     //   466: iconst_0
/*    */     //   467: istore #19
/*    */     //   469: aload #18
/*    */     //   471: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   476: astore #20
/*    */     //   478: aload #20
/*    */     //   480: invokeinterface hasNext : ()Z
/*    */     //   485: ifeq -> 545
/*    */     //   488: aload #20
/*    */     //   490: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   495: astore #21
/*    */     //   497: aload #21
/*    */     //   499: astore #22
/*    */     //   501: iconst_0
/*    */     //   502: istore #23
/*    */     //   504: aload #22
/*    */     //   506: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   509: astore #24
/*    */     //   511: iconst_0
/*    */     //   512: istore #25
/*    */     //   514: aload #24
/*    */     //   516: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*    */     //   519: dup
/*    */     //   520: ifnull -> 541
/*    */     //   523: astore #26
/*    */     //   525: iconst_0
/*    */     //   526: istore #27
/*    */     //   528: aload #16
/*    */     //   530: aload #26
/*    */     //   532: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   537: pop
/*    */     //   538: goto -> 542
/*    */     //   541: pop
/*    */     //   542: goto -> 478
/*    */     //   545: nop
/*    */     //   546: aload #16
/*    */     //   548: checkcast java/util/List
/*    */     //   551: nop
/*    */     //   552: checkcast java/lang/Iterable
/*    */     //   555: astore #13
/*    */     //   557: iconst_0
/*    */     //   558: istore #14
/*    */     //   560: aload #13
/*    */     //   562: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   567: astore #15
/*    */     //   569: aload #15
/*    */     //   571: invokeinterface hasNext : ()Z
/*    */     //   576: ifeq -> 627
/*    */     //   579: aload #15
/*    */     //   581: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   586: astore #16
/*    */     //   588: aload #16
/*    */     //   590: checkcast java/nio/file/Path
/*    */     //   593: astore #17
/*    */     //   595: iconst_0
/*    */     //   596: istore #18
/*    */     //   598: aload #11
/*    */     //   600: aload #17
/*    */     //   602: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   605: dup
/*    */     //   606: ldc 'append(...)'
/*    */     //   608: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   611: bipush #10
/*    */     //   613: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   616: dup
/*    */     //   617: ldc 'append(...)'
/*    */     //   619: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   622: pop
/*    */     //   623: nop
/*    */     //   624: goto -> 569
/*    */     //   627: nop
/*    */     //   628: nop
/*    */     //   629: aload #10
/*    */     //   631: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   634: dup
/*    */     //   635: ldc 'toString(...)'
/*    */     //   637: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   640: areturn
/*    */     //   641: new java/lang/IllegalStateException
/*    */     //   644: dup
/*    */     //   645: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   647: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   650: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #33	-> 60
/*    */     //   #37	-> 101
/*    */     //   #33	-> 126
/*    */     //   #38	-> 150
/*    */     //   #39	-> 175
/*    */     //   #41	-> 183
/*    */     //   #42	-> 196
/*    */     //   #33	-> 240
/*    */     //   #42	-> 270
/*    */     //   #46	-> 281
/*    */     //   #46	-> 292
/*    */     //   #47	-> 295
/*    */     //   #50	-> 303
/*    */     //   #33	-> 342
/*    */     //   #54	-> 367
/*    */     //   #55	-> 379
/*    */     //   #57	-> 387
/*    */     //   #58	-> 403
/*    */     //   #59	-> 433
/*    */     //   #63	-> 443
/*    */     //   #71	-> 462
/*    */     //   #72	-> 469
/*    */     //   #71	-> 504
/*    */     //   #59	-> 514
/*    */     //   #71	-> 519
/*    */     //   #73	-> 525
/*    */     //   #71	-> 528
/*    */     //   #71	-> 538
/*    */     //   #71	-> 541
/*    */     //   #72	-> 542
/*    */     //   #74	-> 545
/*    */     //   #75	-> 546
/*    */     //   #63	-> 551
/*    */     //   #59	-> 557
/*    */     //   #76	-> 560
/*    */     //   #59	-> 598
/*    */     //   #59	-> 623
/*    */     //   #76	-> 624
/*    */     //   #77	-> 627
/*    */     //   #60	-> 628
/*    */     //   #57	-> 629
/*    */     //   #57	-> 640
/*    */     //   #33	-> 641
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/FindClassByFQNAgentAction;
/*    */     //   101	19	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*    */     //   101	28	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   138	31	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   173	10	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   150	15	4	params	Ljava/util/Map;
/*    */     //   175	68	5	fqn	Ljava/lang/String;
/*    */     //   263	82	5	fqn	Ljava/lang/String;
/*    */     //   355	32	5	fqn	Ljava/lang/String;
/*    */     //   387	45	5	fqn	Ljava/lang/String;
/*    */     //   183	60	6	project	Lcom/intellij/openapi/project/Project;
/*    */     //   253	39	6	project	Lcom/intellij/openapi/project/Project;
/*    */     //   292	3	6	project	Lcom/intellij/openapi/project/Project;
/*    */     //   303	33	6	project	Lcom/intellij/openapi/project/Project;
/*    */     //   196	38	7	scope	Lcom/intellij/psi/search/GlobalSearchScope;
/*    */     //   281	11	8	psiClasses	[Lcom/intellij/psi/PsiClass;
/*    */     //   292	3	8	psiClasses	[Lcom/intellij/psi/PsiClass;
/*    */     //   303	33	8	psiClasses	[Lcom/intellij/psi/PsiClass;
/*    */     //   367	12	9	files	Ljava/util/Set;
/*    */     //   387	53	9	files	Ljava/util/Set;
/*    */     //   400	229	11	$this$execute_u24lambda_u245	Ljava/lang/StringBuilder;
/*    */     //   440	19	13	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*    */     //   557	12	13	$this$forEach$iv	Ljava/lang/Iterable;
/*    */     //   459	7	15	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   459	89	16	destination$iv$iv	Ljava/util/Collection;
/*    */     //   588	36	16	element$iv	Ljava/lang/Object;
/*    */     //   595	29	17	it	Ljava/nio/file/Path;
/*    */     //   466	12	18	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*    */     //   497	4	21	element$iv$iv$iv	Ljava/lang/Object;
/*    */     //   501	41	22	element$iv$iv	Ljava/lang/Object;
/*    */     //   511	8	24	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   525	13	26	it$iv$iv	Ljava/lang/Object;
/*    */     //   514	5	25	$i$a$-mapNotNull-FindClassByFQNAgentAction$execute$2$1	I
/*    */     //   528	10	27	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*    */     //   504	38	23	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*    */     //   469	77	19	$i$f$forEach	I
/*    */     //   462	86	17	$i$f$mapNotNullTo	I
/*    */     //   443	109	14	$i$f$mapNotNull	I
/*    */     //   598	26	18	$i$a$-forEach-FindClassByFQNAgentAction$execute$2$2	I
/*    */     //   560	68	14	$i$f$forEach	I
/*    */     //   403	226	12	$i$a$-buildString-FindClassByFQNAgentAction$execute$2	I
/*    */     //   0	651	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	591	29	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	584	28	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   private static final PsiClass[] execute$lambda$0(Project $project, String $fqn, GlobalSearchScope $scope) {
/* 43 */     return JavaPsiFacade.getInstance($project).findClasses($fqn, $scope);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Set execute$lambda$2(PsiClass[] $psiClasses) {
/* 51 */     PsiClass[] arrayOfPsiClass1 = $psiClasses; int $i$f$mapNotNull = 0;
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
/* 78 */     PsiClass[] arrayOfPsiClass2 = arrayOfPsiClass1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 86 */     PsiClass[] arrayOfPsiClass3 = arrayOfPsiClass2; int $i$f$forEach = 0;
/* 87 */     byte b = 0; int i = arrayOfPsiClass3.length; if (b < i) { Object element$iv$iv$iv = arrayOfPsiClass3[b], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0; Object object1 = element$iv$iv;
/*    */       int $i$a$-mapNotNull-FindClassByFQNAgentAction$execute$files$1$1 = 0; }
/*    */     
/* 90 */     return CollectionsKt.toSet(destination$iv$iv);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FindClassByFQNAgentAction.kt", l = {37, 42, 50}, i = {0, 1, 1, 2}, s = {"L$0", "L$0", "L$1", "L$0"}, n = {"context", "fqn", "project", "fqn"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.FindClassByFQNAgentAction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FindClassByFQNAgentAction$execute$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     FindClassByFQNAgentAction$execute$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FindClassByFQNAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\FindClassByFQNAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */