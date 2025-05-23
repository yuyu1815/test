/*    */ package ai.grazie.model.llm.bdg;
/*    */ import ai.grazie.model.llm.bdg.pricing.LLMPerTokenPricing;
/*    */ import ai.grazie.model.llm.tokens.LLMTokenCounter;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Deprecated(message = "Use LLMChatAccountant instead")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002\b\007\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003B\033\022\f\020\004\032\b\022\004\022\0028\0000\005\022\006\020\006\032\0020\007¢\006\002\020\bJ.\020\t\032\b\022\004\022\0028\0000\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\b\020\016\032\004\030\0010\017H@¢\006\002\020\020J\026\020\021\032\b\022\004\022\0028\0000\n2\006\020\013\032\0020\fH\007J\032\020\021\032\b\022\004\022\0028\0000\n2\f\020\022\032\b\022\004\022\0020\f0\023J\023\020\024\032\0028\0002\006\020\025\032\0020\026¢\006\002\020\027J\034\020\030\032\b\022\004\022\0028\0000\n2\006\020\031\032\0020\032H@¢\006\002\020\033R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000¨\006\034"}, d2 = {"Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "pricing", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "counter", "Lai/grazie/model/llm/tokens/LLMTokenCounter;", "(Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;Lai/grazie/model/llm/tokens/LLMTokenCounter;)V", "completionContext", "Lai/grazie/model/llm/bdg/LLMBudget;", "prefix", "", "suffix", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "context", "texts", "", "estimate", "tokens", "", "(I)Lai/grazie/utils/mpp/money/Money;", "generation", "input", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "(Lai/grazie/model/llm/data/stream/LLMStreamData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
/*    */ public final class LLMCompletionBudgeting<T extends Money<T>> {
/*    */   @NotNull
/*    */   private final LLMPerTokenPricing<T> pricing;
/*    */   
/*    */   public LLMCompletionBudgeting(@NotNull LLMPerTokenPricing<T> pricing, @NotNull LLMTokenCounter counter) {
/* 15 */     this.pricing = pricing;
/* 16 */     this.counter = counter;
/*    */   } @NotNull
/*    */   private final LLMTokenCounter counter;
/*    */   @Nullable
/*    */   public final Object completionContext(@NotNull String prefix, @NotNull String suffix, @Nullable Attributes parameters, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof ai/grazie/model/llm/bdg/LLMCompletionBudgeting$completionContext$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast ai/grazie/model/llm/bdg/LLMCompletionBudgeting$completionContext$1
/*    */     //   13: astore #8
/*    */     //   15: aload #8
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #8
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new ai/grazie/model/llm/bdg/LLMCompletionBudgeting$completionContext$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #8
/*    */     //   53: aload #8
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #7
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #9
/*    */     //   65: aload #8
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 182, 0 -> 92, 1 -> 130
/*    */     //   92: aload #7
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: getfield counter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   101: aload_1
/*    */     //   102: aload_2
/*    */     //   103: aload_3
/*    */     //   104: aload #8
/*    */     //   106: aload #8
/*    */     //   108: aload_0
/*    */     //   109: putfield L$0 : Ljava/lang/Object;
/*    */     //   112: aload #8
/*    */     //   114: iconst_1
/*    */     //   115: putfield label : I
/*    */     //   118: invokevirtual countCompletionContextTokens : (Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   121: dup
/*    */     //   122: aload #9
/*    */     //   124: if_acmpne -> 146
/*    */     //   127: aload #9
/*    */     //   129: areturn
/*    */     //   130: aload #8
/*    */     //   132: getfield L$0 : Ljava/lang/Object;
/*    */     //   135: checkcast ai/grazie/model/llm/bdg/LLMCompletionBudgeting
/*    */     //   138: astore_0
/*    */     //   139: aload #7
/*    */     //   141: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   144: aload #7
/*    */     //   146: checkcast java/lang/Number
/*    */     //   149: invokevirtual intValue : ()I
/*    */     //   152: istore #5
/*    */     //   154: aload_0
/*    */     //   155: getfield pricing : Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;
/*    */     //   158: invokevirtual getContext : ()Lai/grazie/model/bdg/price/ResourcePricing;
/*    */     //   161: iload #5
/*    */     //   163: invokeinterface estimate : (I)Lai/grazie/utils/mpp/money/Money;
/*    */     //   168: astore #6
/*    */     //   170: new ai/grazie/model/llm/bdg/LLMBudget
/*    */     //   173: dup
/*    */     //   174: aload #6
/*    */     //   176: iload #5
/*    */     //   178: invokespecial <init> : (Lai/grazie/utils/mpp/money/Money;I)V
/*    */     //   181: areturn
/*    */     //   182: new java/lang/IllegalStateException
/*    */     //   185: dup
/*    */     //   186: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   188: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   191: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 63
/*    */     //   #19	-> 97
/*    */     //   #18	-> 127
/*    */     //   #19	-> 146
/*    */     //   #20	-> 154
/*    */     //   #21	-> 170
/*    */     //   #18	-> 182
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	33	0	this	Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;
/*    */     //   139	43	0	this	Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;
/*    */     //   97	24	1	prefix	Ljava/lang/String;
/*    */     //   97	24	2	suffix	Ljava/lang/String;
/*    */     //   97	24	3	parameters	Lai/grazie/utils/attributes/Attributes;
/*    */     //   154	28	5	tokens	I
/*    */     //   170	12	6	price	Lai/grazie/utils/mpp/money/Money;
/*    */     //   0	192	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	129	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	122	7	$result	Ljava/lang/Object;
/*    */   }
/*    */   @Deprecated(message = "Use context(List<String>) instead", replaceWith = @ReplaceWith(expression = "context(listOf(prefix))", imports = {}))
/*    */   @NotNull
/*    */   public final LLMBudget<T> context(@NotNull String prefix) {
/* 26 */     Intrinsics.checkNotNullParameter(prefix, "prefix"); return context(CollectionsKt.listOf(prefix));
/*    */   }
/*    */   @NotNull
/*    */   public final LLMBudget<T> context(@NotNull List texts) {
/* 30 */     Intrinsics.checkNotNullParameter(texts, "texts"); int tokens = this.counter.count(texts);
/* 31 */     Money price = this.pricing.getContext().estimate(tokens);
/* 32 */     return new LLMBudget<>((T)price, tokens);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Object generation(@NotNull LLMStreamData input, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/bdg/LLMCompletionBudgeting$generation$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/bdg/LLMCompletionBudgeting$generation$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/bdg/LLMCompletionBudgeting$generation$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 165, 0 -> 88, 1 -> 124
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield counter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   97: aload_1
/*    */     //   98: aload #6
/*    */     //   100: aload #6
/*    */     //   102: aload_0
/*    */     //   103: putfield L$0 : Ljava/lang/Object;
/*    */     //   106: aload #6
/*    */     //   108: iconst_1
/*    */     //   109: putfield label : I
/*    */     //   112: invokevirtual countGenerationTokens : (Lai/grazie/model/llm/data/stream/LLMStreamData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   115: dup
/*    */     //   116: aload #7
/*    */     //   118: if_acmpne -> 140
/*    */     //   121: aload #7
/*    */     //   123: areturn
/*    */     //   124: aload #6
/*    */     //   126: getfield L$0 : Ljava/lang/Object;
/*    */     //   129: checkcast ai/grazie/model/llm/bdg/LLMCompletionBudgeting
/*    */     //   132: astore_0
/*    */     //   133: aload #5
/*    */     //   135: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   138: aload #5
/*    */     //   140: checkcast java/lang/Number
/*    */     //   143: invokevirtual intValue : ()I
/*    */     //   146: istore_3
/*    */     //   147: aload_0
/*    */     //   148: iload_3
/*    */     //   149: invokevirtual estimate : (I)Lai/grazie/utils/mpp/money/Money;
/*    */     //   152: astore #4
/*    */     //   154: new ai/grazie/model/llm/bdg/LLMBudget
/*    */     //   157: dup
/*    */     //   158: aload #4
/*    */     //   160: iload_3
/*    */     //   161: invokespecial <init> : (Lai/grazie/utils/mpp/money/Money;I)V
/*    */     //   164: areturn
/*    */     //   165: new java/lang/IllegalStateException
/*    */     //   168: dup
/*    */     //   169: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   171: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   174: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 60
/*    */     //   #36	-> 93
/*    */     //   #35	-> 121
/*    */     //   #36	-> 140
/*    */     //   #37	-> 147
/*    */     //   #38	-> 154
/*    */     //   #35	-> 165
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	31	0	this	Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;
/*    */     //   133	32	0	this	Lai/grazie/model/llm/bdg/LLMCompletionBudgeting;
/*    */     //   93	22	1	input	Lai/grazie/model/llm/data/stream/LLMStreamData;
/*    */     //   147	18	3	tokens	I
/*    */     //   154	11	4	price	Lai/grazie/utils/mpp/money/Money;
/*    */     //   0	175	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	115	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	108	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final T estimate(int tokens) {
/* 42 */     return (T)this.pricing.getGeneration().estimate(tokens);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMCompletionBudgeting.kt", l = {19}, i = {0}, s = {"L$0"}, n = {"this"}, m = "completionContext", c = "ai.grazie.model.llm.bdg.LLMCompletionBudgeting")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMCompletionBudgeting$completionContext$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LLMCompletionBudgeting$completionContext$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMCompletionBudgeting.this.completionContext(null, null, null, (Continuation<? super LLMBudget<T>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMCompletionBudgeting.kt", l = {36}, i = {0}, s = {"L$0"}, n = {"this"}, m = "generation", c = "ai.grazie.model.llm.bdg.LLMCompletionBudgeting")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMCompletionBudgeting$generation$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LLMCompletionBudgeting$generation$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMCompletionBudgeting.this.generation(null, (Continuation<? super LLMBudget<T>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\LLMCompletionBudgeting.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */