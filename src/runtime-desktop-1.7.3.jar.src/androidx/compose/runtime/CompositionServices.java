package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J#\020\002\032\004\030\001H\003\"\004\b\000\020\0032\f\020\004\032\b\022\004\022\002H\0030\005H&¢\006\002\020\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/runtime/CompositionServices;", "", "getCompositionService", "T", "key", "Landroidx/compose/runtime/CompositionServiceKey;", "(Landroidx/compose/runtime/CompositionServiceKey;)Ljava/lang/Object;", "runtime"})
public interface CompositionServices {
  @Nullable
  <T> T getCompositionService(@NotNull CompositionServiceKey<T> paramCompositionServiceKey);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\CompositionServices.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */