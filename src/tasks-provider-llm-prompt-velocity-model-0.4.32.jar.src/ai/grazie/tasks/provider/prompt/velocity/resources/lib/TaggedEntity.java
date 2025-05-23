package ai.grazie.tasks.provider.prompt.velocity.resources.lib;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bv\030\000*\b\b\000\020\001*\0020\0022\0020\003R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007R\030\020\b\032\b\022\004\022\0020\0050\tX¦\004¢\006\006\032\004\b\n\020\013R\030\020\f\032\b\022\004\022\0028\0000\tX¦\004¢\006\006\032\004\b\r\020\013\001\003\016\017\020ø\001\000\002\006\n\004\b!0\001¨\006\021À\006\001"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;", "TagT", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/EntityTag;", "", "entityName", "", "getEntityName", "()Ljava/lang/String;", "registeredTags", "", "getRegisteredTags", "()Ljava/util/List;", "tagPriorities", "getTagPriorities", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityChatTask;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityFunction;", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/VelocityTask;", "tasks-provider-llm-prompt-velocity-model"})
public interface TaggedEntity<TagT extends EntityTag> {
  @NotNull
  String getEntityName();
  
  @NotNull
  List<String> getRegisteredTags();
  
  @NotNull
  List<TagT> getTagPriorities();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\TaggedEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */