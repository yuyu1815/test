/*    */ package ai.grazie.client.common.model;
/*    */ 
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import ai.grazie.model.cloud.HttpTimeoutConfig;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\b\b\007\030\0002\0020\001B\033\b\027\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006B#\022\006\020\002\032\0020\007\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\b\032\004\030\0010\t¢\006\002\020\nR\021\020\002\032\0020\007¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\017\020\020¨\006\021"}, d2 = {"Lai/grazie/client/common/model/RequestOptions;", "Lai/grazie/DataHolder;", "headers", "Lai/grazie/client/common/model/HeaderCollection;", "queryParameters", "Lai/grazie/client/common/model/QueryParameterCollection;", "(Lai/grazie/client/common/model/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;)V", "Lai/grazie/model/cloud/HeaderCollection;", "timeoutConfig", "Lai/grazie/model/cloud/HttpTimeoutConfig;", "(Lai/grazie/model/cloud/HeaderCollection;Lai/grazie/client/common/model/QueryParameterCollection;Lai/grazie/model/cloud/HttpTimeoutConfig;)V", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "getQueryParameters", "()Lai/grazie/client/common/model/QueryParameterCollection;", "getTimeoutConfig", "()Lai/grazie/model/cloud/HttpTimeoutConfig;", "client-common"})
/*    */ public final class RequestOptions extends DataHolder {
/*    */   @NotNull
/*    */   private final HeaderCollection headers;
/*    */   
/*    */   @NotNull
/* 13 */   public final HeaderCollection getHeaders() { return this.headers; } @NotNull private final QueryParameterCollection queryParameters; @Nullable private final HttpTimeoutConfig timeoutConfig; @NotNull
/* 14 */   public final QueryParameterCollection getQueryParameters() { return this.queryParameters; } @Nullable
/* 15 */   public final HttpTimeoutConfig getTimeoutConfig() { return this.timeoutConfig; } public RequestOptions(@NotNull HeaderCollection headers, @NotNull QueryParameterCollection queryParameters, @Nullable HttpTimeoutConfig timeoutConfig) { this.headers = headers; this.queryParameters = queryParameters; this.timeoutConfig = timeoutConfig; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Deprecated(message = "In favor of overload with new HeaderCollection. If you use empty constructor call you can leave it as is.", replaceWith = @ReplaceWith(expression = "RequestOptions(headers.toHeaderCollection(), queryParameters)", imports = {}))
/*    */   public RequestOptions(@NotNull HeaderCollection headers, @NotNull QueryParameterCollection queryParameters) {
/* 25 */     this(headers.toHeaderCollection(), queryParameters, null, 4, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\RequestOptions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */