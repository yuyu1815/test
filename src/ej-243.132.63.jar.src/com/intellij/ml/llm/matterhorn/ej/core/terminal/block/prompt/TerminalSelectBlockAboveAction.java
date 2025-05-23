/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.TerminalDataContextUtils;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalSelectBlockAboveAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalOutputSelectionAction;", "<init>", "()V", "actionPerformed", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "ej-core"})
/*    */ public final class TerminalSelectBlockAboveAction
/*    */   extends TerminalOutputSelectionAction
/*    */ {
/*    */   public void actionPerformed(@NotNull AnActionEvent e) {
/* 49 */     Intrinsics.checkNotNullParameter(e, "e"); if (TerminalDataContextUtils.INSTANCE.getSelectionController$ej_core(e) != null) { TerminalDataContextUtils.INSTANCE.getSelectionController$ej_core(e).selectRelativeBlock(false, true); } else { TerminalDataContextUtils.INSTANCE.getSelectionController$ej_core(e); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalSelectBlockAboveAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */