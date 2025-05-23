/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.ui.text.font.Font;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.platform.SkiaParagraph_skikoKt;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000`\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\020\007\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\0324\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\0012\b\b\002\020\t\032\0020\nø\001\000¢\006\004\b\013\020\f\032,\020\002\032\0020\0032\006\020\004\032\0020\0052\b\b\002\020\b\032\0020\0012\b\b\002\020\t\032\0020\n2\006\020\r\032\0020\016H\007\032x\020\002\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\006\032\0020\0072\006\020\023\032\0020\0242\006\020\025\032\0020\0262\024\b\002\020\027\032\016\022\n\022\b\022\004\022\0020\0320\0310\0302\024\b\002\020\033\032\016\022\n\022\b\022\004\022\0020\0340\0310\0302\b\b\002\020\b\032\0020\0012\b\b\002\020\t\032\0020\nø\001\000¢\006\004\b\035\020\036\032p\020\002\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\r\032\0020\0162\006\020\023\032\0020\0242\006\020\025\032\0020\0262\024\b\002\020\027\032\016\022\n\022\b\022\004\022\0020\0320\0310\0302\024\b\002\020\033\032\016\022\n\022\b\022\004\022\0020\0340\0310\0302\b\b\002\020\b\032\0020\0012\b\b\002\020\t\032\0020\nH\007\032p\020\002\032\0020\0032\006\020\017\032\0020\0202\006\020\021\032\0020\0222\024\b\002\020\027\032\016\022\n\022\b\022\004\022\0020\0320\0310\0302\024\b\002\020\033\032\016\022\n\022\b\022\004\022\0020\0340\0310\0302\b\b\002\020\b\032\0020\0012\b\b\002\020\t\032\0020\n2\006\020\r\032\0020\0162\006\020\023\032\0020\0242\006\020\037\032\0020 H\007\032\f\020!\032\0020\001*\0020\016H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006\""}, d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "ellipsis", "", "Paragraph-_EkL_-Y", "(Landroidx/compose/ui/text/ParagraphIntrinsics;JIZ)Landroidx/compose/ui/text/Paragraph;", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "Paragraph-UdtVg6A", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Ljava/util/List;IZ)Landroidx/compose/ui/text/Paragraph;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ceilToInt", "ui-text"})
/*     */ public final class ParagraphKt
/*     */ {
/*     */   public static final int DefaultMaxLines = 2147483647;
/*     */   
/*     */   @Deprecated(message = "Font.ResourceLoader is deprecated, instead pass FontFamily.Resolver", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, spanStyles, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
/*     */   @NotNull
/*     */   public static final Paragraph Paragraph(@NotNull String text, @NotNull TextStyle style, @NotNull List spanStyles, @NotNull List placeholders, int maxLines, boolean ellipsis, float width, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
/* 435 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(spanStyles, "spanStyles"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader"); return SkiaParagraph_skikoKt.ActualParagraph(text, 
/* 436 */         style, 
/* 437 */         spanStyles, 
/* 438 */         placeholders, 
/* 439 */         maxLines, 
/* 440 */         ellipsis, 
/* 441 */         width, 
/* 442 */         density, 
/* 443 */         resourceLoader);
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
/*     */   @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(text, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, spanStyles, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
/*     */   @NotNull
/*     */   public static final Paragraph Paragraph(@NotNull String text, @NotNull TextStyle style, float width, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List spanStyles, @NotNull List placeholders, int maxLines, boolean ellipsis) {
/* 486 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver"); Intrinsics.checkNotNullParameter(spanStyles, "spanStyles"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); return SkiaParagraph_skikoKt.ActualParagraph-O3s9Psw(text, 
/* 487 */         style, 
/* 488 */         spanStyles, 
/* 489 */         placeholders, 
/* 490 */         maxLines, 
/* 491 */         ellipsis, 
/* 492 */         ConstraintsKt.Constraints$default(0, ceilToInt(width), 0, 0, 13, null), 
/* 493 */         density, 
/* 494 */         fontFamilyResolver);
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
/*     */   @NotNull
/*     */   public static final Paragraph Paragraph-UdtVg6A(@NotNull String text, @NotNull TextStyle style, long constraints, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, @NotNull List spanStyles, @NotNull List placeholders, int maxLines, boolean ellipsis) {
/* 530 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver"); Intrinsics.checkNotNullParameter(spanStyles, "spanStyles"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); return SkiaParagraph_skikoKt.ActualParagraph-O3s9Psw(text, 
/* 531 */         style, 
/* 532 */         spanStyles, 
/* 533 */         placeholders, 
/* 534 */         maxLines, 
/* 535 */         ellipsis, 
/* 536 */         constraints, 
/* 537 */         density, 
/* 538 */         fontFamilyResolver);
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
/*     */   @Deprecated(message = "Paragraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "Paragraph(paragraphIntrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
/*     */   @NotNull
/*     */   public static final Paragraph Paragraph(@NotNull ParagraphIntrinsics paragraphIntrinsics, int maxLines, boolean ellipsis, float width) {
/* 565 */     Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics"); return SkiaParagraph_skikoKt.ActualParagraph--hBUhpc(paragraphIntrinsics, 
/* 566 */         maxLines, 
/* 567 */         ellipsis, 
/* 568 */         ConstraintsKt.Constraints$default(0, ceilToInt(width), 0, 0, 13, null));
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
/*     */   @NotNull
/*     */   public static final Paragraph Paragraph-_EkL_-Y(@NotNull ParagraphIntrinsics paragraphIntrinsics, long constraints, int maxLines, boolean ellipsis) {
/* 588 */     Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics"); return SkiaParagraph_skikoKt.ActualParagraph--hBUhpc(paragraphIntrinsics, 
/* 589 */         maxLines, 
/* 590 */         ellipsis, 
/* 591 */         constraints);
/*     */   }
/*     */   public static final int ceilToInt(float $this$ceilToInt) {
/* 594 */     return (int)(float)Math.ceil($this$ceilToInt);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\ParagraphKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */