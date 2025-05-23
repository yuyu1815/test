package com.intellij.ml.llm.matterhorn.starter;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "CommandLineStarter.kt", l = {82, 86}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"result", "propertyProvider", "result"}, m = "setupFromEnvironment", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarterProjectState$Companion")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class CommandLineStarterProjectState$Companion$setupFromEnvironment$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  int label;
  
  CommandLineStarterProjectState$Companion$setupFromEnvironment$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return CommandLineStarterProjectState.Companion.this.setupFromEnvironment(null, (Continuation<? super CommandLineStarterProjectState>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarterProjectState$Companion$setupFromEnvironment$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */