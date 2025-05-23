package com.intellij.ml.llm.matterhorn.ej.core.terminal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {225}, i = {0}, s = {"L$0"}, n = {"bytes"}, m = "sendControlSequence", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class BlockTerminalShellExecutor$sendControlSequence$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  BlockTerminalShellExecutor$sendControlSequence$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return BlockTerminalShellExecutor.this.sendControlSequence(null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor$sendControlSequence$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */