/*    */ package com.intellij.ml.llm.matterhorn.ej.core.critique;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentIssue$;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult$;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bB5\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ\t\020\022\032\0020\003HÆ\003J\017\020\023\032\b\022\004\022\0020\0060\005HÆ\003J#\020\024\032\0020\0002\b\b\002\020\002\032\0020\0032\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001J\023\020\025\032\0020\0262\b\020\027\032\004\030\0010\001HÖ\003J\t\020\030\032\0020\nHÖ\001J\t\020\031\032\0020\032HÖ\001J%\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!H\001¢\006\002\b\"R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\016\020\017R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\021¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput;", "", "issue", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "reportsToRank", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIssue", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "getReportsToRank", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class TaskReportCritiqueInput
/*    */ {
/*    */   @NotNull
/* 54 */   public static final Companion Companion = new Companion(null); @NotNull private final AgentIssue issue; @NotNull private final List<TaskResult> reportsToRank; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)TaskResult$.serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TaskReportCritiqueInput)) return false;  TaskReportCritiqueInput taskReportCritiqueInput = (TaskReportCritiqueInput)other; return !Intrinsics.areEqual(this.issue, taskReportCritiqueInput.issue) ? false : (!!Intrinsics.areEqual(this.reportsToRank, taskReportCritiqueInput.reportsToRank)); } public int hashCode() { result = this.issue.hashCode(); return result * 31 + this.reportsToRank.hashCode(); } @NotNull public String toString() { return "TaskReportCritiqueInput(issue=" + this.issue + ", reportsToRank=" + this.reportsToRank + ")"; } @NotNull public final TaskReportCritiqueInput copy(@NotNull AgentIssue issue, @NotNull List<TaskResult> reportsToRank) { Intrinsics.checkNotNullParameter(issue, "issue"); Intrinsics.checkNotNullParameter(reportsToRank, "reportsToRank"); return new TaskReportCritiqueInput(issue, reportsToRank); } @NotNull public final List<TaskResult> component2() { return this.reportsToRank; } @NotNull public final AgentIssue component1() { return this.issue; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/critique/TaskReportCritiqueInput;", "ej-core"}) public static final class Companion { @NotNull public final KSerializer<TaskReportCritiqueInput> serializer() { return (KSerializer<TaskReportCritiqueInput>)TaskReportCritiqueInput.$serializer.INSTANCE; } private Companion() {} } @NotNull
/* 55 */   public final List<TaskResult> getReportsToRank() { return this.reportsToRank; } @NotNull public final AgentIssue getIssue() { return this.issue; } public TaskReportCritiqueInput(@NotNull AgentIssue issue, @NotNull List<TaskResult> reportsToRank) { this.issue = issue; this.reportsToRank = reportsToRank; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\TaskReportCritiqueInput.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */