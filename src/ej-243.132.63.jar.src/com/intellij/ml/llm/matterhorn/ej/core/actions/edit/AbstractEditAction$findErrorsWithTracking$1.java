package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractEditAction.kt", l = {283, 286}, i = {1, 1}, s = {"L$0", "L$1"}, n = {"this", "context"}, m = "findErrorsWithTracking", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractEditAction$findErrorsWithTracking$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  AbstractEditAction$findErrorsWithTracking$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractEditAction.this.findErrorsWithTracking(null, null, null, null, null, (Continuation<? super List<? extends Error>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\AbstractEditAction$findErrorsWithTracking$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */