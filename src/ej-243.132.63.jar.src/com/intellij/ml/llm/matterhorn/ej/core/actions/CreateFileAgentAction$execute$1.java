package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CreateFileAgentAction.kt", l = {66, 75, 87, 100, 120, 103, 109, 120, 120, 120, 120}, i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"$this", "context", "$this", "context", "edit", "fileName", "path", "$this", "context", "edit", "fileName", "path", "fileForUpdate", "$this", "context", "edit", "fileName", "path", "fileForUpdate", "$this", "context", "edit", "fileName", "path", "fileForUpdate", "document", "$this", "context", "edit", "path", "fileForUpdate"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.CreateFileAgentAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CreateFileAgentAction$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  CreateFileAgentAction$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CreateFileAgentAction.execute$suspendImpl(CreateFileAgentAction.this, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\CreateFileAgentAction$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */