package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditSearchReplace.kt", l = {328}, i = {0, 0}, s = {"L$1", "Z$0"}, n = {"$this$resultFromErrorMessages_u24lambda_u2414", "hasMultipleEdits"}, m = "resultFromErrorMessages$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSearchReplace")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditSearchReplace$resultFromErrorMessages$1 extends ContinuationImpl {
  boolean Z$0;
  
  Object L$0;
  
  Object L$1;
  
  int label;
  
  EditSearchReplace$resultFromErrorMessages$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditSearchReplace.resultFromErrorMessages$suspendImpl(EditSearchReplace.this, null, null, null, false, false, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSearchReplace$resultFromErrorMessages$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */