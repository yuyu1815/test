package com.intellij.ml.llm.matterhorn.ej.ui.activation;

import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieGrazieAuthService.kt", l = {21, 26}, i = {1}, s = {"L$0"}, n = {"authContext"}, m = "getClient", c = "com.intellij.ml.llm.matterhorn.ej.ui.activation.JunieGrazieAuthService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieGrazieAuthService$getClient$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  JunieGrazieAuthService$getClient$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieGrazieAuthService.this.getClient((Continuation<? super SuspendableAPIGatewayClient>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JunieGrazieAuthService$getClient$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */