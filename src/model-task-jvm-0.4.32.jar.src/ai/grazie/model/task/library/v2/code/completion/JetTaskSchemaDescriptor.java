package ai.grazie.model.task.library.v2.code.completion;

import ai.grazie.model.task.id.TaskSchemaDescriptor;
import ai.grazie.model.task.library.code.attributes.OptContext;
import ai.grazie.utils.attributes.AttributeDescriptor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\022\020\016\032\0020\017X¦\004¢\006\006\032\004\b\020\020\021R\022\020\022\032\0020\013X¦\004¢\006\006\032\004\b\023\020\rR\022\020\024\032\0020\017X¦\004¢\006\006\032\004\b\025\020\021R\022\020\026\032\0020\013X¦\004¢\006\006\032\004\b\027\020\rø\001\000\002\006\n\004\b!0\001¨\006\030À\006\001"}, d2 = {"Lai/grazie/model/task/library/v2/code/completion/JetTaskSchemaDescriptor;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "context", "Lai/grazie/model/task/library/code/attributes/OptContext;", "getContext", "()Lai/grazie/model/task/library/code/attributes/OptContext;", "filepath", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getFilepath", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "generateIndents", "Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "getGenerateIndents", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptBool;", "prefix", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getPrefix", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "provideLogitsMetadata", "getProvideLogitsMetadata", "suffix", "getSuffix", "useControl", "getUseControl", "model-task"})
public interface JetTaskSchemaDescriptor extends TaskSchemaDescriptor {
  @NotNull
  AttributeDescriptor.Text getPrefix();
  
  @NotNull
  AttributeDescriptor.Text getSuffix();
  
  @NotNull
  AttributeDescriptor.OptText getFilepath();
  
  @NotNull
  OptContext getContext();
  
  @NotNull
  AttributeDescriptor.OptBool getUseControl();
  
  @NotNull
  AttributeDescriptor.OptBool getProvideLogitsMetadata();
  
  @NotNull
  AttributeDescriptor.OptBool getGenerateIndents();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\code\completion\JetTaskSchemaDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */