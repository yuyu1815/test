/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ 
/*    */ import java.util.List;
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
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \0362\0020\001:\002\035\036B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006B+\b\020\022\006\020\007\032\0020\b\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\b\020\t\032\004\030\0010\n¢\006\004\b\005\020\013J\017\020\016\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\017\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\bHÖ\001J\t\020\024\032\0020\004HÖ\001J%\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033H\001¢\006\002\b\034R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\f\020\r¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainSummary;", "", "taskSummaries", "", "", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTaskSummaries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class TaskChainSummary
/*    */ {
/*    */   @NotNull
/* 38 */   public static final Companion Companion = new Companion(null); @NotNull private final List<String> taskSummaries; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainSummary$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainSummary;", "ej-core"}) public static final class Companion { @NotNull public final KSerializer<TaskChainSummary> serializer() { return (KSerializer<TaskChainSummary>)TaskChainSummary.$serializer.INSTANCE; }
/*    */      private Companion() {} }
/*    */   public TaskChainSummary(@NotNull List<String> taskSummaries) {
/* 41 */     this.taskSummaries = taskSummaries; } @NotNull public final List<String> getTaskSummaries() { return this.taskSummaries; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component1() {
/*    */     return this.taskSummaries;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskChainSummary copy(@NotNull List<String> taskSummaries) {
/*    */     Intrinsics.checkNotNullParameter(taskSummaries, "taskSummaries");
/*    */     return new TaskChainSummary(taskSummaries);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TaskChainSummary(taskSummaries=" + this.taskSummaries + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.taskSummaries.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskChainSummary))
/*    */       return false; 
/*    */     TaskChainSummary taskChainSummary = (TaskChainSummary)other;
/*    */     return !!Intrinsics.areEqual(this.taskSummaries, taskChainSummary.taskSummaries);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskChainSummary.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */