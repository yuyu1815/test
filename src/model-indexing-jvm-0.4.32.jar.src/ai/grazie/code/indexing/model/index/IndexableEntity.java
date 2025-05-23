package ai.grazie.code.indexing.model.index;

import ai.grazie.code.indexing.model.IndexItemType;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020 \n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\030\020\n\032\0020\003X¦\016¢\006\f\032\004\b\013\020\005\"\004\b\f\020\rR\030\020\016\032\b\022\004\022\0020\0030\017X¦\004¢\006\006\032\004\b\020\020\021R\022\020\022\032\0020\023X¦\004¢\006\006\032\004\b\024\020\025ø\001\000\002\006\n\004\b!0\001¨\006\026À\006\001"}, d2 = {"Lai/grazie/code/indexing/model/index/IndexableEntity;", "", "content", "", "getContent", "()Ljava/lang/String;", "id", "Lai/grazie/code/indexing/model/index/EntityId;", "getId", "()Lai/grazie/code/indexing/model/index/EntityId;", "indexableContent", "getIndexableContent", "setIndexableContent", "(Ljava/lang/String;)V", "meta", "", "getMeta", "()Ljava/util/List;", "targetIndexItemType", "Lai/grazie/code/indexing/model/IndexItemType;", "getTargetIndexItemType", "()Lai/grazie/code/indexing/model/IndexItemType;", "model-indexing"})
public interface IndexableEntity {
  @NotNull
  EntityId getId();
  
  @NotNull
  String getContent();
  
  @NotNull
  String getIndexableContent();
  
  void setIndexableContent(@NotNull String paramString);
  
  @NotNull
  List<String> getMeta();
  
  @NotNull
  IndexItemType getTargetIndexItemType();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\index\IndexableEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */