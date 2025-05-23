package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\bf\030\0002\0020\001J(\020\002\032\0020\0032\006\020\004\032\0020\0012\021\020\005\032\r\022\004\022\0020\0030\006¢\006\002\b\007H'¢\006\002\020\bJ\020\020\t\032\0020\0032\006\020\004\032\0020\001H&ø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolder;", "", "SaveableStateProvider", "", "key", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "removeState", "runtime-saveable"})
public interface SaveableStateHolder {
  @Composable
  void SaveableStateProvider(@NotNull Object paramObject, @NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2, @Nullable Composer paramComposer, int paramInt);
  
  void removeState(@NotNull Object paramObject);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-saveable-desktop-1.7.3.jar!\androidx\compose\runtime\saveable\SaveableStateHolder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */