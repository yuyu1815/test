package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SearchProjectAction.kt", l = {99, 107, 109, 111, 114, 115}, i = {0, 0, 2, 2, 2, 2, 4, 4, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"$this", "context", "$this", "context", "searchTerm", "searchEverywhere", "$this", "searchTerm", "searchEverywhere"}, m = "execute$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.SearchProjectAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class SearchProjectAction$execute$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  SearchProjectAction$execute$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SearchProjectAction.execute$suspendImpl(SearchProjectAction.this, null, null, (Continuation<? super String>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\SearchProjectAction$execute$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */