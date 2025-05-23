package ai.grazie.api.gateway.client.api.llm;

import ai.grazie.model.llm.data.stream.LLMStreamData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LlmAPIClient.kt", l = {438}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"serializer$iv", "json$iv"}, m = "complete", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$V7")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LlmAPIClient$V7$complete$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  LlmAPIClient$V7$complete$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LlmAPIClient.V7.this.complete(null, null, null, null, null, (Continuation<? super Flow<? extends LLMStreamData>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$V7$complete$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */