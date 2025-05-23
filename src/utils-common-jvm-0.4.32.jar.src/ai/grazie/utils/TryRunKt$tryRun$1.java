package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "tryRun.kt", l = {4}, i = {}, s = {}, n = {}, m = "tryRun", c = "ai.grazie.utils.TryRunKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class TryRunKt$tryRun$1<T> extends ContinuationImpl {
  int label;
  
  TryRunKt$tryRun$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return TryRunKt.tryRun(null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\TryRunKt$tryRun$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */