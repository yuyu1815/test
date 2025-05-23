/*   */ package com.intellij.ml.llm.matterhorn.ej.core.actions.tools;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\b\026\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006R\024\020\007\032\0020\bXD¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/CreateFileToolAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction;", "errorCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "<init>", "(Ljava/util/List;)V", "docstring", "", "getDocstring", "()Ljava/lang/String;", "ej-core"})
/*   */ public class CreateFileToolAction extends CreateFileAgentAction {
/* 6 */   public CreateFileToolAction(@NotNull List errorCheckers) { super(errorCheckers);
/* 7 */     this.docstring = "Creates and opens a new file with the given name and given content."; } @NotNull private final String docstring; @NotNull public String getDocstring() { return this.docstring; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\tools\CreateFileToolAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */