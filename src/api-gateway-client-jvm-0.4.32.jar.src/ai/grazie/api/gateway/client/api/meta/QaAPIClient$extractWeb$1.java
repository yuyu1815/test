package ai.grazie.api.gateway.client.api.meta;

import ai.grazie.qa.ExtractWebResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "QaAPIClient.kt", l = {66}, i = {}, s = {}, n = {}, m = "extractWeb", c = "ai.grazie.api.gateway.client.api.meta.QaAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class QaAPIClient$extractWeb$1 extends ContinuationImpl {
  int label;
  
  QaAPIClient$extractWeb$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return QaAPIClient.this.extractWeb(null, null, null, (Continuation<? super ExtractWebResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\QaAPIClient$extractWeb$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */