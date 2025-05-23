package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "FileFQNActionLocationExtractor.kt", l = {38}, i = {}, s = {}, n = {}, m = "matches", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FileFQNActionLocationExtractor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class FileFQNActionLocationExtractor$matches$1 extends ContinuationImpl {
  int label;
  
  FileFQNActionLocationExtractor$matches$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return FileFQNActionLocationExtractor.this.matches(null, (Continuation<? super Boolean>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\FileFQNActionLocationExtractor$matches$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */