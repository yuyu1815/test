/*   */ package ai.grazie.model.cloud.sse.continuous;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Timeout;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "model-cloud"})
/*   */ public final class Timeout extends ContinuousSSEException {
/*   */   @NotNull
/*   */   private final String message;
/*   */   
/* 8 */   public Timeout(@NotNull String message) { super(null); this.message = message; } @NotNull public String getMessage() { return this.message; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEException$Timeout.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */