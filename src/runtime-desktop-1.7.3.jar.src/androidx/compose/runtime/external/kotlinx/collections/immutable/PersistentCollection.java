package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableCollection;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\036\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020\013\n\002\b\003\b`\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\002:\001\022J\033\020\003\032\b\022\004\022\0028\0000\0002\006\020\004\032\0028\000H&¢\006\002\020\005J\034\020\006\032\b\022\004\022\0028\0000\0002\f\020\007\032\b\022\004\022\0028\0000\bH&J\016\020\t\032\b\022\004\022\0028\0000\nH&J\016\020\013\032\b\022\004\022\0028\0000\000H&J\033\020\f\032\b\022\004\022\0028\0000\0002\006\020\004\032\0028\000H&¢\006\002\020\005J\"\020\r\032\b\022\004\022\0028\0000\0002\022\020\016\032\016\022\004\022\0028\000\022\004\022\0020\0200\017H&J\034\020\r\032\b\022\004\022\0028\0000\0002\f\020\007\032\b\022\004\022\0028\0000\bH&J\034\020\021\032\b\022\004\022\0028\0000\0002\f\020\007\032\b\022\004\022\0028\0000\bH&ø\001\000\002\006\n\004\b!0\001¨\006\023À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "addAll", "elements", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "clear", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "", "retainAll", "Builder", "runtime"})
public interface PersistentCollection<E> extends ImmutableCollection<E> {
  @NotNull
  PersistentCollection<E> add(E paramE);
  
  @NotNull
  PersistentCollection<E> addAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentCollection<E> remove(E paramE);
  
  @NotNull
  PersistentCollection<E> removeAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentCollection<E> removeAll(@NotNull Function1<? super E, Boolean> paramFunction1);
  
  @NotNull
  PersistentCollection<E> retainAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentCollection<E> clear();
  
  @NotNull
  Builder<E> builder();
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\000\n\002\020\037\n\000\n\002\030\002\n\000\bf\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002J\016\020\003\032\b\022\004\022\0028\0010\004H&ø\001\000\002\006\n\004\b!0\001¨\006\005À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "E", "", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "runtime"})
  public static interface Builder<E> extends Collection<E>, KMutableCollection {
    @NotNull
    PersistentCollection<E> build();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\PersistentCollection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */