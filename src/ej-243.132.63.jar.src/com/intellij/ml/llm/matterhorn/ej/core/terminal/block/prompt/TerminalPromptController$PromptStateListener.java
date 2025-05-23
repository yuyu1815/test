package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;

import com.intellij.util.concurrency.annotations.RequiresEdt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\004\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\b\020\006\032\0020\003H\026J\020\020\007\032\0020\0032\006\020\b\032\0020\005H\027¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/TerminalPromptController$PromptStateListener;", "", "commandHistoryStateChanged", "", "showing", "", "commandSearchRequested", "promptVisibilityChanged", "visible", "ej-core"})
public interface PromptStateListener {
  void commandHistoryStateChanged(boolean paramBoolean);
  
  void commandSearchRequested();
  
  @RequiresEdt
  void promptVisibilityChanged(boolean paramBoolean);
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {
    public static void commandHistoryStateChanged(@NotNull TerminalPromptController.PromptStateListener $this, boolean showing) {}
    
    public static void commandSearchRequested(@NotNull TerminalPromptController.PromptStateListener $this) {}
    
    @RequiresEdt
    public static void promptVisibilityChanged(@NotNull TerminalPromptController.PromptStateListener $this, boolean visible) {}
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptController$PromptStateListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */