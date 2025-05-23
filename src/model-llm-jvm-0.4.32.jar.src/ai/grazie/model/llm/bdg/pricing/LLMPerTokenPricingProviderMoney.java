/*    */ package ai.grazie.model.llm.bdg.pricing;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import ai.grazie.utils.mpp.money.Money;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\bf\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003J\030\020\004\032\n\022\004\022\0020\006\030\0010\0052\006\020\007\032\0020\bH\026J\030\020\t\032\n\022\004\022\0028\000\030\0010\0052\006\020\007\032\0020\bH&J\021\020\n\032\0020\006*\0028\000H\026¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricingProviderMoney;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "credits", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "Lai/grazie/utils/mpp/money/Credit;", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "money", "moneyToCredit", "(Lai/grazie/utils/mpp/money/Money;)Lai/grazie/utils/mpp/money/Credit;", "model-llm"})
/*    */ public interface LLMPerTokenPricingProviderMoney<T extends Money<T>> {
/*    */   @NotNull
/* 11 */   default Credit moneyToCredit(@NotNull Money $this$moneyToCredit) { Intrinsics.checkNotNullParameter($this$moneyToCredit, "<this>"); return Credit.Companion.credit($this$moneyToCredit); } @Nullable
/*    */   LLMPerTokenPricing<T> money(@NotNull LLMProfileID paramLLMProfileID); @Nullable
/*    */   default LLMPerTokenPricing<Credit> credits(@NotNull LLMProfileID id) {
/*    */     LLMPerTokenPricing<T> money;
/* 15 */     Intrinsics.checkNotNullParameter(id, "id"); if (money(id) == null) { money(id); return null; }
/* 16 */      return new LLMPerTokenPricing(
/* 17 */         moneyToCredit((T)money.getContext().getPrice()), 
/* 18 */         moneyToCredit((T)money.getGeneration().getPrice()), 
/* 19 */         moneyToCredit((T)money.getCacheWriteContext().getPrice()), 
/* 20 */         moneyToCredit((T)money.getCacheReadContext().getPrice()));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\pricing\LLMPerTokenPricingProviderMoney.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */