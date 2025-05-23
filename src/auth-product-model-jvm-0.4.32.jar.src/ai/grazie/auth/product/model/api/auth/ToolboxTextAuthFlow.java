/*    */ package ai.grazie.auth.product.model.api.auth;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = ProductsAuthFlow.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\007\n\002\030\002\n\000\bÇ\002\030\0002\0020\0012\0020\002B\007\b\002¢\006\002\020\003J\017\020\026\032\b\022\004\022\0020\0000\027HÆ\001R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\005XD¢\006\b\n\000\032\004\b\r\020\007R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021R\024\020\022\032\0020\tX\004¢\006\b\n\000\032\004\b\023\020\013R\024\020\024\032\0020\tX\004¢\006\b\n\000\032\004\b\025\020\013¨\006\030"}, d2 = {"Lai/grazie/auth/product/model/api/auth/ToolboxTextAuthFlow;", "Lai/grazie/auth/product/model/api/auth/AbstractToolboxAuthFlow;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithProduct;", "()V", "display", "", "getDisplay", "()Ljava/lang/String;", "login", "Lai/grazie/model/cloud/API;", "getLogin", "()Lai/grazie/model/cloud/API;", "name", "getName", "product", "Lai/grazie/auth/product/model/Product;", "getProduct", "()Lai/grazie/auth/product/model/Product;", "success", "getSuccess", "waitlist", "getWaitlist", "serializer", "Lkotlinx/serialization/KSerializer;", "auth-product-model"})
/*    */ public final class ToolboxTextAuthFlow extends AbstractToolboxAuthFlow implements AuthFlowWithProduct {
/*    */   @NotNull
/*    */   public final KSerializer<ToolboxTextAuthFlow> serializer() {
/* 10 */     return (KSerializer<ToolboxTextAuthFlow>)ProductsAuthFlow.Serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/* 14 */   public static final ToolboxTextAuthFlow INSTANCE = new ToolboxTextAuthFlow(); @NotNull private static final String name = "text-toolbox"; @NotNull public String getName() { return name; } @NotNull
/* 15 */   private static final String display = "To Text Toolbox"; @NotNull public String getDisplay() { return display; }
/*    */    @NotNull
/* 17 */   private static final API login = APIUtils.INSTANCE.absolute("/auth/toolbox/text/login"); @NotNull public API getLogin() { return login; } @NotNull
/* 18 */   private static final API success = APIUtils.INSTANCE.absolute("/auth/toolbox/text"); @NotNull public API getSuccess() { return success; } @NotNull
/* 19 */   private static final API waitlist = APIUtils.INSTANCE.absolute("/auth/toolbox/waitlist"); @NotNull public API getWaitlist() { return waitlist; } @NotNull
/* 20 */   private static final Product product = Product.Grazie.INSTANCE.getGrazie(); @NotNull public Product getProduct() { return product; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\auth\ToolboxTextAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */