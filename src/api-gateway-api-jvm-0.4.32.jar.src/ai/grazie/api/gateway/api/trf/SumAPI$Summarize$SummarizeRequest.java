package ai.grazie.api.gateway.api.trf;

import ai.grazie.sum.Format;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\005\bb\030\0002\0020\001R\024\020\002\032\004\030\0010\003X¦\004¢\006\006\032\004\b\004\020\005R\024\020\006\032\004\030\0010\007X¦\004¢\006\006\032\004\b\b\020\tR\024\020\n\032\004\030\0010\007X¦\004¢\006\006\032\004\b\013\020\tø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/api/gateway/api/trf/SumAPI$Summarize$SummarizeRequest;", "", "format", "Lai/grazie/sum/Format;", "getFormat", "()Lai/grazie/sum/Format;", "maximumBPE", "", "getMaximumBPE", "()Ljava/lang/Integer;", "minimumBPE", "getMinimumBPE", "api-gateway-api"})
interface SummarizeRequest {
  @Nullable
  Format getFormat();
  
  @Nullable
  Integer getMinimumBPE();
  
  @Nullable
  Integer getMaximumBPE();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-api-jvm-0.4.32.jar!\ai\grazie\api\gateway\api\trf\SumAPI$Summarize$SummarizeRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */