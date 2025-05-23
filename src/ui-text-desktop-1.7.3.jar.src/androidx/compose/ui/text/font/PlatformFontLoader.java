package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\b\003\b`\030\0002\0020\001J\030\020\005\032\004\030\0010\0012\006\020\006\032\0020\007H¦@¢\006\002\020\bJ\022\020\t\032\004\030\0010\0012\006\020\006\032\0020\007H&R\024\020\002\032\004\030\0010\001X¦\004¢\006\006\032\004\b\003\020\004ø\001\000\002\006\n\004\b!0\001¨\006\nÀ\006\001"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontLoader;", "", "cacheKey", "getCacheKey", "()Ljava/lang/Object;", "awaitLoad", "font", "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text"})
public interface PlatformFontLoader {
  @Nullable
  Object loadBlocking(@NotNull Font paramFont);
  
  @Nullable
  Object awaitLoad(@NotNull Font paramFont, @NotNull Continuation<Object> paramContinuation);
  
  @Nullable
  Object getCacheKey();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\PlatformFontLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */