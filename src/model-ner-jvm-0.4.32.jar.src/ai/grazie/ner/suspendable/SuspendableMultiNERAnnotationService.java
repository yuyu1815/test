package ai.grazie.ner.suspendable;

import ai.grazie.ner.model.SentenceWithNERAnnotations;
import ai.grazie.nlp.langs.Language;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\003\bf\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ*\020\002\032\b\022\004\022\0020\0030\t2\006\020\004\032\0020\0052\f\020\n\032\b\022\004\022\0020\0070\tH¦@¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/ner/suspendable/SuspendableMultiNERAnnotationService;", "", "annotate", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "language", "Lai/grazie/nlp/langs/Language;", "sentence", "", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-ner"})
public interface SuspendableMultiNERAnnotationService {
  @Nullable
  Object annotate(@NotNull Language paramLanguage, @NotNull List<String> paramList, @NotNull Continuation<? super List<SentenceWithNERAnnotations>> paramContinuation);
  
  @Nullable
  default Object annotate(@NotNull Language language, @NotNull String sentence, @NotNull Continuation<? super SentenceWithNERAnnotations> $completion) {
    return annotate$suspendImpl(this, language, sentence, $completion);
  }
  
  @DebugMetadata(f = "SuspendableMultiNERAnnotationService.kt", l = {15}, i = {}, s = {}, n = {}, m = "annotate$suspendImpl", c = "ai.grazie.ner.suspendable.SuspendableMultiNERAnnotationService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableMultiNERAnnotationService$annotate$1 extends ContinuationImpl {
    int label;
    
    SuspendableMultiNERAnnotationService$annotate$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableMultiNERAnnotationService.annotate$suspendImpl(SuspendableMultiNERAnnotationService.this, null, null, (Continuation<? super SentenceWithNERAnnotations>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\suspendable\SuspendableMultiNERAnnotationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */