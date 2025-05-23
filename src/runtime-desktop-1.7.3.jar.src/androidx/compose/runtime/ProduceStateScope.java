package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\001\n\000\n\002\030\002\n\002\020\002\n\002\b\002\bf\030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\0020\003J\034\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007H¦@¢\006\002\020\tø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Landroidx/compose/runtime/ProduceStateScope;", "T", "Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/CoroutineScope;", "awaitDispose", "", "onDispose", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime"})
public interface ProduceStateScope<T> extends MutableState<T>, CoroutineScope {
  @Nullable
  Object awaitDispose(@NotNull Function0<Unit> paramFunction0, @NotNull Continuation<?> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\ProduceStateScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */