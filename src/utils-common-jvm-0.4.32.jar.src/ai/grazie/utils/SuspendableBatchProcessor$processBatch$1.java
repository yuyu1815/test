package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {107, 109}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "L$1", "I$0"}, n = {"batch", "batch", "result", "i"}, m = "processBatch", c = "ai.grazie.utils.SuspendableBatchProcessor")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableBatchProcessor$processBatch$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int I$0;
  
  int I$1;
  
  int label;
  
  SuspendableBatchProcessor$processBatch$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableBatchProcessor.access$processBatch(SuspendableBatchProcessor.this, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$processBatch$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */