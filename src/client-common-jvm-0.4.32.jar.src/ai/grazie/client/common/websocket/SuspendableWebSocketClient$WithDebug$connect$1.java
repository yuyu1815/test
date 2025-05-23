package ai.grazie.client.common.websocket;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableWebSocketClient.kt", l = {44, 44}, i = {0}, s = {"L$0"}, n = {"body"}, m = "connect", c = "ai.grazie.client.common.websocket.SuspendableWebSocketClient$WithDebug")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableWebSocketClient$WithDebug$connect$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  SuspendableWebSocketClient$WithDebug$connect$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableWebSocketClient.WithDebug.this.connect(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\websocket\SuspendableWebSocketClient$WithDebug$connect$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */