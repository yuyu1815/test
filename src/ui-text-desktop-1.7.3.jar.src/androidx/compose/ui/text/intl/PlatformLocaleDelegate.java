package androidx.compose.ui.text.intl;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\b`\030\0002\0020\001J\024\020\006\032\0060\007j\002`\b2\006\020\t\032\0020\nH&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "parseLanguageTag", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "languageTag", "", "ui-text"})
public interface PlatformLocaleDelegate {
  @NotNull
  LocaleList getCurrent();
  
  @NotNull
  Locale parseLanguageTag(@NotNull String paramString);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\intl\PlatformLocaleDelegate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */