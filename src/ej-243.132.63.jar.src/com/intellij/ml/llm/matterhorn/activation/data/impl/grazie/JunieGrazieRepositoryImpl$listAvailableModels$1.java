package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;

import com.intellij.ml.llm.activation.data.model.LlmModelId;
import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {83, 85}, i = {}, s = {}, n = {}, m = "listAvailableModels-1CSWKTE", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieGrazieRepositoryImpl$listAvailableModels$1 extends ContinuationImpl {
  int label;
  
  JunieGrazieRepositoryImpl$listAvailableModels$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieGrazieRepositoryImpl.this.listAvailableModels-1CSWKTE(null, null, (Continuation<? super GrazieResult<? extends List<LlmModelId>>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\JunieGrazieRepositoryImpl$listAvailableModels$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */