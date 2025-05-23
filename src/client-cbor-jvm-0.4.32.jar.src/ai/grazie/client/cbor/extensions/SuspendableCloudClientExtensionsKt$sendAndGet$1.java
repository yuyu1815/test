package ai.grazie.client.cbor.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableCloudClientExtensions.kt", l = {22}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"output", "cbor"}, m = "sendAndGet", c = "ai.grazie.client.cbor.extensions.SuspendableCloudClientExtensionsKt")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableCloudClientExtensionsKt$sendAndGet$1<I, O> extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  SuspendableCloudClientExtensionsKt$sendAndGet$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableCloudClientExtensionsKt.sendAndGet(null, null, null, null, null, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-cbor-jvm-0.4.32.jar!\ai\grazie\client\cbor\extensions\SuspendableCloudClientExtensionsKt$sendAndGet$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */