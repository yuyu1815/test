/*    */ package androidx.compose.ui.text.platform;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import androidx.compose.ui.text.AnnotatedString;
/*    */ import androidx.compose.ui.text.ParagraphIntrinsics;
/*    */ import androidx.compose.ui.text.Placeholder;
/*    */ import androidx.compose.ui.text.SpanStyle;
/*    */ import androidx.compose.ui.text.TextStyle;
/*    */ import androidx.compose.ui.text.font.FontFamily;
/*    */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*    */ import androidx.compose.ui.text.style.TextDirection;
/*    */ import androidx.compose.ui.unit.Density;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ import org.jetbrains.skia.paragraph.Paragraph;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\b\n\002\030\002\n\002\b\004\b\000\030\0002\0020\001BM\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\022\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007\022\022\020\n\032\016\022\n\022\b\022\004\022\0020\0130\b0\007\022\006\020\f\032\0020\r\022\006\020\016\032\0020\017¢\006\002\020\020J\006\020\021\032\0020\022J\b\020 \032\0020\022H\002R\016\020\f\032\0020\rX\004¢\006\002\n\000R\016\020\016\032\0020\017X\004¢\006\002\n\000R\020\020\021\032\004\030\0010\022X\016¢\006\002\n\000R\036\020\025\032\0020\0242\006\020\023\032\0020\024@RX\016¢\006\b\n\000\032\004\b\026\020\027R\036\020\030\032\0020\0242\006\020\023\032\0020\024@RX\016¢\006\b\n\000\032\004\b\031\020\027R\032\020\n\032\016\022\n\022\b\022\004\022\0020\0130\b0\007X\004¢\006\002\n\000R\032\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\032\020\033R\021\020\034\032\0020\035¢\006\b\n\000\032\004\b\036\020\037¨\006!"}, d2 = {"Landroidx/compose/ui/text/platform/SkiaParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "layouter", "Landroidx/compose/ui/text/platform/ParagraphLayouter;", "<set-?>", "", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "()F", "minIntrinsicWidth", "getMinIntrinsicWidth", "getText", "()Ljava/lang/String;", "textDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getTextDirection", "()Landroidx/compose/ui/text/style/ResolvedTextDirection;", "newLayouter", "ui-text"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ public final class SkiaParagraphIntrinsics
/*    */   implements ParagraphIntrinsics
/*    */ {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final TextStyle style;
/*    */   @NotNull
/*    */   private final List<AnnotatedString.Range<SpanStyle>> spanStyles;
/*    */   @NotNull
/*    */   private final List<AnnotatedString.Range<Placeholder>> placeholders;
/*    */   @NotNull
/*    */   private final Density density;
/*    */   @NotNull
/*    */   private final FontFamily.Resolver fontFamilyResolver;
/*    */   @NotNull
/*    */   private final ResolvedTextDirection textDirection;
/*    */   @Nullable
/*    */   private ParagraphLayouter layouter;
/*    */   private float minIntrinsicWidth;
/*    */   private float maxIntrinsicWidth;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public SkiaParagraphIntrinsics(@NotNull String text, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<SpanStyle>> spanStyles, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
/* 47 */     this.text = text;
/* 48 */     this.style = style;
/* 49 */     this.spanStyles = spanStyles;
/* 50 */     this.placeholders = placeholders;
/* 51 */     this.density = density;
/* 52 */     this.fontFamilyResolver = fontFamilyResolver;
/*    */     
/* 54 */     this.textDirection = SkiaParagraphIntrinsics_skikoKt.resolveTextDirection-Ikz0yAw(this.text, TextDirection.box-impl(this.style.getTextDirection-s_7X-co()), this.style.getLocaleList());
/*    */     
/* 56 */     this.layouter = newLayouter();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 80 */     Intrinsics.checkNotNull(this.layouter); Paragraph para = this.layouter.layoutParagraph(Float.POSITIVE_INFINITY);
/* 81 */     this.minIntrinsicWidth = (float)Math.ceil(para.getMinIntrinsicWidth());
/* 82 */     this.maxIntrinsicWidth = (float)Math.ceil(para.getMaxIntrinsicWidth());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ResolvedTextDirection getTextDirection() {
/*    */     return this.textDirection;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ParagraphLayouter layouter() {
/*    */     if (this.layouter == null);
/*    */     ParagraphLayouter layouter = newLayouter();
/*    */     this.layouter = null;
/*    */     return layouter;
/*    */   }
/*    */   
/*    */   private final ParagraphLayouter newLayouter() {
/*    */     return new ParagraphLayouter(this.text, this.textDirection, this.style, this.spanStyles, this.placeholders, this.density, this.fontFamilyResolver);
/*    */   }
/*    */   
/*    */   public float getMinIntrinsicWidth() {
/*    */     return this.minIntrinsicWidth;
/*    */   }
/*    */   
/*    */   public float getMaxIntrinsicWidth() {
/*    */     return this.maxIntrinsicWidth;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\platform\SkiaParagraphIntrinsics.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */