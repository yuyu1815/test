/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ import ai.grazie.auth.product.model.Product;
/*    */ import ai.grazie.auth.product.model.api.auth.LocalProductAuthFlow;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/auth/product/model/api/products/ExternalProductsAuthFlow;", "", "()V", "DotNET", "Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "getDotNET", "()Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "Fleet", "getFleet", "IntelliJ", "getIntelliJ", "auth-product-model"})
/*    */ public final class ExternalProductsAuthFlow {
/*    */   @NotNull
/*  9 */   public static final ExternalProductsAuthFlow INSTANCE = new ExternalProductsAuthFlow(); @NotNull private static final LocalProductAuthFlow Fleet = new LocalProductAuthFlow(Product.External.INSTANCE.getFleet(), "fleet", "grazie-fleet-redirect-localhost"); @NotNull public final LocalProductAuthFlow getFleet() { return Fleet; } @NotNull
/* 10 */   private static final LocalProductAuthFlow IntelliJ = new LocalProductAuthFlow(Product.External.INSTANCE.getIntelliJ(), "ij", "grazie-intellij-redirect-localhost"); @NotNull public final LocalProductAuthFlow getIntelliJ() { return IntelliJ; } @NotNull
/* 11 */   private static final LocalProductAuthFlow DotNET = new LocalProductAuthFlow(Product.External.INSTANCE.getDotNet(), "dotnet", "grazie-dotnet-redirect-localhost"); @NotNull public final LocalProductAuthFlow getDotNET() { return DotNET; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\products\ExternalProductsAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */