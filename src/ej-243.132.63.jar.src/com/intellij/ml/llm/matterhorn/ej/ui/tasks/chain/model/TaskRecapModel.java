/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\f\n\002\020\016\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\b\030\0002\0020\001B7\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005\022\016\b\002\020\006\032\b\022\004\022\0020\b0\007\022\n\b\002\020\t\032\004\030\0010\b¢\006\004\b\n\020\013J\b\020\024\032\0020\025H\026J\t\020\026\032\0020\003HÆ\003J\013\020\027\032\004\030\0010\005HÆ\003J\017\020\030\032\b\022\004\022\0020\b0\007HÆ\003J\013\020\031\032\004\030\0010\bHÆ\003J;\020\032\032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\0072\n\b\002\020\t\032\004\030\0010\bHÆ\001J\023\020\033\032\0020\0342\b\020\035\032\004\030\0010\001HÖ\003J\t\020\036\032\0020\037HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\f\020\rR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\016\020\017R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\020\020\021R\023\020\t\032\004\030\0010\b¢\006\b\n\000\032\004\b\022\020\023¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskRecapModel;", "", "prompt", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;", "plan", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;", "steps", "", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "result", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;)V", "getPrompt", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;", "getPlan", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Plan;", "getSteps", "()Ljava/util/List;", "getResult", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "toString", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "ej-ui"}) @StabilityInferred(parameters = 0)
/*    */ public final class TaskRecapModel { @NotNull
/*    */   private final TaskStep.Prompt prompt; @Nullable
/*  4 */   private final TaskStep.Plan plan; public TaskRecapModel(@NotNull TaskStep.Prompt prompt, @Nullable TaskStep.Plan plan, @NotNull List<TaskStep> steps, @Nullable TaskStep result) { this.prompt = prompt;
/*  5 */     this.plan = plan;
/*  6 */     this.steps = steps;
/*  7 */     this.result = result; } @NotNull private final List<TaskStep> steps; @Nullable private final TaskStep result; public static final int $stable = 8; @NotNull public final TaskStep.Prompt getPrompt() { return this.prompt; } @Nullable public final TaskStep.Plan getPlan() { return this.plan; } @NotNull public final List<TaskStep> getSteps() { return this.steps; } @Nullable public final TaskStep getResult() { return this.result; }
/*    */    @NotNull
/*    */   public String toString() {
/* 10 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u241 = stringBuilder1; int $i$a$-buildString-TaskRecapModel$toString$1 = 0;
/* 11 */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Prompt"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Prompt").append('\n'), "append(...)"); $this$toString_u24lambda_u241.append("Prompt").append('\n');
/* 12 */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(this.prompt), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(this.prompt).append('\n'), "append(...)"); $this$toString_u24lambda_u241.append(this.prompt).append('\n');
/* 13 */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Plan"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Plan").append('\n'), "append(...)"); $this$toString_u24lambda_u241.append("Plan").append('\n');
/* 14 */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(this.plan), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(this.plan).append('\n'), "append(...)"); $this$toString_u24lambda_u241.append(this.plan).append('\n');
/* 15 */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Steps (" + this.steps.size() + ")"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Steps (" + this.steps.size() + ")").append('\n'), "append(...)"); $this$toString_u24lambda_u241.append("Steps (" + this.steps.size() + ")").append('\n');
/* 16 */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(CollectionsKt.joinToString$default(this.steps, "\n", null, null, 0, null, TaskRecapModel::toString$lambda$1$lambda$0, 30, null)), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append(CollectionsKt.joinToString$default(this.steps, "\n", null, null, 0, null, TaskRecapModel::toString$lambda$1$lambda$0, 30, null)).append('\n'), "append(...)"); $this$toString_u24lambda_u241.append(CollectionsKt.joinToString$default(this.steps, "\n", null, null, 0, null, TaskRecapModel::toString$lambda$1$lambda$0, 30, null)).append('\n');
/* 17 */     Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Result"), "append(...)"); Intrinsics.checkNotNullExpressionValue($this$toString_u24lambda_u241.append("Result").append('\n'), "append(...)"); $this$toString_u24lambda_u241.append("Result").append('\n');
/* 18 */     StringBuilder stringBuilder2 = $this$toString_u24lambda_u241; Intrinsics.checkNotNullExpressionValue(stringBuilder2.append((this.result != null) ? this.result.toString() : null), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder2.append((this.result != null) ? this.result.toString() : null).append('\n'), "append(...)"); stringBuilder2.append((this.result != null) ? this.result.toString() : null).append('\n');
/*    */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskStep.Prompt component1() {
/*    */     return this.prompt;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TaskStep.Plan component2() {
/*    */     return this.plan;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<TaskStep> component3() {
/*    */     return this.steps;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final TaskStep component4() {
/*    */     return this.result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TaskRecapModel copy(@NotNull TaskStep.Prompt prompt, @Nullable TaskStep.Plan plan, @NotNull List<? extends TaskStep> steps, @Nullable TaskStep result) {
/*    */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*    */     Intrinsics.checkNotNullParameter(steps, "steps");
/*    */     return new TaskRecapModel(prompt, plan, steps, result);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.prompt.hashCode();
/*    */     result = result * 31 + ((this.plan == null) ? 0 : this.plan.hashCode());
/*    */     result = result * 31 + this.steps.hashCode();
/*    */     return result * 31 + ((this.result == null) ? 0 : this.result.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TaskRecapModel))
/*    */       return false; 
/*    */     TaskRecapModel taskRecapModel = (TaskRecapModel)other;
/*    */     return !Intrinsics.areEqual(this.prompt, taskRecapModel.prompt) ? false : (!Intrinsics.areEqual(this.plan, taskRecapModel.plan) ? false : (!Intrinsics.areEqual(this.steps, taskRecapModel.steps) ? false : (!!Intrinsics.areEqual(this.result, taskRecapModel.result))));
/*    */   }
/*    */   
/*    */   private static final CharSequence toString$lambda$1$lambda$0(TaskStep it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return it.toString();
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskRecapModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */