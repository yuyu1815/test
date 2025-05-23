package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ShellExecutor.kt", l = {84, 88, 91}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "$this$waitForCommandCompletion", "job"}, m = "waitForCommandCompletion", c = "com.intellij.ml.llm.matterhorn.ShellExecutor$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ShellExecutor$Companion$waitForCommandCompletion$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  ShellExecutor$Companion$waitForCommandCompletion$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ShellExecutor.Companion.this.waitForCommandCompletion(null, null, (Continuation<? super ShellExecutor.Companion.CompletionStatus>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ShellExecutor$Companion$waitForCommandCompletion$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */