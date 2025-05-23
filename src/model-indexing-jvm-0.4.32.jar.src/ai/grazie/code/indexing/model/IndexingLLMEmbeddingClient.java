package ai.grazie.code.indexing.model;

import ai.grazie.emb.DoubleTextEmbedding;
import ai.grazie.model.llm.profile.LLMProfileID;
import ai.grazie.utils.attributes.Attributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J,\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\0032\b\020\007\032\004\030\0010\006H¦@¢\006\002\020\bJ6\020\t\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\0032\006\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\rH¦@¢\006\002\020\016ø\001\000\002\006\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Lai/grazie/code/indexing/model/IndexingLLMEmbeddingClient;", "", "embed", "", "Lai/grazie/emb/DoubleTextEmbedding;", "texts", "", "model", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "embedV2", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "parameters", "Lai/grazie/utils/attributes/Attributes;", "(Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-indexing"})
public interface IndexingLLMEmbeddingClient {
  @Nullable
  Object embedV2(@NotNull List<String> paramList, @NotNull LLMProfileID paramLLMProfileID, @Nullable Attributes paramAttributes, @NotNull Continuation<? super List<DoubleTextEmbedding>> paramContinuation);
  
  @Nullable
  Object embed(@NotNull List<String> paramList, @Nullable String paramString, @NotNull Continuation<? super List<DoubleTextEmbedding>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\IndexingLLMEmbeddingClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */