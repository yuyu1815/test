/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.annotation.FloatRange;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.Measured;
/*     */ import androidx.compose.ui.layout.VerticalAlignmentLine;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\002\b\002\n\002\020\013\n\000\b\000\030\0002\0020\0012\0020\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\002\020\tJ\025\020\021\032\0020\022*\0020\0222\006\020\023\032\0020\024H\001J!\020\025\032\0020\022*\0020\0222\022\020\026\032\016\022\004\022\0020\030\022\004\022\0020\0040\027H\001J\025\020\025\032\0020\022*\0020\0222\006\020\031\032\0020\032H\001J\027\020\033\032\0020\022*\0020\0222\b\b\003\020\034\032\0020\035H\001J\037\020\036\032\0020\022*\0020\0222\b\b\001\020\036\032\0020\0352\006\020\037\032\0020 H\001R\024\020\005\032\0020\004X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\f\020\013R\034\020\b\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\017\032\004\b\r\020\016R\034\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\017\032\004\b\020\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006!"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;", "Landroidx/compose/foundation/layout/FlowColumnScope;", "Landroidx/compose/foundation/layout/ContextualFlowColumnScope;", "lineIndex", "", "indexInLine", "maxWidth", "Landroidx/compose/ui/unit/Dp;", "maxHeightInLine", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndexInLine", "()I", "getLineIndex", "getMaxHeightInLine-D9Ej5fM", "()F", "F", "getMaxWidth-D9Ej5fM", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Horizontal;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "alignmentLine", "Landroidx/compose/ui/layout/VerticalAlignmentLine;", "fillMaxColumnWidth", "fraction", "", "weight", "fill", "", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ContextualFlowColumnScopeImpl
/*     */   implements FlowColumnScope, ContextualFlowColumnScope
/*     */ {
/*     */   private final int lineIndex;
/*     */   private final int indexInLine;
/*     */   private final float maxWidth;
/*     */   private final float maxHeightInLine;
/*     */   public static final int $stable;
/*     */   
/*     */   private ContextualFlowColumnScopeImpl(int lineIndex, int indexInLine, float maxWidth, float maxHeightInLine) {
/* 314 */     this.lineIndex = lineIndex;
/* 315 */     this.indexInLine = indexInLine;
/* 316 */     this.maxWidth = maxWidth;
/* 317 */     this.maxHeightInLine = maxHeightInLine;
/* 318 */     this.$$delegate_0 = FlowColumnScopeInstance.INSTANCE;
/*     */   }
/*     */   
/*     */   public int getLineIndex() {
/*     */     return this.lineIndex;
/*     */   }
/*     */   
/*     */   public int getIndexInLine() {
/*     */     return this.indexInLine;
/*     */   }
/*     */   
/*     */   public float getMaxWidth-D9Ej5fM() {
/*     */     return this.maxWidth;
/*     */   }
/*     */   
/*     */   public float getMaxHeightInLine-D9Ej5fM() {
/*     */     return this.maxHeightInLine;
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier align(@NotNull Modifier $this$align, @NotNull Alignment.Horizontal alignment) {
/*     */     Intrinsics.checkNotNullParameter($this$align, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     return this.$$delegate_0.align($this$align, alignment);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier alignBy(@NotNull Modifier $this$alignBy, @NotNull Function1<? super Measured, Integer> alignmentLineBlock) {
/*     */     Intrinsics.checkNotNullParameter($this$alignBy, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
/*     */     return this.$$delegate_0.alignBy($this$alignBy, alignmentLineBlock);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier alignBy(@NotNull Modifier $this$alignBy, @NotNull VerticalAlignmentLine alignmentLine) {
/*     */     Intrinsics.checkNotNullParameter($this$alignBy, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
/*     */     return this.$$delegate_0.alignBy($this$alignBy, alignmentLine);
/*     */   }
/*     */   
/*     */   @ExperimentalLayoutApi
/*     */   @NotNull
/*     */   public Modifier fillMaxColumnWidth(@NotNull Modifier $this$fillMaxColumnWidth, @FloatRange(from = 0.0D, to = 1.0D) float fraction) {
/*     */     Intrinsics.checkNotNullParameter($this$fillMaxColumnWidth, "<this>");
/*     */     return this.$$delegate_0.fillMaxColumnWidth($this$fillMaxColumnWidth, fraction);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier weight(@NotNull Modifier $this$weight, @FloatRange(from = 0.0D, fromInclusive = false) float weight, boolean fill) {
/*     */     Intrinsics.checkNotNullParameter($this$weight, "<this>");
/*     */     return this.$$delegate_0.weight($this$weight, weight, fill);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\ContextualFlowColumnScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */