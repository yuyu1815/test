package com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors;

import com.intellij.psi.PsiFile;
import com.intellij.psi.SmartPsiElementPointer;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RelevantFilesOrderedExtractor.kt", l = {21, 47, 57, 63, 62}, i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "J$0", "L$0"}, n = {"this", "startTime", "this", "fileMap", "prompt", "startTime", "this", "prompt", "allResponses", "startTime", "result", "execTime", "result"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.RelevantFilesOrderedExtractor")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RelevantFilesOrderedExtractor$extract$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  Object L$5;
  
  Object L$6;
  
  long J$0;
  
  int label;
  
  RelevantFilesOrderedExtractor$extract$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RelevantFilesOrderedExtractor.this.extract(null, (Continuation<? super List<? extends SmartPsiElementPointer<? extends PsiFile>>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\extractors\RelevantFilesOrderedExtractor$extract$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */