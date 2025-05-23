package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\003\bf\030\0002\0020\001J\b\020\002\032\0020\003H&J\b\020\004\032\0020\003H&J\b\020\005\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "", "onDeactivate", "", "onRelease", "onReuse", "runtime"})
public interface ComposeNodeLifecycleCallback {
  void onReuse();
  
  void onDeactivate();
  
  void onRelease();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ComposeNodeLifecycleCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */