package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;

import com.intellij.openapi.Disposable;
import com.intellij.terminal.completion.spec.ShellCommandResult;
import kotlin.Metadata;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b`\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\026\020\006\032\b\022\004\022\0020\b0\0072\006\020\004\032\0020\005H&J\020\020\t\032\0020\0032\006\020\n\032\0020\013H&J\020\020\f\032\0020\0032\006\020\r\032\0020\016H&J\030\020\f\032\0020\0032\006\020\r\032\0020\0162\006\020\017\032\0020\020H&¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManager;", "", "sendCommandToExecute", "", "shellCommand", "", "runGeneratorAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/intellij/terminal/completion/spec/ShellCommandResult;", "sendKeyBinding", "keyBinding", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/KeyBinding;", "addListener", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandSentListener;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "ej-core"})
public interface ShellCommandExecutionManager {
  void sendCommandToExecute(@NotNull String paramString);
  
  @NotNull
  Deferred<ShellCommandResult> runGeneratorAsync(@NotNull String paramString);
  
  void sendKeyBinding(@NotNull KeyBinding paramKeyBinding);
  
  void addListener(@NotNull ShellCommandSentListener paramShellCommandSentListener);
  
  void addListener(@NotNull ShellCommandSentListener paramShellCommandSentListener, @NotNull Disposable paramDisposable);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandExecutionManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */