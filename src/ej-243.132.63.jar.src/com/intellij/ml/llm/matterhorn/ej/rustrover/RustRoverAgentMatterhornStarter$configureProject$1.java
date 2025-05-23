package com.intellij.ml.llm.matterhorn.ej.rustrover;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "RustRoverAgentMatterhornStarter.kt", l = {158, 159, 66, 95}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"}, n = {"$this", "context", "project", "$this", "context", "project", "$this", "project", "projectPath", "rustToolchainFile", "toolchain", "$this", "project"}, m = "configureProject$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.rustrover.RustRoverAgentMatterhornStarter")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
final class RustRoverAgentMatterhornStarter$configureProject$1 extends ContinuationImpl {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  RustRoverAgentMatterhornStarter$configureProject$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return RustRoverAgentMatterhornStarter.configureProject$suspendImpl(RustRoverAgentMatterhornStarter.this, null, null, null, (Continuation<? super Unit>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\rustrover\RustRoverAgentMatterhornStarter$configureProject$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */