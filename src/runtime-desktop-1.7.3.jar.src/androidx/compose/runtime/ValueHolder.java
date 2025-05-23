package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b`\030\000*\004\b\000\020\0012\0020\002J\025\020\003\032\0028\0002\006\020\004\032\0020\005H&¢\006\002\020\006J\034\020\007\032\b\022\004\022\0028\0000\b2\f\020\t\032\b\022\004\022\0028\0000\nH&ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/runtime/ValueHolder;", "T", "", "readValue", "map", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)Ljava/lang/Object;", "toProvided", "Landroidx/compose/runtime/ProvidedValue;", "local", "Landroidx/compose/runtime/CompositionLocal;", "runtime"})
public interface ValueHolder<T> {
  T readValue(@NotNull PersistentCompositionLocalMap paramPersistentCompositionLocalMap);
  
  @NotNull
  ProvidedValue<T> toProvided(@NotNull CompositionLocal<T> paramCompositionLocal);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ValueHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */