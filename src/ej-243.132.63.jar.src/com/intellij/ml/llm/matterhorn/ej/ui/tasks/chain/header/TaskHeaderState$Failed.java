/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\013\b\007\030\0002\0020\001B9\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\003\022\006\020\t\032\0020\n\022\006\020\013\032\0020\n¢\006\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\022\020\023R\021\020\013\032\0020\n¢\006\b\n\000\032\004\b\024\020\023¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Failed;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskName", "", "iconState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "iconModifier", "Landroidx/compose/ui/Modifier;", "errorMessage", "startAgainButton", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "reportIssueButton", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getIconState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "getIconModifier", "()Landroidx/compose/ui/Modifier;", "getStartAgainButton", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getReportIssueButton", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class Failed
/*     */   extends TaskHeaderState
/*     */ {
/*     */   @NotNull
/*     */   private final TaskChainState iconState;
/*     */   @NotNull
/*     */   private final Modifier iconModifier;
/*     */   @NotNull
/*     */   private final Action startAgainButton;
/*     */   @NotNull
/*     */   private final Action reportIssueButton;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainState getIconState() {
/* 169 */     return this.iconState; } @NotNull
/* 170 */   public final Modifier getIconModifier() { return this.iconModifier; }
/*     */   @NotNull
/* 172 */   public final Action getStartAgainButton() { return this.startAgainButton; } @NotNull
/* 173 */   public final Action getReportIssueButton() { return this.reportIssueButton; } public Failed(@NotNull String taskName, @NotNull TaskChainState iconState, @NotNull Modifier iconModifier, @Nullable String errorMessage, @NotNull Action startAgainButton, @NotNull Action reportIssueButton) {
/* 174 */     super(taskName, errorMessage, null);
/*     */     this.iconState = iconState;
/*     */     this.iconModifier = iconModifier;
/*     */     this.startAgainButton = startAgainButton;
/*     */     this.reportIssueButton = reportIssueButton;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderState$Failed.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */