package com.intellij.ml.llm.matterhorn.ej.core.actions.tools;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SearchReplaceToolAction.kt", l = {99, 103, 107}, i = {0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, n = {"$this", "context", "$this", "context", "edits"}, m = "reviewActionRequest$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.tools.SearchReplaceToolAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class SearchReplaceToolAction$reviewActionRequest$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  SearchReplaceToolAction$reviewActionRequest$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SearchReplaceToolAction.reviewActionRequest$suspendImpl(SearchReplaceToolAction.this, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\tools\SearchReplaceToolAction$reviewActionRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */