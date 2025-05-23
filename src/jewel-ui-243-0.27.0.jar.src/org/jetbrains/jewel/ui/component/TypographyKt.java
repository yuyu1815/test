/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.PlatformTextStyle;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontSynthesis;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import androidx.compose.ui.text.style.BaselineShift;
/*     */ import androidx.compose.ui.text.style.LineHeightStyle;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextGeometricTransform;
/*     */ import androidx.compose.ui.text.style.TextIndent;
/*     */ import androidx.compose.ui.text.style.TextMotion;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import androidx.compose.ui.unit.TextUnitType;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\001\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\007\n\002\b\t\032\002\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\0032\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\n\b\002\020\025\032\004\030\0010\0262\b\b\002\020\027\032\0020\0052\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\n\b\002\020\034\032\004\030\0010\0352\b\b\002\020\036\032\0020\0372\b\b\002\020 \032\0020!2\n\b\002\020\"\032\004\030\0010#2\n\b\002\020$\032\004\030\0010%2\n\b\002\020&\032\004\030\0010'2\b\b\002\020(\032\0020)2\b\b\002\020*\032\0020+2\n\b\002\020,\032\004\030\0010-¢\006\004\b.\020/\032\002\020\000\032\0020\001*\0020\0012\006\020\002\032\0020\0032\b\0200\032\004\030\001012\b\b\002\0202\032\002032\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\0032\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\n\b\002\020\025\032\004\030\0010\0262\b\b\002\020\027\032\0020\0052\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\n\b\002\020\034\032\004\030\0010\0352\b\b\002\020\036\032\0020\0372\b\b\002\020 \032\0020!2\n\b\002\020\"\032\004\030\0010#2\n\b\002\020$\032\004\030\0010%2\n\b\002\020&\032\004\030\0010'2\b\b\002\020(\032\0020)2\b\b\002\020*\032\0020+2\n\b\002\020,\032\004\030\0010-¢\006\004\b4\0205\032\034\0206\032\0020\003*\0020\0032\006\0207\032\0020\003H\002¢\006\004\b8\0209\032\034\020:\032\0020\003*\0020\0032\006\0207\032\0020\003H\002¢\006\004\b;\0209¨\006<"}, d2 = {"copyWithSize", "Landroidx/compose/ui/text/TextStyle;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "color", "Landroidx/compose/ui/graphics/Color;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "copyWithSize-Ce1Lr_4", "(Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "copyWithSize-nfnV_I0", "(Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IILandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "plus", "other", "plus-NB67dxo", "(JJ)J", "minus", "minus-NB67dxo", "ui"})
/*     */ @SourceDebugExtension({"SMAP\nTypography.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Typography.kt\norg/jetbrains/jewel/ui/component/TypographyKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,233:1\n147#2,2:234\n147#2,2:236\n*S KotlinDebug\n*F\n+ 1 Typography.kt\norg/jetbrains/jewel/ui/component/TypographyKt\n*L\n150#1:234,2\n209#1:236,2\n*E\n"})
/*     */ public final class TypographyKt
/*     */ {
/*     */   @NotNull
/*     */   public static final TextStyle copyWithSize-Ce1Lr_4(@NotNull TextStyle $this$copyWithSize_u2dCe1Lr_4, long fontSize, long color, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) {
/* 132 */     Intrinsics.checkNotNullParameter($this$copyWithSize_u2dCe1Lr_4, "$this$copyWithSize");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 150 */     float other$iv = 1.3F; int $i$f$times-kPz2Gy4 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 234 */     TextUnitKt.checkArithmetic--R2X_6o(fontSize);
/* 235 */     return $this$copyWithSize_u2dCe1Lr_4.copy-p1EtxEg(color, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, drawStyle, textAlign, textDirection, TextUnitKt.pack(TextUnit.getRawType-impl(fontSize), TextUnit.getValue-impl(fontSize) * other$iv), textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion); } @NotNull public static final TextStyle copyWithSize-nfnV_I0(@NotNull TextStyle $this$copyWithSize_u2dnfnV_I0, long fontSize, @Nullable Brush brush, float alpha, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) { Intrinsics.checkNotNullParameter($this$copyWithSize_u2dnfnV_I0, "$this$copyWithSize"); float other$iv = 1.3F; int $i$f$times-kPz2Gy4 = 0;
/* 236 */     TextUnitKt.checkArithmetic--R2X_6o(fontSize);
/* 237 */     return $this$copyWithSize_u2dnfnV_I0.copy-Ns73l9s(brush, alpha, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, drawStyle, textAlign, textDirection, TextUnitKt.pack(TextUnit.getRawType-impl(fontSize), TextUnit.getValue-impl(fontSize) * other$iv), textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion); }
/*     */ 
/*     */   
/*     */   public static final long plus-NB67dxo(long $this$plus_u2dNB67dxo, long other) {
/*     */     if (TextUnitKt.isUnspecified--R2X_6o($this$plus_u2dNB67dxo) && TextUnitKt.isUnspecified--R2X_6o(other)) {
/*     */     
/*     */     } else {
/*     */       throw new IllegalStateException(("Can't add together different TextUnits. Got " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA($this$plus_u2dNB67dxo)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(other))).toString());
/*     */     } 
/*     */     return (TextUnit.isSp-impl($this$plus_u2dNB67dxo) && TextUnit.isSp-impl(other)) ? TextUnitKt.TextUnit-anM5pPY(TextUnit.getValue-impl($this$plus_u2dNB67dxo) + TextUnit.getValue-impl(other), TextUnitType.Companion.getSp-UIouoOA()) : ((TextUnit.isEm-impl($this$plus_u2dNB67dxo) && TextUnit.isEm-impl(other)) ? TextUnitKt.TextUnit-anM5pPY(TextUnit.getValue-impl($this$plus_u2dNB67dxo) + TextUnit.getValue-impl(other), TextUnitType.Companion.getEm-UIouoOA()) : "JD-Core does not support Kotlin");
/*     */   }
/*     */   
/*     */   public static final long minus-NB67dxo(long $this$minus_u2dNB67dxo, long other) {
/*     */     if (TextUnitKt.isUnspecified--R2X_6o($this$minus_u2dNB67dxo) && TextUnitKt.isUnspecified--R2X_6o(other)) {
/*     */     
/*     */     } else {
/*     */       throw new IllegalStateException(("Can't subtract different TextUnits. Got " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA($this$minus_u2dNB67dxo)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(other))).toString());
/*     */     } 
/*     */     return (TextUnit.isSp-impl($this$minus_u2dNB67dxo) && TextUnit.isSp-impl(other)) ? TextUnitKt.TextUnit-anM5pPY(TextUnit.getValue-impl($this$minus_u2dNB67dxo) - TextUnit.getValue-impl(other), TextUnitType.Companion.getSp-UIouoOA()) : ((TextUnit.isEm-impl($this$minus_u2dNB67dxo) && TextUnit.isEm-impl(other)) ? TextUnitKt.TextUnit-anM5pPY(TextUnit.getValue-impl($this$minus_u2dNB67dxo) - TextUnit.getValue-impl(other), TextUnitType.Companion.getEm-UIouoOA()) : "JD-Core does not support Kotlin");
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TypographyKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */