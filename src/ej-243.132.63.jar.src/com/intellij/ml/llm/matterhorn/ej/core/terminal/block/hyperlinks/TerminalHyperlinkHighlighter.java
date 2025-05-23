/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.hyperlinks;
/*    */ 
/*    */ import com.intellij.execution.impl.ExpirableTokenProvider;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.CommandBlock;
/*    */ import kotlin.Pair;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\003\b\000\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ\b\020\034\032\0020\035H\002J\020\020\036\032\0020\0352\006\020\037\032\0020\016H\007R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\n\032\0020\013X\004¢\006\002\n\000R\034\020\f\032\020\022\004\022\0020\016\022\004\022\0020\017\030\0010\rX\016¢\006\002\n\000R\024\020\020\032\0020\0218BX\004¢\006\006\032\004\b\022\020\023R\024\020\024\032\0020\0258BX\004¢\006\006\032\004\b\026\020\027R\024\020\030\032\0020\0318BX\004¢\006\006\032\004\b\032\020\033¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/hyperlinks/TerminalHyperlinkHighlighter;", "", "project", "Lcom/intellij/openapi/project/Project;", "outputModel", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "<init>", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModel;Lcom/intellij/openapi/Disposable;)V", "filterWrapper", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/hyperlinks/CompositeFilterWrapper;", "lastUpdatedBlockInfo", "Lkotlin/Pair;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "Lcom/intellij/execution/impl/ExpirableTokenProvider;", "editor", "Lcom/intellij/openapi/editor/ex/EditorEx;", "getEditor", "()Lcom/intellij/openapi/editor/ex/EditorEx;", "document", "Lcom/intellij/openapi/editor/ex/DocumentEx;", "getDocument", "()Lcom/intellij/openapi/editor/ex/DocumentEx;", "hyperlinkSupport", "Lcom/intellij/execution/impl/EditorHyperlinkSupport;", "getHyperlinkSupport", "()Lcom/intellij/execution/impl/EditorHyperlinkSupport;", "rehighlightAll", "", "highlightHyperlinks", "block", "ej-core"})
/*    */ public final class TerminalHyperlinkHighlighter {
/*    */   @NotNull
/*    */   private final TerminalOutputModel outputModel;
/*    */   @NotNull
/*    */   private final CompositeFilterWrapper filterWrapper;
/*    */   @Nullable
/*    */   private Pair<? extends CommandBlock, ? extends ExpirableTokenProvider> lastUpdatedBlockInfo;
/*    */   
/* 17 */   public TerminalHyperlinkHighlighter(@NotNull Project project, @NotNull TerminalOutputModel outputModel, @NotNull Disposable parentDisposable) { this.outputModel = outputModel;
/*    */ 
/*    */     
/* 20 */     this.filterWrapper = new CompositeFilterWrapper(project, parentDisposable);
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
/* 33 */     this.filterWrapper.addFiltersUpdatedListener(this::_init_$lambda$0); } private final EditorEx getEditor() { return this.outputModel.getEditor(); } private static final Unit _init_$lambda$0(TerminalHyperlinkHighlighter this$0) { this$0.rehighlightAll(); return Unit.INSTANCE; }
/*    */   private final DocumentEx getDocument() { Intrinsics.checkNotNullExpressionValue(this.outputModel.getEditor().getDocument(), "getDocument(...)");
/*    */     return this.outputModel.getEditor().getDocument(); }
/*    */   private final EditorHyperlinkSupport getHyperlinkSupport() { Intrinsics.checkNotNullExpressionValue(EditorHyperlinkSupport.get((Editor)getEditor()), "get(...)");
/* 37 */     return EditorHyperlinkSupport.get((Editor)getEditor()); } private final void rehighlightAll() { for (CommandBlock block : this.outputModel.getBlocks())
/* 38 */       highlightHyperlinks(block);  }
/*    */ 
/*    */   
/*    */   @RequiresEdt
/*    */   public final void highlightHyperlinks(@NotNull CommandBlock block) {
/*    */     CompositeFilter filter;
/* 44 */     Intrinsics.checkNotNullParameter(block, "block"); if (this.filterWrapper.getFilter() == null) { this.filterWrapper.getFilter(); return; }
/* 45 */      Pair<? extends CommandBlock, ? extends ExpirableTokenProvider> it = this.lastUpdatedBlockInfo; int $i$a$-let-TerminalHyperlinkHighlighter$highlightHyperlinks$1 = 0;
/* 46 */     if (Intrinsics.areEqual(it.getFirst(), block)) {
/* 47 */       ((ExpirableTokenProvider)it.getSecond()).invalidateAll();
/*    */     }
/*    */     
/* 50 */     ExpirableTokenProvider expirableTokenProvider = new ExpirableTokenProvider();
/* 51 */     this.lastUpdatedBlockInfo = TuplesKt.to(block, expirableTokenProvider);
/*    */     
/* 53 */     getHyperlinkSupport().clearHyperlinks(block.getOutputStartOffset(), block.getEndOffset());
/*    */     
/* 55 */     if (CommandBlockImplKt.getWithOutput(block)) {
/* 56 */       int startLine = getDocument().getLineNumber(block.getOutputStartOffset());
/* 57 */       int endLine = getDocument().getLineNumber(Math.min(block.getEndOffset(), getDocument().getTextLength()));
/* 58 */       getHyperlinkSupport().highlightHyperlinksLater((Filter)filter, startLine, endLine, expirableTokenProvider.createExpirable());
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\hyperlinks\TerminalHyperlinkHighlighter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */