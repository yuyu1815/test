/*    */ package ai.grazie.model.cloud;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\005\bf\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0022\0020\004R\032\020\005\032\0020\0068VX\004¢\006\f\022\004\b\007\020\b\032\004\b\005\020\tR\030\020\n\032\b\022\004\022\0028\0000\013X¦\004¢\006\006\032\004\b\f\020\rR\030\020\016\032\b\022\004\022\0028\0010\013X¦\004¢\006\006\032\004\b\017\020\rø\001\000\002\006\n\004\b!0\001¨\006\020À\006\001"}, d2 = {"Lai/grazie/model/cloud/TypedApi;", "RequestType", "", "ResponseType", "Lai/grazie/model/cloud/API;", "isSseResponse", "", "isSseResponse$annotations", "()V", "()Z", "requestType", "Lai/grazie/model/cloud/TypeInfo;", "getRequestType", "()Lai/grazie/model/cloud/TypeInfo;", "responseType", "getResponseType", "model-cloud"})
/*    */ public interface TypedApi<RequestType, ResponseType>
/*    */   extends API
/*    */ {
/*    */   @NotNull
/*    */   TypeInfo<RequestType> getRequestType();
/*    */   
/*    */   default boolean isSseResponse() {
/* 15 */     return false;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   TypeInfo<ResponseType> getResponseType();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\TypedApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */