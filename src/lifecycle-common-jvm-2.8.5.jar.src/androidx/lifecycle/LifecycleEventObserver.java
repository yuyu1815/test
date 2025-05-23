package androidx.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bæ\001\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleObserver;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-common"})
public interface LifecycleEventObserver extends LifecycleObserver {
  void onStateChanged(@NotNull LifecycleOwner paramLifecycleOwner, @NotNull Lifecycle.Event paramEvent);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\lifecycle-common-jvm-2.8.5.jar!\androidx\lifecycle\LifecycleEventObserver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */