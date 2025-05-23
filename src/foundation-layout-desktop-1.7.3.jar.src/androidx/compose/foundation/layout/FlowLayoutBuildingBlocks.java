/*     */ package androidx.compose.foundation.layout;
/*     */ 
/*     */ import androidx.collection.IntIntPair;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.layout.Measurable;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\007\n\002\030\002\n\002\b\n\b\000\030\0002\0020\001:\002\"#B5\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003¢\006\002\020\013J8\020\r\032\004\030\0010\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\0032\006\020\024\032\0020\0032\006\020\025\032\0020\0032\006\020\026\032\0020\003JZ\020\027\032\0020\0202\006\020\030\032\0020\0222\006\020\026\032\0020\0032\006\020\031\032\0020\0322\b\020\033\032\004\030\0010\0322\006\020\034\032\0020\0032\006\020\024\032\0020\0032\006\020\035\032\0020\0032\006\020\036\032\0020\0222\006\020\037\032\0020\022ø\001\000¢\006\004\b \020!R\026\020\006\032\0020\007X\004ø\001\000ø\001\001¢\006\004\n\002\020\fR\016\020\n\032\0020\003X\004¢\006\002\n\000R\016\020\t\032\0020\003X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\b\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000\002\013\n\005\b¡\0360\001\n\002\b!¨\006$"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;", "", "maxItemsInMainAxis", "", "overflow", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "constraints", "Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "maxLines", "mainAxisSpacing", "crossAxisSpacing", "(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "getWrapEllipsisInfo", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "wrapInfo", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "hasNext", "", "lastContentLineIndex", "totalCrossAxisSize", "leftOverMainAxis", "nextIndexInLine", "getWrapInfo", "nextItemHasNext", "leftOver", "Landroidx/collection/IntIntPair;", "nextSize", "lineIndex", "currentLineCrossAxisSize", "isWrappingRound", "isEllipsisWrap", "getWrapInfo-OpUlnko", "(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "WrapEllipsisInfo", "WrapInfo", "foundation-layout"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nFlowLayoutBuildingBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,197:1\n230#2:198\n230#2:199\n*S KotlinDebug\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n*L\n119#1:198\n173#1:199\n*E\n"})
/*     */ public final class FlowLayoutBuildingBlocks {
/*     */   private final int maxItemsInMainAxis;
/*     */   @NotNull
/*     */   private final FlowLayoutOverflowState overflow;
/*     */   private final long constraints;
/*     */   private final int maxLines;
/*     */   private final int mainAxisSpacing;
/*     */   private final int crossAxisSpacing;
/*     */   public static final int $stable = 8;
/*     */   
/*  25 */   private FlowLayoutBuildingBlocks(int maxItemsInMainAxis, FlowLayoutOverflowState overflow, long constraints, int maxLines, int mainAxisSpacing, int crossAxisSpacing) { this.maxItemsInMainAxis = maxItemsInMainAxis;
/*  26 */     this.overflow = overflow;
/*  27 */     this.constraints = constraints;
/*  28 */     this.maxLines = maxLines;
/*  29 */     this.mainAxisSpacing = mainAxisSpacing;
/*  30 */     this.crossAxisSpacing = crossAxisSpacing; } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\b\004\b\007\030\0002\0020\001B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003¢\006\002\020\005R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\004\020\006R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\006¨\006\007"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;", "", "isLastItemInLine", "", "isLastItemInContainer", "(ZZ)V", "()Z", "foundation-layout"})
/*     */   @StabilityInferred(parameters = 1)
/*     */   public static final class WrapInfo { private final boolean isLastItemInLine; private final boolean isLastItemInContainer; public static final int $stable;
/*  33 */     public WrapInfo(boolean isLastItemInLine, boolean isLastItemInContainer) { this.isLastItemInLine = isLastItemInLine;
/*  34 */       this.isLastItemInContainer = isLastItemInContainer; } public final boolean isLastItemInLine() { return this.isLastItemInLine; } public final boolean isLastItemInContainer() { return this.isLastItemInContainer; } public WrapInfo() { this(false, false, 3, null); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\r\b\007\030\0002\0020\001B)\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\031\020\006\032\0020\007ø\001\000ø\001\001¢\006\n\n\002\020\017\032\004\b\r\020\016R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\020\020\021\"\004\b\022\020\023R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\025\002\013\n\005\b¡\0360\001\n\002\b!¨\006\026"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "", "ellipsis", "Landroidx/compose/ui/layout/Measurable;", "placeable", "Landroidx/compose/ui/layout/Placeable;", "ellipsisSize", "Landroidx/collection/IntIntPair;", "placeEllipsisOnLastContentLine", "", "(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Placeable;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEllipsis", "()Landroidx/compose/ui/layout/Measurable;", "getEllipsisSize-OO21N7I", "()J", "J", "getPlaceEllipsisOnLastContentLine", "()Z", "setPlaceEllipsisOnLastContentLine", "(Z)V", "getPlaceable", "()Landroidx/compose/ui/layout/Placeable;", "foundation-layout"}) @StabilityInferred(parameters = 0)
/*     */   public static final class WrapEllipsisInfo { @NotNull
/*     */     private final Measurable ellipsis; @Nullable
/*     */     private final Placeable placeable; private final long ellipsisSize; private boolean placeEllipsisOnLastContentLine; public static final int $stable = 8;
/*  38 */     private WrapEllipsisInfo(Measurable ellipsis, Placeable placeable, long ellipsisSize, boolean placeEllipsisOnLastContentLine) { this.ellipsis = ellipsis;
/*  39 */       this.placeable = placeable;
/*  40 */       this.ellipsisSize = ellipsisSize;
/*  41 */       this.placeEllipsisOnLastContentLine = placeEllipsisOnLastContentLine; } @NotNull public final Measurable getEllipsis() { return this.ellipsis; } public final boolean getPlaceEllipsisOnLastContentLine() { return this.placeEllipsisOnLastContentLine; } @Nullable public final Placeable getPlaceable() { return this.placeable; } public final long getEllipsisSize-OO21N7I() { return this.ellipsisSize; } public final void setPlaceEllipsisOnLastContentLine(boolean <set-?>) { this.placeEllipsisOnLastContentLine = <set-?>; }
/*     */      }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final WrapEllipsisInfo getWrapEllipsisInfo(@NotNull WrapInfo wrapInfo, boolean hasNext, int lastContentLineIndex, int totalCrossAxisSize, int leftOverMainAxis, int nextIndexInLine) {
/*     */     WrapEllipsisInfo ellipsisInfo;
/*  52 */     Intrinsics.checkNotNullParameter(wrapInfo, "wrapInfo"); if (!wrapInfo.isLastItemInContainer()) return null;
/*     */     
/*  54 */     if (this.overflow.ellipsisInfo$foundation_layout(
/*  55 */         hasNext, 
/*  56 */         lastContentLineIndex, 
/*  57 */         totalCrossAxisSize) == null) { this.overflow.ellipsisInfo$foundation_layout(hasNext, lastContentLineIndex, totalCrossAxisSize);
/*  58 */       return null; }
/*     */     
/*  60 */     boolean canFitLine = (lastContentLineIndex >= 0 && (nextIndexInLine == 0 || (
/*  61 */       leftOverMainAxis - IntIntPair.getFirst-impl(ellipsisInfo.getEllipsisSize-OO21N7I()) >= 0 && 
/*  62 */       nextIndexInLine < this.maxItemsInMainAxis)));
/*     */     
/*  64 */     ellipsisInfo.setPlaceEllipsisOnLastContentLine(canFitLine);
/*  65 */     return ellipsisInfo;
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
/*     */   @NotNull
/*     */   public final WrapInfo getWrapInfo-OpUlnko(boolean nextItemHasNext, int nextIndexInLine, long leftOver, @Nullable IntIntPair nextSize, int lineIndex, int totalCrossAxisSize, int currentLineCrossAxisSize, boolean isWrappingRound, boolean isEllipsisWrap) {
/*  79 */     int totalContainerCrossAxisSize = totalCrossAxisSize + currentLineCrossAxisSize;
/*  80 */     if (nextSize == null) {
/*  81 */       return new WrapInfo(
/*  82 */           true, 
/*  83 */           true);
/*     */     }
/*     */ 
/*     */     
/*  87 */     boolean willOverflowCrossAxis = 
/*  88 */       (this.overflow.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.Visible) ? false : (
/*  89 */       (lineIndex >= this.maxLines) ? true : (
/*  90 */       (IntIntPair.getSecond-impl(leftOver) - IntIntPair.getSecond-impl(nextSize.unbox-impl()) < 0)));
/*     */ 
/*     */ 
/*     */     
/*  94 */     if (willOverflowCrossAxis) {
/*  95 */       return new WrapInfo(
/*  96 */           true, 
/*  97 */           true);
/*     */     }
/*     */ 
/*     */     
/* 101 */     boolean shouldWrapItem = 
/* 102 */       (nextIndexInLine == 0) ? false : (
/* 103 */       (nextIndexInLine >= this.maxItemsInMainAxis) ? true : (
/* 104 */       (IntIntPair.getFirst-impl(leftOver) - IntIntPair.getFirst-impl(nextSize.unbox-impl()) < 0)));
/*     */ 
/*     */ 
/*     */     
/* 108 */     if (shouldWrapItem)
/* 109 */     { if (isWrappingRound) {
/* 110 */         return new WrapInfo(
/* 111 */             true, 
/* 112 */             true);
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 119 */       long arg0$iv = this.constraints; int $i$f$getMainAxisMax-impl = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 198 */       WrapInfo wrapInfo = getWrapInfo-OpUlnko(nextItemHasNext, 0, IntIntPair.constructor-impl(Constraints.getMaxWidth-impl(arg0$iv), IntIntPair.getSecond-impl(leftOver) - this.crossAxisSpacing - currentLineCrossAxisSize), IntIntPair.box-impl(IntIntPair.constructor-impl(IntIntPair.getFirst-impl(nextSize.unbox-impl()) - this.mainAxisSpacing, IntIntPair.getSecond-impl(nextSize.unbox-impl()))), lineIndex + 1, totalContainerCrossAxisSize, 0, true, false); return new WrapInfo(true, wrapInfo.isLastItemInContainer()); }  totalContainerCrossAxisSize = totalCrossAxisSize + Math.max(currentLineCrossAxisSize, IntIntPair.getSecond-impl(nextSize.unbox-impl())); IntIntPair ellipsis = isEllipsisWrap ? null : this.overflow.ellipsisSize-F35zm-w$foundation_layout(nextItemHasNext, lineIndex, totalContainerCrossAxisSize); long $this$getWrapInfo_OpUlnko_u24lambda_u240 = ellipsis.unbox-impl(); int $i$a$-run-FlowLayoutBuildingBlocks$getWrapInfo$shouldWrapEllipsis$1 = 0; boolean shouldWrapEllipsis = (ellipsis != null) ? ((nextIndexInLine + 1 >= this.maxItemsInMainAxis) ? true : ((IntIntPair.getFirst-impl(leftOver) - IntIntPair.getFirst-impl(nextSize.unbox-impl()) - this.mainAxisSpacing - IntIntPair.getFirst-impl(ellipsis.unbox-impl()) < 0))) : false; if (shouldWrapEllipsis) { if (isEllipsisWrap)
/* 199 */         return new WrapInfo(true, true);  long arg0$iv = this.constraints; int $i$f$getMainAxisMax-impl = 0; WrapInfo wrapInfo = getWrapInfo-OpUlnko(false, 0, IntIntPair.constructor-impl(Constraints.getMaxWidth-impl(arg0$iv), IntIntPair.getSecond-impl(leftOver) - this.crossAxisSpacing - Math.max(currentLineCrossAxisSize, IntIntPair.getSecond-impl(nextSize.unbox-impl()))), ellipsis, lineIndex + 1, totalContainerCrossAxisSize, 0, true, true);
/*     */       return new WrapInfo(wrapInfo.isLastItemInContainer(), wrapInfo.isLastItemInContainer()); }
/*     */     
/*     */     return new WrapInfo(false, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\foundation-layout-desktop-1.7.3.jar!\androidx\compose\foundation\layout\FlowLayoutBuildingBlocks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */