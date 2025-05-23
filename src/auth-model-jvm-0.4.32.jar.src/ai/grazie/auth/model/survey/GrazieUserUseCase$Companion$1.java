/*   */ package ai.grazie.auth.model.survey;
/*   */ import java.lang.annotation.Annotation;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 7 */     String[] arrayOfString = new String[3]; arrayOfString[0] = "work"; arrayOfString[1] = "personal"; arrayOfString[2] = "school"; Annotation[][] arrayOfAnnotation = new Annotation[3][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.auth.model.survey.GrazieUserUseCase", (Enum[])GrazieUserUseCase.values(), arrayOfString, arrayOfAnnotation, null);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\survey\GrazieUserUseCase$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */