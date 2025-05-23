/*   */ package ai.grazie.auth.model.survey;
/*   */ import java.lang.annotation.Annotation;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 8 */     String[] arrayOfString = new String[14]; arrayOfString[0] = "engineering"; arrayOfString[1] = "analytics"; arrayOfString[2] = "pm"; arrayOfString[3] = "technical-writing"; arrayOfString[4] = "customer-support"; arrayOfString[5] = "marketing"; arrayOfString[6] = "hr"; arrayOfString[7] = "sales"; arrayOfString[8] = "design"; arrayOfString[9] = "copywriting"; arrayOfString[10] = "science"; arrayOfString[11] = "management"; arrayOfString[12] = "student"; arrayOfString[13] = "none"; Annotation[][] arrayOfAnnotation = new Annotation[14][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; arrayOfAnnotation[3] = null; arrayOfAnnotation[4] = null; arrayOfAnnotation[5] = null; arrayOfAnnotation[6] = null; arrayOfAnnotation[7] = null; arrayOfAnnotation[8] = null; arrayOfAnnotation[9] = null; arrayOfAnnotation[10] = null; arrayOfAnnotation[11] = null; arrayOfAnnotation[12] = null; arrayOfAnnotation[13] = null; return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.auth.model.survey.GrazieUserWorkRole", (Enum[])GrazieUserWorkRole.values(), arrayOfString, arrayOfAnnotation, null);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\survey\GrazieUserWorkRole$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */