/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEventSerializable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @SerialName("TaskResultCreatedEvent")
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0262\0020\001:\002\025\026B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B%\b\020\022\006\020\006\032\0020\007\022\b\020\002\032\004\030\0010\003\022\b\020\b\032\004\030\0010\t¢\006\004\b\004\020\nJ%\020\r\032\0020\0162\006\020\017\032\0020\0002\006\020\020\032\0020\0212\006\020\022\032\0020\023H\001¢\006\002\b\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\f¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResultCreatedEvent;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEventSerializable;", "taskResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTaskResult", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class TaskResultCreatedEvent implements CustomArtifactEventSerializable {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   @NotNull
/* 24 */   public SerializableEvent toSerializable() { return CustomArtifactEventSerializable.DefaultImpls.toSerializable(this); } @NotNull private final TaskResult taskResult; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResultCreatedEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResultCreatedEvent;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskResultCreatedEvent> serializer() { return (KSerializer<TaskResultCreatedEvent>)TaskResultCreatedEvent.$serializer.INSTANCE; } }
/*    */   @NotNull
/* 26 */   public final TaskResult getTaskResult() { return this.taskResult; } public TaskResultCreatedEvent(@NotNull TaskResult taskResult) { this.taskResult = taskResult; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\TaskResultCreatedEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */