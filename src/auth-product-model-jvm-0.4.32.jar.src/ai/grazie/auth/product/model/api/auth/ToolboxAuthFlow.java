/*    */ package ai.grazie.auth.product.model.api.auth;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = ProductsAuthFlow.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\021\032\b\022\004\022\0020\0000\022HÆ\001R\024\020\003\032\0020\004XD¢\006\b\n\000\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\013\032\0020\004XD¢\006\b\n\000\032\004\b\f\020\006R\024\020\r\032\0020\bX\004¢\006\b\n\000\032\004\b\016\020\nR\024\020\017\032\0020\bX\004¢\006\b\n\000\032\004\b\020\020\n¨\006\023"}, d2 = {"Lai/grazie/auth/product/model/api/auth/ToolboxAuthFlow;", "Lai/grazie/auth/product/model/api/auth/AbstractToolboxAuthFlow;", "()V", "display", "", "getDisplay", "()Ljava/lang/String;", "login", "Lai/grazie/model/cloud/API;", "getLogin", "()Lai/grazie/model/cloud/API;", "name", "getName", "success", "getSuccess", "waitlist", "getWaitlist", "serializer", "Lkotlinx/serialization/KSerializer;", "auth-product-model"})
/*    */ public final class ToolboxAuthFlow extends AbstractToolboxAuthFlow {
/*    */   @NotNull
/*    */   public final KSerializer<ToolboxAuthFlow> serializer() {
/*  9 */     return (KSerializer<ToolboxAuthFlow>)ProductsAuthFlow.Serializer.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/* 13 */   public static final ToolboxAuthFlow INSTANCE = new ToolboxAuthFlow(); @NotNull private static final String name = "general-toolbox"; @NotNull public String getName() { return name; } @NotNull
/* 14 */   private static final String display = "To Toolbox"; @NotNull public String getDisplay() { return display; }
/*    */    @NotNull
/* 16 */   private static final API login = APIUtils.INSTANCE.absolute("/auth/toolbox/login"); @NotNull public API getLogin() { return login; } @NotNull
/* 17 */   private static final API success = APIUtils.INSTANCE.absolute("/auth/toolbox/code"); @NotNull public API getSuccess() { return success; } @NotNull
/* 18 */   private static final API waitlist = APIUtils.INSTANCE.absolute("/auth/toolbox/waitlist"); @NotNull public API getWaitlist() { return waitlist; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-product-model-jvm-0.4.32.jar!\ai\grazie\auth\product\model\api\auth\ToolboxAuthFlow.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */