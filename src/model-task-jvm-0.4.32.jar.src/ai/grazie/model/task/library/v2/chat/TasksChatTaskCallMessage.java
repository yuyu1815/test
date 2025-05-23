/*     */ package ai.grazie.model.task.library.v2.chat;
/*     */ 
/*     */ import ai.grazie.model.task.id.TaskName;
/*     */ import ai.grazie.model.task.id.TaskTag;
/*     */ import ai.grazie.utils.data.DataHolder;
/*     */ import ai.grazie.utils.data.DataHolderSerializer;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*     */ @Serializable
/*     */ @SerialName("task_call_message")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\017\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B\037\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J'\020\033\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\034\032\0020\0352\b\020\036\032\004\030\0010\037HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\"HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\026\020\027¨\006-"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "seen1", "", "parameters", "Lai/grazie/utils/data/DataHolder;", "taskName", "Lai/grazie/model/task/id/TaskName;", "taskTag", "Lai/grazie/model/task/id/TaskTag;", "role", "Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/data/DataHolder;Lai/grazie/model/task/id/TaskName;Lai/grazie/model/task/id/TaskTag;Lai/grazie/model/task/library/v2/chat/TasksChatRole;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/data/DataHolder;Lai/grazie/model/task/id/TaskName;Lai/grazie/model/task/id/TaskTag;)V", "getParameters", "()Lai/grazie/utils/data/DataHolder;", "getRole", "()Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "getTaskName", "()Lai/grazie/model/task/id/TaskName;", "getTaskTag", "()Lai/grazie/model/task/id/TaskTag;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*     */ public final class TasksChatTaskCallMessage
/*     */   extends TasksChatMessage
/*     */ {
/*     */   @NotNull
/*     */   private final DataHolder parameters;
/*     */   @NotNull
/*     */   private final TaskName taskName;
/*     */   @NotNull
/*     */   private final TaskTag taskTag;
/*     */   @NotNull
/* 104 */   public static final Companion Companion = new Companion(null); @NotNull private final TasksChatRole role; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = TasksChatRole.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"}) public static final class $serializer implements GeneratedSerializer<TasksChatTaskCallMessage> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TasksChatTaskCallMessage.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)DataHolderSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)TaskName.Serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)TaskTag.Serializer.INSTANCE; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TasksChatTaskCallMessage deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; DataHolder dataHolder = null; TaskName taskName = null; TaskTag taskTag = null; TasksChatRole tasksChatRole = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TasksChatTaskCallMessage.$childSerializers; if (compositeDecoder.decodeSequentially()) { dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x1; taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x2; taskTag = (TaskTag)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TaskTag.Serializer.INSTANCE, taskTag); i |= 0x4; tasksChatRole = (TasksChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], tasksChatRole); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x1; continue;case 1: taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x2; continue;case 2: taskTag = (TaskTag)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TaskTag.Serializer.INSTANCE, taskTag); i |= 0x4; continue;case 3: tasksChatRole = (TasksChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], tasksChatRole); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TasksChatTaskCallMessage(i, dataHolder, taskName, taskTag, tasksChatRole, null); } public void serialize(@NotNull Encoder encoder, @NotNull TasksChatTaskCallMessage value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TasksChatTaskCallMessage.write$Self$model_task(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("task_call_message", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("parameters", false); pluginGeneratedSerialDescriptor.addElement("taskName", false); pluginGeneratedSerialDescriptor.addElement("taskTag", true); pluginGeneratedSerialDescriptor.addElement("role", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage;", "model-task"}) public static final class Companion { @NotNull public final KSerializer<TasksChatTaskCallMessage> serializer() { return (KSerializer<TasksChatTaskCallMessage>)TasksChatTaskCallMessage.$serializer.INSTANCE; }
/*     */      private Companion() {} }
/*     */   @NotNull
/*     */   public final DataHolder getParameters() {
/* 108 */     return this.parameters; } @NotNull
/* 109 */   public final TaskName getTaskName() { return this.taskName; } @NotNull
/* 110 */   public final TaskTag getTaskTag() { return this.taskTag; }
/* 111 */   public TasksChatTaskCallMessage(@NotNull DataHolder parameters, @NotNull TaskName taskName, @NotNull TaskTag taskTag) { super(null); this.parameters = parameters; this.taskName = taskName; this.taskTag = taskTag;
/* 112 */     this.role = TasksChatRole.TaskCall; } @NotNull public TasksChatRole getRole() { return this.role; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final DataHolder component1() {
/*     */     return this.parameters;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TaskName component2() {
/*     */     return this.taskName;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TaskTag component3() {
/*     */     return this.taskTag;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TasksChatTaskCallMessage copy(@NotNull DataHolder parameters, @NotNull TaskName taskName, @NotNull TaskTag taskTag) {
/*     */     Intrinsics.checkNotNullParameter(parameters, "parameters");
/*     */     Intrinsics.checkNotNullParameter(taskName, "taskName");
/*     */     Intrinsics.checkNotNullParameter(taskTag, "taskTag");
/*     */     return new TasksChatTaskCallMessage(parameters, taskName, taskTag);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TasksChatTaskCallMessage(parameters=" + this.parameters + ", taskName=" + this.taskName + ", taskTag=" + this.taskTag + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.parameters.hashCode();
/*     */     result = result * 31 + this.taskName.hashCode();
/*     */     return result * 31 + this.taskTag.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof TasksChatTaskCallMessage))
/*     */       return false; 
/*     */     TasksChatTaskCallMessage tasksChatTaskCallMessage = (TasksChatTaskCallMessage)other;
/*     */     return !Intrinsics.areEqual(this.parameters, tasksChatTaskCallMessage.parameters) ? false : (!Intrinsics.areEqual(this.taskName, tasksChatTaskCallMessage.taskName) ? false : (!!Intrinsics.areEqual(this.taskTag, tasksChatTaskCallMessage.taskTag)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatTaskCallMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */