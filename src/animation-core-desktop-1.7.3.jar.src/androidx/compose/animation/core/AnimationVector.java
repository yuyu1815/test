package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\007\n\002\b\005\n\002\020\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001B\007\b\004¢\006\002\020\002J\026\020\007\032\0020\b2\006\020\t\032\0020\004H \002¢\006\002\b\nJ\r\020\013\032\0020\000H ¢\006\002\b\fJ\r\020\r\032\0020\016H ¢\006\002\b\017J\036\020\020\032\0020\0162\006\020\t\032\0020\0042\006\020\021\032\0020\bH \002¢\006\002\b\022R\022\020\003\032\0020\004X \004¢\006\006\032\004\b\005\020\006\001\004\023\024\025\026¨\006\027"}, d2 = {"Landroidx/compose/animation/core/AnimationVector;", "", "()V", "size", "", "getSize$animation_core", "()I", "get", "", "index", "get$animation_core", "newVector", "newVector$animation_core", "reset", "", "reset$animation_core", "set", "value", "set$animation_core", "Landroidx/compose/animation/core/AnimationVector1D;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/AnimationVector3D;", "Landroidx/compose/animation/core/AnimationVector4D;", "animation-core"})
@StabilityInferred(parameters = 1)
public abstract class AnimationVector {
  public static final int $stable;
  
  private AnimationVector() {}
  
  public abstract void reset$animation_core();
  
  @NotNull
  public abstract AnimationVector newVector$animation_core();
  
  public abstract float get$animation_core(int paramInt);
  
  public abstract void set$animation_core(int paramInt, float paramFloat);
  
  public abstract int getSize$animation_core();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\AnimationVector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */