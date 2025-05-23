/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.Alignment;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasureScope;
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\004\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\021\n\000\n\002\030\002\n\000\n\002\020\025\n\002\b\007\n\002\020\002\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\006\b\b\030\0002\0020\0012\0020\002B\025\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\b\032\0020\004HÂ\003J\t\020\t\032\0020\006HÂ\003J\035\020\n\032\0020\0002\b\b\002\020\003\032\0020\0042\b\b\002\020\005\032\0020\006HÆ\001J=\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0162\006\020\020\032\0020\0162\006\020\021\032\0020\0162\006\020\022\032\0020\023H\026ø\001\000ø\001\001¢\006\004\b\024\020\025J\023\020\026\032\0020\0232\b\020\027\032\004\030\0010\030HÖ\003J*\020\031\032\0020\0162\006\020\032\032\0020\0332\b\020\034\032\004\030\0010\0352\006\020\036\032\0020\0162\006\020\037\032\0020\016H\002J\t\020 \032\0020\016HÖ\001Jg\020!\032\0020\"2\016\020#\032\n\022\006\022\004\030\0010\0330$2\006\020%\032\0020&2\006\020\037\032\0020\0162\006\020'\032\0020(2\006\020)\032\0020\0162\006\020\036\032\0020\0162\b\020*\032\004\030\0010(2\006\020+\032\0020\0162\006\020,\032\0020\0162\006\020-\032\0020\016H\026¢\006\002\020.J(\020/\032\002002\006\020)\032\0020\0162\006\0201\032\0020(2\006\020'\032\0020(2\006\020%\032\0020&H\026J\t\0202\032\00203HÖ\001J\f\0204\032\0020\016*\0020\033H\026J\f\0205\032\0020\016*\0020\033H\026J\"\0206\032\0020\016*\002072\f\0208\032\b\022\004\022\0020:092\006\020;\032\0020\016H\026J\"\020<\032\0020\016*\002072\f\0208\032\b\022\004\022\0020:092\006\020=\032\0020\016H\026J,\020>\032\0020\"*\0020&2\f\0208\032\b\022\004\022\0020?092\006\020@\032\0020\fH\026ø\001\001¢\006\004\bA\020BJ\"\020C\032\0020\016*\002072\f\0208\032\b\022\004\022\0020:092\006\020;\032\0020\016H\026J\"\020D\032\0020\016*\002072\f\0208\032\b\022\004\022\0020:092\006\020=\032\0020\016H\026R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000\002\013\n\002\b!\n\005\b¡\0360\001¨\006E"}, d2 = {"Landroidx/compose/foundation/layout/RowMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V", "component1", "component2", "copy", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "isPrioritizing", "", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "equals", "other", "", "getCrossAxisPosition", "placeable", "Landroidx/compose/ui/layout/Placeable;", "parentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "hashCode", "placeHelper", "Landroidx/compose/ui/layout/MeasureResult;", "placeables", "", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "mainAxisPositions", "", "mainAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "populateMainAxisPositions", "", "childrenMainAxisSize", "toString", "", "crossAxisSize", "mainAxisSize", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class RowMeasurePolicy
/*     */   implements MeasurePolicy, RowColumnMeasurePolicy
/*     */ {
/*     */   @NotNull
/*     */   private final Arrangement.Horizontal horizontalArrangement;
/*     */   @NotNull
/*     */   private final Alignment.Vertical verticalAlignment;
/*     */   public static final int $stable;
/*     */   
/*     */   public RowMeasurePolicy(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Alignment.Vertical verticalAlignment) {
/* 135 */     this.horizontalArrangement = horizontalArrangement;
/* 136 */     this.verticalAlignment = verticalAlignment;
/*     */   }
/*     */   
/* 139 */   public int mainAxisSize(@NotNull Placeable $this$mainAxisSize) { Intrinsics.checkNotNullParameter($this$mainAxisSize, "<this>"); return $this$mainAxisSize.getWidth(); } public int crossAxisSize(@NotNull Placeable $this$crossAxisSize) {
/* 140 */     Intrinsics.checkNotNullParameter($this$crossAxisSize, "<this>"); return $this$crossAxisSize.getHeight();
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public MeasureResult measure-3p2s80s(@NotNull MeasureScope $this$measure_u2d3p2s80s, @NotNull List measurables, long constraints) {
/* 146 */     Intrinsics.checkNotNullParameter($this$measure_u2d3p2s80s, "$this$measure"); Intrinsics.checkNotNullParameter(measurables, "measurables"); return RowColumnMeasurePolicyKt.measure$default(this, 
/* 147 */         Constraints.getMinWidth-impl(constraints), 
/* 148 */         Constraints.getMinHeight-impl(constraints), 
/* 149 */         Constraints.getMaxWidth-impl(constraints), 
/* 150 */         Constraints.getMaxHeight-impl(constraints), 
/* 151 */         $this$measure_u2d3p2s80s.roundToPx-0680j_4(this.horizontalArrangement.getSpacing-D9Ej5fM()), 
/* 152 */         $this$measure_u2d3p2s80s, 
/* 153 */         measurables, 
/* 154 */         new Placeable[measurables.size()], 
/* 155 */         0, 
/* 156 */         measurables.size(), null, 0, 3072, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void populateMainAxisPositions(int mainAxisLayoutSize, @NotNull int[] childrenMainAxisSize, @NotNull int[] mainAxisPositions, @NotNull MeasureScope measureScope) {
/* 166 */     Intrinsics.checkNotNullParameter(childrenMainAxisSize, "childrenMainAxisSize"); Intrinsics.checkNotNullParameter(mainAxisPositions, "mainAxisPositions"); Intrinsics.checkNotNullParameter(measureScope, "measureScope"); Arrangement.Horizontal $this$populateMainAxisPositions_u24lambda_u240 = this.horizontalArrangement; int $i$a$-with-RowMeasurePolicy$populateMainAxisPositions$1 = 0;
/* 167 */     $this$populateMainAxisPositions_u24lambda_u240.arrange((Density)measureScope, 
/* 168 */         mainAxisLayoutSize, 
/* 169 */         childrenMainAxisSize, 
/* 170 */         measureScope.getLayoutDirection(), 
/* 171 */         mainAxisPositions);
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
/*     */   @NotNull
/*     */   public MeasureResult placeHelper(@NotNull Placeable[] placeables, @NotNull MeasureScope measureScope, int beforeCrossAxisAlignmentLine, @NotNull int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, @Nullable int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
/* 188 */     Intrinsics.checkNotNullParameter(placeables, "placeables"); Intrinsics.checkNotNullParameter(measureScope, "measureScope"); Intrinsics.checkNotNullParameter(mainAxisPositions, "mainAxisPositions"); MeasureScope $this$placeHelper_u24lambda_u241 = measureScope; int $i$a$-with-RowMeasurePolicy$placeHelper$1 = 0; return 
/* 189 */       MeasureScope.layout$default($this$placeHelper_u24lambda_u241, mainAxisLayoutSize, crossAxisLayoutSize, null, new RowMeasurePolicy$placeHelper$1$1(this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, mainAxisPositions), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}) @SourceDebugExtension({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowMeasurePolicy$placeHelper$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,429:1\n13374#2,3:430\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowMeasurePolicy$placeHelper$1$1\n*L\n190#1:430,3\n*E\n"})
/* 190 */   static final class RowMeasurePolicy$placeHelper$1$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); Placeable[] arrayOfPlaceable = this.$placeables; RowMeasurePolicy rowMeasurePolicy = RowMeasurePolicy.this; int i = this.$crossAxisLayoutSize, j = this.$beforeCrossAxisAlignmentLine, arrayOfInt[] = this.$mainAxisPositions, $i$f$forEachIndexed = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 430 */       int index$iv = 0;
/* 431 */       byte b = 0; int k = arrayOfPlaceable.length; if (b < k) { Object item$iv = arrayOfPlaceable[b], object1 = item$iv; int m = index$iv++, $i$a$-forEachIndexed-RowMeasurePolicy$placeHelper$1$1$1 = 0;
/*     */         Intrinsics.checkNotNull(object1); }
/*     */        }
/*     */ 
/*     */     
/*     */     RowMeasurePolicy$placeHelper$1$1(RowMeasurePolicy $receiver, int $crossAxisLayoutSize, int $beforeCrossAxisAlignmentLine, int[] $mainAxisPositions) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */   
/*     */   public long createConstraints-xF2OJ5Q(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
/*     */     return RowKt.createRowConstraints(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
/*     */   }
/*     */   
/*     */   private final int getCrossAxisPosition(Placeable placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine) {
/*     */     CrossAxisAlignment childCrossAlignment = (parentData != null) ? parentData.getCrossAxisAlignment() : null;
/*     */     return (childCrossAlignment != null) ? childCrossAlignment.align$foundation_layout(crossAxisLayoutSize - placeable.getHeight(), LayoutDirection.Ltr, placeable, beforeCrossAxisAlignmentLine) : this.verticalAlignment.align(0, crossAxisLayoutSize - placeable.getHeight());
/*     */   }
/*     */   
/*     */   public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$minIntrinsicWidth, @NotNull List<? extends IntrinsicMeasurable> measurables, int height) {
/*     */     Intrinsics.checkNotNullParameter($this$minIntrinsicWidth, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinWidth(measurables, height, $this$minIntrinsicWidth.roundToPx-0680j_4(this.horizontalArrangement.getSpacing-D9Ej5fM()));
/*     */   }
/*     */   
/*     */   public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$minIntrinsicHeight, @NotNull List<? extends IntrinsicMeasurable> measurables, int width) {
/*     */     Intrinsics.checkNotNullParameter($this$minIntrinsicHeight, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     return IntrinsicMeasureBlocks.INSTANCE.HorizontalMinHeight(measurables, width, $this$minIntrinsicHeight.roundToPx-0680j_4(this.horizontalArrangement.getSpacing-D9Ej5fM()));
/*     */   }
/*     */   
/*     */   public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope $this$maxIntrinsicWidth, @NotNull List<? extends IntrinsicMeasurable> measurables, int height) {
/*     */     Intrinsics.checkNotNullParameter($this$maxIntrinsicWidth, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxWidth(measurables, height, $this$maxIntrinsicWidth.roundToPx-0680j_4(this.horizontalArrangement.getSpacing-D9Ej5fM()));
/*     */   }
/*     */   
/*     */   public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope $this$maxIntrinsicHeight, @NotNull List<? extends IntrinsicMeasurable> measurables, int width) {
/*     */     Intrinsics.checkNotNullParameter($this$maxIntrinsicHeight, "<this>");
/*     */     Intrinsics.checkNotNullParameter(measurables, "measurables");
/*     */     return IntrinsicMeasureBlocks.INSTANCE.HorizontalMaxHeight(measurables, width, $this$maxIntrinsicHeight.roundToPx-0680j_4(this.horizontalArrangement.getSpacing-D9Ej5fM()));
/*     */   }
/*     */   
/*     */   private final Arrangement.Horizontal component1() {
/*     */     return this.horizontalArrangement;
/*     */   }
/*     */   
/*     */   private final Alignment.Vertical component2() {
/*     */     return this.verticalAlignment;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RowMeasurePolicy copy(@NotNull Arrangement.Horizontal horizontalArrangement, @NotNull Alignment.Vertical verticalAlignment) {
/*     */     Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
/*     */     Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
/*     */     return new RowMeasurePolicy(horizontalArrangement, verticalAlignment);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.horizontalArrangement.hashCode();
/*     */     return result * 31 + this.verticalAlignment.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof RowMeasurePolicy))
/*     */       return false; 
/*     */     RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy)other;
/*     */     return !Intrinsics.areEqual(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) ? false : (!!Intrinsics.areEqual(this.verticalAlignment, rowMeasurePolicy.verticalAlignment));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\RowMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */