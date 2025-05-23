package ai.grazie.tasks.provider.prompt.velocity.resources.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\022\020\b\032\0020\003X¦\004¢\006\006\032\004\b\t\020\005R\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\024\020\016\032\004\030\0010\017X¦\004¢\006\006\032\004\b\020\020\021ø\001\000\002\006\n\004\b!0\001¨\006\022À\006\001"}, d2 = {"Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelBaseTaskTagDescriptor;", "", "tag", "", "getTag", "()Ljava/lang/String;", "model", "getModel", "promptPath", "getPromptPath", "experimental", "", "getExperimental", "()Z", "modelParameters", "Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "getModelParameters", "()Lai/grazie/tasks/provider/prompt/velocity/resources/model/VelocityModelModelParameters;", "tasks-provider-llm-prompt-velocity-model"})
public interface VelocityModelBaseTaskTagDescriptor {
  @NotNull
  String getTag();
  
  @NotNull
  String getModel();
  
  @NotNull
  String getPromptPath();
  
  boolean getExperimental();
  
  @Nullable
  VelocityModelModelParameters getModelParameters();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\model\VelocityModelBaseTaskTagDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */