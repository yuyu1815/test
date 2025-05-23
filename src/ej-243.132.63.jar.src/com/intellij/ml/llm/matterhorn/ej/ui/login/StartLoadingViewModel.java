package com.intellij.ml.llm.matterhorn.ej.ui.login;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\013\n\002\b\005\bf\030\0002\0020\001J\020\020\f\032\0020\r2\006\020\016\032\0020\017H&J\b\020\020\032\0020\rH&J\b\020\021\032\0020\rH&J\b\020\022\032\0020\017H&J\b\020\023\032\0020\rH&R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006R\030\020\007\032\b\022\004\022\0020\t0\bX¦\004¢\006\006\032\004\b\n\020\013¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/login/StartLoadingViewModel;", "", "effect", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenEffect;", "getEffect", "()Lkotlinx/coroutines/flow/Flow;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/login/LoginScreenState;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "startLoginAction", "", "openBrowser", "", "onBackToLogin", "openJoinWaitListAction", "isExternalBrowseSupported", "userAskForHelp", "ej-ui"})
public interface StartLoadingViewModel {
  @NotNull
  Flow<LoginScreenEffect> getEffect();
  
  @NotNull
  StateFlow<LoginScreenState> getState();
  
  void startLoginAction(boolean paramBoolean);
  
  void onBackToLogin();
  
  void openJoinWaitListAction();
  
  boolean isExternalBrowseSupported();
  
  void userAskForHelp();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\login\StartLoadingViewModel.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */