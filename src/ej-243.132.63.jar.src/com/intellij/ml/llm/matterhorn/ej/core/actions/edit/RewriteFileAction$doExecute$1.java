package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RewriteFileAction.kt", l = {55, 59}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "Z$0"}, n = {"this", "context", "replacementText", "dryRun"}, m = "doExecute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.RewriteFileAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RewriteFileAction$doExecute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  boolean Z$0;
  
  int label;
  
  RewriteFileAction$doExecute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RewriteFileAction.access$doExecute(RewriteFileAction.this, null, null, false, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\RewriteFileAction$doExecute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */