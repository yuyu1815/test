package ai.grazie.client.common.external;

import ai.grazie.client.common.model.HTTPResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ExternalApiClient.kt", l = {51}, i = {}, s = {}, n = {}, m = "sendRaw", c = "ai.grazie.client.common.external.ExternalApiClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class ExternalApiClient$sendRaw$1<Response> extends ContinuationImpl {
  int label;
  
  ExternalApiClient$sendRaw$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ExternalApiClient.this.sendRaw(null, null, (Continuation<? super HTTPResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\external\ExternalApiClient$sendRaw$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */