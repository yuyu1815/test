package org.jetbrains.jewel.foundation.theme;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bg\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\006\020\bR\022\020\t\032\0020\nX¦\004¢\006\006\032\004\b\013\020\fR\022\020\r\032\0020\016X¦\004¢\006\006\032\004\b\017\020\020¨\006\021"}, d2 = {"Lorg/jetbrains/jewel/foundation/theme/ThemeDescriptor;", "", "name", "", "getName", "()Ljava/lang/String;", "isDark", "", "()Z", "colors", "Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "getColors", "()Lorg/jetbrains/jewel/foundation/theme/ThemeColorPalette;", "iconData", "Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "getIconData", "()Lorg/jetbrains/jewel/foundation/theme/ThemeIconData;", "foundation"})
@Immutable
public interface ThemeDescriptor {
  @NotNull
  String getName();
  
  boolean isDark();
  
  @NotNull
  ThemeColorPalette getColors();
  
  @NotNull
  ThemeIconData getIconData();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\ThemeDescriptor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */