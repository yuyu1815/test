package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\002\b`\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003J)\020\004\032\0028\0012\006\020\005\032\0028\0002\022\020\006\032\016\022\004\022\0028\000\022\004\022\0028\0010\007H&¢\006\002\020\bø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Landroidx/compose/ui/text/Cache;", "K", "V", "", "get", "key", "loader", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text"})
public interface Cache<K, V> {
  V get(K paramK, @NotNull Function1<? super K, ? extends V> paramFunction1);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\Cache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */