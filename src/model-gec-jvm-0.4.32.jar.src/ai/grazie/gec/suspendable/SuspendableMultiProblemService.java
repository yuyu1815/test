package ai.grazie.gec.suspendable;

import ai.grazie.gec.model.problem.SentenceWithProblems;
import ai.grazie.gec.model.settings.UserSettings;
import ai.grazie.nlp.langs.Language;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\b\003\bf\030\0002\0020\001J*\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\tH@¢\006\002\020\nJ6\020\002\032\b\022\004\022\0020\0030\0132\006\020\004\032\0020\0052\f\020\f\032\b\022\004\022\0020\0070\0132\n\b\002\020\b\032\004\030\0010\tH¦@¢\006\002\020\rø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Lai/grazie/gec/suspendable/SuspendableMultiProblemService;", "", "correct", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "language", "Lai/grazie/nlp/langs/Language;", "sentence", "", "userSettings", "Lai/grazie/gec/model/settings/UserSettings;", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lai/grazie/gec/model/settings/UserSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lai/grazie/gec/model/settings/UserSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-gec"})
public interface SuspendableMultiProblemService {
  @Nullable
  Object correct(@NotNull Language paramLanguage, @NotNull List<String> paramList, @Nullable UserSettings paramUserSettings, @NotNull Continuation<? super List<SentenceWithProblems>> paramContinuation);
  
  @Nullable
  default Object correct(@NotNull Language language, @NotNull String sentence, @Nullable UserSettings userSettings, @NotNull Continuation<? super SentenceWithProblems> $completion) {
    return correct$suspendImpl(this, language, sentence, userSettings, $completion);
  }
  
  @DebugMetadata(f = "SuspendableMultiProblemService.kt", l = {11}, i = {}, s = {}, n = {}, m = "correct$suspendImpl", c = "ai.grazie.gec.suspendable.SuspendableMultiProblemService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableMultiProblemService$correct$1 extends ContinuationImpl {
    int label;
    
    SuspendableMultiProblemService$correct$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableMultiProblemService.correct$suspendImpl(SuspendableMultiProblemService.this, null, null, null, (Continuation<? super SentenceWithProblems>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\suspendable\SuspendableMultiProblemService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */