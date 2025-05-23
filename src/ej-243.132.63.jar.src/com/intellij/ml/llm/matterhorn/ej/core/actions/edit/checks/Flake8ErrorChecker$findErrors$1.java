package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SyntaxChecker.kt", l = {89, 91, 107, 110}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "file", "projectPath", "this", "file", "executor", "this", "executor", "originalFile"}, m = "findErrors", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Flake8ErrorChecker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class Flake8ErrorChecker$findErrors$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  Flake8ErrorChecker$findErrors$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return Flake8ErrorChecker.this.findErrors(null, null, (Continuation<? super List<? extends Error>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\Flake8ErrorChecker$findErrors$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */