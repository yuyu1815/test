/*    */ package ai.grazie.auth.product.model.api;
/*    */ import ai.grazie.auth.product.model.Product;
/*    */ import ai.grazie.model.cloud.utils.APIUtils;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\004\030\0010\0042\006\020\005\032\0020\006¨\006\007"}, d2 = {"Lai/grazie/auth/product/model/api/ProductSplashes;", "", "()V", "get", "Lai/grazie/model/cloud/API;", "product", "Lai/grazie/auth/product/model/Product;", "auth-product-model"})
/*    */ public final class ProductSplashes {
/*    */   @Nullable
/*    */   public final API get(@NotNull Product product) {
/* 12 */     Intrinsics.checkNotNullParameter(product, "product"); Product product1 = product;
/* 13 */     return Intrinsics.areEqual(product1, Product.Internal.INSTANCE.getLabs()) ? APIUtils.INSTANCE.absolute("/auth/grazie-labs") : (
/* 14 */       Intrinsics.areEqual(product1, Product.Grazie.INSTANCE.getProfessional()) ? APIUtils.INSTANCE.absolute("/auth/grazie-professional") : (
/* 15 */       Intrinsics.areEqual(product1, Product.External.INSTANCE.getFleet()) ? APIUtils.INSTANCE.absolute("/auth/fleet") : (
/* 16 */       Intrinsics.areEqual(product1, Product.External.INSTANCE.getIntelliJ()) ? APIUtils.INSTANCE.absolute("/auth/ij") : (
/* 17 */       Intrinsics.areEqual(product1, Product.External.INSTANCE.getDotNet()) ? APIUtils.INSTANCE.absolute("/auth/dotnet") : 
/* 18 */       null))));
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ProductSplashes INSTANCE = new ProductSplashes();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\ProductSplashes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */