package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "KeyedLock.kt", l = {29}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "key", "lock"}, m = "withLock", c = "ai.grazie.utils.KeyedLock")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class KeyedLock$withLock$1<T> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  KeyedLock$withLock$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return KeyedLock.this.withLock(null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\KeyedLock$withLock$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */