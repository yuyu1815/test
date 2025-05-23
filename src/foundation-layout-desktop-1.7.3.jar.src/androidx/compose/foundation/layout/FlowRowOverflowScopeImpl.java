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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\002\n\002\020\013\n\000\b\000\030\0002\0020\0012\0020\002B\r\022\006\020\003\032\0020\004¢\006\002\020\005J\025\020\f\032\0020\r*\0020\r2\006\020\016\032\0020\017H\001J!\020\020\032\0020\r*\0020\r2\022\020\021\032\016\022\004\022\0020\023\022\004\022\0020\0070\022H\001J\025\020\020\032\0020\r*\0020\r2\006\020\024\032\0020\025H\001J\r\020\026\032\0020\r*\0020\rH\001J\027\020\027\032\0020\r*\0020\r2\b\b\003\020\030\032\0020\031H\001J\037\020\032\032\0020\r*\0020\r2\b\b\001\020\032\032\0020\0312\006\020\033\032\0020\034H\001R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tR\016\020\003\032\0020\004X\004¢\006\002\n\000R\024\020\n\032\0020\0078VX\004¢\006\006\032\004\b\013\020\t¨\006\035"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowOverflowScopeImpl;", "Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/FlowRowOverflowScope;", "state", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;)V", "shownItemCount", "", "getShownItemCount", "()I", "totalItemCount", "getTotalItemCount", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "fillMaxRowHeight", "fraction", "", "weight", "fill", "", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class FlowRowOverflowScopeImpl
/*     */   implements FlowRowScope, FlowRowOverflowScope
/*     */ {
/*     */   @NotNull
/*     */   private final FlowLayoutOverflowState state;
/*     */   public static final int $stable;
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
/*     */   
/*     */   public FlowRowOverflowScopeImpl(@NotNull FlowLayoutOverflowState state) {
/* 294 */     this.state = state;
/* 295 */     this.$$delegate_0 = FlowRowScopeInstance.INSTANCE;
/*     */   } public int getTotalItemCount() {
/* 297 */     return this.state.getItemCount$foundation_layout();
/*     */   }
/*     */   public int getShownItemCount() {
/* 300 */     return this.state.getNoOfItemsShown$foundation_layout();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowRowOverflowScopeImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */