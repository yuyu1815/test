package com.intellij.ml.llm.matterhorn.ej.idea;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IdeaProjectCheckWorker.kt", l = {46}, i = {}, s = {}, n = {}, m = "checkTestRunAction", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectCheckWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class IdeaProjectCheckWorker$checkTestRunAction$1 extends ContinuationImpl {
  int label;
  
  IdeaProjectCheckWorker$checkTestRunAction$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IdeaProjectCheckWorker.access$checkTestRunAction(IdeaProjectCheckWorker.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaProjectCheckWorker$checkTestRunAction$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */