/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.ShadowKt;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontSynthesis;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.font.FontWeightKt;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import androidx.compose.ui.text.style.BaselineShift;
/*     */ import androidx.compose.ui.text.style.BaselineShiftKt;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextDrawStyleKt;
/*     */ import androidx.compose.ui.text.style.TextForegroundStyle;
/*     */ import androidx.compose.ui.text.style.TextGeometricTransform;
/*     */ import androidx.compose.ui.text.style.TextGeometricTransformKt;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\006\n\002\030\002\n\002\b\t\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\005\032\036\020\t\032\0020\n2\006\020\013\032\0020\n2\006\020\f\032\0020\n2\006\020\r\032\0020\016\032+\020\017\032\002H\020\"\004\b\000\020\0202\006\020\021\032\002H\0202\006\020\022\032\002H\0202\006\020\r\032\0020\016H\000¢\006\002\020\023\032&\020\024\032\004\030\0010\0252\b\020\013\032\004\030\0010\0252\b\020\f\032\004\030\0010\0252\006\020\r\032\0020\016H\002\032*\020\026\032\0020\0072\006\020\021\032\0020\0072\006\020\022\032\0020\0072\006\020\027\032\0020\016H\000ø\001\000¢\006\004\b\030\020\031\032\020\020\032\032\0020\n2\006\020\033\032\0020\nH\000\032À\001\020\034\032\0020\n*\0020\n2\006\020\035\032\0020\0012\b\020\036\032\004\030\0010\0372\006\020 \032\0020\0162\006\020!\032\0020\0072\b\020\"\032\004\030\0010#2\b\020$\032\004\030\0010%2\b\020&\032\004\030\0010'2\b\020(\032\004\030\0010)2\b\020*\032\004\030\0010+2\006\020,\032\0020\0072\b\020-\032\004\030\0010.2\b\020/\032\004\030\001002\b\0201\032\004\030\001022\006\0203\032\0020\0012\b\0204\032\004\030\001052\b\0206\032\004\030\001072\b\0208\032\004\030\0010\0252\b\0209\032\004\030\0010:H\000ø\001\000¢\006\004\b;\020<\032\030\020=\032\004\030\0010\025*\0020\n2\b\020>\032\004\030\0010\025H\002\"\020\020\000\032\0020\001X\004¢\006\004\n\002\020\002\"\020\020\003\032\0020\001X\004¢\006\004\n\002\020\002\"\016\020\004\032\0020\005X\004¢\006\002\n\000\"\020\020\006\032\0020\007X\004¢\006\004\n\002\020\002\"\020\020\b\032\0020\007X\004¢\006\004\n\002\020\002\002\007\n\005\b¡\0360\001¨\006?"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultColorForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", "style", "fastMerge", "color", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "fontSize", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "platformStyle", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "fastMerge-dSHsh3o", "(Landroidx/compose/ui/text/SpanStyle;JLandroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "mergePlatformStyle", "other", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,954:1\n708#2:955\n696#2:956\n696#2:958\n696#2:960\n708#2:961\n696#2:962\n251#3:957\n251#3:959\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n852#1:955\n852#1:956\n894#1:958\n909#1:960\n941#1:961\n941#1:962\n893#1:957\n899#1:959\n*E\n"})
/*     */ public final class SpanStyleKt
/*     */ {
/*  47 */   private static final long DefaultFontSize = TextUnitKt.getSp(14);
/*  48 */   private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);
/*  49 */   private static final long DefaultBackgroundColor = Color.Companion.getTransparent-0d7_KjU();
/*     */ 
/*     */   
/*  52 */   private static final long DefaultColor = Color.Companion.getBlack-0d7_KjU(); @NotNull
/*  53 */   private static final TextForegroundStyle DefaultColorForegroundStyle = TextForegroundStyle.Companion.from-8_81llA(DefaultColor);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final long lerpTextUnitInheritable-C3pnCVY(long a, long b, float t) {
/* 733 */     if (TextUnitKt.isUnspecified--R2X_6o(a) || TextUnitKt.isUnspecified--R2X_6o(b)) return ((TextUnit)lerpDiscrete(TextUnit.box-impl(a), TextUnit.box-impl(b), t)).unbox-impl(); 
/* 734 */     return TextUnitKt.lerp-C3pnCVY(a, b, t);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final <T> T lerpDiscrete(Object a, Object b, float fraction) {
/* 741 */     return (fraction < 0.5D) ? (T)a : (T)b;
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
/*     */   @NotNull
/*     */   public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float fraction) {
/* 758 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); TextForegroundStyle textForegroundStyle = TextDrawStyleKt.lerp(start.getTextForegroundStyle$ui_text(), stop.getTextForegroundStyle$ui_text(), fraction);
/* 759 */     FontFamily fontFamily = lerpDiscrete(
/* 760 */         start.getFontFamily(), 
/* 761 */         stop.getFontFamily(), 
/* 762 */         fraction);
/*     */     
/* 764 */     long l1 = lerpTextUnitInheritable-C3pnCVY(start.getFontSize-XSAIIZE(), stop.getFontSize-XSAIIZE(), fraction);
/*     */     
/* 766 */     if (start.getFontWeight() == null) start.getFontWeight(); 
/* 767 */     if (stop.getFontWeight() == null) stop.getFontWeight();  FontWeight fontWeight = FontWeightKt.lerp(stop.getFontWeight(), FontWeight.Companion.getNormal(), 
/* 768 */         fraction);
/*     */     
/* 770 */     FontStyle fontStyle = lerpDiscrete(
/* 771 */         start.getFontStyle-4Lr2A7w(), 
/* 772 */         stop.getFontStyle-4Lr2A7w(), 
/* 773 */         fraction);
/*     */     
/* 775 */     FontSynthesis fontSynthesis = lerpDiscrete(
/* 776 */         start.getFontSynthesis-ZQGJjVo(), 
/* 777 */         stop.getFontSynthesis-ZQGJjVo(), 
/* 778 */         fraction);
/*     */     
/* 780 */     String str = lerpDiscrete(
/* 781 */         start.getFontFeatureSettings(), 
/* 782 */         stop.getFontFeatureSettings(), 
/* 783 */         fraction);
/*     */     
/* 785 */     long l2 = lerpTextUnitInheritable-C3pnCVY(
/* 786 */         start.getLetterSpacing-XSAIIZE(), 
/* 787 */         stop.getLetterSpacing-XSAIIZE(), 
/* 788 */         fraction);
/*     */ 
/*     */     
/* 791 */     start.getBaselineShift-5SSeXJ0();
/* 792 */     stop.getBaselineShift-5SSeXJ0(); float f = BaselineShiftKt.lerp-jWV1Mfo((start.getBaselineShift-5SSeXJ0() != null) ? start.getBaselineShift-5SSeXJ0().unbox-impl() : BaselineShift.constructor-impl(0.0F), (stop.getBaselineShift-5SSeXJ0() != null) ? stop.getBaselineShift-5SSeXJ0().unbox-impl() : BaselineShift.constructor-impl(0.0F), 
/* 793 */         fraction);
/*     */ 
/*     */     
/* 796 */     if (start.getTextGeometricTransform() == null) start.getTextGeometricTransform(); 
/* 797 */     if (stop.getTextGeometricTransform() == null) stop.getTextGeometricTransform();  TextGeometricTransform textGeometricTransform = TextGeometricTransformKt.lerp(stop.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text(), 
/* 798 */         fraction);
/*     */     
/* 800 */     LocaleList localeList = lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), fraction);
/* 801 */     long l3 = ColorKt.lerp-jxsXWHM(
/* 802 */         start.getBackground-0d7_KjU(), 
/* 803 */         stop.getBackground-0d7_KjU(), 
/* 804 */         fraction);
/*     */     
/* 806 */     TextDecoration textDecoration = lerpDiscrete(
/* 807 */         start.getTextDecoration(), 
/* 808 */         stop.getTextDecoration(), 
/* 809 */         fraction);
/*     */ 
/*     */     
/* 812 */     if (start.getShadow() == null) start.getShadow(); 
/* 813 */     if (stop.getShadow() == null) stop.getShadow();  Shadow shadow = ShadowKt.lerp(stop.getShadow(), new Shadow(0L, 0L, 0.0F, 7, null), 
/* 814 */         fraction);
/*     */     
/* 816 */     PlatformSpanStyle platformSpanStyle = lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), fraction);
/* 817 */     DrawStyle drawStyle = lerpDiscrete(
/* 818 */         start.getDrawStyle(), 
/* 819 */         stop.getDrawStyle(), 
/* 820 */         fraction);
/*     */     return new SpanStyle(textForegroundStyle, l1, fontWeight, fontStyle, fontSynthesis, fontFamily, str, l2, BaselineShift.box-impl(f), textGeometricTransform, localeList, l3, textDecoration, shadow, platformSpanStyle, drawStyle, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle style) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'style'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: invokevirtual getTextForegroundStyle$ui_text : ()Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   10: getstatic androidx/compose/ui/text/SpanStyleKt$resolveSpanStyleDefaults$1.INSTANCE : Landroidx/compose/ui/text/SpanStyleKt$resolveSpanStyleDefaults$1;
/*     */     //   13: checkcast kotlin/jvm/functions/Function0
/*     */     //   16: invokeinterface takeOrElse : (Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   21: aload_0
/*     */     //   22: invokevirtual getFontSize-XSAIIZE : ()J
/*     */     //   25: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   28: ifeq -> 37
/*     */     //   31: getstatic androidx/compose/ui/text/SpanStyleKt.DefaultFontSize : J
/*     */     //   34: goto -> 41
/*     */     //   37: aload_0
/*     */     //   38: invokevirtual getFontSize-XSAIIZE : ()J
/*     */     //   41: aload_0
/*     */     //   42: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   45: dup
/*     */     //   46: ifnonnull -> 56
/*     */     //   49: pop
/*     */     //   50: getstatic androidx/compose/ui/text/font/FontWeight.Companion : Landroidx/compose/ui/text/font/FontWeight$Companion;
/*     */     //   53: invokevirtual getNormal : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   56: aload_0
/*     */     //   57: invokevirtual getFontStyle-4Lr2A7w : ()Landroidx/compose/ui/text/font/FontStyle;
/*     */     //   60: dup
/*     */     //   61: ifnull -> 70
/*     */     //   64: invokevirtual unbox-impl : ()I
/*     */     //   67: goto -> 77
/*     */     //   70: pop
/*     */     //   71: getstatic androidx/compose/ui/text/font/FontStyle.Companion : Landroidx/compose/ui/text/font/FontStyle$Companion;
/*     */     //   74: invokevirtual getNormal-_-LCdwA : ()I
/*     */     //   77: invokestatic box-impl : (I)Landroidx/compose/ui/text/font/FontStyle;
/*     */     //   80: aload_0
/*     */     //   81: invokevirtual getFontSynthesis-ZQGJjVo : ()Landroidx/compose/ui/text/font/FontSynthesis;
/*     */     //   84: dup
/*     */     //   85: ifnull -> 94
/*     */     //   88: invokevirtual unbox-impl : ()I
/*     */     //   91: goto -> 101
/*     */     //   94: pop
/*     */     //   95: getstatic androidx/compose/ui/text/font/FontSynthesis.Companion : Landroidx/compose/ui/text/font/FontSynthesis$Companion;
/*     */     //   98: invokevirtual getAll-GVVA2EU : ()I
/*     */     //   101: invokestatic box-impl : (I)Landroidx/compose/ui/text/font/FontSynthesis;
/*     */     //   104: aload_0
/*     */     //   105: invokevirtual getFontFamily : ()Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   108: dup
/*     */     //   109: ifnonnull -> 122
/*     */     //   112: pop
/*     */     //   113: getstatic androidx/compose/ui/text/font/FontFamily.Companion : Landroidx/compose/ui/text/font/FontFamily$Companion;
/*     */     //   116: invokevirtual getDefault : ()Landroidx/compose/ui/text/font/SystemFontFamily;
/*     */     //   119: checkcast androidx/compose/ui/text/font/FontFamily
/*     */     //   122: aload_0
/*     */     //   123: invokevirtual getFontFeatureSettings : ()Ljava/lang/String;
/*     */     //   126: dup
/*     */     //   127: ifnonnull -> 134
/*     */     //   130: pop
/*     */     //   131: ldc_w ''
/*     */     //   134: aload_0
/*     */     //   135: invokevirtual getLetterSpacing-XSAIIZE : ()J
/*     */     //   138: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   141: ifeq -> 150
/*     */     //   144: getstatic androidx/compose/ui/text/SpanStyleKt.DefaultLetterSpacing : J
/*     */     //   147: goto -> 154
/*     */     //   150: aload_0
/*     */     //   151: invokevirtual getLetterSpacing-XSAIIZE : ()J
/*     */     //   154: aload_0
/*     */     //   155: invokevirtual getBaselineShift-5SSeXJ0 : ()Landroidx/compose/ui/text/style/BaselineShift;
/*     */     //   158: dup
/*     */     //   159: ifnull -> 168
/*     */     //   162: invokevirtual unbox-impl : ()F
/*     */     //   165: goto -> 175
/*     */     //   168: pop
/*     */     //   169: getstatic androidx/compose/ui/text/style/BaselineShift.Companion : Landroidx/compose/ui/text/style/BaselineShift$Companion;
/*     */     //   172: invokevirtual getNone-y9eOQZs : ()F
/*     */     //   175: invokestatic box-impl : (F)Landroidx/compose/ui/text/style/BaselineShift;
/*     */     //   178: aload_0
/*     */     //   179: invokevirtual getTextGeometricTransform : ()Landroidx/compose/ui/text/style/TextGeometricTransform;
/*     */     //   182: dup
/*     */     //   183: ifnonnull -> 193
/*     */     //   186: pop
/*     */     //   187: getstatic androidx/compose/ui/text/style/TextGeometricTransform.Companion : Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;
/*     */     //   190: invokevirtual getNone$ui_text : ()Landroidx/compose/ui/text/style/TextGeometricTransform;
/*     */     //   193: aload_0
/*     */     //   194: invokevirtual getLocaleList : ()Landroidx/compose/ui/text/intl/LocaleList;
/*     */     //   197: dup
/*     */     //   198: ifnonnull -> 208
/*     */     //   201: pop
/*     */     //   202: getstatic androidx/compose/ui/text/intl/LocaleList.Companion : Landroidx/compose/ui/text/intl/LocaleList$Companion;
/*     */     //   205: invokevirtual getCurrent : ()Landroidx/compose/ui/text/intl/LocaleList;
/*     */     //   208: aload_0
/*     */     //   209: invokevirtual getBackground-0d7_KjU : ()J
/*     */     //   212: lstore_1
/*     */     //   213: iconst_0
/*     */     //   214: istore_3
/*     */     //   215: lload_1
/*     */     //   216: lstore #4
/*     */     //   218: iconst_0
/*     */     //   219: istore #6
/*     */     //   221: lload #4
/*     */     //   223: ldc2_w 16
/*     */     //   226: lcmp
/*     */     //   227: ifeq -> 234
/*     */     //   230: iconst_1
/*     */     //   231: goto -> 235
/*     */     //   234: iconst_0
/*     */     //   235: ifeq -> 242
/*     */     //   238: lload_1
/*     */     //   239: goto -> 297
/*     */     //   242: astore #20
/*     */     //   244: astore #19
/*     */     //   246: astore #18
/*     */     //   248: lstore #16
/*     */     //   250: astore #15
/*     */     //   252: astore #14
/*     */     //   254: astore #13
/*     */     //   256: astore #12
/*     */     //   258: astore #11
/*     */     //   260: lstore #9
/*     */     //   262: astore #8
/*     */     //   264: iconst_0
/*     */     //   265: istore #7
/*     */     //   267: getstatic androidx/compose/ui/text/SpanStyleKt.DefaultBackgroundColor : J
/*     */     //   270: lstore #21
/*     */     //   272: aload #8
/*     */     //   274: lload #9
/*     */     //   276: aload #11
/*     */     //   278: aload #12
/*     */     //   280: aload #13
/*     */     //   282: aload #14
/*     */     //   284: aload #15
/*     */     //   286: lload #16
/*     */     //   288: aload #18
/*     */     //   290: aload #19
/*     */     //   292: aload #20
/*     */     //   294: lload #21
/*     */     //   296: nop
/*     */     //   297: aload_0
/*     */     //   298: invokevirtual getTextDecoration : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   301: dup
/*     */     //   302: ifnonnull -> 312
/*     */     //   305: pop
/*     */     //   306: getstatic androidx/compose/ui/text/style/TextDecoration.Companion : Landroidx/compose/ui/text/style/TextDecoration$Companion;
/*     */     //   309: invokevirtual getNone : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   312: aload_0
/*     */     //   313: invokevirtual getShadow : ()Landroidx/compose/ui/graphics/Shadow;
/*     */     //   316: dup
/*     */     //   317: ifnonnull -> 327
/*     */     //   320: pop
/*     */     //   321: getstatic androidx/compose/ui/graphics/Shadow.Companion : Landroidx/compose/ui/graphics/Shadow$Companion;
/*     */     //   324: invokevirtual getNone : ()Landroidx/compose/ui/graphics/Shadow;
/*     */     //   327: aload_0
/*     */     //   328: invokevirtual getPlatformStyle : ()Landroidx/compose/ui/text/PlatformSpanStyle;
/*     */     //   331: aload_0
/*     */     //   332: invokevirtual getDrawStyle : ()Landroidx/compose/ui/graphics/drawscope/DrawStyle;
/*     */     //   335: dup
/*     */     //   336: ifnonnull -> 346
/*     */     //   339: pop
/*     */     //   340: getstatic androidx/compose/ui/graphics/drawscope/Fill.INSTANCE : Landroidx/compose/ui/graphics/drawscope/Fill;
/*     */     //   343: checkcast androidx/compose/ui/graphics/drawscope/DrawStyle
/*     */     //   346: aconst_null
/*     */     //   347: astore #23
/*     */     //   349: astore #24
/*     */     //   351: astore #25
/*     */     //   353: astore #26
/*     */     //   355: astore #27
/*     */     //   357: lstore #28
/*     */     //   359: astore #30
/*     */     //   361: astore #31
/*     */     //   363: astore #32
/*     */     //   365: lstore #33
/*     */     //   367: astore #35
/*     */     //   369: astore #36
/*     */     //   371: astore #37
/*     */     //   373: astore #38
/*     */     //   375: astore #39
/*     */     //   377: lstore #40
/*     */     //   379: astore #42
/*     */     //   381: new androidx/compose/ui/text/SpanStyle
/*     */     //   384: dup
/*     */     //   385: aload #42
/*     */     //   387: lload #40
/*     */     //   389: aload #39
/*     */     //   391: aload #38
/*     */     //   393: aload #37
/*     */     //   395: aload #36
/*     */     //   397: aload #35
/*     */     //   399: lload #33
/*     */     //   401: aload #32
/*     */     //   403: aload #31
/*     */     //   405: aload #30
/*     */     //   407: lload #28
/*     */     //   409: aload #27
/*     */     //   411: aload #26
/*     */     //   413: aload #25
/*     */     //   415: aload #24
/*     */     //   417: aload #23
/*     */     //   419: invokespecial <init> : (Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   422: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #836	-> 6
/*     */     //   #837	-> 6
/*     */     //   #838	-> 21
/*     */     //   #839	-> 41
/*     */     //   #840	-> 56
/*     */     //   #841	-> 80
/*     */     //   #842	-> 104
/*     */     //   #843	-> 122
/*     */     //   #844	-> 134
/*     */     //   #845	-> 144
/*     */     //   #847	-> 150
/*     */     //   #849	-> 154
/*     */     //   #850	-> 178
/*     */     //   #851	-> 193
/*     */     //   #852	-> 208
/*     */     //   #955	-> 215
/*     */     //   #956	-> 221
/*     */     //   #955	-> 235
/*     */     //   #852	-> 267
/*     */     //   #955	-> 296
/*     */     //   #853	-> 297
/*     */     //   #854	-> 312
/*     */     //   #855	-> 327
/*     */     //   #856	-> 331
/*     */     //   #836	-> 347
/*     */     //   #857	-> 422
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   267	3	7	$i$a$-takeOrElse-DxMtmZc-SpanStyleKt$resolveSpanStyleDefaults$2	I
/*     */     //   221	14	6	$i$f$isSpecified-8_81llA	I
/*     */     //   218	17	4	$this$isSpecified$iv$iv	J
/*     */     //   215	82	3	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   213	84	1	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   0	423	0	style	Landroidx/compose/ui/text/SpanStyle;
/*     */   }
/*     */   
/*     */   private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle start, PlatformSpanStyle stop, float fraction) {
/* 830 */     if (start == null && stop == null) return null; 
/* 831 */     if (start == null); PlatformSpanStyle startNonNull = PlatformSpanStyle.Companion.getDefault();
/* 832 */     if (stop == null); PlatformSpanStyle stopNonNull = PlatformSpanStyle.Companion.getDefault();
/* 833 */     return DesktopTextStyle_skikoKt.lerp(startNonNull, stopNonNull, fraction);
/*     */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "invoke"})
/*     */   static final class SpanStyleKt$resolveSpanStyleDefaults$1 extends Lambda implements Function0<TextForegroundStyle> { @NotNull
/*     */     public final TextForegroundStyle invoke() {
/* 837 */       return SpanStyleKt.DefaultColorForegroundStyle;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static final SpanStyleKt$resolveSpanStyleDefaults$1 INSTANCE = new SpanStyleKt$resolveSpanStyleDefaults$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     SpanStyleKt$resolveSpanStyleDefaults$1() {
/*     */       super(0);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public static final SpanStyle fastMerge-dSHsh3o(@NotNull SpanStyle $this$fastMerge_u2ddSHsh3o, long color, @Nullable Brush brush, float alpha, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformStyle, @Nullable DrawStyle drawStyle) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc_w '$this$fastMerge'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: lload #5
/*     */     //   9: lstore #24
/*     */     //   11: iconst_0
/*     */     //   12: istore #26
/*     */     //   14: lload #24
/*     */     //   16: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   19: ifne -> 26
/*     */     //   22: iconst_1
/*     */     //   23: goto -> 27
/*     */     //   26: iconst_0
/*     */     //   27: ifeq -> 42
/*     */     //   30: lload #5
/*     */     //   32: aload_0
/*     */     //   33: invokevirtual getFontSize-XSAIIZE : ()J
/*     */     //   36: invokestatic equals-impl0 : (JJ)Z
/*     */     //   39: ifeq -> 400
/*     */     //   42: aload_3
/*     */     //   43: ifnonnull -> 85
/*     */     //   46: lload_1
/*     */     //   47: lstore #24
/*     */     //   49: iconst_0
/*     */     //   50: istore #26
/*     */     //   52: lload #24
/*     */     //   54: ldc2_w 16
/*     */     //   57: lcmp
/*     */     //   58: ifeq -> 65
/*     */     //   61: iconst_1
/*     */     //   62: goto -> 66
/*     */     //   65: iconst_0
/*     */     //   66: ifeq -> 85
/*     */     //   69: lload_1
/*     */     //   70: aload_0
/*     */     //   71: invokevirtual getTextForegroundStyle$ui_text : ()Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   74: invokeinterface getColor-0d7_KjU : ()J
/*     */     //   79: invokestatic equals-impl0 : (JJ)Z
/*     */     //   82: ifeq -> 400
/*     */     //   85: aload #8
/*     */     //   87: ifnull -> 102
/*     */     //   90: aload #8
/*     */     //   92: aload_0
/*     */     //   93: invokevirtual getFontStyle-4Lr2A7w : ()Landroidx/compose/ui/text/font/FontStyle;
/*     */     //   96: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   99: ifeq -> 400
/*     */     //   102: aload #7
/*     */     //   104: ifnull -> 119
/*     */     //   107: aload #7
/*     */     //   109: aload_0
/*     */     //   110: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   113: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   116: ifeq -> 400
/*     */     //   119: aload #10
/*     */     //   121: ifnull -> 133
/*     */     //   124: aload #10
/*     */     //   126: aload_0
/*     */     //   127: invokevirtual getFontFamily : ()Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   130: if_acmpne -> 400
/*     */     //   133: lload #12
/*     */     //   135: lstore #24
/*     */     //   137: iconst_0
/*     */     //   138: istore #26
/*     */     //   140: lload #24
/*     */     //   142: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   145: ifne -> 152
/*     */     //   148: iconst_1
/*     */     //   149: goto -> 153
/*     */     //   152: iconst_0
/*     */     //   153: ifeq -> 168
/*     */     //   156: lload #12
/*     */     //   158: aload_0
/*     */     //   159: invokevirtual getLetterSpacing-XSAIIZE : ()J
/*     */     //   162: invokestatic equals-impl0 : (JJ)Z
/*     */     //   165: ifeq -> 400
/*     */     //   168: aload #19
/*     */     //   170: ifnull -> 185
/*     */     //   173: aload #19
/*     */     //   175: aload_0
/*     */     //   176: invokevirtual getTextDecoration : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   179: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   182: ifeq -> 400
/*     */     //   185: aload_3
/*     */     //   186: aload_0
/*     */     //   187: invokevirtual getTextForegroundStyle$ui_text : ()Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   190: invokeinterface getBrush : ()Landroidx/compose/ui/graphics/Brush;
/*     */     //   195: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   198: ifeq -> 400
/*     */     //   201: aload_3
/*     */     //   202: ifnull -> 228
/*     */     //   205: fload #4
/*     */     //   207: aload_0
/*     */     //   208: invokevirtual getTextForegroundStyle$ui_text : ()Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   211: invokeinterface getAlpha : ()F
/*     */     //   216: fcmpg
/*     */     //   217: ifne -> 224
/*     */     //   220: iconst_1
/*     */     //   221: goto -> 225
/*     */     //   224: iconst_0
/*     */     //   225: ifeq -> 400
/*     */     //   228: aload #9
/*     */     //   230: ifnull -> 245
/*     */     //   233: aload #9
/*     */     //   235: aload_0
/*     */     //   236: invokevirtual getFontSynthesis-ZQGJjVo : ()Landroidx/compose/ui/text/font/FontSynthesis;
/*     */     //   239: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   242: ifeq -> 400
/*     */     //   245: aload #11
/*     */     //   247: ifnull -> 262
/*     */     //   250: aload #11
/*     */     //   252: aload_0
/*     */     //   253: invokevirtual getFontFeatureSettings : ()Ljava/lang/String;
/*     */     //   256: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   259: ifeq -> 400
/*     */     //   262: aload #14
/*     */     //   264: ifnull -> 279
/*     */     //   267: aload #14
/*     */     //   269: aload_0
/*     */     //   270: invokevirtual getBaselineShift-5SSeXJ0 : ()Landroidx/compose/ui/text/style/BaselineShift;
/*     */     //   273: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   276: ifeq -> 400
/*     */     //   279: aload #15
/*     */     //   281: ifnull -> 296
/*     */     //   284: aload #15
/*     */     //   286: aload_0
/*     */     //   287: invokevirtual getTextGeometricTransform : ()Landroidx/compose/ui/text/style/TextGeometricTransform;
/*     */     //   290: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   293: ifeq -> 400
/*     */     //   296: aload #16
/*     */     //   298: ifnull -> 313
/*     */     //   301: aload #16
/*     */     //   303: aload_0
/*     */     //   304: invokevirtual getLocaleList : ()Landroidx/compose/ui/text/intl/LocaleList;
/*     */     //   307: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   310: ifeq -> 400
/*     */     //   313: lload #17
/*     */     //   315: lstore #24
/*     */     //   317: iconst_0
/*     */     //   318: istore #26
/*     */     //   320: lload #24
/*     */     //   322: ldc2_w 16
/*     */     //   325: lcmp
/*     */     //   326: ifeq -> 333
/*     */     //   329: iconst_1
/*     */     //   330: goto -> 334
/*     */     //   333: iconst_0
/*     */     //   334: ifeq -> 349
/*     */     //   337: lload #17
/*     */     //   339: aload_0
/*     */     //   340: invokevirtual getBackground-0d7_KjU : ()J
/*     */     //   343: invokestatic equals-impl0 : (JJ)Z
/*     */     //   346: ifeq -> 400
/*     */     //   349: aload #20
/*     */     //   351: ifnull -> 366
/*     */     //   354: aload #20
/*     */     //   356: aload_0
/*     */     //   357: invokevirtual getShadow : ()Landroidx/compose/ui/graphics/Shadow;
/*     */     //   360: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   363: ifeq -> 400
/*     */     //   366: aload #21
/*     */     //   368: ifnull -> 383
/*     */     //   371: aload #21
/*     */     //   373: aload_0
/*     */     //   374: invokevirtual getPlatformStyle : ()Landroidx/compose/ui/text/PlatformSpanStyle;
/*     */     //   377: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   380: ifeq -> 400
/*     */     //   383: aload #22
/*     */     //   385: ifnull -> 404
/*     */     //   388: aload #22
/*     */     //   390: aload_0
/*     */     //   391: invokevirtual getDrawStyle : ()Landroidx/compose/ui/graphics/drawscope/DrawStyle;
/*     */     //   394: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   397: ifne -> 404
/*     */     //   400: iconst_1
/*     */     //   401: goto -> 405
/*     */     //   404: iconst_0
/*     */     //   405: istore #23
/*     */     //   407: iload #23
/*     */     //   409: ifne -> 414
/*     */     //   412: aload_0
/*     */     //   413: areturn
/*     */     //   414: aload_3
/*     */     //   415: ifnull -> 430
/*     */     //   418: getstatic androidx/compose/ui/text/style/TextForegroundStyle.Companion : Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;
/*     */     //   421: aload_3
/*     */     //   422: fload #4
/*     */     //   424: invokevirtual from : (Landroidx/compose/ui/graphics/Brush;F)Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   427: goto -> 437
/*     */     //   430: getstatic androidx/compose/ui/text/style/TextForegroundStyle.Companion : Landroidx/compose/ui/text/style/TextForegroundStyle$Companion;
/*     */     //   433: lload_1
/*     */     //   434: invokevirtual from-8_81llA : (J)Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   437: astore #24
/*     */     //   439: aload_0
/*     */     //   440: invokevirtual getTextForegroundStyle$ui_text : ()Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   443: aload #24
/*     */     //   445: invokeinterface merge : (Landroidx/compose/ui/text/style/TextForegroundStyle;)Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   450: astore #25
/*     */     //   452: aload #10
/*     */     //   454: dup
/*     */     //   455: ifnonnull -> 463
/*     */     //   458: pop
/*     */     //   459: aload_0
/*     */     //   460: invokevirtual getFontFamily : ()Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   463: astore #26
/*     */     //   465: lload #5
/*     */     //   467: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   470: ifne -> 478
/*     */     //   473: lload #5
/*     */     //   475: goto -> 482
/*     */     //   478: aload_0
/*     */     //   479: invokevirtual getFontSize-XSAIIZE : ()J
/*     */     //   482: lstore #27
/*     */     //   484: aload #7
/*     */     //   486: dup
/*     */     //   487: ifnonnull -> 495
/*     */     //   490: pop
/*     */     //   491: aload_0
/*     */     //   492: invokevirtual getFontWeight : ()Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   495: astore #29
/*     */     //   497: aload #8
/*     */     //   499: dup
/*     */     //   500: ifnonnull -> 508
/*     */     //   503: pop
/*     */     //   504: aload_0
/*     */     //   505: invokevirtual getFontStyle-4Lr2A7w : ()Landroidx/compose/ui/text/font/FontStyle;
/*     */     //   508: astore #30
/*     */     //   510: aload #9
/*     */     //   512: dup
/*     */     //   513: ifnonnull -> 521
/*     */     //   516: pop
/*     */     //   517: aload_0
/*     */     //   518: invokevirtual getFontSynthesis-ZQGJjVo : ()Landroidx/compose/ui/text/font/FontSynthesis;
/*     */     //   521: astore #31
/*     */     //   523: aload #11
/*     */     //   525: dup
/*     */     //   526: ifnonnull -> 534
/*     */     //   529: pop
/*     */     //   530: aload_0
/*     */     //   531: invokevirtual getFontFeatureSettings : ()Ljava/lang/String;
/*     */     //   534: astore #32
/*     */     //   536: lload #12
/*     */     //   538: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   541: ifne -> 549
/*     */     //   544: lload #12
/*     */     //   546: goto -> 553
/*     */     //   549: aload_0
/*     */     //   550: invokevirtual getLetterSpacing-XSAIIZE : ()J
/*     */     //   553: lstore #33
/*     */     //   555: aload #14
/*     */     //   557: dup
/*     */     //   558: ifnonnull -> 566
/*     */     //   561: pop
/*     */     //   562: aload_0
/*     */     //   563: invokevirtual getBaselineShift-5SSeXJ0 : ()Landroidx/compose/ui/text/style/BaselineShift;
/*     */     //   566: astore #35
/*     */     //   568: aload #15
/*     */     //   570: dup
/*     */     //   571: ifnonnull -> 579
/*     */     //   574: pop
/*     */     //   575: aload_0
/*     */     //   576: invokevirtual getTextGeometricTransform : ()Landroidx/compose/ui/text/style/TextGeometricTransform;
/*     */     //   579: astore #36
/*     */     //   581: aload #16
/*     */     //   583: dup
/*     */     //   584: ifnonnull -> 592
/*     */     //   587: pop
/*     */     //   588: aload_0
/*     */     //   589: invokevirtual getLocaleList : ()Landroidx/compose/ui/text/intl/LocaleList;
/*     */     //   592: astore #37
/*     */     //   594: lload #17
/*     */     //   596: lstore #40
/*     */     //   598: iconst_0
/*     */     //   599: istore #42
/*     */     //   601: lload #40
/*     */     //   603: lstore #43
/*     */     //   605: iconst_0
/*     */     //   606: istore #45
/*     */     //   608: lload #43
/*     */     //   610: ldc2_w 16
/*     */     //   613: lcmp
/*     */     //   614: ifeq -> 621
/*     */     //   617: iconst_1
/*     */     //   618: goto -> 622
/*     */     //   621: iconst_0
/*     */     //   622: ifeq -> 630
/*     */     //   625: lload #40
/*     */     //   627: goto -> 638
/*     */     //   630: iconst_0
/*     */     //   631: istore #46
/*     */     //   633: aload_0
/*     */     //   634: invokevirtual getBackground-0d7_KjU : ()J
/*     */     //   637: nop
/*     */     //   638: lstore #38
/*     */     //   640: aload #19
/*     */     //   642: dup
/*     */     //   643: ifnonnull -> 651
/*     */     //   646: pop
/*     */     //   647: aload_0
/*     */     //   648: invokevirtual getTextDecoration : ()Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   651: astore #40
/*     */     //   653: aload #20
/*     */     //   655: dup
/*     */     //   656: ifnonnull -> 664
/*     */     //   659: pop
/*     */     //   660: aload_0
/*     */     //   661: invokevirtual getShadow : ()Landroidx/compose/ui/graphics/Shadow;
/*     */     //   664: astore #41
/*     */     //   666: aload_0
/*     */     //   667: aload #21
/*     */     //   669: invokestatic mergePlatformStyle : (Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/PlatformSpanStyle;
/*     */     //   672: astore #42
/*     */     //   674: aload #22
/*     */     //   676: dup
/*     */     //   677: ifnonnull -> 685
/*     */     //   680: pop
/*     */     //   681: aload_0
/*     */     //   682: invokevirtual getDrawStyle : ()Landroidx/compose/ui/graphics/drawscope/DrawStyle;
/*     */     //   685: astore #43
/*     */     //   687: new androidx/compose/ui/text/SpanStyle
/*     */     //   690: dup
/*     */     //   691: aload #25
/*     */     //   693: lload #27
/*     */     //   695: aload #29
/*     */     //   697: aload #30
/*     */     //   699: aload #31
/*     */     //   701: aload #26
/*     */     //   703: aload #32
/*     */     //   705: lload #33
/*     */     //   707: aload #35
/*     */     //   709: aload #36
/*     */     //   711: aload #37
/*     */     //   713: lload #38
/*     */     //   715: aload #40
/*     */     //   717: aload #41
/*     */     //   719: aload #42
/*     */     //   721: aload #43
/*     */     //   723: aconst_null
/*     */     //   724: invokespecial <init> : (Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   727: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #893	-> 7
/*     */     //   #957	-> 14
/*     */     //   #893	-> 30
/*     */     //   #894	-> 42
/*     */     //   #958	-> 52
/*     */     //   #894	-> 69
/*     */     //   #895	-> 85
/*     */     //   #896	-> 102
/*     */     //   #898	-> 119
/*     */     //   #899	-> 133
/*     */     //   #959	-> 140
/*     */     //   #899	-> 156
/*     */     //   #900	-> 168
/*     */     //   #902	-> 185
/*     */     //   #903	-> 201
/*     */     //   #904	-> 228
/*     */     //   #905	-> 245
/*     */     //   #906	-> 262
/*     */     //   #907	-> 279
/*     */     //   #908	-> 296
/*     */     //   #909	-> 313
/*     */     //   #960	-> 320
/*     */     //   #909	-> 337
/*     */     //   #910	-> 349
/*     */     //   #911	-> 366
/*     */     //   #912	-> 383
/*     */     //   #893	-> 405
/*     */     //   #914	-> 407
/*     */     //   #916	-> 412
/*     */     //   #919	-> 414
/*     */     //   #920	-> 418
/*     */     //   #922	-> 430
/*     */     //   #919	-> 437
/*     */     //   #926	-> 439
/*     */     //   #927	-> 452
/*     */     //   #928	-> 465
/*     */     //   #929	-> 484
/*     */     //   #930	-> 497
/*     */     //   #931	-> 510
/*     */     //   #932	-> 523
/*     */     //   #933	-> 536
/*     */     //   #934	-> 544
/*     */     //   #936	-> 549
/*     */     //   #933	-> 553
/*     */     //   #938	-> 555
/*     */     //   #939	-> 568
/*     */     //   #940	-> 581
/*     */     //   #941	-> 594
/*     */     //   #961	-> 601
/*     */     //   #962	-> 608
/*     */     //   #961	-> 622
/*     */     //   #941	-> 633
/*     */     //   #961	-> 637
/*     */     //   #941	-> 638
/*     */     //   #942	-> 640
/*     */     //   #943	-> 653
/*     */     //   #944	-> 666
/*     */     //   #945	-> 674
/*     */     //   #925	-> 687
/*     */     //   #926	-> 691
/*     */     //   #928	-> 693
/*     */     //   #929	-> 695
/*     */     //   #930	-> 697
/*     */     //   #931	-> 699
/*     */     //   #927	-> 701
/*     */     //   #932	-> 703
/*     */     //   #933	-> 705
/*     */     //   #938	-> 707
/*     */     //   #939	-> 709
/*     */     //   #940	-> 711
/*     */     //   #941	-> 713
/*     */     //   #942	-> 715
/*     */     //   #943	-> 717
/*     */     //   #944	-> 719
/*     */     //   #945	-> 721
/*     */     //   #925	-> 724
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   14	13	26	$i$f$isSpecified--R2X_6o	I
/*     */     //   11	16	24	$this$isSpecified$iv	J
/*     */     //   52	14	26	$i$f$isSpecified-8_81llA	I
/*     */     //   49	17	24	$this$isSpecified$iv	J
/*     */     //   140	13	26	$i$f$isSpecified--R2X_6o	I
/*     */     //   137	16	24	$this$isSpecified$iv	J
/*     */     //   320	14	26	$i$f$isSpecified-8_81llA	I
/*     */     //   317	17	24	$this$isSpecified$iv	J
/*     */     //   633	4	46	$i$a$-takeOrElse-DxMtmZc-SpanStyleKt$fastMerge$1	I
/*     */     //   608	14	45	$i$f$isSpecified-8_81llA	I
/*     */     //   605	17	43	$this$isSpecified$iv$iv	J
/*     */     //   601	37	42	$i$f$takeOrElse-DxMtmZc	I
/*     */     //   598	40	40	$this$takeOrElse_u2dDxMtmZc$iv	J
/*     */     //   407	321	23	requiresAlloc	Z
/*     */     //   439	289	24	otherTextForegroundStyle	Landroidx/compose/ui/text/style/TextForegroundStyle;
/*     */     //   0	728	0	$this$fastMerge_u2ddSHsh3o	Landroidx/compose/ui/text/SpanStyle;
/*     */     //   0	728	1	color	J
/*     */     //   0	728	3	brush	Landroidx/compose/ui/graphics/Brush;
/*     */     //   0	728	4	alpha	F
/*     */     //   0	728	5	fontSize	J
/*     */     //   0	728	7	fontWeight	Landroidx/compose/ui/text/font/FontWeight;
/*     */     //   0	728	8	fontStyle	Landroidx/compose/ui/text/font/FontStyle;
/*     */     //   0	728	9	fontSynthesis	Landroidx/compose/ui/text/font/FontSynthesis;
/*     */     //   0	728	10	fontFamily	Landroidx/compose/ui/text/font/FontFamily;
/*     */     //   0	728	11	fontFeatureSettings	Ljava/lang/String;
/*     */     //   0	728	12	letterSpacing	J
/*     */     //   0	728	14	baselineShift	Landroidx/compose/ui/text/style/BaselineShift;
/*     */     //   0	728	15	textGeometricTransform	Landroidx/compose/ui/text/style/TextGeometricTransform;
/*     */     //   0	728	16	localeList	Landroidx/compose/ui/text/intl/LocaleList;
/*     */     //   0	728	17	background	J
/*     */     //   0	728	19	textDecoration	Landroidx/compose/ui/text/style/TextDecoration;
/*     */     //   0	728	20	shadow	Landroidx/compose/ui/graphics/Shadow;
/*     */     //   0	728	21	platformStyle	Landroidx/compose/ui/text/PlatformSpanStyle;
/*     */     //   0	728	22	drawStyle	Landroidx/compose/ui/graphics/drawscope/DrawStyle;
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
/*     */   private static final PlatformSpanStyle mergePlatformStyle(SpanStyle $this$mergePlatformStyle, PlatformSpanStyle other) {
/* 950 */     if ($this$mergePlatformStyle.getPlatformStyle() == null) return other; 
/* 951 */     if (other == null) return $this$mergePlatformStyle.getPlatformStyle(); 
/* 952 */     return $this$mergePlatformStyle.getPlatformStyle().merge(other);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\SpanStyleKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */