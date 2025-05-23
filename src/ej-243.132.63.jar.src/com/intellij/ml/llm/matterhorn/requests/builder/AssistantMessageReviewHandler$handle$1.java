package com.intellij.ml.llm.matterhorn.requests.builder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AssistantMessageReviewHandler.kt", l = {14}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "context", "reviewResult"}, m = "handle", c = "com.intellij.ml.llm.matterhorn.requests.builder.AssistantMessageReviewHandler")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AssistantMessageReviewHandler$handle$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  AssistantMessageReviewHandler$handle$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AssistantMessageReviewHandler.this.handle(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantMessageReviewHandler$handle$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */