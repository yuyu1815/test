/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult$;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
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
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \035*\004\b\000\020\0012\0020\002:\002\034\035B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0028\000¢\006\004\b\006\020\007B/\b\020\022\006\020\b\032\0020\t\022\b\020\003\032\004\030\0010\004\022\b\020\005\032\004\030\0018\000\022\b\020\n\032\004\030\0010\013¢\006\004\b\006\020\fJE\020\022\032\0020\023\"\n\b\001\020\001*\004\030\0010\0022\f\020\024\032\b\022\004\022\002H\0010\0002\006\020\025\032\0020\0262\006\020\027\032\0020\0302\f\020\031\032\b\022\004\022\002H\0010\032H\001¢\006\002\b\033R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\r\020\016R\023\020\005\032\0028\000¢\006\n\n\002\020\021\032\004\b\017\020\020¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Test;", "OutputData", "", "taskResult", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "data", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;Ljava/lang/Object;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;Ljava/lang/Object;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTaskResult", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class Test<OutputData> {
/*    */   @NotNull
/*    */   private final TaskResult taskResult;
/*    */   private final OutputData data;
/*    */   @NotNull
/* 33 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final SerialDescriptor $cachedDescriptor; static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.intellij.ml.llm.matterhorn.ej.core.Test", null, 2); pluginGeneratedSerialDescriptor.addElement("taskResult", false); pluginGeneratedSerialDescriptor.addElement("data", false); $cachedDescriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J&\020\004\032\016\022\n\022\b\022\004\022\002H\0070\0060\005\"\004\b\001\020\0072\f\020\b\032\b\022\004\022\002H\0070\005¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/Test$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/Test;", "OutputData", "typeSerial0", "ej-core"}) public static final class Companion { @NotNull public final <OutputData> KSerializer<Test<OutputData>> serializer(@NotNull KSerializer<?> typeSerial0) { Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<Test<OutputData>>)new Test.$serializer(); } private Companion() {} } public final OutputData getData() {
/* 34 */     return this.data; } @NotNull public final TaskResult getTaskResult() { return this.taskResult; } public Test(@NotNull TaskResult taskResult, Object data) { this.taskResult = taskResult; this.data = (OutputData)data; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\Test.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */