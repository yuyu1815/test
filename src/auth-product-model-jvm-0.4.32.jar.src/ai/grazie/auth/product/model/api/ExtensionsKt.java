/*    */ package ai.grazie.auth.product.model.api;
/*    */ 
/*    */ import ai.grazie.auth.product.model.Product;
/*    */ import ai.grazie.auth.product.model.api.auth.AuthFlow;
/*    */ import ai.grazie.auth.product.model.api.auth.AuthFlowWithProduct;
/*    */ import ai.grazie.auth.product.model.api.products.ProductsAuthFlow;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004\"\027\020\005\032\004\030\0010\006*\0020\0018F¢\006\006\032\004\b\007\020\b¨\006\t"}, d2 = {"auth", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "Lai/grazie/auth/product/model/Product;", "getAuth", "(Lai/grazie/auth/product/model/Product;)Lai/grazie/auth/product/model/api/auth/AuthFlow;", "splash", "Lai/grazie/model/cloud/API;", "getSplash", "(Lai/grazie/auth/product/model/api/auth/AuthFlow;)Lai/grazie/model/cloud/API;", "auth-product-model"})
/*    */ public final class ExtensionsKt
/*    */ {
/*    */   @Nullable
/*    */   public static final API getSplash(@NotNull AuthFlow $this$splash) {
/* 23 */     Intrinsics.checkNotNullParameter($this$splash, "<this>"); return ($this$splash instanceof AuthFlowWithProduct) ? ProductSplashes.INSTANCE.get(((AuthFlowWithProduct)$this$splash).getProduct()) : null;
/*    */   } @NotNull
/*    */   public static final AuthFlow getAuth(@NotNull Product $this$auth) {
/* 26 */     Intrinsics.checkNotNullParameter($this$auth, "<this>"); return ProductsAuthFlow.INSTANCE.get($this$auth);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\ExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */