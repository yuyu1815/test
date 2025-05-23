package ai.grazie.model.auth;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\007\020\005R\022\020\b\032\0020\003X¦\004¢\006\006\032\004\b\t\020\005ø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/model/auth/GrazieService;", "Lai/grazie/model/auth/GrazieAuthEntity;", "service", "", "getService", "()Ljava/lang/String;", "stage", "getStage", "tokenId", "getTokenId", "model-auth"})
public interface GrazieService extends GrazieAuthEntity {
  @NotNull
  String getService();
  
  @NotNull
  String getStage();
  
  @NotNull
  String getTokenId();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-auth-jvm-0.4.32.jar!\ai\grazie\model\auth\GrazieService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */