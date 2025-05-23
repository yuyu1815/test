package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SearchProjectAction.kt", l = {218}, i = {0, 0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$6"}, n = {"groupTitle", "result", "mustIgnore", "process", "destination$iv$iv", "element$iv$iv"}, m = "processResults", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class SearchProjectAction$processResults$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  int label;
  
  SearchProjectAction$processResults$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SearchProjectAction.access$processResults(SearchProjectAction.this, null, null, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$processResults$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */