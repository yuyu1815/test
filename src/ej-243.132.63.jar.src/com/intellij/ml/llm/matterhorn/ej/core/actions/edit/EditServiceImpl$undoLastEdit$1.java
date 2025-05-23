package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditServiceImpl.kt", l = {44}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$3"}, n = {"this", "destination$iv$iv", "destination$iv$iv"}, m = "undoLastEdit", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditServiceImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditServiceImpl$undoLastEdit$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  EditServiceImpl$undoLastEdit$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditServiceImpl.this.undoLastEdit((Continuation<? super List<? extends UndoResult>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditServiceImpl$undoLastEdit$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */