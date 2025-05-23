package com.intellij.ml.llm.matterhorn.core.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "MatterhornAIProxy.kt", l = {116}, i = {}, s = {}, n = {}, m = "getBody", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class MatterhornAIProxy$Companion$getBody$1 extends ContinuationImpl {
  int label;
  
  MatterhornAIProxy$Companion$getBody$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return MatterhornAIProxy.Companion.this.getBody(null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornAIProxy$Companion$getBody$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */