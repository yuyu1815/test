package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IngrazzioAuthService.kt", l = {215, 216, 232, 233}, i = {0, 2}, s = {"L$0", "L$0"}, n = {"this", "this"}, m = "startAndAwaitAuthorizationProcess", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class IngrazzioAuthService$startAndAwaitAuthorizationProcess$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  IngrazzioAuthService$startAndAwaitAuthorizationProcess$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IngrazzioAuthService.this.startAndAwaitAuthorizationProcess(false, (Continuation<? super AccessToken>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\IngrazzioAuthService$startAndAwaitAuthorizationProcess$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */