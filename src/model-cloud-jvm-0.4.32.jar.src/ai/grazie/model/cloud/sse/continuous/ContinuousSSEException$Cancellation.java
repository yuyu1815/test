/*   */ package ai.grazie.model.cloud.sse.continuous;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException$Cancellation;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException;", "reason", "", "(Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "model-cloud"})
/*   */ public final class Cancellation extends ContinuousSSEException {
/* 6 */   public Cancellation(@NotNull String reason) { super(null); this.reason = reason; } @NotNull private final String reason; @NotNull public final String getReason() { return this.reason; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEException$Cancellation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */