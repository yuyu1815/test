package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractEditAction.kt", l = {159, 162, 171, 178, 202, 203, 209, 220, 244, 255}, i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$2", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "I$2", "L$1"}, n = {"this", "context", "document", "replacementText", "project", "replacedText", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "replacementText", "project", "replacedText", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "replacementText", "project", "replacedText", "fileCopy", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "replacementText", "project", "replacedText", "fileCopy", "errors", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "project", "replacedText", "errors", "virtualFile", "nioPath", "editedDoc", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "project", "errors", "virtualFile", "editedDoc", "session", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "project", "errors", "virtualFile", "editedDoc", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "document", "$this$changeText_u24lambda_u247", "context", "project", "virtualFile", "editedScreen", "$this$changeText_u24lambda_u247", "startLineIncl", "endLineIncl", "margin", "$this$changeText_u24lambda_u247"}, m = "changeText", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractEditAction$changeText$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  Object L$8;
  
  int I$0;
  
  int I$1;
  
  int I$2;
  
  int I$3;
  
  boolean Z$0;
  
  int label;
  
  AbstractEditAction$changeText$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractEditAction.this.changeText(null, null, 0, 0, null, null, 0, 0, false, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\AbstractEditAction$changeText$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */