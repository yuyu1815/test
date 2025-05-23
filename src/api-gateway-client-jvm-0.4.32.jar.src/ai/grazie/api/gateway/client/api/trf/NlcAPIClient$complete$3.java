package ai.grazie.api.gateway.client.api.trf;

import ai.grazie.nlc.PrefixWithCompletions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NlcAPIClient.kt", l = {43}, i = {}, s = {}, n = {}, m = "complete", c = "ai.grazie.api.gateway.client.api.trf.NlcAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class NlcAPIClient$complete$3 extends ContinuationImpl {
  int label;
  
  NlcAPIClient$complete$3(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NlcAPIClient.this.complete(null, null, null, (Continuation<? super PrefixWithCompletions>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\trf\NlcAPIClient$complete$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */