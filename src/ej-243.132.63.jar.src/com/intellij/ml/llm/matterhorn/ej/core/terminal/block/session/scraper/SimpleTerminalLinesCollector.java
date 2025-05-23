/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;
/*    */ import com.jediterm.terminal.model.TerminalLine;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\026J\b\020\n\032\0020\007H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/SimpleTerminalLinesCollector;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/TerminalLinesCollector;", "delegate", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/StringCollector;)V", "addLine", "", "line", "Lcom/jediterm/terminal/model/TerminalLine;", "flush", "ej-core"})
/*    */ public final class SimpleTerminalLinesCollector implements TerminalLinesCollector {
/*    */   public SimpleTerminalLinesCollector(@NotNull StringCollector delegate) {
/*  8 */     this.delegate = delegate;
/*    */   } @NotNull
/*    */   private final StringCollector delegate;
/*    */   public void addLine(@NotNull TerminalLine line) {
/* 12 */     Intrinsics.checkNotNullParameter(line, "line"); line.forEachEntry(this::addLine$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     if (!line.isWrapped())
/* 19 */       this.delegate.newline(); 
/*    */   } private static final void addLine$lambda$0(SimpleTerminalLinesCollector this$0, TerminalLine.TextEntry entry) { Intrinsics.checkNotNullExpressionValue(entry.getText(), "getText(...)");
/*    */     String text = TerminalUiUtilsKt.normalize(entry.getText());
/*    */     if (((((CharSequence)text).length() > 0)) && !entry.isNul())
/*    */       this$0.delegate.write(text);  } public void flush() {
/* 24 */     this.delegate.buildText();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\SimpleTerminalLinesCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */