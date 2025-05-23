package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "AbstractEditWorker.kt", l = {229, 241}, i = {0, 0, 0, 0, 0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0"}, n = {"this", "actions", "currentState", "context", "agentParameters", "destination$iv$iv", "attempt", "actionsFiltered"}, m = "checkAndSortActions", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.AbstractEditWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class AbstractEditWorker$checkAndSortActions$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  Object L$7;
  
  int I$0;
  
  int label;
  
  AbstractEditWorker$checkAndSortActions$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AbstractEditWorker.this.checkAndSortActions(null, null, null, 0, null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\AbstractEditWorker$checkAndSortActions$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */