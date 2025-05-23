package feedback;

import kotlin.Metadata;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bv\030\0002\0020\001J\b\020\n\032\0020\007H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\t\001\002\013\f¨\006\r"}, d2 = {"Lfeedback/FeedbackRequestDataHolder;", "", "feedbackType", "", "getFeedbackType", "()Ljava/lang/String;", "collectedData", "Lkotlinx/serialization/json/JsonObject;", "getCollectedData", "()Lkotlinx/serialization/json/JsonObject;", "toJsonObject", "Lfeedback/FeedbackRequestData;", "Lfeedback/FeedbackRequestDataWithDetailedAnswer;", "ej-ui"})
public interface FeedbackRequestDataHolder {
  @NotNull
  String getFeedbackType();
  
  @NotNull
  JsonObject getCollectedData();
  
  @NotNull
  JsonObject toJsonObject();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\FeedbackRequestDataHolder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */