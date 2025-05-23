package ai.grazie.gec.suspendable;

import ai.grazie.gec.model.problem.SentenceWithProblems;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableProblemService.kt", l = {9}, i = {}, s = {}, n = {}, m = "correct$suspendImpl", c = "ai.grazie.gec.suspendable.SuspendableProblemService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableProblemService$correct$1 extends ContinuationImpl {
  int label;
  
  SuspendableProblemService$correct$1(Continuation $completion) {
    super($completion);
  }
  
  @Nullable
  public final Object invokeSuspend(@NotNull Object $result) {
    this.result = $result;
    this.label |= Integer.MIN_VALUE;
    return SuspendableProblemService.correct$suspendImpl(SuspendableProblemService.this, null, (Continuation<? super SentenceWithProblems>)this);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\suspendable\SuspendableProblemService$correct$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */