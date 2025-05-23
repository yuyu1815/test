/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*    */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEPrematureEnd;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.EncodeDefault;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("PrematureEnd")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\013\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0372\0020\001:\002\036\037B9\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\r\022\006\020\004\032\0020\005¢\006\002\020\rJ&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\034\020\006\032\0020\0078\026X\004¢\006\016\n\000\022\004\b\022\020\023\032\004\b\024\020\025¨\006 "}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2;", "seen1", "", "reason", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "message", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;)V", "getMessage", "()Ljava/lang/String;", "getReason", "()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "getType$annotations", "()V", "getType", "()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_cloud", "$serializer", "Companion", "model-cloud"})
/*    */ public final class PrematureEnd
/*    */   extends ContinuousSSEExceptionEventV2
/*    */ {
/*    */   @NotNull
/*    */   private final ContinuousSSEPrematureEnd reason;
/*    */   @NotNull
/*    */   private final ContinuousSSEEventType type;
/*    */   @NotNull
/* 43 */   public static final Companion Companion = new Companion(null); @NotNull private final String message; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2.PrematureEnd.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-cloud"}) public static final class $serializer implements GeneratedSerializer<PrematureEnd> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])ContinuousSSEExceptionEventV2.PrematureEnd.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)ContinuousSSEPrematureEnd.Serializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public ContinuousSSEExceptionEventV2.PrematureEnd deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEPrematureEnd continuousSSEPrematureEnd = null; ContinuousSSEEventType continuousSSEEventType = null; String str = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])ContinuousSSEExceptionEventV2.PrematureEnd.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEPrematureEnd = (ContinuousSSEPrematureEnd)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ContinuousSSEPrematureEnd.Serializer.INSTANCE, continuousSSEPrematureEnd); i |= 0x1; continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], continuousSSEEventType); i |= 0x2; str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEPrematureEnd = (ContinuousSSEPrematureEnd)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ContinuousSSEPrematureEnd.Serializer.INSTANCE, continuousSSEPrematureEnd); i |= 0x1; continue;case 1: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], continuousSSEEventType); i |= 0x2; continue;case 2: str = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ContinuousSSEExceptionEventV2.PrematureEnd(i, continuousSSEPrematureEnd, continuousSSEEventType, str, null); } public void serialize(@NotNull Encoder encoder, @NotNull ContinuousSSEExceptionEventV2.PrematureEnd value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ContinuousSSEExceptionEventV2.PrematureEnd.write$Self$model_cloud(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PrematureEnd", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("reason", false); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("message", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$PrematureEnd;", "model-cloud"}) public static final class Companion { @NotNull public final KSerializer<ContinuousSSEExceptionEventV2.PrematureEnd> serializer() { return (KSerializer<ContinuousSSEExceptionEventV2.PrematureEnd>)ContinuousSSEExceptionEventV2.PrematureEnd.$serializer.INSTANCE; }
/*    */      private Companion() {} } public PrematureEnd(@NotNull ContinuousSSEPrematureEnd reason) {
/* 45 */     super(null); this.reason = reason;
/*    */ 
/*    */     
/* 48 */     this.type = ContinuousSSEEventType.PrematureEnd;
/* 49 */     this.message = "Premature end reason: " + this.reason.name(); } @NotNull public final ContinuousSSEPrematureEnd getReason() { return this.reason; } @NotNull public String getMessage() { return this.message; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ContinuousSSEEventType getType() {
/*    */     return this.type;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEExceptionEventV2$PrematureEnd.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */