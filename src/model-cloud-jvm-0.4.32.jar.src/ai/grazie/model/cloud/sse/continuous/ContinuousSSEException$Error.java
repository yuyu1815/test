/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ 
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\002\b\006\030\0002\0020\001B\033\022\b\b\002\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006R\026\020\004\032\004\030\0010\005X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Error;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException;", "errorMessage", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "getErrorMessage", "()Ljava/lang/String;", "model-cloud"})
/*    */ public final class Error extends ContinuousSSEException {
/*    */   @NotNull
/*    */   private final String errorMessage;
/*    */   @Nullable
/*    */   private final Throwable cause;
/*    */   
/* 12 */   public Error(@NotNull String errorMessage, @Nullable Throwable cause) { super(null); this.errorMessage = errorMessage; this.cause = cause; } @NotNull public final String getErrorMessage() { return this.errorMessage; } @Nullable public Throwable getCause() { return this.cause; }
/*    */ 
/*    */   
/*    */   public Error() {
/*    */     this(null, null, 3, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEException$Error.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */