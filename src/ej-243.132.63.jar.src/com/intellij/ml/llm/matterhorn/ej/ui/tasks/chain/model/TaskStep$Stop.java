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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\006¢\006\004\b\007\020\bJ\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\013\020\024\032\004\030\0010\006HÆ\003J)\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\006HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\nR\026\020\005\032\004\030\0010\006X\004¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Stop;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$EndStep;", "name", "", "description", "startNewTaskAction", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;)V", "getName", "()Ljava/lang/String;", "getDescription", "getStartNewTaskAction", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/header/Action;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class Stop
/*     */   extends TaskStep.EndStep
/*     */ {
/*     */   @NotNull
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final String description;
/*     */   @Nullable
/*     */   private final Action startNewTaskAction;
/*     */   @NotNull
/*     */   private final StepType stepType;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/* 141 */     return this.name; } @NotNull
/* 142 */   public String getDescription() { return this.description; } @Nullable
/* 143 */   public Action getStartNewTaskAction() { return this.startNewTaskAction; }
/* 144 */   public Stop(@NotNull String name, @NotNull String description, @Nullable Action startNewTaskAction) { super(null); this.name = name; this.description = description; this.startNewTaskAction = startNewTaskAction;
/* 145 */     this.stepType = StepType.Info; } @NotNull public StepType getStepType() { return this.stepType; }
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
/*     */   @Nullable
/*     */   public final Action component3() {
/*     */     return this.startNewTaskAction;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Stop copy(@NotNull String name, @NotNull String description, @Nullable Action startNewTaskAction) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     return new Stop(name, description, startNewTaskAction);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Stop(name=" + this.name + ", description=" + this.description + ", startNewTaskAction=" + this.startNewTaskAction + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     return result * 31 + ((this.startNewTaskAction == null) ? 0 : this.startNewTaskAction.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Stop))
/*     */       return false; 
/*     */     Stop stop = (Stop)other;
/*     */     return !Intrinsics.areEqual(this.name, stop.name) ? false : (!Intrinsics.areEqual(this.description, stop.description) ? false : (!!Intrinsics.areEqual(this.startNewTaskAction, stop.startNewTaskAction)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Stop.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */