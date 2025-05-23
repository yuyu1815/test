package com.intellij.ml.llm.matterhorn.requests;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SimpleRequest.kt", l = {20, 23, 24, 27, 28}, i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"}, n = {"this", "context", "this", "context", "systemMsg", "this", "context", "systemMsg", "this", "context", "this", "assistantMessage"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.SimpleRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class SimpleRequest$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  SimpleRequest$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SimpleRequest.this.execute(null, (Continuation<? super MatterhornChat>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\SimpleRequest$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */