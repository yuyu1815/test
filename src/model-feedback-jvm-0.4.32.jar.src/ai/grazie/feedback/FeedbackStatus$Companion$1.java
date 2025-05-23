/*   */ package ai.grazie.feedback;
/*   */ import kotlin.jvm.internal.Lambda;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 8 */     return EnumsKt.createSimpleEnumSerializer("ai.grazie.feedback.FeedbackStatus", (Enum[])FeedbackStatus.values());
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-feedback-jvm-0.4.32.jar!\ai\grazie\feedback\FeedbackStatus$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */