package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SimpleMutex.kt", l = {27, 15}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"body", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, m = "withLock", c = "ai.grazie.utils.MutexWrapper")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class MutexWrapper$withLock$1<T> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  MutexWrapper$withLock$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return MutexWrapper.this.withLock(null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\MutexWrapper$withLock$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */