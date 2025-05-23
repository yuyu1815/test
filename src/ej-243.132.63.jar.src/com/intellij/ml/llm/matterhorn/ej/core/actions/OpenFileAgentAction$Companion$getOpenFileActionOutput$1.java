package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "OpenFileAgentAction.kt", l = {31, 35, 48, 51}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, n = {"this", "context", "file", "lineNumber", "filePath", "window", "line", "this", "context", "file", "filePath", "window", "line", "context", "file", "window", "line"}, m = "getOpenFileActionOutput", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.OpenFileAgentAction$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class OpenFileAgentAction$Companion$getOpenFileActionOutput$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  OpenFileAgentAction$Companion$getOpenFileActionOutput$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return OpenFileAgentAction.Companion.this.getOpenFileActionOutput(null, null, null, 0, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\OpenFileAgentAction$Companion$getOpenFileActionOutput$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */