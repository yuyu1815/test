package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditSearchReplace.kt", l = {474, 493}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0"}, n = {"edit", "matchingResult", "agentSessionHistory", "msg", "document", "edit", "fileNameToDocument", "agentSessionHistory", "msg", "document", "idx"}, m = "formatErrorMessage$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditSearchReplace$formatErrorMessage$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  int I$0;
  
  int label;
  
  EditSearchReplace$formatErrorMessage$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditSearchReplace.formatErrorMessage$suspendImpl(EditSearchReplace.this, null, null, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSearchReplace$formatErrorMessage$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */