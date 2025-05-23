package ai.grazie.gec.suspendable;

import ai.grazie.gec.model.SentenceWithCorrections;
import ai.grazie.nlp.langs.Language;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\003\bf\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ*\020\002\032\b\022\004\022\0020\0030\t2\006\020\004\032\0020\0052\f\020\n\032\b\022\004\022\0020\0070\tH¦@¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/gec/suspendable/SuspendableMultiCorrectionService;", "", "correct", "Lai/grazie/gec/model/SentenceWithCorrections;", "language", "Lai/grazie/nlp/langs/Language;", "sentence", "", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-gec"})
public interface SuspendableMultiCorrectionService {
  @Nullable
  Object correct(@NotNull Language paramLanguage, @NotNull List<String> paramList, @NotNull Continuation<? super List<SentenceWithCorrections>> paramContinuation);
  
  @Nullable
  default Object correct(@NotNull Language language, @NotNull String sentence, @NotNull Continuation<? super SentenceWithCorrections> $completion) {
    return correct$suspendImpl(this, language, sentence, $completion);
  }
  
  @DebugMetadata(f = "SuspendableMultiCorrectionService.kt", l = {9}, i = {}, s = {}, n = {}, m = "correct$suspendImpl", c = "ai.grazie.gec.suspendable.SuspendableMultiCorrectionService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableMultiCorrectionService$correct$1 extends ContinuationImpl {
    int label;
    
    SuspendableMultiCorrectionService$correct$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableMultiCorrectionService.correct$suspendImpl(SuspendableMultiCorrectionService.this, null, null, (Continuation<? super SentenceWithCorrections>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\suspendable\SuspendableMultiCorrectionService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */