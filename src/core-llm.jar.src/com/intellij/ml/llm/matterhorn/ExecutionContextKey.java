package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\b\022\004\022\0020\0020\001B\t\b\002¢\006\004\b\003\020\004¨\006\005"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ExecutionContextKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lcom/intellij/ml/llm/matterhorn/ExecutionContextElement;", "<init>", "()V", "core"})
public final class ExecutionContextKey implements CoroutineContext.Key<ExecutionContextElement> {
  @NotNull
  public static final ExecutionContextKey INSTANCE = new ExecutionContextKey();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContextKey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */