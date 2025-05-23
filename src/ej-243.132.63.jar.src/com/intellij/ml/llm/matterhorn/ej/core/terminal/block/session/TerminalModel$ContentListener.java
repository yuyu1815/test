package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\bf\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$ContentListener;", "", "onContentChanged", "", "ej-core"})
public interface ContentListener {
  void onContentChanged();
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {
    public static void onContentChanged(@NotNull TerminalModel.ContentListener $this) {}
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\TerminalModel$ContentListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */