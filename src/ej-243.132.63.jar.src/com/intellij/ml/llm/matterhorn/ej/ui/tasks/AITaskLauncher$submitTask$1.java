package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AITaskLauncher.kt", l = {193, 203, 215, 221, 266, 288}, i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2"}, n = {"this", "project", "task", "artifactualListener", "currentJob", "chainId", "updater", "ejSupport", "this", "project", "task", "artifactualListener", "currentJob", "chainId", "updater", "llmProxy", "imagesAndFiles", "this", "project", "task", "artifactualListener", "currentJob", "chainId", "updater", "llmProxy", "request", "service", "braveMode", "project", "task", "artifactualListener", "currentJob", "chainId", "request", "executor", "request", "executor", "context"}, m = "submitTask", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.AITaskLauncher")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AITaskLauncher$submitTask$1 extends ContinuationImpl {
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
  
  boolean Z$0;
  
  int label;
  
  AITaskLauncher$submitTask$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AITaskLauncher.access$submitTask(AITaskLauncher.this, null, null, null, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\AITaskLauncher$submitTask$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */