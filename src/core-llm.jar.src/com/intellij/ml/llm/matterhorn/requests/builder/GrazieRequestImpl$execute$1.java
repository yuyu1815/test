package com.intellij.ml.llm.matterhorn.requests.builder;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GrazieRequestImpl.kt", l = {108, 119, 121, 125, 139, 147, 158, 168, 189, 229, 243}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$10", "I$0", "I$1", "Z$0", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1", "I$2", "I$3", "I$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1"}, n = {"this", "context", "caps", "this", "context", "caps", "assistantAnswerPrefix", "this", "context", "caps", "assistantAnswerPrefix", "systemMsg", "tools", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "userMessage", "requestContext", "lastAnswerChoiceId", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "toolHandlers", "requestContext", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "toolHandlers", "answerContent", "requestContext", "assistantAnswer", "retries", "completionRequests", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "toolResults", "usage", "retries", "completionRequests", "isComplete", "haveToolResult", "anyToolFailed", "anyToolFinished", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "toolResults", "reviewResult", "formattedAnswer", "retries", "completionRequests", "haveToolResult", "anyToolFailed", "anyToolFinished", "this", "context", "caps", "assistantAnswerPrefix", "chat", "toolHandlers", "answerContent", "requestContext", "retries", "completionRequests"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.requests.builder.GrazieRequestImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class GrazieRequestImpl$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  Object L$8;
  
  Object L$9;
  
  Object L$10;
  
  Object L$11;
  
  int I$0;
  
  int I$1;
  
  int I$2;
  
  int I$3;
  
  int I$4;
  
  boolean Z$0;
  
  int label;
  
  GrazieRequestImpl$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieRequestImpl.this.execute(null, (Continuation<? super MatterhornChat>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\GrazieRequestImpl$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */