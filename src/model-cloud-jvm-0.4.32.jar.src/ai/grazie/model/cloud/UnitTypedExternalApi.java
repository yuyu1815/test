/*   */ package ai.grazie.model.cloud;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\bf\030\000*\b\b\000\020\001*\0020\0022\0020\003R\036\020\004\032\f\022\006\b\001\022\0020\006\030\0010\0058VX\004¢\006\006\032\004\b\007\020\bR\022\020\t\032\0020\nX¦\004¢\006\006\032\004\b\013\020\fR\030\020\r\032\b\022\004\022\0028\0000\005X¦\004¢\006\006\032\004\b\016\020\bø\001\000\002\006\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Lai/grazie/model/cloud/UnitTypedExternalApi;", "ResponseType", "", "Lai/grazie/model/cloud/ExternalAPI;", "exceptionBodyType", "Lai/grazie/model/cloud/TypeInfo;", "Lai/grazie/model/cloud/ExternalJsonExceptionBody;", "getExceptionBodyType", "()Lai/grazie/model/cloud/TypeInfo;", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "responseType", "getResponseType", "model-cloud"})
/*   */ public interface UnitTypedExternalApi<ResponseType> extends ExternalAPI {
/*   */   @Nullable
/*   */   default TypeInfo<? extends ExternalJsonExceptionBody> getExceptionBodyType() {
/* 8 */     return null;
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   TypeInfo<ResponseType> getResponseType();
/*   */   
/*   */   @NotNull
/*   */   HttpMethod getHttpMethod();
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\UnitTypedExternalApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */