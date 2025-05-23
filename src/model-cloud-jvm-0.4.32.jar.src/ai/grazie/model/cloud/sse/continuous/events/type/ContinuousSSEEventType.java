/*    */ package ai.grazie.model.cloud.sse.continuous.events.type;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\b\b\001\030\000 \b2\b\022\004\022\0020\0000\001:\001\bB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007¨\006\t"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "", "(Ljava/lang/String;I)V", "Data", "Timeout", "Cancel", "PrematureEnd", "Error", "Companion", "model-cloud"})
/*    */ public enum ContinuousSSEEventType {
/* 10 */   Data,
/*    */ 
/*    */   
/* 13 */   Timeout,
/*    */ 
/*    */   
/* 16 */   Cancel,
/*    */ 
/*    */   
/* 19 */   PrematureEnd,
/*    */ 
/*    */   
/* 22 */   Error; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       String[] arrayOfString = new String[5];
/*    */       arrayOfString[0] = "data";
/*    */       arrayOfString[1] = "timeout";
/*    */       arrayOfString[2] = "cancel";
/*    */       arrayOfString[3] = "premature_end";
/*    */       arrayOfString[4] = "error";
/*    */       Annotation[][] arrayOfAnnotation = new Annotation[5][];
/*    */       arrayOfAnnotation[0] = null;
/*    */       arrayOfAnnotation[1] = null;
/*    */       arrayOfAnnotation[2] = null;
/*    */       arrayOfAnnotation[3] = null;
/*    */       arrayOfAnnotation[4] = null;
/*    */       return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType", (Enum[])ContinuousSSEEventType.values(), arrayOfString, arrayOfAnnotation, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ContinuousSSEEventType> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\events\type\ContinuousSSEEventType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */