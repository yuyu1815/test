/*   */ package ai.grazie.sum;
/*   */ import java.lang.annotation.Annotation;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 7 */     String[] arrayOfString = new String[4]; arrayOfString[0] = "plain"; arrayOfString[1] = "markdown"; arrayOfString[2] = "youtrack"; arrayOfString[3] = "youtrack-no-templates"; Annotation[][] arrayOfAnnotation = new Annotation[4][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; arrayOfAnnotation[3] = null; return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.sum.Format", (Enum[])Format.values(), arrayOfString, arrayOfAnnotation, null);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-sum-jvm-0.4.32.jar!\ai\grazie\sum\Format$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */