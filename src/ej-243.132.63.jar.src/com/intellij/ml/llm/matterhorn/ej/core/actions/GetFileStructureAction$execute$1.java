package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "GetFileStructureAction.kt", l = {42, 45, 53, 57, 61, 66, 72, 74, 75}, i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "context", "this", "context", "this", "context", "file", "filePath", "this", "context", "file", "filePath", "this", "context", "file", "filePath", "psiFile", "this", "context", "filePath", "psiFile", "fileNameToStructure", "this", "context", "filePath", "fileNameToStructure", "importStatementsTagged", "context", "filePath", "fileNameToStructure", "importStatementsTagged"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.GetFileStructureAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class GetFileStructureAction$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  GetFileStructureAction$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GetFileStructureAction.this.execute(null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\GetFileStructureAction$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */