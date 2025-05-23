package com.intellij.ml.llm.matterhorn.ej.core.services.search;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "FileProjectSearcher.kt", l = {32}, i = {0}, s = {"L$0"}, n = {"query"}, m = "searchProject", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.FileProjectSearcher")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class FileProjectSearcher$searchProject$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  FileProjectSearcher$searchProject$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return FileProjectSearcher.this.searchProject(null, null, (Continuation<? super List<SearchResultItem>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\FileProjectSearcher$searchProject$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */