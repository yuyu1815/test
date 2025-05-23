package com.intellij.ml.llm.matterhorn.requests;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mv = {2, 1, 0}, k = 3, xi = 176)
public final class GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1 extends ContinuationImpl {
  int label;
  
  public GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1(Continuation $completion) {
    super($completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return GrazieRequestBuilderExKt$addSimpleReviewer$1.this.review(null, (Continuation<? super ReviewResult>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\requests\GrazieRequestBuilderExKt$addSimpleReviewer$1$review$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */