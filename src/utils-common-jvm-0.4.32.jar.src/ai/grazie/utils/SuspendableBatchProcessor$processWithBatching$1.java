package ai.grazie.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {50, 53}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"this", "parameters", "resultChannel", "resultChannel"}, m = "processWithBatching", c = "ai.grazie.utils.SuspendableBatchProcessor")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableBatchProcessor$processWithBatching$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  SuspendableBatchProcessor$processWithBatching$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableBatchProcessor.this.processWithBatching(null, (Continuation<? super List<? extends Result>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$processWithBatching$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */