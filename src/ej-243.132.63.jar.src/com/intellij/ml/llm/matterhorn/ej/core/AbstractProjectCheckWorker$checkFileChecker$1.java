package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractProjectCheckWorker.kt", l = {66, 72, 77, 82, 91, 93, 95, 103, 103}, i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$3", "L$4", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$2", "L$3", "L$4", "L$5", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0"}, n = {"agentContext", "file", "agentContext", "file", "agentContext", "file", "document", "documentManager", "agentContext", "file", "document", "documentManager", "psiFile", "errors", "agentContext", "file", "document", "documentManager", "errors", "originalText", "agentContext", "file", "document", "errors", "originalText", "agentContext", "file", "document", "errors", "originalText", "updatedPsiFile", "agentContext"}, m = "checkFileChecker", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractProjectCheckWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractProjectCheckWorker$checkFileChecker$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  Object L$8;
  
  int label;
  
  AbstractProjectCheckWorker$checkFileChecker$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractProjectCheckWorker.this.checkFileChecker(null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractProjectCheckWorker$checkFileChecker$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */