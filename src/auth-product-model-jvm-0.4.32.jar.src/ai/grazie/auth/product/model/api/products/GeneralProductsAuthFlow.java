/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ import ai.grazie.auth.product.model.api.auth.ToolboxAuthFlow;
/*    */ import ai.grazie.auth.product.model.api.auth.ToolboxTextAuthFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/auth/product/model/api/products/GeneralProductsAuthFlow;", "", "()V", "Toolbox", "Lai/grazie/auth/product/model/api/auth/ToolboxAuthFlow;", "getToolbox", "()Lai/grazie/auth/product/model/api/auth/ToolboxAuthFlow;", "ToolboxText", "Lai/grazie/auth/product/model/api/auth/ToolboxTextAuthFlow;", "getToolboxText", "()Lai/grazie/auth/product/model/api/auth/ToolboxTextAuthFlow;", "auth-product-model"})
/*    */ public final class GeneralProductsAuthFlow {
/*    */   @NotNull
/*  9 */   public static final GeneralProductsAuthFlow INSTANCE = new GeneralProductsAuthFlow(); @NotNull private static final ToolboxAuthFlow Toolbox = ToolboxAuthFlow.INSTANCE; @NotNull public final ToolboxAuthFlow getToolbox() { return Toolbox; } @NotNull
/* 10 */   private static final ToolboxTextAuthFlow ToolboxText = ToolboxTextAuthFlow.INSTANCE; @NotNull public final ToolboxTextAuthFlow getToolboxText() { return ToolboxText; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\products\GeneralProductsAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */