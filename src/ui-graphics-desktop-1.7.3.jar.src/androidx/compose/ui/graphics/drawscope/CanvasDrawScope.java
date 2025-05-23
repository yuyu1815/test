/*     */ package androidx.compose.ui.graphics.drawscope;
/*     */ 
/*     */ import androidx.annotation.FloatRange;
/*     */ import androidx.compose.ui.geometry.CornerRadius;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.BlendMode;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorFilter;
/*     */ import androidx.compose.ui.graphics.FilterQuality;
/*     */ import androidx.compose.ui.graphics.ImageBitmap;
/*     */ import androidx.compose.ui.graphics.Paint;
/*     */ import androidx.compose.ui.graphics.PaintingStyle;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.PathEffect;
/*     */ import androidx.compose.ui.graphics.SkiaBackedPaint_skikoKt;
/*     */ import androidx.compose.ui.graphics.StrokeCap;
/*     */ import androidx.compose.ui.graphics.StrokeJoin;
/*     */ import androidx.compose.ui.graphics.layer.GraphicsLayer;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Ö\001\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\030\002\n\002\b\r\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\024\n\002\030\002\n\002\b\006\n\002\020 \n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\r\030\0002\0020\001:\002\001B\005¢\006\002\020\002JJ\020\031\032\0020\0212\b\020\032\032\004\030\0010\0332\006\020\034\032\0020\0352\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"2\b\b\002\020#\032\0020$H\002ø\001\000¢\006\004\b%\020&JH\020\031\032\0020\0212\006\020'\032\0020(2\006\020\034\032\0020\0352\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"2\b\b\002\020#\032\0020$H\002ø\001\000¢\006\004\b)\020*Jl\020+\032\0020\0212\b\020\032\032\004\030\0010\0332\006\020,\032\0020\0042\006\020-\032\0020\0042\006\020.\032\0020/2\006\0200\032\002012\b\0202\032\004\030\001032\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"2\b\b\002\020#\032\0020$H\002ø\001\000¢\006\004\b4\0205Jj\020+\032\0020\0212\006\020'\032\0020(2\006\020,\032\0020\0042\006\020-\032\0020\0042\006\020.\032\0020/2\006\0200\032\002012\b\0202\032\004\030\001032\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"2\b\b\002\020#\032\0020$H\002ø\001\000¢\006\004\b6\0207JO\0208\032\002092\006\020\003\032\0020:2\006\020\024\032\0020\0252\006\020;\032\0020<2\006\020=\032\0020>2\027\020?\032\023\022\004\022\0020\001\022\004\022\002090@¢\006\002\bAH\bø\001\001ø\001\000¢\006\004\bB\020CJf\020D\032\002092\006\020\032\032\0020\0332\006\020E\032\0020\0042\006\020F\032\0020\0042\006\020G\032\0020H2\006\020I\032\0020J2\006\020=\032\0020>2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bK\020LJf\020D\032\002092\006\020'\032\0020(2\006\020E\032\0020\0042\006\020F\032\0020\0042\006\020G\032\0020H2\006\020I\032\0020J2\006\020=\032\0020>2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bM\020NJN\020O\032\002092\006\020\032\032\0020\0332\006\020P\032\0020\0042\006\020Q\032\0020J2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bR\020SJN\020O\032\002092\006\020'\032\0020(2\006\020P\032\0020\0042\006\020Q\032\0020J2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bT\020UJF\020V\032\002092\006\020W\032\0020X2\006\020I\032\0020J2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bY\020ZJ^\020V\032\002092\006\020W\032\0020X2\006\020[\032\0020\\2\006\020]\032\0020^2\006\020_\032\0020\\2\006\020`\032\0020^2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\027ø\001\000¢\006\004\ba\020bJf\020V\032\002092\006\020W\032\0020X2\006\020[\032\0020\\2\006\020]\032\0020^2\006\020_\032\0020\\2\006\020`\032\0020^2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"2\006\020#\032\0020$H\026ø\001\000¢\006\004\bc\020dJ`\020e\032\002092\006\020\032\032\0020\0332\006\020f\032\0020J2\006\020g\032\0020J2\006\020,\032\0020\0042\006\020.\032\0020/2\b\0202\032\004\030\001032\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bh\020iJ`\020e\032\002092\006\020'\032\0020(2\006\020f\032\0020J2\006\020g\032\0020J2\006\020,\032\0020\0042\006\020.\032\0020/2\b\0202\032\004\030\001032\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bj\020kJN\020l\032\002092\006\020\032\032\0020\0332\006\020I\032\0020J2\006\020=\032\0020>2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bm\020nJN\020l\032\002092\006\020'\032\0020(2\006\020I\032\0020J2\006\020=\032\0020>2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bo\020pJF\020q\032\002092\006\020r\032\0020s2\006\020\032\032\0020\0332\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bt\020uJF\020q\032\002092\006\020r\032\0020s2\006\020'\032\0020(2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\bv\020wJf\020x\032\002092\f\020y\032\b\022\004\022\0020J0z2\006\020{\032\0020|2\006\020\032\032\0020\0332\006\020,\032\0020\0042\006\020.\032\0020/2\b\0202\032\004\030\001032\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\004\b}\020~Jg\020x\032\002092\f\020y\032\b\022\004\022\0020J0z2\006\020{\032\0020|2\006\020'\032\0020(2\006\020,\032\0020\0042\006\020.\032\0020/2\b\0202\032\004\030\001032\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\005\b\020\001JP\020\001\032\002092\006\020\032\032\0020\0332\006\020I\032\0020J2\006\020=\032\0020>2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\005\b\001\020nJP\020\001\032\002092\006\020'\032\0020(2\006\020I\032\0020J2\006\020=\032\0020>2\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\005\b\001\020pJ[\020\001\032\002092\006\020\032\032\0020\0332\006\020I\032\0020J2\006\020=\032\0020>2\b\020\001\032\0030\0012\b\b\001\020\036\032\0020\0042\006\020\034\032\0020\0352\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\006\b\001\020\001J[\020\001\032\002092\006\020'\032\0020(2\006\020I\032\0020J2\006\020=\032\0020>2\b\020\001\032\0030\0012\006\020\034\032\0020\0352\b\b\001\020\036\032\0020\0042\b\020\037\032\004\030\0010 2\006\020!\032\0020\"H\026ø\001\000¢\006\006\b\001\020\001J\t\020\001\032\0020\021H\002J\t\020\001\032\0020\021H\002J\022\020\001\032\0020\0212\007\020\001\032\0020\035H\002J!\020\001\032\0020(*\0020(2\006\020\036\032\0020\004H\002ø\001\000¢\006\006\b\001\020\001R\024\020\003\032\0020\0048VX\004¢\006\006\032\004\b\005\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\034\020\013\032\0020\f8\000X\004¢\006\016\n\000\022\004\b\r\020\002\032\004\b\016\020\017R\020\020\020\032\004\030\0010\021X\016¢\006\002\n\000R\024\020\022\032\0020\0048VX\004¢\006\006\032\004\b\023\020\006R\024\020\024\032\0020\0258VX\004¢\006\006\032\004\b\026\020\027R\020\020\030\032\004\030\0010\021X\016¢\006\002\n\000\002\016\n\005\b¡\0360\001\n\005\b20\001¨\006\001"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "()V", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "strokePaint", "configurePaint", "brush", "Landroidx/compose/ui/graphics/Brush;", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "alpha", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "color", "Landroidx/compose/ui/graphics/Color;", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "strokeWidth", "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "draw", "", "Landroidx/compose/ui/unit/Density;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "obtainFillPaint", "obtainStrokePaint", "selectPaint", "drawStyle", "modulate", "modulate-5vOe2sY", "(JF)J", "DrawParams", "ui-graphics"})
/*     */ @SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,791:1\n1#2:792\n*E\n"})
/*     */ public final class CanvasDrawScope
/*     */   implements DrawScope
/*     */ {
/*     */   @NotNull
/*  54 */   private final DrawParams drawParams = new DrawParams(null, null, null, 0L, 15, null); @NotNull public final DrawParams getDrawParams() { return this.drawParams; }
/*     */    @NotNull
/*     */   public LayoutDirection getLayoutDirection() {
/*  57 */     return this.drawParams.getLayoutDirection();
/*     */   }
/*     */   public float getDensity() {
/*  60 */     return this.drawParams.getDensity().getDensity();
/*     */   }
/*     */   public float getFontScale() {
/*  63 */     return this.drawParams.getDensity().getFontScale();
/*     */   } @NotNull
/*  65 */   private final DrawContext drawContext = new CanvasDrawScope$drawContext$1(); @Nullable private Paint fillPaint; @Nullable private Paint strokePaint; @NotNull public DrawContext getDrawContext() { return this.drawContext; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000;\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R$\020\004\032\0020\0032\006\020\002\032\0020\0038V@VX\016¢\006\f\032\004\b\005\020\006\"\004\b\007\020\bR$\020\n\032\0020\t2\006\020\002\032\0020\t8V@VX\016¢\006\f\032\004\b\013\020\f\"\004\b\r\020\016R\034\020\017\032\004\030\0010\020X\016¢\006\016\n\000\032\004\b\021\020\022\"\004\b\023\020\024R$\020\026\032\0020\0252\006\020\002\032\0020\0258V@VX\016¢\006\f\032\004\b\027\020\030\"\004\b\031\020\032R*\020\034\032\0020\0332\006\020\002\032\0020\0338V@VX\016ø\001\000ø\001\001¢\006\f\032\004\b\035\020\036\"\004\b\037\020 R\024\020!\032\0020\"X\004¢\006\b\n\000\032\004\b#\020$\002\013\n\005\b¡\0360\001\n\002\b!¨\006%"}, d2 = {"androidx/compose/ui/graphics/drawscope/CanvasDrawScope$drawContext$1", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "value", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "graphicsLayer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "getGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "setGraphicsLayer", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/geometry/Size;", "size", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "transform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "getTransform", "()Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "ui-graphics"})
/*     */   public static final class CanvasDrawScope$drawContext$1 implements DrawContext { @NotNull
/*  67 */     public Canvas getCanvas() { return CanvasDrawScope.this.getDrawParams().getCanvas(); } public void setCanvas(@NotNull Canvas value) {
/*  68 */       Intrinsics.checkNotNullParameter(value, "value"); CanvasDrawScope.this.getDrawParams().setCanvas(value);
/*     */     }
/*     */     public long getSize-NH-jbRc() {
/*  71 */       return CanvasDrawScope.this.getDrawParams().getSize-NH-jbRc();
/*     */     } public void setSize-uvyYCjk(long value) {
/*  73 */       CanvasDrawScope.this.getDrawParams().setSize-uvyYCjk(value);
/*     */     }
/*     */     @NotNull
/*  76 */     private final DrawTransform transform = CanvasDrawScopeKt.access$asDrawTransform(this); @Nullable private GraphicsLayer graphicsLayer; @NotNull public DrawTransform getTransform() { return this.transform; }
/*     */     
/*     */     @NotNull
/*  79 */     public LayoutDirection getLayoutDirection() { return CanvasDrawScope.this.getDrawParams().getLayoutDirection(); }
/*  80 */     public void setLayoutDirection(@NotNull LayoutDirection value) { Intrinsics.checkNotNullParameter(value, "value"); CanvasDrawScope.this.getDrawParams().setLayoutDirection(value); }
/*     */     @NotNull
/*  82 */     public Density getDensity() { return CanvasDrawScope.this.getDrawParams().getDensity(); }
/*  83 */     public void setDensity(@NotNull Density value) { Intrinsics.checkNotNullParameter(value, "value"); CanvasDrawScope.this.getDrawParams().setDensity(value); }
/*     */     @Nullable
/*  85 */     public GraphicsLayer getGraphicsLayer() { return this.graphicsLayer; } public void setGraphicsLayer(@Nullable GraphicsLayer <set-?>) { this.graphicsLayer = <set-?>; }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawLine-1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
/* 115 */     Intrinsics.checkNotNullParameter(brush, "brush"); this.drawParams.getCanvas().drawLine-Wko1d7g(
/* 116 */         start, 
/* 117 */         end, 
/* 118 */         configureStrokePaint-ho4zsrM$default(this, 
/* 119 */           brush, 
/* 120 */           strokeWidth, 
/* 121 */           4.0F, 
/* 122 */           cap, 
/* 123 */           StrokeJoin.Companion.getMiter-LxFBmk8(), 
/* 124 */           pathEffect, 
/* 125 */           alpha, 
/* 126 */           colorFilter, 
/* 127 */           blendMode, 0, 512, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawLine-NGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
/* 144 */     this.drawParams.getCanvas().drawLine-Wko1d7g(
/* 145 */         start, 
/* 146 */         end, 
/* 147 */         configureStrokePaint-Q_0CZUI$default(this, 
/* 148 */           color, 
/* 149 */           strokeWidth, 
/* 150 */           4.0F, 
/* 151 */           cap, 
/* 152 */           StrokeJoin.Companion.getMiter-LxFBmk8(), 
/* 153 */           pathEffect, 
/* 154 */           alpha, 
/* 155 */           colorFilter, 
/* 156 */           blendMode, 0, 512, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawRect-AsUm42w(@NotNull Brush brush, long topLeft, long size, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 171 */     Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawRect(
/* 172 */         Offset.getX-impl(topLeft), 
/* 173 */         Offset.getY-impl(topLeft), 
/* 174 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 175 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 176 */         configurePaint-swdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawRect-n-J9OG0(long color, long topLeft, long size, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 190 */     Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawRect(
/* 191 */         Offset.getX-impl(topLeft), 
/* 192 */         Offset.getY-impl(topLeft), 
/* 193 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 194 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 195 */         configurePaint-2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawImage-gbVJVH8(@NotNull ImageBitmap image, long topLeft, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 208 */     Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawImage-d-4ec7I(
/* 209 */         image, 
/* 210 */         topLeft, 
/* 211 */         configurePaint-swdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawImage-AZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
/* 260 */     Intrinsics.checkNotNullParameter(image, "image"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawImageRect-HPBpro0(
/* 261 */         image, 
/* 262 */         srcOffset, 
/* 263 */         srcSize, 
/* 264 */         dstOffset, 
/* 265 */         dstSize, 
/* 266 */         configurePaint-swdJneE(null, style, alpha, colorFilter, blendMode, filterQuality));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawRoundRect-ZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 281 */     Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawRoundRect(
/* 282 */         Offset.getX-impl(topLeft), 
/* 283 */         Offset.getY-impl(topLeft), 
/* 284 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 285 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 286 */         CornerRadius.getX-impl(cornerRadius), 
/* 287 */         CornerRadius.getY-impl(cornerRadius), 
/* 288 */         configurePaint-swdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawRoundRect-u-Aw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
/* 303 */     Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawRoundRect(
/* 304 */         Offset.getX-impl(topLeft), 
/* 305 */         Offset.getY-impl(topLeft), 
/* 306 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 307 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 308 */         CornerRadius.getX-impl(cornerRadius), 
/* 309 */         CornerRadius.getY-impl(cornerRadius), 
/* 310 */         configurePaint-2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawCircle-V9BoPsw(@NotNull Brush brush, float radius, long center, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 324 */     Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawCircle-9KIMszo(
/* 325 */         center, 
/* 326 */         radius, 
/* 327 */         configurePaint-swdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawCircle-VaOC9Bg(long color, float radius, long center, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 341 */     Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawCircle-9KIMszo(
/* 342 */         center, 
/* 343 */         radius, 
/* 344 */         configurePaint-2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawOval-AsUm42w(@NotNull Brush brush, long topLeft, long size, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 358 */     Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawOval(
/* 359 */         Offset.getX-impl(topLeft), 
/* 360 */         Offset.getY-impl(topLeft), 
/* 361 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 362 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 363 */         configurePaint-swdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawOval-n-J9OG0(long color, long topLeft, long size, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 377 */     Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawOval(
/* 378 */         Offset.getX-impl(topLeft), 
/* 379 */         Offset.getY-impl(topLeft), 
/* 380 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 381 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 382 */         configurePaint-2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawArc-illE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 399 */     Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawArc(
/* 400 */         Offset.getX-impl(topLeft), 
/* 401 */         Offset.getY-impl(topLeft), 
/* 402 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 403 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 404 */         startAngle, 
/* 405 */         sweepAngle, 
/* 406 */         useCenter, 
/* 407 */         configurePaint-swdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawArc-yD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 424 */     Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawArc(
/* 425 */         Offset.getX-impl(topLeft), 
/* 426 */         Offset.getY-impl(topLeft), 
/* 427 */         Offset.getX-impl(topLeft) + Size.getWidth-impl(size), 
/* 428 */         Offset.getY-impl(topLeft) + Size.getHeight-impl(size), 
/* 429 */         startAngle, 
/* 430 */         sweepAngle, 
/* 431 */         useCenter, 
/* 432 */         configurePaint-2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawPath-LG529CI(@NotNull Path path, long color, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 445 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawPath(
/* 446 */         path, 
/* 447 */         configurePaint-2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawPath-GBMwjPU(@NotNull Path path, @NotNull Brush brush, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode) {
/* 460 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(brush, "brush"); Intrinsics.checkNotNullParameter(style, "style"); this.drawParams.getCanvas().drawPath(
/* 461 */         path, 
/* 462 */         configurePaint-swdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawPoints-F8ZwMP8(@NotNull List points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
/* 478 */     Intrinsics.checkNotNullParameter(points, "points"); this.drawParams.getCanvas().drawPoints-O7TthRY(
/* 479 */         pointMode, 
/* 480 */         points, 
/* 481 */         configureStrokePaint-Q_0CZUI$default(this, 
/* 482 */           color, 
/* 483 */           strokeWidth, 
/* 484 */           4.0F, 
/* 485 */           cap, 
/* 486 */           StrokeJoin.Companion.getMiter-LxFBmk8(), 
/* 487 */           pathEffect, 
/* 488 */           alpha, 
/* 489 */           colorFilter, 
/* 490 */           blendMode, 0, 512, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void drawPoints-Gsft0Ws(@NotNull List points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = 0.0D, to = 1.0D) float alpha, @Nullable ColorFilter colorFilter, int blendMode) {
/* 507 */     Intrinsics.checkNotNullParameter(points, "points"); Intrinsics.checkNotNullParameter(brush, "brush"); this.drawParams.getCanvas().drawPoints-O7TthRY(
/* 508 */         pointMode, 
/* 509 */         points, 
/* 510 */         configureStrokePaint-ho4zsrM$default(this, 
/* 511 */           brush, 
/* 512 */           strokeWidth, 
/* 513 */           4.0F, 
/* 514 */           cap, 
/* 515 */           StrokeJoin.Companion.getMiter-LxFBmk8(), 
/* 516 */           pathEffect, 
/* 517 */           alpha, 
/* 518 */           colorFilter, 
/* 519 */           blendMode, 0, 512, null));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void draw-yzxVdVo(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long size, @NotNull Function1 block) {
/* 546 */     Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(canvas, "canvas"); Intrinsics.checkNotNullParameter(block, "block"); int $i$f$draw-yzxVdVo = 0; DrawParams drawParams1 = getDrawParams(); Density prevDensity = drawParams1.component1(); LayoutDirection prevLayoutDirection = drawParams1.component2(); Canvas prevCanvas = drawParams1.component3(); long prevSize = drawParams1.component4-NH-jbRc();
/* 547 */     DrawParams drawParams2 = getDrawParams(), $this$draw_yzxVdVo_u24lambda_u240 = drawParams2; int $i$a$-apply-CanvasDrawScope$draw$1 = 0;
/* 548 */     $this$draw_yzxVdVo_u24lambda_u240.setDensity(density);
/* 549 */     $this$draw_yzxVdVo_u24lambda_u240.setLayoutDirection(layoutDirection);
/* 550 */     $this$draw_yzxVdVo_u24lambda_u240.setCanvas(canvas);
/* 551 */     $this$draw_yzxVdVo_u24lambda_u240.setSize-uvyYCjk(size);
/*     */     
/* 553 */     canvas.save();
/* 554 */     block.invoke(this);
/* 555 */     canvas.restore();
/* 556 */     DrawParams $this$draw_yzxVdVo_u24lambda_u241 = drawParams2 = getDrawParams(); int $i$a$-apply-CanvasDrawScope$draw$2 = 0;
/* 557 */     $this$draw_yzxVdVo_u24lambda_u241.setDensity(prevDensity);
/* 558 */     $this$draw_yzxVdVo_u24lambda_u241.setLayoutDirection(prevLayoutDirection);
/* 559 */     $this$draw_yzxVdVo_u24lambda_u241.setCanvas(prevCanvas);
/* 560 */     $this$draw_yzxVdVo_u24lambda_u241.setSize-uvyYCjk(prevSize);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Paint obtainFillPaint() {
/* 576 */     if (this.fillPaint == null) { Paint paint1 = SkiaBackedPaint_skikoKt.Paint(), $this$obtainFillPaint_u24lambda_u242 = paint1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 792 */       int $i$a$-apply-CanvasDrawScope$obtainFillPaint$1 = 0; $this$obtainFillPaint_u24lambda_u242.setStyle-k9PVt8s(PaintingStyle.Companion.getFill-TiuSbCo()); Paint it = paint1 = paint1; int $i$a$-also-CanvasDrawScope$obtainFillPaint$2 = 0; this.fillPaint = it; }  return paint1; } private final Paint obtainStrokePaint() { if (this.strokePaint == null) { Paint paint1 = SkiaBackedPaint_skikoKt.Paint(), $this$obtainStrokePaint_u24lambda_u244 = paint1; int $i$a$-apply-CanvasDrawScope$obtainStrokePaint$1 = 0;
/*     */       $this$obtainStrokePaint_u24lambda_u244.setStyle-k9PVt8s(PaintingStyle.Companion.getStroke-TiuSbCo());
/*     */       Paint it = paint1 = paint1;
/*     */       int $i$a$-also-CanvasDrawScope$obtainStrokePaint$2 = 0;
/*     */       this.strokePaint = it; }
/*     */     
/*     */     return paint1; }
/*     */ 
/*     */   
/*     */   private final Paint selectPaint(DrawStyle drawStyle) {
/*     */     DrawStyle drawStyle1 = drawStyle;
/*     */     if (drawStyle1 instanceof Stroke) {
/*     */       Paint paint1 = obtainStrokePaint();
/*     */       Paint $this$selectPaint_u24lambda_u246 = paint1;
/*     */       int $i$a$-apply-CanvasDrawScope$selectPaint$1 = 0;
/*     */       if (!(($this$selectPaint_u24lambda_u246.getStrokeWidth() == ((Stroke)drawStyle).getWidth()) ? 1 : 0))
/*     */         $this$selectPaint_u24lambda_u246.setStrokeWidth(((Stroke)drawStyle).getWidth()); 
/*     */       if (!StrokeCap.equals-impl0($this$selectPaint_u24lambda_u246.getStrokeCap-KaPHkGw(), ((Stroke)drawStyle).getCap-KaPHkGw()))
/*     */         $this$selectPaint_u24lambda_u246.setStrokeCap-BeK7IIE(((Stroke)drawStyle).getCap-KaPHkGw()); 
/*     */       if (!(($this$selectPaint_u24lambda_u246.getStrokeMiterLimit() == ((Stroke)drawStyle).getMiter()) ? 1 : 0))
/*     */         $this$selectPaint_u24lambda_u246.setStrokeMiterLimit(((Stroke)drawStyle).getMiter()); 
/*     */       if (!StrokeJoin.equals-impl0($this$selectPaint_u24lambda_u246.getStrokeJoin-LxFBmk8(), ((Stroke)drawStyle).getJoin-LxFBmk8()))
/*     */         $this$selectPaint_u24lambda_u246.setStrokeJoin-Ww9F2mQ(((Stroke)drawStyle).getJoin-LxFBmk8()); 
/*     */       if (!Intrinsics.areEqual($this$selectPaint_u24lambda_u246.getPathEffect(), ((Stroke)drawStyle).getPathEffect()))
/*     */         $this$selectPaint_u24lambda_u246.setPathEffect(((Stroke)drawStyle).getPathEffect()); 
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return Intrinsics.areEqual(drawStyle1, Fill.INSTANCE) ? obtainFillPaint() : (Paint)"JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   private final Paint configurePaint-swdJneE(Brush brush, DrawStyle style, @FloatRange(from = 0.0D, to = 1.0D) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
/*     */     Paint paint1 = selectPaint(style), $this$configurePaint_swdJneE_u24lambda_u247 = paint1;
/*     */     int $i$a$-apply-CanvasDrawScope$configurePaint$1 = 0;
/*     */     if (brush != null) {
/*     */       brush.applyTo-Pq9zytI(getSize-NH-jbRc(), $this$configurePaint_swdJneE_u24lambda_u247, alpha);
/*     */     } else {
/*     */       if ($this$configurePaint_swdJneE_u24lambda_u247.getShader() != null)
/*     */         $this$configurePaint_swdJneE_u24lambda_u247.setShader(null); 
/*     */       if (!Color.equals-impl0($this$configurePaint_swdJneE_u24lambda_u247.getColor-0d7_KjU(), Color.Companion.getBlack-0d7_KjU()))
/*     */         $this$configurePaint_swdJneE_u24lambda_u247.setColor-8_81llA(Color.Companion.getBlack-0d7_KjU()); 
/*     */       if (!(($this$configurePaint_swdJneE_u24lambda_u247.getAlpha() == alpha) ? 1 : 0))
/*     */         $this$configurePaint_swdJneE_u24lambda_u247.setAlpha(alpha); 
/*     */     } 
/*     */     if (!Intrinsics.areEqual($this$configurePaint_swdJneE_u24lambda_u247.getColorFilter(), colorFilter))
/*     */       $this$configurePaint_swdJneE_u24lambda_u247.setColorFilter(colorFilter); 
/*     */     if (!BlendMode.equals-impl0($this$configurePaint_swdJneE_u24lambda_u247.getBlendMode-0nO6VwU(), blendMode))
/*     */       $this$configurePaint_swdJneE_u24lambda_u247.setBlendMode-s9anfk8(blendMode); 
/*     */     if (!FilterQuality.equals-impl0($this$configurePaint_swdJneE_u24lambda_u247.getFilterQuality-f-v9h1I(), filterQuality))
/*     */       $this$configurePaint_swdJneE_u24lambda_u247.setFilterQuality-vDHp3xo(filterQuality); 
/*     */     return paint1;
/*     */   }
/*     */   
/*     */   private final Paint configurePaint-2qPWKa0(long color, DrawStyle style, @FloatRange(from = 0.0D, to = 1.0D) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
/*     */     Paint paint1 = selectPaint(style), $this$configurePaint_2qPWKa0_u24lambda_u248 = paint1;
/*     */     int $i$a$-apply-CanvasDrawScope$configurePaint$2 = 0;
/*     */     long targetColor = modulate-5vOe2sY(color, alpha);
/*     */     if (!Color.equals-impl0($this$configurePaint_2qPWKa0_u24lambda_u248.getColor-0d7_KjU(), targetColor))
/*     */       $this$configurePaint_2qPWKa0_u24lambda_u248.setColor-8_81llA(targetColor); 
/*     */     if ($this$configurePaint_2qPWKa0_u24lambda_u248.getShader() != null)
/*     */       $this$configurePaint_2qPWKa0_u24lambda_u248.setShader(null); 
/*     */     if (!Intrinsics.areEqual($this$configurePaint_2qPWKa0_u24lambda_u248.getColorFilter(), colorFilter))
/*     */       $this$configurePaint_2qPWKa0_u24lambda_u248.setColorFilter(colorFilter); 
/*     */     if (!BlendMode.equals-impl0($this$configurePaint_2qPWKa0_u24lambda_u248.getBlendMode-0nO6VwU(), blendMode))
/*     */       $this$configurePaint_2qPWKa0_u24lambda_u248.setBlendMode-s9anfk8(blendMode); 
/*     */     if (!FilterQuality.equals-impl0($this$configurePaint_2qPWKa0_u24lambda_u248.getFilterQuality-f-v9h1I(), filterQuality))
/*     */       $this$configurePaint_2qPWKa0_u24lambda_u248.setFilterQuality-vDHp3xo(filterQuality); 
/*     */     return paint1;
/*     */   }
/*     */   
/*     */   private final Paint configureStrokePaint-Q_0CZUI(long color, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, @FloatRange(from = 0.0D, to = 1.0D) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
/*     */     Paint paint1 = obtainStrokePaint(), $this$configureStrokePaint_Q_0CZUI_u24lambda_u249 = paint1;
/*     */     int $i$a$-apply-CanvasDrawScope$configureStrokePaint$1 = 0;
/*     */     long targetColor = modulate-5vOe2sY(color, alpha);
/*     */     if (!Color.equals-impl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getColor-0d7_KjU(), targetColor))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setColor-8_81llA(targetColor); 
/*     */     if ($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getShader() != null)
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setShader(null); 
/*     */     if (!Intrinsics.areEqual($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getColorFilter(), colorFilter))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setColorFilter(colorFilter); 
/*     */     if (!BlendMode.equals-impl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getBlendMode-0nO6VwU(), blendMode))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setBlendMode-s9anfk8(blendMode); 
/*     */     if (!(($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getStrokeWidth() == strokeWidth) ? 1 : 0))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setStrokeWidth(strokeWidth); 
/*     */     if (!(($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getStrokeMiterLimit() == miter) ? 1 : 0))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setStrokeMiterLimit(miter); 
/*     */     if (!StrokeCap.equals-impl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getStrokeCap-KaPHkGw(), cap))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setStrokeCap-BeK7IIE(cap); 
/*     */     if (!StrokeJoin.equals-impl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getStrokeJoin-LxFBmk8(), join))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setStrokeJoin-Ww9F2mQ(join); 
/*     */     if (!Intrinsics.areEqual($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getPathEffect(), pathEffect))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setPathEffect(pathEffect); 
/*     */     if (!FilterQuality.equals-impl0($this$configureStrokePaint_Q_0CZUI_u24lambda_u249.getFilterQuality-f-v9h1I(), filterQuality))
/*     */       $this$configureStrokePaint_Q_0CZUI_u24lambda_u249.setFilterQuality-vDHp3xo(filterQuality); 
/*     */     return paint1;
/*     */   }
/*     */   
/*     */   private final Paint configureStrokePaint-ho4zsrM(Brush brush, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, @FloatRange(from = 0.0D, to = 1.0D) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
/*     */     Paint paint1 = obtainStrokePaint(), $this$configureStrokePaint_ho4zsrM_u24lambda_u2410 = paint1;
/*     */     int $i$a$-apply-CanvasDrawScope$configureStrokePaint$2 = 0;
/*     */     if (brush != null) {
/*     */       brush.applyTo-Pq9zytI(getSize-NH-jbRc(), $this$configureStrokePaint_ho4zsrM_u24lambda_u2410, alpha);
/*     */     } else if (!(($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getAlpha() == alpha) ? 1 : 0)) {
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setAlpha(alpha);
/*     */     } 
/*     */     if (!Intrinsics.areEqual($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getColorFilter(), colorFilter))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setColorFilter(colorFilter); 
/*     */     if (!BlendMode.equals-impl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getBlendMode-0nO6VwU(), blendMode))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setBlendMode-s9anfk8(blendMode); 
/*     */     if (!(($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getStrokeWidth() == strokeWidth) ? 1 : 0))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setStrokeWidth(strokeWidth); 
/*     */     if (!(($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getStrokeMiterLimit() == miter) ? 1 : 0))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setStrokeMiterLimit(miter); 
/*     */     if (!StrokeCap.equals-impl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getStrokeCap-KaPHkGw(), cap))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setStrokeCap-BeK7IIE(cap); 
/*     */     if (!StrokeJoin.equals-impl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getStrokeJoin-LxFBmk8(), join))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setStrokeJoin-Ww9F2mQ(join); 
/*     */     if (!Intrinsics.areEqual($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getPathEffect(), pathEffect))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setPathEffect(pathEffect); 
/*     */     if (!FilterQuality.equals-impl0($this$configureStrokePaint_ho4zsrM_u24lambda_u2410.getFilterQuality-f-v9h1I(), filterQuality))
/*     */       $this$configureStrokePaint_ho4zsrM_u24lambda_u2410.setFilterQuality-vDHp3xo(filterQuality); 
/*     */     return paint1;
/*     */   }
/*     */   
/*     */   private final long modulate-5vOe2sY(long $this$modulate_u2d5vOe2sY, float alpha) {
/*     */     return !((alpha == 1.0F) ? 1 : 0) ? Color.copy-wmQWz5c$default($this$modulate_u2d5vOe2sY, Color.getAlpha-impl($this$modulate_u2d5vOe2sY) * alpha, 0.0F, 0.0F, 0.0F, 14, null) : $this$modulate_u2d5vOe2sY;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\033\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B-\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ\t\020\034\032\0020\003HÆ\003J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\007HÆ\003J\026\020\037\032\0020\tHÆ\003ø\001\001ø\001\000¢\006\004\b \020\030J;\020!\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001ø\001\000¢\006\004\b\"\020#J\023\020$\032\0020%2\b\020&\032\004\030\0010\001HÖ\003J\t\020'\032\0020(HÖ\001J\t\020)\032\0020*HÖ\001R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\013\020\f\"\004\b\r\020\016R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\017\020\020\"\004\b\021\020\022R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\023\020\024\"\004\b\025\020\026R\"\020\b\032\0020\tX\016ø\001\000ø\001\001¢\006\020\n\002\020\033\032\004\b\027\020\030\"\004\b\031\020\032\002\013\n\005\b¡\0360\001\n\002\b!¨\006+"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "component1", "component2", "component3", "component4", "component4-NH-jbRc", "copy", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics"})
/*     */   @PublishedApi
/*     */   public static final class DrawParams {
/*     */     @NotNull
/*     */     private Density density;
/*     */     @NotNull
/*     */     private LayoutDirection layoutDirection;
/*     */     @NotNull
/*     */     private Canvas canvas;
/*     */     private long size;
/*     */     
/*     */     private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long size) {
/*     */       this.density = density;
/*     */       this.layoutDirection = layoutDirection;
/*     */       this.canvas = canvas;
/*     */       this.size = size;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Density getDensity() {
/*     */       return this.density;
/*     */     }
/*     */     
/*     */     public final void setDensity(@NotNull Density <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.density = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LayoutDirection getLayoutDirection() {
/*     */       return this.layoutDirection;
/*     */     }
/*     */     
/*     */     public final void setLayoutDirection(@NotNull LayoutDirection <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.layoutDirection = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Canvas getCanvas() {
/*     */       return this.canvas;
/*     */     }
/*     */     
/*     */     public final void setCanvas(@NotNull Canvas <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       this.canvas = <set-?>;
/*     */     }
/*     */     
/*     */     public final long getSize-NH-jbRc() {
/*     */       return this.size;
/*     */     }
/*     */     
/*     */     public final void setSize-uvyYCjk(long <set-?>) {
/*     */       this.size = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Density component1() {
/*     */       return this.density;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final LayoutDirection component2() {
/*     */       return this.layoutDirection;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Canvas component3() {
/*     */       return this.canvas;
/*     */     }
/*     */     
/*     */     public final long component4-NH-jbRc() {
/*     */       return this.size;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final DrawParams copy-Ug5Nnss(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull Canvas canvas, long size) {
/*     */       Intrinsics.checkNotNullParameter(density, "density");
/*     */       Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
/*     */       Intrinsics.checkNotNullParameter(canvas, "canvas");
/*     */       return new DrawParams(density, layoutDirection, canvas, size, null);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + Size.toString-impl(this.size) + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.density.hashCode();
/*     */       result = result * 31 + this.layoutDirection.hashCode();
/*     */       result = result * 31 + this.canvas.hashCode();
/*     */       return result * 31 + Size.hashCode-impl(this.size);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof DrawParams))
/*     */         return false; 
/*     */       DrawParams drawParams = (DrawParams)other;
/*     */       return !Intrinsics.areEqual(this.density, drawParams.density) ? false : ((this.layoutDirection != drawParams.layoutDirection) ? false : (!Intrinsics.areEqual(this.canvas, drawParams.canvas) ? false : (!!Size.equals-impl0(this.size, drawParams.size))));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-graphics-desktop-1.7.3.jar!\androidx\compos\\ui\graphics\drawscope\CanvasDrawScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */