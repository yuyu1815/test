package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b`\030\0002\0020\001J(\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007H&J(\020\n\032\0020\0032\006\020\004\032\0020\0132\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007H&J(\020\f\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007H&J\020\020\r\032\0020\0032\006\020\004\032\0020\013H&J\026\020\016\032\0020\0032\f\020\017\032\b\022\004\022\0020\0030\020H&ø\001\000\002\006\n\004\b!0\001¨\006\021À\006\001"}, d2 = {"Landroidx/compose/runtime/RememberManager;", "", "deactivating", "", "instance", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "endRelativeOrder", "", "priority", "endRelativeAfter", "forgetting", "Landroidx/compose/runtime/RememberObserver;", "releasing", "remembering", "sideEffect", "effect", "Lkotlin/Function0;", "runtime"})
public interface RememberManager {
  void remembering(@NotNull RememberObserver paramRememberObserver);
  
  void forgetting(@NotNull RememberObserver paramRememberObserver, int paramInt1, int paramInt2, int paramInt3);
  
  void sideEffect(@NotNull Function0<Unit> paramFunction0);
  
  void deactivating(@NotNull ComposeNodeLifecycleCallback paramComposeNodeLifecycleCallback, int paramInt1, int paramInt2, int paramInt3);
  
  void releasing(@NotNull ComposeNodeLifecycleCallback paramComposeNodeLifecycleCallback, int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\RememberManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */