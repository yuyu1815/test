/*   */ package ai.grazie.quota.spend;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 6 */     String[] arrayOfString = new String[3]; arrayOfString[0] = "context"; arrayOfString[1] = "generation"; arrayOfString[2] = "single"; Annotation[][] arrayOfAnnotation = new Annotation[3][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.quota.spend.SpendType", (Enum[])SpendType.values(), arrayOfString, arrayOfAnnotation, null);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\spend\SpendType$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */