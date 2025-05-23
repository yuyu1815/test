package ai.grazie.api.gateway.client.api.meta;

import ai.grazie.def.WordDefinition;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "DefAPIClient.kt", l = {31}, i = {}, s = {}, n = {}, m = "define", c = "ai.grazie.api.gateway.client.api.meta.DefAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class DefAPIClient$define$1 extends ContinuationImpl {
  int label;
  
  DefAPIClient$define$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return DefAPIClient.this.define(null, null, null, (Continuation<? super WordDefinition>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\meta\DefAPIClient$define$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */