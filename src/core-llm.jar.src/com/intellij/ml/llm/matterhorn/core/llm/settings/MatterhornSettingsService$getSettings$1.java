package com.intellij.ml.llm.matterhorn.core.llm.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "MatterhornSettingsService.kt", l = {326, 99}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m = "getSettings", c = "com.intellij.ml.llm.matterhorn.core.llm.settings.MatterhornSettingsService")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class MatterhornSettingsService$getSettings$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  int label;
  
  MatterhornSettingsService$getSettings$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return MatterhornSettingsService.this.getSettings((Continuation<? super MatterhornSettings>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornSettingsService$getSettings$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */