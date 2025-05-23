package ai.grazie.api.gateway.client.api.meta;

import ai.grazie.qa.QADocument;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "QaAPIClient.kt", l = {66}, i = {}, s = {}, n = {}, m = "retrieveV2", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class QaAPIClient$retrieveV2$1 extends ContinuationImpl {
  int label;
  
  QaAPIClient$retrieveV2$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return QaAPIClient.this.retrieveV2(null, 0, null, null, null, null, (Continuation<? super List<QADocument>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\QaAPIClient$retrieveV2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */