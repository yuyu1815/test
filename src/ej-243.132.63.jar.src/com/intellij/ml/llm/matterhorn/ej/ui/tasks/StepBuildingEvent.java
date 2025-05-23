/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentSessionHistorySnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.PlanItem;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskResult;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.StepEntity;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\f\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\n\004\005\006\007\b\t\n\013\f\rB\t\b\004¢\006\004\b\002\020\003\001\n\016\017\020\021\022\023\024\025\026\027¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "", "<init>", "()V", "NameAppeared", "StepUpdated", "ResultAppeared", "ErrorOccurred", "AgentStateUpdated", "AgentSessionHistoryUpdated", "PlanUpdated", "ProgressUpdated", "TerminalSessionStarted", "TerminalSessionFinished", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentSessionHistoryUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentStateUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ErrorOccurred;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$NameAppeared;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$PlanUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ProgressUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionFinished;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionStarted;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public abstract class StepBuildingEvent
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   private StepBuildingEvent() {}
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$NameAppeared;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "ej-ui"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class NameAppeared
/*     */     extends StepBuildingEvent
/*     */   {
/*     */     @NotNull
/*     */     private final String name;
/*     */     public static final int $stable;
/*     */     
/*     */     public NameAppeared(@NotNull String name) {
/* 209 */       super(null); this.name = name; } @NotNull public final String getName() { return this.name; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\007\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$StepUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "step", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "index", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;I)V", "getStep", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;", "getIndex", "()I", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class StepUpdated extends StepBuildingEvent { @NotNull
/* 210 */     private final StepEntity step; private final int index; public static final int $stable = 8; public StepUpdated(@NotNull StepEntity step, int index) { super(null); this.step = step; this.index = index; } @NotNull public final StepEntity getStep() { return this.step; } public final int getIndex() { return this.index; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ResultAppeared;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "result", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;)V", "getResult", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskResult;", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class ResultAppeared extends StepBuildingEvent { @NotNull
/* 211 */     private final TaskResult result; public static final int $stable = 8; public ResultAppeared(@NotNull TaskResult result) { super(null); this.result = result; } @NotNull public final TaskResult getResult() { return this.result; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\027\022\016\020\002\032\n\030\0010\003j\004\030\001`\004¢\006\004\b\005\020\006R\031\020\002\032\n\030\0010\003j\004\030\001`\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ErrorOccurred;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class ErrorOccurred extends StepBuildingEvent { @Nullable
/* 212 */     private final Exception exception; public static final int $stable = 8; public ErrorOccurred(@Nullable Exception exception) { super(null); this.exception = exception; } @Nullable public final Exception getException() { return this.exception; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentStateUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "agentState", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;)V", "getAgentState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class AgentStateUpdated extends StepBuildingEvent { @NotNull
/* 213 */     private final AgentState agentState; public static final int $stable = 8; public AgentStateUpdated(@NotNull AgentState agentState) { super(null); this.agentState = agentState; } @NotNull public final AgentState getAgentState() { return this.agentState; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$AgentSessionHistoryUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "historySnapshot", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;)V", "getHistorySnapshot", "()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistorySnapshot;", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class AgentSessionHistoryUpdated extends StepBuildingEvent { @NotNull
/* 214 */     private final AgentSessionHistorySnapshot historySnapshot; public static final int $stable = 8; public AgentSessionHistoryUpdated(@NotNull AgentSessionHistorySnapshot historySnapshot) { super(null); this.historySnapshot = historySnapshot; } @NotNull public final AgentSessionHistorySnapshot getHistorySnapshot() { return this.historySnapshot; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$PlanUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "plan", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/PlanItem;", "<init>", "(Ljava/util/List;)V", "getPlan", "()Ljava/util/List;", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class PlanUpdated extends StepBuildingEvent { @NotNull
/* 215 */     private final List<PlanItem> plan; public static final int $stable = 8; public PlanUpdated(@NotNull List<PlanItem> plan) { super(null); this.plan = plan; } @NotNull public final List<PlanItem> getPlan() { return this.plan; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\021\022\b\020\002\032\004\030\0010\003¢\006\004\b\004\020\005R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$ProgressUpdated;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;)V", "getProgress", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "ej-ui"}) @StabilityInferred(parameters = 0) public static final class ProgressUpdated extends StepBuildingEvent { @Nullable
/* 216 */     private final ProgressEntity progress; public static final int $stable = 8; public ProgressUpdated(@Nullable ProgressEntity progress) { super(null); this.progress = progress; } @Nullable public final ProgressEntity getProgress() { return this.progress; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\020\002\n\002\b\007\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\f\020\004\032\b\022\004\022\0020\0060\005¢\006\004\b\007\020\bR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\nR\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionStarted;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "uuid", "", "openAction", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getUuid", "()Ljava/lang/String;", "getOpenAction", "()Lkotlin/jvm/functions/Function0;", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class TerminalSessionStarted extends StepBuildingEvent { @NotNull
/*     */     private final String uuid; @NotNull
/* 218 */     private final Function0<Unit> openAction; public static final int $stable; public TerminalSessionStarted(@NotNull String uuid, @NotNull Function0<Unit> openAction) { super(null); this.uuid = uuid; this.openAction = openAction; } @NotNull public final String getUuid() { return this.uuid; } @NotNull public final Function0<Unit> getOpenAction() { return this.openAction; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent$TerminalSessionFinished;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/StepBuildingEvent;", "uuid", "", "sessionLog", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUuid", "()Ljava/lang/String;", "getSessionLog", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class TerminalSessionFinished extends StepBuildingEvent { @NotNull
/* 219 */     private final String uuid; public TerminalSessionFinished(@NotNull String uuid, @NotNull String sessionLog) { super(null); this.uuid = uuid; this.sessionLog = sessionLog; } @NotNull private final String sessionLog; public static final int $stable; @NotNull public final String getUuid() { return this.uuid; } @NotNull public final String getSessionLog() { return this.sessionLog; }
/*     */      }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\StepBuildingEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */