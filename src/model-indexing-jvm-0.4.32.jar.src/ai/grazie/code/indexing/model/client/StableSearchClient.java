package ai.grazie.code.indexing.model.client;

import ai.grazie.code.indexing.model.IndexAlias;
import ai.grazie.code.indexing.model.ProductionIndices;
import ai.grazie.code.indexing.model.search.SearchResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\b\n\000\n\002\020\006\n\002\b\002\n\002\020\013\n\002\b\002\bf\030\0002\0020\001J^\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\n\b\002\020\t\032\004\030\0010\0072\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\n\b\002\020\016\032\004\030\0010\0072\b\b\002\020\017\032\0020\020H¦@¢\006\002\020\021ø\001\000\002\006\n\004\b!0\001¨\006\022À\006\001"}, d2 = {"Lai/grazie/code/indexing/model/client/StableSearchClient;", "", "search", "Lai/grazie/code/indexing/model/search/SearchResponse;", "indexAlias", "Lai/grazie/code/indexing/model/IndexAlias;", "text", "", "repository", "revision", "maxResults", "", "minScore", "", "pathFilter", "logAllowed", "", "(Lai/grazie/code/indexing/model/IndexAlias;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-indexing"})
public interface StableSearchClient {
  @Nullable
  Object search(@NotNull IndexAlias paramIndexAlias, @NotNull String paramString1, @NotNull String paramString2, @Nullable String paramString3, int paramInt, double paramDouble, @Nullable String paramString4, boolean paramBoolean, @NotNull Continuation<? super SearchResponse> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\client\StableSearchClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */