package ai.grazie.api.gateway.client;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "UrlResolver.kt", l = {85, 34}, i = {0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$3"}, n = {"this", "provider", "json$iv", "this", "exceptions", "element$iv"}, m = "resolve", c = "ai.grazie.api.gateway.client.DefaultUrlResolver")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class DefaultUrlResolver$resolve$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  DefaultUrlResolver$resolve$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return DefaultUrlResolver.this.resolve(null, (Continuation<? super ResolutionResult>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\DefaultUrlResolver$resolve$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */