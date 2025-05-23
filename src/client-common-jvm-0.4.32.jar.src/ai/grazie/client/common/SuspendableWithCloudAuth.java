package ai.grazie.client.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Lai/grazie/client/common/SuspendableWithCloudAuth;", "Lai/grazie/client/common/WithCloudAuth;", "baseHTTPClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "getBaseHTTPClient", "()Lai/grazie/client/common/SuspendableHTTPClient;", "client-common"})
public interface SuspendableWithCloudAuth extends WithCloudAuth {
  @NotNull
  SuspendableHTTPClient getBaseHTTPClient();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableWithCloudAuth.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */