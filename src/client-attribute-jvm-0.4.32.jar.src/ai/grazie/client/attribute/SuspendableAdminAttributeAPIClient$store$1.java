package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import ai.grazie.utils.mpp.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {7}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableAdminAttributeAPIClient$store$1 extends ContinuationImpl {
  int label;
  
  SuspendableAdminAttributeAPIClient$store$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableAdminAttributeAPIClient.store$suspendImpl(SuspendableAdminAttributeAPIClient.this, (UUID)null, (Attributes.Key.Long)null, (Attributes.Value.Long)null, (Continuation<? super Attributes.Key.Long>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-attribute-jvm-0.4.32.jar!\ai\grazie\client\attribute\SuspendableAdminAttributeAPIClient$store$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */