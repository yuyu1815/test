/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistorySnapshot;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.IssueType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.PlanItem;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.datetime.Instant;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000z\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\031\n\002\030\002\n\002\b\023\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 T2\0020\001:\002STB\001\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017\022\006\020\020\032\0020\021\022\020\b\002\020\022\032\n\022\004\022\0020\024\030\0010\023\022\n\b\002\020\025\032\004\030\0010\t\022\n\b\002\020\026\032\004\030\0010\t\022\n\b\002\020\027\032\004\030\0010\030¢\006\004\b\031\020\032B\001\b\020\022\006\020\033\032\0020\034\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017\022\006\020\020\032\0020\021\022\016\020\022\032\n\022\004\022\0020\024\030\0010\023\022\b\020\025\032\004\030\0010\t\022\b\020\026\032\004\030\0010\t\022\b\020\027\032\004\030\0010\030\022\b\020\035\032\004\030\0010\036¢\006\004\b\031\020\037J\t\020:\032\0020\003HÆ\003J\t\020;\032\0020\005HÆ\003J\t\020<\032\0020\007HÆ\003J\t\020=\032\0020\tHÆ\003J\t\020>\032\0020\013HÆ\003J\013\020?\032\004\030\0010\rHÆ\003J\013\020@\032\004\030\0010\017HÆ\003J\t\020A\032\0020\021HÆ\003J\021\020B\032\n\022\004\022\0020\024\030\0010\023HÆ\003J\013\020C\032\004\030\0010\tHÆ\003J\013\020D\032\004\030\0010\tHÆ\003J\013\020E\032\004\030\0010\030HÆ\003J\001\020F\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\0212\020\b\002\020\022\032\n\022\004\022\0020\024\030\0010\0232\n\b\002\020\025\032\004\030\0010\t2\n\b\002\020\026\032\004\030\0010\t2\n\b\002\020\027\032\004\030\0010\030HÆ\001J\023\020G\032\0020\0212\b\020H\032\004\030\0010\001HÖ\003J\t\020I\032\0020\034HÖ\001J\t\020J\032\0020\tHÖ\001J%\020K\032\0020L2\006\020M\032\0020\0002\006\020N\032\0020O2\006\020P\032\0020QH\001¢\006\002\bRR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b \020!R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\"\020#R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b$\020%R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b&\020'R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b(\020)R\023\020\f\032\004\030\0010\r¢\006\b\n\000\032\004\b*\020+R\023\020\016\032\004\030\0010\017¢\006\b\n\000\032\004\b,\020-R\021\020\020\032\0020\021¢\006\b\n\000\032\004\b\020\020.R\031\020\022\032\n\022\004\022\0020\024\030\0010\023¢\006\b\n\000\032\004\b/\0200R\023\020\025\032\004\030\0010\t¢\006\b\n\000\032\004\b1\020'R\023\020\026\032\004\030\0010\t¢\006\b\n\000\032\004\b2\020'R\023\020\027\032\004\030\0010\030¢\006\b\n\000\032\004\b3\0204R\021\0205\032\0020\t8F¢\006\006\032\004\b6\020'R\027\0207\032\b\022\004\022\002080\0238F¢\006\006\032\004\b9\0200¨\006U"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "", "id", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "type", "Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "created", "Lkotlinx/datetime/Instant;", "artifactPath", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;", "previousTasksInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "finalAgentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "isDeclined", "", "plan", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;", "patch", "terminalLog", "sessionHistory", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;Lkotlinx/datetime/Instant;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;Lkotlinx/datetime/Instant;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "getType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/IssueType;", "getCreated", "()Lkotlinx/datetime/Instant;", "getArtifactPath", "()Ljava/lang/String;", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/ExplicitTaskContext;", "getPreviousTasksInfo", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "getFinalAgentState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "()Z", "getPlan", "()Ljava/util/List;", "getPatch", "getTerminalLog", "getSessionHistory", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "description", "getDescription", "explicitlySelectedContextFiles", "Ljava/nio/file/Path;", "getExplicitlySelectedContextFiles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "$serializer", "Companion", "ej-core"})
/*    */ public final class TaskEntity {
/*    */   @NotNull
/* 25 */   public static final Companion Companion = new Companion(null); @NotNull private final TaskId id; @NotNull private final IssueType type; @NotNull private final Instant created; @NotNull private final String artifactPath; @NotNull private final ExplicitTaskContext context; @Nullable private final PreviousTasksInfo previousTasksInfo; @Nullable private final AgentState finalAgentState; private final boolean isDeclined; @Nullable private final List<PlanItem> plan; @Nullable private final String patch; @Nullable private final String terminalLog; @Nullable private final AgentSessionHistorySnapshot sessionHistory; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[12]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = EnumsKt.createSimpleEnumSerializer("com.intellij.ml.llm.matterhorn.ej.core.IssueType", (Enum[])IssueType.values()); arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = null; arrayOfKSerializer[6] = null; arrayOfKSerializer[7] = null; arrayOfKSerializer[8] = (KSerializer)new ArrayListSerializer((KSerializer)PlanItem$.serializer.INSTANCE); arrayOfKSerializer[9] = null; arrayOfKSerializer[10] = null; arrayOfKSerializer[11] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskEntity;", "ej-core"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskEntity> serializer() { return (KSerializer<TaskEntity>)TaskEntity.$serializer.INSTANCE; }
/*    */      }
/*    */   
/* 28 */   public TaskEntity(@NotNull TaskId id, @NotNull IssueType type, @NotNull Instant created, @NotNull String artifactPath, @NotNull ExplicitTaskContext context, @Nullable PreviousTasksInfo previousTasksInfo, @Nullable AgentState finalAgentState, boolean isDeclined, @Nullable List<PlanItem> plan, @Nullable String patch, @Nullable String terminalLog, @Nullable AgentSessionHistorySnapshot sessionHistory) { this.id = id;
/* 29 */     this.type = type;
/* 30 */     this.created = created;
/* 31 */     this.artifactPath = artifactPath;
/* 32 */     this.context = context;
/* 33 */     this.previousTasksInfo = previousTasksInfo;
/* 34 */     this.finalAgentState = finalAgentState;
/* 35 */     this.isDeclined = isDeclined;
/* 36 */     this.plan = plan;
/* 37 */     this.patch = patch;
/* 38 */     this.terminalLog = terminalLog;
/* 39 */     this.sessionHistory = sessionHistory; } @NotNull public final TaskId getId() { return this.id; } @NotNull public final IssueType getType() { return this.type; } @NotNull public final Instant getCreated() { return this.created; } @NotNull public final String getArtifactPath() { return this.artifactPath; } @NotNull public final ExplicitTaskContext getContext() { return this.context; } @Nullable public final AgentSessionHistorySnapshot getSessionHistory() { return this.sessionHistory; }
/*    */   @Nullable public final PreviousTasksInfo getPreviousTasksInfo() { return this.previousTasksInfo; }
/*    */   @Nullable public final AgentState getFinalAgentState() { return this.finalAgentState; }
/* 42 */   public final boolean isDeclined() { return this.isDeclined; } @Nullable public final List<PlanItem> getPlan() { return this.plan; } @Nullable public final String getPatch() { return this.patch; } @Nullable public final String getTerminalLog() { return this.terminalLog; } @NotNull public final String getDescription() { return this.context.getDescription(); } @NotNull
/*    */   public final List<Path> getExplicitlySelectedContextFiles() {
/* 44 */     return this.context.getExplicitlySelectedContextFiles();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskId component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final IssueType component2() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Instant component3() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.artifactPath;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ExplicitTaskContext component5() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final PreviousTasksInfo component6() {
/*    */     return this.previousTasksInfo;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AgentState component7() {
/*    */     return this.finalAgentState;
/*    */   }
/*    */   
/*    */   public final boolean component8() {
/*    */     return this.isDeclined;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<PlanItem> component9() {
/*    */     return this.plan;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component10() {
/*    */     return this.patch;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component11() {
/*    */     return this.terminalLog;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final AgentSessionHistorySnapshot component12() {
/*    */     return this.sessionHistory;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskEntity copy(@NotNull TaskId id, @NotNull IssueType type, @NotNull Instant created, @NotNull String artifactPath, @NotNull ExplicitTaskContext context, @Nullable PreviousTasksInfo previousTasksInfo, @Nullable AgentState finalAgentState, boolean isDeclined, @Nullable List<PlanItem> plan, @Nullable String patch, @Nullable String terminalLog, @Nullable AgentSessionHistorySnapshot sessionHistory) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(type, "type");
/*    */     Intrinsics.checkNotNullParameter(created, "created");
/*    */     Intrinsics.checkNotNullParameter(artifactPath, "artifactPath");
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     return new TaskEntity(id, type, created, artifactPath, context, previousTasksInfo, finalAgentState, isDeclined, plan, patch, terminalLog, sessionHistory);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TaskEntity(id=" + this.id + ", type=" + this.type + ", created=" + this.created + ", artifactPath=" + this.artifactPath + ", context=" + this.context + ", previousTasksInfo=" + this.previousTasksInfo + ", finalAgentState=" + this.finalAgentState + ", isDeclined=" + this.isDeclined + ", plan=" + this.plan + ", patch=" + this.patch + ", terminalLog=" + this.terminalLog + ", sessionHistory=" + this.sessionHistory + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + this.type.hashCode();
/*    */     result = result * 31 + this.created.hashCode();
/*    */     result = result * 31 + this.artifactPath.hashCode();
/*    */     result = result * 31 + this.context.hashCode();
/*    */     result = result * 31 + ((this.previousTasksInfo == null) ? 0 : this.previousTasksInfo.hashCode());
/*    */     result = result * 31 + ((this.finalAgentState == null) ? 0 : this.finalAgentState.hashCode());
/*    */     result = result * 31 + Boolean.hashCode(this.isDeclined);
/*    */     result = result * 31 + ((this.plan == null) ? 0 : this.plan.hashCode());
/*    */     result = result * 31 + ((this.patch == null) ? 0 : this.patch.hashCode());
/*    */     result = result * 31 + ((this.terminalLog == null) ? 0 : this.terminalLog.hashCode());
/*    */     return result * 31 + ((this.sessionHistory == null) ? 0 : this.sessionHistory.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskEntity))
/*    */       return false; 
/*    */     TaskEntity taskEntity = (TaskEntity)other;
/*    */     return !Intrinsics.areEqual(this.id, taskEntity.id) ? false : ((this.type != taskEntity.type) ? false : (!Intrinsics.areEqual(this.created, taskEntity.created) ? false : (!Intrinsics.areEqual(this.artifactPath, taskEntity.artifactPath) ? false : (!Intrinsics.areEqual(this.context, taskEntity.context) ? false : (!Intrinsics.areEqual(this.previousTasksInfo, taskEntity.previousTasksInfo) ? false : (!Intrinsics.areEqual(this.finalAgentState, taskEntity.finalAgentState) ? false : ((this.isDeclined != taskEntity.isDeclined) ? false : (!Intrinsics.areEqual(this.plan, taskEntity.plan) ? false : (!Intrinsics.areEqual(this.patch, taskEntity.patch) ? false : (!Intrinsics.areEqual(this.terminalLog, taskEntity.terminalLog) ? false : (!!Intrinsics.areEqual(this.sessionHistory, taskEntity.sessionHistory))))))))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\persistence\TaskEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */