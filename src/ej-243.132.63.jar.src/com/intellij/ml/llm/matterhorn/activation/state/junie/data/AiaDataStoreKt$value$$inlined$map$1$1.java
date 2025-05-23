package com.intellij.ml.llm.matterhorn.activation.state.junie.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
public final class null extends ContinuationImpl {
  int label;
  
  public null(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return AiaDataStoreKt$value$$inlined$map$1.this.collect(null, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\AiaDataStoreKt$value$$inlined$map$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */