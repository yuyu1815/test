package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\003\n\002\020\007\n\002\b\007\n\002\020\b\n\002\b\007\n\002\020 \n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\024\n\002\b\004\n\002\030\002\n\002\b\025\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\bv\030\0002\0020\001J*\020\035\032\0020\0362\006\020\037\032\0020 2\006\020!\032\0020\"2\006\020#\032\0020\017H&ø\001\000¢\006\004\b$\020%J\020\020&\032\0020'2\006\020(\032\0020\017H&J\020\020)\032\0020\0302\006\020(\032\0020\017H&J\020\020*\032\0020\0302\006\020(\032\0020\017H&J\030\020+\032\0020\0072\006\020(\032\0020\0172\006\020,\032\0020\003H&J\020\020-\032\0020\0072\006\020.\032\0020\017H&J\020\020/\032\0020\0072\006\020.\032\0020\017H&J\032\0200\032\0020\0172\006\020.\032\0020\0172\b\b\002\0201\032\0020\003H&J\020\0202\032\0020\0172\006\020(\032\0020\017H&J\020\0203\032\0020\0172\006\0204\032\0020\007H&J\020\0205\032\0020\0072\006\020.\032\0020\017H&J\020\0206\032\0020\0072\006\020.\032\0020\017H&J\020\0207\032\0020\0072\006\020.\032\0020\017H&J\020\0208\032\0020\0172\006\020.\032\0020\017H&J\020\0209\032\0020\0072\006\020.\032\0020\017H&J\020\020:\032\0020\0072\006\020.\032\0020\017H&J\032\020;\032\0020\0172\006\020<\032\0020=H&ø\001\000¢\006\004\b>\020?J\020\020@\032\0020'2\006\020(\032\0020\017H&J\030\020A\032\0020B2\006\020C\032\0020\0172\006\020D\032\0020\017H&J*\020E\032\0020 2\006\020F\032\0020\0302\006\020G\032\0020H2\006\020I\032\0020JH&ø\001\000¢\006\004\bK\020LJ\035\020M\032\0020 2\006\020(\032\0020\017H&ø\001\001ø\001\000¢\006\004\bN\020OJ\020\020P\032\0020\0032\006\020.\032\0020\017H&JZ\020Q\032\0020\0362\006\020R\032\0020S2\006\020T\032\0020U2\b\b\002\020V\032\0020\0072\n\b\002\020W\032\004\030\0010X2\n\b\002\020Y\032\004\030\0010Z2\n\b\002\020[\032\004\030\0010\\2\b\b\002\020]\032\0020^H&ø\001\000¢\006\004\b_\020`J<\020Q\032\0020\0362\006\020R\032\0020S2\b\b\002\020a\032\0020b2\n\b\002\020W\032\004\030\0010X2\n\b\002\020Y\032\004\030\0010ZH&ø\001\000¢\006\004\bc\020dJR\020Q\032\0020\0362\006\020R\032\0020S2\b\b\002\020a\032\0020b2\n\b\002\020W\032\004\030\0010X2\n\b\002\020Y\032\004\030\0010Z2\n\b\002\020[\032\004\030\0010\\2\b\b\002\020]\032\0020^H&ø\001\000¢\006\004\be\020fR\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\007X¦\004¢\006\006\032\004\b\013\020\tR\022\020\f\032\0020\007X¦\004¢\006\006\032\004\b\r\020\tR\022\020\016\032\0020\017X¦\004¢\006\006\032\004\b\020\020\021R\022\020\022\032\0020\007X¦\004¢\006\006\032\004\b\023\020\tR\022\020\024\032\0020\007X¦\004¢\006\006\032\004\b\025\020\tR\032\020\026\032\n\022\006\022\004\030\0010\0300\027X¦\004¢\006\006\032\004\b\031\020\032R\022\020\033\032\0020\007X¦\004¢\006\006\032\004\b\034\020\t\001\001gø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006hÀ\006\001"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "didExceedMaxLines", "", "getDidExceedMaxLines", "()Z", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "lineCount", "", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "minIntrinsicWidth", "getMinIntrinsicWidth", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "width", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBaseline", "lineIndex", "getLineBottom", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/text/SkiaParagraph;", "ui-text"})
public interface Paragraph {
  float getWidth();
  
  float getHeight();
  
  float getMinIntrinsicWidth();
  
  float getMaxIntrinsicWidth();
  
  float getFirstBaseline();
  
  float getLastBaseline();
  
  boolean getDidExceedMaxLines();
  
  int getLineCount();
  
  @NotNull
  List<Rect> getPlaceholderRects();
  
  @NotNull
  Path getPathForRange(int paramInt1, int paramInt2);
  
  @NotNull
  Rect getCursorRect(int paramInt);
  
  float getLineLeft(int paramInt);
  
  float getLineRight(int paramInt);
  
  float getLineTop(int paramInt);
  
  float getLineBaseline(int paramInt);
  
  float getLineBottom(int paramInt);
  
  float getLineHeight(int paramInt);
  
  float getLineWidth(int paramInt);
  
  int getLineStart(int paramInt);
  
  int getLineEnd(int paramInt, boolean paramBoolean);
  
  boolean isLineEllipsized(int paramInt);
  
  int getLineForOffset(int paramInt);
  
  float getHorizontalPosition(int paramInt, boolean paramBoolean);
  
  @NotNull
  ResolvedTextDirection getParagraphDirection(int paramInt);
  
  @NotNull
  ResolvedTextDirection getBidiRunDirection(int paramInt);
  
  int getLineForVerticalPosition(float paramFloat);
  
  int getOffsetForPosition-k-4lQ0M(long paramLong);
  
  long getRangeForRect-8-6BmAI(@NotNull Rect paramRect, int paramInt, @NotNull TextInclusionStrategy paramTextInclusionStrategy);
  
  @NotNull
  Rect getBoundingBox(int paramInt);
  
  void fillBoundingBoxes-8ffj60Q(long paramLong, @NotNull float[] paramArrayOffloat, int paramInt);
  
  long getWordBoundary--jx7JFs(int paramInt);
  
  void paint-RPmYEkk(@NotNull Canvas paramCanvas, long paramLong, @Nullable Shadow paramShadow, @Nullable TextDecoration paramTextDecoration);
  
  void paint-LG529CI(@NotNull Canvas paramCanvas, long paramLong, @Nullable Shadow paramShadow, @Nullable TextDecoration paramTextDecoration, @Nullable DrawStyle paramDrawStyle, int paramInt);
  
  void paint-hn5TExg(@NotNull Canvas paramCanvas, @NotNull Brush paramBrush, float paramFloat, @Nullable Shadow paramShadow, @Nullable TextDecoration paramTextDecoration, @Nullable DrawStyle paramDrawStyle, int paramInt);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\Paragraph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */