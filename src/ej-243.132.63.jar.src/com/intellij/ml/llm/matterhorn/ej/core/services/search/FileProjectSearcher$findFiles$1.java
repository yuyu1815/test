package com.intellij.ml.llm.matterhorn.ej.core.services.search;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "FileProjectSearcher.kt", l = {48}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"query", "result"}, m = "findFiles", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.FileProjectSearcher")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class FileProjectSearcher$findFiles$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  FileProjectSearcher$findFiles$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return FileProjectSearcher.access$findFiles(FileProjectSearcher.this, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\FileProjectSearcher$findFiles$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */