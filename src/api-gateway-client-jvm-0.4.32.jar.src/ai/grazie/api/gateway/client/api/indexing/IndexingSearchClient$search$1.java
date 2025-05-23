package ai.grazie.api.gateway.client.api.indexing;

import ai.grazie.code.indexing.model.search.SearchResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IndexingSearchClient.kt", l = {42}, i = {}, s = {}, n = {}, m = "search", c = "ai.grazie.api.gateway.client.api.indexing.IndexingSearchClient")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class IndexingSearchClient$search$1 extends ContinuationImpl {
  int label;
  
  IndexingSearchClient$search$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IndexingSearchClient.this.search(null, null, null, null, 0, 0.0D, null, false, (Continuation<? super SearchResponse>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\api\indexing\IndexingSearchClient$search$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */