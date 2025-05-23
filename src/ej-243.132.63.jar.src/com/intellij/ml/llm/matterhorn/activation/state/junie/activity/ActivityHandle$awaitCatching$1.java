package com.intellij.ml.llm.matterhorn.activation.state.junie.activity;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ActivityHandle.kt", l = {22}, i = {}, s = {}, n = {}, m = "awaitCatching-IoAF18A", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityHandle")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ActivityHandle$awaitCatching$1 extends ContinuationImpl {
  int label;
  
  ActivityHandle$awaitCatching$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return (ActivityHandle.this.awaitCatching-IoAF18A((Continuation<? super Result<? extends Ret>>)this) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? ActivityHandle.this.awaitCatching-IoAF18A((Continuation<? super Result<? extends Ret>>)this) : Result.box-impl(ActivityHandle.this.awaitCatching-IoAF18A((Continuation<? super Result<? extends Ret>>)this));
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\activity\ActivityHandle$awaitCatching$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */