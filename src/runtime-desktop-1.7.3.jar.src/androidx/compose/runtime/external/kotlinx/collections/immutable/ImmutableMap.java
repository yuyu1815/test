package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\b\002\n\002\020$\n\000\n\002\030\002\n\002\020&\n\002\b\005\n\002\030\002\n\002\b\003\b`\030\000*\004\b\000\020\001*\006\b\001\020\002 \0012\016\022\004\022\002H\001\022\004\022\002H\0020\003R$\020\004\032\024\022\020\022\016\022\004\022\0028\000\022\004\022\0028\0010\0060\005X¦\004¢\006\006\032\004\b\007\020\bR\030\020\t\032\b\022\004\022\0028\0000\005X¦\004¢\006\006\032\004\b\n\020\bR\030\020\013\032\b\022\004\022\0028\0010\fX¦\004¢\006\006\032\004\b\r\020\016ø\001\000\002\006\n\004\b!0\001¨\006\017À\006\001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableMap;", "K", "V", "", "entries", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "", "getEntries", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableSet;", "keys", "getKeys", "values", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "getValues", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "runtime"})
public interface ImmutableMap<K, V> extends Map<K, V>, KMappedMarker {
  @NotNull
  ImmutableSet<K> getKeys();
  
  @NotNull
  ImmutableCollection<V> getValues();
  
  @NotNull
  ImmutableSet<Map.Entry<K, V>> getEntries();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\ImmutableMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */