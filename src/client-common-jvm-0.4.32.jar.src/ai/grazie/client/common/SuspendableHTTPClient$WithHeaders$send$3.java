package ai.grazie.client.common;

import ai.grazie.client.common.model.HTTPResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableHTTPClient.kt", l = {46, 46}, i = {}, s = {}, n = {}, m = "send$suspendImpl", c = "ai.grazie.client.common.SuspendableHTTPClient$WithHeaders")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableHTTPClient$WithHeaders$send$3 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  SuspendableHTTPClient$WithHeaders$send$3(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableHTTPClient.WithHeaders.send$suspendImpl(SuspendableHTTPClient.WithHeaders.this, null, null, (Continuation<? super HTTPResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableHTTPClient$WithHeaders$send$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */