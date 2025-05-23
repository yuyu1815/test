/*    */ package ai.grazie.model.bdg.price;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\007\n\002\020\b\n\002\b\002\bg\030\000*\016\b\000\020\001*\b\022\004\022\002H\0010\0022\0020\003J\025\020\t\032\0028\0002\006\020\n\032\0020\013H\026¢\006\002\020\fR\022\020\004\032\0028\000X¦\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\0028\0008VX\004¢\006\006\032\004\b\b\020\006ø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Lai/grazie/model/bdg/price/ResourcePricing;", "T", "Lai/grazie/utils/mpp/money/Money;", "", "price", "getPrice", "()Lai/grazie/utils/mpp/money/Money;", "zero", "getZero", "estimate", "resources", "", "(I)Lai/grazie/utils/mpp/money/Money;", "model-bdg"})
/*    */ public interface ResourcePricing<T extends ai.grazie.utils.mpp.money.Money<T>>
/*    */ {
/*    */   @NotNull
/*    */   default T getZero() {
/* 18 */     return (T)getPrice().getZero();
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   T getPrice();
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   default T estimate(int resources) {
/* 28 */     return (T)getPrice().times(resources);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-bdg-jvm-0.4.32.jar!\ai\grazie\model\bdg\price\ResourcePricing.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */