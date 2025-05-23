/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalPromotedDumbAwareAction;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.AnActionEvent;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b \030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalOutputSelectionAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalPromotedDumbAwareAction;", "<init>", "()V", "update", "", "e", "Lcom/intellij/openapi/actionSystem/AnActionEvent;", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "ej-core"})
/*    */ public abstract class TerminalOutputSelectionAction
/*    */   extends TerminalPromotedDumbAwareAction
/*    */ {
/*    */   public void update(@NotNull AnActionEvent e) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'e'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: invokevirtual getPresentation : ()Lcom/intellij/openapi/actionSystem/Presentation;
/*    */     //   10: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils;
/*    */     //   13: aload_1
/*    */     //   14: invokevirtual getEditor : (Lcom/intellij/openapi/actionSystem/AnActionEvent;)Lcom/intellij/openapi/editor/Editor;
/*    */     //   17: dup
/*    */     //   18: ifnull -> 40
/*    */     //   21: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils;
/*    */     //   24: swap
/*    */     //   25: invokevirtual isOutputEditor : (Lcom/intellij/openapi/editor/Editor;)Z
/*    */     //   28: iconst_1
/*    */     //   29: if_icmpne -> 36
/*    */     //   32: iconst_1
/*    */     //   33: goto -> 42
/*    */     //   36: iconst_0
/*    */     //   37: goto -> 42
/*    */     //   40: pop
/*    */     //   41: iconst_0
/*    */     //   42: ifeq -> 71
/*    */     //   45: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils;
/*    */     //   48: aload_1
/*    */     //   49: invokevirtual getSelectionController$ej_core : (Lcom/intellij/openapi/actionSystem/AnActionEvent;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalSelectionController;
/*    */     //   52: dup
/*    */     //   53: ifnull -> 62
/*    */     //   56: invokevirtual getPrimarySelection : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;
/*    */     //   59: goto -> 64
/*    */     //   62: pop
/*    */     //   63: aconst_null
/*    */     //   64: ifnull -> 71
/*    */     //   67: iconst_1
/*    */     //   68: goto -> 72
/*    */     //   71: iconst_0
/*    */     //   72: invokevirtual setEnabledAndVisible : (Z)V
/*    */     //   75: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #27	-> 6
/*    */     //   #28	-> 45
/*    */     //   #27	-> 72
/*    */     //   #29	-> 75
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	76	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalOutputSelectionAction;
/*    */     //   0	76	1	e	Lcom/intellij/openapi/actionSystem/AnActionEvent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ActionUpdateThread getActionUpdateThread() {
/* 31 */     return ActionUpdateThread.EDT;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalOutputSelectionAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */