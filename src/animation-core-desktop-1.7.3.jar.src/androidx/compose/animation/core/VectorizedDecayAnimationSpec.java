package androidx.compose.animation.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\003\n\002\020\t\n\002\b\n\bf\030\000*\b\b\000\020\001*\0020\0022\0020\003J\035\020\b\032\0020\t2\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\fJ\035\020\r\032\0028\0002\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\016J%\020\017\032\0028\0002\006\020\020\032\0020\t2\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\021J%\020\022\032\0028\0002\006\020\020\032\0020\t2\006\020\n\032\0028\0002\006\020\013\032\0028\000H&¢\006\002\020\021R\022\020\004\032\0020\005X¦\004¢\006\006\032\004\b\006\020\007ø\001\000\002\006\n\004\b!0\001¨\006\023À\006\001"}, d2 = {"Landroidx/compose/animation/core/VectorizedDecayAnimationSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "getDurationNanos", "", "initialValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getTargetValue", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "animation-core"})
public interface VectorizedDecayAnimationSpec<V extends AnimationVector> {
  float getAbsVelocityThreshold();
  
  @NotNull
  V getValueFromNanos(long paramLong, @NotNull V paramV1, @NotNull V paramV2);
  
  long getDurationNanos(@NotNull V paramV1, @NotNull V paramV2);
  
  @NotNull
  V getVelocityFromNanos(long paramLong, @NotNull V paramV1, @NotNull V paramV2);
  
  @NotNull
  V getTargetValue(@NotNull V paramV1, @NotNull V paramV2);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\VectorizedDecayAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */