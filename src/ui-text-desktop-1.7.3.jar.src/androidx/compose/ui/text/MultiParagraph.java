/*      */ package androidx.compose.ui.text;
/*      */ 
/*      */ import androidx.compose.ui.geometry.Offset;
/*      */ import androidx.compose.ui.geometry.Rect;
/*      */ import androidx.compose.ui.graphics.Brush;
/*      */ import androidx.compose.ui.graphics.Canvas;
/*      */ import androidx.compose.ui.graphics.Color;
/*      */ import androidx.compose.ui.graphics.Path;
/*      */ import androidx.compose.ui.graphics.Shadow;
/*      */ import androidx.compose.ui.graphics.SkiaBackedPath_skikoKt;
/*      */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*      */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*      */ import androidx.compose.ui.text.font.Font;
/*      */ import androidx.compose.ui.text.font.FontFamily;
/*      */ import androidx.compose.ui.text.platform.SkiaMultiParagraphDraw_skikoKt;
/*      */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*      */ import androidx.compose.ui.text.style.TextDecoration;
/*      */ import androidx.compose.ui.unit.Constraints;
/*      */ import androidx.compose.ui.unit.ConstraintsKt;
/*      */ import androidx.compose.ui.unit.Density;
/*      */ import java.util.ArrayList;
/*      */ import java.util.List;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.DeprecationLevel;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ReplaceWith;
/*      */ import kotlin.Unit;
/*      */ import kotlin.collections.CollectionsKt;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.Lambda;
/*      */ import kotlin.jvm.internal.Ref;
/*      */ import kotlin.ranges.RangesKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Ö\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\031\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\024\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\025\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\b\b\007\030\0002\0020\001B+\b\027\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nBY\b\027\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016\022\024\b\002\020\017\032\016\022\n\022\b\022\004\022\0020\0220\0210\020\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\023\032\0020\024\022\006\020\025\032\0020\026¢\006\002\020\027BY\b\027\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016\022\006\020\b\032\0020\t\022\006\020\023\032\0020\024\022\006\020\030\032\0020\031\022\024\b\002\020\017\032\016\022\n\022\b\022\004\022\0020\0220\0210\020\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\032BY\b\026\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016\022\006\020\033\032\0020\034\022\006\020\023\032\0020\024\022\006\020\030\032\0020\031\022\024\b\002\020\017\032\016\022\n\022\b\022\004\022\0020\0220\0210\020\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\035B)\022\006\020\002\032\0020\003\022\006\020\033\032\0020\034\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007¢\006\002\020\036J*\020=\032\0020>2\006\020?\032\0020@2\006\020A\032\0020>2\b\b\001\020B\032\0020\005ø\001\000¢\006\004\bC\020DJ\016\020E\032\0020F2\006\020G\032\0020\005J\016\020H\032\0020:2\006\020G\032\0020\005J\016\020I\032\0020:2\006\020G\032\0020\005J\026\020J\032\0020\t2\006\020G\032\0020\0052\006\020K\032\0020\007J\016\020L\032\0020\t2\006\020M\032\0020\005J\016\020N\032\0020\t2\006\020M\032\0020\005J\030\020O\032\0020\0052\006\020M\032\0020\0052\b\b\002\020P\032\0020\007J\016\020Q\032\0020\0052\006\020G\032\0020\005J\016\020R\032\0020\0052\006\020S\032\0020\tJ\016\020T\032\0020\t2\006\020M\032\0020\005J\016\020U\032\0020\t2\006\020M\032\0020\005J\016\020V\032\0020\t2\006\020M\032\0020\005J\016\020W\032\0020\0052\006\020M\032\0020\005J\016\020X\032\0020\t2\006\020M\032\0020\005J\016\020Y\032\0020\t2\006\020M\032\0020\005J\030\020Z\032\0020\0052\006\020[\032\0020\\ø\001\000¢\006\004\b]\020^J\016\020_\032\0020F2\006\020G\032\0020\005J\026\020`\032\0020a2\006\020b\032\0020\0052\006\020c\032\0020\005J(\020d\032\0020@2\006\020e\032\0020:2\006\020f\032\0020g2\006\020h\032\0020iø\001\000¢\006\004\bj\020kJ\033\020l\032\0020@2\006\020G\032\0020\005ø\001\001ø\001\000¢\006\004\bm\020nJ\016\020o\032\0020\0072\006\020M\032\0020\005JY\020p\032\0020q2\006\020r\032\0020s2\006\020t\032\0020u2\b\b\002\020v\032\0020\t2\n\b\002\020w\032\004\030\0010x2\n\b\002\020y\032\004\030\0010z2\n\b\002\020{\032\004\030\0010|2\b\b\002\020}\032\0020~ø\001\000¢\006\005\b\020\001J@\020p\032\0020q2\006\020r\032\0020s2\n\b\002\020\001\032\0030\0012\n\b\002\020w\032\004\030\0010x2\n\b\002\020y\032\004\030\0010zH\007ø\001\000¢\006\006\b\001\020\001JT\020p\032\0020q2\006\020r\032\0020s2\n\b\002\020\001\032\0030\0012\n\b\002\020w\032\004\030\0010x2\n\b\002\020y\032\004\030\0010z2\n\b\002\020{\032\004\030\0010|2\b\b\002\020}\032\0020~ø\001\000¢\006\006\b\001\020\001J\021\020\001\032\0020q2\006\020G\032\0020\005H\002J\021\020\001\032\0020q2\006\020G\032\0020\005H\002J\021\020\001\032\0020q2\006\020M\032\0020\005H\002R\024\020\013\032\0020\f8BX\004¢\006\006\032\004\b\037\020 R\021\020!\032\0020\007¢\006\b\n\000\032\004\b\"\020#R\021\020$\032\0020\t8F¢\006\006\032\004\b%\020&R\021\020'\032\0020\t¢\006\b\n\000\032\004\b(\020&R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b)\020*R\021\020+\032\0020\t8F¢\006\006\032\004\b,\020&R\021\020-\032\0020\005¢\006\b\n\000\032\004\b.\020/R\021\0200\032\0020\t8F¢\006\006\032\004\b1\020&R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b2\020/R\021\0203\032\0020\t8F¢\006\006\032\004\b4\020&R\032\0205\032\b\022\004\022\002060\020X\004¢\006\b\n\000\032\004\b7\0208R\031\0209\032\n\022\006\022\004\030\0010:0\020¢\006\b\n\000\032\004\b;\0208R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b<\020&\002\013\n\005\b¡\0360\001\n\002\b!¨\006\001"}, d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "maxLines", "", "ellipsis", "", "width", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBaseline", "lineIndex", "getLineBottom", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1145:1\n508#2,3:1146\n33#2,4:1149\n511#2:1153\n151#2,3:1154\n33#2,4:1157\n154#2,2:1161\n38#2:1163\n156#2:1164\n512#2,2:1165\n38#2:1167\n514#2:1168\n33#2,6:1170\n33#2,6:1176\n1#3:1169\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n372#1:1146,3\n372#1:1149,4\n372#1:1153\n374#1:1154,3\n374#1:1157,4\n374#1:1161,2\n374#1:1163\n374#1:1164\n372#1:1165,2\n372#1:1167\n372#1:1168\n400#1:1170,6\n417#1:1176,6\n*E\n"})
/*      */ public final class MultiParagraph {
/*      */   @NotNull
/*      */   private final MultiParagraphIntrinsics intrinsics;
/*      */   private final int maxLines;
/*      */   private final boolean didExceedMaxLines;
/*      */   private final float width;
/*      */   private final float height;
/*      */   private final int lineCount;
/*      */   @NotNull
/*      */   private final List<Rect> placeholderRects;
/*      */   @NotNull
/*      */   private final List<ParagraphInfo> paragraphInfoList;
/*      */   public static final int $stable = 8;
/*      */   
/*   55 */   private MultiParagraph(MultiParagraphIntrinsics intrinsics, long constraints, int maxLines, boolean ellipsis) { this.intrinsics = intrinsics;
/*      */     
/*   57 */     this.maxLines = maxLines;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  311 */     if (!((Constraints.getMinWidth-impl(constraints) == 0 && Constraints.getMinHeight-impl(constraints) == 0) ? 1 : 0)) { int $i$a$-require-MultiParagraph$1 = 0; String str = 
/*  312 */         "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.";
/*      */       
/*      */       throw new IllegalArgumentException(str.toString()); }
/*      */     
/*  316 */     float currentHeight = 0.0F;
/*  317 */     int currentLineCount = 0;
/*  318 */     boolean didExceedMaxLines = false;
/*      */ 
/*      */     
/*  321 */     List<ParagraphInfo> paragraphInfoList = new ArrayList();
/*  322 */     List<ParagraphIntrinsicInfo> infoList = this.intrinsics.getInfoList$ui_text();
/*  323 */     for (int index = 0, i = infoList.size(); index < i; index++) {
/*  324 */       ParagraphIntrinsicInfo paragraphInfo = infoList.get(index);
/*  325 */       Paragraph paragraph = ParagraphKt.Paragraph-_EkL_-Y(
/*  326 */           paragraphInfo.getIntrinsics(), 
/*  327 */           ConstraintsKt.Constraints$default(0, 
/*  328 */             Constraints.getMaxWidth-impl(constraints), 0, 
/*  329 */             Constraints.getHasBoundedHeight-impl(constraints) ? 
/*  330 */             RangesKt.coerceAtLeast(Constraints.getMaxHeight-impl(constraints) - ParagraphKt.ceilToInt(currentHeight), 0) : 
/*      */             
/*  332 */             Constraints.getMaxHeight-impl(constraints), 5, null), 
/*      */ 
/*      */           
/*  335 */           this.maxLines - currentLineCount, 
/*  336 */           ellipsis);
/*      */ 
/*      */       
/*  339 */       float paragraphTop = currentHeight;
/*  340 */       float paragraphBottom = currentHeight + paragraph.getHeight();
/*  341 */       currentHeight = paragraphBottom;
/*      */       
/*  343 */       int startLineIndex = currentLineCount;
/*  344 */       int endLineIndex = startLineIndex + paragraph.getLineCount();
/*  345 */       currentLineCount = endLineIndex;
/*      */       
/*  347 */       paragraphInfoList.add(
/*  348 */           new ParagraphInfo(
/*  349 */             paragraph, 
/*  350 */             paragraphInfo.getStartIndex(), 
/*  351 */             paragraphInfo.getEndIndex(), 
/*  352 */             startLineIndex, 
/*  353 */             endLineIndex, 
/*  354 */             paragraphTop, 
/*  355 */             paragraphBottom));
/*      */ 
/*      */ 
/*      */       
/*  359 */       if (paragraph.getDidExceedMaxLines() || (
/*  360 */         endLineIndex == this.maxLines && index != CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text()))) {
/*      */         
/*  362 */         didExceedMaxLines = true;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/*  367 */     this.height = currentHeight;
/*  368 */     this.lineCount = currentLineCount;
/*  369 */     this.didExceedMaxLines = didExceedMaxLines;
/*  370 */     this.paragraphInfoList = paragraphInfoList;
/*  371 */     this.width = Constraints.getMaxWidth-impl(constraints);
/*  372 */     List<ParagraphInfo> list1 = paragraphInfoList; MultiParagraph multiParagraph = this; int $i$f$fastFlatMap = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1147 */     ArrayList<Rect> target$iv = new ArrayList(list1.size());
/* 1148 */     List<ParagraphInfo> $this$fastForEach$iv$iv = list1; int $i$f$fastForEach = 0;
/*      */     
/* 1150 */     int index$iv$iv = 0, k = $this$fastForEach$iv$iv.size(); if (index$iv$iv < k) {
/* 1151 */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 1152 */       Object e$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFlatMap$2$iv = 0;
/* 1153 */       ParagraphInfo paragraphInfo = (ParagraphInfo)e$iv; int $i$a$-fastFlatMap-MultiParagraph$2 = 0; ParagraphInfo $this$lambda_u244_u24lambda_u243 = paragraphInfo; int $i$a$-with-MultiParagraph$2$1 = 0; List<Rect> $this$fastMap$iv = $this$lambda_u244_u24lambda_u243.getParagraph().getPlaceholderRects();
/*      */       int $i$f$fastMap = 0;
/* 1155 */       ArrayList arrayList3 = new ArrayList($this$fastMap$iv.size());
/* 1156 */       List<Rect> list2 = $this$fastMap$iv; int m = 0;
/*      */       
/* 1158 */       int n = 0, i1 = list2.size();
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1168 */     ArrayList<Rect> arrayList1 = target$iv; multiParagraph = multiParagraph; int $i$a$-let-MultiParagraph$3 = 0; ArrayList<Rect> arrayList2; ArrayList arrayList; for (int j = this.intrinsics.getPlaceholders().size() - arrayList1.size(); k < j; ) {
/* 1169 */       int m = k, n = m; ArrayList arrayList3 = arrayList; int $i$a$-List-MultiParagraph$3$1 = 0;
/*      */       arrayList3.add(null);
/*      */       k++;
/*      */     } 
/*      */     multiParagraph.placeholderRects = (arrayList1.size() < this.intrinsics.getPlaceholders().size()) ? CollectionsKt.plus(arrayList2, arrayList) : arrayList1; } public final void paint-LG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) { Intrinsics.checkNotNullParameter(canvas, "canvas");
/*      */     canvas.save();
/*      */     List<ParagraphInfo> $this$fastForEach$iv = this.paragraphInfoList;
/*      */     int $i$f$fastForEach = 0;
/* 1177 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 1178 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 1179 */       ParagraphInfo it = (ParagraphInfo)item$iv; int $i$a$-fastForEach-MultiParagraph$paint$2 = 0;
/*      */       it.getParagraph().paint-LG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
/*      */       canvas.translate(0.0F, it.getParagraph().getHeight());
/*      */     } 
/*      */     canvas.restore(); }
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final MultiParagraphIntrinsics getIntrinsics() {
/*      */     return this.intrinsics;
/*      */   }
/*      */   
/*      */   public final int getMaxLines() {
/*      */     return this.maxLines;
/*      */   }
/*      */   
/*      */   @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
/*      */   public MultiParagraph(@NotNull MultiParagraphIntrinsics intrinsics, int maxLines, boolean ellipsis, float width) {
/*      */     this(intrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(width), 0, 0, 13, null), maxLines, ellipsis, null);
/*      */   }
/*      */   
/*      */   @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
/*      */   public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int maxLines, boolean ellipsis, float width, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
/*      */     this(multiParagraphIntrinsics, l, maxLines, ellipsis, null);
/*      */   }
/*      */   
/*      */   @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
/*      */   public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, float width, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, int maxLines, boolean ellipsis) {
/*      */     this(multiParagraphIntrinsics, l, maxLines, ellipsis, null);
/*      */   }
/*      */   
/*      */   private MultiParagraph(AnnotatedString annotatedString, TextStyle style, long constraints, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> placeholders, int maxLines, boolean ellipsis) {
/*      */     this(multiParagraphIntrinsics, constraints, maxLines, ellipsis, null);
/*      */   }
/*      */   
/*      */   private final AnnotatedString getAnnotatedString() {
/*      */     return this.intrinsics.getAnnotatedString();
/*      */   }
/*      */   
/*      */   public final float getMinIntrinsicWidth() {
/*      */     return this.intrinsics.getMinIntrinsicWidth();
/*      */   }
/*      */   
/*      */   public final float getMaxIntrinsicWidth() {
/*      */     return this.intrinsics.getMaxIntrinsicWidth();
/*      */   }
/*      */   
/*      */   public final boolean getDidExceedMaxLines() {
/*      */     return this.didExceedMaxLines;
/*      */   }
/*      */   
/*      */   public final float getWidth() {
/*      */     return this.width;
/*      */   }
/*      */   
/*      */   public final float getHeight() {
/*      */     return this.height;
/*      */   }
/*      */   
/*      */   public final float getFirstBaseline() {
/*      */     return this.paragraphInfoList.isEmpty() ? 0.0F : ((ParagraphInfo)this.paragraphInfoList.get(0)).getParagraph().getFirstBaseline();
/*      */   }
/*      */   
/*      */   public final float getLastBaseline() {
/*      */     ParagraphInfo $this$_get_lastBaseline__u24lambda_u240 = (ParagraphInfo)CollectionsKt.last(this.paragraphInfoList);
/*      */     int $i$a$-with-MultiParagraph$lastBaseline$1 = 0;
/*      */     return this.paragraphInfoList.isEmpty() ? 0.0F : $this$_get_lastBaseline__u24lambda_u240.toGlobalYPosition($this$_get_lastBaseline__u24lambda_u240.getParagraph().getLastBaseline());
/*      */   }
/*      */   
/*      */   public final int getLineCount() {
/*      */     return this.lineCount;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final List<Rect> getPlaceholderRects() {
/*      */     return this.placeholderRects;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final List<ParagraphInfo> getParagraphInfoList$ui_text() {
/*      */     return this.paragraphInfoList;
/*      */   }
/*      */   
/*      */   public final void paint-hn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
/*      */     Intrinsics.checkNotNullParameter(canvas, "canvas");
/*      */     Intrinsics.checkNotNullParameter(brush, "brush");
/*      */     SkiaMultiParagraphDraw_skikoKt.drawMultiParagraph-7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Path getPathForRange(int start, int end) {
/*      */     if (!((((0 <= start) ? ((start <= end)) : false) && end <= getAnnotatedString().getText().length()) ? 1 : 0)) {
/*      */       int $i$a$-require-MultiParagraph$getPathForRange$1 = 0;
/*      */       String str = "Start(" + start + ") or End(" + end + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!";
/*      */       throw new IllegalArgumentException(str.toString());
/*      */     } 
/*      */     if (start == end)
/*      */       return SkiaBackedPath_skikoKt.Path(); 
/*      */     Path path = SkiaBackedPath_skikoKt.Path();
/*      */     MultiParagraphKt.findParagraphsByRange-Sb-Bc2M(this.paragraphInfoList, TextRangeKt.TextRange(start, end), new MultiParagraph$getPathForRange$2(path, start, end));
/*      */     return path;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "paragraphInfo", "Landroidx/compose/ui/text/ParagraphInfo;", "invoke"})
/*      */   static final class MultiParagraph$getPathForRange$2 extends Lambda implements Function1<ParagraphInfo, Unit> {
/*      */     public final void invoke(@NotNull ParagraphInfo paragraphInfo) {
/*      */       Intrinsics.checkNotNullParameter(paragraphInfo, "paragraphInfo");
/*      */       Path path = this.$path;
/*      */       int i = this.$start, j = this.$end;
/*      */       ParagraphInfo $this$invoke_u24lambda_u240 = paragraphInfo;
/*      */       int $i$a$-with-MultiParagraph$getPathForRange$2$1 = 0;
/*      */       Path.addPath-Uv8p0NA$default(path, $this$invoke_u24lambda_u240.toGlobal($this$invoke_u24lambda_u240.getParagraph().getPathForRange($this$invoke_u24lambda_u240.toLocalIndex(i), $this$invoke_u24lambda_u240.toLocalIndex(j))), 0L, 2, null);
/*      */     }
/*      */     
/*      */     MultiParagraph$getPathForRange$2(Path $path, int $start, int $end) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   public final int getLineForVerticalPosition(float vertical) {
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical);
/*      */     ParagraphInfo $this$getLineForVerticalPosition_u24lambda_u2410 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineForVerticalPosition$1 = 0;
/*      */     return ($this$getLineForVerticalPosition_u24lambda_u2410.getLength() == 0) ? $this$getLineForVerticalPosition_u24lambda_u2410.getStartLineIndex() : $this$getLineForVerticalPosition_u24lambda_u2410.toGlobalLineIndex($this$getLineForVerticalPosition_u24lambda_u2410.getParagraph().getLineForVerticalPosition($this$getLineForVerticalPosition_u24lambda_u2410.toLocalYPosition(vertical)));
/*      */   }
/*      */   
/*      */   public final int getOffsetForPosition-k-4lQ0M(long position) {
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.getY-impl(position));
/*      */     ParagraphInfo $this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getOffsetForPosition$1 = 0;
/*      */     return ($this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.getLength() == 0) ? $this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.getStartIndex() : $this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.toGlobalIndex($this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.getParagraph().getOffsetForPosition-k-4lQ0M($this$getOffsetForPosition_k_4lQ0M_u24lambda_u2411.toLocal-MK-Hz9U(position)));
/*      */   }
/*      */   
/*      */   public final long getRangeForRect-8-6BmAI(@NotNull Rect rect, int granularity, @NotNull TextInclusionStrategy inclusionStrategy) {
/*      */     Intrinsics.checkNotNullParameter(rect, "rect");
/*      */     Intrinsics.checkNotNullParameter(inclusionStrategy, "inclusionStrategy");
/*      */     int firstParagraph = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
/*      */     if (((ParagraphInfo)this.paragraphInfoList.get(firstParagraph)).getBottom() >= rect.getBottom() || firstParagraph == CollectionsKt.getLastIndex(this.paragraphInfoList)) {
/*      */       ParagraphInfo $this$getRangeForRect_8_6BmAI_u24lambda_u2412 = this.paragraphInfoList.get(firstParagraph);
/*      */       int $i$a$-with-MultiParagraph$getRangeForRect$1 = 0;
/*      */       return ParagraphInfo.toGlobal-xdX6-G0$default($this$getRangeForRect_8_6BmAI_u24lambda_u2412, $this$getRangeForRect_8_6BmAI_u24lambda_u2412.getParagraph().getRangeForRect-8-6BmAI($this$getRangeForRect_8_6BmAI_u24lambda_u2412.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
/*      */     } 
/*      */     int lastParagraph = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
/*      */     long startRange = TextRange.Companion.getZero-d9O1mEE();
/*      */     while (TextRange.equals-impl0(startRange, TextRange.Companion.getZero-d9O1mEE()) && firstParagraph <= lastParagraph) {
/*      */       ParagraphInfo $this$getRangeForRect_8_6BmAI_u24lambda_u2413 = this.paragraphInfoList.get(firstParagraph);
/*      */       int $i$a$-with-MultiParagraph$getRangeForRect$2 = 0;
/*      */       startRange = ParagraphInfo.toGlobal-xdX6-G0$default($this$getRangeForRect_8_6BmAI_u24lambda_u2413, $this$getRangeForRect_8_6BmAI_u24lambda_u2413.getParagraph().getRangeForRect-8-6BmAI($this$getRangeForRect_8_6BmAI_u24lambda_u2413.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
/*      */       firstParagraph++;
/*      */     } 
/*      */     if (TextRange.equals-impl0(startRange, TextRange.Companion.getZero-d9O1mEE()))
/*      */       return TextRange.Companion.getZero-d9O1mEE(); 
/*      */     long endRange = TextRange.Companion.getZero-d9O1mEE();
/*      */     while (TextRange.equals-impl0(endRange, TextRange.Companion.getZero-d9O1mEE()) && firstParagraph <= lastParagraph) {
/*      */       ParagraphInfo $this$getRangeForRect_8_6BmAI_u24lambda_u2414 = this.paragraphInfoList.get(lastParagraph);
/*      */       int $i$a$-with-MultiParagraph$getRangeForRect$3 = 0;
/*      */       endRange = ParagraphInfo.toGlobal-xdX6-G0$default($this$getRangeForRect_8_6BmAI_u24lambda_u2414, $this$getRangeForRect_8_6BmAI_u24lambda_u2414.getParagraph().getRangeForRect-8-6BmAI($this$getRangeForRect_8_6BmAI_u24lambda_u2414.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
/*      */       lastParagraph--;
/*      */     } 
/*      */     if (TextRange.equals-impl0(endRange, TextRange.Companion.getZero-d9O1mEE()))
/*      */       return startRange; 
/*      */     return TextRangeKt.TextRange(TextRange.getStart-impl(startRange), TextRange.getEnd-impl(endRange));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Rect getBoundingBox(int offset) {
/*      */     requireIndexInRange(offset);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
/*      */     ParagraphInfo $this$getBoundingBox_u24lambda_u2415 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getBoundingBox$1 = 0;
/*      */     return $this$getBoundingBox_u24lambda_u2415.toGlobal($this$getBoundingBox_u24lambda_u2415.getParagraph().getBoundingBox($this$getBoundingBox_u24lambda_u2415.toLocalIndex(offset)));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final float[] fillBoundingBoxes-8ffj60Q(long range, @NotNull float[] array, @IntRange(from = 0L) int arrayStart) {
/*      */     Intrinsics.checkNotNullParameter(array, "array");
/*      */     requireIndexInRange(TextRange.getMin-impl(range));
/*      */     requireIndexInRangeInclusiveEnd(TextRange.getMax-impl(range));
/*      */     Ref.IntRef currentArrayStart = new Ref.IntRef();
/*      */     currentArrayStart.element = arrayStart;
/*      */     Ref.FloatRef currentHeight = new Ref.FloatRef();
/*      */     MultiParagraphKt.findParagraphsByRange-Sb-Bc2M(this.paragraphInfoList, range, new MultiParagraph$fillBoundingBoxes$1(range, array, currentArrayStart, currentHeight));
/*      */     return array;
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "paragraphInfo", "Landroidx/compose/ui/text/ParagraphInfo;", "invoke"})
/*      */   static final class MultiParagraph$fillBoundingBoxes$1 extends Lambda implements Function1<ParagraphInfo, Unit> {
/*      */     public final void invoke(@NotNull ParagraphInfo paragraphInfo) {
/*      */       Intrinsics.checkNotNullParameter(paragraphInfo, "paragraphInfo");
/*      */       long l1 = this.$range;
/*      */       float[] arrayOfFloat = this.$array;
/*      */       Ref.IntRef intRef = this.$currentArrayStart;
/*      */       Ref.FloatRef floatRef = this.$currentHeight;
/*      */       ParagraphInfo $this$invoke_u24lambda_u240 = paragraphInfo;
/*      */       int $i$a$-with-MultiParagraph$fillBoundingBoxes$1$1 = 0;
/*      */       int paragraphStart = ($this$invoke_u24lambda_u240.getStartIndex() > TextRange.getMin-impl(l1)) ? $this$invoke_u24lambda_u240.getStartIndex() : TextRange.getMin-impl(l1);
/*      */       int paragraphEnd = ($this$invoke_u24lambda_u240.getEndIndex() < TextRange.getMax-impl(l1)) ? $this$invoke_u24lambda_u240.getEndIndex() : TextRange.getMax-impl(l1);
/*      */       long finalRange = TextRangeKt.TextRange($this$invoke_u24lambda_u240.toLocalIndex(paragraphStart), $this$invoke_u24lambda_u240.toLocalIndex(paragraphEnd));
/*      */       $this$invoke_u24lambda_u240.getParagraph().fillBoundingBoxes-8ffj60Q(finalRange, arrayOfFloat, intRef.element);
/*      */       int currentArrayEnd = intRef.element + TextRange.getLength-impl(finalRange) * 4;
/*      */       int arrayIndex = intRef.element;
/*      */       while (arrayIndex < currentArrayEnd) {
/*      */         int i = arrayIndex + 1;
/*      */         arrayOfFloat[i] = arrayOfFloat[i] + floatRef.element;
/*      */         i = arrayIndex + 3;
/*      */         arrayOfFloat[i] = arrayOfFloat[i] + floatRef.element;
/*      */         arrayIndex += 4;
/*      */       } 
/*      */       intRef.element = currentArrayEnd;
/*      */       floatRef.element += paragraphInfo.getParagraph().getHeight();
/*      */     }
/*      */     
/*      */     MultiParagraph$fillBoundingBoxes$1(long $range, float[] $array, Ref.IntRef $currentArrayStart, Ref.FloatRef $currentHeight) {
/*      */       super(1);
/*      */     }
/*      */   }
/*      */   
/*      */   public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
/*      */     requireIndexInRangeInclusiveEnd(offset);
/*      */     int paragraphIndex = (offset == getAnnotatedString().length()) ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
/*      */     ParagraphInfo $this$getHorizontalPosition_u24lambda_u2416 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getHorizontalPosition$1 = 0;
/*      */     return $this$getHorizontalPosition_u24lambda_u2416.getParagraph().getHorizontalPosition($this$getHorizontalPosition_u24lambda_u2416.toLocalIndex(offset), usePrimaryDirection);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final ResolvedTextDirection getParagraphDirection(int offset) {
/*      */     requireIndexInRangeInclusiveEnd(offset);
/*      */     int paragraphIndex = (offset == getAnnotatedString().length()) ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
/*      */     ParagraphInfo $this$getParagraphDirection_u24lambda_u2417 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getParagraphDirection$1 = 0;
/*      */     return $this$getParagraphDirection_u24lambda_u2417.getParagraph().getParagraphDirection($this$getParagraphDirection_u24lambda_u2417.toLocalIndex(offset));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final ResolvedTextDirection getBidiRunDirection(int offset) {
/*      */     requireIndexInRangeInclusiveEnd(offset);
/*      */     int paragraphIndex = (offset == getAnnotatedString().length()) ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
/*      */     ParagraphInfo $this$getBidiRunDirection_u24lambda_u2418 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getBidiRunDirection$1 = 0;
/*      */     return $this$getBidiRunDirection_u24lambda_u2418.getParagraph().getBidiRunDirection($this$getBidiRunDirection_u24lambda_u2418.toLocalIndex(offset));
/*      */   }
/*      */   
/*      */   public final long getWordBoundary--jx7JFs(int offset) {
/*      */     requireIndexInRangeInclusiveEnd(offset);
/*      */     int paragraphIndex = (offset == getAnnotatedString().length()) ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
/*      */     ParagraphInfo $this$getWordBoundary__jx7JFs_u24lambda_u2419 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getWordBoundary$1 = 0;
/*      */     return $this$getWordBoundary__jx7JFs_u24lambda_u2419.toGlobal-xdX6-G0($this$getWordBoundary__jx7JFs_u24lambda_u2419.getParagraph().getWordBoundary--jx7JFs($this$getWordBoundary__jx7JFs_u24lambda_u2419.toLocalIndex(offset)), false);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Rect getCursorRect(int offset) {
/*      */     requireIndexInRangeInclusiveEnd(offset);
/*      */     int paragraphIndex = (offset == getAnnotatedString().length()) ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset);
/*      */     ParagraphInfo $this$getCursorRect_u24lambda_u2420 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getCursorRect$1 = 0;
/*      */     return $this$getCursorRect_u24lambda_u2420.toGlobal($this$getCursorRect_u24lambda_u2420.getParagraph().getCursorRect($this$getCursorRect_u24lambda_u2420.toLocalIndex(offset)));
/*      */   }
/*      */   
/*      */   public final int getLineForOffset(int offset) {
/*      */     int paragraphIndex = (offset >= getAnnotatedString().length()) ? CollectionsKt.getLastIndex(this.paragraphInfoList) : ((offset < 0) ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
/*      */     ParagraphInfo $this$getLineForOffset_u24lambda_u2421 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineForOffset$1 = 0;
/*      */     return $this$getLineForOffset_u24lambda_u2421.toGlobalLineIndex($this$getLineForOffset_u24lambda_u2421.getParagraph().getLineForOffset($this$getLineForOffset_u24lambda_u2421.toLocalIndex(offset)));
/*      */   }
/*      */   
/*      */   public final float getLineLeft(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineLeft_u24lambda_u2422 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineLeft$1 = 0;
/*      */     return $this$getLineLeft_u24lambda_u2422.getParagraph().getLineLeft($this$getLineLeft_u24lambda_u2422.toLocalLineIndex(lineIndex));
/*      */   }
/*      */   
/*      */   public final float getLineRight(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineRight_u24lambda_u2423 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineRight$1 = 0;
/*      */     return $this$getLineRight_u24lambda_u2423.getParagraph().getLineRight($this$getLineRight_u24lambda_u2423.toLocalLineIndex(lineIndex));
/*      */   }
/*      */   
/*      */   public final float getLineTop(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineTop_u24lambda_u2424 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineTop$1 = 0;
/*      */     return $this$getLineTop_u24lambda_u2424.toGlobalYPosition($this$getLineTop_u24lambda_u2424.getParagraph().getLineTop($this$getLineTop_u24lambda_u2424.toLocalLineIndex(lineIndex)));
/*      */   }
/*      */   
/*      */   public final float getLineBaseline(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineBaseline_u24lambda_u2425 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineBaseline$1 = 0;
/*      */     return $this$getLineBaseline_u24lambda_u2425.toGlobalYPosition($this$getLineBaseline_u24lambda_u2425.getParagraph().getLineBaseline($this$getLineBaseline_u24lambda_u2425.toLocalLineIndex(lineIndex)));
/*      */   }
/*      */   
/*      */   public final float getLineBottom(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineBottom_u24lambda_u2426 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineBottom$1 = 0;
/*      */     return $this$getLineBottom_u24lambda_u2426.toGlobalYPosition($this$getLineBottom_u24lambda_u2426.getParagraph().getLineBottom($this$getLineBottom_u24lambda_u2426.toLocalLineIndex(lineIndex)));
/*      */   }
/*      */   
/*      */   public final float getLineHeight(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineHeight_u24lambda_u2427 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineHeight$1 = 0;
/*      */     return $this$getLineHeight_u24lambda_u2427.getParagraph().getLineHeight($this$getLineHeight_u24lambda_u2427.toLocalLineIndex(lineIndex));
/*      */   }
/*      */   
/*      */   public final float getLineWidth(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineWidth_u24lambda_u2428 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineWidth$1 = 0;
/*      */     return $this$getLineWidth_u24lambda_u2428.getParagraph().getLineWidth($this$getLineWidth_u24lambda_u2428.toLocalLineIndex(lineIndex));
/*      */   }
/*      */   
/*      */   public final int getLineStart(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineStart_u24lambda_u2429 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineStart$1 = 0;
/*      */     return $this$getLineStart_u24lambda_u2429.toGlobalIndex($this$getLineStart_u24lambda_u2429.getParagraph().getLineStart($this$getLineStart_u24lambda_u2429.toLocalLineIndex(lineIndex)));
/*      */   }
/*      */   
/*      */   public final int getLineEnd(int lineIndex, boolean visibleEnd) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$getLineEnd_u24lambda_u2430 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$getLineEnd$1 = 0;
/*      */     return $this$getLineEnd_u24lambda_u2430.toGlobalIndex($this$getLineEnd_u24lambda_u2430.getParagraph().getLineEnd($this$getLineEnd_u24lambda_u2430.toLocalLineIndex(lineIndex), visibleEnd));
/*      */   }
/*      */   
/*      */   public final boolean isLineEllipsized(int lineIndex) {
/*      */     requireLineIndexInRange(lineIndex);
/*      */     int paragraphIndex = MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex);
/*      */     ParagraphInfo $this$isLineEllipsized_u24lambda_u2431 = this.paragraphInfoList.get(paragraphIndex);
/*      */     int $i$a$-with-MultiParagraph$isLineEllipsized$1 = 0;
/*      */     return $this$isLineEllipsized_u24lambda_u2431.getParagraph().isLineEllipsized(lineIndex);
/*      */   }
/*      */   
/*      */   private final void requireIndexInRange(int offset) {
/*      */     if (!((0 <= offset) ? ((offset < getAnnotatedString().getText().length()) ? 1 : 0) : 0)) {
/*      */       int $i$a$-require-MultiParagraph$requireIndexInRange$1 = 0;
/*      */       String str = "offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ')';
/*      */       throw new IllegalArgumentException(str.toString());
/*      */     } 
/*      */   }
/*      */   
/*      */   private final void requireIndexInRangeInclusiveEnd(int offset) {
/*      */     if (!((0 <= offset) ? ((offset <= getAnnotatedString().getText().length()) ? 1 : 0) : 0)) {
/*      */       int $i$a$-require-MultiParagraph$requireIndexInRangeInclusiveEnd$1 = 0;
/*      */       String str = "offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ']';
/*      */       throw new IllegalArgumentException(str.toString());
/*      */     } 
/*      */   }
/*      */   
/*      */   private final void requireLineIndexInRange(int lineIndex) {
/*      */     if (!((0 <= lineIndex) ? ((lineIndex < this.lineCount) ? 1 : 0) : 0)) {
/*      */       int $i$a$-require-MultiParagraph$requireLineIndexInRange$1 = 0;
/*      */       String str = "lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')';
/*      */       throw new IllegalArgumentException(str.toString());
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\MultiParagraph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */