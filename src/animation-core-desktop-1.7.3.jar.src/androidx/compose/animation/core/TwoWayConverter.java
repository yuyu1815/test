package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\bf\030\000*\004\b\000\020\001*\b\b\001\020\002*\0020\0032\0020\004R\036\020\005\032\016\022\004\022\0028\001\022\004\022\0028\0000\006X¦\004¢\006\006\032\004\b\007\020\bR\036\020\t\032\016\022\004\022\0028\000\022\004\022\0028\0010\006X¦\004¢\006\006\032\004\b\n\020\bø\001\000\002\006\n\004\b!0\001¨\006\013À\006\001"}, d2 = {"Landroidx/compose/animation/core/TwoWayConverter;", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "", "convertFromVector", "Lkotlin/Function1;", "getConvertFromVector", "()Lkotlin/jvm/functions/Function1;", "convertToVector", "getConvertToVector", "animation-core"})
public interface TwoWayConverter<T, V extends AnimationVector> {
  @NotNull
  Function1<T, V> getConvertToVector();
  
  @NotNull
  Function1<V, T> getConvertFromVector();
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\animation-core-desktop-1.7.3.jar!\androidx\compose\animation\core\TwoWayConverter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */