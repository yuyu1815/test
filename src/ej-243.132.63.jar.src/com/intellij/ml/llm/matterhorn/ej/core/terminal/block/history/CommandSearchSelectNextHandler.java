/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.history;
/*    */ 
/*    */ import com.intellij.codeInsight.lookup.Lookup;
/*    */ import com.intellij.codeInsight.lookup.LookupEx;
/*    */ import com.intellij.codeInsight.lookup.LookupManager;
/*    */ import com.intellij.codeInsight.lookup.impl.LookupImpl;
/*    */ import com.intellij.openapi.actionSystem.DataContext;
/*    */ import com.intellij.openapi.editor.Caret;
/*    */ import com.intellij.openapi.editor.Editor;
/*    */ import com.intellij.openapi.editor.actionSystem.EditorActionHandler;
/*    */ import com.intellij.ui.ScrollingUtil;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\001¢\006\004\b\003\020\004J$\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\n2\b\020\013\032\004\030\0010\fH\024J\"\020\r\032\0020\0162\006\020\007\032\0020\b2\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\024R\016\020\002\032\0020\001X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchSelectNextHandler;", "Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;", "originalHandler", "<init>", "(Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;)V", "doExecute", "", "editor", "Lcom/intellij/openapi/editor/Editor;", "caret", "Lcom/intellij/openapi/editor/Caret;", "dataContext", "Lcom/intellij/openapi/actionSystem/DataContext;", "isEnabledForCaret", "", "ej-core"})
/*    */ public final class CommandSearchSelectNextHandler
/*    */   extends EditorActionHandler
/*    */ {
/*    */   @NotNull
/*    */   private final EditorActionHandler originalHandler;
/*    */   
/*    */   public CommandSearchSelectNextHandler(@NotNull EditorActionHandler originalHandler) {
/* 33 */     this.originalHandler = originalHandler;
/*    */   } protected void doExecute(@NotNull Editor editor, @Nullable Caret caret, @Nullable DataContext dataContext) {
/* 35 */     Intrinsics.checkNotNullParameter(editor, "editor"); LookupEx lookupEx = LookupManager.getActiveLookup(editor); LookupImpl lookup = (lookupEx instanceof LookupImpl) ? (LookupImpl)lookupEx : null;
/* 36 */     if ((lookup != null) ? ((CommandSearchPresenter.Companion.isTerminalCommandSearch((Lookup)lookup) == true)) : false) {
/* 37 */       ScrollingUtil.moveUp(lookup.getList(), 0);
/* 38 */       lookup.markSelectionTouched();
/* 39 */       lookup.refreshUi(false, true);
/*    */     } else {
/* 41 */       this.originalHandler.execute(editor, caret, dataContext);
/*    */     } 
/*    */   }
/*    */   
/*    */   protected boolean isEnabledForCaret(@NotNull Editor editor, @NotNull Caret caret, @Nullable DataContext dataContext) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'editor'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'caret'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/TerminalDataContextUtils;
/*    */     //   15: aload_1
/*    */     //   16: invokevirtual isPromptEditor : (Lcom/intellij/openapi/editor/Editor;)Z
/*    */     //   19: ifeq -> 57
/*    */     //   22: aload_1
/*    */     //   23: invokestatic getActiveLookup : (Lcom/intellij/openapi/editor/Editor;)Lcom/intellij/codeInsight/lookup/LookupEx;
/*    */     //   26: dup
/*    */     //   27: ifnull -> 52
/*    */     //   30: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchPresenter$Companion;
/*    */     //   33: swap
/*    */     //   34: checkcast com/intellij/codeInsight/lookup/Lookup
/*    */     //   37: invokevirtual isTerminalCommandSearch : (Lcom/intellij/codeInsight/lookup/Lookup;)Z
/*    */     //   40: iconst_1
/*    */     //   41: if_icmpne -> 48
/*    */     //   44: iconst_1
/*    */     //   45: goto -> 54
/*    */     //   48: iconst_0
/*    */     //   49: goto -> 54
/*    */     //   52: pop
/*    */     //   53: iconst_0
/*    */     //   54: ifne -> 70
/*    */     //   57: aload_0
/*    */     //   58: getfield originalHandler : Lcom/intellij/openapi/editor/actionSystem/EditorActionHandler;
/*    */     //   61: aload_1
/*    */     //   62: aload_2
/*    */     //   63: aload_3
/*    */     //   64: invokevirtual isEnabled : (Lcom/intellij/openapi/editor/Editor;Lcom/intellij/openapi/editor/Caret;Lcom/intellij/openapi/actionSystem/DataContext;)Z
/*    */     //   67: ifeq -> 74
/*    */     //   70: iconst_1
/*    */     //   71: goto -> 75
/*    */     //   74: iconst_0
/*    */     //   75: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 12
/*    */     //   #46	-> 57
/*    */     //   #45	-> 75
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	76	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/history/CommandSearchSelectNextHandler;
/*    */     //   0	76	1	editor	Lcom/intellij/openapi/editor/Editor;
/*    */     //   0	76	2	caret	Lcom/intellij/openapi/editor/Caret;
/*    */     //   0	76	3	dataContext	Lcom/intellij/openapi/actionSystem/DataContext;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\history\CommandSearchSelectNextHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */