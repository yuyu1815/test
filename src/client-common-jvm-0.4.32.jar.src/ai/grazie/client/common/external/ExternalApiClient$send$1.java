package ai.grazie.client.common.external;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExternalApiClient.kt", l = {33}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "api"}, m = "send", c = "ai.grazie.client.common.external.ExternalApiClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class ExternalApiClient$send$1<Request, Response> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  ExternalApiClient$send$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExternalApiClient.this.send(null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\external\ExternalApiClient$send$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */