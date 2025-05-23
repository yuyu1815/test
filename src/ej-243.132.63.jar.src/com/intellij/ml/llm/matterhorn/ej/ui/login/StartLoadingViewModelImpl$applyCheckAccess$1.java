package com.intellij.ml.llm.matterhorn.ej.ui.login;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "StartLoadingViewModelImpl.kt", l = {109, 111, 120}, i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1"}, n = {"this", "authService", "showErrorIfNotGranted", "this", "authService", "accessToken", "showErrorIfNotGranted", "this", "authService"}, m = "applyCheckAccess", c = "com.intellij.ml.llm.matterhorn.ej.ui.login.StartLoadingViewModelImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class StartLoadingViewModelImpl$applyCheckAccess$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  boolean Z$0;
  
  int label;
  
  StartLoadingViewModelImpl$applyCheckAccess$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return StartLoadingViewModelImpl.access$applyCheckAccess(StartLoadingViewModelImpl.this, false, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\StartLoadingViewModelImpl$applyCheckAccess$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */