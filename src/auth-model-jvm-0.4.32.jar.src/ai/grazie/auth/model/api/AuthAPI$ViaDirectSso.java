/*     */ package ai.grazie.auth.model.api;
/*     */ 
/*     */ import ai.grazie.auth.model.SSO;
/*     */ import ai.grazie.model.cloud.HttpMethod;
/*     */ import ai.grazie.model.cloud.TypeInfo;
/*     */ import ai.grazie.model.cloud.TypedApi;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.reflect.KType;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\006\bÆ\002\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\023B\007\b\002¢\006\002\020\004R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\032\020\r\032\b\022\004\022\0020\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\021\032\b\022\004\022\0020\0030\016X\004¢\006\b\n\000\032\004\b\022\020\020¨\006\024"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$ViaDirectSso;", "Lai/grazie/model/cloud/TypedApi;", "Lai/grazie/auth/model/api/AuthAPI$ViaDirectSso$Request;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "Request", "auth-model"})
/*     */ @SourceDebugExtension({"SMAP\nAuthAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthAPI.kt\nai/grazie/auth/model/api/AuthAPI$ViaDirectSso\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,282:1\n19#2,2:283\n19#2,2:285\n*S KotlinDebug\n*F\n+ 1 AuthAPI.kt\nai/grazie/auth/model/api/AuthAPI$ViaDirectSso\n*L\n202#1:283,2\n203#1:285,2\n*E\n"})
/*     */ public final class ViaDirectSso
/*     */   implements TypedApi<AuthAPI.ViaDirectSso.Request, Unit>
/*     */ {
/*     */   @NotNull
/* 200 */   public static final ViaDirectSso INSTANCE = new ViaDirectSso(); @NotNull private static final String path = "/auth/via-direct-sso"; @NotNull public String getPath() { return path; } @NotNull private static final TypeInfo<Request> requestType; @NotNull
/* 201 */   private static final HttpMethod httpMethod = HttpMethod.Get; @NotNull private static final TypeInfo<Unit> responseType; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull
/* 202 */   public TypeInfo<Request> getRequestType() { return requestType; } static { int $i$f$typeInfo = 0;
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
/* 283 */     KType kType$iv = Reflection.typeOf(Request.class);
/* 284 */     requestType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Request.class)); $i$f$typeInfo = 0;
/* 285 */     kType$iv = Reflection.typeOf(Unit.class);
/* 286 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public TypeInfo<Unit> getResponseType() {
/*     */     return responseType;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\t\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\005HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\024"}, d2 = {"Lai/grazie/auth/model/api/AuthAPI$ViaDirectSso$Request;", "", "sso", "Lai/grazie/auth/model/SSO;", "path", "", "(Lai/grazie/auth/model/SSO;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getSso", "()Lai/grazie/auth/model/SSO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "auth-model"})
/*     */   public static final class Request {
/*     */     @NotNull
/*     */     private final SSO sso;
/*     */     @NotNull
/*     */     private final String path;
/*     */     
/*     */     public Request(@NotNull SSO sso, @NotNull String path) {
/*     */       this.sso = sso;
/*     */       this.path = path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SSO getSso() {
/*     */       return this.sso;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getPath() {
/*     */       return this.path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SSO component1() {
/*     */       return this.sso;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Request copy(@NotNull SSO sso, @NotNull String path) {
/*     */       Intrinsics.checkNotNullParameter(sso, "sso");
/*     */       Intrinsics.checkNotNullParameter(path, "path");
/*     */       return new Request(sso, path);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Request(sso=" + this.sso + ", path=" + this.path + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.sso.hashCode();
/*     */       return result * 31 + this.path.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Request))
/*     */         return false; 
/*     */       Request request = (Request)other;
/*     */       return (this.sso != request.sso) ? false : (!!Intrinsics.areEqual(this.path, request.path));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\api\AuthAPI$ViaDirectSso.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */