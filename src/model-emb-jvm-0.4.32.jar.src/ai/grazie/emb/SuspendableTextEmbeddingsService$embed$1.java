package ai.grazie.emb;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableTextEmbeddingsService.kt", l = {7}, i = {}, s = {}, n = {}, m = "embed$suspendImpl", c = "ai.grazie.emb.SuspendableTextEmbeddingsService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableTextEmbeddingsService$embed$1<T extends TextEmbedding> extends ContinuationImpl {
  int label;
  
  SuspendableTextEmbeddingsService$embed$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableTextEmbeddingsService.embed$suspendImpl(SuspendableTextEmbeddingsService.this, null, null, (Continuation<? super T>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-emb-jvm-0.4.32.jar!\ai\grazie\emb\SuspendableTextEmbeddingsService$embed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */