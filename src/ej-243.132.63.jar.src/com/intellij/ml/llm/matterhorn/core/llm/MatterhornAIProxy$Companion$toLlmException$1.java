package com.intellij.ml.llm.matterhorn.core.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "MatterhornAIProxy.kt", l = {71}, i = {}, s = {}, n = {}, m = "toLlmException$core_llm", c = "com.intellij.ml.llm.matterhorn.core.llm.MatterhornAIProxy$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class MatterhornAIProxy$Companion$toLlmException$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  MatterhornAIProxy$Companion$toLlmException$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return MatterhornAIProxy.Companion.this.toLlmException$core_llm(null, (Continuation<? super RuntimeException>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornAIProxy$Companion$toLlmException$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */