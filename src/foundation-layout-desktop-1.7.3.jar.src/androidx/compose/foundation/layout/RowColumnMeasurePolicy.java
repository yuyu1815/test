package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\025\n\002\b\b\n\002\020\002\n\002\b\004\b`\030\0002\0020\001J?\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\0052\006\020\b\032\0020\0052\b\b\002\020\t\032\0020\nH&ø\001\000ø\001\001¢\006\004\b\013\020\fJg\020\r\032\0020\0162\016\020\017\032\n\022\006\022\004\030\0010\0210\0202\006\020\022\032\0020\0232\006\020\024\032\0020\0052\006\020\025\032\0020\0262\006\020\027\032\0020\0052\006\020\030\032\0020\0052\b\020\031\032\004\030\0010\0262\006\020\032\032\0020\0052\006\020\033\032\0020\0052\006\020\034\032\0020\005H&¢\006\002\020\035J(\020\036\032\0020\0372\006\020\027\032\0020\0052\006\020 \032\0020\0262\006\020\025\032\0020\0262\006\020\022\032\0020\023H&J\f\020!\032\0020\005*\0020\021H&J\f\020\"\032\0020\005*\0020\021H&ø\001\002\002\021\n\002\b!\n\005\b¡\0360\001\n\004\b!0\001¨\006#À\006\001"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "isPrioritizing", "", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "placeHelper", "Landroidx/compose/ui/layout/MeasureResult;", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "beforeCrossAxisAlignmentLine", "mainAxisPositions", "", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "populateMainAxisPositions", "", "childrenMainAxisSize", "crossAxisSize", "mainAxisSize", "foundation-layout"})
public interface RowColumnMeasurePolicy {
  int mainAxisSize(@NotNull Placeable paramPlaceable);
  
  int crossAxisSize(@NotNull Placeable paramPlaceable);
  
  void populateMainAxisPositions(int paramInt, @NotNull int[] paramArrayOfint1, @NotNull int[] paramArrayOfint2, @NotNull MeasureScope paramMeasureScope);
  
  @NotNull
  MeasureResult placeHelper(@NotNull Placeable[] paramArrayOfPlaceable, @NotNull MeasureScope paramMeasureScope, int paramInt1, @NotNull int[] paramArrayOfint1, int paramInt2, int paramInt3, @Nullable int[] paramArrayOfint2, int paramInt4, int paramInt5, int paramInt6);
  
  long createConstraints-xF2OJ5Q(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\RowColumnMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */