package ai.grazie.client.common.external;

import ai.grazie.model.cloud.sse.ServerSentEvent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExternalApiClient.kt", l = {64}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "api"}, m = "receiveContinuousSSE", c = "ai.grazie.client.common.external.ExternalApiClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class ExternalApiClient$receiveContinuousSSE$1<Request> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  ExternalApiClient$receiveContinuousSSE$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExternalApiClient.this.receiveContinuousSSE(null, null, null, false, (Continuation<? super Flow<ServerSentEvent>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\external\ExternalApiClient$receiveContinuousSSE$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */