/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b'\030\000 \0242\0020\001:\001\024B%\b\027\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\005¢\006\002\020\tJ!\020\r\032\0020\0162\006\020\017\032\0020\0002\006\020\020\032\0020\0212\006\020\022\032\0020\023HÇ\001R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\n\020\t\032\004\b\013\020\f¨\006\025å\b\004"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/Data;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getType$annotations", "getType", "()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "model-cloud"})
/*    */ public abstract class Data implements ContinuousSSEEvent {
/*    */   @NotNull
/* 10 */   public static final Companion Companion = new Companion(null); @NotNull private final ContinuousSSEEventType type; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*    */ 
/*    */   
/*    */   public Data()
/*    */   {
/* 15 */     this.type = ContinuousSSEEventType.Data; } static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final ContinuousSSEEventType getType() { return this.type; }
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
/*    */       return (KSerializer<Object>)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass(Data.class), new java.lang.annotation.Annotation[0]);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/Data$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/sse/continuous/Data;", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Data> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\Data.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */