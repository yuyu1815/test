/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;
/*    */ 
/*    */ import com.jediterm.terminal.model.TerminalLine;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\004\n\002\030\002\n\000\b\000\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\004\b\b\020\tJ\020\020\n\032\0020\0072\006\020\013\032\0020\fH\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\032\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StylesCollectingTerminalLinesCollector;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/TerminalLinesCollector;", "delegate", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;", "stylesConsumer", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyleRange;", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;Lkotlin/jvm/functions/Function1;)V", "addLine", "line", "Lcom/jediterm/terminal/model/TerminalLine;", "ej-core"})
/*    */ public final class StylesCollectingTerminalLinesCollector implements TerminalLinesCollector {
/*    */   @NotNull
/*    */   private final StringCollector delegate;
/*    */   
/* 10 */   public StylesCollectingTerminalLinesCollector(@NotNull StringCollector delegate, @NotNull Function1<StyleRange, Unit> stylesConsumer) { this.delegate = delegate;
/* 11 */     this.stylesConsumer = stylesConsumer; } @NotNull
/*    */   private final Function1<StyleRange, Unit> stylesConsumer; public void flush() {
/*    */     TerminalLinesCollector.DefaultImpls.flush(this);
/*    */   } public void addLine(@NotNull TerminalLine line) {
/* 15 */     Intrinsics.checkNotNullParameter(line, "line"); line.forEachEntry(this::addLine$lambda$0);
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
/* 27 */     if (!line.isWrapped())
/* 28 */       this.delegate.newline(); 
/*    */   }
/*    */   
/*    */   private static final void addLine$lambda$0(StylesCollectingTerminalLinesCollector this$0, TerminalLine.TextEntry entry) {
/*    */     Intrinsics.checkNotNullExpressionValue(entry.getText(), "getText(...)");
/*    */     String text = TerminalUiUtilsKt.normalize(entry.getText());
/*    */     if (((((CharSequence)text).length() > 0)) && !entry.isNul()) {
/*    */       this$0.delegate.write(text);
/*    */       if (!Intrinsics.areEqual(entry.getStyle(), TextStyle.EMPTY)) {
/*    */         int endOffset = this$0.delegate.length();
/*    */         int startOffset = endOffset - text.length();
/*    */         Intrinsics.checkNotNullExpressionValue(entry.getStyle(), "getStyle(...)");
/*    */         StyleRange style = new StyleRange(startOffset, endOffset, entry.getStyle());
/*    */         this$0.stylesConsumer.invoke(style);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\StylesCollectingTerminalLinesCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */