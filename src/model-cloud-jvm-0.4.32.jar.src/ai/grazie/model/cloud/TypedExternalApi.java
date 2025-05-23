/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bf\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\004R\036\020\005\032\f\022\006\b\001\022\0020\007\030\0010\0068VX\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\030\020\016\032\b\022\004\022\0028\0000\006X¦\004¢\006\006\032\004\b\017\020\tR\030\020\020\032\b\022\004\022\0028\0010\006X¦\004¢\006\006\032\004\b\021\020\tø\001\000\002\006\n\004\b!0\001¨\006\022À\006\001"}, d2 = {"Lai/grazie/model/cloud/TypedExternalApi;", "RequestType", "", "ResponseType", "Lai/grazie/model/cloud/ExternalAPI;", "exceptionBodyType", "Lai/grazie/model/cloud/TypeInfo;", "Lai/grazie/model/cloud/ExternalJsonExceptionBody;", "getExceptionBodyType", "()Lai/grazie/model/cloud/TypeInfo;", "httpMethod", "Lai/grazie/model/cloud/HttpMethod;", "getHttpMethod", "()Lai/grazie/model/cloud/HttpMethod;", "requestType", "getRequestType", "responseType", "getResponseType", "model-cloud"})
/*    */ public interface TypedExternalApi<RequestType, ResponseType>
/*    */   extends ExternalAPI {
/*    */   @NotNull
/*    */   TypeInfo<RequestType> getRequestType();
/*    */   
/*    */   @NotNull
/*    */   TypeInfo<ResponseType> getResponseType();
/*    */   
/*    */   @Nullable
/*    */   default TypeInfo<? extends ExternalJsonExceptionBody> getExceptionBodyType() {
/* 18 */     return null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   HttpMethod getHttpMethod();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\TypedExternalApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */