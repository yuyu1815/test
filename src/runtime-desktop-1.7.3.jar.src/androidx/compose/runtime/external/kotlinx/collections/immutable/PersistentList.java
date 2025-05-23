package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\003\n\002\020\036\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020\013\n\002\b\005\b`\030\000*\006\b\000\020\001 \0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003:\001\031J\033\020\004\032\b\022\004\022\0028\0000\0002\006\020\005\032\0028\000H&¢\006\002\020\006J#\020\004\032\b\022\004\022\0028\0000\0002\006\020\007\032\0020\b2\006\020\005\032\0028\000H&¢\006\002\020\tJ$\020\n\032\b\022\004\022\0028\0000\0002\006\020\007\032\0020\b2\f\020\013\032\b\022\004\022\0028\0000\fH&J\034\020\n\032\b\022\004\022\0028\0000\0002\f\020\r\032\b\022\004\022\0028\0000\fH&J\016\020\016\032\b\022\004\022\0028\0000\017H&J\016\020\020\032\b\022\004\022\0028\0000\000H&J\033\020\021\032\b\022\004\022\0028\0000\0002\006\020\005\032\0028\000H&¢\006\002\020\006J\"\020\022\032\b\022\004\022\0028\0000\0002\022\020\023\032\016\022\004\022\0028\000\022\004\022\0020\0250\024H&J\034\020\022\032\b\022\004\022\0028\0000\0002\f\020\r\032\b\022\004\022\0028\0000\fH&J\026\020\026\032\b\022\004\022\0028\0000\0002\006\020\007\032\0020\bH&J\034\020\027\032\b\022\004\022\0028\0000\0002\f\020\r\032\b\022\004\022\0028\0000\fH&J#\020\030\032\b\022\004\022\0028\0000\0002\006\020\007\032\0020\b2\006\020\005\032\0028\000H&¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\032À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "addAll", "c", "", "elements", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "clear", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "retainAll", "set", "Builder", "runtime"})
public interface PersistentList<E> extends ImmutableList<E>, PersistentCollection<E> {
  @NotNull
  PersistentList<E> add(E paramE);
  
  @NotNull
  PersistentList<E> addAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentList<E> remove(E paramE);
  
  @NotNull
  PersistentList<E> removeAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentList<E> removeAll(@NotNull Function1<? super E, Boolean> paramFunction1);
  
  @NotNull
  PersistentList<E> retainAll(@NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentList<E> clear();
  
  @NotNull
  PersistentList<E> addAll(int paramInt, @NotNull Collection<? extends E> paramCollection);
  
  @NotNull
  PersistentList<E> set(int paramInt, E paramE);
  
  @NotNull
  PersistentList<E> add(int paramInt, E paramE);
  
  @NotNull
  PersistentList<E> removeAt(int paramInt);
  
  @NotNull
  Builder<E> builder();
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\000\n\002\020!\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003J\016\020\004\032\b\022\004\022\0028\0010\005H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "runtime"})
  public static interface Builder<E> extends List<E>, PersistentCollection.Builder<E>, KMutableList {
    @NotNull
    PersistentList<E> build();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\PersistentList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */