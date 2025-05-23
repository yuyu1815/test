/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
/*    */ import ai.grazie.model.task.exec.TaskParameters;
/*    */ import ai.grazie.model.task.id.TaskID;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
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
/*    */ @Deprecated(message = "JBAI-8430 in favour of `TasksChatTaskMessageV2`")
/*    */ @Serializable
/*    */ @SerialName("task_message")
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000T\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\rJ\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\007HÆ\003J\035\020\026\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\032HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\035HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\022\020\023¨\006("}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatTaskMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "seen1", "", "id", "Lai/grazie/model/task/id/TaskID;", "parameters", "Lai/grazie/model/task/exec/TaskParameters;", "role", "Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;Lai/grazie/model/task/library/v2/chat/TasksChatRole;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/task/id/TaskID;Lai/grazie/model/task/exec/TaskParameters;)V", "getId", "()Lai/grazie/model/task/id/TaskID;", "getParameters", "()Lai/grazie/model/task/exec/TaskParameters;", "getRole", "()Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*    */ public final class TasksChatTaskMessage
/*    */   extends TasksChatMessage
/*    */ {
/*    */   @NotNull
/*    */   private final TaskID id;
/*    */   @NotNull
/*    */   private final TaskParameters parameters;
/*    */   @NotNull
/* 88 */   public static final Companion Companion = new Companion(null); @NotNull private final TasksChatRole role; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = TasksChatRole.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/v2/chat/TasksChatTaskMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"}) public static final class $serializer implements GeneratedSerializer<TasksChatTaskMessage> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TasksChatTaskMessage.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)TaskID.Serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)TaskParameters.Serializer.INSTANCE; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TasksChatTaskMessage deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TaskID taskID = null; TaskParameters taskParameters = null; TasksChatRole tasksChatRole = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TasksChatTaskMessage.$childSerializers; if (compositeDecoder.decodeSequentially()) { taskID = (TaskID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskID.Serializer.INSTANCE, taskID); i |= 0x1; taskParameters = (TaskParameters)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskParameters.Serializer.INSTANCE, taskParameters); i |= 0x2; tasksChatRole = (TasksChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], tasksChatRole); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: taskID = (TaskID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TaskID.Serializer.INSTANCE, taskID); i |= 0x1; continue;case 1: taskParameters = (TaskParameters)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskParameters.Serializer.INSTANCE, taskParameters); i |= 0x2; continue;case 2: tasksChatRole = (TasksChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], tasksChatRole); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TasksChatTaskMessage(i, taskID, taskParameters, tasksChatRole, null); } public void serialize(@NotNull Encoder encoder, @NotNull TasksChatTaskMessage value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TasksChatTaskMessage.write$Self$model_task(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("task_message", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("parameters", false); pluginGeneratedSerialDescriptor.addElement("role", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatTaskMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskMessage;", "model-task"}) public static final class Companion { @NotNull public final KSerializer<TasksChatTaskMessage> serializer() { return (KSerializer<TasksChatTaskMessage>)TasksChatTaskMessage.$serializer.INSTANCE; }
/*    */     
/*    */     private Companion() {} }
/*    */   public TasksChatTaskMessage(@NotNull TaskID id, @NotNull TaskParameters parameters) {
/* 92 */     super(null); this.id = id; this.parameters = parameters;
/* 93 */     this.role = TasksChatRole.Task; } @NotNull public final TaskID getId() { return this.id; } @NotNull public TasksChatRole getRole() { return this.role; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskParameters getParameters() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskParameters component2() {
/*    */     return this.parameters;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TasksChatTaskMessage copy(@NotNull TaskID id, @NotNull TaskParameters parameters) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*    */     return new TasksChatTaskMessage(id, parameters);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TasksChatTaskMessage(id=" + this.id + ", parameters=" + this.parameters + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     return result * 31 + this.parameters.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TasksChatTaskMessage))
/*    */       return false; 
/*    */     TasksChatTaskMessage tasksChatTaskMessage = (TasksChatTaskMessage)other;
/*    */     return !Intrinsics.areEqual(this.id, tasksChatTaskMessage.id) ? false : (!!Intrinsics.areEqual(this.parameters, tasksChatTaskMessage.parameters));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatTaskMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */