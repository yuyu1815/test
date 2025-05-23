package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;

import com.intellij.ml.llm.matterhorn.ej.core.Result;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "FilePathActionLocationExtractor.kt", l = {19, 20, 22, 27}, i = {0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "mustIgnore", "this", "mustIgnore", "virtualFile", "this", "testClasses", "nioPath"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FilePathActionLocationExtractor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class FilePathActionLocationExtractor$extract$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  FilePathActionLocationExtractor$extract$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return FilePathActionLocationExtractor.this.extract(null, null, (Continuation<? super Result<? extends List<? extends ActionLocation>, Unit>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\FilePathActionLocationExtractor$extract$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */