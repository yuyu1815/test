package com.intellij.ml.llm.matterhorn.ej.core.run;

import com.intellij.ml.llm.matterhorn.ej.core.Result;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\"\020\002\032\026\022\004\022\0020\004\022\f\022\n\030\0010\005j\004\030\001`\0060\003H¦@¢\006\002\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;", "", "getOrCreateSession", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
public interface ExecutionEnvironment {
  @Nullable
  Object getOrCreateSession(@NotNull Continuation<? super Result<? extends ExecutionSession, ? extends Exception>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionEnvironment.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */