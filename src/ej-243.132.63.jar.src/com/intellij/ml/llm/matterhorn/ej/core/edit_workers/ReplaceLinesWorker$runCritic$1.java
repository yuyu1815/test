package com.intellij.ml.llm.matterhorn.ej.core.edit_workers;

import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ReplaceLinesWorker.kt", l = {89, 89}, i = {}, s = {}, n = {}, m = "runCritic", c = "com.intellij.ml.llm.matterhorn.ej.core.edit_workers.ReplaceLinesWorker")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ReplaceLinesWorker$runCritic$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int I$0;
  
  int label;
  
  ReplaceLinesWorker$runCritic$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ReplaceLinesWorker.this.runCritic(null, 0, null, null, (Continuation<? super List<? extends MatterhornChatElement>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\edit_workers\ReplaceLinesWorker$runCritic$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */