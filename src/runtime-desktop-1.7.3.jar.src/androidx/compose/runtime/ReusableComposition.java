package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\bv\030\0002\0020\001J\b\020\002\032\0020\003H&J \020\004\032\0020\0032\021\020\005\032\r\022\004\022\0020\0030\006¢\006\002\b\007H&¢\006\002\020\b\001\001\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Landroidx/compose/runtime/ReusableComposition;", "Landroidx/compose/runtime/Composition;", "deactivate", "", "setContentWithReuse", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/CompositionImpl;", "runtime"})
public interface ReusableComposition extends Composition {
  void setContentWithReuse(@NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
  
  void deactivate();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ReusableComposition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */