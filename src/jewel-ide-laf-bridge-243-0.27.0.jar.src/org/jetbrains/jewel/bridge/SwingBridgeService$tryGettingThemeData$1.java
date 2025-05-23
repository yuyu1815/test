package org.jetbrains.jewel.bridge;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SwingBridgeService.kt", l = {34}, i = {0, 0}, s = {"L$0", "I$0"}, n = {"this", "counter"}, m = "tryGettingThemeData", c = "org.jetbrains.jewel.bridge.SwingBridgeService")
@Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
final class SwingBridgeService$tryGettingThemeData$1 extends ContinuationImpl {
  Object L$0;
  
  int I$0;
  
  int label;
  
  SwingBridgeService$tryGettingThemeData$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SwingBridgeService.access$tryGettingThemeData(SwingBridgeService.this, (Continuation)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\SwingBridgeService$tryGettingThemeData$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */