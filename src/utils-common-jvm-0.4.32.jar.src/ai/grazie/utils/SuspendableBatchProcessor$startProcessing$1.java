package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {73, 75}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "timer"}, m = "startProcessing", c = "ai.grazie.utils.SuspendableBatchProcessor")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableBatchProcessor$startProcessing$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  SuspendableBatchProcessor$startProcessing$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableBatchProcessor.access$startProcessing(SuspendableBatchProcessor.this, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$startProcessing$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */