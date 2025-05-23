package com.intellij.ml.llm.matterhorn.ej.core.critique;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NebiusCritique.kt", l = {54}, i = {0}, s = {"L$0"}, n = {"json"}, m = "getTrajectoryElementAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritique")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class NebiusCritique$getTrajectoryElementAgent$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  NebiusCritique$getTrajectoryElementAgent$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NebiusCritique.access$getTrajectoryElementAgent(NebiusCritique.this, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\NebiusCritique$getTrajectoryElementAgent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */