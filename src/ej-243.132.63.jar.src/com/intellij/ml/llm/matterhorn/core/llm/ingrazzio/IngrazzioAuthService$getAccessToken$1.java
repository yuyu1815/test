package com.intellij.ml.llm.matterhorn.core.llm.ingrazzio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "IngrazzioAuthService.kt", l = {181, 189, 193}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"this", "this"}, m = "getAccessToken", c = "com.intellij.ml.llm.matterhorn.core.llm.ingrazzio.IngrazzioAuthService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class IngrazzioAuthService$getAccessToken$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  IngrazzioAuthService$getAccessToken$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return IngrazzioAuthService.this.getAccessToken((Continuation<? super AccessToken>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\ingrazzio\IngrazzioAuthService$getAccessToken$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */