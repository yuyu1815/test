package ai.grazie.utils.cache;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "Caching.kt", l = {16}, i = {}, s = {}, n = {}, m = "exists$suspendImpl", c = "ai.grazie.utils.cache.SuspendableCache")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableCache$exists$1<Key, Value> extends ContinuationImpl {
  int label;
  
  SuspendableCache$exists$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableCache.exists$suspendImpl(SuspendableCache.this, null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\cache\SuspendableCache$exists$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */