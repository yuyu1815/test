package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractEditWorker.kt", l = {58, 66, 70, 74, 78}, i = {0, 0, 1, 1, 2, 2, 3, 3, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.EditAgentParameters$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditAgentParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  EditAgentParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditAgentParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super EditAgentParameters>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\EditAgentParameters$Companion$setupFromEnvironment$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */