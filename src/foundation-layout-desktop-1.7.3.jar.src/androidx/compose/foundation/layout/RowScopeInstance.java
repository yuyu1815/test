/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.Modifier;
/*     */ import androidx.compose.ui.layout.AlignmentLine;
/*     */ import androidx.compose.ui.layout.AlignmentLineKt;
/*     */ import androidx.compose.ui.layout.HorizontalAlignmentLine;
/*     */ import androidx.compose.ui.layout.Measured;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.ranges.RangesKt;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\020\013\n\000\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\024\020\003\032\0020\004*\0020\0042\006\020\005\032\0020\006H\027J \020\007\032\0020\004*\0020\0042\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\tH\026J\024\020\007\032\0020\004*\0020\0042\006\020\f\032\0020\rH\027J\f\020\016\032\0020\004*\0020\004H\027J\034\020\017\032\0020\004*\0020\0042\006\020\017\032\0020\0202\006\020\021\032\0020\022H\027¨\006\023"}, d2 = {"Landroidx/compose/foundation/layout/RowScopeInstance;", "Landroidx/compose/foundation/layout/RowScope;", "()V", "align", "Landroidx/compose/ui/Modifier;", "alignment", "Landroidx/compose/ui/Alignment$Vertical;", "alignBy", "alignmentLineBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Measured;", "", "alignmentLine", "Landroidx/compose/ui/layout/HorizontalAlignmentLine;", "alignByBaseline", "weight", "", "fill", "", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
/*     */ public final class RowScopeInstance
/*     */   implements RowScope
/*     */ {
/*     */   @NotNull
/*     */   public static final RowScopeInstance INSTANCE = new RowScopeInstance();
/*     */   public static final int $stable;
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier weight(@NotNull Modifier $this$weight, float weight, boolean fill) {
/* 396 */     Intrinsics.checkNotNullParameter($this$weight, "<this>"); if (!((weight > 0.0D) ? 1 : 0)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 430 */       int $i$a$-require-RowScopeInstance$weight$1 = 0;
/*     */       String str = "invalid weight " + weight + "; must be greater than zero";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return $this$weight.then((Modifier)new LayoutWeightElement(RangesKt.coerceAtMost(weight, Float.MAX_VALUE), fill));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier align(@NotNull Modifier $this$align, @NotNull Alignment.Vertical alignment) {
/*     */     Intrinsics.checkNotNullParameter($this$align, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignment, "alignment");
/*     */     return $this$align.then((Modifier)new VerticalAlignElement(alignment));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier alignBy(@NotNull Modifier $this$alignBy, @NotNull HorizontalAlignmentLine alignmentLine) {
/*     */     Intrinsics.checkNotNullParameter($this$alignBy, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
/*     */     return $this$alignBy.then((Modifier)new WithAlignmentLineElement((AlignmentLine)alignmentLine));
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public Modifier alignByBaseline(@NotNull Modifier $this$alignByBaseline) {
/*     */     Intrinsics.checkNotNullParameter($this$alignByBaseline, "<this>");
/*     */     return alignBy($this$alignByBaseline, AlignmentLineKt.getFirstBaseline());
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public Modifier alignBy(@NotNull Modifier $this$alignBy, @NotNull Function1<? super Measured, Integer> alignmentLineBlock) {
/*     */     Intrinsics.checkNotNullParameter($this$alignBy, "<this>");
/*     */     Intrinsics.checkNotNullParameter(alignmentLineBlock, "alignmentLineBlock");
/*     */     return $this$alignBy.then((Modifier)new WithAlignmentLineBlockElement(alignmentLineBlock));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\RowScopeInstance.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */