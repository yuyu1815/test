package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\b\n\002\b\004\n\002\020\002\n\002\b\002\n\002\020\025\n\002\b\006\bf\030\000 \0342\0020\001:\001\034J\b\020\023\032\0020\024H&JL\020\025\032\0020\0242\006\020\026\032\0020\0272\b\b\002\020\030\032\0020\0172\b\b\002\020\031\032\0020\0172\b\b\002\020\021\032\0020\0172\b\b\002\020\016\032\0020\0172\b\b\002\020\032\032\0020\0172\b\b\002\020\033\032\0020\017H&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\030\020\006\032\0020\007X¦\004ø\001\000ø\001\001¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\022\020\016\032\0020\017X¦\004¢\006\006\032\004\b\020\020\tR\022\020\021\032\0020\017X¦\004¢\006\006\032\004\b\022\020\tø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006\035À\006\003"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "()I", "hasAlpha", "", "getHasAlpha", "()Z", "height", "", "getHeight", "width", "getWidth", "prepareToDraw", "", "readPixels", "buffer", "", "startX", "startY", "bufferOffset", "stride", "Companion", "ui-graphics"})
public interface ImageBitmap {
  @NotNull
  public static final Companion Companion = Companion.$$INSTANCE;
  
  int getWidth();
  
  int getHeight();
  
  @NotNull
  ColorSpace getColorSpace();
  
  boolean getHasAlpha();
  
  int getConfig-_sVssgQ();
  
  void readPixels(@NotNull int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  void prepareToDraw();
  
  @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
  public static final class DefaultImpls {}
  
  @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002¨\006\003"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "", "()V", "ui-graphics"})
  public static final class Companion {}
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\ImageBitmap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */