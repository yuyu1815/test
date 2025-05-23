/*    */ package ai.grazie.auth.product.model.api.auth;@Serializable(with = ProductsAuthFlow.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\030\002\n\002\b\n\b\007\030\000 \0262\0020\0012\0020\002:\001\026B\035\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006¢\006\002\020\bR\024\020\t\032\0020\006X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017R\024\020\020\032\0020\006X\004¢\006\b\n\000\032\004\b\021\020\013R\021\020\007\032\0020\006¢\006\b\n\000\032\004\b\022\020\013R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\023\020\013R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\024\020\025¨\006\027"}, d2 = {"Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow;", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithProduct;", "product", "Lai/grazie/auth/product/model/Product;", "path", "", "parameter", "(Lai/grazie/auth/product/model/Product;Ljava/lang/String;Ljava/lang/String;)V", "display", "getDisplay", "()Ljava/lang/String;", "login", "Lai/grazie/model/cloud/API;", "getLogin", "()Lai/grazie/model/cloud/API;", "name", "getName", "getParameter", "getPath", "getProduct", "()Lai/grazie/auth/product/model/Product;", "Companion", "auth-product-model"})
/*    */ public final class ServerProductAuthFlow extends AuthFlow implements AuthFlowWithProduct { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final Product product; @NotNull
/*    */   private final String path; @NotNull
/*    */   private final String parameter; @NotNull
/*    */   private final String name; @NotNull
/*    */   private final String display;
/*    */   @NotNull
/*    */   private final API login;
/*    */   
/* 13 */   public ServerProductAuthFlow(@NotNull Product product, @NotNull String path, @NotNull String parameter) { super(null); this.product = product; this.path = path; this.parameter = parameter;
/* 14 */     this.name = getProduct().getName();
/* 15 */     this.display = getProduct().getDisplay();
/* 16 */     this.login = APIUtils.INSTANCE.absolute("/auth/" + this.path + "/login"); } @NotNull public Product getProduct() { return this.product; } @NotNull public final String getPath() { return this.path; } @NotNull public API getLogin() { return this.login; } @NotNull public final String getParameter() { return this.parameter; } @NotNull public String getName() { return this.name; } @NotNull public String getDisplay() { return this.display; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow;", "auth-product-model"}) public static final class Companion
/*    */   {
/* 18 */     private Companion() {} @NotNull public final KSerializer<ServerProductAuthFlow> serializer() { return (KSerializer<ServerProductAuthFlow>)ProductsAuthFlow.Serializer.INSTANCE; }
/*    */   
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\auth\ServerProductAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */