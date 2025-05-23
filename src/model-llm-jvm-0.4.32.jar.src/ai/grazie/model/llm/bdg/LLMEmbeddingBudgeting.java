/*    */ package ai.grazie.model.llm.bdg;
/*    */ 
/*    */ import ai.grazie.model.llm.tokens.LLMTokenCounter;
/*    */ import ai.grazie.utils.mpp.money.Money;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003B\033\022\f\020\004\032\b\022\004\022\0028\0000\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\034\020\t\032\b\022\004\022\0028\0000\n2\006\020\013\032\0020\fH@¢\006\002\020\rR\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\002\n\000¨\006\016"}, d2 = {"Lai/grazie/model/llm/bdg/LLMEmbeddingBudgeting;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "pricing", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "counter", "Lai/grazie/model/llm/tokens/LLMTokenCounter;", "(Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;Lai/grazie/model/llm/tokens/LLMTokenCounter;)V", "context", "Lai/grazie/model/llm/bdg/LLMBudget;", "prefix", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-llm"})
/*    */ public final class LLMEmbeddingBudgeting<T extends Money<T>> {
/*    */   @NotNull
/*    */   private final LLMPerTokenPricing<T> pricing;
/*    */   
/* 12 */   public LLMEmbeddingBudgeting(@NotNull LLMPerTokenPricing<T> pricing, @NotNull LLMTokenCounter counter) { this.pricing = pricing;
/* 13 */     this.counter = counter; } @NotNull
/*    */   private final LLMTokenCounter counter; @Nullable
/*    */   public final Object context(@NotNull String prefix, @NotNull Continuation $completion) {
/* 16 */     int tokens = this.counter.count(prefix);
/* 17 */     Money price = this.pricing.getContext().estimate(tokens);
/* 18 */     return new LLMBudget<>(price, tokens);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\LLMEmbeddingBudgeting.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */