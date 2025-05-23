package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;

import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
import com.intellij.ml.llm.matterhorn.ej.idea.actions.RunResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\026\020\006\032\0020\0072\006\020\b\032\0020\tH¦@¢\006\002\020\nR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "", "name", "", "getName", "()Ljava/lang/String;", "runAction", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/RunResult;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-idea"})
public interface ActionLocation {
  @NotNull
  String getName();
  
  @Nullable
  Object runAction(@NotNull ExecutionAgentContext paramExecutionAgentContext, @NotNull Continuation<? super RunResult> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\ActionLocation.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */