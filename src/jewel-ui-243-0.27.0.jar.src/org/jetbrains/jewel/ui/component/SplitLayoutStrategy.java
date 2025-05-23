package org.jetbrains.jewel.ui.component;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\bb\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH&J\b\020\n\032\0020\013H&¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/component/SplitLayoutStrategy;", "", "calculateSplitResult", "Lorg/jetbrains/jewel/ui/component/SplitResult;", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "state", "Lorg/jetbrains/jewel/ui/component/SplitLayoutState;", "isHorizontal", "", "ui"})
interface SplitLayoutStrategy {
  @NotNull
  SplitResult calculateSplitResult(@NotNull Density paramDensity, @NotNull LayoutDirection paramLayoutDirection, @NotNull SplitLayoutState paramSplitLayoutState);
  
  boolean isHorizontal();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\SplitLayoutStrategy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */