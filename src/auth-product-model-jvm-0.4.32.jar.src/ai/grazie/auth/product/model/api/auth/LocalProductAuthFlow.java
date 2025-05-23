/*    */ package ai.grazie.auth.product.model.api.auth;@Serializable(with = ProductsAuthFlow.Serializer.class) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\030\002\n\002\b\020\b\007\030\000 \0372\0020\0012\0020\0022\0020\0032\0020\0042\0020\005:\001\037B\035\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t¢\006\002\020\013R\024\020\f\032\0020\tX\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\017\032\0020\020X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\023\032\0020\tX\004¢\006\b\n\000\032\004\b\024\020\016R\021\020\n\032\0020\t¢\006\b\n\000\032\004\b\025\020\016R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\026\020\016R\024\020\027\032\0020\020X\004¢\006\b\n\000\032\004\b\030\020\022R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\031\020\032R\024\020\033\032\0020\020X\004¢\006\b\n\000\032\004\b\034\020\022R\024\020\035\032\0020\020X\004¢\006\b\n\000\032\004\b\036\020\022¨\006 "}, d2 = {"Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithProcess;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithSuccess;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithProduct;", "Lai/grazie/auth/product/model/api/auth/AuthFlowWithWaitList;", "product", "Lai/grazie/auth/product/model/Product;", "path", "", "parameter", "(Lai/grazie/auth/product/model/Product;Ljava/lang/String;Ljava/lang/String;)V", "display", "getDisplay", "()Ljava/lang/String;", "login", "Lai/grazie/model/cloud/API;", "getLogin", "()Lai/grazie/model/cloud/API;", "name", "getName", "getParameter", "getPath", "process", "getProcess", "getProduct", "()Lai/grazie/auth/product/model/Product;", "success", "getSuccess", "waitlist", "getWaitlist", "Companion", "auth-product-model"})
/*    */ public final class LocalProductAuthFlow extends AuthFlow implements AuthFlowWithProcess, AuthFlowWithSuccess, AuthFlowWithProduct, AuthFlowWithWaitList { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final Product product; @NotNull
/*    */   private final String path; @NotNull
/*    */   private final String parameter; @NotNull
/*    */   private final String name; @NotNull
/*    */   private final String display; @NotNull
/*    */   private final API login; @NotNull
/*    */   private final API process; @NotNull
/*    */   private final API success; @NotNull
/*    */   private final API waitlist; @NotNull
/* 13 */   public Product getProduct() { return this.product; } @NotNull public final String getPath() { return this.path; } @NotNull public final String getParameter() { return this.parameter; }
/* 14 */   @NotNull public String getName() { return this.name; } @NotNull public String getDisplay() { return this.display; } @NotNull public API getLogin() { return this.login; } public LocalProductAuthFlow(@NotNull Product product, @NotNull String path, @NotNull String parameter) { super(null); this.product = product; this.path = path; this.parameter = parameter;
/* 15 */     this.name = getProduct().getName();
/* 16 */     this.display = getProduct().getDisplay();
/* 17 */     this.login = APIUtils.INSTANCE.absolute("/auth/" + this.path + "/login");
/* 18 */     this.process = APIUtils.INSTANCE.absolute("/auth/" + this.path + "/login/process");
/* 19 */     this.success = APIUtils.INSTANCE.absolute("/auth/" + this.path + "/login/success");
/* 20 */     this.waitlist = APIUtils.INSTANCE.absolute("/auth/" + this.path + "/login/wait-list"); } @NotNull public API getProcess() { return this.process; } @NotNull public API getSuccess() { return this.success; } @NotNull public API getWaitlist() { return this.waitlist; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "auth-product-model"})
/*    */   public static final class Companion { private Companion() {} @NotNull
/* 22 */     public final KSerializer<LocalProductAuthFlow> serializer() { return (KSerializer<LocalProductAuthFlow>)ProductsAuthFlow.Serializer.INSTANCE; }
/*    */      }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\auth\LocalProductAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */