package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b`\030\0002\0020\001J\024\020\002\032\0020\0032\n\020\004\032\006\022\002\b\0030\005H&J\024\020\006\032\0020\0032\n\020\004\032\006\022\002\b\0030\005H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/runtime/DerivedStateObserver;", "", "done", "", "derivedState", "Landroidx/compose/runtime/DerivedState;", "start", "runtime"})
public interface DerivedStateObserver {
  void start(@NotNull DerivedState<?> paramDerivedState);
  
  void done(@NotNull DerivedState<?> paramDerivedState);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\DerivedStateObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */