package ai.grazie.syn;

import ai.grazie.nlp.langs.Language;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J0\020\002\032\016\022\n\022\b\022\004\022\0020\0040\0030\0032\006\020\005\032\0020\0062\f\020\007\032\b\022\004\022\0020\b0\003H¦@¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Lai/grazie/syn/SuspendableSynonymizationService;", "", "synonymize", "", "", "language", "Lai/grazie/nlp/langs/Language;", "texts", "Lai/grazie/syn/TextWithHighlight;", "(Lai/grazie/nlp/langs/Language;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-syn"})
public interface SuspendableSynonymizationService {
  @Nullable
  Object synonymize(@NotNull Language paramLanguage, @NotNull List<TextWithHighlight> paramList, @NotNull Continuation<? super List<? extends List<String>>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-syn-jvm-0.4.32.jar!\ai\grazie\syn\SuspendableSynonymizationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */