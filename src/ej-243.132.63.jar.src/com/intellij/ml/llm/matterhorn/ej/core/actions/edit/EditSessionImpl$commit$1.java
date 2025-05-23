package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditValidationService.kt", l = {87, 127, 132, 142}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$4", "L$0", "L$1", "L$2"}, n = {"this", "psiDocumentManager", "localHistoryAction", "this", "psiDocumentManager", "localHistoryAction", "edit", "this", "psiDocumentManager", "localHistoryAction"}, m = "commit", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSessionImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditSessionImpl$commit$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  EditSessionImpl$commit$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditSessionImpl.this.commit((Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSessionImpl$commit$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */