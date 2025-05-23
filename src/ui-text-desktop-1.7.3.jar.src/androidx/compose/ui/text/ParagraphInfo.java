/*      */ package androidx.compose.ui.text;
/*      */ 
/*      */ import androidx.compose.runtime.internal.StabilityInferred;
/*      */ import androidx.compose.ui.geometry.Offset;
/*      */ import androidx.compose.ui.geometry.OffsetKt;
/*      */ import androidx.compose.ui.geometry.Rect;
/*      */ import androidx.compose.ui.graphics.Path;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.ranges.RangesKt;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\007\n\002\b\035\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\006\b\b\030\0002\0020\001BE\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\b\b\002\020\007\032\0020\005\022\b\b\002\020\b\032\0020\005\022\b\b\002\020\t\032\0020\n\022\b\b\002\020\013\032\0020\n¢\006\002\020\fJ\t\020\037\032\0020\003HÆ\003J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\005HÆ\003J\t\020\"\032\0020\005HÆ\003J\t\020#\032\0020\005HÆ\003J\t\020$\032\0020\nHÆ\003J\t\020%\032\0020\nHÆ\003JO\020&\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\0052\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\nHÆ\001J\023\020'\032\0020(2\b\020)\032\004\030\0010\001HÖ\003J\t\020*\032\0020\005HÖ\001J\t\020+\032\0020,HÖ\001J\n\020-\032\0020.*\0020.J\n\020-\032\0020/*\0020/J\036\020-\032\00200*\002002\b\b\002\0201\032\0020(ø\001\000¢\006\004\b2\0203J\n\0204\032\0020\005*\0020\005J\n\0205\032\0020\005*\0020\005J\n\0206\032\0020\n*\0020\nJ\024\0207\032\00208*\00208ø\001\000¢\006\004\b9\020:J\n\0207\032\0020.*\0020.J\n\020;\032\0020\005*\0020\005J\n\020<\032\0020\005*\0020\005J\n\020=\032\0020\n*\0020\nR\032\020\013\032\0020\nX\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\021\020\022R\032\020\b\032\0020\005X\016¢\006\016\n\000\032\004\b\023\020\022\"\004\b\024\020\025R\021\020\026\032\0020\0058F¢\006\006\032\004\b\027\020\022R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\030\020\031R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\032\020\022R\032\020\007\032\0020\005X\016¢\006\016\n\000\032\004\b\033\020\022\"\004\b\034\020\025R\032\020\t\032\0020\nX\016¢\006\016\n\000\032\004\b\035\020\016\"\004\b\036\020\020\002\007\n\005\b¡\0360\001¨\006>"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "startIndex", "", "endIndex", "startLineIndex", "endLineIndex", "top", "", "bottom", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "getBottom", "()F", "setBottom", "(F)V", "getEndIndex", "()I", "getEndLineIndex", "setEndLineIndex", "(I)V", "length", "getLength", "getParagraph", "()Landroidx/compose/ui/text/Paragraph;", "getStartIndex", "getStartLineIndex", "setStartLineIndex", "getTop", "setTop", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "toGlobal", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "treatZeroAsNull", "toGlobal-xdX6-G0", "(JZ)J", "toGlobalIndex", "toGlobalLineIndex", "toGlobalYPosition", "toLocal", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "(J)J", "toLocalIndex", "toLocalLineIndex", "toLocalYPosition", "ui-text"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ public final class ParagraphInfo
/*      */ {
/*      */   @NotNull
/*      */   private final Paragraph paragraph;
/*      */   private final int startIndex;
/*      */   private final int endIndex;
/*      */   private int startLineIndex;
/*      */   private int endLineIndex;
/*      */   private float top;
/*      */   private float bottom;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   @NotNull
/*      */   public final Paragraph getParagraph() {
/*      */     return this.paragraph;
/*      */   }
/*      */   
/*      */   public final int getStartIndex() {
/*      */     return this.startIndex;
/*      */   }
/*      */   
/*      */   public final int getEndIndex() {
/*      */     return this.endIndex;
/*      */   }
/*      */   
/*      */   public final int getStartLineIndex() {
/*      */     return this.startLineIndex;
/*      */   }
/*      */   
/*      */   public final void setStartLineIndex(int <set-?>) {
/*      */     this.startLineIndex = <set-?>;
/*      */   }
/*      */   
/*      */   public final int getEndLineIndex() {
/*      */     return this.endLineIndex;
/*      */   }
/*      */   
/*      */   public final void setEndLineIndex(int <set-?>) {
/*      */     this.endLineIndex = <set-?>;
/*      */   }
/*      */   
/*      */   public final float getTop() {
/*      */     return this.top;
/*      */   }
/*      */   
/*      */   public final void setTop(float <set-?>) {
/*      */     this.top = <set-?>;
/*      */   }
/*      */   
/*      */   public ParagraphInfo(@NotNull Paragraph paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
/* 1035 */     this.paragraph = paragraph;
/* 1036 */     this.startIndex = startIndex;
/* 1037 */     this.endIndex = endIndex;
/* 1038 */     this.startLineIndex = startLineIndex;
/* 1039 */     this.endLineIndex = endLineIndex;
/* 1040 */     this.top = top;
/* 1041 */     this.bottom = bottom; } public final float getBottom() { return this.bottom; } public final void setBottom(float <set-?>) { this.bottom = <set-?>; }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getLength() {
/* 1048 */     return this.endIndex - this.startIndex;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final int toLocalIndex(int $this$toLocalIndex) {
/* 1054 */     return RangesKt.coerceIn($this$toLocalIndex, this.startIndex, this.endIndex) - this.startIndex;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int toGlobalIndex(int $this$toGlobalIndex) {
/* 1061 */     return $this$toGlobalIndex + this.startIndex;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int toLocalLineIndex(int $this$toLocalLineIndex) {
/* 1070 */     return $this$toLocalLineIndex - this.startLineIndex;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int toGlobalLineIndex(int $this$toGlobalLineIndex) {
/* 1078 */     return $this$toGlobalLineIndex + this.startLineIndex;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final float toGlobalYPosition(float $this$toGlobalYPosition) {
/* 1086 */     return $this$toGlobalYPosition + this.top;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final float toLocalYPosition(float $this$toLocalYPosition) {
/* 1094 */     return $this$toLocalYPosition - this.top;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long toLocal-MK-Hz9U(long $this$toLocal_u2dMK_u2dHz9U) {
/* 1102 */     return OffsetKt.Offset(Offset.getX-impl($this$toLocal_u2dMK_u2dHz9U), Offset.getY-impl($this$toLocal_u2dMK_u2dHz9U) - this.top);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final Rect toGlobal(@NotNull Rect $this$toGlobal) {
/* 1110 */     Intrinsics.checkNotNullParameter($this$toGlobal, "<this>"); return $this$toGlobal.translate-k-4lQ0M(OffsetKt.Offset(0.0F, this.top));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final Rect toLocal(@NotNull Rect $this$toLocal) {
/* 1118 */     Intrinsics.checkNotNullParameter($this$toLocal, "<this>"); return $this$toLocal.translate-k-4lQ0M(OffsetKt.Offset(0.0F, -this.top));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final Path toGlobal(@NotNull Path $this$toGlobal) {
/* 1128 */     Intrinsics.checkNotNullParameter($this$toGlobal, "<this>"); $this$toGlobal.translate-k-4lQ0M(OffsetKt.Offset(0.0F, this.top));
/* 1129 */     return $this$toGlobal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final long toGlobal-xdX6-G0(long $this$toGlobal_u2dxdX6_u2dG0, boolean treatZeroAsNull) {
/* 1139 */     if (treatZeroAsNull && TextRange.equals-impl0($this$toGlobal_u2dxdX6_u2dG0, TextRange.Companion.getZero-d9O1mEE())) {
/* 1140 */       return TextRange.Companion.getZero-d9O1mEE();
/*      */     }
/* 1142 */     return TextRangeKt.TextRange(toGlobalIndex(TextRange.getStart-impl($this$toGlobal_u2dxdX6_u2dG0)), toGlobalIndex(TextRange.getEnd-impl($this$toGlobal_u2dxdX6_u2dG0)));
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final Paragraph component1() {
/*      */     return this.paragraph;
/*      */   }
/*      */   
/*      */   public final int component2() {
/*      */     return this.startIndex;
/*      */   }
/*      */   
/*      */   public final int component3() {
/*      */     return this.endIndex;
/*      */   }
/*      */   
/*      */   public final int component4() {
/*      */     return this.startLineIndex;
/*      */   }
/*      */   
/*      */   public final int component5() {
/*      */     return this.endLineIndex;
/*      */   }
/*      */   
/*      */   public final float component6() {
/*      */     return this.top;
/*      */   }
/*      */   
/*      */   public final float component7() {
/*      */     return this.bottom;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final ParagraphInfo copy(@NotNull Paragraph paragraph, int startIndex, int endIndex, int startLineIndex, int endLineIndex, float top, float bottom) {
/*      */     Intrinsics.checkNotNullParameter(paragraph, "paragraph");
/*      */     return new ParagraphInfo(paragraph, startIndex, endIndex, startLineIndex, endLineIndex, top, bottom);
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public String toString() {
/*      */     return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
/*      */   }
/*      */   
/*      */   public int hashCode() {
/*      */     result = this.paragraph.hashCode();
/*      */     result = result * 31 + Integer.hashCode(this.startIndex);
/*      */     result = result * 31 + Integer.hashCode(this.endIndex);
/*      */     result = result * 31 + Integer.hashCode(this.startLineIndex);
/*      */     result = result * 31 + Integer.hashCode(this.endLineIndex);
/*      */     result = result * 31 + Float.hashCode(this.top);
/*      */     return result * 31 + Float.hashCode(this.bottom);
/*      */   }
/*      */   
/*      */   public boolean equals(@Nullable Object other) {
/*      */     if (this == other)
/*      */       return true; 
/*      */     if (!(other instanceof ParagraphInfo))
/*      */       return false; 
/*      */     ParagraphInfo paragraphInfo = (ParagraphInfo)other;
/*      */     return !Intrinsics.areEqual(this.paragraph, paragraphInfo.paragraph) ? false : ((this.startIndex != paragraphInfo.startIndex) ? false : ((this.endIndex != paragraphInfo.endIndex) ? false : ((this.startLineIndex != paragraphInfo.startLineIndex) ? false : ((this.endLineIndex != paragraphInfo.endLineIndex) ? false : ((Float.compare(this.top, paragraphInfo.top) != 0) ? false : (!(Float.compare(this.bottom, paragraphInfo.bottom) != 0)))))));
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\ParagraphInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */