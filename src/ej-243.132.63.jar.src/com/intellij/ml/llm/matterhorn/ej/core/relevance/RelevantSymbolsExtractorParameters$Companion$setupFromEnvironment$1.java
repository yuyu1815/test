package com.intellij.ml.llm.matterhorn.ej.core.relevance;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RelevantSymbolsExtractorWorker.kt", l = {130, 138, 142, 146, 153, 157, 161, 165, 169}, i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "propertyProvider", "result", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.core.relevance.RelevantSymbolsExtractorParameters$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RelevantSymbolsExtractorParameters.Companion.this.setupFromEnvironment(null, null, (Continuation<? super RelevantSymbolsExtractorParameters>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\relevance\RelevantSymbolsExtractorParameters$Companion$setupFromEnvironment$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */