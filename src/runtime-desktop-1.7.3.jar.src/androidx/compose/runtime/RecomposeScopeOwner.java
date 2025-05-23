package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\003\b`\030\0002\0020\001J\032\020\002\032\0020\0032\006\020\004\032\0020\0052\b\020\006\032\004\030\0010\001H&J\020\020\007\032\0020\b2\006\020\004\032\0020\005H&J\020\020\t\032\0020\b2\006\020\n\032\0020\001H&ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/runtime/RecomposeScopeOwner;", "", "invalidate", "Landroidx/compose/runtime/InvalidationResult;", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "instance", "recomposeScopeReleased", "", "recordReadOf", "value", "runtime"})
public interface RecomposeScopeOwner {
  @NotNull
  InvalidationResult invalidate(@NotNull RecomposeScopeImpl paramRecomposeScopeImpl, @Nullable Object paramObject);
  
  void recomposeScopeReleased(@NotNull RecomposeScopeImpl paramRecomposeScopeImpl);
  
  void recordReadOf(@NotNull Object paramObject);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\RecomposeScopeOwner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */