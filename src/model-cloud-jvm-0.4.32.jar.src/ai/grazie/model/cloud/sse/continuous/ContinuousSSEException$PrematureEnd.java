/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEPrematureEnd;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException$PrematureEnd;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEException;", "reason", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "(Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;)V", "getReason", "()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "model-cloud"})
/*    */ public final class PrematureEnd extends ContinuousSSEException {
/*    */   @NotNull
/*    */   private final ContinuousSSEPrematureEnd reason;
/*    */   
/* 10 */   public PrematureEnd(@NotNull ContinuousSSEPrematureEnd reason) { super(null); this.reason = reason; } @NotNull public final ContinuousSSEPrematureEnd getReason() { return this.reason; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEException$PrematureEnd.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */