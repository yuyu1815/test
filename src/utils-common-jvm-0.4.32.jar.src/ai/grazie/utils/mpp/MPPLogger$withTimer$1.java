package ai.grazie.utils.mpp;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "Logger.kt", l = {35}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"$this", "message", "start"}, m = "withTimer$suspendImpl", c = "ai.grazie.utils.mpp.MPPLogger")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class MPPLogger$withTimer$1<T> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  MPPLogger$withTimer$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return MPPLogger.withTimer$suspendImpl(MPPLogger.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\MPPLogger$withTimer$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */