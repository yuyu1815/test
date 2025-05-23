package feedback;

import kotlin.Metadata;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&¨\006\006"}, d2 = {"Lfeedback/JsonDataProvider;", "", "collectBlockDataToJson", "", "jsonObjectBuilder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "ej-ui"})
public interface JsonDataProvider {
  void collectBlockDataToJson(@NotNull JsonObjectBuilder paramJsonObjectBuilder);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\feedback\JsonDataProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */