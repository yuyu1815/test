/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.saveable.Saver;
/*     */ import androidx.compose.runtime.saveable.SaverKt;
/*     */ import androidx.compose.runtime.saveable.SaverScope;
/*     */ import androidx.compose.ui.geometry.Offset;
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.graphics.Shadow;
/*     */ import androidx.compose.ui.text.font.FontStyle;
/*     */ import androidx.compose.ui.text.font.FontSynthesis;
/*     */ import androidx.compose.ui.text.font.FontWeight;
/*     */ import androidx.compose.ui.text.intl.Locale;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import androidx.compose.ui.text.style.BaselineShift;
/*     */ import androidx.compose.ui.text.style.TextAlign;
/*     */ import androidx.compose.ui.text.style.TextDecoration;
/*     */ import androidx.compose.ui.text.style.TextDirection;
/*     */ import androidx.compose.ui.text.style.TextGeometricTransform;
/*     */ import androidx.compose.ui.text.style.TextIndent;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import androidx.compose.ui.unit.TextUnitType;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\b\032y\020Q\032\016\022\004\022\002HR\022\004\022\002HS0\021\"\004\b\000\020R\"\b\b\001\020S*\0020\0032.\020T\032*\022\004\022\0020V\022\023\022\021HR¢\006\f\bW\022\b\bX\022\004\b\b(Y\022\006\022\004\030\001HS0U¢\006\002\bZ2#\020[\032\037\022\023\022\021HS¢\006\f\bW\022\b\bX\022\004\b\b(Y\022\006\022\004\030\001HR0\\H\002\032L\020[\032\004\030\001H]\"\024\b\000\020^*\016\022\004\022\002HR\022\004\022\002HS0\001\"\004\b\001\020R\"\004\b\002\020S\"\006\b\003\020]\030\0012\b\020Y\032\004\030\001HS2\006\020_\032\002H^H\b¢\006\002\020`\032\"\020[\032\004\030\001H]\"\006\b\000\020]\030\0012\b\020Y\032\004\030\0010\003H\b¢\006\002\020a\032I\020T\032\0020\003\"\024\b\000\020^*\016\022\004\022\002HR\022\004\022\002HS0\001\"\004\b\001\020R\"\004\b\002\020S2\b\020Y\032\004\030\001HR2\006\020_\032\002H^2\006\020b\032\0020VH\000¢\006\002\020c\032\037\020T\032\004\030\001H^\"\004\b\000\020^2\b\020Y\032\004\030\001H^H\000¢\006\002\020a\" \020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001X\004¢\006\b\n\000\032\004\b\004\020\005\"(\020\006\032\034\022\022\022\020\022\f\022\n\022\006\b\001\022\0020\0030\b0\007\022\004\022\0020\0030\001X\004¢\006\002\n\000\"(\020\t\032\026\022\f\022\n\022\006\b\001\022\0020\0030\b\022\004\022\0020\0030\001X\004¢\006\b\n\000\022\004\b\n\020\013\"\032\020\f\032\016\022\004\022\0020\r\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\016\032\016\022\004\022\0020\017\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\020\032\016\022\004\022\0020\022\022\004\022\0020\0030\021X\004¢\006\002\n\000\"\032\020\023\032\016\022\004\022\0020\024\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\025\032\016\022\004\022\0020\026\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\027\032\016\022\004\022\0020\030\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\031\032\016\022\004\022\0020\032\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020\033\032\016\022\004\022\0020\034\022\004\022\0020\0030\021X\004¢\006\002\n\000\" \020\035\032\016\022\004\022\0020\036\022\004\022\0020\0030\001X\004¢\006\b\n\000\032\004\b\037\020\005\"\032\020 \032\016\022\004\022\0020!\022\004\022\0020\0030\001X\004¢\006\002\n\000\" \020\"\032\016\022\004\022\0020#\022\004\022\0020\0030\001X\004¢\006\b\n\000\032\004\b$\020\005\"\032\020%\032\016\022\004\022\0020&\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020'\032\016\022\004\022\0020(\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\020)\032\016\022\004\022\0020*\022\004\022\0020\0030\001X\004¢\006\002\n\000\" \020+\032\016\022\004\022\0020,\022\004\022\0020\0030\001X\004¢\006\b\n\000\032\004\b-\020\005\"\032\020.\032\016\022\004\022\0020/\022\004\022\0020\0030\001X\004¢\006\002\n\000\"\032\0200\032\016\022\004\022\00201\022\004\022\0020\0030\021X\004¢\006\002\n\000\" \0202\032\016\022\004\022\00203\022\004\022\0020\0030\001X\004¢\006\b\n\000\022\004\b4\020\013\"\032\0205\032\016\022\004\022\00206\022\004\022\0020\0030\001X\004¢\006\002\n\000\"$\0207\032\016\022\004\022\0020\034\022\004\022\0020\0030\001*\002088@X\004¢\006\006\032\004\b9\020:\"$\0207\032\016\022\004\022\0020\022\022\004\022\0020\0030\001*\0020;8@X\004¢\006\006\032\004\b9\020<\"$\0207\032\016\022\004\022\0020!\022\004\022\0020\0030\001*\0020=8@X\004¢\006\006\032\004\b9\020>\"$\0207\032\016\022\004\022\0020/\022\004\022\0020\0030\001*\0020?8@X\004¢\006\006\032\004\b9\020@\"$\0207\032\016\022\004\022\0020\024\022\004\022\0020\0030\001*\0020A8@X\004¢\006\006\032\004\b9\020B\"$\0207\032\016\022\004\022\0020\032\022\004\022\0020\0030\001*\0020C8@X\004¢\006\006\032\004\b9\020D\"$\0207\032\016\022\004\022\0020\030\022\004\022\0020\0030\001*\0020E8@X\004¢\006\006\032\004\b9\020F\"$\0207\032\016\022\004\022\0020\r\022\004\022\0020\0030\001*\0020G8@X\004¢\006\006\032\004\b9\020H\"$\0207\032\016\022\004\022\0020&\022\004\022\0020\0030\001*\0020I8@X\004¢\006\006\032\004\b9\020J\"$\0207\032\016\022\004\022\0020(\022\004\022\0020\0030\001*\0020K8@X\004¢\006\006\032\004\b9\020L\"$\0207\032\016\022\004\022\0020*\022\004\022\0020\0030\001*\0020M8@X\004¢\006\006\032\004\b9\020N\"$\0207\032\016\022\004\022\00201\022\004\022\0020\0030\001*\0020O8@X\004¢\006\006\032\004\b9\020P¨\006d"}, d2 = {"AnnotatedStringSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "", "getAnnotatedStringSaver", "()Landroidx/compose/runtime/saveable/Saver;", "AnnotationRangeListSaver", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "AnnotationRangeSaver", "getAnnotationRangeSaver$annotations", "()V", "BaselineShiftSaver", "Landroidx/compose/ui/text/style/BaselineShift;", "ClickableSaver", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "ColorSaver", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "Landroidx/compose/ui/graphics/Color;", "FontWeightSaver", "Landroidx/compose/ui/text/font/FontWeight;", "LinkSaver", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "LocaleListSaver", "Landroidx/compose/ui/text/intl/LocaleList;", "LocaleSaver", "Landroidx/compose/ui/text/intl/Locale;", "OffsetSaver", "Landroidx/compose/ui/geometry/Offset;", "ParagraphStyleSaver", "Landroidx/compose/ui/text/ParagraphStyle;", "getParagraphStyleSaver", "ShadowSaver", "Landroidx/compose/ui/graphics/Shadow;", "SpanStyleSaver", "Landroidx/compose/ui/text/SpanStyle;", "getSpanStyleSaver", "TextDecorationSaver", "Landroidx/compose/ui/text/style/TextDecoration;", "TextGeometricTransformSaver", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "TextIndentSaver", "Landroidx/compose/ui/text/style/TextIndent;", "TextLinkStylesSaver", "Landroidx/compose/ui/text/TextLinkStyles;", "getTextLinkStylesSaver", "TextRangeSaver", "Landroidx/compose/ui/text/TextRange;", "TextUnitSaver", "Landroidx/compose/ui/unit/TextUnit;", "UrlAnnotationSaver", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotationSaver$annotations", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "Saver", "Landroidx/compose/ui/geometry/Offset$Companion;", "getSaver", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Color$Companion;", "(Landroidx/compose/ui/graphics/Color$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/graphics/Shadow$Companion;", "(Landroidx/compose/ui/graphics/Shadow$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/TextRange$Companion;", "(Landroidx/compose/ui/text/TextRange$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/font/FontWeight$Companion;", "(Landroidx/compose/ui/text/font/FontWeight$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/Locale$Companion;", "(Landroidx/compose/ui/text/intl/Locale$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/intl/LocaleList$Companion;", "(Landroidx/compose/ui/text/intl/LocaleList$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/BaselineShift$Companion;", "(Landroidx/compose/ui/text/style/BaselineShift$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextDecoration$Companion;", "(Landroidx/compose/ui/text/style/TextDecoration$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;", "(Landroidx/compose/ui/text/style/TextGeometricTransform$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/style/TextIndent$Companion;", "(Landroidx/compose/ui/text/style/TextIndent$Companion;)Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/unit/TextUnit$Companion;", "(Landroidx/compose/ui/unit/TextUnit$Companion;)Landroidx/compose/runtime/saveable/Saver;", "NonNullValueClassSaver", "Original", "Saveable", "save", "Lkotlin/Function2;", "Landroidx/compose/runtime/saveable/SaverScope;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/ExtensionFunctionType;", "restore", "Lkotlin/Function1;", "Result", "T", "saver", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;)Ljava/lang/Object;", "(Ljava/lang/Object;)Ljava/lang/Object;", "scope", "(Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n1#2:542\n*E\n"})
/*     */ public final class SaversKt
/*     */ {
/*     */   @NotNull
/*     */   public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(@Nullable Object value, @NotNull Saver saver, @NotNull SaverScope scope) {
/*  47 */     Intrinsics.checkNotNullParameter(saver, "saver"); Intrinsics.checkNotNullParameter(scope, "scope"); if (value != null) { Object it = value;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 542 */       int $i$a$-let-SaversKt$save$1 = 0; Saver $this$save_u24lambda_u241_u24lambda_u240 = saver; int $i$a$-with-SaversKt$save$1$1 = 0; if ($this$save_u24lambda_u241_u24lambda_u240.save(scope, value) == null) { $this$save_u24lambda_u241_u24lambda_u240.save(scope, value); return Boolean.valueOf(false); }  return $this$save_u24lambda_u241_u24lambda_u240.save(scope, value); }  $this$save_u24lambda_u241_u24lambda_u240.save(scope, value); return Boolean.valueOf(false);
/* 543 */   } private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(Function2<? super SaverScope, ? super Original, ? extends Saveable> save, Function1<? super Saveable, ? extends Original> restore) { return new SaversKt$NonNullValueClassSaver$1(save, restore); } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\025\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\016\022\004\022\0028\000\022\004\022\0028\0010\001J\027\020\002\032\004\030\0018\0002\006\020\003\032\0028\001H\026¢\006\002\020\004J\033\020\005\032\004\030\0018\001*\0020\0062\006\020\003\032\0028\000H\026¢\006\002\020\007¨\006\b"}, d2 = {"androidx/compose/ui/text/SaversKt$NonNullValueClassSaver$1", "Landroidx/compose/ui/text/NonNullValueClassSaver;", "restore", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "save", "Landroidx/compose/runtime/saveable/SaverScope;", "(Landroidx/compose/runtime/saveable/SaverScope;Ljava/lang/Object;)Ljava/lang/Object;", "ui-text"}) public static final class SaversKt$NonNullValueClassSaver$1 implements NonNullValueClassSaver<Original, Saveable> { SaversKt$NonNullValueClassSaver$1(Function2<SaverScope, Original, Saveable> $save, Function1<Saveable, Original> $restore) {} @Nullable public Saveable save(@NotNull SaverScope $this$save, Object value) { Intrinsics.checkNotNullParameter($this$save, "<this>"); return (Saveable)this.$save.invoke($this$save, value); } @Nullable public Original restore(@NotNull Object value) { Intrinsics.checkNotNullParameter(value, "value"); return (Original)this.$restore.invoke(value); } } @Nullable public static final <T> T save(@Nullable Object value) { return (T)value; } @NotNull private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(SaversKt$AnnotatedStringSaver$1.INSTANCE, SaversKt$AnnotatedStringSaver$2.INSTANCE); @NotNull public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() { return AnnotatedStringSaver; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/AnnotatedString;", "invoke"}) static final class SaversKt$AnnotatedStringSaver$1 extends Lambda implements Function2<SaverScope, AnnotatedString, Object> { public static final SaversKt$AnnotatedStringSaver$1 INSTANCE = new SaversKt$AnnotatedStringSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull AnnotatedString it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); Object[] arrayOfObject = new Object[4]; arrayOfObject[0] = SaversKt.save(it.getText()); arrayOfObject[1] = SaversKt.save(it.getSpanStyles(), SaversKt.AnnotationRangeListSaver, $this$Saver); arrayOfObject[2] = SaversKt.save(it.getParagraphStyles(), SaversKt.AnnotationRangeListSaver, $this$Saver); arrayOfObject[3] = SaversKt.save(it.getAnnotations$ui_text(), SaversKt.AnnotationRangeListSaver, $this$Saver); return CollectionsKt.arrayListOf(arrayOfObject); } SaversKt$AnnotatedStringSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString;", "it", "", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n62#2,2:542\n62#2,2:545\n93#2:548\n62#2,2:551\n1#3:544\n1#3:547\n1#3:549\n1#3:550\n1#3:553\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotatedStringSaver$2\n*L\n109#1:542,2\n111#1:545,2\n113#1:548\n116#1:551,2\n109#1:544\n111#1:547\n113#1:549\n116#1:553\n*E\n"}) static final class SaversKt$AnnotatedStringSaver$2 extends Lambda implements Function1<Object, AnnotatedString> { public static final SaversKt$AnnotatedStringSaver$2 INSTANCE = new SaversKt$AnnotatedStringSaver$2(); @Nullable public final AnnotatedString invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); List<Object> list = (List)it; Object object = list.get(1); Saver saver$iv = SaversKt.AnnotationRangeListSaver; int i = 0; Object object1 = object;
/* 544 */       int $i$a$-let-SaversKt$restore$1$iv = 0; Saver $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; int $i$a$-with-SaversKt$restore$1$1$iv = 0; List spanStylesOrNull = (Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object != null) ? (List)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object) : null); saver$iv = (Saver)list.get(2); Saver saver2 = SaversKt.AnnotationRangeListSaver;
/*     */       int k = 0;
/* 546 */       Object object3 = saver$iv;
/* 547 */       int m = 0; Saver saver3 = saver2; int n = 0; List paragraphStylesOrNull = (Intrinsics.areEqual(saver$iv, Boolean.valueOf(false)) && !(saver2 instanceof NonNullValueClassSaver)) ? null : ((saver$iv != null) ? (List)saver3.restore(saver$iv) : null); Object value$iv = list.get(0); int $i$f$restore = 0;
/* 548 */       Object it$iv = value$iv;
/* 549 */       int $i$a$-let-SaversKt$restore$2$iv = 0; Intrinsics.checkNotNull((value$iv != null) ? it$iv : null); value$iv = spanStylesOrNull;
/* 550 */       Object object4 = (value$iv != null) ? it$iv : null; int $i$a$-ifEmpty-SaversKt$AnnotatedStringSaver$2$1 = 0; value$iv = paragraphStylesOrNull; List list1 = (spanStylesOrNull != null) ? (value$iv.isEmpty() ? null : (List)value$iv) : null; object4 = (value$iv != null) ? it$iv : null; int $i$a$-ifEmpty-SaversKt$AnnotatedStringSaver$2$2 = 0; List list2 = null; value$iv = list.get(3); Saver saver1 = SaversKt.AnnotationRangeListSaver;
/*     */       int j = 0;
/* 552 */       Object object2 = value$iv;
/* 553 */       m = 0; saver3 = saver1; n = 0; List<? extends AnnotatedString.Range<? extends Object>> list3 = (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (List)saver3.restore(value$iv) : null); List<AnnotatedString.Range<ParagraphStyle>> list4 = (paragraphStylesOrNull != null) ? (value$iv.isEmpty() ? list2 : (List)value$iv) : null; List<AnnotatedString.Range<SpanStyle>> list5 = (spanStylesOrNull != null) ? (value$iv.isEmpty() ? null : (List)value$iv) : null; Object object5 = (value$iv != null) ? it$iv : null; return new AnnotatedString((String)object5, list5, list4, list3); } SaversKt$AnnotatedStringSaver$2() { super(1); } } @NotNull private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(SaversKt$AnnotationRangeListSaver$1.INSTANCE, SaversKt$AnnotationRangeListSaver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\020\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\024\020\003\032\020\022\f\022\n\022\006\b\001\022\0020\0010\0050\004H\n¢\006\002\b\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,541:1\n151#2,3:542\n33#2,4:545\n154#2,2:549\n38#2:551\n156#2:552\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$1\n*L\n123#1:542,3\n123#1:545,4\n123#1:549,2\n123#1:551\n123#1:552\n*E\n"}) static final class SaversKt$AnnotationRangeListSaver$1 extends Lambda implements Function2<SaverScope, List<? extends AnnotatedString.Range<? extends Object>>, Object> { public static final SaversKt$AnnotationRangeListSaver$1 INSTANCE = new SaversKt$AnnotationRangeListSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull List it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); List $this$fastMap$iv = it; int $i$f$fastMap = 0; ArrayList<Object> target$iv = new ArrayList($this$fastMap$iv.size()); List $this$fastForEach$iv$iv = $this$fastMap$iv; int $i$f$fastForEach = 0; int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) { Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv); Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0; AnnotatedString.Range range = (AnnotatedString.Range)it$iv; ArrayList<Object> arrayList = target$iv; int $i$a$-fastMap-SaversKt$AnnotationRangeListSaver$1$1 = 0; arrayList.add(SaversKt.save(range, SaversKt.AnnotationRangeSaver, $this$Saver)); }  return target$iv; } SaversKt$AnnotationRangeListSaver$1() { super(2); } }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\002\020\000\032\022\022\f\022\n\022\006\b\001\022\0020\0030\002\030\0010\0012\006\020\004\032\0020\003H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n151#2,3:542\n33#2,4:545\n154#2:549\n155#2:553\n38#2:554\n156#2:555\n62#3,2:550\n1#4:552\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeListSaver$2\n*L\n130#1:542,3\n130#1:545,4\n130#1:549\n130#1:553\n130#1:554\n130#1:555\n131#1:550,2\n131#1:552\n*E\n"}) static final class SaversKt$AnnotationRangeListSaver$2 extends Lambda implements Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>> { public static final SaversKt$AnnotationRangeListSaver$2 INSTANCE = new SaversKt$AnnotationRangeListSaver$2();
/* 555 */     @Nullable public final List<AnnotatedString.Range<? extends Object>> invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); List list = (List)it; List $this$fastMap$iv = list; int $i$f$fastMap = 0; ArrayList<AnnotatedString.Range<? extends Object>> target$iv = new ArrayList($this$fastMap$iv.size()); List $this$fastForEach$iv$iv = $this$fastMap$iv; int $i$f$fastForEach = 0; int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i) { Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv); Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0; Object object1 = it$iv; ArrayList<AnnotatedString.Range<? extends Object>> arrayList = target$iv; int $i$a$-fastMap-SaversKt$AnnotationRangeListSaver$2$1 = 0; Saver saver$iv = SaversKt.AnnotationRangeSaver; int $i$f$restore = 0; }  return target$iv; } SaversKt$AnnotationRangeListSaver$2() { super(1); } } @NotNull private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(SaversKt$AnnotationRangeSaver$1.INSTANCE, SaversKt$AnnotationRangeSaver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\016\020\003\032\n\022\006\b\001\022\0020\0010\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/AnnotatedString$Range;", "invoke"}) static final class SaversKt$AnnotationRangeSaver$1 extends Lambda implements Function2<SaverScope, AnnotatedString.Range<? extends Object>, Object> { public static final SaversKt$AnnotationRangeSaver$1 INSTANCE = new SaversKt$AnnotationRangeSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull AnnotatedString.Range<Object> it) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc '$this$Saver'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'it'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   16: astore #4
/*     */       //   18: aload #4
/*     */       //   20: instanceof androidx/compose/ui/text/ParagraphStyle
/*     */       //   23: ifeq -> 32
/*     */       //   26: getstatic androidx/compose/ui/text/AnnotationType.Paragraph : Landroidx/compose/ui/text/AnnotationType;
/*     */       //   29: goto -> 105
/*     */       //   32: aload #4
/*     */       //   34: instanceof androidx/compose/ui/text/SpanStyle
/*     */       //   37: ifeq -> 46
/*     */       //   40: getstatic androidx/compose/ui/text/AnnotationType.Span : Landroidx/compose/ui/text/AnnotationType;
/*     */       //   43: goto -> 105
/*     */       //   46: aload #4
/*     */       //   48: instanceof androidx/compose/ui/text/VerbatimTtsAnnotation
/*     */       //   51: ifeq -> 60
/*     */       //   54: getstatic androidx/compose/ui/text/AnnotationType.VerbatimTts : Landroidx/compose/ui/text/AnnotationType;
/*     */       //   57: goto -> 105
/*     */       //   60: aload #4
/*     */       //   62: instanceof androidx/compose/ui/text/UrlAnnotation
/*     */       //   65: ifeq -> 74
/*     */       //   68: getstatic androidx/compose/ui/text/AnnotationType.Url : Landroidx/compose/ui/text/AnnotationType;
/*     */       //   71: goto -> 105
/*     */       //   74: aload #4
/*     */       //   76: instanceof androidx/compose/ui/text/LinkAnnotation$Url
/*     */       //   79: ifeq -> 88
/*     */       //   82: getstatic androidx/compose/ui/text/AnnotationType.Link : Landroidx/compose/ui/text/AnnotationType;
/*     */       //   85: goto -> 105
/*     */       //   88: aload #4
/*     */       //   90: instanceof androidx/compose/ui/text/LinkAnnotation$Clickable
/*     */       //   93: ifeq -> 102
/*     */       //   96: getstatic androidx/compose/ui/text/AnnotationType.Clickable : Landroidx/compose/ui/text/AnnotationType;
/*     */       //   99: goto -> 105
/*     */       //   102: getstatic androidx/compose/ui/text/AnnotationType.String : Landroidx/compose/ui/text/AnnotationType;
/*     */       //   105: astore_3
/*     */       //   106: aload_3
/*     */       //   107: getstatic androidx/compose/ui/text/SaversKt$AnnotationRangeSaver$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */       //   110: swap
/*     */       //   111: invokevirtual ordinal : ()I
/*     */       //   114: iaload
/*     */       //   115: tableswitch default -> 304, 1 -> 156, 2 -> 179, 3 -> 202, 4 -> 225, 5 -> 248, 6 -> 271, 7 -> 294
/*     */       //   156: aload_2
/*     */       //   157: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   160: dup
/*     */       //   161: ldc 'null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle'
/*     */       //   163: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   166: checkcast androidx/compose/ui/text/ParagraphStyle
/*     */       //   169: invokestatic getParagraphStyleSaver : ()Landroidx/compose/runtime/saveable/Saver;
/*     */       //   172: aload_1
/*     */       //   173: invokestatic save : (Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;
/*     */       //   176: goto -> 312
/*     */       //   179: aload_2
/*     */       //   180: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   183: dup
/*     */       //   184: ldc 'null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle'
/*     */       //   186: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   189: checkcast androidx/compose/ui/text/SpanStyle
/*     */       //   192: invokestatic getSpanStyleSaver : ()Landroidx/compose/runtime/saveable/Saver;
/*     */       //   195: aload_1
/*     */       //   196: invokestatic save : (Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;
/*     */       //   199: goto -> 312
/*     */       //   202: aload_2
/*     */       //   203: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   206: dup
/*     */       //   207: ldc 'null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation'
/*     */       //   209: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   212: checkcast androidx/compose/ui/text/VerbatimTtsAnnotation
/*     */       //   215: invokestatic access$getVerbatimTtsAnnotationSaver$p : ()Landroidx/compose/runtime/saveable/Saver;
/*     */       //   218: aload_1
/*     */       //   219: invokestatic save : (Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;
/*     */       //   222: goto -> 312
/*     */       //   225: aload_2
/*     */       //   226: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   229: dup
/*     */       //   230: ldc 'null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation'
/*     */       //   232: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   235: checkcast androidx/compose/ui/text/UrlAnnotation
/*     */       //   238: invokestatic access$getUrlAnnotationSaver$p : ()Landroidx/compose/runtime/saveable/Saver;
/*     */       //   241: aload_1
/*     */       //   242: invokestatic save : (Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;
/*     */       //   245: goto -> 312
/*     */       //   248: aload_2
/*     */       //   249: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   252: dup
/*     */       //   253: ldc 'null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url'
/*     */       //   255: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   258: checkcast androidx/compose/ui/text/LinkAnnotation$Url
/*     */       //   261: invokestatic access$getLinkSaver$p : ()Landroidx/compose/runtime/saveable/Saver;
/*     */       //   264: aload_1
/*     */       //   265: invokestatic save : (Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;
/*     */       //   268: goto -> 312
/*     */       //   271: aload_2
/*     */       //   272: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   275: dup
/*     */       //   276: ldc 'null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable'
/*     */       //   278: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   281: checkcast androidx/compose/ui/text/LinkAnnotation$Clickable
/*     */       //   284: invokestatic access$getClickableSaver$p : ()Landroidx/compose/runtime/saveable/Saver;
/*     */       //   287: aload_1
/*     */       //   288: invokestatic save : (Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Landroidx/compose/runtime/saveable/SaverScope;)Ljava/lang/Object;
/*     */       //   291: goto -> 312
/*     */       //   294: aload_2
/*     */       //   295: invokevirtual getItem : ()Ljava/lang/Object;
/*     */       //   298: invokestatic save : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   301: goto -> 312
/*     */       //   304: new kotlin/NoWhenBranchMatchedException
/*     */       //   307: dup
/*     */       //   308: invokespecial <init> : ()V
/*     */       //   311: athrow
/*     */       //   312: astore #4
/*     */       //   314: iconst_5
/*     */       //   315: anewarray java/lang/Object
/*     */       //   318: astore #5
/*     */       //   320: aload #5
/*     */       //   322: iconst_0
/*     */       //   323: aload_3
/*     */       //   324: invokestatic save : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   327: aastore
/*     */       //   328: aload #5
/*     */       //   330: iconst_1
/*     */       //   331: aload #4
/*     */       //   333: aastore
/*     */       //   334: aload #5
/*     */       //   336: iconst_2
/*     */       //   337: aload_2
/*     */       //   338: invokevirtual getStart : ()I
/*     */       //   341: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   344: invokestatic save : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   347: aastore
/*     */       //   348: aload #5
/*     */       //   350: iconst_3
/*     */       //   351: aload_2
/*     */       //   352: invokevirtual getEnd : ()I
/*     */       //   355: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   358: invokestatic save : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   361: aastore
/*     */       //   362: aload #5
/*     */       //   364: iconst_4
/*     */       //   365: aload_2
/*     */       //   366: invokevirtual getTag : ()Ljava/lang/String;
/*     */       //   369: invokestatic save : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   372: aastore
/*     */       //   373: aload #5
/*     */       //   375: invokestatic arrayListOf : ([Ljava/lang/Object;)Ljava/util/ArrayList;
/*     */       //   378: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #150	-> 12
/*     */       //   #151	-> 18
/*     */       //   #152	-> 32
/*     */       //   #153	-> 46
/*     */       //   #154	-> 60
/*     */       //   #155	-> 74
/*     */       //   #156	-> 88
/*     */       //   #157	-> 102
/*     */       //   #150	-> 105
/*     */       //   #160	-> 106
/*     */       //   #161	-> 156
/*     */       //   #162	-> 179
/*     */       //   #164	-> 202
/*     */       //   #165	-> 215
/*     */       //   #166	-> 218
/*     */       //   #163	-> 219
/*     */       //   #169	-> 225
/*     */       //   #170	-> 238
/*     */       //   #171	-> 241
/*     */       //   #168	-> 242
/*     */       //   #174	-> 248
/*     */       //   #175	-> 261
/*     */       //   #176	-> 264
/*     */       //   #173	-> 265
/*     */       //   #179	-> 271
/*     */       //   #180	-> 284
/*     */       //   #181	-> 287
/*     */       //   #178	-> 288
/*     */       //   #183	-> 294
/*     */       //   #160	-> 312
/*     */       //   #187	-> 314
/*     */       //   #188	-> 331
/*     */       //   #187	-> 334
/*     */       //   #189	-> 337
/*     */       //   #187	-> 348
/*     */       //   #190	-> 351
/*     */       //   #187	-> 362
/*     */       //   #191	-> 365
/*     */       //   #187	-> 373
/*     */       //   #186	-> 375
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   106	273	3	marker	Landroidx/compose/ui/text/AnnotationType;
/*     */       //   314	65	4	item	Ljava/lang/Object;
/*     */       //   0	379	0	this	Landroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$1;
/*     */       //   0	379	1	$this$Saver	Landroidx/compose/runtime/saveable/SaverScope;
/* 555 */       //   0	379	2	it	Landroidx/compose/ui/text/AnnotatedString$Range; } SaversKt$AnnotationRangeSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\020\000\n\002\b\002\020\000\032\f\022\006\b\001\022\0020\002\030\0010\0012\006\020\003\032\0020\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n93#2:544\n93#2:546\n93#2:548\n62#2,2:550\n62#2,2:553\n62#2,2:556\n62#2,2:559\n62#2,2:562\n62#2,2:565\n93#2:568\n1#3:543\n1#3:545\n1#3:547\n1#3:549\n1#3:552\n1#3:555\n1#3:558\n1#3:561\n1#3:564\n1#3:567\n1#3:569\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$AnnotationRangeSaver$2\n*L\n197#1:542\n198#1:544\n199#1:546\n200#1:548\n204#1:550,2\n208#1:553,2\n212#1:556,2\n216#1:559,2\n220#1:562,2\n224#1:565,2\n228#1:568\n197#1:543\n198#1:545\n199#1:547\n200#1:549\n204#1:552\n208#1:555\n212#1:558\n216#1:561\n220#1:564\n224#1:567\n228#1:569\n*E\n"}) static final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> { public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2(); SaversKt$AnnotationRangeSaver$2() { super(1); } @Nullable public final AnnotatedString.Range<? extends Object> invoke(@NotNull Object it) { Object object14, object13, object12, object11, object10, object9, object8, object16; Saver<ParagraphStyle, Object> saver2; Saver<SpanStyle, Object> saver1; Saver saver$iv; int i2, i3; Object object17; int i5; Object object18; int i4, $i$a$-let-SaversKt$restore$1$iv; Saver<ParagraphStyle, Object> saver4; Saver<SpanStyle, Object> saver3; Saver $this$restore_u24lambda_u243_u24lambda_u242$iv; int $i$a$-with-SaversKt$restore$1$1$iv; Intrinsics.checkNotNullParameter(it, "it"); List<int> list = (List)it; Object value$iv = list.get(0); int $i$f$restore = 0; Object it$iv = value$iv; int $i$a$-let-SaversKt$restore$2$iv = 0; Intrinsics.checkNotNull((value$iv != null) ? it$iv : null); Object object1 = (value$iv != null) ? it$iv : null; Object object2 = list.get(2); int i = 0; Object object6 = object2; int m = 0; Intrinsics.checkNotNull((object2 != null) ? (Integer)object6 : null); int start = ((Number)((object2 != null) ? (Integer)object6 : null)).intValue(); Object object4 = list.get(3); int j = 0; Object object7 = object4; int n = 0; Intrinsics.checkNotNull((object4 != null) ? (Integer)object7 : null); int end = ((Number)((object4 != null) ? (Integer)object7 : null)).intValue(); Object object5 = list.get(4); int k = 0; Object object15 = object5; int i1 = 0; Intrinsics.checkNotNull((object5 != null) ? object15 : null); Object object3 = (object5 != null) ? object15 : null; switch (WhenMappings.$EnumSwitchMapping$0[object1.ordinal()]) { case 1: i1 = list.get(1); saver2 = SaversKt.getParagraphStyleSaver(); i3 = 0; i5 = i1; $i$a$-let-SaversKt$restore$1$iv = 0; saver4 = saver2; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(i1, Boolean.valueOf(false)) && !(saver2 instanceof NonNullValueClassSaver)) ? null : ((i1 != null) ? saver4.restore(i1) : null)); object14 = (Intrinsics.areEqual(i1, Boolean.valueOf(false)) && !(saver2 instanceof NonNullValueClassSaver)) ? null : ((i1 != null) ? saver4.restore(i1) : null); return new AnnotatedString.Range(object14, start, end, (String)object3);case 2: object16 = list.get(1); saver1 = SaversKt.getSpanStyleSaver(); i3 = 0; object18 = object16; $i$a$-let-SaversKt$restore$1$iv = 0; saver3 = saver1; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? saver3.restore(object16) : null)); object13 = (Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? saver3.restore(object16) : null); return new AnnotatedString.Range(object13, start, end, (String)object3);
/*     */         case 3:
/* 557 */           object16 = list.get(1); saver$iv = SaversKt.VerbatimTtsAnnotationSaver; i3 = 0; object18 = object16;
/* 558 */           $i$a$-let-SaversKt$restore$1$iv = 0; $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null)); object12 = (Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null); return new AnnotatedString.Range(object12, start, end, (String)object3);
/*     */         case 4:
/* 560 */           object16 = list.get(1); saver$iv = SaversKt.UrlAnnotationSaver; i3 = 0; object18 = object16;
/* 561 */           $i$a$-let-SaversKt$restore$1$iv = 0; $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null)); object11 = (Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null); return new AnnotatedString.Range(object11, start, end, (String)object3);
/*     */         case 5:
/* 563 */           object16 = list.get(1); saver$iv = SaversKt.LinkSaver; i3 = 0; object18 = object16;
/* 564 */           $i$a$-let-SaversKt$restore$1$iv = 0; $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null)); object10 = (Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null); return new AnnotatedString.Range(object10, start, end, (String)object3);
/*     */         case 6:
/* 566 */           object16 = list.get(1); saver$iv = SaversKt.ClickableSaver; i3 = 0; object18 = object16;
/* 567 */           $i$a$-let-SaversKt$restore$1$iv = 0; $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null)); object9 = (Intrinsics.areEqual(object16, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object16 != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object16) : null); return new AnnotatedString.Range(object9, start, end, (String)object3);
/* 568 */         case 7: object16 = list.get(1); i2 = 0; object17 = object16;
/* 569 */           i4 = 0; Intrinsics.checkNotNull((object16 != null) ? object17 : null); object8 = (object16 != null) ? object17 : null; return new AnnotatedString.Range(object8, start, end, (String)object3); }  throw new NoWhenBranchMatchedException(); } }
/* 570 */    @NotNull private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(SaversKt$VerbatimTtsAnnotationSaver$1.INSTANCE, SaversKt$VerbatimTtsAnnotationSaver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "invoke"}) static final class SaversKt$VerbatimTtsAnnotationSaver$1 extends Lambda implements Function2<SaverScope, VerbatimTtsAnnotation, Object> { public static final SaversKt$VerbatimTtsAnnotationSaver$1 INSTANCE = new SaversKt$VerbatimTtsAnnotationSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull VerbatimTtsAnnotation it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); return SaversKt.save(it.getVerbatim()); } SaversKt$VerbatimTtsAnnotationSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/VerbatimTtsAnnotation;", "it", "", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$VerbatimTtsAnnotationSaver$2\n*L\n237#1:542\n237#1:543\n*E\n"}) static final class SaversKt$VerbatimTtsAnnotationSaver$2 extends Lambda implements Function1<Object, VerbatimTtsAnnotation> { public static final SaversKt$VerbatimTtsAnnotationSaver$2 INSTANCE = new SaversKt$VerbatimTtsAnnotationSaver$2(); @Nullable public final VerbatimTtsAnnotation invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); int $i$f$restore = 0; Object it$iv = it; int $i$a$-let-SaversKt$restore$2$iv = 0; } SaversKt$VerbatimTtsAnnotationSaver$2() { super(1); } } @NotNull private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(SaversKt$UrlAnnotationSaver$1.INSTANCE, SaversKt$UrlAnnotationSaver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/UrlAnnotation;", "invoke"}) static final class SaversKt$UrlAnnotationSaver$1 extends Lambda implements Function2<SaverScope, UrlAnnotation, Object> { public static final SaversKt$UrlAnnotationSaver$1 INSTANCE = new SaversKt$UrlAnnotationSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull UrlAnnotation it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); return SaversKt.save(it.getUrl()); } SaversKt$UrlAnnotationSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/UrlAnnotation;", "it", "", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$UrlAnnotationSaver$2\n*L\n243#1:542\n243#1:543\n*E\n"}) static final class SaversKt$UrlAnnotationSaver$2 extends Lambda implements Function1<Object, UrlAnnotation> { public static final SaversKt$UrlAnnotationSaver$2 INSTANCE = new SaversKt$UrlAnnotationSaver$2(); @Nullable public final UrlAnnotation invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); int $i$f$restore = 0; Object it$iv = it; int $i$a$-let-SaversKt$restore$2$iv = 0; } SaversKt$UrlAnnotationSaver$2() { super(1); } } @NotNull private static final Saver<LinkAnnotation.Url, Object> LinkSaver = SaverKt.Saver(SaversKt$LinkSaver$1.INSTANCE, SaversKt$LinkSaver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "invoke"}) static final class SaversKt$LinkSaver$1 extends Lambda implements Function2<SaverScope, LinkAnnotation.Url, Object> { public static final SaversKt$LinkSaver$1 INSTANCE = new SaversKt$LinkSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull LinkAnnotation.Url it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = SaversKt.save(it.getUrl()); arrayOfObject[1] = SaversKt.save(it.getStyles(), SaversKt.getTextLinkStylesSaver(), $this$Saver); return CollectionsKt.arrayListOf(arrayOfObject); } SaversKt$LinkSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "it", "", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LinkSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n62#2,2:544\n1#3:543\n1#3:546\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LinkSaver$2\n*L\n256#1:542\n257#1:544,2\n256#1:543\n257#1:546\n*E\n"}) static final class SaversKt$LinkSaver$2 extends Lambda implements Function1<Object, LinkAnnotation.Url> { public static final SaversKt$LinkSaver$2 INSTANCE = new SaversKt$LinkSaver$2(); @Nullable public final LinkAnnotation.Url invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); List<int> list = (List)it; Object value$iv = list.get(0); int $i$f$restore = 0; Object it$iv = value$iv; int $i$a$-let-SaversKt$restore$2$iv = 0; Intrinsics.checkNotNull((value$iv != null) ? it$iv : null); Object object1 = (value$iv != null) ? it$iv : null; $i$f$restore = list.get(1); Saver<TextLinkStyles, Object> saver$iv = SaversKt.getTextLinkStylesSaver(); int i = 0; int j = $i$f$restore; int $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextLinkStyles, Object> $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; int $i$a$-with-SaversKt$restore$1$1$iv = 0; TextLinkStyles stylesOrNull = (Intrinsics.areEqual($i$f$restore, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : (($i$f$restore != null) ? (TextLinkStyles)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore($i$f$restore) : null); return new LinkAnnotation.Url((String)object1, stylesOrNull, null, 4, null); } SaversKt$LinkSaver$2() { super(1); } } @NotNull private static final Saver<LinkAnnotation.Clickable, Object> ClickableSaver = SaverKt.Saver(SaversKt$ClickableSaver$1.INSTANCE, SaversKt$ClickableSaver$2.INSTANCE); @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "invoke"}) static final class SaversKt$ClickableSaver$1 extends Lambda implements Function2<SaverScope, LinkAnnotation.Clickable, Object> { public static final SaversKt$ClickableSaver$1 INSTANCE = new SaversKt$ClickableSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull LinkAnnotation.Clickable it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); Object[] arrayOfObject = new Object[2]; arrayOfObject[0] = SaversKt.save(it.getTag()); arrayOfObject[1] = SaversKt.save(it.getStyles(), SaversKt.getTextLinkStylesSaver(), $this$Saver); return CollectionsKt.arrayListOf(arrayOfObject); } SaversKt$ClickableSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "it", "", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ClickableSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n62#2,2:544\n1#3:543\n1#3:546\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ClickableSaver$2\n*L\n275#1:542\n276#1:544,2\n275#1:543\n276#1:546\n*E\n"}) static final class SaversKt$ClickableSaver$2 extends Lambda implements Function1<Object, LinkAnnotation.Clickable> { public static final SaversKt$ClickableSaver$2 INSTANCE = new SaversKt$ClickableSaver$2(); @Nullable public final LinkAnnotation.Clickable invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); List<int> list = (List)it; Object value$iv = list.get(0); int $i$f$restore = 0; Object it$iv = value$iv; int $i$a$-let-SaversKt$restore$2$iv = 0; Intrinsics.checkNotNull((value$iv != null) ? it$iv : null); Object object1 = (value$iv != null) ? it$iv : null; $i$f$restore = list.get(1); Saver<TextLinkStyles, Object> saver$iv = SaversKt.getTextLinkStylesSaver(); int i = 0; int j = $i$f$restore; int $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextLinkStyles, Object> $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; int $i$a$-with-SaversKt$restore$1$1$iv = 0; TextLinkStyles stylesOrNull = (Intrinsics.areEqual($i$f$restore, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : (($i$f$restore != null) ? (TextLinkStyles)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore($i$f$restore) : null); return new LinkAnnotation.Clickable((String)object1, stylesOrNull, null); } SaversKt$ClickableSaver$2() { super(1); } } @NotNull private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(SaversKt$ParagraphStyleSaver$1.INSTANCE, SaversKt$ParagraphStyleSaver$2.INSTANCE); @NotNull public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() { return ParagraphStyleSaver; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/ParagraphStyle;", "invoke"}) static final class SaversKt$ParagraphStyleSaver$1 extends Lambda implements Function2<SaverScope, ParagraphStyle, Object> { public static final SaversKt$ParagraphStyleSaver$1 INSTANCE = new SaversKt$ParagraphStyleSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull ParagraphStyle it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); Object[] arrayOfObject = new Object[4]; arrayOfObject[0] = SaversKt.save(TextAlign.box-impl(it.getTextAlign-e0LSkKk())); arrayOfObject[1] = SaversKt.save(TextDirection.box-impl(it.getTextDirection-s_7X-co())); arrayOfObject[2] = SaversKt.save(TextUnit.box-impl(it.getLineHeight-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), $this$Saver); arrayOfObject[3] = SaversKt.save(it.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), $this$Saver); return CollectionsKt.arrayListOf(arrayOfObject); } SaversKt$ParagraphStyleSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/ParagraphStyle;", "it", "", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n93#2:544\n62#2,2:546\n62#2,2:549\n1#3:543\n1#3:545\n1#3:548\n1#3:551\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ParagraphStyleSaver$2\n*L\n297#1:542\n298#1:544\n299#1:546,2\n300#1:549,2\n297#1:543\n298#1:545\n299#1:548\n300#1:551\n*E\n"}) static final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements Function1<Object, ParagraphStyle> { public static final SaversKt$ParagraphStyleSaver$2 INSTANCE = new SaversKt$ParagraphStyleSaver$2(); @Nullable public final ParagraphStyle invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); List list = (List)it; Object value$iv = list.get(0); int $i$f$restore = 0; Object it$iv = value$iv; int $i$a$-let-SaversKt$restore$2$iv = 0; Intrinsics.checkNotNull((value$iv != null) ? it$iv : null); value$iv = list.get(1); $i$f$restore = 0; it$iv = value$iv; $i$a$-let-SaversKt$restore$2$iv = 0; Intrinsics.checkNotNull((value$iv != null) ? it$iv : null); value$iv = list.get(2); Saver<TextUnit, Object> saver1 = SaversKt.getSaver(TextUnit.Companion); int i = 0; Object object1 = value$iv; int $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextUnit, Object> saver2 = saver1; int $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver2.restore(value$iv) : null)); value$iv = list.get(3); Saver<TextIndent, Object> saver$iv = SaversKt.getSaver(TextIndent.Companion); i = 0; object1 = value$iv; $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextIndent, Object> $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; $i$a$-with-SaversKt$restore$1$1$iv = 0; return new ParagraphStyle(((value$iv != null) ? it$iv : null).unbox-impl(), ((value$iv != null) ? it$iv : null).unbox-impl(), ((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver2.restore(value$iv) : null)).unbox-impl(), (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (TextIndent)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null), null, null, 0, 0, null, 496, null); } SaversKt$ParagraphStyleSaver$2() { super(1); } } @NotNull private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(SaversKt$SpanStyleSaver$1.INSTANCE, SaversKt$SpanStyleSaver$2.INSTANCE); @NotNull public static final Saver<SpanStyle, Object> getSpanStyleSaver() { return SpanStyleSaver; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/SpanStyle;", "invoke"}) static final class SaversKt$SpanStyleSaver$1 extends Lambda implements Function2<SaverScope, SpanStyle, Object> { public static final SaversKt$SpanStyleSaver$1 INSTANCE = new SaversKt$SpanStyleSaver$1(); @Nullable public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull SpanStyle it) { Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver"); Intrinsics.checkNotNullParameter(it, "it"); Object[] arrayOfObject = new Object[14]; arrayOfObject[0] = SaversKt.save(Color.box-impl(it.getColor-0d7_KjU()), SaversKt.getSaver(Color.Companion), $this$Saver); arrayOfObject[1] = SaversKt.save(TextUnit.box-impl(it.getFontSize-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), $this$Saver); arrayOfObject[2] = SaversKt.save(it.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), $this$Saver); arrayOfObject[3] = SaversKt.save(it.getFontStyle-4Lr2A7w()); arrayOfObject[4] = SaversKt.save(it.getFontSynthesis-ZQGJjVo()); arrayOfObject[5] = SaversKt.save(Integer.valueOf(-1)); arrayOfObject[6] = SaversKt.save(it.getFontFeatureSettings()); arrayOfObject[7] = SaversKt.save(TextUnit.box-impl(it.getLetterSpacing-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), $this$Saver); arrayOfObject[8] = SaversKt.save(it.getBaselineShift-5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), $this$Saver); arrayOfObject[9] = SaversKt.save(it.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), $this$Saver); arrayOfObject[10] = SaversKt.save(it.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), $this$Saver); arrayOfObject[11] = SaversKt.save(Color.box-impl(it.getBackground-0d7_KjU()), SaversKt.getSaver(Color.Companion), $this$Saver); arrayOfObject[12] = SaversKt.save(it.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), $this$Saver); arrayOfObject[13] = SaversKt.save(it.getShadow(), SaversKt.getSaver(Shadow.Companion), $this$Saver); return CollectionsKt.arrayListOf(arrayOfObject); } SaversKt$SpanStyleSaver$1() { super(2); } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/SpanStyle;", "it", "", "invoke"}) @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n62#2,2:542\n62#2,2:545\n62#2,2:548\n93#2:551\n93#2:553\n93#2:555\n62#2,2:557\n62#2,2:560\n62#2,2:563\n62#2,2:566\n62#2,2:569\n62#2,2:572\n62#2,2:575\n1#3:544\n1#3:547\n1#3:550\n1#3:552\n1#3:554\n1#3:556\n1#3:559\n1#3:562\n1#3:565\n1#3:568\n1#3:571\n1#3:574\n1#3:577\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$SpanStyleSaver$2\n*L\n327#1:542,2\n328#1:545,2\n329#1:548,2\n330#1:551\n331#1:553\n333#1:555\n334#1:557,2\n335#1:560,2\n336#1:563,2\n337#1:566,2\n338#1:569,2\n339#1:572,2\n340#1:575,2\n327#1:544\n328#1:547\n329#1:550\n330#1:552\n331#1:554\n333#1:556\n334#1:559\n335#1:562\n336#1:565\n337#1:568\n338#1:571\n339#1:574\n340#1:577\n*E\n"}) static final class SaversKt$SpanStyleSaver$2 extends Lambda implements Function1<Object, SpanStyle> { @Nullable public final SpanStyle invoke(@NotNull Object it) { Intrinsics.checkNotNullParameter(it, "it"); List<Object> list = (List)it; Object object = list.get(0); Saver<Color, Object> saver9 = SaversKt.getSaver(Color.Companion); int j = 0; Object object2 = object; int $i$a$-let-SaversKt$restore$1$iv = 0; Saver<Color, Object> saver18 = saver9; int $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver9 instanceof NonNullValueClassSaver)) ? null : ((object != null) ? saver18.restore(object) : null)); Object value$iv = list.get(1); Saver<TextUnit, Object> saver8 = SaversKt.getSaver(TextUnit.Companion); j = 0; object2 = value$iv; $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextUnit, Object> saver17 = saver8; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver8 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver17.restore(value$iv) : null)); value$iv = list.get(2); Saver<FontWeight, Object> saver7 = SaversKt.getSaver(FontWeight.Companion); j = 0; object2 = value$iv; $i$a$-let-SaversKt$restore$1$iv = 0; Saver<FontWeight, Object> saver16 = saver7; $i$a$-with-SaversKt$restore$1$1$iv = 0; value$iv = list.get(3); int $i$f$restore = 0; Object it$iv = value$iv; int $i$a$-let-SaversKt$restore$2$iv = 0; value$iv = list.get(4); $i$f$restore = 0; it$iv = value$iv; $i$a$-let-SaversKt$restore$2$iv = 0; value$iv = list.get(6); $i$f$restore = 0; it$iv = value$iv; $i$a$-let-SaversKt$restore$2$iv = 0; value$iv = list.get(7); Saver<TextUnit, Object> saver6 = SaversKt.getSaver(TextUnit.Companion); int i = 0; Object object1 = value$iv; $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextUnit, Object> saver15 = saver6; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver6 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver15.restore(value$iv) : null)); value$iv = list.get(8); Saver<BaselineShift, Object> saver5 = SaversKt.getSaver(BaselineShift.Companion); i = 0; object1 = value$iv; $i$a$-let-SaversKt$restore$1$iv = 0; Saver<BaselineShift, Object> saver14 = saver5; $i$a$-with-SaversKt$restore$1$1$iv = 0; value$iv = list.get(9); Saver<TextGeometricTransform, Object> saver4 = SaversKt.getSaver(TextGeometricTransform.Companion); i = 0; object1 = value$iv; $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextGeometricTransform, Object> saver13 = saver4; $i$a$-with-SaversKt$restore$1$1$iv = 0; value$iv = list.get(10); Saver<LocaleList, Object> saver3 = SaversKt.getSaver(LocaleList.Companion); i = 0; object1 = value$iv; $i$a$-let-SaversKt$restore$1$iv = 0; Saver<LocaleList, Object> saver12 = saver3; $i$a$-with-SaversKt$restore$1$1$iv = 0; value$iv = list.get(11); Saver<Color, Object> saver2 = SaversKt.getSaver(Color.Companion); i = 0; object1 = value$iv;
/* 571 */       $i$a$-let-SaversKt$restore$1$iv = 0; Saver<Color, Object> saver11 = saver2; $i$a$-with-SaversKt$restore$1$1$iv = 0; Intrinsics.checkNotNull((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver2 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver11.restore(value$iv) : null)); value$iv = list.get(12); Saver<TextDecoration, Object> saver1 = SaversKt.getSaver(TextDecoration.Companion);
/*     */       i = 0;
/* 573 */       object1 = value$iv;
/* 574 */       $i$a$-let-SaversKt$restore$1$iv = 0; Saver<TextDecoration, Object> saver10 = saver1; $i$a$-with-SaversKt$restore$1$1$iv = 0; value$iv = list.get(13); Saver<Shadow, Object> saver$iv = SaversKt.getSaver(Shadow.Companion);
/*     */       i = 0;
/* 576 */       object1 = value$iv;
/* 577 */       $i$a$-let-SaversKt$restore$1$iv = 0; Saver<Shadow, Object> $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv; $i$a$-with-SaversKt$restore$1$1$iv = 0;
/*     */       return new SpanStyle(((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver9 instanceof NonNullValueClassSaver)) ? null : ((object != null) ? saver18.restore(object) : null)).unbox-impl(), ((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver8 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver17.restore(value$iv) : null)).unbox-impl(), (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver7 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (FontWeight)saver16.restore(value$iv) : null), (value$iv != null) ? (FontStyle)it$iv : null, (value$iv != null) ? (FontSynthesis)it$iv : null, null, (value$iv != null) ? (String)it$iv : null, ((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver6 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver15.restore(value$iv) : null)).unbox-impl(), (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver5 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (BaselineShift)saver14.restore(value$iv) : null), (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver4 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (TextGeometricTransform)saver13.restore(value$iv) : null), (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver3 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (LocaleList)saver12.restore(value$iv) : null), ((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver2 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? saver11.restore(value$iv) : null)).unbox-impl(), (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (TextDecoration)saver10.restore(value$iv) : null), (Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? (Shadow)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null), null, null, 49184, null); }
/*     */ 
/*     */     
/*     */     public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();
/*     */     
/*     */     SaversKt$SpanStyleSaver$2() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<TextLinkStyles, Object> TextLinkStylesSaver = SaverKt.Saver(SaversKt$TextLinkStylesSaver$1.INSTANCE, SaversKt$TextLinkStylesSaver$2.INSTANCE);
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<TextLinkStyles, Object> getTextLinkStylesSaver() {
/*     */     return TextLinkStylesSaver;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/TextLinkStyles;", "invoke"})
/*     */   static final class SaversKt$TextLinkStylesSaver$1 extends Lambda implements Function2<SaverScope, TextLinkStyles, Object> {
/*     */     public static final SaversKt$TextLinkStylesSaver$1 INSTANCE = new SaversKt$TextLinkStylesSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull TextLinkStyles it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       Object[] arrayOfObject = new Object[4];
/*     */       arrayOfObject[0] = SaversKt.save(it.getStyle(), SaversKt.getSpanStyleSaver(), $this$Saver);
/*     */       arrayOfObject[1] = SaversKt.save(it.getFocusedStyle(), SaversKt.getSpanStyleSaver(), $this$Saver);
/*     */       arrayOfObject[2] = SaversKt.save(it.getHoveredStyle(), SaversKt.getSpanStyleSaver(), $this$Saver);
/*     */       arrayOfObject[3] = SaversKt.save(it.getPressedStyle(), SaversKt.getSpanStyleSaver(), $this$Saver);
/*     */       return CollectionsKt.arrayListOf(arrayOfObject);
/*     */     }
/*     */     
/*     */     SaversKt$TextLinkStylesSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextLinkStyles;", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextLinkStylesSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n62#2,2:542\n62#2,2:545\n62#2,2:548\n62#2,2:551\n1#3:544\n1#3:547\n1#3:550\n1#3:553\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextLinkStylesSaver$2\n*L\n356#1:542,2\n357#1:545,2\n358#1:548,2\n359#1:551,2\n356#1:544\n357#1:547\n358#1:550\n359#1:553\n*E\n"})
/*     */   static final class SaversKt$TextLinkStylesSaver$2 extends Lambda implements Function1<Object, TextLinkStyles> {
/*     */     public static final SaversKt$TextLinkStylesSaver$2 INSTANCE = new SaversKt$TextLinkStylesSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final TextLinkStyles invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List<Object> list = (List)it;
/*     */       Object object = list.get(0);
/*     */       Saver<SpanStyle, Object> saver$iv = SaversKt.getSpanStyleSaver();
/*     */       int $i$f$restore = 0;
/*     */       Object it$iv = object;
/*     */       int $i$a$-let-SaversKt$restore$1$iv = 0;
/*     */       Saver<SpanStyle, Object> $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv;
/*     */       int $i$a$-with-SaversKt$restore$1$1$iv = 0;
/*     */       SpanStyle styleOrNull = (Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((object != null) ? (SpanStyle)$this$restore_u24lambda_u243_u24lambda_u242$iv.restore(object) : null);
/*     */       saver$iv = (Saver<SpanStyle, Object>)list.get(1);
/*     */       Saver<SpanStyle, Object> saver1 = SaversKt.getSpanStyleSaver();
/*     */       int i = 0;
/*     */       Object<SpanStyle, Object> object1 = (Object<SpanStyle, Object>)saver$iv;
/*     */       int m = 0;
/*     */       Saver<SpanStyle, Object> saver4 = saver1;
/*     */       int i2 = 0;
/*     */       SpanStyle focusedStyleOrNull = (Intrinsics.areEqual(saver$iv, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((saver$iv != null) ? (SpanStyle)saver4.restore(saver$iv) : null);
/*     */       saver1 = (Saver<SpanStyle, Object>)list.get(2);
/*     */       Saver<SpanStyle, Object> saver2 = SaversKt.getSpanStyleSaver();
/*     */       int j = 0;
/*     */       Object<SpanStyle, Object> object2 = (Object<SpanStyle, Object>)saver1;
/*     */       int n = 0;
/*     */       Saver<SpanStyle, Object> saver5 = saver2;
/*     */       int i3 = 0;
/*     */       SpanStyle hoveredStyleOrNull = (Intrinsics.areEqual(saver1, Boolean.valueOf(false)) && !(saver2 instanceof NonNullValueClassSaver)) ? null : ((saver1 != null) ? (SpanStyle)saver5.restore(saver1) : null);
/*     */       saver2 = (Saver<SpanStyle, Object>)list.get(3);
/*     */       Saver<SpanStyle, Object> saver3 = SaversKt.getSpanStyleSaver();
/*     */       int k = 0;
/*     */       Object<SpanStyle, Object> object3 = (Object<SpanStyle, Object>)saver2;
/*     */       int i1 = 0;
/*     */       Saver<SpanStyle, Object> saver6 = saver3;
/*     */       int i4 = 0;
/*     */       SpanStyle pressedStyleOrNull = (Intrinsics.areEqual(saver2, Boolean.valueOf(false)) && !(saver3 instanceof NonNullValueClassSaver)) ? null : ((saver2 != null) ? (SpanStyle)saver6.restore(saver2) : null);
/*     */       return new TextLinkStyles(styleOrNull, focusedStyleOrNull, hoveredStyleOrNull, pressedStyleOrNull);
/*     */     }
/*     */     
/*     */     SaversKt$TextLinkStylesSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<TextDecoration, Object> getSaver(@NotNull TextDecoration.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return TextDecorationSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(SaversKt$TextDecorationSaver$1.INSTANCE, SaversKt$TextDecorationSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/style/TextDecoration;", "invoke"})
/*     */   static final class SaversKt$TextDecorationSaver$1 extends Lambda implements Function2<SaverScope, TextDecoration, Object> {
/*     */     public static final SaversKt$TextDecorationSaver$1 INSTANCE = new SaversKt$TextDecorationSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull TextDecoration it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Integer.valueOf(it.getMask());
/*     */     }
/*     */     
/*     */     SaversKt$TextDecorationSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextDecoration;", "it", "", "invoke"})
/*     */   static final class SaversKt$TextDecorationSaver$2 extends Lambda implements Function1<Object, TextDecoration> {
/*     */     public static final SaversKt$TextDecorationSaver$2 INSTANCE = new SaversKt$TextDecorationSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final TextDecoration invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return new TextDecoration(((Integer)it).intValue());
/*     */     }
/*     */     
/*     */     SaversKt$TextDecorationSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<TextGeometricTransform, Object> getSaver(@NotNull TextGeometricTransform.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return TextGeometricTransformSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(SaversKt$TextGeometricTransformSaver$1.INSTANCE, SaversKt$TextGeometricTransformSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "invoke"})
/*     */   static final class SaversKt$TextGeometricTransformSaver$1 extends Lambda implements Function2<SaverScope, TextGeometricTransform, Object> {
/*     */     public static final SaversKt$TextGeometricTransformSaver$1 INSTANCE = new SaversKt$TextGeometricTransformSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull TextGeometricTransform it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       Float[] arrayOfFloat = new Float[2];
/*     */       arrayOfFloat[0] = Float.valueOf(it.getScaleX());
/*     */       arrayOfFloat[1] = Float.valueOf(it.getSkewX());
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfFloat);
/*     */     }
/*     */     
/*     */     SaversKt$TextGeometricTransformSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "it", "", "invoke"})
/*     */   static final class SaversKt$TextGeometricTransformSaver$2 extends Lambda implements Function1<Object, TextGeometricTransform> {
/*     */     public static final SaversKt$TextGeometricTransformSaver$2 INSTANCE = new SaversKt$TextGeometricTransformSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final TextGeometricTransform invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List<Number> list = (List)it;
/*     */       return new TextGeometricTransform(((Number)list.get(0)).floatValue(), ((Number)list.get(1)).floatValue());
/*     */     }
/*     */     
/*     */     SaversKt$TextGeometricTransformSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<TextIndent, Object> getSaver(@NotNull TextIndent.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return TextIndentSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(SaversKt$TextIndentSaver$1.INSTANCE, SaversKt$TextIndentSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/style/TextIndent;", "invoke"})
/*     */   static final class SaversKt$TextIndentSaver$1 extends Lambda implements Function2<SaverScope, TextIndent, Object> {
/*     */     public static final SaversKt$TextIndentSaver$1 INSTANCE = new SaversKt$TextIndentSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull TextIndent it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       Object[] arrayOfObject = new Object[2];
/*     */       arrayOfObject[0] = SaversKt.save(TextUnit.box-impl(it.getFirstLine-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), $this$Saver);
/*     */       arrayOfObject[1] = SaversKt.save(TextUnit.box-impl(it.getRestLine-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), $this$Saver);
/*     */       return CollectionsKt.arrayListOf(arrayOfObject);
/*     */     }
/*     */     
/*     */     SaversKt$TextIndentSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/TextIndent;", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n62#2,2:542\n62#2,2:545\n1#3:544\n1#3:547\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextIndentSaver$2\n*L\n403#1:542,2\n404#1:545,2\n403#1:544\n404#1:547\n*E\n"})
/*     */   static final class SaversKt$TextIndentSaver$2 extends Lambda implements Function1<Object, TextIndent> {
/*     */     public static final SaversKt$TextIndentSaver$2 INSTANCE = new SaversKt$TextIndentSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final TextIndent invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List<Object> list = (List)it;
/*     */       Object object = list.get(0);
/*     */       Saver<TextUnit, Object> saver1 = SaversKt.getSaver(TextUnit.Companion);
/*     */       int $i$f$restore = 0;
/*     */       Object it$iv = object;
/*     */       int $i$a$-let-SaversKt$restore$1$iv = 0;
/*     */       Saver<TextUnit, Object> saver2 = saver1;
/*     */       int $i$a$-with-SaversKt$restore$1$1$iv = 0;
/*     */       Intrinsics.checkNotNull((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((object != null) ? saver2.restore(object) : null));
/*     */       Object value$iv = list.get(1);
/*     */       Saver<TextUnit, Object> saver$iv = SaversKt.getSaver(TextUnit.Companion);
/*     */       $i$f$restore = 0;
/*     */       it$iv = value$iv;
/*     */       $i$a$-let-SaversKt$restore$1$iv = 0;
/*     */       Saver<TextUnit, Object> $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv;
/*     */       $i$a$-with-SaversKt$restore$1$1$iv = 0;
/*     */       Intrinsics.checkNotNull((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null));
/*     */       return new TextIndent(((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((object != null) ? saver2.restore(object) : null)).unbox-impl(), ((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null)).unbox-impl(), null);
/*     */     }
/*     */     
/*     */     SaversKt$TextIndentSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<FontWeight, Object> getSaver(@NotNull FontWeight.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return FontWeightSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(SaversKt$FontWeightSaver$1.INSTANCE, SaversKt$FontWeightSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/font/FontWeight;", "invoke"})
/*     */   static final class SaversKt$FontWeightSaver$1 extends Lambda implements Function2<SaverScope, FontWeight, Object> {
/*     */     public static final SaversKt$FontWeightSaver$1 INSTANCE = new SaversKt$FontWeightSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull FontWeight it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Integer.valueOf(it.getWeight());
/*     */     }
/*     */     
/*     */     SaversKt$FontWeightSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/FontWeight;", "it", "", "invoke"})
/*     */   static final class SaversKt$FontWeightSaver$2 extends Lambda implements Function1<Object, FontWeight> {
/*     */     public static final SaversKt$FontWeightSaver$2 INSTANCE = new SaversKt$FontWeightSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final FontWeight invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return new FontWeight(((Integer)it).intValue());
/*     */     }
/*     */     
/*     */     SaversKt$FontWeightSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<BaselineShift, Object> getSaver(@NotNull BaselineShift.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return BaselineShiftSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(SaversKt$BaselineShiftSaver$1.INSTANCE, SaversKt$BaselineShiftSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/style/BaselineShift;", "invoke-8a2Sb4w", "(Landroidx/compose/runtime/saveable/SaverScope;F)Ljava/lang/Object;"})
/*     */   static final class SaversKt$BaselineShiftSaver$1 extends Lambda implements Function2<SaverScope, BaselineShift, Object> {
/*     */     public static final SaversKt$BaselineShiftSaver$1 INSTANCE = new SaversKt$BaselineShiftSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke-8a2Sb4w(@NotNull SaverScope $this$Saver, float it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       return Float.valueOf(it);
/*     */     }
/*     */     
/*     */     SaversKt$BaselineShiftSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/BaselineShift;", "it", "", "invoke-jTk7eUs"})
/*     */   static final class SaversKt$BaselineShiftSaver$2 extends Lambda implements Function1<Object, BaselineShift> {
/*     */     public static final SaversKt$BaselineShiftSaver$2 INSTANCE = new SaversKt$BaselineShiftSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final BaselineShift invoke-jTk7eUs(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return BaselineShift.box-impl(BaselineShift.constructor-impl(((Float)it).floatValue()));
/*     */     }
/*     */     
/*     */     SaversKt$BaselineShiftSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<TextRange, Object> getSaver(@NotNull TextRange.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return TextRangeSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(SaversKt$TextRangeSaver$1.INSTANCE, SaversKt$TextRangeSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/TextRange;", "invoke-FDrldGo", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"})
/*     */   static final class SaversKt$TextRangeSaver$1 extends Lambda implements Function2<SaverScope, TextRange, Object> {
/*     */     public static final SaversKt$TextRangeSaver$1 INSTANCE = new SaversKt$TextRangeSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke-FDrldGo(@NotNull SaverScope $this$Saver, long it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Integer[] arrayOfInteger = new Integer[2];
/*     */       arrayOfInteger[0] = SaversKt.save(Integer.valueOf(TextRange.getStart-impl(it)));
/*     */       arrayOfInteger[1] = SaversKt.save(Integer.valueOf(TextRange.getEnd-impl(it)));
/*     */       return CollectionsKt.arrayListOf((Object[])arrayOfInteger);
/*     */     }
/*     */     
/*     */     SaversKt$TextRangeSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextRange;", "it", "", "invoke-VqIyPBM"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextRangeSaver$2\n*L\n437#1:542\n437#1:543\n*E\n"})
/*     */   static final class SaversKt$TextRangeSaver$2 extends Lambda implements Function1<Object, TextRange> {
/*     */     public static final SaversKt$TextRangeSaver$2 INSTANCE = new SaversKt$TextRangeSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final TextRange invoke-VqIyPBM(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List list = (List)it;
/*     */       Object value$iv = list.get(0);
/*     */       int $i$f$restore = 0;
/*     */       Object it$iv = value$iv;
/*     */       int $i$a$-let-SaversKt$restore$2$iv = 0;
/*     */       Intrinsics.checkNotNull((value$iv != null) ? (Integer)it$iv : null);
/*     */       value$iv = list.get(1);
/*     */       $i$f$restore = 0;
/*     */       it$iv = value$iv;
/*     */       $i$a$-let-SaversKt$restore$2$iv = 0;
/*     */       Intrinsics.checkNotNull((value$iv != null) ? (Integer)it$iv : null);
/*     */       return TextRange.box-impl(TextRangeKt.TextRange(((Number)((value$iv != null) ? (Integer)it$iv : null)).intValue(), ((Number)((value$iv != null) ? (Integer)it$iv : null)).intValue()));
/*     */     }
/*     */     
/*     */     SaversKt$TextRangeSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<Shadow, Object> getSaver(@NotNull Shadow.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return ShadowSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(SaversKt$ShadowSaver$1.INSTANCE, SaversKt$ShadowSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/graphics/Shadow;", "invoke"})
/*     */   static final class SaversKt$ShadowSaver$1 extends Lambda implements Function2<SaverScope, Shadow, Object> {
/*     */     public static final SaversKt$ShadowSaver$1 INSTANCE = new SaversKt$ShadowSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull Shadow it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       Object[] arrayOfObject = new Object[3];
/*     */       arrayOfObject[0] = SaversKt.save(Color.box-impl(it.getColor-0d7_KjU()), SaversKt.getSaver(Color.Companion), $this$Saver);
/*     */       arrayOfObject[1] = SaversKt.save(Offset.box-impl(it.getOffset-F1C5BW0()), SaversKt.getSaver(Offset.Companion), $this$Saver);
/*     */       arrayOfObject[2] = SaversKt.save(Float.valueOf(it.getBlurRadius()));
/*     */       return CollectionsKt.arrayListOf(arrayOfObject);
/*     */     }
/*     */     
/*     */     SaversKt$ShadowSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Shadow;", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n62#2,2:542\n62#2,2:545\n93#2:548\n1#3:544\n1#3:547\n1#3:549\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ShadowSaver$2\n*L\n456#1:542,2\n457#1:545,2\n458#1:548\n456#1:544\n457#1:547\n458#1:549\n*E\n"})
/*     */   static final class SaversKt$ShadowSaver$2 extends Lambda implements Function1<Object, Shadow> {
/*     */     public static final SaversKt$ShadowSaver$2 INSTANCE = new SaversKt$ShadowSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final Shadow invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List<Object> list = (List)it;
/*     */       Object object = list.get(0);
/*     */       Saver<Color, Object> saver1 = SaversKt.getSaver(Color.Companion);
/*     */       int i = 0;
/*     */       Object object1 = object;
/*     */       int $i$a$-let-SaversKt$restore$1$iv = 0;
/*     */       Saver<Color, Object> saver2 = saver1;
/*     */       int $i$a$-with-SaversKt$restore$1$1$iv = 0;
/*     */       Intrinsics.checkNotNull((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((object != null) ? saver2.restore(object) : null));
/*     */       Object value$iv = list.get(1);
/*     */       Saver<Offset, Object> saver$iv = SaversKt.getSaver(Offset.Companion);
/*     */       i = 0;
/*     */       object1 = value$iv;
/*     */       $i$a$-let-SaversKt$restore$1$iv = 0;
/*     */       Saver<Offset, Object> $this$restore_u24lambda_u243_u24lambda_u242$iv = saver$iv;
/*     */       $i$a$-with-SaversKt$restore$1$1$iv = 0;
/*     */       Intrinsics.checkNotNull((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null));
/*     */       value$iv = list.get(2);
/*     */       int $i$f$restore = 0;
/*     */       Object it$iv = value$iv;
/*     */       int $i$a$-let-SaversKt$restore$2$iv = 0;
/*     */       Intrinsics.checkNotNull((value$iv != null) ? (Float)it$iv : null);
/*     */       return new Shadow(((Intrinsics.areEqual(object, Boolean.valueOf(false)) && !(saver1 instanceof NonNullValueClassSaver)) ? null : ((object != null) ? saver2.restore(object) : null)).unbox-impl(), ((Intrinsics.areEqual(value$iv, Boolean.valueOf(false)) && !(saver$iv instanceof NonNullValueClassSaver)) ? null : ((value$iv != null) ? $this$restore_u24lambda_u243_u24lambda_u242$iv.restore(value$iv) : null)).unbox-impl(), ((Number)((value$iv != null) ? (Float)it$iv : null)).floatValue(), null);
/*     */     }
/*     */     
/*     */     SaversKt$ShadowSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<Color, Object> getSaver(@NotNull Color.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return ColorSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final NonNullValueClassSaver<Color, Object> ColorSaver = NonNullValueClassSaver(SaversKt$ColorSaver$1.INSTANCE, SaversKt$ColorSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/graphics/Color;", "invoke-4WTKRHQ", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ColorSaver$1\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,541:1\n702#2:542\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$ColorSaver$1\n*L\n468#1:542\n*E\n"})
/*     */   static final class SaversKt$ColorSaver$1 extends Lambda implements Function2<SaverScope, Color, Object> {
/*     */     public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke-4WTKRHQ(@NotNull SaverScope $this$NonNullValueClassSaver, long it) {
/*     */       Intrinsics.checkNotNullParameter($this$NonNullValueClassSaver, "$this$NonNullValueClassSaver");
/*     */       long $this$isUnspecified$iv = it;
/*     */       int $i$f$isUnspecified-8_81llA = 0;
/*     */       return (($this$isUnspecified$iv == 16L)) ? Boolean.valueOf(false) : Integer.valueOf(ColorKt.toArgb-8_81llA(it));
/*     */     }
/*     */     
/*     */     SaversKt$ColorSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "", "invoke-ijrfgN4"})
/*     */   static final class SaversKt$ColorSaver$2 extends Lambda implements Function1<Object, Color> {
/*     */     public static final SaversKt$ColorSaver$2 INSTANCE = new SaversKt$ColorSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final Color invoke-ijrfgN4(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Intrinsics.areEqual(it, Boolean.valueOf(false)) ? Color.box-impl(Color.Companion.getUnspecified-0d7_KjU()) : Color.box-impl(ColorKt.Color(((Integer)it).intValue()));
/*     */     }
/*     */     
/*     */     SaversKt$ColorSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<TextUnit, Object> getSaver(@NotNull TextUnit.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return TextUnitSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver = NonNullValueClassSaver(SaversKt$TextUnitSaver$1.INSTANCE, SaversKt$TextUnitSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/unit/TextUnit;", "invoke-mpE4wyQ", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"})
/*     */   static final class SaversKt$TextUnitSaver$1 extends Lambda implements Function2<SaverScope, TextUnit, Object> {
/*     */     public static final SaversKt$TextUnitSaver$1 INSTANCE = new SaversKt$TextUnitSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke-mpE4wyQ(@NotNull SaverScope $this$NonNullValueClassSaver, long it) {
/*     */       Intrinsics.checkNotNullParameter($this$NonNullValueClassSaver, "$this$NonNullValueClassSaver");
/*     */       Object[] arrayOfObject = new Object[2];
/*     */       arrayOfObject[0] = SaversKt.save(Float.valueOf(TextUnit.getValue-impl(it)));
/*     */       arrayOfObject[1] = SaversKt.save(TextUnitType.box-impl(TextUnit.getType-UIouoOA(it)));
/*     */       return TextUnit.equals-impl0(it, TextUnit.Companion.getUnspecified-XSAIIZE()) ? Boolean.valueOf(false) : CollectionsKt.arrayListOf(arrayOfObject);
/*     */     }
/*     */     
/*     */     SaversKt$TextUnitSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/TextUnit;", "it", "", "invoke-XNhUCwk"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$TextUnitSaver$2\n*L\n492#1:542\n492#1:543\n*E\n"})
/*     */   static final class SaversKt$TextUnitSaver$2 extends Lambda implements Function1<Object, TextUnit> {
/*     */     public static final SaversKt$TextUnitSaver$2 INSTANCE = new SaversKt$TextUnitSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final TextUnit invoke-XNhUCwk(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List list = (List)it;
/*     */       Object value$iv = list.get(0);
/*     */       int $i$f$restore = 0;
/*     */       Object it$iv = value$iv;
/*     */       int $i$a$-let-SaversKt$restore$2$iv = 0;
/*     */       Intrinsics.checkNotNull((value$iv != null) ? (Float)it$iv : null);
/*     */       value$iv = list.get(1);
/*     */       $i$f$restore = 0;
/*     */       it$iv = value$iv;
/*     */       $i$a$-let-SaversKt$restore$2$iv = 0;
/*     */       Intrinsics.checkNotNull((value$iv != null) ? it$iv : null);
/*     */       return Intrinsics.areEqual(it, Boolean.valueOf(false)) ? TextUnit.box-impl(TextUnit.Companion.getUnspecified-XSAIIZE()) : TextUnit.box-impl(TextUnitKt.TextUnit-anM5pPY(((Number)((value$iv != null) ? (Float)it$iv : null)).floatValue(), ((value$iv != null) ? it$iv : null).unbox-impl()));
/*     */     }
/*     */     
/*     */     SaversKt$TextUnitSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<Offset, Object> getSaver(@NotNull Offset.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return OffsetSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final NonNullValueClassSaver<Offset, Object> OffsetSaver = NonNullValueClassSaver(SaversKt$OffsetSaver$1.INSTANCE, SaversKt$OffsetSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/geometry/Offset;", "invoke-Uv8p0NA", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"})
/*     */   static final class SaversKt$OffsetSaver$1 extends Lambda implements Function2<SaverScope, Offset, Object> {
/*     */     public static final SaversKt$OffsetSaver$1 INSTANCE = new SaversKt$OffsetSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke-Uv8p0NA(@NotNull SaverScope $this$NonNullValueClassSaver, long it) {
/*     */       Intrinsics.checkNotNullParameter($this$NonNullValueClassSaver, "$this$NonNullValueClassSaver");
/*     */       Float[] arrayOfFloat = new Float[2];
/*     */       arrayOfFloat[0] = SaversKt.save(Float.valueOf(Offset.getX-impl(it)));
/*     */       arrayOfFloat[1] = SaversKt.save(Float.valueOf(Offset.getY-impl(it)));
/*     */       return Offset.equals-impl0(it, Offset.Companion.getUnspecified-F1C5BW0()) ? Boolean.valueOf(false) : CollectionsKt.arrayListOf((Object[])arrayOfFloat);
/*     */     }
/*     */     
/*     */     SaversKt$OffsetSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "it", "", "invoke-x-9fifI"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n+ 2 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n93#2:542\n1#3:543\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$OffsetSaver$2\n*L\n513#1:542\n513#1:543\n*E\n"})
/*     */   static final class SaversKt$OffsetSaver$2 extends Lambda implements Function1<Object, Offset> {
/*     */     public static final SaversKt$OffsetSaver$2 INSTANCE = new SaversKt$OffsetSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final Offset invoke-x-9fifI(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List list = (List)it;
/*     */       Object value$iv = list.get(0);
/*     */       int $i$f$restore = 0;
/*     */       Object it$iv = value$iv;
/*     */       int $i$a$-let-SaversKt$restore$2$iv = 0;
/*     */       Intrinsics.checkNotNull((value$iv != null) ? (Float)it$iv : null);
/*     */       value$iv = list.get(1);
/*     */       $i$f$restore = 0;
/*     */       it$iv = value$iv;
/*     */       $i$a$-let-SaversKt$restore$2$iv = 0;
/*     */       Intrinsics.checkNotNull((value$iv != null) ? (Float)it$iv : null);
/*     */       return Intrinsics.areEqual(it, Boolean.valueOf(false)) ? Offset.box-impl(Offset.Companion.getUnspecified-F1C5BW0()) : Offset.box-impl(OffsetKt.Offset(((Number)((value$iv != null) ? (Float)it$iv : null)).floatValue(), ((Number)((value$iv != null) ? (Float)it$iv : null)).floatValue()));
/*     */     }
/*     */     
/*     */     SaversKt$OffsetSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<LocaleList, Object> getSaver(@NotNull LocaleList.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return LocaleListSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(SaversKt$LocaleListSaver$1.INSTANCE, SaversKt$LocaleListSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/intl/LocaleList;", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,541:1\n151#2,3:542\n33#2,4:545\n154#2,2:549\n38#2:551\n156#2:552\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$1\n*L\n523#1:542,3\n523#1:545,4\n523#1:549,2\n523#1:551\n523#1:552\n*E\n"})
/*     */   static final class SaversKt$LocaleListSaver$1 extends Lambda implements Function2<SaverScope, LocaleList, Object> {
/*     */     public static final SaversKt$LocaleListSaver$1 INSTANCE = new SaversKt$LocaleListSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull LocaleList it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List $this$fastMap$iv = it.getLocaleList();
/*     */       int $i$f$fastMap = 0;
/*     */       ArrayList<Object> target$iv = new ArrayList($this$fastMap$iv.size());
/*     */       List $this$fastForEach$iv$iv = $this$fastMap$iv;
/*     */       int $i$f$fastForEach = 0;
/*     */       int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size();
/*     */       if (index$iv$iv < i) {
/*     */         Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/*     */         Object it$iv = item$iv$iv;
/*     */         int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*     */         Locale locale = (Locale)it$iv;
/*     */         ArrayList<Object> arrayList = target$iv;
/*     */         int $i$a$-fastMap-SaversKt$LocaleListSaver$1$1 = 0;
/*     */         arrayList.add(SaversKt.save(locale, SaversKt.getSaver(Locale.Companion), $this$Saver));
/*     */       } 
/*     */       return target$iv;
/*     */     }
/*     */     
/*     */     SaversKt$LocaleListSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/intl/LocaleList;", "it", "", "invoke"})
/*     */   @SourceDebugExtension({"SMAP\nSavers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Savers.kt\nandroidx/compose/ui/text/SaversKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,541:1\n151#2,3:542\n33#2,4:545\n154#2:549\n155#2:553\n38#2:554\n156#2:555\n62#3,2:550\n1#4:552\n*S KotlinDebug\n*F\n+ 1 Savers.kt\nandroidx/compose/ui/text/SaversKt$LocaleListSaver$2\n*L\n530#1:542,3\n530#1:545,4\n530#1:549\n530#1:553\n530#1:554\n530#1:555\n530#1:550,2\n530#1:552\n*E\n"})
/*     */   static final class SaversKt$LocaleListSaver$2 extends Lambda implements Function1<Object, LocaleList> {
/*     */     public static final SaversKt$LocaleListSaver$2 INSTANCE = new SaversKt$LocaleListSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final LocaleList invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       List list = (List)it;
/*     */       List $this$fastMap$iv = list;
/*     */       int $i$f$fastMap = 0;
/*     */       ArrayList target$iv = new ArrayList($this$fastMap$iv.size());
/*     */       List $this$fastForEach$iv$iv = $this$fastMap$iv;
/*     */       int $i$f$fastForEach = 0;
/*     */       int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size();
/*     */       if (index$iv$iv < i) {
/*     */         Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/*     */         Object it$iv = item$iv$iv;
/*     */         int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*     */         Object object1 = it$iv;
/*     */         ArrayList arrayList = target$iv;
/*     */         int $i$a$-fastMap-SaversKt$LocaleListSaver$2$1 = 0;
/*     */         Saver<Locale, Object> saver$iv = SaversKt.getSaver(Locale.Companion);
/*     */         int $i$f$restore = 0;
/*     */       } 
/*     */       ArrayList arrayList1 = target$iv;
/*     */       return new LocaleList(arrayList1);
/*     */     }
/*     */     
/*     */     SaversKt$LocaleListSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Saver<Locale, Object> getSaver(@NotNull Locale.Companion $this$Saver) {
/*     */     Intrinsics.checkNotNullParameter($this$Saver, "<this>");
/*     */     return LocaleSaver;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(SaversKt$LocaleSaver$1.INSTANCE, SaversKt$LocaleSaver$2.INSTANCE);
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\022\n\000\n\002\020\000\n\002\030\002\n\000\n\002\030\002\n\000\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\004H\n¢\006\002\b\005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/text/intl/Locale;", "invoke"})
/*     */   static final class SaversKt$LocaleSaver$1 extends Lambda implements Function2<SaverScope, Locale, Object> {
/*     */     public static final SaversKt$LocaleSaver$1 INSTANCE = new SaversKt$LocaleSaver$1();
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SaverScope $this$Saver, @NotNull Locale it) {
/*     */       Intrinsics.checkNotNullParameter($this$Saver, "$this$Saver");
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return it.toLanguageTag();
/*     */     }
/*     */     
/*     */     SaversKt$LocaleSaver$1() {
/*     */       super(2);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\000\n\000\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/intl/Locale;", "it", "", "invoke"})
/*     */   static final class SaversKt$LocaleSaver$2 extends Lambda implements Function1<Object, Locale> {
/*     */     public static final SaversKt$LocaleSaver$2 INSTANCE = new SaversKt$LocaleSaver$2();
/*     */     
/*     */     @Nullable
/*     */     public final Locale invoke(@NotNull Object it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return new Locale((String)it);
/*     */     }
/*     */     
/*     */     SaversKt$LocaleSaver$2() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\SaversKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */