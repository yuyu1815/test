package com.intellij.ml.llm.matterhorn.ej.pycharm;

import com.intellij.openapi.projectRoots.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CommandExecutorUtils.kt", l = {121, 132, 138}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"this", "project", "project", "result"}, m = "setupSdkForCondaEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround.this.setupSdkForCondaEnvironment(null, (Continuation<? super Sdk>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */