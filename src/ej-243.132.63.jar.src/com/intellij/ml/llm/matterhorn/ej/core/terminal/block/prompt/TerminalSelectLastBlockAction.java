/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalPromotedDumbAwareAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.TerminalDataContextUtils;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\020\020\b\032\0020\0052\006\020\006\032\0020\007H\026J\b\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalSelectLastBlockAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalPromotedDumbAwareAction;", "<init>", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "update", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-core"})
/*    */ public final class TerminalSelectLastBlockAction
/*    */   extends TerminalPromotedDumbAwareAction {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/* 15 */     Intrinsics.checkNotNullParameter(e, "e"); if (TerminalDataContextUtils.INSTANCE.getSelectionController$ej_core(e) != null) { TerminalDataContextUtils.INSTANCE.getSelectionController$ej_core(e).selectLastBlock(); } else { TerminalDataContextUtils.INSTANCE.getSelectionController$ej_core(e); }
/*    */   
/*    */   }
/*    */   public void update(@NotNull AnActionEvent e) {
/* 19 */     Intrinsics.checkNotNullParameter(e, "e"); TerminalDataContextUtils.INSTANCE.getEditor(e); e.getPresentation().setEnabledAndVisible((TerminalDataContextUtils.INSTANCE.getEditor(e) != null) ? ((TerminalDataContextUtils.INSTANCE.isPromptEditor(TerminalDataContextUtils.INSTANCE.getEditor(e)) == true)) : false);
/*    */   } @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 22 */     return ActionUpdateThread.BGT;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalSelectLastBlockAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */