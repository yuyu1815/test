package com.intellij.ml.llm.matterhorn.ej.core.critique;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "NebiusCritique.kt", l = {114, 114, 119, 118, 124, 122}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"}, n = {"this", "systemPrompt", "observations", "context", "propertyProvider", "this", "observations", "context", "propertyProvider", "this", "context", "propertyProvider", "it", "this", "context", "propertyProvider", "this", "context", "propertyProvider", "it", "this", "context", "propertyProvider"}, m = "logCritiqueInputToTrajectory", c = "com.intellij.ml.llm.matterhorn.ej.core.critique.NebiusCritique")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class NebiusCritique$logCritiqueInputToTrajectory$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int label;
  
  NebiusCritique$logCritiqueInputToTrajectory$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return NebiusCritique.access$logCritiqueInputToTrajectory(NebiusCritique.this, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\critique\NebiusCritique$logCritiqueInputToTrajectory$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */