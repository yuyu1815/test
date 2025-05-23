package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\003\n\002\020\t\n\002\b\007\bf\030\0002\0020\001J\030\020\006\032\0020\0072\006\020\b\032\0020\0032\006\020\t\032\0020\003H&J\030\020\n\032\0020\0032\006\020\b\032\0020\0032\006\020\t\032\0020\003H&J \020\013\032\0020\0032\006\020\f\032\0020\0072\006\020\b\032\0020\0032\006\020\t\032\0020\003H&J \020\r\032\0020\0032\006\020\f\032\0020\0072\006\020\b\032\0020\0032\006\020\t\032\0020\003H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\000\002\006\n\004\b!0\001¨\006\016À\006\001"}, d2 = {"Landroidx/compose/animation/core/FloatDecayAnimationSpec;", "", "absVelocityThreshold", "", "getAbsVelocityThreshold", "()F", "getDurationNanos", "", "initialValue", "initialVelocity", "getTargetValue", "getValueFromNanos", "playTimeNanos", "getVelocityFromNanos", "animation-core"})
public interface FloatDecayAnimationSpec {
  float getAbsVelocityThreshold();
  
  float getValueFromNanos(long paramLong, float paramFloat1, float paramFloat2);
  
  long getDurationNanos(float paramFloat1, float paramFloat2);
  
  float getVelocityFromNanos(long paramLong, float paramFloat1, float paramFloat2);
  
  float getTargetValue(float paramFloat1, float paramFloat2);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\FloatDecayAnimationSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */