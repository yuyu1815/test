package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import com.intellij.ml.llm.matterhorn.ej.core.Result;
import com.intellij.openapi.vfs.VirtualFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditSubagentAction.kt", l = {84}, i = {}, s = {}, n = {}, m = "parseArguments", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.EditSubagentAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditSubagentAction$parseArguments$1 extends ContinuationImpl {
  int label;
  
  EditSubagentAction$parseArguments$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditSubagentAction.this.parseArguments(null, null, (Continuation<? super Result<? extends VirtualFile, Unit>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSubagentAction$parseArguments$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */