/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\026\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B1\022\f\020\004\032\b\022\004\022\0028\0000\005\022\f\020\006\032\b\022\004\022\0028\0000\007\022\016\020\b\032\n\022\006\b\001\022\0028\0000\007¢\006\002\020\tJ\"\020\021\032\n\022\006\b\001\022\0028\0000\0222\006\020\023\032\0020\0242\b\020\025\032\004\030\0010\026H\026J#\020\021\032\b\022\004\022\0028\0000\0272\006\020\030\032\0020\0312\006\020\032\032\0028\000H\026¢\006\002\020\033R\032\020\004\032\b\022\004\022\0028\0000\005X\004¢\006\b\n\000\032\004\b\n\020\013R\026\020\b\032\n\022\006\b\001\022\0028\0000\007X\004¢\006\002\n\000R\024\020\f\032\b\022\004\022\0028\0000\003X\004¢\006\002\n\000R\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020¨\006\034"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEventSerializer;", "T", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "baseClass", "Lkotlin/reflect/KClass;", "baseSerializer", "Lkotlinx/serialization/KSerializer;", "defaultSerializer", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "getBaseClass", "()Lkotlin/reflect/KClass;", "delegate", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/DeserializationStrategy;", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "klassName", "", "Lkotlinx/serialization/SerializationStrategy;", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Lai/grazie/model/cloud/sse/continuous/ContinuousSSEEvent;)Lkotlinx/serialization/SerializationStrategy;", "model-cloud"})
/*    */ public class ContinuousSSEEventSerializer<T extends ContinuousSSEEvent> extends AbstractPolymorphicSerializer<T> {
/*    */   @NotNull
/*    */   private final KClass<T> baseClass;
/*    */   @NotNull
/*    */   private final KSerializer<? extends T> defaultSerializer;
/*    */   
/*    */   @NotNull
/* 12 */   public KClass<T> getBaseClass() { return this.baseClass; } @NotNull private final AbstractPolymorphicSerializer<T> delegate; @NotNull private final SerialDescriptor descriptor; public ContinuousSSEEventSerializer(@NotNull KClass<T> baseClass, @NotNull KSerializer baseSerializer, @NotNull KSerializer<? extends T> defaultSerializer) { this.baseClass = baseClass;
/*    */     
/* 14 */     this.defaultSerializer = defaultSerializer;
/*    */     
/* 16 */     this.delegate = (AbstractPolymorphicSerializer<T>)baseSerializer;
/* 17 */     this.descriptor = this.delegate.getDescriptor(); } @NotNull public SerialDescriptor getDescriptor() { return this.descriptor; } @NotNull
/*    */   public DeserializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
/* 19 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); if (this.delegate.findPolymorphicSerializerOrNull(decoder, klassName) == null) this.delegate.findPolymorphicSerializerOrNull(decoder, klassName);  return (DeserializationStrategy)this.defaultSerializer;
/*    */   }
/*    */   @NotNull
/*    */   public SerializationStrategy<T> findPolymorphicSerializerOrNull(@NotNull Encoder encoder, @NotNull ContinuousSSEEvent value) {
/* 23 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); if (this.delegate.findPolymorphicSerializerOrNull(encoder, value) == null) { this.delegate.findPolymorphicSerializerOrNull(encoder, value); Intrinsics.checkNotNull(this.defaultSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of ai.grazie.model.cloud.sse.continuous.ContinuousSSEEventSerializer>"); }  return (SerializationStrategy)this.defaultSerializer;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEEventSerializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */