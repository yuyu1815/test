/*    */ package ai.grazie.auth.model.api;
/*    */ @Deprecated(message = "Will be removed after migration to new auth flow - GRZ-3162")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\005\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\016\020\020\032\0020\t2\006\020\021\032\0020\tR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\022"}, d2 = {"Lai/grazie/auth/model/api/InviteAPI;", "Lai/grazie/model/cloud/UnitTypedApi;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "absolute", "code", "auth-model"})
/*    */ @SourceDebugExtension({"SMAP\nInviteAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InviteAPI.kt\nai/grazie/auth/model/api/InviteAPI\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,13:1\n19#2,2:14\n*S KotlinDebug\n*F\n+ 1 InviteAPI.kt\nai/grazie/auth/model/api/InviteAPI\n*L\n7#1:14,2\n*E\n"})
/*    */ public final class InviteAPI implements UnitTypedApi<Unit> {
/*    */   @NotNull
/*  7 */   public static final InviteAPI INSTANCE = new InviteAPI(); @NotNull private static final TypeInfo<Unit> responseType; @NotNull public TypeInfo<Unit> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     KType kType$iv = Reflection.typeOf(Unit.class);
/* 15 */     responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private static final HttpMethod httpMethod = HttpMethod.Get;
/*    */   
/*    */   @NotNull
/*    */   public HttpMethod getHttpMethod() {
/*    */     return httpMethod;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private static final String path = "/invite/{code}";
/*    */   
/*    */   @NotNull
/*    */   public String getPath() {
/*    */     return path;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String absolute(@NotNull String code) {
/*    */     Intrinsics.checkNotNullParameter(code, "code");
/*    */     return "/invite/" + code;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\api\InviteAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */