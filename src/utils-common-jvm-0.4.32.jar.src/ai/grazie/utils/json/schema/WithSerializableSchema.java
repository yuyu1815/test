package ai.grazie.utils.json.schema;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\000*\004\b\000\020\0012\0020\002R\030\020\003\032\b\022\004\022\0028\0000\004X¦\004¢\006\006\032\004\b\005\020\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/utils/json/schema/WithSerializableSchema;", "T", "Lai/grazie/utils/json/schema/WithSchema;", "serializable", "Lkotlinx/serialization/KSerializer;", "getSerializable", "()Lkotlinx/serialization/KSerializer;", "utils-common"})
public interface WithSerializableSchema<T> extends WithSchema {
  @NotNull
  KSerializer<T> getSerializable();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\schema\WithSerializableSchema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */