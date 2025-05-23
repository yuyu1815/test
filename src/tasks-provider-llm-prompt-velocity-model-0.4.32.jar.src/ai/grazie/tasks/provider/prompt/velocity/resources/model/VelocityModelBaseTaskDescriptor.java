package ai.grazie.tasks.provider.prompt.velocity.resources.model;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\005\n\002\020 \n\002\b\003\n\002\020\013\n\002\b\t\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\030\020\b\032\b\022\004\022\0020\0030\tX¦\004¢\006\006\032\004\b\n\020\013R\022\020\f\032\0020\rX¦\004¢\006\006\032\004\b\016\020\017R\032\020\020\032\0020\r8&X§\004¢\006\f\022\004\b\021\020\022\032\004\b\023\020\017R\024\020\024\032\004\030\0010\003X¦\004¢\006\006\032\004\b\025\020\005ø\001\000\002\006\n\004\b!0\001¨\006\026À\006\001"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelBaseTaskDescriptor;", "", "name", "", "getName", "()Ljava/lang/String;", "description", "getDescription", "tagPriorities", "", "getTagPriorities", "()Ljava/util/List;", "experimental", "", "getExperimental", "()Z", "deprecated", "getDeprecated$annotations", "()V", "getDeprecated", "deprecationMessage", "getDeprecationMessage", "tasks-provider-llm-prompt-velocity-model"})
public interface VelocityModelBaseTaskDescriptor {
  @NotNull
  String getName();
  
  @NotNull
  String getDescription();
  
  @NotNull
  List<String> getTagPriorities();
  
  boolean getExperimental();
  
  boolean getDeprecated();
  
  @Nullable
  String getDeprecationMessage();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelBaseTaskDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */