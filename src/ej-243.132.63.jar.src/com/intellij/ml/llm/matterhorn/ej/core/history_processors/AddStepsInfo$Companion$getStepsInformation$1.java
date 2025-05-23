package com.intellij.ml.llm.matterhorn.ej.core.history_processors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AddStepsInfo.kt", l = {43}, i = {0}, s = {"L$0"}, n = {"context"}, m = "getStepsInformation", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.AddStepsInfo$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AddStepsInfo$Companion$getStepsInformation$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  AddStepsInfo$Companion$getStepsInformation$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AddStepsInfo.Companion.this.getStepsInformation(null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\AddStepsInfo$Companion$getStepsInformation$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */