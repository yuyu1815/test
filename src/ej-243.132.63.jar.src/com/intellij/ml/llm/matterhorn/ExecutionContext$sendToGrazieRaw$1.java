package com.intellij.ml.llm.matterhorn;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExecutionContext.kt", l = {271}, i = {}, s = {}, n = {}, m = "sendToGrazieRaw", c = "com.intellij.ml.llm.matterhorn.ExecutionContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ExecutionContext$sendToGrazieRaw$1 extends ContinuationImpl {
  int label;
  
  ExecutionContext$sendToGrazieRaw$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExecutionContext.this.sendToGrazieRaw(null, (Continuation<? super MatterhornChatElement>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$sendToGrazieRaw$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */