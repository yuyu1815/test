package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;

import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ActivityHandle.kt", l = {16}, i = {0}, s = {"L$0"}, n = {"this"}, m = "awaitOpResult", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityHandle")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ActivityHandle$awaitOpResult$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  ActivityHandle$awaitOpResult$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ActivityHandle.this.awaitOpResult((Continuation<? super OpResult<? extends Err, ? extends Val>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityHandle$awaitOpResult$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */