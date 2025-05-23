package org.jetbrains.jewel.ui.painter;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\002\bf\030\0002\0020\001J'\020\002\032\b\022\004\022\0020\0040\0032\022\020\005\032\n\022\006\b\001\022\0020\0070\006\"\0020\007H'¢\006\002\020\b¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterProvider;", "", "getPainter", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/painter/Painter;", "hints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "ui"})
public interface PainterProvider {
  @Composable
  @NotNull
  State<Painter> getPainter(@NotNull PainterHint[] paramArrayOfPainterHint, @Nullable Composer paramComposer, int paramInt);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */