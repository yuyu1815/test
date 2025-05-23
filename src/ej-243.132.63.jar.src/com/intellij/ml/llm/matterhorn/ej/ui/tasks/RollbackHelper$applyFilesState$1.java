package com.intellij.ml.llm.matterhorn.ej.ui.tasks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "Rollback.kt", l = {43, 49, 56, 60, 63}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3", "L$4", "L$0", "L$1", "L$3"}, n = {"project", "projectPath", "path", "project", "projectPath", "path", "initialContent", "project", "projectPath", "path", "document", "project", "projectPath", "path", "document", "project", "projectPath", "path"}, m = "applyFilesState", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.RollbackHelper")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RollbackHelper$applyFilesState$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  RollbackHelper$applyFilesState$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RollbackHelper.this.applyFilesState(null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\RollbackHelper$applyFilesState$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */