/*    */ package ai.grazie.model.llm.bdg.pricing;
/*    */ 
/*    */ import ai.grazie.model.llm.profile.LLMProfileID;
/*    */ import ai.grazie.utils.mpp.money.Dollar;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Deprecated(message = "In favor of LLMPerTokenPricingProviderMoney")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bg\030\0002\b\022\004\022\0020\0020\001J\030\020\003\032\n\022\004\022\0020\002\030\0010\0042\006\020\005\032\0020\006H\026ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricingProvider;", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricingProviderMoney;", "Lai/grazie/utils/mpp/money/Dollar;", "dollars", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "id", "Lai/grazie/model/llm/profile/LLMProfileID;", "model-llm"})
/*    */ public interface LLMPerTokenPricingProvider
/*    */   extends LLMPerTokenPricingProviderMoney<Dollar>
/*    */ {
/*    */   @Nullable
/*    */   default LLMPerTokenPricing<Dollar> dollars(@NotNull LLMProfileID id) {
/* 28 */     Intrinsics.checkNotNullParameter(id, "id"); return money(id);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\pricing\LLMPerTokenPricingProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */