/*     */ package androidx.compose.ui.text.platform;
/*     */ 
/*     */ import androidx.compose.ui.text.AnnotatedString;
/*     */ import androidx.compose.ui.text.CharHelpers_skikoKt;
/*     */ import androidx.compose.ui.text.ParagraphIntrinsics;
/*     */ import androidx.compose.ui.text.Placeholder;
/*     */ import androidx.compose.ui.text.SpanStyle;
/*     */ import androidx.compose.ui.text.StrongDirectionType;
/*     */ import androidx.compose.ui.text.TextStyle;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.intl.DesktopPlatformLocale_desktopKt;
/*     */ import androidx.compose.ui.text.intl.Locale;
/*     */ import androidx.compose.ui.text.intl.LocaleList;
/*     */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*     */ import androidx.compose.ui.text.style.TextDirection;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000X\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032P\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\022\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\0072\022\020\n\032\016\022\n\022\b\022\004\022\0020\0130\b0\0072\006\020\f\032\0020\r2\006\020\016\032\0020\017H\000\032\036\020\020\032\0020\0212\006\020\002\032\0020\0032\f\020\022\032\b\022\004\022\0020\0210\023H\002\032\022\020\024\032\0020\0212\b\020\025\032\004\030\0010\026H\002\0320\020\027\032\0020\0212\006\020\002\032\0020\0032\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\033H\000ø\001\000¢\006\002\b\034\002\007\n\005\b¡\0360\001¨\006\035"}, d2 = {"ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "contentBasedTextDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "fallback", "Lkotlin/Function0;", "localeBasedTextDirection", "locale", "Landroidx/compose/ui/text/intl/Locale;", "resolveTextDirection", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirection-Ikz0yAw", "ui-text"})
/*     */ public final class SkiaParagraphIntrinsics_skikoKt
/*     */ {
/*     */   @NotNull
/*     */   public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
/*  37 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(spanStyles, "spanStyles"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver"); return new SkiaParagraphIntrinsics(
/*  38 */         text, 
/*  39 */         style, 
/*  40 */         spanStyles, 
/*  41 */         placeholders, 
/*  42 */         density, 
/*  43 */         fontFamilyResolver);
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
/*     */   @NotNull
/*     */   public static final ResolvedTextDirection resolveTextDirection-Ikz0yAw(@NotNull String text, @Nullable TextDirection textDirection, @Nullable LocaleList localeList) {
/*  91 */     Intrinsics.checkNotNullParameter(text, "text"); int i = (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getContent-s_7X-co();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     if (TextDirection.equals-impl0(i, TextDirection.Companion.getContentOrRtl-s_7X-co())) {  } else { throw new IllegalStateException(
/*  97 */           "Invalid TextDirection.".toString()); }
/*     */     
/*     */     return TextDirection.equals-impl0(i, TextDirection.Companion.getLtr-s_7X-co()) ? ResolvedTextDirection.Ltr : (TextDirection.equals-impl0(i, TextDirection.Companion.getRtl-s_7X-co()) ? ResolvedTextDirection.Rtl : ((TextDirection.equals-impl0(i, TextDirection.Companion.getContent-s_7X-co()) ? true : TextDirection.equals-impl0(i, TextDirection.Companion.getUnspecified-s_7X-co())) ? contentBasedTextDirection(text, new SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$1(localeList)) : (TextDirection.equals-impl0(i, TextDirection.Companion.getContentOrLtr-s_7X-co()) ? contentBasedTextDirection(text, SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$2.INSTANCE) : (ResolvedTextDirection)"JD-Core does not support Kotlin")));
/*     */   }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "invoke"})
/*     */   static final class SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$1 extends Lambda implements Function0<ResolvedTextDirection> {
/*     */     SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$1(LocaleList $localeList) {
/*     */       super(0);
/*     */     } @NotNull
/*     */     public final ResolvedTextDirection invoke() {
/*     */       return SkiaParagraphIntrinsics_skikoKt.localeBasedTextDirection((this.$localeList != null) ? (Locale)CollectionsKt.firstOrNull((Iterable)this.$localeList) : null);
/*     */     } }
/* 109 */   private static final ResolvedTextDirection contentBasedTextDirection(String text, Function0 fallback) { int i = CharHelpers_skikoKt.firstStrongDirectionType(text);
/* 110 */     return StrongDirectionType.equals-impl0(i, StrongDirectionType.Companion.getLtr-JKYp3V4()) ? ResolvedTextDirection.Ltr : (
/* 111 */       StrongDirectionType.equals-impl0(i, StrongDirectionType.Companion.getRtl-JKYp3V4()) ? ResolvedTextDirection.Rtl : 
/* 112 */       (ResolvedTextDirection)fallback.invoke()); }
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "invoke"}) static final class SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$2 extends Lambda implements Function0<ResolvedTextDirection> {
/*     */     public static final SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$2 INSTANCE = new SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$2();
/*     */     SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$2() { super(0); } @NotNull public final ResolvedTextDirection invoke() { return ResolvedTextDirection.Ltr; } } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "invoke"}) static final class SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$3 extends Lambda implements Function0<ResolvedTextDirection> {
/* 116 */     public static final SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$3 INSTANCE = new SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$3(); SkiaParagraphIntrinsics_skikoKt$resolveTextDirection$3() { super(0); } @NotNull public final ResolvedTextDirection invoke() { return ResolvedTextDirection.Rtl; } } private static final ResolvedTextDirection localeBasedTextDirection(Locale locale) { if (locale == null); return DesktopPlatformLocale_desktopKt.isRtl(Locale.Companion.getCurrent().getPlatformLocale()) ? 
/* 117 */       ResolvedTextDirection.Rtl : 
/*     */       
/* 119 */       ResolvedTextDirection.Ltr; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\SkiaParagraphIntrinsics_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */