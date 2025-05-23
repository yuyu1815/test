/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.header.Action;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\006¢\006\004\b\b\020\tJ\t\020\024\032\0020\003HÆ\003J\t\020\025\032\0020\003HÆ\003J\t\020\026\032\0020\006HÆ\003J\t\020\027\032\0020\006HÆ\003J1\020\030\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\006HÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\034HÖ\003J\t\020\035\032\0020\036HÖ\001J\t\020\037\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\f\020\013R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\r\020\016R\021\020\007\032\0020\006¢\006\b\n\000\032\004\b\017\020\016R\024\020\020\032\0020\021X\004¢\006\b\n\000\032\004\b\022\020\023¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$ChatResponse;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$EndStep;", "name", "", "description", "startNewTaskAction", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "onOpenMarkdownInEditorAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getName", "()Ljava/lang/String;", "getDescription", "getStartNewTaskAction", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "getOnOpenMarkdownInEditorAction", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ChatResponse
/*     */   extends TaskStep.EndStep
/*     */ {
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final String description;
/*     */   @NotNull
/*     */   private final Action startNewTaskAction;
/*     */   @NotNull
/*     */   private final Action onOpenMarkdownInEditorAction;
/*     */   @NotNull
/*     */   private final StepType stepType;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/* 132 */     return this.name; } @NotNull
/* 133 */   public String getDescription() { return this.description; } @NotNull
/* 134 */   public Action getStartNewTaskAction() { return this.startNewTaskAction; } @NotNull
/* 135 */   public final Action getOnOpenMarkdownInEditorAction() { return this.onOpenMarkdownInEditorAction; }
/* 136 */   public ChatResponse(@NotNull String name, @NotNull String description, @NotNull Action startNewTaskAction, @NotNull Action onOpenMarkdownInEditorAction) { super(null); this.name = name; this.description = description; this.startNewTaskAction = startNewTaskAction; this.onOpenMarkdownInEditorAction = onOpenMarkdownInEditorAction;
/* 137 */     this.stepType = StepType.ChatResponse; } @NotNull public StepType getStepType() { return this.stepType; }
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
/*     */   public final Action component3() {
/*     */     return this.startNewTaskAction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Action component4() {
/*     */     return this.onOpenMarkdownInEditorAction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ChatResponse copy(@NotNull String name, @NotNull String description, @NotNull Action startNewTaskAction, @NotNull Action onOpenMarkdownInEditorAction) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     Intrinsics.checkNotNullParameter(startNewTaskAction, "startNewTaskAction");
/*     */     Intrinsics.checkNotNullParameter(onOpenMarkdownInEditorAction, "onOpenMarkdownInEditorAction");
/*     */     return new ChatResponse(name, description, startNewTaskAction, onOpenMarkdownInEditorAction);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ChatResponse(name=" + this.name + ", description=" + this.description + ", startNewTaskAction=" + this.startNewTaskAction + ", onOpenMarkdownInEditorAction=" + this.onOpenMarkdownInEditorAction + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     result = result * 31 + this.startNewTaskAction.hashCode();
/*     */     return result * 31 + this.onOpenMarkdownInEditorAction.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ChatResponse))
/*     */       return false; 
/*     */     ChatResponse chatResponse = (ChatResponse)other;
/*     */     return !Intrinsics.areEqual(this.name, chatResponse.name) ? false : (!Intrinsics.areEqual(this.description, chatResponse.description) ? false : (!Intrinsics.areEqual(this.startNewTaskAction, chatResponse.startNewTaskAction) ? false : (!!Intrinsics.areEqual(this.onOpenMarkdownInEditorAction, chatResponse.onOpenMarkdownInEditorAction))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$ChatResponse.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */