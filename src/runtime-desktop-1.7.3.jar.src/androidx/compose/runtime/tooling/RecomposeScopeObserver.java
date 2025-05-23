package androidx.compose.runtime.tooling;

import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\bg\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\020\020\006\032\0020\0032\006\020\004\032\0020\005H&J\020\020\007\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Landroidx/compose/runtime/tooling/RecomposeScopeObserver;", "", "onBeginScopeComposition", "", "scope", "Landroidx/compose/runtime/RecomposeScope;", "onEndScopeComposition", "onScopeDisposed", "runtime"})
@ExperimentalComposeRuntimeApi
public interface RecomposeScopeObserver {
  void onBeginScopeComposition(@NotNull RecomposeScope paramRecomposeScope);
  
  void onEndScopeComposition(@NotNull RecomposeScope paramRecomposeScope);
  
  void onScopeDisposed(@NotNull RecomposeScope paramRecomposeScope);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\tooling\RecomposeScopeObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */