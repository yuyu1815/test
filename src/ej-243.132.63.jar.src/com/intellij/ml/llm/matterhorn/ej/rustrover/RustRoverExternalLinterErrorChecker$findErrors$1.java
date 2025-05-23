package com.intellij.ml.llm.matterhorn.ej.rustrover;

import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RustRoverExternalLinterErrorChecker.kt", l = {25, 40}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"file", "path"}, m = "findErrors", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverExternalLinterErrorChecker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RustRoverExternalLinterErrorChecker$findErrors$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  RustRoverExternalLinterErrorChecker$findErrors$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RustRoverExternalLinterErrorChecker.this.findErrors(null, null, (Continuation<? super List<? extends Error>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\RustRoverExternalLinterErrorChecker$findErrors$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */