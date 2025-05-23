/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\022\032\0020\0232\006\020\024\032\0020\025H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\024\020\016\032\0020\0178VX\004¢\006\006\032\004\b\020\020\021¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptOwnerViewModel;", "", "project", "Lcom/intellij/openapi/project/Project;", "getProject", "()Lcom/intellij/openapi/project/Project;", "textState", "Landroidx/compose/foundation/text/input/TextFieldState;", "getTextState", "()Landroidx/compose/foundation/text/input/TextFieldState;", "attachedFiles", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "getAttachedFiles", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/AttachedFilesViewModel;", "perplexityModeEnabled", "", "getPerplexityModeEnabled", "()Z", "submitTask", "", "mode", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/prompt/PromptMode;", "ej-ui"})
/*    */ public interface PromptOwnerViewModel { @NotNull
/*    */   Project getProject();
/*    */   @NotNull
/*    */   TextFieldState getTextState();
/*    */   @NotNull
/*    */   AttachedFilesViewModel getAttachedFiles();
/*    */   
/*    */   boolean getPerplexityModeEnabled();
/*    */   
/*    */   void submitTask(@NotNull PromptMode paramPromptMode);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls { public static boolean getPerplexityModeEnabled(@NotNull PromptOwnerViewModel $this) {
/* 15 */       return Registry.Companion.get("com.intellij.junie.perplexity.enabled").asBoolean();
/*    */     } }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\PromptOwnerViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */