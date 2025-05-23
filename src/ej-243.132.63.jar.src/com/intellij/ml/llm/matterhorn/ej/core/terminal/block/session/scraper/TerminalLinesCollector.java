package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.scraper;

import com.jediterm.terminal.model.TerminalLine;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b`\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\b\020\006\032\0020\003H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/scraper/TerminalLinesCollector;", "", "addLine", "", "line", "Lcom/jediterm/terminal/model/TerminalLine;", "flush", "ej-core"})
public interface TerminalLinesCollector {
  void addLine(@NotNull TerminalLine paramTerminalLine);
  
  void flush();
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {
    public static void flush(@NotNull TerminalLinesCollector $this) {}
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\scraper\TerminalLinesCollector.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */