/*    */ package ai.grazie.auth.product.model;
/*    */ 
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\n\032\b\022\004\022\0020\0050\013HÆ\001R!\020\003\032\b\022\004\022\0020\0050\0048FX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\f"}, d2 = {"Lai/grazie/auth/product/model/Product$Companion;", "", "()V", "all", "", "Lai/grazie/auth/product/model/Product;", "getAll", "()[Lai/grazie/auth/product/model/Product;", "all$delegate", "Lkotlin/Lazy;", "serializer", "Lkotlinx/serialization/KSerializer;", "auth-product-model"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<Product> serializer() {
/* 31 */     return (KSerializer<Product>)Product.Serializer.INSTANCE; } @NotNull
/* 32 */   public final Product[] getAll() { Lazy lazy = Product.access$getAll$delegate$cp(); return (Product[])lazy.getValue(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\Product$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */