/*    */ package ai.grazie.auth.product.model;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/product/model/Product$Internal;", "", "()V", "Labs", "Lai/grazie/auth/product/model/Product;", "getLabs", "()Lai/grazie/auth/product/model/Product;", "SupportMate", "getSupportMate", "auth-product-model"})
/*    */ public final class Internal
/*    */ {
/*    */   @NotNull
/* 21 */   public static final Internal INSTANCE = new Internal(); @NotNull private static final Product SupportMate = new Product("internal-support-mate", "Support Mate", ProductFamily.Internal); @NotNull public final Product getSupportMate() { return SupportMate; } @NotNull
/* 22 */   private static final Product Labs = new Product("internal-labs", "Labs", ProductFamily.Internal); @NotNull public final Product getLabs() { return Labs; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\Product$Internal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */