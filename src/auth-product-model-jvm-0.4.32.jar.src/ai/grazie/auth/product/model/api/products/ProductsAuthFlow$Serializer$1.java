/*    */ package ai.grazie.auth.product.model.api.products;
/*    */ 
/*    */ import ai.grazie.auth.product.model.api.auth.AuthFlow;
/*    */ import java.util.NoSuchElementException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "value", "", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nProductsAuthFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,31:1\n2945#2,12:32\n*S KotlinDebug\n*F\n+ 1 ProductsAuthFlow.kt\nai/grazie/auth/product/model/api/products/ProductsAuthFlow$Serializer$1\n*L\n29#1:32,12\n*E\n"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<String, AuthFlow>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final AuthFlow invoke(String value) {
/* 29 */     Intrinsics.checkNotNullParameter(value, "value"); AuthFlow[] arrayOfAuthFlow = ProductsAuthFlow.INSTANCE.getAll(); int $i$f$single = 0;
/*    */ 
/*    */     
/* 32 */     Object single$iv = null;
/* 33 */     boolean found$iv = false; byte b; int i;
/* 34 */     for (b = 0, i = arrayOfAuthFlow.length; b < i; ) { Object element$iv = arrayOfAuthFlow[b];
/* 35 */       Object object1 = element$iv; int $i$a$-single-ProductsAuthFlow$Serializer$1$1 = 0; if (Intrinsics.areEqual(object1.getName(), value)) {
/* 36 */         if (found$iv) throw new IllegalArgumentException("Array contains more than one matching element."); 
/* 37 */         single$iv = element$iv;
/* 38 */         found$iv = true;
/*    */       }  }
/*    */     
/* 41 */     if (!found$iv) throw new NoSuchElementException("Array contains no element matching the predicate.");
/*    */     
/* 43 */     return (AuthFlow)single$iv;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\products\ProductsAuthFlow$Serializer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */