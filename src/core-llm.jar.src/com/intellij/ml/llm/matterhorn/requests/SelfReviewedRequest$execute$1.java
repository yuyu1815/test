package com.intellij.ml.llm.matterhorn.requests;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SelfReviewedRequest.kt", l = {18, 33, 36, 37, 50, 55, 57}, i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0"}, n = {"this", "context", "this", "context", "chat", "originalChat", "findProblemsMessage", "i", "this", "context", "chat", "originalChat", "i", "this", "context", "chat", "originalChat", "message", "i", "this", "context", "chat", "message", "chatWithFix", "fixProblemsMessage", "i", "c", "this", "context", "chat", "message", "chatWithFix", "i", "c", "this", "context", "chatWithFix", "fixesMessage", "i"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.SelfReviewedRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class SelfReviewedRequest$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int I$0;
  
  int I$1;
  
  int I$2;
  
  int I$3;
  
  int label;
  
  SelfReviewedRequest$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SelfReviewedRequest.this.execute(null, (Continuation<? super MatterhornChat>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\SelfReviewedRequest$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */