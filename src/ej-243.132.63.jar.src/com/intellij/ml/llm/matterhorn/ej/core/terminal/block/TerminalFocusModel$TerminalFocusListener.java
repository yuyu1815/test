package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\002\n\002\020\013\n\000\bf\030\0002\0020\001J\b\020\002\032\0020\003H\026J\020\020\004\032\0020\0032\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalFocusModel$TerminalFocusListener;", "", "promptFocused", "", "activeStateChanged", "isActive", "", "ej-core"})
public interface TerminalFocusListener {
  void promptFocused();
  
  void activeStateChanged(boolean paramBoolean);
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {
    public static void promptFocused(@NotNull TerminalFocusModel.TerminalFocusListener $this) {}
    
    public static void activeStateChanged(@NotNull TerminalFocusModel.TerminalFocusListener $this, boolean isActive) {}
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalFocusModel$TerminalFocusListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */