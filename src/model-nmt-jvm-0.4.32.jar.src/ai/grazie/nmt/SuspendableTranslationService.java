package ai.grazie.nmt;

import ai.grazie.nlp.langs.Language;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001J2\020\002\032\b\022\004\022\0020\0040\0032\f\020\005\032\b\022\004\022\0020\0060\0032\006\020\007\032\0020\b2\006\020\t\032\0020\bH¦@¢\006\002\020\nø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Lai/grazie/nmt/SuspendableTranslationService;", "", "translate", "", "Lai/grazie/nmt/SentenceWithTranslation;", "texts", "", "fromLang", "Lai/grazie/nlp/langs/Language;", "toLang", "(Ljava/util/List;Lai/grazie/nlp/langs/Language;Lai/grazie/nlp/langs/Language;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-nmt"})
public interface SuspendableTranslationService {
  @Nullable
  Object translate(@NotNull List<String> paramList, @NotNull Language paramLanguage1, @NotNull Language paramLanguage2, @NotNull Continuation<? super List<SentenceWithTranslation>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nmt-jvm-0.4.32.jar!\ai\grazie\nmt\SuspendableTranslationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */