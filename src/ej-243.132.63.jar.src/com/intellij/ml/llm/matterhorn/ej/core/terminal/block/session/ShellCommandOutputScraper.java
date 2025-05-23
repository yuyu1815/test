package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session;

import com.intellij.openapi.Disposable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\b`\030\0002\0020\001J\b\020\002\032\0020\003H&J\"\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\b\b\002\020\n\032\0020\013H&¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraper;", "", "scrapeOutput", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "addListener", "", "listener", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener;", "parentDisposable", "Lcom/intellij/openapi/Disposable;", "useExtendedDelayOnce", "", "ej-core"})
public interface ShellCommandOutputScraper {
  @NotNull
  StyledCommandOutput scrapeOutput();
  
  void addListener(@NotNull ShellCommandOutputListener paramShellCommandOutputListener, @NotNull Disposable paramDisposable, boolean paramBoolean);
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\session\ShellCommandOutputScraper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */