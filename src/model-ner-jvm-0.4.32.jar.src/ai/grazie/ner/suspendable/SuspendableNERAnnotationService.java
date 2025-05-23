package ai.grazie.ner.suspendable;

import ai.grazie.ner.model.SentenceWithNERAnnotations;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\003\bf\030\0002\0020\001J\026\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006J\"\020\002\032\b\022\004\022\0020\0030\0072\f\020\b\032\b\022\004\022\0020\0050\007H¦@¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/ner/suspendable/SuspendableNERAnnotationService;", "", "annotate", "Lai/grazie/ner/model/SentenceWithNERAnnotations;", "sentence", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sentences", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-ner"})
public interface SuspendableNERAnnotationService {
  @Nullable
  Object annotate(@NotNull List<String> paramList, @NotNull Continuation<? super List<SentenceWithNERAnnotations>> paramContinuation);
  
  @Nullable
  default Object annotate(@NotNull String sentence, @NotNull Continuation<? super SentenceWithNERAnnotations> $completion) {
    return annotate$suspendImpl(this, sentence, $completion);
  }
  
  @DebugMetadata(f = "SuspendableNERAnnotationService.kt", l = {15}, i = {}, s = {}, n = {}, m = "annotate$suspendImpl", c = "ai.grazie.ner.suspendable.SuspendableNERAnnotationService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableNERAnnotationService$annotate$1 extends ContinuationImpl {
    int label;
    
    SuspendableNERAnnotationService$annotate$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableNERAnnotationService.annotate$suspendImpl(SuspendableNERAnnotationService.this, null, (Continuation<? super SentenceWithNERAnnotations>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\suspendable\SuspendableNERAnnotationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */