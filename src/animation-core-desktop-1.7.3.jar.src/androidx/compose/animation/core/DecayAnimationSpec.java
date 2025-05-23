package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\000\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\000*\004\b\000\020\0012\0020\002J,\020\003\032\b\022\004\022\002H\0050\004\"\b\b\001\020\005*\0020\0062\022\020\007\032\016\022\004\022\0028\000\022\004\022\002H\0050\bH&ø\001\000\002\006\n\004\b!0\001¨\006\tÀ\006\001"}, d2 = {"Landroidx/compose/animation/core/DecayAnimationSpec;", "T", "", "vectorize", "Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "animation-core"})
public interface DecayAnimationSpec<T> {
  @NotNull
  <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(@NotNull TwoWayConverter<T, V> paramTwoWayConverter);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\DecayAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */