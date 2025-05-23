package com.intellij.ml.llm.matterhorn.ej.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "EditorContext.kt", l = {139, 144, 150, 154}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"$this$collectCurrentFileContext", "context", "editor", "file", "nioPath", "$this$collectCurrentFileContext", "context", "editor", "file", "$this$collectCurrentFileContext", "context", "file"}, m = "collectCurrentFileContext", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class EditorContext$collectCurrentFileContext$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  EditorContext$collectCurrentFileContext$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return EditorContext.access$collectCurrentFileContext(EditorContext.this, null, null, null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EditorContext$collectCurrentFileContext$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */