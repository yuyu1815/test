package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@LayoutScopeMarker
@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\020\013\n\000\bg\030\0002\0020\001J\024\020\002\032\0020\003*\0020\0032\006\020\004\032\0020\005H'J \020\006\032\0020\003*\0020\0032\022\020\007\032\016\022\004\022\0020\t\022\004\022\0020\n0\bH'J\024\020\006\032\0020\003*\0020\0032\006\020\013\032\0020\fH'J\f\020\r\032\0020\003*\0020\003H'J \020\016\032\0020\003*\0020\0032\b\b\001\020\016\032\0020\0172\b\b\002\020\020\032\0020\021H'ø\001\000\002\006\n\004\b!0\001¨\006\022À\006\003"}, d2 = {"Landroidx/compose/foundation/layout/RowScope;", "", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "foundation-layout"})
@Immutable
public interface RowScope {
  @Stable
  @NotNull
  Modifier weight(@NotNull Modifier paramModifier, @FloatRange(from = 0.0D, fromInclusive = false) float paramFloat, boolean paramBoolean);
  
  @Stable
  @NotNull
  Modifier align(@NotNull Modifier paramModifier, @NotNull Alignment.Vertical paramVertical);
  
  @Stable
  @NotNull
  Modifier alignBy(@NotNull Modifier paramModifier, @NotNull HorizontalAlignmentLine paramHorizontalAlignmentLine);
  
  @Stable
  @NotNull
  Modifier alignByBaseline(@NotNull Modifier paramModifier);
  
  @Stable
  @NotNull
  Modifier alignBy(@NotNull Modifier paramModifier, @NotNull Function1<? super Measured, Integer> paramFunction1);
  
  @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\RowScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */