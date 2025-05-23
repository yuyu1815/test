/*    */ package ai.grazie.auth.product.model;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\016\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lai/grazie/auth/product/model/Product;", "value", "", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nProduct.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Product.kt\nai/grazie/auth/product/model/Product$Serializer$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,47:1\n2945#2,12:48\n*S KotlinDebug\n*F\n+ 1 Product.kt\nai/grazie/auth/product/model/Product$Serializer$1\n*L\n45#1:48,12\n*E\n"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<String, Product>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final Product invoke(String value) {
/* 45 */     Intrinsics.checkNotNullParameter(value, "value"); Product[] arrayOfProduct = Product.Companion.getAll(); int $i$f$single = 0;
/*    */ 
/*    */     
/* 48 */     Object single$iv = null;
/* 49 */     boolean found$iv = false; byte b; int i;
/* 50 */     for (b = 0, i = arrayOfProduct.length; b < i; ) { Object element$iv = arrayOfProduct[b];
/* 51 */       Object object1 = element$iv; int $i$a$-single-Product$Serializer$1$1 = 0; if (Intrinsics.areEqual(object1.getName(), value)) {
/* 52 */         if (found$iv) throw new IllegalArgumentException("Array contains more than one matching element."); 
/* 53 */         single$iv = element$iv;
/* 54 */         found$iv = true;
/*    */       }  }
/*    */     
/* 57 */     if (!found$iv) throw new NoSuchElementException("Array contains no element matching the predicate.");
/*    */     
/* 59 */     return (Product)single$iv;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\Product$Serializer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */