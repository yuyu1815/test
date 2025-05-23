package ai.grazie.gec.suspendable;

import ai.grazie.gec.model.problem.SentenceWithProblems;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\003\bf\030\0002\0020\001J\026\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006J\"\020\002\032\b\022\004\022\0020\0030\0072\f\020\b\032\b\022\004\022\0020\0050\007H¦@¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/gec/suspendable/SuspendableProblemService;", "", "correct", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "sentence", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sentences", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-gec"})
public interface SuspendableProblemService {
  @Nullable
  Object correct(@NotNull List<String> paramList, @NotNull Continuation<? super List<SentenceWithProblems>> paramContinuation);
  
  @Nullable
  default Object correct(@NotNull String sentence, @NotNull Continuation<? super SentenceWithProblems> $completion) {
    return correct$suspendImpl(this, sentence, $completion);
  }
  
  @DebugMetadata(f = "SuspendableProblemService.kt", l = {9}, i = {}, s = {}, n = {}, m = "correct$suspendImpl", c = "ai.grazie.gec.suspendable.SuspendableProblemService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableProblemService$correct$1 extends ContinuationImpl {
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
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\suspendable\SuspendableProblemService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */