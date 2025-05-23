package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\005\bf\030\0002\0020\001J(\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\b2\006\020\n\032\0020\bH&ø\001\000¢\006\004\b\013\020\fR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\001\002\r\n\005\b¡\0360\001\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Landroidx/compose/animation/SizeTransform;", "", "clip", "", "getClip", "()Z", "createAnimationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "initialSize", "targetSize", "createAnimationSpec-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;", "animation"})
public interface SizeTransform {
  boolean getClip();
  
  @NotNull
  FiniteAnimationSpec<IntSize> createAnimationSpec-TemP2vQ(long paramLong1, long paramLong2);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\SizeTransform.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */