package com.intellij.ml.llm.matterhorn.ej.idea.run;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\b\020\002\032\0020\003H&J\020\020\004\032\0020\0032\006\020\005\032\0020\006H&J\b\020\007\032\0020\003H&¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestListener;", "", "onBuildFinished", "", "onTestFinished", "testEvent", "Lcom/intellij/ml/llm/matterhorn/ej/idea/run/TestEvent;", "onTestingFinished", "ej-idea"})
public interface TestListener {
  void onBuildFinished();
  
  void onTestFinished(@NotNull TestEvent paramTestEvent);
  
  void onTestingFinished();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\TestListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */