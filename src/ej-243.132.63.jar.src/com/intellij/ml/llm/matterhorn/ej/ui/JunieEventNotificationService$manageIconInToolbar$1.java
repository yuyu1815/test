package com.intellij.ml.llm.matterhorn.ej.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "JunieEventNotificationService.kt", l = {152}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "toolWindow", "$this$withLock_u24default$iv"}, m = "manageIconInToolbar", c = "com.intellij.ml.llm.matterhorn.ej.ui.JunieEventNotificationService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class JunieEventNotificationService$manageIconInToolbar$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  JunieEventNotificationService$manageIconInToolbar$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return JunieEventNotificationService.this.manageIconInToolbar(null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\JunieEventNotificationService$manageIconInToolbar$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */