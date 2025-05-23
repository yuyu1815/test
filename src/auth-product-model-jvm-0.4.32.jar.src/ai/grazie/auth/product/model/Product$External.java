/*    */ package ai.grazie.auth.product.model;
/*    */ 
/*    */ import kotlin.Metadata;
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
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/auth/product/model/Product$External;", "", "()V", "DotNet", "Lai/grazie/auth/product/model/Product;", "getDotNet", "()Lai/grazie/auth/product/model/Product;", "Fleet", "getFleet", "IntelliJ", "getIntelliJ", "auth-product-model"})
/*    */ public final class External
/*    */ {
/*    */   @NotNull
/* 26 */   public static final External INSTANCE = new External(); @NotNull private static final Product Fleet = new Product("external-fleet", "Fleet", ProductFamily.Fleet); @NotNull public final Product getFleet() { return Fleet; } @NotNull
/* 27 */   private static final Product IntelliJ = new Product("external-intellij", "IntelliJ", ProductFamily.IntelliJ); @NotNull public final Product getIntelliJ() { return IntelliJ; } @NotNull
/* 28 */   private static final Product DotNet = new Product("external-dotnet", ".NET", ProductFamily.DotNet); @NotNull public final Product getDotNet() { return DotNet; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\Product$External.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */