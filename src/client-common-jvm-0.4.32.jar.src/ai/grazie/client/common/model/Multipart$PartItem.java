package ai.grazie.client.common.model;

import ai.grazie.model.cloud.HeaderCollection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\007X¦\004¢\006\006\032\004\b\013\020\tø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/client/common/model/Multipart$PartItem;", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "getHeaders", "()Lai/grazie/model/cloud/HeaderCollection;", "key", "", "getKey", "()Ljava/lang/String;", "value", "getValue", "client-common"})
public interface PartItem {
  @NotNull
  String getKey();
  
  @NotNull
  String getValue();
  
  @NotNull
  HeaderCollection getHeaders();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\Multipart$PartItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */