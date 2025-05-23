/*    */ package ai.grazie.license;
/*    */ 
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */   public final KSerializer<Object> invoke() {
/* 15 */     KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(LicenseAgreementInfo.Base.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(LicenseAgreementInfo.Extended.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)LicenseAgreementInfo.Base.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)LicenseAgreementInfo.Extended.$serializer.INSTANCE; Annotation[] arrayOfAnnotation = new Annotation[1]; arrayOfAnnotation[0] = 
/* 16 */       (Annotation)new LicenseAgreementInfo$Base$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("_type");
/*    */     return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.license.LicenseAgreementInfo", Reflection.getOrCreateKotlinClass(LicenseAgreementInfo.class), arrayOfKClass, arrayOfKSerializer, arrayOfAnnotation);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\LicenseAgreementInfo$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */