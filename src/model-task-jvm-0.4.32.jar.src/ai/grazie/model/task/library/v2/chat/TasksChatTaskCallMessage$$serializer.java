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
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*     */ public final class $serializer
/*     */   implements GeneratedSerializer<TasksChatTaskCallMessage>
/*     */ {
/*     */   @NotNull
/* 104 */   public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = TasksChatTaskCallMessage.access$get$childSerializers$cp(), arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)DataHolderSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)TaskName.Serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)TaskTag.Serializer.INSTANCE; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TasksChatTaskCallMessage deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; DataHolder dataHolder = null; TaskName taskName = null; TaskTag taskTag = null; TasksChatRole tasksChatRole = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = TasksChatTaskCallMessage.access$get$childSerializers$cp(); if (compositeDecoder.decodeSequentially()) { dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x1; taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x2; taskTag = (TaskTag)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TaskTag.Serializer.INSTANCE, taskTag); i |= 0x4; tasksChatRole = (TasksChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], tasksChatRole); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: dataHolder = (DataHolder)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)DataHolderSerializer.INSTANCE, dataHolder); i |= 0x1; continue;case 1: taskName = (TaskName)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TaskName.Serializer.INSTANCE, taskName); i |= 0x2; continue;case 2: taskTag = (TaskTag)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)TaskTag.Serializer.INSTANCE, taskTag); i |= 0x4; continue;case 3: tasksChatRole = (TasksChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], tasksChatRole); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TasksChatTaskCallMessage(i, dataHolder, taskName, taskTag, tasksChatRole, null); } public void serialize(@NotNull Encoder encoder, @NotNull TasksChatTaskCallMessage value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TasksChatTaskCallMessage.write$Self$model_task(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("task_call_message", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("parameters", false); pluginGeneratedSerialDescriptor.addElement("taskName", false); pluginGeneratedSerialDescriptor.addElement("taskTag", true); pluginGeneratedSerialDescriptor.addElement("role", true); descriptor = pluginGeneratedSerialDescriptor; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatTaskCallMessage$$serializer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */