package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b0\030\0002\0020\001B\007\b\004¢\006\002\020\002R\026\020\003\032\006\022\002\b\0030\004X \004¢\006\006\032\004\b\005\020\006\001\001\007¨\006\b"}, d2 = {"Landroidx/compose/animation/TransitionEffect;", "", "()V", "key", "Landroidx/compose/animation/TransitionEffectKey;", "getKey$animation", "()Landroidx/compose/animation/TransitionEffectKey;", "Landroidx/compose/animation/ContentScaleTransitionEffect;", "animation"})
@StabilityInferred(parameters = 1)
public abstract class TransitionEffect {
  public static final int $stable;
  
  private TransitionEffect() {}
  
  @NotNull
  public abstract TransitionEffectKey<?> getKey$animation();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-desktop-1.7.3.jar!\androidx\compose\animation\TransitionEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */