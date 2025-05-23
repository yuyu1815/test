/*   */ package com.intellij.ml.llm.matterhorn.requests.builder;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J&\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH@¢\006\002\020\016R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;", "counterpart", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpart;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpart;)V", "handle", "", "context", "Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;", "assistantAnswer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;", "reviewResult", "Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*   */ @SourceDebugExtension({"SMAP\nAssistantMessageCounterpartHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssistantMessageCounterpartHandler.kt\ncom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"})
/* 3 */ public final class AssistantMessageCounterpartHandler implements AssistantMessageHandler { public AssistantMessageCounterpartHandler(@NotNull AssistantMessageCounterpart counterpart) { this.counterpart = counterpart; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   private final AssistantMessageCounterpart counterpart;
/*   */   
/*   */   @Nullable
/*   */   public Object handle(@NotNull RequestExecutionContext paramRequestExecutionContext, @NotNull AssistantAnswer assistantAnswer, @NotNull CombinedReviewResult reviewResult, @NotNull Continuation $completion) {
/*   */     // Byte code:
/*   */     //   0: aload #4
/*   */     //   2: instanceof com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler$handle$1
/*   */     //   5: ifeq -> 41
/*   */     //   8: aload #4
/*   */     //   10: checkcast com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler$handle$1
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
/*   */     //   41: new com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler$handle$1
/*   */     //   44: dup
/*   */     //   45: aload_0
/*   */     //   46: aload #4
/*   */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler;Lkotlin/coroutines/Continuation;)V
/*   */     //   51: astore #9
/*   */     //   53: aload #9
/*   */     //   55: getfield result : Ljava/lang/Object;
/*   */     //   58: astore #8
/*   */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*   */     //   63: astore #10
/*   */     //   65: aload #9
/*   */     //   67: getfield label : I
/*   */     //   70: tableswitch default -> 186, 0 -> 92, 1 -> 160
/*   */     //   92: aload #8
/*   */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   97: aload_3
/*   */     //   98: invokevirtual isReviewFailed : ()Z
/*   */     //   101: ifeq -> 108
/*   */     //   104: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   107: areturn
/*   */     //   108: aload_0
/*   */     //   109: getfield counterpart : Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpart;
/*   */     //   112: astore #5
/*   */     //   114: aload #5
/*   */     //   116: astore #6
/*   */     //   118: iconst_0
/*   */     //   119: istore #7
/*   */     //   121: aload #6
/*   */     //   123: aload_3
/*   */     //   124: invokevirtual getContents : ()Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;
/*   */     //   127: invokestatic constructor-impl : (Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;)Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;
/*   */     //   130: aload_2
/*   */     //   131: aload #9
/*   */     //   133: aload #9
/*   */     //   135: aload #5
/*   */     //   137: putfield L$0 : Ljava/lang/Object;
/*   */     //   140: aload #9
/*   */     //   142: iconst_1
/*   */     //   143: putfield label : I
/*   */     //   146: invokeinterface handle-_JRwX_Y : (Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*   */     //   151: dup
/*   */     //   152: aload #10
/*   */     //   154: if_acmpne -> 180
/*   */     //   157: aload #10
/*   */     //   159: areturn
/*   */     //   160: iconst_0
/*   */     //   161: istore #7
/*   */     //   163: aload #9
/*   */     //   165: getfield L$0 : Ljava/lang/Object;
/*   */     //   168: checkcast com/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpart
/*   */     //   171: astore #5
/*   */     //   173: aload #8
/*   */     //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*   */     //   178: aload #8
/*   */     //   180: pop
/*   */     //   181: nop
/*   */     //   182: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*   */     //   185: areturn
/*   */     //   186: new java/lang/IllegalStateException
/*   */     //   189: dup
/*   */     //   190: ldc 'call to 'resume' before 'invoke' with coroutine'
/*   */     //   192: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   195: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #4	-> 63
/*   */     //   #9	-> 97
/*   */     //   #10	-> 108
/*   */     //   #14	-> 118
/*   */     //   #10	-> 121
/*   */     //   #4	-> 157
/*   */     //   #10	-> 180
/*   */     //   #10	-> 181
/*   */     //   #11	-> 182
/*   */     //   #4	-> 186
/*   */     // Local variable table:
/*   */     //   start	length	slot	name	descriptor
/*   */     //   97	11	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler;
/*   */     //   108	6	0	this	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler;
/*   */     //   97	11	2	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;
/*   */     //   108	43	2	assistantAnswer	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;
/*   */     //   97	11	3	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   108	43	3	reviewResult	Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;
/*   */     //   118	33	6	$this$handle_u24lambda_u240	Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpart;
/*   */     //   121	39	7	$i$a$-apply-AssistantMessageCounterpartHandler$handle$2	I
/*   */     //   0	196	4	$completion	Lkotlin/coroutines/Continuation;
/*   */     //   53	133	9	$continuation	Lkotlin/coroutines/Continuation;
/*   */     //   60	126	8	$result	Ljava/lang/Object;
/*   */     //   163	18	7	$i$a$-apply-AssistantMessageCounterpartHandler$handle$2	I
/*   */   }
/*   */   
/*   */   @DebugMetadata(f = "AssistantMessageCounterpartHandler.kt", l = {10}, i = {}, s = {}, n = {}, m = "handle", c = "com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageCounterpartHandler")
/*   */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*   */   static final class AssistantMessageCounterpartHandler$handle$1 extends ContinuationImpl {
/*   */     Object L$0;
/*   */     int label;
/*   */     
/*   */     AssistantMessageCounterpartHandler$handle$1(Continuation $completion) {
/*   */       super($completion);
/*   */     }
/*   */     
/*   */     @Nullable
/*   */     public final Object invokeSuspend(@NotNull Object $result) {
/*   */       this.result = $result;
/*   */       this.label |= Integer.MIN_VALUE;
/*   */       return AssistantMessageCounterpartHandler.this.handle(null, null, null, (Continuation<? super Unit>)this);
/*   */     }
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantMessageCounterpartHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */