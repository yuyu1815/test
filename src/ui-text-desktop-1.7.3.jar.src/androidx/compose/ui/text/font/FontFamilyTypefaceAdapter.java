package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\002\b`\030\0002\0020\001JB\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\t2\022\020\f\032\016\022\004\022\0020\005\022\004\022\0020\0010\tH&ø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "", "createDefaultTypeface", "ui-text"})
public interface FontFamilyTypefaceAdapter {
  @Nullable
  TypefaceResult resolve(@NotNull TypefaceRequest paramTypefaceRequest, @NotNull PlatformFontLoader paramPlatformFontLoader, @NotNull Function1<? super TypefaceResult.Immutable, Unit> paramFunction1, @NotNull Function1<? super TypefaceRequest, ? extends Object> paramFunction11);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontFamilyTypefaceAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */