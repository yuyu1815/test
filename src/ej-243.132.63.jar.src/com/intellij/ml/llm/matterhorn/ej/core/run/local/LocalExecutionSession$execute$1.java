package com.intellij.ml.llm.matterhorn.ej.core.run.local;

import com.intellij.ml.llm.matterhorn.ej.core.Result;
import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionError;
import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LocalExecutionSession.kt", l = {19, 20, 23}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"this", "command", "this", "result"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.run.local.LocalExecutionSession")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class LocalExecutionSession$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  LocalExecutionSession$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LocalExecutionSession.this.execute(null, null, null, (Continuation<? super Result<ExecutionResult, ? extends ExecutionError>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\local\LocalExecutionSession$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */