package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CodeEditUtils.kt", l = {158}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$toErrorMessages", "project"}, m = "toErrorMessages$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.CodeEditUtils")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CodeEditUtils$toErrorMessages$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  CodeEditUtils$toErrorMessages$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CodeEditUtils.this.toErrorMessages$ej_core(null, null, null, (Continuation<? super List<String>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\CodeEditUtils$toErrorMessages$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */