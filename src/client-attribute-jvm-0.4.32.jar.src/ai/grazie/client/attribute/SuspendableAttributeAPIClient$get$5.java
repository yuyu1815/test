package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {30}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableAttributeAPIClient$get$5 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  SuspendableAttributeAPIClient$get$5(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableAttributeAPIClient.get$suspendImpl(SuspendableAttributeAPIClient.this, (Attributes.Key.Bool)null, (Continuation<? super Attributes.Value.Bool>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-attribute-jvm-0.4.32.jar!\ai\grazie\client\attribute\SuspendableAttributeAPIClient$get$5.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */