/*   */ package com.intellij.ml.llm.matterhorn.ej.core.actions.tools;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\030\0002\0020\0012\0020\002B\017\022\006\020\003\032\0020\004¢\006\004\b\005\020\006R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/BashToolAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/BashAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/tools/ToolAction;", "type", "", "<init>", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "ej-core"})
/*   */ public final class BashToolAction extends BashAction implements ToolAction {
/* 5 */   public BashToolAction(@NotNull String type) { this.type = type; } @NotNull private final String type; @NotNull public String getType() { return this.type; }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\tools\BashToolAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */