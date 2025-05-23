package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J\b\020\007\032\0020\bH&J \020\t\032\0020\b2\021\020\n\032\r\022\004\022\0020\b0\013¢\006\002\b\fH&¢\006\002\020\rR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\003X¦\004¢\006\006\032\004\b\006\020\005ø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Landroidx/compose/runtime/Composition;", "", "hasInvalidations", "", "getHasInvalidations", "()Z", "isDisposed", "dispose", "", "setContent", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;)V", "runtime"})
public interface Composition {
  boolean getHasInvalidations();
  
  boolean isDisposed();
  
  void dispose();
  
  void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\Composition.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */