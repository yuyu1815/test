/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.ui.text.style.LineHeightStyle;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.skia.FontMetrics;
/*     */ import org.jetbrains.skia.IRange;
/*     */ import org.jetbrains.skia.paragraph.LineMetrics;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000F\n\002\b\002\n\002\020\021\n\000\n\002\030\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\020\b\n\002\b\005\n\002\020\006\n\002\b\b\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\0328\020\000\032\004\030\001H\001\"\004\b\000\020\001*\n\022\006\b\001\022\002H\0010\0022\024\b\004\020\003\032\016\022\004\022\002H\001\022\004\022\0020\0050\004H\b¢\006\002\020\006\032\001\020\007\032\0020\b*\0020\b2\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\n2\b\b\002\020\f\032\0020\n2\b\b\002\020\r\032\0020\n2\b\b\002\020\016\032\0020\0052\b\b\002\020\017\032\0020\0202\b\b\002\020\021\032\0020\0202\b\b\002\020\022\032\0020\0202\b\b\002\020\023\032\0020\0202\b\b\002\020\024\032\0020\0202\b\b\002\020\025\032\0020\0202\b\b\002\020\026\032\0020\0202\b\b\002\020\027\032\0020\nH\002\032\021\020\030\032\0020\031*\0020\032H\002¢\006\002\020\033\032\034\020\034\032\0020\b*\0020\b2\006\020\035\032\0020\0362\006\020\037\032\0020 H\002\032\034\020!\032\0020\b*\0020\b2\006\020\035\032\0020\0362\006\020\037\032\0020 H\002¨\006\""}, d2 = {"binarySearchFirstMatchingOrLast", "T", "", "predicate", "Lkotlin/Function1;", "", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "copy", "Lorg/jetbrains/skia/paragraph/LineMetrics;", "startIndex", "", "endIndex", "endExcludingWhitespaces", "endIncludingNewline", "isHardBreak", "ascent", "", "descent", "unscaledAscent", "height", "width", "left", "baseline", "lineNumber", "toTextRange", "Landroidx/compose/ui/text/TextRange;", "Lorg/jetbrains/skia/IRange;", "(Lorg/jetbrains/skia/IRange;)J", "trimFirstAscent", "fontMetrics", "Lorg/jetbrains/skia/FontMetrics;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "trimLastDescent", "ui-text"})
/*     */ public final class SkiaParagraph_skikoKt
/*     */ {
/*     */   private static final LineMetrics trimFirstAscent(LineMetrics $this$trimFirstAscent, FontMetrics fontMetrics, TextStyle textStyle) {
/* 592 */     if (TextUnitKt.isUnspecified--R2X_6o(textStyle.getLineHeight-XSAIIZE())) return $this$trimFirstAscent; 
/* 593 */     if (textStyle.getLineHeightStyle() == null) textStyle.getLineHeightStyle();  LineHeightStyle style = LineHeightStyle.Companion.getDefault();
/* 594 */     double ascent = LineHeightStyle.Trim.isTrimFirstLineTop-impl$ui_text(style.getTrim-EVpEnUU()) ? 
/* 595 */       -(fontMetrics.getAscent()) : 
/*     */       
/* 597 */       $this$trimFirstAscent.getAscent();
/*     */     
/* 599 */     return copy$default($this$trimFirstAscent, 0, 0, 0, 0, false, ascent, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0, 8159, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final LineMetrics trimLastDescent(LineMetrics $this$trimLastDescent, FontMetrics fontMetrics, TextStyle textStyle) {
/* 606 */     if (TextUnitKt.isUnspecified--R2X_6o(textStyle.getLineHeight-XSAIIZE())) return $this$trimLastDescent; 
/* 607 */     if (textStyle.getLineHeightStyle() == null) textStyle.getLineHeightStyle();  LineHeightStyle style = LineHeightStyle.Companion.getDefault();
/* 608 */     double descent = LineHeightStyle.Trim.isTrimLastLineBottom-impl$ui_text(style.getTrim-EVpEnUU()) ? 
/* 609 */       fontMetrics.getDescent() : 
/*     */       
/* 611 */       $this$trimLastDescent.getDescent();
/*     */     
/* 613 */     return copy$default($this$trimLastDescent, 0, 0, 0, 0, false, 0.0D, descent, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0, 8127, null);
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
/*     */   private static final LineMetrics copy(LineMetrics $this$copy, int startIndex, int endIndex, int endExcludingWhitespaces, int endIncludingNewline, boolean isHardBreak, double ascent, double descent, double unscaledAscent, double height, double width, double left, double baseline, int lineNumber) {
/* 630 */     return new LineMetrics(
/* 631 */         startIndex, 
/* 632 */         endIndex, 
/* 633 */         endExcludingWhitespaces, 
/* 634 */         endIncludingNewline, 
/* 635 */         isHardBreak, 
/* 636 */         ascent, 
/* 637 */         descent, 
/* 638 */         unscaledAscent, 
/* 639 */         height, 
/* 640 */         width, 
/* 641 */         left, 
/* 642 */         baseline, 
/* 643 */         lineNumber);
/*     */   }
/*     */   private static final long toTextRange(IRange $this$toTextRange) {
/* 646 */     return TextRangeKt.TextRange($this$toTextRange.getStart(), $this$toTextRange.getEnd());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final <T> T binarySearchFirstMatchingOrLast(Object[] $this$binarySearchFirstMatchingOrLast, Function1<? super T, Boolean> predicate) {
/* 656 */     int $i$f$binarySearchFirstMatchingOrLast = 0; if (($this$binarySearchFirstMatchingOrLast.length == 0)) {
/* 657 */       return null;
/*     */     }
/*     */     
/* 660 */     int index = CollectionsKt.binarySearch$default(ArraysKt.asList($this$binarySearchFirstMatchingOrLast), 0, 0, new SkiaParagraph_skikoKt$binarySearchFirstMatchingOrLast$index$1(predicate), 3, null);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 665 */     return (T)$this$binarySearchFirstMatchingOrLast[RangesKt.coerceAtMost(-index - 1, ArraysKt.getLastIndex($this$binarySearchFirstMatchingOrLast))];
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"})
/*     */   @SourceDebugExtension({"SMAP\nSkiaParagraph.skiko.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkiaParagraph.skiko.kt\nandroidx/compose/ui/text/SkiaParagraph_skikoKt$binarySearchFirstMatchingOrLast$index$1\n*L\n1#1,667:1\n*E\n"})
/*     */   public static final class SkiaParagraph_skikoKt$binarySearchFirstMatchingOrLast$index$1 extends Lambda implements Function1<T, Integer> {
/*     */     @NotNull
/*     */     public final Integer invoke(Object it) {
/*     */       return Integer.valueOf(((Boolean)this.$predicate.invoke(it)).booleanValue() ? 1 : -1);
/*     */     }
/*     */     
/*     */     public SkiaParagraph_skikoKt$binarySearchFirstMatchingOrLast$index$1(Function1<T, Boolean> $predicate) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\SkiaParagraph_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */