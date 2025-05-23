package com.intellij.ml.llm.matterhorn.requests.builder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AssistantMessageCounterpartHandler.kt", l = {10}, i = {}, s = {}, n = {}, m = "handle", c = "com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageCounterpartHandler")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AssistantMessageCounterpartHandler$handle$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AssistantMessageCounterpartHandler$handle$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AssistantMessageCounterpartHandler.this.handle(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantMessageCounterpartHandler$handle$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */