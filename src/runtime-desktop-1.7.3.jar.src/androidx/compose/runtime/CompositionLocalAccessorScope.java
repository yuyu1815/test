package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bf\030\0002\0020\001R\"\020\002\032\002H\003\"\004\b\000\020\003*\b\022\004\022\002H\0030\004X¦\004¢\006\006\032\004\b\005\020\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/runtime/CompositionLocalAccessorScope;", "", "currentValue", "T", "Landroidx/compose/runtime/CompositionLocal;", "getCurrentValue", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "runtime"})
public interface CompositionLocalAccessorScope {
  <T> T getCurrentValue(@NotNull CompositionLocal<T> paramCompositionLocal);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionLocalAccessorScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */