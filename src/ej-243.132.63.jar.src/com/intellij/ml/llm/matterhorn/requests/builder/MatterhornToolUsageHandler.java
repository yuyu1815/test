package com.intellij.ml.llm.matterhorn.requests.builder;

import com.intellij.ml.llm.matterhorn.llm.MatterhornToolUse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bæ\001\030\0002\0020\001J\026\020\002\032\0020\0032\006\020\004\032\0020\005H¦@¢\006\002\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/requests/builder/MatterhornToolUsageHandler;", "", "handle", "Lcom/intellij/ml/llm/matterhorn/requests/builder/ToolResult;", "usage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornToolUse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
public interface MatterhornToolUsageHandler {
  @Nullable
  Object handle(@NotNull MatterhornToolUse paramMatterhornToolUse, @NotNull Continuation<? super ToolResult> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\requests\builder\MatterhornToolUsageHandler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */