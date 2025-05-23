package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\bf\030\0002\0020\001J\016\020\002\032\0020\003H¦@¢\006\002\020\004J\024\020\005\032\b\022\004\022\0020\0070\006H¦@¢\006\002\020\004¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;", "", "startEditingSession", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "undoLastEdit", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UndoResult;", "ej-core"})
public interface EditService {
  @Nullable
  Object startEditingSession(@NotNull Continuation<? super EditSession> paramContinuation);
  
  @Nullable
  Object undoLastEdit(@NotNull Continuation<? super List<? extends UndoResult>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */