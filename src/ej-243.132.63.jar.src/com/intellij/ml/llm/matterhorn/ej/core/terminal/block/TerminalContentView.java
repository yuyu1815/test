package com.intellij.ml.llm.matterhorn.ej.core.terminal.block;

import com.intellij.openapi.Disposable;
import com.intellij.util.concurrency.annotations.RequiresEdt;
import com.jediterm.core.util.TermSize;
import com.jediterm.terminal.TtyConnector;
import java.util.concurrent.CompletableFuture;
import javax.swing.JComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\bg\030\0002\0020\001J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH&J\n\020\016\032\004\030\0010\rH&J\f\020\017\032\006\022\002\b\0030\020H&J\b\020\021\032\0020\022H&J\030\020\023\032\0020\t2\006\020\024\032\0020\0252\006\020\026\032\0020\001H'J\020\020\027\032\0020\t2\006\020\030\032\0020\031H'R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;", "Lcom/intellij/openapi/Disposable;", "component", "Ljavax/swing/JComponent;", "getComponent", "()Ljavax/swing/JComponent;", "preferredFocusableComponent", "getPreferredFocusableComponent", "connectToTty", "", "ttyConnector", "Lcom/jediterm/terminal/TtyConnector;", "initialTermSize", "Lcom/jediterm/core/util/TermSize;", "getTerminalSize", "getTerminalSizeInitializedFuture", "Ljava/util/concurrent/CompletableFuture;", "isFocused", "", "addTerminationCallback", "onTerminated", "Ljava/lang/Runnable;", "parentDisposable", "sendCommandToExecute", "shellCommand", "", "ej-core"})
@Internal
public interface TerminalContentView extends Disposable {
  @NotNull
  JComponent getComponent();
  
  @NotNull
  JComponent getPreferredFocusableComponent();
  
  void connectToTty(@NotNull TtyConnector paramTtyConnector, @NotNull TermSize paramTermSize);
  
  @Nullable
  TermSize getTerminalSize();
  
  @NotNull
  CompletableFuture<?> getTerminalSizeInitializedFuture();
  
  boolean isFocused();
  
  @RequiresEdt(generateAssertion = false)
  void addTerminationCallback(@NotNull Runnable paramRunnable, @NotNull Disposable paramDisposable);
  
  @RequiresEdt(generateAssertion = false)
  void sendCommandToExecute(@NotNull String paramString);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\TerminalContentView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */