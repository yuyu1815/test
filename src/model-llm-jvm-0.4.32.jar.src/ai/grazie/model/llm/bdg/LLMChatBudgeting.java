/*    */ package ai.grazie.model.llm.bdg;
/*    */ import ai.grazie.model.llm.bdg.pricing.LLMPerTokenPricing;
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Deprecated(message = "Use LLMChatAccountant instead")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\002\b\007\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003B\033\022\f\020\004\032\b\022\004\022\0028\0000\005\022\006\020\006\032\0020\007¢\006\002\020\bJ&\020\t\032\b\022\004\022\0028\0000\n2\006\020\013\032\0020\f2\b\b\002\020\r\032\0020\016H@¢\006\002\020\017J\023\020\020\032\0028\0002\006\020\021\032\0020\022¢\006\002\020\023J\023\020\024\032\0028\0002\006\020\021\032\0020\022¢\006\002\020\023J\034\020\025\032\b\022\004\022\0028\0000\n2\006\020\013\032\0020\026H@¢\006\002\020\027R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lai/grazie/model/llm/bdg/LLMChatBudgeting;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "pricing", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "counter", "Lai/grazie/model/llm/tokens/LLMTokenCounter;", "(Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;Lai/grazie/model/llm/tokens/LLMTokenCounter;)V", "context", "Lai/grazie/model/llm/bdg/LLMBudget;", "input", "Lai/grazie/model/llm/chat/v5/LLMChat;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "estimate", "tokens", "", "(I)Lai/grazie/utils/mpp/money/Money;", "estimateContext", "generation", "Lai/grazie/model/llm/data/stream/LLMStreamData;", "(Lai/grazie/model/llm/data/stream/LLMStreamData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
/*    */ public final class LLMChatBudgeting<T extends Money<T>> {
/*    */   @NotNull
/*    */   private final LLMPerTokenPricing<T> pricing;
/*    */   
/*    */   public LLMChatBudgeting(@NotNull LLMPerTokenPricing<T> pricing, @NotNull LLMTokenCounter counter) {
/* 16 */     this.pricing = pricing;
/* 17 */     this.counter = counter;
/*    */   }
/*    */   @NotNull
/*    */   private final LLMTokenCounter counter;
/*    */   @Nullable
/*    */   public final Object context(@NotNull LLMChat input, @NotNull Attributes parameters, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof ai/grazie/model/llm/bdg/LLMChatBudgeting$context$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast ai/grazie/model/llm/bdg/LLMChatBudgeting$context$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new ai/grazie/model/llm/bdg/LLMChatBudgeting$context$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/bdg/LLMChatBudgeting;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 177, 0 -> 88, 1 -> 125
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: getfield counter : Lai/grazie/model/llm/tokens/LLMTokenCounter;
/*    */     //   97: aload_1
/*    */     //   98: aload_2
/*    */     //   99: aload #7
/*    */     //   101: aload #7
/*    */     //   103: aload_0
/*    */     //   104: putfield L$0 : Ljava/lang/Object;
/*    */     //   107: aload #7
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokevirtual countContextTokens : (Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   116: dup
/*    */     //   117: aload #8
/*    */     //   119: if_acmpne -> 141
/*    */     //   122: aload #8
/*    */     //   124: areturn
/*    */     //   125: aload #7
/*    */     //   127: getfield L$0 : Ljava/lang/Object;
/*    */     //   130: checkcast ai/grazie/model/llm/bdg/LLMChatBudgeting
/*    */     //   133: astore_0
/*    */     //   134: aload #6
/*    */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   139: aload #6
/*    */     //   141: checkcast java/lang/Number
/*    */     //   144: invokevirtual intValue : ()I
/*    */     //   147: istore #4
/*    */     //   149: aload_0
/*    */     //   150: getfield pricing : Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;
/*    */     //   153: invokevirtual getContext : ()Lai/grazie/model/bdg/price/ResourcePricing;
/*    */     //   156: iload #4
/*    */     //   158: invokeinterface estimate : (I)Lai/grazie/utils/mpp/money/Money;
/*    */     //   163: astore #5
/*    */     //   165: new ai/grazie/model/llm/bdg/LLMBudget
/*    */     //   168: dup
/*    */     //   169: aload #5
/*    */     //   171: iload #4
/*    */     //   173: invokespecial <init> : (Lai/grazie/utils/mpp/money/Money;I)V
/*    */     //   176: areturn
/*    */     //   177: new java/lang/IllegalStateException
/*    */     //   180: dup
/*    */     //   181: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   183: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   186: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 60
/*    */     //   #20	-> 93
/*    */     //   #19	-> 122
/*    */     //   #20	-> 141
/*    */     //   #21	-> 149
/*    */     //   #22	-> 165
/*    */     //   #19	-> 177
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	32	0	this	Lai/grazie/model/llm/bdg/LLMChatBudgeting;
/*    */     //   134	43	0	this	Lai/grazie/model/llm/bdg/LLMChatBudgeting;
/*    */     //   93	23	1	input	Lai/grazie/model/llm/chat/v5/LLMChat;
/*    */     //   93	23	2	parameters	Lai/grazie/utils/attributes/Attributes;
/*    */     //   149	28	4	tokens	I
/*    */     //   165	12	5	price	Lai/grazie/utils/mpp/money/Money;
/*    */     //   0	187	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	127	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	120	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   @Nullable
/*    */   public final Object generation(@NotNull LLMStreamData input, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof ai/grazie/model/llm/bdg/LLMChatBudgeting$generation$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast ai/grazie/model/llm/bdg/LLMChatBudgeting$generation$1
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
/*    */     //   39: new ai/grazie/model/llm/bdg/LLMChatBudgeting$generation$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lai/grazie/model/llm/bdg/LLMChatBudgeting;Lkotlin/coroutines/Continuation;)V
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
/*    */     //   129: checkcast ai/grazie/model/llm/bdg/LLMChatBudgeting
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
/*    */     //   #25	-> 60
/*    */     //   #26	-> 93
/*    */     //   #25	-> 121
/*    */     //   #26	-> 140
/*    */     //   #27	-> 147
/*    */     //   #28	-> 154
/*    */     //   #25	-> 165
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	31	0	this	Lai/grazie/model/llm/bdg/LLMChatBudgeting;
/*    */     //   133	32	0	this	Lai/grazie/model/llm/bdg/LLMChatBudgeting;
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
/* 32 */     return (T)this.pricing.getGeneration().estimate(tokens);
/*    */   }
/*    */   @NotNull
/*    */   public final T estimateContext(int tokens) {
/* 36 */     return (T)this.pricing.getContext().estimate(tokens);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMChatBudgeting.kt", l = {20}, i = {0}, s = {"L$0"}, n = {"this"}, m = "context", c = "ai.grazie.model.llm.bdg.LLMChatBudgeting")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMChatBudgeting$context$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LLMChatBudgeting$context$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMChatBudgeting.this.context(null, null, (Continuation<? super LLMBudget<T>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "LLMChatBudgeting.kt", l = {26}, i = {0}, s = {"L$0"}, n = {"this"}, m = "generation", c = "ai.grazie.model.llm.bdg.LLMChatBudgeting")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class LLMChatBudgeting$generation$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     LLMChatBudgeting$generation$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return LLMChatBudgeting.this.generation(null, (Continuation<? super LLMBudget<T>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\LLMChatBudgeting.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */