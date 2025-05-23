/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_skikoKt;
/*     */ import androidx.compose.ui.text.font.Font;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.platform.SkiaParagraphIntrinsics_skikoKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000:\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032T\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\024\b\002\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\0072\024\b\002\020\n\032\016\022\n\022\b\022\004\022\0020\0130\b0\0072\006\020\f\032\0020\r2\006\020\016\032\0020\017H\007\032R\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\024\b\002\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\0072\024\b\002\020\n\032\016\022\n\022\b\022\004\022\0020\0130\b0\0072\006\020\f\032\0020\r2\006\020\020\032\0020\021¨\006\022"}, d2 = {"ParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "ui-text"})
/*     */ public final class ParagraphIntrinsicsKt
/*     */ {
/*     */   @Deprecated(message = "Font.ResourceLoader is deprecated, instead use FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "ParagraphIntrinsics(text, style, spanStyles, placeholders, density, fontFamilyResolver", imports = {}))
/*     */   @NotNull
/*     */   public static final ParagraphIntrinsics ParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List spanStyles, @NotNull List placeholders, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
/*  83 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(spanStyles, "spanStyles"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader"); return SkiaParagraphIntrinsics_skikoKt.ActualParagraphIntrinsics(text, 
/*  84 */         style, 
/*  85 */         spanStyles, 
/*  86 */         placeholders, 
/*  87 */         density, 
/*  88 */         DelegatingFontLoaderForDeprecatedUsage_skikoKt.createFontFamilyResolver(resourceLoader));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final ParagraphIntrinsics ParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List spanStyles, @NotNull List placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
/*  99 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(spanStyles, "spanStyles"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver"); return SkiaParagraphIntrinsics_skikoKt.ActualParagraphIntrinsics(text, 
/* 100 */         style, 
/* 101 */         spanStyles, 
/* 102 */         placeholders, 
/* 103 */         density, 
/* 104 */         fontFamilyResolver);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\ParagraphIntrinsicsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */