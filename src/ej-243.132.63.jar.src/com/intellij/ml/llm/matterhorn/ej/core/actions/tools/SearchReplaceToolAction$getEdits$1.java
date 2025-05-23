package com.intellij.ml.llm.matterhorn.ej.core.actions.tools;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SearchReplaceToolAction.kt", l = {85}, i = {}, s = {}, n = {}, m = "getEdits", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.tools.SearchReplaceToolAction")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class SearchReplaceToolAction$getEdits$1 extends ContinuationImpl {
  int label;
  
  SearchReplaceToolAction$getEdits$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SearchReplaceToolAction.access$getEdits(SearchReplaceToolAction.this, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\tools\SearchReplaceToolAction$getEdits$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */