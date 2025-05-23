/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\b\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\000\n\002\030\002\n\000\n\002\020\025\n\002\b\007\n\002\020\002\n\002\b\004\b`\030\0002\0020\001J=\020\021\032\0020\0222\006\020\023\032\0020\0242\006\020\025\032\0020\0242\006\020\026\032\0020\0242\006\020\027\032\0020\0242\006\020\030\032\0020\013H\026ø\001\000ø\001\001¢\006\004\b\031\020\032J2\020\033\032\0020\0242\006\020\034\032\0020\0352\b\020\036\032\004\030\0010\0372\006\020 \032\0020\0242\006\020!\032\0020\"2\006\020#\032\0020\024H\026Jg\020$\032\0020%2\016\020&\032\n\022\006\022\004\030\0010\0350'2\006\020(\032\0020)2\006\020#\032\0020\0242\006\020*\032\0020+2\006\020,\032\0020\0242\006\020 \032\0020\0242\b\020-\032\004\030\0010+2\006\020.\032\0020\0242\006\020/\032\0020\0242\006\0200\032\0020\024H\026¢\006\002\0201J(\0202\032\002032\006\020,\032\0020\0242\006\0204\032\0020+2\006\020*\032\0020+2\006\020(\032\0020)H\026J\f\0205\032\0020\024*\0020\035H\026J\f\0206\032\0020\024*\0020\035H\026R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\013X¦\004¢\006\006\032\004\b\n\020\fR\022\020\r\032\0020\016X¦\004¢\006\006\032\004\b\017\020\020ø\001\002\002\021\n\002\b!\n\005\b¡\0360\001\n\004\b!0\001¨\0067À\006\001"}, d2 = {"Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "crossAxisAlignment", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "getCrossAxisAlignment", "()Landroidx/compose/foundation/layout/CrossAxisAlignment;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "getHorizontalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "isHorizontal", "", "()Z", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVerticalArrangement", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "mainAxisMin", "", "crossAxisMin", "mainAxisMax", "crossAxisMax", "isPrioritizing", "createConstraints-xF2OJ5Q", "(IIIIZ)J", "getCrossAxisPosition", "placeable", "Landroidx/compose/ui/layout/Placeable;", "rowColumnParentData", "Landroidx/compose/foundation/layout/RowColumnParentData;", "crossAxisLayoutSize", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "beforeCrossAxisAlignmentLine", "placeHelper", "Landroidx/compose/ui/layout/MeasureResult;", "placeables", "", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "mainAxisPositions", "", "mainAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "([Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/MeasureScope;I[III[IIII)Landroidx/compose/ui/layout/MeasureResult;", "populateMainAxisPositions", "", "childrenMainAxisSize", "crossAxisSize", "mainAxisSize", "foundation-layout"})
/*     */ public interface FlowLineMeasurePolicy
/*     */   extends RowColumnMeasurePolicy
/*     */ {
/*     */   boolean isHorizontal();
/*     */   
/*     */   @NotNull
/*     */   Arrangement.Horizontal getHorizontalArrangement();
/*     */   
/*     */   @NotNull
/*     */   Arrangement.Vertical getVerticalArrangement();
/*     */   
/*     */   @NotNull
/*     */   CrossAxisAlignment getCrossAxisAlignment();
/*     */   
/*     */   default int mainAxisSize(@NotNull Placeable $this$mainAxisSize) {
/* 504 */     Intrinsics.checkNotNullParameter($this$mainAxisSize, "<this>"); return isHorizontal() ? $this$mainAxisSize.getMeasuredWidth() : $this$mainAxisSize.getMeasuredHeight();
/*     */   }
/*     */   default int crossAxisSize(@NotNull Placeable $this$crossAxisSize) {
/* 507 */     Intrinsics.checkNotNullParameter($this$crossAxisSize, "<this>"); return isHorizontal() ? $this$crossAxisSize.getMeasuredHeight() : $this$crossAxisSize.getMeasuredWidth();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default long createConstraints-xF2OJ5Q(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
/* 516 */     return isHorizontal() ? 
/* 517 */       RowKt.createRowConstraints(
/* 518 */         isPrioritizing, 
/* 519 */         mainAxisMin, 
/* 520 */         crossAxisMin, 
/* 521 */         mainAxisMax, 
/* 522 */         crossAxisMax) : 
/*     */ 
/*     */       
/* 525 */       ColumnKt.createColumnConstraints(
/* 526 */         isPrioritizing, 
/* 527 */         mainAxisMin, 
/* 528 */         crossAxisMin, 
/* 529 */         mainAxisMax, 
/* 530 */         crossAxisMax);
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
/*     */   default MeasureResult placeHelper(@NotNull Placeable[] placeables, @NotNull MeasureScope measureScope, int beforeCrossAxisAlignmentLine, @NotNull int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, @Nullable int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
/* 547 */     Intrinsics.checkNotNullParameter(placeables, "placeables"); Intrinsics.checkNotNullParameter(measureScope, "measureScope"); Intrinsics.checkNotNullParameter(mainAxisPositions, "mainAxisPositions"); MeasureScope $this$placeHelper_u24lambda_u240 = measureScope; int $i$a$-with-FlowLineMeasurePolicy$placeHelper$1 = 0;
/* 548 */     int width = 0;
/* 549 */     int height = 0;
/* 550 */     if (isHorizontal()) {
/* 551 */       width = mainAxisLayoutSize;
/* 552 */       height = crossAxisLayoutSize;
/*     */     } else {
/* 554 */       width = crossAxisLayoutSize;
/* 555 */       height = mainAxisLayoutSize;
/*     */     } 
/* 557 */     return MeasureScope.layout$default($this$placeHelper_u24lambda_u240, width, height, null, new FlowLineMeasurePolicy$placeHelper$1$1(currentLineIndex, startIndex, endIndex, placeables, this, crossAxisLayoutSize, $this$placeHelper_u24lambda_u240, beforeCrossAxisAlignmentLine, mainAxisPositions), 4, null); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"})
/* 558 */   static final class FlowLineMeasurePolicy$placeHelper$1$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> { public final void invoke(@NotNull Placeable.PlacementScope $this$layout) { Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); int crossAxisLineOffset = (this.$crossAxisOffset != null) ? this.$crossAxisOffset[this.$currentLineIndex] : 0;
/* 559 */       for (int i = this.$startIndex; i < this.$endIndex; i++) {
/* 560 */         Intrinsics.checkNotNull(this.$placeables[i]); Placeable placeable = this.$placeables[i];
/* 561 */         int crossAxisPosition = FlowLineMeasurePolicy.this.getCrossAxisPosition(
/* 562 */             placeable, 
/* 563 */             RowColumnImplKt.getRowColumnParentData(placeable), 
/* 564 */             this.$crossAxisLayoutSize, 
/* 565 */             this.$this_with.getLayoutDirection(), 
/* 566 */             this.$beforeCrossAxisAlignmentLine) + 
/* 567 */           crossAxisLineOffset;
/* 568 */         if (FlowLineMeasurePolicy.this.isHorizontal()) {
/* 569 */           Placeable.PlacementScope.place$default($this$layout, placeable, 
/* 570 */               this.$mainAxisPositions[i - this.$startIndex], 
/* 571 */               crossAxisPosition, 0.0F, 4, null);
/*     */         } else {
/*     */           
/* 574 */           Placeable.PlacementScope.place$default($this$layout, placeable, 
/* 575 */               crossAxisPosition, 
/* 576 */               this.$mainAxisPositions[i - this.$startIndex], 0.0F, 4, null);
/*     */         } 
/*     */       }  }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     FlowLineMeasurePolicy$placeHelper$1$1(int $currentLineIndex, int $startIndex, int $endIndex, Placeable[] $placeables, FlowLineMeasurePolicy $receiver, int $crossAxisLayoutSize, MeasureScope measureScope, int $beforeCrossAxisAlignmentLine, int[] $mainAxisPositions) {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default int getCrossAxisPosition(@NotNull Placeable placeable, @Nullable RowColumnParentData rowColumnParentData, int crossAxisLayoutSize, @NotNull LayoutDirection layoutDirection, int beforeCrossAxisAlignmentLine) {
/* 591 */     Intrinsics.checkNotNullParameter(placeable, "placeable"); Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection"); if (rowColumnParentData == null || rowColumnParentData.getCrossAxisAlignment() == null) rowColumnParentData.getCrossAxisAlignment();  CrossAxisAlignment childCrossAlignment = getCrossAxisAlignment();
/* 592 */     return childCrossAlignment.align$foundation_layout(
/* 593 */         crossAxisLayoutSize - crossAxisSize(placeable), 
/* 594 */         isHorizontal() ? 
/* 595 */         LayoutDirection.Ltr : 
/*     */         
/* 597 */         layoutDirection, 
/*     */         
/* 599 */         placeable, 
/* 600 */         beforeCrossAxisAlignmentLine);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   default void populateMainAxisPositions(int mainAxisLayoutSize, @NotNull int[] childrenMainAxisSize, @NotNull int[] mainAxisPositions, @NotNull MeasureScope measureScope) {
/* 610 */     Intrinsics.checkNotNullParameter(childrenMainAxisSize, "childrenMainAxisSize"); Intrinsics.checkNotNullParameter(mainAxisPositions, "mainAxisPositions"); Intrinsics.checkNotNullParameter(measureScope, "measureScope");
/* 611 */     Arrangement.Horizontal $this$populateMainAxisPositions_u24lambda_u241 = getHorizontalArrangement(); int $i$a$-with-FlowLineMeasurePolicy$populateMainAxisPositions$1 = 0;
/* 612 */     $this$populateMainAxisPositions_u24lambda_u241.arrange((Density)measureScope, 
/* 613 */         mainAxisLayoutSize, 
/* 614 */         childrenMainAxisSize, 
/* 615 */         measureScope.getLayoutDirection(), 
/* 616 */         mainAxisPositions);
/*     */ 
/*     */ 
/*     */     
/* 620 */     Arrangement.Vertical $this$populateMainAxisPositions_u24lambda_u242 = getVerticalArrangement(); int $i$a$-with-FlowLineMeasurePolicy$populateMainAxisPositions$2 = 0;
/* 621 */     $this$populateMainAxisPositions_u24lambda_u242.arrange((Density)measureScope, 
/* 622 */         mainAxisLayoutSize, 
/* 623 */         childrenMainAxisSize, 
/* 624 */         mainAxisPositions);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowLineMeasurePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */