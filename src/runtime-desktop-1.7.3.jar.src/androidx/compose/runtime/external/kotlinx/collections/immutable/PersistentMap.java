package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020$\n\002\b\004\b`\030\000*\004\b\000\020\001*\006\b\001\020\002 \0012\016\022\004\022\002H\001\022\004\022\002H\0020\003:\001\020J\024\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005H&J\024\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\000H&J)\020\007\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\b\032\0028\0002\006\020\t\032\0028\001H&¢\006\002\020\nJ*\020\013\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\024\020\f\032\020\022\006\b\001\022\0028\000\022\004\022\0028\0010\rH&J!\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\b\032\0028\000H&¢\006\002\020\017J)\020\016\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\b\032\0028\0002\006\020\t\032\0028\001H&¢\006\002\020\nø\001\000\002\006\n\004\b!0\001¨\006\021À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "K", "V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "clear", "put", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "putAll", "m", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Builder", "runtime"})
public interface PersistentMap<K, V> extends ImmutableMap<K, V> {
  @NotNull
  PersistentMap<K, V> put(K paramK, V paramV);
  
  @NotNull
  PersistentMap<K, V> remove(K paramK);
  
  @NotNull
  PersistentMap<K, V> remove(K paramK, V paramV);
  
  @NotNull
  PersistentMap<K, V> putAll(@NotNull Map<? extends K, ? extends V> paramMap);
  
  @NotNull
  PersistentMap<K, V> clear();
  
  @NotNull
  Builder<K, V> builder();
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\b\002\n\002\020%\n\000\n\002\030\002\n\000\bf\030\000*\004\b\002\020\001*\004\b\003\020\0022\016\022\004\022\002H\001\022\004\022\002H\0020\003J\024\020\004\032\016\022\004\022\0028\002\022\004\022\0028\0030\005H&ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap$Builder;", "K", "V", "", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "runtime"})
  public static interface Builder<K, V> extends Map<K, V>, KMutableMap {
    @NotNull
    PersistentMap<K, V> build();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\PersistentMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */