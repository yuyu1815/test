package ai.grazie.api.gateway.client.api.trf;

import ai.grazie.nlc.ContextWithCompletions;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NlcAPIClient.kt", l = {43}, i = {0}, s = {"L$0"}, n = {"context"}, m = "completeWithoutPrefix", c = "ai.grazie.api.gateway.client.api.trf.NlcAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class NlcAPIClient$completeWithoutPrefix$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  NlcAPIClient$completeWithoutPrefix$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NlcAPIClient.this.completeWithoutPrefix(null, null, null, (Continuation<? super ContextWithCompletions>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\trf\NlcAPIClient$completeWithoutPrefix$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */