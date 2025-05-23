package com.intellij.ml.llm.matterhorn.ej.idea.run;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\020\020\006\032\0020\0032\006\020\007\032\0020\bH&¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;", "", "onBuildFinished", "", "hasErrors", "", "onBuildError", "errorEvent", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent;", "ej-idea"})
public interface BuildListener {
  void onBuildFinished(boolean paramBoolean);
  
  void onBuildError(@NotNull BuildErrorEvent paramBuildErrorEvent);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\BuildListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */