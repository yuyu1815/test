package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(f = "SuspendLazy.kt", l = {39, 20}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "invoke", c = "ai.grazie.utils.SuspendLazyKt$suspendLazy$1")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendLazyKt$suspendLazy$1$invoke$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  SuspendLazyKt$suspendLazy$1$invoke$1(Continuation $completion) {
    super($completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendLazyKt$suspendLazy$1.this.invoke((Continuation<? super T>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SuspendLazyKt$suspendLazy$1$invoke$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */