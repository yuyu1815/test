package ai.grazie.nlc;

import ai.grazie.nlp.langs.Language;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001J&\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\005H¦@¢\006\002\020\tJ\036\020\002\032\0020\n2\006\020\004\032\0020\0052\006\020\b\032\0020\005H§@¢\006\002\020\013J&\020\002\032\0020\f2\006\020\004\032\0020\0052\006\020\r\032\0020\0052\006\020\b\032\0020\005H¦@¢\006\002\020\016ø\001\000\002\006\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Lai/grazie/nlc/SuspendableCompletionService;", "", "complete", "Lai/grazie/nlc/PrefixWithCompletions;", "context", "", "language", "Lai/grazie/nlp/langs/Language;", "profile", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/nlc/ContextWithCompletions;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/grazie/nlc/SentenceWithCompletions;", "prefix", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-nlc"})
public interface SuspendableCompletionService {
  @Nullable
  Object complete(@NotNull String paramString1, @NotNull String paramString2, @NotNull String paramString3, @NotNull Continuation<? super SentenceWithCompletions> paramContinuation);
  
  @Deprecated(message = "JBAI-6817", replaceWith = @ReplaceWith(expression = "complete(context, language, profile)", imports = {}))
  @Nullable
  Object complete(@NotNull String paramString1, @NotNull String paramString2, @NotNull Continuation<? super ContextWithCompletions> paramContinuation);
  
  @Nullable
  Object complete(@NotNull String paramString1, @NotNull Language paramLanguage, @NotNull String paramString2, @NotNull Continuation<? super PrefixWithCompletions> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-nlc-jvm-0.4.32.jar!\ai\grazie\nlc\SuspendableCompletionService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */