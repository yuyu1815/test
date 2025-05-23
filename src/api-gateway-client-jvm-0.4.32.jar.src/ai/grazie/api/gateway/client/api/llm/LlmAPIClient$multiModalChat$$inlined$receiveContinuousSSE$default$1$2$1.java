package ai.grazie.api.gateway.client.api.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
@DebugMetadata(f = "LlmAPIClient.kt", l = {219}, i = {}, s = {}, n = {}, m = "emit", c = "ai.grazie.api.gateway.client.api.llm.LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$1$2")
public final class null extends ContinuationImpl {
  int label;
  
  Object L$0;
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$1.null.this.emit(null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\llm\LlmAPIClient$multiModalChat$$inlined$receiveContinuousSSE$default$1$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */