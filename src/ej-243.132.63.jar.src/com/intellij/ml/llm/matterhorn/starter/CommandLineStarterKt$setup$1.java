package com.intellij.ml.llm.matterhorn.starter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CommandLineStarter.kt", l = {60}, i = {0}, s = {"L$0"}, n = {"action"}, m = "setup", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarterKt")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CommandLineStarterKt$setup$1 extends ContinuationImpl {
  Object L$0;
  
  int label;
  
  CommandLineStarterKt$setup$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CommandLineStarterKt.setup(null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarterKt$setup$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */