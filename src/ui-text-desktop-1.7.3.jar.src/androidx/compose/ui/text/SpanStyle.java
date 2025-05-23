/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontSynthesis;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import androidx.compose.ui.text.style.BaselineShift;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextForegroundStyle;
/*     */ import androidx.compose.ui.text.style.TextGeometricTransform;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b/\n\002\020\013\n\002\b\006\n\002\020\b\n\002\b\006\b\007\030\0002\0020\001B§\001\b\027\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\n\b\002\020\016\032\004\030\0010\017\022\b\b\002\020\020\032\0020\005\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\n\b\002\020\025\032\004\030\0010\026\022\b\b\002\020\027\032\0020\003\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033¢\006\002\020\034B³\001\b\027\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\n\b\002\020\016\032\004\030\0010\017\022\b\b\002\020\020\032\0020\005\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\n\b\002\020\025\032\004\030\0010\026\022\b\b\002\020\027\032\0020\003\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\n\b\002\020\035\032\004\030\0010\036¢\006\002\020\037B¿\001\b\026\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\n\b\002\020\016\032\004\030\0010\017\022\b\b\002\020\020\032\0020\005\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\n\b\002\020\025\032\004\030\0010\026\022\b\b\002\020\027\032\0020\003\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020 \032\004\030\0010!¢\006\002\020\"BÉ\001\b\026\022\b\020#\032\004\030\0010$\022\b\b\002\020%\032\0020&\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\n\b\002\020\016\032\004\030\0010\017\022\b\b\002\020\020\032\0020\005\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\n\b\002\020\025\032\004\030\0010\026\022\b\b\002\020\027\032\0020\003\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020 \032\004\030\0010!¢\006\002\020'B½\001\b\000\022\006\020(\032\0020)\022\b\b\002\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\n\b\002\020\016\032\004\030\0010\017\022\b\b\002\020\020\032\0020\005\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\n\b\002\020\025\032\004\030\0010\026\022\b\b\002\020\027\032\0020\003\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020 \032\004\030\0010!¢\006\002\020*JÒ\001\020O\032\0020\0002\b\020#\032\004\030\0010$2\b\b\002\020%\032\0020&2\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\0052\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\n\b\002\020\025\032\004\030\0010\0262\b\b\002\020\027\032\0020\0032\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020 \032\004\030\0010!ø\001\000¢\006\004\bP\020QJ²\001\020O\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\0052\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\n\b\002\020\025\032\004\030\0010\0262\b\b\002\020\027\032\0020\0032\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\033H\007ø\001\000¢\006\004\bR\020SJ¾\001\020O\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\0052\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\n\b\002\020\025\032\004\030\0010\0262\b\b\002\020\027\032\0020\0032\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\n\b\002\020\035\032\004\030\0010\036H\007ø\001\000¢\006\004\bT\020UJÈ\001\020O\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\b\b\002\020\020\032\0020\0052\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\n\b\002\020\025\032\004\030\0010\0262\b\b\002\020\027\032\0020\0032\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020 \032\004\030\0010!ø\001\000¢\006\004\bV\020WJ\023\020X\032\0020Y2\b\020Z\032\004\030\0010\001H\002J\025\020[\032\0020Y2\006\020Z\032\0020\000H\000¢\006\002\b\\J\025\020]\032\0020Y2\006\020Z\032\0020\000H\000¢\006\002\b^J\b\020_\032\0020`H\026J\r\020a\032\0020`H\000¢\006\002\bbJ\024\020c\032\0020\0002\n\b\002\020Z\032\004\030\0010\000H\007J\021\020d\032\0020\0002\006\020Z\032\0020\000H\002J\b\020e\032\0020\017H\026R\021\020%\032\0020&8F¢\006\006\032\004\b+\020,R\031\020\027\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020/\032\004\b-\020.R\031\020\021\032\004\030\0010\022ø\001\000ø\001\001¢\006\b\n\000\032\004\b0\0201R\023\020#\032\004\030\0010$8F¢\006\006\032\004\b2\0203R\027\020\002\032\0020\0038Fø\001\000ø\001\001¢\006\006\032\004\b4\020.R\023\020 \032\004\030\0010!¢\006\b\n\000\032\004\b5\0206R\023\020\f\032\004\030\0010\r¢\006\b\n\000\032\004\b7\0208R\023\020\016\032\004\030\0010\017¢\006\b\n\000\032\004\b9\020:R\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020/\032\004\b;\020.R\031\020\b\032\004\030\0010\tø\001\000ø\001\001¢\006\b\n\000\032\004\b<\020=R\031\020\n\032\004\030\0010\013ø\001\000ø\001\001¢\006\b\n\000\032\004\b>\020?R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b@\020AR\031\020\020\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020/\032\004\bB\020.R\023\020\025\032\004\030\0010\026¢\006\b\n\000\032\004\bC\020DR\023\020\035\032\004\030\0010\036¢\006\b\n\000\032\004\bE\020FR\023\020\032\032\004\030\0010\033¢\006\b\n\000\032\004\bG\020HR\023\020\030\032\004\030\0010\031¢\006\b\n\000\032\004\bI\020JR\024\020(\032\0020)X\004¢\006\b\n\000\032\004\bK\020LR\023\020\023\032\004\030\0010\024¢\006\b\n\000\032\004\bM\020N\002\013\n\005\b¡\0360\001\n\002\b!¨\006f"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "textForegroundStyle", "Landroidx/compose/ui/text/style/TextForegroundStyle;", "(Landroidx/compose/ui/text/style/TextForegroundStyle;JLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getLetterSpacing-XSAIIZE", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformSpanStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextForegroundStyle$ui_text", "()Landroidx/compose/ui/text/style/TextForegroundStyle;", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "copy", "copy-NcG25M8", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-IuqyXdg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;)Landroidx/compose/ui/text/SpanStyle;", "copy-2BkPm_w", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;)Landroidx/compose/ui/text/SpanStyle;", "copy-GSF8kmg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/SpanStyle;", "equals", "", "other", "hasSameLayoutAffectingAttributes", "hasSameLayoutAffectingAttributes$ui_text", "hasSameNonLayoutAttributes", "hasSameNonLayoutAttributes$ui_text", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text", "merge", "plus", "toString", "ui-text"})
/*     */ @Immutable
/*     */ public final class SpanStyle
/*     */ {
/*     */   @NotNull
/*     */   private final TextForegroundStyle textForegroundStyle;
/*     */   private final long fontSize;
/*     */   @Nullable
/*     */   private final FontWeight fontWeight;
/*     */   @Nullable
/*     */   private final FontStyle fontStyle;
/*     */   @Nullable
/*     */   private final FontSynthesis fontSynthesis;
/*     */   @Nullable
/*     */   private final FontFamily fontFamily;
/*     */   @Nullable
/*     */   private final String fontFeatureSettings;
/*     */   private final long letterSpacing;
/*     */   @Nullable
/*     */   private final BaselineShift baselineShift;
/*     */   @Nullable
/*     */   private final TextGeometricTransform textGeometricTransform;
/*     */   @Nullable
/*     */   private final LocaleList localeList;
/*     */   private final long background;
/*     */   @Nullable
/*     */   private final TextDecoration textDecoration;
/*     */   @Nullable
/*     */   private final Shadow shadow;
/*     */   @Nullable
/*     */   private final PlatformSpanStyle platformStyle;
/*     */   @Nullable
/*     */   private final DrawStyle drawStyle;
/*     */   public static final int $stable;
/*     */   
/*     */   @NotNull
/*     */   public final TextForegroundStyle getTextForegroundStyle$ui_text() {
/*     */     return this.textForegroundStyle;
/*     */   }
/*     */   
/*     */   public final long getFontSize-XSAIIZE() {
/*     */     return this.fontSize;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final FontWeight getFontWeight() {
/*     */     return this.fontWeight;
/*     */   }
/*     */   
/*     */   private SpanStyle(TextForegroundStyle textForegroundStyle, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
/*  92 */     this.textForegroundStyle = textForegroundStyle;
/*  93 */     this.fontSize = fontSize;
/*  94 */     this.fontWeight = fontWeight;
/*  95 */     this.fontStyle = fontStyle;
/*  96 */     this.fontSynthesis = fontSynthesis;
/*  97 */     this.fontFamily = fontFamily;
/*  98 */     this.fontFeatureSettings = fontFeatureSettings;
/*  99 */     this.letterSpacing = letterSpacing;
/* 100 */     this.baselineShift = baselineShift;
/* 101 */     this.textGeometricTransform = textGeometricTransform;
/* 102 */     this.localeList = localeList;
/* 103 */     this.background = background;
/* 104 */     this.textDecoration = textDecoration;
/* 105 */     this.shadow = shadow;
/* 106 */     this.platformStyle = platformStyle;
/* 107 */     this.drawStyle = drawStyle; } @Nullable public final DrawStyle getDrawStyle() { return this.drawStyle; }
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
/*     */   @Nullable
/*     */   public final FontSynthesis getFontSynthesis-ZQGJjVo() {
/*     */     return this.fontSynthesis;
/*     */   }
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
/*     */   @Nullable
/*     */   public final String getFontFeatureSettings() {
/*     */     return this.fontFeatureSettings;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getLetterSpacing-XSAIIZE() {
/*     */     return this.letterSpacing;
/*     */   }
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
/*     */   private SpanStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow) {
/* 163 */     this(
/* 164 */         TextForegroundStyle.Companion.from-8_81llA(color), 
/* 165 */         fontSize, 
/* 166 */         fontWeight, 
/* 167 */         fontStyle, 
/* 168 */         fontSynthesis, 
/* 169 */         fontFamily, 
/* 170 */         fontFeatureSettings, 
/* 171 */         letterSpacing, 
/* 172 */         baselineShift, 
/* 173 */         textGeometricTransform, 
/* 174 */         localeList, 
/* 175 */         background, 
/* 176 */         textDecoration, 
/* 177 */         shadow, 
/* 178 */         (PlatformSpanStyle)null, (DrawStyle)null, 32768, (DefaultConstructorMarker)null);
/*     */   }
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
/*     */   @Nullable
/*     */   public final LocaleList getLocaleList() {
/*     */     return this.localeList;
/*     */   }
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
/*     */   @Nullable
/*     */   public final TextDecoration getTextDecoration() {
/*     */     return this.textDecoration;
/*     */   }
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
/*     */   @Nullable
/*     */   public final PlatformSpanStyle getPlatformStyle() {
/*     */     return this.platformStyle;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private SpanStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle) {
/* 236 */     this(
/* 237 */         TextForegroundStyle.Companion.from-8_81llA(color), 
/* 238 */         fontSize, 
/* 239 */         fontWeight, 
/* 240 */         fontStyle, 
/* 241 */         fontSynthesis, 
/* 242 */         fontFamily, 
/* 243 */         fontFeatureSettings, 
/* 244 */         letterSpacing, 
/* 245 */         baselineShift, 
/* 246 */         textGeometricTransform, 
/* 247 */         localeList, 
/* 248 */         background, 
/* 249 */         textDecoration, 
/* 250 */         shadow, 
/* 251 */         platformStyle, (DrawStyle)null, 32768, (DefaultConstructorMarker)null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private SpanStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
/* 306 */     this(
/* 307 */         TextForegroundStyle.Companion.from-8_81llA(color), 
/* 308 */         fontSize, 
/* 309 */         fontWeight, 
/* 310 */         fontStyle, 
/* 311 */         fontSynthesis, 
/* 312 */         fontFamily, 
/* 313 */         fontFeatureSettings, 
/* 314 */         letterSpacing, 
/* 315 */         baselineShift, 
/* 316 */         textGeometricTransform, 
/* 317 */         localeList, 
/* 318 */         background, 
/* 319 */         textDecoration, 
/* 320 */         shadow, 
/* 321 */         platformStyle, 
/* 322 */         drawStyle, (DefaultConstructorMarker)null);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private SpanStyle(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, PlatformSpanStyle platformStyle, DrawStyle drawStyle) {
/* 382 */     this(
/* 383 */         TextForegroundStyle.Companion.from(brush, alpha), 
/* 384 */         fontSize, 
/* 385 */         fontWeight, 
/* 386 */         fontStyle, 
/* 387 */         fontSynthesis, 
/* 388 */         fontFamily, 
/* 389 */         fontFeatureSettings, 
/* 390 */         letterSpacing, 
/* 391 */         baselineShift, 
/* 392 */         textGeometricTransform, 
/* 393 */         localeList, 
/* 394 */         background, 
/* 395 */         textDecoration, 
/* 396 */         shadow, 
/* 397 */         platformStyle, 
/* 398 */         drawStyle, (DefaultConstructorMarker)null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final long getColor-0d7_KjU() {
/* 404 */     return this.textForegroundStyle.getColor-0d7_KjU();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Brush getBrush() {
/* 409 */     return this.textForegroundStyle.getBrush();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getAlpha() {
/* 415 */     return this.textForegroundStyle.getAlpha();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final SpanStyle merge(@Nullable SpanStyle other) {
/* 428 */     if (other == null) return this; 
/* 429 */     return SpanStyleKt.fastMerge-dSHsh3o(this, 
/* 430 */         other.textForegroundStyle.getColor-0d7_KjU(), 
/* 431 */         other.textForegroundStyle.getBrush(), 
/* 432 */         other.textForegroundStyle.getAlpha(), 
/* 433 */         other.fontSize, 
/* 434 */         other.fontWeight, 
/* 435 */         other.fontStyle, 
/* 436 */         other.fontSynthesis, 
/* 437 */         other.fontFamily, 
/* 438 */         other.fontFeatureSettings, 
/* 439 */         other.letterSpacing, 
/* 440 */         other.baselineShift, 
/* 441 */         other.textGeometricTransform, 
/* 442 */         other.localeList, 
/* 443 */         other.background, 
/* 444 */         other.textDecoration, 
/* 445 */         other.shadow, 
/* 446 */         other.platformStyle, 
/* 447 */         other.drawStyle);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final SpanStyle plus(@NotNull SpanStyle other) {
/* 455 */     Intrinsics.checkNotNullParameter(other, "other"); return merge(other);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public final SpanStyle copy-GSF8kmg(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformStyle, @Nullable DrawStyle drawStyle) {
/* 567 */     return new SpanStyle(
/* 568 */         Color.equals-impl0(color, getColor-0d7_KjU()) ? 
/* 569 */         this.textForegroundStyle : 
/*     */         
/* 571 */         TextForegroundStyle.Companion.from-8_81llA(color), 
/*     */         
/* 573 */         fontSize, 
/* 574 */         fontWeight, 
/* 575 */         fontStyle, 
/* 576 */         fontSynthesis, 
/* 577 */         fontFamily, 
/* 578 */         fontFeatureSettings, 
/* 579 */         letterSpacing, 
/* 580 */         baselineShift, 
/* 581 */         textGeometricTransform, 
/* 582 */         localeList, 
/* 583 */         background, 
/* 584 */         textDecoration, 
/* 585 */         shadow, 
/* 586 */         platformStyle, 
/* 587 */         drawStyle, null);
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
/*     */   @NotNull
/*     */   public final SpanStyle copy-NcG25M8(@Nullable Brush brush, float alpha, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable PlatformSpanStyle platformStyle, @Nullable DrawStyle drawStyle) {
/* 610 */     return new SpanStyle(
/* 611 */         TextForegroundStyle.Companion.from(brush, alpha), 
/* 612 */         fontSize, 
/* 613 */         fontWeight, 
/* 614 */         fontStyle, 
/* 615 */         fontSynthesis, 
/* 616 */         fontFamily, 
/* 617 */         fontFeatureSettings, 
/* 618 */         letterSpacing, 
/* 619 */         baselineShift, 
/* 620 */         textGeometricTransform, 
/* 621 */         localeList, 
/* 622 */         background, 
/* 623 */         textDecoration, 
/* 624 */         shadow, 
/* 625 */         platformStyle, 
/* 626 */         drawStyle, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 631 */     if (this == other) return true; 
/* 632 */     if (!(other instanceof SpanStyle)) return false; 
/* 633 */     return (hasSameLayoutAffectingAttributes$ui_text((SpanStyle)other) && 
/* 634 */       hasSameNonLayoutAttributes$ui_text((SpanStyle)other));
/*     */   }
/*     */   
/*     */   public final boolean hasSameLayoutAffectingAttributes$ui_text(@NotNull SpanStyle other) {
/* 638 */     Intrinsics.checkNotNullParameter(other, "other"); if (this == other) return true; 
/* 639 */     if (!TextUnit.equals-impl0(this.fontSize, other.fontSize)) return false; 
/* 640 */     if (!Intrinsics.areEqual(this.fontWeight, other.fontWeight)) return false; 
/* 641 */     if (!Intrinsics.areEqual(this.fontStyle, other.fontStyle)) return false; 
/* 642 */     if (!Intrinsics.areEqual(this.fontSynthesis, other.fontSynthesis)) return false; 
/* 643 */     if (!Intrinsics.areEqual(this.fontFamily, other.fontFamily)) return false; 
/* 644 */     if (!Intrinsics.areEqual(this.fontFeatureSettings, other.fontFeatureSettings)) return false; 
/* 645 */     if (!TextUnit.equals-impl0(this.letterSpacing, other.letterSpacing)) return false; 
/* 646 */     if (!Intrinsics.areEqual(this.baselineShift, other.baselineShift)) return false; 
/* 647 */     if (!Intrinsics.areEqual(this.textGeometricTransform, other.textGeometricTransform)) return false; 
/* 648 */     if (!Intrinsics.areEqual(this.localeList, other.localeList)) return false; 
/* 649 */     if (!Color.equals-impl0(this.background, other.background)) return false; 
/* 650 */     if (!Intrinsics.areEqual(this.platformStyle, other.platformStyle)) return false; 
/* 651 */     return true;
/*     */   }
/*     */   
/*     */   public final boolean hasSameNonLayoutAttributes$ui_text(@NotNull SpanStyle other) {
/* 655 */     Intrinsics.checkNotNullParameter(other, "other"); if (!Intrinsics.areEqual(this.textForegroundStyle, other.textForegroundStyle)) return false; 
/* 656 */     if (!Intrinsics.areEqual(this.textDecoration, other.textDecoration)) return false; 
/* 657 */     if (!Intrinsics.areEqual(this.shadow, other.shadow)) return false; 
/* 658 */     if (!Intrinsics.areEqual(this.drawStyle, other.drawStyle)) return false; 
/* 659 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 663 */     int result = Color.hashCode-impl(getColor-0d7_KjU());
/* 664 */     getBrush(); result = 31 * result + ((getBrush() != null) ? getBrush().hashCode() : 0);
/* 665 */     result = 31 * result + Float.hashCode(getAlpha());
/* 666 */     result = 31 * result + TextUnit.hashCode-impl(this.fontSize);
/* 667 */     result = 31 * result + ((this.fontWeight != null) ? this.fontWeight.hashCode() : 0);
/* 668 */     result = 31 * result + ((this.fontStyle != null) ? FontStyle.hashCode-impl(this.fontStyle.unbox-impl()) : 0);
/* 669 */     result = 31 * result + ((this.fontSynthesis != null) ? FontSynthesis.hashCode-impl(this.fontSynthesis.unbox-impl()) : 0);
/* 670 */     result = 31 * result + ((this.fontFamily != null) ? this.fontFamily.hashCode() : 0);
/* 671 */     result = 31 * result + ((this.fontFeatureSettings != null) ? this.fontFeatureSettings.hashCode() : 0);
/* 672 */     result = 31 * result + TextUnit.hashCode-impl(this.letterSpacing);
/* 673 */     result = 31 * result + ((this.baselineShift != null) ? BaselineShift.hashCode-impl(this.baselineShift.unbox-impl()) : 0);
/* 674 */     result = 31 * result + ((this.textGeometricTransform != null) ? this.textGeometricTransform.hashCode() : 0);
/* 675 */     result = 31 * result + ((this.localeList != null) ? this.localeList.hashCode() : 0);
/* 676 */     result = 31 * result + Color.hashCode-impl(this.background);
/* 677 */     result = 31 * result + ((this.textDecoration != null) ? this.textDecoration.hashCode() : 0);
/* 678 */     result = 31 * result + ((this.shadow != null) ? this.shadow.hashCode() : 0);
/* 679 */     result = 31 * result + ((this.platformStyle != null) ? this.platformStyle.hashCode() : 0);
/* 680 */     result = 31 * result + ((this.drawStyle != null) ? this.drawStyle.hashCode() : 0);
/* 681 */     return result;
/*     */   }
/*     */   
/*     */   public final int hashCodeLayoutAffectingAttributes$ui_text() {
/* 685 */     int result = TextUnit.hashCode-impl(this.fontSize);
/* 686 */     result = 31 * result + ((this.fontWeight != null) ? this.fontWeight.hashCode() : 0);
/* 687 */     result = 31 * result + ((this.fontStyle != null) ? FontStyle.hashCode-impl(this.fontStyle.unbox-impl()) : 0);
/* 688 */     result = 31 * result + ((this.fontSynthesis != null) ? FontSynthesis.hashCode-impl(this.fontSynthesis.unbox-impl()) : 0);
/* 689 */     result = 31 * result + ((this.fontFamily != null) ? this.fontFamily.hashCode() : 0);
/* 690 */     result = 31 * result + ((this.fontFeatureSettings != null) ? this.fontFeatureSettings.hashCode() : 0);
/* 691 */     result = 31 * result + TextUnit.hashCode-impl(this.letterSpacing);
/* 692 */     result = 31 * result + ((this.baselineShift != null) ? BaselineShift.hashCode-impl(this.baselineShift.unbox-impl()) : 0);
/* 693 */     result = 31 * result + ((this.textGeometricTransform != null) ? this.textGeometricTransform.hashCode() : 0);
/* 694 */     result = 31 * result + ((this.localeList != null) ? this.localeList.hashCode() : 0);
/* 695 */     result = 31 * result + Color.hashCode-impl(this.background);
/* 696 */     result = 31 * result + ((this.platformStyle != null) ? this.platformStyle.hashCode() : 0);
/* 697 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/* 703 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-SpanStyle$toString$1 = 0;
/* 704 */     $this$toString_u24lambda_u240.append("SpanStyle(");
/* 705 */     $this$toString_u24lambda_u240.append("color=" + Color.toString-impl(getColor-0d7_KjU()) + ", ");
/* 706 */     $this$toString_u24lambda_u240.append("brush=" + getBrush() + ", ");
/* 707 */     $this$toString_u24lambda_u240.append("alpha=" + getAlpha() + ", ");
/* 708 */     $this$toString_u24lambda_u240.append("fontSize=" + TextUnit.toString-impl(this.fontSize) + ", ");
/* 709 */     $this$toString_u24lambda_u240.append("fontWeight=" + this.fontWeight + ", ");
/* 710 */     $this$toString_u24lambda_u240.append("fontStyle=" + this.fontStyle + ", ");
/* 711 */     $this$toString_u24lambda_u240.append("fontSynthesis=" + this.fontSynthesis + ", ");
/* 712 */     $this$toString_u24lambda_u240.append("fontFamily=" + this.fontFamily + ", ");
/* 713 */     $this$toString_u24lambda_u240.append("fontFeatureSettings=" + this.fontFeatureSettings + ", ");
/* 714 */     $this$toString_u24lambda_u240.append("letterSpacing=" + TextUnit.toString-impl(this.letterSpacing) + ", ");
/* 715 */     $this$toString_u24lambda_u240.append("baselineShift=" + this.baselineShift + ", ");
/* 716 */     $this$toString_u24lambda_u240.append("textGeometricTransform=" + this.textGeometricTransform + ", ");
/* 717 */     $this$toString_u24lambda_u240.append("localeList=" + this.localeList + ", ");
/* 718 */     $this$toString_u24lambda_u240.append("background=" + Color.toString-impl(this.background) + ", ");
/* 719 */     $this$toString_u24lambda_u240.append("textDecoration=" + this.textDecoration + ", ");
/* 720 */     $this$toString_u24lambda_u240.append("shadow=" + this.shadow + ", ");
/* 721 */     $this$toString_u24lambda_u240.append("platformStyle=" + this.platformStyle + ", ");
/* 722 */     $this$toString_u24lambda_u240.append("drawStyle=" + this.drawStyle);
/* 723 */     $this$toString_u24lambda_u240.append(")");
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\SpanStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */