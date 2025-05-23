package ai.grazie.code.indexing.model.client;

import ai.grazie.code.indexing.model.IndexDescriptor;
import ai.grazie.code.indexing.model.cluster.FileClusterDTO;
import ai.grazie.code.indexing.model.index.ItemToIndex;
import ai.grazie.code.indexing.model.index.StoredIndex;
import ai.grazie.code.indexing.model.snapshot.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020\t\n\002\b\002\bf\030\0002\0020\001J&\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH¦@¢\006\002\020\nJ\036\020\013\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H¦@¢\006\002\020\fJ4\020\r\032\0020\0162\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\017\032\0020\0202\f\020\021\032\b\022\004\022\0020\0230\022H¦@¢\006\002\020\024J&\020\025\032\0020\0262\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH¦@¢\006\002\020\nJ&\020\027\032\0020\0262\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\030\032\0020\031H¦@¢\006\002\020\032ø\001\000\002\006\n\004\b!0\001¨\006\033À\006\001"}, d2 = {"Lai/grazie/code/indexing/model/client/BaseIndexingApi;", "", "finalizeCluster", "", "indexDescriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "cluster", "Lai/grazie/code/indexing/model/cluster/FileClusterDTO;", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/code/indexing/model/cluster/FileClusterDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "finalizeSnapshot", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "indexChunks", "Lai/grazie/code/indexing/model/index/StoredIndex;", "clusterId", "", "data", "", "Lai/grazie/code/indexing/model/index/ItemToIndex;", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeCluster", "", "storeSnapshot", "clusters", "", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-indexing"})
public interface BaseIndexingApi {
  @Nullable
  Object storeSnapshot(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, long paramLong, @NotNull Continuation<? super Boolean> paramContinuation);
  
  @Nullable
  Object finalizeSnapshot(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object storeCluster(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull FileClusterDTO paramFileClusterDTO, @NotNull Continuation<? super Boolean> paramContinuation);
  
  @Nullable
  Object finalizeCluster(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull FileClusterDTO paramFileClusterDTO, @NotNull Continuation<? super Unit> paramContinuation);
  
  @Nullable
  Object indexChunks(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull String paramString, @NotNull List<ItemToIndex> paramList, @NotNull Continuation<? super StoredIndex> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\client\BaseIndexingApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */