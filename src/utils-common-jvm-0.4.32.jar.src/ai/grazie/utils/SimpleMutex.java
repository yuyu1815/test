package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J2\020\002\032\002H\003\"\004\b\000\020\0032\034\020\004\032\030\b\001\022\n\022\b\022\004\022\002H\0030\006\022\006\022\004\030\0010\0010\005H¦@¢\006\002\020\007ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/utils/SimpleMutex;", "", "withLock", "T", "body", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils-common"})
public interface SimpleMutex {
  @Nullable
  <T> Object withLock(@NotNull Function1<? super Continuation<? super T>, ? extends Object> paramFunction1, @NotNull Continuation<? super T> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\SimpleMutex.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */