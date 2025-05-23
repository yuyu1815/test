package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractEditWorker.kt", l = {95, 96}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.AbstractEditWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractEditWorker$getAgentParameters$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AbstractEditWorker$getAgentParameters$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractEditWorker.getAgentParameters$suspendImpl(AbstractEditWorker.this, null, (Continuation<? super EditAgentParameters>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\AbstractEditWorker$getAgentParameters$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */