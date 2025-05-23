package ai.grazie.gec.suspendable;

import ai.grazie.gec.model.SentenceWithCorrections;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableCorrectionService.kt", l = {8}, i = {}, s = {}, n = {}, m = "correct$suspendImpl", c = "ai.grazie.gec.suspendable.SuspendableCorrectionService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableCorrectionService$correct$1 extends ContinuationImpl {
  int label;
  
  SuspendableCorrectionService$correct$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableCorrectionService.correct$suspendImpl(SuspendableCorrectionService.this, null, (Continuation<? super SentenceWithCorrections>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\suspendable\SuspendableCorrectionService$correct$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */