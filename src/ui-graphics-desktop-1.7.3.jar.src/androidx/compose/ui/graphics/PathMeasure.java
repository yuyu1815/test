package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\003\bf\030\0002\0020\001J\035\020\006\032\0020\0072\006\020\b\032\0020\003H&ø\001\000ø\001\001¢\006\004\b\t\020\nJ*\020\013\032\0020\f2\006\020\r\032\0020\0032\006\020\016\032\0020\0032\006\020\017\032\0020\0202\b\b\002\020\021\032\0020\fH&J\035\020\022\032\0020\0072\006\020\b\032\0020\003H&ø\001\000ø\001\001¢\006\004\b\023\020\nJ\032\020\024\032\0020\0252\b\020\026\032\004\030\0010\0202\006\020\027\032\0020\fH&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005ø\001\002\002\021\n\002\b!\n\005\b¡\0360\001\n\004\b!0\001¨\006\030À\006\003"}, d2 = {"Landroidx/compose/ui/graphics/PathMeasure;", "", "length", "", "getLength", "()F", "getPosition", "Landroidx/compose/ui/geometry/Offset;", "distance", "getPosition-tuRUvjQ", "(F)J", "getSegment", "", "startDistance", "stopDistance", "destination", "Landroidx/compose/ui/graphics/Path;", "startWithMoveTo", "getTangent", "getTangent-tuRUvjQ", "setPath", "", "path", "forceClosed", "ui-graphics"})
public interface PathMeasure {
  float getLength();
  
  boolean getSegment(float paramFloat1, float paramFloat2, @NotNull Path paramPath, boolean paramBoolean);
  
  void setPath(@Nullable Path paramPath, boolean paramBoolean);
  
  long getPosition-tuRUvjQ(float paramFloat);
  
  long getTangent-tuRUvjQ(float paramFloat);
  
  @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\PathMeasure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */