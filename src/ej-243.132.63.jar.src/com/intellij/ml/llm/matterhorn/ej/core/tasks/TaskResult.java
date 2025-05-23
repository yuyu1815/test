/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\024\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201B9\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\003\022\006\020\n\032\0020\013¢\006\004\b\f\020\rBW\b\020\022\006\020\016\032\0020\017\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\003\022\b\020\n\032\004\030\0010\013\022\b\020\020\032\004\030\0010\021¢\006\004\b\f\020\022J\b\020\035\032\0020\003H\026J\013\020\036\032\004\030\0010\003HÆ\003J\t\020\037\032\0020\003HÆ\003J\t\020 \032\0020\006HÆ\003J\t\020!\032\0020\bHÆ\003J\t\020\"\032\0020\003HÆ\003J\t\020#\032\0020\013HÆ\003JG\020$\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\0032\b\b\002\020\n\032\0020\013HÆ\001J\023\020%\032\0020&2\b\020'\032\004\030\0010\001HÖ\003J\t\020(\032\0020\017HÖ\001J%\020)\032\0020*2\006\020+\032\0020\0002\006\020\004\032\0020,2\006\020-\032\0020.H\001¢\006\002\b/R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\023\020\024R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\025\020\024R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\026\020\027R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\030\020\031R\021\020\t\032\0020\003¢\006\b\n\000\032\004\b\032\020\024R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\033\020\034¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "", "title", "", "output", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "patch", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTitle", "()Ljava/lang/String;", "getOutput", "getType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "getPatch", "getSessionHistory", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class TaskResult {
/*    */   @NotNull
/* 10 */   public static final Companion Companion = new Companion(null); @Nullable private final String title; @NotNull private final String output; @NotNull private final StepType type; @NotNull private final AgentState state; @NotNull private final String patch; @NotNull private final AgentSessionHistorySnapshot sessionHistory; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ej.core.StepType", (Enum[])StepType.values()); arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskResult> serializer() { return (KSerializer<TaskResult>)TaskResult.$serializer.INSTANCE; }
/*    */      }
/* 12 */   public TaskResult(@Nullable String title, @NotNull String output, @NotNull StepType type, @NotNull AgentState state, @NotNull String patch, @NotNull AgentSessionHistorySnapshot sessionHistory) { this.title = title;
/* 13 */     this.output = output;
/* 14 */     this.type = type;
/* 15 */     this.state = state;
/* 16 */     this.patch = patch;
/* 17 */     this.sessionHistory = sessionHistory; } @Nullable public final String getTitle() { return this.title; } @NotNull public final String getOutput() { return this.output; } @NotNull public final AgentSessionHistorySnapshot getSessionHistory() { return this.sessionHistory; }
/*    */   @NotNull public final StepType getType() { return this.type; }
/*    */   @NotNull public final AgentState getState() { return this.state; }
/* 20 */   @NotNull public final String getPatch() { return this.patch; } @NotNull public String toString() { return this.output + "\n" + this.output; }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.title;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.output;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StepType component3() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AgentState component4() {
/*    */     return this.state;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component5() {
/*    */     return this.patch;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AgentSessionHistorySnapshot component6() {
/*    */     return this.sessionHistory;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskResult copy(@Nullable String title, @NotNull String output, @NotNull StepType type, @NotNull AgentState state, @NotNull String patch, @NotNull AgentSessionHistorySnapshot sessionHistory) {
/*    */     Intrinsics.checkNotNullParameter(output, "output");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(state, "state");
/*    */     Intrinsics.checkNotNullParameter(patch, "patch");
/*    */     Intrinsics.checkNotNullParameter(sessionHistory, "sessionHistory");
/*    */     return new TaskResult(title, output, type, state, patch, sessionHistory);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.title == null) ? 0 : this.title.hashCode();
/*    */     result = result * 31 + this.output.hashCode();
/*    */     result = result * 31 + this.type.hashCode();
/*    */     result = result * 31 + this.state.hashCode();
/*    */     result = result * 31 + this.patch.hashCode();
/*    */     return result * 31 + this.sessionHistory.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskResult))
/*    */       return false; 
/*    */     TaskResult taskResult = (TaskResult)other;
/*    */     return !Intrinsics.areEqual(this.title, taskResult.title) ? false : (!Intrinsics.areEqual(this.output, taskResult.output) ? false : ((this.type != taskResult.type) ? false : (!Intrinsics.areEqual(this.state, taskResult.state) ? false : (!Intrinsics.areEqual(this.patch, taskResult.patch) ? false : (!!Intrinsics.areEqual(this.sessionHistory, taskResult.sessionHistory))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\TaskResult.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */