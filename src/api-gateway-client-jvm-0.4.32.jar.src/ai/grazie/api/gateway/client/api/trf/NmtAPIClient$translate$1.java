package ai.grazie.api.gateway.client.api.trf;

import ai.grazie.nmt.SentenceWithTranslation;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NmtAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "translate", c = "ai.grazie.api.gateway.client.api.trf.NmtAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class NmtAPIClient$translate$1 extends ContinuationImpl {
  int label;
  
  NmtAPIClient$translate$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NmtAPIClient.this.translate(null, null, null, (Continuation<? super List<SentenceWithTranslation>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\trf\NmtAPIClient$translate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */