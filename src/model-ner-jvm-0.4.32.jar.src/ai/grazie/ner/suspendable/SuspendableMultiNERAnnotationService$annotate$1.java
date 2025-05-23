package ai.grazie.ner.suspendable;

import ai.grazie.ner.model.SentenceWithNERAnnotations;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(f = "SuspendableMultiNERAnnotationService.kt", l = {15}, i = {}, s = {}, n = {}, m = "annotate$suspendImpl", c = "ai.grazie.ner.suspendable.SuspendableMultiNERAnnotationService")
@Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
final class SuspendableMultiNERAnnotationService$annotate$1 extends ContinuationImpl {
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


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ner-jvm-0.4.32.jar!\ai\grazie\ner\suspendable\SuspendableMultiNERAnnotationService$annotate$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */