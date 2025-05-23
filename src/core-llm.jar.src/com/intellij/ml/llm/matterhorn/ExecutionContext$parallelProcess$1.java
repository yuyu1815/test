package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExecutionContext.kt", l = {100}, i = {0, 0}, s = {"L$0", "Z$0"}, n = {"this_$iv", "wasRunning$iv"}, m = "parallelProcess", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ExecutionContext$parallelProcess$1<T> extends ContinuationImpl {
  Object L$0;
  
  boolean Z$0;
  
  int label;
  
  ExecutionContext$parallelProcess$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExecutionContext.this.parallelProcess(null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$parallelProcess$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */