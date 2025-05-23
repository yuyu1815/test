/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.collection.IntIntPair;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.layout.IntrinsicMeasurable;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import androidx.compose.ui.unit.Constraints;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000d\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\030\002\n\002\b\033\n\002\030\002\n\002\b\n\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\037\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\016\020%\032\0020\003HÀ\003¢\006\002\b&J\016\020'\032\0020\005HÀ\003¢\006\002\b(J\016\020)\032\0020\005HÀ\003¢\006\002\b*J'\020+\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\005HÆ\001J'\020,\032\004\030\0010-2\006\020.\032\0020\0202\006\020/\032\0020\0052\006\0200\032\0020\005H\000¢\006\002\b1J-\0202\032\004\030\0010\r2\006\020.\032\0020\0202\006\020/\032\0020\0052\006\0200\032\0020\005H\000ø\001\001ø\001\000¢\006\002\b3J\023\0204\032\0020\0202\b\0205\032\004\030\0010\001HÖ\003J\t\0206\032\0020\005HÖ\001J6\0207\032\002082\006\0209\032\0020:2\b\020 \032\004\030\0010\t2\b\020\b\032\004\030\0010\t2\006\020;\032\0020<H\000ø\001\000¢\006\004\b=\020>J\\\0207\032\002082\006\0209\032\0020:2\006\020;\032\0020<28\020\016\0324\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\023\022\0210\005¢\006\f\b\021\022\b\b\022\022\004\b\b(?\022\006\022\004\030\0010\t0\017H\000ø\001\000¢\006\004\b@\020AJ6\0207\032\002082\b\020 \032\004\030\0010B2\b\020\b\032\004\030\0010B2\006\020C\032\0020\0202\006\020;\032\0020<H\000ø\001\000¢\006\004\b=\020DJ\t\020E\032\0020FHÖ\001R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000R\020\020\n\032\004\030\0010\013X\016¢\006\002\n\000R\026\020\f\032\004\030\0010\rX\016ø\001\000ø\001\001¢\006\002\n\000RB\020\016\0326\022\023\022\0210\020¢\006\f\b\021\022\b\b\022\022\004\b\b(\023\022\023\022\0210\005¢\006\f\b\021\022\b\b\022\022\004\b\b(\024\022\006\022\004\030\0010\t\030\0010\017X\016¢\006\002\n\000R\032\020\025\032\0020\005X\016¢\006\016\n\000\032\004\b\026\020\027\"\004\b\030\020\031R\032\020\032\032\0020\005X\016¢\006\016\n\000\032\004\b\033\020\027\"\004\b\034\020\031R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\035\020\027R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\036\020\027R\024\020\024\032\0020\0058@X\004¢\006\006\032\004\b\037\020\027R\020\020 \032\004\030\0010\tX\016¢\006\002\n\000R\020\020!\032\004\030\0010\013X\016¢\006\002\n\000R\026\020\"\032\004\030\0010\rX\016ø\001\000ø\001\001¢\006\002\n\000R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b#\020$\002\013\n\005\b¡\0360\001\n\002\b!¨\006G"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "type", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "minLinesToShowCollapse", "", "minCrossAxisSizeToShowCollapse", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "collapseMeasurable", "Landroidx/compose/ui/layout/Measurable;", "collapsePlaceable", "Landroidx/compose/ui/layout/Placeable;", "collapseSize", "Landroidx/collection/IntIntPair;", "getOverflowMeasurable", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isExpandable", "noOfItemsShown", "itemCount", "getItemCount$foundation_layout", "()I", "setItemCount$foundation_layout", "(I)V", "itemShown", "getItemShown$foundation_layout", "setItemShown$foundation_layout", "getMinCrossAxisSizeToShowCollapse$foundation_layout", "getMinLinesToShowCollapse$foundation_layout", "getNoOfItemsShown$foundation_layout", "seeMoreMeasurable", "seeMorePlaceable", "seeMoreSize", "getType$foundation_layout", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "component1", "component1$foundation_layout", "component2", "component2$foundation_layout", "component3", "component3$foundation_layout", "copy", "ellipsisInfo", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "hasNext", "lineIndex", "totalCrossAxisSize", "ellipsisInfo$foundation_layout", "ellipsisSize", "ellipsisSize-F35zm-w$foundation_layout", "equals", "other", "hashCode", "setOverflowMeasurables", "", "measurePolicy", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "setOverflowMeasurables--hBUhpc$foundation_layout", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V", "numberOfItemsShown", "setOverflowMeasurables-VKLhPVY$foundation_layout", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "isHorizontal", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V", "toString", "", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,906:1\n232#2:907\n232#2:908\n*S KotlinDebug\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflowState\n*L\n813#1:907\n825#1:908\n*E\n"})
/*     */ public final class FlowLayoutOverflowState
/*     */ {
/*     */   @NotNull
/*     */   private final FlowLayoutOverflow.OverflowType type;
/*     */   private final int minLinesToShowCollapse;
/*     */   private final int minCrossAxisSizeToShowCollapse;
/*     */   private int itemShown;
/*     */   private int itemCount;
/*     */   @Nullable
/*     */   private Measurable seeMoreMeasurable;
/*     */   @Nullable
/*     */   private Placeable seeMorePlaceable;
/*     */   @Nullable
/*     */   private Measurable collapseMeasurable;
/*     */   @Nullable
/*     */   private Placeable collapsePlaceable;
/*     */   @Nullable
/*     */   private IntIntPair seeMoreSize;
/*     */   @Nullable
/*     */   private IntIntPair collapseSize;
/*     */   @Nullable
/*     */   private Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final FlowLayoutOverflow.OverflowType getType$foundation_layout() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   public final int getMinLinesToShowCollapse$foundation_layout() {
/*     */     return this.minLinesToShowCollapse;
/*     */   }
/*     */   
/*     */   public final int getMinCrossAxisSizeToShowCollapse$foundation_layout() {
/*     */     return this.minCrossAxisSizeToShowCollapse;
/*     */   }
/*     */   
/*     */   public final int getNoOfItemsShown$foundation_layout() {
/*     */     if (this.itemShown == -1)
/*     */       throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase."); 
/*     */     return this.itemShown;
/*     */   }
/*     */   
/*     */   public FlowLayoutOverflowState(@NotNull FlowLayoutOverflow.OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse) {
/* 701 */     this.type = type;
/* 702 */     this.minLinesToShowCollapse = minLinesToShowCollapse;
/* 703 */     this.minCrossAxisSizeToShowCollapse = minCrossAxisSizeToShowCollapse;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 719 */     this.itemShown = -1; } public final int getItemShown$foundation_layout() { return this.itemShown; } public final void setItemShown$foundation_layout(int <set-?>) { this.itemShown = <set-?>; }
/* 720 */   public final int getItemCount$foundation_layout() { return this.itemCount; } public final void setItemCount$foundation_layout(int <set-?>) { this.itemCount = <set-?>; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final IntIntPair ellipsisSize-F35zm-w$foundation_layout(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
/* 738 */     switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) { case 1: case 2: case 3: return 
/*     */ 
/*     */           
/* 741 */           hasNext ? 
/* 742 */           this.seeMoreSize : 
/*     */           
/* 744 */           null;
/*     */       
/*     */       case 4:
/* 747 */         return hasNext ? 
/* 748 */           this.seeMoreSize : (
/* 749 */           (lineIndex + 1 >= this.minLinesToShowCollapse && 
/* 750 */           totalCrossAxisSize >= this.minCrossAxisSizeToShowCollapse) ? 
/* 751 */           this.collapseSize : null); }  throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
/*     */     Measurable measurable;
/*     */     Placeable placeable;
/*     */     IntIntPair ellipsisSize;
/* 761 */     switch (WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()]) { case 1: 
/*     */       case 2:
/*     */       
/*     */       case 3:
/*     */       case 4:
/* 766 */         measurable = null;
/* 767 */         placeable = null;
/* 768 */         ellipsisSize = null;
/* 769 */         if (hasNext) {
/* 770 */           if (this.getOverflowMeasurable == null || (Measurable)this.getOverflowMeasurable.invoke(
/* 771 */               Boolean.valueOf(true), Integer.valueOf(getNoOfItemsShown$foundation_layout())) == null) (Measurable)this.getOverflowMeasurable.invoke(Boolean.valueOf(true), Integer.valueOf(getNoOfItemsShown$foundation_layout())); 
/* 772 */           measurable = this.seeMoreMeasurable;
/* 773 */           ellipsisSize = this.seeMoreSize;
/* 774 */           if (this.getOverflowMeasurable == null) {
/* 775 */             placeable = this.seeMorePlaceable;
/*     */           }
/*     */         } else {
/* 778 */           if (lineIndex >= this.minLinesToShowCollapse - 1 && 
/* 779 */             totalCrossAxisSize >= this.minCrossAxisSizeToShowCollapse) {
/*     */             
/* 781 */             if (this.getOverflowMeasurable == null || (Measurable)this.getOverflowMeasurable.invoke(
/* 782 */                 Boolean.valueOf(false), Integer.valueOf(getNoOfItemsShown$foundation_layout())) == null) (Measurable)this.getOverflowMeasurable.invoke(Boolean.valueOf(false), Integer.valueOf(getNoOfItemsShown$foundation_layout())); 
/* 783 */             measurable = this.collapseMeasurable;
/*     */           } 
/* 785 */           ellipsisSize = this.collapseSize;
/* 786 */           if (this.getOverflowMeasurable == null) {
/* 787 */             placeable = this.collapsePlaceable;
/*     */           }
/*     */         } 
/* 790 */         if (measurable == null) return null;
/*     */ 
/*     */ 
/*     */         
/* 794 */         Intrinsics.checkNotNull(ellipsisSize); return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable, placeable, ellipsisSize.unbox-impl(), false, 8, null); }
/*     */     
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void setOverflowMeasurables--hBUhpc$foundation_layout(@Nullable IntrinsicMeasurable seeMoreMeasurable, @Nullable IntrinsicMeasurable collapseMeasurable, boolean isHorizontal, long constraints) {
/* 806 */     LayoutOrientation orientation = isHorizontal ? 
/* 807 */       LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
/* 808 */     long orientationIndependentConstraints = 
/* 809 */       OrientationIndependentConstraints.constructor-impl(constraints, orientation);
/* 810 */     IntrinsicMeasurable item = seeMoreMeasurable; int $i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$1 = 0;
/*     */ 
/*     */     
/* 813 */     int j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 907 */     int mainAxisSize = FlowLayoutKt.mainAxisMin(item, isHorizontal, Constraints.getMaxHeight-impl(orientationIndependentConstraints)); int i = FlowLayoutKt.crossAxisMin(item, isHorizontal, mainAxisSize); this.seeMoreSize = IntIntPair.box-impl(IntIntPair.constructor-impl(mainAxisSize, i)); this.seeMoreMeasurable = (item instanceof Measurable) ? (Measurable)item : null; this.seeMorePlaceable = null; item = collapseMeasurable; int $i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$2 = 0; int $i$f$getCrossAxisMax-impl = 0;
/* 908 */     mainAxisSize = FlowLayoutKt.mainAxisMin(item, isHorizontal, Constraints.getMaxHeight-impl(orientationIndependentConstraints));
/*     */     int crossAxisSize = FlowLayoutKt.crossAxisMin(item, isHorizontal, mainAxisSize);
/*     */     this.collapseSize = IntIntPair.box-impl(IntIntPair.constructor-impl(mainAxisSize, crossAxisSize));
/*     */     this.collapseMeasurable = (item instanceof Measurable) ? (Measurable)item : null;
/*     */     this.collapsePlaceable = null;
/*     */   }
/*     */   
/*     */   public final void setOverflowMeasurables--hBUhpc$foundation_layout(@NotNull FlowLineMeasurePolicy measurePolicy, @Nullable Measurable seeMoreMeasurable, @Nullable Measurable collapseMeasurable, long constraints) {
/*     */     Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
/*     */     boolean isHorizontal = measurePolicy.isHorizontal();
/*     */     LayoutOrientation orientation = isHorizontal ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
/*     */     long orientationIndependentConstraints = OrientationIndependentConstraints.copy-yUG9Ft0$default(OrientationIndependentConstraints.constructor-impl(constraints, orientation), 0, 0, 0, 0, 10, null);
/*     */     long finalConstraints = OrientationIndependentConstraints.toBoxConstraints-OenEA2s(orientationIndependentConstraints, orientation);
/*     */     Measurable item = seeMoreMeasurable;
/*     */     int $i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$3 = 0;
/*     */     FlowLayoutKt.measureAndCache-rqJ1uqs(item, measurePolicy, finalConstraints, new FlowLayoutOverflowState$setOverflowMeasurables$3$1(measurePolicy));
/*     */     this.seeMoreMeasurable = item;
/*     */     item = collapseMeasurable;
/*     */     int $i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$4 = 0;
/*     */     FlowLayoutKt.measureAndCache-rqJ1uqs(item, measurePolicy, finalConstraints, new FlowLayoutOverflowState$setOverflowMeasurables$4$1(measurePolicy));
/*     */     this.collapseMeasurable = item;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "invoke"})
/*     */   static final class FlowLayoutOverflowState$setOverflowMeasurables$3$1 extends Lambda implements Function1<Placeable, Unit> {
/*     */     public final void invoke(@Nullable Placeable placeable) {
/*     */       int mainAxisSize = 0;
/*     */       int crossAxisSize = 0;
/*     */       Placeable placeable1 = placeable;
/*     */       FlowLineMeasurePolicy flowLineMeasurePolicy1 = this.$measurePolicy;
/*     */       Placeable it = placeable1;
/*     */       int $i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$3$1$1 = 0;
/*     */       FlowLineMeasurePolicy $this$invoke_u24lambda_u241_u24lambda_u240 = flowLineMeasurePolicy1;
/*     */       int $i$a$-with-FlowLayoutOverflowState$setOverflowMeasurables$3$1$1$1 = 0;
/*     */       mainAxisSize = $this$invoke_u24lambda_u241_u24lambda_u240.mainAxisSize(placeable);
/*     */       crossAxisSize = $this$invoke_u24lambda_u241_u24lambda_u240.crossAxisSize(placeable);
/*     */       FlowLayoutOverflowState.this.seeMoreSize = IntIntPair.box-impl(IntIntPair.constructor-impl(mainAxisSize, crossAxisSize));
/*     */       FlowLayoutOverflowState.this.seeMorePlaceable = placeable;
/*     */     }
/*     */     
/*     */     FlowLayoutOverflowState$setOverflowMeasurables$3$1(FlowLineMeasurePolicy $measurePolicy) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "placeable", "Landroidx/compose/ui/layout/Placeable;", "invoke"})
/*     */   static final class FlowLayoutOverflowState$setOverflowMeasurables$4$1 extends Lambda implements Function1<Placeable, Unit> {
/*     */     public final void invoke(@Nullable Placeable placeable) {
/*     */       int mainAxisSize = 0;
/*     */       int crossAxisSize = 0;
/*     */       Placeable placeable1 = placeable;
/*     */       FlowLineMeasurePolicy flowLineMeasurePolicy1 = this.$measurePolicy;
/*     */       Placeable it = placeable1;
/*     */       int $i$a$-let-FlowLayoutOverflowState$setOverflowMeasurables$4$1$1 = 0;
/*     */       FlowLineMeasurePolicy $this$invoke_u24lambda_u241_u24lambda_u240 = flowLineMeasurePolicy1;
/*     */       int $i$a$-with-FlowLayoutOverflowState$setOverflowMeasurables$4$1$1$1 = 0;
/*     */       mainAxisSize = $this$invoke_u24lambda_u241_u24lambda_u240.mainAxisSize(placeable);
/*     */       crossAxisSize = $this$invoke_u24lambda_u241_u24lambda_u240.crossAxisSize(placeable);
/*     */       FlowLayoutOverflowState.this.collapseSize = IntIntPair.box-impl(IntIntPair.constructor-impl(mainAxisSize, crossAxisSize));
/*     */       FlowLayoutOverflowState.this.collapsePlaceable = placeable;
/*     */     }
/*     */     
/*     */     FlowLayoutOverflowState$setOverflowMeasurables$4$1(FlowLineMeasurePolicy $measurePolicy) {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void setOverflowMeasurables-VKLhPVY$foundation_layout(@NotNull FlowLineMeasurePolicy measurePolicy, long constraints, @NotNull Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable) {
/*     */     Intrinsics.checkNotNullParameter(measurePolicy, "measurePolicy");
/*     */     Intrinsics.checkNotNullParameter(getOverflowMeasurable, "getOverflowMeasurable");
/*     */     this.itemShown = 0;
/*     */     this.getOverflowMeasurable = getOverflowMeasurable;
/*     */     Measurable seeMoreMeasurable = (Measurable)getOverflowMeasurable.invoke(Boolean.valueOf(true), Integer.valueOf(0));
/*     */     Measurable collapseMeasurable = (Measurable)getOverflowMeasurable.invoke(Boolean.valueOf(false), Integer.valueOf(0));
/*     */     setOverflowMeasurables--hBUhpc$foundation_layout(measurePolicy, seeMoreMeasurable, collapseMeasurable, constraints);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FlowLayoutOverflow.OverflowType component1$foundation_layout() {
/*     */     return this.type;
/*     */   }
/*     */   
/*     */   public final int component2$foundation_layout() {
/*     */     return this.minLinesToShowCollapse;
/*     */   }
/*     */   
/*     */   public final int component3$foundation_layout() {
/*     */     return this.minCrossAxisSizeToShowCollapse;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FlowLayoutOverflowState copy(@NotNull FlowLayoutOverflow.OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse) {
/*     */     Intrinsics.checkNotNullParameter(type, "type");
/*     */     return new FlowLayoutOverflowState(type, minLinesToShowCollapse, minCrossAxisSizeToShowCollapse);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.type.hashCode();
/*     */     result = result * 31 + Integer.hashCode(this.minLinesToShowCollapse);
/*     */     return result * 31 + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FlowLayoutOverflowState))
/*     */       return false; 
/*     */     FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState)other;
/*     */     return (this.type != flowLayoutOverflowState.type) ? false : ((this.minLinesToShowCollapse != flowLayoutOverflowState.minLinesToShowCollapse) ? false : (!(this.minCrossAxisSizeToShowCollapse != flowLayoutOverflowState.minCrossAxisSizeToShowCollapse)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowLayoutOverflowState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */