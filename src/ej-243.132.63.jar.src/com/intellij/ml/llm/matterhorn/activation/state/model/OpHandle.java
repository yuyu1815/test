package com.intellij.ml.llm.matterhorn.activation.state.model;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\bf\030\000*\006\b\000\020\001 \0012\0020\002J\030\020\003\032\f\022\004\022\0028\000\022\002\b\0030\004H¦@¢\006\002\020\005J\b\020\006\032\0020\007H&¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpHandle;", "Err", "", "awaitOpResult", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "", "state.model"})
public interface OpHandle<Err> {
  @Nullable
  Object awaitOpResult(@NotNull Continuation<? super OpResult<? extends Err, ?>> paramContinuation);
  
  void cancel();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\model\OpHandle.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */