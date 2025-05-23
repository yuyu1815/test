/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawContext;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawTransform;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\032\024\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\004H\002\032f\020\005\032\0020\001*\0020\0062\006\020\003\032\0020\0042\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\b\b\002\020\023\032\0020\024ø\001\000¢\006\004\b\025\020\026\032h\020\005\032\0020\001*\0020\0062\006\020\003\032\0020\0042\b\b\002\020\027\032\0020\0302\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\b\b\002\020\023\032\0020\024ø\001\000¢\006\004\b\031\020\032\032\001\020\005\032\0020\001*\0020\0062\006\020\033\032\0020\0342\006\020\035\032\0020\0362\b\b\002\020\t\032\0020\n2\b\b\002\020\037\032\0020 2\b\b\002\020!\032\0020\"2\b\b\002\020#\032\0020$2\b\b\002\020%\032\0020&2\024\b\002\020'\032\016\022\n\022\b\022\004\022\0020*0)0(2\b\b\002\020+\032\0020,2\b\b\002\020\023\032\0020\024ø\001\000¢\006\004\b-\020.\032j\020\005\032\0020\001*\0020\0062\006\020\033\032\0020\0342\006\020\035\032\0020/2\b\b\002\020\t\032\0020\n2\b\b\002\020\037\032\0020 2\b\b\002\020!\032\0020\"2\b\b\002\020#\032\0020$2\b\b\002\020%\032\0020&2\b\b\002\020+\032\0020,2\b\b\002\020\023\032\0020\024ø\001\000¢\006\004\b0\0201\032&\0202\032\00203*\0020\0062\006\020+\032\0020,2\006\020\t\032\0020\nH\002ø\001\000¢\006\004\b4\0205\002\007\n\005\b¡\0360\001¨\0066"}, d2 = {"clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nTextPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,399:1\n272#2,14:400\n272#2,14:414\n272#2,9:428\n282#2,4:440\n272#2,14:444\n702#3:437\n708#3:438\n696#3:439\n205#4:458\n205#4:461\n26#5:459\n26#5:460\n26#5:462\n26#5:463\n*S KotlinDebug\n*F\n+ 1 TextPainter.kt\nandroidx/compose/ui/text/TextPainterKt\n*L\n167#1:400,14\n233#1:414,14\n277#1:428,9\n277#1:440,4\n337#1:444,14\n284#1:437\n297#1:438\n297#1:439\n375#1:458\n387#1:461\n378#1:459\n380#1:460\n390#1:462\n392#1:463\n*E\n"})
/*     */ public final class TextPainterKt
/*     */ {
/*     */   public static final void drawText-JFhB2K4(@NotNull DrawScope $this$drawText_u2dJFhB2K4, @NotNull TextMeasurer textMeasurer, @NotNull AnnotatedString text, long topLeft, @NotNull TextStyle style, int overflow, boolean softWrap, int maxLines, @NotNull List placeholders, long size, int blendMode) {
/* 155 */     Intrinsics.checkNotNullParameter($this$drawText_u2dJFhB2K4, "$this$drawText"); Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer"); Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); TextLayoutResult textLayoutResult = TextMeasurer.measure-xDpz5zY$default(textMeasurer, 
/* 156 */         text, 
/* 157 */         style, 
/* 158 */         overflow, 
/* 159 */         softWrap, 
/* 160 */         maxLines, 
/* 161 */         placeholders, 
/* 162 */         textLayoutConstraints-v_w8tDc($this$drawText_u2dJFhB2K4, size, topLeft), 
/* 163 */         $this$drawText_u2dJFhB2K4.getLayoutDirection(), 
/* 164 */         (Density)$this$drawText_u2dJFhB2K4, null, false, 1536, null);
/*     */ 
/*     */     
/* 167 */     DrawScope $this$withTransform$iv = $this$drawText_u2dJFhB2K4; int $i$f$withTransform = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*     */ 
/*     */ 
/*     */     
/* 404 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 405 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*     */     try {
/* 407 */       DrawTransform $this$drawText_JFhB2K4_u24lambda_u240 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-TextPainterKt$drawText$1 = 0; $this$drawText_JFhB2K4_u24lambda_u240.translate(Offset.getX-impl(topLeft), Offset.getY-impl(topLeft)); clip($this$drawText_JFhB2K4_u24lambda_u240, textLayoutResult);
/* 408 */       DrawScope $this$drawText_JFhB2K4_u24lambda_u241 = $this$withTransform$iv; int $i$a$-withTransform-TextPainterKt$drawText$2 = 0; MultiParagraph.paint-LG529CI$default(textLayoutResult.getMultiParagraph(), $this$drawText_JFhB2K4_u24lambda_u241.getDrawContext().getCanvas(), 0L, null, null, null, blendMode, 30, null);
/*     */     } finally {
/* 410 */       $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 411 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv);
/*     */     }  } public static final void drawText-TPWCCtM(@NotNull DrawScope $this$drawText_u2dTPWCCtM, @NotNull TextMeasurer textMeasurer, @NotNull String text, long topLeft, @NotNull TextStyle style, int overflow, boolean softWrap, int maxLines, long size, int blendMode) { Intrinsics.checkNotNullParameter($this$drawText_u2dTPWCCtM, "$this$drawText"); Intrinsics.checkNotNullParameter(textMeasurer, "textMeasurer"); Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); TextLayoutResult textLayoutResult = TextMeasurer.measure-xDpz5zY$default(textMeasurer, new AnnotatedString(text, null, null, 6, null), style, overflow, softWrap, maxLines, null, textLayoutConstraints-v_w8tDc($this$drawText_u2dTPWCCtM, size, topLeft), $this$drawText_u2dTPWCCtM.getLayoutDirection(), (Density)$this$drawText_u2dTPWCCtM, null, false, 1568, null); DrawScope $this$withTransform$iv = $this$drawText_u2dTPWCCtM;
/*     */     int $i$f$withTransform = 0;
/* 414 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*     */ 
/*     */ 
/*     */     
/* 418 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 419 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*     */     try {
/* 421 */       DrawTransform $this$drawText_TPWCCtM_u24lambda_u242 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-TextPainterKt$drawText$3 = 0; $this$drawText_TPWCCtM_u24lambda_u242.translate(Offset.getX-impl(topLeft), Offset.getY-impl(topLeft)); clip($this$drawText_TPWCCtM_u24lambda_u242, textLayoutResult);
/* 422 */       DrawScope $this$drawText_TPWCCtM_u24lambda_u243 = $this$withTransform$iv; int $i$a$-withTransform-TextPainterKt$drawText$4 = 0; MultiParagraph.paint-LG529CI$default(textLayoutResult.getMultiParagraph(), $this$drawText_TPWCCtM_u24lambda_u243.getDrawContext().getCanvas(), 0L, null, null, null, blendMode, 30, null);
/*     */     } finally {
/* 424 */       $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 425 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv);
/*     */     }  }
/*     */ 
/*     */   
/*     */   public static final void drawText-d8-rzKo(@NotNull DrawScope $this$drawText_u2dd8_u2drzKo, @NotNull TextLayoutResult textLayoutResult, long color, long topLeft, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$this$drawText'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'textLayoutResult'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload #7
/*     */     //   14: dup
/*     */     //   15: ifnonnull -> 29
/*     */     //   18: pop
/*     */     //   19: aload_1
/*     */     //   20: invokevirtual getLayoutInput : ()Landroidx/compose/ui/text/TextLayoutInput;
/*     */     //   23: invokevirtual getStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   26: invokevirtual getShadow : ()Landroidx/compose/ui/graphics/Shadow;
/*     */     //   29: astore #11
/*     */     //   31: aload #8
/*     */     //   33: dup
/*     */     //   34: ifnonnull -> 48
/*     */     //   37: pop
/*     */     //   38: aload_1
/*     */     //   39: invokevirtual getLayoutInput : ()Landroidx/compose/ui/text/TextLayoutInput;
/*     */     //   42: invokevirtual getStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   45: invokevirtual getTextDecoration : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   48: astore #12
/*     */     //   50: aload #9
/*     */     //   52: dup
/*     */     //   53: ifnonnull -> 67
/*     */     //   56: pop
/*     */     //   57: aload_1
/*     */     //   58: invokevirtual getLayoutInput : ()Landroidx/compose/ui/text/TextLayoutInput;
/*     */     //   61: invokevirtual getStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   64: invokevirtual getDrawStyle : ()Landroidx/compose/ui/graphics/drawscope/DrawStyle;
/*     */     //   67: astore #13
/*     */     //   69: aload_0
/*     */     //   70: astore #14
/*     */     //   72: iconst_0
/*     */     //   73: istore #15
/*     */     //   75: aload #14
/*     */     //   77: invokeinterface getDrawContext : ()Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */     //   82: astore #16
/*     */     //   84: iconst_0
/*     */     //   85: istore #17
/*     */     //   87: aload #16
/*     */     //   89: invokeinterface getSize-NH-jbRc : ()J
/*     */     //   94: lstore #18
/*     */     //   96: aload #16
/*     */     //   98: invokeinterface getCanvas : ()Landroidx/compose/ui/graphics/Canvas;
/*     */     //   103: invokeinterface save : ()V
/*     */     //   108: nop
/*     */     //   109: aload #16
/*     */     //   111: invokeinterface getTransform : ()Landroidx/compose/ui/graphics/drawscope/DrawTransform;
/*     */     //   116: astore #20
/*     */     //   118: iconst_0
/*     */     //   119: istore #21
/*     */     //   121: aload #20
/*     */     //   123: lload #4
/*     */     //   125: invokestatic getX-impl : (J)F
/*     */     //   128: lload #4
/*     */     //   130: invokestatic getY-impl : (J)F
/*     */     //   133: invokeinterface translate : (FF)V
/*     */     //   138: aload #20
/*     */     //   140: aload_1
/*     */     //   141: invokestatic clip : (Landroidx/compose/ui/graphics/drawscope/DrawTransform;Landroidx/compose/ui/text/TextLayoutResult;)V
/*     */     //   144: nop
/*     */     //   145: nop
/*     */     //   146: aload #14
/*     */     //   148: astore #20
/*     */     //   150: iconst_0
/*     */     //   151: istore #21
/*     */     //   153: aload_1
/*     */     //   154: invokevirtual getLayoutInput : ()Landroidx/compose/ui/text/TextLayoutInput;
/*     */     //   157: invokevirtual getStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   160: invokevirtual getBrush : ()Landroidx/compose/ui/graphics/Brush;
/*     */     //   163: astore #22
/*     */     //   165: aload #22
/*     */     //   167: ifnull -> 248
/*     */     //   170: lload_2
/*     */     //   171: lstore #23
/*     */     //   173: iconst_0
/*     */     //   174: istore #25
/*     */     //   176: lload #23
/*     */     //   178: ldc2_w 16
/*     */     //   181: lcmp
/*     */     //   182: ifne -> 189
/*     */     //   185: iconst_1
/*     */     //   186: goto -> 190
/*     */     //   189: iconst_0
/*     */     //   190: ifeq -> 248
/*     */     //   193: aload_1
/*     */     //   194: invokevirtual getMultiParagraph : ()Landroidx/compose/ui/text/MultiParagraph;
/*     */     //   197: aload #20
/*     */     //   199: invokeinterface getDrawContext : ()Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */     //   204: invokeinterface getCanvas : ()Landroidx/compose/ui/graphics/Canvas;
/*     */     //   209: aload #22
/*     */     //   211: fload #6
/*     */     //   213: invokestatic isNaN : (F)Z
/*     */     //   216: ifne -> 224
/*     */     //   219: fload #6
/*     */     //   221: goto -> 234
/*     */     //   224: aload_1
/*     */     //   225: invokevirtual getLayoutInput : ()Landroidx/compose/ui/text/TextLayoutInput;
/*     */     //   228: invokevirtual getStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   231: invokevirtual getAlpha : ()F
/*     */     //   234: aload #11
/*     */     //   236: aload #12
/*     */     //   238: aload #13
/*     */     //   240: iload #10
/*     */     //   242: invokevirtual paint-hn5TExg : (Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V
/*     */     //   245: goto -> 341
/*     */     //   248: aload_1
/*     */     //   249: invokevirtual getMultiParagraph : ()Landroidx/compose/ui/text/MultiParagraph;
/*     */     //   252: aload #20
/*     */     //   254: invokeinterface getDrawContext : ()Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */     //   259: invokeinterface getCanvas : ()Landroidx/compose/ui/graphics/Canvas;
/*     */     //   264: lload_2
/*     */     //   265: lstore #23
/*     */     //   267: iconst_0
/*     */     //   268: istore #25
/*     */     //   270: lload #23
/*     */     //   272: lstore #26
/*     */     //   274: iconst_0
/*     */     //   275: istore #28
/*     */     //   277: lload #26
/*     */     //   279: ldc2_w 16
/*     */     //   282: lcmp
/*     */     //   283: ifeq -> 290
/*     */     //   286: iconst_1
/*     */     //   287: goto -> 291
/*     */     //   290: iconst_0
/*     */     //   291: ifeq -> 299
/*     */     //   294: lload #23
/*     */     //   296: goto -> 325
/*     */     //   299: astore #29
/*     */     //   301: astore #30
/*     */     //   303: iconst_0
/*     */     //   304: istore #31
/*     */     //   306: aload_1
/*     */     //   307: invokevirtual getLayoutInput : ()Landroidx/compose/ui/text/TextLayoutInput;
/*     */     //   310: invokevirtual getStyle : ()Landroidx/compose/ui/text/TextStyle;
/*     */     //   313: invokevirtual getColor-0d7_KjU : ()J
/*     */     //   316: lstore #32
/*     */     //   318: aload #30
/*     */     //   320: aload #29
/*     */     //   322: lload #32
/*     */     //   324: nop
/*     */     //   325: fload #6
/*     */     //   327: invokestatic modulate-DxMtmZc : (JF)J
/*     */     //   330: aload #11
/*     */     //   332: aload #12
/*     */     //   334: aload #13
/*     */     //   336: iload #10
/*     */     //   338: invokevirtual paint-LG529CI : (Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V
/*     */     //   341: nop
/*     */     //   342: nop
/*     */     //   343: aload #16
/*     */     //   345: invokeinterface getCanvas : ()Landroidx/compose/ui/graphics/Canvas;
/*     */     //   350: invokeinterface restore : ()V
/*     */     //   355: aload #16
/*     */     //   357: lload #18
/*     */     //   359: invokeinterface setSize-uvyYCjk : (J)V
/*     */     //   364: goto -> 393
/*     */     //   367: astore #34
/*     */     //   369: aload #16
/*     */     //   371: invokeinterface getCanvas : ()Landroidx/compose/ui/graphics/Canvas;
/*     */     //   376: invokeinterface restore : ()V
/*     */     //   381: aload #16
/*     */     //   383: lload #18
/*     */     //   385: invokeinterface setSize-uvyYCjk : (J)V
/*     */     //   390: aload #34
/*     */     //   392: athrow
/*     */     //   393: nop
/*     */     //   394: nop
/*     */     //   395: nop
/*     */     //   396: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #273	-> 12
/*     */     //   #274	-> 31
/*     */     //   #275	-> 50
/*     */     //   #277	-> 69
/*     */     //   #428	-> 75
/*     */     //   #432	-> 87
/*     */     //   #433	-> 96
/*     */     //   #434	-> 108
/*     */     //   #435	-> 109
/*     */     //   #278	-> 121
/*     */     //   #279	-> 138
/*     */     //   #280	-> 144
/*     */     //   #435	-> 145
/*     */     //   #436	-> 146
/*     */     //   #283	-> 153
/*     */     //   #284	-> 165
/*     */     //   #437	-> 176
/*     */     //   #284	-> 190
/*     */     //   #285	-> 193
/*     */     //   #286	-> 197
/*     */     //   #287	-> 209
/*     */     //   #288	-> 211
/*     */     //   #288	-> 216
/*     */     //   #289	-> 234
/*     */     //   #290	-> 236
/*     */     //   #291	-> 238
/*     */     //   #292	-> 240
/*     */     //   #285	-> 242
/*     */     //   #295	-> 248
/*     */     //   #296	-> 252
/*     */     //   #297	-> 264
/*     */     //   #438	-> 270
/*     */     //   #439	-> 277
/*     */     //   #438	-> 291
/*     */     //   #297	-> 306
/*     */     //   #438	-> 324
/*     */     //   #297	-> 325
/*     */     //   #298	-> 330
/*     */     //   #299	-> 332
/*     */     //   #300	-> 334
/*     */     //   #301	-> 336
/*     */     //   #295	-> 338
/*     */     //   #304	-> 341
/*     */     //   #436	-> 342
/*     */     //   #440	-> 343
/*     */     //   #441	-> 355
/*     */     //   #442	-> 364
/*     */     //   #440	-> 367
/*     */     //   #441	-> 381
/*     */     //   #443	-> 393
/*     */     //   #428	-> 394
/*     */     //   #443	-> 395
/*     */     //   #305	-> 396
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   121	24	21	$i$a$-withTransform-TextPainterKt$drawText$5	I
/*     */     //   118	27	20	$this$drawText_d8_rzKo_u24lambda_u244	Landroidx/compose/ui/graphics/drawscope/DrawTransform;
/*     */     //   176	14	25	$i$f$isUnspecified-8_81llA	I
/*     */     //   173	17	23	$this$isUnspecified$iv	J
/*     */     //   306	10	31	$i$a$-takeOrElse-DxMtmZc-TextPainterKt$drawText$6$1	I
/*     */     //   277	14	28	$i$f$isSpecified-8_81llA	I
/*     */     //   274	17	26	$this$isSpecified$iv$iv	J
/*     */     //   270	55	25	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   267	58	23	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   153	189	21	$i$a$-withTransform-TextPainterKt$drawText$6	I
/*     */     //   165	177	22	brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   150	192	20	$this$drawText_d8_rzKo_u24lambda_u246	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   87	307	17	$i$a$-with-DrawScopeKt$withTransform$1$iv	I
/*     */     //   96	298	18	previousSize$iv	J
/*     */     //   84	310	16	$this$withTransform_u24lambda_u246$iv	Landroidx/compose/ui/graphics/drawscope/DrawContext;
/*     */     //   75	321	15	$i$f$withTransform	I
/*     */     //   72	324	14	$this$withTransform$iv	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   31	366	11	newShadow	Landroidx/compose/ui/graphics/Shadow;
/*     */     //   50	347	12	newTextDecoration	Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   69	328	13	newDrawStyle	Landroidx/compose/ui/graphics/drawscope/DrawStyle;
/*     */     //   0	397	0	$this$drawText_u2dd8_u2drzKo	Landroidx/compose/ui/graphics/drawscope/DrawScope;
/*     */     //   0	397	1	textLayoutResult	Landroidx/compose/ui/text/TextLayoutResult;
/*     */     //   0	397	2	color	J
/*     */     //   0	397	4	topLeft	J
/*     */     //   0	397	6	alpha	F
/*     */     //   0	397	7	shadow	Landroidx/compose/ui/graphics/Shadow;
/*     */     //   0	397	8	textDecoration	Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   0	397	9	drawStyle	Landroidx/compose/ui/graphics/drawscope/DrawStyle;
/*     */     //   0	397	10	blendMode	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   108	343	367	finally
/*     */     //   367	369	367	finally
/*     */   }
/*     */   
/*     */   public static final void drawText-LVfH_YU(@NotNull DrawScope $this$drawText_u2dLVfH_YU, @NotNull TextLayoutResult textLayoutResult, @NotNull Brush brush, long topLeft, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration textDecoration, @Nullable DrawStyle drawStyle, int blendMode) { Intrinsics.checkNotNullParameter($this$drawText_u2dLVfH_YU, "$this$drawText");
/*     */     Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
/*     */     Intrinsics.checkNotNullParameter(brush, "brush");
/*     */     if (shadow == null);
/*     */     Shadow newShadow = textLayoutResult.getLayoutInput().getStyle().getShadow();
/*     */     if (textDecoration == null);
/*     */     TextDecoration newTextDecoration = textLayoutResult.getLayoutInput().getStyle().getTextDecoration();
/*     */     if (drawStyle == null);
/*     */     DrawStyle newDrawStyle = textLayoutResult.getLayoutInput().getStyle().getDrawStyle();
/*     */     DrawScope $this$withTransform$iv = $this$drawText_u2dLVfH_YU;
/*     */     int $i$f$withTransform = 0;
/* 444 */     DrawContext $this$withTransform_u24lambda_u246$iv = $this$withTransform$iv.getDrawContext(); int $i$a$-with-DrawScopeKt$withTransform$1$iv = 0;
/*     */ 
/*     */ 
/*     */     
/* 448 */     long previousSize$iv = $this$withTransform_u24lambda_u246$iv.getSize-NH-jbRc();
/* 449 */     $this$withTransform_u24lambda_u246$iv.getCanvas().save();
/*     */     try {
/* 451 */       DrawTransform $this$drawText_LVfH_YU_u24lambda_u247 = $this$withTransform_u24lambda_u246$iv.getTransform(); int $i$a$-withTransform-TextPainterKt$drawText$7 = 0; $this$drawText_LVfH_YU_u24lambda_u247.translate(Offset.getX-impl(topLeft), Offset.getY-impl(topLeft)); clip($this$drawText_LVfH_YU_u24lambda_u247, textLayoutResult);
/* 452 */       DrawScope $this$drawText_LVfH_YU_u24lambda_u248 = $this$withTransform$iv; int $i$a$-withTransform-TextPainterKt$drawText$8 = 0; textLayoutResult.getMultiParagraph().paint-hn5TExg($this$drawText_LVfH_YU_u24lambda_u248.getDrawContext().getCanvas(), brush, !Float.isNaN(alpha) ? alpha : textLayoutResult.getLayoutInput().getStyle().getAlpha(), newShadow, newTextDecoration, newDrawStyle, blendMode);
/*     */     } finally {
/* 454 */       $this$withTransform_u24lambda_u246$iv.getCanvas().restore();
/* 455 */       $this$withTransform_u24lambda_u246$iv.setSize-uvyYCjk(previousSize$iv);
/*     */     }  } private static final long textLayoutConstraints-v_w8tDc(DrawScope $this$textLayoutConstraints_u2dv_w8tDc, long size, long topLeft) { int minWidth = 0; int maxWidth = 0; long $this$isUnspecified$iv = size;
/*     */     int $i$f$isUnspecified-uvyYCjk = 0;
/* 458 */     boolean isWidthNaN = ((($this$isUnspecified$iv == 9205357640488583168L)) || Float.isNaN(Size.getWidth-impl(size))); if (isWidthNaN)
/* 459 */     { minWidth = 0; float $this$fastRoundToInt$iv = (float)Math.ceil((Size.getWidth-impl($this$textLayoutConstraints_u2dv_w8tDc.getSize-NH-jbRc()) - Offset.getX-impl(topLeft))); int $i$f$fastRoundToInt = 0; maxWidth = Math.round($this$fastRoundToInt$iv); }
/* 460 */     else { float $this$fastRoundToInt$iv = (float)Math.ceil(Size.getWidth-impl(size)); int $i$f$fastRoundToInt = 0, fixedWidth = Math.round($this$fastRoundToInt$iv); minWidth = fixedWidth; maxWidth = fixedWidth; }
/* 461 */      int minHeight = 0; int maxHeight = 0; long l1 = size; int i = 0; boolean isHeightNaN = (((l1 == 9205357640488583168L)) || Float.isNaN(Size.getHeight-impl(size))); if (isHeightNaN)
/* 462 */     { minHeight = 0; float $this$fastRoundToInt$iv = (float)Math.ceil((Size.getHeight-impl($this$textLayoutConstraints_u2dv_w8tDc.getSize-NH-jbRc()) - Offset.getY-impl(topLeft))); int $i$f$fastRoundToInt = 0; maxHeight = Math.round($this$fastRoundToInt$iv); }
/* 463 */     else { float $this$fastRoundToInt$iv = (float)Math.ceil(Size.getHeight-impl(size)); int $i$f$fastRoundToInt = 0, fixedHeight = Math.round($this$fastRoundToInt$iv);
/*     */       minHeight = fixedHeight;
/*     */       maxHeight = fixedHeight; }
/*     */     
/*     */     return ConstraintsKt.Constraints(minWidth, maxWidth, minHeight, maxHeight); }
/*     */ 
/*     */   
/*     */   private static final void clip(DrawTransform $this$clip, TextLayoutResult textLayoutResult) {
/*     */     if (textLayoutResult.getHasVisualOverflow() && !TextOverflow.equals-impl0(textLayoutResult.getLayoutInput().getOverflow-gIe3tQ8(), TextOverflow.Companion.getVisible-gIe3tQ8()))
/*     */       DrawTransform.clipRect-N_I0leg$default($this$clip, 0.0F, 0.0F, IntSize.getWidth-impl(textLayoutResult.getSize-YbymL2g()), IntSize.getHeight-impl(textLayoutResult.getSize-YbymL2g()), 0, 16, null); 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextPainterKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */