package androidx.compose.animation;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b`\030\0002\0020\001J\020\020\n\032\0020\0132\006\020\f\032\0020\rH&R\024\020\002\032\004\030\0010\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Landroidx/compose/animation/LayerRenderer;", "", "parentState", "Landroidx/compose/animation/SharedElementInternalState;", "getParentState", "()Landroidx/compose/animation/SharedElementInternalState;", "zIndex", "", "getZIndex", "()F", "drawInOverlay", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "animation"})
public interface LayerRenderer {
  @Nullable
  SharedElementInternalState getParentState();
  
  void drawInOverlay(@NotNull DrawScope paramDrawScope);
  
  float getZIndex();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\LayerRenderer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */