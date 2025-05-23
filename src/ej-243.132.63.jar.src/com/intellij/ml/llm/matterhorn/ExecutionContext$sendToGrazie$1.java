package com.intellij.ml.llm.matterhorn;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExecutionContext.kt", l = {202, 205, 242}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"}, n = {"this", "chat", "modelParameters", "this", "context", "this_$iv", "wasRunning$iv", "this", "this_$iv", "result", "wasRunning$iv"}, m = "sendToGrazie", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ExecutionContext$sendToGrazie$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  boolean Z$0;
  
  int label;
  
  ExecutionContext$sendToGrazie$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExecutionContext.this.sendToGrazie((MatterhornChat)null, (ModelParameters)null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$sendToGrazie$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */