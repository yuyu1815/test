/*    */ package ai.grazie.model.llm.bdg.pricing;
/*    */ 
/*    */ import ai.grazie.utils.mpp.money.Money;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002JE\020\003\032\b\022\004\022\002H\0050\004\"\016\b\001\020\005*\b\022\004\022\002H\0050\0062\006\020\007\032\002H\0052\006\020\b\032\002H\0052\b\b\002\020\t\032\002H\0052\b\b\002\020\n\032\002H\005¢\006\002\020\013JE\020\f\032\b\022\004\022\002H\0050\004\"\016\b\001\020\005*\b\022\004\022\002H\0050\0062\006\020\r\032\002H\0052\006\020\016\032\002H\0052\b\b\002\020\017\032\002H\0052\b\b\002\020\020\032\002H\005¢\006\002\020\013¨\006\021"}, d2 = {"Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing$Companion;", "", "()V", "perMillion", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "T", "Lai/grazie/utils/mpp/money/Money;", "contextPerMillion", "generationPerMillion", "cacheWriteContextPerMillion", "cacheReadContextPerMillion", "(Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;)Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "perThousand", "contextPerThousand", "generationPerThousand", "cacheWriteContextPerThousand", "cacheReadContextPerThousand", "model-llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final <T extends Money<T>> LLMPerTokenPricing<T> perThousand(@NotNull Money contextPerThousand, @NotNull Money generationPerThousand, @NotNull Money cacheWriteContextPerThousand, @NotNull Money cacheReadContextPerThousand) {
/* 41 */     Intrinsics.checkNotNullParameter(contextPerThousand, "contextPerThousand"); Intrinsics.checkNotNullParameter(generationPerThousand, "generationPerThousand"); Intrinsics.checkNotNullParameter(cacheWriteContextPerThousand, "cacheWriteContextPerThousand"); Intrinsics.checkNotNullParameter(cacheReadContextPerThousand, "cacheReadContextPerThousand"); return new LLMPerTokenPricing<>(
/* 42 */         (T)contextPerThousand.shr(3), 
/* 43 */         (T)generationPerThousand.shr(3), 
/* 44 */         (T)cacheWriteContextPerThousand.shr(3), 
/* 45 */         (T)cacheReadContextPerThousand.shr(3));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final <T extends Money<T>> LLMPerTokenPricing<T> perMillion(@NotNull Money contextPerMillion, @NotNull Money generationPerMillion, @NotNull Money cacheWriteContextPerMillion, @NotNull Money cacheReadContextPerMillion) {
/* 55 */     Intrinsics.checkNotNullParameter(contextPerMillion, "contextPerMillion"); Intrinsics.checkNotNullParameter(generationPerMillion, "generationPerMillion"); Intrinsics.checkNotNullParameter(cacheWriteContextPerMillion, "cacheWriteContextPerMillion"); Intrinsics.checkNotNullParameter(cacheReadContextPerMillion, "cacheReadContextPerMillion"); return new LLMPerTokenPricing<>(
/* 56 */         (T)contextPerMillion.shr(6), 
/* 57 */         (T)generationPerMillion.shr(6), 
/* 58 */         (T)cacheWriteContextPerMillion.shr(6), 
/* 59 */         (T)cacheReadContextPerMillion.shr(6));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\pricing\LLMPerTokenPricing$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */