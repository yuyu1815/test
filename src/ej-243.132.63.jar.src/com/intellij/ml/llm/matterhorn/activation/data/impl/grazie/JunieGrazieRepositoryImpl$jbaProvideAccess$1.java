package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;

import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthJwt;
import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {49, 52}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"jbaIdToken", "aipLicenseId"}, m = "jbaProvideAccess-SRYjgCQ", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieGrazieRepositoryImpl$jbaProvideAccess$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  JunieGrazieRepositoryImpl$jbaProvideAccess$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieGrazieRepositoryImpl.this.jbaProvideAccess-SRYjgCQ(null, null, null, (Continuation<? super GrazieResult<GrazieAuthJwt>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\JunieGrazieRepositoryImpl$jbaProvideAccess$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */