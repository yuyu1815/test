package ai.grazie.code.indexing.model.client;

import ai.grazie.code.indexing.model.IndexAlias;
import ai.grazie.code.indexing.model.IndexDescriptor;
import ai.grazie.code.indexing.model.ProductionIndices;
import ai.grazie.code.indexing.model.search.IndexedRepository;
import ai.grazie.code.indexing.model.search.SearchDescriptor;
import ai.grazie.code.indexing.model.search.SearchResultWithContent;
import ai.grazie.code.indexing.model.search.SearchResultWithType;
import ai.grazie.code.indexing.model.snapshot.Snapshot;
import ai.grazie.code.indexing.model.snapshot.SnapshotMetadata;
import ai.grazie.model.cloud.paging.IterablePage;
import ai.grazie.model.cloud.paging.IterableWithNext;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000v\n\002\030\002\n\002\020\000\n\000\n\002\020\"\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\024\020\002\032\b\022\004\022\0020\0040\003H¦@¢\006\002\020\005J8\020\006\032\b\022\004\022\0020\b0\0072\f\020\t\032\b\022\004\022\0020\0130\n2\n\b\002\020\f\032\004\030\0010\0132\b\b\002\020\r\032\0020\016H¦@¢\006\002\020\017J\034\020\020\032\b\022\004\022\0020\0220\0212\006\020\023\032\0020\004H¦@¢\006\002\020\024JH\020\025\032\b\022\004\022\0020\0260\0212\006\020\023\032\0020\0042\006\020\027\032\0020\0302\006\020\031\032\0020\0132\006\020\032\032\0020\0332\006\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\013H¦@¢\006\002\020\037Jr\020 \032\024\022\n\022\b\022\004\022\0020\0260\021\022\004\022\0020\"0!2\006\020\023\032\0020\0042\006\020\027\032\0020\0302\006\020\031\032\0020\0132\006\020\032\032\0020\0332\006\020\034\032\0020\0352\b\020\036\032\004\030\0010\0132\006\020#\032\0020$2\006\020%\032\0020\0332\016\020&\032\n\022\004\022\0020'\030\0010\021H¦@¢\006\002\020(ø\001\000\002\006\n\004\b!0\001¨\006)À\006\001"}, d2 = {"Lai/grazie/code/indexing/model/client/ExperimentalSearchClient;", "", "getIndexDescriptors", "", "Lai/grazie/code/indexing/model/IndexDescriptor;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRepositories", "Lai/grazie/model/cloud/paging/IterableWithNext;", "Lai/grazie/code/indexing/model/search/IndexedRepository;", "repos", "Lai/grazie/model/cloud/paging/IterablePage;", "", "query", "index", "Lai/grazie/code/indexing/model/IndexAlias;", "(Lai/grazie/model/cloud/paging/IterablePage;Ljava/lang/String;Lai/grazie/code/indexing/model/IndexAlias;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSnapshots", "", "Lai/grazie/code/indexing/model/snapshot/SnapshotMetadata;", "indexDescriptor", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchByDescriptor", "Lai/grazie/code/indexing/model/search/SearchResultWithType;", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "text", "maxResults", "", "minScore", "", "pathFilter", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/lang/String;IDLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchRefine", "Lkotlin/Pair;", "", "searchDescriptor", "Lai/grazie/code/indexing/model/search/SearchDescriptor;", "step", "candidatesWithContent", "Lai/grazie/code/indexing/model/search/SearchResultWithContent;", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/lang/String;IDLjava/lang/String;Lai/grazie/code/indexing/model/search/SearchDescriptor;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-indexing"})
public interface ExperimentalSearchClient {
  @Nullable
  Object getIndexDescriptors(@NotNull Continuation<? super Set<IndexDescriptor>> paramContinuation);
  
  @Nullable
  Object getSnapshots(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Continuation<? super List<SnapshotMetadata>> paramContinuation);
  
  @Nullable
  Object getRepositories(@NotNull IterablePage<String> paramIterablePage, @Nullable String paramString, @NotNull IndexAlias paramIndexAlias, @NotNull Continuation<? super IterableWithNext<IndexedRepository>> paramContinuation);
  
  @Nullable
  Object searchByDescriptor(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull String paramString1, int paramInt, double paramDouble, @Nullable String paramString2, @NotNull Continuation<? super List<SearchResultWithType>> paramContinuation);
  
  @Nullable
  Object searchRefine(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull String paramString1, int paramInt1, double paramDouble, @Nullable String paramString2, @NotNull SearchDescriptor paramSearchDescriptor, int paramInt2, @Nullable List<SearchResultWithContent> paramList, @NotNull Continuation<? super Pair<? extends List<SearchResultWithType>, Boolean>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\client\ExperimentalSearchClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */