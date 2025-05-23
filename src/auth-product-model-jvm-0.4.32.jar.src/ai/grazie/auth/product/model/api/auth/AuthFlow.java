/*    */ package ai.grazie.auth.product.model.api.auth;@Serializable(with = ProductsAuthFlow.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \r2\0020\001:\001\rB\007\b\004¢\006\002\020\002R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006R\022\020\007\032\0020\bX¦\004¢\006\006\032\004\b\t\020\nR\022\020\013\032\0020\004X¦\004¢\006\006\032\004\b\f\020\006\001\005\016\017\020\021\022¨\006\023"}, d2 = {"Lai/grazie/auth/product/model/api/auth/AuthFlow;", "", "()V", "display", "", "getDisplay", "()Ljava/lang/String;", "login", "Lai/grazie/model/cloud/API;", "getLogin", "()Lai/grazie/model/cloud/API;", "name", "getName", "Companion", "Lai/grazie/auth/product/model/api/auth/AbstractToolboxAuthFlow;", "Lai/grazie/auth/product/model/api/auth/ElectronAuthFlow;", "Lai/grazie/auth/product/model/api/auth/ExtensionAuthFlow;", "Lai/grazie/auth/product/model/api/auth/LocalProductAuthFlow;", "Lai/grazie/auth/product/model/api/auth/ServerProductAuthFlow;", "auth-product-model"})
/*    */ public abstract class AuthFlow { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private AuthFlow() {}
/*    */   @NotNull
/*    */   public abstract String getDisplay();
/*    */   @NotNull
/*    */   public abstract String getName();
/*    */   @NotNull
/*    */   public abstract API getLogin();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/product/model/api/auth/AuthFlow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/product/model/api/auth/AuthFlow;", "auth-product-model"})
/*    */   public static final class Companion { @NotNull
/*    */     public final KSerializer<AuthFlow> serializer() {
/* 16 */       return (KSerializer<AuthFlow>)ProductsAuthFlow.Serializer.INSTANCE;
/*    */     }
/*    */     
/*    */     private Companion() {} }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\auth\AuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */