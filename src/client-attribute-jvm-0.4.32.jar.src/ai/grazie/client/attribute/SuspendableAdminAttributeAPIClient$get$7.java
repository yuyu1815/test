package ai.grazie.client.attribute;

import ai.grazie.utils.attributes.Attributes;
import ai.grazie.utils.mpp.UUID;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableAdminAttributeAPIClient.kt", l = {29}, i = {0}, s = {"L$0"}, n = {"key"}, m = "get$suspendImpl", c = "ai.grazie.client.attribute.SuspendableAdminAttributeAPIClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableAdminAttributeAPIClient$get$7 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  SuspendableAdminAttributeAPIClient$get$7(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableAdminAttributeAPIClient.get$suspendImpl(SuspendableAdminAttributeAPIClient.this, (Set<UUID>)null, (Attributes.Key.Json)null, (Continuation<? super Map<UUID, Attributes.Value.Json>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-attribute-jvm-0.4.32.jar!\ai\grazie\client\attribute\SuspendableAdminAttributeAPIClient$get$7.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */