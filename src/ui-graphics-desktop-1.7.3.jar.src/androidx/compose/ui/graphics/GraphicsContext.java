package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\bf\030\0002\0020\001J\b\020\002\032\0020\003H&J\020\020\004\032\0020\0052\006\020\006\032\0020\003H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/ui/graphics/GraphicsContext;", "", "createGraphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "releaseGraphicsLayer", "", "layer", "ui-graphics"})
public interface GraphicsContext {
  @NotNull
  GraphicsLayer createGraphicsLayer();
  
  void releaseGraphicsLayer(@NotNull GraphicsLayer paramGraphicsLayer);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\GraphicsContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */