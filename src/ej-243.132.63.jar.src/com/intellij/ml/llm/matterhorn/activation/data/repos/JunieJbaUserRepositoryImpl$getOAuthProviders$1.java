package com.intellij.ml.llm.matterhorn.activation.data.repos;

import com.intellij.ui.JBAccountInfoService;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieJbaUserRepository.kt", l = {56}, i = {}, s = {}, n = {}, m = "getOAuthProviders", c = "com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieJbaUserRepositoryImpl$getOAuthProviders$1 extends ContinuationImpl {
  int label;
  
  JunieJbaUserRepositoryImpl$getOAuthProviders$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieJbaUserRepositoryImpl.this.getOAuthProviders((Continuation<? super List<JBAccountInfoService.JbaOAuthProvider>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieJbaUserRepositoryImpl$getOAuthProviders$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */