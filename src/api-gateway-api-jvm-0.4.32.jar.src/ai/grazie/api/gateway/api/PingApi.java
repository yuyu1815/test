/*    */ package ai.grazie.api.gateway.api;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/api/gateway/api/PingApi;", "", "()V", "Ping", "api-gateway-api"})
/*    */ public final class PingApi { @NotNull
/*    */   public static final PingApi INSTANCE = new PingApi();
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007R\024\020\b\032\0020\002XD¢\006\b\n\000\032\004\b\t\020\nR\032\020\013\032\b\022\004\022\0020\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/api/gateway/api/PingApi$Ping;", "Lai/grazie/model/cloud/UnitTypedApi;", "", "()V", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "getPath", "()Ljava/lang/String;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "api-gateway-api"})
/*    */   @SourceDebugExtension({"SMAP\nPingApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PingApi.kt\nai/grazie/api/gateway/api/PingApi$Ping\n+ 2 TypedApi.kt\nai/grazie/model/cloud/TypedApiKt\n*L\n1#1,12:1\n19#2,2:13\n*S KotlinDebug\n*F\n+ 1 PingApi.kt\nai/grazie/api/gateway/api/PingApi$Ping\n*L\n7#1:13,2\n*E\n"})
/*    */   public static final class Ping implements UnitTypedApi<String> { @NotNull
/*  7 */     public static final Ping INSTANCE = new Ping(); @NotNull private static final TypeInfo<String> responseType; @NotNull public TypeInfo<String> getResponseType() { return responseType; } static { int $i$f$typeInfo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 13 */       KType kType$iv = Reflection.typeOf(String.class);
/* 14 */       responseType = new TypeInfo(kType$iv, Reflection.getOrCreateKotlinClass(String.class)); }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     private static final HttpMethod httpMethod = HttpMethod.Get;
/*    */     
/*    */     @NotNull
/*    */     public HttpMethod getHttpMethod() {
/*    */       return httpMethod;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     private static final String path = "/ping";
/*    */     
/*    */     @NotNull
/*    */     public String getPath() {
/*    */       return path;
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\PingApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */