/*      */ package androidx.compose.ui.graphics.drawscope;
/*      */ 
/*      */ import androidx.annotation.FloatRange;
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.ui.geometry.CornerRadius;
/*      */ import androidx.compose.ui.geometry.Offset;
/*      */ import androidx.compose.ui.geometry.Rect;
/*      */ import androidx.compose.ui.geometry.Size;
/*      */ import androidx.compose.ui.geometry.SizeKt;
/*      */ import androidx.compose.ui.graphics.BlendMode;
/*      */ import androidx.compose.ui.graphics.Brush;
/*      */ import androidx.compose.ui.graphics.Canvas;
/*      */ import androidx.compose.ui.graphics.ColorFilter;
/*      */ import androidx.compose.ui.graphics.FilterQuality;
/*      */ import androidx.compose.ui.graphics.ImageBitmap;
/*      */ import androidx.compose.ui.graphics.Path;
/*      */ import androidx.compose.ui.graphics.PathEffect;
/*      */ import androidx.compose.ui.graphics.StrokeCap;
/*      */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import androidx.compose.ui.unit.DpRect;
/*      */ import androidx.compose.ui.unit.IntOffset;
/*      */ import androidx.compose.ui.unit.IntSizeKt;
/*      */ import androidx.compose.ui.unit.LayoutDirection;
/*      */ import java.util.List;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.DeprecationLevel;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ReplaceWith;
/*      */ import kotlin.Unit;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @DrawScopeMarker
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000¾\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\006\n\002\020 \n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\004\bg\030\000 u2\0020\001:\001uJp\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\0262\006\020\027\032\0020\0262\006\020\030\032\0020\0312\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\b\"\020#Jp\020\021\032\0020\0222\006\020$\032\0020%2\006\020\025\032\0020\0262\006\020\027\032\0020\0262\006\020\030\032\0020\0312\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\b&\020'JX\020(\032\0020\0222\006\020\023\032\0020\0242\b\b\002\020)\032\0020\0262\b\b\002\020\002\032\0020\0032\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\b*\020+JX\020(\032\0020\0222\006\020$\032\0020%2\b\b\002\020)\032\0020\0262\b\b\002\020\002\032\0020\0032\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\b,\020-JN\020.\032\0020\0222\006\020/\032\002002\b\b\002\020\032\032\0020\0032\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\b1\0202Jl\020.\032\0020\0222\006\020/\032\002002\b\b\002\0203\032\002042\b\b\002\0205\032\002062\b\b\002\0207\032\002042\b\b\002\0208\032\002062\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H'ø\001\000¢\006\004\b9\020:Jv\020.\032\0020\0222\006\020/\032\002002\b\b\002\0203\032\002042\b\b\002\0205\032\002062\b\b\002\0207\032\002042\b\b\002\0208\032\002062\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!2\b\b\002\020;\032\0020<H\026ø\001\000¢\006\004\b=\020>Jj\020?\032\0020\0222\006\020\023\032\0020\0242\006\020@\032\0020\0032\006\020A\032\0020\0032\b\b\002\020B\032\0020\0262\b\b\002\020C\032\0020D2\n\b\002\020E\032\004\030\0010F2\b\b\003\020\033\032\0020\0262\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bG\020HJj\020?\032\0020\0222\006\020$\032\0020%2\006\020@\032\0020\0032\006\020A\032\0020\0032\b\b\002\020B\032\0020\0262\b\b\002\020C\032\0020D2\n\b\002\020E\032\004\030\0010F2\b\b\003\020\033\032\0020\0262\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bI\020JJX\020K\032\0020\0222\006\020\023\032\0020\0242\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bL\020MJX\020K\032\0020\0222\006\020$\032\0020%2\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bN\020OJL\020P\032\0020\0222\006\020Q\032\0020R2\006\020\023\032\0020\0242\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bS\020TJL\020P\032\0020\0222\006\020Q\032\0020R2\006\020$\032\0020%2\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bU\020VJp\020W\032\0020\0222\f\020X\032\b\022\004\022\0020\0030Y2\006\020Z\032\0020[2\006\020\023\032\0020\0242\b\b\002\020B\032\0020\0262\b\b\002\020C\032\0020D2\n\b\002\020E\032\004\030\0010F2\b\b\003\020\033\032\0020\0262\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\b\\\020]Jp\020W\032\0020\0222\f\020X\032\b\022\004\022\0020\0030Y2\006\020Z\032\0020[2\006\020$\032\0020%2\b\b\002\020B\032\0020\0262\b\b\002\020C\032\0020D2\n\b\002\020E\032\004\030\0010F2\b\b\003\020\033\032\0020\0262\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\b^\020_JX\020`\032\0020\0222\006\020\023\032\0020\0242\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\ba\020MJX\020`\032\0020\0222\006\020$\032\0020%2\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bb\020OJb\020c\032\0020\0222\006\020\023\032\0020\0242\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\002\020d\032\0020e2\b\b\003\020\033\032\0020\0262\b\b\002\020\034\032\0020\0352\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bf\020gJb\020c\032\0020\0222\006\020$\032\0020%2\b\b\002\020\032\032\0020\0032\b\b\002\020\016\032\0020\0172\b\b\002\020d\032\0020e2\b\b\002\020\034\032\0020\0352\b\b\003\020\033\032\0020\0262\n\b\002\020\036\032\004\030\0010\0372\b\b\002\020 \032\0020!H&ø\001\000¢\006\004\bh\020iJ\036\020j\032\0020\017*\0020\0172\006\020k\032\0020\003H\002ø\001\000¢\006\004\bl\020mJ9\020n\032\0020\022*\0020o2\b\b\002\020\016\032\002062\027\020p\032\023\022\004\022\0020\000\022\004\022\0020\0220q¢\006\002\brH\026ø\001\000¢\006\004\bs\020tR\032\020\002\032\0020\0038VX\004ø\001\000ø\001\001¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\f\020\rR\032\020\016\032\0020\0178VX\004ø\001\000ø\001\001¢\006\006\032\004\b\020\020\005ø\001\002\002\021\n\005\b¡\0360\001\n\002\b!\n\004\b!0\001¨\006vÀ\006\003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", "offset", "offsetSize-PENXr5M", "(JJ)J", "record", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "Companion", "ui-graphics"})
/*      */ public interface DrawScope
/*      */   extends Density
/*      */ {
/*      */   @NotNull
/*      */   public static final Companion Companion = Companion.$$INSTANCE;
/*      */   
/*      */   default long getCenter-F1C5BW0() {
/*  382 */     return SizeKt.getCenter-uvyYCjk(getDrawContext().getSize-NH-jbRc()); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48) public static final class DefaultImpls { @Deprecated @Stable public static int roundToPx-0680j_4(@NotNull DrawScope $this, float $receiver) { return $this.roundToPx-0680j_4($receiver); } @Deprecated @Stable public static int roundToPx--R2X_6o(@NotNull DrawScope $this, long $receiver) { return $this.roundToPx--R2X_6o($receiver); } @Deprecated @Stable public static float toDp-u2uoSUM(@NotNull DrawScope $this, float $receiver) { return $this.toDp-u2uoSUM($receiver); } @Deprecated @Stable public static float toDp-u2uoSUM(@NotNull DrawScope $this, int $receiver) { return $this.toDp-u2uoSUM($receiver); } @Deprecated @Stable public static float toDp-GaN1DYA(@NotNull DrawScope $this, long $receiver) { return $this.toDp-GaN1DYA($receiver); } @Deprecated @Stable public static long toDpSize-k-rfVVM(@NotNull DrawScope $this, long $receiver) { return $this.toDpSize-k-rfVVM($receiver); } @Deprecated public static long getCenter-F1C5BW0(@NotNull DrawScope $this) { return $this.getCenter-F1C5BW0(); }
/*      */     @Deprecated @Stable public static float toPx-0680j_4(@NotNull DrawScope $this, float $receiver) { return $this.toPx-0680j_4($receiver); }
/*      */     @Deprecated @Stable public static float toPx--R2X_6o(@NotNull DrawScope $this, long $receiver) { return $this.toPx--R2X_6o($receiver); }
/*      */     @Deprecated @Stable @NotNull public static Rect toRect(@NotNull DrawScope $this, @NotNull DpRect $receiver) { Intrinsics.checkNotNullParameter($receiver, "$receiver"); return $this.toRect($receiver); }
/*      */     @Deprecated @Stable public static long toSize-XkaWNTQ(@NotNull DrawScope $this, long $receiver) { return $this.toSize-XkaWNTQ($receiver); }
/*      */     @Deprecated @Stable public static long toSp-kPz2Gy4(@NotNull DrawScope $this, float $receiver) { return $this.toSp-kPz2Gy4($receiver); }
/*  388 */     @Deprecated @Stable public static long toSp-kPz2Gy4(@NotNull DrawScope $this, int $receiver) { return $this.toSp-kPz2Gy4($receiver); } @Deprecated @Stable public static long toSp-0xMU5do(@NotNull DrawScope $this, float $receiver) { return $this.toSp-0xMU5do($receiver); } @Deprecated public static long getSize-NH-jbRc(@NotNull DrawScope $this) { return $this.getSize-NH-jbRc(); }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static void drawImage-AZ2fEMs(@NotNull DrawScope $this, @NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
/*  587 */       Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(style, "style"); $this.drawImage-AZ2fEMs(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     @Deprecated
/*      */     public static void record-JVtK1S4(@NotNull DrawScope $this, @NotNull GraphicsLayer $receiver, long size, @NotNull Function1 block) {
/*  938 */       Intrinsics.checkNotNullParameter($receiver, "$receiver"); Intrinsics.checkNotNullParameter(block, "block"); $this.record-JVtK1S4($receiver, size, block);
/*      */     } } default long getSize-NH-jbRc() { return getDrawContext().getSize-NH-jbRc(); } default void drawImage-AZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) { Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(style, "style");
/*      */     drawImage-AZ2fEMs$default(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, (Object)null); }
/*  941 */   default void record-JVtK1S4(@NotNull GraphicsLayer $this$record_u2dJVtK1S4, long size, @NotNull Function1<? super DrawScope, Unit> block) { Intrinsics.checkNotNullParameter($this$record_u2dJVtK1S4, "$this$record"); Intrinsics.checkNotNullParameter(block, "block"); $this$record_u2dJVtK1S4.record-mL-hObY(
/*  942 */         this, 
/*  943 */         getLayoutDirection(), 
/*  944 */         size, new DrawScope$record$1(block)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"})
/*      */   @SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope$record$1\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,1062:1\n329#2,26:1063\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope$record$1\n*L\n946#1:1063,26\n*E\n"})
/*  946 */   static final class DrawScope$record$1 extends Lambda implements Function1<DrawScope, Unit> { public final void invoke(@NotNull DrawScope $this$record) { Intrinsics.checkNotNullParameter($this$record, "$this$record"); DrawScope drawScope = DrawScope.this;
/*      */ 
/*      */       
/*  949 */       Density density1 = $this$record.getDrawContext().getDensity();
/*  950 */       LayoutDirection layoutDirection1 = $this$record.getDrawContext().getLayoutDirection();
/*  951 */       Canvas canvas1 = $this$record.getDrawContext().getCanvas();
/*  952 */       long l1 = $this$record.getDrawContext().getSize-NH-jbRc();
/*  953 */       GraphicsLayer graphicsLayer1 = $this$record.getDrawContext().getGraphicsLayer();
/*  954 */       Function1<DrawScope, Unit> function1 = this.$block;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       int $i$f$draw-ymL40Pk = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1063 */       Density prevDensity$iv = drawScope.getDrawContext().getDensity();
/* 1064 */       LayoutDirection prevLayoutDirection$iv = drawScope.getDrawContext().getLayoutDirection();
/* 1065 */       Canvas prevCanvas$iv = drawScope.getDrawContext().getCanvas();
/* 1066 */       long prevSize$iv = drawScope.getDrawContext().getSize-NH-jbRc();
/* 1067 */       GraphicsLayer prevLayer$iv = drawScope.getDrawContext().getGraphicsLayer();
/* 1068 */       DrawContext $this$draw_ymL40Pk_u24lambda_u247$iv = null = drawScope.getDrawContext(); int $i$a$-apply-DrawScopeKt$draw$1$iv = 0;
/* 1069 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setDensity(density1);
/* 1070 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setLayoutDirection(layoutDirection1);
/* 1071 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setCanvas(canvas1);
/* 1072 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setSize-uvyYCjk(l1);
/* 1073 */       $this$draw_ymL40Pk_u24lambda_u247$iv.setGraphicsLayer(graphicsLayer1);
/*      */       
/* 1075 */       canvas1.save();
/*      */       try {
/* 1077 */         function1.invoke(drawScope);
/*      */       } finally {
/* 1079 */         canvas1.restore();
/* 1080 */         DrawContext $this$draw_ymL40Pk_u24lambda_u248$iv = $this$draw_ymL40Pk_u24lambda_u247$iv = drawScope.getDrawContext(); int $i$a$-apply-DrawScopeKt$draw$2$iv = 0;
/* 1081 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setDensity(prevDensity$iv);
/* 1082 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setLayoutDirection(prevLayoutDirection$iv);
/* 1083 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setCanvas(prevCanvas$iv);
/* 1084 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setSize-uvyYCjk(prevSize$iv);
/* 1085 */         $this$draw_ymL40Pk_u24lambda_u248$iv.setGraphicsLayer(prevLayer$iv);
/*      */       }  }
/*      */ 
/*      */     
/*      */     DrawScope$record$1(Function1<DrawScope, Unit> $block) {
/*      */       super(1);
/*      */     } }
/*      */ 
/*      */   
/*      */   private long offsetSize-PENXr5M(long $this$offsetSize_u2dPENXr5M, long offset) {
/*      */     return SizeKt.Size(Size.getWidth-impl($this$offsetSize_u2dPENXr5M) - Offset.getX-impl(offset), Size.getHeight-impl($this$offsetSize_u2dPENXr5M) - Offset.getY-impl(offset));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   DrawContext getDrawContext();
/*      */   
/*      */   @NotNull
/*      */   LayoutDirection getLayoutDirection();
/*      */   
/*      */   void drawLine-1RTmtNc(@NotNull Brush paramBrush, long paramLong1, long paramLong2, float paramFloat1, int paramInt1, @Nullable PathEffect paramPathEffect, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat2, @Nullable ColorFilter paramColorFilter, int paramInt2);
/*      */   
/*      */   void drawLine-NGM6Ib0(long paramLong1, long paramLong2, long paramLong3, float paramFloat1, int paramInt1, @Nullable PathEffect paramPathEffect, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat2, @Nullable ColorFilter paramColorFilter, int paramInt2);
/*      */   
/*      */   void drawRect-AsUm42w(@NotNull Brush paramBrush, long paramLong1, long paramLong2, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawRect-n-J9OG0(long paramLong1, long paramLong2, long paramLong3, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawImage-gbVJVH8(@NotNull ImageBitmap paramImageBitmap, long paramLong, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawRoundRect-ZuiqVtQ(@NotNull Brush paramBrush, long paramLong1, long paramLong2, long paramLong3, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawRoundRect-u-Aw5IA(long paramLong1, long paramLong2, long paramLong3, long paramLong4, @NotNull DrawStyle paramDrawStyle, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawCircle-V9BoPsw(@NotNull Brush paramBrush, float paramFloat1, long paramLong, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat2, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawCircle-VaOC9Bg(long paramLong1, float paramFloat1, long paramLong2, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat2, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawOval-AsUm42w(@NotNull Brush paramBrush, long paramLong1, long paramLong2, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawOval-n-J9OG0(long paramLong1, long paramLong2, long paramLong3, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawArc-illE91I(@NotNull Brush paramBrush, float paramFloat1, float paramFloat2, boolean paramBoolean, long paramLong1, long paramLong2, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat3, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawArc-yD3GUKo(long paramLong1, float paramFloat1, float paramFloat2, boolean paramBoolean, long paramLong2, long paramLong3, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat3, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawPath-LG529CI(@NotNull Path paramPath, long paramLong, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawPath-GBMwjPU(@NotNull Path paramPath, @NotNull Brush paramBrush, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat, @NotNull DrawStyle paramDrawStyle, @Nullable ColorFilter paramColorFilter, int paramInt);
/*      */   
/*      */   void drawPoints-F8ZwMP8(@NotNull List<Offset> paramList, int paramInt1, long paramLong, float paramFloat1, int paramInt2, @Nullable PathEffect paramPathEffect, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat2, @Nullable ColorFilter paramColorFilter, int paramInt3);
/*      */   
/*      */   void drawPoints-Gsft0Ws(@NotNull List<Offset> paramList, int paramInt1, @NotNull Brush paramBrush, float paramFloat1, int paramInt2, @Nullable PathEffect paramPathEffect, @FloatRange(from = 0.0D, to = 1.0D) float paramFloat2, @Nullable ColorFilter paramColorFilter, int paramInt3);
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\0020\004ø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\005\020\006R\031\020\b\032\0020\tø\001\000ø\001\001¢\006\n\n\002\020\007\032\004\b\n\020\006\002\013\n\005\b¡\0360\001\n\002\b!¨\006\013"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics"})
/*      */   public static final class Companion {
/*      */     private static final int DefaultBlendMode = BlendMode.Companion.getSrcOver-0nO6VwU();
/*      */     
/*      */     public final int getDefaultBlendMode-0nO6VwU() {
/*      */       return DefaultBlendMode;
/*      */     }
/*      */     
/*      */     private static final int DefaultFilterQuality = FilterQuality.Companion.getLow-f-v9h1I();
/*      */     
/*      */     public final int getDefaultFilterQuality-f-v9h1I() {
/*      */       return DefaultFilterQuality;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\DrawScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */