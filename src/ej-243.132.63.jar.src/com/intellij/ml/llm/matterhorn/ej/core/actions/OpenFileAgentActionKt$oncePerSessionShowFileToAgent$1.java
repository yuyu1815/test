package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "OpenFileAgentAction.kt", l = {128, 131, 136}, i = {0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0"}, n = {"$this$oncePerSessionShowFileToAgent", "vFile", "filePath", "atLeastShowStructure", "smallFileLimit"}, m = "oncePerSessionShowFileToAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.OpenFileAgentActionKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  boolean Z$0;
  
  int I$0;
  
  int label;
  
  OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return OpenFileAgentActionKt.oncePerSessionShowFileToAgent(null, null, null, false, 0, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */