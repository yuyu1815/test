package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt;

import com.intellij.util.concurrency.annotations.RequiresEdt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
public final class DefaultImpls {
  public static void commandHistoryStateChanged(@NotNull TerminalPromptController.PromptStateListener $this, boolean showing) {}
  
  public static void commandSearchRequested(@NotNull TerminalPromptController.PromptStateListener $this) {}
  
  @RequiresEdt
  public static void promptVisibilityChanged(@NotNull TerminalPromptController.PromptStateListener $this, boolean visible) {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\TerminalPromptController$PromptStateListener$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */