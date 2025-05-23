package ai.grazie.api.gateway.client.api.user;

import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AttributeUserAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "get$suspendImpl", c = "ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class AttributeUserAPIClient$get$1 extends ContinuationImpl {
  int label;
  
  AttributeUserAPIClient$get$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AttributeUserAPIClient.get$suspendImpl(AttributeUserAPIClient.this, null, (Continuation<? super Attributes>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\ap\\user\AttributeUserAPIClient$get$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */