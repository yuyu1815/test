/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.annotation.FloatRange;
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.HorizontalAlignmentLine;
/*     */ import androidx.compose.ui.layout.Measured;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\002\n\002\020\013\n\000\b\000\030\0002\0020\0012\0020\002B%\022\006\020\003\032\0020\004\022\006\020\005\032\0020\004\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007¢\006\002\020\tJ\025\020\021\032\0020\022*\0020\0222\006\020\023\032\0020\024H\001J!\020\025\032\0020\022*\0020\0222\022\020\026\032\016\022\004\022\0020\030\022\004\022\0020\0040\027H\001J\025\020\025\032\0020\022*\0020\0222\006\020\031\032\0020\032H\001J\r\020\033\032\0020\022*\0020\022H\001J\027\020\034\032\0020\022*\0020\0222\b\b\003\020\035\032\0020\036H\001J\037\020\037\032\0020\022*\0020\0222\b\b\001\020\037\032\0020\0362\006\020 \032\0020!H\001R\024\020\005\032\0020\004X\004¢\006\b\n\000\032\004\b\n\020\013R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\f\020\013R\034\020\b\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\017\032\004\b\r\020\016R\034\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\n\n\002\020\017\032\004\b\020\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006\""}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "lineIndex", "", "indexInLine", "maxWidthInLine", "Landroidx/compose/ui/unit/Dp;", "maxHeight", "(IIFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getIndexInLine", "()I", "getLineIndex", "getMaxHeight-D9Ej5fM", "()F", "F", "getMaxWidthInLine-D9Ej5fM", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "fillMaxRowHeight", "fraction", "", "weight", "fill", "", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class ContextualFlowRowScopeImpl
/*     */   implements FlowRowScope, ContextualFlowRowScope
/*     */ {
/*     */   private final int lineIndex;
/*     */   private final int indexInLine;
/*     */   private final float maxWidthInLine;
/*     */   private final float maxHeight;
/*     */   public static final int $stable;
/*     */   
/*     */   private ContextualFlowRowScopeImpl(int lineIndex, int indexInLine, float maxWidthInLine, float maxHeight) {
/* 306 */     this.lineIndex = lineIndex;
/* 307 */     this.indexInLine = indexInLine;
/* 308 */     this.maxWidthInLine = maxWidthInLine;
/* 309 */     this.maxHeight = maxHeight;
/* 310 */     this.$$delegate_0 = FlowRowScopeInstance.INSTANCE;
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
/*     */   public float getMaxWidthInLine-D9Ej5fM() {
/*     */     return this.maxWidthInLine;
/*     */   }
/*     */   
/*     */   public float getMaxHeight-D9Ej5fM() {
/*     */     return this.maxHeight;
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier align(@NotNull Modifier $this$align, @NotNull Alignment.Vertical alignment) {
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
/*     */   public Modifier alignBy(@NotNull Modifier $this$alignBy, @NotNull HorizontalAlignmentLine alignmentLine) {
/*     */     Intrinsics.checkNotNullParameter($this$alignBy, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
/*     */     return this.$$delegate_0.alignBy($this$alignBy, alignmentLine);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier alignByBaseline(@NotNull Modifier $this$alignByBaseline) {
/*     */     Intrinsics.checkNotNullParameter($this$alignByBaseline, "<this>");
/*     */     return this.$$delegate_0.alignByBaseline($this$alignByBaseline);
/*     */   }
/*     */   
/*     */   @ExperimentalLayoutApi
/*     */   @NotNull
/*     */   public Modifier fillMaxRowHeight(@NotNull Modifier $this$fillMaxRowHeight, @FloatRange(from = 0.0D, to = 1.0D) float fraction) {
/*     */     Intrinsics.checkNotNullParameter($this$fillMaxRowHeight, "<this>");
/*     */     return this.$$delegate_0.fillMaxRowHeight($this$fillMaxRowHeight, fraction);
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier weight(@NotNull Modifier $this$weight, @FloatRange(from = 0.0D, fromInclusive = false) float weight, boolean fill) {
/*     */     Intrinsics.checkNotNullParameter($this$weight, "<this>");
/*     */     return this.$$delegate_0.weight($this$weight, weight, fill);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\ContextualFlowRowScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */