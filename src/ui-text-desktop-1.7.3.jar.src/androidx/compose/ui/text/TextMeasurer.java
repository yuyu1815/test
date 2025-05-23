/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.style.TextOverflow;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.ConstraintsKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.IntSizeKt;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\004\b\007\030\000 '2\0020\001:\001'B'\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nJ\001\020\r\032\0020\0162\006\020\017\032\0020\0202\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\0262\b\b\002\020\027\032\0020\t2\024\b\002\020\030\032\016\022\n\022\b\022\004\022\0020\0330\0320\0312\b\b\002\020\034\032\0020\0352\b\b\002\020\036\032\0020\0072\b\b\002\020\037\032\0020\0052\b\b\002\020 \032\0020\0032\b\b\002\020!\032\0020\026H\007ø\001\000¢\006\004\b\"\020#Jt\020\r\032\0020\0162\006\020\017\032\0020$2\b\b\002\020\021\032\0020\0222\b\b\002\020\023\032\0020\0242\b\b\002\020\025\032\0020\0262\b\b\002\020\027\032\0020\t2\b\b\002\020\034\032\0020\0352\b\b\002\020\036\032\0020\0072\b\b\002\020\037\032\0020\0052\b\b\002\020 \032\0020\0032\b\b\002\020!\032\0020\026H\007ø\001\000¢\006\004\b%\020&R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\020\020\013\032\004\030\0010\fX\004¢\006\002\n\000\002\007\n\005\b¡\0360\001¨\006("}, d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "defaultFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "defaultDensity", "Landroidx/compose/ui/unit/Density;", "defaultLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "measure", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui-text"})
/*     */ @Immutable
/*     */ public final class TextMeasurer
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final FontFamily.Resolver defaultFontFamilyResolver;
/*     */   @NotNull
/*     */   private final Density defaultDensity;
/*     */   @NotNull
/*     */   private final LayoutDirection defaultLayoutDirection;
/*     */   private final int cacheSize;
/*     */   @Nullable
/*     */   private final TextLayoutCache textLayoutCache;
/*     */   public static final int $stable;
/*     */   
/*     */   public TextMeasurer(@NotNull FontFamily.Resolver defaultFontFamilyResolver, @NotNull Density defaultDensity, @NotNull LayoutDirection defaultLayoutDirection, int cacheSize) {
/*  84 */     this.defaultFontFamilyResolver = defaultFontFamilyResolver;
/*  85 */     this.defaultDensity = defaultDensity;
/*  86 */     this.defaultLayoutDirection = defaultLayoutDirection;
/*  87 */     this.cacheSize = cacheSize;
/*     */     
/*  89 */     this.textLayoutCache = (this.cacheSize > 0) ? 
/*  90 */       new TextLayoutCache(this.cacheSize) : 
/*  91 */       null;
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
/*     */   @Stable
/*     */   @NotNull
/*     */   public final TextLayoutResult measure-xDpz5zY(@NotNull AnnotatedString text, @NotNull TextStyle style, int overflow, boolean softWrap, int maxLines, @NotNull List placeholders, long constraints, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
/* 153 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(placeholders, "placeholders"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver"); TextLayoutInput requestedTextLayoutInput = new TextLayoutInput(
/* 154 */         text, 
/* 155 */         style, 
/* 156 */         placeholders, 
/* 157 */         maxLines, 
/* 158 */         softWrap, 
/* 159 */         overflow, 
/* 160 */         density, 
/* 161 */         layoutDirection, 
/* 162 */         fontFamilyResolver, 
/* 163 */         constraints, null);
/*     */ 
/*     */     
/* 166 */     TextLayoutResult cacheResult = (!skipCache && this.textLayoutCache != null) ? 
/* 167 */       this.textLayoutCache.get(requestedTextLayoutInput) : 
/* 168 */       null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     TextLayoutResult textLayoutResult1 = Companion.layout(requestedTextLayoutInput), it = textLayoutResult1; int $i$a$-also-TextMeasurer$measure$1 = 0;
/* 182 */     if (this.textLayoutCache != null) { this.textLayoutCache.put(requestedTextLayoutInput, it); }
/*     */     else
/*     */     {  }
/*     */     
/*     */     return (cacheResult != null) ? cacheResult.copy-O0kMr_c(requestedTextLayoutInput, ConstraintsKt.constrain-4WqzIAM(constraints, IntSizeKt.IntSize(ParagraphKt.ceilToInt(cacheResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(cacheResult.getMultiParagraph().getHeight())))) : textLayoutResult1;
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
/*     */   @Stable
/*     */   @NotNull
/*     */   public final TextLayoutResult measure-wNUYSr0(@NotNull String text, @NotNull TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, @NotNull LayoutDirection layoutDirection, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
/* 242 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); Intrinsics.checkNotNullParameter(density, "density"); Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver"); return measure-xDpz5zY$default(this, 
/* 243 */         new AnnotatedString(text, null, null, 6, null), 
/* 244 */         style, 
/* 245 */         overflow, 
/* 246 */         softWrap, 
/* 247 */         maxLines, null, 
/* 248 */         constraints, 
/* 249 */         layoutDirection, 
/* 250 */         density, 
/* 251 */         fontFamilyResolver, 
/* 252 */         skipCache, 32, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\002¨\006\007"}, d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "()V", "layout", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "ui-text"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */     
/*     */     private final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
/* 266 */       TextLayoutInput $this$layout_u24lambda_u240 = textLayoutInput; int $i$a$-with-TextMeasurer$Companion$layout$1 = 0;
/*     */       
/* 268 */       AnnotatedString annotatedString = $this$layout_u24lambda_u240.getText();
/* 269 */       TextStyle textStyle = TextStyleKt.resolveDefaults($this$layout_u24lambda_u240.getStyle(), $this$layout_u24lambda_u240.getLayoutDirection());
/* 270 */       Density density = $this$layout_u24lambda_u240.getDensity();
/* 271 */       FontFamily.Resolver resolver = $this$layout_u24lambda_u240.getFontFamilyResolver();
/* 272 */       List<AnnotatedString.Range<Placeholder>> list = $this$layout_u24lambda_u240.getPlaceholders(); MultiParagraphIntrinsics nonNullIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
/*     */ 
/*     */       
/* 275 */       int minWidth = Constraints.getMinWidth-impl($this$layout_u24lambda_u240.getConstraints-msEJaDk());
/* 276 */       boolean widthMatters = ($this$layout_u24lambda_u240.getSoftWrap() || TextOverflow.equals-impl0($this$layout_u24lambda_u240.getOverflow-gIe3tQ8(), TextOverflow.Companion.getEllipsis-gIe3tQ8()));
/* 277 */       int maxWidth = (widthMatters && Constraints.getHasBoundedWidth-impl($this$layout_u24lambda_u240.getConstraints-msEJaDk())) ? 
/* 278 */         Constraints.getMaxWidth-impl($this$layout_u24lambda_u240.getConstraints-msEJaDk()) : Integer
/*     */         
/* 280 */         .MAX_VALUE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 298 */       boolean overwriteMaxLines = (!$this$layout_u24lambda_u240.getSoftWrap() && TextOverflow.equals-impl0($this$layout_u24lambda_u240.getOverflow-gIe3tQ8(), TextOverflow.Companion.getEllipsis-gIe3tQ8()));
/* 299 */       int finalMaxLines = overwriteMaxLines ? 1 : $this$layout_u24lambda_u240.getMaxLines();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 311 */       int width = (minWidth == maxWidth) ? 
/* 312 */         maxWidth : 
/*     */         
/* 314 */         RangesKt.coerceIn(ParagraphKt.ceilToInt(nonNullIntrinsics.getMaxIntrinsicWidth()), minWidth, maxWidth);
/*     */ 
/*     */       
/* 317 */       MultiParagraph multiParagraph = new MultiParagraph(
/* 318 */           nonNullIntrinsics, 
/* 319 */           Constraints.Companion.fitPrioritizingWidth-Zbe2FdA(
/* 320 */             0, 
/* 321 */             width, 
/* 322 */             0, 
/* 323 */             Constraints.getMaxHeight-impl($this$layout_u24lambda_u240.getConstraints-msEJaDk())), 
/*     */ 
/*     */           
/* 326 */           finalMaxLines, 
/* 327 */           TextOverflow.equals-impl0($this$layout_u24lambda_u240.getOverflow-gIe3tQ8(), TextOverflow.Companion.getEllipsis-gIe3tQ8()), null);
/*     */ 
/*     */       
/* 330 */       return new TextLayoutResult(
/* 331 */           textLayoutInput, 
/* 332 */           multiParagraph, 
/* 333 */           ConstraintsKt.constrain-4WqzIAM($this$layout_u24lambda_u240.getConstraints-msEJaDk(), 
/* 334 */             IntSizeKt.IntSize(
/* 335 */               (int)(float)Math.ceil(multiParagraph.getWidth()), 
/* 336 */               (int)(float)Math.ceil(multiParagraph.getHeight()))), null);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextMeasurer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */