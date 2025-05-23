/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.geometry.Rect;
/*     */ import androidx.compose.ui.graphics.Path;
/*     */ import androidx.compose.ui.text.style.ResolvedTextDirection;
/*     */ import androidx.compose.ui.unit.IntSize;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\005\n\002\020\007\n\002\b\t\n\002\020\b\n\002\b\005\n\002\020 \n\002\030\002\n\002\b\013\n\002\030\002\n\002\b\023\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\016\n\000\b\007\030\0002\0020\001B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\bJ$\020'\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\006\032\0020\007ø\001\000¢\006\004\b(\020)J\023\020*\032\0020\n2\b\020+\032\004\030\0010\001H\002J\016\020,\032\0020-2\006\020.\032\0020\032J\016\020/\032\0020!2\006\020.\032\0020\032J\016\0200\032\0020!2\006\020.\032\0020\032J\026\0201\032\0020\0202\006\020.\032\0020\0322\006\0202\032\0020\nJ\016\0203\032\0020\0202\006\0204\032\0020\032J\016\0205\032\0020\0202\006\0204\032\0020\032J\030\0206\032\0020\0322\006\0204\032\0020\0322\b\b\002\0207\032\0020\nJ\016\0208\032\0020\0322\006\020.\032\0020\032J\016\0209\032\0020\0322\006\020:\032\0020\020J\016\020;\032\0020\0202\006\0204\032\0020\032J\016\020<\032\0020\0202\006\0204\032\0020\032J\016\020=\032\0020\0322\006\0204\032\0020\032J\016\020>\032\0020\0202\006\0204\032\0020\032J\030\020?\032\0020\0322\006\020@\032\0020Aø\001\000¢\006\004\bB\020CJ\016\020D\032\0020-2\006\020.\032\0020\032J\026\020E\032\0020F2\006\020G\032\0020\0322\006\020H\032\0020\032J\033\020I\032\0020J2\006\020.\032\0020\032ø\001\001ø\001\000¢\006\004\bK\020LJ\b\020M\032\0020\032H\026J\016\020N\032\0020\n2\006\0204\032\0020\032J\b\020O\032\0020PH\026R\021\020\t\032\0020\n8F¢\006\006\032\004\b\013\020\fR\021\020\r\032\0020\n8F¢\006\006\032\004\b\016\020\fR\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\n8F¢\006\006\032\004\b\024\020\fR\021\020\025\032\0020\020¢\006\b\n\000\032\004\b\026\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\027\020\030R\021\020\031\032\0020\0328F¢\006\006\032\004\b\033\020\034R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\035\020\036R\031\020\037\032\n\022\006\022\004\030\0010!0 ¢\006\b\n\000\032\004\b\"\020#R\031\020\006\032\0020\007ø\001\000ø\001\001¢\006\n\n\002\020&\032\004\b$\020%\002\013\n\005\b¡\0360\001\n\002\b!¨\006Q"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "layoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "multiParagraph", "Landroidx/compose/ui/text/MultiParagraph;", "size", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "didOverflowHeight", "", "getDidOverflowHeight", "()Z", "didOverflowWidth", "getDidOverflowWidth", "firstBaseline", "", "getFirstBaseline", "()F", "hasVisualOverflow", "getHasVisualOverflow", "lastBaseline", "getLastBaseline", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "lineCount", "", "getLineCount", "()I", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "getSize-YbymL2g", "()J", "J", "copy", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "equals", "other", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBaseline", "lineIndex", "getLineBottom", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "hashCode", "isLineEllipsized", "toString", "", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class TextLayoutResult
/*     */ {
/*     */   @NotNull
/*     */   private final TextLayoutInput layoutInput;
/*     */   @NotNull
/*     */   private final MultiParagraph multiParagraph;
/*     */   private final long size;
/*     */   private final float firstBaseline;
/*     */   private final float lastBaseline;
/*     */   @NotNull
/*     */   private final List<Rect> placeholderRects;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final TextLayoutInput getLayoutInput() {
/*     */     return this.layoutInput;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MultiParagraph getMultiParagraph() {
/*     */     return this.multiParagraph;
/*     */   }
/*     */   
/*     */   public final long getSize-YbymL2g() {
/*     */     return this.size;
/*     */   }
/*     */   
/*     */   public final float getFirstBaseline() {
/*     */     return this.firstBaseline;
/*     */   }
/*     */   
/*     */   private TextLayoutResult(TextLayoutInput layoutInput, MultiParagraph multiParagraph, long size) {
/* 312 */     this.layoutInput = layoutInput;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 319 */     this.multiParagraph = multiParagraph;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 324 */     this.size = size;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 329 */     this.firstBaseline = this.multiParagraph.getFirstBaseline();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 334 */     this.lastBaseline = this.multiParagraph.getLastBaseline();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 362 */     this.placeholderRects = this.multiParagraph.getPlaceholderRects(); } @NotNull public final List<Rect> getPlaceholderRects() { return this.placeholderRects; }
/*     */    public final float getLastBaseline() {
/*     */     return this.lastBaseline;
/*     */   }
/*     */   public final int getLineCount() {
/* 367 */     return this.multiParagraph.getLineCount();
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean getDidOverflowHeight() {
/*     */     return (this.multiParagraph.getDidExceedMaxLines() || IntSize.getHeight-impl(this.size) < this.multiParagraph.getHeight());
/*     */   }
/*     */   
/*     */   public final boolean getDidOverflowWidth() {
/*     */     return (IntSize.getWidth-impl(this.size) < this.multiParagraph.getWidth());
/*     */   }
/*     */   
/*     */   public final boolean getHasVisualOverflow() {
/*     */     return (getDidOverflowWidth() || getDidOverflowHeight());
/*     */   }
/*     */   
/*     */   public final int getLineStart(int lineIndex) {
/* 384 */     return this.multiParagraph.getLineStart(lineIndex);
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
/*     */   public final int getLineEnd(int lineIndex, boolean visibleEnd) {
/* 408 */     return this.multiParagraph.getLineEnd(lineIndex, visibleEnd);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean isLineEllipsized(int lineIndex) {
/* 416 */     return this.multiParagraph.isLineEllipsized(lineIndex);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getLineTop(int lineIndex) {
/* 424 */     return this.multiParagraph.getLineTop(lineIndex);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getLineBaseline(int lineIndex) {
/* 430 */     return this.multiParagraph.getLineBaseline(lineIndex);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getLineBottom(int lineIndex) {
/* 438 */     return this.multiParagraph.getLineBottom(lineIndex);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getLineLeft(int lineIndex) {
/* 446 */     return this.multiParagraph.getLineLeft(lineIndex);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final float getLineRight(int lineIndex) {
/* 454 */     return this.multiParagraph.getLineRight(lineIndex);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getLineForOffset(int offset) {
/* 465 */     return this.multiParagraph.getLineForOffset(offset);
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
/*     */   public final int getLineForVerticalPosition(float vertical) {
/* 477 */     return this.multiParagraph.getLineForVerticalPosition(vertical);
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
/*     */   public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
/* 498 */     return this.multiParagraph.getHorizontalPosition(offset, usePrimaryDirection);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ResolvedTextDirection getParagraphDirection(int offset) {
/* 507 */     return this.multiParagraph.getParagraphDirection(offset);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final ResolvedTextDirection getBidiRunDirection(int offset) {
/* 517 */     return this.multiParagraph.getBidiRunDirection(offset);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final int getOffsetForPosition-k-4lQ0M(long position) {
/* 526 */     return this.multiParagraph.getOffsetForPosition-k-4lQ0M(position);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Rect getBoundingBox(int offset) {
/* 534 */     return this.multiParagraph.getBoundingBox(offset);
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
/*     */   public final long getWordBoundary--jx7JFs(int offset) {
/* 546 */     return this.multiParagraph.getWordBoundary--jx7JFs(offset);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Rect getCursorRect(int offset) {
/* 554 */     return this.multiParagraph.getCursorRect(offset);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final Path getPathForRange(int start, int end) {
/* 563 */     return this.multiParagraph.getPathForRange(start, end);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TextLayoutResult copy-O0kMr_c(@NotNull TextLayoutInput layoutInput, long size) {
/* 569 */     Intrinsics.checkNotNullParameter(layoutInput, "layoutInput"); return new TextLayoutResult(
/* 570 */         layoutInput, 
/* 571 */         this.multiParagraph, 
/* 572 */         size, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 577 */     if (this == other) return true; 
/* 578 */     if (!(other instanceof TextLayoutResult)) return false;
/*     */     
/* 580 */     if (!Intrinsics.areEqual(this.layoutInput, ((TextLayoutResult)other).layoutInput)) return false; 
/* 581 */     if (!Intrinsics.areEqual(this.multiParagraph, ((TextLayoutResult)other).multiParagraph)) return false; 
/* 582 */     if (!IntSize.equals-impl0(this.size, ((TextLayoutResult)other).size)) return false; 
/* 583 */     if (!((this.firstBaseline == ((TextLayoutResult)other).firstBaseline) ? 1 : 0)) return false; 
/* 584 */     if (!((this.lastBaseline == ((TextLayoutResult)other).lastBaseline) ? 1 : 0)) return false; 
/* 585 */     if (!Intrinsics.areEqual(this.placeholderRects, ((TextLayoutResult)other).placeholderRects)) return false;
/*     */     
/* 587 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 591 */     int result = this.layoutInput.hashCode();
/* 592 */     result = 31 * result + this.multiParagraph.hashCode();
/* 593 */     result = 31 * result + IntSize.hashCode-impl(this.size);
/* 594 */     result = 31 * result + Float.hashCode(this.firstBaseline);
/* 595 */     result = 31 * result + Float.hashCode(this.lastBaseline);
/* 596 */     result = 31 * result + this.placeholderRects.hashCode();
/* 597 */     return result;
/*     */   }
/*     */   @NotNull
/*     */   public String toString() {
/* 601 */     return "TextLayoutResult(layoutInput=" + 
/* 602 */       this.layoutInput + ", multiParagraph=" + 
/* 603 */       this.multiParagraph + ", size=" + IntSize.toString-impl(
/* 604 */         this.size) + ", firstBaseline=" + 
/* 605 */       this.firstBaseline + ", lastBaseline=" + 
/* 606 */       this.lastBaseline + ", placeholderRects=" + 
/* 607 */       this.placeholderRects + ')';
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextLayoutResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */