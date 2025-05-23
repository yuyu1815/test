package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020$\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\0002\0020\001:\001\017J\020\020\002\032\0020\0032\006\020\004\032\0020\001H&J\022\020\005\032\004\030\0010\0012\006\020\006\032\0020\007H&J\034\020\b\032\026\022\004\022\0020\007\022\f\022\n\022\006\022\004\030\0010\0010\n0\tH&J \020\013\032\0020\f2\006\020\006\032\0020\0072\016\020\r\032\n\022\006\022\004\030\0010\0010\016H&ø\001\000\002\006\n\004\b!0\001¨\006\020À\006\001"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "", "canBeSaved", "", "value", "consumeRestored", "key", "", "performSave", "", "", "registerProvider", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "valueProvider", "Lkotlin/Function0;", "Entry", "runtime-saveable"})
public interface SaveableStateRegistry {
  @Nullable
  Object consumeRestored(@NotNull String paramString);
  
  @NotNull
  Entry registerProvider(@NotNull String paramString, @NotNull Function0<? extends Object> paramFunction0);
  
  boolean canBeSaved(@NotNull Object paramObject);
  
  @NotNull
  Map<String, List<Object>> performSave();
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\bf\030\0002\0020\001J\b\020\002\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\004À\006\001"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "", "unregister", "", "runtime-saveable"})
  public static interface Entry {
    void unregister();
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaveableStateRegistry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */