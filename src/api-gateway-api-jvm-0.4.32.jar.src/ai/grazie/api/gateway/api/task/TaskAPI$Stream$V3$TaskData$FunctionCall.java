/*     */ package ai.grazie.api.gateway.api.task;
/*     */ 
/*     */ import ai.grazie.model.cloud.sse.continuous.events.type.ContinuousSSEEventType;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.EncodeDefault;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @SerialName("FunctionCallMetadata")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B9\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\031\022\n\b\002\020\006\032\004\030\0010\007\022\006\020\b\032\0020\007¢\006\002\020\fJ\013\020\020\032\004\030\0010\007HÆ\003J\t\020\021\032\0020\007HÆ\003J\037\020\022\032\0020\0002\n\b\002\020\006\032\004\030\0010\0072\b\b\002\020\b\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\007HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\024\020\b\032\0020\007X\004¢\006\b\n\000\032\004\b\r\020\016R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\017\020\016¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData;", "seen1", "", "type", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;", "name", "", "content", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEEventType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*     */ public final class FunctionCall
/*     */   extends TaskAPI.Stream.V3.TaskData
/*     */ {
/*     */   @NotNull
/* 121 */   public static final Companion Companion = new Companion(null); @Nullable private final String name; @NotNull private final String content; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof FunctionCall)) return false;  FunctionCall functionCall = (FunctionCall)other; return !Intrinsics.areEqual(this.name, functionCall.name) ? false : (!!Intrinsics.areEqual(this.content, functionCall.content)); } public int hashCode() { result = (this.name == null) ? 0 : this.name.hashCode(); return result * 31 + this.content.hashCode(); } @NotNull public String toString() { return "FunctionCall(name=" + this.name + ", content=" + this.content + ")"; } static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = ContinuousSSEEventType.Companion.serializer(); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public final FunctionCall copy(@Nullable String name, @NotNull String content) { Intrinsics.checkNotNullParameter(content, "content"); return new FunctionCall(name, content); } @NotNull public final String component2() { return this.content; } @Nullable public final String component1() { return this.name; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.TaskData.FunctionCall.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<FunctionCall> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TaskAPI.Stream.V3.TaskData.FunctionCall.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TaskAPI.Stream.V3.TaskData.FunctionCall deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ContinuousSSEEventType continuousSSEEventType = null; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TaskAPI.Stream.V3.TaskData.FunctionCall.$childSerializers; if (compositeDecoder.decodeSequentially()) { continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: continuousSSEEventType = (ContinuousSSEEventType)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], continuousSSEEventType); i |= 0x1; continue;case 1: str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.TaskData.FunctionCall(i, continuousSSEEventType, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.TaskData.FunctionCall value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.TaskData.FunctionCall.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FunctionCallMetadata", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("event_type", true); pluginGeneratedSerialDescriptor.addElement("name", true); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$TaskData$FunctionCall;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.TaskData.FunctionCall> serializer() { return (KSerializer<TaskAPI.Stream.V3.TaskData.FunctionCall>)TaskAPI.Stream.V3.TaskData.FunctionCall.$serializer.INSTANCE; } }
/*     */   @NotNull
/* 123 */   public String getContent() { return this.content; } @Nullable public final String getName() { return this.name; } public FunctionCall(@Nullable String name, @NotNull String content) { super(null); this.name = name; this.content = content; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\task\TaskAPI$Stream$V3$TaskData$FunctionCall.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */