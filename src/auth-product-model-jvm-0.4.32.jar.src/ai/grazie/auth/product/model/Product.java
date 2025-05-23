/*    */ package ai.grazie.auth.product.model;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = Product.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\f\b\007\030\000 \r2\0020\001:\005\r\016\017\020\021B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\007R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\n\020\013R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\t¨\006\022"}, d2 = {"Lai/grazie/auth/product/model/Product;", "", "name", "", "display", "family", "Lai/grazie/auth/product/model/ProductFamily;", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/auth/product/model/ProductFamily;)V", "getDisplay", "()Ljava/lang/String;", "getFamily", "()Lai/grazie/auth/product/model/ProductFamily;", "getName", "Companion", "External", "Grazie", "Internal", "Serializer", "auth-product-model"})
/*    */ public final class Product {
/*  9 */   public Product(@NotNull String name, @NotNull String display, @NotNull ProductFamily family) { this.name = name; this.display = display; this.family = family; } @NotNull public final String getName() { return this.name; } @NotNull public final String getDisplay() { return this.display; } @NotNull public final ProductFamily getFamily() { return this.family; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\t\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006R\021\020\013\032\0020\004¢\006\b\n\000\032\004\b\f\020\006¨\006\r"}, d2 = {"Lai/grazie/auth/product/model/Product$Grazie;", "", "()V", "Extension", "Lai/grazie/auth/product/model/Product;", "getExtension", "()Lai/grazie/auth/product/model/Product;", "Grazie", "getGrazie", "Playground", "getPlayground", "Professional", "getProfessional", "auth-product-model"})
/*    */   public static final class Grazie { @NotNull
/* 11 */     public static final Grazie INSTANCE = new Grazie(); @NotNull private static final Product Grazie = new Product("grazie", "Grazie", ProductFamily.Grazie); @NotNull public final Product getGrazie() { return Grazie; }
/*    */      @NotNull
/* 13 */     private static final Product Extension = new Product("grazie-extension", "Browser Extension", ProductFamily.Grazie); @NotNull public final Product getExtension() { return Extension; } @NotNull
/* 14 */     private static final Product Professional = new Product("grazie-professional", "Professional", ProductFamily.Grazie); @NotNull public final Product getProfessional() { return Professional; }
/*    */      @NotNull
/* 16 */     private static final Product Playground = new Product("grazie-playground", "Playground", ProductFamily.Grazie); @NotNull public final Product getPlayground() { return Playground; }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/product/model/Product$Internal;", "", "()V", "Labs", "Lai/grazie/auth/product/model/Product;", "getLabs", "()Lai/grazie/auth/product/model/Product;", "SupportMate", "getSupportMate", "auth-product-model"})
/*    */   public static final class Internal { @NotNull
/* 21 */     public static final Internal INSTANCE = new Internal(); @NotNull private static final Product SupportMate = new Product("internal-support-mate", "Support Mate", ProductFamily.Internal); @NotNull public final Product getSupportMate() { return SupportMate; } @NotNull
/* 22 */     private static final Product Labs = new Product("internal-labs", "Labs", ProductFamily.Internal); @NotNull public final Product getLabs() { return Labs; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/auth/product/model/Product$External;", "", "()V", "DotNet", "Lai/grazie/auth/product/model/Product;", "getDotNet", "()Lai/grazie/auth/product/model/Product;", "Fleet", "getFleet", "IntelliJ", "getIntelliJ", "auth-product-model"})
/*    */   public static final class External { @NotNull
/* 26 */     public static final External INSTANCE = new External(); @NotNull private static final Product Fleet = new Product("external-fleet", "Fleet", ProductFamily.Fleet); @NotNull public final Product getFleet() { return Fleet; } @NotNull
/* 27 */     private static final Product IntelliJ = new Product("external-intellij", "IntelliJ", ProductFamily.IntelliJ); @NotNull public final Product getIntelliJ() { return IntelliJ; } @NotNull
/* 28 */     private static final Product DotNet = new Product("external-dotnet", ".NET", ProductFamily.DotNet); @NotNull public final Product getDotNet() { return DotNet; } }
/*    */    @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\n\032\b\022\004\022\0020\0050\013HÆ\001R!\020\003\032\b\022\004\022\0020\0050\0048FX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\f"}, d2 = {"Lai/grazie/auth/product/model/Product$Companion;", "", "()V", "all", "", "Lai/grazie/auth/product/model/Product;", "getAll", "()[Lai/grazie/auth/product/model/Product;", "all$delegate", "Lkotlin/Lazy;", "serializer", "Lkotlinx/serialization/KSerializer;", "auth-product-model"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 31 */     public final KSerializer<Product> serializer() { return (KSerializer<Product>)Product.Serializer.INSTANCE; } @NotNull
/* 32 */     public final Product[] getAll() { Lazy lazy = Product.all$delegate; return (Product[])lazy.getValue(); } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String name; @NotNull private final String display; @NotNull private final ProductFamily family; @NotNull private static final Lazy<Product[]> all$delegate = LazyKt.lazy(Product$Companion$all$2.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\021\n\002\030\002\n\002\b\002\020\000\032\b\022\004\022\0020\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "Lai/grazie/auth/product/model/Product;", "invoke", "()[Lai/grazie/auth/product/model/Product;"})
/*    */   static final class Product$Companion$all$2 extends Lambda implements Function0<Product[]> {
/* 34 */     public static final Product$Companion$all$2 INSTANCE = new Product$Companion$all$2(); public final Product[] invoke() { Product[] arrayOfProduct = new Product[7]; arrayOfProduct[0] = Product.Grazie.INSTANCE.getGrazie(); arrayOfProduct[1] = 
/* 35 */         Product.Grazie.INSTANCE.getExtension();
/* 36 */       arrayOfProduct[2] = Product.Grazie.INSTANCE.getProfessional();
/* 37 */       arrayOfProduct[3] = Product.Grazie.INSTANCE.getPlayground();
/* 38 */       arrayOfProduct[4] = Product.Internal.INSTANCE.getSupportMate();
/* 39 */       arrayOfProduct[5] = Product.Internal.INSTANCE.getLabs();
/* 40 */       arrayOfProduct[6] = Product.External.INSTANCE.getFleet();
/*    */       return arrayOfProduct; } Product$Companion$all$2() { super(0); }
/*    */   } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/auth/product/model/Product$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/auth/product/model/Product;", "()V", "auth-product-model"})
/*    */   public static final class Serializer extends StringValueClassSerializer<Product> { @NotNull
/*    */     public static final Serializer INSTANCE = new Serializer(); private Serializer() {
/* 45 */       super("Product", null.INSTANCE, null.INSTANCE);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\Product.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */