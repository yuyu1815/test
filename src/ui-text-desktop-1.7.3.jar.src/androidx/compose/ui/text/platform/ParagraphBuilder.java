/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.FontRasterizationSettings;
/*     */ import androidx.compose.ui.text.FontRasterizationSettings_skikoKt;
/*     */ import androidx.compose.ui.text.Placeholder;
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.style.LineHeightStyle;
/*     */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*     */ import androidx.compose.ui.text.style.TextIndent;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.PropertyReference0;
/*     */ import kotlin.jvm.internal.PropertyReference0Impl;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.Font;
/*     */ import org.jetbrains.skia.FontMetrics;
/*     */ import org.jetbrains.skia.Paint;
/*     */ import org.jetbrains.skia.paragraph.FontRastrSettings;
/*     */ import org.jetbrains.skia.paragraph.HeightMode;
/*     */ import org.jetbrains.skia.paragraph.LineMetrics;
/*     */ import org.jetbrains.skia.paragraph.Paragraph;
/*     */ import org.jetbrains.skia.paragraph.ParagraphStyle;
/*     */ import org.jetbrains.skia.paragraph.TextIndent;
/*     */ import org.jetbrains.skia.paragraph.TextStyle;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000¨\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\020\n\002\030\002\n\002\b\013\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\b\000\030\0002\0020\001:\002cdB\001\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\b\b\002\020\n\032\0020\005\022\b\b\002\020\013\032\0020\f\022\022\020\r\032\016\022\n\022\b\022\004\022\0020\0200\0170\016\022\022\020\021\032\016\022\n\022\b\022\004\022\0020\0220\0170\016\022\006\020\023\032\0020\024\022\006\020\025\032\0020\026\022\n\b\002\020\027\032\004\030\0010\030\022\b\b\002\020\031\032\0020\032¢\006\002\020\033J\006\020I\032\0020JJ\035\020K\032\b\022\004\022\0020M0L2\006\020N\032\0020JH\000¢\006\004\bO\020PJ6\020Q\032\b\022\004\022\0020>0\0162\022\020R\032\016\022\n\022\b\022\004\022\0020\0200\0170\0162\022\020\021\032\016\022\n\022\b\022\004\022\0020\0220\0170\016H\002J\020\020S\032\0020T2\006\020U\032\0020\007H\002J\020\020V\032\0020W2\006\020U\032\0020-H\002J\026\020X\032\0020-2\f\020Y\032\b\022\004\022\0020\0200\016H\002J\b\020Z\032\0020[H\002J \020\\\032\004\030\0010]2\006\020^\032\0020\f2\f\020=\032\b\022\004\022\0020>0\016H\002J\030\020_\032\0020`2\006\020U\032\0020\0072\006\020a\032\0020-H\002J\020\020b\032\0020[2\b\020N\032\004\030\0010JR\"\020\031\032\0020\032X\016ø\001\000ø\001\001¢\006\020\n\002\020 \032\004\b\034\020\035\"\004\b\036\020\037R\"\020\b\032\0020\tX\016ø\001\000ø\001\001¢\006\020\n\002\020%\032\004\b!\020\"\"\004\b#\020$R\033\020&\032\0020'8@X\002¢\006\f\n\004\b*\020+\032\004\b(\020)R\016\020,\032\0020-X\004¢\006\002\n\000R\021\020\023\032\0020\024¢\006\b\n\000\032\004\b.\020/R\034\020\027\032\004\030\0010\030X\016¢\006\016\n\000\032\004\b0\0201\"\004\b2\0203R\032\020\n\032\0020\005X\016¢\006\016\n\000\032\004\b4\0205\"\004\b6\0207R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b8\0209R\016\020:\032\0020\020X.¢\006\002\n\000R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b;\020\035\"\004\b<\020\037R\024\020=\032\b\022\004\022\0020>0\016X.¢\006\002\n\000R\035\020\021\032\016\022\n\022\b\022\004\022\0020\0220\0170\016¢\006\b\n\000\032\004\b?\020@R\035\020\r\032\016\022\n\022\b\022\004\022\0020\0200\0170\016¢\006\b\n\000\032\004\bA\020@R\021\020\004\032\0020\005¢\006\b\n\000\032\004\bB\0205R\021\020\025\032\0020\026¢\006\b\n\000\032\004\bC\020DR\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\bE\020F\"\004\bG\020H\002\013\n\005\b¡\0360\001\n\002\b!¨\006e"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder;", "", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "text", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "brushSize", "Landroidx/compose/ui/geometry/Size;", "ellipsis", "maxLines", "", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "textDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLjava/lang/String;ILjava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "I", "getBrushSize-NH-jbRc", "()J", "setBrushSize-uvyYCjk", "(J)V", "J", "defaultFont", "Lorg/jetbrains/skia/Font;", "getDefaultFont$ui_text", "()Lorg/jetbrains/skia/Font;", "defaultFont$delegate", "Lkotlin/Lazy;", "defaultStyle", "Landroidx/compose/ui/text/platform/ComputedStyle;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setDrawStyle", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "getEllipsis", "()Ljava/lang/String;", "setEllipsis", "(Ljava/lang/String;)V", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "initialStyle", "getMaxLines", "setMaxLines", "ops", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "getPlaceholders", "()Ljava/util/List;", "getSpanStyles", "getText", "getTextDirection", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "setTextStyle", "(Landroidx/compose/ui/text/TextStyle;)V", "build", "Lorg/jetbrains/skia/paragraph/Paragraph;", "emptyLineMetrics", "", "Lorg/jetbrains/skia/paragraph/LineMetrics;", "paragraph", "emptyLineMetrics$ui_text", "(Lorg/jetbrains/skia/paragraph/Paragraph;)[Lorg/jetbrains/skia/paragraph/LineMetrics;", "makeOps", "spans", "makeSkFontRasterizationSettings", "Lorg/jetbrains/skia/paragraph/FontRastrSettings;", "style", "makeSkTextStyle", "Lorg/jetbrains/skia/paragraph/TextStyle;", "mergeStyles", "activeStyles", "prepareDefaultStyle", "", "previousStyleAddAtTheSamePosition", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd;", "position", "textStyleToParagraphStyle", "Lorg/jetbrains/skia/paragraph/ParagraphStyle;", "computedStyle", "updateForegroundPaint", "Cut", "Op", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nParagraphBuilder.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphBuilder.skiko.kt\nandroidx/compose/ui/text/platform/ParagraphBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,717:1\n1002#2,2:718\n1#3:720\n*S KotlinDebug\n*F\n+ 1 ParagraphBuilder.skiko.kt\nandroidx/compose/ui/text/platform/ParagraphBuilder\n*L\n427#1:718,2\n*E\n"})
/*     */ public final class ParagraphBuilder
/*     */ {
/*     */   @NotNull
/*     */   private final FontFamily.Resolver fontFamilyResolver;
/*     */   @NotNull
/*     */   private final String text;
/*     */   @NotNull
/*     */   private TextStyle textStyle;
/*     */   private long brushSize;
/*     */   @NotNull
/*     */   private String ellipsis;
/*     */   private int maxLines;
/*     */   @NotNull
/*     */   private final List<AnnotatedString.Range<SpanStyle>> spanStyles;
/*     */   @NotNull
/*     */   private final List<AnnotatedString.Range<Placeholder>> placeholders;
/*     */   @NotNull
/*     */   private final Density density;
/*     */   @NotNull
/*     */   private final ResolvedTextDirection textDirection;
/*     */   @Nullable
/*     */   private DrawStyle drawStyle;
/*     */   private int blendMode;
/*     */   @NotNull
/*     */   private final ComputedStyle defaultStyle;
/*     */   private SpanStyle initialStyle;
/*     */   private List<? extends Op> ops;
/*     */   @NotNull
/*     */   private final Lazy defaultFont$delegate;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   private ParagraphBuilder(FontFamily.Resolver fontFamilyResolver, String text, TextStyle textStyle, long brushSize, String ellipsis, int maxLines, List<AnnotatedString.Range<SpanStyle>> spanStyles, List<AnnotatedString.Range<Placeholder>> placeholders, Density density, ResolvedTextDirection textDirection, DrawStyle drawStyle, int blendMode) {
/* 256 */     this.fontFamilyResolver = fontFamilyResolver;
/* 257 */     this.text = text;
/* 258 */     this.textStyle = textStyle;
/* 259 */     this.brushSize = brushSize;
/* 260 */     this.ellipsis = ellipsis;
/* 261 */     this.maxLines = maxLines;
/* 262 */     this.spanStyles = spanStyles;
/* 263 */     this.placeholders = placeholders;
/* 264 */     this.density = density;
/* 265 */     this.textDirection = textDirection;
/* 266 */     this.drawStyle = drawStyle;
/* 267 */     this.blendMode = blendMode;
/*     */     
/* 269 */     this.defaultStyle = new ComputedStyle(null, 0L, 0.0F, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 0, null, 524287, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 539 */     this.defaultFont$delegate = LazyKt.lazy(new ParagraphBuilder$defaultFont$2());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final FontFamily.Resolver getFontFamilyResolver() {
/*     */     return this.fontFamilyResolver;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     return this.text;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextStyle getTextStyle() {
/*     */     return this.textStyle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setTextStyle(@NotNull TextStyle <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.textStyle = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getBrushSize-NH-jbRc() {
/*     */     return this.brushSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setBrushSize-uvyYCjk(long <set-?>) {
/*     */     this.brushSize = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final String getEllipsis() {
/*     */     return this.ellipsis;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setEllipsis(@NotNull String <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.ellipsis = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getMaxLines() {
/*     */     return this.maxLines;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setMaxLines(int <set-?>) {
/*     */     this.maxLines = <set-?>;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<AnnotatedString.Range<SpanStyle>> getSpanStyles() {
/*     */     return this.spanStyles;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
/*     */     return this.placeholders;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Density getDensity() {
/*     */     return this.density;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ResolvedTextDirection getTextDirection() {
/*     */     return this.textDirection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final DrawStyle getDrawStyle() {
/*     */     return this.drawStyle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final List<Op> makeOps(List spans, List placeholders) {
/*     */     List<Cut.StyleAdd> cuts = new ArrayList();
/*     */     for (AnnotatedString.Range span : spans) {
/*     */       cuts.add(new Cut.StyleAdd(span.getStart(), (SpanStyle)span.getItem()));
/*     */       cuts.add(new Cut.StyleRemove(span.getEnd(), (SpanStyle)span.getItem()));
/*     */     } 
/*     */     for (AnnotatedString.Range placeholder : placeholders) {
/*     */       cuts.add(new Cut.PutPlaceholder(placeholder.getStart(), (Placeholder)placeholder.getItem()));
/*     */       cuts.add(new Cut.EndPlaceholder(placeholder.getEnd()));
/*     */     } 
/*     */     Op[] arrayOfOp = new Op[1];
/*     */     arrayOfOp[0] = new Op.StyleAdd(0, this.defaultStyle);
/*     */     List<? extends Op> ops = CollectionsKt.mutableListOf((Object[])arrayOfOp);
/*     */     List<Cut.StyleAdd> $this$sortBy$iv = cuts;
/*     */     int $i$f$sortBy = 0;
/* 718 */     if ($this$sortBy$iv.size() > 1) CollectionsKt.sortWith($this$sortBy$iv, new ParagraphBuilder$makeOps$$inlined$sortBy$1());  SpanStyle[] arrayOfSpanStyle = new SpanStyle[1]; if (this.initialStyle == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("initialStyle");  false[this.initialStyle] = null; List<SpanStyle> activeStyles = CollectionsKt.mutableListOf((Object[])arrayOfSpanStyle); for (Cut cut : cuts) { Cut cut1 = cut; if (cut1 instanceof Cut.StyleAdd) { activeStyles.add(((Cut.StyleAdd)cut).getStyle()); Op.StyleAdd prev = previousStyleAddAtTheSamePosition(cut.getPosition(), ops); if (prev == null) {
/* 720 */           ComputedStyle computedStyle1 = mergeStyles(activeStyles), computedStyle2 = computedStyle1; int i = cut.getPosition(); List<? extends Op> list = ops; int $i$a$-also-ParagraphBuilder$makeOps$2 = 0;
/*     */           computedStyle2.merge(this.density, ((Cut.StyleAdd)cut).getStyle());
/*     */           Unit unit = Unit.INSTANCE;
/*     */           ComputedStyle computedStyle3 = computedStyle1;
/*     */           int j = i;
/*     */           list.add(new Op.StyleAdd(j, computedStyle3));
/*     */           continue;
/*     */         } 
/*     */         prev.getStyle().merge(this.density, ((Cut.StyleAdd)cut).getStyle());
/*     */         continue; }
/*     */       
/*     */       if (cut1 instanceof Cut.StyleRemove) {
/*     */         activeStyles.remove(((Cut.StyleRemove)cut).getStyle());
/*     */         ops.add(new Op.StyleAdd(cut.getPosition(), mergeStyles(activeStyles)));
/*     */         continue;
/*     */       } 
/*     */       if (cut1 instanceof Cut.PutPlaceholder) {
/*     */         ComputedStyle currentStyle = mergeStyles(activeStyles);
/*     */         Op.PutPlaceholder op = new Op.PutPlaceholder((Cut.PutPlaceholder)cut, SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$toPx-o2QH7mI(((Cut.PutPlaceholder)cut).getPlaceholder().getWidth-XSAIIZE(), this.density, currentStyle.getFontSize()), SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$toPx-o2QH7mI(((Cut.PutPlaceholder)cut).getPlaceholder().getHeight-XSAIIZE(), this.density, currentStyle.getFontSize()));
/*     */         ops.add(op);
/*     */         continue;
/*     */       } 
/*     */       if (cut1 instanceof Cut.EndPlaceholder)
/*     */         ops.add(new Op.EndPlaceholder((Cut.EndPlaceholder)cut));  }
/*     */     
/*     */     return (List)ops;
/*     */   }
/*     */   
/*     */   public final void setDrawStyle(@Nullable DrawStyle <set-?>) {
/*     */     this.drawStyle = <set-?>;
/*     */   }
/*     */   
/*     */   public final int getBlendMode-0nO6VwU() {
/*     */     return this.blendMode;
/*     */   }
/*     */   
/*     */   public final void setBlendMode-s9anfk8(int <set-?>) {
/*     */     this.blendMode = <set-?>;
/*     */   }
/*     */   
/*     */   private final void prepareDefaultStyle() {
/*     */     this.initialStyle = SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$copyWithDefaultFontSize(this.textStyle.toSpanStyle(), this.drawStyle);
/*     */     if (this.initialStyle == null)
/*     */       Intrinsics.throwUninitializedPropertyAccessException("initialStyle"); 
/*     */     this.density.set-p7glnfI((Density)this.initialStyle, null, this.brushSize, this.blendMode, this.textStyle.getLineHeight-XSAIIZE());
/*     */   }
/*     */   
/*     */   public final void updateForegroundPaint(@Nullable Paragraph paragraph) {
/*     */     if (paragraph == null)
/*     */       return; 
/*     */     prepareDefaultStyle();
/*     */     Paint foregroundPaint = this.defaultStyle.getForegroundPaint();
/*     */     paragraph.updateForegroundPaint(0, this.text.length(), foregroundPaint);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Paragraph build() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokespecial prepareDefaultStyle : ()V
/*     */     //   4: aload_0
/*     */     //   5: aload_0
/*     */     //   6: aload_0
/*     */     //   7: getfield spanStyles : Ljava/util/List;
/*     */     //   10: aload_0
/*     */     //   11: getfield placeholders : Ljava/util/List;
/*     */     //   14: invokespecial makeOps : (Ljava/util/List;Ljava/util/List;)Ljava/util/List;
/*     */     //   17: putfield ops : Ljava/util/List;
/*     */     //   20: iconst_0
/*     */     //   21: istore_1
/*     */     //   22: aload_0
/*     */     //   23: aload_0
/*     */     //   24: getfield textStyle : Landroidx/compose/ui/text/TextStyle;
/*     */     //   27: aload_0
/*     */     //   28: getfield defaultStyle : Landroidx/compose/ui/text/platform/ComputedStyle;
/*     */     //   31: invokespecial textStyleToParagraphStyle : (Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/platform/ComputedStyle;)Lorg/jetbrains/skia/paragraph/ParagraphStyle;
/*     */     //   34: astore_2
/*     */     //   35: aload_0
/*     */     //   36: getfield maxLines : I
/*     */     //   39: ldc 2147483647
/*     */     //   41: if_icmpeq -> 60
/*     */     //   44: aload_2
/*     */     //   45: aload_0
/*     */     //   46: getfield maxLines : I
/*     */     //   49: invokevirtual setMaxLinesCount : (I)V
/*     */     //   52: aload_2
/*     */     //   53: aload_0
/*     */     //   54: getfield ellipsis : Ljava/lang/String;
/*     */     //   57: invokevirtual setEllipsis : (Ljava/lang/String;)V
/*     */     //   60: aload_0
/*     */     //   61: getfield fontFamilyResolver : Landroidx/compose/ui/text/font/FontFamily$Resolver;
/*     */     //   64: dup
/*     */     //   65: ldc 'null cannot be cast to non-null type androidx.compose.ui.text.font.FontFamilyResolverImpl'
/*     */     //   67: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   70: checkcast androidx/compose/ui/text/font/FontFamilyResolverImpl
/*     */     //   73: invokevirtual getPlatformFontLoader$ui_text : ()Landroidx/compose/ui/text/font/PlatformFontLoader;
/*     */     //   76: astore_3
/*     */     //   77: aload_3
/*     */     //   78: instanceof androidx/compose/ui/text/font/SkiaFontLoader
/*     */     //   81: ifeq -> 94
/*     */     //   84: aload_3
/*     */     //   85: checkcast androidx/compose/ui/text/font/SkiaFontLoader
/*     */     //   88: invokevirtual getFontCollection : ()Lorg/jetbrains/skia/paragraph/FontCollection;
/*     */     //   91: goto -> 122
/*     */     //   94: new java/lang/IllegalStateException
/*     */     //   97: dup
/*     */     //   98: new java/lang/StringBuilder
/*     */     //   101: dup
/*     */     //   102: invokespecial <init> : ()V
/*     */     //   105: ldc_w 'Unsupported font loader '
/*     */     //   108: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   111: aload_3
/*     */     //   112: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   115: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   118: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   121: athrow
/*     */     //   122: astore #4
/*     */     //   124: new org/jetbrains/skia/paragraph/ParagraphBuilder
/*     */     //   127: dup
/*     */     //   128: aload_2
/*     */     //   129: aload #4
/*     */     //   131: invokespecial <init> : (Lorg/jetbrains/skia/paragraph/ParagraphStyle;Lorg/jetbrains/skia/paragraph/FontCollection;)V
/*     */     //   134: astore #5
/*     */     //   136: iconst_1
/*     */     //   137: istore #6
/*     */     //   139: aload_0
/*     */     //   140: getfield ops : Ljava/util/List;
/*     */     //   143: dup
/*     */     //   144: ifnonnull -> 155
/*     */     //   147: pop
/*     */     //   148: ldc_w 'ops'
/*     */     //   151: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*     */     //   154: aconst_null
/*     */     //   155: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   160: astore #7
/*     */     //   162: aload #7
/*     */     //   164: invokeinterface hasNext : ()Z
/*     */     //   169: ifeq -> 440
/*     */     //   172: aload #7
/*     */     //   174: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   179: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op
/*     */     //   182: astore #8
/*     */     //   184: iload #6
/*     */     //   186: ifeq -> 220
/*     */     //   189: iload_1
/*     */     //   190: aload #8
/*     */     //   192: invokevirtual getPosition : ()I
/*     */     //   195: if_icmpge -> 220
/*     */     //   198: aload #5
/*     */     //   200: aload_0
/*     */     //   201: getfield text : Ljava/lang/String;
/*     */     //   204: iload_1
/*     */     //   205: aload #8
/*     */     //   207: invokevirtual getPosition : ()I
/*     */     //   210: invokevirtual subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   213: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   216: invokevirtual addText : (Ljava/lang/String;)Lorg/jetbrains/skia/paragraph/ParagraphBuilder;
/*     */     //   219: pop
/*     */     //   220: aload #8
/*     */     //   222: astore #9
/*     */     //   224: aload #9
/*     */     //   226: instanceof androidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd
/*     */     //   229: ifeq -> 352
/*     */     //   232: aload_0
/*     */     //   233: getfield fontFamilyResolver : Landroidx/compose/ui/text/font/FontFamily$Resolver;
/*     */     //   236: aload #8
/*     */     //   238: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd
/*     */     //   241: invokevirtual getStyle : ()Landroidx/compose/ui/text/platform/ComputedStyle;
/*     */     //   244: invokevirtual getFontFamily : ()Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   247: aload #8
/*     */     //   249: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd
/*     */     //   252: invokevirtual getStyle : ()Landroidx/compose/ui/text/platform/ComputedStyle;
/*     */     //   255: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   258: dup
/*     */     //   259: ifnonnull -> 269
/*     */     //   262: pop
/*     */     //   263: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   266: invokevirtual getNormal : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   269: aload #8
/*     */     //   271: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd
/*     */     //   274: invokevirtual getStyle : ()Landroidx/compose/ui/text/platform/ComputedStyle;
/*     */     //   277: invokevirtual getFontStyle-4Lr2A7w : ()Landroidx/compose/ui/text/font/FontStyle;
/*     */     //   280: dup
/*     */     //   281: ifnull -> 290
/*     */     //   284: invokevirtual unbox-impl : ()I
/*     */     //   287: goto -> 297
/*     */     //   290: pop
/*     */     //   291: getstatic androidx/compose/ui/text/font/FontStyle.Companion : Landroidx/compose/ui/text/font/FontStyle$Companion;
/*     */     //   294: invokevirtual getNormal-_-LCdwA : ()I
/*     */     //   297: aload #8
/*     */     //   299: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd
/*     */     //   302: invokevirtual getStyle : ()Landroidx/compose/ui/text/platform/ComputedStyle;
/*     */     //   305: invokevirtual getFontSynthesis-ZQGJjVo : ()Landroidx/compose/ui/text/font/FontSynthesis;
/*     */     //   308: dup
/*     */     //   309: ifnull -> 318
/*     */     //   312: invokevirtual unbox-impl : ()I
/*     */     //   315: goto -> 325
/*     */     //   318: pop
/*     */     //   319: getstatic androidx/compose/ui/text/font/FontSynthesis.Companion : Landroidx/compose/ui/text/font/FontSynthesis$Companion;
/*     */     //   322: invokevirtual getAll-GVVA2EU : ()I
/*     */     //   325: invokeinterface resolve-DPcqOEQ : (Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;
/*     */     //   330: pop
/*     */     //   331: aload #5
/*     */     //   333: aload_0
/*     */     //   334: aload #8
/*     */     //   336: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd
/*     */     //   339: invokevirtual getStyle : ()Landroidx/compose/ui/text/platform/ComputedStyle;
/*     */     //   342: invokespecial makeSkTextStyle : (Landroidx/compose/ui/text/platform/ComputedStyle;)Lorg/jetbrains/skia/paragraph/TextStyle;
/*     */     //   345: invokevirtual pushStyle : (Lorg/jetbrains/skia/paragraph/TextStyle;)Lorg/jetbrains/skia/paragraph/ParagraphBuilder;
/*     */     //   348: pop
/*     */     //   349: goto -> 431
/*     */     //   352: aload #9
/*     */     //   354: instanceof androidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder
/*     */     //   357: ifeq -> 420
/*     */     //   360: new org/jetbrains/skia/paragraph/PlaceholderStyle
/*     */     //   363: dup
/*     */     //   364: aload #8
/*     */     //   366: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder
/*     */     //   369: invokevirtual getWidth : ()F
/*     */     //   372: aload #8
/*     */     //   374: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder
/*     */     //   377: invokevirtual getHeight : ()F
/*     */     //   380: aload #8
/*     */     //   382: checkcast androidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder
/*     */     //   385: invokevirtual getCut : ()Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;
/*     */     //   388: invokevirtual getPlaceholder : ()Landroidx/compose/ui/text/Placeholder;
/*     */     //   391: invokevirtual getPlaceholderVerticalAlign-J6kI3mc : ()I
/*     */     //   394: invokestatic toSkPlaceholderAlignment-do9X-Gg : (I)Lorg/jetbrains/skia/paragraph/PlaceholderAlignment;
/*     */     //   397: getstatic org/jetbrains/skia/paragraph/BaselineMode.ALPHABETIC : Lorg/jetbrains/skia/paragraph/BaselineMode;
/*     */     //   400: fconst_0
/*     */     //   401: invokespecial <init> : (FFLorg/jetbrains/skia/paragraph/PlaceholderAlignment;Lorg/jetbrains/skia/paragraph/BaselineMode;F)V
/*     */     //   404: astore #10
/*     */     //   406: aload #5
/*     */     //   408: aload #10
/*     */     //   410: invokevirtual addPlaceholder : (Lorg/jetbrains/skia/paragraph/PlaceholderStyle;)Lorg/jetbrains/skia/paragraph/ParagraphBuilder;
/*     */     //   413: pop
/*     */     //   414: iconst_0
/*     */     //   415: istore #6
/*     */     //   417: goto -> 431
/*     */     //   420: aload #9
/*     */     //   422: instanceof androidx/compose/ui/text/platform/ParagraphBuilder$Op$EndPlaceholder
/*     */     //   425: ifeq -> 431
/*     */     //   428: iconst_1
/*     */     //   429: istore #6
/*     */     //   431: aload #8
/*     */     //   433: invokevirtual getPosition : ()I
/*     */     //   436: istore_1
/*     */     //   437: goto -> 162
/*     */     //   440: iload #6
/*     */     //   442: ifeq -> 480
/*     */     //   445: iload_1
/*     */     //   446: aload_0
/*     */     //   447: getfield text : Ljava/lang/String;
/*     */     //   450: invokevirtual length : ()I
/*     */     //   453: if_icmpge -> 480
/*     */     //   456: aload #5
/*     */     //   458: aload_0
/*     */     //   459: getfield text : Ljava/lang/String;
/*     */     //   462: iload_1
/*     */     //   463: aload_0
/*     */     //   464: getfield text : Ljava/lang/String;
/*     */     //   467: invokevirtual length : ()I
/*     */     //   470: invokevirtual subSequence : (II)Ljava/lang/CharSequence;
/*     */     //   473: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   476: invokevirtual addText : (Ljava/lang/String;)Lorg/jetbrains/skia/paragraph/ParagraphBuilder;
/*     */     //   479: pop
/*     */     //   480: aload #5
/*     */     //   482: invokevirtual build : ()Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   485: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #298	-> 0
/*     */     //   #299	-> 4
/*     */     //   #300	-> 6
/*     */     //   #301	-> 10
/*     */     //   #299	-> 14
/*     */     //   #304	-> 20
/*     */     //   #305	-> 22
/*     */     //   #306	-> 35
/*     */     //   #307	-> 44
/*     */     //   #308	-> 52
/*     */     //   #312	-> 60
/*     */     //   #313	-> 77
/*     */     //   #314	-> 78
/*     */     //   #315	-> 94
/*     */     //   #313	-> 122
/*     */     //   #318	-> 124
/*     */     //   #320	-> 136
/*     */     //   #322	-> 139
/*     */     //   #323	-> 184
/*     */     //   #324	-> 198
/*     */     //   #327	-> 220
/*     */     //   #328	-> 224
/*     */     //   #330	-> 232
/*     */     //   #331	-> 236
/*     */     //   #332	-> 247
/*     */     //   #333	-> 269
/*     */     //   #334	-> 297
/*     */     //   #330	-> 325
/*     */     //   #336	-> 331
/*     */     //   #338	-> 352
/*     */     //   #340	-> 360
/*     */     //   #341	-> 364
/*     */     //   #342	-> 372
/*     */     //   #343	-> 380
/*     */     //   #344	-> 394
/*     */     //   #346	-> 397
/*     */     //   #347	-> 400
/*     */     //   #340	-> 401
/*     */     //   #339	-> 404
/*     */     //   #349	-> 406
/*     */     //   #350	-> 414
/*     */     //   #352	-> 420
/*     */     //   #353	-> 428
/*     */     //   #357	-> 431
/*     */     //   #360	-> 440
/*     */     //   #361	-> 456
/*     */     //   #364	-> 480
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   406	11	10	placeholderStyle	Lorg/jetbrains/skia/paragraph/PlaceholderStyle;
/*     */     //   184	253	8	op	Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;
/*     */     //   22	464	1	pos	I
/*     */     //   35	451	2	ps	Lorg/jetbrains/skia/paragraph/ParagraphStyle;
/*     */     //   77	409	3	platformFontLoader	Landroidx/compose/ui/text/font/PlatformFontLoader;
/*     */     //   124	362	4	fontCollection	Lorg/jetbrains/skia/paragraph/FontCollection;
/*     */     //   136	350	5	pb	Lorg/jetbrains/skia/paragraph/ParagraphBuilder;
/*     */     //   139	347	6	addText	Z
/*     */     //   0	486	0	this	Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b2\030\0002\0020\001:\003\007\b\tB\007\b\004¢\006\002\020\002R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006\001\003\n\013\f¨\006\r"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "", "()V", "position", "", "getPosition", "()I", "EndPlaceholder", "PutPlaceholder", "StyleAdd", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$EndPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd;", "ui-text"})
/*     */   private static abstract class Op {
/*     */     private Op() {}
/*     */     
/*     */     public abstract int getPosition();
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "position", "", "style", "Landroidx/compose/ui/text/platform/ComputedStyle;", "(ILandroidx/compose/ui/text/platform/ComputedStyle;)V", "getPosition", "()I", "getStyle", "()Landroidx/compose/ui/text/platform/ComputedStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */     @StabilityInferred(parameters = 0)
/*     */     public static final class StyleAdd extends Op {
/*     */       private final int position;
/*     */       @NotNull
/*     */       private final ComputedStyle style;
/*     */       public static final int $stable = 8;
/*     */       
/*     */       public int getPosition() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final ComputedStyle getStyle() {
/*     */         return this.style;
/*     */       }
/*     */       
/*     */       public StyleAdd(int position, @NotNull ComputedStyle style) {
/*     */         super(null);
/*     */         this.position = position;
/*     */         this.style = style;
/*     */       }
/*     */       
/*     */       public final int component1() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final ComputedStyle component2() {
/*     */         return this.style;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final StyleAdd copy(int position, @NotNull ComputedStyle style) {
/*     */         Intrinsics.checkNotNullParameter(style, "style");
/*     */         return new StyleAdd(position, style);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "StyleAdd(position=" + this.position + ", style=" + this.style + ')';
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = Integer.hashCode(this.position);
/*     */         return result * 31 + this.style.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof StyleAdd))
/*     */           return false; 
/*     */         StyleAdd styleAdd = (StyleAdd)other;
/*     */         return (this.position != styleAdd.position) ? false : (!!Intrinsics.areEqual(this.style, styleAdd.style));
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\t\n\002\020\b\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\005HÆ\003J'\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\035HÖ\003J\t\020\036\032\0020\017HÖ\001J\t\020\037\032\0020 HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\032\020\006\032\0020\005X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\033\020\016\032\0020\0178VX\002¢\006\f\032\004\b\022\020\023*\004\b\020\020\021R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\024\020\013\"\004\b\025\020\r¨\006!"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "cut", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;", "width", "", "height", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;FF)V", "getCut", "()Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;", "getHeight", "()F", "setHeight", "(F)V", "position", "", "getPosition$delegate", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder;)Ljava/lang/Object;", "getPosition", "()I", "getWidth", "setWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */     @StabilityInferred(parameters = 0)
/*     */     public static final class PutPlaceholder extends Op {
/*     */       @NotNull
/*     */       private final ParagraphBuilder.Cut.PutPlaceholder cut;
/*     */       private float width;
/*     */       private float height;
/*     */       public static final int $stable = 8;
/*     */       
/*     */       @NotNull
/*     */       public final ParagraphBuilder.Cut.PutPlaceholder getCut() {
/*     */         return this.cut;
/*     */       }
/*     */       
/*     */       public final float getWidth() {
/*     */         return this.width;
/*     */       }
/*     */       
/*     */       public final void setWidth(float <set-?>) {
/*     */         this.width = <set-?>;
/*     */       }
/*     */       
/*     */       public final float getHeight() {
/*     */         return this.height;
/*     */       }
/*     */       
/*     */       public final void setHeight(float <set-?>) {
/*     */         this.height = <set-?>;
/*     */       }
/*     */       
/*     */       public PutPlaceholder(@NotNull ParagraphBuilder.Cut.PutPlaceholder cut, float width, float height) {
/*     */         super(null);
/*     */         this.cut = cut;
/*     */         this.width = width;
/*     */         this.height = height;
/*     */       }
/*     */       
/*     */       public int getPosition() {
/*     */         return this.cut.getPosition();
/*     */       }
/*     */       
/*     */       private static Object getPosition$delegate(PutPlaceholder <this>) {
/*     */         return Reflection.property0((PropertyReference0)new PropertyReference0Impl(<this>.cut, ParagraphBuilder.Cut.PutPlaceholder.class, "position", "getPosition()I", 0));
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final ParagraphBuilder.Cut.PutPlaceholder component1() {
/*     */         return this.cut;
/*     */       }
/*     */       
/*     */       public final float component2() {
/*     */         return this.width;
/*     */       }
/*     */       
/*     */       public final float component3() {
/*     */         return this.height;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final PutPlaceholder copy(@NotNull ParagraphBuilder.Cut.PutPlaceholder cut, float width, float height) {
/*     */         Intrinsics.checkNotNullParameter(cut, "cut");
/*     */         return new PutPlaceholder(cut, width, height);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "PutPlaceholder(cut=" + this.cut + ", width=" + this.width + ", height=" + this.height + ')';
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = this.cut.hashCode();
/*     */         result = result * 31 + Float.hashCode(this.width);
/*     */         return result * 31 + Float.hashCode(this.height);
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof PutPlaceholder))
/*     */           return false; 
/*     */         PutPlaceholder putPlaceholder = (PutPlaceholder)other;
/*     */         return !Intrinsics.areEqual(this.cut, putPlaceholder.cut) ? false : ((Float.compare(this.width, putPlaceholder.width) != 0) ? false : (!(Float.compare(this.height, putPlaceholder.height) != 0)));
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\bHÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\033\020\007\032\0020\b8VX\002¢\006\f\032\004\b\013\020\f*\004\b\t\020\n¨\006\026"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$EndPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "cut", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;)V", "getCut", "()Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;", "position", "", "getPosition$delegate", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$EndPlaceholder;)Ljava/lang/Object;", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */     @StabilityInferred(parameters = 0)
/*     */     public static final class EndPlaceholder extends Op {
/*     */       @NotNull
/*     */       private final ParagraphBuilder.Cut.EndPlaceholder cut;
/*     */       public static final int $stable = 8;
/*     */       
/*     */       @NotNull
/*     */       public final ParagraphBuilder.Cut.EndPlaceholder getCut() {
/*     */         return this.cut;
/*     */       }
/*     */       
/*     */       public EndPlaceholder(@NotNull ParagraphBuilder.Cut.EndPlaceholder cut) {
/*     */         super(null);
/*     */         this.cut = cut;
/*     */       }
/*     */       
/*     */       public int getPosition() {
/*     */         return this.cut.getPosition();
/*     */       }
/*     */       
/*     */       private static Object getPosition$delegate(EndPlaceholder <this>) {
/*     */         return Reflection.property0((PropertyReference0)new PropertyReference0Impl(<this>.cut, ParagraphBuilder.Cut.EndPlaceholder.class, "position", "getPosition()I", 0));
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final ParagraphBuilder.Cut.EndPlaceholder component1() {
/*     */         return this.cut;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final EndPlaceholder copy(@NotNull ParagraphBuilder.Cut.EndPlaceholder cut) {
/*     */         Intrinsics.checkNotNullParameter(cut, "cut");
/*     */         return new EndPlaceholder(cut);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "EndPlaceholder(cut=" + this.cut + ')';
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.cut.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof EndPlaceholder))
/*     */           return false; 
/*     */         EndPlaceholder endPlaceholder = (EndPlaceholder)other;
/*     */         return !!Intrinsics.areEqual(this.cut, endPlaceholder.cut);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$StyleAdd;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "position", "", "style", "Landroidx/compose/ui/text/platform/ComputedStyle;", "(ILandroidx/compose/ui/text/platform/ComputedStyle;)V", "getPosition", "()I", "getStyle", "()Landroidx/compose/ui/text/platform/ComputedStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class StyleAdd extends Op {
/*     */     private final int position;
/*     */     @NotNull
/*     */     private final ComputedStyle style;
/*     */     public static final int $stable = 8;
/*     */     
/*     */     public int getPosition() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ComputedStyle getStyle() {
/*     */       return this.style;
/*     */     }
/*     */     
/*     */     public StyleAdd(int position, @NotNull ComputedStyle style) {
/*     */       super(null);
/*     */       this.position = position;
/*     */       this.style = style;
/*     */     }
/*     */     
/*     */     public final int component1() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ComputedStyle component2() {
/*     */       return this.style;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final StyleAdd copy(int position, @NotNull ComputedStyle style) {
/*     */       Intrinsics.checkNotNullParameter(style, "style");
/*     */       return new StyleAdd(position, style);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "StyleAdd(position=" + this.position + ", style=" + this.style + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Integer.hashCode(this.position);
/*     */       return result * 31 + this.style.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof StyleAdd))
/*     */         return false; 
/*     */       StyleAdd styleAdd = (StyleAdd)other;
/*     */       return (this.position != styleAdd.position) ? false : (!!Intrinsics.areEqual(this.style, styleAdd.style));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\t\n\002\020\b\n\002\b\013\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\t\020\026\032\0020\003HÆ\003J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\005HÆ\003J'\020\031\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\035HÖ\003J\t\020\036\032\0020\017HÖ\001J\t\020\037\032\0020 HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\032\020\006\032\0020\005X\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\033\020\016\032\0020\0178VX\002¢\006\f\032\004\b\022\020\023*\004\b\020\020\021R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\024\020\013\"\004\b\025\020\r¨\006!"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "cut", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;", "width", "", "height", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;FF)V", "getCut", "()Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;", "getHeight", "()F", "setHeight", "(F)V", "position", "", "getPosition$delegate", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$PutPlaceholder;)Ljava/lang/Object;", "getPosition", "()I", "getWidth", "setWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class PutPlaceholder extends Op {
/*     */     @NotNull
/*     */     private final ParagraphBuilder.Cut.PutPlaceholder cut;
/*     */     private float width;
/*     */     private float height;
/*     */     public static final int $stable = 8;
/*     */     
/*     */     @NotNull
/*     */     public final ParagraphBuilder.Cut.PutPlaceholder getCut() {
/*     */       return this.cut;
/*     */     }
/*     */     
/*     */     public final float getWidth() {
/*     */       return this.width;
/*     */     }
/*     */     
/*     */     public final void setWidth(float <set-?>) {
/*     */       this.width = <set-?>;
/*     */     }
/*     */     
/*     */     public final float getHeight() {
/*     */       return this.height;
/*     */     }
/*     */     
/*     */     public final void setHeight(float <set-?>) {
/*     */       this.height = <set-?>;
/*     */     }
/*     */     
/*     */     public PutPlaceholder(@NotNull ParagraphBuilder.Cut.PutPlaceholder cut, float width, float height) {
/*     */       super(null);
/*     */       this.cut = cut;
/*     */       this.width = width;
/*     */       this.height = height;
/*     */     }
/*     */     
/*     */     public int getPosition() {
/*     */       return this.cut.getPosition();
/*     */     }
/*     */     
/*     */     private static Object getPosition$delegate(PutPlaceholder <this>) {
/*     */       return Reflection.property0((PropertyReference0)new PropertyReference0Impl(<this>.cut, ParagraphBuilder.Cut.PutPlaceholder.class, "position", "getPosition()I", 0));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ParagraphBuilder.Cut.PutPlaceholder component1() {
/*     */       return this.cut;
/*     */     }
/*     */     
/*     */     public final float component2() {
/*     */       return this.width;
/*     */     }
/*     */     
/*     */     public final float component3() {
/*     */       return this.height;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final PutPlaceholder copy(@NotNull ParagraphBuilder.Cut.PutPlaceholder cut, float width, float height) {
/*     */       Intrinsics.checkNotNullParameter(cut, "cut");
/*     */       return new PutPlaceholder(cut, width, height);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "PutPlaceholder(cut=" + this.cut + ", width=" + this.width + ", height=" + this.height + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.cut.hashCode();
/*     */       result = result * 31 + Float.hashCode(this.width);
/*     */       return result * 31 + Float.hashCode(this.height);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof PutPlaceholder))
/*     */         return false; 
/*     */       PutPlaceholder putPlaceholder = (PutPlaceholder)other;
/*     */       return !Intrinsics.areEqual(this.cut, putPlaceholder.cut) ? false : ((Float.compare(this.width, putPlaceholder.width) != 0) ? false : (!(Float.compare(this.height, putPlaceholder.height) != 0)));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\r\032\0020\003HÆ\003J\023\020\016\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\022HÖ\003J\t\020\023\032\0020\bHÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\033\020\007\032\0020\b8VX\002¢\006\f\032\004\b\013\020\f*\004\b\t\020\n¨\006\026"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$EndPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Op;", "cut", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;)V", "getCut", "()Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;", "position", "", "getPosition$delegate", "(Landroidx/compose/ui/text/platform/ParagraphBuilder$Op$EndPlaceholder;)Ljava/lang/Object;", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */   @StabilityInferred(parameters = 0)
/*     */   public static final class EndPlaceholder extends Op {
/*     */     @NotNull
/*     */     private final ParagraphBuilder.Cut.EndPlaceholder cut;
/*     */     public static final int $stable = 8;
/*     */     
/*     */     @NotNull
/*     */     public final ParagraphBuilder.Cut.EndPlaceholder getCut() {
/*     */       return this.cut;
/*     */     }
/*     */     
/*     */     public EndPlaceholder(@NotNull ParagraphBuilder.Cut.EndPlaceholder cut) {
/*     */       super(null);
/*     */       this.cut = cut;
/*     */     }
/*     */     
/*     */     public int getPosition() {
/*     */       return this.cut.getPosition();
/*     */     }
/*     */     
/*     */     private static Object getPosition$delegate(EndPlaceholder <this>) {
/*     */       return Reflection.property0((PropertyReference0)new PropertyReference0Impl(<this>.cut, ParagraphBuilder.Cut.EndPlaceholder.class, "position", "getPosition()I", 0));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ParagraphBuilder.Cut.EndPlaceholder component1() {
/*     */       return this.cut;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final EndPlaceholder copy(@NotNull ParagraphBuilder.Cut.EndPlaceholder cut) {
/*     */       Intrinsics.checkNotNullParameter(cut, "cut");
/*     */       return new EndPlaceholder(cut);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "EndPlaceholder(cut=" + this.cut + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.cut.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof EndPlaceholder))
/*     */         return false; 
/*     */       EndPlaceholder endPlaceholder = (EndPlaceholder)other;
/*     */       return !!Intrinsics.areEqual(this.cut, endPlaceholder.cut);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\b\n\002\b\006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b2\030\0002\0020\001:\004\007\b\t\nB\007\b\004¢\006\002\020\002R\022\020\003\032\0020\004X¦\004¢\006\006\032\004\b\005\020\006\001\004\013\f\r\016¨\006\017"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "", "()V", "position", "", "getPosition", "()I", "EndPlaceholder", "PutPlaceholder", "StyleAdd", "StyleRemove", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$StyleAdd;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$StyleRemove;", "ui-text"})
/*     */   private static abstract class Cut {
/*     */     private Cut() {}
/*     */     
/*     */     public abstract int getPosition();
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$StyleAdd;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "style", "Landroidx/compose/ui/text/SpanStyle;", "(ILandroidx/compose/ui/text/SpanStyle;)V", "getPosition", "()I", "getStyle", "()Landroidx/compose/ui/text/SpanStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class StyleAdd extends Cut {
/*     */       private final int position;
/*     */       @NotNull
/*     */       private final SpanStyle style;
/*     */       public static final int $stable;
/*     */       
/*     */       public int getPosition() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final SpanStyle getStyle() {
/*     */         return this.style;
/*     */       }
/*     */       
/*     */       public StyleAdd(int position, @NotNull SpanStyle style) {
/*     */         super(null);
/*     */         this.position = position;
/*     */         this.style = style;
/*     */       }
/*     */       
/*     */       public final int component1() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final SpanStyle component2() {
/*     */         return this.style;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final StyleAdd copy(int position, @NotNull SpanStyle style) {
/*     */         Intrinsics.checkNotNullParameter(style, "style");
/*     */         return new StyleAdd(position, style);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "StyleAdd(position=" + this.position + ", style=" + this.style + ')';
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = Integer.hashCode(this.position);
/*     */         return result * 31 + this.style.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof StyleAdd))
/*     */           return false; 
/*     */         StyleAdd styleAdd = (StyleAdd)other;
/*     */         return (this.position != styleAdd.position) ? false : (!!Intrinsics.areEqual(this.style, styleAdd.style));
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$StyleRemove;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "style", "Landroidx/compose/ui/text/SpanStyle;", "(ILandroidx/compose/ui/text/SpanStyle;)V", "getPosition", "()I", "getStyle", "()Landroidx/compose/ui/text/SpanStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class StyleRemove extends Cut {
/*     */       private final int position;
/*     */       @NotNull
/*     */       private final SpanStyle style;
/*     */       public static final int $stable;
/*     */       
/*     */       public int getPosition() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final SpanStyle getStyle() {
/*     */         return this.style;
/*     */       }
/*     */       
/*     */       public StyleRemove(int position, @NotNull SpanStyle style) {
/*     */         super(null);
/*     */         this.position = position;
/*     */         this.style = style;
/*     */       }
/*     */       
/*     */       public final int component1() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final SpanStyle component2() {
/*     */         return this.style;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final StyleRemove copy(int position, @NotNull SpanStyle style) {
/*     */         Intrinsics.checkNotNullParameter(style, "style");
/*     */         return new StyleRemove(position, style);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "StyleRemove(position=" + this.position + ", style=" + this.style + ')';
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = Integer.hashCode(this.position);
/*     */         return result * 31 + this.style.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof StyleRemove))
/*     */           return false; 
/*     */         StyleRemove styleRemove = (StyleRemove)other;
/*     */         return (this.position != styleRemove.position) ? false : (!!Intrinsics.areEqual(this.style, styleRemove.style));
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "(ILandroidx/compose/ui/text/Placeholder;)V", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class PutPlaceholder extends Cut {
/*     */       private final int position;
/*     */       @NotNull
/*     */       private final Placeholder placeholder;
/*     */       public static final int $stable;
/*     */       
/*     */       public int getPosition() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Placeholder getPlaceholder() {
/*     */         return this.placeholder;
/*     */       }
/*     */       
/*     */       public PutPlaceholder(int position, @NotNull Placeholder placeholder) {
/*     */         super(null);
/*     */         this.position = position;
/*     */         this.placeholder = placeholder;
/*     */       }
/*     */       
/*     */       public final int component1() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Placeholder component2() {
/*     */         return this.placeholder;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final PutPlaceholder copy(int position, @NotNull Placeholder placeholder) {
/*     */         Intrinsics.checkNotNullParameter(placeholder, "placeholder");
/*     */         return new PutPlaceholder(position, placeholder);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "PutPlaceholder(position=" + this.position + ", placeholder=" + this.placeholder + ')';
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = Integer.hashCode(this.position);
/*     */         return result * 31 + this.placeholder.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof PutPlaceholder))
/*     */           return false; 
/*     */         PutPlaceholder putPlaceholder = (PutPlaceholder)other;
/*     */         return (this.position != putPlaceholder.position) ? false : (!!Intrinsics.areEqual(this.placeholder, putPlaceholder.placeholder));
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\003HÖ\001J\t\020\016\032\0020\017HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */     @StabilityInferred(parameters = 1)
/*     */     public static final class EndPlaceholder extends Cut {
/*     */       private final int position;
/*     */       public static final int $stable;
/*     */       
/*     */       public EndPlaceholder(int position) {
/*     */         super(null);
/*     */         this.position = position;
/*     */       }
/*     */       
/*     */       public int getPosition() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       public final int component1() {
/*     */         return this.position;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final EndPlaceholder copy(int position) {
/*     */         return new EndPlaceholder(position);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "EndPlaceholder(position=" + this.position + ')';
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return Integer.hashCode(this.position);
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof EndPlaceholder))
/*     */           return false; 
/*     */         EndPlaceholder endPlaceholder = (EndPlaceholder)other;
/*     */         return !(this.position != endPlaceholder.position);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$StyleAdd;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "style", "Landroidx/compose/ui/text/SpanStyle;", "(ILandroidx/compose/ui/text/SpanStyle;)V", "getPosition", "()I", "getStyle", "()Landroidx/compose/ui/text/SpanStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class StyleAdd extends Cut {
/*     */     private final int position;
/*     */     @NotNull
/*     */     private final SpanStyle style;
/*     */     public static final int $stable;
/*     */     
/*     */     public int getPosition() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpanStyle getStyle() {
/*     */       return this.style;
/*     */     }
/*     */     
/*     */     public StyleAdd(int position, @NotNull SpanStyle style) {
/*     */       super(null);
/*     */       this.position = position;
/*     */       this.style = style;
/*     */     }
/*     */     
/*     */     public final int component1() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpanStyle component2() {
/*     */       return this.style;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final StyleAdd copy(int position, @NotNull SpanStyle style) {
/*     */       Intrinsics.checkNotNullParameter(style, "style");
/*     */       return new StyleAdd(position, style);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "StyleAdd(position=" + this.position + ", style=" + this.style + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Integer.hashCode(this.position);
/*     */       return result * 31 + this.style.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof StyleAdd))
/*     */         return false; 
/*     */       StyleAdd styleAdd = (StyleAdd)other;
/*     */       return (this.position != styleAdd.position) ? false : (!!Intrinsics.areEqual(this.style, styleAdd.style));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$StyleRemove;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "style", "Landroidx/compose/ui/text/SpanStyle;", "(ILandroidx/compose/ui/text/SpanStyle;)V", "getPosition", "()I", "getStyle", "()Landroidx/compose/ui/text/SpanStyle;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class StyleRemove extends Cut {
/*     */     private final int position;
/*     */     @NotNull
/*     */     private final SpanStyle style;
/*     */     public static final int $stable;
/*     */     
/*     */     public int getPosition() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpanStyle getStyle() {
/*     */       return this.style;
/*     */     }
/*     */     
/*     */     public StyleRemove(int position, @NotNull SpanStyle style) {
/*     */       super(null);
/*     */       this.position = position;
/*     */       this.style = style;
/*     */     }
/*     */     
/*     */     public final int component1() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final SpanStyle component2() {
/*     */       return this.style;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final StyleRemove copy(int position, @NotNull SpanStyle style) {
/*     */       Intrinsics.checkNotNullParameter(style, "style");
/*     */       return new StyleRemove(position, style);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "StyleRemove(position=" + this.position + ", style=" + this.style + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Integer.hashCode(this.position);
/*     */       return result * 31 + this.style.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof StyleRemove))
/*     */         return false; 
/*     */       StyleRemove styleRemove = (StyleRemove)other;
/*     */       return (this.position != styleRemove.position) ? false : (!!Intrinsics.areEqual(this.style, styleRemove.style));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\t\020\013\032\0020\003HÆ\003J\t\020\f\032\0020\005HÆ\003J\035\020\r\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\016\032\0020\0172\b\020\020\032\004\030\0010\021HÖ\003J\t\020\022\032\0020\003HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\bR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\t\020\n¨\006\025"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$PutPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "(ILandroidx/compose/ui/text/Placeholder;)V", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class PutPlaceholder extends Cut {
/*     */     private final int position;
/*     */     @NotNull
/*     */     private final Placeholder placeholder;
/*     */     public static final int $stable;
/*     */     
/*     */     public int getPosition() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Placeholder getPlaceholder() {
/*     */       return this.placeholder;
/*     */     }
/*     */     
/*     */     public PutPlaceholder(int position, @NotNull Placeholder placeholder) {
/*     */       super(null);
/*     */       this.position = position;
/*     */       this.placeholder = placeholder;
/*     */     }
/*     */     
/*     */     public final int component1() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Placeholder component2() {
/*     */       return this.placeholder;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final PutPlaceholder copy(int position, @NotNull Placeholder placeholder) {
/*     */       Intrinsics.checkNotNullParameter(placeholder, "placeholder");
/*     */       return new PutPlaceholder(position, placeholder);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "PutPlaceholder(position=" + this.position + ", placeholder=" + this.placeholder + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = Integer.hashCode(this.position);
/*     */       return result * 31 + this.placeholder.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof PutPlaceholder))
/*     */         return false; 
/*     */       PutPlaceholder putPlaceholder = (PutPlaceholder)other;
/*     */       return (this.position != putPlaceholder.position) ? false : (!!Intrinsics.areEqual(this.placeholder, putPlaceholder.placeholder));
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\003HÖ\001J\t\020\016\032\0020\017HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut$EndPlaceholder;", "Landroidx/compose/ui/text/platform/ParagraphBuilder$Cut;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui-text"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class EndPlaceholder extends Cut {
/*     */     private final int position;
/*     */     public static final int $stable;
/*     */     
/*     */     public EndPlaceholder(int position) {
/*     */       super(null);
/*     */       this.position = position;
/*     */     }
/*     */     
/*     */     public int getPosition() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     public final int component1() {
/*     */       return this.position;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final EndPlaceholder copy(int position) {
/*     */       return new EndPlaceholder(position);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "EndPlaceholder(position=" + this.position + ')';
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return Integer.hashCode(this.position);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof EndPlaceholder))
/*     */         return false; 
/*     */       EndPlaceholder endPlaceholder = (EndPlaceholder)other;
/*     */       return !(this.position != endPlaceholder.position);
/*     */     }
/*     */   }
/*     */   
/*     */   private final ComputedStyle mergeStyles(List<SpanStyle> activeStyles) {
/*     */     ComputedStyle style = new ComputedStyle(this.density, activeStyles.get(0), this.brushSize, this.blendMode, this.textStyle.getLineHeight-XSAIIZE(), null);
/*     */     for (int i = 1, j = activeStyles.size(); i < j; i++)
/*     */       style.merge(this.density, activeStyles.get(i)); 
/*     */     return style;
/*     */   }
/*     */   
/*     */   private final Op.StyleAdd previousStyleAddAtTheSamePosition(int position, List ops) {
/*     */     for (Op prevOp : CollectionsKt.asReversed(ops)) {
/*     */       if (prevOp.getPosition() < position)
/*     */         return null; 
/*     */       if (prevOp instanceof Op.StyleAdd)
/*     */         return (Op.StyleAdd)prevOp; 
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   private final FontRastrSettings makeSkFontRasterizationSettings(TextStyle style) {
/*     */     if (style.getParagraphStyle$ui_text().getPlatformStyle() == null || style.getParagraphStyle$ui_text().getPlatformStyle().getFontRasterizationSettings() == null)
/*     */       style.getParagraphStyle$ui_text().getPlatformStyle().getFontRasterizationSettings(); 
/*     */     FontRasterizationSettings rasterizationSettings = FontRasterizationSettings.Companion.getPlatformDefault();
/*     */     return FontRasterizationSettings_skikoKt.toSkFontRastrSettings(rasterizationSettings);
/*     */   }
/*     */   
/*     */   private final ParagraphStyle textStyleToParagraphStyle(TextStyle style, ComputedStyle computedStyle) {
/*     */     ParagraphStyle pStyle = new ParagraphStyle();
/*     */     pStyle.setFontRastrSettings(makeSkFontRasterizationSettings(style));
/*     */     pStyle.setTextStyle(makeSkTextStyle(computedStyle));
/*     */     int it = style.getTextAlign-e0LSkKk(), $i$a$-let-ParagraphBuilder$textStyleToParagraphStyle$1 = 0;
/*     */     pStyle.setAlignment(SkiaParagraph_skikoKt.toSkAlignment-aXe7zB0(it));
/*     */     Float lineHeight = computedStyle.getLineHeight();
/*     */     if (lineHeight != null && lineHeight.floatValue() > computedStyle.getFontSize()) {
/*     */       if (style.getLineHeightStyle() == null)
/*     */         style.getLineHeightStyle(); 
/*     */       LineHeightStyle lineHeightStyle = LineHeightStyle.Companion.getDefault();
/*     */       pStyle.setHeightMode(SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$toHeightMode-XeJ9Kts(lineHeightStyle.getTrim-EVpEnUU()));
/*     */     } else {
/*     */       pStyle.setHeightMode(HeightMode.DISABLE_ALL);
/*     */     } 
/*     */     pStyle.setDirection(SkiaParagraph_skikoKt.toSkDirection(this.textDirection));
/*     */     TextIndent $this$textStyleToParagraphStyle_u24lambda_u244 = this.textStyle.getTextIndent();
/*     */     int $i$a$-run-ParagraphBuilder$textStyleToParagraphStyle$2 = 0;
/*     */     Density $this$textStyleToParagraphStyle_u24lambda_u244_u24lambda_u243 = this.density;
/*     */     int $i$a$-with-ParagraphBuilder$textStyleToParagraphStyle$2$1 = 0;
/*     */     pStyle.setTextIndent(new TextIndent($this$textStyleToParagraphStyle_u24lambda_u244_u24lambda_u243.toPx--R2X_6o($this$textStyleToParagraphStyle_u24lambda_u244.getFirstLine-XSAIIZE()), $this$textStyleToParagraphStyle_u24lambda_u244_u24lambda_u243.toPx--R2X_6o($this$textStyleToParagraphStyle_u24lambda_u244.getRestLine-XSAIIZE())));
/*     */     this.textStyle.getTextIndent();
/*     */     return pStyle;
/*     */   }
/*     */   
/*     */   private final TextStyle makeSkTextStyle(ComputedStyle style) {
/*     */     return (TextStyle)SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$getSkTextStylesCache$p().get(style, new ParagraphBuilder$makeSkTextStyle$1());
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lorg/jetbrains/skia/paragraph/TextStyle;", "it", "Landroidx/compose/ui/text/platform/ComputedStyle;", "invoke"})
/*     */   static final class ParagraphBuilder$makeSkTextStyle$1 extends Lambda implements Function1<ComputedStyle, TextStyle> {
/*     */     @NotNull
/*     */     public final TextStyle invoke(@NotNull ComputedStyle it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return it.toSkTextStyle(ParagraphBuilder.this.getFontFamilyResolver());
/*     */     }
/*     */     
/*     */     ParagraphBuilder$makeSkTextStyle$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Font getDefaultFont$ui_text() {
/*     */     Lazy lazy = this.defaultFont$delegate;
/*     */     return (Font)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Lorg/jetbrains/skia/Font;", "invoke"})
/*     */   static final class ParagraphBuilder$defaultFont$2 extends Lambda implements Function0<Font> {
/*     */     @NotNull
/*     */     public final Font invoke() {
/*     */       FontLoadResult loadResult = SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$resolveFontFamily(ParagraphBuilder.this.getTextStyle(), ParagraphBuilder.this.getFontFamilyResolver());
/*     */       return new Font((loadResult != null) ? loadResult.getTypeface() : null, ParagraphBuilder.this.defaultStyle.getFontSize());
/*     */     }
/*     */     
/*     */     ParagraphBuilder$defaultFont$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LineMetrics[] emptyLineMetrics$ui_text(@NotNull Paragraph paragraph) {
/*     */     Intrinsics.checkNotNullParameter(paragraph, "paragraph");
/*     */     FontMetrics metrics = getDefaultFont$ui_text().getMetrics();
/*     */     float it = this.defaultStyle.getLineHeight().floatValue();
/*     */     int $i$a$-let-ParagraphBuilder$emptyLineMetrics$heightMultiplier$1 = 0;
/*     */     this.defaultStyle.getLineHeight();
/*     */     double heightMultiplier = (this.defaultStyle.getLineHeight() != null) ? (it / this.defaultStyle.getFontSize()) : 1.0D;
/*     */     double ascent = metrics.getAscent() * heightMultiplier;
/*     */     double descent = metrics.getDescent() * heightMultiplier;
/*     */     double baseline = paragraph.getAlphabeticBaseline();
/*     */     double height = descent - ascent;
/*     */     LineMetrics[] arrayOfLineMetrics = new LineMetrics[1];
/*     */     arrayOfLineMetrics[0] = new LineMetrics(0, 0, 0, 0, true, -ascent, descent, ascent, height, 0.0D, 0.0D, baseline, 0);
/*     */     return arrayOfLineMetrics;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\ParagraphBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */