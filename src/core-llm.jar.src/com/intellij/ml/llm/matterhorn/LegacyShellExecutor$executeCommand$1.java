package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "LegacyShellExecutor.kt", l = {66, 86}, i = {0}, s = {"L$0"}, n = {"$this"}, m = "executeCommand$suspendImpl", c = "com.intellij.ml.llm.matterhorn.LegacyShellExecutor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class LegacyShellExecutor$executeCommand$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  LegacyShellExecutor$executeCommand$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return LegacyShellExecutor.executeCommand$suspendImpl(LegacyShellExecutor.this, null, (Continuation<? super ShellExecutor.CommandResult>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\LegacyShellExecutor$executeCommand$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */