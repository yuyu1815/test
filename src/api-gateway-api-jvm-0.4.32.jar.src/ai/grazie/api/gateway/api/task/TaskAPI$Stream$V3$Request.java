/*    */ package ai.grazie.api.gateway.api.task;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.data.DataHolder;
/*    */ import ai.grazie.utils.data.DataHolderSerializer;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
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
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\030HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request;", "", "seen1", "", "task", "Lai/grazie/model/task/id/TaskName;", "parameters", "Lai/grazie/utils/data/DataHolder;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/task/id/TaskName;Lai/grazie/utils/data/DataHolder;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/task/id/TaskName;Lai/grazie/utils/data/DataHolder;)V", "getParameters", "()Lai/grazie/utils/data/DataHolder;", "getTask", "()Lai/grazie/model/task/id/TaskName;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$api_gateway_api", "$serializer", "Companion", "api-gateway-api"})
/*    */ public final class Request
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final TaskName task;
/*    */   
/*    */   public Request(@NotNull TaskName task, @NotNull DataHolder parameters) {
/* 93 */     this.task = task; this.parameters = parameters; } @NotNull private final DataHolder parameters; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/api/gateway/api/task/TaskAPI.Stream.V3.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "api-gateway-api"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)TaskName.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)DataHolderSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public TaskAPI.Stream.V3.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TaskName taskName = null; DataHolder dataHolder = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x1; dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x1; continue;case 1: dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TaskAPI.Stream.V3.Request(i, taskName, dataHolder, null); } public void serialize(@NotNull Encoder encoder, @NotNull TaskAPI.Stream.V3.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TaskAPI.Stream.V3.Request.write$Self$api_gateway_api(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.api.gateway.api.task.TaskAPI.Stream.V3.Request", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("task", false); pluginGeneratedSerialDescriptor.addElement("parameters", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/api/gateway/api/task/TaskAPI$Stream$V3$Request;", "api-gateway-api"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskAPI.Stream.V3.Request> serializer() { return (KSerializer<TaskAPI.Stream.V3.Request>)TaskAPI.Stream.V3.Request.$serializer.INSTANCE; } } @NotNull public final TaskName getTask() { return this.task; } @NotNull public final DataHolder getParameters() { return this.parameters; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskName component1() {
/*    */     return this.task;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DataHolder component2() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull TaskName task, @NotNull DataHolder parameters) {
/*    */     Intrinsics.checkNotNullParameter(task, "task");
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     return new Request(task, parameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(task=" + this.task + ", parameters=" + this.parameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.task.hashCode();
/*    */     return result * 31 + this.parameters.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.task, request.task) ? false : (!!Intrinsics.areEqual(this.parameters, request.parameters));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\task\TaskAPI$Stream$V3$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */