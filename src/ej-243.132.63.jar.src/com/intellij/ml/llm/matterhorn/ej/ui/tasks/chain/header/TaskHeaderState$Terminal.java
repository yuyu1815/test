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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\b\007\030\0002\0020\001B;\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\006\020\013\032\0020\t¢\006\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\022\020\023R\023\020\n\032\004\030\0010\t¢\006\b\n\000\032\004\b\024\020\023R\021\020\013\032\0020\t¢\006\b\n\000\032\004\b\025\020\023¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState$Terminal;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/TaskHeaderState;", "taskName", "", "iconState", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "iconModifier", "Landroidx/compose/ui/Modifier;", "doneButton", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "declineButton", "startAgainButton", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Landroidx/compose/ui/Modifier;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getIconState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "getIconModifier", "()Landroidx/compose/ui/Modifier;", "getDoneButton", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getDeclineButton", "getStartAgainButton", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class Terminal
/*     */   extends TaskHeaderState
/*     */ {
/*     */   @NotNull
/*     */   private final TaskChainState iconState;
/*     */   @NotNull
/*     */   private final Modifier iconModifier;
/*     */   @Nullable
/*     */   private final Action doneButton;
/*     */   @Nullable
/*     */   private final Action declineButton;
/*     */   @NotNull
/*     */   private final Action startAgainButton;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainState getIconState() {
/* 160 */     return this.iconState; } @NotNull
/* 161 */   public final Modifier getIconModifier() { return this.iconModifier; } @Nullable
/* 162 */   public final Action getDoneButton() { return this.doneButton; } @Nullable
/* 163 */   public final Action getDeclineButton() { return this.declineButton; } @NotNull
/* 164 */   public final Action getStartAgainButton() { return this.startAgainButton; } public Terminal(@NotNull String taskName, @NotNull TaskChainState iconState, @NotNull Modifier iconModifier, @Nullable Action doneButton, @Nullable Action declineButton, @NotNull Action startAgainButton) {
/* 165 */     super(taskName, null, 2, null);
/*     */     this.iconState = iconState;
/*     */     this.iconModifier = iconModifier;
/*     */     this.doneButton = doneButton;
/*     */     this.declineButton = declineButton;
/*     */     this.startAgainButton = startAgainButton;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\header\TaskHeaderState$Terminal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */