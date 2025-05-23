package ai.grazie.model.cloud;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\000*\b\b\000\020\001*\0020\0022\0020\003R\030\020\004\032\b\022\004\022\0028\0000\005X¦\004¢\006\006\032\004\b\006\020\007ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/model/cloud/UnitTypedApi;", "ResponseType", "", "Lai/grazie/model/cloud/API;", "responseType", "Lai/grazie/model/cloud/TypeInfo;", "getResponseType", "()Lai/grazie/model/cloud/TypeInfo;", "model-cloud"})
public interface UnitTypedApi<ResponseType> extends API {
  @NotNull
  TypeInfo<ResponseType> getResponseType();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\UnitTypedApi.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */