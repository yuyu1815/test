package ai.grazie.def;

import ai.grazie.text.TextRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\bf\030\0002\0020\001J \020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H¦@¢\006\002\020\bJ\016\020\t\032\0020\nH¦@¢\006\002\020\013ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Lai/grazie/def/SuspendableDefinitionService;", "", "define", "Lai/grazie/def/WordDefinition;", "text", "", "interval", "Lai/grazie/text/TextRange;", "(Ljava/lang/String;Lai/grazie/text/TextRange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "warmUp", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-def"})
public interface SuspendableDefinitionService {
  @Nullable
  Object define(@NotNull String paramString, @NotNull TextRange paramTextRange, @NotNull Continuation<? super WordDefinition> paramContinuation);
  
  @Nullable
  Object warmUp(@NotNull Continuation<? super Unit> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-def-jvm-0.4.32.jar!\ai\grazie\def\SuspendableDefinitionService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */