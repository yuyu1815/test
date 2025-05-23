/*   */ package com.intellij.ml.llm.matterhorn.requests.builder;
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ&\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\027H@¢\006\002\020\030R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\016\020\017¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;", "index", "", "strategy", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;", "reviewer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewer;", "<init>", "(ILcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewer;)V", "getIndex", "()I", "getStrategy", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;", "getReviewer", "()Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewer;", "handle", "", "context", "Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;", "assistantAnswer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;", "reviewResult", "Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*   */ public final class AssistantMessageReviewHandler implements AssistantMessageHandler {
/*   */   private final int index;
/*   */   
/* 6 */   public AssistantMessageReviewHandler(int index, @NotNull ReviewStrategy strategy, @NotNull AssistantMessageReviewer reviewer) { this.index = index; this.strategy = strategy; this.reviewer = reviewer; } @NotNull private final ReviewStrategy strategy; @NotNull private final AssistantMessageReviewer reviewer; public final int getIndex() { return this.index; } @NotNull public final ReviewStrategy getStrategy() { return this.strategy; } @NotNull public final AssistantMessageReviewer getReviewer() { return this.reviewer; }
/*   */ 
/*   */   
/*   */   @Nullable
/*   */   public Object handle(@NotNull RequestExecutionContext context, @NotNull AssistantAnswer assistantAnswer, @NotNull CombinedReviewResult reviewResult, @NotNull Continuation $completion) {
/*   */     // Byte code:
/*   */     //   0: aload #4
/*   */     //   2: instanceof com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler$handle$1
/*   */     //   5: ifeq -> 41
/*   */     //   8: aload #4
/*   */     //   10: checkcast com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler$handle$1
/*   */     //   13: astore #9
/*   */     //   15: aload #9
/*   */     //   17: getfield label : I
/*   */     //   20: ldc -2147483648
/*   */     //   22: iand
/*   */     //   23: ifeq -> 41
/*   */     //   26: aload #9
/*   */     //   28: dup
/*   */     //   29: getfield label : I
/*   */     //   32: ldc -2147483648
/*   */     //   34: isub
/*   */     //   35: putfield label : I
/*   */     //   38: goto -> 53
/*   */     //   41: new com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler$handle$1
/*   */     //   44: dup
/*   */     //   45: aload_0
/*   */     //   46: aload #4
/*   */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;Lkotlin/coroutines/Continuation;)V
/*   */     //   51: astore #9
/*   */     //   53: aload #9
/*   */     //   55: getfield result : Ljava/lang/Object;
/*   */     //   58: astore #8
/*   */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   63: astore #10
/*   */     //   65: aload #9
/*   */     //   67: getfield label : I
/*   */     //   70: tableswitch default -> 471, 0 -> 92, 1 -> 195
/*   */     //   92: aload #8
/*   */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   97: aload_3
/*   */     //   98: invokevirtual isReviewFailed : ()Z
/*   */     //   101: ifeq -> 118
/*   */     //   104: aload_0
/*   */     //   105: getfield strategy : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;
/*   */     //   108: invokevirtual getApplyToFailed : ()Z
/*   */     //   111: ifne -> 118
/*   */     //   114: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   117: areturn
/*   */     //   118: aload_0
/*   */     //   119: getfield strategy : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;
/*   */     //   122: invokevirtual getExecution : ()Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;
/*   */     //   125: getstatic com/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution.UNTIL_SUCCESS : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;
/*   */     //   128: if_acmpne -> 147
/*   */     //   131: aload_1
/*   */     //   132: invokevirtual getReviewCount : ()[I
/*   */     //   135: aload_0
/*   */     //   136: getfield index : I
/*   */     //   139: iaload
/*   */     //   140: ifge -> 147
/*   */     //   143: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   146: areturn
/*   */     //   147: aload_0
/*   */     //   148: getfield reviewer : Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewer;
/*   */     //   151: aload_2
/*   */     //   152: invokevirtual getMessage : ()Ljava/lang/String;
/*   */     //   155: aload #9
/*   */     //   157: aload #9
/*   */     //   159: aload_0
/*   */     //   160: putfield L$0 : Ljava/lang/Object;
/*   */     //   163: aload #9
/*   */     //   165: aload_1
/*   */     //   166: putfield L$1 : Ljava/lang/Object;
/*   */     //   169: aload #9
/*   */     //   171: aload_3
/*   */     //   172: putfield L$2 : Ljava/lang/Object;
/*   */     //   175: aload #9
/*   */     //   177: iconst_1
/*   */     //   178: putfield label : I
/*   */     //   181: invokeinterface review : (Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   186: dup
/*   */     //   187: aload #10
/*   */     //   189: if_acmpne -> 229
/*   */     //   192: aload #10
/*   */     //   194: areturn
/*   */     //   195: aload #9
/*   */     //   197: getfield L$2 : Ljava/lang/Object;
/*   */     //   200: checkcast com/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult
/*   */     //   203: astore_3
/*   */     //   204: aload #9
/*   */     //   206: getfield L$1 : Ljava/lang/Object;
/*   */     //   209: checkcast com/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext
/*   */     //   212: astore_1
/*   */     //   213: aload #9
/*   */     //   215: getfield L$0 : Ljava/lang/Object;
/*   */     //   218: checkcast com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler
/*   */     //   221: astore_0
/*   */     //   222: aload #8
/*   */     //   224: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   227: aload #8
/*   */     //   229: checkcast com/intellij/ml/llm/matterhorn/requests/ReviewResult
/*   */     //   232: astore #5
/*   */     //   234: aload #5
/*   */     //   236: instanceof com/intellij/ml/llm/matterhorn/requests/ReviewResult$Error
/*   */     //   239: ifeq -> 342
/*   */     //   242: aload_3
/*   */     //   243: new com/intellij/ml/llm/matterhorn/requests/builder/TextContent
/*   */     //   246: dup
/*   */     //   247: aload #5
/*   */     //   249: checkcast com/intellij/ml/llm/matterhorn/requests/ReviewResult$Error
/*   */     //   252: invokevirtual getMessage : ()Ljava/lang/String;
/*   */     //   255: aconst_null
/*   */     //   256: iconst_2
/*   */     //   257: aconst_null
/*   */     //   258: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*   */     //   261: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content
/*   */     //   264: invokevirtual addFailedReviewContent : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;)Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   267: pop
/*   */     //   268: aload_1
/*   */     //   269: invokevirtual getReviewCount : ()[I
/*   */     //   272: astore #6
/*   */     //   274: aload_0
/*   */     //   275: getfield index : I
/*   */     //   278: istore #7
/*   */     //   280: aload #6
/*   */     //   282: iload #7
/*   */     //   284: aload #6
/*   */     //   286: iload #7
/*   */     //   288: iaload
/*   */     //   289: iconst_1
/*   */     //   290: iadd
/*   */     //   291: iastore
/*   */     //   292: aload #6
/*   */     //   294: iload #7
/*   */     //   296: iaload
/*   */     //   297: aload_0
/*   */     //   298: getfield strategy : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;
/*   */     //   301: invokevirtual getMaxReviews : ()I
/*   */     //   304: if_icmple -> 467
/*   */     //   307: new com/intellij/ml/llm/matterhorn/TooManyAttemptsWithoutSuccessException
/*   */     //   310: dup
/*   */     //   311: aload_0
/*   */     //   312: getfield index : I
/*   */     //   315: aload_0
/*   */     //   316: getfield strategy : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;
/*   */     //   319: invokevirtual getMaxReviews : ()I
/*   */     //   322: aload #5
/*   */     //   324: checkcast com/intellij/ml/llm/matterhorn/requests/ReviewResult$Error
/*   */     //   327: invokevirtual getMessage : ()Ljava/lang/String;
/*   */     //   330: <illegal opcode> makeConcatWithConstants : (IILjava/lang/String;)Ljava/lang/String;
/*   */     //   335: aconst_null
/*   */     //   336: iconst_2
/*   */     //   337: aconst_null
/*   */     //   338: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*   */     //   341: athrow
/*   */     //   342: aload #5
/*   */     //   344: instanceof com/intellij/ml/llm/matterhorn/requests/ReviewResult$Improvement
/*   */     //   347: ifeq -> 425
/*   */     //   350: aload_1
/*   */     //   351: invokevirtual getLastRetry : ()Z
/*   */     //   354: ifne -> 467
/*   */     //   357: aload_1
/*   */     //   358: invokevirtual getReviewCount : ()[I
/*   */     //   361: astore #6
/*   */     //   363: aload_0
/*   */     //   364: getfield index : I
/*   */     //   367: istore #7
/*   */     //   369: aload #6
/*   */     //   371: iload #7
/*   */     //   373: aload #6
/*   */     //   375: iload #7
/*   */     //   377: iaload
/*   */     //   378: iconst_1
/*   */     //   379: iadd
/*   */     //   380: iastore
/*   */     //   381: aload #6
/*   */     //   383: iload #7
/*   */     //   385: iaload
/*   */     //   386: aload_0
/*   */     //   387: getfield strategy : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;
/*   */     //   390: invokevirtual getMaxReviews : ()I
/*   */     //   393: if_icmpgt -> 467
/*   */     //   396: aload_3
/*   */     //   397: new com/intellij/ml/llm/matterhorn/requests/builder/TextContent
/*   */     //   400: dup
/*   */     //   401: aload #5
/*   */     //   403: checkcast com/intellij/ml/llm/matterhorn/requests/ReviewResult$Improvement
/*   */     //   406: invokevirtual getMessage : ()Ljava/lang/String;
/*   */     //   409: aconst_null
/*   */     //   410: iconst_2
/*   */     //   411: aconst_null
/*   */     //   412: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*   */     //   415: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content
/*   */     //   418: invokevirtual addFailedReviewContent : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;)Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   421: pop
/*   */     //   422: goto -> 467
/*   */     //   425: aload #5
/*   */     //   427: instanceof com/intellij/ml/llm/matterhorn/requests/ReviewResult$Success
/*   */     //   430: ifeq -> 459
/*   */     //   433: aload_0
/*   */     //   434: getfield strategy : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy;
/*   */     //   437: invokevirtual getExecution : ()Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;
/*   */     //   440: getstatic com/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution.UNTIL_SUCCESS : Lcom/intellij/ml/llm/matterhorn/requests/builder/ReviewStrategy$Execution;
/*   */     //   443: if_acmpne -> 467
/*   */     //   446: aload_1
/*   */     //   447: invokevirtual getReviewCount : ()[I
/*   */     //   450: aload_0
/*   */     //   451: getfield index : I
/*   */     //   454: iconst_m1
/*   */     //   455: iastore
/*   */     //   456: goto -> 467
/*   */     //   459: new kotlin/NoWhenBranchMatchedException
/*   */     //   462: dup
/*   */     //   463: invokespecial <init> : ()V
/*   */     //   466: athrow
/*   */     //   467: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   470: areturn
/*   */     //   471: new java/lang/IllegalStateException
/*   */     //   474: dup
/*   */     //   475: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   477: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   480: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #7	-> 63
/*   */     //   #8	-> 97
/*   */     //   #9	-> 114
/*   */     //   #11	-> 118
/*   */     //   #12	-> 143
/*   */     //   #14	-> 147
/*   */     //   #7	-> 192
/*   */     //   #15	-> 234
/*   */     //   #16	-> 242
/*   */     //   #17	-> 268
/*   */     //   #18	-> 307
/*   */     //   #20	-> 342
/*   */     //   #21	-> 425
/*   */     //   #22	-> 433
/*   */     //   #23	-> 446
/*   */     //   #14	-> 459
/*   */     //   #26	-> 467
/*   */     //   #7	-> 471
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   97	17	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;
/*   */     //   118	25	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;
/*   */     //   147	48	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;
/*   */     //   222	120	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;
/*   */     //   342	80	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;
/*   */     //   425	31	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;
/*   */     //   97	17	1	context	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*   */     //   118	25	1	context	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*   */     //   147	48	1	context	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*   */     //   213	61	1	context	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*   */     //   342	21	1	context	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*   */     //   425	31	1	context	Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;
/*   */     //   97	17	2	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;
/*   */     //   118	25	2	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;
/*   */     //   147	39	2	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;
/*   */     //   97	17	3	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   118	25	3	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   147	48	3	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   204	64	3	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   342	80	3	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   234	108	5	result	Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;
/*   */     //   342	80	5	result	Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;
/*   */     //   425	8	5	result	Lcom/intellij/ml/llm/matterhorn/requests/ReviewResult;
/*   */     //   0	481	4	$completion	Lkotlin/coroutines/Continuation;
/*   */     //   53	418	9	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   60	411	8	$result	Ljava/lang/Object;
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "AssistantMessageReviewHandler.kt", l = {14}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "context", "reviewResult"}, m = "handle", c = "com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageReviewHandler")
/*   */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*   */   static final class AssistantMessageReviewHandler$handle$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     Object L$1;
/*   */     Object L$2;
/*   */     int label;
/*   */     
/*   */     AssistantMessageReviewHandler$handle$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return AssistantMessageReviewHandler.this.handle(null, null, null, (Continuation<? super Unit>)this);
/*   */     }
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantMessageReviewHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */