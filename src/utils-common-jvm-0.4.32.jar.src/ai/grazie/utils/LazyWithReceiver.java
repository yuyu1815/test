package ai.grazie.utils;

import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\bf\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003J\"\020\004\032\0028\0012\006\020\005\032\0020\0032\n\020\006\032\006\022\002\b\0030\007H¦\002¢\006\002\020\bø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Lai/grazie/utils/LazyWithReceiver;", "This", "T", "", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "utils-common"})
public interface LazyWithReceiver<This, T> {
  T getValue(@NotNull Object paramObject, @NotNull KProperty<?> paramKProperty);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\LazyWithReceiver.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */