/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Canvas;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.SkiaBackedCanvas_skikoKt;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.platform.ParagraphLayouter;
/*     */ import androidx.compose.ui.text.platform.SkiaParagraphIntrinsics;
/*     */ import androidx.compose.ui.text.platform.SkiaParagraph_skikoKt;
/*     */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*     */ import androidx.compose.ui.text.style.TextAlign;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import java.util.Collection;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.FontMetrics;
/*     */ import org.jetbrains.skia.Rect;
/*     */ import org.jetbrains.skia.paragraph.Direction;
/*     */ import org.jetbrains.skia.paragraph.LineMetrics;
/*     */ import org.jetbrains.skia.paragraph.Paragraph;
/*     */ import org.jetbrains.skia.paragraph.RectHeightMode;
/*     */ import org.jetbrains.skia.paragraph.RectWidthMode;
/*     */ import org.jetbrains.skia.paragraph.TextBox;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Ö\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\006\n\002\020\016\n\000\n\002\020\007\n\002\b\007\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\004\n\002\020 \n\002\030\002\n\002\b\b\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\020\024\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\032\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\b\000\030\0002\0020\001B%\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nJ\021\020?\032\0020@2\006\020A\032\0020\005H\bJ*\020B\032\0020@2\006\020C\032\0020D2\006\020E\032\0020F2\006\020G\032\0020\005H\026ø\001\000¢\006\004\bH\020IJ\020\020J\032\0020\0342\006\020K\032\0020\007H\002J\020\020L\032\0020M2\006\020A\032\0020\005H\026J\020\020N\032\002072\006\020A\032\0020\005H\026J\034\020O\032\004\030\0010P2\006\020A\032\0020\0052\b\b\002\020Q\032\0020\005H\002J\022\020R\032\004\030\0010P2\006\020A\032\0020\005H\002J\020\020S\032\002072\006\020A\032\0020\005H\026J\030\020T\032\0020\0342\006\020A\032\0020\0052\006\020U\032\0020\007H\026J\025\020V\032\0020\0342\006\020W\032\0020\005H\000¢\006\002\bXJ\020\020Y\032\0020\0342\006\020W\032\0020\005H\026J\020\020Z\032\0020\0342\006\020W\032\0020\005H\026J\025\020[\032\0020\0342\006\020W\032\0020\005H\000¢\006\002\b\\J\030\020]\032\0020\0052\006\020W\032\0020\0052\006\020^\032\0020\007H\026J\020\020_\032\0020\0052\006\020A\032\0020\005H\026J\020\020`\032\0020\0052\006\020a\032\0020\034H\026J\020\020b\032\0020\0342\006\020W\032\0020\005H\026J\020\020c\032\0020\0342\006\020W\032\0020\005H\026J\022\020d\032\004\030\0010\r2\006\020a\032\0020\034H\002J\020\020e\032\0020\0342\006\020W\032\0020\005H\026J\020\020f\032\0020\0052\006\020W\032\0020\005H\026J\020\020g\032\0020\0342\006\020W\032\0020\005H\026J\020\020h\032\0020\0342\006\020W\032\0020\005H\026J\032\020i\032\0020\0052\006\020j\032\0020kH\026ø\001\000¢\006\004\bl\020mJ\020\020n\032\0020M2\006\020A\032\0020\005H\026J\030\020o\032\0020p2\006\020q\032\0020\0052\006\020Q\032\0020\005H\026J*\020r\032\0020D2\006\020s\032\002072\006\020t\032\0020u2\006\020v\032\0020wH\026ø\001\000¢\006\004\bx\020yJ\035\020z\032\0020D2\006\020A\032\0020\005H\026ø\001\001ø\001\000¢\006\004\b{\020|J\020\020}\032\0020\0072\006\020W\032\0020\005H\026J\022\020~\032\004\030\0010\r2\006\020A\032\0020\005H\002J_\020\032\0020@2\b\020\001\032\0030\0012\b\020\001\032\0030\0012\007\020\001\032\0020\0342\n\020\001\032\005\030\0010\0012\n\020\001\032\005\030\0010\0012\n\020\001\032\005\030\0010\0012\b\020\001\032\0030\001H\027ø\001\000¢\006\006\b\001\020\001J@\020\032\0020@2\b\020\001\032\0030\0012\b\020\001\032\0030\0012\n\020\001\032\005\030\0010\0012\n\020\001\032\005\030\0010\001H\026ø\001\000¢\006\006\b\001\020\001JV\020\032\0020@2\b\020\001\032\0030\0012\b\020\001\032\0030\0012\n\020\001\032\005\030\0010\0012\n\020\001\032\005\030\0010\0012\n\020\001\032\005\030\0010\0012\b\020\001\032\0030\001H\027ø\001\000¢\006\006\b\001\020\001J\024\020\001\032\b\022\004\022\0020\r0\fH\002¢\006\002\020*R\030\020\013\032\n\022\004\022\0020\r\030\0010\fX\016¢\006\004\n\002\020\016R\031\020\b\032\0020\tø\001\000ø\001\001¢\006\n\n\002\020\021\032\004\b\017\020\020R\024\020\022\032\0020\0238@X\004¢\006\006\032\004\b\024\020\025R\024\020\026\032\0020\0078VX\004¢\006\006\032\004\b\027\020\030R\016\020\031\032\0020\032X\004¢\006\002\n\000R\024\020\033\032\0020\0348VX\004¢\006\006\032\004\b\035\020\036R\024\020\037\032\0020\0348VX\004¢\006\006\032\004\b \020\036R\024\020!\032\0020\0348VX\004¢\006\006\032\004\b\"\020\036R\016\020#\032\0020$X\004¢\006\002\n\000R\024\020%\032\0020\0058VX\004¢\006\006\032\004\b&\020'R\032\020(\032\b\022\004\022\0020\r0\f8BX\004¢\006\006\032\004\b)\020*R\024\020+\032\0020\0348VX\004¢\006\006\032\004\b,\020\036R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b-\020'R\024\020.\032\0020\0348VX\004¢\006\006\032\004\b/\020\036R\036\0202\032\002012\006\0200\032\00201@BX\016¢\006\b\n\000\"\004\b3\0204R\016\020\002\032\0020\003X\004¢\006\002\n\000R\034\0205\032\n\022\006\022\004\030\00107068VX\004¢\006\006\032\004\b8\0209R\024\020:\032\0020\0328BX\004¢\006\006\032\004\b;\020<R\024\020=\032\0020\0348VX\004¢\006\006\032\004\b>\020\036\002\013\n\005\b¡\0360\001\n\002\b!¨\006\001"}, d2 = {"Landroidx/compose/ui/text/SkiaParagraph;", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/platform/SkiaParagraphIntrinsics;", "maxLines", "", "ellipsis", "", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/text/platform/SkiaParagraphIntrinsics;IZJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_lineMetrics", "", "Lorg/jetbrains/skia/paragraph/LineMetrics;", "[Lorg/jetbrains/skia/paragraph/LineMetrics;", "getConstraints-msEJaDk", "()J", "J", "defaultFont", "Lorg/jetbrains/skia/Font;", "getDefaultFont$ui_text", "()Lorg/jetbrains/skia/Font;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "ellipsisChar", "", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "layouter", "Landroidx/compose/ui/text/platform/ParagraphLayouter;", "lineCount", "getLineCount", "()I", "lineMetrics", "getLineMetrics", "()[Lorg/jetbrains/skia/paragraph/LineMetrics;", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "value", "Lorg/jetbrains/skia/paragraph/Paragraph;", "paragraph", "setParagraph", "(Lorg/jetbrains/skia/paragraph/Paragraph;)V", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "text", "getText", "()Ljava/lang/String;", "width", "getWidth", "checkOffsetIsValid", "", "offset", "fillBoundingBoxes", "range", "Landroidx/compose/ui/text/TextRange;", "array", "", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)V", "getAlignedStartingPosition", "isRtl", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBoundingBox", "getBoxBackwardByOffset", "Lorg/jetbrains/skia/paragraph/TextBox;", "end", "getBoxForwardByOffset", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineAscent", "lineIndex", "getLineAscent$ui_text", "getLineBaseline", "getLineBottom", "getLineDescent", "getLineDescent$ui_text", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineMetricsForVerticalPosition", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "lineMetricsForOffset", "paint", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "receiveLineMetrics", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nSkiaParagraph.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaParagraph.skiko.kt\nandroidx/compose/ui/text/SkiaParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 SkiaParagraph.skiko.kt\nandroidx/compose/ui/text/SkiaParagraph_skikoKt\n*L\n1#1,667:1\n582#1,4:673\n582#1,4:697\n582#1,4:701\n582#1,4:705\n1#2:668\n11065#3:669\n11400#3,3:670\n656#4,10:677\n656#4,10:687\n*S KotlinDebug\n*F\n+ 1 SkiaParagraph.skiko.kt\nandroidx/compose/ui/text/SkiaParagraph\n*L\n204#1:673,4\n311#1:697,4\n327#1:701,4\n481#1:705,4\n126#1:669\n126#1:670,3\n206#1:677,10\n250#1:687,10\n*E\n"})
/*     */ public final class SkiaParagraph implements Paragraph {
/*     */   @NotNull
/*     */   private final SkiaParagraphIntrinsics paragraphIntrinsics;
/*     */   private final int maxLines;
/*     */   private final long constraints;
/*     */   @NotNull
/*     */   private final String ellipsisChar;
/*     */   @NotNull
/*     */   private final ParagraphLayouter layouter;
/*     */   @NotNull
/*     */   private Paragraph paragraph;
/*     */   @Nullable
/*     */   private LineMetrics[] _lineMetrics;
/*     */   public static final int $stable = 8;
/*     */   
/*  51 */   private SkiaParagraph(SkiaParagraphIntrinsics paragraphIntrinsics, int maxLines, boolean ellipsis, long constraints) { this.paragraphIntrinsics = paragraphIntrinsics;
/*  52 */     this.maxLines = maxLines;
/*     */     
/*  54 */     this.constraints = constraints;
/*     */ 
/*     */     
/*  57 */     this.ellipsisChar = ellipsis ? "…" : "";
/*     */     
/*  59 */     ParagraphLayouter paragraphLayouter1 = this.paragraphIntrinsics.layouter(), paragraphLayouter2 = paragraphLayouter1; SkiaParagraph skiaParagraph = this; int $i$a$-apply-SkiaParagraph$layouter$1 = 0;
/*  60 */     paragraphLayouter2.setParagraphStyle(
/*  61 */         this.maxLines, 
/*  62 */         this.ellipsisChar);
/*     */     
/*  64 */     skiaParagraph.layouter = paragraphLayouter1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  73 */     this.paragraph = this.layouter.layoutParagraph(
/*  74 */         getWidth());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  85 */     this.layouter.setBrushSize-uvyYCjk(SizeKt.Size(getWidth(), getHeight()));
/*  86 */     setParagraph(this.layouter.layoutParagraph(getWidth()));
/*     */     
/*  88 */     this.paragraph.layout(getWidth()); } public final int getMaxLines() { return this.maxLines; }
/*     */   public final long getConstraints-msEJaDk() { return this.constraints; }
/*     */   @NotNull public final Font getDefaultFont$ui_text() { return this.layouter.getDefaultFont(); }
/*     */   private final void setParagraph(Paragraph value) { this.paragraph = value; this._lineMetrics = null; }
/*  92 */   private final String getText() { return this.paragraphIntrinsics.getText(); }
/*     */   
/*     */   public float getWidth() {
/*  95 */     return Constraints.getMaxWidth-impl(this.constraints);
/*     */   }
/*     */   public float getHeight() {
/*  98 */     return this.paragraph.getHeight();
/*     */   }
/*     */   public float getMinIntrinsicWidth() {
/* 101 */     return this.paragraphIntrinsics.getMinIntrinsicWidth();
/*     */   }
/*     */   public float getMaxIntrinsicWidth() {
/* 104 */     return this.paragraphIntrinsics.getMaxIntrinsicWidth();
/*     */   }
/*     */   
/* 107 */   public float getFirstBaseline() { LineMetrics $this$_get_firstBaseline__u24lambda_u241 = (LineMetrics)ArraysKt.firstOrNull((Object[])getLineMetrics());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 668 */     int $i$a$-run-SkiaParagraph$firstBaseline$1 = 0; (LineMetrics)ArraysKt.firstOrNull((Object[])getLineMetrics()); return ((LineMetrics)ArraysKt.firstOrNull((Object[])getLineMetrics()) != null) ? (float)$this$_get_firstBaseline__u24lambda_u241.getBaseline() : 0.0F; } public float getLastBaseline() { LineMetrics $this$_get_lastBaseline__u24lambda_u242 = (LineMetrics)ArraysKt.lastOrNull((Object[])getLineMetrics()); int $i$a$-run-SkiaParagraph$lastBaseline$1 = 0; (LineMetrics)ArraysKt.lastOrNull((Object[])getLineMetrics()); return ((LineMetrics)ArraysKt.lastOrNull((Object[])getLineMetrics()) != null) ? (float)$this$_get_lastBaseline__u24lambda_u242.getBaseline() : 0.0F; }
/* 669 */   public boolean getDidExceedMaxLines() { return this.paragraph.didExceedMaxLines(); } public int getLineCount() { return (Intrinsics.areEqual(getText(), "") || this.paragraph.getLineNumber() < 1) ? 1 : this.paragraph.getLineNumber(); } @NotNull public Path getPathForRange(int start, int end) { TextBox[] boxes = this.paragraph.getRectsForRange(start, end, RectHeightMode.MAX, RectWidthMode.TIGHT); Path path = SkiaBackedPath_skikoKt.Path(); byte b; int i; for (b = 0, i = boxes.length; b < i; ) { TextBox textBox = boxes[b]; Path.addRect$default(SkiaBackedPath_skikoKt.asSkiaPath(path), textBox.getRect(), null, 0, 6, null); b++; }  return path; } @NotNull public Rect getCursorRect(int offset) { float horizontal = getHorizontalPosition(offset, true); Intrinsics.checkNotNull(lineMetricsForOffset(offset)); LineMetrics line = lineMetricsForOffset(offset); boolean isNewEmptyLine = (offset - 1 == line.getStartIndex() && offset == getText().length()); FontMetrics metrics = getDefaultFont$ui_text().getMetrics(); double it = line.getAscent(); int $i$a$-let-SkiaParagraph$getCursorRect$asc$1 = 0; double ascent = -(metrics.getAscent()); double asc = isNewEmptyLine ? RangesKt.coerceAtMost(it, ascent) : it; double d1 = line.getDescent(); int $i$a$-let-SkiaParagraph$getCursorRect$desc$1 = 0; double descent = metrics.getDescent(); double desc = isNewEmptyLine ? RangesKt.coerceAtMost(d1, descent) : d1; return new Rect(horizontal, (float)(line.getBaseline() - asc), horizontal, (float)(line.getBaseline() + desc)); } public float getLineLeft(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getLeft() : 0.0F; } public float getLineRight(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getRight() : 0.0F; } public float getLineTop(int lineIndex) { LineMetrics line = (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); int $i$a$-let-SkiaParagraph$getLineTop$1 = 0; (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)Math.floor((float)(line.getBaseline() - line.getAscent())) : 0.0F; } @NotNull public List<Rect> getPlaceholderRects() { TextBox[] arrayOfTextBox1 = this.paragraph.getRectsForPlaceholders(); int $i$f$map = 0; TextBox[] arrayOfTextBox2 = arrayOfTextBox1; Collection<Rect> destination$iv$iv = new ArrayList(arrayOfTextBox1.length); int $i$f$mapTo = 0; byte b; int i;
/* 670 */     for (b = 0, i = arrayOfTextBox2.length; b < i; ) { Object item$iv$iv = arrayOfTextBox2[b];
/* 671 */       Object object1 = item$iv$iv; Collection<Rect> collection = destination$iv$iv; int $i$a$-map-SkiaParagraph$placeholderRects$1 = 0; collection.add(Rects_skikoKt.toComposeRect(object1.getRect())); }
/* 672 */      return (List<Rect>)destination$iv$iv; }
/* 673 */   public float getLineBottom(int lineIndex) { LineMetrics line = (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); int $i$a$-let-SkiaParagraph$getLineBottom$1 = 0; (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)Math.floor((float)(line.getBaseline() + line.getDescent())) : 0.0F; } public final float getLineAscent$ui_text(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return -(((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getAscent() : 0.0F); } public float getLineBaseline(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getBaseline() : 0.0F; } public final float getLineDescent$ui_text(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getDescent() : 0.0F; } private final LineMetrics lineMetricsForOffset(int offset) { SkiaParagraph this_$iv = this; int $i$f$checkOffsetIsValid = 0; if (!((0 <= offset) ? ((offset <= this_$iv.getText().length()) ? 1 : 0) : 0)) { int $i$a$-require-SkiaParagraph$checkOffsetIsValid$1$iv = 0; String str = 
/* 674 */         "Invalid offset: " + offset + ". Valid range is [0, " + this_$iv.getText().length() + ']';
/*     */       
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */ 
/*     */     
/*     */     LineMetrics[] arrayOfLineMetrics = getLineMetrics();
/*     */     int $i$f$binarySearchFirstMatchingOrLast = 0;
/* 681 */     int index$iv = CollectionsKt.binarySearch$default(ArraysKt.asList((Object[])arrayOfLineMetrics), 0, 0, new SkiaParagraph$lineMetricsForOffset$$inlined$binarySearchFirstMatchingOrLast$1(offset), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 686 */     return ((arrayOfLineMetrics.length == 0)) ? null : arrayOfLineMetrics[RangesKt.coerceAtMost(-index$iv - 1, ArraysKt.getLastIndex((Object[])arrayOfLineMetrics))]; } public float getLineHeight(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getHeight() : 0.0F; } public float getLineWidth(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? (float)((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getWidth() : 0.0F; } public int getLineStart(int lineIndex) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) != null) ? ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex)).getStartIndex() : 0; }
/*     */   public int getLineEnd(int lineIndex, boolean visibleEnd) { LineMetrics metrics; if ((LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex) == null) { (LineMetrics)ArraysKt.getOrNull((Object[])getLineMetrics(), lineIndex); return 0; }  return visibleEnd ? ((lineIndex > 0 && metrics.getStartIndex() < getLineMetrics()[lineIndex - 1].getEndIndex()) ? metrics.getEndIndex() : ((metrics.getStartIndex() < getText().length() && getText().charAt(metrics.getStartIndex()) == '\n') ? metrics.getStartIndex() : metrics.getEndExcludingWhitespaces())) : metrics.getEndIndex(); }
/*     */   public boolean isLineEllipsized(int lineIndex) { return false; }
/*     */   public int getLineForOffset(int offset) { lineMetricsForOffset(offset); return (lineMetricsForOffset(offset) != null) ? lineMetricsForOffset(offset).getLineNumber() : 0; }
/*     */   public int getLineForVerticalPosition(float vertical) { getLineMetricsForVerticalPosition(vertical); return (getLineMetricsForVerticalPosition(vertical) != null) ? getLineMetricsForVerticalPosition(vertical).getLineNumber() : 0; }
/* 691 */   private final LineMetrics getLineMetricsForVerticalPosition(float vertical) { LineMetrics[] arrayOfLineMetrics = getLineMetrics(); int $i$f$binarySearchFirstMatchingOrLast = 0; int index$iv = CollectionsKt.binarySearch$default(ArraysKt.asList((Object[])arrayOfLineMetrics), 0, 0, new SkiaParagraph$getLineMetricsForVerticalPosition$$inlined$binarySearchFirstMatchingOrLast$1(vertical), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 696 */     return ((arrayOfLineMetrics.length == 0)) ? null : arrayOfLineMetrics[RangesKt.coerceAtMost(-index$iv - 1, ArraysKt.getLastIndex((Object[])arrayOfLineMetrics))]; } public float getHorizontalPosition(int offset, boolean usePrimaryDirection) { TextBox prevBox = getBoxBackwardByOffset$default(this, offset, 0, 2, null); TextBox nextBox = getBoxForwardByOffset(offset); boolean isRtl = (this.paragraphIntrinsics.getTextDirection() == ResolvedTextDirection.Rtl); boolean isLtr = !isRtl; Intrinsics.checkNotNull(nextBox); return (prevBox == null && nextBox == null) ? getAlignedStartingPosition(isRtl) : ((prevBox == null) ? SkiaParagraph_skikoKt.cursorHorizontalPosition(nextBox, true) : ((nextBox == null) ? SkiaParagraph_skikoKt.cursorHorizontalPosition$default(prevBox, false, 1, null) : ((nextBox.getDirection() == prevBox.getDirection()) ? SkiaParagraph_skikoKt.cursorHorizontalPosition(nextBox, true) : ((isLtr && prevBox.getDirection() == Direction.LTR) ? SkiaParagraph_skikoKt.cursorHorizontalPosition(nextBox, true) : ((isRtl && prevBox.getDirection() == Direction.RTL) ? SkiaParagraph_skikoKt.cursorHorizontalPosition(nextBox, true) : (usePrimaryDirection ? SkiaParagraph_skikoKt.cursorHorizontalPosition$default(prevBox, false, 1, null) : SkiaParagraph_skikoKt.cursorHorizontalPosition(nextBox, true))))))); }
/*     */   private final float getAlignedStartingPosition(boolean isRtl) { int i = this.layouter.getTextStyle().getTextAlign-e0LSkKk(); return TextAlign.equals-impl0(i, TextAlign.Companion.getLeft-e0LSkKk()) ? 0.0F : (TextAlign.equals-impl0(i, TextAlign.Companion.getRight-e0LSkKk()) ? getWidth() : (TextAlign.equals-impl0(i, TextAlign.Companion.getCenter-e0LSkKk()) ? (getWidth() / 2) : (TextAlign.equals-impl0(i, TextAlign.Companion.getStart-e0LSkKk()) ? (isRtl ? getWidth() : 0.0F) : (TextAlign.equals-impl0(i, TextAlign.Companion.getEnd-e0LSkKk()) ? (isRtl ? 0.0F : getWidth()) : 0.0F)))); }
/*     */   private final LineMetrics[] getLineMetrics() { if (this._lineMetrics == null) { LineMetrics[] arrayOfLineMetrics1 = receiveLineMetrics(), it = arrayOfLineMetrics1; int $i$a$-also-SkiaParagraph$lineMetrics$lineMetrics$1 = 0; this._lineMetrics = it; }  LineMetrics[] lineMetrics = arrayOfLineMetrics1; return lineMetrics; }
/*     */   private final LineMetrics[] receiveLineMetrics() { LineMetrics[] lineMetrics = ((getText().length() == 0)) ? this.layouter.emptyLineMetrics$ui_text(this.paragraph) : this.paragraph.getLineMetrics(); FontMetrics fontMetrics = getDefaultFont$ui_text().getMetrics(); if (!((lineMetrics.length == 0) ? 1 : 0)) { lineMetrics[0] = SkiaParagraph_skikoKt.access$trimFirstAscent(lineMetrics[0], fontMetrics, this.layouter.getTextStyle()); lineMetrics[lineMetrics.length - 1] = SkiaParagraph_skikoKt.access$trimLastDescent(lineMetrics[lineMetrics.length - 1], fontMetrics, this.layouter.getTextStyle()); }  return lineMetrics; }
/*     */   private final TextBox getBoxForwardByOffset(int offset) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore_2
/*     */     //   2: iconst_0
/*     */     //   3: istore_3
/*     */     //   4: iconst_0
/*     */     //   5: iload_1
/*     */     //   6: if_icmpgt -> 28
/*     */     //   9: iload_1
/*     */     //   10: aload_2
/*     */     //   11: invokespecial getText : ()Ljava/lang/String;
/*     */     //   14: invokevirtual length : ()I
/*     */     //   17: if_icmpgt -> 24
/*     */     //   20: iconst_1
/*     */     //   21: goto -> 29
/*     */     //   24: iconst_0
/*     */     //   25: goto -> 29
/*     */     //   28: iconst_0
/*     */     //   29: ifne -> 91
/*     */     //   32: iconst_0
/*     */     //   33: istore #4
/*     */     //   35: new java/lang/StringBuilder
/*     */     //   38: dup
/*     */     //   39: invokespecial <init> : ()V
/*     */     //   42: ldc_w 'Invalid offset: '
/*     */     //   45: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   48: iload_1
/*     */     //   49: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   52: ldc_w '. Valid range is [0, '
/*     */     //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   58: aload_2
/*     */     //   59: invokespecial getText : ()Ljava/lang/String;
/*     */     //   62: invokevirtual length : ()I
/*     */     //   65: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*     */     //   68: bipush #93
/*     */     //   70: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   73: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   76: astore #4
/*     */     //   78: new java/lang/IllegalArgumentException
/*     */     //   81: dup
/*     */     //   82: aload #4
/*     */     //   84: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   87: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   90: athrow
/*     */     //   91: nop
/*     */     //   92: iload_1
/*     */     //   93: iconst_1
/*     */     //   94: iadd
/*     */     //   95: istore_2
/*     */     //   96: iload_2
/*     */     //   97: aload_0
/*     */     //   98: invokespecial getText : ()Ljava/lang/String;
/*     */     //   101: invokevirtual length : ()I
/*     */     //   104: if_icmpgt -> 142
/*     */     //   107: aload_0
/*     */     //   108: getfield paragraph : Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   111: iload_1
/*     */     //   112: iload_2
/*     */     //   113: getstatic org/jetbrains/skia/paragraph/RectHeightMode.STRUT : Lorg/jetbrains/skia/paragraph/RectHeightMode;
/*     */     //   116: getstatic org/jetbrains/skia/paragraph/RectWidthMode.TIGHT : Lorg/jetbrains/skia/paragraph/RectWidthMode;
/*     */     //   119: invokevirtual getRectsForRange : (IILorg/jetbrains/skia/paragraph/RectHeightMode;Lorg/jetbrains/skia/paragraph/RectWidthMode;)[Lorg/jetbrains/skia/paragraph/TextBox;
/*     */     //   122: invokestatic firstOrNull : ([Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   125: checkcast org/jetbrains/skia/paragraph/TextBox
/*     */     //   128: astore_3
/*     */     //   129: aload_3
/*     */     //   130: ifnull -> 135
/*     */     //   133: aload_3
/*     */     //   134: areturn
/*     */     //   135: iinc #2, 1
/*     */     //   138: nop
/*     */     //   139: goto -> 96
/*     */     //   142: aconst_null
/*     */     //   143: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #311	-> 0
/*     */     //   #697	-> 4
/*     */     //   #698	-> 35
/*     */     //   #697	-> 76
/*     */     //   #700	-> 91
/*     */     //   #312	-> 92
/*     */     //   #313	-> 96
/*     */     //   #314	-> 107
/*     */     //   #315	-> 111
/*     */     //   #316	-> 113
/*     */     //   #314	-> 119
/*     */     //   #317	-> 122
/*     */     //   #314	-> 128
/*     */     //   #318	-> 129
/*     */     //   #319	-> 133
/*     */     //   #321	-> 138
/*     */     //   #323	-> 142
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   35	41	4	$i$a$-require-SkiaParagraph$checkOffsetIsValid$1$iv	I
/*     */     //   4	88	3	$i$f$checkOffsetIsValid	I
/*     */     //   2	90	2	this_$iv	Landroidx/compose/ui/text/SkiaParagraph;
/*     */     //   129	10	3	box	Lorg/jetbrains/skia/paragraph/TextBox;
/*     */     //   96	48	2	to	I
/*     */     //   0	144	0	this	Landroidx/compose/ui/text/SkiaParagraph;
/*     */     //   0	144	1	offset	I }
/* 701 */   private final TextBox getBoxBackwardByOffset(int offset, int end) { SkiaParagraph this_$iv = this; int $i$f$checkOffsetIsValid = 0; if (!((0 <= offset) ? ((offset <= this_$iv.getText().length()) ? 1 : 0) : 0)) { int $i$a$-require-SkiaParagraph$checkOffsetIsValid$1$iv = 0; String str = 
/* 702 */         "Invalid offset: " + offset + ". Valid range is [0, " + this_$iv.getText().length() + ']'; throw new IllegalArgumentException(str.toString()); }  int from = offset - 1; boolean isRtl = (this.paragraphIntrinsics.getTextDirection() == ResolvedTextDirection.Rtl); while (from >= 0) { TextBox box = (TextBox)ArraysKt.firstOrNull((Object[])this.paragraph.getRectsForRange(from, end, RectHeightMode.STRUT, RectWidthMode.TIGHT)); if (box == null) { from--; continue; }  if (getText().charAt(from) == '\n') { if (!isRtl) { float f = box.getRect().getBottom() + box.getRect().getBottom() - box.getRect().getTop(); Rect rect1 = new Rect(0.0F, box.getRect().getBottom(), 0.0F, f); return new TextBox(rect1, box.getDirection()); }  float bottom = box.getRect().getBottom() + box.getRect().getBottom() - box.getRect().getTop(); Rect rect = new Rect(getWidth(), box.getRect().getBottom(), getWidth(), bottom); TextBox nextBox = (TextBox)ArraysKt.first((Object[])this.paragraph.getRectsForRange(offset, offset + 1, RectHeightMode.STRUT, RectWidthMode.TIGHT)); rect = new Rect(nextBox.getRect().getLeft(), nextBox.getRect().getTop(), nextBox.getRect().getLeft(), nextBox.getRect().getBottom()); return (from == StringsKt.getLastIndex(getText())) ? new TextBox(rect, box.getDirection()) : new TextBox(rect, nextBox.getDirection()); }
/*     */        return box; }
/*     */      return null; } @NotNull public ResolvedTextDirection getParagraphDirection(int offset) { return this.paragraphIntrinsics.getTextDirection(); }
/* 705 */   public long getWordBoundary--jx7JFs(int offset) { SkiaParagraph this_$iv = this; int $i$f$checkOffsetIsValid = 0; if (!((0 <= offset) ? ((offset <= this_$iv.getText().length()) ? 1 : 0) : 0)) { int $i$a$-require-SkiaParagraph$checkOffsetIsValid$1$iv = 0; String str = 
/* 706 */         "Invalid offset: " + offset + ". Valid range is [0, " + this_$iv.getText().length() + ']';
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     if ((offset < getText().length() && CharsKt.isWhitespace(getText().charAt(offset))) || offset == getText().length())
/*     */       return (offset > 0 && !CharsKt.isWhitespace(getText().charAt(offset - 1))) ? SkiaParagraph_skikoKt.access$toTextRange(this.paragraph.getWordBoundary(offset - 1)) : TextRangeKt.TextRange(offset, offset); 
/*     */     return SkiaParagraph_skikoKt.access$toTextRange(this.paragraph.getWordBoundary(offset)); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public ResolvedTextDirection getBidiRunDirection(int offset) {
/*     */     getBoxForwardByOffset(offset);
/*     */     (getBoxForwardByOffset(offset) != null) ? getBoxForwardByOffset(offset).getDirection() : null;
/*     */     switch ((((getBoxForwardByOffset(offset) != null) ? getBoxForwardByOffset(offset).getDirection() : null) == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[((getBoxForwardByOffset(offset) != null) ? getBoxForwardByOffset(offset).getDirection() : null).ordinal()]) {
/*     */       case true:
/*     */       
/*     */       case true:
/*     */       
/*     */       case true:
/*     */       
/*     */     } 
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   
/*     */   public int getOffsetForPosition-k-4lQ0M(long position) {
/*     */     LineMetrics expectedLine;
/*     */     int glyphPosition = this.paragraph.getGlyphPositionAtCoordinate(Offset.getX-impl(position), Offset.getY-impl(position)).getPosition();
/*     */     if (getLineMetricsForVerticalPosition(Offset.getY-impl(position)) == null) {
/*     */       getLineMetricsForVerticalPosition(Offset.getY-impl(position));
/*     */       return glyphPosition;
/*     */     } 
/*     */     boolean isNotEmptyLine = (expectedLine.getStartIndex() < expectedLine.getEndIndex());
/*     */     if (Offset.getX-impl(position) > expectedLine.getLeft() && Offset.getX-impl(position) < expectedLine.getRight())
/*     */       return glyphPosition; 
/*     */     TextBox[] rects = isNotEmptyLine ? this.paragraph.getRectsForRange(expectedLine.getStartIndex(), expectedLine.isHardBreak() ? expectedLine.getEndIndex() : (expectedLine.getEndIndex() - 1), RectHeightMode.STRUT, RectWidthMode.TIGHT) : null;
/*     */     ((TextBox)ArraysKt.firstOrNull((Object[])rects)).getRect();
/*     */     float leftX = (rects != null && (TextBox)ArraysKt.firstOrNull((Object[])rects) != null && ((TextBox)ArraysKt.firstOrNull((Object[])rects)).getRect() != null) ? ((TextBox)ArraysKt.firstOrNull((Object[])rects)).getRect().getLeft() : (float)expectedLine.getLeft();
/*     */     ((TextBox)ArraysKt.lastOrNull((Object[])rects)).getRect();
/*     */     float rightX = (rects != null && (TextBox)ArraysKt.lastOrNull((Object[])rects) != null && ((TextBox)ArraysKt.lastOrNull((Object[])rects)).getRect() != null) ? ((TextBox)ArraysKt.lastOrNull((Object[])rects)).getRect().getRight() : (float)expectedLine.getRight();
/*     */     if ((leftX == rightX))
/*     */       return glyphPosition; 
/*     */     int correctedGlyphPosition = glyphPosition;
/*     */     if (Offset.getX-impl(position) <= leftX) {
/*     */       correctedGlyphPosition = this.paragraph.getGlyphPositionAtCoordinate(leftX + 1.0F, Offset.getY-impl(position)).getPosition();
/*     */     } else if (Offset.getX-impl(position) >= rightX) {
/*     */       correctedGlyphPosition = this.paragraph.getGlyphPositionAtCoordinate(rightX - 1.0F, Offset.getY-impl(position)).getPosition();
/*     */       boolean isNeutralChar = ((0 <= correctedGlyphPosition) ? ((correctedGlyphPosition < getText().length())) : false) ? CharHelpers_jvmKt.isNeutralDirection(CharHelpers_skikoKt.codePointAt(getText(), correctedGlyphPosition)) : false;
/*     */       if (!isNeutralChar) {
/*     */         getBoxBackwardByOffset$default(this, correctedGlyphPosition, 0, 2, null);
/*     */         if (((getBoxBackwardByOffset$default(this, correctedGlyphPosition, 0, 2, null) != null) ? getBoxBackwardByOffset$default(this, correctedGlyphPosition, 0, 2, null).getDirection() : null) == Direction.RTL)
/*     */           correctedGlyphPosition--; 
/*     */       } 
/*     */     } 
/*     */     return correctedGlyphPosition;
/*     */   }
/*     */   
/*     */   public long getRangeForRect-8-6BmAI(@NotNull Rect rect, int granularity, @NotNull TextInclusionStrategy inclusionStrategy) {
/*     */     Intrinsics.checkNotNullParameter(rect, "rect");
/*     */     Intrinsics.checkNotNullParameter(inclusionStrategy, "inclusionStrategy");
/*     */     return TextRange.Companion.getZero-d9O1mEE();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Rect getBoundingBox(int offset) {
/*     */     if (getBoxForwardByOffset(offset) == null) {
/*     */       getBoxForwardByOffset(offset);
/*     */       Intrinsics.checkNotNull(getBoxBackwardByOffset(offset, getText().length()));
/*     */     } 
/*     */     TextBox box = getBoxBackwardByOffset(offset, getText().length());
/*     */     return Rects_skikoKt.toComposeRect(box.getRect());
/*     */   }
/*     */   
/*     */   public void fillBoundingBoxes-8ffj60Q(long range, @NotNull float[] array, int arrayStart) {
/*     */     Intrinsics.checkNotNullParameter(array, "array");
/*     */     System.out.println("Compose Multiplatform doesn't support fillBoundingBoxes` yet. Follow https://github.com/JetBrains/compose-multiplatform/issues/4236");
/*     */   }
/*     */   
/*     */   public void paint-RPmYEkk(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
/*     */     Intrinsics.checkNotNullParameter(canvas, "canvas");
/*     */     ParagraphLayouter paragraphLayouter = this.layouter;
/*     */     SkiaParagraph skiaParagraph = this;
/*     */     int $i$a$-with-SkiaParagraph$paint$1 = 0;
/*     */     paragraphLayouter.setColor-8_81llA(color);
/*     */     paragraphLayouter.setTextStyle(shadow, textDecoration);
/*     */     skiaParagraph.setParagraph(paragraphLayouter.layoutParagraph(getWidth()));
/*     */     this.paragraph.paint(SkiaBackedCanvas_skikoKt.getNativeCanvas(canvas), 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   @ExperimentalTextApi
/*     */   public void paint-LG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) {
/*     */     Intrinsics.checkNotNullParameter(canvas, "canvas");
/*     */     ParagraphLayouter paragraphLayouter = this.layouter;
/*     */     SkiaParagraph skiaParagraph = this;
/*     */     int $i$a$-with-SkiaParagraph$paint$2 = 0;
/*     */     paragraphLayouter.setColor-8_81llA(color);
/*     */     paragraphLayouter.setTextStyle(shadow, textDecoration);
/*     */     paragraphLayouter.setDrawStyle(drawStyle);
/*     */     paragraphLayouter.setBlendMode-s9anfk8(blendMode);
/*     */     skiaParagraph.setParagraph(paragraphLayouter.layoutParagraph(getWidth()));
/*     */     this.paragraph.paint(SkiaBackedCanvas_skikoKt.getNativeCanvas(canvas), 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   @ExperimentalTextApi
/*     */   public void paint-hn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) {
/*     */     Intrinsics.checkNotNullParameter(canvas, "canvas");
/*     */     Intrinsics.checkNotNullParameter(brush, "brush");
/*     */     ParagraphLayouter paragraphLayouter = this.layouter;
/*     */     SkiaParagraph skiaParagraph = this;
/*     */     int $i$a$-with-SkiaParagraph$paint$3 = 0;
/*     */     paragraphLayouter.setBrush-12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), alpha);
/*     */     paragraphLayouter.setTextStyle(shadow, textDecoration);
/*     */     paragraphLayouter.setDrawStyle(drawStyle);
/*     */     paragraphLayouter.setBlendMode-s9anfk8(blendMode);
/*     */     skiaParagraph.setParagraph(paragraphLayouter.layoutParagraph(getWidth()));
/*     */     this.paragraph.paint(SkiaBackedCanvas_skikoKt.getNativeCanvas(canvas), 0.0F, 0.0F);
/*     */   }
/*     */   
/*     */   private final void checkOffsetIsValid(int offset) {
/*     */     int $i$f$checkOffsetIsValid = 0;
/*     */     if (!((0 <= offset) ? ((offset <= getText().length()) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-SkiaParagraph$checkOffsetIsValid$1 = 0;
/*     */       String str = "Invalid offset: " + offset + ". Valid range is [0, " + getText().length() + ']';
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\SkiaParagraph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */