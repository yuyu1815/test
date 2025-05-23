/*    */ package com.intellij.ml.llm.matterhorn.ej.core.summarization;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentResponse;
/*    */ import com.intellij.ml.llm.matterhorn.requests.ReviewerResponse;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\036\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H@¢\006\002\020\fR\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer;", "", "<init>", "()V", "LIMIT_FOR_SUMMARY", "", "createStepSummary", "", "response", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class StepSummarizer {
/*    */   @NotNull
/*    */   public static final StepSummarizer INSTANCE = new StepSummarizer();
/*    */   public static final int LIMIT_FOR_SUMMARY = 260;
/*    */   
/*    */   @Nullable
/*    */   public final Object createStepSummary(@NotNull AgentResponse response, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer$createStepSummary$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer$createStepSummary$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer$createStepSummary$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 327, 0 -> 88, 1 -> 312
/*    */     //   88: aload #10
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: invokevirtual getActionResult : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   97: instanceof com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */     //   100: ifeq -> 134
/*    */     //   103: aload_1
/*    */     //   104: invokevirtual getActionResult : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   107: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornUserChatMessageWithToolResults
/*    */     //   110: invokevirtual getToolResults : ()Ljava/util/List;
/*    */     //   113: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*    */     //   116: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornToolResult
/*    */     //   119: dup
/*    */     //   120: ifnull -> 129
/*    */     //   123: invokevirtual getContent : ()Ljava/lang/String;
/*    */     //   126: goto -> 152
/*    */     //   129: pop
/*    */     //   130: aconst_null
/*    */     //   131: goto -> 152
/*    */     //   134: aload_1
/*    */     //   135: invokevirtual getActionResult : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   138: dup
/*    */     //   139: ifnull -> 150
/*    */     //   142: invokeinterface getContent : ()Ljava/lang/String;
/*    */     //   147: goto -> 152
/*    */     //   150: pop
/*    */     //   151: aconst_null
/*    */     //   152: astore #4
/*    */     //   154: aload_1
/*    */     //   155: invokevirtual getLlmResponse : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*    */     //   158: invokeinterface getContent : ()Ljava/lang/String;
/*    */     //   163: aload #4
/*    */     //   165: dup
/*    */     //   166: ifnonnull -> 172
/*    */     //   169: pop
/*    */     //   170: ldc ''
/*    */     //   172: bipush #30
/*    */     //   174: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   177: sipush #1000
/*    */     //   180: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   183: bipush #10
/*    */     //   185: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   188: invokestatic truncateLongOutput : (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
/*    */     //   191: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   196: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   199: astore #5
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
/*    */     //   232: astore #6
/*    */     //   234: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*    */     //   237: dup
/*    */     //   238: ldc 'You are a task step summarizer'
/*    */     //   240: aload #5
/*    */     //   242: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   245: aload #6
/*    */     //   247: aconst_null
/*    */     //   248: bipush #8
/*    */     //   250: aconst_null
/*    */     //   251: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   254: astore #7
/*    */     //   256: new com/intellij/ml/llm/matterhorn/requests/UserReviewedRequest
/*    */     //   259: dup
/*    */     //   260: aload #7
/*    */     //   262: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*    */     //   265: aload #6
/*    */     //   267: new com/intellij/ml/llm/matterhorn/ej/core/summarization/StepSummarizer$createStepSummary$reviewed$1
/*    */     //   270: dup
/*    */     //   271: aconst_null
/*    */     //   272: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*    */     //   275: checkcast kotlin/jvm/functions/Function3
/*    */     //   278: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function3;)V
/*    */     //   281: astore #8
/*    */     //   283: aload_2
/*    */     //   284: aload #8
/*    */     //   286: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*    */     //   289: iconst_0
/*    */     //   290: aload #11
/*    */     //   292: iconst_2
/*    */     //   293: aconst_null
/*    */     //   294: aload #11
/*    */     //   296: iconst_1
/*    */     //   297: putfield label : I
/*    */     //   300: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   303: dup
/*    */     //   304: aload #12
/*    */     //   306: if_acmpne -> 319
/*    */     //   309: aload #12
/*    */     //   311: areturn
/*    */     //   312: aload #10
/*    */     //   314: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   317: aload #10
/*    */     //   319: checkcast java/lang/String
/*    */     //   322: astore #9
/*    */     //   324: aload #9
/*    */     //   326: areturn
/*    */     //   327: new java/lang/IllegalStateException
/*    */     //   330: dup
/*    */     //   331: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   333: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   336: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #21	-> 93
/*    */     //   #22	-> 103
/*    */     //   #24	-> 134
/*    */     //   #21	-> 152
/*    */     //   #38	-> 154
/*    */     //   #43	-> 163
/*    */     //   #47	-> 196
/*    */     //   #26	-> 199
/*    */     //   #49	-> 201
/*    */     //   #50	-> 234
/*    */     //   #51	-> 256
/*    */     //   #59	-> 283
/*    */     //   #17	-> 309
/*    */     //   #60	-> 324
/*    */     //   #17	-> 327
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	70	1	response	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentResponse;
/*    */     //   93	210	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   154	15	4	actionResultContent	Ljava/lang/String;
/*    */     //   201	55	5	message	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*    */     //   234	49	6	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*    */     //   256	27	7	request	Lcom/intellij/ml/llm/matterhorn/requests/SimpleRequest;
/*    */     //   283	20	8	reviewed	Lcom/intellij/ml/llm/matterhorn/requests/UserReviewedRequest;
/*    */     //   324	3	9	summary	Ljava/lang/String;
/*    */     //   0	337	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	277	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	270	10	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "StepSummarizer.kt", l = {59}, i = {}, s = {}, n = {}, m = "createStepSummary", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.StepSummarizer")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class StepSummarizer$createStepSummary$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     StepSummarizer$createStepSummary$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return StepSummarizer.this.createStepSummary(null, null, (Continuation<? super String>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "StepSummarizer.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.summarization.StepSummarizer$createStepSummary$reviewed$1")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/requests/ReviewerResponse;", "answer", "", "attempt", ""})
/*    */   static final class StepSummarizer$createStepSummary$reviewed$1 extends SuspendLambda implements Function3<String, Integer, Continuation<? super ReviewerResponse>, Object> {
/*    */     public final Object invokeSuspend(Object $result) {
/*    */       String answer;
/*    */       int attempt;
/* 51 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); answer = (String)this.L$0; attempt = this.I$0;
/* 52 */           if (answer.length() < 260 || attempt > 2) {
/* 53 */             return ReviewerResponse.Companion.ok();
/*    */           }
/* 55 */           return ReviewerResponse.Companion.error$default(ReviewerResponse.Companion, "Your response is too long. Make it shorter, return only short summary without any additional text or symbols.", null, 2, null); }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */     }
/*    */     
/*    */     int label;
/*    */     
/*    */     StepSummarizer$createStepSummary$reviewed$1(Continuation $completion) {
/*    */       super(3, $completion);
/*    */     }
/*    */     
/*    */     public final Object invoke(String p1, int p2, Continuation<? super StepSummarizer$createStepSummary$reviewed$1> p3) {
/*    */       StepSummarizer$createStepSummary$reviewed$1 stepSummarizer$createStepSummary$reviewed$1 = new StepSummarizer$createStepSummary$reviewed$1(p3);
/*    */       stepSummarizer$createStepSummary$reviewed$1.L$0 = p1;
/*    */       stepSummarizer$createStepSummary$reviewed$1.I$0 = p2;
/*    */       return stepSummarizer$createStepSummary$reviewed$1.invokeSuspend(Unit.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\summarization\StepSummarizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */