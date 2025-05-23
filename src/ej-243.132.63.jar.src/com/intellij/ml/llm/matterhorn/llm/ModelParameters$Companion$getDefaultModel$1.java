package com.intellij.ml.llm.matterhorn.llm;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ModelParameters.kt", l = {234, 239, 240, 241}, i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, n = {"user", "propertyProvider", "user", "propertyProvider", "model", "user", "propertyProvider", "model", "temperature", "user", "model", "temperature", "topP"}, m = "getDefaultModel", c = "com.intellij.ml.llm.matterhorn.llm.ModelParameters$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ModelParameters$Companion$getDefaultModel$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  ModelParameters$Companion$getDefaultModel$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ModelParameters.Companion.this.getDefaultModel(null, null, (Continuation<? super ModelParameters>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\ModelParameters$Companion$getDefaultModel$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */