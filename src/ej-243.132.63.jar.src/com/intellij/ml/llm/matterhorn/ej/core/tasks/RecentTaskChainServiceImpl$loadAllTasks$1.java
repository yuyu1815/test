package com.intellij.ml.llm.matterhorn.ej.core.tasks;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RecentTaskChainServiceImpl.kt", l = {89, 90, 93}, i = {0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, n = {"this", "taskStorage", "this", "taskStorage", "destination$iv$iv"}, m = "loadAllTasks$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.tasks.RecentTaskChainServiceImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RecentTaskChainServiceImpl$loadAllTasks$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  RecentTaskChainServiceImpl$loadAllTasks$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RecentTaskChainServiceImpl.this.loadAllTasks$ej_core((Continuation<? super List<RecentTaskChain>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\RecentTaskChainServiceImpl$loadAllTasks$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */