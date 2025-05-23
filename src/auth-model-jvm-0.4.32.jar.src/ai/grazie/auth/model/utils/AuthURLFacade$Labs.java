/*    */ package ai.grazie.auth.model.utils;
/*    */ 
/*    */ import ai.grazie.auth.product.model.api.products.InternalProductsAuthFlow;
/*    */ import ai.grazie.model.cloud.API;
/*    */ import ai.grazie.utils.mpp.URLKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\b\004\030\0002\0020\001B\005¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\004J\006\020\006\032\0020\004¨\006\007"}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade$Labs;", "", "(Lai/grazie/auth/model/utils/AuthURLFacade;)V", "login", "", "redirect", "success", "auth-model"})
/*    */ public final class Labs
/*    */ {
/*    */   @NotNull
/*    */   public final String success() {
/* 60 */     return API.url$default(InternalProductsAuthFlow.INSTANCE.getLabs().getSuccess(), AuthURLFacade.access$getServer$p(AuthURLFacade.this), null, null, 6, null);
/*    */   }
/*    */   @NotNull
/*    */   public final String login(@NotNull String redirect) {
/* 64 */     Intrinsics.checkNotNullParameter(redirect, "redirect"); return 
/* 65 */       URLKt.parameter(API.url$default(InternalProductsAuthFlow.INSTANCE.getLabs().getLogin(), AuthURLFacade.access$getServer$p(AuthURLFacade.this), null, null, 6, null), InternalProductsAuthFlow.INSTANCE.getLabs().getParameter(), redirect);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\mode\\utils\AuthURLFacade$Labs.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */