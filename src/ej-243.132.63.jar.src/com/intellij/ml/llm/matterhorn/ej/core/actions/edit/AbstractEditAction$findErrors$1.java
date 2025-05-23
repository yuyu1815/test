package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractEditAction.kt", l = {305, 314, 316}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"this", "checkType", "project", "document", "maxErrors", "executionContextForLogging", "project", "document", "maxErrors", "executionContextForLogging", "psiFile", "destination$iv$iv", "nameForLogging$iv", "project", "document", "maxErrors", "executionContextForLogging", "psiFile", "destination$iv$iv"}, m = "findErrors", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractEditAction$findErrors$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  int label;
  
  AbstractEditAction$findErrors$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractEditAction.this.findErrors(null, null, null, null, null, (Continuation<? super List<? extends Error>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\AbstractEditAction$findErrors$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */