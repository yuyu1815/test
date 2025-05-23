/*    */ package ai.grazie.model.bdg;
/*    */ 
/*    */ import ai.grazie.model.bdg.estimator.BudgetEstimator;
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import ai.grazie.utils.mpp.money.Money;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\003\b\b\030\000 \035*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003:\001\035B\r\022\006\020\004\032\0028\000¢\006\002\020\005J\016\020\n\032\0028\000HÆ\003¢\006\002\020\007J\036\020\013\032\b\022\004\022\0028\0000\0002\b\b\002\020\004\032\0028\000HÆ\001¢\006\002\020\fJ\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\003HÖ\003J\t\020\020\032\0020\021HÖ\001J\023\020\022\032\0020\0232\006\020\024\032\0028\000¢\006\002\020\005J\t\020\025\032\0020\026HÖ\001J-\020\027\032\0020\023\"\004\b\001\020\0302\006\020\031\032\002H\0302\022\020\032\032\016\022\004\022\002H\030\022\004\022\0028\0000\033¢\006\002\020\034R\034\020\004\032\0028\000X\016¢\006\020\n\002\020\t\032\004\b\006\020\007\"\004\b\b\020\005¨\006\036"}, d2 = {"Lai/grazie/model/bdg/Budget;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "total", "(Lai/grazie/utils/mpp/money/Money;)V", "getTotal", "()Lai/grazie/utils/mpp/money/Money;", "setTotal", "Lai/grazie/utils/mpp/money/Money;", "component1", "copy", "(Lai/grazie/utils/mpp/money/Money;)Lai/grazie/model/bdg/Budget;", "equals", "", "other", "hashCode", "", "increment", "", "amount", "toString", "", "update", "Input", "input", "estimator", "Lai/grazie/model/bdg/estimator/BudgetEstimator;", "(Ljava/lang/Object;Lai/grazie/model/bdg/estimator/BudgetEstimator;)V", "Companion", "model-bdg"})
/*    */ public final class Budget<T extends Money<T>> {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private T total;
/*    */   
/* 16 */   public Budget(@NotNull Money total) { this.total = (T)total; } @NotNull public final T getTotal() { return this.total; } public final void setTotal(@NotNull Money <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.total = (T)<set-?>; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\f\020\003\032\b\022\004\022\0020\0050\004J\f\020\006\032\b\022\004\022\0020\0070\004¨\006\b"}, d2 = {"Lai/grazie/model/bdg/Budget$Companion;", "", "()V", "zeroCredits", "Lai/grazie/model/bdg/Budget;", "Lai/grazie/utils/mpp/money/Credit;", "zeroDollars", "Lai/grazie/utils/mpp/money/Dollar;", "model-bdg"})
/*    */   public static final class Companion { @NotNull
/* 18 */     public final Budget<Dollar> zeroDollars() { return new Budget(Dollar.Companion.getZERO()); } private Companion() {} @NotNull
/* 19 */     public final Budget<Credit> zeroCredits() { return new Budget(Credit.Companion.getZERO()); }
/*    */      }
/*    */   
/*    */   public final void increment(@NotNull Money amount) {
/* 23 */     Intrinsics.checkNotNullParameter(amount, "amount"); this.total = (T)this.total.plus(amount);
/*    */   }
/*    */   
/*    */   public final <Input> void update(Object input, @NotNull BudgetEstimator estimator) {
/* 27 */     Intrinsics.checkNotNullParameter(estimator, "estimator"); increment((T)estimator.estimate(input));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final T component1() {
/*    */     return this.total;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Budget<T> copy(@NotNull Money total) {
/*    */     Intrinsics.checkNotNullParameter(total, "total");
/*    */     return new Budget((T)total);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Budget(total=" + this.total + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.total.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Budget))
/*    */       return false; 
/*    */     Budget budget = (Budget)other;
/*    */     return !!Intrinsics.areEqual(this.total, budget.total);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-bdg-jvm-0.4.32.jar!\ai\grazie\model\bdg\Budget.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */