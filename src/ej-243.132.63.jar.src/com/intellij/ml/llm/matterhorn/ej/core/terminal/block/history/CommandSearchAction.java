/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.codeInsight.lookup.LookupManager;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.TerminalPromotedEditorAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.TerminalDataContextUtils;
/*    */ import com.intellij.openapi.actionSystem.ActionUpdateThread;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.actionSystem.remoting.ActionRemoteBehaviorSpecification;
/*    */ import com.intellij.openapi.editor.Caret;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\b\000\030\0002\0020\0012\0020\002:\001\007B\007¢\006\004\b\003\020\004J\b\020\005\032\0020\006H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalPromotedEditorAction;", "Lcom/intellij/openapi/actionSystem/remoting/ActionRemoteBehaviorSpecification$Disabled;", "<init>", "()V", "getActionUpdateThread", "Lcom/intellij/openapi/actionSystem/ActionUpdateThread;", "Handler", "ej-core"})
/*    */ public final class CommandSearchAction extends TerminalPromotedEditorAction implements ActionRemoteBehaviorSpecification.Disabled {
/* 18 */   public CommandSearchAction() { super(new Handler()); } @NotNull
/* 19 */   public ActionUpdateThread getActionUpdateThread() { return ActionUpdateThread.EDT; }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\"\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H\024J\"\020\f\032\0020\r2\006\020\006\032\0020\0072\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\013H\024¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchAction$Handler;", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "<init>", "()V", "doExecute", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "caret", "Lcom/intellij/openapi/editor/Caret;", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "isEnabledForCaret", "", "ej-core"})
/*    */   private static final class Handler extends EditorActionHandler { protected void doExecute(@NotNull Editor editor, @Nullable Caret caret, @NotNull DataContext dataContext) {
/* 23 */       Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(dataContext, "dataContext"); if (LookupManager.getActiveLookup(editor) != null) { LookupManager.getActiveLookup(editor).hideLookup(true); } else { LookupManager.getActiveLookup(editor); }
/* 24 */        if (TerminalDataContextUtils.INSTANCE.getPromptController$ej_core(dataContext) != null) { TerminalDataContextUtils.INSTANCE.getPromptController$ej_core(dataContext).showCommandSearch(); } else { TerminalDataContextUtils.INSTANCE.getPromptController$ej_core(dataContext); }
/*    */     
/*    */     }
/*    */     protected boolean isEnabledForCaret(@NotNull Editor editor, @NotNull Caret caret, @Nullable DataContext dataContext) {
/* 28 */       Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(caret, "caret"); return TerminalDataContextUtils.INSTANCE.isPromptEditor(editor);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandSearchAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */