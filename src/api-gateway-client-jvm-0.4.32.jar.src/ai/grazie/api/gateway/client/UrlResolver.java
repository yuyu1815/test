package ai.grazie.api.gateway.client;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\032\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\005H¦@¢\006\002\020\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Lai/grazie/api/gateway/client/UrlResolver;", "", "resolve", "Lai/grazie/api/gateway/client/ResolutionResult;", "provider", "Lai/grazie/api/gateway/client/CloudProvider;", "(Lai/grazie/api/gateway/client/CloudProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
public interface UrlResolver {
  @Nullable
  Object resolve(@Nullable CloudProvider paramCloudProvider, @NotNull Continuation<? super ResolutionResult> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\UrlResolver.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */