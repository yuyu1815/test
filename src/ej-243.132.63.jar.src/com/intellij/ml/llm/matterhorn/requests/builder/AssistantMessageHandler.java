package com.intellij.ml.llm.matterhorn.requests.builder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bp\030\0002\0020\001J&\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH¦@¢\006\002\020\n\001\003\013\f\r¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageHandler;", "", "handle", "", "context", "Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;", "assistantAnswer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;", "reviewResult", "Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;", "(Lcom/intellij/ml/llm/matterhorn/requests/builder/RequestExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;Lcom/intellij/ml/llm/matterhorn/requests/builder/CombinedReviewResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageConsumerHandler;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpartHandler;", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageReviewHandler;", "core"})
public interface AssistantMessageHandler {
  @Nullable
  Object handle(@NotNull RequestExecutionContext paramRequestExecutionContext, @NotNull AssistantAnswer paramAssistantAnswer, @NotNull CombinedReviewResult paramCombinedReviewResult, @NotNull Continuation<? super Unit> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantMessageHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */