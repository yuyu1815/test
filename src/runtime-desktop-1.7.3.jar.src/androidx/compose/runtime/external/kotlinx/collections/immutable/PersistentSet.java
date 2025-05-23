package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\036\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020\013\n\002\b\003\b`\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001\023J\033\020\004\032\b\022\004\022\0028\0000\0002\006\020\005\032\0028\000H&¢\006\002\020\006J\034\020\007\032\b\022\004\022\0028\0000\0002\f\020\b\032\b\022\004\022\0028\0000\tH&J\016\020\n\032\b\022\004\022\0028\0000\013H&J\016\020\f\032\b\022\004\022\0028\0000\000H&J\033\020\r\032\b\022\004\022\0028\0000\0002\006\020\005\032\0028\000H&¢\006\002\020\006J\"\020\016\032\b\022\004\022\0028\0000\0002\022\020\017\032\016\022\004\022\0028\000\022\004\022\0020\0210\020H&J\034\020\016\032\b\022\004\022\0028\0000\0002\f\020\b\032\b\022\004\022\0028\0000\tH&J\034\020\022\032\b\022\004\022\0028\0000\0002\f\020\b\032\b\022\004\022\0028\0000\tH&ø\001\000\002\006\n\004\b!0\001¨\006\024À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "addAll", "elements", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "clear", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "", "retainAll", "Builder", "runtime"})
public interface PersistentSet<E> extends ImmutableSet<E>, PersistentCollection<E> {
  @NotNull
  PersistentSet<E> add(E paramE);
  
  @NotNull
  PersistentSet<E> addAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentSet<E> remove(E paramE);
  
  @NotNull
  PersistentSet<E> removeAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentSet<E> removeAll(@NotNull Function1<? super E, Boolean> paramFunction1);
  
  @NotNull
  PersistentSet<E> retainAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentSet<E> clear();
  
  @NotNull
  Builder<E> builder();
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020#\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003J\016\020\004\032\b\022\004\022\0028\0010\005H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "runtime"})
  public static interface Builder<E> extends Set<E>, PersistentCollection.Builder<E>, KMutableSet {
    @NotNull
    PersistentSet<E> build();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\PersistentSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */