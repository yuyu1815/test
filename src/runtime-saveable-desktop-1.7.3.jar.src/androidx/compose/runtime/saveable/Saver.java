package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\b\002\bf\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\0020\003J\027\020\004\032\004\030\0018\0002\006\020\005\032\0028\001H&¢\006\002\020\006J\033\020\007\032\004\030\0018\001*\0020\b2\006\020\005\032\0028\000H&¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Landroidx/compose/runtime/saveable/Saver;", "Original", "Saveable", "", "restore", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;", "runtime-saveable"})
public interface Saver<Original, Saveable> {
  @Nullable
  Saveable save(@NotNull SaverScope paramSaverScope, Original paramOriginal);
  
  @Nullable
  Original restore(@NotNull Saveable paramSaveable);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\Saver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */