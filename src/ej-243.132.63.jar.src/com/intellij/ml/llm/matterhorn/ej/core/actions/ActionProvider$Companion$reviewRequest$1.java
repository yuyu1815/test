package com.intellij.ml.llm.matterhorn.ej.core.actions;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "ActionProvider.kt", l = {17}, i = {}, s = {}, n = {}, m = "reviewRequest", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.ActionProvider$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class ActionProvider$Companion$reviewRequest$1 extends ContinuationImpl {
  int label;
  
  ActionProvider$Companion$reviewRequest$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return ActionProvider.Companion.this.reviewRequest(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ActionProvider$Companion$reviewRequest$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */