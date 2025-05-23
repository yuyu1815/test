/*   */ package ai.grazie.model.cloud.utils;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003*\001\000\b\n\030\0002\0020\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\004\020\005R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"ai/grazie/model/cloud/utils/APIUtils$absolute$1", "Lai/grazie/model/cloud/API;", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "path", "", "getPath", "()Ljava/lang/String;", "model-cloud"})
/*   */ public final class APIUtils$absolute$1 implements API {
/*   */   private final String path;
/*   */   
/* 8 */   APIUtils$absolute$1(String $path) { this.path = $path;
/* 9 */     this.httpMethod = HttpMethod.Get; } private final HttpMethod httpMethod; public HttpMethod getHttpMethod() { return this.httpMethod; }
/*   */ 
/*   */   
/*   */   public String getPath() {
/*   */     return this.path;
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\clou\\utils\APIUtils$absolute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */