/*    */ package ai.grazie.license;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */   public final KSerializer<Object> invoke() {
/* 10 */     KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(CustomAppLicense.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(DataloreLicense.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(IDESLicense.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(JBALicense.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(LicenseServerLicense.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(YTLicense.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)CustomAppLicense.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)DataloreLicense.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)IDESLicense.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)JBALicense.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)LicenseServerLicense.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)YTLicense.$serializer.INSTANCE; Annotation[] arrayOfAnnotation = new Annotation[1]; arrayOfAnnotation[0] = 
/* 11 */       (Annotation)new License$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type");
/*    */     return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.license.License", Reflection.getOrCreateKotlinClass(License.class), arrayOfKClass, arrayOfKSerializer, arrayOfAnnotation);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\License$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */