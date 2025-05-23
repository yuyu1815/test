/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.graphics.BlendMode;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.Font;
/*     */ import org.jetbrains.skia.paragraph.LineMetrics;
/*     */ import org.jetbrains.skia.paragraph.Paragraph;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000®\001\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\013\n\000\n\002\020\007\n\000\n\002\020\021\n\002\030\002\n\002\b\004\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001BU\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\022\020\b\032\016\022\n\022\b\022\004\022\0020\0130\n0\t\022\022\020\f\032\016\022\n\022\b\022\004\022\0020\r0\n0\t\022\006\020\016\032\0020\017\022\006\020\020\032\0020\021¢\006\002\020\022J\035\020$\032\b\022\004\022\0020&0%2\006\020'\032\0020\032H\000¢\006\004\b(\020)J\022\020*\032\0020+2\b\b\002\020,\032\0020!H\002J\016\020-\032\0020\0322\006\020\"\032\0020#J\030\020.\032\0020+2\006\020/\032\00200ø\001\000¢\006\004\b1\0202J*\0203\032\0020+2\b\0204\032\004\030\001052\006\0206\032\002072\006\0208\032\0020#ø\001\000¢\006\004\b9\020:J\030\020;\032\0020+2\006\0206\032\00207ø\001\000¢\006\004\b<\020=J\030\020>\032\0020+2\006\020?\032\0020@ø\001\000¢\006\004\bA\020=J\020\020B\032\0020+2\b\020C\032\004\030\0010DJ\026\020E\032\0020+2\006\020F\032\0020G2\006\020H\032\0020\003J\032\020I\032\0020+2\b\020J\032\004\030\0010K2\b\020L\032\004\030\0010MR\016\020\023\032\0020\024X\004¢\006\002\n\000R\021\020\025\032\0020\0268F¢\006\006\032\004\b\027\020\030R\020\020\031\032\004\030\0010\032X\016¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\033\020\034R\021\020\035\032\0020\0078F¢\006\006\032\004\b\036\020\037R\016\020 \032\0020!X\016¢\006\002\n\000R\016\020\"\032\0020#X\016¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006N"}, d2 = {"Landroidx/compose/ui/text/platform/ParagraphLayouter;", "", "text", "", "textDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Ljava/lang/String;Landroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "builder", "Landroidx/compose/ui/text/platform/ParagraphBuilder;", "defaultFont", "Lorg/jetbrains/skia/Font;", "getDefaultFont", "()Lorg/jetbrains/skia/Font;", "paragraphCache", "Lorg/jetbrains/skia/paragraph/Paragraph;", "getText", "()Ljava/lang/String;", "textStyle", "getTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "updateForeground", "", "width", "", "emptyLineMetrics", "", "Lorg/jetbrains/skia/paragraph/LineMetrics;", "paragraph", "emptyLineMetrics$ui_text", "(Lorg/jetbrains/skia/paragraph/Paragraph;)[Lorg/jetbrains/skia/paragraph/LineMetrics;", "invalidateParagraph", "", "onlyForeground", "layoutParagraph", "setBlendMode", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "setBlendMode-s9anfk8", "(I)V", "setBrush", "brush", "Landroidx/compose/ui/graphics/Brush;", "brushSize", "Landroidx/compose/ui/geometry/Size;", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setBrushSize", "setBrushSize-uvyYCjk", "(J)V", "setColor", "color", "Landroidx/compose/ui/graphics/Color;", "setColor-8_81llA", "setDrawStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setParagraphStyle", "maxLines", "", "ellipsis", "setTextStyle", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nParagraphLayouter.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphLayouter.skiko.kt\nandroidx/compose/ui/text/platform/ParagraphLayouter\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n708#2:223\n696#2:224\n205#3:225\n1747#4,3:226\n*S KotlinDebug\n*F\n+ 1 ParagraphLayouter.skiko.kt\nandroidx/compose/ui/text/platform/ParagraphLayouter\n*L\n114#1:223\n114#1:224\n130#1:225\n154#1:226,3\n*E\n"})
/*     */ public final class ParagraphLayouter
/*     */ {
/*     */   @NotNull
/*     */   private final String text;
/*     */   @NotNull
/*     */   private final ParagraphBuilder builder;
/*     */   @Nullable
/*     */   private Paragraph paragraphCache;
/*     */   private boolean updateForeground;
/*     */   private float width;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   public ParagraphLayouter(@NotNull String text, @NotNull ResolvedTextDirection textDirection, @NotNull TextStyle style, @NotNull List spanStyles, @NotNull List placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
/*  61 */     this.text = text;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  69 */     this.builder = new ParagraphBuilder(
/*  70 */         fontFamilyResolver, 
/*  71 */         this.text, 
/*  72 */         style, 0L, null, 0, 
/*  73 */         spanStyles, 
/*  74 */         placeholders, 
/*  75 */         density, 
/*  76 */         textDirection, null, 0, 3128, null);
/*     */ 
/*     */ 
/*     */     
/*  80 */     this.width = Float.NaN; } @NotNull
/*     */   public final Font getDefaultFont() {
/*  82 */     return this.builder.getDefaultFont$ui_text(); } @NotNull
/*  83 */   public final TextStyle getTextStyle() { return this.builder.getTextStyle(); }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void invalidateParagraph(boolean onlyForeground) {
/*  88 */     if (onlyForeground && this.builder.getSpanStyles().isEmpty()) {
/*  89 */       this.updateForeground = true;
/*     */     } else {
/*  91 */       this.paragraphCache = null;
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   public final LineMetrics[] emptyLineMetrics$ui_text(@NotNull Paragraph paragraph) {
/*  96 */     Intrinsics.checkNotNullParameter(paragraph, "paragraph"); return this.builder.emptyLineMetrics$ui_text(paragraph);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setParagraphStyle(int maxLines, @NotNull String ellipsis) {
/* 102 */     Intrinsics.checkNotNullParameter(ellipsis, "ellipsis"); if (this.builder.getMaxLines() != maxLines || 
/* 103 */       !Intrinsics.areEqual(this.builder.getEllipsis(), ellipsis)) {
/*     */       
/* 105 */       this.builder.setMaxLines(maxLines);
/* 106 */       this.builder.setEllipsis(ellipsis);
/* 107 */       invalidateParagraph$default(this, false, 1, null);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setColor-8_81llA(long color) {
/* 114 */     long $this$takeOrElse_u2dDxMtmZc$iv = color; int $i$f$takeOrElse-DxMtmZc = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     long $this$isSpecified$iv$iv = $this$takeOrElse_u2dDxMtmZc$iv; int $i$f$isSpecified-8_81llA = 0;
/* 224 */     if (($this$isSpecified$iv$iv != 16L)) {
/*     */     
/*     */     } else {
/*     */       int $i$a$-takeOrElse-DxMtmZc-ParagraphLayouter$setColor$actualColor$1 = 0;
/*     */     } 
/*     */     long actualColor = this.builder.getTextStyle().getColor-0d7_KjU();
/*     */     if (!Color.equals-impl0(this.builder.getTextStyle().getColor-0d7_KjU(), actualColor)) {
/*     */       this.builder.setTextStyle(TextStyle.copy-p1EtxEg$default(this.builder.getTextStyle(), actualColor, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null));
/*     */       invalidateParagraph(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void setBrush-12SF9DM(@Nullable Brush brush, long brushSize, float alpha) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   4: invokevirtual getBrushSize-NH-jbRc : ()J
/*     */     //   7: lstore #5
/*     */     //   9: aload_0
/*     */     //   10: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   13: invokevirtual getTextStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   16: invokevirtual getBrush : ()Landroidx/compose/ui/graphics/Brush;
/*     */     //   19: aload_1
/*     */     //   20: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   23: ifeq -> 98
/*     */     //   26: lload #5
/*     */     //   28: lstore #7
/*     */     //   30: iconst_0
/*     */     //   31: istore #9
/*     */     //   33: lload #7
/*     */     //   35: ldc2_w 9205357640488583168
/*     */     //   38: lcmp
/*     */     //   39: ifne -> 46
/*     */     //   42: iconst_1
/*     */     //   43: goto -> 47
/*     */     //   46: iconst_0
/*     */     //   47: ifne -> 98
/*     */     //   50: lload #5
/*     */     //   52: invokestatic getWidth-impl : (J)F
/*     */     //   55: lload_2
/*     */     //   56: invokestatic getWidth-impl : (J)F
/*     */     //   59: invokestatic access$sameValueAs : (FF)Z
/*     */     //   62: ifeq -> 98
/*     */     //   65: lload #5
/*     */     //   67: invokestatic getHeight-impl : (J)F
/*     */     //   70: lload_2
/*     */     //   71: invokestatic getHeight-impl : (J)F
/*     */     //   74: invokestatic access$sameValueAs : (FF)Z
/*     */     //   77: ifeq -> 98
/*     */     //   80: aload_0
/*     */     //   81: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   84: invokevirtual getTextStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   87: invokevirtual getAlpha : ()F
/*     */     //   90: fload #4
/*     */     //   92: invokestatic access$sameValueAs : (FF)Z
/*     */     //   95: ifne -> 157
/*     */     //   98: aload_0
/*     */     //   99: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   102: aload_0
/*     */     //   103: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   106: invokevirtual getTextStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   109: aload_1
/*     */     //   110: fload #4
/*     */     //   112: lconst_0
/*     */     //   113: aconst_null
/*     */     //   114: aconst_null
/*     */     //   115: aconst_null
/*     */     //   116: aconst_null
/*     */     //   117: aconst_null
/*     */     //   118: lconst_0
/*     */     //   119: aconst_null
/*     */     //   120: aconst_null
/*     */     //   121: aconst_null
/*     */     //   122: lconst_0
/*     */     //   123: aconst_null
/*     */     //   124: aconst_null
/*     */     //   125: aconst_null
/*     */     //   126: iconst_0
/*     */     //   127: iconst_0
/*     */     //   128: lconst_0
/*     */     //   129: aconst_null
/*     */     //   130: aconst_null
/*     */     //   131: aconst_null
/*     */     //   132: iconst_0
/*     */     //   133: iconst_0
/*     */     //   134: aconst_null
/*     */     //   135: ldc 33554428
/*     */     //   137: aconst_null
/*     */     //   138: invokestatic copy-Ns73l9s$default : (Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILjava/lang/Object;)Landroidx/compose/ui/text/TextStyle;
/*     */     //   141: invokevirtual setTextStyle : (Landroidx/compose/ui/text/TextStyle;)V
/*     */     //   144: aload_0
/*     */     //   145: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   148: lload_2
/*     */     //   149: invokevirtual setBrushSize-uvyYCjk : (J)V
/*     */     //   152: aload_0
/*     */     //   153: iconst_1
/*     */     //   154: invokespecial invalidateParagraph : (Z)V
/*     */     //   157: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #128	-> 0
/*     */     //   #129	-> 9
/*     */     //   #130	-> 26
/*     */     //   #225	-> 33
/*     */     //   #130	-> 47
/*     */     //   #131	-> 50
/*     */     //   #132	-> 65
/*     */     //   #133	-> 80
/*     */     //   #135	-> 98
/*     */     //   #136	-> 109
/*     */     //   #137	-> 110
/*     */     //   #135	-> 112
/*     */     //   #139	-> 144
/*     */     //   #140	-> 152
/*     */     //   #142	-> 157
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   33	14	9	$i$f$isUnspecified-uvyYCjk	I
/*     */     //   30	17	7	$this$isUnspecified$iv	J
/*     */     //   9	149	5	actualSize	J
/*     */     //   0	158	0	this	Landroidx/compose/ui/text/platform/ParagraphLayouter;
/*     */     //   0	158	1	brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   0	158	2	brushSize	J
/*     */     //   0	158	4	alpha	F
/*     */   }
/*     */   
/*     */   public final void setBrushSize-uvyYCjk(long brushSize) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   4: invokevirtual getBrushSize-NH-jbRc : ()J
/*     */     //   7: lload_1
/*     */     //   8: invokestatic equals-impl0 : (JJ)Z
/*     */     //   11: ifne -> 142
/*     */     //   14: aload_0
/*     */     //   15: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   18: lload_1
/*     */     //   19: invokevirtual setBrushSize-uvyYCjk : (J)V
/*     */     //   22: aload_0
/*     */     //   23: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   26: invokevirtual getTextStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   29: invokevirtual getBrush : ()Landroidx/compose/ui/graphics/Brush;
/*     */     //   32: instanceof androidx/compose/ui/graphics/ShaderBrush
/*     */     //   35: ifne -> 137
/*     */     //   38: aload_0
/*     */     //   39: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   42: invokevirtual getSpanStyles : ()Ljava/util/List;
/*     */     //   45: checkcast java/lang/Iterable
/*     */     //   48: astore_3
/*     */     //   49: iconst_0
/*     */     //   50: istore #4
/*     */     //   52: aload_3
/*     */     //   53: instanceof java/util/Collection
/*     */     //   56: ifeq -> 75
/*     */     //   59: aload_3
/*     */     //   60: checkcast java/util/Collection
/*     */     //   63: invokeinterface isEmpty : ()Z
/*     */     //   68: ifeq -> 75
/*     */     //   71: iconst_0
/*     */     //   72: goto -> 134
/*     */     //   75: aload_3
/*     */     //   76: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   81: astore #5
/*     */     //   83: aload #5
/*     */     //   85: invokeinterface hasNext : ()Z
/*     */     //   90: ifeq -> 133
/*     */     //   93: aload #5
/*     */     //   95: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   100: astore #6
/*     */     //   102: aload #6
/*     */     //   104: checkcast androidx/compose/ui/text/AnnotatedString$Range
/*     */     //   107: astore #7
/*     */     //   109: iconst_0
/*     */     //   110: istore #8
/*     */     //   112: aload #7
/*     */     //   114: invokevirtual getItem : ()Ljava/lang/Object;
/*     */     //   117: checkcast androidx/compose/ui/text/SpanStyle
/*     */     //   120: invokevirtual getBrush : ()Landroidx/compose/ui/graphics/Brush;
/*     */     //   123: instanceof androidx/compose/ui/graphics/ShaderBrush
/*     */     //   126: ifeq -> 83
/*     */     //   129: iconst_1
/*     */     //   130: goto -> 134
/*     */     //   133: iconst_0
/*     */     //   134: ifeq -> 142
/*     */     //   137: aload_0
/*     */     //   138: iconst_1
/*     */     //   139: invokespecial invalidateParagraph : (Z)V
/*     */     //   142: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #147	-> 0
/*     */     //   #148	-> 14
/*     */     //   #153	-> 22
/*     */     //   #154	-> 38
/*     */     //   #226	-> 52
/*     */     //   #227	-> 75
/*     */     //   #154	-> 112
/*     */     //   #227	-> 126
/*     */     //   #228	-> 133
/*     */     //   #154	-> 134
/*     */     //   #155	-> 137
/*     */     //   #158	-> 142
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   112	14	8	$i$a$-any-ParagraphLayouter$setBrushSize$1	I
/*     */     //   109	17	7	it	Landroidx/compose/ui/text/AnnotatedString$Range;
/*     */     //   102	31	6	element$iv	Ljava/lang/Object;
/*     */     //   52	82	4	$i$f$any	I
/*     */     //   49	85	3	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	143	0	this	Landroidx/compose/ui/text/platform/ParagraphLayouter;
/*     */     //   0	143	1	brushSize	J
/*     */   }
/*     */   
/*     */   public final void setTextStyle(@Nullable Shadow shadow, @Nullable TextDecoration textDecoration) {
/*     */     if (!Intrinsics.areEqual(this.builder.getTextStyle().getShadow(), shadow) || !Intrinsics.areEqual(this.builder.getTextStyle().getTextDecoration(), textDecoration)) {
/*     */       this.builder.setTextStyle(TextStyle.copy-p1EtxEg$default(this.builder.getTextStyle(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, textDecoration, shadow, null, 0, 0, 0L, null, null, null, 0, 0, null, 16764927, null));
/*     */       invalidateParagraph$default(this, false, 1, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void setDrawStyle(@Nullable DrawStyle drawStyle) {
/*     */     if (!Intrinsics.areEqual(this.builder.getDrawStyle(), drawStyle)) {
/*     */       this.builder.setDrawStyle(drawStyle);
/*     */       invalidateParagraph(true);
/*     */     } 
/*     */   }
/*     */   
/*     */   public final void setBlendMode-s9anfk8(int blendMode) {
/*     */     if (!BlendMode.equals-impl0(this.builder.getBlendMode-0nO6VwU(), blendMode)) {
/*     */       this.builder.setBlendMode-s9anfk8(blendMode);
/*     */       invalidateParagraph$default(this, false, 1, null);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Paragraph layoutParagraph(float width) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield paragraphCache : Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   4: astore_2
/*     */     //   5: aload_2
/*     */     //   6: ifnull -> 70
/*     */     //   9: iconst_0
/*     */     //   10: istore_3
/*     */     //   11: aload_0
/*     */     //   12: getfield updateForeground : Z
/*     */     //   15: ifeq -> 38
/*     */     //   18: aload_0
/*     */     //   19: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   22: aload_2
/*     */     //   23: invokevirtual updateForegroundPaint : (Lorg/jetbrains/skia/paragraph/Paragraph;)V
/*     */     //   26: aload_0
/*     */     //   27: iconst_0
/*     */     //   28: putfield updateForeground : Z
/*     */     //   31: aload_2
/*     */     //   32: invokevirtual markDirty : ()Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   35: pop
/*     */     //   36: iconst_1
/*     */     //   37: istore_3
/*     */     //   38: aload_0
/*     */     //   39: getfield width : F
/*     */     //   42: fload_1
/*     */     //   43: invokestatic access$sameValueAs : (FF)Z
/*     */     //   46: ifne -> 56
/*     */     //   49: aload_0
/*     */     //   50: fload_1
/*     */     //   51: putfield width : F
/*     */     //   54: iconst_1
/*     */     //   55: istore_3
/*     */     //   56: iload_3
/*     */     //   57: ifeq -> 66
/*     */     //   60: aload_2
/*     */     //   61: fload_1
/*     */     //   62: invokevirtual layout : (F)Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   65: pop
/*     */     //   66: aload_2
/*     */     //   67: goto -> 96
/*     */     //   70: aload_0
/*     */     //   71: getfield builder : Landroidx/compose/ui/text/platform/ParagraphBuilder;
/*     */     //   74: invokevirtual build : ()Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   77: astore_2
/*     */     //   78: aload_2
/*     */     //   79: fload_1
/*     */     //   80: invokevirtual layout : (F)Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   83: pop
/*     */     //   84: aload_0
/*     */     //   85: aload_2
/*     */     //   86: putfield paragraphCache : Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   89: aload_0
/*     */     //   90: iconst_0
/*     */     //   91: putfield updateForeground : Z
/*     */     //   94: aload_2
/*     */     //   95: areturn
/*     */     //   96: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #190	-> 0
/*     */     //   #191	-> 5
/*     */     //   #192	-> 9
/*     */     //   #193	-> 11
/*     */     //   #194	-> 18
/*     */     //   #195	-> 26
/*     */     //   #199	-> 31
/*     */     //   #200	-> 36
/*     */     //   #202	-> 38
/*     */     //   #203	-> 49
/*     */     //   #204	-> 54
/*     */     //   #206	-> 56
/*     */     //   #207	-> 60
/*     */     //   #209	-> 66
/*     */     //   #211	-> 70
/*     */     //   #212	-> 78
/*     */     //   #213	-> 84
/*     */     //   #214	-> 89
/*     */     //   #215	-> 94
/*     */     //   #191	-> 96
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   11	56	3	layoutRequired	Z
/*     */     //   5	92	2	paragraph	Lorg/jetbrains/skia/paragraph/Paragraph;
/*     */     //   0	97	0	this	Landroidx/compose/ui/text/platform/ParagraphLayouter;
/*     */     //   0	97	1	width	F
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\ParagraphLayouter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */