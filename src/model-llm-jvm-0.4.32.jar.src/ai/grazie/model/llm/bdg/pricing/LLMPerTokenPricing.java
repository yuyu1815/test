/*    */ package ai.grazie.model.llm.bdg.pricing;
/*    */ 
/*    */ import ai.grazie.model.bdg.price.ResourcePricing;
/*    */ import ai.grazie.utils.mpp.money.Money;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\006\n\002\030\002\n\002\b\013\b\007\030\000 \024*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003:\001\024B+\b\027\022\006\020\004\032\0028\000\022\006\020\005\032\0028\000\022\b\b\002\020\006\032\0028\000\022\b\b\002\020\007\032\0028\000¢\006\002\020\bBA\022\f\020\t\032\b\022\004\022\0028\0000\n\022\f\020\013\032\b\022\004\022\0028\0000\n\022\016\b\002\020\f\032\b\022\004\022\0028\0000\n\022\016\b\002\020\r\032\b\022\004\022\0028\0000\n¢\006\002\020\016R\027\020\r\032\b\022\004\022\0028\0000\n¢\006\b\n\000\032\004\b\017\020\020R\027\020\f\032\b\022\004\022\0028\0000\n¢\006\b\n\000\032\004\b\021\020\020R\027\020\t\032\b\022\004\022\0028\0000\n¢\006\b\n\000\032\004\b\022\020\020R\027\020\013\032\b\022\004\022\0028\0000\n¢\006\b\n\000\032\004\b\023\020\020¨\006\025"}, d2 = {"Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "contextPerToken", "generationPerToken", "cacheWriteContextPerToken", "cacheReadContextPerToken", "(Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;)V", "context", "Lai/grazie/model/bdg/price/ResourcePricing;", "generation", "cacheWriteContext", "cacheReadContext", "(Lai/grazie/model/bdg/price/ResourcePricing;Lai/grazie/model/bdg/price/ResourcePricing;Lai/grazie/model/bdg/price/ResourcePricing;Lai/grazie/model/bdg/price/ResourcePricing;)V", "getCacheReadContext", "()Lai/grazie/model/bdg/price/ResourcePricing;", "getCacheWriteContext", "getContext", "getGeneration", "Companion", "model-llm"})
/*    */ public final class LLMPerTokenPricing<T extends Money<T>> {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ResourcePricing<T> context;
/*    */   @NotNull
/*    */   private final ResourcePricing<T> generation;
/*    */   @NotNull
/*    */   private final ResourcePricing<T> cacheWriteContext;
/*    */   @NotNull
/*    */   private final ResourcePricing<T> cacheReadContext;
/*    */   
/* 21 */   public LLMPerTokenPricing(@NotNull ResourcePricing<T> context, @NotNull ResourcePricing<T> generation, @NotNull ResourcePricing<T> cacheWriteContext, @NotNull ResourcePricing<T> cacheReadContext) { this.context = context;
/* 22 */     this.generation = generation;
/* 23 */     this.cacheWriteContext = cacheWriteContext;
/* 24 */     this.cacheReadContext = cacheReadContext; } @NotNull public final ResourcePricing<T> getContext() { return this.context; } @NotNull public final ResourcePricing<T> getCacheReadContext() { return this.cacheReadContext; }
/*    */   @NotNull public final ResourcePricing<T> getGeneration() { return this.generation; }
/*    */   @NotNull
/* 27 */   public final ResourcePricing<T> getCacheWriteContext() { return this.cacheWriteContext; } public LLMPerTokenPricing(@NotNull Money contextPerToken, @NotNull Money generationPerToken, @NotNull Money cacheWriteContextPerToken, @NotNull Money cacheReadContextPerToken) { this(
/* 28 */         (ResourcePricing<T>)new FixedResourcePricing(contextPerToken), 
/* 29 */         (ResourcePricing<T>)new FixedResourcePricing(generationPerToken), 
/* 30 */         (ResourcePricing<T>)new FixedResourcePricing(cacheWriteContextPerToken), 
/* 31 */         (ResourcePricing<T>)new FixedResourcePricing(cacheReadContextPerToken)); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\013\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002JE\020\003\032\b\022\004\022\002H\0050\004\"\016\b\001\020\005*\b\022\004\022\002H\0050\0062\006\020\007\032\002H\0052\006\020\b\032\002H\0052\b\b\002\020\t\032\002H\0052\b\b\002\020\n\032\002H\005¢\006\002\020\013JE\020\f\032\b\022\004\022\002H\0050\004\"\016\b\001\020\005*\b\022\004\022\002H\0050\0062\006\020\r\032\002H\0052\006\020\016\032\002H\0052\b\b\002\020\017\032\002H\0052\b\b\002\020\020\032\002H\005¢\006\002\020\013¨\006\021"}, d2 = {"Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing$Companion;", "", "()V", "perMillion", "Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "T", "Lai/grazie/utils/mpp/money/Money;", "contextPerMillion", "generationPerMillion", "cacheWriteContextPerMillion", "cacheReadContextPerMillion", "(Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;Lai/grazie/utils/mpp/money/Money;)Lai/grazie/model/llm/bdg/pricing/LLMPerTokenPricing;", "perThousand", "contextPerThousand", "generationPerThousand", "cacheWriteContextPerThousand", "cacheReadContextPerThousand", "model-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final <T extends Money<T>> LLMPerTokenPricing<T> perThousand(@NotNull Money contextPerThousand, @NotNull Money generationPerThousand, @NotNull Money cacheWriteContextPerThousand, @NotNull Money cacheReadContextPerThousand) {
/* 41 */       Intrinsics.checkNotNullParameter(contextPerThousand, "contextPerThousand"); Intrinsics.checkNotNullParameter(generationPerThousand, "generationPerThousand"); Intrinsics.checkNotNullParameter(cacheWriteContextPerThousand, "cacheWriteContextPerThousand"); Intrinsics.checkNotNullParameter(cacheReadContextPerThousand, "cacheReadContextPerThousand"); return new LLMPerTokenPricing<>(
/* 42 */           (T)contextPerThousand.shr(3), 
/* 43 */           (T)generationPerThousand.shr(3), 
/* 44 */           (T)cacheWriteContextPerThousand.shr(3), 
/* 45 */           (T)cacheReadContextPerThousand.shr(3));
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final <T extends Money<T>> LLMPerTokenPricing<T> perMillion(@NotNull Money contextPerMillion, @NotNull Money generationPerMillion, @NotNull Money cacheWriteContextPerMillion, @NotNull Money cacheReadContextPerMillion) {
/* 55 */       Intrinsics.checkNotNullParameter(contextPerMillion, "contextPerMillion"); Intrinsics.checkNotNullParameter(generationPerMillion, "generationPerMillion"); Intrinsics.checkNotNullParameter(cacheWriteContextPerMillion, "cacheWriteContextPerMillion"); Intrinsics.checkNotNullParameter(cacheReadContextPerMillion, "cacheReadContextPerMillion"); return new LLMPerTokenPricing<>(
/* 56 */           (T)contextPerMillion.shr(6), 
/* 57 */           (T)generationPerMillion.shr(6), 
/* 58 */           (T)cacheWriteContextPerMillion.shr(6), 
/* 59 */           (T)cacheReadContextPerMillion.shr(6));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\pricing\LLMPerTokenPricing.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */