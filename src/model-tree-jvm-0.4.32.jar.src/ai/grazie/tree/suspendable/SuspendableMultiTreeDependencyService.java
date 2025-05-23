package ai.grazie.tree.suspendable;

import ai.grazie.nlp.langs.Language;
import ai.grazie.tree.model.SentenceWithTreeDependencies;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020 \n\002\b\003\bf\030\0002\0020\001J\036\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ*\020\002\032\b\022\004\022\0020\0030\t2\006\020\004\032\0020\0052\f\020\n\032\b\022\004\022\0020\0070\tH¦@¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/tree/suspendable/SuspendableMultiTreeDependencyService;", "", "parse", "Lai/grazie/tree/model/SentenceWithTreeDependencies;", "language", "Lai/grazie/nlp/langs/Language;", "sentence", "", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sentences", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-tree"})
public interface SuspendableMultiTreeDependencyService {
  @Nullable
  Object parse(@NotNull Language paramLanguage, @NotNull List<String> paramList, @NotNull Continuation<? super List<SentenceWithTreeDependencies>> paramContinuation);
  
  @Nullable
  default Object parse(@NotNull Language language, @NotNull String sentence, @NotNull Continuation<? super SentenceWithTreeDependencies> $completion) {
    return parse$suspendImpl(this, language, sentence, $completion);
  }
  
  @DebugMetadata(f = "SuspendableMultiTreeDependencyService.kt", l = {16}, i = {}, s = {}, n = {}, m = "parse$suspendImpl", c = "ai.grazie.tree.suspendable.SuspendableMultiTreeDependencyService")
  @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
  static final class SuspendableMultiTreeDependencyService$parse$1 extends ContinuationImpl {
    int label;
    
    SuspendableMultiTreeDependencyService$parse$1(Continuation $completion) {
      super($completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
      this.result = $result;
      this.label |= Integer.MIN_VALUE;
      return SuspendableMultiTreeDependencyService.parse$suspendImpl(SuspendableMultiTreeDependencyService.this, null, null, (Continuation<? super SentenceWithTreeDependencies>)this);
    }
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tree-jvm-0.4.32.jar!\ai\grazie\tree\suspendable\SuspendableMultiTreeDependencyService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */