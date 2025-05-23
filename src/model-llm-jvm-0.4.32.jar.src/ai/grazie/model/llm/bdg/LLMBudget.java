/*   */ package ai.grazie.model.llm.bdg;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003B\025\022\006\020\004\032\0028\000\022\006\020\005\032\0020\006¢\006\002\020\007J\016\020\r\032\0028\000HÆ\003¢\006\002\020\tJ\t\020\016\032\0020\006HÆ\003J(\020\017\032\b\022\004\022\0028\0000\0002\b\b\002\020\004\032\0028\0002\b\b\002\020\005\032\0020\006HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\003HÖ\003J\t\020\024\032\0020\006HÖ\001J\t\020\025\032\0020\026HÖ\001R\023\020\004\032\0028\000¢\006\n\n\002\020\n\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lai/grazie/model/llm/bdg/LLMBudget;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "price", "tokens", "", "(Lai/grazie/utils/mpp/money/Money;I)V", "getPrice", "()Lai/grazie/utils/mpp/money/Money;", "Lai/grazie/utils/mpp/money/Money;", "getTokens", "()I", "component1", "component2", "copy", "(Lai/grazie/utils/mpp/money/Money;I)Lai/grazie/model/llm/bdg/LLMBudget;", "equals", "", "other", "hashCode", "toString", "", "model-llm"})
/*   */ public final class LLMBudget<T extends Money<T>> { @NotNull
/*   */   private final T price;
/*   */   
/* 6 */   public LLMBudget(@NotNull Money price, int tokens) { this.price = (T)price;
/* 7 */     this.tokens = tokens; } private final int tokens; @NotNull public final T getPrice() { return this.price; } public final int getTokens() { return this.tokens; }
/*   */ 
/*   */   
/*   */   @NotNull
/*   */   public final T component1() {
/*   */     return this.price;
/*   */   }
/*   */   
/*   */   public final int component2() {
/*   */     return this.tokens;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public final LLMBudget<T> copy(@NotNull Money price, int tokens) {
/*   */     Intrinsics.checkNotNullParameter(price, "price");
/*   */     return new LLMBudget((T)price, tokens);
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public String toString() {
/*   */     return "LLMBudget(price=" + this.price + ", tokens=" + this.tokens + ")";
/*   */   }
/*   */   
/*   */   public int hashCode() {
/*   */     result = this.price.hashCode();
/*   */     return result * 31 + Integer.hashCode(this.tokens);
/*   */   }
/*   */   
/*   */   public boolean equals(@Nullable Object other) {
/*   */     if (this == other)
/*   */       return true; 
/*   */     if (!(other instanceof LLMBudget))
/*   */       return false; 
/*   */     LLMBudget lLMBudget = (LLMBudget)other;
/*   */     return !Intrinsics.areEqual(this.price, lLMBudget.price) ? false : (!(this.tokens != lLMBudget.tokens));
/*   */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\bdg\LLMBudget.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */