package ai.grazie.client.common;

import ai.grazie.model.cloud.sse.ServerSentEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableHTTPClient.kt", l = {38, 38}, i = {0}, s = {"Z$0"}, n = {"reconnect"}, m = "receiveContinuousSSE$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableHTTPClient$WithHeaders$receiveContinuousSSE$1 extends ContinuationImpl {
  boolean Z$0;
  
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  SuspendableHTTPClient$WithHeaders$receiveContinuousSSE$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableHTTPClient.WithHeaders.receiveContinuousSSE$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableHTTPClient$WithHeaders$receiveContinuousSSE$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */