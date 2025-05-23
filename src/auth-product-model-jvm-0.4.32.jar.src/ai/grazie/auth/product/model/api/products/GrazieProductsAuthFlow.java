/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ import ai.grazie.auth.product.model.api.auth.ExtensionAuthFlow;
/*    */ import ai.grazie.auth.product.model.api.auth.ServerProductAuthFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/auth/product/model/api/products/GrazieProductsAuthFlow;", "", "()V", "Browser", "Lai/grazie/auth/product/model/api/auth/ExtensionAuthFlow;", "getBrowser", "()Lai/grazie/auth/product/model/api/auth/ExtensionAuthFlow;", "Playground", "Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow;", "getPlayground", "()Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow;", "Professional", "Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "getProfessional", "()Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "auth-product-model"})
/*    */ public final class GrazieProductsAuthFlow {
/*    */   @NotNull
/*  9 */   public static final GrazieProductsAuthFlow INSTANCE = new GrazieProductsAuthFlow(); @NotNull private static final ExtensionAuthFlow Browser = new ExtensionAuthFlow(Product.Grazie.INSTANCE.getExtension(), "chrome"); @NotNull public final ExtensionAuthFlow getBrowser() { return Browser; } @NotNull
/* 10 */   private static final ServerProductAuthFlow Playground = new ServerProductAuthFlow(Product.Grazie.INSTANCE.getPlayground(), "play", "grazie-play-redirect"); @NotNull public final ServerProductAuthFlow getPlayground() { return Playground; } @NotNull
/* 11 */   private static final LocalProductAuthFlow Professional = new LocalProductAuthFlow(
/* 12 */       Product.Grazie.INSTANCE.getProfessional(), 
/* 13 */       "intellij", 
/* 14 */       "grazie-intellij-redirect-localhost");
/*    */   
/*    */   @NotNull
/*    */   public final LocalProductAuthFlow getProfessional() {
/*    */     return Professional;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\products\GrazieProductsAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */