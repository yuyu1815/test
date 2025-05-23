/*    */ package com.intellij.ml.llm.matterhorn.ej.core.summarization;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\fR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/ResultSummarizer;", "", "<init>", "()V", "LIMIT_FOR_TITLE", "", "produceChatResultTitle", "", "currentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class ResultSummarizer {
/*    */   @NotNull
/*    */   public static final ResultSummarizer INSTANCE = new ResultSummarizer();
/*    */   public static final int LIMIT_FOR_TITLE = 34;
/*    */   
/*    */   @Nullable
/*    */   public final Object produceChatResultTitle(@NotNull AgentState currentState, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/summarization/ResultSummarizer$produceChatResultTitle$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/summarization/ResultSummarizer$produceChatResultTitle$1
/*    */     //   11: astore #10
/*    */     //   13: aload #10
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #10
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/summarization/ResultSummarizer$produceChatResultTitle$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/ResultSummarizer;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #10
/*    */     //   50: aload #10
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #9
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #11
/*    */     //   62: aload #10
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 292, 0 -> 88, 1 -> 277
/*    */     //   88: aload #9
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual shortPresentableHistory : ()Ljava/lang/String;
/*    */     //   97: astore #4
/*    */     //   99: aload_1
/*    */     //   100: invokevirtual getIssueDescription : ()Ljava/util/List;
/*    */     //   103: checkcast java/lang/Iterable
/*    */     //   106: ldc '\\n'
/*    */     //   108: checkcast java/lang/CharSequence
/*    */     //   111: aconst_null
/*    */     //   112: aconst_null
/*    */     //   113: iconst_0
/*    */     //   114: aconst_null
/*    */     //   115: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   120: bipush #30
/*    */     //   122: aconst_null
/*    */     //   123: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   126: aload #4
/*    */     //   128: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   133: invokestatic trimIndent : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   136: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   139: astore #5
/*    */     //   141: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   144: dup
/*    */     //   145: ldc 'You are a chat response title creator'
/*    */     //   147: aload #5
/*    */     //   149: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   152: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*    */     //   155: dup
/*    */     //   156: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*    */     //   159: invokevirtual getGPT_4_O_MINI_2024_07_18 : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   162: iconst_0
/*    */     //   163: aconst_null
/*    */     //   164: aconst_null
/*    */     //   165: aconst_null
/*    */     //   166: aconst_null
/*    */     //   167: aconst_null
/*    */     //   168: aconst_null
/*    */     //   169: aconst_null
/*    */     //   170: aconst_null
/*    */     //   171: aconst_null
/*    */     //   172: aconst_null
/*    */     //   173: aconst_null
/*    */     //   174: iconst_0
/*    */     //   175: aconst_null
/*    */     //   176: sipush #32766
/*    */     //   179: aconst_null
/*    */     //   180: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   183: aconst_null
/*    */     //   184: bipush #8
/*    */     //   186: aconst_null
/*    */     //   187: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   190: astore #6
/*    */     //   192: new com/intellij/ml/llm/matterhorn/requests/UserReviewedRequest
/*    */     //   195: dup
/*    */     //   196: aload #6
/*    */     //   198: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*    */     //   201: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*    */     //   204: dup
/*    */     //   205: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*    */     //   208: invokevirtual getGPT_4_O_MINI_2024_07_18 : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   211: iconst_0
/*    */     //   212: aconst_null
/*    */     //   213: aconst_null
/*    */     //   214: aconst_null
/*    */     //   215: aconst_null
/*    */     //   216: aconst_null
/*    */     //   217: aconst_null
/*    */     //   218: aconst_null
/*    */     //   219: aconst_null
/*    */     //   220: aconst_null
/*    */     //   221: aconst_null
/*    */     //   222: aconst_null
/*    */     //   223: iconst_0
/*    */     //   224: aconst_null
/*    */     //   225: sipush #32766
/*    */     //   228: aconst_null
/*    */     //   229: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   232: new com/intellij/ml/llm/matterhorn/ej/core/summarization/ResultSummarizer$produceChatResultTitle$reviewed$1
/*    */     //   235: dup
/*    */     //   236: aconst_null
/*    */     //   237: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   240: checkcast kotlin/jvm/functions/Function3
/*    */     //   243: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V
/*    */     //   246: astore #7
/*    */     //   248: aload_2
/*    */     //   249: aload #7
/*    */     //   251: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*    */     //   254: iconst_0
/*    */     //   255: aload #10
/*    */     //   257: iconst_2
/*    */     //   258: aconst_null
/*    */     //   259: aload #10
/*    */     //   261: iconst_1
/*    */     //   262: putfield label : I
/*    */     //   265: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   268: dup
/*    */     //   269: aload #11
/*    */     //   271: if_acmpne -> 284
/*    */     //   274: aload #11
/*    */     //   276: areturn
/*    */     //   277: aload #9
/*    */     //   279: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   282: aload #9
/*    */     //   284: checkcast java/lang/String
/*    */     //   287: astore #8
/*    */     //   289: aload #8
/*    */     //   291: areturn
/*    */     //   292: new java/lang/IllegalStateException
/*    */     //   295: dup
/*    */     //   296: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   298: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   301: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 60
/*    */     //   #16	-> 93
/*    */     //   #30	-> 99
/*    */     //   #34	-> 126
/*    */     //   #35	-> 133
/*    */     //   #18	-> 139
/*    */     //   #37	-> 141
/*    */     //   #38	-> 145
/*    */     //   #39	-> 147
/*    */     //   #40	-> 152
/*    */     //   #37	-> 183
/*    */     //   #43	-> 192
/*    */     //   #42	-> 232
/*    */     //   #43	-> 243
/*    */     //   #42	-> 246
/*    */     //   #50	-> 248
/*    */     //   #15	-> 274
/*    */     //   #51	-> 289
/*    */     //   #15	-> 292
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	33	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   93	175	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   99	34	4	taskSolutionHistory	Ljava/lang/String;
/*    */     //   141	11	5	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   192	40	6	request	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   248	20	7	reviewed	Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;
/*    */     //   289	3	8	summary	Ljava/lang/String;
/*    */     //   0	302	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	242	10	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	235	9	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "ResultSummarizer.kt", l = {50}, i = {}, s = {}, n = {}, m = "produceChatResultTitle", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.ResultSummarizer")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class ResultSummarizer$produceChatResultTitle$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     ResultSummarizer$produceChatResultTitle$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return ResultSummarizer.this.produceChatResultTitle(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final CharSequence produceChatResultTitle$lambda$0(MatterhornChatElement it) {
/* 30 */     Intrinsics.checkNotNullParameter(it, "it"); return it.getContent();
/*    */   }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "ResultSummarizer.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.ResultSummarizer$produceChatResultTitle$reviewed$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*    */   static final class ResultSummarizer$produceChatResultTitle$reviewed$1
/*    */     extends SuspendLambda
/*    */     implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object>
/*    */   {
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       String answer;
/*    */       int attempt;
/* 43 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); answer = (String)this.L$0; attempt = this.I$0;
/* 44 */           if (answer.length() < 34 || attempt > 2) {
/* 45 */             return ReviewerResponse.Companion.ok();
/*    */           }
/* 47 */           return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, "Your response is too long. Make it shorter, under 34 symbols limit.", null, 2, null); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     int label;
/*    */     
/*    */     ResultSummarizer$produceChatResultTitle$reviewed$1(Continuation $completion) {
/*    */       super(3, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(String p1, int p2, Continuation<? super ResultSummarizer$produceChatResultTitle$reviewed$1> p3) {
/*    */       ResultSummarizer$produceChatResultTitle$reviewed$1 resultSummarizer$produceChatResultTitle$reviewed$1 = new ResultSummarizer$produceChatResultTitle$reviewed$1(p3);
/*    */       resultSummarizer$produceChatResultTitle$reviewed$1.L$0 = p1;
/*    */       resultSummarizer$produceChatResultTitle$reviewed$1.I$0 = p2;
/*    */       return resultSummarizer$produceChatResultTitle$reviewed$1.invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\summarization\ResultSummarizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */