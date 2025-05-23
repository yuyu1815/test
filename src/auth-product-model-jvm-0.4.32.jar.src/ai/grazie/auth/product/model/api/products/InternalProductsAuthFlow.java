/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ import ai.grazie.auth.product.model.Product;
/*    */ import ai.grazie.auth.product.model.api.auth.ExtensionAuthFlow;
/*    */ import ai.grazie.auth.product.model.api.auth.LocalProductAuthFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/auth/product/model/api/products/InternalProductsAuthFlow;", "", "()V", "Labs", "Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "getLabs", "()Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "SupportMate", "Lai/grazie/auth/product/model/api/auth/ExtensionAuthFlow;", "getSupportMate", "()Lai/grazie/auth/product/model/api/auth/ExtensionAuthFlow;", "auth-product-model"})
/*    */ public final class InternalProductsAuthFlow {
/*    */   @NotNull
/* 10 */   public static final InternalProductsAuthFlow INSTANCE = new InternalProductsAuthFlow(); @NotNull private static final ExtensionAuthFlow SupportMate = new ExtensionAuthFlow(Product.Internal.INSTANCE.getSupportMate(), "support-mate"); @NotNull public final ExtensionAuthFlow getSupportMate() { return SupportMate; } @NotNull
/* 11 */   private static final LocalProductAuthFlow Labs = new LocalProductAuthFlow(Product.Internal.INSTANCE.getLabs(), "labs", "grazie-labs-redirect-localhost"); @NotNull public final LocalProductAuthFlow getLabs() { return Labs; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\products\InternalProductsAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */