/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2Serializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEventSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2;", "()V", "model-cloud"})
/*    */ public final class ContinuousSSEExceptionEventV2Serializer extends ContinuousSSEEventSerializer<ContinuousSSEExceptionEventV2> {
/*    */   private ContinuousSSEExceptionEventV2Serializer() {
/*  9 */     super(Reflection.getOrCreateKotlinClass(ContinuousSSEExceptionEventV2.class), 
/*    */         
/* 11 */         ContinuousSSEExceptionEventV2.Companion.serializer(), 
/* 12 */         (KSerializer)ContinuousSSEExceptionEventV2.Error.Companion.serializer());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ContinuousSSEExceptionEventV2Serializer INSTANCE = new ContinuousSSEExceptionEventV2Serializer();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEExceptionEventV2Serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */