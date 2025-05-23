package com.intellij.ml.llm.matterhorn.ej.core.utils.await;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "DefaultProjectModelUpdater.kt", l = {20, 28, 34}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"this", "project", "this", "this"}, m = "updateProjectModelAndWait", c = "com.intellij.ml.llm.matterhorn.ej.core.utils.await.DefaultProjectModelUpdater")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class DefaultProjectModelUpdater$updateProjectModelAndWait$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  DefaultProjectModelUpdater$updateProjectModelAndWait$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return DefaultProjectModelUpdater.this.updateProjectModelAndWait(null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\await\DefaultProjectModelUpdater$updateProjectModelAndWait$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */