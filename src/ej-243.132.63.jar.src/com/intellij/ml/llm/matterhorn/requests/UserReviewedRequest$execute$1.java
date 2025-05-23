package com.intellij.ml.llm.matterhorn.requests;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "UserReviewedRequest.kt", l = {49, 61, 82, 88, 89}, i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1"}, n = {"$this", "context", "$this", "context", "chat", "answer", "matterhornChatMessage", "lastAnswer", "completionRequests", "attempt", "$this", "context", "chat", "review", "fixReviewMessage", "completionRequests", "attempt", "$this", "context", "chat", "review", "answer", "completionRequests", "attempt", "$this", "context", "chat", "review", "answer", "message", "completionRequests", "attempt"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.requests.UserReviewedRequest")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class UserReviewedRequest$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  UserReviewedRequest$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return UserReviewedRequest.execute$suspendImpl(UserReviewedRequest.this, null, (Continuation<? super MatterhornChat>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\UserReviewedRequest$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */