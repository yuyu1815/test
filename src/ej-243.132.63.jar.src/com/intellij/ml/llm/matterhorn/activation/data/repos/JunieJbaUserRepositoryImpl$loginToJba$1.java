package com.intellij.ml.llm.matterhorn.activation.data.repos;

import com.intellij.ml.llm.matterhorn.activation.data.model.result.JbaUserLoginResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieJbaUserRepository.kt", l = {69, 71}, i = {}, s = {}, n = {}, m = "loginToJba", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieJbaUserRepositoryImpl$loginToJba$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  JunieJbaUserRepositoryImpl$loginToJba$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieJbaUserRepositoryImpl.this.loginToJba(null, null, (Continuation<? super JbaUserLoginResult>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepositoryImpl$loginToJba$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */