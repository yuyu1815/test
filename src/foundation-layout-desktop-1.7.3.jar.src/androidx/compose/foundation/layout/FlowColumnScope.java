package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\000\bg\030\0002\0020\001J\026\020\002\032\0020\003*\0020\0032\b\b\003\020\004\032\0020\005H'ø\001\000\002\006\n\004\b!0\001¨\006\006À\006\001"}, d2 = {"Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/foundation/layout/ColumnScope;", "fillMaxColumnWidth", "Landroidx/compose/ui/Modifier;", "fraction", "", "foundation-layout"})
@Immutable
@ExperimentalLayoutApi
public interface FlowColumnScope extends ColumnScope {
  @ExperimentalLayoutApi
  @NotNull
  Modifier fillMaxColumnWidth(@NotNull Modifier paramModifier, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowColumnScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */