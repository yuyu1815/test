/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.ui.geometry.Size;
/*     */ import androidx.compose.ui.graphics.BlendMode;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawScope;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.PlatformSpanStyle;
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import androidx.compose.ui.text.TextDecorationLineStyle;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontSynthesis;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import androidx.compose.ui.text.style.BaselineShift;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextForegroundStyle;
/*     */ import androidx.compose.ui.text.style.TextGeometricTransform;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.skia.FontFeature;
/*     */ import org.jetbrains.skia.FontMetrics;
/*     */ import org.jetbrains.skia.Paint;
/*     */ import org.jetbrains.skia.PaintMode;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000º\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\bi\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\b\030\0002\0020\001B3\b\026\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\fBß\001\022\b\b\002\020\r\032\0020\016\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\017\032\0020\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\n\b\002\020\025\032\004\030\0010\026\022\n\b\002\020\027\032\004\030\0010\030\022\n\b\002\020\031\032\004\030\0010\032\022\n\b\002\020\033\032\004\030\0010\020\022\n\b\002\020\034\032\004\030\0010\035\022\n\b\002\020\036\032\004\030\0010\037\022\n\b\002\020 \032\004\030\0010!\022\b\b\002\020\"\032\0020#\022\n\b\002\020$\032\004\030\0010%\022\n\b\002\020&\032\004\030\0010'\022\n\b\002\020(\032\004\030\0010)\022\n\b\002\020*\032\004\030\0010+\022\b\b\002\020\b\032\0020\t\022\n\b\002\020\n\032\004\030\0010\020¢\006\002\020,J\t\020z\032\0020\016HÆ\003J\026\020{\032\004\030\0010\035HÆ\003ø\001\001ø\001\000¢\006\002\b|J\013\020}\032\004\030\0010\037HÆ\003J\013\020~\032\004\030\0010!HÆ\003J\027\020\032\0020#HÆ\003ø\001\001ø\001\000¢\006\005\b\001\0200J\f\020\001\032\004\030\0010%HÆ\003J\030\020\001\032\004\030\0010'HÆ\003ø\001\001ø\001\000¢\006\003\b\001J\f\020\001\032\004\030\0010)HÆ\003J\f\020\001\032\004\030\0010+HÆ\003J\030\020\001\032\0020\tHÆ\003ø\001\001ø\001\000¢\006\005\b\001\0209J\021\020\001\032\004\030\0010\020HÆ\003¢\006\002\020\\J\030\020\001\032\0020\007HÆ\003ø\001\001ø\001\000¢\006\005\b\001\0200J\n\020\001\032\0020\020HÆ\003J\f\020\001\032\004\030\0010\022HÆ\003J\030\020\001\032\004\030\0010\024HÆ\003ø\001\001ø\001\000¢\006\003\b\001J\030\020\001\032\004\030\0010\026HÆ\003ø\001\001ø\001\000¢\006\003\b\001J\f\020\001\032\004\030\0010\030HÆ\003J\f\020\001\032\004\030\0010\032HÆ\003J\021\020\001\032\004\030\0010\020HÆ\003¢\006\002\020\\Jð\001\020\001\032\0020\0002\b\b\002\020\r\032\0020\0162\b\b\002\020\006\032\0020\0072\b\b\002\020\017\032\0020\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\n\b\002\020\025\032\004\030\0010\0262\n\b\002\020\027\032\004\030\0010\0302\n\b\002\020\031\032\004\030\0010\0322\n\b\002\020\033\032\004\030\0010\0202\n\b\002\020\034\032\004\030\0010\0352\n\b\002\020\036\032\004\030\0010\0372\n\b\002\020 \032\004\030\0010!2\b\b\002\020\"\032\0020#2\n\b\002\020$\032\004\030\0010%2\n\b\002\020&\032\004\030\0010'2\n\b\002\020(\032\004\030\0010)2\n\b\002\020*\032\004\030\0010+2\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\020HÆ\001ø\001\000¢\006\006\b\001\020\001J\026\020\001\032\0030\0012\t\020\001\032\004\030\0010\001HÖ\003J\b\020\001\032\0030\001J\013\020\001\032\0030\001HÖ\001J\031\020\001\032\0030\0012\006\020\002\032\0020\0032\007\020\001\032\0020\005J@\020 \001\032\0030\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\006\020\n\032\0020\013ø\001\000¢\006\006\b¡\001\020¢\001J\022\020£\001\032\0030¤\0012\b\020¥\001\032\0030¦\001J\n\020§\001\032\0020\032HÖ\001R\016\020-\032\0020.X\004¢\006\002\n\000R\"\020\"\032\0020#X\016ø\001\000ø\001\001¢\006\020\n\002\0203\032\004\b/\0200\"\004\b1\0202R\"\020\034\032\004\030\0010\035X\016ø\001\000ø\001\001¢\006\016\n\000\032\004\b4\0205\"\004\b6\0207R\"\020\b\032\0020\tX\016ø\001\000ø\001\001¢\006\020\n\002\020<\032\004\b8\0209\"\004\b:\020;R\"\020\006\032\0020\007X\016ø\001\000ø\001\001¢\006\020\n\002\0203\032\004\b=\0200\"\004\b>\0202R\034\020*\032\004\030\0010+X\016¢\006\016\n\000\032\004\b?\020@\"\004\bA\020BR\034\020\027\032\004\030\0010\030X\016¢\006\016\n\000\032\004\bC\020D\"\004\bE\020FR\034\020\031\032\004\030\0010\032X\016¢\006\016\n\000\032\004\bG\020H\"\004\bI\020JR\032\020\017\032\0020\020X\016¢\006\016\n\000\032\004\bK\020L\"\004\bM\020NR\"\020\023\032\004\030\0010\024X\016ø\001\000ø\001\001¢\006\016\n\000\032\004\bO\020P\"\004\bQ\020RR\"\020\025\032\004\030\0010\026X\016ø\001\000ø\001\001¢\006\016\n\000\032\004\bS\020T\"\004\bU\020VR\034\020\021\032\004\030\0010\022X\016¢\006\016\n\000\032\004\bW\020X\"\004\bY\020ZR\036\020\033\032\004\030\0010\020X\016¢\006\020\n\002\020_\032\004\b[\020\\\"\004\b]\020^R\036\020\n\032\004\030\0010\020X\016¢\006\020\n\002\020_\032\004\b`\020\\\"\004\ba\020^R\034\020 \032\004\030\0010!X\016¢\006\016\n\000\032\004\bb\020c\"\004\bd\020eR\034\020(\032\004\030\0010)X\016¢\006\016\n\000\032\004\bf\020g\"\004\bh\020iR\034\020$\032\004\030\0010%X\016¢\006\016\n\000\032\004\bj\020k\"\004\bl\020mR\"\020&\032\004\030\0010'X\016ø\001\000ø\001\001¢\006\016\n\000\032\004\bn\020o\"\004\bp\020qR\032\020\r\032\0020\016X\016¢\006\016\n\000\032\004\br\020s\"\004\bt\020uR\034\020\036\032\004\030\0010\037X\016¢\006\016\n\000\032\004\bv\020w\"\004\bx\020y\002\013\n\005\b¡\0360\001\n\002\b!¨\006¨\001"}, d2 = {"Landroidx/compose/ui/text/platform/ComputedStyle;", "", "density", "Landroidx/compose/ui/unit/Density;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "brushSize", "Landroidx/compose/ui/geometry/Size;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/SpanStyle;JIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "textForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "fontSize", "", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "Landroidx/compose/ui/graphics/Color;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "textDecorationLineStyle", "Landroidx/compose/ui/text/TextDecorationLineStyle;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JFLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;Ljava/lang/Float;Landroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/TextDecorationLineStyle;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILjava/lang/Float;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "_foregroundPaint", "Landroidx/compose/ui/text/platform/SkiaTextPaint;", "getBackground-0d7_KjU", "()J", "setBackground-8_81llA", "(J)V", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "setBaselineShift-_isdbwI", "(Landroidx/compose/ui/text/style/BaselineShift;)V", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "I", "getBrushSize-NH-jbRc", "setBrushSize-uvyYCjk", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "setDrawStyle", "(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "setFontFamily", "(Landroidx/compose/ui/text/font/FontFamily;)V", "getFontFeatureSettings", "()Ljava/lang/String;", "setFontFeatureSettings", "(Ljava/lang/String;)V", "getFontSize", "()F", "setFontSize", "(F)V", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "setFontStyle-mLjRB2g", "(Landroidx/compose/ui/text/font/FontStyle;)V", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "setFontSynthesis-tDdu0R4", "(Landroidx/compose/ui/text/font/FontSynthesis;)V", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "setFontWeight", "(Landroidx/compose/ui/text/font/FontWeight;)V", "getLetterSpacing", "()Ljava/lang/Float;", "setLetterSpacing", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getLineHeight", "setLineHeight", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "setLocaleList", "(Landroidx/compose/ui/text/intl/LocaleList;)V", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow", "(Landroidx/compose/ui/graphics/Shadow;)V", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "setTextDecoration", "(Landroidx/compose/ui/text/style/TextDecoration;)V", "getTextDecorationLineStyle-Gch4ia8", "()Landroidx/compose/ui/text/TextDecorationLineStyle;", "setTextDecorationLineStyle-fxjoRMw", "(Landroidx/compose/ui/text/TextDecorationLineStyle;)V", "getTextForegroundStyle", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "setTextForegroundStyle", "(Landroidx/compose/ui/text/style/TextForegroundStyle;)V", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "setTextGeometricTransform", "(Landroidx/compose/ui/text/style/TextGeometricTransform;)V", "component1", "component10", "component10-5SSeXJ0", "component11", "component12", "component13", "component13-0d7_KjU", "component14", "component15", "component15-Gch4ia8", "component16", "component17", "component18", "component18-0nO6VwU", "component19", "component2", "component2-NH-jbRc", "component3", "component4", "component5", "component5-4Lr2A7w", "component6", "component6-ZQGJjVo", "component7", "component8", "component9", "copy", "copy-7k0DxQs", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JFLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;Ljava/lang/Float;Landroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/TextDecorationLineStyle;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILjava/lang/Float;)Landroidx/compose/ui/text/platform/ComputedStyle;", "equals", "", "other", "getForegroundPaint", "Lorg/jetbrains/skia/Paint;", "hashCode", "", "merge", "", "set", "set-p7glnfI", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/SpanStyle;JIJ)V", "toSkTextStyle", "Lorg/jetbrains/skia/paragraph/TextStyle;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "toString", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nParagraphBuilder.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphBuilder.skiko.kt\nandroidx/compose/ui/text/platform/ComputedStyle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,717:1\n1#2:718\n251#3:719\n251#3:720\n696#4:721\n696#4:724\n37#5,2:722\n*S KotlinDebug\n*F\n+ 1 ParagraphBuilder.skiko.kt\nandroidx/compose/ui/text/platform/ComputedStyle\n*L\n132#1:719\n144#1:720\n164#1:721\n236#1:724\n206#1:722,2\n*E\n"})
/*     */ final class ComputedStyle
/*     */ {
/*     */   @NotNull
/*     */   private TextForegroundStyle textForegroundStyle;
/*     */   private long brushSize;
/*     */   private float fontSize;
/*     */   @Nullable
/*     */   private FontWeight fontWeight;
/*     */   @Nullable
/*     */   private FontStyle fontStyle;
/*     */   @Nullable
/*     */   private FontSynthesis fontSynthesis;
/*     */   @Nullable
/*     */   private FontFamily fontFamily;
/*     */   @Nullable
/*     */   private String fontFeatureSettings;
/*     */   @Nullable
/*     */   private Float letterSpacing;
/*     */   @Nullable
/*     */   private BaselineShift baselineShift;
/*     */   @Nullable
/*     */   private TextGeometricTransform textGeometricTransform;
/*     */   @Nullable
/*     */   private LocaleList localeList;
/*     */   private long background;
/*     */   @Nullable
/*     */   private TextDecoration textDecoration;
/*     */   @Nullable
/*     */   private TextDecorationLineStyle textDecorationLineStyle;
/*     */   @Nullable
/*     */   private Shadow shadow;
/*     */   @Nullable
/*     */   private DrawStyle drawStyle;
/*     */   private int blendMode;
/*     */   @Nullable
/*     */   private Float lineHeight;
/*     */   @NotNull
/*     */   private final SkiaTextPaint _foregroundPaint;
/*     */   
/*     */   private ComputedStyle(TextForegroundStyle textForegroundStyle, long brushSize, float fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, Float letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, TextDecorationLineStyle textDecorationLineStyle, Shadow shadow, DrawStyle drawStyle, int blendMode, Float lineHeight) {
/*  87 */     this.textForegroundStyle = textForegroundStyle;
/*  88 */     this.brushSize = brushSize;
/*  89 */     this.fontSize = fontSize;
/*  90 */     this.fontWeight = fontWeight;
/*  91 */     this.fontStyle = fontStyle;
/*  92 */     this.fontSynthesis = fontSynthesis;
/*  93 */     this.fontFamily = fontFamily;
/*  94 */     this.fontFeatureSettings = fontFeatureSettings;
/*  95 */     this.letterSpacing = letterSpacing;
/*  96 */     this.baselineShift = baselineShift;
/*  97 */     this.textGeometricTransform = textGeometricTransform;
/*  98 */     this.localeList = localeList;
/*  99 */     this.background = background;
/* 100 */     this.textDecoration = textDecoration;
/* 101 */     this.textDecorationLineStyle = textDecorationLineStyle;
/* 102 */     this.shadow = shadow;
/* 103 */     this.drawStyle = drawStyle;
/* 104 */     this.blendMode = blendMode;
/* 105 */     this.lineHeight = lineHeight;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     this._foregroundPaint = new SkiaTextPaint();
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
/*     */   @NotNull
/*     */   public final TextForegroundStyle getTextForegroundStyle() {
/*     */     return this.textForegroundStyle;
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
/*     */   public final void setTextForegroundStyle(@NotNull TextForegroundStyle <set-?>) {
/*     */     Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */     this.textForegroundStyle = <set-?>;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getFontSize() {
/*     */     return this.fontSize;
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
/*     */   public final void setFontSize(float <set-?>) {
/*     */     this.fontSize = <set-?>;
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
/*     */   @Nullable
/*     */   public final FontWeight getFontWeight() {
/*     */     return this.fontWeight;
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
/*     */   public final void setFontWeight(@Nullable FontWeight <set-?>) {
/*     */     this.fontWeight = <set-?>;
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
/*     */   @Nullable
/*     */   public final FontStyle getFontStyle-4Lr2A7w() {
/*     */     return this.fontStyle;
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
/*     */   public final void setFontStyle-mLjRB2g(@Nullable FontStyle <set-?>) {
/*     */     this.fontStyle = <set-?>;
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
/*     */   @Nullable
/*     */   public final FontSynthesis getFontSynthesis-ZQGJjVo() {
/*     */     return this.fontSynthesis;
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
/*     */   public final void setFontSynthesis-tDdu0R4(@Nullable FontSynthesis <set-?>) {
/*     */     this.fontSynthesis = <set-?>;
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
/*     */   @Nullable
/*     */   public final FontFamily getFontFamily() {
/*     */     return this.fontFamily;
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
/*     */   public final void setFontFamily(@Nullable FontFamily <set-?>) {
/*     */     this.fontFamily = <set-?>;
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
/*     */   @Nullable
/*     */   public final String getFontFeatureSettings() {
/*     */     return this.fontFeatureSettings;
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
/*     */   public final void setFontFeatureSettings(@Nullable String <set-?>) {
/*     */     this.fontFeatureSettings = <set-?>;
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
/*     */   @Nullable
/*     */   public final Float getLetterSpacing() {
/*     */     return this.letterSpacing;
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
/*     */   public final void setLetterSpacing(@Nullable Float <set-?>) {
/*     */     this.letterSpacing = <set-?>;
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
/*     */   @Nullable
/*     */   public final BaselineShift getBaselineShift-5SSeXJ0() {
/*     */     return this.baselineShift;
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
/*     */   public final void setBaselineShift-_isdbwI(@Nullable BaselineShift <set-?>) {
/*     */     this.baselineShift = <set-?>;
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
/*     */   @Nullable
/*     */   public final TextGeometricTransform getTextGeometricTransform() {
/*     */     return this.textGeometricTransform;
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
/*     */   public final void setTextGeometricTransform(@Nullable TextGeometricTransform <set-?>) {
/*     */     this.textGeometricTransform = <set-?>;
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
/*     */   @Nullable
/*     */   public final LocaleList getLocaleList() {
/*     */     return this.localeList;
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
/*     */   public final void setLocaleList(@Nullable LocaleList <set-?>) {
/*     */     this.localeList = <set-?>;
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
/*     */   public final long getBackground-0d7_KjU() {
/*     */     return this.background;
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
/*     */   public final void setBackground-8_81llA(long <set-?>) {
/*     */     this.background = <set-?>;
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
/*     */   @Nullable
/*     */   public final TextDecoration getTextDecoration() {
/*     */     return this.textDecoration;
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
/*     */   public final void setTextDecoration(@Nullable TextDecoration <set-?>) {
/*     */     this.textDecoration = <set-?>;
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
/*     */   @Nullable
/*     */   public final TextDecorationLineStyle getTextDecorationLineStyle-Gch4ia8() {
/*     */     return this.textDecorationLineStyle;
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
/*     */   public final void setTextDecorationLineStyle-fxjoRMw(@Nullable TextDecorationLineStyle <set-?>) {
/*     */     this.textDecorationLineStyle = <set-?>;
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
/*     */   @Nullable
/*     */   public final Shadow getShadow() {
/*     */     return this.shadow;
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
/*     */   public final void setShadow(@Nullable Shadow <set-?>) {
/*     */     this.shadow = <set-?>;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setDrawStyle(@Nullable DrawStyle <set-?>) {
/*     */     this.drawStyle = <set-?>;
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
/*     */   public final int getBlendMode-0nO6VwU() {
/*     */     return this.blendMode;
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
/*     */   public final void setBlendMode-s9anfk8(int <set-?>) {
/*     */     this.blendMode = <set-?>;
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
/*     */   @Nullable
/*     */   public final Float getLineHeight() {
/*     */     return this.lineHeight;
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
/*     */   public final void setLineHeight(@Nullable Float <set-?>) {
/*     */     this.lineHeight = <set-?>;
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
/*     */   private ComputedStyle(Density density, SpanStyle spanStyle, long brushSize, int blendMode, long lineHeight) {
/*     */     this(null, 0L, 0.0F, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, 0, null, 524287, null);
/*     */     set-p7glnfI(density, spanStyle, brushSize, blendMode, lineHeight);
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
/*     */   public final void set-p7glnfI(@NotNull Density density, @NotNull SpanStyle spanStyle, long brushSize, int blendMode, long lineHeight) {
/*     */     Intrinsics.checkNotNullParameter(density, "density");
/*     */     Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
/*     */     this.textForegroundStyle = spanStyle.getTextForegroundStyle$ui_text();
/*     */     this.brushSize = brushSize;
/*     */     Density density1 = density;
/* 718 */     ComputedStyle computedStyle = this; int $i$a$-with-ComputedStyle$set$1 = 0; computedStyle.fontSize = Float.valueOf(density1.toPx--R2X_6o(spanStyle.getFontSize-XSAIIZE())).floatValue(); this.fontWeight = spanStyle.getFontWeight(); this.fontStyle = spanStyle.getFontStyle-4Lr2A7w(); this.fontSynthesis = spanStyle.getFontSynthesis-ZQGJjVo(); this.fontFamily = spanStyle.getFontFamily(); this.fontFeatureSettings = spanStyle.getFontFeatureSettings(); long l1 = spanStyle.getLetterSpacing-XSAIIZE(); int $i$f$isSpecified--R2X_6o = 0; Density $this$set_p7glnfI_u24lambda_u240 = density; computedStyle = this; int $i$a$-with-ComputedStyle$set$2 = 0;
/* 719 */     computedStyle.letterSpacing = (!TextUnitKt.isUnspecified--R2X_6o(l1)) ? Float.valueOf($this$set_p7glnfI_u24lambda_u240.toPx--R2X_6o(spanStyle.getLetterSpacing-XSAIIZE())) : null; this.baselineShift = spanStyle.getBaselineShift-5SSeXJ0(); this.textGeometricTransform = spanStyle.getTextGeometricTransform(); this.localeList = spanStyle.getLocaleList(); this.background = spanStyle.getBackground-0d7_KjU(); this.textDecoration = spanStyle.getTextDecoration(); spanStyle.getPlatformStyle(); this.textDecorationLineStyle = (spanStyle.getPlatformStyle() != null) ? spanStyle.getPlatformStyle().getTextDecorationLineStyle-Gch4ia8() : null; this.shadow = spanStyle.getShadow(); this.drawStyle = spanStyle.getDrawStyle(); this.blendMode = blendMode; long $this$isSpecified$iv = lineHeight; $i$f$isSpecified--R2X_6o = 0;
/* 720 */     this.lineHeight = (!TextUnitKt.isUnspecified--R2X_6o($this$isSpecified$iv)) ? Float.valueOf(SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$toPx-PoKjXmU(lineHeight, density, spanStyle.getFontSize-XSAIIZE())) : null;
/* 721 */   } @NotNull public final Paint getForegroundPaint() { Paint paint = this._foregroundPaint.asFrameworkPaint(); paint.reset(); this._foregroundPaint.setColor-8_81llA(this.textForegroundStyle.getColor-0d7_KjU()); this._foregroundPaint.setBrush-12SF9DM(this.textForegroundStyle.getBrush(), this.brushSize, this.textForegroundStyle.getAlpha()); this._foregroundPaint.setDrawStyle(this.drawStyle); this._foregroundPaint.setBlendMode-s9anfk8(this.blendMode); return paint; } @NotNull public final TextStyle toSkTextStyle(@NotNull FontFamily.Resolver fontFamilyResolver) { Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver"); TextStyle res = new TextStyle(); long $this$isSpecified$iv = this.textForegroundStyle.getColor-0d7_KjU(); int $i$f$isSpecified-8_81llA = 0; if (($this$isSpecified$iv != 16L)) res.setColor(ColorKt.toArgb-8_81llA(this.textForegroundStyle.getColor-0d7_KjU()));  Paint foreground = getForegroundPaint(); if (foreground.getShader() != null || foreground.getMode() != PaintMode.FILL || !foreground.isSrcOver())
/* 722 */       res.setForeground(foreground);  int i = this.fontStyle.unbox-impl(), $i$a$-let-ComputedStyle$toSkTextStyle$1 = 0; res.setFontStyle(SkiaParagraph_skikoKt.toSkFontStyle-nzbMABs(i)); TextDecoration textDecoration = this.textDecoration; int $i$a$-let-ComputedStyle$toSkTextStyle$2 = 0; res.setDecorationStyle(SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$toSkDecorationStyle-zoh9Kos(textDecoration, this.textForegroundStyle.getColor-0d7_KjU(), this.textDecorationLineStyle)); if (!Color.equals-impl0(this.background, Color.Companion.getUnspecified-0d7_KjU())) { Paint paint1 = new Paint(), paint2 = paint1; TextStyle textStyle = res; int $i$a$-also-ComputedStyle$toSkTextStyle$3 = 0; paint2.setColor(ColorKt.toArgb-8_81llA(this.background)); textStyle.setBackground(paint1); }  FontWeight fontWeight = this.fontWeight; int $i$a$-let-ComputedStyle$toSkTextStyle$4 = 0; res.setFontStyle(res.getFontStyle().withWeight(fontWeight.getWeight())); if (this.shadow != null) { Shadow shadow = this.shadow; int $i$a$-let-ComputedStyle$toSkTextStyle$5 = 0; res.addShadow(SkiaParagraph_skikoKt.toSkShadow(shadow)); } else {  }  float f1 = this.letterSpacing.floatValue(); int $i$a$-let-ComputedStyle$toSkTextStyle$6 = 0; res.setLetterSpacing(f1); if (this.fontFeatureSettings == null); FontFeature.Companion.addFontFeatures(this.fontFeatureSettings.parseW3("")); res.setFontSize(this.fontSize); FontFamily fontFamily = this.fontFamily; int $i$a$-let-ComputedStyle$toSkTextStyle$7 = 0; if (this.fontWeight == null); Object object = fontFamily.resolve-DPcqOEQ((FontFamily)this.fontWeight, FontWeight.Companion.getNormal(), (this.fontStyle != null) ? this.fontStyle.unbox-impl() : FontStyle.Companion.getNormal-_-LCdwA(), (this.fontSynthesis != null) ? this.fontSynthesis.unbox-impl() : FontSynthesis.Companion.getNone-GVVA2EU()).getValue(); Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.text.platform.FontLoadResult"); FontLoadResult resolved = (FontLoadResult)object; Collection<String> $this$toTypedArray$iv = resolved.getAliases(); int $i$f$toTypedArray = 0; Collection<String> thisCollection$iv = $this$toTypedArray$iv;
/* 723 */     res.setFontFamilies(thisCollection$iv.<String>toArray(new String[0])); res.setTypeface(resolved.getTypeface()); float it = this.baselineShift.unbox-impl(); int $i$a$-let-ComputedStyle$toSkTextStyle$8 = 0; FontMetrics fontMetrics = res.getFontMetrics(); res.setBaselineShift(it * fontMetrics.getAscent()); it = this.lineHeight.floatValue(); int $i$a$-let-ComputedStyle$toSkTextStyle$9 = 0; res.setHeight(Float.valueOf(it / this.fontSize)); return res; } public final void merge(@NotNull Density density, @NotNull SpanStyle other) { Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(other, "other"); float fontSize = SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$toPx-o2QH7mI(other.getFontSize-XSAIIZE(), density, this.fontSize); this.textForegroundStyle = this.textForegroundStyle.merge(other.getTextForegroundStyle$ui_text()); if (other.getFontFamily() != null) { FontFamily fontFamily = other.getFontFamily(); int $i$a$-let-ComputedStyle$merge$1 = 0; this.fontFamily = fontFamily; } else { other.getFontFamily(); }  this.fontSize = fontSize; if (other.getFontWeight() != null) { FontWeight fontWeight = other.getFontWeight(); int $i$a$-let-ComputedStyle$merge$2 = 0; this.fontWeight = fontWeight; } else { other.getFontWeight(); }  if (other.getFontStyle-4Lr2A7w() != null) { int i = other.getFontStyle-4Lr2A7w().unbox-impl(); int $i$a$-let-ComputedStyle$merge$3 = 0; this.fontStyle = FontStyle.box-impl(i); } else { other.getFontStyle-4Lr2A7w(); }  if (other.getFontSynthesis-ZQGJjVo() != null) { int i = other.getFontSynthesis-ZQGJjVo().unbox-impl(); int $i$a$-let-ComputedStyle$merge$4 = 0; this.fontSynthesis = FontSynthesis.box-impl(i); } else { other.getFontSynthesis-ZQGJjVo(); }  if (other.getFontFeatureSettings() != null) { String str = other.getFontFeatureSettings(); int $i$a$-let-ComputedStyle$merge$5 = 0; this.fontFeatureSettings = str; } else { other.getFontFeatureSettings(); }  if (!TextUnitKt.isUnspecified--R2X_6o(other.getLetterSpacing-XSAIIZE()))
/* 724 */       this.letterSpacing = Float.valueOf(SkiaParagraph_skikoKt__ParagraphBuilder_skikoKt.access$toPx-o2QH7mI(other.getLetterSpacing-XSAIIZE(), density, fontSize));  if (other.getBaselineShift-5SSeXJ0() != null) { float f = other.getBaselineShift-5SSeXJ0().unbox-impl(); int $i$a$-let-ComputedStyle$merge$6 = 0; this.baselineShift = BaselineShift.box-impl(f); } else { other.getBaselineShift-5SSeXJ0(); }  if (other.getTextGeometricTransform() != null) { TextGeometricTransform textGeometricTransform = other.getTextGeometricTransform(); int $i$a$-let-ComputedStyle$merge$7 = 0; this.textGeometricTransform = textGeometricTransform; } else { other.getTextGeometricTransform(); }  if (other.getLocaleList() != null) { LocaleList localeList = other.getLocaleList(); int $i$a$-let-ComputedStyle$merge$8 = 0; this.localeList = localeList; } else { other.getLocaleList(); }  long $this$isSpecified$iv = other.getBackground-0d7_KjU(); int $i$f$isSpecified-8_81llA = 0; if (($this$isSpecified$iv != 16L))
/*     */       this.background = other.getBackground-0d7_KjU(); 
/*     */     if (other.getTextDecoration() != null) {
/*     */       TextDecoration textDecoration = other.getTextDecoration();
/*     */       int $i$a$-let-ComputedStyle$merge$9 = 0;
/*     */       this.textDecoration = textDecoration;
/*     */     } else {
/*     */       other.getTextDecoration();
/*     */     } 
/*     */     if (other.getShadow() != null) {
/*     */       Shadow shadow = other.getShadow();
/*     */       int $i$a$-let-ComputedStyle$merge$10 = 0;
/*     */       this.shadow = shadow;
/*     */     } else {
/*     */       other.getShadow();
/*     */     } 
/*     */     if (other.getDrawStyle() != null) {
/*     */       DrawStyle drawStyle = other.getDrawStyle();
/*     */       int $i$a$-let-ComputedStyle$merge$11 = 0;
/*     */       this.drawStyle = drawStyle;
/*     */     } else {
/*     */       other.getDrawStyle();
/*     */     } 
/*     */     PlatformSpanStyle platformStyle = other.getPlatformStyle();
/*     */     int $i$a$-let-ComputedStyle$merge$12 = 0;
/*     */     int it = platformStyle.getTextDecorationLineStyle-Gch4ia8().unbox-impl(), $i$a$-let-ComputedStyle$merge$12$1 = 0;
/*     */     this.textDecorationLineStyle = TextDecorationLineStyle.box-impl(it);
/*     */     platformStyle.getTextDecorationLineStyle-Gch4ia8();
/*     */     other.getPlatformStyle(); }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextForegroundStyle component1() {
/*     */     return this.textForegroundStyle;
/*     */   }
/*     */   
/*     */   public final long component2-NH-jbRc() {
/*     */     return this.brushSize;
/*     */   }
/*     */   
/*     */   public final float component3() {
/*     */     return this.fontSize;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FontWeight component4() {
/*     */     return this.fontWeight;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FontStyle component5-4Lr2A7w() {
/*     */     return this.fontStyle;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FontSynthesis component6-ZQGJjVo() {
/*     */     return this.fontSynthesis;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FontFamily component7() {
/*     */     return this.fontFamily;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component8() {
/*     */     return this.fontFeatureSettings;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Float component9() {
/*     */     return this.letterSpacing;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final BaselineShift component10-5SSeXJ0() {
/*     */     return this.baselineShift;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final TextGeometricTransform component11() {
/*     */     return this.textGeometricTransform;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final LocaleList component12() {
/*     */     return this.localeList;
/*     */   }
/*     */   
/*     */   public final long component13-0d7_KjU() {
/*     */     return this.background;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final TextDecoration component14() {
/*     */     return this.textDecoration;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final TextDecorationLineStyle component15-Gch4ia8() {
/*     */     return this.textDecorationLineStyle;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Shadow component16() {
/*     */     return this.shadow;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final DrawStyle component17() {
/*     */     return this.drawStyle;
/*     */   }
/*     */   
/*     */   public final int component18-0nO6VwU() {
/*     */     return this.blendMode;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Float component19() {
/*     */     return this.lineHeight;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ComputedStyle copy-7k0DxQs(@NotNull TextForegroundStyle textForegroundStyle, long brushSize, float fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, @Nullable Float letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable TextDecorationLineStyle textDecorationLineStyle, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int blendMode, @Nullable Float lineHeight) {
/*     */     Intrinsics.checkNotNullParameter(textForegroundStyle, "textForegroundStyle");
/*     */     return new ComputedStyle(textForegroundStyle, brushSize, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, textDecorationLineStyle, shadow, drawStyle, blendMode, lineHeight, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     StringBuilder stringBuilder = new StringBuilder();
/*     */     stringBuilder.append("ComputedStyle(textForegroundStyle=").append(this.textForegroundStyle).append(", brushSize=").append(Size.toString-impl(this.brushSize)).append(", fontSize=").append(this.fontSize).append(", fontWeight=").append(this.fontWeight).append(", fontStyle=").append(this.fontStyle).append(", fontSynthesis=").append(this.fontSynthesis).append(", fontFamily=").append(this.fontFamily).append(", fontFeatureSettings=").append(this.fontFeatureSettings).append(", letterSpacing=").append(this.letterSpacing).append(", baselineShift=").append(this.baselineShift).append(", textGeometricTransform=").append(this.textGeometricTransform).append(", localeList=");
/*     */     stringBuilder.append(this.localeList).append(", background=").append(Color.toString-impl(this.background)).append(", textDecoration=").append(this.textDecoration).append(", textDecorationLineStyle=").append(this.textDecorationLineStyle).append(", shadow=").append(this.shadow).append(", drawStyle=").append(this.drawStyle).append(", blendMode=").append(BlendMode.toString-impl(this.blendMode)).append(", lineHeight=").append(this.lineHeight).append(')');
/*     */     return stringBuilder.toString();
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.textForegroundStyle.hashCode();
/*     */     result = result * 31 + Size.hashCode-impl(this.brushSize);
/*     */     result = result * 31 + Float.hashCode(this.fontSize);
/*     */     result = result * 31 + ((this.fontWeight == null) ? 0 : this.fontWeight.hashCode());
/*     */     result = result * 31 + ((this.fontStyle == null) ? 0 : FontStyle.hashCode-impl(this.fontStyle.unbox-impl()));
/*     */     result = result * 31 + ((this.fontSynthesis == null) ? 0 : FontSynthesis.hashCode-impl(this.fontSynthesis.unbox-impl()));
/*     */     result = result * 31 + ((this.fontFamily == null) ? 0 : this.fontFamily.hashCode());
/*     */     result = result * 31 + ((this.fontFeatureSettings == null) ? 0 : this.fontFeatureSettings.hashCode());
/*     */     result = result * 31 + ((this.letterSpacing == null) ? 0 : this.letterSpacing.hashCode());
/*     */     result = result * 31 + ((this.baselineShift == null) ? 0 : BaselineShift.hashCode-impl(this.baselineShift.unbox-impl()));
/*     */     result = result * 31 + ((this.textGeometricTransform == null) ? 0 : this.textGeometricTransform.hashCode());
/*     */     result = result * 31 + ((this.localeList == null) ? 0 : this.localeList.hashCode());
/*     */     result = result * 31 + Color.hashCode-impl(this.background);
/*     */     result = result * 31 + ((this.textDecoration == null) ? 0 : this.textDecoration.hashCode());
/*     */     result = result * 31 + ((this.textDecorationLineStyle == null) ? 0 : TextDecorationLineStyle.hashCode-impl(this.textDecorationLineStyle.unbox-impl()));
/*     */     result = result * 31 + ((this.shadow == null) ? 0 : this.shadow.hashCode());
/*     */     result = result * 31 + ((this.drawStyle == null) ? 0 : this.drawStyle.hashCode());
/*     */     result = result * 31 + BlendMode.hashCode-impl(this.blendMode);
/*     */     return result * 31 + ((this.lineHeight == null) ? 0 : this.lineHeight.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof ComputedStyle))
/*     */       return false; 
/*     */     ComputedStyle computedStyle = (ComputedStyle)other;
/*     */     return !Intrinsics.areEqual(this.textForegroundStyle, computedStyle.textForegroundStyle) ? false : (!Size.equals-impl0(this.brushSize, computedStyle.brushSize) ? false : ((Float.compare(this.fontSize, computedStyle.fontSize) != 0) ? false : (!Intrinsics.areEqual(this.fontWeight, computedStyle.fontWeight) ? false : (!Intrinsics.areEqual(this.fontStyle, computedStyle.fontStyle) ? false : (!Intrinsics.areEqual(this.fontSynthesis, computedStyle.fontSynthesis) ? false : (!Intrinsics.areEqual(this.fontFamily, computedStyle.fontFamily) ? false : (!Intrinsics.areEqual(this.fontFeatureSettings, computedStyle.fontFeatureSettings) ? false : (!Intrinsics.areEqual(this.letterSpacing, computedStyle.letterSpacing) ? false : (!Intrinsics.areEqual(this.baselineShift, computedStyle.baselineShift) ? false : (!Intrinsics.areEqual(this.textGeometricTransform, computedStyle.textGeometricTransform) ? false : (!Intrinsics.areEqual(this.localeList, computedStyle.localeList) ? false : (!Color.equals-impl0(this.background, computedStyle.background) ? false : (!Intrinsics.areEqual(this.textDecoration, computedStyle.textDecoration) ? false : (!Intrinsics.areEqual(this.textDecorationLineStyle, computedStyle.textDecorationLineStyle) ? false : (!Intrinsics.areEqual(this.shadow, computedStyle.shadow) ? false : (!Intrinsics.areEqual(this.drawStyle, computedStyle.drawStyle) ? false : (!BlendMode.equals-impl0(this.blendMode, computedStyle.blendMode) ? false : (!!Intrinsics.areEqual(this.lineHeight, computedStyle.lineHeight)))))))))))))))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\ComputedStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */