package com.intellij.ml.llm.matterhorn.ej.pycharm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "PythonChatAgentWorker.kt", l = {22, 23}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"executor", "executionDir", "context"}, m = "setupCommandExecutor", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.PythonChatAgentWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class PythonChatAgentWorker$setupCommandExecutor$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  PythonChatAgentWorker$setupCommandExecutor$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return PythonChatAgentWorker.this.setupCommandExecutor(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PythonChatAgentWorker$setupCommandExecutor$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */