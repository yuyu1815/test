/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\013\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\005\n\013\f\r\016B\035\b\004\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\003¢\006\004\b\005\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\023\020\004\032\004\030\0010\003¢\006\b\n\000\032\004\b\t\020\b\001\005\017\020\021\022\023¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "", "taskName", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTaskName", "()Ljava/lang/String;", "getErrorMessage", "Running", "WaitingUserInput", "WaitingSmartMode", "Terminal", "Failed", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Running;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingSmartMode;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingUserInput;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public abstract class TaskHeaderState
/*     */ {
/*     */   @NotNull
/*     */   private final String taskName;
/*     */   @Nullable
/*     */   private final String errorMessage;
/*     */   public static final int $stable;
/*     */   
/*     */   private TaskHeaderState(String taskName, String errorMessage) {
/* 142 */     this.taskName = taskName; this.errorMessage = errorMessage; } @NotNull public final String getTaskName() { return this.taskName; } @Nullable public final String getErrorMessage() { return this.errorMessage; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Running;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskName", "", "button", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getButton", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class Running extends TaskHeaderState { @NotNull
/*     */     private final Action button; public static final int $stable; @NotNull
/* 145 */     public final Action getButton() { return this.button; }
/* 146 */     public Running(@NotNull String taskName, @NotNull Action button) { super(taskName, null, 2, null);
/*     */       this.button = button; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingUserInput;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskName", "", "button", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getButton", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class WaitingUserInput extends TaskHeaderState { @NotNull
/*     */     private final Action button; public static final int $stable; @NotNull
/* 150 */     public final Action getButton() { return this.button; }
/* 151 */     public WaitingUserInput(@NotNull String taskName, @NotNull Action button) { super(taskName, null, 2, null);
/*     */       this.button = button; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\b\007\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$WaitingSmartMode;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskName", "", "button", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getButton", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "ej-ui"}) @StabilityInferred(parameters = 1)
/*     */   public static final class WaitingSmartMode extends TaskHeaderState { @NotNull
/*     */     private final Action button; public static final int $stable; @NotNull
/* 155 */     public final Action getButton() { return this.button; }
/* 156 */     public WaitingSmartMode(@NotNull String taskName, @NotNull Action button) { super(taskName, null, 2, null);
/*     */       this.button = button; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\b\007\030\0002\0020\001B;\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\006\020\013\032\0020\t¢\006\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\022\020\023R\023\020\n\032\004\030\0010\t¢\006\b\n\000\032\004\b\024\020\023R\021\020\013\032\0020\t¢\006\b\n\000\032\004\b\025\020\023¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskName", "", "iconState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "iconModifier", "Landroidx/compose/ui/Modifier;", "doneButton", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "declineButton", "startAgainButton", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getIconState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "getIconModifier", "()Landroidx/compose/ui/Modifier;", "getDoneButton", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getDeclineButton", "getStartAgainButton", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class Terminal extends TaskHeaderState { @NotNull private final TaskChainState iconState; @NotNull private final Modifier iconModifier; @Nullable private final Action doneButton; @Nullable
/*     */     private final Action declineButton; @NotNull
/*     */     private final Action startAgainButton; public static final int $stable; @NotNull
/* 160 */     public final TaskChainState getIconState() { return this.iconState; } @NotNull
/* 161 */     public final Modifier getIconModifier() { return this.iconModifier; } @Nullable
/* 162 */     public final Action getDoneButton() { return this.doneButton; } @Nullable
/* 163 */     public final Action getDeclineButton() { return this.declineButton; } @NotNull
/* 164 */     public final Action getStartAgainButton() { return this.startAgainButton; }
/* 165 */     public Terminal(@NotNull String taskName, @NotNull TaskChainState iconState, @NotNull Modifier iconModifier, @Nullable Action doneButton, @Nullable Action declineButton, @NotNull Action startAgainButton) { super(taskName, null, 2, null); this.iconState = iconState;
/*     */       this.iconModifier = iconModifier;
/*     */       this.doneButton = doneButton;
/*     */       this.declineButton = declineButton;
/* 169 */       this.startAgainButton = startAgainButton; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\b\007\030\0002\0020\001B9\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\003\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n¢\006\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\022\020\023R\021\020\013\032\0020\n¢\006\b\n\000\032\004\b\024\020\023¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskName", "", "iconState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "iconModifier", "Landroidx/compose/ui/Modifier;", "errorMessage", "startAgainButton", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "reportIssueButton", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getIconState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "getIconModifier", "()Landroidx/compose/ui/Modifier;", "getStartAgainButton", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getReportIssueButton", "ej-ui"}) @StabilityInferred(parameters = 1) public static final class Failed extends TaskHeaderState { @NotNull private final TaskChainState iconState; @NotNull private final Modifier iconModifier; @NotNull public final TaskChainState getIconState() { return this.iconState; } @NotNull private final Action startAgainButton; @NotNull private final Action reportIssueButton; public static final int $stable; @NotNull
/* 170 */     public final Modifier getIconModifier() { return this.iconModifier; }
/*     */     @NotNull
/* 172 */     public final Action getStartAgainButton() { return this.startAgainButton; } @NotNull
/* 173 */     public final Action getReportIssueButton() { return this.reportIssueButton; } public Failed(@NotNull String taskName, @NotNull TaskChainState iconState, @NotNull Modifier iconModifier, @Nullable String errorMessage, @NotNull Action startAgainButton, @NotNull Action reportIssueButton) {
/* 174 */       super(taskName, errorMessage, null);
/*     */       this.iconState = iconState;
/*     */       this.iconModifier = iconModifier;
/*     */       this.startAgainButton = startAgainButton;
/*     */       this.reportIssueButton = reportIssueButton;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderState.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */