/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.StepType;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt.AttachedFilesViewModel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\003HÆ\003J\t\020\024\032\0020\006HÆ\003J'\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\031HÖ\003J\t\020\032\032\0020\033HÖ\001J\t\020\034\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\nR\024\020\004\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\nR\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\f\020\rR\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep$Prompt;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/TaskStep;", "name", "", "description", "attachedFilesVm", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;)V", "getName", "()Ljava/lang/String;", "getDescription", "getAttachedFilesVm", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "stepType", "Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "getStepType", "()Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-ui"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class Prompt
/*    */   extends TaskStep
/*    */ {
/*    */   @NotNull
/*    */   private final String name;
/*    */   @NotNull
/*    */   private final String description;
/*    */   @NotNull
/*    */   private final AttachedFilesViewModel attachedFilesVm;
/*    */   @NotNull
/*    */   private final StepType stepType;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   @NotNull
/*    */   public String getName() {
/* 32 */     return this.name; } @NotNull
/* 33 */   public String getDescription() { return this.description; } @NotNull
/* 34 */   public final AttachedFilesViewModel getAttachedFilesVm() { return this.attachedFilesVm; }
/* 35 */   public Prompt(@NotNull String name, @NotNull String description, @NotNull AttachedFilesViewModel attachedFilesVm) { super(null); this.name = name; this.description = description; this.attachedFilesVm = attachedFilesVm;
/* 36 */     this.stepType = StepType.Prompt; } @NotNull public StepType getStepType() { return this.stepType; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final AttachedFilesViewModel component3() {
/*    */     return this.attachedFilesVm;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Prompt copy(@NotNull String name, @NotNull String description, @NotNull AttachedFilesViewModel attachedFilesVm) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(description, "description");
/*    */     Intrinsics.checkNotNullParameter(attachedFilesVm, "attachedFilesVm");
/*    */     return new Prompt(name, description, attachedFilesVm);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Prompt(name=" + this.name + ", description=" + this.description + ", attachedFilesVm=" + this.attachedFilesVm + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.name.hashCode();
/*    */     result = result * 31 + this.description.hashCode();
/*    */     return result * 31 + this.attachedFilesVm.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Prompt))
/*    */       return false; 
/*    */     Prompt prompt = (Prompt)other;
/*    */     return !Intrinsics.areEqual(this.name, prompt.name) ? false : (!Intrinsics.areEqual(this.description, prompt.description) ? false : (!!Intrinsics.areEqual(this.attachedFilesVm, prompt.attachedFilesVm)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\TaskStep$Prompt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */