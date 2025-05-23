package androidx.compose.ui.text;

import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\004\b`\030\0002\0020\001J\034\020\002\032\0020\0032\006\020\004\032\0020\0032\n\020\005\032\0060\006j\002`\007H&J\034\020\b\032\0020\0032\006\020\004\032\0020\0032\n\020\005\032\0060\006j\002`\007H&J\034\020\t\032\0020\0032\006\020\004\032\0020\0032\n\020\005\032\0060\006j\002`\007H&J\034\020\n\032\0020\0032\006\020\004\032\0020\0032\n\020\005\032\0060\006j\002`\007H&ø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/ui/text/PlatformStringDelegate;", "", "capitalize", "", "string", "locale", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text"})
public interface PlatformStringDelegate {
  @NotNull
  String toUpperCase(@NotNull String paramString, @NotNull Locale paramLocale);
  
  @NotNull
  String toLowerCase(@NotNull String paramString, @NotNull Locale paramLocale);
  
  @NotNull
  String capitalize(@NotNull String paramString, @NotNull Locale paramLocale);
  
  @NotNull
  String decapitalize(@NotNull String paramString, @NotNull Locale paramLocale);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\PlatformStringDelegate.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */