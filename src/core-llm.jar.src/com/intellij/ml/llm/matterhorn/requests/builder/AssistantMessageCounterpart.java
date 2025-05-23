package com.intellij.ml.llm.matterhorn.requests.builder;

import com.intellij.ml.llm.matterhorn.collections.AddOnlyList;
import com.intellij.ml.llm.matterhorn.requests.GrazieRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bæ\001\030\0002\0020\001J\034\020\002\032\0020\003*\0020\0042\006\020\005\032\0020\006H¦@¢\006\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantMessageCounterpart;", "", "handle", "", "Lcom/intellij/ml/llm/matterhorn/requests/builder/UserMessageBuilder;", "assistantAnswer", "Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;", "handle-_JRwX_Y", "(Lcom/intellij/ml/llm/matterhorn/collections/AddOnlyList;Lcom/intellij/ml/llm/matterhorn/requests/builder/AssistantAnswer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
public interface AssistantMessageCounterpart {
  @Nullable
  Object handle-_JRwX_Y(@NotNull AddOnlyList<GrazieRequest.Content> paramAddOnlyList, @NotNull AssistantAnswer paramAssistantAnswer, @NotNull Continuation<? super Unit> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\builder\AssistantMessageCounterpart.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */