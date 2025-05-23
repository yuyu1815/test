package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableBatchProcessor.kt", l = {118}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "parameters", "channel", "$this$withLock_u24default$iv"}, m = "addToBuffer", c = "ai.grazie.utils.SuspendableBatchProcessor")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableBatchProcessor$addToBuffer$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  SuspendableBatchProcessor$addToBuffer$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableBatchProcessor.access$addToBuffer(SuspendableBatchProcessor.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendableBatchProcessor$addToBuffer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */