package com.intellij.ml.llm.matterhorn.requests;

import com.intellij.ml.llm.matterhorn.ExecutionContext;
import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessagePart;
import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001:\001\007J\026\020\002\032\0020\0032\006\020\004\032\0020\005H¦@¢\006\002\020\006¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;", "", "execute", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Content", "core"})
public interface GrazieRequest {
  @Nullable
  Object execute(@NotNull ExecutionContext paramExecutionContext, @NotNull Continuation<? super MatterhornChat> paramContinuation);
  
  @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J \020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H¦@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest$Content;", "", "toChatMessagePart", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
  public static interface Content {
    @Nullable
    Object toChatMessagePart(@NotNull ExecutionContext param1ExecutionContext, @NotNull ModelParameters param1ModelParameters, @NotNull Continuation<? super MatterhornChatMessagePart> param1Continuation);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\GrazieRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */