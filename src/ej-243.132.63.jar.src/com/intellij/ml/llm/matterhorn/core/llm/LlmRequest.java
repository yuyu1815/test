package com.intellij.ml.llm.matterhorn.core.llm;

import com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.AccessToken;
import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\030\020\002\032\0020\0032\b\020\004\032\004\030\0010\005H¦@¢\006\002\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/LlmRequest;", "", "send", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "accessToken", "Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;", "(Lcom/intellij/ml/llm/matterhorn/core/llm/ingrazzio/AccessToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-llm"})
public interface LlmRequest {
  @Nullable
  Object send(@Nullable AccessToken paramAccessToken, @NotNull Continuation<? super AIAnswer> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\LlmRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */