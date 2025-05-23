package ai.grazie.model.llm.embedding;

import ai.grazie.emb.DoubleTextEmbedding;
import ai.grazie.model.llm.profile.WithLLMProfile;
import ai.grazie.utils.attributes.Attributes;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\002\n\002\030\002\n\000\bf\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\007H@¢\006\002\020\bJ,\020\002\032\b\022\004\022\0020\0030\t2\f\020\004\032\b\022\004\022\0020\0050\t2\b\b\002\020\006\032\0020\007H@¢\006\002\020\nJ&\020\013\032\0020\f2\f\020\004\032\b\022\004\022\0020\0050\t2\b\b\002\020\006\032\0020\007H¦@¢\006\002\020\nø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Lai/grazie/model/llm/embedding/LLMEmbeddingService;", "Lai/grazie/model/llm/profile/WithLLMProfile;", "embed", "Lai/grazie/emb/DoubleTextEmbedding;", "text", "", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Ljava/lang/String;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/List;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "embedWithMetadata", "Lai/grazie/model/llm/embedding/LLMEmbeddingData;", "model-llm"})
public interface LLMEmbeddingService extends WithLLMProfile {
  @Deprecated(message = "In favor of embed with list")
  @Nullable
  default Object embed(@NotNull String text, @NotNull Attributes parameters, @NotNull Continuation<? super DoubleTextEmbedding> $completion) {
    return embed$suspendImpl(this, text, parameters, $completion);
  }
  
  @Deprecated(message = "In favor of embedWithMetadata")
  @Nullable
  default Object embed(@NotNull List<String> text, @NotNull Attributes parameters, @NotNull Continuation<? super List<DoubleTextEmbedding>> $completion) {
    return embed$suspendImpl(this, text, parameters, $completion);
  }
  
  @Nullable
  Object embedWithMetadata(@NotNull List<String> paramList, @NotNull Attributes paramAttributes, @NotNull Continuation<? super LLMEmbeddingData> paramContinuation);
  
  @DebugMetadata(f = "LLMEmbeddingService.kt", l = {10}, i = {}, s = {}, n = {}, m = "embed$suspendImpl", c = "ai.grazie.model.llm.embedding.LLMEmbeddingService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class LLMEmbeddingService$embed$1 extends ContinuationImpl {
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
  
  @DebugMetadata(f = "LLMEmbeddingService.kt", l = {15}, i = {}, s = {}, n = {}, m = "embed$suspendImpl", c = "ai.grazie.model.llm.embedding.LLMEmbeddingService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class LLMEmbeddingService$embed$2 extends ContinuationImpl {
    int label;
    
    LLMEmbeddingService$embed$2(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return LLMEmbeddingService.embed$suspendImpl(LLMEmbeddingService.this, (List<String>)null, (Attributes)null, (Continuation<? super List<DoubleTextEmbedding>>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\embedding\LLMEmbeddingService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */