/*   */ package ai.grazie.model.cloud.sse.continuous.events.type;
/*   */ import java.lang.annotation.Annotation;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 7 */     String[] arrayOfString = new String[5]; arrayOfString[0] = "data"; arrayOfString[1] = "timeout"; arrayOfString[2] = "cancel"; arrayOfString[3] = "premature_end"; arrayOfString[4] = "error"; Annotation[][] arrayOfAnnotation = new Annotation[5][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; arrayOfAnnotation[3] = null; arrayOfAnnotation[4] = null; return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType", (Enum[])ContinuousSSEEventType.values(), arrayOfString, arrayOfAnnotation, null);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\events\type\ContinuousSSEEventType$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */