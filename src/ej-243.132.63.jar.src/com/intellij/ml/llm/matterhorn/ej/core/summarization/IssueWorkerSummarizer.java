/*    */ package com.intellij.ml.llm.matterhorn.ej.core.summarization;
/*    */ import kotlin.coroutines.Continuation;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\fR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/IssueWorkerSummarizer;", "", "<init>", "()V", "LIMIT_FOR_SUMMARY", "", "produceReport", "", "currentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class IssueWorkerSummarizer {
/*    */   @NotNull
/*    */   public static final IssueWorkerSummarizer INSTANCE = new IssueWorkerSummarizer();
/*    */   public static final int LIMIT_FOR_SUMMARY = 400;
/*    */   
/*    */   @Nullable
/*    */   public final Object produceReport(@NotNull AgentState currentState, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/summarization/IssueWorkerSummarizer$produceReport$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/summarization/IssueWorkerSummarizer$produceReport$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/summarization/IssueWorkerSummarizer$produceReport$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/IssueWorkerSummarizer;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #10
/*    */     //   50: aload #10
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #9
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #11
/*    */     //   62: aload #10
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 289, 0 -> 88, 1 -> 274
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
/*    */     //   133: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   136: astore #5
/*    */     //   138: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   141: dup
/*    */     //   142: ldc 'You are a task trace summarizer'
/*    */     //   144: aload #5
/*    */     //   146: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   149: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*    */     //   152: dup
/*    */     //   153: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*    */     //   156: invokevirtual getGPT_4_O_MINI_2024_07_18 : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   159: iconst_0
/*    */     //   160: aconst_null
/*    */     //   161: aconst_null
/*    */     //   162: aconst_null
/*    */     //   163: aconst_null
/*    */     //   164: aconst_null
/*    */     //   165: aconst_null
/*    */     //   166: aconst_null
/*    */     //   167: aconst_null
/*    */     //   168: aconst_null
/*    */     //   169: aconst_null
/*    */     //   170: aconst_null
/*    */     //   171: iconst_0
/*    */     //   172: aconst_null
/*    */     //   173: sipush #32766
/*    */     //   176: aconst_null
/*    */     //   177: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   180: aconst_null
/*    */     //   181: bipush #8
/*    */     //   183: aconst_null
/*    */     //   184: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   187: astore #6
/*    */     //   189: new com/intellij/ml/llm/matterhorn/requests/UserReviewedRequest
/*    */     //   192: dup
/*    */     //   193: aload #6
/*    */     //   195: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*    */     //   198: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*    */     //   201: dup
/*    */     //   202: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*    */     //   205: invokevirtual getGPT_4_O_MINI_2024_07_18 : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*    */     //   208: iconst_0
/*    */     //   209: aconst_null
/*    */     //   210: aconst_null
/*    */     //   211: aconst_null
/*    */     //   212: aconst_null
/*    */     //   213: aconst_null
/*    */     //   214: aconst_null
/*    */     //   215: aconst_null
/*    */     //   216: aconst_null
/*    */     //   217: aconst_null
/*    */     //   218: aconst_null
/*    */     //   219: aconst_null
/*    */     //   220: iconst_0
/*    */     //   221: aconst_null
/*    */     //   222: sipush #32766
/*    */     //   225: aconst_null
/*    */     //   226: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   229: new com/intellij/ml/llm/matterhorn/ej/core/summarization/IssueWorkerSummarizer$produceReport$reviewed$1
/*    */     //   232: dup
/*    */     //   233: aconst_null
/*    */     //   234: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   237: checkcast kotlin/jvm/functions/Function3
/*    */     //   240: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V
/*    */     //   243: astore #7
/*    */     //   245: aload_2
/*    */     //   246: aload #7
/*    */     //   248: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*    */     //   251: iconst_0
/*    */     //   252: aload #10
/*    */     //   254: iconst_2
/*    */     //   255: aconst_null
/*    */     //   256: aload #10
/*    */     //   258: iconst_1
/*    */     //   259: putfield label : I
/*    */     //   262: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   265: dup
/*    */     //   266: aload #11
/*    */     //   268: if_acmpne -> 281
/*    */     //   271: aload #11
/*    */     //   273: areturn
/*    */     //   274: aload #9
/*    */     //   276: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   279: aload #9
/*    */     //   281: checkcast java/lang/String
/*    */     //   284: astore #8
/*    */     //   286: aload #8
/*    */     //   288: areturn
/*    */     //   289: new java/lang/IllegalStateException
/*    */     //   292: dup
/*    */     //   293: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   295: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   298: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 60
/*    */     //   #19	-> 93
/*    */     //   #33	-> 99
/*    */     //   #37	-> 126
/*    */     //   #38	-> 133
/*    */     //   #21	-> 136
/*    */     //   #40	-> 138
/*    */     //   #41	-> 142
/*    */     //   #42	-> 144
/*    */     //   #43	-> 149
/*    */     //   #40	-> 180
/*    */     //   #46	-> 189
/*    */     //   #45	-> 229
/*    */     //   #46	-> 240
/*    */     //   #45	-> 243
/*    */     //   #53	-> 245
/*    */     //   #15	-> 271
/*    */     //   #54	-> 286
/*    */     //   #15	-> 289
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	33	1	currentState	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*    */     //   93	172	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   99	34	4	taskSolutionHistory	Ljava/lang/String;
/*    */     //   138	11	5	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   189	40	6	request	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   245	20	7	reviewed	Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;
/*    */     //   286	3	8	summary	Ljava/lang/String;
/*    */     //   0	299	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	239	10	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	232	9	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "IssueWorkerSummarizer.kt", l = {53}, i = {}, s = {}, n = {}, m = "produceReport", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.IssueWorkerSummarizer")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class IssueWorkerSummarizer$produceReport$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     IssueWorkerSummarizer$produceReport$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return IssueWorkerSummarizer.this.produceReport(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final CharSequence produceReport$lambda$0(MatterhornChatElement it) {
/* 33 */     Intrinsics.checkNotNullParameter(it, "it"); return it.getContent();
/*    */   }
/*    */ 
/*    */   
/*    */   @DebugMetadata(f = "IssueWorkerSummarizer.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.IssueWorkerSummarizer$produceReport$reviewed$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*    */   static final class IssueWorkerSummarizer$produceReport$reviewed$1
/*    */     extends SuspendLambda
/*    */     implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object>
/*    */   {
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       String answer;
/*    */       int attempt;
/* 46 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); answer = (String)this.L$0; attempt = this.I$0;
/* 47 */           if (answer.length() < 400 || attempt > 2) {
/* 48 */             return ReviewerResponse.Companion.ok();
/*    */           }
/* 50 */           return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, "Your response is too long. Make it shorter, return only short summary without any additional text or symbols.", null, 2, null); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     int label;
/*    */     
/*    */     IssueWorkerSummarizer$produceReport$reviewed$1(Continuation $completion) {
/*    */       super(3, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(String p1, int p2, Continuation<? super IssueWorkerSummarizer$produceReport$reviewed$1> p3) {
/*    */       IssueWorkerSummarizer$produceReport$reviewed$1 issueWorkerSummarizer$produceReport$reviewed$1 = new IssueWorkerSummarizer$produceReport$reviewed$1(p3);
/*    */       issueWorkerSummarizer$produceReport$reviewed$1.L$0 = p1;
/*    */       issueWorkerSummarizer$produceReport$reviewed$1.I$0 = p2;
/*    */       return issueWorkerSummarizer$produceReport$reviewed$1.invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\summarization\IssueWorkerSummarizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */