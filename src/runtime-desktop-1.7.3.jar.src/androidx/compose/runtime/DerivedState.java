package androidx.compose.runtime;

import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.snapshots.StateObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\b`\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\002:\001\013R\030\020\003\032\b\022\004\022\0028\0000\004X¦\004¢\006\006\032\004\b\005\020\006R\032\020\007\032\n\022\004\022\0028\000\030\0010\bX¦\004¢\006\006\032\004\b\t\020\nø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Landroidx/compose/runtime/DerivedState;", "T", "Landroidx/compose/runtime/State;", "currentRecord", "Landroidx/compose/runtime/DerivedState$Record;", "getCurrentRecord", "()Landroidx/compose/runtime/DerivedState$Record;", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "getPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "Record", "runtime"})
public interface DerivedState<T> extends State<T> {
  @NotNull
  Record<T> getCurrentRecord();
  
  @Nullable
  SnapshotMutationPolicy<T> getPolicy();
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\000\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\003\bf\030\000*\004\b\001\020\0012\0020\002R\022\020\003\032\0028\001X¦\004¢\006\006\032\004\b\004\020\005R\030\020\006\032\b\022\004\022\0020\b0\007X¦\004¢\006\006\032\004\b\t\020\nø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/runtime/DerivedState$Record;", "T", "", "currentValue", "getCurrentValue", "()Ljava/lang/Object;", "dependencies", "Landroidx/collection/ObjectIntMap;", "Landroidx/compose/runtime/snapshots/StateObject;", "getDependencies", "()Landroidx/collection/ObjectIntMap;", "runtime"})
  public static interface Record<T> {
    T getCurrentValue();
    
    @NotNull
    ObjectIntMap<StateObject> getDependencies();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\DerivedState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */