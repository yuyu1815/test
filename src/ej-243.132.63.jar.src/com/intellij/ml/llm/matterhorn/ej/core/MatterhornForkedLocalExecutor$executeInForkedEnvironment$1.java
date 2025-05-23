package com.intellij.ml.llm.matterhorn.ej.core;

import com.intellij.ml.llm.matterhorn.Artifact;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractMultiAgentWorker.kt", l = {58, 148, 150, 150}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0"}, n = {"name", "request", "originalContext", "result", "project", "tempDirPath", "result", "project", "tempDirPath", "result"}, m = "executeInForkedEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.MatterhornForkedLocalExecutor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$1<I, O> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  MatterhornForkedLocalExecutor$executeInForkedEnvironment$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return MatterhornForkedLocalExecutor.this.executeInForkedEnvironment(null, null, null, (Continuation<? super Artifact<?>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor$executeInForkedEnvironment$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */