package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\bg\030\000 \0132\0020\001:\001\013J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\030\020\006\032\0020\0032\006\020\004\032\0020\0052\006\020\007\032\0020\bH&J\030\020\t\032\0020\0032\006\020\004\032\0020\0052\006\020\007\032\0020\bH&J\020\020\n\032\0020\0032\006\020\004\032\0020\005H&ø\001\000\002\006\n\004\b!0\001¨\006\fÀ\006\001"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets;", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "Companion", "foundation-layout"})
@Stable
public interface WindowInsets {
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  int getLeft(@NotNull Density paramDensity, @NotNull LayoutDirection paramLayoutDirection);
  
  int getTop(@NotNull Density paramDensity);
  
  int getRight(@NotNull Density paramDensity, @NotNull LayoutDirection paramLayoutDirection);
  
  int getBottom(@NotNull Density paramDensity);
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsets$Companion;", "", "()V", "foundation-layout"})
  public static final class Companion {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\WindowInsets.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */