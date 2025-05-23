package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractIssueSingleStepAgentWorker.kt", l = {95, 102, 105, 108, 111, 115, 118, 121, 124, 127, 130, 133, 136, 139, 142, 145, 148, 151}, i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 17}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentParameters$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AgentParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  AgentParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AgentParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super AgentParameters>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentParameters$Companion$setupFromEnvironment$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */