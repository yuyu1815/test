/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;
/*    */ 
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.editor.Caret;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\001¢\006\004\b\003\020\004J\"\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\n2\006\020\013\032\0020\fH\024J\"\020\r\032\0020\0162\006\020\007\032\0020\b2\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\024R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptSelectAllHandler;", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "originalHandler", "<init>", "(Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;)V", "doExecute", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "caret", "Lcom/intellij/openapi/editor/Caret;", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "isEnabledForCaret", "", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nTerminalPromptSelectAllHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalPromptSelectAllHandler.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptSelectAllHandler\n+ 2 actions.kt\ncom/intellij/openapi/command/ActionsKt\n*L\n1#1,29:1\n7#2,6:30\n*S KotlinDebug\n*F\n+ 1 TerminalPromptSelectAllHandler.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptSelectAllHandler\n*L\n18#1:30,6\n*E\n"})
/*    */ public final class TerminalPromptSelectAllHandler extends EditorActionHandler {
/* 14 */   public TerminalPromptSelectAllHandler(@NotNull EditorActionHandler originalHandler) { this.originalHandler = originalHandler; } @NotNull
/*    */   private final EditorActionHandler originalHandler; protected void doExecute(@NotNull Editor editor, @Nullable Caret caret, @NotNull DataContext dataContext) {
/* 16 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(dataContext, "dataContext"); TerminalPromptModel promptModel = TerminalDataContextUtils.INSTANCE.getTerminalPromptModel(editor);
/*    */     
/* 18 */     Project project = (Project)CommonDataKeys.PROJECT.getData(dataContext); String name$iv = IdeBundle.message("command.select.all", new Object[0]);
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
/* 32 */     String groupId$iv = null;
/*    */     int $i$f$executeCommand = 0;
/* 34 */     CommandProcessor.getInstance().executeCommand(project, new TerminalPromptSelectAllHandler$doExecute$$inlined$executeCommand$default$1(editor, promptModel), name$iv, groupId$iv);
/*    */     this.originalHandler.execute(editor, caret, dataContext);
/*    */   }
/*    */   
/*    */   protected boolean isEnabledForCaret(@NotNull Editor editor, @NotNull Caret caret, @Nullable DataContext dataContext) {
/*    */     Intrinsics.checkNotNullParameter(editor, "editor");
/*    */     Intrinsics.checkNotNullParameter(caret, "caret");
/*    */     return (TerminalDataContextUtils.INSTANCE.isPromptEditor(editor) || this.originalHandler.isEnabled(editor, caret, dataContext));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptSelectAllHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */