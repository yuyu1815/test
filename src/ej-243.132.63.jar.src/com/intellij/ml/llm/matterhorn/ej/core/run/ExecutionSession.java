package com.intellij.ml.llm.matterhorn.ej.core.run;

import com.intellij.ml.llm.matterhorn.ej.core.Result;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\t\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\bf\030\0002\0020\001J6\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\0032\006\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\006\020\n\032\0020\013H¦@¢\006\002\020\fJ\016\020\r\032\0020\016H¦@¢\006\002\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "", "execute", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionError;", "command", "", "timeoutMillis", "", "workDir", "Ljava/nio/file/Path;", "(Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
public interface ExecutionSession {
  @Nullable
  Object execute(@NotNull String paramString, @Nullable Long paramLong, @NotNull Path paramPath, @NotNull Continuation<? super Result<ExecutionResult, ? extends ExecutionError>> paramContinuation);
  
  @Nullable
  Object close(@NotNull Continuation<? super Unit> paramContinuation);
  
  @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\ExecutionSession.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */