package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@ComposeCompilerApi
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\020\b\n\000\bg\030\0002\0020\001J\"\020\002\032\0020\0032\030\020\004\032\024\022\004\022\0020\006\022\004\022\0020\007\022\004\022\0020\0030\005H&ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Landroidx/compose/runtime/ScopeUpdateScope;", "", "updateScope", "", "block", "Lkotlin/Function2;", "Landroidx/compose/runtime/Composer;", "", "runtime"})
public interface ScopeUpdateScope {
  void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> paramFunction2);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ScopeUpdateScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */