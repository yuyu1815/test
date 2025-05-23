package com.intellij.ml.llm.matterhorn.core.llm.grazie;

import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\bf\030\0002\0020\001J\020\020\002\032\004\030\0010\003H¦@¢\006\002\020\004J\016\020\005\032\0020\006H¦@¢\006\002\020\004¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieAuthService;", "", "getClient", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reloginAndWait", "", "core-llm"})
public interface GrazieAuthService {
  @Nullable
  Object getClient(@NotNull Continuation<? super SuspendableAPIGatewayClient> paramContinuation);
  
  @Nullable
  Object reloginAndWait(@NotNull Continuation<? super Unit> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieAuthService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */