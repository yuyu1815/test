/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.PolymorphicSerializer;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */ final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */   public final KSerializer<Object> invoke() {
/* 10 */     return (KSerializer<Object>)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Data.class), new java.lang.annotation.Annotation[0]);
/*    */   }
/*    */   
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\Data$Companion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */