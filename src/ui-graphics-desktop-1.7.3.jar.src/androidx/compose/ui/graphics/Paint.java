package androidx.compose.ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.skia.Shader;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\020\000\n\000\n\002\020\007\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bf\030\0002\0020\001J\f\020B\032\0060Cj\002`DH&R\030\020\002\032\0020\003X¦\016¢\006\f\032\004\b\004\020\005\"\004\b\006\020\007R\036\020\b\032\0020\tX¦\016ø\001\000ø\001\001¢\006\f\032\004\b\n\020\013\"\004\b\f\020\rR\036\020\016\032\0020\017X¦\016ø\001\000ø\001\001¢\006\f\032\004\b\020\020\021\"\004\b\022\020\023R\032\020\024\032\004\030\0010\025X¦\016¢\006\f\032\004\b\026\020\027\"\004\b\030\020\031R\036\020\032\032\0020\033X¦\016ø\001\000ø\001\001¢\006\f\032\004\b\034\020\013\"\004\b\035\020\rR\030\020\036\032\0020\037X¦\016¢\006\f\032\004\b\036\020 \"\004\b!\020\"R\032\020#\032\004\030\0010$X¦\016¢\006\f\032\004\b%\020&\"\004\b'\020(R \020)\032\n\030\0010*j\004\030\001`+X¦\016¢\006\f\032\004\b,\020-\"\004\b.\020/R\036\0200\032\00201X¦\016ø\001\000ø\001\001¢\006\f\032\004\b2\020\013\"\004\b3\020\rR\036\0204\032\00205X¦\016ø\001\000ø\001\001¢\006\f\032\004\b6\020\013\"\004\b7\020\rR\030\0208\032\0020\003X¦\016¢\006\f\032\004\b9\020\005\"\004\b:\020\007R\030\020;\032\0020\003X¦\016¢\006\f\032\004\b<\020\005\"\004\b=\020\007R\036\020>\032\0020?X¦\016ø\001\000ø\001\001¢\006\f\032\004\b@\020\013\"\004\bA\020\rø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006EÀ\006\001"}, d2 = {"Landroidx/compose/ui/graphics/Paint;", "", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "isAntiAlias", "", "()Z", "setAntiAlias", "(Z)V", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V", "shader", "Lorg/jetbrains/skia/Shader;", "Landroidx/compose/ui/graphics/Shader;", "getShader", "()Lorg/jetbrains/skia/Shader;", "setShader", "(Lorg/jetbrains/skia/Shader;)V", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "strokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeMiterLimit", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "style", "Landroidx/compose/ui/graphics/PaintingStyle;", "getStyle-TiuSbCo", "setStyle-k9PVt8s", "asFrameworkPaint", "Lorg/jetbrains/skia/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "ui-graphics"})
public interface Paint {
  @NotNull
  org.jetbrains.skia.Paint asFrameworkPaint();
  
  float getAlpha();
  
  void setAlpha(float paramFloat);
  
  boolean isAntiAlias();
  
  void setAntiAlias(boolean paramBoolean);
  
  long getColor-0d7_KjU();
  
  void setColor-8_81llA(long paramLong);
  
  int getBlendMode-0nO6VwU();
  
  void setBlendMode-s9anfk8(int paramInt);
  
  int getStyle-TiuSbCo();
  
  void setStyle-k9PVt8s(int paramInt);
  
  float getStrokeWidth();
  
  void setStrokeWidth(float paramFloat);
  
  int getStrokeCap-KaPHkGw();
  
  void setStrokeCap-BeK7IIE(int paramInt);
  
  int getStrokeJoin-LxFBmk8();
  
  void setStrokeJoin-Ww9F2mQ(int paramInt);
  
  float getStrokeMiterLimit();
  
  void setStrokeMiterLimit(float paramFloat);
  
  int getFilterQuality-f-v9h1I();
  
  void setFilterQuality-vDHp3xo(int paramInt);
  
  @Nullable
  Shader getShader();
  
  void setShader(@Nullable Shader paramShader);
  
  @Nullable
  ColorFilter getColorFilter();
  
  void setColorFilter(@Nullable ColorFilter paramColorFilter);
  
  @Nullable
  PathEffect getPathEffect();
  
  void setPathEffect(@Nullable PathEffect paramPathEffect);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\Paint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */