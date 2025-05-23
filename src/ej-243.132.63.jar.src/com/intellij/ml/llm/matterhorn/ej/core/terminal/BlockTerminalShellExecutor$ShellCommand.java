package com.intellij.ml.llm.matterhorn.ej.core.terminal;

import com.intellij.ml.llm.matterhorn.ShellExecutor;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b`\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\030\020\006\032\b\022\004\022\0020\b0\007X¦\004¢\006\006\032\004\b\t\020\nR\030\020\013\032\b\022\004\022\0020\0030\fX¦\004¢\006\006\032\004\b\r\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;", "", "command", "", "getCommand", "()Ljava/lang/String;", "promisedResult", "Lkotlinx/coroutines/Deferred;", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "getPromisedResult", "()Lkotlinx/coroutines/Deferred;", "outputFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getOutputFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "ej-core"})
public interface ShellCommand {
  @NotNull
  String getCommand();
  
  @NotNull
  Deferred<ShellExecutor.CommandResult> getPromisedResult();
  
  @NotNull
  StateFlow<String> getOutputFlow();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor$ShellCommand.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */