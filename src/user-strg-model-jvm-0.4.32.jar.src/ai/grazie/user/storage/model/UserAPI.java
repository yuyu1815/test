/*    */ package ai.grazie.user.storage.model;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/user/storage/model/UserAPI;", "", "()V", "Remove", "user-strg-model"})
/*    */ public final class UserAPI { @NotNull
/*    */   public static final UserAPI INSTANCE = new UserAPI();
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lai/grazie/user/storage/model/UserAPI$Remove;", "Lai/grazie/model/cloud/UnitTypedApi;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "user-strg-model"})
/*    */   @SourceDebugExtension({"SMAP\nUserAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAPI.kt\nai/grazie/user/storage/model/UserAPI$Remove\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,12:1\n19#2,2:13\n*S KotlinDebug\n*F\n+ 1 UserAPI.kt\nai/grazie/user/storage/model/UserAPI$Remove\n*L\n8#1:13,2\n*E\n"})
/*    */   public static final class Remove implements UnitTypedApi<Unit> { @NotNull
/*  7 */     public static final Remove INSTANCE = new Remove(); @NotNull private static final String path = "/user/remove"; @NotNull private static final TypeInfo<Unit> responseType; @NotNull public String getPath() { return path; } @NotNull
/*  8 */     public TypeInfo<Unit> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 13 */       KType kType$iv = Reflection.typeOf(Unit.class);
/* 14 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     private static final HttpMethod httpMethod = HttpMethod.Post;
/*    */     
/*    */     @NotNull
/*    */     public HttpMethod getHttpMethod() {
/*    */       return httpMethod;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\model\UserAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */