package com.intellij.ml.llm.matterhorn.ej.idea;

import com.intellij.ml.llm.matterhorn.ProjectProblem;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IdeaAgentMatterhornStarterBase.kt", l = {32, 32}, i = {0}, s = {"L$0"}, n = {"importer"}, m = "validateProject$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaAgentMatterhornStarterBase")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class IdeaAgentMatterhornStarterBase$validateProject$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  IdeaAgentMatterhornStarterBase$validateProject$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IdeaAgentMatterhornStarterBase.validateProject$suspendImpl(IdeaAgentMatterhornStarterBase.this, null, null, null, (Continuation<? super List<ProjectProblem>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaAgentMatterhornStarterBase$validateProject$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */