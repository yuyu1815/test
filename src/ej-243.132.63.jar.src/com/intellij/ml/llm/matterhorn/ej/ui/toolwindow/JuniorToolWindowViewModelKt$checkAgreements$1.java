package com.intellij.ml.llm.matterhorn.ej.ui.toolwindow;

import com.intellij.ml.llm.matterhorn.ej.ui.tasks.create.ErrorInfo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JuniorToolWindowViewModel.kt", l = {207}, i = {}, s = {}, n = {}, m = "checkAgreements", c = "com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.JuniorToolWindowViewModelKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JuniorToolWindowViewModelKt$checkAgreements$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  JuniorToolWindowViewModelKt$checkAgreements$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JuniorToolWindowViewModelKt.checkAgreements((Continuation<? super ErrorInfo>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\toolwindow\JuniorToolWindowViewModelKt$checkAgreements$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */