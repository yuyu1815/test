package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.prompt.error;

import java.util.EventListener;
import kotlin.Metadata;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\bg\030\0002\0020\001J\022\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H&¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorStateListener;", "Ljava/util/EventListener;", "errorStateChanged", "", "description", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/prompt/error/TerminalPromptErrorDescription;", "ej-core"})
@Internal
public interface TerminalPromptErrorStateListener extends EventListener {
  void errorStateChanged(@Nullable TerminalPromptErrorDescription paramTerminalPromptErrorDescription);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\prompt\error\TerminalPromptErrorStateListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */