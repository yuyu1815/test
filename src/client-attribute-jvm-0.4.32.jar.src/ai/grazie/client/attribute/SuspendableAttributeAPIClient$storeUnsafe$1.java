package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableAttributeAPIClient.kt", l = {17}, i = {}, s = {}, n = {}, m = "storeUnsafe$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAttributeAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableAttributeAPIClient$storeUnsafe$1 extends ContinuationImpl {
  int label;
  
  SuspendableAttributeAPIClient$storeUnsafe$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableAttributeAPIClient.storeUnsafe$suspendImpl(SuspendableAttributeAPIClient.this, null, null, (Continuation<? super Attributes.Key>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-attribute-jvm-0.4.32.jar!\ai\grazie\client\attribute\SuspendableAttributeAPIClient$storeUnsafe$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */