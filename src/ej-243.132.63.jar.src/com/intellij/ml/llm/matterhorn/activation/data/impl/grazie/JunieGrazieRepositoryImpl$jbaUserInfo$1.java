package com.intellij.ml.llm.matterhorn.activation.data.impl.grazie;

import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieGrazieRepositoryImpl.kt", l = {31, 33}, i = {0}, s = {"L$0"}, n = {"jbaIdToken"}, m = "jbaUserInfo-mvY-0G4", c = "com.intellij.ml.llm.matterhorn.activation.data.impl.grazie.JunieGrazieRepositoryImpl")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieGrazieRepositoryImpl$jbaUserInfo$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  JunieGrazieRepositoryImpl$jbaUserInfo$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieGrazieRepositoryImpl.this.jbaUserInfo-mvY-0G4(null, null, (Continuation<? super GrazieResult<Unit>>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\impl\grazie\JunieGrazieRepositoryImpl$jbaUserInfo$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */