package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002R\030\020\003\032\b\022\004\022\0028\0000\004X¦\004¢\006\006\032\004\b\005\020\006ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "T", "Landroidx/compose/runtime/MutableState;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "runtime"})
public interface SnapshotMutableState<T> extends MutableState<T> {
  @NotNull
  SnapshotMutationPolicy<T> getPolicy();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\snapshots\SnapshotMutableState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */