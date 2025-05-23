package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\bç\001\030\0002\0020\001J\036\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0042\006\020\006\032\0020\004H&ø\001\000\002\006\n\004\b!0\001¨\006\007À\006\001"}, d2 = {"Landroidx/compose/animation/BoundsTransform;", "", "transform", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/geometry/Rect;", "initialBounds", "targetBounds", "animation"})
@ExperimentalSharedTransitionApi
public interface BoundsTransform {
  @NotNull
  FiniteAnimationSpec<Rect> transform(@NotNull Rect paramRect1, @NotNull Rect paramRect2);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\BoundsTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */