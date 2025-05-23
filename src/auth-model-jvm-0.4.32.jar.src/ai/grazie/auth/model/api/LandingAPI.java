/*    */ package ai.grazie.auth.model.api;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\005\bÆ\002\030\0002\0020\001:\003\003\004\005B\007\b\002¢\006\002\020\002¨\006\006"}, d2 = {"Lai/grazie/auth/model/api/LandingAPI;", "", "()V", "Extension", "OptOut", "Tools", "auth-model"})
/*    */ public final class LandingAPI { @NotNull
/*    */   public static final LandingAPI INSTANCE = new LandingAPI();
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lai/grazie/auth/model/api/LandingAPI$Tools;", "Lai/grazie/model/cloud/UnitTypedApi;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "auth-model"})
/*    */   @SourceDebugExtension({"SMAP\nLanding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$Tools\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,26:1\n19#2,2:27\n*S KotlinDebug\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$Tools\n*L\n9#1:27,2\n*E\n"})
/*    */   public static final class Tools implements UnitTypedApi<Unit> { @NotNull
/*  7 */     public static final Tools INSTANCE = new Tools(); @NotNull private static final String path = "/tools"; @NotNull public String getPath() { return path; } @NotNull
/*  8 */     private static final HttpMethod httpMethod = HttpMethod.Get; @NotNull private static final TypeInfo<Unit> responseType; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull
/*  9 */     public TypeInfo<Unit> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0;
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
/* 27 */       KType kType$iv = Reflection.typeOf(Unit.class);
/* 28 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lai/grazie/auth/model/api/LandingAPI$OptOut;", "Lai/grazie/model/cloud/UnitTypedApi;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "auth-model"}) @SourceDebugExtension({"SMAP\nLanding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$OptOut\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,26:1\n19#2,2:27\n*S KotlinDebug\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$OptOut\n*L\n15#1:27,2\n*E\n"}) public static final class OptOut implements UnitTypedApi<Unit> { @NotNull public static final OptOut INSTANCE = new OptOut(); @NotNull private static final String path = "/opt-out"; @NotNull public String getPath() { return path; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Unit.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); } @NotNull private static final HttpMethod httpMethod = HttpMethod.Get; @NotNull private static final TypeInfo<Unit> responseType; @NotNull public HttpMethod getHttpMethod() { return httpMethod; } @NotNull public TypeInfo<Unit> getResponseType() { return responseType; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/auth/model/api/LandingAPI$Extension;", "", "()V", "Install", "auth-model"}) public static final class Extension { @NotNull public static final Extension INSTANCE = new Extension(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\tXD¢\006\b\n\000\032\004\b\n\020\013R\032\020\f\032\b\022\004\022\0020\0020\rX\004¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lai/grazie/auth/model/api/LandingAPI$Extension$Install;", "Lai/grazie/model/cloud/UnitTypedApi;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "auth-model"}) @SourceDebugExtension({"SMAP\nLanding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$Extension$Install\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,26:1\n19#2,2:27\n*S KotlinDebug\n*F\n+ 1 Landing.kt\nai/grazie/auth/model/api/LandingAPI$Extension$Install\n*L\n22#1:27,2\n*E\n"}) public static final class Install implements UnitTypedApi<Unit> { @NotNull public static final Install INSTANCE = new Install(); @NotNull private static final String path = "/browser-extension/install"; @NotNull public String getPath() { return path; } static { int $i$f$typeInfo = 0; KType kType$iv = Reflection.typeOf(Unit.class); responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(Unit.class)); }
/*    */ 
/*    */       
/*    */       @NotNull
/*    */       private static final HttpMethod httpMethod = HttpMethod.Get;
/*    */       @NotNull
/*    */       private static final TypeInfo<Unit> responseType;
/*    */       
/*    */       @NotNull
/*    */       public HttpMethod getHttpMethod() {
/*    */         return httpMethod;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public TypeInfo<Unit> getResponseType() {
/*    */         return responseType;
/*    */       } }
/*    */      }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\api\LandingAPI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */