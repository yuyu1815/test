/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.BlockTerminalOptions;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b0\030\0002\0020\001B\021\b\004\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\030\020\n\032\0020\0132\006\020\b\032\0020\t2\006\020\f\032\0020\007H\026J\020\020\r\032\0020\0132\006\020\b\032\0020\tH\026J\b\020\016\032\0020\017H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000\001\003\020\021\022¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalSwitchPromptStyleAction;", "Lcom/intellij/openapi/project/DumbAwareToggleAction;", "style", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptStyle;)V", "isSelected", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "setSelected", "", "state", "update", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalUseDoubleLinePromptAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalUseShellPromptAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalUseSingleLinePromptAction;", "ej-core"})
/*    */ public abstract class TerminalSwitchPromptStyleAction extends DumbAwareToggleAction {
/* 10 */   private TerminalSwitchPromptStyleAction(TerminalPromptStyle style) { this.style = style; } @NotNull
/*    */   private final TerminalPromptStyle style; public boolean isSelected(@NotNull AnActionEvent e) {
/* 12 */     Intrinsics.checkNotNullParameter(e, "e"); return (BlockTerminalOptions.Companion.getInstance().getPromptStyle() == this.style);
/*    */   }
/*    */   
/*    */   public void setSelected(@NotNull AnActionEvent e, boolean state) {
/* 16 */     Intrinsics.checkNotNullParameter(e, "e"); if (state) {
/* 17 */       BlockTerminalOptions.Companion.getInstance().setPromptStyle(this.style);
/*    */     }
/*    */   }
/*    */   
/*    */   public void update(@NotNull AnActionEvent e) {
/* 22 */     Intrinsics.checkNotNullParameter(e, "e"); super.update(e);
/* 23 */     e.getPresentation().setKeepPopupOnPerform(KeepPopupOnPerform.IfRequested);
/*    */   } @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 26 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalSwitchPromptStyleAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */