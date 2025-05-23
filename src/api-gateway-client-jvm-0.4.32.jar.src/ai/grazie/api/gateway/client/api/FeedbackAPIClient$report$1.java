package ai.grazie.api.gateway.client.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "FeedbackAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "report", c = "ai.grazie.api.gateway.client.api.FeedbackAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class FeedbackAPIClient$report$1 extends ContinuationImpl {
  int label;
  
  FeedbackAPIClient$report$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return FeedbackAPIClient.this.report(null, null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\FeedbackAPIClient$report$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */