package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AITaskLauncher.kt", l = {177}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"project", "path"}, m = "isSensitiveFile", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AITaskLauncher$isSensitiveFile$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  AITaskLauncher$isSensitiveFile$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AITaskLauncher.this.isSensitiveFile(null, null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\AITaskLauncher$isSensitiveFile$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */