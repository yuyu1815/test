/*     */ package ai.grazie.auth.model.utils;
/*     */ 
/*     */ import ai.grazie.auth.model.SSO;
/*     */ import ai.grazie.auth.model.api.AuthAPI;
/*     */ import ai.grazie.auth.product.model.api.products.ExternalProductsAuthFlow;
/*     */ import ai.grazie.auth.product.model.api.products.GrazieProductsAuthFlow;
/*     */ import ai.grazie.auth.product.model.api.products.InternalProductsAuthFlow;
/*     */ import ai.grazie.model.cloud.API;
/*     */ import ai.grazie.utils.mpp.URLKt;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\007\b\007\030\000 \0352\0020\001:\005\035\036\037 !B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\016\020\027\032\0020\0032\006\020\030\032\0020\003J\026\020\031\032\0020\0032\006\020\032\032\0020\0332\006\020\034\032\0020\003R\025\020\005\032\0060\006R\0020\000¢\006\b\n\000\032\004\b\007\020\bR\025\020\t\032\0060\nR\0020\000¢\006\b\n\000\032\004\b\013\020\fR \020\r\032\0060\016R\0020\0008\006X\004¢\006\016\n\000\022\004\b\017\020\020\032\004\b\021\020\022R\025\020\023\032\0060\024R\0020\000¢\006\b\n\000\032\004\b\025\020\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\""}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade;", "", "server", "", "(Ljava/lang/String;)V", "fleet", "Lai/grazie/auth/model/utils/AuthURLFacade$Fleet;", "getFleet", "()Lai/grazie/auth/model/utils/AuthURLFacade$Fleet;", "intellij", "Lai/grazie/auth/model/utils/AuthURLFacade$IntelliJ;", "getIntellij", "()Lai/grazie/auth/model/utils/AuthURLFacade$IntelliJ;", "labs", "Lai/grazie/auth/model/utils/AuthURLFacade$Labs;", "getLabs$annotations", "()V", "getLabs", "()Lai/grazie/auth/model/utils/AuthURLFacade$Labs;", "professional", "Lai/grazie/auth/model/utils/AuthURLFacade$Professional;", "getProfessional", "()Lai/grazie/auth/model/utils/AuthURLFacade$Professional;", "logout", "redirect", "viaDirectSSO", "sso", "Lai/grazie/auth/model/SSO;", "path", "Companion", "Fleet", "IntelliJ", "Labs", "Professional", "auth-model"})
/*     */ public final class AuthURLFacade {
/*  17 */   public AuthURLFacade(@NotNull String server) { this.server = server;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  52 */     this.professional = new Professional();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     this.labs = new Labs();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     this.fleet = new Fleet();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     this.intellij = new IntelliJ(); } @NotNull public final IntelliJ getIntellij() { return this.intellij; }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\007\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006R\021\020\t\032\0020\004¢\006\b\n\000\032\004\b\n\020\006¨\006\013"}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade$Companion;", "", "()V", "local", "Lai/grazie/auth/model/utils/AuthURLFacade;", "getLocal", "()Lai/grazie/auth/model/utils/AuthURLFacade;", "prod", "getProd", "stgn", "getStgn", "auth-model"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final AuthURLFacade getStgn() {
/*     */       return AuthURLFacade.stgn;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AuthURLFacade getProd() {
/*     */       return AuthURLFacade.prod;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AuthURLFacade getLocal() {
/*     */       return AuthURLFacade.local;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String server;
/*     */   @NotNull
/*     */   private final Professional professional;
/*     */   @NotNull
/*     */   private final Labs labs;
/*     */   @NotNull
/*     */   private final Fleet fleet;
/*     */   @NotNull
/*     */   private final IntelliJ intellij;
/*     */   @NotNull
/*     */   private static final AuthURLFacade stgn = new AuthURLFacade("https://auth.stgn.grazie.ai");
/*     */   @NotNull
/*     */   private static final AuthURLFacade prod = new AuthURLFacade("https://auth.grazie.ai");
/*     */   @NotNull
/*     */   private static final AuthURLFacade local = new AuthURLFacade("http://localhost");
/*     */   
/*     */   @NotNull
/*     */   public final String logout(@NotNull String redirect) {
/*     */     Intrinsics.checkNotNullParameter(redirect, "redirect");
/*     */     return URLKt.parameter(API.url$default((API)AuthAPI.Logout.INSTANCE, this.server, null, null, 6, null), "redirectBackTo", redirect);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String viaDirectSSO(@NotNull SSO sso, @NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(sso, "sso");
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     return URLKt.parameter(URLKt.parameter(API.url$default((API)AuthAPI.ViaDirectSso.INSTANCE, this.server, null, null, 6, null), "path", path), "sso", sso.getValue());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\b\004\030\0002\0020\001B\005¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\004J\006\020\006\032\0020\004¨\006\007"}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade$Professional;", "", "(Lai/grazie/auth/model/utils/AuthURLFacade;)V", "login", "", "redirect", "success", "auth-model"})
/*     */   public final class Professional {
/*     */     @NotNull
/*     */     public final String success() {
/*     */       return API.url$default(GrazieProductsAuthFlow.INSTANCE.getProfessional().getSuccess(), AuthURLFacade.this.server, null, null, 6, null);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String login(@NotNull String redirect) {
/*     */       Intrinsics.checkNotNullParameter(redirect, "redirect");
/*     */       return URLKt.parameter(API.url$default(GrazieProductsAuthFlow.INSTANCE.getProfessional().getLogin(), AuthURLFacade.this.server, null, null, 6, null), GrazieProductsAuthFlow.INSTANCE.getProfessional().getParameter(), redirect);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Professional getProfessional() {
/*     */     return this.professional;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\b\004\030\0002\0020\001B\005¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\004J\006\020\006\032\0020\004¨\006\007"}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade$Labs;", "", "(Lai/grazie/auth/model/utils/AuthURLFacade;)V", "login", "", "redirect", "success", "auth-model"})
/*     */   public final class Labs {
/*     */     @NotNull
/*     */     public final String success() {
/*     */       return API.url$default(InternalProductsAuthFlow.INSTANCE.getLabs().getSuccess(), AuthURLFacade.this.server, null, null, 6, null);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String login(@NotNull String redirect) {
/*     */       Intrinsics.checkNotNullParameter(redirect, "redirect");
/*     */       return URLKt.parameter(API.url$default(InternalProductsAuthFlow.INSTANCE.getLabs().getLogin(), AuthURLFacade.this.server, null, null, 6, null), InternalProductsAuthFlow.INSTANCE.getLabs().getParameter(), redirect);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Labs getLabs() {
/*     */     return this.labs;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\004\b\004\030\0002\0020\001B\005¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\004J\016\020\007\032\0020\0042\006\020\006\032\0020\004¨\006\b"}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade$Fleet;", "", "(Lai/grazie/auth/model/utils/AuthURLFacade;)V", "invite", "", "code", "redirect", "login", "auth-model"})
/*     */   public final class Fleet {
/*     */     @NotNull
/*     */     public final String login(@NotNull String redirect) {
/*     */       Intrinsics.checkNotNullParameter(redirect, "redirect");
/*     */       return URLKt.parameter(API.url$default(ExternalProductsAuthFlow.INSTANCE.getFleet().getLogin(), AuthURLFacade.this.server, null, null, 6, null), ExternalProductsAuthFlow.INSTANCE.getFleet().getParameter(), redirect);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invite(@NotNull String code, @NotNull String redirect) {
/*     */       Intrinsics.checkNotNullParameter(code, "code");
/*     */       Intrinsics.checkNotNullParameter(redirect, "redirect");
/*     */       return URLKt.parameter(AuthURLFacade.this.server + AuthURLFacade.this.server, ExternalProductsAuthFlow.INSTANCE.getFleet().getParameter(), redirect);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Fleet getFleet() {
/*     */     return this.fleet;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\004\b\004\030\0002\0020\001B\005¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\004J\016\020\007\032\0020\0042\006\020\006\032\0020\004¨\006\b"}, d2 = {"Lai/grazie/auth/model/utils/AuthURLFacade$IntelliJ;", "", "(Lai/grazie/auth/model/utils/AuthURLFacade;)V", "invite", "", "code", "redirect", "login", "auth-model"})
/*     */   public final class IntelliJ {
/*     */     @NotNull
/*     */     public final String login(@NotNull String redirect) {
/*     */       Intrinsics.checkNotNullParameter(redirect, "redirect");
/*     */       return URLKt.parameter(API.url$default(ExternalProductsAuthFlow.INSTANCE.getIntelliJ().getLogin(), AuthURLFacade.this.server, null, null, 6, null), ExternalProductsAuthFlow.INSTANCE.getIntelliJ().getParameter(), redirect);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invite(@NotNull String code, @NotNull String redirect) {
/*     */       Intrinsics.checkNotNullParameter(code, "code");
/*     */       Intrinsics.checkNotNullParameter(redirect, "redirect");
/*     */       return URLKt.parameter(AuthURLFacade.this.server + AuthURLFacade.this.server, ExternalProductsAuthFlow.INSTANCE.getIntelliJ().getParameter(), redirect);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\mode\\utils\AuthURLFacade.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */