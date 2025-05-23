package com.intellij.ml.llm.matterhorn.ej.idea;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IdeaAgentMatterhornStarterBase.kt", l = {14}, i = {0}, s = {"L$0"}, n = {"projectDir"}, m = "beforeProjectOpened$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaAgentMatterhornStarterBase")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class IdeaAgentMatterhornStarterBase$beforeProjectOpened$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  IdeaAgentMatterhornStarterBase$beforeProjectOpened$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IdeaAgentMatterhornStarterBase.beforeProjectOpened$suspendImpl(IdeaAgentMatterhornStarterBase.this, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaAgentMatterhornStarterBase$beforeProjectOpened$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */