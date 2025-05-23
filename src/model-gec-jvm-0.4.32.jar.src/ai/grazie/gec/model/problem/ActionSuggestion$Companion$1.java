/*   */ package ai.grazie.gec.model.problem;
/*   */ import kotlin.jvm.internal.Reflection;
/*   */ import kotlin.reflect.KClass;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*   */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*   */   public final KSerializer<Object> invoke() {
/* 9 */     KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ActionSuggestion.ChangeParameter.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ActionSuggestion.Shorten.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)ActionSuggestion.ChangeParameter.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)new ObjectSerializer("Shorten", ActionSuggestion.Shorten.INSTANCE, new java.lang.annotation.Annotation[0]); return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.gec.model.problem.ActionSuggestion", Reflection.getOrCreateKotlinClass(ActionSuggestion.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*   */   }
/*   */   
/*   */   public static final null INSTANCE = (null)new Object();
/*   */   
/*   */   null() {
/*   */     super(0);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ActionSuggestion$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */