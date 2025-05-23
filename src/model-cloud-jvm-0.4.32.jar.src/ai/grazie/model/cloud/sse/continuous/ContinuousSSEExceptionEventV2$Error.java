/*    */ package ai.grazie.model.cloud.sse.continuous;
/*    */ 
/*    */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("Error")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\030\002\n\000\n\002\020\003\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 !2\0020\001:\002 !B\017\b\027\022\006\020\002\032\0020\003¢\006\002\020\004B;\b\021\022\006\020\005\032\0020\006\022\n\b\001\020\007\032\004\030\0010\b\022\n\b\001\020\t\032\004\030\0010\n\022\b\020\013\032\004\030\0010\b\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B\017\022\b\b\002\020\007\032\0020\b¢\006\002\020\017J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\034\020\007\032\0020\b8\006X\004¢\006\016\n\000\022\004\b\020\020\021\032\004\b\022\020\023R\024\020\013\032\0020\bX\004¢\006\b\n\000\032\004\b\024\020\023R\034\020\t\032\0020\n8\026X\004¢\006\016\n\000\022\004\b\025\020\021\032\004\b\026\020\027¨\006\""}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2;", "error", "", "(Ljava/lang/Throwable;)V", "seen1", "", "errorMessage", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "message", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getErrorMessage$annotations", "()V", "getErrorMessage", "()Ljava/lang/String;", "getMessage", "getType$annotations", "getType", "()Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_cloud", "$serializer", "Companion", "model-cloud"})
/*    */ public final class Error
/*    */   extends ContinuousSSEExceptionEventV2
/*    */ {
/*    */   @NotNull
/*    */   private final String errorMessage;
/*    */   @NotNull
/*    */   private final ContinuousSSEEventType type;
/*    */   @NotNull
/* 52 */   public static final Companion Companion = new Companion(null); @NotNull private final String message; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2.Error.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-cloud"}) public static final class $serializer implements GeneratedSerializer<Error> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])ContinuousSSEExceptionEventV2.Error.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public ContinuousSSEExceptionEventV2.Error deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; ContinuousSSEEventType continuousSSEEventType = null; String str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])ContinuousSSEExceptionEventV2.Error.$childSerializers; if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], continuousSSEEventType); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], continuousSSEEventType); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ContinuousSSEExceptionEventV2.Error(i, str1, continuousSSEEventType, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull ContinuousSSEExceptionEventV2.Error value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ContinuousSSEExceptionEventV2.Error.write$Self$model_cloud(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Error", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("error_message", true); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("message", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/sse/continuous/ContinuousSSEExceptionEventV2$Error;", "model-cloud"}) public static final class Companion { @NotNull public final KSerializer<ContinuousSSEExceptionEventV2.Error> serializer() { return (KSerializer<ContinuousSSEExceptionEventV2.Error>)ContinuousSSEExceptionEventV2.Error.$serializer.INSTANCE; }
/*    */      private Companion() {} }
/*    */   @NotNull
/*    */   public final String getErrorMessage() {
/* 56 */     return this.errorMessage; }
/* 57 */   public Error(@NotNull String errorMessage) { super(null);
/*    */ 
/*    */     
/*    */     this.errorMessage = errorMessage;
/*    */ 
/*    */     
/* 63 */     this.type = ContinuousSSEEventType.Error;
/* 64 */     this.message = "Error while polling sse: " + this.errorMessage; } public Error(@NotNull Throwable error) { super(error.toString()); } @NotNull public String getMessage() { return this.message; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ContinuousSSEEventType getType() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   public Error() {
/*    */     this(null, 1, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\ContinuousSSEExceptionEventV2$Error.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */