package ai.grazie.client.common.retry;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "Extensions.kt", l = {32, 39}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"}, n = {"$this$withRetry", "strategy", "retryOn", "logger", "block", "retry", "total", "$this$withRetry", "strategy", "retryOn", "logger", "block", "retry", "total"}, m = "withRetry", c = "ai.grazie.client.common.retry.ExtensionsKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class ExtensionsKt$withRetry$1<Client, T> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int I$0;
  
  int label;
  
  ExtensionsKt$withRetry$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExtensionsKt.withRetry(null, 0, null, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\retry\ExtensionsKt$withRetry$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */