package ai.grazie.code.indexing.model.client;

import ai.grazie.code.indexing.model.IndexDescriptor;
import ai.grazie.code.indexing.model.raptor.RaptorNode;
import ai.grazie.code.indexing.model.snapshot.Snapshot;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\002\b\002\bf\030\0002\0020\001J2\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\n0\003H¦@¢\006\002\020\013J<\020\f\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\f\020\r\032\b\022\004\022\0020\0040\0032\b\b\002\020\016\032\0020\017H¦@¢\006\002\020\020ø\001\000\002\006\n\004\b!0\001¨\006\021À\006\001"}, d2 = {"Lai/grazie/code/indexing/model/client/RaptorMetadataApi;", "", "fetchRaptorNodes", "", "Lai/grazie/code/indexing/model/raptor/RaptorNode;", "indexDescriptor", "Lai/grazie/code/indexing/model/IndexDescriptor;", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "paths", "", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeRaptorNodes", "nodes", "buildVectors", "", "(Lai/grazie/code/indexing/model/IndexDescriptor;Lai/grazie/code/indexing/model/snapshot/Snapshot;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-indexing"})
public interface RaptorMetadataApi {
  @Nullable
  Object fetchRaptorNodes(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull List<String> paramList, @NotNull Continuation<? super List<RaptorNode>> paramContinuation);
  
  @Nullable
  Object storeRaptorNodes(@NotNull IndexDescriptor paramIndexDescriptor, @NotNull Snapshot paramSnapshot, @NotNull List<RaptorNode> paramList, boolean paramBoolean, @NotNull Continuation<? super List<RaptorNode>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\client\RaptorMetadataApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */