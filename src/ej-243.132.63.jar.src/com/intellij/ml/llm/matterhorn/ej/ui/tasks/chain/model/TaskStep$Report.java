/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B?\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\016\b\002\020\005\032\b\022\004\022\0020\0070\006\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\t¢\006\004\b\013\020\fJ\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\003HÆ\003J\017\020\033\032\b\022\004\022\0020\0070\006HÆ\003J\013\020\034\032\004\030\0010\tHÆ\003J\013\020\035\032\004\030\0010\tHÆ\003JE\020\036\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\016\b\002\020\005\032\b\022\004\022\0020\0070\0062\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\tHÆ\001J\023\020\037\032\0020 2\b\020!\032\004\030\0010\"HÖ\003J\t\020#\032\0020$HÖ\001J\t\020%\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\017\020\016R\027\020\005\032\b\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\020\020\021R\026\020\b\032\004\030\0010\tX\004¢\006\b\n\000\032\004\b\022\020\023R\023\020\n\032\004\030\0010\t¢\006\b\n\000\032\004\b\024\020\023R\024\020\025\032\0020\026X\004¢\006\b\n\000\032\004\b\027\020\030¨\006&"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Report;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$EndStep;", "name", "", "description", "changes", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;", "startNewTaskAction", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "rollbackAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getName", "()Ljava/lang/String;", "getDescription", "getChanges", "()Ljava/util/List;", "getStartNewTaskAction", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getRollbackAction", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class Report
/*     */   extends TaskStep.EndStep
/*     */ {
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final String description;
/*     */   @NotNull
/*     */   private final List<FileChangeView> changes;
/*     */   @Nullable
/*     */   private final Action startNewTaskAction;
/*     */   @Nullable
/*     */   private final Action rollbackAction;
/*     */   @NotNull
/*     */   private final StepType stepType;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/* 122 */     return this.name; } @NotNull
/* 123 */   public String getDescription() { return this.description; } @NotNull
/* 124 */   public final List<FileChangeView> getChanges() { return this.changes; } @Nullable
/* 125 */   public Action getStartNewTaskAction() { return this.startNewTaskAction; } @Nullable
/* 126 */   public final Action getRollbackAction() { return this.rollbackAction; }
/* 127 */   public Report(@NotNull String name, @NotNull String description, @NotNull List<FileChangeView> changes, @Nullable Action startNewTaskAction, @Nullable Action rollbackAction) { super(null); this.name = name; this.description = description; this.changes = changes; this.startNewTaskAction = startNewTaskAction; this.rollbackAction = rollbackAction;
/* 128 */     this.stepType = StepType.Report; } @NotNull public StepType getStepType() { return this.stepType; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<FileChangeView> component3() {
/*     */     return this.changes;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Action component4() {
/*     */     return this.startNewTaskAction;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Action component5() {
/*     */     return this.rollbackAction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Report copy(@NotNull String name, @NotNull String description, @NotNull List<FileChangeView> changes, @Nullable Action startNewTaskAction, @Nullable Action rollbackAction) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     Intrinsics.checkNotNullParameter(changes, "changes");
/*     */     return new Report(name, description, changes, startNewTaskAction, rollbackAction);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Report(name=" + this.name + ", description=" + this.description + ", changes=" + this.changes + ", startNewTaskAction=" + this.startNewTaskAction + ", rollbackAction=" + this.rollbackAction + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     result = result * 31 + this.changes.hashCode();
/*     */     result = result * 31 + ((this.startNewTaskAction == null) ? 0 : this.startNewTaskAction.hashCode());
/*     */     return result * 31 + ((this.rollbackAction == null) ? 0 : this.rollbackAction.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Report))
/*     */       return false; 
/*     */     Report report = (Report)other;
/*     */     return !Intrinsics.areEqual(this.name, report.name) ? false : (!Intrinsics.areEqual(this.description, report.description) ? false : (!Intrinsics.areEqual(this.changes, report.changes) ? false : (!Intrinsics.areEqual(this.startNewTaskAction, report.startNewTaskAction) ? false : (!!Intrinsics.areEqual(this.rollbackAction, report.rollbackAction)))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Report.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */