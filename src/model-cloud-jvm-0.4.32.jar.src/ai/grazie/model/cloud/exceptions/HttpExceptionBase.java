/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ 
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\007\b\027\030\000 \0202\0060\001j\002`\002:\001\020B+\022\b\020\003\032\004\030\0010\004\022\n\b\002\020\005\032\004\030\0010\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n¢\006\002\020\013R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\f\020\rR\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\016\020\017¨\006\021"}, d2 = {"Lai/grazie/model/cloud/exceptions/HttpExceptionBase;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "description", "", "cause", "", "status", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;ILai/grazie/model/cloud/HeaderCollection;)V", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "getStatus", "()I", "Companion", "model-cloud"})
/*    */ public class HttpExceptionBase extends RuntimeException {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 10 */   public final int getStatus() { return this.status; } private final int status; @NotNull private final HeaderCollection headers; @NotNull
/* 11 */   public final HeaderCollection getHeaders() { return this.headers; } public HttpExceptionBase(@Nullable String description, @Nullable Throwable cause, int status, @NotNull HeaderCollection headers) {
/* 12 */     super(description, cause);
/*    */     this.status = status;
/*    */     this.headers = headers;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Lai/grazie/model/cloud/exceptions/HttpExceptionBase$Companion;", "", "()V", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\HttpExceptionBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */