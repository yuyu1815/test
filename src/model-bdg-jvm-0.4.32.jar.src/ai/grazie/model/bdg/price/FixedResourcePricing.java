/*    */ package ai.grazie.model.bdg.price;
/*    */ 
/*    */ import ai.grazie.utils.mpp.money.Money;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\r\022\006\020\004\032\0028\000¢\006\002\020\005J\016\020\t\032\0028\000HÆ\003¢\006\002\020\007J\036\020\n\032\b\022\004\022\0028\0000\0002\b\b\002\020\004\032\0028\000HÆ\001¢\006\002\020\013J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\017HÖ\003J\t\020\020\032\0020\021HÖ\001J\t\020\022\032\0020\023HÖ\001R\026\020\004\032\0028\000X\004¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\024"}, d2 = {"Lai/grazie/model/bdg/price/FixedResourcePricing;", "T", "Lai/grazie/utils/mpp/money/Money;", "Lai/grazie/model/bdg/price/ResourcePricing;", "price", "(Lai/grazie/utils/mpp/money/Money;)V", "getPrice", "()Lai/grazie/utils/mpp/money/Money;", "Lai/grazie/utils/mpp/money/Money;", "component1", "copy", "(Lai/grazie/utils/mpp/money/Money;)Lai/grazie/model/bdg/price/FixedResourcePricing;", "equals", "", "other", "", "hashCode", "", "toString", "", "model-bdg"})
/*    */ public final class FixedResourcePricing<T extends Money<T>> implements ResourcePricing<T> {
/* 10 */   public FixedResourcePricing(@NotNull Money price) { this.price = (T)price; } @NotNull private final T price; @NotNull public T getPrice() { return this.price; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final T component1() {
/*    */     return this.price;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FixedResourcePricing<T> copy(@NotNull Money price) {
/*    */     Intrinsics.checkNotNullParameter(price, "price");
/*    */     return new FixedResourcePricing((T)price);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FixedResourcePricing(price=" + this.price + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.price.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FixedResourcePricing))
/*    */       return false; 
/*    */     FixedResourcePricing fixedResourcePricing = (FixedResourcePricing)other;
/*    */     return !!Intrinsics.areEqual(this.price, fixedResourcePricing.price);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-bdg-jvm-0.4.32.jar!\ai\grazie\model\bdg\price\FixedResourcePricing.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */