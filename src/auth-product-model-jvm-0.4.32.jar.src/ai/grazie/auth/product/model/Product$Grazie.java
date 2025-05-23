/*    */ package ai.grazie.auth.product.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006¨\006\r"}, d2 = {"Lai/grazie/auth/product/model/Product$Grazie;", "", "()V", "Extension", "Lai/grazie/auth/product/model/Product;", "getExtension", "()Lai/grazie/auth/product/model/Product;", "Grazie", "getGrazie", "Playground", "getPlayground", "Professional", "getProfessional", "auth-product-model"})
/*    */ public final class Grazie
/*    */ {
/*    */   @NotNull
/* 11 */   public static final Grazie INSTANCE = new Grazie(); @NotNull private static final Product Grazie = new Product("grazie", "Grazie", ProductFamily.Grazie); @NotNull public final Product getGrazie() { return Grazie; }
/*    */    @NotNull
/* 13 */   private static final Product Extension = new Product("grazie-extension", "Browser Extension", ProductFamily.Grazie); @NotNull public final Product getExtension() { return Extension; } @NotNull
/* 14 */   private static final Product Professional = new Product("grazie-professional", "Professional", ProductFamily.Grazie); @NotNull public final Product getProfessional() { return Professional; }
/*    */    @NotNull
/* 16 */   private static final Product Playground = new Product("grazie-playground", "Playground", ProductFamily.Grazie); @NotNull public final Product getPlayground() { return Playground; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\Product$Grazie.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */