/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ import ai.grazie.auth.product.model.Product;
/*    */ import ai.grazie.auth.product.model.api.auth.AuthFlow;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\fB\007\b\002¢\006\002\020\002J\016\020\t\032\0020\0052\006\020\n\032\0020\013R\031\020\003\032\b\022\004\022\0020\0050\004¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\r"}, d2 = {"Lai/grazie/auth/product/model/api/products/ProductsAuthFlow;", "", "()V", "all", "", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "getAll", "()[Lai/grazie/auth/product/model/api/auth/AuthFlow;", "[Lai/grazie/auth/product/model/api/auth/AuthFlow;", "get", "product", "Lai/grazie/auth/product/model/Product;", "Serializer", "auth-product-model"})
/*    */ @SourceDebugExtension({"SMAP\nProductsAuthFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n4135#2,11:32\n669#3,11:43\n*S KotlinDebug\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow\n*L\n25#1:32,11\n25#1:43,11\n*E\n"})
/*    */ public final class ProductsAuthFlow {
/*    */   @NotNull
/* 12 */   public static final ProductsAuthFlow INSTANCE = new ProductsAuthFlow(); @NotNull private static final AuthFlow[] all; @NotNull public final AuthFlow[] getAll() { return all; }
/* 13 */   static { AuthFlow[] arrayOfAuthFlow = new AuthFlow[10]; arrayOfAuthFlow[0] = (AuthFlow)GeneralProductsAuthFlow.INSTANCE.getToolbox(); arrayOfAuthFlow[1] = 
/* 14 */       (AuthFlow)GeneralProductsAuthFlow.INSTANCE.getToolboxText();
/* 15 */     arrayOfAuthFlow[2] = (AuthFlow)GrazieProductsAuthFlow.INSTANCE.getBrowser();
/* 16 */     arrayOfAuthFlow[3] = (AuthFlow)GrazieProductsAuthFlow.INSTANCE.getPlayground();
/* 17 */     arrayOfAuthFlow[4] = (AuthFlow)GrazieProductsAuthFlow.INSTANCE.getProfessional();
/* 18 */     arrayOfAuthFlow[5] = (AuthFlow)InternalProductsAuthFlow.INSTANCE.getSupportMate();
/* 19 */     arrayOfAuthFlow[6] = (AuthFlow)InternalProductsAuthFlow.INSTANCE.getLabs();
/* 20 */     arrayOfAuthFlow[7] = (AuthFlow)ExternalProductsAuthFlow.INSTANCE.getFleet();
/* 21 */     arrayOfAuthFlow[8] = (AuthFlow)ExternalProductsAuthFlow.INSTANCE.getIntelliJ();
/* 22 */     arrayOfAuthFlow[9] = (AuthFlow)ExternalProductsAuthFlow.INSTANCE.getDotNET();
/*    */     all = arrayOfAuthFlow; } @NotNull
/*    */   public final AuthFlow get(@NotNull Product product) {
/* 25 */     Intrinsics.checkNotNullParameter(product, "product"); AuthFlow[] arrayOfAuthFlow1 = all; int $i$f$filterIsInstance = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     AuthFlow[] arrayOfAuthFlow2 = arrayOfAuthFlow1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*    */ 
/*    */     
/*    */     byte b;
/*    */ 
/*    */     
/*    */     int i;
/*    */ 
/*    */     
/* 41 */     for (b = 0, i = arrayOfAuthFlow2.length; b < i; ) { Object element$iv$iv = arrayOfAuthFlow2[b]; if (element$iv$iv instanceof AuthFlowWithProduct) destination$iv$iv.add(element$iv$iv);  b++; }
/* 42 */      List list = (List)destination$iv$iv; int $i$f$singleOrNull = 0;
/* 43 */     Object object = null;
/* 44 */     boolean found$iv = false;
/* 45 */     for (Object element$iv : list) {
/* 46 */       AuthFlowWithProduct it = (AuthFlowWithProduct)element$iv; int $i$a$-singleOrNull-ProductsAuthFlow$get$1 = 0; if (Intrinsics.areEqual(it.getProduct(), product))
/* 47 */       { if (found$iv) {  }
/* 48 */         else { object = element$iv;
/* 49 */           found$iv = true; }  }
/*    */       else {  }
/*    */     
/* 52 */     }  if ((!found$iv ? null : 
/* 53 */       (AuthFlow)object) == null) { !found$iv ? null : (AuthFlow)object; int $i$a$-requireNotNull-ProductsAuthFlow$get$2 = 0; String str = "Product " + product.getName() + " auth is not supported"; throw new IllegalArgumentException(str.toString()); }  Intrinsics.checkNotNull(!found$iv ? null : (AuthFlow)object, "null cannot be cast to non-null type ai.grazie.auth.product.model.api.auth.AuthFlow"); return !found$iv ? null : (AuthFlow)object;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "()V", "auth-product-model"})
/*    */   public static final class Serializer extends StringValueClassSerializer<AuthFlow> {
/*    */     @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer();
/*    */     
/*    */     private Serializer() {
/*    */       super("AuthFlow", null.INSTANCE, null.INSTANCE);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\products\ProductsAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */