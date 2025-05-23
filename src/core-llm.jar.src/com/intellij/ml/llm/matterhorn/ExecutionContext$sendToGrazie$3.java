package com.intellij.ml.llm.matterhorn;

import com.intellij.ml.llm.matterhorn.requests.GrazieRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExecutionContext.kt", l = {276}, i = {0}, s = {"Z$0"}, n = {"allowToolUse"}, m = "sendToGrazie", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ExecutionContext$sendToGrazie$3 extends ContinuationImpl {
  boolean Z$0;
  
  int label;
  
  ExecutionContext$sendToGrazie$3(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExecutionContext.this.sendToGrazie((GrazieRequest)null, false, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$sendToGrazie$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */