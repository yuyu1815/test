package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003J$\020\004\032\b\022\004\022\0028\0010\0052\006\020\006\032\0028\0002\006\020\007\032\0020\bH¦@¢\006\002\020\t¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "I", "O", "", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
public interface ArtifactRequestExecutor<I, O> {
  @Nullable
  Object produceArtifact(I paramI, @NotNull ExecutionContext paramExecutionContext, @NotNull Continuation<? super ArtifactResponse<O>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactRequestExecutor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */