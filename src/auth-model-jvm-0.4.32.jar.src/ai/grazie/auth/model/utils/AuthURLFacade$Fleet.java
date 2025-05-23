/*    */ package ai.grazie.auth.model.utils;
/*    */ 
/*    */ import ai.grazie.auth.product.model.api.products.ExternalProductsAuthFlow;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\004\b\004\030\0002\0020\001B\005¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\004J\016\020\007\032\0020\0042\006\020\006\032\0020\004¨\006\b"}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade$Fleet;", "", "(Lai/grazie/auth/model/utils/AuthURLFacade;)V", "invite", "", "code", "redirect", "login", "auth-model"})
/*    */ public final class Fleet
/*    */ {
/*    */   @NotNull
/*    */   public final String login(@NotNull String redirect) {
/* 80 */     Intrinsics.checkNotNullParameter(redirect, "redirect"); return 
/* 81 */       URLKt.parameter(API.url$default(ExternalProductsAuthFlow.INSTANCE.getFleet().getLogin(), AuthURLFacade.access$getServer$p(AuthURLFacade.this), null, null, 6, null), ExternalProductsAuthFlow.INSTANCE.getFleet().getParameter(), redirect);
/*    */   }
/*    */   @NotNull
/*    */   public final String invite(@NotNull String code, @NotNull String redirect) {
/* 85 */     Intrinsics.checkNotNullParameter(code, "code"); Intrinsics.checkNotNullParameter(redirect, "redirect"); return 
/* 86 */       URLKt.parameter(AuthURLFacade.access$getServer$p(AuthURLFacade.this) + AuthURLFacade.access$getServer$p(AuthURLFacade.this), ExternalProductsAuthFlow.INSTANCE.getFleet().getParameter(), redirect);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\mode\\utils\AuthURLFacade$Fleet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */