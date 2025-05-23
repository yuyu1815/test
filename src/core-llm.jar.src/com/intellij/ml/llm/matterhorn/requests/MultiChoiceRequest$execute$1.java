package com.intellij.ml.llm.matterhorn.requests;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "MultiChoiceRequest.kt", l = {18, 22, 23, 39, 43, 57, 61, 63}, i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0"}, n = {"this", "context", "this", "context", "systemMsg", "this", "context", "systemMsg", "this", "context", "assistantChoices", "chat", "overriddenParameters", "iteration", "this", "context", "assistantChoices", "chat", "iteration", "this", "context", "assistantChoices", "this", "context", "assistantChoices", "this"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.MultiChoiceRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class MultiChoiceRequest$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  MultiChoiceRequest$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return MultiChoiceRequest.this.execute(null, (Continuation<? super MatterhornChat>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\MultiChoiceRequest$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */