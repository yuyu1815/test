package ai.grazie.model.llm.embedding;

import ai.grazie.emb.DoubleTextEmbedding;
import ai.grazie.utils.attributes.Attributes;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LLMEmbeddingService.kt", l = {10}, i = {}, s = {}, n = {}, m = "embed$suspendImpl", c = "ai.grazie.model.llm.embedding.LLMEmbeddingService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class LLMEmbeddingService$embed$1 extends ContinuationImpl {
  int label;
  
  LLMEmbeddingService$embed$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LLMEmbeddingService.embed$suspendImpl(LLMEmbeddingService.this, (String)null, (Attributes)null, (Continuation<? super DoubleTextEmbedding>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\embedding\LLMEmbeddingService$embed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */