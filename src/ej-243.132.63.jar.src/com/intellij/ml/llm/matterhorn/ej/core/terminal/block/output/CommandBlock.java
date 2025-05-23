package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;

import com.intellij.util.concurrency.annotations.RequiresEdt;
import kotlin.Metadata;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\b\n\002\b\016\n\002\020\013\n\000\n\002\030\002\n\000\bw\030\0002\0020\001R\024\020\002\032\004\030\0010\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\004\030\0010\003X¦\004¢\006\006\032\004\b\007\020\005R\024\020\b\032\004\030\0010\003X¦\004¢\006\006\032\004\b\t\020\005R\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\022\020\016\032\0020\013X¦\004¢\006\006\032\004\b\017\020\rR\022\020\020\032\0020\013X¦\004¢\006\006\032\004\b\021\020\rR\022\020\022\032\0020\013X¦\004¢\006\006\032\004\b\023\020\rR$\020\025\032\0020\0132\006\020\024\032\0020\0138g@gX¦\016¢\006\f\032\004\b\026\020\r\"\004\b\027\020\030R\022\020\031\032\0020\032X¦\004¢\006\006\032\004\b\031\020\033\001\001\034¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "", "command", "", "getCommand", "()Ljava/lang/String;", "prompt", "getPrompt", "rightPrompt", "getRightPrompt", "startOffset", "", "getStartOffset", "()I", "endOffset", "getEndOffset", "commandStartOffset", "getCommandStartOffset", "outputStartOffset", "getOutputStartOffset", "value", "trimmedLinesCount", "getTrimmedLinesCount", "setTrimmedLinesCount", "(I)V", "isFinalized", "", "()Z", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlockImpl;", "ej-core"})
@Internal
public interface CommandBlock {
  @Nullable
  String getCommand();
  
  @Nullable
  String getPrompt();
  
  @Nullable
  String getRightPrompt();
  
  int getStartOffset();
  
  int getEndOffset();
  
  int getCommandStartOffset();
  
  int getOutputStartOffset();
  
  @RequiresEdt
  int getTrimmedLinesCount();
  
  @RequiresEdt
  void setTrimmedLinesCount(int paramInt);
  
  boolean isFinalized();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\CommandBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */