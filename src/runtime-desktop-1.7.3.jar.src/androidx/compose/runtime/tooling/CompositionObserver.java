package androidx.compose.runtime.tooling;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.ExperimentalComposeRuntimeApi;
import androidx.compose.runtime.RecomposeScope;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\020\"\n\002\b\002\bg\030\0002\0020\001J,\020\002\032\0020\0032\006\020\004\032\0020\0052\032\020\006\032\026\022\004\022\0020\b\022\f\022\n\022\004\022\0020\001\030\0010\t0\007H&J\020\020\n\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/runtime/tooling/CompositionObserver;", "", "onBeginComposition", "", "composition", "Landroidx/compose/runtime/Composition;", "invalidationMap", "", "Landroidx/compose/runtime/RecomposeScope;", "", "onEndComposition", "runtime"})
@ExperimentalComposeRuntimeApi
public interface CompositionObserver {
  void onBeginComposition(@NotNull Composition paramComposition, @NotNull Map<RecomposeScope, ? extends Set<? extends Object>> paramMap);
  
  void onEndComposition(@NotNull Composition paramComposition);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\tooling\CompositionObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */