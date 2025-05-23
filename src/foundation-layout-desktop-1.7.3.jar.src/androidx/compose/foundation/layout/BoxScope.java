package androidx.compose.foundation.layout;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bg\030\0002\0020\001J\024\020\002\032\0020\003*\0020\0032\006\020\004\032\0020\005H'J\f\020\006\032\0020\003*\0020\003H'ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/foundation/layout/BoxScope;", "", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment;", "matchParentSize", "foundation-layout"})
@Immutable
public interface BoxScope {
  @Stable
  @NotNull
  Modifier align(@NotNull Modifier paramModifier, @NotNull Alignment paramAlignment);
  
  @Stable
  @NotNull
  Modifier matchParentSize(@NotNull Modifier paramModifier);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\BoxScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */